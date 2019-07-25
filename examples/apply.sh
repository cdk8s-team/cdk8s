#!/bin/bash
# usage:
#
#   cd <example>
#   ../apply.sh
#
set -euo pipefail

# synth
rm -fr cdk.out
node index.js

# deploy
kubectl apply -f cdk.out/*.k8s.yaml
