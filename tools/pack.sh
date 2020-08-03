#!/bin/bash
set -euo pipefail
repo_root=$(cd $(dirname $0)/.. && pwd)
cd ${repo_root}

echo "Packaging JSII modules..."
jsii-pacmak -v packages/cdk8s packages/cdk8s-plus

echo "Packaging CLI..."
cd packages/cdk8s-cli
yarn package