# Pod

A pod is essentially a collection of containers. It is the most fundamental computation unit that can be provisioned.

> API Reference: [Pod](./API.md#cdk8s-plus-pod)

## Adding Containers/Volumes

Containers and volumes can be added to pod definition like so:

```typescript
import * as kplus from 'cdk8s-plus';

const container = new kplus.Container({
  image: 'node',
})

const storage = kplus.Volume.fromEmptyDir('storage');

container.mount('/data', storage);

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const pod = new new kplus.Pod(chart, 'Pod');

// this will automatically add the volume as well.
pod.addContainer(container);

// but if you want to explicitly add it, simply use:
pod.addVolume(storage);

```

## Applying a restart policy

```typescript
import * as kplus from 'cdk8s-plus';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const pod = new new kplus.Pod(chart, 'Pod', {
  restartPolicy: kplus.RestartPolicy.NEVER,
});
```

## Assigning a ServiceAccount

```typescript
import * as kplus from 'cdk8s-plus';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const pod = new new kplus.Pod(chart, 'Pod', {
  serviceAccount: kplus.ServiceAccount.fromServiceAccountName('aws'),
});
```