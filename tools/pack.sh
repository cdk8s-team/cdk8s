#!/bin/bash
set -euo pipefail
repo_root=$(cd $(dirname $0)/.. && pwd)
cd ${repo_root}

echo "Cleaning dist directories..."
rm -rf dist/
rm -rf packages/cdk8s/dist
rm -rf packages/cdk8s-plus/dist
rm -rf packages/cdk8s-cli/dist

echo "Packaging JSII modules..."
jsii-pacmak -v -v packages/cdk8s packages/cdk8s-plus

echo "Packaging CLI..."
cd packages/cdk8s-cli
yarn package