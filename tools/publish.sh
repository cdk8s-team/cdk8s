#!/bin/bash
set -euo pipefail

# publish npm
echo "//npm.pkg.github.com/:_authToken=${GITHUB_TOKEN}" > ~/.npmrc
cd dist/js
for tarball in $(ls *.tgz); do
  echo "publishing ${tarball}"
  npm publish --tag pre ${tarball}
fi
