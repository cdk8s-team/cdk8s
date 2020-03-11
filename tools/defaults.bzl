# Re-export of Bazel rules with repository-wide defaults

load("@build_bazel_rules_nodejs//:index.bzl", _pkg_npm = "pkg_npm")
load("@npm_bazel_typescript//:index.bzl", _ts_library = "ts_library")
load("//:packages.bzl", "VERSION_PLACEHOLDER_REPLACEMENTS")
load("//tools:jest.bzl", _jest_test = "jest_test")
load("//tools:jsii_library.bzl", _jsii_library = "jsii_library")
load("//tools:jsii_package.bzl", _jsii_package = "jsii_package")
load("//tools:package-json/package_json.bzl", _package_json = "package_json")


def ts_library(tsconfig = None, deps = [], testonly = False, **kwargs):
    # Add tslib because we use import helpers for all public packages.
    local_deps = ["@npm//@types/node"] + deps

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

def jsii_library(**kwargs):
    _jsii_library(**kwargs)

def jsii_package(name, deps = [], out_dir = "dist", **kwargs):
    # We need a genrule that copies the license into the current package. This
    # allows us to include the license in the "pkg_npm".
    native.genrule(
        name = "license_copied",
        srcs = ["//:LICENSE"],
        outs = ["LICENSE"],
        cmd = "cp $< $@",
    )

    _jsii_package(
        name = name,
        deps = deps + [":license_copied"],
        configuration_env_vars = [
            "JAVA_HOME",
            "PATH",
            "M2_HOME",
            "M2",
        ],
        out_dir = out_dir,
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

def jest_test(srcs = [], lib = None, **kwargs):
    if lib:
        native.filegroup(
            name = "test_sources",
            testonly = True,
            srcs = [lib],
            output_group = "es5_sources",
        )

        srcs = srcs + [":test_sources"]

    _jest_test(
        srcs = srcs,
        **kwargs
    )

def package_json(**kwargs):
    _package_json(**kwargs)
