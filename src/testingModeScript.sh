#!/bin/bash
export testingMode=$1

if [$testingMode]; then
  echo labels="auto-approve" >> $GITHUB_OUTPUT
fi

# if [[$testingMode]]; then
#   echo labels="auto-approve" >> $GITHUB_OUTPUT
# fi

# if [-z "$testingMode"]; then
#   echo labels="auto-approve" >> $GITHUB_OUTPUT
# fi
# export isPush="$(get_version cdk8s-plus-$((${LATEST_K8S_VERSION}-2)))"
# export CDK8S_PLUSXX_MINUS_1_VERSION="$(get_version cdk8s-plus-$((${LATEST_K8S_VERSION}-1)))"
# export CDK8S_PLUSXX_VERSION="$(get_version cdk8s-plus-${LATEST_K8S_VERSION})"
# export CDK8S_CLI_VERSION="$(get_version cdk8s-cli)"
# hugo --minify $@