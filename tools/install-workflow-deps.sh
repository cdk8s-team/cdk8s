#!/bin/bash
# called by github workflows to install deps (on ubuntu)
set -euo pipefail
pip3 install pipenv
yarn install

# helm is needed for the tests of the `Helm` construct.
curl https://raw.githubusercontent.com/helm/helm/master/scripts/get-helm-3 | bash
