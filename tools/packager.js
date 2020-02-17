/**
 * @license
 * Copyright 2018 The Bazel Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
const fs = require('fs');
const path = require('path');
const isBinary = require('isbinaryfile').isBinaryFileSync;

/**
 * Create a new directory and any necessary subdirectories
 * if they do not exist.
 */
function mkdirp(p) {
  if (!fs.existsSync(p)) {
    mkdirp(path.dirname(p));
    fs.mkdirSync(p);
  }
}

function copyWithReplace(src, dest, substitutions) {
  mkdirp(path.dirname(dest));
  if (fs.lstatSync(src).isDirectory()) {
    const files = fs.readdirSync(src);
    files.forEach((relativeChildSrc) => {
      const childSrc = path.join(src, relativeChildSrc);
      const childDest = path.join(dest, path.basename(childSrc));
      copyWithReplace(childSrc, childDest, substitutions);
    });
  } else if (!isBinary(src)) {
    let content = fs.readFileSync(src, {encoding: 'utf-8'});
    substitutions.forEach(r => {
      const [regexp, newvalue] = r;
      content = content.replace(regexp, newvalue);
    });
    fs.writeFileSync(dest, content);
  } else {
    fs.copyFileSync(src, dest);
  }
}

function unquoteArgs(s) {
  return s.replace(/^'(.*)'$/, '$1');
}

function main(args) {
  args = fs.readFileSync(args[0], {encoding: 'utf-8'}).split('\n').map(unquoteArgs);
  const
      [outDir, baseDir, srcsArg, binDir, genDir, depsArg, substitutionsArg, releasePath,
        replaceWithVersion, stampFile, distDir] = args;

  const substitutions = [
    // Strip content between BEGIN-INTERNAL / END-INTERNAL comments
    [/(#|\/\/)\s+BEGIN-INTERNAL[\w\W]+?END-INTERNAL/g, ''],
  ];
  const rawReplacements = JSON.parse(substitutionsArg);
  for (let key of Object.keys(rawReplacements)) {
    substitutions.push([new RegExp(key, 'g'), rawReplacements[key]])
  }
  // Replace version last so that earlier substitutions can add
  // the version placeholder
  if (replaceWithVersion) {
    let version = '0.0.0';
    if (stampFile) {
      // The stamp file is expected to look like
      // BUILD_SCM_HASH 83c699db39cfd74526cdf9bebb75aa6f122908bb
      // BUILD_SCM_LOCAL_CHANGES true
      // BUILD_SCM_VERSION 6.0.0-beta.6+12.sha-83c699d.with-local-changes
      // BUILD_TIMESTAMP 1520021990506
      //
      // We want version to be the 6.0.0-beta... part
      const versionTag = fs.readFileSync(stampFile, {encoding: 'utf-8'})
          .split('\n')
          .find(s => s.startsWith('BUILD_SCM_VERSION'));
      // Don't assume BUILD_SCM_VERSION exists
      if (versionTag) {
        version = versionTag.split(' ')[1].replace(/^v/, '').trim();
      }
    }
    substitutions.push([new RegExp(replaceWithVersion, 'g'), version]);
  }

  // src like baseDir/my/path is just copied to outDir/my/path
  for (let src of srcsArg.split(',').filter(s => !!s)) {
    src = src.replace(/\\/g, '/');
    if (src.startsWith('external/')) {
      // If srcs is from external workspace drop the external/wksp portion
      copyWithReplace(
          src, path.join(outDir, src.split('/').slice(2).join('/')), substitutions);
    } else {
      // Source is from local workspace
      if (baseDir && !src.startsWith(`${baseDir}/`)) {
        throw new Error(
            `${src} in 'srcs' does not reside in the base directory, ` +
            `generated file should belong in 'deps' instead.`);
      }
      copyWithReplace(
          src, path.join(outDir, path.relative(baseDir, src)), substitutions);
    }
  }

  function outPath(f) {
    if (!path.relative(binDir, f).startsWith('..')) {
      return path.join(outDir, path.relative(path.join(binDir, baseDir), f));
    } else if (!path.relative(genDir, f).startsWith('..')) {
      return path.join(outDir, path.relative(path.join(genDir, baseDir), f));
    } else {
      // It might be nice to enforce here that deps don't contain sources
      // since those belong in srcs above.
      // The `deps` attribute should typically be outputs of other rules.
      // However, things like .d.ts sources of a ts_library or data attributes
      // of ts_library will result in source files that appear in the deps
      // so we have to allow this.
      return path.join(outDir, path.relative(baseDir, f));
    }
  }

  // Deps like bazel-bin/baseDir/my/path is copied to outDir/my/path.
  for (const dep of depsArg.split(',').filter(s => !!s)) {
    try {
      copyWithReplace(dep, outPath(dep), substitutions);
    } catch (e) {
      console.error(`Failed to copy ${dep} to ${outPath(dep)}`);
      throw e;
    }
  }

  fs.writeFileSync(releasePath, `
release=$(which jsii-release)
"\${release}" ${distDir}`);
}

if (require.main === module) {
  process.exitCode = main(process.argv.slice(2));
}
