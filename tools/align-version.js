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

  const newVersion = `${repoVersion}${versionSuffix}`;
  pkg.version = newVersion;

  processSection(pkg.dependencies || { }, newVersion);
  processSection(pkg.devDependencies || { }, newVersion);
  processSection(pkg.peerDependencies || { }, newVersion);

  console.error(`${file} => ${newVersion}`);
  fs.writeFileSync(file, JSON.stringify(pkg, undefined, 2));
}

function processSection(section, newVersion) {
  for (const [ name, version ] of Object.entries(section)) {
    if (version === marker || version === '^' + marker) {
      section[name] = version.replace(marker, newVersion);
    }
  }
}
