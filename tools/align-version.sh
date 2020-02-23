#!/bin/bash
# aligns lerna version to package.json
# this is executed in CI builds so artifacts include the actual version instead of 0.0.0.0

set -euo pipefail
scriptdir="$(cd $(dirname $0) && pwd)"
cd ${scriptdir}/..

version=$(node -p "require('./package.json').version")
npx lerna version ${version} --yes --exact --force-publish=* --no-git-tag-version --no-push

