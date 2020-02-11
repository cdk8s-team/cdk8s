#!/bin/bash
set -eu
set -x

dir="${1:-}"

[ -z "${dir:-}" ] && {
  echo "Usage: $(basename $0) DIR"
  exit 1
}

# if NPM_TOKEN is specified, we rewrite ~/.npmrc to use it along with NPM_REGISTRY
# otherwise we just use the current configuration.
if [ -n "${NPM_TOKEN:-}" ]; then
  NPM_REGISTRY=${NPM_REGISTRY:-"registry.npmjs.org"}
  echo "//${NPM_REGISTRY}/:_authToken=${NPM_TOKEN}" > ~/.npmrc
fi

log=$(mktemp -d)/npmlog.txt

for file in ${dir}/**.tgz; do
  npm publish ${file} 2>&1 | tee ${log}
  exit_code="${PIPESTATUS[0]}"

  if [ ${exit_code} -ne 0 ]; then

    # error returned from npmjs
    if cat ${log} | grep -q "You cannot publish over the previously published versions"; then
      echo "SKIPPING: already published"
      continue
    fi

    # error returned from github packages
    if cat ${log} | grep -q "Cannot publish over existing version"; then
      echo "SKIPPING: already published"
      continue
    fi

    echo "ERROR"
    exit 1
  fi
done

echo "SUCCESS"