# Volume

Volume represents a named volume in a pod that may be accessed by any container in the pod.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-17.md#cdk8s-plus-17-volume)

## Create from a ConfigMap

A very useful operation is to create a volume from a `ConfigMap`. Kubernetes will translate every key in the config map to a file,
who's content is the value of the key.

```typescript
import * as kplus from 'cdk8s-plus-17';

const configMap = kplus.ConfigMap.fromConfigMapName('redis-config');
const configVolume = kplus.Volume.fromConfigMap(configMap);
```

## Create from an EmptyDir

The easiest way to allocate some persistent storage to your container is to create a volume from an empty directory.
This volume, as the name suggests, is initially empty, and can be written to by containers who mount it.
The data in the volume is preserved throughout the lifecycle of the pod, but is deleted forever as soon as the pod itself is removed.

```typescript
import * as kplus from 'cdk8s-plus-17';

const data = kplus.Volume.fromEmptyDir(configMap);

const pod = new kplus.Pod(this, 'Pod');
const redis = pod.addContainer({
  image: 'redis'
})

// mount to the redis container.
redis.mount('/var/lib/redis', data);
```
