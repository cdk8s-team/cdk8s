#!/bin/bash
set -e
scriptdir=$(cd $(dirname $0) && pwd)

source ${scriptdir}/../common.sh

cd $(mktemp -d)
mkdir test && cd test

cp ${scriptdir}/cdk8s.yaml  .
cp ${scriptdir}/mattermost_crd.yaml .
cp ${scriptdir}/example_multiple_crd.yaml .

echo "CAMPION"
echo $PATH
echo "%PATH%"
ls .

sudo cdk8s import mattermost:=mattermost_crd.yaml --language python

match_snapshot imports ${scriptdir}/expected-named-from-cli

rm -rf imports

sudo cdk8s import --language python

match_snapshot imports ${scriptdir}/expected-from-config

rm -rf imports

sudo cdk8s import mattermost_crd.yaml --language python

match_snapshot imports ${scriptdir}/expected-from-cli

rm -rf imports

echo "PASS"