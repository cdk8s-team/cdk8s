#!/bin/sh
set -e
scriptdir=$(cd $(dirname $0) && pwd)

cd $(mktemp -d)
mkdir test && cd test

cp ${scriptdir}/cdk8s.yaml  .
cp ${scriptdir}/mattermost_crd.yaml .

cdk8s import mattermost:=mattermost_crd.yaml --language python

cdk8s import --language python
diff -r imports ${scriptdir}/expected-from-config

rm -rf imports

cdk8s import mattermost_crd.yaml --language python

diff -r imports ${scriptdir}/expected-from-cli

rm -rf imports

echo "PASS"