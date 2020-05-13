#!/bin/bash
set -euo pipefail
scriptdir="$(cd $(dirname $0) && pwd)"

# used to render the references to reference documentation
export CDK8S_VERSION=$(node -p "require('../package.json').version")

hugo --minify $@
