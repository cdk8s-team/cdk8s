#!/bin/bash
set -euo pipefail
scriptdir="$(cd $(dirname $0) && pwd)"

get_version() {
  node -p "require('$1/package.json').version"
}

export CDK8S_CORE_VERSION="$(get_version cdk8s)"
export CDK8S_PLUS17_VERSION="$(get_version cdk8s-plus-17)"
export CDK8S_CLI_VERSION="$(get_version cdk8s-cli)"

hugo --minify $@
