load("@build_bazel_rules_nodejs//:index.bzl", "nodejs_binary")

ENTRY_POINT = "//packages/cdk8s-cli:bin/cdk8s"

# Implementation of cdk8s that performs the import action
# NOTE: could be made more general, or can be copied into other
#       rules to make other separate CLI action rules
def cdk8s_import(name, language, include = None, **kwargs):
    data = [
        "//packages/cdk8s-cli:cdk8s_cli",
        "//packages/cdk8s-cli:copy_templates",
        "@npm//yargs",
        "@npm//yaml",
    ]

    # Someone please fix this :(
    args = ["import", "k8s", "-o", "$(echo \"${BAZEL_TARGET#//}\" | sed 's/:/\//g')", "--language", language]

    if include:
        args.extend(["--include", include])

    nodejs_binary(
        name = name,
        data = data,
        entry_point = ENTRY_POINT,
        templated_args = args,
        **kwargs
    )

def cdk8s_synth(name, app, path, data = [], **kwargs):
    nodejs_binary(
        name = name,
        data = data + [
            "//packages/cdk8s:lib",
            "//packages/cdk8s-cli:cdk8s_cli",
            "//packages/cdk8s-cli:package.json",
            "//packages/cdk8s-cli:copy_templates",
            "@npm//yargs",
            "@npm//yaml",
        ],
        entry_point = ENTRY_POINT,
        # 3 here is to account for the leading // and the :
        templated_args = ["synth", "--app=\"%s\"" % app, "-o", "${BAZEL_TARGET:2:${#BAZEL_TARGET}-%s}/%s" % (str(len(name) + 3), path), "--nobazel_patch_module_resolver"],
        **kwargs
    )
