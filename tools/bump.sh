#!/bin/bash
set -euo pipefail
version_file="${1:-}"
if [ -z "${version_file}" ]; then
  echo "usage: $0 ./package.json"
  exit 1
fi

version=$(node -p "require('${version_file}').version")
npx lerna version ${version} --yes --exact --force-publish=* --no-git-tag-version --no-push
