#!/bin/bash
#---------------------------------------------------------------------------------------------------------------------
# Import the kubernetes OpenApi specs from https://github.com/kubernetes/kubernetes/tree/master/api/openapi-spec
# and translates them to JSON Schema. These specs are later used by the
# 'cdk8s import k8s' command.
#---------------------------------------------------------------------------------------------------------------------
set -euo pipefail
scriptdir=$(cd $(dirname $0) && pwd)
rootdir=${scriptdir}/..

version=${1:-}

if [ -z ${version} ]; then
  echo "Error: Version is required"
  echo "Usage: ${scriptdir}/import-spec.sh VERSION"
  exit 1
fi

schemas_dir=${rootdir}/kubernetes-schemas

mkdir -p ${schemas_dir}

pip install openapi2jsonschema

cd ${schemas_dir}

schema_dir=v${version}
mkdir -p ${schema_dir}
cd ${schema_dir}

openapi2jsonschema --kubernetes https://raw.githubusercontent.com/kubernetes/kubernetes/v${version}/api/openapi-spec/swagger.json -o .
ls | grep -v _definitions.json | xargs rm
