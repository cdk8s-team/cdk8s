"""Bazel rule for running JSII interpolation"""

load(
    "//tools:external.bzl",
    "DEFAULT_JSII_PAC_COMPILER",
    "DEPS_ASPECTS",
    "NpmPackageInfo",
    "NodeContextInfo",
    "JSNamedModuleInfo",
    "DeclarationInfo",
    "node_modules_aspect",
    "run_node",
)

JSII_PACKAGE_OUTPUTS = {
   "release": "%{name}.release"
}

# Takes a depset of files and returns a corresponding list of file paths without any files
# that aren't part of the specified package path. Also include files from external repositories
# that explicitly specified in the vendor_external list.
def _filter_out_external_files(ctx, files, package_path):
    result = []
    for file in files:
        if file.short_path.startswith(package_path) and not file.short_path.startswith("../"):
            result.append(file.path)
    return result

def create_package(ctx, deps_sources, outdir):
    stamp = ctx.attr.node_context_data[NodeContextInfo].stamp
    package_dir = ctx.actions.declare_directory(ctx.label.name)
    package_path = ctx.label.package

    # List of dependency sources which are local to the package that defines the current
    # target. Also include files from external repositories that explicitly specified in
    # the vendor_external list. We only want to package deps files which are inside of the
    # current package unless explicitly specified.
    filtered_deps_sources = _filter_out_external_files(ctx, deps_sources, package_path)

    args = ctx.actions.args()
    args.use_param_file("%s", use_always = True)
    # outDir
    args.add(package_dir.path)
    # baseDir
    args.add(package_path)
    # srcsArg
    args.add_joined([s.path for s in ctx.files.srcs], join_with = ",", omit_if_empty = False)
    # binDir
    args.add(ctx.bin_dir.path)
    # genDir
    args.add(ctx.genfiles_dir.path)
    # depsArg
    args.add_joined(filtered_deps_sources, join_with = ",", omit_if_empty = False)
    # substitutionsArg
    args.add(ctx.attr.substitutions)
    # releasePath
    args.add(ctx.outputs.release.path)
    # replaceWithVersion
    args.add(ctx.attr.replace_with_version)
    # stampFile
    args.add(ctx.version_file.path if stamp else "")
    # distDir
    args.add(outdir.path)

    inputs = ctx.files.srcs + deps_sources + [ctx.file.package_json]

    # The version_file is an undocumented attribute of the ctx that lets us read the volatile-status.txt file
    # produced by the --workspace_status_command. That command will be executed whenever
    # this action runs, so we get the latest version info on each execution.
    # See https://github.com/bazelbuild/bazel/issues/1054
    if stamp:
        inputs.append(ctx.version_file)

    ctx.actions.run(
        progress_message = "Assembling npm package %s" % package_dir.short_path,
        mnemonic = "AssembleNpmPackage",
        executable = ctx.executable._packager,
        inputs = inputs,
        outputs = [package_dir, ctx.outputs.release],
        arguments = [args],
    )
    return package_dir

def run_jsii(ctx, package_dir, outdir, deps_sources):
    args = ctx.actions.args()
    args.add(package_dir.path)
    args.add("-o", outdir.path)
    args.add("--v=1000")

    for target in ctx.attr.targets:
        args.add("-t=%s" % target)

    env = {
        "CHARSET": "UTF-8",
        "LC_ALL": "C.UTF-8",
    }

    if not ctx.attr.targets or "java" in ctx.attr.targets:
        env.update({
            "MAVEN_OPTS": "-Xms256m -Xmx512m -Dmaven.repo.local=%s" % ctx.bin_dir.path,
        })

    if not ctx.attr.targets or "dotnet" in ctx.attr.targets:
        env.update({
            "HOME": "/tmp",
            "DOTNET_CLI_TELEMETRY_OPTOUT": "1",
            "DOTNET_RUNNING_IN_CONTAINER": "1",
            "DOTNET_USE_POLLING_FILE_WATCHER": "1",
            "NUGET_XMLDOC_MODE": "skip",
        })

    if not ctx.attr.targets or "ruby" in ctx.attr.targets:
        env.update({
            "BUNDLE_SILENCE_ROOT_WARNING": "1",
        })

    run_node(
        ctx,
        executable = "_compiler",
        inputs = depset([package_dir], transitive = deps_sources).to_list(),
        outputs = [outdir],
        arguments = [args],
        configuration_env_vars = ctx.attr.configuration_env_vars,
        env = env,
    )

def _jsii_package_impl(ctx):

    sources_depsets = []

    for dep in ctx.attr.deps:
        # Collect whatever is in the "data"
        sources_depsets.append(dep.data_runfiles.files)

        # Only collect DefaultInfo files (not transitive)
        sources_depsets.append(dep.files)

        # All direct & transitive JavaScript-producing deps
        # TODO: switch to JSModuleInfo when it is available
        if JSNamedModuleInfo in dep:
            sources_depsets.append(dep[JSNamedModuleInfo].sources)

        # Include all transitive declarations
        if DeclarationInfo in dep:
            sources_depsets.append(dep[DeclarationInfo].transitive_declarations)

        if NpmPackageInfo in dep:
            sources_depsets.append(dep[NpmPackageInfo].sources)

    sources = depset(transitive = sources_depsets)

    outdir = ctx.outputs.out_dir
    package_dir = create_package(ctx, sources.to_list(), outdir)
    run_jsii(ctx, package_dir, outdir, sources_depsets)

    return [DefaultInfo(
        files = depset([outdir]),
        runfiles = ctx.runfiles([outdir]),
    )]

local_deps_aspects = [node_modules_aspect]

# Workaround skydoc bug which assumes DEPS_ASPECTS is a str type
[local_deps_aspects.append(a) for a in DEPS_ASPECTS]

JSII_PACKAGE_RULE_ATTRS = {
    "srcs": attr.label_list(
        doc = "Files that are used by this target",
        allow_files = True,
    ),
    "configuration_env_vars": attr.string_list(default = []),
    "libs": attr.label_list(
        doc = "The jsii_library targets that this rule will package",
    ),
    "package_json": attr.label(
        doc = "The package.json file that is used by JSII",
        allow_single_file = True,
    ),
    "targets": attr.string_list(
        doc = "The targets to package with jsii",
        default = [],
    ),
    "replace_with_version": attr.string(
        doc = """If set this value is replaced with the version stamp data.
        See the section on stamping in the README.""",
        default = "0.0.0-PLACEHOLDER",
    ),
    "substitutions": attr.string_dict(
        doc = """Key-value pairs which are replaced in all the files while building the package.""",
    ),
    "out_dir": attr.output(
        doc = "Where the output should be placed by the packager",
    ),
    # Note: DEPS_ASPECTS is already a list, we add the cast to workaround
    # https://github.com/bazelbuild/skydoc/issues/21
    "deps": attr.label_list(
        doc = "Targets that are imported by this target",
        aspects = local_deps_aspects,
        default = [],
    ),
    "node_context_data": attr.label(
        default = "@build_bazel_rules_nodejs//internal:node_context_data",
        providers = [NodeContextInfo],
        doc = "Internal use only",
    ),
    "_compiler": attr.label(
        doc = "Sets a different jsii packager binary to use for this library.",
        default = Label(DEFAULT_JSII_PAC_COMPILER),
        executable = True,
        cfg = "host",
    ),
    "_packager": attr.label(
        default = Label("//tools:packager"),
        cfg = "host",
        executable = True,
    )
}

jsii_package = rule(
    implementation = _jsii_package_impl,
    attrs = JSII_PACKAGE_RULE_ATTRS,
    outputs = JSII_PACKAGE_OUTPUTS,
)
