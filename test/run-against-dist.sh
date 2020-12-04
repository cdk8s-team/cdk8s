#!/bin/bash
set -euo pipefail
scriptdir=$(cd $(dirname $0) && pwd)

export CDK8S_DIST="${scriptdir}/../dist"

cwd=$PWD

cd ${CDK8S_DIST}

# verify this is indeed a "dist" directory
if [ ! -d "js" ] || [ ! -d "java" ] || [ ! -d "python" ] || [ ! -d "dotnet" ]; then
  echo "ERROR: unable to find the subdirectories 'js', 'java', 'python' and 'dotnet' which should be in the 'dist' directory"
  echo "Did you run 'yarn run package' to create the 'dist' directory?"
  exit 1
fi

# install the CLI from dist/js in a temporary area and add to path
echo "Extracting CLI from 'dist'..."
staging=$(mktemp -d)
cd ${staging}
npm init -y > /dev/null
npm install ${CDK8S_DIST}/js/*.tgz
export PATH=${staging}/node_modules/.bin:$PATH

ls ${staging}/node_modules/.bin/
# restore working directory
cd $cwd
$@