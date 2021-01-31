#!/bin/bash
set -euo pipefail
repo_root=$(cd $(dirname $0)/.. && pwd)
cd ${repo_root}

echo "Cleaning dist directories..."
rm -rf dist/
rm -rf packages/cdk8s/dist
rm -rf packages/cdk8s-plus-17/dist
rm -rf packages/cdk8s-cli/dist

echo "Packaging moduless..."
lerna run package
