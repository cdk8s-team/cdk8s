# cdk8s+ (cdk8s-plus)

> High level abstractions on top [cdk8s](../cdk8s).

**cdk8s+** is a software development framework that provides high level abstractions for authoring kuberenetes applications.

Built on top of the auto generated building blocks provided by [cdk8s](../cdk8s), this library includes a hand crafted *construct* for each native kubernetes object, exposing richer API's with reduced complexity.

---

![Experimental](https://img.shields.io/badge/experimental-important.svg?style=for-the-badge)

**You should not use this library in production environments.**

> This library is in very early stages of development, as such, and in correspondence with a `0.x` semantic major version line, its `API` is likely to rapidly change in breaking ways.

---

## At a glance

## Documentation

### `Container`

Define containers that run in a pod using the `Container` class.

Notable features:

#### Environment variables

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

#### Volume Mounts

A very common capability is to mount a volume with some data onto a container. The `Container` class provides an API to do just that:

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

> Full API reference: [Container](./API.md#cdk8s-plus-container)<br>

### Volume

### Job

### ObjectMeta

### Service

### Deployment

### ConfigMap

### Pod

### PodTemplate

### ServiceAccount