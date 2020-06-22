#!/usr/bin/env node
//
// align the version in a package.json file to the version of the repo
//
const fs = require('fs');

const marker = require('./get-version-marker');
const repoVersion = require('./get-version');
const versionSuffix = process.argv[2]
const files = process.argv.splice(3);

console.log(`suffix: ${versionSuffix}`)
console.log(`files: ${files}`)

for (const file of files) {
  const pkg = JSON.parse(fs.readFileSync(file).toString());

  if (pkg.version !== marker) {
    throw new Error(`unexpected - all package.json files in this repo should have a version of ${marker}: ${file}`);
  }

  pkg.version = `${repoVersion}${versionSuffix}`;

  processSection(pkg.dependencies || { }, file);
  processSection(pkg.devDependencies || { }, file);
  processSection(pkg.peerDependencies || { }, file);

  console.error(`${file} => ${repoVersion}`);
  fs.writeFileSync(file, JSON.stringify(pkg, undefined, 2));
}

function processSection(section, file) {
  for (const [ name, version ] of Object.entries(section)) {
    if (version === marker || version === '^' + marker) {
      section[name] = version.replace(marker, repoVersion);
    }
  }
}
