#!/usr/bin/env node
//
// align the version in a package.json file to the version of the repo
//
const fs = require('fs');
const semver = require('semver');
const path = require('path');

const marker = require('./get-version-marker');
const repoVersion = process.argv[2]
const files = process.argv.splice(3);

const preRelease = semver.prerelease(repoVersion) ? true : false

for (const file of files) {
  const pkg = JSON.parse(fs.readFileSync(file).toString());

  if (pkg.version !== marker) {
    throw new Error(`unexpected - all package.json files in this repo should have a version of ${marker}: ${file}`);
  }

  pkg.version = repoVersion;

  processSection(pkg.dependencies || { });
  processSection(pkg.devDependencies || { });
  processSection(pkg.peerDependencies || { });

  console.error(`${file} => ${repoVersion}`);

  const permissions = fs.statSync(file).mode;
  try {
    fs.writeFileSync(file, JSON.stringify(pkg, undefined, 2));
  } catch (err) {
    const isProjen = fs.existsSync(path.join(path.dirname(file), '.projenrc.js'));
    if (isProjen && err.message.includes('permission denied')) {
      // temporary change file permissions if projen
      fs.chmodSync(file, '600');
      fs.writeFileSync(file, JSON.stringify(pkg, undefined, 2));
    } else {
      throw err;
    }
  } finally {
    fs.chmodSync(file, permissions)
  }
}

function processSection(section) {
  for (const [ name, version ] of Object.entries(section)) {
    if (version === marker || version === '^' + marker) {

      if (preRelease) {
        // pre-release doesn't work with caret dependencies.
        // so we forcefully use pinned versions.
        section[name] = repoVersion;
      } else {
        section[name] = version.replace(marker, repoVersion);
      }

    }
  }
}
