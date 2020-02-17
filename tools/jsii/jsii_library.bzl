# Copyright Amazon.com Inc. All Rights Reserved.
"""Run JSII compiler
"""

load(
    ":jsii/external.bzl",
    "COMMON_ATTRIBUTES",
    "COMMON_OUTPUTS",
    "DEFAULT_JSII_COMPILER",
    "DEPS_ASPECTS",
    "NpmPackageInfo",
    "compile_ts",
    "js_ecma_script_module_info",
    "js_named_module_info",
    "node_modules_aspect",
    "ts_providers_dict_to_struct",
    "tsc_wrapped_tsconfig",
    "run_node",
)

# Calculate the expected output of the template compiler for every source in
# in the library. Most of these will be produced as empty files but it is
# unknown, without parsing, which will be empty.
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
        devmode_js = js_files,
        declarations = declaration_files,
        closure_js = []
    )

# Extra options passed to Node when running jsii.
_EXTRA_NODE_OPTIONS_FLAGS = [
    # Expose the v8 garbage collection API to JS.
    "--node_options=--expose-gc",
    # Show ~full stack traces, instead of cutting off after 10 items.
    "--node_options=--stack-trace-limit=100",
    # Give 4 GB RAM to node to allow bigger modules to compile.
    "--node_options=--max-old-space-size=4096",
]

def _filter_ts_inputs(all_inputs):
    # The compiler only needs to see TypeScript sources from the npm dependencies,
    # but may need to look at package.json files as well.
    return [
        f
        for f in all_inputs
        if f.path.endswith(".js") or f.path.endswith(".ts") or f.path.endswith(".json")
    ]

def _compile_action(
        ctx,
        inputs,
        outputs,
        tsconfig_file,
        node_opts,
        compile_mode):
    file_inputs = []

    # Also include files from npm fine grained deps as action_inputs.
    # These deps are identified by the NpmPackageInfo provider.
    for d in ctx.attr.deps:
        if NpmPackageInfo in d:
            # Note: we can't avoid calling .to_list() on sources
            file_inputs.extend(_filter_ts_inputs(d[NpmPackageInfo].sources.to_list()))

    # Collect the inputs from our deps
    action_inputs = depset(
        file_inputs,
        transitive = [],
    )

    mnemonic = "JsiiCompile"
    progress_message = "Compiling source (%s) %s" % (compile_mode, ctx.label)

    arguments = (list(_EXTRA_NODE_OPTIONS_FLAGS) +
                 ["--node_options=%s" % opt for opt in node_opts]) + ["--verbose=10000"]

    ctx.actions.run(
        progress_message = progress_message,
        mnemonic = mnemonic,
        inputs = action_inputs,
        outputs = outputs,
        arguments = arguments,
        executable = ctx.executable.compiler,
    )

    return struct(
        label = ctx.label,
        tsconfig = tsconfig_file,
        inputs = action_inputs,
        outputs = outputs,
        compiler = ctx.executable.compiler,
    )

def _prodmode_compile_action(ctx, inputs, outputs, tsconfig_file, node_opts):
    outs = _expected_outs(ctx)
    return _compile_action(ctx, inputs, outputs + outs.devmode_js, tsconfig_file, node_opts, "prodmode")

def _devmode_compile_action(ctx, inputs, outputs, tsconfig_file, node_opts):
    outs = _expected_outs(ctx)
    compile_action_outputs = outputs + outs.devmode_js + outs.declarations
    _compile_action(ctx, inputs, compile_action_outputs, tsconfig_file, node_opts, "devmode")

def _ts_expected_outs(ctx, label, srcs_files = []):
    # rules_typescript expects a function with two or more arguments, but our
    # implementation doesn't use the label(and **kwargs).
    _ignored = [label, srcs_files]
    return _expected_outs(ctx)

def _jsii_library_impl(ctx):
    ts_providers = compile_ts(
       ctx,
       is_library = True,
       compile_action = _prodmode_compile_action,
       devmode_compile_action = _devmode_compile_action,
       tsc_wrapped_tsconfig = tsc_wrapped_tsconfig,
       outputs = _ts_expected_outs,
   )

    # Add in new JS providers
    # See design doc https://docs.google.com/document/d/1ggkY5RqUkVL4aQLYm7esRW978LgX3GUCnQirrk5E1C0/edit#
    # and issue https://github.com/bazelbuild/rules_nodejs/issues/57 for more details.
    ts_providers["providers"].extend([
        js_named_module_info(
            sources = ts_providers["typescript"]["es5_sources"],
            deps = ctx.attr.deps,
        ),
        js_ecma_script_module_info(
            sources = ts_providers["typescript"]["es6_sources"],
            deps = ctx.attr.deps,
        ),
        # TODO: Add remaining shared JS providers from design doc
        # (JSModuleInfo) and remove legacy "typescript" provider
        # once it is no longer needed.
    ])

    return ts_providers_dict_to_struct(ts_providers)

local_deps_aspects = [node_modules_aspect]

# Workaround skydoc bug which assumes DEPS_ASPECTS is a str type
[local_deps_aspects.append(a) for a in DEPS_ASPECTS]

JSII_MODULE_ATTRIBUTES = {
    "srcs": attr.label_list(allow_files = [".ts"]),

    # Note: DEPS_ASPECTS is already a list, we add the cast to workaround
    # https://github.com/bazelbuild/skydoc/issues/21
    "deps": attr.label_list(
        doc = "Targets that are imported by this target",
        aspects = local_deps_aspects,
    ),
    "package_json": attr.label(
        doc = "The package.json file that is used by JSII",
    ),
    "compiler": attr.label(
        doc = """Sets a different jsii compiler binary to use for this library.

        The default jsii compiler depends on the `@npm//@jsii/bazel`
        target which is setup for projects that use bazel managed npm deps that
        fetch the @jsii/bazel npm package. It is recommended that you use
        the workspace name `@npm` for bazel managed deps so the default
        compiler works out of the box. Otherwise, you'll have to override
        the compiler attribute manually.
        """,
        default = Label(DEFAULT_JSII_COMPILER),
        executable = True,
        cfg = "host",
    ),
    "tsconfig": attr.label(allow_single_file = True),
    "node_modules": attr.label(
        doc = """The npm packages which should be available during the compile.
        The default value of `@npm//typescript:typescript__typings` is
        for projects that use bazel managed npm deps. It is recommended
        that you use the workspace name `@npm` for bazel managed deps so the
        default value works out of the box. Otherwise, you'll have to
        override the node_modules attribute manually. This default is in place
        since code compiled by ng_module will always depend on at least the
        typescript default libs which are provided by
        `@npm//typescript:typescript__typings`.
        This attribute is DEPRECATED. As of version 0.18.0 the recommended
        approach to npm dependencies is to use fine grained npm dependencies
        which are setup with the `yarn_install` or `npm_install` rules.
        For example, in targets that used a `//:node_modules` filegroup,
        ```
        ng_module(
          name = "my_lib",
          ...
          node_modules = "//:node_modules",
        )
        ```
        which specifies all files within the `//:node_modules` filegroup
        to be inputs to the `my_lib`. Using fine grained npm dependencies,
        `my_lib` is defined with only the npm dependencies that are
        needed:
        ```
        ng_module(
          name = "my_lib",
          ...
          deps = [
              "@npm//@types/foo",
              "@npm//@types/bar",
              "@npm//foo",
              "@npm//bar",
              ...
          ],
        )
        ```
        In this case, only the listed npm packages and their
        transitive deps are includes as inputs to the `my_lib` target
        which reduces the time required to setup the runfiles for this
        target (see https://github.com/bazelbuild/bazel/issues/5153).
        The default typescript libs are also available via the node_modules
        default in this case.
        The @npm external repository and the fine grained npm package
        targets are setup using the `yarn_install` or `npm_install` rule
        in your WORKSPACE file:
        yarn_install(
          name = "npm",
          package_json = "//:package.json",
          yarn_lock = "//:yarn.lock",
        )
        """,
        default = Label("@npm//typescript:typescript__typings"),
    ),
}

JSII_LIBRARY_RULE_ATTRS = dict(COMMON_ATTRIBUTES, **JSII_MODULE_ATTRIBUTES)

jsii_library = rule(
    implementation = _jsii_library_impl,
    attrs = JSII_LIBRARY_RULE_ATTRS,
    outputs = COMMON_OUTPUTS,
)
"""
Run the JSII compiler.

This rule extends the [ts_library] rule.

[ts_library]: http://tsetse.info/api/build_defs.html#ts_library
"""
