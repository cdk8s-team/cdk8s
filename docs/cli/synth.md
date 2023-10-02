# synth

The `cdk8s synth` command is a convenience command which will simply execute
the application defined in `cdk8s.yaml` under `app`.

For example, if your `cdk8s.yaml` file looks like this:

```yaml
app: node app.js
```

Then, `cdk8s synth` will execute `node app.js`.

## Configuring synth output

The properties of the synthesized YAML from `cdk8s synth` can be modified by the properties of the `App` construct.
Things like file extensions, how API objects are distributed between files, and the output directory can all
be configured in your [`AppProps`](https://github.com/cdk8s-team/cdk8s-core/blob/2.x/docs/typescript.md#appprops-)

For example:

```typescript
const app = new App({
  // Instead of the default "dist"
  outdir: "output",
  // Instead of ".k8s.yaml"
  outputFileExtension: ".generated.yaml",
  // Divide every resource into its own file, instead of grouping by Chart
  yamlOutputType: YamlOutputType.FILE_PER_RESOURCE,
});
```

## Validating Manifests

You can perform validation on the manifests produced by cdk8s by configuring third-party validation
plugins. To do so, use the `validations` property in the `cdk8s.yaml` configuration file:

```yaml
language: typescript
app: ts-node main.ts
validations:
  - package: '@datreeio/datree-cdk8s'
    class: DatreeValidation
    version: 1.3.4
```

With this configuration, `cdk8s` will dynamically install the `@datreeio/datree-cdk8s` package from NPM during
synthesis, and produce a violation report. For example:

```console
Validation Report (@datreeio/datree-cdk8s@1.3.4)
------------------------------------------------

(Summary)

╔═══════════╤════════════════════════╗
║ Status    │ failure                ║
╟───────────┼────────────────────────╢
║ Plugin    │ @datreeio/datree-cdk8s ║
╟───────────┼────────────────────────╢
║ Version   │ 1.3.4                  ║
╟───────────┼────────────────────────╢
║ Customize │ https://app.datree.io  ║
║ policy    │                        ║
╚═══════════╧════════════════════════╝


(Violations)

Ensure each container image has a pinned (tag) version (2 occurrences)

  Occurrences:

    - Construct Path: cdk8s-app/Web/Resource
    - Manifest Path: ./dist/cdk8s-app.k8s.yaml
    - Resource Name: cdk8s-app-web-c825557e
    - Locations:
      > spec/template/spec/containers/0/image (line: 31:18)

    - Construct Path: cdk8s-app/Cache/Resource
    - Manifest Path: ./dist/cdk8s-app.k8s.yaml
    - Resource Name: cdk8s-app-cache-c8fee821
    - Locations:
      > spec/template/spec/containers/0/image (line: 112:18)

  Recommendation: Incorrect value for key `image` - specify an image version to avoid unpleasant "version surprises" in the future
  How to fix: https://hub.datree.io/ensure-image-pinned-version

Validation failed. See above reports for details
```

If the report resulted in a failure, the `cdk8s synth` command will fail.
You can also put the contents of the `validation` property into a separate file (either remote or local),
and refer to it:

```yaml
language: typescript
app: ts-node main.ts
validations: http://path/to/validations.yaml
```

### Private Validation Plugins

To use a validation plugin that is hosted in a private NPM registry, use the `installEnv`
property to specify a custom registry:

```yaml
language: typescript
app: ts-node main.ts
validations:
  - package: my-private-plugin
    class: MyValidation
    version: 0.0.1
    installEnv:
      npm_config_registry: http://my/custom/registry
```

> All key value pairs in the `installEnv` property will be passed as is to the `npm` command that `cdk8s`
> executes when it installs your plugin.

### Pre-Installing Plugins

You can prevent `cdk8s` from contacting NPM during synthesis by providing it with the necessary plugins.
Plugins are stored in the `~/.cdk8s/plugins` directory, and `cdk8s` will first check if a plugin
is already installed before trying to install it.

If you pre-populate the plugins directory correctly, you can prevent `cdk8s` from contacting NPM.
This can be useful for air-gapped synthesis scenarios for example.

Here is how `cdk8s` expects the directory to be structured, assuming the plugin package is called `plugin1`, and its version is `0.0.1`

`~/.cdk8s/plugins/plugin1/0.0.1/node_modules/plugin1/package.json`

You can achieve this structure by running the following commands:

```console
mkdir -p ~/.cdk8s/plugins/plugin1/0.0.1/node_modules/plugin1
npm install --prefix ~/.cdk8s/plugins/plugin1/0.0.1/node_modules/plugin1 plugin1@0.0.1
```

You can also control the plugins storage directory by one of:

- `--plugins-dir` in the `cdk8s synth` command.
- `CDK8S_PLUGINS_DIR` environment variable.
- `pluginsDirectory` key in the `cdk8s.yaml` configuration file.

### Available Plugins

- [Datree](https://github.com/datreeio/datree-cdk8s)

### Writing Plugins

See [cdk8s-validation-plugin-example](https://github.com/cdk8s-team/cdk8s-validation-plugin-example)

## Helm Synthesis

You can synthesize your cdk8s application to a format that is compatible with [helm](https://helm.sh/). 

For example, you can run:

```
cdk8s synth --format helm --chart-version 1.0.0
```

Then it will synthesize a generated helm chart to the output folder (default is 'dist'). The `--chart-version` will be the [version](https://helm.sh/docs/topics/charts/#charts-and-versioning) of the helm chart and must follow [SemVer2](https://semver.org/spec/v2.0.0.html) standards. The synthesized manifests will be placed in `templates/` folder. And, if any crds were mentioned in `cdk8s.yaml` config file as `imports`, then they will be downloaded and placed in the `crds/` folder. 

The folder structure will look like:

```
dist/              
├── Chart.yaml
├── README.md
├── crds/
└── templates/
```

!!! note
  CRDs are not supported when `--chart-api-version` is set to `v1`. 

You can use the synthesized chart to deploy using helm:

```
cdk8s synth --format helm --chart-version 1.0.0 && helm install <release-name> ./dist
```

!!! note
  Templates within the generated Helm chart are pure and static Kubernetes manifests; they don't contain any helm template directives. This means they cannot be customized with a values.yaml file or the release name. One important implication of this is that you cannot deploy two different releases of the same chart, as resource names will collide. If you need customization, you can do this within the cdk8s application (for example by explicitly reading a values.yaml file).