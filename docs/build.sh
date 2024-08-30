#!/bin/bash
set -euo pipefail
set -x

scriptdir=$(cd $(dirname $0) && pwd)
nodemodulesdir=${scriptdir}/../node_modules
outdir=${1:-${scriptdir}/../website/static/docs}

# resolve path
mkdir -p "${outdir}"
outdir=$(cd ${outdir} && pwd)

# repo root
cd ${scriptdir}/..

# install deps
pip3 install -r docs/requirements.txt

# stage some content from the repo
cp CHANGELOG.md docs/
cp CONTRIBUTING.md docs/
cp ROADMAP.md docs/

LATEST_K8S_VERSION=$(< src/latest-k8s-version.txt)
CDK8S_PLUS_VERSIONS=("cdk8s-plus-$((${LATEST_K8S_VERSION}-2))" "cdk8s-plus-$((${LATEST_K8S_VERSION}-1))" "cdk8s-plus-${LATEST_K8S_VERSION}")

# copy API reference docs from cdk8s and each cdk8s+ package version
for module in cdk8s ${CDK8S_PLUS_VERSIONS[@]}; do
  javamd=$(node -p "require.resolve('${module}/docs/java.md')")
  pythonmd=$(node -p "require.resolve('${module}/docs/python.md')")
  typescriptmd=$(node -p "require.resolve('${module}/docs/typescript.md')")
  cat $javamd | sed "s/# API Reference/# ${module} (Java)/" > "docs/reference/${module}/java.md"
  cat $pythonmd | sed "s/# API Reference/# ${module} (Python)/" > "docs/reference/${module}/python.md"
  cat $typescriptmd | sed "s/# API Reference/# ${module} (TypeScript)/" > "docs/reference/${module}/typescript.md"
done

# copy /plus/* docs from each cdk8s+ version into separate docs/plus/$version sub-dirs
for module in ${CDK8S_PLUS_VERSIONS[@]}; do
  mkdir -p "docs/plus/${module}/"
  cp -R "${nodemodulesdir}/${module}"/docs/plus/* "docs/plus/${module}"
done

# repo root
cd ${scriptdir}/..

docsout="${outdir}/latest"
rm -fr ${docsout}
mkdocs build --site-dir ${docsout}

# create a redirect to the latest version
echo "<meta http-equiv='refresh' content='0; URL=latest' />" > ${outdir}/index.html
