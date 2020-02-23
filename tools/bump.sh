#!/bin/bash
set -euo pipefail
repo_root=$(cd $(dirname $0)/.. && pwd)
cd ${repo_root}

# pre 1.0.0 we default to "patch" which implies "minor" (i.e. no breaking changes)
version="${1:-patch}"

yarn install
npx standard-version --release-as ${version} --skip.tag --bumpFiles package.json
