#!/bin/bash
# usage:
#
#   cd <example>
#   ../apply.sh
#
set -euo pipefail

# install and build
yarn gen
yarn install -L
yarn build

# synth
rm -rf dist
node index.js

# deploy
kubectl apply -f dist/*.k8s.yaml
