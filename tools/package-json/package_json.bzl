# Label of the template file to use.
_TEMPLATE = "//tools:package-json/package.json"

PACKAGE_JSON_ATTRS = {
    "package_name": attr.string(
        doc = """The name of the package.""",
    ),
    "desc": attr.string(
        doc = """The description of the package.""",
    ),
    "experimental": attr.bool(
        doc = """Whether the package is stable""",
        default = False,
    ),
    "bundled_deps": attr.string_list(
        doc = """The list of bundledDependencies""",
        default = [],
    ),
    "deps": attr.string_dict(
        doc = """The list of dependencies""",
        default = {},
    ),
    "peer_deps": attr.string_dict(
        doc = """The list of peerDependencies""",
        default = {},
    ),
    "jsii_targets": attr.string(
        doc = """The jsii configuration (as a string bc nested dicts are evil)""",
        default = "{}"
    ),
    "_template": attr.label(
        default = Label(_TEMPLATE),
        allow_single_file = True,
    ),
}

def _package_json_impl(ctx):

    ctx.actions.declare_file("package.json")

    ctx.actions.expand_template(
        template = ctx.file._template,
        output = ctx.outputs.out,
        substitutions = {
            "\"JSII_TARGETS\"": str(ctx.attr.jsii_targets),
            "PACKAGE_NAME": ctx.attr.package_name,
            "PACKAGE_DESC": ctx.attr.desc,
            "PACKAGE_STABILITY": "stable" if not ctx.attr.experimental else "experimental",
            "\"PACKAGE_DEPS\"": str(ctx.attr.deps),
            "\"PACKAGE_PEER_DEPS\"": str(ctx.attr.peer_deps),
            "\"PACKAGE_BUNDLED_DEPS\"": str(ctx.attr.bundled_deps),
        },
    )

    return [DefaultInfo(files = depset([ctx.outputs.out]))]

package_json = rule(
    implementation = _package_json_impl,
    attrs = PACKAGE_JSON_ATTRS,
    outputs = {"out": "package.json"},
)
