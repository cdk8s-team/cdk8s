# synth

The `cdk8s synth` command is a convenience command which  will simply execute
the application defined in `cdk8s.yaml` under `app`.

For example, if your `cdk8s.yaml` file looks like this:

```yaml
app: node app.js
```

Then, `cdk8s synth` will execute `node app.js`.
