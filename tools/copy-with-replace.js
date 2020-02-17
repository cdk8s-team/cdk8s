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

function copyWithReplace(src, dest, substitutions, renameBuildFiles) {
  mkdirp(path.dirname(dest));
  if (fs.lstatSync(src).isDirectory()) {
    const files = fs.readdirSync(src);
    files.forEach((relativeChildSrc) => {
      const childSrc = path.join(src, relativeChildSrc);
      const childDest = path.join(dest, path.basename(childSrc));
      copyWithReplace(childSrc, childDest, substitutions, renameBuildFiles);
    });
  } else if (!isBinary(src)) {
    let content = fs.readFileSync(src, {encoding: 'utf-8'});
    substitutions.forEach(r => {
      const [regexp, newvalue] = r;
      content = content.replace(regexp, newvalue);
    });
    if (renameBuildFiles) {
      // Prefix all Bazel BUILD files with _ for npm packages.
      // npm packages should not publish build files as this
      // breaks their usage within yarn_install & npm_install rules.
      const basenameUc = path.basename(dest).toUpperCase();
      if (basenameUc == 'BUILD' || basenameUc == 'BUILD.BAZEL') {
        dest = path.posix.join(path.dirname(dest), `_${path.basename(dest)}`);
      }
    }
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
    [outDir, baseDir, srcsArg, binDir, genDir, depsArg, packagesArg, substitutionsArg,
    vendorExternalArg, hideBuildFilesArg] = args;
  const renameBuildFiles = parseInt(hideBuildFilesArg);

  const substitutions = [
    // Strip content between BEGIN-INTERNAL / END-INTERNAL comments
    [/(#|\/\/)\s+BEGIN-INTERNAL[\w\W]+?END-INTERNAL/g, ''],
  ];
  const rawReplacements = JSON.parse(substitutionsArg);
  for (let key of Object.keys(rawReplacements)) {
    substitutions.push([new RegExp(key, 'g'), rawReplacements[key]])
  }

  // src like baseDir/my/path is just copied to outDir/my/path
  for (let src of srcsArg.split(',').filter(s => !!s)) {
    src = src.replace(/\\/g, '/');
    if (src.startsWith('external/')) {
      // If srcs is from external workspace drop the external/wksp portion
      copyWithReplace(
        src, path.join(outDir, src.split('/').slice(2).join('/')), substitutions,
        renameBuildFiles);
    } else {
      // Source is from local workspace
      if (baseDir && !src.startsWith(`${baseDir}/`)) {
        throw new Error(
          `${src} in 'srcs' does not reside in the base directory, ` +
          `generated file should belong in 'deps' instead.`);
      }
      copyWithReplace(
        src, path.join(outDir, path.relative(baseDir, src)), substitutions, renameBuildFiles);
    }
  }

  function outPath(f) {
    for (ext of vendorExternalArg.split(',').filter(s => !!s)) {
      const candidate = path.join(binDir, 'external', ext);
      if (!path.relative(candidate, f).startsWith('..')) {
        return path.join(outDir, path.relative(candidate, f));
      }
    }
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
  for (dep of depsArg.split(',').filter(s => !!s)) {
    try {
      copyWithReplace(dep, outPath(dep), substitutions, renameBuildFiles);
    } catch (e) {
      console.error(`Failed to copy ${dep} to ${outPath(dep)}`);
      throw e;
    }
  }

  // package contents like bazel-bin/baseDir/my/directory/* is
  // recursively copied to outDir/my/*
  for (pkg of packagesArg.split(',').filter(s => !!s)) {
    const outDir = outPath(path.dirname(pkg));
    function copyRecursive(base, file) {
      file = file.replace(/\\/g, '/');
      if (fs.lstatSync(path.join(base, file)).isDirectory()) {
        const files = fs.readdirSync(path.join(base, file));
        files.forEach(f => {
          copyRecursive(base, path.join(file, f));
        });
      } else {
        function outFile() {
          for (ext of vendorExternalArg.split(',').filter(s => !!s)) {
            if (file.startsWith(`external/${ext}`)) {
              return file.substr(`external/${ext}`.length);
            }
          }
          return file;
        }
        copyWithReplace(
          path.join(base, file), path.join(outDir, outFile()), substitutions, renameBuildFiles);
      }
    }
    fs.readdirSync(pkg).forEach(f => {
      copyRecursive(pkg, f);
    });
  }
}

if (require.main === module) {
  process.exitCode = main(process.argv.slice(2));
}
