#!/bin/bash
set -euo pipefail

# synth
rm -fr cdk.out
node hello-k8s.js

# deploy
kubectl apply -f cdk.out/hellowwwww.k8s.yaml
