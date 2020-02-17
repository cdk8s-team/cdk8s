load("@build_bazel_rules_nodejs//:providers.bzl", "DeclarationInfo", "JSNamedModuleInfo", "NodeContextInfo")

_DOC = """The copy_with_replace rule creates a directory containing a copy of a set of files with substitutions.

Example:

```python
load("//tools:defaults.bzl", "copy_with_replace")
copy_with_replace(
    name = "my_package",
    srcs = ["package.json"],
    deps = [":my_typescript_lib"],
    substitutions = {"//internal/": "//"},
)
```

You can use a pair of `// BEGIN-INTERNAL ... // END-INTERNAL` comments to mark regions of files that should be elided during publishing.
For example:

```javascript
function doThing() {
    // BEGIN-INTERNAL
    // This is a secret internal-only comment
    doInternalOnlyThing();
    // END-INTERNAL
}
```

Usage:

`copy_with_replace` yields one default label. Build the output directory:

```sh
$ bazel build :my_copy
Target //:my_copy up-to-date:
  bazel-out/fastbuild/bin/my_copy
$ ls -R bazel-out/fastbuild/bin/my_copy
```
"""

COPY_ATTRS = {
    "srcs": attr.label_list(
        doc = """Files inside this directory which are simply copied into the package.""",
        allow_files = True,
    ),
    "hide_build_files": attr.bool(
        doc = """If set BUILD and BUILD.bazel files are prefixed with `_` in the npm package.
        The default is True since npm packages that contain BUILD files don't work with
        `yarn_install` and `npm_install` without a post-install step that deletes or renames them.
        NB: Bazel has a change in https://github.com/bazelbuild/bazel/pull/10261
        (expected in version 2.1) that adds .bazelignore
        support for external repositories, which will make this attribute obsolete.""",
        default = True,
    ),
    "nested_packages": attr.label_list(
        doc = """Other pkg_npm rules whose content is copied into this package.""",
        allow_files = True,
    ),
    "node_context_data": attr.label(
        default = "@build_bazel_rules_nodejs//internal:node_context_data",
        providers = [NodeContextInfo],
        doc = "Internal use only",
    ),
    "substitutions": attr.string_dict(
        doc = """Key-value pairs which are replaced in all the files while building the package.""",
    ),
    "vendor_external": attr.string_list(
        doc = """External workspaces whose contents should be vendored into this workspace.
        Avoids 'external/foo' path segments in the resulting package.""",
    ),
    "deps": attr.label_list(
        doc = """Other targets which produce files that should be included in the package, such as `rollup_bundle`""",
        allow_files = True,
    ),
    "_copier": attr.label(
        default = Label("//tools:copier"),
        cfg = "host",
        executable = True,
    ),
}

# Takes a depset of files and returns a corresponding list of file paths without any files
# that aren't part of the specified package path. Also include files from external repositories
# that explicitly specified in the vendor_external list.
def _filter_out_external_files(ctx, files, package_path):
    result = []
    for file in files:
        if file.short_path.startswith(package_path):
            result.append(file.path)
        else:
            for v in ctx.attr.vendor_external:
                if file.short_path.startswith("../%s/" % v):
                    result.append(file.path)
    return result

def copy(ctx, deps_sources, nested_packages):
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
    # packagesArg
    args.add_joined([p.path for p in nested_packages], join_with = ",", omit_if_empty = False)
    # substitutionsArg
    args.add(ctx.attr.substitutions)
    # vendorExternalArg
    args.add_joined(ctx.attr.vendor_external, join_with = ",", omit_if_empty = False)
    # hideBuildFilesArg
    args.add("1" if ctx.attr.hide_build_files else "0")

    inputs = ctx.files.srcs + deps_sources + nested_packages

    ctx.actions.run(
        progress_message = "Copy with replace: %s" % package_dir.short_path,
        mnemonic = "CopyWithReplace",
        executable = ctx.executable._copier,
        inputs = inputs,
        outputs = [package_dir],
        arguments = [args],
    )
    return package_dir

def _copy_with_replace(ctx):
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

    sources = depset(transitive = sources_depsets)

    # Note: to_list() should be called once per rule!
    package_dir = copy(ctx, sources.to_list(), ctx.files.nested_packages)

    return [DefaultInfo(
        files = depset([package_dir]),
        runfiles = ctx.runfiles([package_dir]),
    )]

copy_with_replace = rule(
    implementation = _copy_with_replace,
    attrs = COPY_ATTRS,
    doc = _DOC,
)
