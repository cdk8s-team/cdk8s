# Container

Define containers that run in a pod using the `Container` class.

!!! tip ""
    [API Reference](../reference/cdk8s-plus.API.md#cdk8s-plus-container)

## Environment variables

Environment variables can be added to containers using various sources, via semantically explicit API's:

```typescript
import * as kplus from 'cdk8s-plus'

const container = new kplus.Container({
  image: 'my-app'
})

// explicitly use a value.
container.addEnv('endpoint', kplus.EnvValue.fromValue('value'));

// use a specific key from a config map.
const backendsConfig = kplus.ConfigMap.fromConfigMapName('backends');
container.addEnv('endpoint', kplus.EnvValue.fromConfigMap(backendsConfig, 'endpoint'));

// use a specific key from a secret.
const credentials = kplus.Secret.fromSecretName('credentials');
container.addEnv('password', kplus.EnvValue.fromSecret(credentials, 'password'));
```

## Volume Mounts

A very common capability is to mount a volume with some data onto a container. Using pure kubernetes API, this would require writing something like:

```yaml
kind: Pod
apiVersion: v1
spec:
  containers:
    - name: main
      volumeMounts:
        - mountPath: /path/to/mount
          name: 'config-volume'
  volumes:
    - name: 'config-volume'
      configMap:
        name: 'config'
```

Notice the apparent redundancy of having to specify the volume name twice. Also, if you happen to need the same mount in other pods,
you would need to duplicate this configuration. This can get complex and cluttered very fast.

In contrast, here is how to do this with `cdk8s+`:

```typescript
import * as kplus from 'cdk8s-plus';

const config = kplus.ConfigMap.fromConfigMapName('config');
const volume = kplus.Volume.fromConfigMap(config);

const container = new kplus.Container({
  image: 'my-app'
})

// Cool alert: every pod that will later be configured with this container,
// will automatically have access to this volume, so you don't need to explicitly add it to the pod spec!.
container.mount('/path/to/mount', volume);
```

## Probes

A [Probe] is a diagnostic performed periodically by the kubelet on a Container. To
perform a diagnostic, the kubelet calls a Handler implemented by the container.

[Probe]: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.19/#probe-v1-core

A `Probe` instance can be created through one of the `fromXxx` static methods:

- `Probe.fromHttpGet()`
- `Probe.fromCommand()`

Readiness, liveness, and startup probes can be configured at the container-level through the `readiness`, `liveness`, and `startup` options:

```ts
new kplus.Container({
  // ...
  readiness: kplus.Probe.fromHttpGet('/ping')
});
```

See the API reference for details.
