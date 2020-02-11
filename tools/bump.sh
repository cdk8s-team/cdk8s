#!/bin/bash
set -euo pipefail
version=$(node -p "require('./version.json').version")
npx lerna version ${version} --yes --exact --force-publish=* --no-git-tag-version --no-push
git add .
npx standard-version --release-as ${version} --commit-all

