# PersistentVolume

A `PersistentVolume` (PV) is a piece of storage in the cluster that has been provisioned by an administrator or dynamically provisioned using Storage Classes.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-22/typescript.md#persistent-volume)

The `PersistentVolume` construct represents a pre-existing volume in the cluster.

## Types

Each type is implmented as its own construct, exposing both common properties as well as type
specific ones. Currently the supported types are:

- `AwsElasticBlockStorePersistentVolume`
- `AzureDiskPersistentVolume`
- `GCEPersistentDiskPersistentVolume`

For example, to create a PV from an existing AWS EBS volume:

```ts
import * as kplus from 'cdk8s-plus-22';
import * as cdk8s from 'cdk8s';

const vol = new kplus.AwsElasticBlockStorePersistentVolume(chart, 'Volume', {
  // must exist in aws
  volumeId: 'vol1234',

  // assign the volume to small-ebs storage class
  storageClassName: 'small-ebs',

  // what is the volume storage
  storage: cdk8s.Size.gibibytes(50),
});
```

Note that this **does not** actually create a new volume, it merely manifests an existing
volume in AWS as a Kubernetes resource.

## Reserve

> See https://kubernetes.io/docs/concepts/storage/persistent-volumes/#reserving-a-persistentvolume

Once the PV is defined, you can reserve it:

```ts
const claim = vol.reserve();
```

This method creates a new `PersistentVolumeClaim` and performs a
bi-directional binding that reserves the volume for usage.
You can use the claim to mount a volume onto a container like usual:

```ts
container.mount('/data', kplus.Volume.fromPersistentVolumeClaim(claim));
```

You can also directly mount a persistent volume, which will implicitly reserve it:

```ts
container.mount('/data', kplus.Volume.fromPersistentVolume(vol));
```

## Bind

Binding is a part of the reservation process, but it only creates a one directional link.
You can use it to bind a PV to an existing PVC. Note however that if the PVC is not bound to the PV,
there's no guarantee this volume will indeed be given that specific claim.

```ts
const claim = kplus.PersistentVolumeClaim.fromClaimName('claim');

// will modify the vol resource to refer to the claim.
// but no the other way around.
vol.bind(claim);
```