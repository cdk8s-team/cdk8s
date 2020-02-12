#!/bin/bash
# create a github release
set -euo pipefail

root=$(cd $(dirname $0)/.. && pwd)
cd ${root}

repo="awslabs/cdk8s"

# check if we already have the current release
version="$(node -p "require('./version.json').version")"
echo "checking if we already have a release for ${version}"
if curl --silent --fail -H "Authorization: token ${GITHUB_TOKEN}" https://api.github.com/repos/${repo}/releases/tags/v${version}; then
  echo "release already exists"
  exit 0
fi

echo "creating github release..."
npx standard-version --release-as ${version}
