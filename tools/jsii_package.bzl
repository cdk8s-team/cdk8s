"""Bazel macro for running JSII packaging"""

load("@build_bazel_rules_nodejs//:index.bzl", "npm_package_bin")
load("//tools:defaults.bzl", "copy_with_replace")

def jsii_package(name, srcs = [], deps = []):
    """
    This macro creates the output directory for all of the target languages of JSII.
    Args:
      name: name of the runnable rule to create
      srcs: the sources to package from JSII
    """

    copy_with_replace(
        name = "copy_lib",
        srcs = srcs,
    )

    npm_package_bin(
        name = name,
        package = "jsii-pacmak",
        data = [":copy_lib"] + deps + ["@nodejs//:run_npm.sh.template"],
        args = ["$(location :copy_lib)", "-v=1000", "-o=$(@D)", "-t=java", "-t=python"],
        output_dir = True,
    )
