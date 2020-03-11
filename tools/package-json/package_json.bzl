# Label of the template file to use.
_TEMPLATE = "//tools:package-json/package.json"

PACKAGE_JSON_ATTRS = {
    "package_name": attr.string(
        doc = """The name of the package.""",
    ),
    "main": attr.string(
        doc = """The main entrypoint of the package""",
        default = "lib/index.js",
    ),
    "types": attr.string(
        doc = """The main entrypoint for the types of the package""",
        default = "lib/index.d.ts",
    ),
    "bin": attr.string_dict(
        doc = """The bin entries for the package""",
        default = {},
    ),
    "bundled_deps": attr.string_list(
        doc = """The list of bundledDependencies""",
        default = [],
    ),
    "desc": attr.string(
        doc = """The description of the package.""",
    ),
    "experimental": attr.bool(
        doc = """Whether the package is stable""",
        default = False,
    ),
    "jsii_targets": attr.string(
        doc = """The jsii configuration (as a string bc nested dicts are evil)""",
        default = "",
    ),
    "peer_deps": attr.string_dict(
        doc = """The list of peerDependencies""",
        default = {},
    ),
    "deps": attr.string_dict(
        doc = """The list of dependencies""",
        default = {},
    ),
    "_template": attr.label(
        default = Label(_TEMPLATE),
        allow_single_file = True,
    ),
}

JSII_TEMPLATE = str({
    "outdir": "dist",
    "targets": "JSII_TARGETS",
    "versionFormat": "short",
})

def _package_json_impl(ctx):
    ctx.actions.declare_file("package.json")
    tmp_package_json = ctx.actions.declare_file("package.json.tmp")

    substitutions = dict({
        "\"PACKAGE_BIN\"": str(ctx.attr.bin),
        "PACKAGE_MAIN": ctx.attr.main,
        "PACKAGE_TYPES": ctx.attr.types,
        "\"PACKAGE_BUNDLED_DEPS\"": str(ctx.attr.bundled_deps),
        "\"PACKAGE_DEPS\"": str(ctx.attr.deps),
        "\"PACKAGE_PEER_DEPS\"": str(ctx.attr.peer_deps),
        "PACKAGE_DESC": ctx.attr.desc,
        "PACKAGE_NAME": ctx.attr.package_name,
        "PACKAGE_STABILITY": "stable" if not ctx.attr.experimental else "experimental",
    })

    substitutions.update({
        "\"PACKAGE_JSII\"": JSII_TEMPLATE if ctx.attr.jsii_targets else "{}",
    })

    ctx.actions.expand_template(
        template = ctx.file._template,
        output = tmp_package_json,
        substitutions = substitutions,
    )

    ctx.actions.expand_template(
        template = tmp_package_json,
        output = ctx.outputs.out,
        substitutions = {
            "\"JSII_TARGETS\"": str(ctx.attr.jsii_targets),
        },
    )

    return [DefaultInfo(files = depset([ctx.outputs.out]))]

package_json = rule(
    implementation = _package_json_impl,
    attrs = PACKAGE_JSON_ATTRS,
    outputs = {"out": "package.json"},
)
