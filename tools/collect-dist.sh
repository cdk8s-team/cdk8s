#!/bin/bash
set -euo pipefail

# always run from repo root
cd $(dirname $0)/..

rm -fr dist
mkdir -p dist

for dir in $(lerna ls -p); do
  src="${dir}/dist"
  echo "collecting from ${src}"
  rsync -aL ${src}/ dist/
done

find dist/
