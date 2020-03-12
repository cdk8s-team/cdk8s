"""Bazel rule for running JSII interpolation"""

load("@bazel_skylib//rules/private:copy_file_private.bzl", "copy_bash")
load(
    "//tools:external.bzl",
    "DEFAULT_JSII_COMPILER",
    "DEPS_ASPECTS",
    "DeclarationInfo",
    "JSEcmaScriptModuleInfo",
    "JSNamedModuleInfo",
    "NpmPackageInfo",
    "node_modules_aspect",
    "run_node",
)

def _expected_outs(ctx):
    js_files = []
    declaration_files = []

    for src in ctx.files.srcs:
        package_prefix = ctx.label.package + "/" if ctx.label.package else ""

        # Strip external repository name from path if src is from external repository
        # If src is from external repository, it's short_path will be ../<external_repo_name>/...
        short_path = src.short_path if src.short_path[0:2] != ".." else "/".join(src.short_path.split("/")[2:])

        if short_path.endswith(".ts") and not short_path.endswith(".d.ts"):
            basename = short_path[len(package_prefix):-len(".ts")]
            js_files += [ctx.actions.declare_file(basename + ".js")]
            declaration_files += [ctx.actions.declare_file(basename + ".d.ts")]
        else:
            continue

    return struct(
        js = js_files,
        dts = declaration_files,
    )

def _inputs(ctx, package_json):
    # Also include files from npm fine grained deps as inputs.
    # These deps are identified by the NpmPackageInfo provider.
    inputs_depsets = []
    inputs_srcs = [package_json]
    for d in ctx.attr.deps:
        if NpmPackageInfo in d:
            inputs_depsets.append(d[NpmPackageInfo].sources)
    for src in ctx.files.srcs:
        dst = ctx.actions.declare_file(src.basename, sibling = src)
        copy_bash(ctx, src, dst)
        inputs_srcs.append(dst)
    return depset(inputs_srcs, transitive = inputs_depsets).to_list()

def _jsii_library_impl(ctx):
    outs = _expected_outs(ctx)
    declarations = outs.dts
    es6_sources = outs.js

    args = ctx.actions.args()
    args.add(ctx.bin_dir.path + "/" + ctx.label.package)  # TODO: Windows
    package_json = ctx.file.package_json
    inputs = _inputs(ctx, ctx.file.package_json)
    jsii = ctx.actions.declare_file(".jsii")

    run_node(
        ctx,
        executable = "_compiler",
        inputs = inputs,
        outputs = outs.js + outs.dts + [ctx.actions.declare_file("tsconfig.json"), jsii],
        arguments = [args],
        configuration_env_vars = ctx.attr.configuration_env_vars,
    )

    return struct(
        providers = [
            DefaultInfo(files = depset(declarations + es6_sources + [package_json, jsii])),
            DeclarationInfo(
                declarations = depset(declarations),
                transitive_declarations = depset(declarations),
                type_blacklisted_declarations = depset([]),
            ),
            JSNamedModuleInfo(
                direct_sources = depset(),
                sources = depset(),
            ),
            JSEcmaScriptModuleInfo(
                direct_sources = depset(es6_sources),
                sources = depset(es6_sources),
            ),
        ],
        typescript = struct(
            declarations = depset(declarations),
            transitive_declarations = depset(declarations),
            type_blacklisted_declarations = depset(),
            es5_sources = depset(),
            es6_sources = depset(es6_sources),
            transitive_es5_sources = depset(),
            transitive_es6_sources = depset(es6_sources),
        ),
    )

local_deps_aspects = [node_modules_aspect]

# Workaround skydoc bug which assumes DEPS_ASPECTS is a str type
[local_deps_aspects.append(a) for a in DEPS_ASPECTS]

JSII_LIBRARY_RULE_ATTRS = {
    "srcs": attr.label_list(allow_files = [".ts"]),
    "configuration_env_vars": attr.string_list(default = []),
    "module_name": attr.string(
        doc = "The name of the package for module resolution",
    ),
    "module_root": attr.string(
        doc = "Where the module root lives in the package",
        default = "lib/index.js",
    ),
    "package_json": attr.label(
        doc = "The package.json file that is used by JSII",
        allow_single_file = True,
    ),
    # Note: DEPS_ASPECTS is already a list, we add the cast to workaround
    # https://github.com/bazelbuild/skydoc/issues/21
    "deps": attr.label_list(
        doc = "Targets that are imported by this target",
        aspects = local_deps_aspects,
    ),
    "_compiler": attr.label(
        doc = "Sets a different jsii compiler binary to use for this library.",
        default = Label(DEFAULT_JSII_COMPILER),
        executable = True,
        cfg = "host",
    ),
}

jsii_library = rule(
    implementation = _jsii_library_impl,
    attrs = JSII_LIBRARY_RULE_ATTRS,
    outputs = {"jsii": ".jsii"},
)
