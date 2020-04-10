#!/bin/sh
set -e
scriptdir=$(cd $(dirname $0) && pwd)

cd $(mktemp -d)
mkdir test && cd test

cp ${scriptdir}/cdk8s.yaml  .
cp ${scriptdir}/mattermost_crd.yaml .

cdk8s import mattermost:=mattermost_crd.yaml --language python || echo "Named import not supported yet."

# Using the cdk8s.yaml config, with named import
# Should fail to import named import but successful
# for others
cdk8s import --language python || echo "Named import not supported yet."
diff -r imports ${scriptdir}/expected-from-config
diff -r imports ${scriptdir}/expected-from-config

rm -rf imports

cdk8s import mattermost_crd.yaml --language python

diff -r imports ${scriptdir}/expected-from-cli

echo "PASS"