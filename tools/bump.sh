#!/bin/bash
set -euo pipefail
bump=${1:-patch}
npx lerna version "${bump}" --yes --exact --force-publish=* --no-git-tag-version --no-push
git add .
npx standard-version --commit-all
