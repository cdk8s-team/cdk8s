#!/bin/bash
# create a github release
set -euo pipefail

root=$(cd $(dirname $0)/.. && pwd)
cd ${root}

repo="awslabs/cdk8s"
version="$(node -p "require('./package.json').version")"

# skip if we already have a github release for this version
echo "checking if we already have a release for ${version}"
if curl --silent --fail -H "Authorization: token ${GITHUB_TOKEN}" https://api.github.com/repos/${repo}/releases/tags/v${version}; then
  echo "release already exists"
  exit 0
fi

if cat CHANGELOG.md | grep "## ${version}"; then
  echo "version already exists in changelog"
  exit 0
fi

echo "creating changelog..."
npx standard-version --skip.bump --skip.commit --skip.tag --release-as ${version}

# extract changelog entry
git diff CHANGELOG.md | grep "^+[^+]" | sed -e "s/^+//" > /tmp/changelog.txt

# prepare request body
node <<HERE
const fs = require('fs');
const req = {
  "tag_name": "v${version}",
  "name": "v${version}",
  "body": fs.readFileSync('/tmp/changelog.txt', 'utf-8')
};

fs.writeFileSync('/tmp/req.json', JSON.stringify(req, undefined, 2));
HERE

echo "creating github release for ${version}"
curl --request POST \
  --header "Authorization: token ${GITHUB_TOKEN}" \
  --header "Content-Type: application/json" \
  --data @/tmp/req.json \
  https://api.github.com/repos/${repo}/releases
