# synth

The `cdk8s synth` command is a convenience command which will simply execute
the application defined in `cdk8s.yaml` under `app`.

For example, if your `cdk8s.yaml` file looks like this:

```yaml
app: node app.js
```

Then, `cdk8s synth` will execute `node app.js`.

## Configuring synth output

The properties of the synthesized YAML from `cdk8s synth` can be modified by the properties of the `App` construct. Things like file extensions, how API objects are distributed between files, and the output directory can all be configured in your [`AppProps`](https://github.com/cdk8s-team/cdk8s-core/blob/2.x/docs/typescript.md#appprops-)

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
