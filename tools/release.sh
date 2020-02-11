#!/bin/bash
set -euo pipefail
scriptdir=$(cd $(dirname $0) && pwd)

#====================================
# release to github npm repository
#====================================

${scriptdir}/release-npm.sh dist/js
${scriptdir}/release-github.sh


