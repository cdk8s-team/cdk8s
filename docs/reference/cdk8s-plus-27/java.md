# cdk8s-plus-27 (Java) <a name="API Reference"></a>

## Constructs <a name="Constructs"></a>

### AbstractPod <a name="org.cdk8s.plus27.AbstractPod"></a>

- *Implements:* [`org.cdk8s.plus27.IPodSelector`](#org.cdk8s.plus27.IPodSelector), [`org.cdk8s.plus27.INetworkPolicyPeer`](#org.cdk8s.plus27.INetworkPolicyPeer), [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

#### Initializers <a name="org.cdk8s.plus27.AbstractPod.Initializer"></a>

```java
import org.cdk8s.plus27.AbstractPod;

AbstractPod.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.automountServiceAccountToken"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.dns"></a>

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.dockerRegistryAuth"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.hostAliases"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.hostNetwork"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.initContainers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.isolate"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.securityContext"></a>

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.terminationGracePeriod"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

#### Methods <a name="Methods"></a>

##### `addContainer` <a name="org.cdk8s.plus27.AbstractPod.addContainer"></a>

```java
public addContainer(ContainerProps cont)
```

###### `cont`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.parameter.cont"></a>

- *Type:* [`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)

---

##### `addHostAlias` <a name="org.cdk8s.plus27.AbstractPod.addHostAlias"></a>

```java
public addHostAlias(HostAlias hostAlias)
```

###### `hostAlias`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.parameter.hostAlias"></a>

- *Type:* [`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)

---

##### `addInitContainer` <a name="org.cdk8s.plus27.AbstractPod.addInitContainer"></a>

```java
public addInitContainer(ContainerProps cont)
```

###### `cont`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.parameter.cont"></a>

- *Type:* [`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)

---

##### `addVolume` <a name="org.cdk8s.plus27.AbstractPod.addVolume"></a>

```java
public addVolume(Volume vol)
```

###### `vol`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.parameter.vol"></a>

- *Type:* [`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)

---

##### `attachContainer` <a name="org.cdk8s.plus27.AbstractPod.attachContainer"></a>

```java
public attachContainer(Container cont)
```

###### `cont`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.parameter.cont"></a>

- *Type:* [`org.cdk8s.plus27.Container`](#org.cdk8s.plus27.Container)

---

##### `toNetworkPolicyPeerConfig` <a name="org.cdk8s.plus27.AbstractPod.toNetworkPolicyPeerConfig"></a>

```java
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="org.cdk8s.plus27.AbstractPod.toPodSelector"></a>

```java
public toPodSelector()
```

##### `toPodSelectorConfig` <a name="org.cdk8s.plus27.AbstractPod.toPodSelectorConfig"></a>

```java
public toPodSelectorConfig()
```

##### `toSubjectConfiguration` <a name="org.cdk8s.plus27.AbstractPod.toSubjectConfiguration"></a>

```java
public toSubjectConfiguration()
```


#### Properties <a name="Properties"></a>

##### `automountServiceAccountToken`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.property.automountServiceAccountToken"></a>

```java
public java.lang.Boolean getAutomountServiceAccountToken();
```

- *Type:* `java.lang.Boolean`

---

##### `containers`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.property.containers"></a>

```java
public java.util.List<Container> getContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Container`](#org.cdk8s.plus27.Container)>

---

##### `dns`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.property.dns"></a>

```java
public PodDns getDns();
```

- *Type:* [`org.cdk8s.plus27.PodDns`](#org.cdk8s.plus27.PodDns)

---

##### `hostAliases`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.property.hostAliases"></a>

```java
public java.util.List<HostAlias> getHostAliases();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

---

##### `initContainers`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.property.initContainers"></a>

```java
public java.util.List<Container> getInitContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Container`](#org.cdk8s.plus27.Container)>

---

##### `podMetadata`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.property.podMetadata"></a>

```java
public ApiObjectMetadataDefinition getPodMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadataDefinition`](#org.cdk8s.ApiObjectMetadataDefinition)

---

##### `securityContext`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.property.securityContext"></a>

```java
public PodSecurityContext getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.PodSecurityContext`](#org.cdk8s.plus27.PodSecurityContext)

---

##### `volumes`<sup>Required</sup> <a name="org.cdk8s.plus27.AbstractPod.property.volumes"></a>

```java
public java.util.List<Volume> getVolumes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPod.property.dockerRegistryAuth"></a>

```java
public ISecret getDockerRegistryAuth();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPod.property.hostNetwork"></a>

```java
public java.lang.Boolean getHostNetwork();
```

- *Type:* `java.lang.Boolean`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPod.property.restartPolicy"></a>

```java
public RestartPolicy getRestartPolicy();
```

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPod.property.serviceAccount"></a>

```java
public IServiceAccount getServiceAccount();
```

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPod.property.terminationGracePeriod"></a>

```java
public Duration getTerminationGracePeriod();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)

---


### AwsElasticBlockStorePersistentVolume <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume"></a>

Represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

#### Initializers <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume.Initializer"></a>

```java
import org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume;

AwsElasticBlockStorePersistentVolume.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .accessModes(java.util.List<PersistentVolumeAccessMode>)
//  .claim(IPersistentVolumeClaim)
//  .mountOptions(java.util.List<java.lang.String>)
//  .reclaimPolicy(PersistentVolumeReclaimPolicy)
//  .storage(Size)
//  .storageClassName(java.lang.String)
//  .volumeMode(PersistentVolumeMode)
    .volumeId(java.lang.String)
//  .fsType(java.lang.String)
//  .partition(java.lang.Number)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.accessModes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.claim"></a>

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.mountOptions"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.reclaimPolicy"></a>

- *Type:* [`org.cdk8s.plus27.PersistentVolumeReclaimPolicy`](#org.cdk8s.plus27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.storage"></a>

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.storageClassName"></a>

- *Type:* `java.lang.String`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.volumeMode"></a>

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `volumeId`<sup>Required</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.volumeId"></a>

- *Type:* `java.lang.String`

Unique ID of the persistent disk resource in AWS (Amazon EBS volume).

More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `fsType`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.fsType"></a>

- *Type:* `java.lang.String`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `partition`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.partition"></a>

- *Type:* `java.lang.Number`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.parameter.readOnly"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---



#### Properties <a name="Properties"></a>

##### `fsType`<sup>Required</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume.property.fsType"></a>

```java
public java.lang.String getFsType();
```

- *Type:* `java.lang.String`

File system type of this volume.

---

##### `readOnly`<sup>Required</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`

Whether or not it is mounted as a read-only volume.

---

##### `volumeId`<sup>Required</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume.property.volumeId"></a>

```java
public java.lang.String getVolumeId();
```

- *Type:* `java.lang.String`

Volume id of this volume.

---

##### `partition`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume.property.partition"></a>

```java
public java.lang.Number getPartition();
```

- *Type:* `java.lang.Number`

Partition of this volume.

---


### AzureDiskPersistentVolume <a name="org.cdk8s.plus27.AzureDiskPersistentVolume"></a>

AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.

#### Initializers <a name="org.cdk8s.plus27.AzureDiskPersistentVolume.Initializer"></a>

```java
import org.cdk8s.plus27.AzureDiskPersistentVolume;

AzureDiskPersistentVolume.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .accessModes(java.util.List<PersistentVolumeAccessMode>)
//  .claim(IPersistentVolumeClaim)
//  .mountOptions(java.util.List<java.lang.String>)
//  .reclaimPolicy(PersistentVolumeReclaimPolicy)
//  .storage(Size)
//  .storageClassName(java.lang.String)
//  .volumeMode(PersistentVolumeMode)
    .diskName(java.lang.String)
    .diskUri(java.lang.String)
//  .cachingMode(AzureDiskPersistentVolumeCachingMode)
//  .fsType(java.lang.String)
//  .kind(AzureDiskPersistentVolumeKind)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolume.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.accessModes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.claim"></a>

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.mountOptions"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.reclaimPolicy"></a>

- *Type:* [`org.cdk8s.plus27.PersistentVolumeReclaimPolicy`](#org.cdk8s.plus27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.storage"></a>

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.storageClassName"></a>

- *Type:* `java.lang.String`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.volumeMode"></a>

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `diskName`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.diskName"></a>

- *Type:* `java.lang.String`

The Name of the data disk in the blob storage.

---

##### `diskUri`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.diskUri"></a>

- *Type:* `java.lang.String`

The URI the data disk in the blob storage.

---

##### `cachingMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.cachingMode"></a>

- *Type:* [`org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode`](#org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode)
- *Default:* AzureDiskPersistentVolumeCachingMode.NONE.

Host Caching mode.

---

##### `fsType`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.fsType"></a>

- *Type:* `java.lang.String`
- *Default:* 'ext4'

Filesystem type to mount.

Must be a filesystem type supported by the host operating system.

---

##### `kind`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.kind"></a>

- *Type:* [`org.cdk8s.plus27.AzureDiskPersistentVolumeKind`](#org.cdk8s.plus27.AzureDiskPersistentVolumeKind)
- *Default:* AzureDiskPersistentVolumeKind.SHARED

Kind of disk.

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.parameter.readOnly"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Force the ReadOnly setting in VolumeMounts.

---



#### Properties <a name="Properties"></a>

##### `azureKind`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolume.property.azureKind"></a>

```java
public AzureDiskPersistentVolumeKind getAzureKind();
```

- *Type:* [`org.cdk8s.plus27.AzureDiskPersistentVolumeKind`](#org.cdk8s.plus27.AzureDiskPersistentVolumeKind)

Azure kind of this volume.

---

##### `cachingMode`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolume.property.cachingMode"></a>

```java
public AzureDiskPersistentVolumeCachingMode getCachingMode();
```

- *Type:* [`org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode`](#org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode)

Caching mode of this volume.

---

##### `diskName`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolume.property.diskName"></a>

```java
public java.lang.String getDiskName();
```

- *Type:* `java.lang.String`

Disk name of this volume.

---

##### `diskUri`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolume.property.diskUri"></a>

```java
public java.lang.String getDiskUri();
```

- *Type:* `java.lang.String`

Disk URI of this volume.

---

##### `fsType`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolume.property.fsType"></a>

```java
public java.lang.String getFsType();
```

- *Type:* `java.lang.String`

File system type of this volume.

---

##### `readOnly`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolume.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`

Whether or not it is mounted as a read-only volume.

---


### BasicAuthSecret <a name="org.cdk8s.plus27.BasicAuthSecret"></a>

Create a secret for basic authentication.

> https://kubernetes.io/docs/concepts/configuration/secret/#basic-authentication-secret

#### Initializers <a name="org.cdk8s.plus27.BasicAuthSecret.Initializer"></a>

```java
import org.cdk8s.plus27.BasicAuthSecret;

BasicAuthSecret.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .password(java.lang.String)
    .username(java.lang.String)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.BasicAuthSecret.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.BasicAuthSecret.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.BasicAuthSecretProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.BasicAuthSecretProps.parameter.immutable"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `password`<sup>Required</sup> <a name="org.cdk8s.plus27.BasicAuthSecretProps.parameter.password"></a>

- *Type:* `java.lang.String`

The password or token for authentication.

---

##### `username`<sup>Required</sup> <a name="org.cdk8s.plus27.BasicAuthSecretProps.parameter.username"></a>

- *Type:* `java.lang.String`

The user name for authentication.

---





### ClusterRole <a name="org.cdk8s.plus27.ClusterRole"></a>

- *Implements:* [`org.cdk8s.plus27.IClusterRole`](#org.cdk8s.plus27.IClusterRole), [`org.cdk8s.plus27.IRole`](#org.cdk8s.plus27.IRole)

ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.

#### Initializers <a name="org.cdk8s.plus27.ClusterRole.Initializer"></a>

```java
import org.cdk8s.plus27.ClusterRole;

ClusterRole.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .aggregationLabels(java.util.Map<java.lang.String, java.lang.String>)
//  .rules(java.util.List<ClusterRolePolicyRule>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ClusterRoleProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `aggregationLabels`<sup>Optional</sup> <a name="org.cdk8s.plus27.ClusterRoleProps.parameter.aggregationLabels"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

Specify labels that should be used to locate ClusterRoles, whose rules will be automatically filled into this ClusterRole's rules.

---

##### `rules`<sup>Optional</sup> <a name="org.cdk8s.plus27.ClusterRoleProps.parameter.rules"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ClusterRolePolicyRule`](#org.cdk8s.plus27.ClusterRolePolicyRule)>
- *Default:* []

A list of rules the role should allow.

---

#### Methods <a name="Methods"></a>

##### `aggregate` <a name="org.cdk8s.plus27.ClusterRole.aggregate"></a>

```java
public aggregate(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.value"></a>

- *Type:* `java.lang.String`

---

##### `allow` <a name="org.cdk8s.plus27.ClusterRole.allow"></a>

```java
public allow(java.util.List<java.lang.String> verbs, IApiEndpoint endpoints)
```

###### `verbs`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.verbs"></a>

- *Type:* java.util.List<`java.lang.String`>

---

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The endpoints(s) to apply to.

---

##### `allowCreate` <a name="org.cdk8s.plus27.ClusterRole.allowCreate"></a>

```java
public allowCreate(IApiEndpoint endpoints)
```

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowDelete` <a name="org.cdk8s.plus27.ClusterRole.allowDelete"></a>

```java
public allowDelete(IApiEndpoint endpoints)
```

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowDeleteCollection` <a name="org.cdk8s.plus27.ClusterRole.allowDeleteCollection"></a>

```java
public allowDeleteCollection(IApiEndpoint endpoints)
```

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowGet` <a name="org.cdk8s.plus27.ClusterRole.allowGet"></a>

```java
public allowGet(IApiEndpoint endpoints)
```

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowList` <a name="org.cdk8s.plus27.ClusterRole.allowList"></a>

```java
public allowList(IApiEndpoint endpoints)
```

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowPatch` <a name="org.cdk8s.plus27.ClusterRole.allowPatch"></a>

```java
public allowPatch(IApiEndpoint endpoints)
```

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowRead` <a name="org.cdk8s.plus27.ClusterRole.allowRead"></a>

```java
public allowRead(IApiEndpoint endpoints)
```

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowReadWrite` <a name="org.cdk8s.plus27.ClusterRole.allowReadWrite"></a>

```java
public allowReadWrite(IApiEndpoint endpoints)
```

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowUpdate` <a name="org.cdk8s.plus27.ClusterRole.allowUpdate"></a>

```java
public allowUpdate(IApiEndpoint endpoints)
```

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowWatch` <a name="org.cdk8s.plus27.ClusterRole.allowWatch"></a>

```java
public allowWatch(IApiEndpoint endpoints)
```

###### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

The resource(s) to apply to.

---

##### `bind` <a name="org.cdk8s.plus27.ClusterRole.bind"></a>

```java
public bind(ISubject subjects)
```

###### `subjects`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.subjects"></a>

- *Type:* [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

a list of subjects to bind to.

---

##### `bindInNamespace` <a name="org.cdk8s.plus27.ClusterRole.bindInNamespace"></a>

```java
public bindInNamespace(java.lang.String namespace, ISubject subjects)
```

###### `namespace`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.namespace"></a>

- *Type:* `java.lang.String`

the namespace to limit permissions to.

---

###### `subjects`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.subjects"></a>

- *Type:* [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

a list of subjects to bind to.

---

##### `combine` <a name="org.cdk8s.plus27.ClusterRole.combine"></a>

```java
public combine(ClusterRole rol)
```

###### `rol`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.rol"></a>

- *Type:* [`org.cdk8s.plus27.ClusterRole`](#org.cdk8s.plus27.ClusterRole)

---

#### Static Functions <a name="Static Functions"></a>

##### `fromClusterRoleName` <a name="org.cdk8s.plus27.ClusterRole.fromClusterRoleName"></a>

```java
import org.cdk8s.plus27.ClusterRole;

ClusterRole.fromClusterRoleName(Construct scope, java.lang.String id, java.lang.String name)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.parameter.name"></a>

- *Type:* `java.lang.String`

---

#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `rules`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRole.property.rules"></a>

```java
public java.util.List<ClusterRolePolicyRule> getRules();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ClusterRolePolicyRule`](#org.cdk8s.plus27.ClusterRolePolicyRule)>

Rules associaated with this Role.

Returns a copy, use `allow` to add rules.

---


### ClusterRoleBinding <a name="org.cdk8s.plus27.ClusterRoleBinding"></a>

A ClusterRoleBinding grants permissions cluster-wide to a user or set of users.

#### Initializers <a name="org.cdk8s.plus27.ClusterRoleBinding.Initializer"></a>

```java
import org.cdk8s.plus27.ClusterRoleBinding;

ClusterRoleBinding.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
    .role(IClusterRole)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRoleBinding.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRoleBinding.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ClusterRoleBindingProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `role`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRoleBindingProps.parameter.role"></a>

- *Type:* [`org.cdk8s.plus27.IClusterRole`](#org.cdk8s.plus27.IClusterRole)

The role to bind to.

---

#### Methods <a name="Methods"></a>

##### `addSubjects` <a name="org.cdk8s.plus27.ClusterRoleBinding.addSubjects"></a>

```java
public addSubjects(ISubject subjects)
```

###### `subjects`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRoleBinding.parameter.subjects"></a>

- *Type:* [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

The subjects to add.

---


#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRoleBinding.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `role`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRoleBinding.property.role"></a>

```java
public IClusterRole getRole();
```

- *Type:* [`org.cdk8s.plus27.IClusterRole`](#org.cdk8s.plus27.IClusterRole)

---

##### `subjects`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRoleBinding.property.subjects"></a>

```java
public java.util.List<ISubject> getSubjects();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)>

---


### ConfigMap <a name="org.cdk8s.plus27.ConfigMap"></a>

- *Implements:* [`org.cdk8s.plus27.IConfigMap`](#org.cdk8s.plus27.IConfigMap)

ConfigMap holds configuration data for pods to consume.

#### Initializers <a name="org.cdk8s.plus27.ConfigMap.Initializer"></a>

```java
import org.cdk8s.plus27.ConfigMap;

ConfigMap.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .binaryData(java.util.Map<java.lang.String, java.lang.String>)
//  .data(java.util.Map<java.lang.String, java.lang.String>)
//  .immutable(java.lang.Boolean)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `binaryData`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapProps.parameter.binaryData"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

BinaryData contains the binary data.

Each key must consist of alphanumeric characters, '-', '_' or '.'.
BinaryData can contain byte sequences that are not in the UTF-8 range. The
keys stored in BinaryData must not overlap with the ones in the Data field,
this is enforced during validation process.

You can also add binary data using `configMap.addBinaryData()`.

---

##### `data`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapProps.parameter.data"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

Data contains the configuration data.

Each key must consist of alphanumeric characters, '-', '_' or '.'. Values
with non-UTF-8 byte sequences must use the BinaryData field. The keys
stored in Data must not overlap with the keys in the BinaryData field, this
is enforced during validation process.

You can also add data using `configMap.addData()`.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapProps.parameter.immutable"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

#### Methods <a name="Methods"></a>

##### `addBinaryData` <a name="org.cdk8s.plus27.ConfigMap.addBinaryData"></a>

```java
public addBinaryData(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.key"></a>

- *Type:* `java.lang.String`

The key.

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.value"></a>

- *Type:* `java.lang.String`

The value.

---

##### `addData` <a name="org.cdk8s.plus27.ConfigMap.addData"></a>

```java
public addData(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.key"></a>

- *Type:* `java.lang.String`

The key.

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.value"></a>

- *Type:* `java.lang.String`

The value.

---

##### `addDirectory` <a name="org.cdk8s.plus27.ConfigMap.addDirectory"></a>

```java
public addDirectory(java.lang.String localDir)
public addDirectory(java.lang.String localDir, AddDirectoryOptions options)
```

###### `localDir`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.localDir"></a>

- *Type:* `java.lang.String`

A path to a local directory.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.AddDirectoryOptions`](#org.cdk8s.plus27.AddDirectoryOptions)

Options.

---

##### `addFile` <a name="org.cdk8s.plus27.ConfigMap.addFile"></a>

```java
public addFile(java.lang.String localFile)
public addFile(java.lang.String localFile, java.lang.String key)
```

###### `localFile`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.localFile"></a>

- *Type:* `java.lang.String`

The path to the local file.

---

###### `key`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.key"></a>

- *Type:* `java.lang.String`

The ConfigMap key (default to the file name).

---

#### Static Functions <a name="Static Functions"></a>

##### `fromConfigMapName` <a name="org.cdk8s.plus27.ConfigMap.fromConfigMapName"></a>

```java
import org.cdk8s.plus27.ConfigMap;

ConfigMap.fromConfigMapName(Construct scope, java.lang.String id, java.lang.String name)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.parameter.name"></a>

- *Type:* `java.lang.String`

---

#### Properties <a name="Properties"></a>

##### `binaryData`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.property.binaryData"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getBinaryData();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

The binary data associated with this config map.

Returns a copy. To add data records, use `addBinaryData()` or `addData()`.

---

##### `data`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.property.data"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getData();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

The data associated with this config map.

Returns an copy. To add data records, use `addData()` or `addBinaryData()`.

---

##### `immutable`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.property.immutable"></a>

```java
public java.lang.Boolean getImmutable();
```

- *Type:* `java.lang.Boolean`

Whether or not this config map is immutable.

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.ConfigMap.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---


### CronJob <a name="org.cdk8s.plus27.CronJob"></a>

A CronJob is responsible for creating a Job and scheduling it based on provided cron schedule.

This helps running Jobs in a recurring manner.

#### Initializers <a name="org.cdk8s.plus27.CronJob.Initializer"></a>

```java
import org.cdk8s.plus27.CronJob;

CronJob.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
//  .activeDeadline(Duration)
//  .backoffLimit(java.lang.Number)
//  .ttlAfterFinished(Duration)
    .schedule(Cron)
//  .concurrencyPolicy(ConcurrencyPolicy)
//  .failedJobsRetained(java.lang.Number)
//  .startingDeadline(Duration)
//  .successfulJobsRetained(java.lang.Number)
//  .suspend(java.lang.Boolean)
//  .timeZone(java.lang.String)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJob.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJob.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.automountServiceAccountToken"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.dns"></a>

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.dockerRegistryAuth"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.hostAliases"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.hostNetwork"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.initContainers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.isolate"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.securityContext"></a>

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.terminationGracePeriod"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.select"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.spread"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `activeDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.activeDeadline"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoffLimit`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.backoffLimit"></a>

- *Type:* `java.lang.Number`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.ttlAfterFinished"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* If this field is unset, the Job won't be automatically deleted.

Limits the lifetime of a Job that has finished execution (either Complete or Failed).

If this field is set, after the Job finishes, it is eligible to
be automatically deleted. When the Job is being deleted, its lifecycle
guarantees (e.g. finalizers) will be honored. If this field is set to zero,
the Job becomes eligible to be deleted immediately after it finishes. This
field is alpha-level and is only honored by servers that enable the
`TTLAfterFinished` feature.

---

##### `schedule`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.schedule"></a>

- *Type:* [`org.cdk8s.Cron`](#org.cdk8s.Cron)

Specifies the time in which the job would run again.

This is defined as a cron expression in the CronJob resource.

---

##### `concurrencyPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.concurrencyPolicy"></a>

- *Type:* [`org.cdk8s.plus27.ConcurrencyPolicy`](#org.cdk8s.plus27.ConcurrencyPolicy)
- *Default:* ConcurrencyPolicy.Forbid

Specifies the concurrency policy for the job.

---

##### `failedJobsRetained`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.failedJobsRetained"></a>

- *Type:* `java.lang.Number`
- *Default:* 1

Specifies the number of failed jobs history retained.

This would retain the Job and the associated Pod resource and can be useful for debugging.

---

##### `startingDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.startingDeadline"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(10)

Kubernetes attempts to start cron jobs at its schedule time, but this is not guaranteed.

This deadline specifies
how much time can pass after a schedule point, for which kubernetes can still start the job.
For example, if this is set to 100 seconds, kubernetes is allowed to start the job at a maximum 100 seconds after
the scheduled time.

Note that the Kubernetes CronJobController checks for things every 10 seconds, for this reason, a deadline below 10
seconds is not allowed, as it may cause your job to never be scheduled.

In addition, kubernetes will stop scheduling jobs if more than 100 schedules were missed (for any reason).
This property also controls what time interval should kubernetes consider when counting for missed schedules.

For example, suppose a CronJob is set to schedule a new Job every one minute beginning at 08:30:00,
and its `startingDeadline` field is not set. If the CronJob controller happens to be down from 08:29:00 to 10:21:00,
the job will not start as the number of missed jobs which missed their schedule is greater than 100.
However, if `startingDeadline` is set to 200 seconds, kubernetes will only count 3 missed schedules, and thus
start a new execution at 10:22:00.

---

##### `successfulJobsRetained`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.successfulJobsRetained"></a>

- *Type:* `java.lang.Number`
- *Default:* 3

Specifies the number of successful jobs history retained.

This would retain the Job and the associated Pod resource and can be useful for debugging.

---

##### `suspend`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.suspend"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Specifies if the cron job should be suspended.

Only applies to future executions, current ones are remained untouched.

---

##### `timeZone`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.parameter.timeZone"></a>

- *Type:* `java.lang.String`
- *Default:* Timezone of kube-controller-manager process.

Specifies the timezone for the job.

This helps aligining the schedule to follow the specified timezone.

> {@link https://en.wikipedia.org/wiki/List_of_tz_database_time_zones} for list of valid timezone values.

---



#### Properties <a name="Properties"></a>

##### `concurrencyPolicy`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJob.property.concurrencyPolicy"></a>

```java
public java.lang.String getConcurrencyPolicy();
```

- *Type:* `java.lang.String`

The policy used by this cron job to determine the concurrency mode in which to schedule jobs.

---

##### `failedJobsRetained`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJob.property.failedJobsRetained"></a>

```java
public java.lang.Number getFailedJobsRetained();
```

- *Type:* `java.lang.Number`

The number of failed jobs retained by this cron job.

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJob.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

Represents the resource type.

---

##### `schedule`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJob.property.schedule"></a>

```java
public Cron getSchedule();
```

- *Type:* [`org.cdk8s.Cron`](#org.cdk8s.Cron)

The schedule this cron job is scheduled to run in.

---

##### `startingDeadline`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJob.property.startingDeadline"></a>

```java
public Duration getStartingDeadline();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)

The time by which the running cron job needs to schedule the next job execution.

The job is considered as failed if it misses this deadline.

---

##### `successfulJobsRetained`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJob.property.successfulJobsRetained"></a>

```java
public java.lang.Number getSuccessfulJobsRetained();
```

- *Type:* `java.lang.Number`

The number of successful jobs retained by this cron job.

---

##### `suspend`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJob.property.suspend"></a>

```java
public java.lang.Boolean getSuspend();
```

- *Type:* `java.lang.Boolean`

Whether or not the cron job is currently suspended or not.

---

##### `timeZone`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJob.property.timeZone"></a>

```java
public java.lang.String getTimeZone();
```

- *Type:* `java.lang.String`

The timezone which this cron job would follow to schedule jobs.

---


### DaemonSet <a name="org.cdk8s.plus27.DaemonSet"></a>

A DaemonSet ensures that all (or some) Nodes run a copy of a Pod.

As nodes are added to the cluster, Pods are added to them.
As nodes are removed from the cluster, those Pods are garbage collected.
Deleting a DaemonSet will clean up the Pods it created.

Some typical uses of a DaemonSet are:

* running a cluster storage daemon on every node
* running a logs collection daemon on every node
* running a node monitoring daemon on every node

In a simple case, one DaemonSet, covering all nodes, would be used for each type of daemon.
A more complex setup might use multiple DaemonSets for a single type of daemon,
but with different flags and/or different memory and cpu requests for different hardware types.

#### Initializers <a name="org.cdk8s.plus27.DaemonSet.Initializer"></a>

```java
import org.cdk8s.plus27.DaemonSet;

DaemonSet.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
//  .minReadySeconds(java.lang.Number)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.DaemonSet.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.DaemonSet.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.automountServiceAccountToken"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.dns"></a>

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.dockerRegistryAuth"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.hostAliases"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.hostNetwork"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.initContainers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.isolate"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.securityContext"></a>

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.terminationGracePeriod"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.select"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.spread"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `minReadySeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.parameter.minReadySeconds"></a>

- *Type:* `java.lang.Number`
- *Default:* 0

Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---



#### Properties <a name="Properties"></a>

##### `minReadySeconds`<sup>Required</sup> <a name="org.cdk8s.plus27.DaemonSet.property.minReadySeconds"></a>

```java
public java.lang.Number getMinReadySeconds();
```

- *Type:* `java.lang.Number`

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.DaemonSet.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---


### Deployment <a name="org.cdk8s.plus27.Deployment"></a>

- *Implements:* [`org.cdk8s.plus27.IScalable`](#org.cdk8s.plus27.IScalable)

A Deployment provides declarative updates for Pods and ReplicaSets.

You describe a desired state in a Deployment, and the Deployment Controller changes the actual
state to the desired state at a controlled rate. You can define Deployments to create new ReplicaSets, or to remove
existing Deployments and adopt all their resources with new Deployments.

> Note: Do not manage ReplicaSets owned by a Deployment. Consider opening an issue in the main Kubernetes repository if your use case is not covered below.

Use Case

The following are typical use cases for Deployments:

* Create a Deployment to rollout a ReplicaSet. The ReplicaSet creates Pods in the background.
  Check the status of the rollout to see if it succeeds or not.
* Declare the new state of the Pods by updating the PodTemplateSpec of the Deployment.
  A new ReplicaSet is created and the Deployment manages moving the Pods from the old ReplicaSet to the new one at a controlled rate.
  Each new ReplicaSet updates the revision of the Deployment.
* Rollback to an earlier Deployment revision if the current state of the Deployment is not stable.
  Each rollback updates the revision of the Deployment.
* Scale up the Deployment to facilitate more load.
* Pause the Deployment to apply multiple fixes to its PodTemplateSpec and then resume it to start a new rollout.
* Use the status of the Deployment as an indicator that a rollout has stuck.
* Clean up older ReplicaSets that you don't need anymore.

#### Initializers <a name="org.cdk8s.plus27.Deployment.Initializer"></a>

```java
import org.cdk8s.plus27.Deployment;

Deployment.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
//  .minReady(Duration)
//  .progressDeadline(Duration)
//  .replicas(java.lang.Number)
//  .strategy(DeploymentStrategy)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Deployment.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Deployment.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.automountServiceAccountToken"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.dns"></a>

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.dockerRegistryAuth"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.hostAliases"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.hostNetwork"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.initContainers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.isolate"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.securityContext"></a>

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.terminationGracePeriod"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.select"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.spread"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `minReady`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.minReady"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(0)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

Zero means the pod will be considered available as soon as it is ready.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds

---

##### `progressDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.progressDeadline"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(600)

The maximum duration for a deployment to make progress before it is considered to be failed.

The deployment controller will continue
to process failed deployments and a condition with a ProgressDeadlineExceeded
reason will be surfaced in the deployment status.

Note that progress will not be estimated during the time a deployment is paused.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#progress-deadline-seconds

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.replicas"></a>

- *Type:* `java.lang.Number`
- *Default:* 2

Number of desired pods.

---

##### `strategy`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.parameter.strategy"></a>

- *Type:* [`org.cdk8s.plus27.DeploymentStrategy`](#org.cdk8s.plus27.DeploymentStrategy)
- *Default:* RollingUpdate with maxSurge and maxUnavailable set to 25%.

Specifies the strategy used to replace old Pods by new ones.

---

#### Methods <a name="Methods"></a>

##### `exposeViaIngress` <a name="org.cdk8s.plus27.Deployment.exposeViaIngress"></a>

```java
public exposeViaIngress(java.lang.String path)
public exposeViaIngress(java.lang.String path, ExposeDeploymentViaIngressOptions options)
```

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.Deployment.parameter.path"></a>

- *Type:* `java.lang.String`

The ingress path to register under.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Deployment.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.ExposeDeploymentViaIngressOptions`](#org.cdk8s.plus27.ExposeDeploymentViaIngressOptions)

Additional options.

---

##### `exposeViaService` <a name="org.cdk8s.plus27.Deployment.exposeViaService"></a>

```java
public exposeViaService()
public exposeViaService(DeploymentExposeViaServiceOptions options)
```

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Deployment.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.DeploymentExposeViaServiceOptions`](#org.cdk8s.plus27.DeploymentExposeViaServiceOptions)

Options to determine details of the service and port exposed.

---

##### `markHasAutoscaler` <a name="org.cdk8s.plus27.Deployment.markHasAutoscaler"></a>

```java
public markHasAutoscaler()
```

##### `toScalingTarget` <a name="org.cdk8s.plus27.Deployment.toScalingTarget"></a>

```java
public toScalingTarget()
```


#### Properties <a name="Properties"></a>

##### `minReady`<sup>Required</sup> <a name="org.cdk8s.plus27.Deployment.property.minReady"></a>

```java
public Duration getMinReady();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---

##### `progressDeadline`<sup>Required</sup> <a name="org.cdk8s.plus27.Deployment.property.progressDeadline"></a>

```java
public Duration getProgressDeadline();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)

The maximum duration for a deployment to make progress before it is considered to be failed.

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.Deployment.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `strategy`<sup>Required</sup> <a name="org.cdk8s.plus27.Deployment.property.strategy"></a>

```java
public DeploymentStrategy getStrategy();
```

- *Type:* [`org.cdk8s.plus27.DeploymentStrategy`](#org.cdk8s.plus27.DeploymentStrategy)

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus27.Deployment.property.replicas"></a>

```java
public java.lang.Number getReplicas();
```

- *Type:* `java.lang.Number`

Number of desired pods.

---

##### `hasAutoscaler`<sup>Required</sup> <a name="org.cdk8s.plus27.Deployment.property.hasAutoscaler"></a>

```java
public java.lang.Boolean getHasAutoscaler();
```

- *Type:* `java.lang.Boolean`

If this is a target of an autoscaler.

---


### DockerConfigSecret <a name="org.cdk8s.plus27.DockerConfigSecret"></a>

Create a secret for storing credentials for accessing a container image registry.

> https://kubernetes.io/docs/concepts/configuration/secret/#docker-config-secrets

#### Initializers <a name="org.cdk8s.plus27.DockerConfigSecret.Initializer"></a>

```java
import org.cdk8s.plus27.DockerConfigSecret;

DockerConfigSecret.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .data(java.util.Map<java.lang.String, java.lang.Object>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.DockerConfigSecret.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.DockerConfigSecret.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.DockerConfigSecretProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.DockerConfigSecretProps.parameter.immutable"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `data`<sup>Required</sup> <a name="org.cdk8s.plus27.DockerConfigSecretProps.parameter.data"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.Object`>

JSON content to provide for the `~/.docker/config.json` file. This will be stringified and inserted as stringData.

> https://docs.docker.com/engine/reference/commandline/cli/#sample-configuration-file

---





### GCEPersistentDiskPersistentVolume <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolume"></a>

GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

Provisioned by an admin.

> https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

#### Initializers <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolume.Initializer"></a>

```java
import org.cdk8s.plus27.GCEPersistentDiskPersistentVolume;

GCEPersistentDiskPersistentVolume.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .accessModes(java.util.List<PersistentVolumeAccessMode>)
//  .claim(IPersistentVolumeClaim)
//  .mountOptions(java.util.List<java.lang.String>)
//  .reclaimPolicy(PersistentVolumeReclaimPolicy)
//  .storage(Size)
//  .storageClassName(java.lang.String)
//  .volumeMode(PersistentVolumeMode)
    .pdName(java.lang.String)
//  .fsType(java.lang.String)
//  .partition(java.lang.Number)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolume.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.accessModes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.claim"></a>

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.mountOptions"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.reclaimPolicy"></a>

- *Type:* [`org.cdk8s.plus27.PersistentVolumeReclaimPolicy`](#org.cdk8s.plus27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.storage"></a>

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.storageClassName"></a>

- *Type:* `java.lang.String`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.volumeMode"></a>

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `pdName`<sup>Required</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.pdName"></a>

- *Type:* `java.lang.String`

Unique name of the PD resource in GCE.

Used to identify the disk in GCE.

> https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

---

##### `fsType`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.fsType"></a>

- *Type:* `java.lang.String`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `partition`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.partition"></a>

- *Type:* `java.lang.Number`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.parameter.readOnly"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---



#### Properties <a name="Properties"></a>

##### `fsType`<sup>Required</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolume.property.fsType"></a>

```java
public java.lang.String getFsType();
```

- *Type:* `java.lang.String`

File system type of this volume.

---

##### `pdName`<sup>Required</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolume.property.pdName"></a>

```java
public java.lang.String getPdName();
```

- *Type:* `java.lang.String`

PD resource in GCE of this volume.

---

##### `readOnly`<sup>Required</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolume.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`

Whether or not it is mounted as a read-only volume.

---

##### `partition`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolume.property.partition"></a>

```java
public java.lang.Number getPartition();
```

- *Type:* `java.lang.Number`

Partition of this volume.

---


### Group <a name="org.cdk8s.plus27.Group"></a>

- *Implements:* [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

Represents a group.

#### Methods <a name="Methods"></a>

##### `toSubjectConfiguration` <a name="org.cdk8s.plus27.Group.toSubjectConfiguration"></a>

```java
public toSubjectConfiguration()
```

#### Static Functions <a name="Static Functions"></a>

##### `fromName` <a name="org.cdk8s.plus27.Group.fromName"></a>

```java
import org.cdk8s.plus27.Group;

Group.fromName(Construct scope, java.lang.String id, java.lang.String name)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Group.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Group.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Group.parameter.name"></a>

- *Type:* `java.lang.String`

---

#### Properties <a name="Properties"></a>

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.Group.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Group.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

---

##### `apiGroup`<sup>Optional</sup> <a name="org.cdk8s.plus27.Group.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

---


### HorizontalPodAutoscaler <a name="org.cdk8s.plus27.HorizontalPodAutoscaler"></a>

A HorizontalPodAutoscaler scales a workload up or down in response to a metric change.

This allows your services to scale up when demand is high and scale down
when they are no longer needed.

Typical use cases for HorizontalPodAutoscaler:

* When Memory usage is above 70%, scale up the number of replicas to meet the demand.
* When CPU usage is below 30%, scale down the number of replicas to save resources.
* When a service is experiencing a spike in traffic, scale up the number of replicas
  to meet the demand. Then, when the traffic subsides, scale down the number of
  replicas to save resources.

The autoscaler uses the following algorithm to determine the number of replicas to scale:

`desiredReplicas = ceil[currentReplicas * ( currentMetricValue / desiredMetricValue )]`

HorizontalPodAutoscaler's can be used to with any `Scalable` workload:

* Deployment
* StatefulSet

**Targets that already have a replica count defined:**

Remove any replica counts from the target resource before associating with a
HorizontalPodAutoscaler. If this isn't done, then any time a change to that object is applied,
Kubernetes will scale the current number of Pods to the value of the target.replicas key. This
may not be desired and could lead to unexpected behavior.

> https://kubernetes.io/docs/tasks/run-application/horizontal-pod-autoscale/#implicit-maintenance-mode-deactivation

#### Initializers <a name="org.cdk8s.plus27.HorizontalPodAutoscaler.Initializer"></a>

```java
import org.cdk8s.plus27.HorizontalPodAutoscaler;

HorizontalPodAutoscaler.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
    .maxReplicas(java.lang.Number)
    .target(IScalable)
//  .metrics(java.util.List<Metric>)
//  .minReplicas(java.lang.Number)
//  .scaleDown(ScalingRules)
//  .scaleUp(ScalingRules)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscaler.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscaler.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `maxReplicas`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.parameter.maxReplicas"></a>

- *Type:* `java.lang.Number`

The maximum number of replicas that can be scaled up to.

---

##### `target`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.parameter.target"></a>

- *Type:* [`org.cdk8s.plus27.IScalable`](#org.cdk8s.plus27.IScalable)

The workload to scale up or down.

Scalable workload types:

* Deployment
* StatefulSet

---

##### `metrics`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.parameter.metrics"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.Metric`](#org.cdk8s.plus27.Metric)>
- *Default:* If metrics are not provided, then the target resource
constraints (e.g. cpu limit) will be used as scaling metrics.

The metric conditions that trigger a scale up or scale down.

---

##### `minReplicas`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.parameter.minReplicas"></a>

- *Type:* `java.lang.Number`
- *Default:* 1

The minimum number of replicas that can be scaled down to.

Can be set to 0 if the alpha feature gate `HPAScaleToZero` is enabled and
at least one Object or External metric is configured.

---

##### `scaleDown`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.parameter.scaleDown"></a>

- *Type:* [`org.cdk8s.plus27.ScalingRules`](#org.cdk8s.plus27.ScalingRules)
- *Default:* Scale down to minReplica count with a 5 minute stabilization window.

The scaling behavior when scaling down.

---

##### `scaleUp`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.parameter.scaleUp"></a>

- *Type:* [`org.cdk8s.plus27.ScalingRules`](#org.cdk8s.plus27.ScalingRules)
- *Default:* Is the higher of:
* Increase no more than 4 pods per 60 seconds
* Double the number of pods per 60 seconds

The scaling behavior when scaling up.

---



#### Properties <a name="Properties"></a>

##### `maxReplicas`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscaler.property.maxReplicas"></a>

```java
public java.lang.Number getMaxReplicas();
```

- *Type:* `java.lang.Number`

The maximum number of replicas that can be scaled up to.

---

##### `minReplicas`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscaler.property.minReplicas"></a>

```java
public java.lang.Number getMinReplicas();
```

- *Type:* `java.lang.Number`

The minimum number of replicas that can be scaled down to.

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscaler.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `scaleDown`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscaler.property.scaleDown"></a>

```java
public ScalingRules getScaleDown();
```

- *Type:* [`org.cdk8s.plus27.ScalingRules`](#org.cdk8s.plus27.ScalingRules)

The scaling behavior when scaling down.

---

##### `scaleUp`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscaler.property.scaleUp"></a>

```java
public ScalingRules getScaleUp();
```

- *Type:* [`org.cdk8s.plus27.ScalingRules`](#org.cdk8s.plus27.ScalingRules)

The scaling behavior when scaling up.

---

##### `target`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscaler.property.target"></a>

```java
public IScalable getTarget();
```

- *Type:* [`org.cdk8s.plus27.IScalable`](#org.cdk8s.plus27.IScalable)

The workload to scale up or down.

---

##### `metrics`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscaler.property.metrics"></a>

```java
public java.util.List<Metric> getMetrics();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Metric`](#org.cdk8s.plus27.Metric)>

The metric conditions that trigger a scale up or scale down.

---


### Ingress <a name="org.cdk8s.plus27.Ingress"></a>

Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend.

An Ingress can be configured to give services
externally-reachable urls, load balance traffic, terminate SSL, offer name
based virtual hosting etc.

#### Initializers <a name="org.cdk8s.plus27.Ingress.Initializer"></a>

```java
import org.cdk8s.plus27.Ingress;

Ingress.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .defaultBackend(IngressBackend)
//  .rules(java.util.List<IngressRule>)
//  .tls(java.util.List<IngressTls>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `defaultBackend`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressProps.parameter.defaultBackend"></a>

- *Type:* [`org.cdk8s.plus27.IngressBackend`](#org.cdk8s.plus27.IngressBackend)

The default backend services requests that do not match any rule.

Using this option or the `addDefaultBackend()` method is equivalent to
adding a rule with both `path` and `host` undefined.

---

##### `rules`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressProps.parameter.rules"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.IngressRule`](#org.cdk8s.plus27.IngressRule)>

Routing rules for this ingress.

Each rule must define an `IngressBackend` that will receive the requests
that match this rule. If both `host` and `path` are not specifiec, this
backend will be used as the default backend of the ingress.

You can also add rules later using `addRule()`, `addHostRule()`,
`addDefaultBackend()` and `addHostDefaultBackend()`.

---

##### `tls`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressProps.parameter.tls"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.IngressTls`](#org.cdk8s.plus27.IngressTls)>

TLS settings for this ingress.

Using this option tells the ingress controller to expose a TLS endpoint.
Currently the Ingress only supports a single TLS port, 443. If multiple
members of this list specify different hosts, they will be multiplexed on
the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI.

---

#### Methods <a name="Methods"></a>

##### `addDefaultBackend` <a name="org.cdk8s.plus27.Ingress.addDefaultBackend"></a>

```java
public addDefaultBackend(IngressBackend backend)
```

###### `backend`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.backend"></a>

- *Type:* [`org.cdk8s.plus27.IngressBackend`](#org.cdk8s.plus27.IngressBackend)

The backend to use for requests that do not match any rule.

---

##### `addHostDefaultBackend` <a name="org.cdk8s.plus27.Ingress.addHostDefaultBackend"></a>

```java
public addHostDefaultBackend(java.lang.String host, IngressBackend backend)
```

###### `host`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.host"></a>

- *Type:* `java.lang.String`

The host name to match.

---

###### `backend`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.backend"></a>

- *Type:* [`org.cdk8s.plus27.IngressBackend`](#org.cdk8s.plus27.IngressBackend)

The backend to route to.

---

##### `addHostRule` <a name="org.cdk8s.plus27.Ingress.addHostRule"></a>

```java
public addHostRule(java.lang.String host, java.lang.String path, IngressBackend backend)
public addHostRule(java.lang.String host, java.lang.String path, IngressBackend backend, HttpIngressPathType pathType)
```

###### `host`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.host"></a>

- *Type:* `java.lang.String`

The host name.

---

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.path"></a>

- *Type:* `java.lang.String`

The HTTP path.

---

###### `backend`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.backend"></a>

- *Type:* [`org.cdk8s.plus27.IngressBackend`](#org.cdk8s.plus27.IngressBackend)

The backend to route requests to.

---

###### `pathType`<sup>Optional</sup> <a name="org.cdk8s.plus27.Ingress.parameter.pathType"></a>

- *Type:* [`org.cdk8s.plus27.HttpIngressPathType`](#org.cdk8s.plus27.HttpIngressPathType)

How the path is matched against request paths.

---

##### `addRule` <a name="org.cdk8s.plus27.Ingress.addRule"></a>

```java
public addRule(java.lang.String path, IngressBackend backend)
public addRule(java.lang.String path, IngressBackend backend, HttpIngressPathType pathType)
```

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.path"></a>

- *Type:* `java.lang.String`

The HTTP path.

---

###### `backend`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.backend"></a>

- *Type:* [`org.cdk8s.plus27.IngressBackend`](#org.cdk8s.plus27.IngressBackend)

The backend to route requests to.

---

###### `pathType`<sup>Optional</sup> <a name="org.cdk8s.plus27.Ingress.parameter.pathType"></a>

- *Type:* [`org.cdk8s.plus27.HttpIngressPathType`](#org.cdk8s.plus27.HttpIngressPathType)

How the path is matched against request paths.

---

##### `addRules` <a name="org.cdk8s.plus27.Ingress.addRules"></a>

```java
public addRules(IngressRule rules)
```

###### `rules`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.rules"></a>

- *Type:* [`org.cdk8s.plus27.IngressRule`](#org.cdk8s.plus27.IngressRule)

The rules to add.

---

##### `addTls` <a name="org.cdk8s.plus27.Ingress.addTls"></a>

```java
public addTls(java.util.List<IngressTls> tls)
```

###### `tls`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.parameter.tls"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.IngressTls`](#org.cdk8s.plus27.IngressTls)>

---


#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.Ingress.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---


### Job <a name="org.cdk8s.plus27.Job"></a>

A Job creates one or more Pods and ensures that a specified number of them successfully terminate.

As pods successfully complete,
the Job tracks the successful completions. When a specified number of successful completions is reached, the task (ie, Job) is complete.
Deleting a Job will clean up the Pods it created. A simple case is to create one Job object in order to reliably run one Pod to completion.
The Job object will start a new Pod if the first Pod fails or is deleted (for example due to a node hardware failure or a node reboot).
You can also use a Job to run multiple Pods in parallel.

#### Initializers <a name="org.cdk8s.plus27.Job.Initializer"></a>

```java
import org.cdk8s.plus27.Job;

Job.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
//  .activeDeadline(Duration)
//  .backoffLimit(java.lang.Number)
//  .ttlAfterFinished(Duration)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Job.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Job.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.automountServiceAccountToken"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.dns"></a>

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.dockerRegistryAuth"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.hostAliases"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.hostNetwork"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.initContainers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.isolate"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.securityContext"></a>

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.terminationGracePeriod"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.select"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.spread"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `activeDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.activeDeadline"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoffLimit`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.backoffLimit"></a>

- *Type:* `java.lang.Number`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.parameter.ttlAfterFinished"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* If this field is unset, the Job won't be automatically deleted.

Limits the lifetime of a Job that has finished execution (either Complete or Failed).

If this field is set, after the Job finishes, it is eligible to
be automatically deleted. When the Job is being deleted, its lifecycle
guarantees (e.g. finalizers) will be honored. If this field is set to zero,
the Job becomes eligible to be deleted immediately after it finishes. This
field is alpha-level and is only honored by servers that enable the
`TTLAfterFinished` feature.

---



#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.Job.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `activeDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus27.Job.property.activeDeadline"></a>

```java
public Duration getActiveDeadline();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)

Duration before job is terminated.

If undefined, there is no deadline.

---

##### `backoffLimit`<sup>Optional</sup> <a name="org.cdk8s.plus27.Job.property.backoffLimit"></a>

```java
public java.lang.Number getBackoffLimit();
```

- *Type:* `java.lang.Number`

Number of retries before marking failed.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="org.cdk8s.plus27.Job.property.ttlAfterFinished"></a>

```java
public Duration getTtlAfterFinished();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)

TTL before the job is deleted after it is finished.

---


### Namespace <a name="org.cdk8s.plus27.Namespace"></a>

- *Implements:* [`org.cdk8s.plus27.INamespaceSelector`](#org.cdk8s.plus27.INamespaceSelector), [`org.cdk8s.plus27.INetworkPolicyPeer`](#org.cdk8s.plus27.INetworkPolicyPeer)

In Kubernetes, namespaces provides a mechanism for isolating groups of resources within a single cluster.

Names of resources need to be unique within a namespace, but not across namespaces.
Namespace-based scoping is applicable only for namespaced objects (e.g. Deployments, Services, etc) and
not for cluster-wide objects (e.g. StorageClass, Nodes, PersistentVolumes, etc).

#### Initializers <a name="org.cdk8s.plus27.Namespace.Initializer"></a>

```java
import org.cdk8s.plus27.Namespace;

Namespace.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Namespace.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Namespace.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.NamespaceProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

#### Methods <a name="Methods"></a>

##### `toNamespaceSelectorConfig` <a name="org.cdk8s.plus27.Namespace.toNamespaceSelectorConfig"></a>

```java
public toNamespaceSelectorConfig()
```

##### `toNetworkPolicyPeerConfig` <a name="org.cdk8s.plus27.Namespace.toNetworkPolicyPeerConfig"></a>

```java
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="org.cdk8s.plus27.Namespace.toPodSelector"></a>

```java
public toPodSelector()
```


#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.Namespace.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

#### Constants <a name="Constants"></a>

##### `NAME_LABEL` <a name="org.cdk8s.plus27.Namespace.property.NAME_LABEL"></a>

- *Type:* `java.lang.String`

> https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#automatic-labelling

---

### Namespaces <a name="org.cdk8s.plus27.Namespaces"></a>

- *Implements:* [`org.cdk8s.plus27.INamespaceSelector`](#org.cdk8s.plus27.INamespaceSelector), [`org.cdk8s.plus27.INetworkPolicyPeer`](#org.cdk8s.plus27.INetworkPolicyPeer)

Represents a group of namespaces.

#### Initializers <a name="org.cdk8s.plus27.Namespaces.Initializer"></a>

```java
import org.cdk8s.plus27.Namespaces;

new Namespaces(Construct scope, java.lang.String id);
new Namespaces(Construct scope, java.lang.String id, java.util.List<LabelExpression> expressions);
new Namespaces(Construct scope, java.lang.String id, java.util.List<LabelExpression> expressions, java.util.List<java.lang.String> names);
new Namespaces(Construct scope, java.lang.String id, java.util.List<LabelExpression> expressions, java.util.List<java.lang.String> names, java.util.Map<java.lang.String, java.lang.String> labels);
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Namespaces.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Namespaces.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `expressions`<sup>Optional</sup> <a name="org.cdk8s.plus27.Namespaces.parameter.expressions"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.LabelExpression`](#org.cdk8s.plus27.LabelExpression)>

---

##### `names`<sup>Optional</sup> <a name="org.cdk8s.plus27.Namespaces.parameter.names"></a>

- *Type:* java.util.List<`java.lang.String`>

---

##### `labels`<sup>Optional</sup> <a name="org.cdk8s.plus27.Namespaces.parameter.labels"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

---

#### Methods <a name="Methods"></a>

##### `toNamespaceSelectorConfig` <a name="org.cdk8s.plus27.Namespaces.toNamespaceSelectorConfig"></a>

```java
public toNamespaceSelectorConfig()
```

##### `toNetworkPolicyPeerConfig` <a name="org.cdk8s.plus27.Namespaces.toNetworkPolicyPeerConfig"></a>

```java
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="org.cdk8s.plus27.Namespaces.toPodSelector"></a>

```java
public toPodSelector()
```

#### Static Functions <a name="Static Functions"></a>

##### `all` <a name="org.cdk8s.plus27.Namespaces.all"></a>

```java
import org.cdk8s.plus27.Namespaces;

Namespaces.all(Construct scope, java.lang.String id)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Namespaces.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Namespaces.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `select` <a name="org.cdk8s.plus27.Namespaces.select"></a>

```java
import org.cdk8s.plus27.Namespaces;

Namespaces.select(Construct scope, java.lang.String id, NamespacesSelectOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Namespaces.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Namespaces.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Namespaces.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.NamespacesSelectOptions`](#org.cdk8s.plus27.NamespacesSelectOptions)

---



### NetworkPolicy <a name="org.cdk8s.plus27.NetworkPolicy"></a>

Control traffic flow at the IP address or port level (OSI layer 3 or 4), network policies are an application-centric construct which allow you to specify how a pod is allowed to communicate with various network peers.

* Outgoing traffic is allowed if there are no network policies selecting
  the pod (and cluster policy otherwise allows the traffic),
  OR if the traffic matches at least one egress rule across all of the
  network policies that select the pod.
* Incoming traffic is allowed to a pod if there are no network policies
  selecting the pod (and cluster policy otherwise allows the traffic),
  OR if the traffic source is the pod's local node,
  OR if the traffic matches at least one ingress rule across all of
  the network policies that select the pod.

Network policies do not conflict; they are additive.
If any policy or policies apply to a given pod for a given
direction, the connections allowed in that direction from
that pod is the union of what the applicable policies allow.
Thus, order of evaluation does not affect the policy result.

For a connection from a source pod to a destination pod to be allowed,
both the egress policy on the source pod and the ingress policy on the
destination pod need to allow the connection.
If either side does not allow the connection, it will not happen.

> https://kubernetes.io/docs/concepts/services-networking/network-policies/#networkpolicy-resource

#### Initializers <a name="org.cdk8s.plus27.NetworkPolicy.Initializer"></a>

```java
import org.cdk8s.plus27.NetworkPolicy;

NetworkPolicy.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .egress(NetworkPolicyTraffic)
//  .ingress(NetworkPolicyTraffic)
//  .selector(IPodSelector)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicy.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicy.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `egress`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyProps.parameter.egress"></a>

- *Type:* [`org.cdk8s.plus27.NetworkPolicyTraffic`](#org.cdk8s.plus27.NetworkPolicyTraffic)
- *Default:* the policy doesn't change egress behavior of the pods it selects.

Egress traffic configuration.

---

##### `ingress`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyProps.parameter.ingress"></a>

- *Type:* [`org.cdk8s.plus27.NetworkPolicyTraffic`](#org.cdk8s.plus27.NetworkPolicyTraffic)
- *Default:* the policy doesn't change ingress behavior of the pods it selects.

Ingress traffic configuration.

---

##### `selector`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyProps.parameter.selector"></a>

- *Type:* [`org.cdk8s.plus27.IPodSelector`](#org.cdk8s.plus27.IPodSelector)
- *Default:* will select all pods in the namespace of the policy.

Which pods does this policy object applies to.

This can either be a single pod / workload, or a grouping of pods selected
via the `Pods.select` function. Rules is applied to any pods selected by this property.
Multiple network policies can select the same set of pods.
In this case, the rules for each are combined additively.

Note that

---

#### Methods <a name="Methods"></a>

##### `addEgressRule` <a name="org.cdk8s.plus27.NetworkPolicy.addEgressRule"></a>

```java
public addEgressRule(INetworkPolicyPeer peer)
public addEgressRule(INetworkPolicyPeer peer, java.util.List<NetworkPolicyPort> ports)
```

###### `peer`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicy.parameter.peer"></a>

- *Type:* [`org.cdk8s.plus27.INetworkPolicyPeer`](#org.cdk8s.plus27.INetworkPolicyPeer)

---

###### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicy.parameter.ports"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.NetworkPolicyPort`](#org.cdk8s.plus27.NetworkPolicyPort)>

---

##### `addIngressRule` <a name="org.cdk8s.plus27.NetworkPolicy.addIngressRule"></a>

```java
public addIngressRule(INetworkPolicyPeer peer)
public addIngressRule(INetworkPolicyPeer peer, java.util.List<NetworkPolicyPort> ports)
```

###### `peer`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicy.parameter.peer"></a>

- *Type:* [`org.cdk8s.plus27.INetworkPolicyPeer`](#org.cdk8s.plus27.INetworkPolicyPeer)

---

###### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicy.parameter.ports"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.NetworkPolicyPort`](#org.cdk8s.plus27.NetworkPolicyPort)>

---


#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicy.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---


### NetworkPolicyIpBlock <a name="org.cdk8s.plus27.NetworkPolicyIpBlock"></a>

- *Implements:* [`org.cdk8s.plus27.INetworkPolicyPeer`](#org.cdk8s.plus27.INetworkPolicyPeer)

Describes a particular CIDR (Ex.

"192.168.1.1/24","2001:db9::/64") that is
allowed to the pods matched by a network policy selector.
The except entry describes CIDRs that should not be included within this rule.

#### Methods <a name="Methods"></a>

##### `toNetworkPolicyPeerConfig` <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.toNetworkPolicyPeerConfig"></a>

```java
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.toPodSelector"></a>

```java
public toPodSelector()
```

#### Static Functions <a name="Static Functions"></a>

##### `anyIpv4` <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.anyIpv4"></a>

```java
import org.cdk8s.plus27.NetworkPolicyIpBlock;

NetworkPolicyIpBlock.anyIpv4(Construct scope, java.lang.String id)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `anyIpv6` <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.anyIpv6"></a>

```java
import org.cdk8s.plus27.NetworkPolicyIpBlock;

NetworkPolicyIpBlock.anyIpv6(Construct scope, java.lang.String id)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `ipv4` <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.ipv4"></a>

```java
import org.cdk8s.plus27.NetworkPolicyIpBlock;

NetworkPolicyIpBlock.ipv4(Construct scope, java.lang.String id, java.lang.String cidrIp)
NetworkPolicyIpBlock.ipv4(Construct scope, java.lang.String id, java.lang.String cidrIp, java.util.List<java.lang.String> except)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `cidrIp`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.cidrIp"></a>

- *Type:* `java.lang.String`

---

###### `except`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.except"></a>

- *Type:* java.util.List<`java.lang.String`>

---

##### `ipv6` <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.ipv6"></a>

```java
import org.cdk8s.plus27.NetworkPolicyIpBlock;

NetworkPolicyIpBlock.ipv6(Construct scope, java.lang.String id, java.lang.String cidrIp)
NetworkPolicyIpBlock.ipv6(Construct scope, java.lang.String id, java.lang.String cidrIp, java.util.List<java.lang.String> except)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `cidrIp`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.cidrIp"></a>

- *Type:* `java.lang.String`

---

###### `except`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.parameter.except"></a>

- *Type:* java.util.List<`java.lang.String`>

---

#### Properties <a name="Properties"></a>

##### `cidr`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.property.cidr"></a>

```java
public java.lang.String getCidr();
```

- *Type:* `java.lang.String`

A string representing the IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64".

---

##### `except`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyIpBlock.property.except"></a>

```java
public java.util.List<java.lang.String> getExcept();
```

- *Type:* java.util.List<`java.lang.String`>

A slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64". Except values will be rejected if they are outside the CIDR range.

---


### PersistentVolume <a name="org.cdk8s.plus27.PersistentVolume"></a>

- *Implements:* [`org.cdk8s.plus27.IPersistentVolume`](#org.cdk8s.plus27.IPersistentVolume), [`org.cdk8s.plus27.IStorage`](#org.cdk8s.plus27.IStorage)

A PersistentVolume (PV) is a piece of storage in the cluster that has been provisioned by an administrator or dynamically provisioned using Storage Classes.

It is a resource in the cluster just like a node is a cluster resource.
PVs are volume plugins like Volumes, but have a lifecycle independent of any
individual Pod that uses the PV. This API object captures the details of the
implementation of the storage, be that NFS, iSCSI, or a
cloud-provider-specific storage system.

#### Initializers <a name="org.cdk8s.plus27.PersistentVolume.Initializer"></a>

```java
import org.cdk8s.plus27.PersistentVolume;

PersistentVolume.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .accessModes(java.util.List<PersistentVolumeAccessMode>)
//  .claim(IPersistentVolumeClaim)
//  .mountOptions(java.util.List<java.lang.String>)
//  .reclaimPolicy(PersistentVolumeReclaimPolicy)
//  .storage(Size)
//  .storageClassName(java.lang.String)
//  .volumeMode(PersistentVolumeMode)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolume.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.parameter.accessModes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.parameter.claim"></a>

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.parameter.mountOptions"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.parameter.reclaimPolicy"></a>

- *Type:* [`org.cdk8s.plus27.PersistentVolumeReclaimPolicy`](#org.cdk8s.plus27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.parameter.storage"></a>

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.parameter.storageClassName"></a>

- *Type:* `java.lang.String`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.parameter.volumeMode"></a>

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

#### Methods <a name="Methods"></a>

##### `asVolume` <a name="org.cdk8s.plus27.PersistentVolume.asVolume"></a>

```java
public asVolume()
```

##### `bind` <a name="org.cdk8s.plus27.PersistentVolume.bind"></a>

```java
public bind(IPersistentVolumeClaim claim)
```

###### `claim`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolume.parameter.claim"></a>

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)

The PVC to bind to.

---

##### `reserve` <a name="org.cdk8s.plus27.PersistentVolume.reserve"></a>

```java
public reserve()
```

#### Static Functions <a name="Static Functions"></a>

##### `fromPersistentVolumeName` <a name="org.cdk8s.plus27.PersistentVolume.fromPersistentVolumeName"></a>

```java
import org.cdk8s.plus27.PersistentVolume;

PersistentVolume.fromPersistentVolumeName(Construct scope, java.lang.String id, java.lang.String volumeName)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `volumeName`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolume.parameter.volumeName"></a>

- *Type:* `java.lang.String`

---

#### Properties <a name="Properties"></a>

##### `mode`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolume.property.mode"></a>

```java
public PersistentVolumeMode getMode();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)

Volume mode of this volume.

---

##### `reclaimPolicy`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolume.property.reclaimPolicy"></a>

```java
public PersistentVolumeReclaimPolicy getReclaimPolicy();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeReclaimPolicy`](#org.cdk8s.plus27.PersistentVolumeReclaimPolicy)

Reclaim policy of this volume.

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolume.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolume.property.accessModes"></a>

```java
public java.util.List<PersistentVolumeAccessMode> getAccessModes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>

Access modes requirement of this claim.

---

##### `claim`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolume.property.claim"></a>

```java
public IPersistentVolumeClaim getClaim();
```

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)

PVC this volume is bound to.

Undefined means this volume is not yet
claimed by any PVC.

---

##### `mountOptions`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolume.property.mountOptions"></a>

```java
public java.util.List<java.lang.String> getMountOptions();
```

- *Type:* java.util.List<`java.lang.String`>

Mount options of this volume.

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolume.property.storage"></a>

```java
public Size getStorage();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)

Storage size of this volume.

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolume.property.storageClassName"></a>

```java
public java.lang.String getStorageClassName();
```

- *Type:* `java.lang.String`

Storage class this volume belongs to.

---


### PersistentVolumeClaim <a name="org.cdk8s.plus27.PersistentVolumeClaim"></a>

- *Implements:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)

A PersistentVolumeClaim (PVC) is a request for storage by a user.

It is similar to a Pod. Pods consume node resources and PVCs consume PV resources.
Pods can request specific levels of resources (CPU and Memory).
Claims can request specific size and access modes

#### Initializers <a name="org.cdk8s.plus27.PersistentVolumeClaim.Initializer"></a>

```java
import org.cdk8s.plus27.PersistentVolumeClaim;

PersistentVolumeClaim.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .accessModes(java.util.List<PersistentVolumeAccessMode>)
//  .storage(Size)
//  .storageClassName(java.lang.String)
//  .volume(IPersistentVolume)
//  .volumeMode(PersistentVolumeMode)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.parameter.accessModes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>
- *Default:* No access modes requirement.

Contains the access modes the volume should support.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.parameter.storage"></a>

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* No storage requirement.

Minimum storage size the volume should have.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.parameter.storageClassName"></a>

- *Type:* `java.lang.String`
- *Default:* Not set.

Name of the StorageClass required by the claim. When this property is not set, the behavior is as follows:.

* If the admission plugin is turned on, the storage class marked as default will be used.
* If the admission plugin is turned off, the pvc can only be bound to volumes without a storage class.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1

---

##### `volume`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.parameter.volume"></a>

- *Type:* [`org.cdk8s.plus27.IPersistentVolume`](#org.cdk8s.plus27.IPersistentVolume)
- *Default:* No specific volume binding.

The PersistentVolume backing this claim.

The control plane still checks that storage class, access modes,
and requested storage size on the volume are valid.

Note that in order to guarantee a proper binding, the volume should
also define a `claimRef` referring to this claim. Otherwise, the volume may be
claimed be other pvc's before it gets a chance to bind to this one.

If the volume is managed (i.e not imported), you can use `pv.claim()` to easily
create a bi-directional bounded claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#binding.

---

##### `volumeMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.parameter.volumeMode"></a>

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

#### Methods <a name="Methods"></a>

##### `bind` <a name="org.cdk8s.plus27.PersistentVolumeClaim.bind"></a>

```java
public bind(IPersistentVolume vol)
```

###### `vol`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.parameter.vol"></a>

- *Type:* [`org.cdk8s.plus27.IPersistentVolume`](#org.cdk8s.plus27.IPersistentVolume)

The PV to bind to.

---

#### Static Functions <a name="Static Functions"></a>

##### `fromClaimName` <a name="org.cdk8s.plus27.PersistentVolumeClaim.fromClaimName"></a>

```java
import org.cdk8s.plus27.PersistentVolumeClaim;

PersistentVolumeClaim.fromClaimName(Construct scope, java.lang.String id, java.lang.String claimName)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `claimName`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.parameter.claimName"></a>

- *Type:* `java.lang.String`

---

#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `volumeMode`<sup>Required</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.property.volumeMode"></a>

```java
public PersistentVolumeMode getVolumeMode();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)

Volume mode requirement of this claim.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.property.accessModes"></a>

```java
public java.util.List<PersistentVolumeAccessMode> getAccessModes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>

Access modes requirement of this claim.

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.property.storage"></a>

```java
public Size getStorage();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)

Storage requirement of this claim.

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.property.storageClassName"></a>

```java
public java.lang.String getStorageClassName();
```

- *Type:* `java.lang.String`

Storage class requirment of this claim.

---

##### `volume`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaim.property.volume"></a>

```java
public IPersistentVolume getVolume();
```

- *Type:* [`org.cdk8s.plus27.IPersistentVolume`](#org.cdk8s.plus27.IPersistentVolume)

PV this claim is bound to.

Undefined means the claim is not bound
to any specific volume.

---


### Pod <a name="org.cdk8s.plus27.Pod"></a>

Pod is a collection of containers that can run on a host.

This resource is
created by clients and scheduled onto hosts.

#### Initializers <a name="org.cdk8s.plus27.Pod.Initializer"></a>

```java
import org.cdk8s.plus27.Pod;

Pod.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Pod.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Pod.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.automountServiceAccountToken"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.dns"></a>

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.dockerRegistryAuth"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.hostAliases"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.hostNetwork"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.initContainers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.isolate"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.securityContext"></a>

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.terminationGracePeriod"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---



#### Properties <a name="Properties"></a>

##### `connections`<sup>Required</sup> <a name="org.cdk8s.plus27.Pod.property.connections"></a>

```java
public PodConnections getConnections();
```

- *Type:* [`org.cdk8s.plus27.PodConnections`](#org.cdk8s.plus27.PodConnections)

---

##### `podMetadata`<sup>Required</sup> <a name="org.cdk8s.plus27.Pod.property.podMetadata"></a>

```java
public ApiObjectMetadataDefinition getPodMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadataDefinition`](#org.cdk8s.ApiObjectMetadataDefinition)

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.Pod.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `scheduling`<sup>Required</sup> <a name="org.cdk8s.plus27.Pod.property.scheduling"></a>

```java
public PodScheduling getScheduling();
```

- *Type:* [`org.cdk8s.plus27.PodScheduling`](#org.cdk8s.plus27.PodScheduling)

---

#### Constants <a name="Constants"></a>

##### `ADDRESS_LABEL` <a name="org.cdk8s.plus27.Pod.property.ADDRESS_LABEL"></a>

- *Type:* `java.lang.String`

This label is autoamtically added by cdk8s to any pod.

It provides
a unique and stable identifier for the pod.

---

### Pods <a name="org.cdk8s.plus27.Pods"></a>

- *Implements:* [`org.cdk8s.plus27.IPodSelector`](#org.cdk8s.plus27.IPodSelector)

Represents a group of pods.

#### Initializers <a name="org.cdk8s.plus27.Pods.Initializer"></a>

```java
import org.cdk8s.plus27.Pods;

new Pods(Construct scope, java.lang.String id);
new Pods(Construct scope, java.lang.String id, java.util.List<LabelExpression> expressions);
new Pods(Construct scope, java.lang.String id, java.util.List<LabelExpression> expressions, java.util.Map<java.lang.String, java.lang.String> labels);
new Pods(Construct scope, java.lang.String id, java.util.List<LabelExpression> expressions, java.util.Map<java.lang.String, java.lang.String> labels, INamespaceSelector namespaces);
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Pods.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Pods.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `expressions`<sup>Optional</sup> <a name="org.cdk8s.plus27.Pods.parameter.expressions"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.LabelExpression`](#org.cdk8s.plus27.LabelExpression)>

---

##### `labels`<sup>Optional</sup> <a name="org.cdk8s.plus27.Pods.parameter.labels"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

---

##### `namespaces`<sup>Optional</sup> <a name="org.cdk8s.plus27.Pods.parameter.namespaces"></a>

- *Type:* [`org.cdk8s.plus27.INamespaceSelector`](#org.cdk8s.plus27.INamespaceSelector)

---

#### Methods <a name="Methods"></a>

##### `toNetworkPolicyPeerConfig` <a name="org.cdk8s.plus27.Pods.toNetworkPolicyPeerConfig"></a>

```java
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="org.cdk8s.plus27.Pods.toPodSelector"></a>

```java
public toPodSelector()
```

##### `toPodSelectorConfig` <a name="org.cdk8s.plus27.Pods.toPodSelectorConfig"></a>

```java
public toPodSelectorConfig()
```

#### Static Functions <a name="Static Functions"></a>

##### `all` <a name="org.cdk8s.plus27.Pods.all"></a>

```java
import org.cdk8s.plus27.Pods;

Pods.all(Construct scope, java.lang.String id)
Pods.all(Construct scope, java.lang.String id, PodsAllOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Pods.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Pods.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Pods.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.PodsAllOptions`](#org.cdk8s.plus27.PodsAllOptions)

---

##### `select` <a name="org.cdk8s.plus27.Pods.select"></a>

```java
import org.cdk8s.plus27.Pods;

Pods.select(Construct scope, java.lang.String id, PodsSelectOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Pods.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Pods.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Pods.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.PodsSelectOptions`](#org.cdk8s.plus27.PodsSelectOptions)

---



### Resource <a name="org.cdk8s.plus27.Resource"></a>

- *Implements:* [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource), [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource), [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

Base class for all Kubernetes objects in stdk8s.

Represents a single
resource.

#### Initializers <a name="org.cdk8s.plus27.Resource.Initializer"></a>

```java
import org.cdk8s.plus27.Resource;

new Resource(Construct scope, java.lang.String id);
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Resource.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Resource.parameter.id"></a>

- *Type:* `java.lang.String`

---

#### Methods <a name="Methods"></a>

##### `asApiResource` <a name="org.cdk8s.plus27.Resource.asApiResource"></a>

```java
public asApiResource()
```

##### `asNonApiResource` <a name="org.cdk8s.plus27.Resource.asNonApiResource"></a>

```java
public asNonApiResource()
```


#### Properties <a name="Properties"></a>

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.Resource.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. "authorization.k8s.io").

---

##### `apiVersion`<sup>Required</sup> <a name="org.cdk8s.plus27.Resource.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.Resource.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

The object kind (e.g. "Deployment").

---

##### `metadata`<sup>Required</sup> <a name="org.cdk8s.plus27.Resource.property.metadata"></a>

```java
public ApiObjectMetadataDefinition getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadataDefinition`](#org.cdk8s.ApiObjectMetadataDefinition)

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Resource.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The name of this API object.

---

##### `permissions`<sup>Required</sup> <a name="org.cdk8s.plus27.Resource.property.permissions"></a>

```java
public ResourcePermissions getPermissions();
```

- *Type:* [`org.cdk8s.plus27.ResourcePermissions`](#org.cdk8s.plus27.ResourcePermissions)

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.Resource.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `resourceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.Resource.property.resourceName"></a>

```java
public java.lang.String getResourceName();
```

- *Type:* `java.lang.String`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---


### Role <a name="org.cdk8s.plus27.Role"></a>

- *Implements:* [`org.cdk8s.plus27.IRole`](#org.cdk8s.plus27.IRole)

Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.

#### Initializers <a name="org.cdk8s.plus27.Role.Initializer"></a>

```java
import org.cdk8s.plus27.Role;

Role.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .rules(java.util.List<RolePolicyRule>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.RoleProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `rules`<sup>Optional</sup> <a name="org.cdk8s.plus27.RoleProps.parameter.rules"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.RolePolicyRule`](#org.cdk8s.plus27.RolePolicyRule)>
- *Default:* []

A list of rules the role should allow.

---

#### Methods <a name="Methods"></a>

##### `allow` <a name="org.cdk8s.plus27.Role.allow"></a>

```java
public allow(java.util.List<java.lang.String> verbs, IApiResource resources)
```

###### `verbs`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.verbs"></a>

- *Type:* java.util.List<`java.lang.String`>

---

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `allowCreate` <a name="org.cdk8s.plus27.Role.allowCreate"></a>

```java
public allowCreate(IApiResource resources)
```

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `allowDelete` <a name="org.cdk8s.plus27.Role.allowDelete"></a>

```java
public allowDelete(IApiResource resources)
```

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `allowDeleteCollection` <a name="org.cdk8s.plus27.Role.allowDeleteCollection"></a>

```java
public allowDeleteCollection(IApiResource resources)
```

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `allowGet` <a name="org.cdk8s.plus27.Role.allowGet"></a>

```java
public allowGet(IApiResource resources)
```

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `allowList` <a name="org.cdk8s.plus27.Role.allowList"></a>

```java
public allowList(IApiResource resources)
```

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `allowPatch` <a name="org.cdk8s.plus27.Role.allowPatch"></a>

```java
public allowPatch(IApiResource resources)
```

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `allowRead` <a name="org.cdk8s.plus27.Role.allowRead"></a>

```java
public allowRead(IApiResource resources)
```

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `allowReadWrite` <a name="org.cdk8s.plus27.Role.allowReadWrite"></a>

```java
public allowReadWrite(IApiResource resources)
```

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `allowUpdate` <a name="org.cdk8s.plus27.Role.allowUpdate"></a>

```java
public allowUpdate(IApiResource resources)
```

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `allowWatch` <a name="org.cdk8s.plus27.Role.allowWatch"></a>

```java
public allowWatch(IApiResource resources)
```

###### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

The resource(s) to apply to.

---

##### `bind` <a name="org.cdk8s.plus27.Role.bind"></a>

```java
public bind(ISubject subjects)
```

###### `subjects`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.subjects"></a>

- *Type:* [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

a list of subjects to bind to.

---

#### Static Functions <a name="Static Functions"></a>

##### `fromRoleName` <a name="org.cdk8s.plus27.Role.fromRoleName"></a>

```java
import org.cdk8s.plus27.Role;

Role.fromRoleName(Construct scope, java.lang.String id, java.lang.String name)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.parameter.name"></a>

- *Type:* `java.lang.String`

---

#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `rules`<sup>Required</sup> <a name="org.cdk8s.plus27.Role.property.rules"></a>

```java
public java.util.List<RolePolicyRule> getRules();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.RolePolicyRule`](#org.cdk8s.plus27.RolePolicyRule)>

Rules associaated with this Role.

Returns a copy, use `allow` to add rules.

---


### RoleBinding <a name="org.cdk8s.plus27.RoleBinding"></a>

A RoleBinding grants permissions within a specific namespace to a user or set of users.

#### Initializers <a name="org.cdk8s.plus27.RoleBinding.Initializer"></a>

```java
import org.cdk8s.plus27.RoleBinding;

RoleBinding.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
    .role(IRole)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.RoleBinding.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.RoleBinding.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.RoleBindingProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `role`<sup>Required</sup> <a name="org.cdk8s.plus27.RoleBindingProps.parameter.role"></a>

- *Type:* [`org.cdk8s.plus27.IRole`](#org.cdk8s.plus27.IRole)

The role to bind to.

A RoleBinding can reference a Role or a ClusterRole.

---

#### Methods <a name="Methods"></a>

##### `addSubjects` <a name="org.cdk8s.plus27.RoleBinding.addSubjects"></a>

```java
public addSubjects(ISubject subjects)
```

###### `subjects`<sup>Required</sup> <a name="org.cdk8s.plus27.RoleBinding.parameter.subjects"></a>

- *Type:* [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

The subjects to add.

---


#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.RoleBinding.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `role`<sup>Required</sup> <a name="org.cdk8s.plus27.RoleBinding.property.role"></a>

```java
public IRole getRole();
```

- *Type:* [`org.cdk8s.plus27.IRole`](#org.cdk8s.plus27.IRole)

---

##### `subjects`<sup>Required</sup> <a name="org.cdk8s.plus27.RoleBinding.property.subjects"></a>

```java
public java.util.List<ISubject> getSubjects();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)>

---


### Secret <a name="org.cdk8s.plus27.Secret"></a>

- *Implements:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)

Kubernetes Secrets let you store and manage sensitive information, such as passwords, OAuth tokens, and ssh keys.

Storing confidential information in a
Secret is safer and more flexible than putting it verbatim in a Pod
definition or in a container image.

> https://kubernetes.io/docs/concepts/configuration/secret

#### Initializers <a name="org.cdk8s.plus27.Secret.Initializer"></a>

```java
import org.cdk8s.plus27.Secret;

Secret.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
//  .stringData(java.util.Map<java.lang.String, java.lang.String>)
//  .type(java.lang.String)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretProps.parameter.immutable"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `stringData`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretProps.parameter.stringData"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

stringData allows specifying non-binary secret data in string form.

It is
provided as a write-only convenience method. All keys and values are merged
into the data field on write, overwriting any existing values. It is never
output when reading from the API.

---

##### `type`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretProps.parameter.type"></a>

- *Type:* `java.lang.String`
- *Default:* undefined - Don't set a type.

Optional type associated with the secret.

Used to facilitate programmatic
handling of secret data by various controllers.

---

#### Methods <a name="Methods"></a>

##### `addStringData` <a name="org.cdk8s.plus27.Secret.addStringData"></a>

```java
public addStringData(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.parameter.key"></a>

- *Type:* `java.lang.String`

Key.

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.parameter.value"></a>

- *Type:* `java.lang.String`

Value.

---

##### `envValue` <a name="org.cdk8s.plus27.Secret.envValue"></a>

```java
public envValue(java.lang.String key)
public envValue(java.lang.String key, EnvValueFromSecretOptions options)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Secret.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.EnvValueFromSecretOptions`](#org.cdk8s.plus27.EnvValueFromSecretOptions)

---

##### `getStringData` <a name="org.cdk8s.plus27.Secret.getStringData"></a>

```java
public getStringData(java.lang.String key)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.parameter.key"></a>

- *Type:* `java.lang.String`

Key.

---

#### Static Functions <a name="Static Functions"></a>

##### `fromSecretName` <a name="org.cdk8s.plus27.Secret.fromSecretName"></a>

```java
import org.cdk8s.plus27.Secret;

Secret.fromSecretName(Construct scope, java.lang.String id, java.lang.String name)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.parameter.name"></a>

- *Type:* `java.lang.String`

---

#### Properties <a name="Properties"></a>

##### `immutable`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.property.immutable"></a>

```java
public java.lang.Boolean getImmutable();
```

- *Type:* `java.lang.Boolean`

Whether or not the secret is immutable.

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.Secret.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---


### Service <a name="org.cdk8s.plus27.Service"></a>

An abstract way to expose an application running on a set of Pods as a network service.

With Kubernetes you don't need to modify your application to use an unfamiliar service discovery mechanism.
Kubernetes gives Pods their own IP addresses and a single DNS name for a set of Pods, and can load-balance across them.

For example, consider a stateless image-processing backend which is running with 3 replicas. Those replicas are fungible—frontends do not care which backend they use.
While the actual Pods that compose the backend set may change, the frontend clients should not need to be aware of that,
nor should they need to keep track of the set of backends themselves.
The Service abstraction enables this decoupling.

If you're able to use Kubernetes APIs for service discovery in your application, you can query the API server for Endpoints,
that get updated whenever the set of Pods in a Service changes. For non-native applications, Kubernetes offers ways to place a network port
or load balancer in between your application and the backend Pods.

#### Initializers <a name="org.cdk8s.plus27.Service.Initializer"></a>

```java
import org.cdk8s.plus27.Service;

Service.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .clusterIP(java.lang.String)
//  .externalIPs(java.util.List<java.lang.String>)
//  .externalName(java.lang.String)
//  .loadBalancerSourceRanges(java.util.List<java.lang.String>)
//  .ports(java.util.List<ServicePort>)
//  .selector(IPodSelector)
//  .type(ServiceType)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `clusterIP`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.parameter.clusterIP"></a>

- *Type:* `java.lang.String`
- *Default:* Automatically assigned.

The IP address of the service and is usually assigned randomly by the master.

If an address is specified manually and is not in use by others, it
will be allocated to the service; otherwise, creation of the service will
fail. This field can not be changed through updates. Valid values are
"None", empty string (""), or a valid IP address. "None" can be specified
for headless services when proxying is not required. Only applies to types
ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName.

> https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

---

##### `externalIPs`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.parameter.externalIPs"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No external IPs.

A list of IP addresses for which nodes in the cluster will also accept traffic for this service.

These IPs are not managed by Kubernetes. The user
is responsible for ensuring that traffic arrives at a node with this IP. A
common example is external load-balancers that are not part of the
Kubernetes system.

---

##### `externalName`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.parameter.externalName"></a>

- *Type:* `java.lang.String`
- *Default:* No external name.

The externalName to be used when ServiceType.EXTERNAL_NAME is set.

---

##### `loadBalancerSourceRanges`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.parameter.loadBalancerSourceRanges"></a>

- *Type:* java.util.List<`java.lang.String`>

A list of CIDR IP addresses, if specified and supported by the platform, will restrict traffic through the cloud-provider load-balancer to the specified client IPs.

More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.parameter.ports"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ServicePort`](#org.cdk8s.plus27.ServicePort)>
- *Default:* either the selector ports, or none.

The ports this service binds to.

If the selector of the service is a managed pod / workload,
its ports will are automatically extracted and used as the default value.
Otherwise, no ports are bound.

---

##### `selector`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.parameter.selector"></a>

- *Type:* [`org.cdk8s.plus27.IPodSelector`](#org.cdk8s.plus27.IPodSelector)
- *Default:* unset, the service is assumed to have an external process managing
its endpoints, which Kubernetes will not modify.

Which pods should the service select and route to.

You can pass one of the following:

* An instance of `Pod` or any workload resource (e.g `Deployment`, `StatefulSet`, ...)
* Pods selected by the `Pods.select` function. Note that in this case only labels can be specified.

---

##### `type`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.parameter.type"></a>

- *Type:* [`org.cdk8s.plus27.ServiceType`](#org.cdk8s.plus27.ServiceType)
- *Default:* ServiceType.ClusterIP

Determines how the Service is exposed.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

---

#### Methods <a name="Methods"></a>

##### `bind` <a name="org.cdk8s.plus27.Service.bind"></a>

```java
public bind(java.lang.Number port)
public bind(java.lang.Number port, ServiceBindOptions options)
```

###### `port`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.parameter.port"></a>

- *Type:* `java.lang.Number`

The port definition.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Service.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.ServiceBindOptions`](#org.cdk8s.plus27.ServiceBindOptions)

---

##### `exposeViaIngress` <a name="org.cdk8s.plus27.Service.exposeViaIngress"></a>

```java
public exposeViaIngress(java.lang.String path)
public exposeViaIngress(java.lang.String path, ExposeServiceViaIngressOptions options)
```

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.parameter.path"></a>

- *Type:* `java.lang.String`

The path to expose the service under.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Service.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.ExposeServiceViaIngressOptions`](#org.cdk8s.plus27.ExposeServiceViaIngressOptions)

Additional options.

---

##### `select` <a name="org.cdk8s.plus27.Service.select"></a>

```java
public select(IPodSelector selector)
```

###### `selector`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.parameter.selector"></a>

- *Type:* [`org.cdk8s.plus27.IPodSelector`](#org.cdk8s.plus27.IPodSelector)

---

##### `selectLabel` <a name="org.cdk8s.plus27.Service.selectLabel"></a>

```java
public selectLabel(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.parameter.value"></a>

- *Type:* `java.lang.String`

---


#### Properties <a name="Properties"></a>

##### `port`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.property.port"></a>

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`

Return the first port of the service.

---

##### `ports`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.property.ports"></a>

```java
public java.util.List<ServicePort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ServicePort`](#org.cdk8s.plus27.ServicePort)>

Ports for this service.

Use `bind()` to bind additional service ports.

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `type`<sup>Required</sup> <a name="org.cdk8s.plus27.Service.property.type"></a>

```java
public ServiceType getType();
```

- *Type:* [`org.cdk8s.plus27.ServiceType`](#org.cdk8s.plus27.ServiceType)

Determines how the Service is exposed.

---

##### `clusterIP`<sup>Optional</sup> <a name="org.cdk8s.plus27.Service.property.clusterIP"></a>

```java
public java.lang.String getClusterIP();
```

- *Type:* `java.lang.String`

The IP address of the service and is usually assigned randomly by the master.

---

##### `externalName`<sup>Optional</sup> <a name="org.cdk8s.plus27.Service.property.externalName"></a>

```java
public java.lang.String getExternalName();
```

- *Type:* `java.lang.String`

The externalName to be used for EXTERNAL_NAME types.

---


### ServiceAccount <a name="org.cdk8s.plus27.ServiceAccount"></a>

- *Implements:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount), [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the apiserver.
When they do, they are authenticated as a particular Service Account (for
example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account

#### Initializers <a name="org.cdk8s.plus27.ServiceAccount.Initializer"></a>

```java
import org.cdk8s.plus27.ServiceAccount;

ServiceAccount.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .automountToken(java.lang.Boolean)
//  .secrets(java.util.List<ISecret>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccount.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccount.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccountProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccountProps.parameter.automountToken"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether pods running as this service account should have an API token automatically mounted.

Can be overridden at the pod level.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `secrets`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccountProps.parameter.secrets"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)>

List of secrets allowed to be used by pods running using this ServiceAccount.

> https://kubernetes.io/docs/concepts/configuration/secret

---

#### Methods <a name="Methods"></a>

##### `addSecret` <a name="org.cdk8s.plus27.ServiceAccount.addSecret"></a>

```java
public addSecret(ISecret secr)
```

###### `secr`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccount.parameter.secr"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)

The secret.

---

##### `toSubjectConfiguration` <a name="org.cdk8s.plus27.ServiceAccount.toSubjectConfiguration"></a>

```java
public toSubjectConfiguration()
```

#### Static Functions <a name="Static Functions"></a>

##### `fromServiceAccountName` <a name="org.cdk8s.plus27.ServiceAccount.fromServiceAccountName"></a>

```java
import org.cdk8s.plus27.ServiceAccount;

ServiceAccount.fromServiceAccountName(Construct scope, java.lang.String id, java.lang.String name)
ServiceAccount.fromServiceAccountName(Construct scope, java.lang.String id, java.lang.String name, FromServiceAccountNameOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccount.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccount.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccount.parameter.name"></a>

- *Type:* `java.lang.String`

The name of the service account resource.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccount.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.FromServiceAccountNameOptions`](#org.cdk8s.plus27.FromServiceAccountNameOptions)

additional options.

---

#### Properties <a name="Properties"></a>

##### `automountToken`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccount.property.automountToken"></a>

```java
public java.lang.Boolean getAutomountToken();
```

- *Type:* `java.lang.Boolean`

Whether or not a token is automatically mounted for this service account.

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccount.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `secrets`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccount.property.secrets"></a>

```java
public java.util.List<ISecret> getSecrets();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)>

List of secrets allowed to be used by pods running using this service account.

Returns a copy. To add a secret, use `addSecret()`.

---


### ServiceAccountTokenSecret <a name="org.cdk8s.plus27.ServiceAccountTokenSecret"></a>

Create a secret for a service account token.

> https://kubernetes.io/docs/concepts/configuration/secret/#service-account-token-secrets

#### Initializers <a name="org.cdk8s.plus27.ServiceAccountTokenSecret.Initializer"></a>

```java
import org.cdk8s.plus27.ServiceAccountTokenSecret;

ServiceAccountTokenSecret.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .serviceAccount(IServiceAccount)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccountTokenSecret.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccountTokenSecret.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccountTokenSecretProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccountTokenSecretProps.parameter.immutable"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `serviceAccount`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccountTokenSecretProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)

The service account to store a secret for.

---





### SshAuthSecret <a name="org.cdk8s.plus27.SshAuthSecret"></a>

Create a secret for ssh authentication.

> https://kubernetes.io/docs/concepts/configuration/secret/#ssh-authentication-secrets

#### Initializers <a name="org.cdk8s.plus27.SshAuthSecret.Initializer"></a>

```java
import org.cdk8s.plus27.SshAuthSecret;

SshAuthSecret.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .sshPrivateKey(java.lang.String)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.SshAuthSecret.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.SshAuthSecret.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.SshAuthSecretProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.SshAuthSecretProps.parameter.immutable"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `sshPrivateKey`<sup>Required</sup> <a name="org.cdk8s.plus27.SshAuthSecretProps.parameter.sshPrivateKey"></a>

- *Type:* `java.lang.String`

The SSH private key to use.

---





### StatefulSet <a name="org.cdk8s.plus27.StatefulSet"></a>

- *Implements:* [`org.cdk8s.plus27.IScalable`](#org.cdk8s.plus27.IScalable)

StatefulSet is the workload API object used to manage stateful applications.

Manages the deployment and scaling of a set of Pods, and provides guarantees
about the ordering and uniqueness of these Pods.

Like a Deployment, a StatefulSet manages Pods that are based on an identical
container spec. Unlike a Deployment, a StatefulSet maintains a sticky identity
for each of their Pods. These pods are created from the same spec, but are not
interchangeable: each has a persistent identifier that it maintains across any
rescheduling.

If you want to use storage volumes to provide persistence for your workload, you
can use a StatefulSet as part of the solution. Although individual Pods in a StatefulSet
are susceptible to failure, the persistent Pod identifiers make it easier to match existing
volumes to the new Pods that replace any that have failed.

## Using StatefulSets

StatefulSets are valuable for applications that require one or more of the following.

* Stable, unique network identifiers.
* Stable, persistent storage.
* Ordered, graceful deployment and scaling.
* Ordered, automated rolling updates.

#### Initializers <a name="org.cdk8s.plus27.StatefulSet.Initializer"></a>

```java
import org.cdk8s.plus27.StatefulSet;

StatefulSet.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
//  .minReady(Duration)
//  .podManagementPolicy(PodManagementPolicy)
//  .replicas(java.lang.Number)
//  .service(Service)
//  .strategy(StatefulSetUpdateStrategy)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.StatefulSet.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.StatefulSet.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.automountServiceAccountToken"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.dns"></a>

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.dockerRegistryAuth"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.hostAliases"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.hostNetwork"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.initContainers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.isolate"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.securityContext"></a>

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.terminationGracePeriod"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.select"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.spread"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `minReady`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.minReady"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(0)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

Zero means the pod will be considered available as soon as it is ready.

This is an alpha field and requires enabling StatefulSetMinReadySeconds feature gate.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds

---

##### `podManagementPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.podManagementPolicy"></a>

- *Type:* [`org.cdk8s.plus27.PodManagementPolicy`](#org.cdk8s.plus27.PodManagementPolicy)
- *Default:* PodManagementPolicy.ORDERED_READY

Pod management policy to use for this statefulset.

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.replicas"></a>

- *Type:* `java.lang.Number`
- *Default:* 1

Number of desired pods.

---

##### `service`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.service"></a>

- *Type:* [`org.cdk8s.plus27.Service`](#org.cdk8s.plus27.Service)
- *Default:* A new headless service will be created.

Service to associate with the statefulset.

---

##### `strategy`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.parameter.strategy"></a>

- *Type:* [`org.cdk8s.plus27.StatefulSetUpdateStrategy`](#org.cdk8s.plus27.StatefulSetUpdateStrategy)
- *Default:* RollingUpdate with partition set to 0

Indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.

---

#### Methods <a name="Methods"></a>

##### `markHasAutoscaler` <a name="org.cdk8s.plus27.StatefulSet.markHasAutoscaler"></a>

```java
public markHasAutoscaler()
```

##### `toScalingTarget` <a name="org.cdk8s.plus27.StatefulSet.toScalingTarget"></a>

```java
public toScalingTarget()
```


#### Properties <a name="Properties"></a>

##### `minReady`<sup>Required</sup> <a name="org.cdk8s.plus27.StatefulSet.property.minReady"></a>

```java
public Duration getMinReady();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---

##### `podManagementPolicy`<sup>Required</sup> <a name="org.cdk8s.plus27.StatefulSet.property.podManagementPolicy"></a>

```java
public PodManagementPolicy getPodManagementPolicy();
```

- *Type:* [`org.cdk8s.plus27.PodManagementPolicy`](#org.cdk8s.plus27.PodManagementPolicy)

Management policy to use for the set.

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.StatefulSet.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `service`<sup>Required</sup> <a name="org.cdk8s.plus27.StatefulSet.property.service"></a>

```java
public Service getService();
```

- *Type:* [`org.cdk8s.plus27.Service`](#org.cdk8s.plus27.Service)

---

##### `strategy`<sup>Required</sup> <a name="org.cdk8s.plus27.StatefulSet.property.strategy"></a>

```java
public StatefulSetUpdateStrategy getStrategy();
```

- *Type:* [`org.cdk8s.plus27.StatefulSetUpdateStrategy`](#org.cdk8s.plus27.StatefulSetUpdateStrategy)

The update startegy of this stateful set.

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSet.property.replicas"></a>

```java
public java.lang.Number getReplicas();
```

- *Type:* `java.lang.Number`

Number of desired pods.

---

##### `hasAutoscaler`<sup>Required</sup> <a name="org.cdk8s.plus27.StatefulSet.property.hasAutoscaler"></a>

```java
public java.lang.Boolean getHasAutoscaler();
```

- *Type:* `java.lang.Boolean`

If this is a target of an autoscaler.

---


### TlsSecret <a name="org.cdk8s.plus27.TlsSecret"></a>

Create a secret for storing a TLS certificate and its associated key.

> https://kubernetes.io/docs/concepts/configuration/secret/#tls-secrets

#### Initializers <a name="org.cdk8s.plus27.TlsSecret.Initializer"></a>

```java
import org.cdk8s.plus27.TlsSecret;

TlsSecret.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .tlsCert(java.lang.String)
    .tlsKey(java.lang.String)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.TlsSecret.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.TlsSecret.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.TlsSecretProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.TlsSecretProps.parameter.immutable"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `tlsCert`<sup>Required</sup> <a name="org.cdk8s.plus27.TlsSecretProps.parameter.tlsCert"></a>

- *Type:* `java.lang.String`

The TLS cert.

---

##### `tlsKey`<sup>Required</sup> <a name="org.cdk8s.plus27.TlsSecretProps.parameter.tlsKey"></a>

- *Type:* `java.lang.String`

The TLS key.

---





### User <a name="org.cdk8s.plus27.User"></a>

- *Implements:* [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

Represents a user.

#### Methods <a name="Methods"></a>

##### `toSubjectConfiguration` <a name="org.cdk8s.plus27.User.toSubjectConfiguration"></a>

```java
public toSubjectConfiguration()
```

#### Static Functions <a name="Static Functions"></a>

##### `fromName` <a name="org.cdk8s.plus27.User.fromName"></a>

```java
import org.cdk8s.plus27.User;

User.fromName(Construct scope, java.lang.String id, java.lang.String name)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.User.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.User.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.User.parameter.name"></a>

- *Type:* `java.lang.String`

---

#### Properties <a name="Properties"></a>

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.User.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.User.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

---

##### `apiGroup`<sup>Optional</sup> <a name="org.cdk8s.plus27.User.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

---


### Volume <a name="org.cdk8s.plus27.Volume"></a>

- *Implements:* [`org.cdk8s.plus27.IStorage`](#org.cdk8s.plus27.IStorage)

Volume represents a named volume in a pod that may be accessed by any container in the pod.

Docker also has a concept of volumes, though it is somewhat looser and less
managed. In Docker, a volume is simply a directory on disk or in another
Container. Lifetimes are not managed and until very recently there were only
local-disk-backed volumes. Docker now provides volume drivers, but the
functionality is very limited for now (e.g. as of Docker 1.7 only one volume
driver is allowed per Container and there is no way to pass parameters to
volumes).

A Kubernetes volume, on the other hand, has an explicit lifetime - the same
as the Pod that encloses it. Consequently, a volume outlives any Containers
that run within the Pod, and data is preserved across Container restarts. Of
course, when a Pod ceases to exist, the volume will cease to exist, too.
Perhaps more importantly than this, Kubernetes supports many types of
volumes, and a Pod can use any number of them simultaneously.

At its core, a volume is just a directory, possibly with some data in it,
which is accessible to the Containers in a Pod. How that directory comes to
be, the medium that backs it, and the contents of it are determined by the
particular volume type used.

To use a volume, a Pod specifies what volumes to provide for the Pod (the
.spec.volumes field) and where to mount those into Containers (the
.spec.containers[*].volumeMounts field).

A process in a container sees a filesystem view composed from their Docker
image and volumes. The Docker image is at the root of the filesystem
hierarchy, and any volumes are mounted at the specified paths within the
image. Volumes can not mount onto other volumes

#### Methods <a name="Methods"></a>

##### `asVolume` <a name="org.cdk8s.plus27.Volume.asVolume"></a>

```java
public asVolume()
```

#### Static Functions <a name="Static Functions"></a>

##### `fromAwsElasticBlockStore` <a name="org.cdk8s.plus27.Volume.fromAwsElasticBlockStore"></a>

```java
import org.cdk8s.plus27.Volume;

Volume.fromAwsElasticBlockStore(Construct scope, java.lang.String id, java.lang.String volumeId)
Volume.fromAwsElasticBlockStore(Construct scope, java.lang.String id, java.lang.String volumeId, AwsElasticBlockStoreVolumeOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `volumeId`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.volumeId"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.AwsElasticBlockStoreVolumeOptions`](#org.cdk8s.plus27.AwsElasticBlockStoreVolumeOptions)

---

##### `fromAzureDisk` <a name="org.cdk8s.plus27.Volume.fromAzureDisk"></a>

```java
import org.cdk8s.plus27.Volume;

Volume.fromAzureDisk(Construct scope, java.lang.String id, java.lang.String diskName, java.lang.String diskUri)
Volume.fromAzureDisk(Construct scope, java.lang.String id, java.lang.String diskName, java.lang.String diskUri, AzureDiskVolumeOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `diskName`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.diskName"></a>

- *Type:* `java.lang.String`

---

###### `diskUri`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.diskUri"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.AzureDiskVolumeOptions`](#org.cdk8s.plus27.AzureDiskVolumeOptions)

---

##### `fromConfigMap` <a name="org.cdk8s.plus27.Volume.fromConfigMap"></a>

```java
import org.cdk8s.plus27.Volume;

Volume.fromConfigMap(Construct scope, java.lang.String id, IConfigMap configMap)
Volume.fromConfigMap(Construct scope, java.lang.String id, IConfigMap configMap, ConfigMapVolumeOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `configMap`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.configMap"></a>

- *Type:* [`org.cdk8s.plus27.IConfigMap`](#org.cdk8s.plus27.IConfigMap)

The config map to use to populate the volume.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.ConfigMapVolumeOptions`](#org.cdk8s.plus27.ConfigMapVolumeOptions)

Options.

---

##### `fromCsi` <a name="org.cdk8s.plus27.Volume.fromCsi"></a>

```java
import org.cdk8s.plus27.Volume;

Volume.fromCsi(Construct scope, java.lang.String id, java.lang.String driver)
Volume.fromCsi(Construct scope, java.lang.String id, java.lang.String driver, CsiVolumeOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `driver`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.driver"></a>

- *Type:* `java.lang.String`

The name of the CSI driver to use to populate the volume.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.CsiVolumeOptions`](#org.cdk8s.plus27.CsiVolumeOptions)

Options for the CSI volume, including driver-specific ones.

---

##### `fromEmptyDir` <a name="org.cdk8s.plus27.Volume.fromEmptyDir"></a>

```java
import org.cdk8s.plus27.Volume;

Volume.fromEmptyDir(Construct scope, java.lang.String id, java.lang.String name)
Volume.fromEmptyDir(Construct scope, java.lang.String id, java.lang.String name, EmptyDirVolumeOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.name"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.EmptyDirVolumeOptions`](#org.cdk8s.plus27.EmptyDirVolumeOptions)

Additional options.

---

##### `fromGcePersistentDisk` <a name="org.cdk8s.plus27.Volume.fromGcePersistentDisk"></a>

```java
import org.cdk8s.plus27.Volume;

Volume.fromGcePersistentDisk(Construct scope, java.lang.String id, java.lang.String pdName)
Volume.fromGcePersistentDisk(Construct scope, java.lang.String id, java.lang.String pdName, GCEPersistentDiskVolumeOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `pdName`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.pdName"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.GCEPersistentDiskVolumeOptions`](#org.cdk8s.plus27.GCEPersistentDiskVolumeOptions)

---

##### `fromHostPath` <a name="org.cdk8s.plus27.Volume.fromHostPath"></a>

```java
import org.cdk8s.plus27.Volume;

Volume.fromHostPath(Construct scope, java.lang.String id, java.lang.String name, HostPathVolumeOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.name"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.HostPathVolumeOptions`](#org.cdk8s.plus27.HostPathVolumeOptions)

---

##### `fromNfs` <a name="org.cdk8s.plus27.Volume.fromNfs"></a>

```java
import org.cdk8s.plus27.Volume;

Volume.fromNfs(Construct scope, java.lang.String id, java.lang.String name, NfsVolumeOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.name"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.NfsVolumeOptions`](#org.cdk8s.plus27.NfsVolumeOptions)

---

##### `fromPersistentVolumeClaim` <a name="org.cdk8s.plus27.Volume.fromPersistentVolumeClaim"></a>

```java
import org.cdk8s.plus27.Volume;

Volume.fromPersistentVolumeClaim(Construct scope, java.lang.String id, IPersistentVolumeClaim claim)
Volume.fromPersistentVolumeClaim(Construct scope, java.lang.String id, IPersistentVolumeClaim claim, PersistentVolumeClaimVolumeOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `claim`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.claim"></a>

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.PersistentVolumeClaimVolumeOptions`](#org.cdk8s.plus27.PersistentVolumeClaimVolumeOptions)

---

##### `fromSecret` <a name="org.cdk8s.plus27.Volume.fromSecret"></a>

```java
import org.cdk8s.plus27.Volume;

Volume.fromSecret(Construct scope, java.lang.String id, ISecret secr)
Volume.fromSecret(Construct scope, java.lang.String id, ISecret secr, SecretVolumeOptions options)
```

###### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.id"></a>

- *Type:* `java.lang.String`

---

###### `secr`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.parameter.secr"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)

The secret to use to populate the volume.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.SecretVolumeOptions`](#org.cdk8s.plus27.SecretVolumeOptions)

Options.

---

#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Volume.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

---


### Workload <a name="org.cdk8s.plus27.Workload"></a>

A workload is an application running on Kubernetes.

Whether your workload is a single
component or several that work together, on Kubernetes you run it inside a set of pods.
In Kubernetes, a Pod represents a set of running containers on your cluster.

#### Initializers <a name="org.cdk8s.plus27.Workload.Initializer"></a>

```java
import org.cdk8s.plus27.Workload;

Workload.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus27.Workload.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus27.Workload.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.automountServiceAccountToken"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.dns"></a>

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.dockerRegistryAuth"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.hostAliases"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.hostNetwork"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.initContainers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.isolate"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.securityContext"></a>

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.terminationGracePeriod"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.select"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.parameter.spread"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

#### Methods <a name="Methods"></a>

##### `select` <a name="org.cdk8s.plus27.Workload.select"></a>

```java
public select(LabelSelector selectors)
```

###### `selectors`<sup>Required</sup> <a name="org.cdk8s.plus27.Workload.parameter.selectors"></a>

- *Type:* [`org.cdk8s.plus27.LabelSelector`](#org.cdk8s.plus27.LabelSelector)

---


#### Properties <a name="Properties"></a>

##### `connections`<sup>Required</sup> <a name="org.cdk8s.plus27.Workload.property.connections"></a>

```java
public PodConnections getConnections();
```

- *Type:* [`org.cdk8s.plus27.PodConnections`](#org.cdk8s.plus27.PodConnections)

---

##### `matchExpressions`<sup>Required</sup> <a name="org.cdk8s.plus27.Workload.property.matchExpressions"></a>

```java
public java.util.List<LabelSelectorRequirement> getMatchExpressions();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.LabelSelectorRequirement`](#org.cdk8s.plus27.LabelSelectorRequirement)>

The expression matchers this workload will use in order to select pods.

Returns a a copy. Use `select()` to add expression matchers.

---

##### `matchLabels`<sup>Required</sup> <a name="org.cdk8s.plus27.Workload.property.matchLabels"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getMatchLabels();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

The label matchers this workload will use in order to select pods.

Returns a a copy. Use `select()` to add label matchers.

---

##### `podMetadata`<sup>Required</sup> <a name="org.cdk8s.plus27.Workload.property.podMetadata"></a>

```java
public ApiObjectMetadataDefinition getPodMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadataDefinition`](#org.cdk8s.ApiObjectMetadataDefinition)

The metadata of pods in this workload.

---

##### `scheduling`<sup>Required</sup> <a name="org.cdk8s.plus27.Workload.property.scheduling"></a>

```java
public WorkloadScheduling getScheduling();
```

- *Type:* [`org.cdk8s.plus27.WorkloadScheduling`](#org.cdk8s.plus27.WorkloadScheduling)

---


## Structs <a name="Structs"></a>

### AbstractPodProps <a name="org.cdk8s.plus27.AbstractPodProps"></a>

Properties for `AbstractPod`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.AbstractPodProps;

AbstractPodProps.builder()
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.automountServiceAccountToken"></a>

```java
public java.lang.Boolean getAutomountServiceAccountToken();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.containers"></a>

```java
public java.util.List<ContainerProps> getContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.dns"></a>

```java
public PodDnsProps getDns();
```

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.dockerRegistryAuth"></a>

```java
public ISecret getDockerRegistryAuth();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.hostAliases"></a>

```java
public java.util.List<HostAlias> getHostAliases();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.hostNetwork"></a>

```java
public java.lang.Boolean getHostNetwork();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.initContainers"></a>

```java
public java.util.List<ContainerProps> getInitContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.isolate"></a>

```java
public java.lang.Boolean getIsolate();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.restartPolicy"></a>

```java
public RestartPolicy getRestartPolicy();
```

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.securityContext"></a>

```java
public PodSecurityContextProps getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.serviceAccount"></a>

```java
public IServiceAccount getServiceAccount();
```

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.terminationGracePeriod"></a>

```java
public Duration getTerminationGracePeriod();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.AbstractPodProps.property.volumes"></a>

```java
public java.util.List<Volume> getVolumes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

### AddDeploymentOptions <a name="org.cdk8s.plus27.AddDeploymentOptions"></a>

Options to add a deployment to a service.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.AddDeploymentOptions;

AddDeploymentOptions.builder()
//  .name(java.lang.String)
//  .nodePort(java.lang.Number)
//  .protocol(Protocol)
//  .targetPort(java.lang.Number)
//  .port(java.lang.Number)
    .build();
```

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.AddDeploymentOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

##### `nodePort`<sup>Optional</sup> <a name="org.cdk8s.plus27.AddDeploymentOptions.property.nodePort"></a>

```java
public java.lang.Number getNodePort();
```

- *Type:* `java.lang.Number`
- *Default:* auto-allocate a port if the ServiceType of this Service requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="org.cdk8s.plus27.AddDeploymentOptions.property.protocol"></a>

```java
public Protocol getProtocol();
```

- *Type:* [`org.cdk8s.plus27.Protocol`](#org.cdk8s.plus27.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `targetPort`<sup>Optional</sup> <a name="org.cdk8s.plus27.AddDeploymentOptions.property.targetPort"></a>

```java
public java.lang.Number getTargetPort();
```

- *Type:* `java.lang.Number`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus27.AddDeploymentOptions.property.port"></a>

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`
- *Default:* Copied from the first container of the deployment.

The port number the service will bind to.

---

### AddDirectoryOptions <a name="org.cdk8s.plus27.AddDirectoryOptions"></a>

Options for `configmap.addDirectory()`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.AddDirectoryOptions;

AddDirectoryOptions.builder()
//  .exclude(java.util.List<java.lang.String>)
//  .keyPrefix(java.lang.String)
    .build();
```

##### `exclude`<sup>Optional</sup> <a name="org.cdk8s.plus27.AddDirectoryOptions.property.exclude"></a>

```java
public java.util.List<java.lang.String> getExclude();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* include all files

Glob patterns to exclude when adding files.

---

##### `keyPrefix`<sup>Optional</sup> <a name="org.cdk8s.plus27.AddDirectoryOptions.property.keyPrefix"></a>

```java
public java.lang.String getKeyPrefix();
```

- *Type:* `java.lang.String`
- *Default:* ""

A prefix to add to all keys in the config map.

---

### ApiResourceOptions <a name="org.cdk8s.plus27.ApiResourceOptions"></a>

Options for `ApiResource`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ApiResourceOptions;

ApiResourceOptions.builder()
    .apiGroup(java.lang.String)
    .resourceType(java.lang.String)
    .build();
```

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.ApiResourceOptions.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.ApiResourceOptions.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of the resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

### AwsElasticBlockStorePersistentVolumeProps <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps"></a>

Properties for `AwsElasticBlockStorePersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps;

AwsElasticBlockStorePersistentVolumeProps.builder()
//  .metadata(ApiObjectMetadata)
//  .accessModes(java.util.List<PersistentVolumeAccessMode>)
//  .claim(IPersistentVolumeClaim)
//  .mountOptions(java.util.List<java.lang.String>)
//  .reclaimPolicy(PersistentVolumeReclaimPolicy)
//  .storage(Size)
//  .storageClassName(java.lang.String)
//  .volumeMode(PersistentVolumeMode)
    .volumeId(java.lang.String)
//  .fsType(java.lang.String)
//  .partition(java.lang.Number)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.accessModes"></a>

```java
public java.util.List<PersistentVolumeAccessMode> getAccessModes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.claim"></a>

```java
public IPersistentVolumeClaim getClaim();
```

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.mountOptions"></a>

```java
public java.util.List<java.lang.String> getMountOptions();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.reclaimPolicy"></a>

```java
public PersistentVolumeReclaimPolicy getReclaimPolicy();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeReclaimPolicy`](#org.cdk8s.plus27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.storage"></a>

```java
public Size getStorage();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.storageClassName"></a>

```java
public java.lang.String getStorageClassName();
```

- *Type:* `java.lang.String`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.volumeMode"></a>

```java
public PersistentVolumeMode getVolumeMode();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `volumeId`<sup>Required</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.volumeId"></a>

```java
public java.lang.String getVolumeId();
```

- *Type:* `java.lang.String`

Unique ID of the persistent disk resource in AWS (Amazon EBS volume).

More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `fsType`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.fsType"></a>

```java
public java.lang.String getFsType();
```

- *Type:* `java.lang.String`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `partition`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.partition"></a>

```java
public java.lang.Number getPartition();
```

- *Type:* `java.lang.Number`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStorePersistentVolumeProps.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### AwsElasticBlockStoreVolumeOptions <a name="org.cdk8s.plus27.AwsElasticBlockStoreVolumeOptions"></a>

Options of `Volume.fromAwsElasticBlockStore`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.AwsElasticBlockStoreVolumeOptions;

AwsElasticBlockStoreVolumeOptions.builder()
//  .fsType(java.lang.String)
//  .name(java.lang.String)
//  .partition(java.lang.Number)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `fsType`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStoreVolumeOptions.property.fsType"></a>

```java
public java.lang.String getFsType();
```

- *Type:* `java.lang.String`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStoreVolumeOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* auto-generated

The volume name.

---

##### `partition`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStoreVolumeOptions.property.partition"></a>

```java
public java.lang.Number getPartition();
```

- *Type:* `java.lang.Number`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.AwsElasticBlockStoreVolumeOptions.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### AzureDiskPersistentVolumeProps <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps"></a>

Properties for `AzureDiskPersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.AzureDiskPersistentVolumeProps;

AzureDiskPersistentVolumeProps.builder()
//  .metadata(ApiObjectMetadata)
//  .accessModes(java.util.List<PersistentVolumeAccessMode>)
//  .claim(IPersistentVolumeClaim)
//  .mountOptions(java.util.List<java.lang.String>)
//  .reclaimPolicy(PersistentVolumeReclaimPolicy)
//  .storage(Size)
//  .storageClassName(java.lang.String)
//  .volumeMode(PersistentVolumeMode)
    .diskName(java.lang.String)
    .diskUri(java.lang.String)
//  .cachingMode(AzureDiskPersistentVolumeCachingMode)
//  .fsType(java.lang.String)
//  .kind(AzureDiskPersistentVolumeKind)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.accessModes"></a>

```java
public java.util.List<PersistentVolumeAccessMode> getAccessModes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.claim"></a>

```java
public IPersistentVolumeClaim getClaim();
```

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.mountOptions"></a>

```java
public java.util.List<java.lang.String> getMountOptions();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.reclaimPolicy"></a>

```java
public PersistentVolumeReclaimPolicy getReclaimPolicy();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeReclaimPolicy`](#org.cdk8s.plus27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.storage"></a>

```java
public Size getStorage();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.storageClassName"></a>

```java
public java.lang.String getStorageClassName();
```

- *Type:* `java.lang.String`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.volumeMode"></a>

```java
public PersistentVolumeMode getVolumeMode();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `diskName`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.diskName"></a>

```java
public java.lang.String getDiskName();
```

- *Type:* `java.lang.String`

The Name of the data disk in the blob storage.

---

##### `diskUri`<sup>Required</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.diskUri"></a>

```java
public java.lang.String getDiskUri();
```

- *Type:* `java.lang.String`

The URI the data disk in the blob storage.

---

##### `cachingMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.cachingMode"></a>

```java
public AzureDiskPersistentVolumeCachingMode getCachingMode();
```

- *Type:* [`org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode`](#org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode)
- *Default:* AzureDiskPersistentVolumeCachingMode.NONE.

Host Caching mode.

---

##### `fsType`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.fsType"></a>

```java
public java.lang.String getFsType();
```

- *Type:* `java.lang.String`
- *Default:* 'ext4'

Filesystem type to mount.

Must be a filesystem type supported by the host operating system.

---

##### `kind`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.kind"></a>

```java
public AzureDiskPersistentVolumeKind getKind();
```

- *Type:* [`org.cdk8s.plus27.AzureDiskPersistentVolumeKind`](#org.cdk8s.plus27.AzureDiskPersistentVolumeKind)
- *Default:* AzureDiskPersistentVolumeKind.SHARED

Kind of disk.

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeProps.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Force the ReadOnly setting in VolumeMounts.

---

### AzureDiskVolumeOptions <a name="org.cdk8s.plus27.AzureDiskVolumeOptions"></a>

Options of `Volume.fromAzureDisk`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.AzureDiskVolumeOptions;

AzureDiskVolumeOptions.builder()
//  .cachingMode(AzureDiskPersistentVolumeCachingMode)
//  .fsType(java.lang.String)
//  .kind(AzureDiskPersistentVolumeKind)
//  .name(java.lang.String)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `cachingMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskVolumeOptions.property.cachingMode"></a>

```java
public AzureDiskPersistentVolumeCachingMode getCachingMode();
```

- *Type:* [`org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode`](#org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode)
- *Default:* AzureDiskPersistentVolumeCachingMode.NONE.

Host Caching mode.

---

##### `fsType`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskVolumeOptions.property.fsType"></a>

```java
public java.lang.String getFsType();
```

- *Type:* `java.lang.String`
- *Default:* 'ext4'

Filesystem type to mount.

Must be a filesystem type supported by the host operating system.

---

##### `kind`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskVolumeOptions.property.kind"></a>

```java
public AzureDiskPersistentVolumeKind getKind();
```

- *Type:* [`org.cdk8s.plus27.AzureDiskPersistentVolumeKind`](#org.cdk8s.plus27.AzureDiskPersistentVolumeKind)
- *Default:* AzureDiskPersistentVolumeKind.SHARED

Kind of disk.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskVolumeOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* auto-generated

The volume name.

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.AzureDiskVolumeOptions.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Force the ReadOnly setting in VolumeMounts.

---

### BasicAuthSecretProps <a name="org.cdk8s.plus27.BasicAuthSecretProps"></a>

Options for `BasicAuthSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.BasicAuthSecretProps;

BasicAuthSecretProps.builder()
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .password(java.lang.String)
    .username(java.lang.String)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.BasicAuthSecretProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.BasicAuthSecretProps.property.immutable"></a>

```java
public java.lang.Boolean getImmutable();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `password`<sup>Required</sup> <a name="org.cdk8s.plus27.BasicAuthSecretProps.property.password"></a>

```java
public java.lang.String getPassword();
```

- *Type:* `java.lang.String`

The password or token for authentication.

---

##### `username`<sup>Required</sup> <a name="org.cdk8s.plus27.BasicAuthSecretProps.property.username"></a>

```java
public java.lang.String getUsername();
```

- *Type:* `java.lang.String`

The user name for authentication.

---

### ClusterRoleBindingProps <a name="org.cdk8s.plus27.ClusterRoleBindingProps"></a>

Properties for `ClusterRoleBinding`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ClusterRoleBindingProps;

ClusterRoleBindingProps.builder()
//  .metadata(ApiObjectMetadata)
    .role(IClusterRole)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ClusterRoleBindingProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `role`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRoleBindingProps.property.role"></a>

```java
public IClusterRole getRole();
```

- *Type:* [`org.cdk8s.plus27.IClusterRole`](#org.cdk8s.plus27.IClusterRole)

The role to bind to.

---

### ClusterRolePolicyRule <a name="org.cdk8s.plus27.ClusterRolePolicyRule"></a>

Policy rule of a `ClusterRole.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ClusterRolePolicyRule;

ClusterRolePolicyRule.builder()
    .endpoints(java.util.List<IApiEndpoint>)
    .verbs(java.util.List<java.lang.String>)
    .build();
```

##### `endpoints`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRolePolicyRule.property.endpoints"></a>

```java
public java.util.List<IApiEndpoint> getEndpoints();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)>

Endpoints this rule applies to.

Can be either api resources
or non api resources.

---

##### `verbs`<sup>Required</sup> <a name="org.cdk8s.plus27.ClusterRolePolicyRule.property.verbs"></a>

```java
public java.util.List<java.lang.String> getVerbs();
```

- *Type:* java.util.List<`java.lang.String`>

Verbs to allow.

(e.g ['get', 'watch'])

---

### ClusterRoleProps <a name="org.cdk8s.plus27.ClusterRoleProps"></a>

Properties for `ClusterRole`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ClusterRoleProps;

ClusterRoleProps.builder()
//  .metadata(ApiObjectMetadata)
//  .aggregationLabels(java.util.Map<java.lang.String, java.lang.String>)
//  .rules(java.util.List<ClusterRolePolicyRule>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ClusterRoleProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `aggregationLabels`<sup>Optional</sup> <a name="org.cdk8s.plus27.ClusterRoleProps.property.aggregationLabels"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getAggregationLabels();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

Specify labels that should be used to locate ClusterRoles, whose rules will be automatically filled into this ClusterRole's rules.

---

##### `rules`<sup>Optional</sup> <a name="org.cdk8s.plus27.ClusterRoleProps.property.rules"></a>

```java
public java.util.List<ClusterRolePolicyRule> getRules();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ClusterRolePolicyRule`](#org.cdk8s.plus27.ClusterRolePolicyRule)>
- *Default:* []

A list of rules the role should allow.

---

### CommandProbeOptions <a name="org.cdk8s.plus27.CommandProbeOptions"></a>

Options for `Probe.fromCommand()`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.CommandProbeOptions;

CommandProbeOptions.builder()
//  .failureThreshold(java.lang.Number)
//  .initialDelaySeconds(Duration)
//  .periodSeconds(Duration)
//  .successThreshold(java.lang.Number)
//  .timeoutSeconds(Duration)
    .build();
```

##### `failureThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus27.CommandProbeOptions.property.failureThreshold"></a>

```java
public java.lang.Number getFailureThreshold();
```

- *Type:* `java.lang.Number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.CommandProbeOptions.property.initialDelaySeconds"></a>

```java
public Duration getInitialDelaySeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.CommandProbeOptions.property.periodSeconds"></a>

```java
public Duration getPeriodSeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus27.CommandProbeOptions.property.successThreshold"></a>

```java
public java.lang.Number getSuccessThreshold();
```

- *Type:* `java.lang.Number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.CommandProbeOptions.property.timeoutSeconds"></a>

```java
public Duration getTimeoutSeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

### CommonSecretProps <a name="org.cdk8s.plus27.CommonSecretProps"></a>

Common properties for `Secret`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.CommonSecretProps;

CommonSecretProps.builder()
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.CommonSecretProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.CommonSecretProps.property.immutable"></a>

```java
public java.lang.Boolean getImmutable();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

### ConfigMapProps <a name="org.cdk8s.plus27.ConfigMapProps"></a>

Properties for initialization of `ConfigMap`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ConfigMapProps;

ConfigMapProps.builder()
//  .metadata(ApiObjectMetadata)
//  .binaryData(java.util.Map<java.lang.String, java.lang.String>)
//  .data(java.util.Map<java.lang.String, java.lang.String>)
//  .immutable(java.lang.Boolean)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `binaryData`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapProps.property.binaryData"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getBinaryData();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

BinaryData contains the binary data.

Each key must consist of alphanumeric characters, '-', '_' or '.'.
BinaryData can contain byte sequences that are not in the UTF-8 range. The
keys stored in BinaryData must not overlap with the ones in the Data field,
this is enforced during validation process.

You can also add binary data using `configMap.addBinaryData()`.

---

##### `data`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapProps.property.data"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getData();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

Data contains the configuration data.

Each key must consist of alphanumeric characters, '-', '_' or '.'. Values
with non-UTF-8 byte sequences must use the BinaryData field. The keys
stored in Data must not overlap with the keys in the BinaryData field, this
is enforced during validation process.

You can also add data using `configMap.addData()`.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapProps.property.immutable"></a>

```java
public java.lang.Boolean getImmutable();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

### ConfigMapVolumeOptions <a name="org.cdk8s.plus27.ConfigMapVolumeOptions"></a>

Options for the ConfigMap-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ConfigMapVolumeOptions;

ConfigMapVolumeOptions.builder()
//  .defaultMode(java.lang.Number)
//  .items(java.util.Map<java.lang.String, PathMapping>)
//  .name(java.lang.String)
//  .optional(java.lang.Boolean)
    .build();
```

##### `defaultMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapVolumeOptions.property.defaultMode"></a>

```java
public java.lang.Number getDefaultMode();
```

- *Type:* `java.lang.Number`
- *Default:* 0644. Directories within the path are not affected by this
setting. This might be in conflict with other options that affect the file
mode, like fsGroup, and the result can be other mode bits set.

Mode bits to use on created files by default.

Must be a value between 0 and
0777. Defaults to 0644. Directories within the path are not affected by
this setting. This might be in conflict with other options that affect the
file mode, like fsGroup, and the result can be other mode bits set.

---

##### `items`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapVolumeOptions.property.items"></a>

```java
public java.util.Map<java.lang.String, PathMapping> getItems();
```

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus27.PathMapping`](#org.cdk8s.plus27.PathMapping)>
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the ConfigMap, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapVolumeOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* auto-generated

The volume name.

---

##### `optional`<sup>Optional</sup> <a name="org.cdk8s.plus27.ConfigMapVolumeOptions.property.optional"></a>

```java
public java.lang.Boolean getOptional();
```

- *Type:* `java.lang.Boolean`
- *Default:* undocumented

Specify whether the ConfigMap or its keys must be defined.

---

### ContainerLifecycle <a name="org.cdk8s.plus27.ContainerLifecycle"></a>

Container lifecycle properties.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ContainerLifecycle;

ContainerLifecycle.builder()
//  .postStart(Handler)
//  .preStop(Handler)
    .build();
```

##### `postStart`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerLifecycle.property.postStart"></a>

```java
public Handler getPostStart();
```

- *Type:* [`org.cdk8s.plus27.Handler`](#org.cdk8s.plus27.Handler)
- *Default:* No post start handler.

This hook is executed immediately after a container is created.

However,
there is no guarantee that the hook will execute before the container ENTRYPOINT.

---

##### `preStop`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerLifecycle.property.preStop"></a>

```java
public Handler getPreStop();
```

- *Type:* [`org.cdk8s.plus27.Handler`](#org.cdk8s.plus27.Handler)
- *Default:* No pre stop handler.

This hook is called immediately before a container is terminated due to an API request or management event such as a liveness/startup probe failure, preemption, resource contention and others.

A call to the PreStop hook fails if the container is already in a terminated or completed state
and the hook must complete before the TERM signal to stop the container can be sent.
The Pod's termination grace period countdown begins before the PreStop hook is executed,
so regardless of the outcome of the handler, the container will eventually terminate
within the Pod's termination grace period. No parameters are passed to the handler.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#pod-termination

---

### ContainerOpts <a name="org.cdk8s.plus27.ContainerOpts"></a>

Optional properties of a container.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ContainerOpts;

ContainerOpts.builder()
//  .args(java.util.List<java.lang.String>)
//  .command(java.util.List<java.lang.String>)
//  .envFrom(java.util.List<EnvFrom>)
//  .envVariables(java.util.Map<java.lang.String, EnvValue>)
//  .imagePullPolicy(ImagePullPolicy)
//  .lifecycle(ContainerLifecycle)
//  .liveness(Probe)
//  .name(java.lang.String)
//  .port(java.lang.Number)
//  .portNumber(java.lang.Number)
//  .ports(java.util.List<ContainerPort>)
//  .readiness(Probe)
//  .resources(ContainerResources)
//  .securityContext(ContainerSecurityContextProps)
//  .startup(Probe)
//  .volumeMounts(java.util.List<VolumeMount>)
//  .workingDir(java.lang.String)
    .build();
```

##### `args`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.args"></a>

```java
public java.util.List<java.lang.String> getArgs();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* []

Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided.

Variable references $(VAR_NAME) are expanded using the container's
environment. If a variable cannot be resolved, the reference in the input
string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
regardless of whether the variable exists or not.

Cannot be updated.

> https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `command`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.command"></a>

```java
public java.util.List<java.lang.String> getCommand();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `envFrom`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.envFrom"></a>

```java
public java.util.List<EnvFrom> getEnvFrom();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.EnvFrom`](#org.cdk8s.plus27.EnvFrom)>
- *Default:* No sources.

List of sources to populate environment variables in the container.

When a key exists in multiple sources, the value associated with
the last source will take precedence. Values defined by the `envVariables` property
with a duplicate key will take precedence.

---

##### `envVariables`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.envVariables"></a>

```java
public java.util.Map<java.lang.String, EnvValue> getEnvVariables();
```

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus27.EnvValue`](#org.cdk8s.plus27.EnvValue)>
- *Default:* No environment variables.

Environment variables to set in the container.

---

##### `imagePullPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.imagePullPolicy"></a>

```java
public ImagePullPolicy getImagePullPolicy();
```

- *Type:* [`org.cdk8s.plus27.ImagePullPolicy`](#org.cdk8s.plus27.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `lifecycle`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.lifecycle"></a>

```java
public ContainerLifecycle getLifecycle();
```

- *Type:* [`org.cdk8s.plus27.ContainerLifecycle`](#org.cdk8s.plus27.ContainerLifecycle)

Describes actions that the management system should take in response to container lifecycle events.

---

##### `liveness`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.liveness"></a>

```java
public Probe getLiveness();
```

- *Type:* [`org.cdk8s.plus27.Probe`](#org.cdk8s.plus27.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### ~~`port`~~<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.port"></a>

- *Deprecated:* - use `portNumber`.

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`

---

##### `portNumber`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.portNumber"></a>

```java
public java.lang.Number getPortNumber();
```

- *Type:* `java.lang.Number`
- *Default:* Only the ports mentiond in the `ports` property are exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

This is a convinience property if all you need a single TCP numbered port.
In case more advanced configuartion is required, use the `ports` property.

This port is added to the list of ports mentioned in the `ports` property.

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.ports"></a>

```java
public java.util.List<ContainerPort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerPort`](#org.cdk8s.plus27.ContainerPort)>
- *Default:* Only the port mentioned in the `portNumber` property is exposed.

List of ports to expose from this container.

---

##### `readiness`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.readiness"></a>

```java
public Probe getReadiness();
```

- *Type:* [`org.cdk8s.plus27.Probe`](#org.cdk8s.plus27.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `resources`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.resources"></a>

```java
public ContainerResources getResources();
```

- *Type:* [`org.cdk8s.plus27.ContainerResources`](#org.cdk8s.plus27.ContainerResources)
- *Default:* cpu:
     request: 1000 millis
     limit: 1500 millis
   memory:
     request: 512 mebibytes
     limit: 2048 mebibytes

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.securityContext"></a>

```java
public ContainerSecurityContextProps getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.ContainerSecurityContextProps`](#org.cdk8s.plus27.ContainerSecurityContextProps)
- *Default:* ensureNonRoot: true
  privileged: false
  readOnlyRootFilesystem: true
  allowPrivilegeEscalation: false
  user: 25000
  group: 26000

SecurityContext defines the security options the container should be run with.

If set, the fields override equivalent fields of the pod's security context.

> https://kubernetes.io/docs/tasks/configure-pod-container/security-context/

---

##### `startup`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.startup"></a>

```java
public Probe getStartup();
```

- *Type:* [`org.cdk8s.plus27.Probe`](#org.cdk8s.plus27.Probe)
- *Default:* If a port is provided, then knocks on that port
to determine when the container is ready for readiness and
liveness probe checks.
Otherwise, no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volumeMounts`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.volumeMounts"></a>

```java
public java.util.List<VolumeMount> getVolumeMounts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.VolumeMount`](#org.cdk8s.plus27.VolumeMount)>

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `workingDir`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerOpts.property.workingDir"></a>

```java
public java.lang.String getWorkingDir();
```

- *Type:* `java.lang.String`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

### ContainerPort <a name="org.cdk8s.plus27.ContainerPort"></a>

Represents a network port in a single container.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ContainerPort;

ContainerPort.builder()
    .number(java.lang.Number)
//  .hostIp(java.lang.String)
//  .hostPort(java.lang.Number)
//  .name(java.lang.String)
//  .protocol(Protocol)
    .build();
```

##### `number`<sup>Required</sup> <a name="org.cdk8s.plus27.ContainerPort.property.number"></a>

```java
public java.lang.Number getNumber();
```

- *Type:* `java.lang.Number`

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

##### `hostIp`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerPort.property.hostIp"></a>

```java
public java.lang.String getHostIp();
```

- *Type:* `java.lang.String`
- *Default:* 127.0.0.1.

What host IP to bind the external port to.

---

##### `hostPort`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerPort.property.hostPort"></a>

```java
public java.lang.Number getHostPort();
```

- *Type:* `java.lang.Number`
- *Default:* auto generated by kubernetes and might change on restarts.

Number of port to expose on the host.

If specified, this must be a valid port number, 0 < x < 65536.
Most containers do not need this.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerPort.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* port is not named.

If specified, this must be an IANA_SVC_NAME and unique within the pod.

Each named port in a pod must have a unique name.
Name for the port that can be referred to by services.

---

##### `protocol`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerPort.property.protocol"></a>

```java
public Protocol getProtocol();
```

- *Type:* [`org.cdk8s.plus27.Protocol`](#org.cdk8s.plus27.Protocol)
- *Default:* Protocol.TCP

Protocol for port.

Must be UDP, TCP, or SCTP. Defaults to "TCP".

---

### ContainerProps <a name="org.cdk8s.plus27.ContainerProps"></a>

Properties for creating a container.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ContainerProps;

ContainerProps.builder()
//  .args(java.util.List<java.lang.String>)
//  .command(java.util.List<java.lang.String>)
//  .envFrom(java.util.List<EnvFrom>)
//  .envVariables(java.util.Map<java.lang.String, EnvValue>)
//  .imagePullPolicy(ImagePullPolicy)
//  .lifecycle(ContainerLifecycle)
//  .liveness(Probe)
//  .name(java.lang.String)
//  .port(java.lang.Number)
//  .portNumber(java.lang.Number)
//  .ports(java.util.List<ContainerPort>)
//  .readiness(Probe)
//  .resources(ContainerResources)
//  .securityContext(ContainerSecurityContextProps)
//  .startup(Probe)
//  .volumeMounts(java.util.List<VolumeMount>)
//  .workingDir(java.lang.String)
    .image(java.lang.String)
    .build();
```

##### `args`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.args"></a>

```java
public java.util.List<java.lang.String> getArgs();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* []

Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided.

Variable references $(VAR_NAME) are expanded using the container's
environment. If a variable cannot be resolved, the reference in the input
string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
regardless of whether the variable exists or not.

Cannot be updated.

> https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `command`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.command"></a>

```java
public java.util.List<java.lang.String> getCommand();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `envFrom`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.envFrom"></a>

```java
public java.util.List<EnvFrom> getEnvFrom();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.EnvFrom`](#org.cdk8s.plus27.EnvFrom)>
- *Default:* No sources.

List of sources to populate environment variables in the container.

When a key exists in multiple sources, the value associated with
the last source will take precedence. Values defined by the `envVariables` property
with a duplicate key will take precedence.

---

##### `envVariables`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.envVariables"></a>

```java
public java.util.Map<java.lang.String, EnvValue> getEnvVariables();
```

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus27.EnvValue`](#org.cdk8s.plus27.EnvValue)>
- *Default:* No environment variables.

Environment variables to set in the container.

---

##### `imagePullPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.imagePullPolicy"></a>

```java
public ImagePullPolicy getImagePullPolicy();
```

- *Type:* [`org.cdk8s.plus27.ImagePullPolicy`](#org.cdk8s.plus27.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `lifecycle`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.lifecycle"></a>

```java
public ContainerLifecycle getLifecycle();
```

- *Type:* [`org.cdk8s.plus27.ContainerLifecycle`](#org.cdk8s.plus27.ContainerLifecycle)

Describes actions that the management system should take in response to container lifecycle events.

---

##### `liveness`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.liveness"></a>

```java
public Probe getLiveness();
```

- *Type:* [`org.cdk8s.plus27.Probe`](#org.cdk8s.plus27.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### ~~`port`~~<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.port"></a>

- *Deprecated:* - use `portNumber`.

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`

---

##### `portNumber`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.portNumber"></a>

```java
public java.lang.Number getPortNumber();
```

- *Type:* `java.lang.Number`
- *Default:* Only the ports mentiond in the `ports` property are exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

This is a convinience property if all you need a single TCP numbered port.
In case more advanced configuartion is required, use the `ports` property.

This port is added to the list of ports mentioned in the `ports` property.

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.ports"></a>

```java
public java.util.List<ContainerPort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerPort`](#org.cdk8s.plus27.ContainerPort)>
- *Default:* Only the port mentioned in the `portNumber` property is exposed.

List of ports to expose from this container.

---

##### `readiness`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.readiness"></a>

```java
public Probe getReadiness();
```

- *Type:* [`org.cdk8s.plus27.Probe`](#org.cdk8s.plus27.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `resources`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.resources"></a>

```java
public ContainerResources getResources();
```

- *Type:* [`org.cdk8s.plus27.ContainerResources`](#org.cdk8s.plus27.ContainerResources)
- *Default:* cpu:
     request: 1000 millis
     limit: 1500 millis
   memory:
     request: 512 mebibytes
     limit: 2048 mebibytes

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.securityContext"></a>

```java
public ContainerSecurityContextProps getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.ContainerSecurityContextProps`](#org.cdk8s.plus27.ContainerSecurityContextProps)
- *Default:* ensureNonRoot: true
  privileged: false
  readOnlyRootFilesystem: true
  allowPrivilegeEscalation: false
  user: 25000
  group: 26000

SecurityContext defines the security options the container should be run with.

If set, the fields override equivalent fields of the pod's security context.

> https://kubernetes.io/docs/tasks/configure-pod-container/security-context/

---

##### `startup`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.startup"></a>

```java
public Probe getStartup();
```

- *Type:* [`org.cdk8s.plus27.Probe`](#org.cdk8s.plus27.Probe)
- *Default:* If a port is provided, then knocks on that port
to determine when the container is ready for readiness and
liveness probe checks.
Otherwise, no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volumeMounts`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.volumeMounts"></a>

```java
public java.util.List<VolumeMount> getVolumeMounts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.VolumeMount`](#org.cdk8s.plus27.VolumeMount)>

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `workingDir`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.property.workingDir"></a>

```java
public java.lang.String getWorkingDir();
```

- *Type:* `java.lang.String`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `image`<sup>Required</sup> <a name="org.cdk8s.plus27.ContainerProps.property.image"></a>

```java
public java.lang.String getImage();
```

- *Type:* `java.lang.String`

Docker image name.

---

### ContainerResources <a name="org.cdk8s.plus27.ContainerResources"></a>

CPU and memory compute resources.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ContainerResources;

ContainerResources.builder()
//  .cpu(CpuResources)
//  .ephemeralStorage(EphemeralStorageResources)
//  .memory(MemoryResources)
    .build();
```

##### `cpu`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerResources.property.cpu"></a>

```java
public CpuResources getCpu();
```

- *Type:* [`org.cdk8s.plus27.CpuResources`](#org.cdk8s.plus27.CpuResources)

---

##### `ephemeralStorage`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerResources.property.ephemeralStorage"></a>

```java
public EphemeralStorageResources getEphemeralStorage();
```

- *Type:* [`org.cdk8s.plus27.EphemeralStorageResources`](#org.cdk8s.plus27.EphemeralStorageResources)

---

##### `memory`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerResources.property.memory"></a>

```java
public MemoryResources getMemory();
```

- *Type:* [`org.cdk8s.plus27.MemoryResources`](#org.cdk8s.plus27.MemoryResources)

---

### ContainerSecurityContextProps <a name="org.cdk8s.plus27.ContainerSecurityContextProps"></a>

Properties for `ContainerSecurityContext`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ContainerSecurityContextProps;

ContainerSecurityContextProps.builder()
//  .allowPrivilegeEscalation(java.lang.Boolean)
//  .ensureNonRoot(java.lang.Boolean)
//  .group(java.lang.Number)
//  .privileged(java.lang.Boolean)
//  .readOnlyRootFilesystem(java.lang.Boolean)
//  .user(java.lang.Number)
    .build();
```

##### `allowPrivilegeEscalation`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.property.allowPrivilegeEscalation"></a>

```java
public java.lang.Boolean getAllowPrivilegeEscalation();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Whether a process can gain more privileges than its parent process.

---

##### `ensureNonRoot`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.property.ensureNonRoot"></a>

```java
public java.lang.Boolean getEnsureNonRoot();
```

- *Type:* `java.lang.Boolean`
- *Default:* true

Indicates that the container must run as a non-root user.

If true, the Kubelet will validate the image at runtime to ensure that it does
not run as UID 0 (root) and fail to start the container if it does.

---

##### `group`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.property.group"></a>

```java
public java.lang.Number getGroup();
```

- *Type:* `java.lang.Number`
- *Default:* 26000. An arbitrary number bigger than 9999 is selected here.
This is so that the container is blocked to access host files even if
somehow it manages to get access to host file system.

The GID to run the entrypoint of the container process.

---

##### `privileged`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.property.privileged"></a>

```java
public java.lang.Boolean getPrivileged();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Run container in privileged mode.

Processes in privileged containers are essentially equivalent to root on the host.

---

##### `readOnlyRootFilesystem`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.property.readOnlyRootFilesystem"></a>

```java
public java.lang.Boolean getReadOnlyRootFilesystem();
```

- *Type:* `java.lang.Boolean`
- *Default:* true

Whether this container has a read-only root filesystem.

---

##### `user`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.property.user"></a>

```java
public java.lang.Number getUser();
```

- *Type:* `java.lang.Number`
- *Default:* 25000. An arbitrary number bigger than 9999 is selected here.
This is so that the container is blocked to access host files even if
somehow it manages to get access to host file system.

The UID to run the entrypoint of the container process.

---

### CpuResources <a name="org.cdk8s.plus27.CpuResources"></a>

CPU request and limit.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.CpuResources;

CpuResources.builder()
//  .limit(Cpu)
//  .request(Cpu)
    .build();
```

##### `limit`<sup>Optional</sup> <a name="org.cdk8s.plus27.CpuResources.property.limit"></a>

```java
public Cpu getLimit();
```

- *Type:* [`org.cdk8s.plus27.Cpu`](#org.cdk8s.plus27.Cpu)

---

##### `request`<sup>Optional</sup> <a name="org.cdk8s.plus27.CpuResources.property.request"></a>

```java
public Cpu getRequest();
```

- *Type:* [`org.cdk8s.plus27.Cpu`](#org.cdk8s.plus27.Cpu)

---

### CronJobProps <a name="org.cdk8s.plus27.CronJobProps"></a>

Properties for `CronJob`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.CronJobProps;

CronJobProps.builder()
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
//  .activeDeadline(Duration)
//  .backoffLimit(java.lang.Number)
//  .ttlAfterFinished(Duration)
    .schedule(Cron)
//  .concurrencyPolicy(ConcurrencyPolicy)
//  .failedJobsRetained(java.lang.Number)
//  .startingDeadline(Duration)
//  .successfulJobsRetained(java.lang.Number)
//  .suspend(java.lang.Boolean)
//  .timeZone(java.lang.String)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.automountServiceAccountToken"></a>

```java
public java.lang.Boolean getAutomountServiceAccountToken();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.containers"></a>

```java
public java.util.List<ContainerProps> getContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.dns"></a>

```java
public PodDnsProps getDns();
```

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.dockerRegistryAuth"></a>

```java
public ISecret getDockerRegistryAuth();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.hostAliases"></a>

```java
public java.util.List<HostAlias> getHostAliases();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.hostNetwork"></a>

```java
public java.lang.Boolean getHostNetwork();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.initContainers"></a>

```java
public java.util.List<ContainerProps> getInitContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.isolate"></a>

```java
public java.lang.Boolean getIsolate();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.restartPolicy"></a>

```java
public RestartPolicy getRestartPolicy();
```

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.securityContext"></a>

```java
public PodSecurityContextProps getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.serviceAccount"></a>

```java
public IServiceAccount getServiceAccount();
```

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.terminationGracePeriod"></a>

```java
public Duration getTerminationGracePeriod();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.volumes"></a>

```java
public java.util.List<Volume> getVolumes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.podMetadata"></a>

```java
public ApiObjectMetadata getPodMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.select"></a>

```java
public java.lang.Boolean getSelect();
```

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.spread"></a>

```java
public java.lang.Boolean getSpread();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `activeDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.activeDeadline"></a>

```java
public Duration getActiveDeadline();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoffLimit`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.backoffLimit"></a>

```java
public java.lang.Number getBackoffLimit();
```

- *Type:* `java.lang.Number`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.ttlAfterFinished"></a>

```java
public Duration getTtlAfterFinished();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* If this field is unset, the Job won't be automatically deleted.

Limits the lifetime of a Job that has finished execution (either Complete or Failed).

If this field is set, after the Job finishes, it is eligible to
be automatically deleted. When the Job is being deleted, its lifecycle
guarantees (e.g. finalizers) will be honored. If this field is set to zero,
the Job becomes eligible to be deleted immediately after it finishes. This
field is alpha-level and is only honored by servers that enable the
`TTLAfterFinished` feature.

---

##### `schedule`<sup>Required</sup> <a name="org.cdk8s.plus27.CronJobProps.property.schedule"></a>

```java
public Cron getSchedule();
```

- *Type:* [`org.cdk8s.Cron`](#org.cdk8s.Cron)

Specifies the time in which the job would run again.

This is defined as a cron expression in the CronJob resource.

---

##### `concurrencyPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.concurrencyPolicy"></a>

```java
public ConcurrencyPolicy getConcurrencyPolicy();
```

- *Type:* [`org.cdk8s.plus27.ConcurrencyPolicy`](#org.cdk8s.plus27.ConcurrencyPolicy)
- *Default:* ConcurrencyPolicy.Forbid

Specifies the concurrency policy for the job.

---

##### `failedJobsRetained`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.failedJobsRetained"></a>

```java
public java.lang.Number getFailedJobsRetained();
```

- *Type:* `java.lang.Number`
- *Default:* 1

Specifies the number of failed jobs history retained.

This would retain the Job and the associated Pod resource and can be useful for debugging.

---

##### `startingDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.startingDeadline"></a>

```java
public Duration getStartingDeadline();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(10)

Kubernetes attempts to start cron jobs at its schedule time, but this is not guaranteed.

This deadline specifies
how much time can pass after a schedule point, for which kubernetes can still start the job.
For example, if this is set to 100 seconds, kubernetes is allowed to start the job at a maximum 100 seconds after
the scheduled time.

Note that the Kubernetes CronJobController checks for things every 10 seconds, for this reason, a deadline below 10
seconds is not allowed, as it may cause your job to never be scheduled.

In addition, kubernetes will stop scheduling jobs if more than 100 schedules were missed (for any reason).
This property also controls what time interval should kubernetes consider when counting for missed schedules.

For example, suppose a CronJob is set to schedule a new Job every one minute beginning at 08:30:00,
and its `startingDeadline` field is not set. If the CronJob controller happens to be down from 08:29:00 to 10:21:00,
the job will not start as the number of missed jobs which missed their schedule is greater than 100.
However, if `startingDeadline` is set to 200 seconds, kubernetes will only count 3 missed schedules, and thus
start a new execution at 10:22:00.

---

##### `successfulJobsRetained`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.successfulJobsRetained"></a>

```java
public java.lang.Number getSuccessfulJobsRetained();
```

- *Type:* `java.lang.Number`
- *Default:* 3

Specifies the number of successful jobs history retained.

This would retain the Job and the associated Pod resource and can be useful for debugging.

---

##### `suspend`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.suspend"></a>

```java
public java.lang.Boolean getSuspend();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Specifies if the cron job should be suspended.

Only applies to future executions, current ones are remained untouched.

---

##### `timeZone`<sup>Optional</sup> <a name="org.cdk8s.plus27.CronJobProps.property.timeZone"></a>

```java
public java.lang.String getTimeZone();
```

- *Type:* `java.lang.String`
- *Default:* Timezone of kube-controller-manager process.

Specifies the timezone for the job.

This helps aligining the schedule to follow the specified timezone.

> {@link https://en.wikipedia.org/wiki/List_of_tz_database_time_zones} for list of valid timezone values.

---

### CsiVolumeOptions <a name="org.cdk8s.plus27.CsiVolumeOptions"></a>

Options for the CSI driver based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.CsiVolumeOptions;

CsiVolumeOptions.builder()
//  .attributes(java.util.Map<java.lang.String, java.lang.String>)
//  .fsType(java.lang.String)
//  .name(java.lang.String)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `attributes`<sup>Optional</sup> <a name="org.cdk8s.plus27.CsiVolumeOptions.property.attributes"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getAttributes();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>
- *Default:* undefined

Any driver-specific attributes to pass to the CSI volume builder.

---

##### `fsType`<sup>Optional</sup> <a name="org.cdk8s.plus27.CsiVolumeOptions.property.fsType"></a>

```java
public java.lang.String getFsType();
```

- *Type:* `java.lang.String`
- *Default:* driver-dependent

The filesystem type to mount.

Ex. "ext4", "xfs", "ntfs". If not provided,
the empty value is passed to the associated CSI driver, which will
determine the default filesystem to apply.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.CsiVolumeOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* auto-generated

The volume name.

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.CsiVolumeOptions.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Whether the mounted volume should be read-only or not.

---

### DaemonSetProps <a name="org.cdk8s.plus27.DaemonSetProps"></a>

Properties for `DaemonSet`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.DaemonSetProps;

DaemonSetProps.builder()
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
//  .minReadySeconds(java.lang.Number)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.automountServiceAccountToken"></a>

```java
public java.lang.Boolean getAutomountServiceAccountToken();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.containers"></a>

```java
public java.util.List<ContainerProps> getContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.dns"></a>

```java
public PodDnsProps getDns();
```

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.dockerRegistryAuth"></a>

```java
public ISecret getDockerRegistryAuth();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.hostAliases"></a>

```java
public java.util.List<HostAlias> getHostAliases();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.hostNetwork"></a>

```java
public java.lang.Boolean getHostNetwork();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.initContainers"></a>

```java
public java.util.List<ContainerProps> getInitContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.isolate"></a>

```java
public java.lang.Boolean getIsolate();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.restartPolicy"></a>

```java
public RestartPolicy getRestartPolicy();
```

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.securityContext"></a>

```java
public PodSecurityContextProps getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.serviceAccount"></a>

```java
public IServiceAccount getServiceAccount();
```

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.terminationGracePeriod"></a>

```java
public Duration getTerminationGracePeriod();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.volumes"></a>

```java
public java.util.List<Volume> getVolumes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.podMetadata"></a>

```java
public ApiObjectMetadata getPodMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.select"></a>

```java
public java.lang.Boolean getSelect();
```

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.spread"></a>

```java
public java.lang.Boolean getSpread();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `minReadySeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.DaemonSetProps.property.minReadySeconds"></a>

```java
public java.lang.Number getMinReadySeconds();
```

- *Type:* `java.lang.Number`
- *Default:* 0

Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---

### DeploymentExposeViaServiceOptions <a name="org.cdk8s.plus27.DeploymentExposeViaServiceOptions"></a>

Options for `Deployment.exposeViaService`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.DeploymentExposeViaServiceOptions;

DeploymentExposeViaServiceOptions.builder()
//  .name(java.lang.String)
//  .ports(java.util.List<ServicePort>)
//  .serviceType(ServiceType)
    .build();
```

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentExposeViaServiceOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* auto generated.

The name of the service to expose.

If you'd like to expose the deployment multiple times,
you must explicitly set a name starting from the second expose call.

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentExposeViaServiceOptions.property.ports"></a>

```java
public java.util.List<ServicePort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ServicePort`](#org.cdk8s.plus27.ServicePort)>
- *Default:* extracted from the deployment.

The ports that the service should bind to.

---

##### `serviceType`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentExposeViaServiceOptions.property.serviceType"></a>

```java
public ServiceType getServiceType();
```

- *Type:* [`org.cdk8s.plus27.ServiceType`](#org.cdk8s.plus27.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

### DeploymentProps <a name="org.cdk8s.plus27.DeploymentProps"></a>

Properties for `Deployment`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.DeploymentProps;

DeploymentProps.builder()
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
//  .minReady(Duration)
//  .progressDeadline(Duration)
//  .replicas(java.lang.Number)
//  .strategy(DeploymentStrategy)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.automountServiceAccountToken"></a>

```java
public java.lang.Boolean getAutomountServiceAccountToken();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.containers"></a>

```java
public java.util.List<ContainerProps> getContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.dns"></a>

```java
public PodDnsProps getDns();
```

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.dockerRegistryAuth"></a>

```java
public ISecret getDockerRegistryAuth();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.hostAliases"></a>

```java
public java.util.List<HostAlias> getHostAliases();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.hostNetwork"></a>

```java
public java.lang.Boolean getHostNetwork();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.initContainers"></a>

```java
public java.util.List<ContainerProps> getInitContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.isolate"></a>

```java
public java.lang.Boolean getIsolate();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.restartPolicy"></a>

```java
public RestartPolicy getRestartPolicy();
```

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.securityContext"></a>

```java
public PodSecurityContextProps getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.serviceAccount"></a>

```java
public IServiceAccount getServiceAccount();
```

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.terminationGracePeriod"></a>

```java
public Duration getTerminationGracePeriod();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.volumes"></a>

```java
public java.util.List<Volume> getVolumes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.podMetadata"></a>

```java
public ApiObjectMetadata getPodMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.select"></a>

```java
public java.lang.Boolean getSelect();
```

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.spread"></a>

```java
public java.lang.Boolean getSpread();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `minReady`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.minReady"></a>

```java
public Duration getMinReady();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(0)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

Zero means the pod will be considered available as soon as it is ready.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds

---

##### `progressDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.progressDeadline"></a>

```java
public Duration getProgressDeadline();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(600)

The maximum duration for a deployment to make progress before it is considered to be failed.

The deployment controller will continue
to process failed deployments and a condition with a ProgressDeadlineExceeded
reason will be surfaced in the deployment status.

Note that progress will not be estimated during the time a deployment is paused.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#progress-deadline-seconds

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.replicas"></a>

```java
public java.lang.Number getReplicas();
```

- *Type:* `java.lang.Number`
- *Default:* 2

Number of desired pods.

---

##### `strategy`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentProps.property.strategy"></a>

```java
public DeploymentStrategy getStrategy();
```

- *Type:* [`org.cdk8s.plus27.DeploymentStrategy`](#org.cdk8s.plus27.DeploymentStrategy)
- *Default:* RollingUpdate with maxSurge and maxUnavailable set to 25%.

Specifies the strategy used to replace old Pods by new ones.

---

### DeploymentStrategyRollingUpdateOptions <a name="org.cdk8s.plus27.DeploymentStrategyRollingUpdateOptions"></a>

Options for `DeploymentStrategy.rollingUpdate`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.DeploymentStrategyRollingUpdateOptions;

DeploymentStrategyRollingUpdateOptions.builder()
//  .maxSurge(PercentOrAbsolute)
//  .maxUnavailable(PercentOrAbsolute)
    .build();
```

##### `maxSurge`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentStrategyRollingUpdateOptions.property.maxSurge"></a>

```java
public PercentOrAbsolute getMaxSurge();
```

- *Type:* [`org.cdk8s.plus27.PercentOrAbsolute`](#org.cdk8s.plus27.PercentOrAbsolute)
- *Default:* '25%'

The maximum number of pods that can be scheduled above the desired number of pods.

Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%).
Absolute number is calculated from percentage by rounding up.
This can not be 0 if `maxUnavailable` is 0.

Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update
starts, such that the total number of old and new pods do not exceed 130% of desired pods.
Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that
total number of pods running at any time during the update is at most 130% of desired pods.

---

##### `maxUnavailable`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentStrategyRollingUpdateOptions.property.maxUnavailable"></a>

```java
public PercentOrAbsolute getMaxUnavailable();
```

- *Type:* [`org.cdk8s.plus27.PercentOrAbsolute`](#org.cdk8s.plus27.PercentOrAbsolute)
- *Default:* '25%'

The maximum number of pods that can be unavailable during the update.

Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%).
Absolute number is calculated from percentage by rounding down.
This can not be 0 if `maxSurge` is 0.

Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired
pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can
be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total
number of pods available at all times during the update is at least 70% of desired pods.

---

### DnsOption <a name="org.cdk8s.plus27.DnsOption"></a>

Custom DNS option.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.DnsOption;

DnsOption.builder()
    .name(java.lang.String)
//  .value(java.lang.String)
    .build();
```

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.DnsOption.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

Option name.

---

##### `value`<sup>Optional</sup> <a name="org.cdk8s.plus27.DnsOption.property.value"></a>

```java
public java.lang.String getValue();
```

- *Type:* `java.lang.String`
- *Default:* No value.

Option value.

---

### DockerConfigSecretProps <a name="org.cdk8s.plus27.DockerConfigSecretProps"></a>

Options for `DockerConfigSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.DockerConfigSecretProps;

DockerConfigSecretProps.builder()
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .data(java.util.Map<java.lang.String, java.lang.Object>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.DockerConfigSecretProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.DockerConfigSecretProps.property.immutable"></a>

```java
public java.lang.Boolean getImmutable();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `data`<sup>Required</sup> <a name="org.cdk8s.plus27.DockerConfigSecretProps.property.data"></a>

```java
public java.util.Map<java.lang.String, java.lang.Object> getData();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.Object`>

JSON content to provide for the `~/.docker/config.json` file. This will be stringified and inserted as stringData.

> https://docs.docker.com/engine/reference/commandline/cli/#sample-configuration-file

---

### EmptyDirVolumeOptions <a name="org.cdk8s.plus27.EmptyDirVolumeOptions"></a>

Options for volumes populated with an empty directory.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.EmptyDirVolumeOptions;

EmptyDirVolumeOptions.builder()
//  .medium(EmptyDirMedium)
//  .sizeLimit(Size)
    .build();
```

##### `medium`<sup>Optional</sup> <a name="org.cdk8s.plus27.EmptyDirVolumeOptions.property.medium"></a>

```java
public EmptyDirMedium getMedium();
```

- *Type:* [`org.cdk8s.plus27.EmptyDirMedium`](#org.cdk8s.plus27.EmptyDirMedium)
- *Default:* EmptyDirMedium.DEFAULT

By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment.

However, you can set the emptyDir.medium field to
`EmptyDirMedium.MEMORY` to tell Kubernetes to mount a tmpfs (RAM-backed
filesystem) for you instead. While tmpfs is very fast, be aware that unlike
disks, tmpfs is cleared on node reboot and any files you write will count
against your Container's memory limit.

---

##### `sizeLimit`<sup>Optional</sup> <a name="org.cdk8s.plus27.EmptyDirVolumeOptions.property.sizeLimit"></a>

```java
public Size getSizeLimit();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* limit is undefined

Total amount of local storage required for this EmptyDir volume.

The size
limit is also applicable for memory medium. The maximum usage on memory
medium EmptyDir would be the minimum value between the SizeLimit specified
here and the sum of memory limits of all containers in a pod.

---

### EnvValueFromConfigMapOptions <a name="org.cdk8s.plus27.EnvValueFromConfigMapOptions"></a>

Options to specify an envionment variable value from a ConfigMap key.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.EnvValueFromConfigMapOptions;

EnvValueFromConfigMapOptions.builder()
//  .optional(java.lang.Boolean)
    .build();
```

##### `optional`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValueFromConfigMapOptions.property.optional"></a>

```java
public java.lang.Boolean getOptional();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify whether the ConfigMap or its key must be defined.

---

### EnvValueFromFieldRefOptions <a name="org.cdk8s.plus27.EnvValueFromFieldRefOptions"></a>

Options to specify an environment variable value from a field reference.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.EnvValueFromFieldRefOptions;

EnvValueFromFieldRefOptions.builder()
//  .apiVersion(java.lang.String)
//  .key(java.lang.String)
    .build();
```

##### `apiVersion`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValueFromFieldRefOptions.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

Version of the schema the FieldPath is written in terms of.

---

##### `key`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValueFromFieldRefOptions.property.key"></a>

```java
public java.lang.String getKey();
```

- *Type:* `java.lang.String`

The key to select the pod label or annotation.

---

### EnvValueFromProcessOptions <a name="org.cdk8s.plus27.EnvValueFromProcessOptions"></a>

Options to specify an environment variable value from the process environment.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.EnvValueFromProcessOptions;

EnvValueFromProcessOptions.builder()
//  .required(java.lang.Boolean)
    .build();
```

##### `required`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValueFromProcessOptions.property.required"></a>

```java
public java.lang.Boolean getRequired();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify whether the key must exist in the environment.

If this is set to true, and the key does not exist, an error will thrown.

---

### EnvValueFromResourceOptions <a name="org.cdk8s.plus27.EnvValueFromResourceOptions"></a>

Options to specify an environment variable value from a resource.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.EnvValueFromResourceOptions;

EnvValueFromResourceOptions.builder()
//  .container(Container)
//  .divisor(java.lang.String)
    .build();
```

##### `container`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValueFromResourceOptions.property.container"></a>

```java
public Container getContainer();
```

- *Type:* [`org.cdk8s.plus27.Container`](#org.cdk8s.plus27.Container)

The container to select the value from.

---

##### `divisor`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValueFromResourceOptions.property.divisor"></a>

```java
public java.lang.String getDivisor();
```

- *Type:* `java.lang.String`

The output format of the exposed resource.

---

### EnvValueFromSecretOptions <a name="org.cdk8s.plus27.EnvValueFromSecretOptions"></a>

Options to specify an environment variable value from a Secret.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.EnvValueFromSecretOptions;

EnvValueFromSecretOptions.builder()
//  .optional(java.lang.Boolean)
    .build();
```

##### `optional`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValueFromSecretOptions.property.optional"></a>

```java
public java.lang.Boolean getOptional();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify whether the Secret or its key must be defined.

---

### EphemeralStorageResources <a name="org.cdk8s.plus27.EphemeralStorageResources"></a>

Emphemeral storage request and limit.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.EphemeralStorageResources;

EphemeralStorageResources.builder()
//  .limit(Size)
//  .request(Size)
    .build();
```

##### `limit`<sup>Optional</sup> <a name="org.cdk8s.plus27.EphemeralStorageResources.property.limit"></a>

```java
public Size getLimit();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)

---

##### `request`<sup>Optional</sup> <a name="org.cdk8s.plus27.EphemeralStorageResources.property.request"></a>

```java
public Size getRequest();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)

---

### ExposeDeploymentViaIngressOptions <a name="org.cdk8s.plus27.ExposeDeploymentViaIngressOptions"></a>

Options for exposing a deployment via an ingress.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ExposeDeploymentViaIngressOptions;

ExposeDeploymentViaIngressOptions.builder()
//  .name(java.lang.String)
//  .ports(java.util.List<ServicePort>)
//  .serviceType(ServiceType)
//  .ingress(Ingress)
//  .pathType(HttpIngressPathType)
    .build();
```

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.ExposeDeploymentViaIngressOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* auto generated.

The name of the service to expose.

If you'd like to expose the deployment multiple times,
you must explicitly set a name starting from the second expose call.

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.ExposeDeploymentViaIngressOptions.property.ports"></a>

```java
public java.util.List<ServicePort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ServicePort`](#org.cdk8s.plus27.ServicePort)>
- *Default:* extracted from the deployment.

The ports that the service should bind to.

---

##### `serviceType`<sup>Optional</sup> <a name="org.cdk8s.plus27.ExposeDeploymentViaIngressOptions.property.serviceType"></a>

```java
public ServiceType getServiceType();
```

- *Type:* [`org.cdk8s.plus27.ServiceType`](#org.cdk8s.plus27.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

##### `ingress`<sup>Optional</sup> <a name="org.cdk8s.plus27.ExposeDeploymentViaIngressOptions.property.ingress"></a>

```java
public Ingress getIngress();
```

- *Type:* [`org.cdk8s.plus27.Ingress`](#org.cdk8s.plus27.Ingress)
- *Default:* An ingress will be automatically created.

The ingress to add rules to.

---

##### `pathType`<sup>Optional</sup> <a name="org.cdk8s.plus27.ExposeDeploymentViaIngressOptions.property.pathType"></a>

```java
public HttpIngressPathType getPathType();
```

- *Type:* [`org.cdk8s.plus27.HttpIngressPathType`](#org.cdk8s.plus27.HttpIngressPathType)
- *Default:* HttpIngressPathType.PREFIX

The type of the path.

---

### ExposeServiceViaIngressOptions <a name="org.cdk8s.plus27.ExposeServiceViaIngressOptions"></a>

Options for exposing a service using an ingress.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ExposeServiceViaIngressOptions;

ExposeServiceViaIngressOptions.builder()
//  .ingress(Ingress)
//  .pathType(HttpIngressPathType)
    .build();
```

##### `ingress`<sup>Optional</sup> <a name="org.cdk8s.plus27.ExposeServiceViaIngressOptions.property.ingress"></a>

```java
public Ingress getIngress();
```

- *Type:* [`org.cdk8s.plus27.Ingress`](#org.cdk8s.plus27.Ingress)
- *Default:* An ingress will be automatically created.

The ingress to add rules to.

---

##### `pathType`<sup>Optional</sup> <a name="org.cdk8s.plus27.ExposeServiceViaIngressOptions.property.pathType"></a>

```java
public HttpIngressPathType getPathType();
```

- *Type:* [`org.cdk8s.plus27.HttpIngressPathType`](#org.cdk8s.plus27.HttpIngressPathType)
- *Default:* HttpIngressPathType.PREFIX

The type of the path.

---

### FromServiceAccountNameOptions <a name="org.cdk8s.plus27.FromServiceAccountNameOptions"></a>

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.FromServiceAccountNameOptions;

FromServiceAccountNameOptions.builder()
//  .namespaceName(java.lang.String)
    .build();
```

##### `namespaceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.FromServiceAccountNameOptions.property.namespaceName"></a>

```java
public java.lang.String getNamespaceName();
```

- *Type:* `java.lang.String`
- *Default:* "default"

The name of the namespace the service account belongs to.

---

### GCEPersistentDiskPersistentVolumeProps <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps"></a>

Properties for `GCEPersistentDiskPersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps;

GCEPersistentDiskPersistentVolumeProps.builder()
//  .metadata(ApiObjectMetadata)
//  .accessModes(java.util.List<PersistentVolumeAccessMode>)
//  .claim(IPersistentVolumeClaim)
//  .mountOptions(java.util.List<java.lang.String>)
//  .reclaimPolicy(PersistentVolumeReclaimPolicy)
//  .storage(Size)
//  .storageClassName(java.lang.String)
//  .volumeMode(PersistentVolumeMode)
    .pdName(java.lang.String)
//  .fsType(java.lang.String)
//  .partition(java.lang.Number)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.accessModes"></a>

```java
public java.util.List<PersistentVolumeAccessMode> getAccessModes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.claim"></a>

```java
public IPersistentVolumeClaim getClaim();
```

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.mountOptions"></a>

```java
public java.util.List<java.lang.String> getMountOptions();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.reclaimPolicy"></a>

```java
public PersistentVolumeReclaimPolicy getReclaimPolicy();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeReclaimPolicy`](#org.cdk8s.plus27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.storage"></a>

```java
public Size getStorage();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.storageClassName"></a>

```java
public java.lang.String getStorageClassName();
```

- *Type:* `java.lang.String`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.volumeMode"></a>

```java
public PersistentVolumeMode getVolumeMode();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `pdName`<sup>Required</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.pdName"></a>

```java
public java.lang.String getPdName();
```

- *Type:* `java.lang.String`

Unique name of the PD resource in GCE.

Used to identify the disk in GCE.

> https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

---

##### `fsType`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.fsType"></a>

```java
public java.lang.String getFsType();
```

- *Type:* `java.lang.String`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `partition`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.partition"></a>

```java
public java.lang.Number getPartition();
```

- *Type:* `java.lang.Number`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskPersistentVolumeProps.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### GCEPersistentDiskVolumeOptions <a name="org.cdk8s.plus27.GCEPersistentDiskVolumeOptions"></a>

Options of `Volume.fromGcePersistentDisk`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.GCEPersistentDiskVolumeOptions;

GCEPersistentDiskVolumeOptions.builder()
//  .fsType(java.lang.String)
//  .name(java.lang.String)
//  .partition(java.lang.Number)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `fsType`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskVolumeOptions.property.fsType"></a>

```java
public java.lang.String getFsType();
```

- *Type:* `java.lang.String`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskVolumeOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* auto-generated

The volume name.

---

##### `partition`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskVolumeOptions.property.partition"></a>

```java
public java.lang.Number getPartition();
```

- *Type:* `java.lang.Number`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.GCEPersistentDiskVolumeOptions.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### HandlerFromHttpGetOptions <a name="org.cdk8s.plus27.HandlerFromHttpGetOptions"></a>

Options for `Handler.fromHttpGet`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.HandlerFromHttpGetOptions;

HandlerFromHttpGetOptions.builder()
//  .port(java.lang.Number)
    .build();
```

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus27.HandlerFromHttpGetOptions.property.port"></a>

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---

### HandlerFromTcpSocketOptions <a name="org.cdk8s.plus27.HandlerFromTcpSocketOptions"></a>

Options for `Handler.fromTcpSocket`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.HandlerFromTcpSocketOptions;

HandlerFromTcpSocketOptions.builder()
//  .host(java.lang.String)
//  .port(java.lang.Number)
    .build();
```

##### `host`<sup>Optional</sup> <a name="org.cdk8s.plus27.HandlerFromTcpSocketOptions.property.host"></a>

```java
public java.lang.String getHost();
```

- *Type:* `java.lang.String`
- *Default:* defaults to the pod IP

The host name to connect to on the container.

---

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus27.HandlerFromTcpSocketOptions.property.port"></a>

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`
- *Default:* defaults to `container.port`.

The TCP port to connect to on the container.

---

### HorizontalPodAutoscalerProps <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps"></a>

Properties for HorizontalPodAutoscaler.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.HorizontalPodAutoscalerProps;

HorizontalPodAutoscalerProps.builder()
//  .metadata(ApiObjectMetadata)
    .maxReplicas(java.lang.Number)
    .target(IScalable)
//  .metrics(java.util.List<Metric>)
//  .minReplicas(java.lang.Number)
//  .scaleDown(ScalingRules)
//  .scaleUp(ScalingRules)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `maxReplicas`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.property.maxReplicas"></a>

```java
public java.lang.Number getMaxReplicas();
```

- *Type:* `java.lang.Number`

The maximum number of replicas that can be scaled up to.

---

##### `target`<sup>Required</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.property.target"></a>

```java
public IScalable getTarget();
```

- *Type:* [`org.cdk8s.plus27.IScalable`](#org.cdk8s.plus27.IScalable)

The workload to scale up or down.

Scalable workload types:

* Deployment
* StatefulSet

---

##### `metrics`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.property.metrics"></a>

```java
public java.util.List<Metric> getMetrics();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Metric`](#org.cdk8s.plus27.Metric)>
- *Default:* If metrics are not provided, then the target resource
constraints (e.g. cpu limit) will be used as scaling metrics.

The metric conditions that trigger a scale up or scale down.

---

##### `minReplicas`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.property.minReplicas"></a>

```java
public java.lang.Number getMinReplicas();
```

- *Type:* `java.lang.Number`
- *Default:* 1

The minimum number of replicas that can be scaled down to.

Can be set to 0 if the alpha feature gate `HPAScaleToZero` is enabled and
at least one Object or External metric is configured.

---

##### `scaleDown`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.property.scaleDown"></a>

```java
public ScalingRules getScaleDown();
```

- *Type:* [`org.cdk8s.plus27.ScalingRules`](#org.cdk8s.plus27.ScalingRules)
- *Default:* Scale down to minReplica count with a 5 minute stabilization window.

The scaling behavior when scaling down.

---

##### `scaleUp`<sup>Optional</sup> <a name="org.cdk8s.plus27.HorizontalPodAutoscalerProps.property.scaleUp"></a>

```java
public ScalingRules getScaleUp();
```

- *Type:* [`org.cdk8s.plus27.ScalingRules`](#org.cdk8s.plus27.ScalingRules)
- *Default:* Is the higher of:
* Increase no more than 4 pods per 60 seconds
* Double the number of pods per 60 seconds

The scaling behavior when scaling up.

---

### HostAlias <a name="org.cdk8s.plus27.HostAlias"></a>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's /etc/hosts file.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.HostAlias;

HostAlias.builder()
    .hostnames(java.util.List<java.lang.String>)
    .ip(java.lang.String)
    .build();
```

##### `hostnames`<sup>Required</sup> <a name="org.cdk8s.plus27.HostAlias.property.hostnames"></a>

```java
public java.util.List<java.lang.String> getHostnames();
```

- *Type:* java.util.List<`java.lang.String`>

Hostnames for the chosen IP address.

---

##### `ip`<sup>Required</sup> <a name="org.cdk8s.plus27.HostAlias.property.ip"></a>

```java
public java.lang.String getIp();
```

- *Type:* `java.lang.String`

IP address of the host file entry.

---

### HostPathVolumeOptions <a name="org.cdk8s.plus27.HostPathVolumeOptions"></a>

Options for a HostPathVolume-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.HostPathVolumeOptions;

HostPathVolumeOptions.builder()
    .path(java.lang.String)
//  .type(HostPathVolumeType)
    .build();
```

##### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.HostPathVolumeOptions.property.path"></a>

```java
public java.lang.String getPath();
```

- *Type:* `java.lang.String`

The path of the directory on the host.

---

##### `type`<sup>Optional</sup> <a name="org.cdk8s.plus27.HostPathVolumeOptions.property.type"></a>

```java
public HostPathVolumeType getType();
```

- *Type:* [`org.cdk8s.plus27.HostPathVolumeType`](#org.cdk8s.plus27.HostPathVolumeType)
- *Default:* HostPathVolumeType.DEFAULT

The expected type of the path found on the host.

---

### HttpGetProbeOptions <a name="org.cdk8s.plus27.HttpGetProbeOptions"></a>

Options for `Probe.fromHttpGet()`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.HttpGetProbeOptions;

HttpGetProbeOptions.builder()
//  .failureThreshold(java.lang.Number)
//  .initialDelaySeconds(Duration)
//  .periodSeconds(Duration)
//  .successThreshold(java.lang.Number)
//  .timeoutSeconds(Duration)
//  .port(java.lang.Number)
//  .scheme(ConnectionScheme)
    .build();
```

##### `failureThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus27.HttpGetProbeOptions.property.failureThreshold"></a>

```java
public java.lang.Number getFailureThreshold();
```

- *Type:* `java.lang.Number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.HttpGetProbeOptions.property.initialDelaySeconds"></a>

```java
public Duration getInitialDelaySeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.HttpGetProbeOptions.property.periodSeconds"></a>

```java
public Duration getPeriodSeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus27.HttpGetProbeOptions.property.successThreshold"></a>

```java
public java.lang.Number getSuccessThreshold();
```

- *Type:* `java.lang.Number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.HttpGetProbeOptions.property.timeoutSeconds"></a>

```java
public Duration getTimeoutSeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus27.HttpGetProbeOptions.property.port"></a>

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---

##### `scheme`<sup>Optional</sup> <a name="org.cdk8s.plus27.HttpGetProbeOptions.property.scheme"></a>

```java
public ConnectionScheme getScheme();
```

- *Type:* [`org.cdk8s.plus27.ConnectionScheme`](#org.cdk8s.plus27.ConnectionScheme)
- *Default:* ConnectionScheme.HTTP

Scheme to use for connecting to the host (HTTP or HTTPS).

---

### IngressProps <a name="org.cdk8s.plus27.IngressProps"></a>

Properties for `Ingress`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.IngressProps;

IngressProps.builder()
//  .metadata(ApiObjectMetadata)
//  .defaultBackend(IngressBackend)
//  .rules(java.util.List<IngressRule>)
//  .tls(java.util.List<IngressTls>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `defaultBackend`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressProps.property.defaultBackend"></a>

```java
public IngressBackend getDefaultBackend();
```

- *Type:* [`org.cdk8s.plus27.IngressBackend`](#org.cdk8s.plus27.IngressBackend)

The default backend services requests that do not match any rule.

Using this option or the `addDefaultBackend()` method is equivalent to
adding a rule with both `path` and `host` undefined.

---

##### `rules`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressProps.property.rules"></a>

```java
public java.util.List<IngressRule> getRules();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.IngressRule`](#org.cdk8s.plus27.IngressRule)>

Routing rules for this ingress.

Each rule must define an `IngressBackend` that will receive the requests
that match this rule. If both `host` and `path` are not specifiec, this
backend will be used as the default backend of the ingress.

You can also add rules later using `addRule()`, `addHostRule()`,
`addDefaultBackend()` and `addHostDefaultBackend()`.

---

##### `tls`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressProps.property.tls"></a>

```java
public java.util.List<IngressTls> getTls();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.IngressTls`](#org.cdk8s.plus27.IngressTls)>

TLS settings for this ingress.

Using this option tells the ingress controller to expose a TLS endpoint.
Currently the Ingress only supports a single TLS port, 443. If multiple
members of this list specify different hosts, they will be multiplexed on
the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI.

---

### IngressRule <a name="org.cdk8s.plus27.IngressRule"></a>

Represents the rules mapping the paths under a specified host to the related backend services.

Incoming requests are first evaluated for a host match,
then routed to the backend associated with the matching path.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.IngressRule;

IngressRule.builder()
    .backend(IngressBackend)
//  .host(java.lang.String)
//  .path(java.lang.String)
//  .pathType(HttpIngressPathType)
    .build();
```

##### `backend`<sup>Required</sup> <a name="org.cdk8s.plus27.IngressRule.property.backend"></a>

```java
public IngressBackend getBackend();
```

- *Type:* [`org.cdk8s.plus27.IngressBackend`](#org.cdk8s.plus27.IngressBackend)

Backend defines the referenced service endpoint to which the traffic will be forwarded to.

---

##### `host`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressRule.property.host"></a>

```java
public java.lang.String getHost();
```

- *Type:* `java.lang.String`
- *Default:* If the host is unspecified, the Ingress routes all traffic based
on the specified IngressRuleValue.

Host is the fully qualified domain name of a network host, as defined by RFC 3986.

Note the following deviations from the "host" part of the URI as
defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue
can only apply to the IP in the Spec of the parent Ingress. 2. The `:`
delimiter is not respected because ports are not allowed. Currently the
port of an Ingress is implicitly :80 for http and :443 for https. Both
these may change in the future. Incoming requests are matched against the
host before the IngressRuleValue.

---

##### `path`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressRule.property.path"></a>

```java
public java.lang.String getPath();
```

- *Type:* `java.lang.String`
- *Default:* If unspecified, the path defaults to a catch all sending traffic
to the backend.

Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'.

---

##### `pathType`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressRule.property.pathType"></a>

```java
public HttpIngressPathType getPathType();
```

- *Type:* [`org.cdk8s.plus27.HttpIngressPathType`](#org.cdk8s.plus27.HttpIngressPathType)

Specify how the path is matched against request paths.

By default, path
types will be matched by prefix.

> https://kubernetes.io/docs/concepts/services-networking/ingress/#path-types

---

### IngressTls <a name="org.cdk8s.plus27.IngressTls"></a>

Represents the TLS configuration mapping that is passed to the ingress controller for SSL termination.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.IngressTls;

IngressTls.builder()
//  .hosts(java.util.List<java.lang.String>)
//  .secret(ISecret)
    .build();
```

##### `hosts`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressTls.property.hosts"></a>

```java
public java.util.List<java.lang.String> getHosts();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* If unspecified, it defaults to the wildcard host setting for
the loadbalancer controller fulfilling this Ingress.

Hosts are a list of hosts included in the TLS certificate.

The values in
this list must match the name/s used in the TLS Secret.

---

##### `secret`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressTls.property.secret"></a>

```java
public ISecret getSecret();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* If unspecified, it allows SSL routing based on SNI hostname.

Secret is the secret that contains the certificate and key used to terminate SSL traffic on 443.

If the SNI host in a listener conflicts with
the "Host" header field used by an IngressRule, the SNI host is used for
termination and value of the Host header is used for routing.

---

### JobProps <a name="org.cdk8s.plus27.JobProps"></a>

Properties for `Job`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.JobProps;

JobProps.builder()
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
//  .activeDeadline(Duration)
//  .backoffLimit(java.lang.Number)
//  .ttlAfterFinished(Duration)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.automountServiceAccountToken"></a>

```java
public java.lang.Boolean getAutomountServiceAccountToken();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.containers"></a>

```java
public java.util.List<ContainerProps> getContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.dns"></a>

```java
public PodDnsProps getDns();
```

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.dockerRegistryAuth"></a>

```java
public ISecret getDockerRegistryAuth();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.hostAliases"></a>

```java
public java.util.List<HostAlias> getHostAliases();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.hostNetwork"></a>

```java
public java.lang.Boolean getHostNetwork();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.initContainers"></a>

```java
public java.util.List<ContainerProps> getInitContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.isolate"></a>

```java
public java.lang.Boolean getIsolate();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.restartPolicy"></a>

```java
public RestartPolicy getRestartPolicy();
```

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.securityContext"></a>

```java
public PodSecurityContextProps getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.serviceAccount"></a>

```java
public IServiceAccount getServiceAccount();
```

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.terminationGracePeriod"></a>

```java
public Duration getTerminationGracePeriod();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.volumes"></a>

```java
public java.util.List<Volume> getVolumes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.podMetadata"></a>

```java
public ApiObjectMetadata getPodMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.select"></a>

```java
public java.lang.Boolean getSelect();
```

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.spread"></a>

```java
public java.lang.Boolean getSpread();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `activeDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.activeDeadline"></a>

```java
public Duration getActiveDeadline();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoffLimit`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.backoffLimit"></a>

```java
public java.lang.Number getBackoffLimit();
```

- *Type:* `java.lang.Number`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="org.cdk8s.plus27.JobProps.property.ttlAfterFinished"></a>

```java
public Duration getTtlAfterFinished();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* If this field is unset, the Job won't be automatically deleted.

Limits the lifetime of a Job that has finished execution (either Complete or Failed).

If this field is set, after the Job finishes, it is eligible to
be automatically deleted. When the Job is being deleted, its lifecycle
guarantees (e.g. finalizers) will be honored. If this field is set to zero,
the Job becomes eligible to be deleted immediately after it finishes. This
field is alpha-level and is only honored by servers that enable the
`TTLAfterFinished` feature.

---

### LabelSelectorOptions <a name="org.cdk8s.plus27.LabelSelectorOptions"></a>

Options for `LabelSelector.of`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.LabelSelectorOptions;

LabelSelectorOptions.builder()
//  .expressions(java.util.List<LabelExpression>)
//  .labels(java.util.Map<java.lang.String, java.lang.String>)
    .build();
```

##### `expressions`<sup>Optional</sup> <a name="org.cdk8s.plus27.LabelSelectorOptions.property.expressions"></a>

```java
public java.util.List<LabelExpression> getExpressions();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.LabelExpression`](#org.cdk8s.plus27.LabelExpression)>

Expression based label matchers.

---

##### `labels`<sup>Optional</sup> <a name="org.cdk8s.plus27.LabelSelectorOptions.property.labels"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getLabels();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

Strict label matchers.

---

### LabelSelectorRequirement <a name="org.cdk8s.plus27.LabelSelectorRequirement"></a>

A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.LabelSelectorRequirement;

LabelSelectorRequirement.builder()
    .key(java.lang.String)
    .operator(java.lang.String)
//  .values(java.util.List<java.lang.String>)
    .build();
```

##### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.LabelSelectorRequirement.property.key"></a>

```java
public java.lang.String getKey();
```

- *Type:* `java.lang.String`

The label key that the selector applies to.

---

##### `operator`<sup>Required</sup> <a name="org.cdk8s.plus27.LabelSelectorRequirement.property.operator"></a>

```java
public java.lang.String getOperator();
```

- *Type:* `java.lang.String`

Represents a key's relationship to a set of values.

---

##### `values`<sup>Optional</sup> <a name="org.cdk8s.plus27.LabelSelectorRequirement.property.values"></a>

```java
public java.util.List<java.lang.String> getValues();
```

- *Type:* java.util.List<`java.lang.String`>

An array of string values.

If the operator is In or NotIn, the values array
must be non-empty. If the operator is Exists or DoesNotExist,
the values array must be empty. This array is replaced during a strategic merge patch.

---

### MemoryResources <a name="org.cdk8s.plus27.MemoryResources"></a>

Memory request and limit.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.MemoryResources;

MemoryResources.builder()
//  .limit(Size)
//  .request(Size)
    .build();
```

##### `limit`<sup>Optional</sup> <a name="org.cdk8s.plus27.MemoryResources.property.limit"></a>

```java
public Size getLimit();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)

---

##### `request`<sup>Optional</sup> <a name="org.cdk8s.plus27.MemoryResources.property.request"></a>

```java
public Size getRequest();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)

---

### MetricContainerResourceOptions <a name="org.cdk8s.plus27.MetricContainerResourceOptions"></a>

Options for `Metric.containerResource()`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.MetricContainerResourceOptions;

MetricContainerResourceOptions.builder()
    .container(Container)
    .target(MetricTarget)
    .build();
```

##### `container`<sup>Required</sup> <a name="org.cdk8s.plus27.MetricContainerResourceOptions.property.container"></a>

```java
public Container getContainer();
```

- *Type:* [`org.cdk8s.plus27.Container`](#org.cdk8s.plus27.Container)

Container where the metric can be found.

---

##### `target`<sup>Required</sup> <a name="org.cdk8s.plus27.MetricContainerResourceOptions.property.target"></a>

```java
public MetricTarget getTarget();
```

- *Type:* [`org.cdk8s.plus27.MetricTarget`](#org.cdk8s.plus27.MetricTarget)

Target metric value that will trigger scaling.

---

### MetricObjectOptions <a name="org.cdk8s.plus27.MetricObjectOptions"></a>

Options for `Metric.object()`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.MetricObjectOptions;

MetricObjectOptions.builder()
    .name(java.lang.String)
    .target(MetricTarget)
//  .labelSelector(LabelSelector)
    .object(IResource)
    .build();
```

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.MetricObjectOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The name of the metric to scale on.

---

##### `target`<sup>Required</sup> <a name="org.cdk8s.plus27.MetricObjectOptions.property.target"></a>

```java
public MetricTarget getTarget();
```

- *Type:* [`org.cdk8s.plus27.MetricTarget`](#org.cdk8s.plus27.MetricTarget)

The target metric value that will trigger scaling.

---

##### `labelSelector`<sup>Optional</sup> <a name="org.cdk8s.plus27.MetricObjectOptions.property.labelSelector"></a>

```java
public LabelSelector getLabelSelector();
```

- *Type:* [`org.cdk8s.plus27.LabelSelector`](#org.cdk8s.plus27.LabelSelector)
- *Default:* Just the metric 'name' will be used to gather metrics.

A selector to find a metric by label.

When set, it is passed as an additional parameter to the metrics server
for more specific metrics scoping.

---

##### `object`<sup>Required</sup> <a name="org.cdk8s.plus27.MetricObjectOptions.property.object"></a>

```java
public IResource getObject();
```

- *Type:* [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource)

Resource where the metric can be found.

---

### MetricOptions <a name="org.cdk8s.plus27.MetricOptions"></a>

Base options for a Metric.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.MetricOptions;

MetricOptions.builder()
    .name(java.lang.String)
    .target(MetricTarget)
//  .labelSelector(LabelSelector)
    .build();
```

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.MetricOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The name of the metric to scale on.

---

##### `target`<sup>Required</sup> <a name="org.cdk8s.plus27.MetricOptions.property.target"></a>

```java
public MetricTarget getTarget();
```

- *Type:* [`org.cdk8s.plus27.MetricTarget`](#org.cdk8s.plus27.MetricTarget)

The target metric value that will trigger scaling.

---

##### `labelSelector`<sup>Optional</sup> <a name="org.cdk8s.plus27.MetricOptions.property.labelSelector"></a>

```java
public LabelSelector getLabelSelector();
```

- *Type:* [`org.cdk8s.plus27.LabelSelector`](#org.cdk8s.plus27.LabelSelector)
- *Default:* Just the metric 'name' will be used to gather metrics.

A selector to find a metric by label.

When set, it is passed as an additional parameter to the metrics server
for more specific metrics scoping.

---

### MountOptions <a name="org.cdk8s.plus27.MountOptions"></a>

Options for mounts.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.MountOptions;

MountOptions.builder()
//  .propagation(MountPropagation)
//  .readOnly(java.lang.Boolean)
//  .subPath(java.lang.String)
//  .subPathExpr(java.lang.String)
    .build();
```

##### `propagation`<sup>Optional</sup> <a name="org.cdk8s.plus27.MountOptions.property.propagation"></a>

```java
public MountPropagation getPropagation();
```

- *Type:* [`org.cdk8s.plus27.MountPropagation`](#org.cdk8s.plus27.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.MountOptions.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

##### `subPath`<sup>Optional</sup> <a name="org.cdk8s.plus27.MountOptions.property.subPath"></a>

```java
public java.lang.String getSubPath();
```

- *Type:* `java.lang.String`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

##### `subPathExpr`<sup>Optional</sup> <a name="org.cdk8s.plus27.MountOptions.property.subPathExpr"></a>

```java
public java.lang.String getSubPathExpr();
```

- *Type:* `java.lang.String`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root).

`subPathExpr` and `subPath` are mutually exclusive.

---

### NamespaceProps <a name="org.cdk8s.plus27.NamespaceProps"></a>

Properties for `Namespace`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NamespaceProps;

NamespaceProps.builder()
//  .metadata(ApiObjectMetadata)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.NamespaceProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

### NamespaceSelectorConfig <a name="org.cdk8s.plus27.NamespaceSelectorConfig"></a>

Configuration for selecting namespaces.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NamespaceSelectorConfig;

NamespaceSelectorConfig.builder()
//  .labelSelector(LabelSelector)
//  .names(java.util.List<java.lang.String>)
    .build();
```

##### `labelSelector`<sup>Optional</sup> <a name="org.cdk8s.plus27.NamespaceSelectorConfig.property.labelSelector"></a>

```java
public LabelSelector getLabelSelector();
```

- *Type:* [`org.cdk8s.plus27.LabelSelector`](#org.cdk8s.plus27.LabelSelector)

A selector to select namespaces by labels.

---

##### `names`<sup>Optional</sup> <a name="org.cdk8s.plus27.NamespaceSelectorConfig.property.names"></a>

```java
public java.util.List<java.lang.String> getNames();
```

- *Type:* java.util.List<`java.lang.String`>

A list of names to select namespaces by names.

---

### NamespacesSelectOptions <a name="org.cdk8s.plus27.NamespacesSelectOptions"></a>

Options for `Namespaces.select`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NamespacesSelectOptions;

NamespacesSelectOptions.builder()
//  .expressions(java.util.List<LabelExpression>)
//  .labels(java.util.Map<java.lang.String, java.lang.String>)
//  .names(java.util.List<java.lang.String>)
    .build();
```

##### `expressions`<sup>Optional</sup> <a name="org.cdk8s.plus27.NamespacesSelectOptions.property.expressions"></a>

```java
public java.util.List<LabelExpression> getExpressions();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.LabelExpression`](#org.cdk8s.plus27.LabelExpression)>
- *Default:* no selector requirements.

Namespaces must satisfy these selectors.

The selectors query labels, just like the `labels` property, but they
provide a more advanced matching mechanism.

---

##### `labels`<sup>Optional</sup> <a name="org.cdk8s.plus27.NamespacesSelectOptions.property.labels"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getLabels();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>
- *Default:* no strict labels requirements.

Labels the namespaces must have.

This is equivalent to using an 'Is' selector.

---

##### `names`<sup>Optional</sup> <a name="org.cdk8s.plus27.NamespacesSelectOptions.property.names"></a>

```java
public java.util.List<java.lang.String> getNames();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* no name requirements.

Namespaces names must be one of these.

---

### NetworkPolicyAddEgressRuleOptions <a name="org.cdk8s.plus27.NetworkPolicyAddEgressRuleOptions"></a>

Options for `NetworkPolicy.addEgressRule`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NetworkPolicyAddEgressRuleOptions;

NetworkPolicyAddEgressRuleOptions.builder()
//  .ports(java.util.List<NetworkPolicyPort>)
    .build();
```

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyAddEgressRuleOptions.property.ports"></a>

```java
public java.util.List<NetworkPolicyPort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.NetworkPolicyPort`](#org.cdk8s.plus27.NetworkPolicyPort)>
- *Default:* If the peer is a managed pod, take its ports. Otherwise, all ports are allowed.

Ports the rule should allow outgoing traffic to.

---

### NetworkPolicyPeerConfig <a name="org.cdk8s.plus27.NetworkPolicyPeerConfig"></a>

Configuration for network peers.

A peer can either by an ip block, or a selection of pods, not both.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NetworkPolicyPeerConfig;

NetworkPolicyPeerConfig.builder()
//  .ipBlock(NetworkPolicyIpBlock)
//  .podSelector(PodSelectorConfig)
    .build();
```

##### `ipBlock`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyPeerConfig.property.ipBlock"></a>

```java
public NetworkPolicyIpBlock getIpBlock();
```

- *Type:* [`org.cdk8s.plus27.NetworkPolicyIpBlock`](#org.cdk8s.plus27.NetworkPolicyIpBlock)

The ip block this peer represents.

---

##### `podSelector`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyPeerConfig.property.podSelector"></a>

```java
public PodSelectorConfig getPodSelector();
```

- *Type:* [`org.cdk8s.plus27.PodSelectorConfig`](#org.cdk8s.plus27.PodSelectorConfig)

The pod selector this peer represents.

---

### NetworkPolicyPortProps <a name="org.cdk8s.plus27.NetworkPolicyPortProps"></a>

Properties for `NetworkPolicyPort`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NetworkPolicyPortProps;

NetworkPolicyPortProps.builder()
//  .endPort(java.lang.Number)
//  .port(java.lang.Number)
//  .protocol(NetworkProtocol)
    .build();
```

##### `endPort`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyPortProps.property.endPort"></a>

```java
public java.lang.Number getEndPort();
```

- *Type:* `java.lang.Number`
- *Default:* not a port range.

End port (relative to `port`).

Only applies if `port` is defined.
Use this to specify a port range, rather that a specific one.

---

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyPortProps.property.port"></a>

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`
- *Default:* all ports are allowed.

Specific port number.

---

##### `protocol`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyPortProps.property.protocol"></a>

```java
public NetworkProtocol getProtocol();
```

- *Type:* [`org.cdk8s.plus27.NetworkProtocol`](#org.cdk8s.plus27.NetworkProtocol)
- *Default:* NetworkProtocol.TCP

Protocol.

---

### NetworkPolicyProps <a name="org.cdk8s.plus27.NetworkPolicyProps"></a>

Properties for `NetworkPolicy`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NetworkPolicyProps;

NetworkPolicyProps.builder()
//  .metadata(ApiObjectMetadata)
//  .egress(NetworkPolicyTraffic)
//  .ingress(NetworkPolicyTraffic)
//  .selector(IPodSelector)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `egress`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyProps.property.egress"></a>

```java
public NetworkPolicyTraffic getEgress();
```

- *Type:* [`org.cdk8s.plus27.NetworkPolicyTraffic`](#org.cdk8s.plus27.NetworkPolicyTraffic)
- *Default:* the policy doesn't change egress behavior of the pods it selects.

Egress traffic configuration.

---

##### `ingress`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyProps.property.ingress"></a>

```java
public NetworkPolicyTraffic getIngress();
```

- *Type:* [`org.cdk8s.plus27.NetworkPolicyTraffic`](#org.cdk8s.plus27.NetworkPolicyTraffic)
- *Default:* the policy doesn't change ingress behavior of the pods it selects.

Ingress traffic configuration.

---

##### `selector`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyProps.property.selector"></a>

```java
public IPodSelector getSelector();
```

- *Type:* [`org.cdk8s.plus27.IPodSelector`](#org.cdk8s.plus27.IPodSelector)
- *Default:* will select all pods in the namespace of the policy.

Which pods does this policy object applies to.

This can either be a single pod / workload, or a grouping of pods selected
via the `Pods.select` function. Rules is applied to any pods selected by this property.
Multiple network policies can select the same set of pods.
In this case, the rules for each are combined additively.

Note that

---

### NetworkPolicyRule <a name="org.cdk8s.plus27.NetworkPolicyRule"></a>

Describes a rule allowing traffic from / to pods matched by a network policy selector.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NetworkPolicyRule;

NetworkPolicyRule.builder()
    .peer(INetworkPolicyPeer)
//  .ports(java.util.List<NetworkPolicyPort>)
    .build();
```

##### `peer`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyRule.property.peer"></a>

```java
public INetworkPolicyPeer getPeer();
```

- *Type:* [`org.cdk8s.plus27.INetworkPolicyPeer`](#org.cdk8s.plus27.INetworkPolicyPeer)

Peer this rule interacts with.

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyRule.property.ports"></a>

```java
public java.util.List<NetworkPolicyPort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.NetworkPolicyPort`](#org.cdk8s.plus27.NetworkPolicyPort)>
- *Default:* traffic is allowed on all ports.

The ports of the rule.

---

### NetworkPolicyTraffic <a name="org.cdk8s.plus27.NetworkPolicyTraffic"></a>

Describes how the network policy should configure egress / ingress traffic.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NetworkPolicyTraffic;

NetworkPolicyTraffic.builder()
//  .default(NetworkPolicyTrafficDefault)
//  .rules(java.util.List<NetworkPolicyRule>)
    .build();
```

##### `default`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyTraffic.property.default"></a>

```java
public NetworkPolicyTrafficDefault getDefault();
```

- *Type:* [`org.cdk8s.plus27.NetworkPolicyTrafficDefault`](#org.cdk8s.plus27.NetworkPolicyTrafficDefault)
- *Default:* unset, the policy does not change the behavior.

Specifies the default behavior of the policy when no rules are defined.

---

##### `rules`<sup>Optional</sup> <a name="org.cdk8s.plus27.NetworkPolicyTraffic.property.rules"></a>

```java
public java.util.List<NetworkPolicyRule> getRules();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.NetworkPolicyRule`](#org.cdk8s.plus27.NetworkPolicyRule)>
- *Default:* no rules

List of rules to be applied to the selected pods.

If empty, the behavior of the policy is dictated by the `default` property.

---

### NfsVolumeOptions <a name="org.cdk8s.plus27.NfsVolumeOptions"></a>

Options for the NFS based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NfsVolumeOptions;

NfsVolumeOptions.builder()
    .path(java.lang.String)
    .server(java.lang.String)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.NfsVolumeOptions.property.path"></a>

```java
public java.lang.String getPath();
```

- *Type:* `java.lang.String`

Path that is exported by the NFS server.

---

##### `server`<sup>Required</sup> <a name="org.cdk8s.plus27.NfsVolumeOptions.property.server"></a>

```java
public java.lang.String getServer();
```

- *Type:* `java.lang.String`

Server is the hostname or IP address of the NFS server.

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.NfsVolumeOptions.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, will force the NFS export to be mounted with read-only permissions.

---

### NodeTaintQueryOptions <a name="org.cdk8s.plus27.NodeTaintQueryOptions"></a>

Options for `NodeTaintQuery`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.NodeTaintQueryOptions;

NodeTaintQueryOptions.builder()
//  .effect(TaintEffect)
//  .evictAfter(Duration)
    .build();
```

##### `effect`<sup>Optional</sup> <a name="org.cdk8s.plus27.NodeTaintQueryOptions.property.effect"></a>

```java
public TaintEffect getEffect();
```

- *Type:* [`org.cdk8s.plus27.TaintEffect`](#org.cdk8s.plus27.TaintEffect)
- *Default:* all effects are matched.

The taint effect to match.

---

##### `evictAfter`<sup>Optional</sup> <a name="org.cdk8s.plus27.NodeTaintQueryOptions.property.evictAfter"></a>

```java
public Duration getEvictAfter();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* bound forever.

How much time should a pod that tolerates the `NO_EXECUTE` effect be bound to the node.

Only applies for the `NO_EXECUTE` effect.

---

### PathMapping <a name="org.cdk8s.plus27.PathMapping"></a>

Maps a string key to a path within a volume.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PathMapping;

PathMapping.builder()
    .path(java.lang.String)
//  .mode(java.lang.Number)
    .build();
```

##### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.PathMapping.property.path"></a>

```java
public java.lang.String getPath();
```

- *Type:* `java.lang.String`

The relative path of the file to map the key to.

May not be an absolute
path. May not contain the path element '..'. May not start with the string
'..'.

---

##### `mode`<sup>Optional</sup> <a name="org.cdk8s.plus27.PathMapping.property.mode"></a>

```java
public java.lang.Number getMode();
```

- *Type:* `java.lang.Number`

Optional: mode bits to use on this file, must be a value between 0 and 0777.

If not specified, the volume defaultMode will be used. This might be
in conflict with other options that affect the file mode, like fsGroup, and
the result can be other mode bits set.

---

### PersistentVolumeClaimProps <a name="org.cdk8s.plus27.PersistentVolumeClaimProps"></a>

Properties for `PersistentVolumeClaim`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PersistentVolumeClaimProps;

PersistentVolumeClaimProps.builder()
//  .metadata(ApiObjectMetadata)
//  .accessModes(java.util.List<PersistentVolumeAccessMode>)
//  .storage(Size)
//  .storageClassName(java.lang.String)
//  .volume(IPersistentVolume)
//  .volumeMode(PersistentVolumeMode)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.property.accessModes"></a>

```java
public java.util.List<PersistentVolumeAccessMode> getAccessModes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>
- *Default:* No access modes requirement.

Contains the access modes the volume should support.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.property.storage"></a>

```java
public Size getStorage();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* No storage requirement.

Minimum storage size the volume should have.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.property.storageClassName"></a>

```java
public java.lang.String getStorageClassName();
```

- *Type:* `java.lang.String`
- *Default:* Not set.

Name of the StorageClass required by the claim. When this property is not set, the behavior is as follows:.

* If the admission plugin is turned on, the storage class marked as default will be used.
* If the admission plugin is turned off, the pvc can only be bound to volumes without a storage class.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1

---

##### `volume`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.property.volume"></a>

```java
public IPersistentVolume getVolume();
```

- *Type:* [`org.cdk8s.plus27.IPersistentVolume`](#org.cdk8s.plus27.IPersistentVolume)
- *Default:* No specific volume binding.

The PersistentVolume backing this claim.

The control plane still checks that storage class, access modes,
and requested storage size on the volume are valid.

Note that in order to guarantee a proper binding, the volume should
also define a `claimRef` referring to this claim. Otherwise, the volume may be
claimed be other pvc's before it gets a chance to bind to this one.

If the volume is managed (i.e not imported), you can use `pv.claim()` to easily
create a bi-directional bounded claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#binding.

---

##### `volumeMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimProps.property.volumeMode"></a>

```java
public PersistentVolumeMode getVolumeMode();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

### PersistentVolumeClaimVolumeOptions <a name="org.cdk8s.plus27.PersistentVolumeClaimVolumeOptions"></a>

Options for a PersistentVolumeClaim-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PersistentVolumeClaimVolumeOptions;

PersistentVolumeClaimVolumeOptions.builder()
//  .name(java.lang.String)
//  .readOnly(java.lang.Boolean)
    .build();
```

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimVolumeOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* Derived from the PVC name.

The volume name.

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeClaimVolumeOptions.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Will force the ReadOnly setting in VolumeMounts.

---

### PersistentVolumeProps <a name="org.cdk8s.plus27.PersistentVolumeProps"></a>

Properties for `PersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PersistentVolumeProps;

PersistentVolumeProps.builder()
//  .metadata(ApiObjectMetadata)
//  .accessModes(java.util.List<PersistentVolumeAccessMode>)
//  .claim(IPersistentVolumeClaim)
//  .mountOptions(java.util.List<java.lang.String>)
//  .reclaimPolicy(PersistentVolumeReclaimPolicy)
//  .storage(Size)
//  .storageClassName(java.lang.String)
//  .volumeMode(PersistentVolumeMode)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.property.accessModes"></a>

```java
public java.util.List<PersistentVolumeAccessMode> getAccessModes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.PersistentVolumeAccessMode`](#org.cdk8s.plus27.PersistentVolumeAccessMode)>
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.property.claim"></a>

```java
public IPersistentVolumeClaim getClaim();
```

- *Type:* [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.property.mountOptions"></a>

```java
public java.util.List<java.lang.String> getMountOptions();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.property.reclaimPolicy"></a>

```java
public PersistentVolumeReclaimPolicy getReclaimPolicy();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeReclaimPolicy`](#org.cdk8s.plus27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.property.storage"></a>

```java
public Size getStorage();
```

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.property.storageClassName"></a>

```java
public java.lang.String getStorageClassName();
```

- *Type:* `java.lang.String`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.PersistentVolumeProps.property.volumeMode"></a>

```java
public PersistentVolumeMode getVolumeMode();
```

- *Type:* [`org.cdk8s.plus27.PersistentVolumeMode`](#org.cdk8s.plus27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

### PodConnectionsAllowFromOptions <a name="org.cdk8s.plus27.PodConnectionsAllowFromOptions"></a>

Options for `PodConnections.allowFrom`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodConnectionsAllowFromOptions;

PodConnectionsAllowFromOptions.builder()
//  .isolation(PodConnectionsIsolation)
//  .ports(java.util.List<NetworkPolicyPort>)
    .build();
```

##### `isolation`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodConnectionsAllowFromOptions.property.isolation"></a>

```java
public PodConnectionsIsolation getIsolation();
```

- *Type:* [`org.cdk8s.plus27.PodConnectionsIsolation`](#org.cdk8s.plus27.PodConnectionsIsolation)
- *Default:* unset, isolates both the pod and the peer.

Which isolation should be applied to establish the connection.

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodConnectionsAllowFromOptions.property.ports"></a>

```java
public java.util.List<NetworkPolicyPort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.NetworkPolicyPort`](#org.cdk8s.plus27.NetworkPolicyPort)>
- *Default:* The pod ports.

Ports to allow incoming traffic to.

---

### PodConnectionsAllowToOptions <a name="org.cdk8s.plus27.PodConnectionsAllowToOptions"></a>

Options for `PodConnections.allowTo`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodConnectionsAllowToOptions;

PodConnectionsAllowToOptions.builder()
//  .isolation(PodConnectionsIsolation)
//  .ports(java.util.List<NetworkPolicyPort>)
    .build();
```

##### `isolation`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodConnectionsAllowToOptions.property.isolation"></a>

```java
public PodConnectionsIsolation getIsolation();
```

- *Type:* [`org.cdk8s.plus27.PodConnectionsIsolation`](#org.cdk8s.plus27.PodConnectionsIsolation)
- *Default:* unset, isolates both the pod and the peer.

Which isolation should be applied to establish the connection.

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodConnectionsAllowToOptions.property.ports"></a>

```java
public java.util.List<NetworkPolicyPort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.NetworkPolicyPort`](#org.cdk8s.plus27.NetworkPolicyPort)>
- *Default:* If the peer is a managed pod, take its ports. Otherwise, all ports are allowed.

Ports to allow outgoing traffic to.

---

### PodDnsProps <a name="org.cdk8s.plus27.PodDnsProps"></a>

Properties for `PodDns`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodDnsProps;

PodDnsProps.builder()
//  .hostname(java.lang.String)
//  .hostnameAsFQDN(java.lang.Boolean)
//  .nameservers(java.util.List<java.lang.String>)
//  .options(java.util.List<DnsOption>)
//  .policy(DnsPolicy)
//  .searches(java.util.List<java.lang.String>)
//  .subdomain(java.lang.String)
    .build();
```

##### `hostname`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.property.hostname"></a>

```java
public java.lang.String getHostname();
```

- *Type:* `java.lang.String`
- *Default:* Set to a system-defined value.

Specifies the hostname of the Pod.

---

##### `hostnameAsFQDN`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.property.hostnameAsFQDN"></a>

```java
public java.lang.Boolean getHostnameAsFQDN();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default).

In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname).
In Windows containers, this means setting the registry value of hostname for the registry
key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN.
If a pod does not have FQDN, this has no effect.

---

##### `nameservers`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.property.nameservers"></a>

```java
public java.util.List<java.lang.String> getNameservers();
```

- *Type:* java.util.List<`java.lang.String`>

A list of IP addresses that will be used as DNS servers for the Pod.

There can be at most 3 IP addresses specified.
When the policy is set to "NONE", the list must contain at least one IP address,
otherwise this property is optional.
The servers listed will be combined to the base nameservers generated from
the specified DNS policy with duplicate addresses removed.

---

##### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.property.options"></a>

```java
public java.util.List<DnsOption> getOptions();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.DnsOption`](#org.cdk8s.plus27.DnsOption)>

List of objects where each object may have a name property (required) and a value property (optional).

The contents in this property
will be merged to the options generated from the specified DNS policy.
Duplicate entries are removed.

---

##### `policy`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.property.policy"></a>

```java
public DnsPolicy getPolicy();
```

- *Type:* [`org.cdk8s.plus27.DnsPolicy`](#org.cdk8s.plus27.DnsPolicy)
- *Default:* DnsPolicy.CLUSTER_FIRST

Set DNS policy for the pod.

If policy is set to `None`, other configuration must be supplied.

---

##### `searches`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.property.searches"></a>

```java
public java.util.List<java.lang.String> getSearches();
```

- *Type:* java.util.List<`java.lang.String`>

A list of DNS search domains for hostname lookup in the Pod.

When specified, the provided list will be merged into the base
search domain names generated from the chosen DNS policy.
Duplicate domain names are removed.

Kubernetes allows for at most 6 search domains.

---

##### `subdomain`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.property.subdomain"></a>

```java
public java.lang.String getSubdomain();
```

- *Type:* `java.lang.String`
- *Default:* No subdomain.

If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>".

---

### PodProps <a name="org.cdk8s.plus27.PodProps"></a>

Properties for `Pod`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodProps;

PodProps.builder()
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.automountServiceAccountToken"></a>

```java
public java.lang.Boolean getAutomountServiceAccountToken();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.containers"></a>

```java
public java.util.List<ContainerProps> getContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.dns"></a>

```java
public PodDnsProps getDns();
```

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.dockerRegistryAuth"></a>

```java
public ISecret getDockerRegistryAuth();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.hostAliases"></a>

```java
public java.util.List<HostAlias> getHostAliases();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.hostNetwork"></a>

```java
public java.lang.Boolean getHostNetwork();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.initContainers"></a>

```java
public java.util.List<ContainerProps> getInitContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.isolate"></a>

```java
public java.lang.Boolean getIsolate();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.restartPolicy"></a>

```java
public RestartPolicy getRestartPolicy();
```

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.securityContext"></a>

```java
public PodSecurityContextProps getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.serviceAccount"></a>

```java
public IServiceAccount getServiceAccount();
```

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.terminationGracePeriod"></a>

```java
public Duration getTerminationGracePeriod();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodProps.property.volumes"></a>

```java
public java.util.List<Volume> getVolumes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

### PodsAllOptions <a name="org.cdk8s.plus27.PodsAllOptions"></a>

Options for `Pods.all`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodsAllOptions;

PodsAllOptions.builder()
//  .namespaces(Namespaces)
    .build();
```

##### `namespaces`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodsAllOptions.property.namespaces"></a>

```java
public Namespaces getNamespaces();
```

- *Type:* [`org.cdk8s.plus27.Namespaces`](#org.cdk8s.plus27.Namespaces)
- *Default:* unset, implies the namespace of the resource this selection is used in.

Namespaces the pods are allowed to be in.

Use `Namespaces.all()` to allow all namespaces.

---

### PodSchedulingAttractOptions <a name="org.cdk8s.plus27.PodSchedulingAttractOptions"></a>

Options for `PodScheduling.attract`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodSchedulingAttractOptions;

PodSchedulingAttractOptions.builder()
//  .weight(java.lang.Number)
    .build();
```

##### `weight`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSchedulingAttractOptions.property.weight"></a>

```java
public java.lang.Number getWeight();
```

- *Type:* `java.lang.Number`
- *Default:* no weight. assignment is assumed to be required (hard).

Indicates the attraction is optional (soft), with this weight score.

---

### PodSchedulingColocateOptions <a name="org.cdk8s.plus27.PodSchedulingColocateOptions"></a>

Options for `PodScheduling.colocate`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodSchedulingColocateOptions;

PodSchedulingColocateOptions.builder()
//  .topology(Topology)
//  .weight(java.lang.Number)
    .build();
```

##### `topology`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSchedulingColocateOptions.property.topology"></a>

```java
public Topology getTopology();
```

- *Type:* [`org.cdk8s.plus27.Topology`](#org.cdk8s.plus27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to coloate on.

---

##### `weight`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSchedulingColocateOptions.property.weight"></a>

```java
public java.lang.Number getWeight();
```

- *Type:* `java.lang.Number`
- *Default:* no weight. co-location is assumed to be required (hard).

Indicates the co-location is optional (soft), with this weight score.

---

### PodSchedulingSeparateOptions <a name="org.cdk8s.plus27.PodSchedulingSeparateOptions"></a>

Options for `PodScheduling.separate`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodSchedulingSeparateOptions;

PodSchedulingSeparateOptions.builder()
//  .topology(Topology)
//  .weight(java.lang.Number)
    .build();
```

##### `topology`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSchedulingSeparateOptions.property.topology"></a>

```java
public Topology getTopology();
```

- *Type:* [`org.cdk8s.plus27.Topology`](#org.cdk8s.plus27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to separate on.

---

##### `weight`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSchedulingSeparateOptions.property.weight"></a>

```java
public java.lang.Number getWeight();
```

- *Type:* `java.lang.Number`
- *Default:* no weight. separation is assumed to be required (hard).

Indicates the separation is optional (soft), with this weight score.

---

### PodSecurityContextProps <a name="org.cdk8s.plus27.PodSecurityContextProps"></a>

Properties for `PodSecurityContext`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodSecurityContextProps;

PodSecurityContextProps.builder()
//  .ensureNonRoot(java.lang.Boolean)
//  .fsGroup(java.lang.Number)
//  .fsGroupChangePolicy(FsGroupChangePolicy)
//  .group(java.lang.Number)
//  .sysctls(java.util.List<Sysctl>)
//  .user(java.lang.Number)
    .build();
```

##### `ensureNonRoot`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.property.ensureNonRoot"></a>

```java
public java.lang.Boolean getEnsureNonRoot();
```

- *Type:* `java.lang.Boolean`
- *Default:* true

Indicates that the container must run as a non-root user.

If true, the Kubelet will validate the image at runtime to ensure that it does
not run as UID 0 (root) and fail to start the container if it does.

---

##### `fsGroup`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.property.fsGroup"></a>

```java
public java.lang.Number getFsGroup();
```

- *Type:* `java.lang.Number`
- *Default:* Volume ownership is not changed.

Modify the ownership and permissions of pod volumes to this GID.

---

##### `fsGroupChangePolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.property.fsGroupChangePolicy"></a>

```java
public FsGroupChangePolicy getFsGroupChangePolicy();
```

- *Type:* [`org.cdk8s.plus27.FsGroupChangePolicy`](#org.cdk8s.plus27.FsGroupChangePolicy)
- *Default:* FsGroupChangePolicy.ALWAYS

Defines behavior of changing ownership and permission of the volume before being exposed inside Pod.

This field will only apply to volume types which support fsGroup based ownership(and permissions).
It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir.

---

##### `group`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.property.group"></a>

```java
public java.lang.Number getGroup();
```

- *Type:* `java.lang.Number`
- *Default:* Group configured by container runtime

The GID to run the entrypoint of the container process.

---

##### `sysctls`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.property.sysctls"></a>

```java
public java.util.List<Sysctl> getSysctls();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Sysctl`](#org.cdk8s.plus27.Sysctl)>
- *Default:* No sysctls

Sysctls hold a list of namespaced sysctls used for the pod.

Pods with unsupported sysctls (by the container runtime) might fail to launch.

---

##### `user`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.property.user"></a>

```java
public java.lang.Number getUser();
```

- *Type:* `java.lang.Number`
- *Default:* User specified in image metadata

The UID to run the entrypoint of the container process.

---

### PodSelectorConfig <a name="org.cdk8s.plus27.PodSelectorConfig"></a>

Configuration for selecting pods, optionally in particular namespaces.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodSelectorConfig;

PodSelectorConfig.builder()
    .labelSelector(LabelSelector)
//  .namespaces(NamespaceSelectorConfig)
    .build();
```

##### `labelSelector`<sup>Required</sup> <a name="org.cdk8s.plus27.PodSelectorConfig.property.labelSelector"></a>

```java
public LabelSelector getLabelSelector();
```

- *Type:* [`org.cdk8s.plus27.LabelSelector`](#org.cdk8s.plus27.LabelSelector)

A selector to select pods by labels.

---

##### `namespaces`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSelectorConfig.property.namespaces"></a>

```java
public NamespaceSelectorConfig getNamespaces();
```

- *Type:* [`org.cdk8s.plus27.NamespaceSelectorConfig`](#org.cdk8s.plus27.NamespaceSelectorConfig)

Configuration for selecting which namepsaces are the pods allowed to be in.

---

### PodsSelectOptions <a name="org.cdk8s.plus27.PodsSelectOptions"></a>

Options for `Pods.select`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.PodsSelectOptions;

PodsSelectOptions.builder()
//  .expressions(java.util.List<LabelExpression>)
//  .labels(java.util.Map<java.lang.String, java.lang.String>)
//  .namespaces(Namespaces)
    .build();
```

##### `expressions`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodsSelectOptions.property.expressions"></a>

```java
public java.util.List<LabelExpression> getExpressions();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.LabelExpression`](#org.cdk8s.plus27.LabelExpression)>
- *Default:* no expressions requirements.

Expressions the pods must satisify.

---

##### `labels`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodsSelectOptions.property.labels"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getLabels();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>
- *Default:* no strict labels requirements.

Labels the pods must have.

---

##### `namespaces`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodsSelectOptions.property.namespaces"></a>

```java
public Namespaces getNamespaces();
```

- *Type:* [`org.cdk8s.plus27.Namespaces`](#org.cdk8s.plus27.Namespaces)
- *Default:* unset, implies the namespace of the resource this selection is used in.

Namespaces the pods are allowed to be in.

Use `Namespaces.all()` to allow all namespaces.

---

### ProbeOptions <a name="org.cdk8s.plus27.ProbeOptions"></a>

Probe options.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ProbeOptions;

ProbeOptions.builder()
//  .failureThreshold(java.lang.Number)
//  .initialDelaySeconds(Duration)
//  .periodSeconds(Duration)
//  .successThreshold(java.lang.Number)
//  .timeoutSeconds(Duration)
    .build();
```

##### `failureThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus27.ProbeOptions.property.failureThreshold"></a>

```java
public java.lang.Number getFailureThreshold();
```

- *Type:* `java.lang.Number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.ProbeOptions.property.initialDelaySeconds"></a>

```java
public Duration getInitialDelaySeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.ProbeOptions.property.periodSeconds"></a>

```java
public Duration getPeriodSeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus27.ProbeOptions.property.successThreshold"></a>

```java
public java.lang.Number getSuccessThreshold();
```

- *Type:* `java.lang.Number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.ProbeOptions.property.timeoutSeconds"></a>

```java
public Duration getTimeoutSeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

### ResourceProps <a name="org.cdk8s.plus27.ResourceProps"></a>

Initialization properties for resources.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ResourceProps;

ResourceProps.builder()
//  .metadata(ApiObjectMetadata)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ResourceProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

### RoleBindingProps <a name="org.cdk8s.plus27.RoleBindingProps"></a>

Properties for `RoleBinding`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.RoleBindingProps;

RoleBindingProps.builder()
//  .metadata(ApiObjectMetadata)
    .role(IRole)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.RoleBindingProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `role`<sup>Required</sup> <a name="org.cdk8s.plus27.RoleBindingProps.property.role"></a>

```java
public IRole getRole();
```

- *Type:* [`org.cdk8s.plus27.IRole`](#org.cdk8s.plus27.IRole)

The role to bind to.

A RoleBinding can reference a Role or a ClusterRole.

---

### RolePolicyRule <a name="org.cdk8s.plus27.RolePolicyRule"></a>

Policy rule of a `Role.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.RolePolicyRule;

RolePolicyRule.builder()
    .resources(java.util.List<IApiResource>)
    .verbs(java.util.List<java.lang.String>)
    .build();
```

##### `resources`<sup>Required</sup> <a name="org.cdk8s.plus27.RolePolicyRule.property.resources"></a>

```java
public java.util.List<IApiResource> getResources();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)>

Resources this rule applies to.

---

##### `verbs`<sup>Required</sup> <a name="org.cdk8s.plus27.RolePolicyRule.property.verbs"></a>

```java
public java.util.List<java.lang.String> getVerbs();
```

- *Type:* java.util.List<`java.lang.String`>

Verbs to allow.

(e.g ['get', 'watch'])

---

### RoleProps <a name="org.cdk8s.plus27.RoleProps"></a>

Properties for `Role`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.RoleProps;

RoleProps.builder()
//  .metadata(ApiObjectMetadata)
//  .rules(java.util.List<RolePolicyRule>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.RoleProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `rules`<sup>Optional</sup> <a name="org.cdk8s.plus27.RoleProps.property.rules"></a>

```java
public java.util.List<RolePolicyRule> getRules();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.RolePolicyRule`](#org.cdk8s.plus27.RolePolicyRule)>
- *Default:* []

A list of rules the role should allow.

---

### ScalingPolicy <a name="org.cdk8s.plus27.ScalingPolicy"></a>

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ScalingPolicy;

ScalingPolicy.builder()
    .replicas(Replicas)
//  .duration(Duration)
    .build();
```

##### `replicas`<sup>Required</sup> <a name="org.cdk8s.plus27.ScalingPolicy.property.replicas"></a>

```java
public Replicas getReplicas();
```

- *Type:* [`org.cdk8s.plus27.Replicas`](#org.cdk8s.plus27.Replicas)

The type and quantity of replicas to change.

---

##### `duration`<sup>Optional</sup> <a name="org.cdk8s.plus27.ScalingPolicy.property.duration"></a>

```java
public Duration getDuration();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* 15 seconds

The amount of time the scaling policy has to continue scaling before the target metric must be revalidated.

Must be greater than 0 seconds and no longer than 30 minutes.

---

### ScalingRules <a name="org.cdk8s.plus27.ScalingRules"></a>

Defines the scaling behavior for one direction.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ScalingRules;

ScalingRules.builder()
//  .policies(java.util.List<ScalingPolicy>)
//  .stabilizationWindow(Duration)
//  .strategy(ScalingStrategy)
    .build();
```

##### `policies`<sup>Optional</sup> <a name="org.cdk8s.plus27.ScalingRules.property.policies"></a>

```java
public java.util.List<ScalingPolicy> getPolicies();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ScalingPolicy`](#org.cdk8s.plus27.ScalingPolicy)>
- *Default:* * Scale up
  * Increase no more than 4 pods per 60 seconds
  * Double the number of pods per 60 seconds
* Scale down
  * Decrease to minReplica count

The scaling policies.

---

##### `stabilizationWindow`<sup>Optional</sup> <a name="org.cdk8s.plus27.ScalingRules.property.stabilizationWindow"></a>

```java
public Duration getStabilizationWindow();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* * On scale down no stabilization is performed.
* On scale up stabilization is performed for 5 minutes.

Defines the window of past metrics that the autoscaler should consider when calculating wether or not autoscaling should occur.

Minimum duration is 1 second, max is 1 hour.

---

##### `strategy`<sup>Optional</sup> <a name="org.cdk8s.plus27.ScalingRules.property.strategy"></a>

```java
public ScalingStrategy getStrategy();
```

- *Type:* [`org.cdk8s.plus27.ScalingStrategy`](#org.cdk8s.plus27.ScalingStrategy)
- *Default:* MAX_CHANGE

The strategy to use when scaling.

---

### ScalingTarget <a name="org.cdk8s.plus27.ScalingTarget"></a>

Properties used to configure the target of an Autoscaler.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ScalingTarget;

ScalingTarget.builder()
    .apiVersion(java.lang.String)
    .containers(java.util.List<Container>)
    .kind(java.lang.String)
    .name(java.lang.String)
//  .replicas(java.lang.Number)
    .build();
```

##### `apiVersion`<sup>Required</sup> <a name="org.cdk8s.plus27.ScalingTarget.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `containers`<sup>Required</sup> <a name="org.cdk8s.plus27.ScalingTarget.property.containers"></a>

```java
public java.util.List<Container> getContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Container`](#org.cdk8s.plus27.Container)>

Container definitions associated with the target.

---

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.ScalingTarget.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.ScalingTarget.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus27.ScalingTarget.property.replicas"></a>

```java
public java.lang.Number getReplicas();
```

- *Type:* `java.lang.Number`

The fixed number of replicas defined on the target.

This is used
for validation purposes as Scalable targets should not have a
fixed number of replicas.

---

### SecretProps <a name="org.cdk8s.plus27.SecretProps"></a>

Options for `Secret`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.SecretProps;

SecretProps.builder()
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
//  .stringData(java.util.Map<java.lang.String, java.lang.String>)
//  .type(java.lang.String)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretProps.property.immutable"></a>

```java
public java.lang.Boolean getImmutable();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `stringData`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretProps.property.stringData"></a>

```java
public java.util.Map<java.lang.String, java.lang.String> getStringData();
```

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

stringData allows specifying non-binary secret data in string form.

It is
provided as a write-only convenience method. All keys and values are merged
into the data field on write, overwriting any existing values. It is never
output when reading from the API.

---

##### `type`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretProps.property.type"></a>

```java
public java.lang.String getType();
```

- *Type:* `java.lang.String`
- *Default:* undefined - Don't set a type.

Optional type associated with the secret.

Used to facilitate programmatic
handling of secret data by various controllers.

---

### SecretValue <a name="org.cdk8s.plus27.SecretValue"></a>

Represents a specific value in JSON secret.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.SecretValue;

SecretValue.builder()
    .key(java.lang.String)
    .secret(ISecret)
    .build();
```

##### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.SecretValue.property.key"></a>

```java
public java.lang.String getKey();
```

- *Type:* `java.lang.String`

The JSON key.

---

##### `secret`<sup>Required</sup> <a name="org.cdk8s.plus27.SecretValue.property.secret"></a>

```java
public ISecret getSecret();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)

The secret.

---

### SecretVolumeOptions <a name="org.cdk8s.plus27.SecretVolumeOptions"></a>

Options for the Secret-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.SecretVolumeOptions;

SecretVolumeOptions.builder()
//  .defaultMode(java.lang.Number)
//  .items(java.util.Map<java.lang.String, PathMapping>)
//  .name(java.lang.String)
//  .optional(java.lang.Boolean)
    .build();
```

##### `defaultMode`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretVolumeOptions.property.defaultMode"></a>

```java
public java.lang.Number getDefaultMode();
```

- *Type:* `java.lang.Number`
- *Default:* 0644. Directories within the path are not affected by this
setting. This might be in conflict with other options that affect the file
mode, like fsGroup, and the result can be other mode bits set.

Mode bits to use on created files by default.

Must be a value between 0 and
0777. Defaults to 0644. Directories within the path are not affected by
this setting. This might be in conflict with other options that affect the
file mode, like fsGroup, and the result can be other mode bits set.

---

##### `items`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretVolumeOptions.property.items"></a>

```java
public java.util.Map<java.lang.String, PathMapping> getItems();
```

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus27.PathMapping`](#org.cdk8s.plus27.PathMapping)>
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced secret will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the secret, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretVolumeOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`
- *Default:* auto-generated

The volume name.

---

##### `optional`<sup>Optional</sup> <a name="org.cdk8s.plus27.SecretVolumeOptions.property.optional"></a>

```java
public java.lang.Boolean getOptional();
```

- *Type:* `java.lang.Boolean`
- *Default:* undocumented

Specify whether the secret or its keys must be defined.

---

### ServiceAccountProps <a name="org.cdk8s.plus27.ServiceAccountProps"></a>

Properties for initialization of `ServiceAccount`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ServiceAccountProps;

ServiceAccountProps.builder()
//  .metadata(ApiObjectMetadata)
//  .automountToken(java.lang.Boolean)
//  .secrets(java.util.List<ISecret>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccountProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccountProps.property.automountToken"></a>

```java
public java.lang.Boolean getAutomountToken();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether pods running as this service account should have an API token automatically mounted.

Can be overridden at the pod level.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `secrets`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccountProps.property.secrets"></a>

```java
public java.util.List<ISecret> getSecrets();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)>

List of secrets allowed to be used by pods running using this ServiceAccount.

> https://kubernetes.io/docs/concepts/configuration/secret

---

### ServiceAccountTokenSecretProps <a name="org.cdk8s.plus27.ServiceAccountTokenSecretProps"></a>

Options for `ServiceAccountTokenSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ServiceAccountTokenSecretProps;

ServiceAccountTokenSecretProps.builder()
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .serviceAccount(IServiceAccount)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccountTokenSecretProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceAccountTokenSecretProps.property.immutable"></a>

```java
public java.lang.Boolean getImmutable();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `serviceAccount`<sup>Required</sup> <a name="org.cdk8s.plus27.ServiceAccountTokenSecretProps.property.serviceAccount"></a>

```java
public IServiceAccount getServiceAccount();
```

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)

The service account to store a secret for.

---

### ServiceBindOptions <a name="org.cdk8s.plus27.ServiceBindOptions"></a>

Options for `Service.bind`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ServiceBindOptions;

ServiceBindOptions.builder()
//  .name(java.lang.String)
//  .nodePort(java.lang.Number)
//  .protocol(Protocol)
//  .targetPort(java.lang.Number)
    .build();
```

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceBindOptions.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

##### `nodePort`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceBindOptions.property.nodePort"></a>

```java
public java.lang.Number getNodePort();
```

- *Type:* `java.lang.Number`
- *Default:* auto-allocate a port if the ServiceType of this Service requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceBindOptions.property.protocol"></a>

```java
public Protocol getProtocol();
```

- *Type:* [`org.cdk8s.plus27.Protocol`](#org.cdk8s.plus27.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `targetPort`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceBindOptions.property.targetPort"></a>

```java
public java.lang.Number getTargetPort();
```

- *Type:* `java.lang.Number`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

### ServiceIngressBackendOptions <a name="org.cdk8s.plus27.ServiceIngressBackendOptions"></a>

Options for setting up backends for ingress rules.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ServiceIngressBackendOptions;

ServiceIngressBackendOptions.builder()
//  .port(java.lang.Number)
    .build();
```

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceIngressBackendOptions.property.port"></a>

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`
- *Default:* if the service exposes a single port, this port will be used.

The port to use to access the service.

* This option will fail if the service does not expose any ports.
* If the service exposes multiple ports, this option must be specified.
* If the service exposes a single port, this option is optional and if
  specified, it must be the same port exposed by the service.

---

### ServicePort <a name="org.cdk8s.plus27.ServicePort"></a>

Definition of a service port.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ServicePort;

ServicePort.builder()
//  .name(java.lang.String)
//  .nodePort(java.lang.Number)
//  .protocol(Protocol)
//  .targetPort(java.lang.Number)
    .port(java.lang.Number)
    .build();
```

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServicePort.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

##### `nodePort`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServicePort.property.nodePort"></a>

```java
public java.lang.Number getNodePort();
```

- *Type:* `java.lang.Number`
- *Default:* auto-allocate a port if the ServiceType of this Service requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServicePort.property.protocol"></a>

```java
public Protocol getProtocol();
```

- *Type:* [`org.cdk8s.plus27.Protocol`](#org.cdk8s.plus27.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `targetPort`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServicePort.property.targetPort"></a>

```java
public java.lang.Number getTargetPort();
```

- *Type:* `java.lang.Number`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

##### `port`<sup>Required</sup> <a name="org.cdk8s.plus27.ServicePort.property.port"></a>

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`

The port number the service will bind to.

---

### ServiceProps <a name="org.cdk8s.plus27.ServiceProps"></a>

Properties for `Service`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.ServiceProps;

ServiceProps.builder()
//  .metadata(ApiObjectMetadata)
//  .clusterIP(java.lang.String)
//  .externalIPs(java.util.List<java.lang.String>)
//  .externalName(java.lang.String)
//  .loadBalancerSourceRanges(java.util.List<java.lang.String>)
//  .ports(java.util.List<ServicePort>)
//  .selector(IPodSelector)
//  .type(ServiceType)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `clusterIP`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.property.clusterIP"></a>

```java
public java.lang.String getClusterIP();
```

- *Type:* `java.lang.String`
- *Default:* Automatically assigned.

The IP address of the service and is usually assigned randomly by the master.

If an address is specified manually and is not in use by others, it
will be allocated to the service; otherwise, creation of the service will
fail. This field can not be changed through updates. Valid values are
"None", empty string (""), or a valid IP address. "None" can be specified
for headless services when proxying is not required. Only applies to types
ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName.

> https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

---

##### `externalIPs`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.property.externalIPs"></a>

```java
public java.util.List<java.lang.String> getExternalIPs();
```

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No external IPs.

A list of IP addresses for which nodes in the cluster will also accept traffic for this service.

These IPs are not managed by Kubernetes. The user
is responsible for ensuring that traffic arrives at a node with this IP. A
common example is external load-balancers that are not part of the
Kubernetes system.

---

##### `externalName`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.property.externalName"></a>

```java
public java.lang.String getExternalName();
```

- *Type:* `java.lang.String`
- *Default:* No external name.

The externalName to be used when ServiceType.EXTERNAL_NAME is set.

---

##### `loadBalancerSourceRanges`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.property.loadBalancerSourceRanges"></a>

```java
public java.util.List<java.lang.String> getLoadBalancerSourceRanges();
```

- *Type:* java.util.List<`java.lang.String`>

A list of CIDR IP addresses, if specified and supported by the platform, will restrict traffic through the cloud-provider load-balancer to the specified client IPs.

More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.property.ports"></a>

```java
public java.util.List<ServicePort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ServicePort`](#org.cdk8s.plus27.ServicePort)>
- *Default:* either the selector ports, or none.

The ports this service binds to.

If the selector of the service is a managed pod / workload,
its ports will are automatically extracted and used as the default value.
Otherwise, no ports are bound.

---

##### `selector`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.property.selector"></a>

```java
public IPodSelector getSelector();
```

- *Type:* [`org.cdk8s.plus27.IPodSelector`](#org.cdk8s.plus27.IPodSelector)
- *Default:* unset, the service is assumed to have an external process managing
its endpoints, which Kubernetes will not modify.

Which pods should the service select and route to.

You can pass one of the following:

* An instance of `Pod` or any workload resource (e.g `Deployment`, `StatefulSet`, ...)
* Pods selected by the `Pods.select` function. Note that in this case only labels can be specified.

---

##### `type`<sup>Optional</sup> <a name="org.cdk8s.plus27.ServiceProps.property.type"></a>

```java
public ServiceType getType();
```

- *Type:* [`org.cdk8s.plus27.ServiceType`](#org.cdk8s.plus27.ServiceType)
- *Default:* ServiceType.ClusterIP

Determines how the Service is exposed.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

---

### SshAuthSecretProps <a name="org.cdk8s.plus27.SshAuthSecretProps"></a>

Options for `SshAuthSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.SshAuthSecretProps;

SshAuthSecretProps.builder()
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .sshPrivateKey(java.lang.String)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.SshAuthSecretProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.SshAuthSecretProps.property.immutable"></a>

```java
public java.lang.Boolean getImmutable();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `sshPrivateKey`<sup>Required</sup> <a name="org.cdk8s.plus27.SshAuthSecretProps.property.sshPrivateKey"></a>

```java
public java.lang.String getSshPrivateKey();
```

- *Type:* `java.lang.String`

The SSH private key to use.

---

### StatefulSetProps <a name="org.cdk8s.plus27.StatefulSetProps"></a>

Properties for initialization of `StatefulSet`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.StatefulSetProps;

StatefulSetProps.builder()
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
//  .minReady(Duration)
//  .podManagementPolicy(PodManagementPolicy)
//  .replicas(java.lang.Number)
//  .service(Service)
//  .strategy(StatefulSetUpdateStrategy)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.automountServiceAccountToken"></a>

```java
public java.lang.Boolean getAutomountServiceAccountToken();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.containers"></a>

```java
public java.util.List<ContainerProps> getContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.dns"></a>

```java
public PodDnsProps getDns();
```

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.dockerRegistryAuth"></a>

```java
public ISecret getDockerRegistryAuth();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.hostAliases"></a>

```java
public java.util.List<HostAlias> getHostAliases();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.hostNetwork"></a>

```java
public java.lang.Boolean getHostNetwork();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.initContainers"></a>

```java
public java.util.List<ContainerProps> getInitContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.isolate"></a>

```java
public java.lang.Boolean getIsolate();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.restartPolicy"></a>

```java
public RestartPolicy getRestartPolicy();
```

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.securityContext"></a>

```java
public PodSecurityContextProps getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.serviceAccount"></a>

```java
public IServiceAccount getServiceAccount();
```

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.terminationGracePeriod"></a>

```java
public Duration getTerminationGracePeriod();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.volumes"></a>

```java
public java.util.List<Volume> getVolumes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.podMetadata"></a>

```java
public ApiObjectMetadata getPodMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.select"></a>

```java
public java.lang.Boolean getSelect();
```

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.spread"></a>

```java
public java.lang.Boolean getSpread();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `minReady`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.minReady"></a>

```java
public Duration getMinReady();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(0)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

Zero means the pod will be considered available as soon as it is ready.

This is an alpha field and requires enabling StatefulSetMinReadySeconds feature gate.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds

---

##### `podManagementPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.podManagementPolicy"></a>

```java
public PodManagementPolicy getPodManagementPolicy();
```

- *Type:* [`org.cdk8s.plus27.PodManagementPolicy`](#org.cdk8s.plus27.PodManagementPolicy)
- *Default:* PodManagementPolicy.ORDERED_READY

Pod management policy to use for this statefulset.

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.replicas"></a>

```java
public java.lang.Number getReplicas();
```

- *Type:* `java.lang.Number`
- *Default:* 1

Number of desired pods.

---

##### `service`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.service"></a>

```java
public Service getService();
```

- *Type:* [`org.cdk8s.plus27.Service`](#org.cdk8s.plus27.Service)
- *Default:* A new headless service will be created.

Service to associate with the statefulset.

---

##### `strategy`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetProps.property.strategy"></a>

```java
public StatefulSetUpdateStrategy getStrategy();
```

- *Type:* [`org.cdk8s.plus27.StatefulSetUpdateStrategy`](#org.cdk8s.plus27.StatefulSetUpdateStrategy)
- *Default:* RollingUpdate with partition set to 0

Indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.

---

### StatefulSetUpdateStrategyRollingUpdateOptions <a name="org.cdk8s.plus27.StatefulSetUpdateStrategyRollingUpdateOptions"></a>

Options for `StatefulSetUpdateStrategy.rollingUpdate`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.StatefulSetUpdateStrategyRollingUpdateOptions;

StatefulSetUpdateStrategyRollingUpdateOptions.builder()
//  .partition(java.lang.Number)
    .build();
```

##### `partition`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetUpdateStrategyRollingUpdateOptions.property.partition"></a>

```java
public java.lang.Number getPartition();
```

- *Type:* `java.lang.Number`
- *Default:* 0

If specified, all Pods with an ordinal that is greater than or equal to the partition will be updated when the StatefulSet's .spec.template is updated. All Pods with an ordinal that is less than the partition will not be updated, and, even if they are deleted, they will be recreated at the previous version.

If the partition is greater than replicas, updates to the pod template will not be propagated to Pods.
In most cases you will not need to use a partition, but they are useful if you want to stage an
update, roll out a canary, or perform a phased roll out.

> https://kubernetes.io/docs/concepts/workloads/controllers/statefulset/#partitions

---

### SubjectConfiguration <a name="org.cdk8s.plus27.SubjectConfiguration"></a>

Subject contains a reference to the object or user identities a role binding applies to.

This can either hold a direct API object reference, or a value
for non-objects such as user and group names.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.SubjectConfiguration;

SubjectConfiguration.builder()
    .kind(java.lang.String)
    .name(java.lang.String)
//  .apiGroup(java.lang.String)
//  .namespace(java.lang.String)
    .build();
```

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.SubjectConfiguration.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

Kind of object being referenced.

Values defined by this API group are
"User", "Group", and "ServiceAccount". If the Authorizer does not
recognized the kind value, the Authorizer should report an error.

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.SubjectConfiguration.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

Name of the object being referenced.

---

##### `apiGroup`<sup>Optional</sup> <a name="org.cdk8s.plus27.SubjectConfiguration.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

APIGroup holds the API group of the referenced subject.

Defaults to "" for
ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User
and Group subjects.

---

##### `namespace`<sup>Optional</sup> <a name="org.cdk8s.plus27.SubjectConfiguration.property.namespace"></a>

```java
public java.lang.String getNamespace();
```

- *Type:* `java.lang.String`

Namespace of the referenced object.

If the object kind is non-namespace,
such as "User" or "Group", and this value is not empty the Authorizer
should report an error.

---

### Sysctl <a name="org.cdk8s.plus27.Sysctl"></a>

Sysctl defines a kernel parameter to be set.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.Sysctl;

Sysctl.builder()
    .name(java.lang.String)
    .value(java.lang.String)
    .build();
```

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Sysctl.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

Name of a property to set.

---

##### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.Sysctl.property.value"></a>

```java
public java.lang.String getValue();
```

- *Type:* `java.lang.String`

Value of a property to set.

---

### TcpSocketProbeOptions <a name="org.cdk8s.plus27.TcpSocketProbeOptions"></a>

Options for `Probe.fromTcpSocket()`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.TcpSocketProbeOptions;

TcpSocketProbeOptions.builder()
//  .failureThreshold(java.lang.Number)
//  .initialDelaySeconds(Duration)
//  .periodSeconds(Duration)
//  .successThreshold(java.lang.Number)
//  .timeoutSeconds(Duration)
//  .host(java.lang.String)
//  .port(java.lang.Number)
    .build();
```

##### `failureThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus27.TcpSocketProbeOptions.property.failureThreshold"></a>

```java
public java.lang.Number getFailureThreshold();
```

- *Type:* `java.lang.Number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.TcpSocketProbeOptions.property.initialDelaySeconds"></a>

```java
public Duration getInitialDelaySeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.TcpSocketProbeOptions.property.periodSeconds"></a>

```java
public Duration getPeriodSeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus27.TcpSocketProbeOptions.property.successThreshold"></a>

```java
public java.lang.Number getSuccessThreshold();
```

- *Type:* `java.lang.Number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus27.TcpSocketProbeOptions.property.timeoutSeconds"></a>

```java
public Duration getTimeoutSeconds();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `host`<sup>Optional</sup> <a name="org.cdk8s.plus27.TcpSocketProbeOptions.property.host"></a>

```java
public java.lang.String getHost();
```

- *Type:* `java.lang.String`
- *Default:* defaults to the pod IP

The host name to connect to on the container.

---

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus27.TcpSocketProbeOptions.property.port"></a>

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`
- *Default:* defaults to `container.port`.

The TCP port to connect to on the container.

---

### TlsSecretProps <a name="org.cdk8s.plus27.TlsSecretProps"></a>

Options for `TlsSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.TlsSecretProps;

TlsSecretProps.builder()
//  .metadata(ApiObjectMetadata)
//  .immutable(java.lang.Boolean)
    .tlsCert(java.lang.String)
    .tlsKey(java.lang.String)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.TlsSecretProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="org.cdk8s.plus27.TlsSecretProps.property.immutable"></a>

```java
public java.lang.Boolean getImmutable();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `tlsCert`<sup>Required</sup> <a name="org.cdk8s.plus27.TlsSecretProps.property.tlsCert"></a>

```java
public java.lang.String getTlsCert();
```

- *Type:* `java.lang.String`

The TLS cert.

---

##### `tlsKey`<sup>Required</sup> <a name="org.cdk8s.plus27.TlsSecretProps.property.tlsKey"></a>

```java
public java.lang.String getTlsKey();
```

- *Type:* `java.lang.String`

The TLS key.

---

### VolumeMount <a name="org.cdk8s.plus27.VolumeMount"></a>

Mount a volume from the pod to the container.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.VolumeMount;

VolumeMount.builder()
//  .propagation(MountPropagation)
//  .readOnly(java.lang.Boolean)
//  .subPath(java.lang.String)
//  .subPathExpr(java.lang.String)
    .path(java.lang.String)
    .volume(Volume)
    .build();
```

##### `propagation`<sup>Optional</sup> <a name="org.cdk8s.plus27.VolumeMount.property.propagation"></a>

```java
public MountPropagation getPropagation();
```

- *Type:* [`org.cdk8s.plus27.MountPropagation`](#org.cdk8s.plus27.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus27.VolumeMount.property.readOnly"></a>

```java
public java.lang.Boolean getReadOnly();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

##### `subPath`<sup>Optional</sup> <a name="org.cdk8s.plus27.VolumeMount.property.subPath"></a>

```java
public java.lang.String getSubPath();
```

- *Type:* `java.lang.String`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

##### `subPathExpr`<sup>Optional</sup> <a name="org.cdk8s.plus27.VolumeMount.property.subPathExpr"></a>

```java
public java.lang.String getSubPathExpr();
```

- *Type:* `java.lang.String`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root).

`subPathExpr` and `subPath` are mutually exclusive.

---

##### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.VolumeMount.property.path"></a>

```java
public java.lang.String getPath();
```

- *Type:* `java.lang.String`

Path within the container at which the volume should be mounted.

Must not
contain ':'.

---

##### `volume`<sup>Required</sup> <a name="org.cdk8s.plus27.VolumeMount.property.volume"></a>

```java
public Volume getVolume();
```

- *Type:* [`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)

The volume to mount.

---

### WorkloadProps <a name="org.cdk8s.plus27.WorkloadProps"></a>

Properties for `Workload`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.WorkloadProps;

WorkloadProps.builder()
//  .metadata(ApiObjectMetadata)
//  .automountServiceAccountToken(java.lang.Boolean)
//  .containers(java.util.List<ContainerProps>)
//  .dns(PodDnsProps)
//  .dockerRegistryAuth(ISecret)
//  .hostAliases(java.util.List<HostAlias>)
//  .hostNetwork(java.lang.Boolean)
//  .initContainers(java.util.List<ContainerProps>)
//  .isolate(java.lang.Boolean)
//  .restartPolicy(RestartPolicy)
//  .securityContext(PodSecurityContextProps)
//  .serviceAccount(IServiceAccount)
//  .terminationGracePeriod(Duration)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .select(java.lang.Boolean)
//  .spread(java.lang.Boolean)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.metadata"></a>

```java
public ApiObjectMetadata getMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.automountServiceAccountToken"></a>

```java
public java.lang.Boolean getAutomountServiceAccountToken();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.containers"></a>

```java
public java.util.List<ContainerProps> getContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.dns"></a>

```java
public PodDnsProps getDns();
```

- *Type:* [`org.cdk8s.plus27.PodDnsProps`](#org.cdk8s.plus27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.dockerRegistryAuth"></a>

```java
public ISecret getDockerRegistryAuth();
```

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.hostAliases"></a>

```java
public java.util.List<HostAlias> getHostAliases();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.HostAlias`](#org.cdk8s.plus27.HostAlias)>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.hostNetwork"></a>

```java
public java.lang.Boolean getHostNetwork();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.initContainers"></a>

```java
public java.util.List<ContainerProps> getInitContainers();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerProps`](#org.cdk8s.plus27.ContainerProps)>
- *Default:* No init containers.

List of initialization containers belonging to the pod.

Init containers are executed in order prior to containers being started.
If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy.
The name for an init container or normal container must be unique among all containers.
Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes.
The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit
for each resource type, and then using the max of of that value or the sum of the normal containers.
Limits are applied to init containers in a similar fashion.

Init containers cannot currently be added ,removed or updated.

> https://kubernetes.io/docs/concepts/workloads/pods/init-containers/

---

##### `isolate`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.isolate"></a>

```java
public java.lang.Boolean getIsolate();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.restartPolicy"></a>

```java
public RestartPolicy getRestartPolicy();
```

- *Type:* [`org.cdk8s.plus27.RestartPolicy`](#org.cdk8s.plus27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.securityContext"></a>

```java
public PodSecurityContextProps getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.PodSecurityContextProps`](#org.cdk8s.plus27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.serviceAccount"></a>

```java
public IServiceAccount getServiceAccount();
```

- *Type:* [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)
- *Default:* No service account.

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the
apiserver. When they do, they are authenticated as a particular Service
Account (for example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.terminationGracePeriod"></a>

```java
public Duration getTerminationGracePeriod();
```

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.volumes"></a>

```java
public java.util.List<Volume> getVolumes();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.podMetadata"></a>

```java
public ApiObjectMetadata getPodMetadata();
```

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.select"></a>

```java
public java.lang.Boolean getSelect();
```

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadProps.property.spread"></a>

```java
public java.lang.Boolean getSpread();
```

- *Type:* `java.lang.Boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

### WorkloadSchedulingSpreadOptions <a name="org.cdk8s.plus27.WorkloadSchedulingSpreadOptions"></a>

Options for `WorkloadScheduling.spread`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus27.WorkloadSchedulingSpreadOptions;

WorkloadSchedulingSpreadOptions.builder()
//  .topology(Topology)
//  .weight(java.lang.Number)
    .build();
```

##### `topology`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadSchedulingSpreadOptions.property.topology"></a>

```java
public Topology getTopology();
```

- *Type:* [`org.cdk8s.plus27.Topology`](#org.cdk8s.plus27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to spread on.

---

##### `weight`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadSchedulingSpreadOptions.property.weight"></a>

```java
public java.lang.Number getWeight();
```

- *Type:* `java.lang.Number`
- *Default:* no weight. spread is assumed to be required.

Indicates the spread is optional, with this weight score.

---

## Classes <a name="Classes"></a>

### ApiResource <a name="org.cdk8s.plus27.ApiResource"></a>

- *Implements:* [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource), [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

Represents information about an API resource type.

#### Methods <a name="Methods"></a>

##### `asApiResource` <a name="org.cdk8s.plus27.ApiResource.asApiResource"></a>

```java
public asApiResource()
```

##### `asNonApiResource` <a name="org.cdk8s.plus27.ApiResource.asNonApiResource"></a>

```java
public asNonApiResource()
```

#### Static Functions <a name="Static Functions"></a>

##### `custom` <a name="org.cdk8s.plus27.ApiResource.custom"></a>

```java
import org.cdk8s.plus27.ApiResource;

ApiResource.custom(ApiResourceOptions options)
```

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.ApiResource.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.ApiResourceOptions`](#org.cdk8s.plus27.ApiResourceOptions)

---

#### Properties <a name="Properties"></a>

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.ApiResource.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.ApiResource.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of the resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

#### Constants <a name="Constants"></a>

##### `API_SERVICES` <a name="org.cdk8s.plus27.ApiResource.property.API_SERVICES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for APIService.

---

##### `BINDINGS` <a name="org.cdk8s.plus27.ApiResource.property.BINDINGS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Binding.

---

##### `CERTIFICATE_SIGNING_REQUESTS` <a name="org.cdk8s.plus27.ApiResource.property.CERTIFICATE_SIGNING_REQUESTS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for CertificateSigningRequest.

---

##### `CLUSTER_ROLE_BINDINGS` <a name="org.cdk8s.plus27.ApiResource.property.CLUSTER_ROLE_BINDINGS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for ClusterRoleBinding.

---

##### `CLUSTER_ROLES` <a name="org.cdk8s.plus27.ApiResource.property.CLUSTER_ROLES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for ClusterRole.

---

##### `COMPONENT_STATUSES` <a name="org.cdk8s.plus27.ApiResource.property.COMPONENT_STATUSES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for ComponentStatus.

---

##### `CONFIG_MAPS` <a name="org.cdk8s.plus27.ApiResource.property.CONFIG_MAPS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for ConfigMap.

---

##### `CONTROLLER_REVISIONS` <a name="org.cdk8s.plus27.ApiResource.property.CONTROLLER_REVISIONS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for ControllerRevision.

---

##### `CRON_JOBS` <a name="org.cdk8s.plus27.ApiResource.property.CRON_JOBS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for CronJob.

---

##### `CSI_DRIVERS` <a name="org.cdk8s.plus27.ApiResource.property.CSI_DRIVERS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for CSIDriver.

---

##### `CSI_NODES` <a name="org.cdk8s.plus27.ApiResource.property.CSI_NODES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for CSINode.

---

##### `CSI_STORAGE_CAPACITIES` <a name="org.cdk8s.plus27.ApiResource.property.CSI_STORAGE_CAPACITIES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for CSIStorageCapacity.

---

##### `CUSTOM_RESOURCE_DEFINITIONS` <a name="org.cdk8s.plus27.ApiResource.property.CUSTOM_RESOURCE_DEFINITIONS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for CustomResourceDefinition.

---

##### `DAEMON_SETS` <a name="org.cdk8s.plus27.ApiResource.property.DAEMON_SETS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for DaemonSet.

---

##### `DEPLOYMENTS` <a name="org.cdk8s.plus27.ApiResource.property.DEPLOYMENTS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Deployment.

---

##### `ENDPOINT_SLICES` <a name="org.cdk8s.plus27.ApiResource.property.ENDPOINT_SLICES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for EndpointSlice.

---

##### `ENDPOINTS` <a name="org.cdk8s.plus27.ApiResource.property.ENDPOINTS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Endpoints.

---

##### `EVENTS` <a name="org.cdk8s.plus27.ApiResource.property.EVENTS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Event.

---

##### `FLOW_SCHEMAS` <a name="org.cdk8s.plus27.ApiResource.property.FLOW_SCHEMAS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for FlowSchema.

---

##### `HORIZONTAL_POD_AUTOSCALERS` <a name="org.cdk8s.plus27.ApiResource.property.HORIZONTAL_POD_AUTOSCALERS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for HorizontalPodAutoscaler.

---

##### `INGRESS_CLASSES` <a name="org.cdk8s.plus27.ApiResource.property.INGRESS_CLASSES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for IngressClass.

---

##### `INGRESSES` <a name="org.cdk8s.plus27.ApiResource.property.INGRESSES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Ingress.

---

##### `JOBS` <a name="org.cdk8s.plus27.ApiResource.property.JOBS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Job.

---

##### `LEASES` <a name="org.cdk8s.plus27.ApiResource.property.LEASES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Lease.

---

##### `LIMIT_RANGES` <a name="org.cdk8s.plus27.ApiResource.property.LIMIT_RANGES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for LimitRange.

---

##### `LOCAL_SUBJECT_ACCESS_REVIEWS` <a name="org.cdk8s.plus27.ApiResource.property.LOCAL_SUBJECT_ACCESS_REVIEWS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for LocalSubjectAccessReview.

---

##### `MUTATING_WEBHOOK_CONFIGURATIONS` <a name="org.cdk8s.plus27.ApiResource.property.MUTATING_WEBHOOK_CONFIGURATIONS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for MutatingWebhookConfiguration.

---

##### `NAMESPACES` <a name="org.cdk8s.plus27.ApiResource.property.NAMESPACES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Namespace.

---

##### `NETWORK_POLICIES` <a name="org.cdk8s.plus27.ApiResource.property.NETWORK_POLICIES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for NetworkPolicy.

---

##### `NODES` <a name="org.cdk8s.plus27.ApiResource.property.NODES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Node.

---

##### `PERSISTENT_VOLUME_CLAIMS` <a name="org.cdk8s.plus27.ApiResource.property.PERSISTENT_VOLUME_CLAIMS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for PersistentVolumeClaim.

---

##### `PERSISTENT_VOLUMES` <a name="org.cdk8s.plus27.ApiResource.property.PERSISTENT_VOLUMES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for PersistentVolume.

---

##### `POD_DISRUPTION_BUDGETS` <a name="org.cdk8s.plus27.ApiResource.property.POD_DISRUPTION_BUDGETS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for PodDisruptionBudget.

---

##### `POD_TEMPLATES` <a name="org.cdk8s.plus27.ApiResource.property.POD_TEMPLATES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for PodTemplate.

---

##### `PODS` <a name="org.cdk8s.plus27.ApiResource.property.PODS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Pod.

---

##### `PRIORITY_CLASSES` <a name="org.cdk8s.plus27.ApiResource.property.PRIORITY_CLASSES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for PriorityClass.

---

##### `PRIORITY_LEVEL_CONFIGURATIONS` <a name="org.cdk8s.plus27.ApiResource.property.PRIORITY_LEVEL_CONFIGURATIONS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for PriorityLevelConfiguration.

---

##### `REPLICA_SETS` <a name="org.cdk8s.plus27.ApiResource.property.REPLICA_SETS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for ReplicaSet.

---

##### `REPLICATION_CONTROLLERS` <a name="org.cdk8s.plus27.ApiResource.property.REPLICATION_CONTROLLERS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for ReplicationController.

---

##### `RESOURCE_QUOTAS` <a name="org.cdk8s.plus27.ApiResource.property.RESOURCE_QUOTAS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for ResourceQuota.

---

##### `ROLE_BINDINGS` <a name="org.cdk8s.plus27.ApiResource.property.ROLE_BINDINGS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for RoleBinding.

---

##### `ROLES` <a name="org.cdk8s.plus27.ApiResource.property.ROLES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Role.

---

##### `RUNTIME_CLASSES` <a name="org.cdk8s.plus27.ApiResource.property.RUNTIME_CLASSES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for RuntimeClass.

---

##### `SECRETS` <a name="org.cdk8s.plus27.ApiResource.property.SECRETS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Secret.

---

##### `SELF_SUBJECT_ACCESS_REVIEWS` <a name="org.cdk8s.plus27.ApiResource.property.SELF_SUBJECT_ACCESS_REVIEWS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for SelfSubjectAccessReview.

---

##### `SELF_SUBJECT_RULES_REVIEWS` <a name="org.cdk8s.plus27.ApiResource.property.SELF_SUBJECT_RULES_REVIEWS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for SelfSubjectRulesReview.

---

##### `SERVICE_ACCOUNTS` <a name="org.cdk8s.plus27.ApiResource.property.SERVICE_ACCOUNTS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for ServiceAccount.

---

##### `SERVICES` <a name="org.cdk8s.plus27.ApiResource.property.SERVICES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for Service.

---

##### `STATEFUL_SETS` <a name="org.cdk8s.plus27.ApiResource.property.STATEFUL_SETS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for StatefulSet.

---

##### `STORAGE_CLASSES` <a name="org.cdk8s.plus27.ApiResource.property.STORAGE_CLASSES"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for StorageClass.

---

##### `SUBJECT_ACCESS_REVIEWS` <a name="org.cdk8s.plus27.ApiResource.property.SUBJECT_ACCESS_REVIEWS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for SubjectAccessReview.

---

##### `TOKEN_REVIEWS` <a name="org.cdk8s.plus27.ApiResource.property.TOKEN_REVIEWS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for TokenReview.

---

##### `VALIDATING_WEBHOOK_CONFIGURATIONS` <a name="org.cdk8s.plus27.ApiResource.property.VALIDATING_WEBHOOK_CONFIGURATIONS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for ValidatingWebhookConfiguration.

---

##### `VOLUME_ATTACHMENTS` <a name="org.cdk8s.plus27.ApiResource.property.VOLUME_ATTACHMENTS"></a>

- *Type:* [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource)

API resource information for VolumeAttachment.

---

### Container <a name="org.cdk8s.plus27.Container"></a>

A single application container that you want to run within a pod.

#### Initializers <a name="org.cdk8s.plus27.Container.Initializer"></a>

```java
import org.cdk8s.plus27.Container;

Container.Builder.create()
//  .args(java.util.List<java.lang.String>)
//  .command(java.util.List<java.lang.String>)
//  .envFrom(java.util.List<EnvFrom>)
//  .envVariables(java.util.Map<java.lang.String, EnvValue>)
//  .imagePullPolicy(ImagePullPolicy)
//  .lifecycle(ContainerLifecycle)
//  .liveness(Probe)
//  .name(java.lang.String)
//  .port(java.lang.Number)
//  .portNumber(java.lang.Number)
//  .ports(java.util.List<ContainerPort>)
//  .readiness(Probe)
//  .resources(ContainerResources)
//  .securityContext(ContainerSecurityContextProps)
//  .startup(Probe)
//  .volumeMounts(java.util.List<VolumeMount>)
//  .workingDir(java.lang.String)
    .image(java.lang.String)
    .build();
```

##### `args`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.args"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* []

Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided.

Variable references $(VAR_NAME) are expanded using the container's
environment. If a variable cannot be resolved, the reference in the input
string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
regardless of whether the variable exists or not.

Cannot be updated.

> https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `command`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.command"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `envFrom`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.envFrom"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.EnvFrom`](#org.cdk8s.plus27.EnvFrom)>
- *Default:* No sources.

List of sources to populate environment variables in the container.

When a key exists in multiple sources, the value associated with
the last source will take precedence. Values defined by the `envVariables` property
with a duplicate key will take precedence.

---

##### `envVariables`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.envVariables"></a>

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus27.EnvValue`](#org.cdk8s.plus27.EnvValue)>
- *Default:* No environment variables.

Environment variables to set in the container.

---

##### `imagePullPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.imagePullPolicy"></a>

- *Type:* [`org.cdk8s.plus27.ImagePullPolicy`](#org.cdk8s.plus27.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `lifecycle`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.lifecycle"></a>

- *Type:* [`org.cdk8s.plus27.ContainerLifecycle`](#org.cdk8s.plus27.ContainerLifecycle)

Describes actions that the management system should take in response to container lifecycle events.

---

##### `liveness`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.liveness"></a>

- *Type:* [`org.cdk8s.plus27.Probe`](#org.cdk8s.plus27.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.name"></a>

- *Type:* `java.lang.String`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### ~~`port`~~<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.port"></a>

- *Deprecated:* - use `portNumber`.

- *Type:* `java.lang.Number`

---

##### `portNumber`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.portNumber"></a>

- *Type:* `java.lang.Number`
- *Default:* Only the ports mentiond in the `ports` property are exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

This is a convinience property if all you need a single TCP numbered port.
In case more advanced configuartion is required, use the `ports` property.

This port is added to the list of ports mentioned in the `ports` property.

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.ports"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerPort`](#org.cdk8s.plus27.ContainerPort)>
- *Default:* Only the port mentioned in the `portNumber` property is exposed.

List of ports to expose from this container.

---

##### `readiness`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.readiness"></a>

- *Type:* [`org.cdk8s.plus27.Probe`](#org.cdk8s.plus27.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `resources`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.resources"></a>

- *Type:* [`org.cdk8s.plus27.ContainerResources`](#org.cdk8s.plus27.ContainerResources)
- *Default:* cpu:
     request: 1000 millis
     limit: 1500 millis
   memory:
     request: 512 mebibytes
     limit: 2048 mebibytes

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `securityContext`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.securityContext"></a>

- *Type:* [`org.cdk8s.plus27.ContainerSecurityContextProps`](#org.cdk8s.plus27.ContainerSecurityContextProps)
- *Default:* ensureNonRoot: true
  privileged: false
  readOnlyRootFilesystem: true
  allowPrivilegeEscalation: false
  user: 25000
  group: 26000

SecurityContext defines the security options the container should be run with.

If set, the fields override equivalent fields of the pod's security context.

> https://kubernetes.io/docs/tasks/configure-pod-container/security-context/

---

##### `startup`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.startup"></a>

- *Type:* [`org.cdk8s.plus27.Probe`](#org.cdk8s.plus27.Probe)
- *Default:* If a port is provided, then knocks on that port
to determine when the container is ready for readiness and
liveness probe checks.
Otherwise, no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volumeMounts`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.volumeMounts"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.VolumeMount`](#org.cdk8s.plus27.VolumeMount)>

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `workingDir`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.workingDir"></a>

- *Type:* `java.lang.String`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `image`<sup>Required</sup> <a name="org.cdk8s.plus27.ContainerProps.parameter.image"></a>

- *Type:* `java.lang.String`

Docker image name.

---

#### Methods <a name="Methods"></a>

##### `addPort` <a name="org.cdk8s.plus27.Container.addPort"></a>

```java
public addPort(ContainerPort port)
```

###### `port`<sup>Required</sup> <a name="org.cdk8s.plus27.Container.parameter.port"></a>

- *Type:* [`org.cdk8s.plus27.ContainerPort`](#org.cdk8s.plus27.ContainerPort)

---

##### `mount` <a name="org.cdk8s.plus27.Container.mount"></a>

```java
public mount(java.lang.String path, IStorage storage)
public mount(java.lang.String path, IStorage storage, MountOptions options)
```

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.Container.parameter.path"></a>

- *Type:* `java.lang.String`

The desired path in the container.

---

###### `storage`<sup>Required</sup> <a name="org.cdk8s.plus27.Container.parameter.storage"></a>

- *Type:* [`org.cdk8s.plus27.IStorage`](#org.cdk8s.plus27.IStorage)

The storage to mount.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Container.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.MountOptions`](#org.cdk8s.plus27.MountOptions)

---


#### Properties <a name="Properties"></a>

##### `env`<sup>Required</sup> <a name="org.cdk8s.plus27.Container.property.env"></a>

```java
public Env getEnv();
```

- *Type:* [`org.cdk8s.plus27.Env`](#org.cdk8s.plus27.Env)

The environment of the container.

---

##### `image`<sup>Required</sup> <a name="org.cdk8s.plus27.Container.property.image"></a>

```java
public java.lang.String getImage();
```

- *Type:* `java.lang.String`

The container image.

---

##### `imagePullPolicy`<sup>Required</sup> <a name="org.cdk8s.plus27.Container.property.imagePullPolicy"></a>

```java
public ImagePullPolicy getImagePullPolicy();
```

- *Type:* [`org.cdk8s.plus27.ImagePullPolicy`](#org.cdk8s.plus27.ImagePullPolicy)

Image pull policy for this container.

---

##### `mounts`<sup>Required</sup> <a name="org.cdk8s.plus27.Container.property.mounts"></a>

```java
public java.util.List<VolumeMount> getMounts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.VolumeMount`](#org.cdk8s.plus27.VolumeMount)>

Volume mounts configured for this container.

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Container.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The name of the container.

---

##### `ports`<sup>Required</sup> <a name="org.cdk8s.plus27.Container.property.ports"></a>

```java
public java.util.List<ContainerPort> getPorts();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.ContainerPort`](#org.cdk8s.plus27.ContainerPort)>

Ports exposed by this containers.

Returns a copy, use `addPort` to modify.

---

##### `securityContext`<sup>Required</sup> <a name="org.cdk8s.plus27.Container.property.securityContext"></a>

```java
public ContainerSecurityContext getSecurityContext();
```

- *Type:* [`org.cdk8s.plus27.ContainerSecurityContext`](#org.cdk8s.plus27.ContainerSecurityContext)

The security context of the container.

---

##### `args`<sup>Optional</sup> <a name="org.cdk8s.plus27.Container.property.args"></a>

```java
public java.util.List<java.lang.String> getArgs();
```

- *Type:* java.util.List<`java.lang.String`>

Arguments to the entrypoint.

---

##### `command`<sup>Optional</sup> <a name="org.cdk8s.plus27.Container.property.command"></a>

```java
public java.util.List<java.lang.String> getCommand();
```

- *Type:* java.util.List<`java.lang.String`>

Entrypoint array (the command to execute when the container starts).

---

##### ~~`port`~~<sup>Optional</sup> <a name="org.cdk8s.plus27.Container.property.port"></a>

- *Deprecated:* - use `portNumber`.

```java
public java.lang.Number getPort();
```

- *Type:* `java.lang.Number`

---

##### `portNumber`<sup>Optional</sup> <a name="org.cdk8s.plus27.Container.property.portNumber"></a>

```java
public java.lang.Number getPortNumber();
```

- *Type:* `java.lang.Number`

The port number that was configured for this container.

If undefined, either the container doesn't expose a port, or its
port configuration is stored in the `ports` field.

---

##### `resources`<sup>Optional</sup> <a name="org.cdk8s.plus27.Container.property.resources"></a>

```java
public ContainerResources getResources();
```

- *Type:* [`org.cdk8s.plus27.ContainerResources`](#org.cdk8s.plus27.ContainerResources)

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `workingDir`<sup>Optional</sup> <a name="org.cdk8s.plus27.Container.property.workingDir"></a>

```java
public java.lang.String getWorkingDir();
```

- *Type:* `java.lang.String`

The working directory inside the container.

---


### ContainerSecurityContext <a name="org.cdk8s.plus27.ContainerSecurityContext"></a>

Container security attributes and settings.

#### Initializers <a name="org.cdk8s.plus27.ContainerSecurityContext.Initializer"></a>

```java
import org.cdk8s.plus27.ContainerSecurityContext;

ContainerSecurityContext.Builder.create()
//  .allowPrivilegeEscalation(java.lang.Boolean)
//  .ensureNonRoot(java.lang.Boolean)
//  .group(java.lang.Number)
//  .privileged(java.lang.Boolean)
//  .readOnlyRootFilesystem(java.lang.Boolean)
//  .user(java.lang.Number)
    .build();
```

##### `allowPrivilegeEscalation`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.parameter.allowPrivilegeEscalation"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Whether a process can gain more privileges than its parent process.

---

##### `ensureNonRoot`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.parameter.ensureNonRoot"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Indicates that the container must run as a non-root user.

If true, the Kubelet will validate the image at runtime to ensure that it does
not run as UID 0 (root) and fail to start the container if it does.

---

##### `group`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.parameter.group"></a>

- *Type:* `java.lang.Number`
- *Default:* 26000. An arbitrary number bigger than 9999 is selected here.
This is so that the container is blocked to access host files even if
somehow it manages to get access to host file system.

The GID to run the entrypoint of the container process.

---

##### `privileged`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.parameter.privileged"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Run container in privileged mode.

Processes in privileged containers are essentially equivalent to root on the host.

---

##### `readOnlyRootFilesystem`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.parameter.readOnlyRootFilesystem"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Whether this container has a read-only root filesystem.

---

##### `user`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContextProps.parameter.user"></a>

- *Type:* `java.lang.Number`
- *Default:* 25000. An arbitrary number bigger than 9999 is selected here.
This is so that the container is blocked to access host files even if
somehow it manages to get access to host file system.

The UID to run the entrypoint of the container process.

---



#### Properties <a name="Properties"></a>

##### `ensureNonRoot`<sup>Required</sup> <a name="org.cdk8s.plus27.ContainerSecurityContext.property.ensureNonRoot"></a>

```java
public java.lang.Boolean getEnsureNonRoot();
```

- *Type:* `java.lang.Boolean`

---

##### `privileged`<sup>Required</sup> <a name="org.cdk8s.plus27.ContainerSecurityContext.property.privileged"></a>

```java
public java.lang.Boolean getPrivileged();
```

- *Type:* `java.lang.Boolean`

---

##### `readOnlyRootFilesystem`<sup>Required</sup> <a name="org.cdk8s.plus27.ContainerSecurityContext.property.readOnlyRootFilesystem"></a>

```java
public java.lang.Boolean getReadOnlyRootFilesystem();
```

- *Type:* `java.lang.Boolean`

---

##### `allowPrivilegeEscalation`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContext.property.allowPrivilegeEscalation"></a>

```java
public java.lang.Boolean getAllowPrivilegeEscalation();
```

- *Type:* `java.lang.Boolean`

---

##### `group`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContext.property.group"></a>

```java
public java.lang.Number getGroup();
```

- *Type:* `java.lang.Number`

---

##### `user`<sup>Optional</sup> <a name="org.cdk8s.plus27.ContainerSecurityContext.property.user"></a>

```java
public java.lang.Number getUser();
```

- *Type:* `java.lang.Number`

---


### Cpu <a name="org.cdk8s.plus27.Cpu"></a>

Represents the amount of CPU.

The amount can be passed as millis or units.


#### Static Functions <a name="Static Functions"></a>

##### `millis` <a name="org.cdk8s.plus27.Cpu.millis"></a>

```java
import org.cdk8s.plus27.Cpu;

Cpu.millis(java.lang.Number amount)
```

###### `amount`<sup>Required</sup> <a name="org.cdk8s.plus27.Cpu.parameter.amount"></a>

- *Type:* `java.lang.Number`

---

##### `units` <a name="org.cdk8s.plus27.Cpu.units"></a>

```java
import org.cdk8s.plus27.Cpu;

Cpu.units(java.lang.Number amount)
```

###### `amount`<sup>Required</sup> <a name="org.cdk8s.plus27.Cpu.parameter.amount"></a>

- *Type:* `java.lang.Number`

---

#### Properties <a name="Properties"></a>

##### `amount`<sup>Required</sup> <a name="org.cdk8s.plus27.Cpu.property.amount"></a>

```java
public java.lang.String getAmount();
```

- *Type:* `java.lang.String`

---


### DeploymentStrategy <a name="org.cdk8s.plus27.DeploymentStrategy"></a>

Deployment strategies.


#### Static Functions <a name="Static Functions"></a>

##### `recreate` <a name="org.cdk8s.plus27.DeploymentStrategy.recreate"></a>

```java
import org.cdk8s.plus27.DeploymentStrategy;

DeploymentStrategy.recreate()
```

##### `rollingUpdate` <a name="org.cdk8s.plus27.DeploymentStrategy.rollingUpdate"></a>

```java
import org.cdk8s.plus27.DeploymentStrategy;

DeploymentStrategy.rollingUpdate()
DeploymentStrategy.rollingUpdate(DeploymentStrategyRollingUpdateOptions options)
```

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.DeploymentStrategy.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.DeploymentStrategyRollingUpdateOptions`](#org.cdk8s.plus27.DeploymentStrategyRollingUpdateOptions)

---



### Env <a name="org.cdk8s.plus27.Env"></a>

Container environment variables.

#### Initializers <a name="org.cdk8s.plus27.Env.Initializer"></a>

```java
import org.cdk8s.plus27.Env;

new Env(java.util.List<EnvFrom> sources, java.util.Map<java.lang.String, EnvValue> variables);
```

##### `sources`<sup>Required</sup> <a name="org.cdk8s.plus27.Env.parameter.sources"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.EnvFrom`](#org.cdk8s.plus27.EnvFrom)>

---

##### `variables`<sup>Required</sup> <a name="org.cdk8s.plus27.Env.parameter.variables"></a>

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus27.EnvValue`](#org.cdk8s.plus27.EnvValue)>

---

#### Methods <a name="Methods"></a>

##### `addVariable` <a name="org.cdk8s.plus27.Env.addVariable"></a>

```java
public addVariable(java.lang.String name, EnvValue value)
```

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.Env.parameter.name"></a>

- *Type:* `java.lang.String`

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.Env.parameter.value"></a>

- *Type:* [`org.cdk8s.plus27.EnvValue`](#org.cdk8s.plus27.EnvValue)

---

##### `copyFrom` <a name="org.cdk8s.plus27.Env.copyFrom"></a>

```java
public copyFrom(EnvFrom from)
```

###### `from`<sup>Required</sup> <a name="org.cdk8s.plus27.Env.parameter.from"></a>

- *Type:* [`org.cdk8s.plus27.EnvFrom`](#org.cdk8s.plus27.EnvFrom)

---

#### Static Functions <a name="Static Functions"></a>

##### `fromConfigMap` <a name="org.cdk8s.plus27.Env.fromConfigMap"></a>

```java
import org.cdk8s.plus27.Env;

Env.fromConfigMap(IConfigMap configMap)
Env.fromConfigMap(IConfigMap configMap, java.lang.String prefix)
```

###### `configMap`<sup>Required</sup> <a name="org.cdk8s.plus27.Env.parameter.configMap"></a>

- *Type:* [`org.cdk8s.plus27.IConfigMap`](#org.cdk8s.plus27.IConfigMap)

---

###### `prefix`<sup>Optional</sup> <a name="org.cdk8s.plus27.Env.parameter.prefix"></a>

- *Type:* `java.lang.String`

---

##### `fromSecret` <a name="org.cdk8s.plus27.Env.fromSecret"></a>

```java
import org.cdk8s.plus27.Env;

Env.fromSecret(ISecret secr)
```

###### `secr`<sup>Required</sup> <a name="org.cdk8s.plus27.Env.parameter.secr"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)

---

#### Properties <a name="Properties"></a>

##### `sources`<sup>Required</sup> <a name="org.cdk8s.plus27.Env.property.sources"></a>

```java
public java.util.List<EnvFrom> getSources();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.EnvFrom`](#org.cdk8s.plus27.EnvFrom)>

The list of sources used to populate the container environment, in addition to the `variables`.

Returns a copy. To add a source use `container.env.copyFrom()`.

---

##### `variables`<sup>Required</sup> <a name="org.cdk8s.plus27.Env.property.variables"></a>

```java
public java.util.Map<java.lang.String, EnvValue> getVariables();
```

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus27.EnvValue`](#org.cdk8s.plus27.EnvValue)>

The environment variables for this container.

Returns a copy. To add environment variables use `container.env.addVariable()`.

---


### EnvFrom <a name="org.cdk8s.plus27.EnvFrom"></a>

A collection of env variables defined in other resources.

#### Initializers <a name="org.cdk8s.plus27.EnvFrom.Initializer"></a>

```java
import org.cdk8s.plus27.EnvFrom;

new EnvFrom();
new EnvFrom(IConfigMap configMap);
new EnvFrom(IConfigMap configMap, java.lang.String prefix);
new EnvFrom(IConfigMap configMap, java.lang.String prefix, ISecret sec);
```

##### `configMap`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvFrom.parameter.configMap"></a>

- *Type:* [`org.cdk8s.plus27.IConfigMap`](#org.cdk8s.plus27.IConfigMap)

---

##### `prefix`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvFrom.parameter.prefix"></a>

- *Type:* `java.lang.String`

---

##### `sec`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvFrom.parameter.sec"></a>

- *Type:* [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)

---





### EnvValue <a name="org.cdk8s.plus27.EnvValue"></a>

Utility class for creating reading env values from various sources.


#### Static Functions <a name="Static Functions"></a>

##### `fromConfigMap` <a name="org.cdk8s.plus27.EnvValue.fromConfigMap"></a>

```java
import org.cdk8s.plus27.EnvValue;

EnvValue.fromConfigMap(IConfigMap configMap, java.lang.String key)
EnvValue.fromConfigMap(IConfigMap configMap, java.lang.String key, EnvValueFromConfigMapOptions options)
```

###### `configMap`<sup>Required</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.configMap"></a>

- *Type:* [`org.cdk8s.plus27.IConfigMap`](#org.cdk8s.plus27.IConfigMap)

The config map.

---

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.key"></a>

- *Type:* `java.lang.String`

The key to extract the value from.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.EnvValueFromConfigMapOptions`](#org.cdk8s.plus27.EnvValueFromConfigMapOptions)

Additional options.

---

##### `fromFieldRef` <a name="org.cdk8s.plus27.EnvValue.fromFieldRef"></a>

```java
import org.cdk8s.plus27.EnvValue;

EnvValue.fromFieldRef(EnvFieldPaths fieldPath)
EnvValue.fromFieldRef(EnvFieldPaths fieldPath, EnvValueFromFieldRefOptions options)
```

###### `fieldPath`<sup>Required</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.fieldPath"></a>

- *Type:* [`org.cdk8s.plus27.EnvFieldPaths`](#org.cdk8s.plus27.EnvFieldPaths)

: The field reference.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.EnvValueFromFieldRefOptions`](#org.cdk8s.plus27.EnvValueFromFieldRefOptions)

: Additional options.

---

##### `fromProcess` <a name="org.cdk8s.plus27.EnvValue.fromProcess"></a>

```java
import org.cdk8s.plus27.EnvValue;

EnvValue.fromProcess(java.lang.String key)
EnvValue.fromProcess(java.lang.String key, EnvValueFromProcessOptions options)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.key"></a>

- *Type:* `java.lang.String`

The key to read.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.EnvValueFromProcessOptions`](#org.cdk8s.plus27.EnvValueFromProcessOptions)

Additional options.

---

##### `fromResource` <a name="org.cdk8s.plus27.EnvValue.fromResource"></a>

```java
import org.cdk8s.plus27.EnvValue;

EnvValue.fromResource(ResourceFieldPaths resource)
EnvValue.fromResource(ResourceFieldPaths resource, EnvValueFromResourceOptions options)
```

###### `resource`<sup>Required</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.resource"></a>

- *Type:* [`org.cdk8s.plus27.ResourceFieldPaths`](#org.cdk8s.plus27.ResourceFieldPaths)

: Resource to select the value from.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.EnvValueFromResourceOptions`](#org.cdk8s.plus27.EnvValueFromResourceOptions)

: Additional options.

---

##### `fromSecretValue` <a name="org.cdk8s.plus27.EnvValue.fromSecretValue"></a>

```java
import org.cdk8s.plus27.EnvValue;

EnvValue.fromSecretValue(SecretValue secretValue)
EnvValue.fromSecretValue(SecretValue secretValue, EnvValueFromSecretOptions options)
```

###### `secretValue`<sup>Required</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.secretValue"></a>

- *Type:* [`org.cdk8s.plus27.SecretValue`](#org.cdk8s.plus27.SecretValue)

The secret value (secrent + key).

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.EnvValueFromSecretOptions`](#org.cdk8s.plus27.EnvValueFromSecretOptions)

Additional options.

---

##### `fromValue` <a name="org.cdk8s.plus27.EnvValue.fromValue"></a>

```java
import org.cdk8s.plus27.EnvValue;

EnvValue.fromValue(java.lang.String value)
```

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.EnvValue.parameter.value"></a>

- *Type:* `java.lang.String`

The value.

---

#### Properties <a name="Properties"></a>

##### `value`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValue.property.value"></a>

```java
public java.lang.Object getValue();
```

- *Type:* `java.lang.Object`

---

##### `valueFrom`<sup>Optional</sup> <a name="org.cdk8s.plus27.EnvValue.property.valueFrom"></a>

```java
public java.lang.Object getValueFrom();
```

- *Type:* `java.lang.Object`

---


### Handler <a name="org.cdk8s.plus27.Handler"></a>

Defines a specific action that should be taken.


#### Static Functions <a name="Static Functions"></a>

##### `fromCommand` <a name="org.cdk8s.plus27.Handler.fromCommand"></a>

```java
import org.cdk8s.plus27.Handler;

Handler.fromCommand(java.util.List<java.lang.String> command)
```

###### `command`<sup>Required</sup> <a name="org.cdk8s.plus27.Handler.parameter.command"></a>

- *Type:* java.util.List<`java.lang.String`>

The command to execute.

---

##### `fromHttpGet` <a name="org.cdk8s.plus27.Handler.fromHttpGet"></a>

```java
import org.cdk8s.plus27.Handler;

Handler.fromHttpGet(java.lang.String path)
Handler.fromHttpGet(java.lang.String path, HandlerFromHttpGetOptions options)
```

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.Handler.parameter.path"></a>

- *Type:* `java.lang.String`

The URL path to hit.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Handler.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.HandlerFromHttpGetOptions`](#org.cdk8s.plus27.HandlerFromHttpGetOptions)

Options.

---

##### `fromTcpSocket` <a name="org.cdk8s.plus27.Handler.fromTcpSocket"></a>

```java
import org.cdk8s.plus27.Handler;

Handler.fromTcpSocket()
Handler.fromTcpSocket(HandlerFromTcpSocketOptions options)
```

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Handler.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.HandlerFromTcpSocketOptions`](#org.cdk8s.plus27.HandlerFromTcpSocketOptions)

Options.

---



### IngressBackend <a name="org.cdk8s.plus27.IngressBackend"></a>

The backend for an ingress path.


#### Static Functions <a name="Static Functions"></a>

##### `fromResource` <a name="org.cdk8s.plus27.IngressBackend.fromResource"></a>

```java
import org.cdk8s.plus27.IngressBackend;

IngressBackend.fromResource(IResource resource)
```

###### `resource`<sup>Required</sup> <a name="org.cdk8s.plus27.IngressBackend.parameter.resource"></a>

- *Type:* [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource)

---

##### `fromService` <a name="org.cdk8s.plus27.IngressBackend.fromService"></a>

```java
import org.cdk8s.plus27.IngressBackend;

IngressBackend.fromService(Service serv)
IngressBackend.fromService(Service serv, ServiceIngressBackendOptions options)
```

###### `serv`<sup>Required</sup> <a name="org.cdk8s.plus27.IngressBackend.parameter.serv"></a>

- *Type:* [`org.cdk8s.plus27.Service`](#org.cdk8s.plus27.Service)

The service object.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.IngressBackend.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.ServiceIngressBackendOptions`](#org.cdk8s.plus27.ServiceIngressBackendOptions)

---



### LabeledNode <a name="org.cdk8s.plus27.LabeledNode"></a>

A node that is matched by label selectors.

#### Initializers <a name="org.cdk8s.plus27.LabeledNode.Initializer"></a>

```java
import org.cdk8s.plus27.LabeledNode;

new LabeledNode(java.util.List<NodeLabelQuery> labelSelector);
```

##### `labelSelector`<sup>Required</sup> <a name="org.cdk8s.plus27.LabeledNode.parameter.labelSelector"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.NodeLabelQuery`](#org.cdk8s.plus27.NodeLabelQuery)>

---



#### Properties <a name="Properties"></a>

##### `labelSelector`<sup>Required</sup> <a name="org.cdk8s.plus27.LabeledNode.property.labelSelector"></a>

```java
public java.util.List<NodeLabelQuery> getLabelSelector();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.NodeLabelQuery`](#org.cdk8s.plus27.NodeLabelQuery)>

---


### LabelExpression <a name="org.cdk8s.plus27.LabelExpression"></a>

Represents a query that can be performed against resources with labels.


#### Static Functions <a name="Static Functions"></a>

##### `doesNotExist` <a name="org.cdk8s.plus27.LabelExpression.doesNotExist"></a>

```java
import org.cdk8s.plus27.LabelExpression;

LabelExpression.doesNotExist(java.lang.String key)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.LabelExpression.parameter.key"></a>

- *Type:* `java.lang.String`

---

##### `exists` <a name="org.cdk8s.plus27.LabelExpression.exists"></a>

```java
import org.cdk8s.plus27.LabelExpression;

LabelExpression.exists(java.lang.String key)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.LabelExpression.parameter.key"></a>

- *Type:* `java.lang.String`

---

##### `in` <a name="org.cdk8s.plus27.LabelExpression.in"></a>

```java
import org.cdk8s.plus27.LabelExpression;

LabelExpression.in(java.lang.String key, java.util.List<java.lang.String> values)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.LabelExpression.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `values`<sup>Required</sup> <a name="org.cdk8s.plus27.LabelExpression.parameter.values"></a>

- *Type:* java.util.List<`java.lang.String`>

---

##### `notIn` <a name="org.cdk8s.plus27.LabelExpression.notIn"></a>

```java
import org.cdk8s.plus27.LabelExpression;

LabelExpression.notIn(java.lang.String key, java.util.List<java.lang.String> values)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.LabelExpression.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `values`<sup>Required</sup> <a name="org.cdk8s.plus27.LabelExpression.parameter.values"></a>

- *Type:* java.util.List<`java.lang.String`>

---

#### Properties <a name="Properties"></a>

##### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.LabelExpression.property.key"></a>

```java
public java.lang.String getKey();
```

- *Type:* `java.lang.String`

---

##### `operator`<sup>Required</sup> <a name="org.cdk8s.plus27.LabelExpression.property.operator"></a>

```java
public java.lang.String getOperator();
```

- *Type:* `java.lang.String`

---

##### `values`<sup>Optional</sup> <a name="org.cdk8s.plus27.LabelExpression.property.values"></a>

```java
public java.util.List<java.lang.String> getValues();
```

- *Type:* java.util.List<`java.lang.String`>

---


### LabelSelector <a name="org.cdk8s.plus27.LabelSelector"></a>

Match a resource by labels.

#### Methods <a name="Methods"></a>

##### `isEmpty` <a name="org.cdk8s.plus27.LabelSelector.isEmpty"></a>

```java
public isEmpty()
```

#### Static Functions <a name="Static Functions"></a>

##### `of` <a name="org.cdk8s.plus27.LabelSelector.of"></a>

```java
import org.cdk8s.plus27.LabelSelector;

LabelSelector.of()
LabelSelector.of(LabelSelectorOptions options)
```

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.LabelSelector.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.LabelSelectorOptions`](#org.cdk8s.plus27.LabelSelectorOptions)

---



### Metric <a name="org.cdk8s.plus27.Metric"></a>

A metric condition that HorizontalPodAutoscaler's scale on.


#### Static Functions <a name="Static Functions"></a>

##### `containerCpu` <a name="org.cdk8s.plus27.Metric.containerCpu"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.containerCpu(MetricContainerResourceOptions options)
```

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.MetricContainerResourceOptions`](#org.cdk8s.plus27.MetricContainerResourceOptions)

---

##### `containerEphemeralStorage` <a name="org.cdk8s.plus27.Metric.containerEphemeralStorage"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.containerEphemeralStorage(MetricContainerResourceOptions options)
```

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.MetricContainerResourceOptions`](#org.cdk8s.plus27.MetricContainerResourceOptions)

---

##### `containerMemory` <a name="org.cdk8s.plus27.Metric.containerMemory"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.containerMemory(MetricContainerResourceOptions options)
```

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.MetricContainerResourceOptions`](#org.cdk8s.plus27.MetricContainerResourceOptions)

---

##### `containerStorage` <a name="org.cdk8s.plus27.Metric.containerStorage"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.containerStorage(MetricContainerResourceOptions options)
```

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.MetricContainerResourceOptions`](#org.cdk8s.plus27.MetricContainerResourceOptions)

---

##### `external` <a name="org.cdk8s.plus27.Metric.external"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.external(MetricOptions options)
```

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.MetricOptions`](#org.cdk8s.plus27.MetricOptions)

---

##### `object` <a name="org.cdk8s.plus27.Metric.object"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.object(MetricObjectOptions options)
```

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.MetricObjectOptions`](#org.cdk8s.plus27.MetricObjectOptions)

---

##### `pods` <a name="org.cdk8s.plus27.Metric.pods"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.pods(MetricOptions options)
```

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.MetricOptions`](#org.cdk8s.plus27.MetricOptions)

---

##### `resourceCpu` <a name="org.cdk8s.plus27.Metric.resourceCpu"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.resourceCpu(MetricTarget target)
```

###### `target`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.target"></a>

- *Type:* [`org.cdk8s.plus27.MetricTarget`](#org.cdk8s.plus27.MetricTarget)

---

##### `resourceEphemeralStorage` <a name="org.cdk8s.plus27.Metric.resourceEphemeralStorage"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.resourceEphemeralStorage(MetricTarget target)
```

###### `target`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.target"></a>

- *Type:* [`org.cdk8s.plus27.MetricTarget`](#org.cdk8s.plus27.MetricTarget)

---

##### `resourceMemory` <a name="org.cdk8s.plus27.Metric.resourceMemory"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.resourceMemory(MetricTarget target)
```

###### `target`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.target"></a>

- *Type:* [`org.cdk8s.plus27.MetricTarget`](#org.cdk8s.plus27.MetricTarget)

---

##### `resourceStorage` <a name="org.cdk8s.plus27.Metric.resourceStorage"></a>

```java
import org.cdk8s.plus27.Metric;

Metric.resourceStorage(MetricTarget target)
```

###### `target`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.parameter.target"></a>

- *Type:* [`org.cdk8s.plus27.MetricTarget`](#org.cdk8s.plus27.MetricTarget)

---

#### Properties <a name="Properties"></a>

##### `type`<sup>Required</sup> <a name="org.cdk8s.plus27.Metric.property.type"></a>

```java
public java.lang.String getType();
```

- *Type:* `java.lang.String`

---


### MetricTarget <a name="org.cdk8s.plus27.MetricTarget"></a>

A metric condition that will trigger scaling behavior when satisfied.


#### Static Functions <a name="Static Functions"></a>

##### `averageUtilization` <a name="org.cdk8s.plus27.MetricTarget.averageUtilization"></a>

```java
import org.cdk8s.plus27.MetricTarget;

MetricTarget.averageUtilization(java.lang.Number averageUtilization)
```

###### `averageUtilization`<sup>Required</sup> <a name="org.cdk8s.plus27.MetricTarget.parameter.averageUtilization"></a>

- *Type:* `java.lang.Number`

The percentage of the utilization metric.

e.g. `50` for 50%.

---

##### `averageValue` <a name="org.cdk8s.plus27.MetricTarget.averageValue"></a>

```java
import org.cdk8s.plus27.MetricTarget;

MetricTarget.averageValue(java.lang.Number averageValue)
```

###### `averageValue`<sup>Required</sup> <a name="org.cdk8s.plus27.MetricTarget.parameter.averageValue"></a>

- *Type:* `java.lang.Number`

The average metric value.

---

##### `value` <a name="org.cdk8s.plus27.MetricTarget.value"></a>

```java
import org.cdk8s.plus27.MetricTarget;

MetricTarget.value(java.lang.Number value)
```

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.MetricTarget.parameter.value"></a>

- *Type:* `java.lang.Number`

The target value.

---



### NamedNode <a name="org.cdk8s.plus27.NamedNode"></a>

A node that is matched by its name.

#### Initializers <a name="org.cdk8s.plus27.NamedNode.Initializer"></a>

```java
import org.cdk8s.plus27.NamedNode;

new NamedNode(java.lang.String name);
```

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.NamedNode.parameter.name"></a>

- *Type:* `java.lang.String`

---



#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.NamedNode.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

---


### NetworkPolicyPort <a name="org.cdk8s.plus27.NetworkPolicyPort"></a>

Describes a port to allow traffic on.


#### Static Functions <a name="Static Functions"></a>

##### `allTcp` <a name="org.cdk8s.plus27.NetworkPolicyPort.allTcp"></a>

```java
import org.cdk8s.plus27.NetworkPolicyPort;

NetworkPolicyPort.allTcp()
```

##### `allUdp` <a name="org.cdk8s.plus27.NetworkPolicyPort.allUdp"></a>

```java
import org.cdk8s.plus27.NetworkPolicyPort;

NetworkPolicyPort.allUdp()
```

##### `of` <a name="org.cdk8s.plus27.NetworkPolicyPort.of"></a>

```java
import org.cdk8s.plus27.NetworkPolicyPort;

NetworkPolicyPort.of(NetworkPolicyPortProps props)
```

###### `props`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyPort.parameter.props"></a>

- *Type:* [`org.cdk8s.plus27.NetworkPolicyPortProps`](#org.cdk8s.plus27.NetworkPolicyPortProps)

---

##### `tcp` <a name="org.cdk8s.plus27.NetworkPolicyPort.tcp"></a>

```java
import org.cdk8s.plus27.NetworkPolicyPort;

NetworkPolicyPort.tcp(java.lang.Number port)
```

###### `port`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyPort.parameter.port"></a>

- *Type:* `java.lang.Number`

---

##### `tcpRange` <a name="org.cdk8s.plus27.NetworkPolicyPort.tcpRange"></a>

```java
import org.cdk8s.plus27.NetworkPolicyPort;

NetworkPolicyPort.tcpRange(java.lang.Number startPort, java.lang.Number endPort)
```

###### `startPort`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyPort.parameter.startPort"></a>

- *Type:* `java.lang.Number`

---

###### `endPort`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyPort.parameter.endPort"></a>

- *Type:* `java.lang.Number`

---

##### `udp` <a name="org.cdk8s.plus27.NetworkPolicyPort.udp"></a>

```java
import org.cdk8s.plus27.NetworkPolicyPort;

NetworkPolicyPort.udp(java.lang.Number port)
```

###### `port`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyPort.parameter.port"></a>

- *Type:* `java.lang.Number`

---

##### `udpRange` <a name="org.cdk8s.plus27.NetworkPolicyPort.udpRange"></a>

```java
import org.cdk8s.plus27.NetworkPolicyPort;

NetworkPolicyPort.udpRange(java.lang.Number startPort, java.lang.Number endPort)
```

###### `startPort`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyPort.parameter.startPort"></a>

- *Type:* `java.lang.Number`

---

###### `endPort`<sup>Required</sup> <a name="org.cdk8s.plus27.NetworkPolicyPort.parameter.endPort"></a>

- *Type:* `java.lang.Number`

---



### Node <a name="org.cdk8s.plus27.Node"></a>

Represents a node in the cluster.

#### Initializers <a name="org.cdk8s.plus27.Node.Initializer"></a>

```java
import org.cdk8s.plus27.Node;

new Node();
```


#### Static Functions <a name="Static Functions"></a>

##### `labeled` <a name="org.cdk8s.plus27.Node.labeled"></a>

```java
import org.cdk8s.plus27.Node;

Node.labeled(NodeLabelQuery labelSelector)
```

###### `labelSelector`<sup>Required</sup> <a name="org.cdk8s.plus27.Node.parameter.labelSelector"></a>

- *Type:* [`org.cdk8s.plus27.NodeLabelQuery`](#org.cdk8s.plus27.NodeLabelQuery)

---

##### `named` <a name="org.cdk8s.plus27.Node.named"></a>

```java
import org.cdk8s.plus27.Node;

Node.named(java.lang.String nodeName)
```

###### `nodeName`<sup>Required</sup> <a name="org.cdk8s.plus27.Node.parameter.nodeName"></a>

- *Type:* `java.lang.String`

---

##### `tainted` <a name="org.cdk8s.plus27.Node.tainted"></a>

```java
import org.cdk8s.plus27.Node;

Node.tainted(NodeTaintQuery taintSelector)
```

###### `taintSelector`<sup>Required</sup> <a name="org.cdk8s.plus27.Node.parameter.taintSelector"></a>

- *Type:* [`org.cdk8s.plus27.NodeTaintQuery`](#org.cdk8s.plus27.NodeTaintQuery)

---



### NodeLabelQuery <a name="org.cdk8s.plus27.NodeLabelQuery"></a>

Represents a query that can be performed against nodes with labels.


#### Static Functions <a name="Static Functions"></a>

##### `doesNotExist` <a name="org.cdk8s.plus27.NodeLabelQuery.doesNotExist"></a>

```java
import org.cdk8s.plus27.NodeLabelQuery;

NodeLabelQuery.doesNotExist(java.lang.String key)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.key"></a>

- *Type:* `java.lang.String`

---

##### `exists` <a name="org.cdk8s.plus27.NodeLabelQuery.exists"></a>

```java
import org.cdk8s.plus27.NodeLabelQuery;

NodeLabelQuery.exists(java.lang.String key)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.key"></a>

- *Type:* `java.lang.String`

---

##### `gt` <a name="org.cdk8s.plus27.NodeLabelQuery.gt"></a>

```java
import org.cdk8s.plus27.NodeLabelQuery;

NodeLabelQuery.gt(java.lang.String key, java.util.List<java.lang.String> values)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `values`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.values"></a>

- *Type:* java.util.List<`java.lang.String`>

---

##### `in` <a name="org.cdk8s.plus27.NodeLabelQuery.in"></a>

```java
import org.cdk8s.plus27.NodeLabelQuery;

NodeLabelQuery.in(java.lang.String key, java.util.List<java.lang.String> values)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `values`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.values"></a>

- *Type:* java.util.List<`java.lang.String`>

---

##### `is` <a name="org.cdk8s.plus27.NodeLabelQuery.is"></a>

```java
import org.cdk8s.plus27.NodeLabelQuery;

NodeLabelQuery.is(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.value"></a>

- *Type:* `java.lang.String`

---

##### `lt` <a name="org.cdk8s.plus27.NodeLabelQuery.lt"></a>

```java
import org.cdk8s.plus27.NodeLabelQuery;

NodeLabelQuery.lt(java.lang.String key, java.util.List<java.lang.String> values)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `values`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.values"></a>

- *Type:* java.util.List<`java.lang.String`>

---

##### `notIn` <a name="org.cdk8s.plus27.NodeLabelQuery.notIn"></a>

```java
import org.cdk8s.plus27.NodeLabelQuery;

NodeLabelQuery.notIn(java.lang.String key, java.util.List<java.lang.String> values)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `values`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeLabelQuery.parameter.values"></a>

- *Type:* java.util.List<`java.lang.String`>

---



### NodeTaintQuery <a name="org.cdk8s.plus27.NodeTaintQuery"></a>

Taint queries that can be perfomed against nodes.


#### Static Functions <a name="Static Functions"></a>

##### `any` <a name="org.cdk8s.plus27.NodeTaintQuery.any"></a>

```java
import org.cdk8s.plus27.NodeTaintQuery;

NodeTaintQuery.any()
```

##### `exists` <a name="org.cdk8s.plus27.NodeTaintQuery.exists"></a>

```java
import org.cdk8s.plus27.NodeTaintQuery;

NodeTaintQuery.exists(java.lang.String key)
NodeTaintQuery.exists(java.lang.String key, NodeTaintQueryOptions options)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeTaintQuery.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.NodeTaintQuery.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.NodeTaintQueryOptions`](#org.cdk8s.plus27.NodeTaintQueryOptions)

---

##### `is` <a name="org.cdk8s.plus27.NodeTaintQuery.is"></a>

```java
import org.cdk8s.plus27.NodeTaintQuery;

NodeTaintQuery.is(java.lang.String key, java.lang.String value)
NodeTaintQuery.is(java.lang.String key, java.lang.String value, NodeTaintQueryOptions options)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeTaintQuery.parameter.key"></a>

- *Type:* `java.lang.String`

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.NodeTaintQuery.parameter.value"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.NodeTaintQuery.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.NodeTaintQueryOptions`](#org.cdk8s.plus27.NodeTaintQueryOptions)

---



### NonApiResource <a name="org.cdk8s.plus27.NonApiResource"></a>

- *Implements:* [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

Factory for creating non api resources.

#### Methods <a name="Methods"></a>

##### `asApiResource` <a name="org.cdk8s.plus27.NonApiResource.asApiResource"></a>

```java
public asApiResource()
```

##### `asNonApiResource` <a name="org.cdk8s.plus27.NonApiResource.asNonApiResource"></a>

```java
public asNonApiResource()
```

#### Static Functions <a name="Static Functions"></a>

##### `of` <a name="org.cdk8s.plus27.NonApiResource.of"></a>

```java
import org.cdk8s.plus27.NonApiResource;

NonApiResource.of(java.lang.String url)
```

###### `url`<sup>Required</sup> <a name="org.cdk8s.plus27.NonApiResource.parameter.url"></a>

- *Type:* `java.lang.String`

---



### PercentOrAbsolute <a name="org.cdk8s.plus27.PercentOrAbsolute"></a>

Union like class repsenting either a ration in percents or an absolute number.

#### Methods <a name="Methods"></a>

##### `isZero` <a name="org.cdk8s.plus27.PercentOrAbsolute.isZero"></a>

```java
public isZero()
```

#### Static Functions <a name="Static Functions"></a>

##### `absolute` <a name="org.cdk8s.plus27.PercentOrAbsolute.absolute"></a>

```java
import org.cdk8s.plus27.PercentOrAbsolute;

PercentOrAbsolute.absolute(java.lang.Number num)
```

###### `num`<sup>Required</sup> <a name="org.cdk8s.plus27.PercentOrAbsolute.parameter.num"></a>

- *Type:* `java.lang.Number`

---

##### `percent` <a name="org.cdk8s.plus27.PercentOrAbsolute.percent"></a>

```java
import org.cdk8s.plus27.PercentOrAbsolute;

PercentOrAbsolute.percent(java.lang.Number percent)
```

###### `percent`<sup>Required</sup> <a name="org.cdk8s.plus27.PercentOrAbsolute.parameter.percent"></a>

- *Type:* `java.lang.Number`

---

#### Properties <a name="Properties"></a>

##### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.PercentOrAbsolute.property.value"></a>

```java
public java.lang.Object getValue();
```

- *Type:* `java.lang.Object`

---


### PodConnections <a name="org.cdk8s.plus27.PodConnections"></a>

Controls network isolation rules for inter-pod communication.

#### Initializers <a name="org.cdk8s.plus27.PodConnections.Initializer"></a>

```java
import org.cdk8s.plus27.PodConnections;

new PodConnections(AbstractPod instance);
```

##### `instance`<sup>Required</sup> <a name="org.cdk8s.plus27.PodConnections.parameter.instance"></a>

- *Type:* [`org.cdk8s.plus27.AbstractPod`](#org.cdk8s.plus27.AbstractPod)

---

#### Methods <a name="Methods"></a>

##### `allowFrom` <a name="org.cdk8s.plus27.PodConnections.allowFrom"></a>

```java
public allowFrom(INetworkPolicyPeer peer)
public allowFrom(INetworkPolicyPeer peer, PodConnectionsAllowFromOptions options)
```

###### `peer`<sup>Required</sup> <a name="org.cdk8s.plus27.PodConnections.parameter.peer"></a>

- *Type:* [`org.cdk8s.plus27.INetworkPolicyPeer`](#org.cdk8s.plus27.INetworkPolicyPeer)

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodConnections.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.PodConnectionsAllowFromOptions`](#org.cdk8s.plus27.PodConnectionsAllowFromOptions)

---

##### `allowTo` <a name="org.cdk8s.plus27.PodConnections.allowTo"></a>

```java
public allowTo(INetworkPolicyPeer peer)
public allowTo(INetworkPolicyPeer peer, PodConnectionsAllowToOptions options)
```

###### `peer`<sup>Required</sup> <a name="org.cdk8s.plus27.PodConnections.parameter.peer"></a>

- *Type:* [`org.cdk8s.plus27.INetworkPolicyPeer`](#org.cdk8s.plus27.INetworkPolicyPeer)

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodConnections.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.PodConnectionsAllowToOptions`](#org.cdk8s.plus27.PodConnectionsAllowToOptions)

---

##### `isolate` <a name="org.cdk8s.plus27.PodConnections.isolate"></a>

```java
public isolate()
```




### PodDns <a name="org.cdk8s.plus27.PodDns"></a>

Holds dns settings of the pod.

#### Initializers <a name="org.cdk8s.plus27.PodDns.Initializer"></a>

```java
import org.cdk8s.plus27.PodDns;

PodDns.Builder.create()
//  .hostname(java.lang.String)
//  .hostnameAsFQDN(java.lang.Boolean)
//  .nameservers(java.util.List<java.lang.String>)
//  .options(java.util.List<DnsOption>)
//  .policy(DnsPolicy)
//  .searches(java.util.List<java.lang.String>)
//  .subdomain(java.lang.String)
    .build();
```

##### `hostname`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.parameter.hostname"></a>

- *Type:* `java.lang.String`
- *Default:* Set to a system-defined value.

Specifies the hostname of the Pod.

---

##### `hostnameAsFQDN`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.parameter.hostnameAsFQDN"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default).

In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname).
In Windows containers, this means setting the registry value of hostname for the registry
key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN.
If a pod does not have FQDN, this has no effect.

---

##### `nameservers`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.parameter.nameservers"></a>

- *Type:* java.util.List<`java.lang.String`>

A list of IP addresses that will be used as DNS servers for the Pod.

There can be at most 3 IP addresses specified.
When the policy is set to "NONE", the list must contain at least one IP address,
otherwise this property is optional.
The servers listed will be combined to the base nameservers generated from
the specified DNS policy with duplicate addresses removed.

---

##### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.parameter.options"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.DnsOption`](#org.cdk8s.plus27.DnsOption)>

List of objects where each object may have a name property (required) and a value property (optional).

The contents in this property
will be merged to the options generated from the specified DNS policy.
Duplicate entries are removed.

---

##### `policy`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.parameter.policy"></a>

- *Type:* [`org.cdk8s.plus27.DnsPolicy`](#org.cdk8s.plus27.DnsPolicy)
- *Default:* DnsPolicy.CLUSTER_FIRST

Set DNS policy for the pod.

If policy is set to `None`, other configuration must be supplied.

---

##### `searches`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.parameter.searches"></a>

- *Type:* java.util.List<`java.lang.String`>

A list of DNS search domains for hostname lookup in the Pod.

When specified, the provided list will be merged into the base
search domain names generated from the chosen DNS policy.
Duplicate domain names are removed.

Kubernetes allows for at most 6 search domains.

---

##### `subdomain`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDnsProps.parameter.subdomain"></a>

- *Type:* `java.lang.String`
- *Default:* No subdomain.

If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>".

---

#### Methods <a name="Methods"></a>

##### `addNameserver` <a name="org.cdk8s.plus27.PodDns.addNameserver"></a>

```java
public addNameserver(java.lang.String nameservers)
```

###### `nameservers`<sup>Required</sup> <a name="org.cdk8s.plus27.PodDns.parameter.nameservers"></a>

- *Type:* `java.lang.String`

---

##### `addOption` <a name="org.cdk8s.plus27.PodDns.addOption"></a>

```java
public addOption(DnsOption options)
```

###### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.PodDns.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.DnsOption`](#org.cdk8s.plus27.DnsOption)

---

##### `addSearch` <a name="org.cdk8s.plus27.PodDns.addSearch"></a>

```java
public addSearch(java.lang.String searches)
```

###### `searches`<sup>Required</sup> <a name="org.cdk8s.plus27.PodDns.parameter.searches"></a>

- *Type:* `java.lang.String`

---


#### Properties <a name="Properties"></a>

##### `hostnameAsFQDN`<sup>Required</sup> <a name="org.cdk8s.plus27.PodDns.property.hostnameAsFQDN"></a>

```java
public java.lang.Boolean getHostnameAsFQDN();
```

- *Type:* `java.lang.Boolean`

Whether or not the pods hostname is set to its FQDN.

---

##### `nameservers`<sup>Required</sup> <a name="org.cdk8s.plus27.PodDns.property.nameservers"></a>

```java
public java.util.List<java.lang.String> getNameservers();
```

- *Type:* java.util.List<`java.lang.String`>

Nameservers defined for this pod.

---

##### `options`<sup>Required</sup> <a name="org.cdk8s.plus27.PodDns.property.options"></a>

```java
public java.util.List<DnsOption> getOptions();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.DnsOption`](#org.cdk8s.plus27.DnsOption)>

Custom dns options defined for this pod.

---

##### `policy`<sup>Required</sup> <a name="org.cdk8s.plus27.PodDns.property.policy"></a>

```java
public DnsPolicy getPolicy();
```

- *Type:* [`org.cdk8s.plus27.DnsPolicy`](#org.cdk8s.plus27.DnsPolicy)

The DNS policy of this pod.

---

##### `searches`<sup>Required</sup> <a name="org.cdk8s.plus27.PodDns.property.searches"></a>

```java
public java.util.List<java.lang.String> getSearches();
```

- *Type:* java.util.List<`java.lang.String`>

Search domains defined for this pod.

---

##### `hostname`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDns.property.hostname"></a>

```java
public java.lang.String getHostname();
```

- *Type:* `java.lang.String`

The configured hostname of the pod.

Undefined means its set to a system-defined value.

---

##### `subdomain`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodDns.property.subdomain"></a>

```java
public java.lang.String getSubdomain();
```

- *Type:* `java.lang.String`

The configured subdomain of the pod.

---


### PodScheduling <a name="org.cdk8s.plus27.PodScheduling"></a>

Controls the pod scheduling strategy.

#### Initializers <a name="org.cdk8s.plus27.PodScheduling.Initializer"></a>

```java
import org.cdk8s.plus27.PodScheduling;

new PodScheduling(AbstractPod instance);
```

##### `instance`<sup>Required</sup> <a name="org.cdk8s.plus27.PodScheduling.parameter.instance"></a>

- *Type:* [`org.cdk8s.plus27.AbstractPod`](#org.cdk8s.plus27.AbstractPod)

---

#### Methods <a name="Methods"></a>

##### `assign` <a name="org.cdk8s.plus27.PodScheduling.assign"></a>

```java
public assign(NamedNode node)
```

###### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.PodScheduling.parameter.node"></a>

- *Type:* [`org.cdk8s.plus27.NamedNode`](#org.cdk8s.plus27.NamedNode)

---

##### `attract` <a name="org.cdk8s.plus27.PodScheduling.attract"></a>

```java
public attract(LabeledNode node)
public attract(LabeledNode node, PodSchedulingAttractOptions options)
```

###### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.PodScheduling.parameter.node"></a>

- *Type:* [`org.cdk8s.plus27.LabeledNode`](#org.cdk8s.plus27.LabeledNode)

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodScheduling.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.PodSchedulingAttractOptions`](#org.cdk8s.plus27.PodSchedulingAttractOptions)

---

##### `colocate` <a name="org.cdk8s.plus27.PodScheduling.colocate"></a>

```java
public colocate(IPodSelector selector)
public colocate(IPodSelector selector, PodSchedulingColocateOptions options)
```

###### `selector`<sup>Required</sup> <a name="org.cdk8s.plus27.PodScheduling.parameter.selector"></a>

- *Type:* [`org.cdk8s.plus27.IPodSelector`](#org.cdk8s.plus27.IPodSelector)

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodScheduling.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.PodSchedulingColocateOptions`](#org.cdk8s.plus27.PodSchedulingColocateOptions)

---

##### `separate` <a name="org.cdk8s.plus27.PodScheduling.separate"></a>

```java
public separate(IPodSelector selector)
public separate(IPodSelector selector, PodSchedulingSeparateOptions options)
```

###### `selector`<sup>Required</sup> <a name="org.cdk8s.plus27.PodScheduling.parameter.selector"></a>

- *Type:* [`org.cdk8s.plus27.IPodSelector`](#org.cdk8s.plus27.IPodSelector)

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodScheduling.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.PodSchedulingSeparateOptions`](#org.cdk8s.plus27.PodSchedulingSeparateOptions)

---

##### `tolerate` <a name="org.cdk8s.plus27.PodScheduling.tolerate"></a>

```java
public tolerate(TaintedNode node)
```

###### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.PodScheduling.parameter.node"></a>

- *Type:* [`org.cdk8s.plus27.TaintedNode`](#org.cdk8s.plus27.TaintedNode)

---




### PodSecurityContext <a name="org.cdk8s.plus27.PodSecurityContext"></a>

Holds pod-level security attributes and common container settings.

#### Initializers <a name="org.cdk8s.plus27.PodSecurityContext.Initializer"></a>

```java
import org.cdk8s.plus27.PodSecurityContext;

PodSecurityContext.Builder.create()
//  .ensureNonRoot(java.lang.Boolean)
//  .fsGroup(java.lang.Number)
//  .fsGroupChangePolicy(FsGroupChangePolicy)
//  .group(java.lang.Number)
//  .sysctls(java.util.List<Sysctl>)
//  .user(java.lang.Number)
    .build();
```

##### `ensureNonRoot`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.parameter.ensureNonRoot"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Indicates that the container must run as a non-root user.

If true, the Kubelet will validate the image at runtime to ensure that it does
not run as UID 0 (root) and fail to start the container if it does.

---

##### `fsGroup`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.parameter.fsGroup"></a>

- *Type:* `java.lang.Number`
- *Default:* Volume ownership is not changed.

Modify the ownership and permissions of pod volumes to this GID.

---

##### `fsGroupChangePolicy`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.parameter.fsGroupChangePolicy"></a>

- *Type:* [`org.cdk8s.plus27.FsGroupChangePolicy`](#org.cdk8s.plus27.FsGroupChangePolicy)
- *Default:* FsGroupChangePolicy.ALWAYS

Defines behavior of changing ownership and permission of the volume before being exposed inside Pod.

This field will only apply to volume types which support fsGroup based ownership(and permissions).
It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir.

---

##### `group`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.parameter.group"></a>

- *Type:* `java.lang.Number`
- *Default:* Group configured by container runtime

The GID to run the entrypoint of the container process.

---

##### `sysctls`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.parameter.sysctls"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.Sysctl`](#org.cdk8s.plus27.Sysctl)>
- *Default:* No sysctls

Sysctls hold a list of namespaced sysctls used for the pod.

Pods with unsupported sysctls (by the container runtime) might fail to launch.

---

##### `user`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContextProps.parameter.user"></a>

- *Type:* `java.lang.Number`
- *Default:* User specified in image metadata

The UID to run the entrypoint of the container process.

---



#### Properties <a name="Properties"></a>

##### `ensureNonRoot`<sup>Required</sup> <a name="org.cdk8s.plus27.PodSecurityContext.property.ensureNonRoot"></a>

```java
public java.lang.Boolean getEnsureNonRoot();
```

- *Type:* `java.lang.Boolean`

---

##### `fsGroupChangePolicy`<sup>Required</sup> <a name="org.cdk8s.plus27.PodSecurityContext.property.fsGroupChangePolicy"></a>

```java
public FsGroupChangePolicy getFsGroupChangePolicy();
```

- *Type:* [`org.cdk8s.plus27.FsGroupChangePolicy`](#org.cdk8s.plus27.FsGroupChangePolicy)

---

##### `sysctls`<sup>Required</sup> <a name="org.cdk8s.plus27.PodSecurityContext.property.sysctls"></a>

```java
public java.util.List<Sysctl> getSysctls();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.Sysctl`](#org.cdk8s.plus27.Sysctl)>

---

##### `fsGroup`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContext.property.fsGroup"></a>

```java
public java.lang.Number getFsGroup();
```

- *Type:* `java.lang.Number`

---

##### `group`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContext.property.group"></a>

```java
public java.lang.Number getGroup();
```

- *Type:* `java.lang.Number`

---

##### `user`<sup>Optional</sup> <a name="org.cdk8s.plus27.PodSecurityContext.property.user"></a>

```java
public java.lang.Number getUser();
```

- *Type:* `java.lang.Number`

---


### Probe <a name="org.cdk8s.plus27.Probe"></a>

Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.


#### Static Functions <a name="Static Functions"></a>

##### `fromCommand` <a name="org.cdk8s.plus27.Probe.fromCommand"></a>

```java
import org.cdk8s.plus27.Probe;

Probe.fromCommand(java.util.List<java.lang.String> command)
Probe.fromCommand(java.util.List<java.lang.String> command, CommandProbeOptions options)
```

###### `command`<sup>Required</sup> <a name="org.cdk8s.plus27.Probe.parameter.command"></a>

- *Type:* java.util.List<`java.lang.String`>

The command to execute.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Probe.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.CommandProbeOptions`](#org.cdk8s.plus27.CommandProbeOptions)

Options.

---

##### `fromHttpGet` <a name="org.cdk8s.plus27.Probe.fromHttpGet"></a>

```java
import org.cdk8s.plus27.Probe;

Probe.fromHttpGet(java.lang.String path)
Probe.fromHttpGet(java.lang.String path, HttpGetProbeOptions options)
```

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus27.Probe.parameter.path"></a>

- *Type:* `java.lang.String`

The URL path to hit.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Probe.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.HttpGetProbeOptions`](#org.cdk8s.plus27.HttpGetProbeOptions)

Options.

---

##### `fromTcpSocket` <a name="org.cdk8s.plus27.Probe.fromTcpSocket"></a>

```java
import org.cdk8s.plus27.Probe;

Probe.fromTcpSocket()
Probe.fromTcpSocket(TcpSocketProbeOptions options)
```

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.Probe.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.TcpSocketProbeOptions`](#org.cdk8s.plus27.TcpSocketProbeOptions)

Options.

---



### Replicas <a name="org.cdk8s.plus27.Replicas"></a>

The amount of replicas that will change.


#### Static Functions <a name="Static Functions"></a>

##### `absolute` <a name="org.cdk8s.plus27.Replicas.absolute"></a>

```java
import org.cdk8s.plus27.Replicas;

Replicas.absolute(java.lang.Number value)
```

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.Replicas.parameter.value"></a>

- *Type:* `java.lang.Number`

The amount of change to apply.

Must be greater than 0.

---

##### `percent` <a name="org.cdk8s.plus27.Replicas.percent"></a>

```java
import org.cdk8s.plus27.Replicas;

Replicas.percent(java.lang.Number value)
```

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus27.Replicas.parameter.value"></a>

- *Type:* `java.lang.Number`

The percentage of change to apply.

Must be greater than 0.

---



### ResourcePermissions <a name="org.cdk8s.plus27.ResourcePermissions"></a>

Controls permissions for operations on resources.

#### Initializers <a name="org.cdk8s.plus27.ResourcePermissions.Initializer"></a>

```java
import org.cdk8s.plus27.ResourcePermissions;

new ResourcePermissions(Resource instance);
```

##### `instance`<sup>Required</sup> <a name="org.cdk8s.plus27.ResourcePermissions.parameter.instance"></a>

- *Type:* [`org.cdk8s.plus27.Resource`](#org.cdk8s.plus27.Resource)

---

#### Methods <a name="Methods"></a>

##### `grantRead` <a name="org.cdk8s.plus27.ResourcePermissions.grantRead"></a>

```java
public grantRead(ISubject subjects)
```

###### `subjects`<sup>Required</sup> <a name="org.cdk8s.plus27.ResourcePermissions.parameter.subjects"></a>

- *Type:* [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

---

##### `grantReadWrite` <a name="org.cdk8s.plus27.ResourcePermissions.grantReadWrite"></a>

```java
public grantReadWrite(ISubject subjects)
```

###### `subjects`<sup>Required</sup> <a name="org.cdk8s.plus27.ResourcePermissions.parameter.subjects"></a>

- *Type:* [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

---




### StatefulSetUpdateStrategy <a name="org.cdk8s.plus27.StatefulSetUpdateStrategy"></a>

StatefulSet update strategies.


#### Static Functions <a name="Static Functions"></a>

##### `onDelete` <a name="org.cdk8s.plus27.StatefulSetUpdateStrategy.onDelete"></a>

```java
import org.cdk8s.plus27.StatefulSetUpdateStrategy;

StatefulSetUpdateStrategy.onDelete()
```

##### `rollingUpdate` <a name="org.cdk8s.plus27.StatefulSetUpdateStrategy.rollingUpdate"></a>

```java
import org.cdk8s.plus27.StatefulSetUpdateStrategy;

StatefulSetUpdateStrategy.rollingUpdate()
StatefulSetUpdateStrategy.rollingUpdate(StatefulSetUpdateStrategyRollingUpdateOptions options)
```

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.StatefulSetUpdateStrategy.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.StatefulSetUpdateStrategyRollingUpdateOptions`](#org.cdk8s.plus27.StatefulSetUpdateStrategyRollingUpdateOptions)

---



### TaintedNode <a name="org.cdk8s.plus27.TaintedNode"></a>

A node that is matched by taint selectors.

#### Initializers <a name="org.cdk8s.plus27.TaintedNode.Initializer"></a>

```java
import org.cdk8s.plus27.TaintedNode;

new TaintedNode(java.util.List<NodeTaintQuery> taintSelector);
```

##### `taintSelector`<sup>Required</sup> <a name="org.cdk8s.plus27.TaintedNode.parameter.taintSelector"></a>

- *Type:* java.util.List<[`org.cdk8s.plus27.NodeTaintQuery`](#org.cdk8s.plus27.NodeTaintQuery)>

---



#### Properties <a name="Properties"></a>

##### `taintSelector`<sup>Required</sup> <a name="org.cdk8s.plus27.TaintedNode.property.taintSelector"></a>

```java
public java.util.List<NodeTaintQuery> getTaintSelector();
```

- *Type:* java.util.List<[`org.cdk8s.plus27.NodeTaintQuery`](#org.cdk8s.plus27.NodeTaintQuery)>

---


### Topology <a name="org.cdk8s.plus27.Topology"></a>

Available topology domains.


#### Static Functions <a name="Static Functions"></a>

##### `custom` <a name="org.cdk8s.plus27.Topology.custom"></a>

```java
import org.cdk8s.plus27.Topology;

Topology.custom(java.lang.String key)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.Topology.parameter.key"></a>

- *Type:* `java.lang.String`

---

#### Properties <a name="Properties"></a>

##### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.Topology.property.key"></a>

```java
public java.lang.String getKey();
```

- *Type:* `java.lang.String`

---

#### Constants <a name="Constants"></a>

##### `HOSTNAME` <a name="org.cdk8s.plus27.Topology.property.HOSTNAME"></a>

- *Type:* [`org.cdk8s.plus27.Topology`](#org.cdk8s.plus27.Topology)

A hostname represents a single node in the cluster.

> https://kubernetes.io/docs/reference/labels-annotations-taints/#kubernetesiohostname

---

##### `REGION` <a name="org.cdk8s.plus27.Topology.property.REGION"></a>

- *Type:* [`org.cdk8s.plus27.Topology`](#org.cdk8s.plus27.Topology)

A region represents a larger domain, made up of one or more zones.

It is uncommon
for Kubernetes clusters to span multiple regions. While the exact definition of a
zone or region is left to infrastructure implementations, common properties of a region
include higher network latency between them than within them, non-zero cost for network
traffic between them, and failure independence from other zones or regions.

For example, nodes within a region might share power infrastructure (e.g. a UPS or generator), but
nodes in different regions typically would not.

> https://kubernetes.io/docs/reference/labels-annotations-taints/#topologykubernetesioregion

---

##### `ZONE` <a name="org.cdk8s.plus27.Topology.property.ZONE"></a>

- *Type:* [`org.cdk8s.plus27.Topology`](#org.cdk8s.plus27.Topology)

A zone represents a logical failure domain.

It is common for Kubernetes clusters to
span multiple zones for increased availability. While the exact definition of a zone is
left to infrastructure implementations, common properties of a zone include very low
network latency within a zone, no-cost network traffic within a zone, and failure
independence from other zones. For example, nodes within a zone might share a network
switch, but nodes in different zones should not.

> https://kubernetes.io/docs/reference/labels-annotations-taints/#topologykubernetesiozone

---

### WorkloadScheduling <a name="org.cdk8s.plus27.WorkloadScheduling"></a>

Controls the pod scheduling strategy of this workload.

It offers some additional API's on top of the core pod scheduling.

#### Initializers <a name="org.cdk8s.plus27.WorkloadScheduling.Initializer"></a>

```java
import org.cdk8s.plus27.WorkloadScheduling;

new WorkloadScheduling(AbstractPod instance);
```

##### `instance`<sup>Required</sup> <a name="org.cdk8s.plus27.WorkloadScheduling.parameter.instance"></a>

- *Type:* [`org.cdk8s.plus27.AbstractPod`](#org.cdk8s.plus27.AbstractPod)

---

#### Methods <a name="Methods"></a>

##### `spread` <a name="org.cdk8s.plus27.WorkloadScheduling.spread"></a>

```java
public spread()
public spread(WorkloadSchedulingSpreadOptions options)
```

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.WorkloadScheduling.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.WorkloadSchedulingSpreadOptions`](#org.cdk8s.plus27.WorkloadSchedulingSpreadOptions)

---




## Protocols <a name="Protocols"></a>

### IApiEndpoint <a name="org.cdk8s.plus27.IApiEndpoint"></a>

- *Implemented By:* [`org.cdk8s.plus27.AbstractPod`](#org.cdk8s.plus27.AbstractPod), [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource), [`org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume`](#org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume), [`org.cdk8s.plus27.AzureDiskPersistentVolume`](#org.cdk8s.plus27.AzureDiskPersistentVolume), [`org.cdk8s.plus27.BasicAuthSecret`](#org.cdk8s.plus27.BasicAuthSecret), [`org.cdk8s.plus27.ClusterRole`](#org.cdk8s.plus27.ClusterRole), [`org.cdk8s.plus27.ClusterRoleBinding`](#org.cdk8s.plus27.ClusterRoleBinding), [`org.cdk8s.plus27.ConfigMap`](#org.cdk8s.plus27.ConfigMap), [`org.cdk8s.plus27.CronJob`](#org.cdk8s.plus27.CronJob), [`org.cdk8s.plus27.DaemonSet`](#org.cdk8s.plus27.DaemonSet), [`org.cdk8s.plus27.Deployment`](#org.cdk8s.plus27.Deployment), [`org.cdk8s.plus27.DockerConfigSecret`](#org.cdk8s.plus27.DockerConfigSecret), [`org.cdk8s.plus27.GCEPersistentDiskPersistentVolume`](#org.cdk8s.plus27.GCEPersistentDiskPersistentVolume), [`org.cdk8s.plus27.HorizontalPodAutoscaler`](#org.cdk8s.plus27.HorizontalPodAutoscaler), [`org.cdk8s.plus27.Ingress`](#org.cdk8s.plus27.Ingress), [`org.cdk8s.plus27.Job`](#org.cdk8s.plus27.Job), [`org.cdk8s.plus27.Namespace`](#org.cdk8s.plus27.Namespace), [`org.cdk8s.plus27.NetworkPolicy`](#org.cdk8s.plus27.NetworkPolicy), [`org.cdk8s.plus27.NonApiResource`](#org.cdk8s.plus27.NonApiResource), [`org.cdk8s.plus27.PersistentVolume`](#org.cdk8s.plus27.PersistentVolume), [`org.cdk8s.plus27.PersistentVolumeClaim`](#org.cdk8s.plus27.PersistentVolumeClaim), [`org.cdk8s.plus27.Pod`](#org.cdk8s.plus27.Pod), [`org.cdk8s.plus27.Resource`](#org.cdk8s.plus27.Resource), [`org.cdk8s.plus27.Role`](#org.cdk8s.plus27.Role), [`org.cdk8s.plus27.RoleBinding`](#org.cdk8s.plus27.RoleBinding), [`org.cdk8s.plus27.Secret`](#org.cdk8s.plus27.Secret), [`org.cdk8s.plus27.Service`](#org.cdk8s.plus27.Service), [`org.cdk8s.plus27.ServiceAccount`](#org.cdk8s.plus27.ServiceAccount), [`org.cdk8s.plus27.ServiceAccountTokenSecret`](#org.cdk8s.plus27.ServiceAccountTokenSecret), [`org.cdk8s.plus27.SshAuthSecret`](#org.cdk8s.plus27.SshAuthSecret), [`org.cdk8s.plus27.StatefulSet`](#org.cdk8s.plus27.StatefulSet), [`org.cdk8s.plus27.TlsSecret`](#org.cdk8s.plus27.TlsSecret), [`org.cdk8s.plus27.Workload`](#org.cdk8s.plus27.Workload), [`org.cdk8s.plus27.IApiEndpoint`](#org.cdk8s.plus27.IApiEndpoint)

An API Endpoint can either be a resource descriptor (e.g /pods) or a non resource url (e.g /healthz). It must be one or the other, and not both.

#### Methods <a name="Methods"></a>

##### `asApiResource` <a name="org.cdk8s.plus27.IApiEndpoint.asApiResource"></a>

```java
public asApiResource()
```

##### `asNonApiResource` <a name="org.cdk8s.plus27.IApiEndpoint.asNonApiResource"></a>

```java
public asNonApiResource()
```


### IApiResource <a name="org.cdk8s.plus27.IApiResource"></a>

- *Implemented By:* [`org.cdk8s.plus27.AbstractPod`](#org.cdk8s.plus27.AbstractPod), [`org.cdk8s.plus27.ApiResource`](#org.cdk8s.plus27.ApiResource), [`org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume`](#org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume), [`org.cdk8s.plus27.AzureDiskPersistentVolume`](#org.cdk8s.plus27.AzureDiskPersistentVolume), [`org.cdk8s.plus27.BasicAuthSecret`](#org.cdk8s.plus27.BasicAuthSecret), [`org.cdk8s.plus27.ClusterRole`](#org.cdk8s.plus27.ClusterRole), [`org.cdk8s.plus27.ClusterRoleBinding`](#org.cdk8s.plus27.ClusterRoleBinding), [`org.cdk8s.plus27.ConfigMap`](#org.cdk8s.plus27.ConfigMap), [`org.cdk8s.plus27.CronJob`](#org.cdk8s.plus27.CronJob), [`org.cdk8s.plus27.DaemonSet`](#org.cdk8s.plus27.DaemonSet), [`org.cdk8s.plus27.Deployment`](#org.cdk8s.plus27.Deployment), [`org.cdk8s.plus27.DockerConfigSecret`](#org.cdk8s.plus27.DockerConfigSecret), [`org.cdk8s.plus27.GCEPersistentDiskPersistentVolume`](#org.cdk8s.plus27.GCEPersistentDiskPersistentVolume), [`org.cdk8s.plus27.HorizontalPodAutoscaler`](#org.cdk8s.plus27.HorizontalPodAutoscaler), [`org.cdk8s.plus27.Ingress`](#org.cdk8s.plus27.Ingress), [`org.cdk8s.plus27.Job`](#org.cdk8s.plus27.Job), [`org.cdk8s.plus27.Namespace`](#org.cdk8s.plus27.Namespace), [`org.cdk8s.plus27.NetworkPolicy`](#org.cdk8s.plus27.NetworkPolicy), [`org.cdk8s.plus27.PersistentVolume`](#org.cdk8s.plus27.PersistentVolume), [`org.cdk8s.plus27.PersistentVolumeClaim`](#org.cdk8s.plus27.PersistentVolumeClaim), [`org.cdk8s.plus27.Pod`](#org.cdk8s.plus27.Pod), [`org.cdk8s.plus27.Resource`](#org.cdk8s.plus27.Resource), [`org.cdk8s.plus27.Role`](#org.cdk8s.plus27.Role), [`org.cdk8s.plus27.RoleBinding`](#org.cdk8s.plus27.RoleBinding), [`org.cdk8s.plus27.Secret`](#org.cdk8s.plus27.Secret), [`org.cdk8s.plus27.Service`](#org.cdk8s.plus27.Service), [`org.cdk8s.plus27.ServiceAccount`](#org.cdk8s.plus27.ServiceAccount), [`org.cdk8s.plus27.ServiceAccountTokenSecret`](#org.cdk8s.plus27.ServiceAccountTokenSecret), [`org.cdk8s.plus27.SshAuthSecret`](#org.cdk8s.plus27.SshAuthSecret), [`org.cdk8s.plus27.StatefulSet`](#org.cdk8s.plus27.StatefulSet), [`org.cdk8s.plus27.TlsSecret`](#org.cdk8s.plus27.TlsSecret), [`org.cdk8s.plus27.Workload`](#org.cdk8s.plus27.Workload), [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource), [`org.cdk8s.plus27.IClusterRole`](#org.cdk8s.plus27.IClusterRole), [`org.cdk8s.plus27.IConfigMap`](#org.cdk8s.plus27.IConfigMap), [`org.cdk8s.plus27.IPersistentVolume`](#org.cdk8s.plus27.IPersistentVolume), [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim), [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource), [`org.cdk8s.plus27.IRole`](#org.cdk8s.plus27.IRole), [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret), [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)

Represents a resource or collection of resources.


#### Properties <a name="Properties"></a>

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.IApiResource.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.IApiResource.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.IApiResource.property.resourceName"></a>

```java
public java.lang.String getResourceName();
```

- *Type:* `java.lang.String`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

### IClusterRole <a name="org.cdk8s.plus27.IClusterRole"></a>

- *Extends:* [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource)

- *Implemented By:* [`org.cdk8s.plus27.ClusterRole`](#org.cdk8s.plus27.ClusterRole), [`org.cdk8s.plus27.IClusterRole`](#org.cdk8s.plus27.IClusterRole)

Represents a cluster-level role.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.IClusterRole.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.IClusterRole.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.IClusterRole.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.IClusterRole.property.resourceName"></a>

```java
public java.lang.String getResourceName();
```

- *Type:* `java.lang.String`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="org.cdk8s.plus27.IClusterRole.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.IClusterRole.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.IClusterRole.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### IConfigMap <a name="org.cdk8s.plus27.IConfigMap"></a>

- *Extends:* [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource)

- *Implemented By:* [`org.cdk8s.plus27.ConfigMap`](#org.cdk8s.plus27.ConfigMap), [`org.cdk8s.plus27.IConfigMap`](#org.cdk8s.plus27.IConfigMap)

Represents a config map.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.IConfigMap.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.IConfigMap.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.IConfigMap.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.IConfigMap.property.resourceName"></a>

```java
public java.lang.String getResourceName();
```

- *Type:* `java.lang.String`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="org.cdk8s.plus27.IConfigMap.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.IConfigMap.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.IConfigMap.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### INamespaceSelector <a name="org.cdk8s.plus27.INamespaceSelector"></a>

- *Extends:* [`software.constructs.IConstruct`](#software.constructs.IConstruct)

- *Implemented By:* [`org.cdk8s.plus27.Namespace`](#org.cdk8s.plus27.Namespace), [`org.cdk8s.plus27.Namespaces`](#org.cdk8s.plus27.Namespaces), [`org.cdk8s.plus27.INamespaceSelector`](#org.cdk8s.plus27.INamespaceSelector)

Represents an object that can select namespaces.

#### Methods <a name="Methods"></a>

##### `toNamespaceSelectorConfig` <a name="org.cdk8s.plus27.INamespaceSelector.toNamespaceSelectorConfig"></a>

```java
public toNamespaceSelectorConfig()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.INamespaceSelector.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

### INetworkPolicyPeer <a name="org.cdk8s.plus27.INetworkPolicyPeer"></a>

- *Extends:* [`software.constructs.IConstruct`](#software.constructs.IConstruct)

- *Implemented By:* [`org.cdk8s.plus27.AbstractPod`](#org.cdk8s.plus27.AbstractPod), [`org.cdk8s.plus27.CronJob`](#org.cdk8s.plus27.CronJob), [`org.cdk8s.plus27.DaemonSet`](#org.cdk8s.plus27.DaemonSet), [`org.cdk8s.plus27.Deployment`](#org.cdk8s.plus27.Deployment), [`org.cdk8s.plus27.Job`](#org.cdk8s.plus27.Job), [`org.cdk8s.plus27.Namespace`](#org.cdk8s.plus27.Namespace), [`org.cdk8s.plus27.Namespaces`](#org.cdk8s.plus27.Namespaces), [`org.cdk8s.plus27.NetworkPolicyIpBlock`](#org.cdk8s.plus27.NetworkPolicyIpBlock), [`org.cdk8s.plus27.Pod`](#org.cdk8s.plus27.Pod), [`org.cdk8s.plus27.StatefulSet`](#org.cdk8s.plus27.StatefulSet), [`org.cdk8s.plus27.Workload`](#org.cdk8s.plus27.Workload), [`org.cdk8s.plus27.INetworkPolicyPeer`](#org.cdk8s.plus27.INetworkPolicyPeer)

Describes a peer to allow traffic to/from.

#### Methods <a name="Methods"></a>

##### `toNetworkPolicyPeerConfig` <a name="org.cdk8s.plus27.INetworkPolicyPeer.toNetworkPolicyPeerConfig"></a>

```java
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="org.cdk8s.plus27.INetworkPolicyPeer.toPodSelector"></a>

```java
public toPodSelector()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.INetworkPolicyPeer.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

### IPersistentVolume <a name="org.cdk8s.plus27.IPersistentVolume"></a>

- *Extends:* [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource)

- *Implemented By:* [`org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume`](#org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume), [`org.cdk8s.plus27.AzureDiskPersistentVolume`](#org.cdk8s.plus27.AzureDiskPersistentVolume), [`org.cdk8s.plus27.GCEPersistentDiskPersistentVolume`](#org.cdk8s.plus27.GCEPersistentDiskPersistentVolume), [`org.cdk8s.plus27.PersistentVolume`](#org.cdk8s.plus27.PersistentVolume), [`org.cdk8s.plus27.IPersistentVolume`](#org.cdk8s.plus27.IPersistentVolume)

Contract of a `PersistentVolumeClaim`.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolume.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolume.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolume.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.IPersistentVolume.property.resourceName"></a>

```java
public java.lang.String getResourceName();
```

- *Type:* `java.lang.String`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolume.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolume.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolume.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### IPersistentVolumeClaim <a name="org.cdk8s.plus27.IPersistentVolumeClaim"></a>

- *Extends:* [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource)

- *Implemented By:* [`org.cdk8s.plus27.PersistentVolumeClaim`](#org.cdk8s.plus27.PersistentVolumeClaim), [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim)

Contract of a `PersistentVolumeClaim`.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolumeClaim.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolumeClaim.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolumeClaim.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.IPersistentVolumeClaim.property.resourceName"></a>

```java
public java.lang.String getResourceName();
```

- *Type:* `java.lang.String`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolumeClaim.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolumeClaim.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.IPersistentVolumeClaim.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### IPodSelector <a name="org.cdk8s.plus27.IPodSelector"></a>

- *Extends:* [`software.constructs.IConstruct`](#software.constructs.IConstruct)

- *Implemented By:* [`org.cdk8s.plus27.AbstractPod`](#org.cdk8s.plus27.AbstractPod), [`org.cdk8s.plus27.CronJob`](#org.cdk8s.plus27.CronJob), [`org.cdk8s.plus27.DaemonSet`](#org.cdk8s.plus27.DaemonSet), [`org.cdk8s.plus27.Deployment`](#org.cdk8s.plus27.Deployment), [`org.cdk8s.plus27.Job`](#org.cdk8s.plus27.Job), [`org.cdk8s.plus27.Pod`](#org.cdk8s.plus27.Pod), [`org.cdk8s.plus27.Pods`](#org.cdk8s.plus27.Pods), [`org.cdk8s.plus27.StatefulSet`](#org.cdk8s.plus27.StatefulSet), [`org.cdk8s.plus27.Workload`](#org.cdk8s.plus27.Workload), [`org.cdk8s.plus27.IPodSelector`](#org.cdk8s.plus27.IPodSelector)

Represents an object that can select pods.

#### Methods <a name="Methods"></a>

##### `toPodSelectorConfig` <a name="org.cdk8s.plus27.IPodSelector.toPodSelectorConfig"></a>

```java
public toPodSelectorConfig()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.IPodSelector.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

### IResource <a name="org.cdk8s.plus27.IResource"></a>

- *Extends:* [`software.constructs.IConstruct`](#software.constructs.IConstruct), [`org.cdk8s.plus27.IApiResource`](#org.cdk8s.plus27.IApiResource)

- *Implemented By:* [`org.cdk8s.plus27.AbstractPod`](#org.cdk8s.plus27.AbstractPod), [`org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume`](#org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume), [`org.cdk8s.plus27.AzureDiskPersistentVolume`](#org.cdk8s.plus27.AzureDiskPersistentVolume), [`org.cdk8s.plus27.BasicAuthSecret`](#org.cdk8s.plus27.BasicAuthSecret), [`org.cdk8s.plus27.ClusterRole`](#org.cdk8s.plus27.ClusterRole), [`org.cdk8s.plus27.ClusterRoleBinding`](#org.cdk8s.plus27.ClusterRoleBinding), [`org.cdk8s.plus27.ConfigMap`](#org.cdk8s.plus27.ConfigMap), [`org.cdk8s.plus27.CronJob`](#org.cdk8s.plus27.CronJob), [`org.cdk8s.plus27.DaemonSet`](#org.cdk8s.plus27.DaemonSet), [`org.cdk8s.plus27.Deployment`](#org.cdk8s.plus27.Deployment), [`org.cdk8s.plus27.DockerConfigSecret`](#org.cdk8s.plus27.DockerConfigSecret), [`org.cdk8s.plus27.GCEPersistentDiskPersistentVolume`](#org.cdk8s.plus27.GCEPersistentDiskPersistentVolume), [`org.cdk8s.plus27.HorizontalPodAutoscaler`](#org.cdk8s.plus27.HorizontalPodAutoscaler), [`org.cdk8s.plus27.Ingress`](#org.cdk8s.plus27.Ingress), [`org.cdk8s.plus27.Job`](#org.cdk8s.plus27.Job), [`org.cdk8s.plus27.Namespace`](#org.cdk8s.plus27.Namespace), [`org.cdk8s.plus27.NetworkPolicy`](#org.cdk8s.plus27.NetworkPolicy), [`org.cdk8s.plus27.PersistentVolume`](#org.cdk8s.plus27.PersistentVolume), [`org.cdk8s.plus27.PersistentVolumeClaim`](#org.cdk8s.plus27.PersistentVolumeClaim), [`org.cdk8s.plus27.Pod`](#org.cdk8s.plus27.Pod), [`org.cdk8s.plus27.Resource`](#org.cdk8s.plus27.Resource), [`org.cdk8s.plus27.Role`](#org.cdk8s.plus27.Role), [`org.cdk8s.plus27.RoleBinding`](#org.cdk8s.plus27.RoleBinding), [`org.cdk8s.plus27.Secret`](#org.cdk8s.plus27.Secret), [`org.cdk8s.plus27.Service`](#org.cdk8s.plus27.Service), [`org.cdk8s.plus27.ServiceAccount`](#org.cdk8s.plus27.ServiceAccount), [`org.cdk8s.plus27.ServiceAccountTokenSecret`](#org.cdk8s.plus27.ServiceAccountTokenSecret), [`org.cdk8s.plus27.SshAuthSecret`](#org.cdk8s.plus27.SshAuthSecret), [`org.cdk8s.plus27.StatefulSet`](#org.cdk8s.plus27.StatefulSet), [`org.cdk8s.plus27.TlsSecret`](#org.cdk8s.plus27.TlsSecret), [`org.cdk8s.plus27.Workload`](#org.cdk8s.plus27.Workload), [`org.cdk8s.plus27.IClusterRole`](#org.cdk8s.plus27.IClusterRole), [`org.cdk8s.plus27.IConfigMap`](#org.cdk8s.plus27.IConfigMap), [`org.cdk8s.plus27.IPersistentVolume`](#org.cdk8s.plus27.IPersistentVolume), [`org.cdk8s.plus27.IPersistentVolumeClaim`](#org.cdk8s.plus27.IPersistentVolumeClaim), [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource), [`org.cdk8s.plus27.IRole`](#org.cdk8s.plus27.IRole), [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret), [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)

Represents a resource.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.IResource.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.IResource.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.IResource.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.IResource.property.resourceName"></a>

```java
public java.lang.String getResourceName();
```

- *Type:* `java.lang.String`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="org.cdk8s.plus27.IResource.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.IResource.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.IResource.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### IRole <a name="org.cdk8s.plus27.IRole"></a>

- *Extends:* [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource)

- *Implemented By:* [`org.cdk8s.plus27.ClusterRole`](#org.cdk8s.plus27.ClusterRole), [`org.cdk8s.plus27.Role`](#org.cdk8s.plus27.Role), [`org.cdk8s.plus27.IRole`](#org.cdk8s.plus27.IRole)

A reference to any Role or ClusterRole.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.IRole.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.IRole.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.IRole.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.IRole.property.resourceName"></a>

```java
public java.lang.String getResourceName();
```

- *Type:* `java.lang.String`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="org.cdk8s.plus27.IRole.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.IRole.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.IRole.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### IScalable <a name="org.cdk8s.plus27.IScalable"></a>

- *Implemented By:* [`org.cdk8s.plus27.Deployment`](#org.cdk8s.plus27.Deployment), [`org.cdk8s.plus27.StatefulSet`](#org.cdk8s.plus27.StatefulSet), [`org.cdk8s.plus27.IScalable`](#org.cdk8s.plus27.IScalable)

Represents a scalable workload.

#### Methods <a name="Methods"></a>

##### `markHasAutoscaler` <a name="org.cdk8s.plus27.IScalable.markHasAutoscaler"></a>

```java
public markHasAutoscaler()
```

##### `toScalingTarget` <a name="org.cdk8s.plus27.IScalable.toScalingTarget"></a>

```java
public toScalingTarget()
```

#### Properties <a name="Properties"></a>

##### `hasAutoscaler`<sup>Required</sup> <a name="org.cdk8s.plus27.IScalable.property.hasAutoscaler"></a>

```java
public java.lang.Boolean getHasAutoscaler();
```

- *Type:* `java.lang.Boolean`

If this is a target of an autoscaler.

---

### ISecret <a name="org.cdk8s.plus27.ISecret"></a>

- *Extends:* [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource)

- *Implemented By:* [`org.cdk8s.plus27.BasicAuthSecret`](#org.cdk8s.plus27.BasicAuthSecret), [`org.cdk8s.plus27.DockerConfigSecret`](#org.cdk8s.plus27.DockerConfigSecret), [`org.cdk8s.plus27.Secret`](#org.cdk8s.plus27.Secret), [`org.cdk8s.plus27.ServiceAccountTokenSecret`](#org.cdk8s.plus27.ServiceAccountTokenSecret), [`org.cdk8s.plus27.SshAuthSecret`](#org.cdk8s.plus27.SshAuthSecret), [`org.cdk8s.plus27.TlsSecret`](#org.cdk8s.plus27.TlsSecret), [`org.cdk8s.plus27.ISecret`](#org.cdk8s.plus27.ISecret)

#### Methods <a name="Methods"></a>

##### `envValue` <a name="org.cdk8s.plus27.ISecret.envValue"></a>

```java
public envValue(java.lang.String key)
public envValue(java.lang.String key, EnvValueFromSecretOptions options)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus27.ISecret.parameter.key"></a>

- *Type:* `java.lang.String`

Secret's key.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus27.ISecret.parameter.options"></a>

- *Type:* [`org.cdk8s.plus27.EnvValueFromSecretOptions`](#org.cdk8s.plus27.EnvValueFromSecretOptions)

Additional EnvValue options.

---

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.ISecret.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.ISecret.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.ISecret.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.ISecret.property.resourceName"></a>

```java
public java.lang.String getResourceName();
```

- *Type:* `java.lang.String`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="org.cdk8s.plus27.ISecret.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.ISecret.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.ISecret.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### IServiceAccount <a name="org.cdk8s.plus27.IServiceAccount"></a>

- *Extends:* [`org.cdk8s.plus27.IResource`](#org.cdk8s.plus27.IResource), [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

- *Implemented By:* [`org.cdk8s.plus27.ServiceAccount`](#org.cdk8s.plus27.ServiceAccount), [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount)


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.IServiceAccount.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="org.cdk8s.plus27.IServiceAccount.property.apiGroup"></a>

```java
public java.lang.String getApiGroup();
```

- *Type:* `java.lang.String`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="org.cdk8s.plus27.IServiceAccount.property.resourceType"></a>

```java
public java.lang.String getResourceType();
```

- *Type:* `java.lang.String`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="org.cdk8s.plus27.IServiceAccount.property.resourceName"></a>

```java
public java.lang.String getResourceName();
```

- *Type:* `java.lang.String`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="org.cdk8s.plus27.IServiceAccount.property.apiVersion"></a>

```java
public java.lang.String getApiVersion();
```

- *Type:* `java.lang.String`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="org.cdk8s.plus27.IServiceAccount.property.kind"></a>

```java
public java.lang.String getKind();
```

- *Type:* `java.lang.String`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus27.IServiceAccount.property.name"></a>

```java
public java.lang.String getName();
```

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### IStorage <a name="org.cdk8s.plus27.IStorage"></a>

- *Extends:* [`software.constructs.IConstruct`](#software.constructs.IConstruct)

- *Implemented By:* [`org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume`](#org.cdk8s.plus27.AwsElasticBlockStorePersistentVolume), [`org.cdk8s.plus27.AzureDiskPersistentVolume`](#org.cdk8s.plus27.AzureDiskPersistentVolume), [`org.cdk8s.plus27.GCEPersistentDiskPersistentVolume`](#org.cdk8s.plus27.GCEPersistentDiskPersistentVolume), [`org.cdk8s.plus27.PersistentVolume`](#org.cdk8s.plus27.PersistentVolume), [`org.cdk8s.plus27.Volume`](#org.cdk8s.plus27.Volume), [`org.cdk8s.plus27.IStorage`](#org.cdk8s.plus27.IStorage)

Represents a piece of storage in the cluster.

#### Methods <a name="Methods"></a>

##### `asVolume` <a name="org.cdk8s.plus27.IStorage.asVolume"></a>

```java
public asVolume()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.IStorage.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

### ISubject <a name="org.cdk8s.plus27.ISubject"></a>

- *Extends:* [`software.constructs.IConstruct`](#software.constructs.IConstruct)

- *Implemented By:* [`org.cdk8s.plus27.AbstractPod`](#org.cdk8s.plus27.AbstractPod), [`org.cdk8s.plus27.CronJob`](#org.cdk8s.plus27.CronJob), [`org.cdk8s.plus27.DaemonSet`](#org.cdk8s.plus27.DaemonSet), [`org.cdk8s.plus27.Deployment`](#org.cdk8s.plus27.Deployment), [`org.cdk8s.plus27.Group`](#org.cdk8s.plus27.Group), [`org.cdk8s.plus27.Job`](#org.cdk8s.plus27.Job), [`org.cdk8s.plus27.Pod`](#org.cdk8s.plus27.Pod), [`org.cdk8s.plus27.ServiceAccount`](#org.cdk8s.plus27.ServiceAccount), [`org.cdk8s.plus27.StatefulSet`](#org.cdk8s.plus27.StatefulSet), [`org.cdk8s.plus27.User`](#org.cdk8s.plus27.User), [`org.cdk8s.plus27.Workload`](#org.cdk8s.plus27.Workload), [`org.cdk8s.plus27.IServiceAccount`](#org.cdk8s.plus27.IServiceAccount), [`org.cdk8s.plus27.ISubject`](#org.cdk8s.plus27.ISubject)

Represents an object that can be used as a role binding subject.

#### Methods <a name="Methods"></a>

##### `toSubjectConfiguration` <a name="org.cdk8s.plus27.ISubject.toSubjectConfiguration"></a>

```java
public toSubjectConfiguration()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="org.cdk8s.plus27.ISubject.property.node"></a>

```java
public Node getNode();
```

- *Type:* [`software.constructs.Node`](#software.constructs.Node)

The tree node.

---

## Enums <a name="Enums"></a>

### AzureDiskPersistentVolumeCachingMode <a name="AzureDiskPersistentVolumeCachingMode"></a>

Azure disk caching modes.

#### `NONE` <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode.NONE"></a>

None.

---


#### `READ_ONLY` <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode.READ_ONLY"></a>

ReadOnly.

---


#### `READ_WRITE` <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeCachingMode.READ_WRITE"></a>

ReadWrite.

---


### AzureDiskPersistentVolumeKind <a name="AzureDiskPersistentVolumeKind"></a>

Azure Disk kinds.

#### `SHARED` <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeKind.SHARED"></a>

Multiple blob disks per storage account.

---


#### `DEDICATED` <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeKind.DEDICATED"></a>

Single blob disk per storage account.

---


#### `MANAGED` <a name="org.cdk8s.plus27.AzureDiskPersistentVolumeKind.MANAGED"></a>

Azure managed data disk.

---


### ConcurrencyPolicy <a name="ConcurrencyPolicy"></a>

Concurrency policy for CronJobs.

#### `ALLOW` <a name="org.cdk8s.plus27.ConcurrencyPolicy.ALLOW"></a>

This policy allows to run job concurrently.

---


#### `FORBID` <a name="org.cdk8s.plus27.ConcurrencyPolicy.FORBID"></a>

This policy does not allow to run job concurrently.

It does not let a new job to be scheduled if the previous one is not finished yet.

---


#### `REPLACE` <a name="org.cdk8s.plus27.ConcurrencyPolicy.REPLACE"></a>

This policy replaces the currently running job if a new job is being scheduled.

---


### ConnectionScheme <a name="ConnectionScheme"></a>

#### `HTTP` <a name="org.cdk8s.plus27.ConnectionScheme.HTTP"></a>

Use HTTP request for connecting to host.

---


#### `HTTPS` <a name="org.cdk8s.plus27.ConnectionScheme.HTTPS"></a>

Use HTTPS request for connecting to host.

---


### DnsPolicy <a name="DnsPolicy"></a>

Pod DNS policies.

#### `CLUSTER_FIRST` <a name="org.cdk8s.plus27.DnsPolicy.CLUSTER_FIRST"></a>

Any DNS query that does not match the configured cluster domain suffix, such as "www.kubernetes.io", is forwarded to the upstream nameserver inherited from the node. Cluster administrators may have extra stub-domain and upstream DNS servers configured.

---


#### `CLUSTER_FIRST_WITH_HOST_NET` <a name="org.cdk8s.plus27.DnsPolicy.CLUSTER_FIRST_WITH_HOST_NET"></a>

For Pods running with hostNetwork, you should explicitly set its DNS policy "ClusterFirstWithHostNet".

---


#### `DEFAULT` <a name="org.cdk8s.plus27.DnsPolicy.DEFAULT"></a>

The Pod inherits the name resolution configuration from the node that the pods run on.

---


#### `NONE` <a name="org.cdk8s.plus27.DnsPolicy.NONE"></a>

It allows a Pod to ignore DNS settings from the Kubernetes environment.

All DNS settings are supposed to be provided using the dnsConfig
field in the Pod Spec.

---


### EmptyDirMedium <a name="EmptyDirMedium"></a>

The medium on which to store the volume.

#### `DEFAULT` <a name="org.cdk8s.plus27.EmptyDirMedium.DEFAULT"></a>

The default volume of the backing node.

---


#### `MEMORY` <a name="org.cdk8s.plus27.EmptyDirMedium.MEMORY"></a>

Mount a tmpfs (RAM-backed filesystem) for you instead.

While tmpfs is very
fast, be aware that unlike disks, tmpfs is cleared on node reboot and any
files you write will count against your Container's memory limit.

---


### EnvFieldPaths <a name="EnvFieldPaths"></a>

#### `POD_NAME` <a name="org.cdk8s.plus27.EnvFieldPaths.POD_NAME"></a>

The name of the pod.

---


#### `POD_NAMESPACE` <a name="org.cdk8s.plus27.EnvFieldPaths.POD_NAMESPACE"></a>

The namespace of the pod.

---


#### `POD_UID` <a name="org.cdk8s.plus27.EnvFieldPaths.POD_UID"></a>

The uid of the pod.

---


#### `POD_LABEL` <a name="org.cdk8s.plus27.EnvFieldPaths.POD_LABEL"></a>

The labels of the pod.

---


#### `POD_ANNOTATION` <a name="org.cdk8s.plus27.EnvFieldPaths.POD_ANNOTATION"></a>

The annotations of the pod.

---


#### `POD_IP` <a name="org.cdk8s.plus27.EnvFieldPaths.POD_IP"></a>

The ipAddress of the pod.

---


#### `SERVICE_ACCOUNT_NAME` <a name="org.cdk8s.plus27.EnvFieldPaths.SERVICE_ACCOUNT_NAME"></a>

The service account name of the pod.

---


#### `NODE_NAME` <a name="org.cdk8s.plus27.EnvFieldPaths.NODE_NAME"></a>

The name of the node.

---


#### `NODE_IP` <a name="org.cdk8s.plus27.EnvFieldPaths.NODE_IP"></a>

The ipAddress of the node.

---


#### `POD_IPS` <a name="org.cdk8s.plus27.EnvFieldPaths.POD_IPS"></a>

The ipAddresess of the pod.

---


### FsGroupChangePolicy <a name="FsGroupChangePolicy"></a>

#### `ON_ROOT_MISMATCH` <a name="org.cdk8s.plus27.FsGroupChangePolicy.ON_ROOT_MISMATCH"></a>

Only change permissions and ownership if permission and ownership of root directory does not match with expected permissions of the volume.

This could help shorten the time it takes to change ownership and permission of a volume

---


#### `ALWAYS` <a name="org.cdk8s.plus27.FsGroupChangePolicy.ALWAYS"></a>

Always change permission and ownership of the volume when volume is mounted.

---


### HostPathVolumeType <a name="HostPathVolumeType"></a>

Host path types.

#### `DEFAULT` <a name="org.cdk8s.plus27.HostPathVolumeType.DEFAULT"></a>

Empty string (default) is for backward compatibility, which means that no checks will be performed before mounting the hostPath volume.

---


#### `DIRECTORY_OR_CREATE` <a name="org.cdk8s.plus27.HostPathVolumeType.DIRECTORY_OR_CREATE"></a>

If nothing exists at the given path, an empty directory will be created there as needed with permission set to 0755, having the same group and ownership with Kubelet.

---


#### `DIRECTORY` <a name="org.cdk8s.plus27.HostPathVolumeType.DIRECTORY"></a>

A directory must exist at the given path.

---


#### `FILE_OR_CREATE` <a name="org.cdk8s.plus27.HostPathVolumeType.FILE_OR_CREATE"></a>

If nothing exists at the given path, an empty file will be created there as needed with permission set to 0644, having the same group and ownership with Kubelet.

---


#### `FILE` <a name="org.cdk8s.plus27.HostPathVolumeType.FILE"></a>

A file must exist at the given path.

---


#### `SOCKET` <a name="org.cdk8s.plus27.HostPathVolumeType.SOCKET"></a>

A UNIX socket must exist at the given path.

---


#### `CHAR_DEVICE` <a name="org.cdk8s.plus27.HostPathVolumeType.CHAR_DEVICE"></a>

A character device must exist at the given path.

---


#### `BLOCK_DEVICE` <a name="org.cdk8s.plus27.HostPathVolumeType.BLOCK_DEVICE"></a>

A block device must exist at the given path.

---


### HttpIngressPathType <a name="HttpIngressPathType"></a>

Specify how the path is matched against request paths.

> https://kubernetes.io/docs/concepts/services-networking/ingress/#path-types

#### `PREFIX` <a name="org.cdk8s.plus27.HttpIngressPathType.PREFIX"></a>

Matches the URL path exactly.

---


#### `EXACT` <a name="org.cdk8s.plus27.HttpIngressPathType.EXACT"></a>

Matches based on a URL path prefix split by '/'.

---


#### `IMPLEMENTATION_SPECIFIC` <a name="org.cdk8s.plus27.HttpIngressPathType.IMPLEMENTATION_SPECIFIC"></a>

Matching is specified by the underlying IngressClass.

---


### ImagePullPolicy <a name="ImagePullPolicy"></a>

#### `ALWAYS` <a name="org.cdk8s.plus27.ImagePullPolicy.ALWAYS"></a>

Every time the kubelet launches a container, the kubelet queries the container image registry to resolve the name to an image digest.

If the kubelet has a container image with that exact
digest cached locally, the kubelet uses its cached image; otherwise, the kubelet downloads
(pulls) the image with the resolved digest, and uses that image to launch the container.

Default is Always if ImagePullPolicy is omitted and either the image tag is :latest or
the image tag is omitted.

---


#### `IF_NOT_PRESENT` <a name="org.cdk8s.plus27.ImagePullPolicy.IF_NOT_PRESENT"></a>

The image is pulled only if it is not already present locally.

Default is IfNotPresent if ImagePullPolicy is omitted and the image tag is present but
not :latest

---


#### `NEVER` <a name="org.cdk8s.plus27.ImagePullPolicy.NEVER"></a>

The image is assumed to exist locally.

No attempt is made to pull the image.

---


### MountPropagation <a name="MountPropagation"></a>

#### `NONE` <a name="org.cdk8s.plus27.MountPropagation.NONE"></a>

This volume mount will not receive any subsequent mounts that are mounted to this volume or any of its subdirectories by the host.

In similar
fashion, no mounts created by the Container will be visible on the host.

This is the default mode.

This mode is equal to `private` mount propagation as described in the Linux
kernel documentation

---


#### `HOST_TO_CONTAINER` <a name="org.cdk8s.plus27.MountPropagation.HOST_TO_CONTAINER"></a>

This volume mount will receive all subsequent mounts that are mounted to this volume or any of its subdirectories.

In other words, if the host mounts anything inside the volume mount, the
Container will see it mounted there.

Similarly, if any Pod with Bidirectional mount propagation to the same
volume mounts anything there, the Container with HostToContainer mount
propagation will see it.

This mode is equal to `rslave` mount propagation as described in the Linux
kernel documentation

---


#### `BIDIRECTIONAL` <a name="org.cdk8s.plus27.MountPropagation.BIDIRECTIONAL"></a>

This volume mount behaves the same the HostToContainer mount.

In addition,
all volume mounts created by the Container will be propagated back to the
host and to all Containers of all Pods that use the same volume

A typical use case for this mode is a Pod with a FlexVolume or CSI driver
or a Pod that needs to mount something on the host using a hostPath volume.

This mode is equal to `rshared` mount propagation as described in the Linux
kernel documentation

Caution: Bidirectional mount propagation can be dangerous. It can damage
the host operating system and therefore it is allowed only in privileged
Containers. Familiarity with Linux kernel behavior is strongly recommended.
In addition, any volume mounts created by Containers in Pods must be
destroyed (unmounted) by the Containers on termination.

---


### NetworkPolicyTrafficDefault <a name="NetworkPolicyTrafficDefault"></a>

Default behaviors of network traffic in policies.

#### `DENY` <a name="org.cdk8s.plus27.NetworkPolicyTrafficDefault.DENY"></a>

The policy denies all traffic.

Since rules are additive, additional rules or policies can allow
specific traffic.

---


#### `ALLOW` <a name="org.cdk8s.plus27.NetworkPolicyTrafficDefault.ALLOW"></a>

The policy allows all traffic (either ingress or egress).

Since rules are additive, no additional rule or policies can
subsequently deny the traffic.

---


### NetworkProtocol <a name="NetworkProtocol"></a>

Network protocols.

#### `TCP` <a name="org.cdk8s.plus27.NetworkProtocol.TCP"></a>

TCP.

---


#### `UDP` <a name="org.cdk8s.plus27.NetworkProtocol.UDP"></a>

UDP.

---


#### `SCTP` <a name="org.cdk8s.plus27.NetworkProtocol.SCTP"></a>

SCTP.

---


### PersistentVolumeAccessMode <a name="PersistentVolumeAccessMode"></a>

Access Modes.

#### `READ_WRITE_ONCE` <a name="org.cdk8s.plus27.PersistentVolumeAccessMode.READ_WRITE_ONCE"></a>

The volume can be mounted as read-write by a single node.

ReadWriteOnce access mode still can allow multiple pods to access
the volume when the pods are running on the same node.

---


#### `READ_ONLY_MANY` <a name="org.cdk8s.plus27.PersistentVolumeAccessMode.READ_ONLY_MANY"></a>

The volume can be mounted as read-only by many nodes.

---


#### `READ_WRITE_MANY` <a name="org.cdk8s.plus27.PersistentVolumeAccessMode.READ_WRITE_MANY"></a>

The volume can be mounted as read-write by many nodes.

---


#### `READ_WRITE_ONCE_POD` <a name="org.cdk8s.plus27.PersistentVolumeAccessMode.READ_WRITE_ONCE_POD"></a>

The volume can be mounted as read-write by a single Pod.

Use ReadWriteOncePod access mode if you want to ensure that
only one pod across whole cluster can read that PVC or write to it.
This is only supported for CSI volumes and Kubernetes version 1.22+.

---


### PersistentVolumeMode <a name="PersistentVolumeMode"></a>

Volume Modes.

#### `FILE_SYSTEM` <a name="org.cdk8s.plus27.PersistentVolumeMode.FILE_SYSTEM"></a>

Volume is ounted into Pods into a directory.

If the volume is backed by a block device and the device is empty,
Kubernetes creates a filesystem on the device before mounting it
for the first time.

---


#### `BLOCK` <a name="org.cdk8s.plus27.PersistentVolumeMode.BLOCK"></a>

Use a volume as a raw block device.

Such volume is presented into a Pod as a block device,
without any filesystem on it. This mode is useful to provide a Pod the fastest possible way
to access a volume, without any filesystem layer between the Pod
and the volume. On the other hand, the application running in
the Pod must know how to handle a raw block device

---


### PersistentVolumeReclaimPolicy <a name="PersistentVolumeReclaimPolicy"></a>

Reclaim Policies.

#### `RETAIN` <a name="org.cdk8s.plus27.PersistentVolumeReclaimPolicy.RETAIN"></a>

The Retain reclaim policy allows for manual reclamation of the resource.

When the PersistentVolumeClaim is deleted, the PersistentVolume still exists and the
volume is considered "released". But it is not yet available for another claim
because the previous claimant's data remains on the volume.
An administrator can manually reclaim the volume with the following steps:

1. Delete the PersistentVolume. The associated storage asset in external
   infrastructure (such as an AWS EBS, GCE PD, Azure Disk, or Cinder volume) still exists after the PV is deleted.
2. Manually clean up the data on the associated storage asset accordingly.
3. Manually delete the associated storage asset.

If you want to reuse the same storage asset, create a new PersistentVolume
with the same storage asset definition.

---


#### `DELETE` <a name="org.cdk8s.plus27.PersistentVolumeReclaimPolicy.DELETE"></a>

For volume plugins that support the Delete reclaim policy, deletion removes both the PersistentVolume object from Kubernetes, as well as the associated storage asset in the external infrastructure, such as an AWS EBS, GCE PD, Azure Disk, or Cinder volume.

Volumes that were dynamically provisioned inherit the reclaim policy of their StorageClass, which defaults to Delete.
The administrator should configure the StorageClass according to users' expectations; otherwise,
the PV must be edited or patched after it is created

---


### PodConnectionsIsolation <a name="PodConnectionsIsolation"></a>

Isolation determines which policies are created when allowing connections from a a pod / workload to peers.

#### `POD` <a name="org.cdk8s.plus27.PodConnectionsIsolation.POD"></a>

Only creates network policies that select the pod.

---


#### `PEER` <a name="org.cdk8s.plus27.PodConnectionsIsolation.PEER"></a>

Only creates network policies that select the peer.

---


### PodManagementPolicy <a name="PodManagementPolicy"></a>

Controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down.

The default policy is `OrderedReady`, where pods are created in increasing order
(pod-0, then pod-1, etc) and the controller will wait until each pod is ready before
continuing. When scaling down, the pods are removed in the opposite order.

The alternative policy is `Parallel` which will create pods in parallel to match the
desired scale without waiting, and on scale down will delete all pods at once.

#### `ORDERED_READY` <a name="org.cdk8s.plus27.PodManagementPolicy.ORDERED_READY"></a>

---


#### `PARALLEL` <a name="org.cdk8s.plus27.PodManagementPolicy.PARALLEL"></a>

---


### Protocol <a name="Protocol"></a>

Network protocols.

#### `TCP` <a name="org.cdk8s.plus27.Protocol.TCP"></a>

TCP.

---


#### `UDP` <a name="org.cdk8s.plus27.Protocol.UDP"></a>

UDP.

---


#### `SCTP` <a name="org.cdk8s.plus27.Protocol.SCTP"></a>

SCTP.

---


### ResourceFieldPaths <a name="ResourceFieldPaths"></a>

#### `CPU_LIMIT` <a name="org.cdk8s.plus27.ResourceFieldPaths.CPU_LIMIT"></a>

CPU limit of the container.

---


#### `MEMORY_LIMIT` <a name="org.cdk8s.plus27.ResourceFieldPaths.MEMORY_LIMIT"></a>

Memory limit of the container.

---


#### `CPU_REQUEST` <a name="org.cdk8s.plus27.ResourceFieldPaths.CPU_REQUEST"></a>

CPU request of the container.

---


#### `MEMORY_REQUEST` <a name="org.cdk8s.plus27.ResourceFieldPaths.MEMORY_REQUEST"></a>

Memory request of the container.

---


#### `STORAGE_LIMIT` <a name="org.cdk8s.plus27.ResourceFieldPaths.STORAGE_LIMIT"></a>

Ephemeral storage limit of the container.

---


#### `STORAGE_REQUEST` <a name="org.cdk8s.plus27.ResourceFieldPaths.STORAGE_REQUEST"></a>

Ephemeral storage request of the container.

---


### RestartPolicy <a name="RestartPolicy"></a>

Restart policy for all containers within the pod.

#### `ALWAYS` <a name="org.cdk8s.plus27.RestartPolicy.ALWAYS"></a>

Always restart the pod after it exits.

---


#### `ON_FAILURE` <a name="org.cdk8s.plus27.RestartPolicy.ON_FAILURE"></a>

Only restart if the pod exits with a non-zero exit code.

---


#### `NEVER` <a name="org.cdk8s.plus27.RestartPolicy.NEVER"></a>

Never restart the pod.

---


### ScalingStrategy <a name="ScalingStrategy"></a>

#### `MAX_CHANGE` <a name="org.cdk8s.plus27.ScalingStrategy.MAX_CHANGE"></a>

Use the policy that provisions the most changes.

---


#### `MIN_CHANGE` <a name="org.cdk8s.plus27.ScalingStrategy.MIN_CHANGE"></a>

Use the policy that provisions the least amount of changes.

---


#### ~~`DISABLED`~~ <a name="org.cdk8s.plus27.ScalingStrategy.DISABLED"></a>

- *Deprecated:* - Omit the ScalingRule instead

Disables scaling in this direction.

---


### ServiceType <a name="ServiceType"></a>

For some parts of your application (for example, frontends) you may want to expose a Service onto an external IP address, that's outside of your cluster.

Kubernetes ServiceTypes allow you to specify what kind of Service you want.
The default is ClusterIP.

#### `CLUSTER_IP` <a name="org.cdk8s.plus27.ServiceType.CLUSTER_IP"></a>

Exposes the Service on a cluster-internal IP.

Choosing this value makes the Service only reachable from within the cluster.
This is the default ServiceType

---


#### `NODE_PORT` <a name="org.cdk8s.plus27.ServiceType.NODE_PORT"></a>

Exposes the Service on each Node's IP at a static port (the NodePort).

A ClusterIP Service, to which the NodePort Service routes, is automatically created.
You'll be able to contact the NodePort Service, from outside the cluster,
by requesting <NodeIP>:<NodePort>.

---


#### `LOAD_BALANCER` <a name="org.cdk8s.plus27.ServiceType.LOAD_BALANCER"></a>

Exposes the Service externally using a cloud provider's load balancer.

NodePort and ClusterIP Services, to which the external load balancer routes,
are automatically created.

---


#### `EXTERNAL_NAME` <a name="org.cdk8s.plus27.ServiceType.EXTERNAL_NAME"></a>

Maps the Service to the contents of the externalName field (e.g. foo.bar.example.com), by returning a CNAME record with its value. No proxying of any kind is set up.

> Note: You need either kube-dns version 1.7 or CoreDNS version 0.0.8 or higher to use the ExternalName type.

---


### TaintEffect <a name="TaintEffect"></a>

Taint effects.

#### `NO_SCHEDULE` <a name="org.cdk8s.plus27.TaintEffect.NO_SCHEDULE"></a>

This means that no pod will be able to schedule onto the node unless it has a matching toleration.

---


#### `PREFER_NO_SCHEDULE` <a name="org.cdk8s.plus27.TaintEffect.PREFER_NO_SCHEDULE"></a>

This is a "preference" or "soft" version of `NO_SCHEDULE` -- the system will try to avoid placing a pod that does not tolerate the taint on the node, but it is not required.

---


#### `NO_EXECUTE` <a name="org.cdk8s.plus27.TaintEffect.NO_EXECUTE"></a>

This affects pods that are already running on the node as follows:.

* Pods that do not tolerate the taint are evicted immediately.
* Pods that tolerate the taint without specifying `duration` remain bound forever.
* Pods that tolerate the taint with a specified `duration` remain bound for
  the specified amount of time.

---

