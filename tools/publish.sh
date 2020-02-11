#!/bin/bash
set -euo pipefail

# publish npm
echo "//npm.pkg.github.com/:_authToken=${GITHUB_TOKEN}" > ~/.npmrc
cd dist/js
npm publish *.tgz
