#!/bin/bash
set -euo pipefail
commit_id=$(git rev-parse --short HEAD 2>/dev/null || echo "dev")
exec npx lerna version prerelease --yes --exact --force-publish="*" --no-git-tag-version --no-push --preid "pre+${commit_id}"
