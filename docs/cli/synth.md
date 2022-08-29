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
  - package: datree-cdk8s-plugin
    class: DatreeValidation
    version: 0.0.1
```

With this configuration, `cdk8s` will dynamically install the `datree-cdk8s-plugin` package from NPM during
synthesis, and produce a violation report. For example:

```console
╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗
║                                failure | Validation Report | datree-cdk8s-plugin (v0.0.1)                                                   ║
╟───────────────────────────┬───────────────────────────────────────────────────────────────┬──────────────────────────────┬──────────────────╢
║ Resource                  │ Message                                                       │ Manifest                     │ Construct        ║
╟───────────────────────────┼───────────────────────────────────────────────────────────────┼──────────────────────────────┼──────────────────╢
║ chart-deployment-c8a3b439 │ Deployments should set the restartPolicy to 'Always'          │ dist/chart-c86185a7.k8s.yaml │ Chart/Deployment ║
╚═══════════════════════════╧═══════════════════════════════════════════════════════════════╧══════════════════════════════╧══════════════════╝
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
  - package: datree-cdk8s-plugin
    class: DatreeValidation
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

- [DaTree](https://github.com/datreeio/datree-cdk8s-plugin)

### Writing Plugins

See [cdk8s-validation-plugin-example](https://github.com/cdk8s-team/cdk8s-validation-plugin-example)

