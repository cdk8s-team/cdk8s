#!/bin/bash
set -euo pipefail
scriptdir=$(cd $(dirname $0) && pwd)

#====================================
# release to github npm repository
#====================================

export NPM_CONFIG_REGISTRY="https://registry.npmjs.org/"

npx jsii-release-npm dist/js
${scriptdir}/release-github.sh


