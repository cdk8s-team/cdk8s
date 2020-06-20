# cdk8s+ (cdk8s-plus)

**cdk8s+** is a software development framework that provides high level abstractions for authoring kuberenetes applications.
Built on top of the auto generated building blocks provided by [cdk8s](../cdk8s), this library includes a hand crafted *construct*
for each native kubernetes object, exposing richer API's with reduced complexity.

> **You should not use this library in production environments.**<br><br>
> ![Experimental](https://img.shields.io/badge/experimental-important.svg?style=for-the-badge)<br><br>
> This library is in very early stages of development, as such, and in correspondence with a `0.x` semantic major version line, its `API` is
likely to rapidly change in breaking ways. We therefore highly discourage from using this library in production workloads.

## Letter Of Intent

We strive to develop this library with full transparency and as much community feedback and contributions as possible.
To that end, we publish this development version. We acknowledge it might be lacking substantial capabilities, and is currently focused
around experimentation and gathering feedback.

> If you are interested in contributing, see [Contribution Guide](./CONTRIBUTING.md).

## At a glance

## In Depth

Following are excerpts for the usage of every *construct* provided by this library. It details the commonly used patterns and configuration properties.
In general, every such construct can be configured using two mechanisms:

- Spec Constructor Properties
- Post Instantiation Spec Mutations

The documentation presented here focuses on post instantiation mutations, however, every such mutation can also be pre-configured
using constructor properties for the corresponding spec. A complete API reference can be found in [here](./API.md).

### `Container`

Define containers that run in a pod using the `Container` class.

> API Reference: [Container](./API.md#cdk8s-plus-container)

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

### Volume

Volume represents a named volume in a pod that may be accessed by any container in the pod.

> API Reference: [Volume](./API.md#cdk8s-plus-volume)

#### Create from a ConfigMap

A very useful operation is to create a volume from a `ConfigMap`. Kubernetes will translate every key in the config map to a file,
who's content is the value of the key.

```typescript
import * as kplus from 'cdk8s-plus';

const configMap = kplus.ConfigMap.fromConfigMapName('redis-config');
const configVolume = kplus.Volume.fromConfigMap(configMap);
```

#### Create from an EmptyDir

The easiest way to allocate some persistent storage to your container is to create a volume from an empty directory.
This volume, as the name suggests, is initially empty, and can be written to by containers who mount it.
The data in the volume is preserved throughout the lifecycle of the pod, but is deleted forever as soon as the pod itself is removed.

```typescript
import * as kplus from 'cdk8s-plus';

const data = kplus.Volume.fromEmptyDir(configMap);

const redis = new kplus.Container({
  image: 'redis'
})

// mount to the redis container.
redis.mount('/var/lib/redis', data);
```

### Job

Jobs are a very useful concept in kubernetes deployments.
They can be used for add-hoc provisioning tasks, as well as long running processing jobs.

> API Reference: [Job](./API.md#cdk8s-plus-job)

In configuration, they don't differ much from regular pods, but offer some additional properties.

#### Delete a Job after its finished

You can configure a TTL for the job after it finished its execution successfully.

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus';

// lets first create our pod template. this part if the same as configuring a pod.
const podTemplateSpec = new kplus.PodTemplateSpec();
podTemplateSpec.podSpec.addContainer(new kplus.Container({
  image: 'loader'
}))

// now we use the pod template to define a job spec, and set a 1 second TTL.
const jobSpec = new kplus.JobSpec({
  template: podTemplateSpec,
  ttlAfterFinished: kplus.Duration.seconds(1),
})

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

// now we create the job
const load = new kplus.Job(chart, 'LoadData', { spec: jobSpec });
```

### Service

Use services when you want to expose a set of pods using a stable network identity. They can also be used for externalizing
endpoints to clients outside of the kubernetes cluster.

> API Reference: [Service](./API.md#cdk8s-plus-service)

#### Selectors

Services must be configured with selectors that tell it which pods should it serve.
The most common selector method is using labels.

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');
const frontends = new kplus.Service(chart, 'FrontEnds');

// this will cause the service to select all pods with the 'run: frontend' label.
frontends.spec.selectByLabel('run', 'frontend')
```

#### Ports

Ports that the service will listen and redirect to can be configured like so:

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');
const frontends = new kplus.Service(chart, 'FrontEnds');

// make the service bind to port 9000 and redirect to port 80 on the associated containers.
frontends.spec.serve({port: 9000, targetPort: 80)
```

### Deployment

Create a deployment to govern the lifecycle and orchestration of a set of identical pods.

> API Reference: [Deployment](./API.md#cdk8s-plus-deployment)

#### Automatic pod selection

When you specify pods in a deployment, you normally have to configure the appropriate labels and selectors to
make the deployment control the relevant pods. This construct does this automatically.

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const podSpec = new kplus.PodSpec({
  containers: [new kplus.Container({
    image: 'node',
  })],
})
new kplus.Deployment(chart, 'FrontEnds', {
  spec: new kplus.DeploymentSpec({
    template: new kplus.PodTemplateSpec({
      podSpec: podSpec,
    }),
  }),
});
```

Note the resulting manifest contains a special `cdk8s.deployment` label that is applied to the pods, and is used as
the selector for the deployment.

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  annotations: {}
  labels: {}
  name: chart-frontends-pod-a48e7f2e
spec:
  replicas: 1
  selector:
    matchLabels:
      cdk8s.deployment: ChartFrontEndsDD8A97CE
  template:
    metadata:
      annotations: {}
      labels:
        cdk8s.deployment: ChartFrontEndsDD8A97CE
```

#### Exposing via a service

Following up on pod selection, you can also easily create a service that will select the pods relevant to the deployment.

```typescript

// store the deployment to created in a constant
const frontends = new kplus.Deployment(chart, 'FrontEnds', {
  spec: new kplus.DeploymentSpec({
    template: new kplus.PodTemplateSpec({
      podSpec: podSpec,
    }),
  }),
});

// create a ClusterIP service that listens on port 9000 and redirects to port 9000 on the containers.
frontends.expose({port: 9000})
```

Notice the resulting manifest, will have the same `cdk8s.deployment` magic label as the selector.
This will cause the service to attach to the pods that were configured as part of the said deployment.

```yaml
apiVersion: v1
kind: Service
metadata:
  annotations: {}
  labels: {}
  name: chart-frontends-service-pod-1f70150b
spec:
  externalIPs: []
  ports:
    - port: 9000
  selector:
    cdk8s.deployment: ChartFrontEndsDD8A97CE
  type: ClusterIP
```

### ConfigMap

ConfigMap are used to store configuration data. They provide a dictionary based data structure that can be consumed in
various shapes and forms.

> API Reference: [ConfigMap](./API.md#cdk8s-plus-configmap)

#### Use an existing `ConfigMap`

You can reference to an existing `ConfigMap` like so. Note that this does not create a new object,
and will therefore not be included in the resulting manifest.

```typescript
import * as kplus from 'cdk8s-plus';

const config: kplus.IConfigMap = kplus.ConfigMap.fromConfigMapName('config');

// the 'config' constant can later be used by API's that require an IConfigMap.
// for example when creating a volume.
const volume = kplus.Volume.fromConfigMap(config);
```

#### Adding data

You can create config maps and add some data to them like so:

```typescript
import * as kplus from 'cdk8s-plus';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const config = new new kplus.ConfigMap(chart, 'Config');
config.addData('url', 'https://my-endpoint:8080');
```

#### Creating a volume from a directory

Here is a nifty little trick you can use to create a volume that contains a directory on the client machine (machine that runs `cdk8s synth`):

```typescript
import * as kplus from 'cdk8s-plus';
import * as path from 'path';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const app = new new kplus.ConfigMap(chart, 'Config');

// add the files in the directory to the config map.
// this will create a key for each file.
// note that only top level files will be included, sub-directories are not yet supported.
app.addDirectory(path.join(__dirname, 'app'));

const appVolume = kplus.Volume.fromConfigMap(app);

// for here, just mount the volume to a container, and run your app!
const mountPath = '/var/app';
const container = new kplus.Container({
  image: 'node',
  command: [ 'node', 'app.js' ],
  workingDir: mountPath,
})

container.mount(mountPath, appVolume);
```


### PodTemplate

### Pod

### Secret

#### Use an existing `Secret`

#### Adding data

### ServiceAccount

#### Use an existing `ServiceAccount`

#### Allowing access to secrets