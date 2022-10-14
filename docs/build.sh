#!/bin/bash
set -euo pipefail
set -x

scriptdir=$(cd $(dirname $0) && pwd)
nodemodulesdir=${scriptdir}/../node_modules
outdir=${1:-${scriptdir}/../website/public/docs}

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

CDK8S_PLUS_VERSIONS=("cdk8s-plus-22" "cdk8s-plus-23" "cdk8s-plus-24" "cdk8s-plus-25")

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
overviewpage="docs/plus/index.md"
for module in ${CDK8S_PLUS_VERSIONS[@]}; do
  mkdir -p "docs/plus/${module}/"
  cp -r "${nodemodulesdir}/${module}/docs/plus/" "docs/plus/${module}"
  # The latest cdk8s+ version's overview page is used as the /plus overview page
  cp "${nodemodulesdir}/${module}/$overviewpage" $overviewpage
done

# remove version from the title of /plus overview page
sed -i '' 's/# cdk8s+ v[0-9]*/# cdk8s+/' "$overviewpage"

# reduce all relative links by 1 level in the /plus overview page
sed -i '' 's/(\.\.\//(\.\//g' "$overviewpage"

# append to /plus overview page a list of links to the docs of each cdk8s+ version
NEW_LINE=$'\n'
table="## cdk8s+ versions$NEW_LINE"
for module in ${CDK8S_PLUS_VERSIONS[@]}; do
  table="$table$NEW_LINE* [**$module**](./$module/) · Kubernetes v1.${module: -2}.0"
done
echo "$NEW_LINE$table" >> "$overviewpage"



# repo root
cd ${scriptdir}/..

docsout="${outdir}/latest"
rm -fr ${docsout}
mkdocs build --site-dir ${docsout}

# create a redirect to the latest version
echo "<meta http-equiv='refresh' content='0; URL=latest' />" > ${outdir}/index.html
