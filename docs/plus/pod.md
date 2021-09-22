# Pod

A pod is essentially a collection of containers. It is the most fundamental computation unit that can be provisioned.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-22/typescript.md#pod)

## Adding Containers/Volumes

Containers and volumes can be added to pod definition like so:

```typescript
import * as kplus from 'cdk8s-plus-22';

const pod = new kplus.Pod(chart, 'Pod');

const container = pod.addContainer({
  image: 'node',
});

const storage = kplus.Volume.fromEmptyDir('storage');

container.mount('/data', storage);

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

// this will automatically add the volume as well.
pod.addContainer(container);

// but if you want to explicitly add it, simply use:
pod.addVolume(storage);

```

## Applying a restart policy

```typescript
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const pod = new kplus.Pod(chart, 'Pod', {
  restartPolicy: kplus.RestartPolicy.NEVER,
});
```

## Assigning a ServiceAccount

```typescript
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const pod = new kplus.Pod(chart, 'Pod', {
  serviceAccount: kplus.ServiceAccount.fromServiceAccountName('aws'),
});
```