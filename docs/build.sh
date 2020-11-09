#!/bin/bash
scriptdir=$(cd $(dirname $0) && pwd)
outdir=${1:-}
if [ -z "${outdir}" ]; then
  echo "Usage: $0 OUTDIR"
  exit 1
fi

set -euo pipefail
pip install mkdocs mkdocs-awesome-pages-plugin mkdocs-material

cd ${scriptdir}/..
mkdocs build -d $outdir
