#!/bin/bash
set -euo pipefail
if git diff --exit-code; then
    echo "there are uncommitted changes"
    exit 1
fi

git clean -fdx
yarn
yarn build
yarn run package
yarn test:update
