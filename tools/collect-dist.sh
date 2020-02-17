#!/usr/bin/env bash

# Build the dist/packages-dist directory in the same fashion as the legacy
# /build.sh script, by building the npm packages with Bazel and copying files.
# This is needed for scripts and tests which are not updated to the Bazel output
# layout (which always matches the input layout).
# Do not add new dependencies on this script, instead adapt scripts to use the
# new layout, and write new tests as Bazel targets.
#
# Ideally integration tests should run under bazel, and just consume the npm
# packages via `deps`. Until that works, we manually build the npm packages and then
# copy the results to the appropriate `dist` location.

set -u -e -o pipefail

cd "$(dirname "$0")"

# basedir is the workspace root
readonly base_dir=$(pwd)/..
# We need to resolve the Bazel binary in the node modules because running Bazel
# through `yarn bazel` causes additional output that throws off command stdout.
readonly bin=$(yarn -s bazel info bazel-bin)

function getAllNpmPackages() {
  yarn -s bazel query --output=label 'attr("tags", "\[.*release\]", //packages/...) intersect kind("pkg_npm", //packages/...)'
}

function getAllJsiiPackages() {
  yarn -s bazel query --output=label 'attr("tags", "\[.*release\]", //packages/...) intersect kind("jsii_package", //packages/...)'
}

function buildTargetPackages() {
  # List of targets to build, e.g. core, common, compiler, etc.
  jsiiTargets=$(getAllJsiiPackages)
  npmTargets=$(getAllNpmPackages)

  # Path to the output directory into which we copy the npm packages.
  dest_path="$1"

  rm -fr "${dest_path}"

  # Use --config=release so that snapshot builds get published with embedded version info
  echo "$jsiiTargets" | xargs yarn -s bazel build --config=release
  echo "$npmTargets" | xargs yarn -s bazel build --config=release

  [[ -d "${base_dir}/${dest_path}" ]] && rm -r "${base_dir}"/"${dest_path:?}"/*
  [[ -d "${base_dir}/${dest_path}" ]] || mkdir -p "${base_dir}"/"${dest_path}"

  jsiiDirs=$(echo "$jsiiTargets" | sed -e 's/\/\/packages\/\(.*\):pkg/\1/')
  npmDirs=$(echo "$npmTargets" | sed -e 's/\/\/packages\/\(.*\):pkg/\1/')

  for pkg in ${jsiiDirs}; do
    src_dir="${bin}/packages/${pkg}/dist/"
    dest_dir="${base_dir}/${dest_path}"
    if [[ -d ${src_dir} ]]; then
      rsync -aL "${src_dir}" "${dest_dir}"
    fi
  done

  for pkg in ${npmDirs}; do
    # Skip any that don't have an "npm_package" target
    dest_dir="${base_dir}/${dest_path}"
    if [[ -d ${src_dir} ]]; then
      yarn -s bazel run packages/"${pkg}":pkg.pack
      mkdir -p "${dest_dir}"/js
      mv "${base_dir}"/"${pkg}"*.tgz "${dest_dir}"/js/
    fi
  done
}

buildTargetPackages "dist"
