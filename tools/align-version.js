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

  fs.access(file, fs.constants.W_OK, err => {
    console.log('asdasdasd')
    if (err) {
      throw err;
    }
    // if (err) {
    //   // file is not writable. its ok if this is a projen managed project.
    //   if (fs.existsSync(path.join(path.dirname(file), '.projenrc.js'))) {

    //   } else {
    //     throw err;
    //   }
    // }
  });

  pkg.version = repoVersion;

  processSection(pkg.dependencies || { });
  processSection(pkg.devDependencies || { });
  processSection(pkg.peerDependencies || { });

  console.error(`${file} => ${repoVersion}`);
  fs.writeFileSync(file, JSON.stringify(pkg, undefined, 2));
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
