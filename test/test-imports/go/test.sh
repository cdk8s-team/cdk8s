#!/bin/bash
set -e
scriptdir=$(cd $(dirname $0) && pwd)

source ${scriptdir}/../common.sh

cd $(mktemp -d)
mkdir test && cd test

cp ${scriptdir}/cdk8s.yaml  .
cp ${scriptdir}/mattermost_crd.yaml .
cp ${scriptdir}/example_multiple_crd.yaml .

# go.mod is required for cdk8s import in go
touch go.mod
echo "module example.com/test" > go.mod

cdk8s import --language go

match_snapshot imports ${scriptdir}/expected-from-config

rm -rf imports

cdk8s import mattermost_crd.yaml --language go

match_snapshot imports ${scriptdir}/expected-from-cli

rm -rf imports

cdk8s import mattermost:=mattermost_crd.yaml --language go

match_snapshot imports ${scriptdir}/expected-named-from-cli

rm -rf imports

echo "PASS"