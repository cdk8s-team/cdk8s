"""Bazel macro for running JSII interpolation"""

load("@build_bazel_rules_nodejs//:index.bzl", "npm_package_bin")
load("//tools:defaults.bzl", "copy_with_replace")


def jsii_library(name, srcs = [], deps = []):
    """
    This macro creates the output directory for the compiled JSII output.
    Args:
      name: name of the runnable rule to create
      srcs: the sources to compile with JSII
    """

    copy_with_replace(
        name = "copy",
        srcs = srcs,
    )

    npm_package_bin(
        name = name,
        package = "jsii",
        data = [":copy"] + deps,
        args = ["$(execpath :copy)", "--v=1000", "-o=$(@D)"],
        output_dir = True,
    )
