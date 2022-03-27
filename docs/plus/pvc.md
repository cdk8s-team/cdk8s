# PersistentVolumeClaim

A `PersistentVolumeClaim` (PVC) is a request for storage by a pod.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-22/typescript.md#persistent-volume-claim)

A `PersistentVolumeClaim` contains the requirements of the request, and the Kubernetes control plane is responsible providing a physical volume that satisfies the claim's requirements.

```ts
import * as kplus from 'cdk8s-plus-22';
import * as cdk8s from 'cdk8s';

const pod = new kplus.Pod(chart, 'Pod');
const container = pod.addContainer({ image: 'node' });

// create the storage request
const claim = new kplus.PersistentVolumeClaim(chart, 'Claim', {
  storage: cdk8s.Size.gibibytes(50),
});

// mount a volume based on the request to the container
// this will also add the volume itself to the pod spec.
container.mount('/data', kplus.Volume.fromPersistentVolumeClaim(claim));
```

## Storage Class

By default, the `storageClassName` property of a claim is not set.
This means that the backing volume can be provided by one of two methods:

1. Dynamically provision a volume with the default storage class.
2. If a default storage class is not configured in the cluster, the backing
volume must pre-exist and not be assigned to any storage class.

> See [Provisioning](https://kubernetes.io/docs/concepts/storage/persistent-volumes/#provisioning) for more details.

You can also provide an explicit storage class name,

```ts
const claim = new kplus.PersistentVolumeClaim(chart, 'Claim', {
  storage: cdk8s.Size.gibibytes(50),
  storageClassName: 'large-ebs',
});
```

In this case, Kubernetes control plane will either locate an existing volume with the `larg-ebs` storage class, or dynamically provision a new using the appropriate provisioner.

You can also pass in a special `""` value, this means the volume must not be assigned to any storage class.
Since all dynamically provisioend volumes belong to a storage class, setting this value effectively disables
dynamic provisioning for this claim.

```ts
const claim = new kplus.PersistentVolumeClaim(chart, 'Claim', {
  storage: cdk8s.Size.gibibytes(50),
  // disable dynamic provisioning
  storageClassName: "",
});
```

## Bind

Binding is a part of the reservation process, but it only creates a one directional link.
You can use it to bind a PVC to an existing PV. Note however that if the PV is not bound to the PVC,
there's no guarantee this claim will indeed be given to that specific volume.

```ts
const claim = new kplus.PersistentVolumeClaim(chart, 'Claim', {
  storage: cdk8s.Size.gibibytes(50),
});

const vol = kplus.PersistentVolume.fromPersistentVolumeName('vol');

// will modify the claim resource to refer to the volume.
// but no the other way around.
claim.bind(vol);
```