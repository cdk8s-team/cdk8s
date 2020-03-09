# Re-export of Bazel rules with repository-wide defaults

load("@build_bazel_rules_nodejs//:index.bzl", _pkg_npm = "pkg_npm")
load("@npm_bazel_typescript//:index.bzl", _ts_library = "ts_library")
load("//:packages.bzl", "VERSION_PLACEHOLDER_REPLACEMENTS")
load("//tools:jest.bzl", _jest_test = "jest_test")


def ts_library(tsconfig = None, deps = [], testonly = False, **kwargs):
    # Add tslib because we use import helpers for all public packages.
    local_deps = ["@npm//tslib", "@npm//@types/node"] + deps

    if testonly:
        local_deps.append("@npm//@types/jest")

    if not tsconfig:
        tsconfig = "//packages:tsconfig-build.json"

    _ts_library(
        tsconfig = tsconfig,
        testonly = testonly,
        deps = local_deps,
        runtime = "nodejs",
        **kwargs
    )

def pkg_npm(name, srcs = [], deps = [], **kwargs):
    # We need a genrule that copies the license into the current package. This
    # allows us to include the license in the "pkg_npm".
    native.genrule(
        name = "license_copied",
        srcs = ["//:LICENSE"],
        outs = ["LICENSE"],
        cmd = "cp $< $@",
    )

    _pkg_npm(
        name = name,
        srcs = srcs,
        substitutions = VERSION_PLACEHOLDER_REPLACEMENTS,
        deps = deps + [":license_copied"],
        **kwargs
    )

def jest_test(**kwargs):
    _jest_test(**kwargs)
