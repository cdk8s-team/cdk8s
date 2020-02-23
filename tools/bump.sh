#!/bin/bash
set -euo pipefail
repo_root=$(cd $(dirname $0)/.. && pwd)
cd ${repo_root}

version="${1:-minor}"

yarn install
npx standard-version --release-as ${version} --skip.tag --bumpFiles package.json
