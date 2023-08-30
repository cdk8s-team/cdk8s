#!/bin/bash
set -euo pipefail
scriptdir="$(cd $(dirname $0) && pwd)"

get_version() {
  node -p "require('$1/package.json').version"
}

LATEST_K8S_VERSION=$(< src/latest-k8s-version.txt)

export CDK8S_CORE_VERSION="$(get_version cdk8s)"
export CDK8S_PLUSXX_MINUS_2_VERSION="$(get_version cdk8s-plus-$((${LATEST_K8S_VERSION}-2)))"
export CDK8S_PLUSXX_MINUS_1_VERSION="$(get_version cdk8s-plus-$((${LATEST_K8S_VERSION}-1)))"
export CDK8S_PLUSXX_VERSION="$(get_version cdk8s-plus-${LATEST_K8S_VERSION})"
export CDK8S_CLI_VERSION="$(get_version cdk8s-cli)"

hugo --minify $@
