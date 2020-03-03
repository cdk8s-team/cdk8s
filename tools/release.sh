#!/bin/bash
set -euo pipefail
scriptdir=$(cd $(dirname $0) && pwd)

# release to all package managers
npx jsii-release
 
# release to github releases (still not supported by jsii-release)
${scriptdir}/release-github.sh
