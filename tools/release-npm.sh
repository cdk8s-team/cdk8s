#!/bin/bash
set -eu

[ -z "${1:-}" ] && {
    echo "Usage: $(basename $0) DIR"
    exit 1
}

[ -z "${NPM_TOKEN:-}" ] && {
    echo "NPM_TOKEN is required"
    exit 1
}

log=$(mktemp -d)/npmlog.txt

NPM_REGISTRY=${NPM_REGISTRY:-"registry.npmjs.org"}

echo "//${NPM_REGISTRY}/:_authToken=${NPM_TOKEN}" > ~/.npmrc
npm publish $1/* 2>&1 | tee $log
exit_code="${PIPESTATUS[0]}"

echo
echo "==============================================================="

if [ ${exit_code} -ne 0 ]; then

  if cat $log | grep -q "You cannot publish over the previously published versions"; then
    echo "SKIPPING: already published"
    exit 0
  fi

  echo "ERROR"
  exit 1
fi

echo "SUCCESS"