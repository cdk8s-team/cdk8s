# cdk8s-plus-27 (TypeScript) <a name="API Reference"></a>

## Constructs <a name="Constructs"></a>

### AbstractPod <a name="cdk8s-plus-27.AbstractPod"></a>

- *Implements:* [`cdk8s-plus-27.IPodSelector`](#cdk8s-plus-27.IPodSelector), [`cdk8s-plus-27.INetworkPolicyPeer`](#cdk8s-plus-27.INetworkPolicyPeer), [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

#### Initializers <a name="cdk8s-plus-27.AbstractPod.Initializer"></a>

```typescript
import { AbstractPod } from 'cdk8s-plus-27'

new AbstractPod(scope: Construct, id: string, props?: AbstractPodProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPod.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.AbstractPodProps`](#cdk8s-plus-27.AbstractPodProps)

---

#### Methods <a name="Methods"></a>

##### `addContainer` <a name="cdk8s-plus-27.AbstractPod.addContainer"></a>

```typescript
public addContainer(cont: ContainerProps)
```

###### `cont`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.parameter.cont"></a>

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)

---

##### `addHostAlias` <a name="cdk8s-plus-27.AbstractPod.addHostAlias"></a>

```typescript
public addHostAlias(hostAlias: HostAlias)
```

###### `hostAlias`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.parameter.hostAlias"></a>

- *Type:* [`cdk8s-plus-27.HostAlias`](#cdk8s-plus-27.HostAlias)

---

##### `addInitContainer` <a name="cdk8s-plus-27.AbstractPod.addInitContainer"></a>

```typescript
public addInitContainer(cont: ContainerProps)
```

###### `cont`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.parameter.cont"></a>

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)

---

##### `addVolume` <a name="cdk8s-plus-27.AbstractPod.addVolume"></a>

```typescript
public addVolume(vol: Volume)
```

###### `vol`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.parameter.vol"></a>

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)

---

##### `attachContainer` <a name="cdk8s-plus-27.AbstractPod.attachContainer"></a>

```typescript
public attachContainer(cont: Container)
```

###### `cont`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.parameter.cont"></a>

- *Type:* [`cdk8s-plus-27.Container`](#cdk8s-plus-27.Container)

---

##### `toNetworkPolicyPeerConfig` <a name="cdk8s-plus-27.AbstractPod.toNetworkPolicyPeerConfig"></a>

```typescript
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="cdk8s-plus-27.AbstractPod.toPodSelector"></a>

```typescript
public toPodSelector()
```

##### `toPodSelectorConfig` <a name="cdk8s-plus-27.AbstractPod.toPodSelectorConfig"></a>

```typescript
public toPodSelectorConfig()
```

##### `toSubjectConfiguration` <a name="cdk8s-plus-27.AbstractPod.toSubjectConfiguration"></a>

```typescript
public toSubjectConfiguration()
```


#### Properties <a name="Properties"></a>

##### `automountServiceAccountToken`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.property.automountServiceAccountToken"></a>

```typescript
public readonly automountServiceAccountToken: boolean;
```

- *Type:* `boolean`

---

##### `containers`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.property.containers"></a>

```typescript
public readonly containers: Container[];
```

- *Type:* [`cdk8s-plus-27.Container`](#cdk8s-plus-27.Container)[]

---

##### `dns`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.property.dns"></a>

```typescript
public readonly dns: PodDns;
```

- *Type:* [`cdk8s-plus-27.PodDns`](#cdk8s-plus-27.PodDns)

---

##### `hostAliases`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.property.hostAliases"></a>

```typescript
public readonly hostAliases: HostAlias[];
```

- *Type:* [`cdk8s-plus-27.HostAlias`](#cdk8s-plus-27.HostAlias)[]

---

##### `initContainers`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.property.initContainers"></a>

```typescript
public readonly initContainers: Container[];
```

- *Type:* [`cdk8s-plus-27.Container`](#cdk8s-plus-27.Container)[]

---

##### `podMetadata`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.property.podMetadata"></a>

```typescript
public readonly podMetadata: ApiObjectMetadataDefinition;
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

---

##### `securityContext`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.property.securityContext"></a>

```typescript
public readonly securityContext: PodSecurityContext;
```

- *Type:* [`cdk8s-plus-27.PodSecurityContext`](#cdk8s-plus-27.PodSecurityContext)

---

##### `volumes`<sup>Required</sup> <a name="cdk8s-plus-27.AbstractPod.property.volumes"></a>

```typescript
public readonly volumes: Volume[];
```

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)[]

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPod.property.dockerRegistryAuth"></a>

```typescript
public readonly dockerRegistryAuth: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)

---

##### `hostNetwork`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPod.property.hostNetwork"></a>

```typescript
public readonly hostNetwork: boolean;
```

- *Type:* `boolean`

---

##### `restartPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPod.property.restartPolicy"></a>

```typescript
public readonly restartPolicy: RestartPolicy;
```

- *Type:* [`cdk8s-plus-27.RestartPolicy`](#cdk8s-plus-27.RestartPolicy)

---

##### `serviceAccount`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPod.property.serviceAccount"></a>

```typescript
public readonly serviceAccount: IServiceAccount;
```

- *Type:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)

---

##### `terminationGracePeriod`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPod.property.terminationGracePeriod"></a>

```typescript
public readonly terminationGracePeriod: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

---


### AwsElasticBlockStorePersistentVolume <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolume"></a>

Represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

#### Initializers <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolume.Initializer"></a>

```typescript
import { AwsElasticBlockStorePersistentVolume } from 'cdk8s-plus-27'

new AwsElasticBlockStorePersistentVolume(scope: Construct, id: string, props: AwsElasticBlockStorePersistentVolumeProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolume.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolume.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps`](#cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps)

---



#### Properties <a name="Properties"></a>

##### `fsType`<sup>Required</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolume.property.fsType"></a>

```typescript
public readonly fsType: string;
```

- *Type:* `string`

File system type of this volume.

---

##### `readOnly`<sup>Required</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolume.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`

Whether or not it is mounted as a read-only volume.

---

##### `volumeId`<sup>Required</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolume.property.volumeId"></a>

```typescript
public readonly volumeId: string;
```

- *Type:* `string`

Volume id of this volume.

---

##### `partition`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolume.property.partition"></a>

```typescript
public readonly partition: number;
```

- *Type:* `number`

Partition of this volume.

---


### AzureDiskPersistentVolume <a name="cdk8s-plus-27.AzureDiskPersistentVolume"></a>

AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.

#### Initializers <a name="cdk8s-plus-27.AzureDiskPersistentVolume.Initializer"></a>

```typescript
import { AzureDiskPersistentVolume } from 'cdk8s-plus-27'

new AzureDiskPersistentVolume(scope: Construct, id: string, props: AzureDiskPersistentVolumeProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolume.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolume.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.AzureDiskPersistentVolumeProps`](#cdk8s-plus-27.AzureDiskPersistentVolumeProps)

---



#### Properties <a name="Properties"></a>

##### `azureKind`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolume.property.azureKind"></a>

```typescript
public readonly azureKind: AzureDiskPersistentVolumeKind;
```

- *Type:* [`cdk8s-plus-27.AzureDiskPersistentVolumeKind`](#cdk8s-plus-27.AzureDiskPersistentVolumeKind)

Azure kind of this volume.

---

##### `cachingMode`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolume.property.cachingMode"></a>

```typescript
public readonly cachingMode: AzureDiskPersistentVolumeCachingMode;
```

- *Type:* [`cdk8s-plus-27.AzureDiskPersistentVolumeCachingMode`](#cdk8s-plus-27.AzureDiskPersistentVolumeCachingMode)

Caching mode of this volume.

---

##### `diskName`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolume.property.diskName"></a>

```typescript
public readonly diskName: string;
```

- *Type:* `string`

Disk name of this volume.

---

##### `diskUri`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolume.property.diskUri"></a>

```typescript
public readonly diskUri: string;
```

- *Type:* `string`

Disk URI of this volume.

---

##### `fsType`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolume.property.fsType"></a>

```typescript
public readonly fsType: string;
```

- *Type:* `string`

File system type of this volume.

---

##### `readOnly`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolume.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`

Whether or not it is mounted as a read-only volume.

---


### BasicAuthSecret <a name="cdk8s-plus-27.BasicAuthSecret"></a>

Create a secret for basic authentication.

> https://kubernetes.io/docs/concepts/configuration/secret/#basic-authentication-secret

#### Initializers <a name="cdk8s-plus-27.BasicAuthSecret.Initializer"></a>

```typescript
import { BasicAuthSecret } from 'cdk8s-plus-27'

new BasicAuthSecret(scope: Construct, id: string, props: BasicAuthSecretProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.BasicAuthSecret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.BasicAuthSecret.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.BasicAuthSecret.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.BasicAuthSecretProps`](#cdk8s-plus-27.BasicAuthSecretProps)

---





### ClusterRole <a name="cdk8s-plus-27.ClusterRole"></a>

- *Implements:* [`cdk8s-plus-27.IClusterRole`](#cdk8s-plus-27.IClusterRole), [`cdk8s-plus-27.IRole`](#cdk8s-plus-27.IRole)

ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.

#### Initializers <a name="cdk8s-plus-27.ClusterRole.Initializer"></a>

```typescript
import { ClusterRole } from 'cdk8s-plus-27'

new ClusterRole(scope: Construct, id: string, props?: ClusterRoleProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.ClusterRoleProps`](#cdk8s-plus-27.ClusterRoleProps)

---

#### Methods <a name="Methods"></a>

##### `aggregate` <a name="cdk8s-plus-27.ClusterRole.aggregate"></a>

```typescript
public aggregate(key: string, value: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.key"></a>

- *Type:* `string`

---

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.value"></a>

- *Type:* `string`

---

##### `allow` <a name="cdk8s-plus-27.ClusterRole.allow"></a>

```typescript
public allow(verbs: string[], endpoints: IApiEndpoint)
```

###### `verbs`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.verbs"></a>

- *Type:* `string`[]

---

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The endpoints(s) to apply to.

---

##### `allowCreate` <a name="cdk8s-plus-27.ClusterRole.allowCreate"></a>

```typescript
public allowCreate(endpoints: IApiEndpoint)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowDelete` <a name="cdk8s-plus-27.ClusterRole.allowDelete"></a>

```typescript
public allowDelete(endpoints: IApiEndpoint)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowDeleteCollection` <a name="cdk8s-plus-27.ClusterRole.allowDeleteCollection"></a>

```typescript
public allowDeleteCollection(endpoints: IApiEndpoint)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowGet` <a name="cdk8s-plus-27.ClusterRole.allowGet"></a>

```typescript
public allowGet(endpoints: IApiEndpoint)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowList` <a name="cdk8s-plus-27.ClusterRole.allowList"></a>

```typescript
public allowList(endpoints: IApiEndpoint)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowPatch` <a name="cdk8s-plus-27.ClusterRole.allowPatch"></a>

```typescript
public allowPatch(endpoints: IApiEndpoint)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowRead` <a name="cdk8s-plus-27.ClusterRole.allowRead"></a>

```typescript
public allowRead(endpoints: IApiEndpoint)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowReadWrite` <a name="cdk8s-plus-27.ClusterRole.allowReadWrite"></a>

```typescript
public allowReadWrite(endpoints: IApiEndpoint)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowUpdate` <a name="cdk8s-plus-27.ClusterRole.allowUpdate"></a>

```typescript
public allowUpdate(endpoints: IApiEndpoint)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allowWatch` <a name="cdk8s-plus-27.ClusterRole.allowWatch"></a>

```typescript
public allowWatch(endpoints: IApiEndpoint)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

The resource(s) to apply to.

---

##### `bind` <a name="cdk8s-plus-27.ClusterRole.bind"></a>

```typescript
public bind(subjects: ISubject)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.subjects"></a>

- *Type:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

a list of subjects to bind to.

---

##### `bindInNamespace` <a name="cdk8s-plus-27.ClusterRole.bindInNamespace"></a>

```typescript
public bindInNamespace(namespace: string, subjects: ISubject)
```

###### `namespace`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.namespace"></a>

- *Type:* `string`

the namespace to limit permissions to.

---

###### `subjects`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.subjects"></a>

- *Type:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

a list of subjects to bind to.

---

##### `combine` <a name="cdk8s-plus-27.ClusterRole.combine"></a>

```typescript
public combine(rol: ClusterRole)
```

###### `rol`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.rol"></a>

- *Type:* [`cdk8s-plus-27.ClusterRole`](#cdk8s-plus-27.ClusterRole)

---

#### Static Functions <a name="Static Functions"></a>

##### `fromClusterRoleName` <a name="cdk8s-plus-27.ClusterRole.fromClusterRoleName"></a>

```typescript
import { ClusterRole } from 'cdk8s-plus-27'

ClusterRole.fromClusterRoleName(scope: Construct, id: string, name: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.id"></a>

- *Type:* `string`

---

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.parameter.name"></a>

- *Type:* `string`

---

#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `rules`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRole.property.rules"></a>

```typescript
public readonly rules: ClusterRolePolicyRule[];
```

- *Type:* [`cdk8s-plus-27.ClusterRolePolicyRule`](#cdk8s-plus-27.ClusterRolePolicyRule)[]

Rules associaated with this Role.

Returns a copy, use `allow` to add rules.

---


### ClusterRoleBinding <a name="cdk8s-plus-27.ClusterRoleBinding"></a>

A ClusterRoleBinding grants permissions cluster-wide to a user or set of users.

#### Initializers <a name="cdk8s-plus-27.ClusterRoleBinding.Initializer"></a>

```typescript
import { ClusterRoleBinding } from 'cdk8s-plus-27'

new ClusterRoleBinding(scope: Construct, id: string, props: ClusterRoleBindingProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRoleBinding.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRoleBinding.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRoleBinding.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.ClusterRoleBindingProps`](#cdk8s-plus-27.ClusterRoleBindingProps)

---

#### Methods <a name="Methods"></a>

##### `addSubjects` <a name="cdk8s-plus-27.ClusterRoleBinding.addSubjects"></a>

```typescript
public addSubjects(subjects: ISubject)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRoleBinding.parameter.subjects"></a>

- *Type:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

The subjects to add.

---


#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRoleBinding.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `role`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRoleBinding.property.role"></a>

```typescript
public readonly role: IClusterRole;
```

- *Type:* [`cdk8s-plus-27.IClusterRole`](#cdk8s-plus-27.IClusterRole)

---

##### `subjects`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRoleBinding.property.subjects"></a>

```typescript
public readonly subjects: ISubject[];
```

- *Type:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)[]

---


### ConfigMap <a name="cdk8s-plus-27.ConfigMap"></a>

- *Implements:* [`cdk8s-plus-27.IConfigMap`](#cdk8s-plus-27.IConfigMap)

ConfigMap holds configuration data for pods to consume.

#### Initializers <a name="cdk8s-plus-27.ConfigMap.Initializer"></a>

```typescript
import { ConfigMap } from 'cdk8s-plus-27'

new ConfigMap(scope: Construct, id: string, props?: ConfigMapProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.ConfigMapProps`](#cdk8s-plus-27.ConfigMapProps)

---

#### Methods <a name="Methods"></a>

##### `addBinaryData` <a name="cdk8s-plus-27.ConfigMap.addBinaryData"></a>

```typescript
public addBinaryData(key: string, value: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.key"></a>

- *Type:* `string`

The key.

---

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.value"></a>

- *Type:* `string`

The value.

---

##### `addData` <a name="cdk8s-plus-27.ConfigMap.addData"></a>

```typescript
public addData(key: string, value: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.key"></a>

- *Type:* `string`

The key.

---

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.value"></a>

- *Type:* `string`

The value.

---

##### `addDirectory` <a name="cdk8s-plus-27.ConfigMap.addDirectory"></a>

```typescript
public addDirectory(localDir: string, options?: AddDirectoryOptions)
```

###### `localDir`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.localDir"></a>

- *Type:* `string`

A path to a local directory.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.AddDirectoryOptions`](#cdk8s-plus-27.AddDirectoryOptions)

Options.

---

##### `addFile` <a name="cdk8s-plus-27.ConfigMap.addFile"></a>

```typescript
public addFile(localFile: string, key?: string)
```

###### `localFile`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.localFile"></a>

- *Type:* `string`

The path to the local file.

---

###### `key`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.key"></a>

- *Type:* `string`

The ConfigMap key (default to the file name).

---

#### Static Functions <a name="Static Functions"></a>

##### `fromConfigMapName` <a name="cdk8s-plus-27.ConfigMap.fromConfigMapName"></a>

```typescript
import { ConfigMap } from 'cdk8s-plus-27'

ConfigMap.fromConfigMapName(scope: Construct, id: string, name: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.id"></a>

- *Type:* `string`

---

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.parameter.name"></a>

- *Type:* `string`

---

#### Properties <a name="Properties"></a>

##### `binaryData`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.property.binaryData"></a>

```typescript
public readonly binaryData: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}

The binary data associated with this config map.

Returns a copy. To add data records, use `addBinaryData()` or `addData()`.

---

##### `data`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.property.data"></a>

```typescript
public readonly data: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}

The data associated with this config map.

Returns an copy. To add data records, use `addData()` or `addBinaryData()`.

---

##### `immutable`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.property.immutable"></a>

```typescript
public readonly immutable: boolean;
```

- *Type:* `boolean`

Whether or not this config map is immutable.

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.ConfigMap.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---


### CronJob <a name="cdk8s-plus-27.CronJob"></a>

A CronJob is responsible for creating a Job and scheduling it based on provided cron schedule.

This helps running Jobs in a recurring manner.

#### Initializers <a name="cdk8s-plus-27.CronJob.Initializer"></a>

```typescript
import { CronJob } from 'cdk8s-plus-27'

new CronJob(scope: Construct, id: string, props: CronJobProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.CronJob.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.CronJob.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.CronJob.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.CronJobProps`](#cdk8s-plus-27.CronJobProps)

---



#### Properties <a name="Properties"></a>

##### `concurrencyPolicy`<sup>Required</sup> <a name="cdk8s-plus-27.CronJob.property.concurrencyPolicy"></a>

```typescript
public readonly concurrencyPolicy: string;
```

- *Type:* `string`

The policy used by this cron job to determine the concurrency mode in which to schedule jobs.

---

##### `failedJobsRetained`<sup>Required</sup> <a name="cdk8s-plus-27.CronJob.property.failedJobsRetained"></a>

```typescript
public readonly failedJobsRetained: number;
```

- *Type:* `number`

The number of failed jobs retained by this cron job.

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.CronJob.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

Represents the resource type.

---

##### `schedule`<sup>Required</sup> <a name="cdk8s-plus-27.CronJob.property.schedule"></a>

```typescript
public readonly schedule: Cron;
```

- *Type:* [`cdk8s.Cron`](#cdk8s.Cron)

The schedule this cron job is scheduled to run in.

---

##### `startingDeadline`<sup>Required</sup> <a name="cdk8s-plus-27.CronJob.property.startingDeadline"></a>

```typescript
public readonly startingDeadline: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

The time by which the running cron job needs to schedule the next job execution.

The job is considered as failed if it misses this deadline.

---

##### `successfulJobsRetained`<sup>Required</sup> <a name="cdk8s-plus-27.CronJob.property.successfulJobsRetained"></a>

```typescript
public readonly successfulJobsRetained: number;
```

- *Type:* `number`

The number of successful jobs retained by this cron job.

---

##### `suspend`<sup>Required</sup> <a name="cdk8s-plus-27.CronJob.property.suspend"></a>

```typescript
public readonly suspend: boolean;
```

- *Type:* `boolean`

Whether or not the cron job is currently suspended or not.

---

##### `timeZone`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJob.property.timeZone"></a>

```typescript
public readonly timeZone: string;
```

- *Type:* `string`

The timezone which this cron job would follow to schedule jobs.

---


### DaemonSet <a name="cdk8s-plus-27.DaemonSet"></a>

A DaemonSet ensures that all (or some) Nodes run a copy of a Pod.

As nodes are added to the cluster, Pods are added to them.
As nodes are removed from the cluster, those Pods are garbage collected.
Deleting a DaemonSet will clean up the Pods it created.

Some typical uses of a DaemonSet are:

- running a cluster storage daemon on every node
- running a logs collection daemon on every node
- running a node monitoring daemon on every node

In a simple case, one DaemonSet, covering all nodes, would be used for each type of daemon.
A more complex setup might use multiple DaemonSets for a single type of daemon,
but with different flags and/or different memory and cpu requests for different hardware types.

#### Initializers <a name="cdk8s-plus-27.DaemonSet.Initializer"></a>

```typescript
import { DaemonSet } from 'cdk8s-plus-27'

new DaemonSet(scope: Construct, id: string, props?: DaemonSetProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.DaemonSet.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.DaemonSet.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSet.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.DaemonSetProps`](#cdk8s-plus-27.DaemonSetProps)

---



#### Properties <a name="Properties"></a>

##### `minReadySeconds`<sup>Required</sup> <a name="cdk8s-plus-27.DaemonSet.property.minReadySeconds"></a>

```typescript
public readonly minReadySeconds: number;
```

- *Type:* `number`

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.DaemonSet.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---


### Deployment <a name="cdk8s-plus-27.Deployment"></a>

- *Implements:* [`cdk8s-plus-27.IScalable`](#cdk8s-plus-27.IScalable)

A Deployment provides declarative updates for Pods and ReplicaSets.

You describe a desired state in a Deployment, and the Deployment Controller changes the actual
state to the desired state at a controlled rate. You can define Deployments to create new ReplicaSets, or to remove
existing Deployments and adopt all their resources with new Deployments.

> Note: Do not manage ReplicaSets owned by a Deployment. Consider opening an issue in the main Kubernetes repository if your use case is not covered below.

Use Case

The following are typical use cases for Deployments:

- Create a Deployment to rollout a ReplicaSet. The ReplicaSet creates Pods in the background.
   Check the status of the rollout to see if it succeeds or not.
- Declare the new state of the Pods by updating the PodTemplateSpec of the Deployment.
   A new ReplicaSet is created and the Deployment manages moving the Pods from the old ReplicaSet to the new one at a controlled rate.
   Each new ReplicaSet updates the revision of the Deployment.
- Rollback to an earlier Deployment revision if the current state of the Deployment is not stable.
   Each rollback updates the revision of the Deployment.
- Scale up the Deployment to facilitate more load.
- Pause the Deployment to apply multiple fixes to its PodTemplateSpec and then resume it to start a new rollout.
- Use the status of the Deployment as an indicator that a rollout has stuck.
- Clean up older ReplicaSets that you don't need anymore.

#### Initializers <a name="cdk8s-plus-27.Deployment.Initializer"></a>

```typescript
import { Deployment } from 'cdk8s-plus-27'

new Deployment(scope: Construct, id: string, props?: DeploymentProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Deployment.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Deployment.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.Deployment.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.DeploymentProps`](#cdk8s-plus-27.DeploymentProps)

---

#### Methods <a name="Methods"></a>

##### `exposeViaIngress` <a name="cdk8s-plus-27.Deployment.exposeViaIngress"></a>

```typescript
public exposeViaIngress(path: string, options?: ExposeDeploymentViaIngressOptions)
```

###### `path`<sup>Required</sup> <a name="cdk8s-plus-27.Deployment.parameter.path"></a>

- *Type:* `string`

The ingress path to register under.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Deployment.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.ExposeDeploymentViaIngressOptions`](#cdk8s-plus-27.ExposeDeploymentViaIngressOptions)

Additional options.

---

##### `exposeViaService` <a name="cdk8s-plus-27.Deployment.exposeViaService"></a>

```typescript
public exposeViaService(options?: DeploymentExposeViaServiceOptions)
```

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Deployment.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.DeploymentExposeViaServiceOptions`](#cdk8s-plus-27.DeploymentExposeViaServiceOptions)

Options to determine details of the service and port exposed.

---

##### `markHasAutoscaler` <a name="cdk8s-plus-27.Deployment.markHasAutoscaler"></a>

```typescript
public markHasAutoscaler()
```

##### `toScalingTarget` <a name="cdk8s-plus-27.Deployment.toScalingTarget"></a>

```typescript
public toScalingTarget()
```


#### Properties <a name="Properties"></a>

##### `minReady`<sup>Required</sup> <a name="cdk8s-plus-27.Deployment.property.minReady"></a>

```typescript
public readonly minReady: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---

##### `progressDeadline`<sup>Required</sup> <a name="cdk8s-plus-27.Deployment.property.progressDeadline"></a>

```typescript
public readonly progressDeadline: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

The maximum duration for a deployment to make progress before it is considered to be failed.

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.Deployment.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `strategy`<sup>Required</sup> <a name="cdk8s-plus-27.Deployment.property.strategy"></a>

```typescript
public readonly strategy: DeploymentStrategy;
```

- *Type:* [`cdk8s-plus-27.DeploymentStrategy`](#cdk8s-plus-27.DeploymentStrategy)

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s-plus-27.Deployment.property.replicas"></a>

```typescript
public readonly replicas: number;
```

- *Type:* `number`

Number of desired pods.

---

##### `hasAutoscaler`<sup>Required</sup> <a name="cdk8s-plus-27.Deployment.property.hasAutoscaler"></a>

```typescript
public readonly hasAutoscaler: boolean;
```

- *Type:* `boolean`

If this is a target of an autoscaler.

---


### DockerConfigSecret <a name="cdk8s-plus-27.DockerConfigSecret"></a>

Create a secret for storing credentials for accessing a container image registry.

> https://kubernetes.io/docs/concepts/configuration/secret/#docker-config-secrets

#### Initializers <a name="cdk8s-plus-27.DockerConfigSecret.Initializer"></a>

```typescript
import { DockerConfigSecret } from 'cdk8s-plus-27'

new DockerConfigSecret(scope: Construct, id: string, props: DockerConfigSecretProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.DockerConfigSecret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.DockerConfigSecret.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.DockerConfigSecret.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.DockerConfigSecretProps`](#cdk8s-plus-27.DockerConfigSecretProps)

---





### GCEPersistentDiskPersistentVolume <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolume"></a>

GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

Provisioned by an admin.

> https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

#### Initializers <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolume.Initializer"></a>

```typescript
import { GCEPersistentDiskPersistentVolume } from 'cdk8s-plus-27'

new GCEPersistentDiskPersistentVolume(scope: Construct, id: string, props: GCEPersistentDiskPersistentVolumeProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolume.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolume.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps`](#cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps)

---



#### Properties <a name="Properties"></a>

##### `fsType`<sup>Required</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolume.property.fsType"></a>

```typescript
public readonly fsType: string;
```

- *Type:* `string`

File system type of this volume.

---

##### `pdName`<sup>Required</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolume.property.pdName"></a>

```typescript
public readonly pdName: string;
```

- *Type:* `string`

PD resource in GCE of this volume.

---

##### `readOnly`<sup>Required</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolume.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`

Whether or not it is mounted as a read-only volume.

---

##### `partition`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolume.property.partition"></a>

```typescript
public readonly partition: number;
```

- *Type:* `number`

Partition of this volume.

---


### Group <a name="cdk8s-plus-27.Group"></a>

- *Implements:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

Represents a group.

#### Methods <a name="Methods"></a>

##### `toSubjectConfiguration` <a name="cdk8s-plus-27.Group.toSubjectConfiguration"></a>

```typescript
public toSubjectConfiguration()
```

#### Static Functions <a name="Static Functions"></a>

##### `fromName` <a name="cdk8s-plus-27.Group.fromName"></a>

```typescript
import { Group } from 'cdk8s-plus-27'

Group.fromName(scope: Construct, id: string, name: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Group.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Group.parameter.id"></a>

- *Type:* `string`

---

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Group.parameter.name"></a>

- *Type:* `string`

---

#### Properties <a name="Properties"></a>

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.Group.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Group.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

---

##### `apiGroup`<sup>Optional</sup> <a name="cdk8s-plus-27.Group.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

---


### HorizontalPodAutoscaler <a name="cdk8s-plus-27.HorizontalPodAutoscaler"></a>

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

#### Initializers <a name="cdk8s-plus-27.HorizontalPodAutoscaler.Initializer"></a>

```typescript
import { HorizontalPodAutoscaler } from 'cdk8s-plus-27'

new HorizontalPodAutoscaler(scope: Construct, id: string, props: HorizontalPodAutoscalerProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscaler.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscaler.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscaler.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.HorizontalPodAutoscalerProps`](#cdk8s-plus-27.HorizontalPodAutoscalerProps)

---



#### Properties <a name="Properties"></a>

##### `maxReplicas`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscaler.property.maxReplicas"></a>

```typescript
public readonly maxReplicas: number;
```

- *Type:* `number`

The maximum number of replicas that can be scaled up to.

---

##### `minReplicas`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscaler.property.minReplicas"></a>

```typescript
public readonly minReplicas: number;
```

- *Type:* `number`

The minimum number of replicas that can be scaled down to.

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscaler.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `scaleDown`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscaler.property.scaleDown"></a>

```typescript
public readonly scaleDown: ScalingRules;
```

- *Type:* [`cdk8s-plus-27.ScalingRules`](#cdk8s-plus-27.ScalingRules)

The scaling behavior when scaling down.

---

##### `scaleUp`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscaler.property.scaleUp"></a>

```typescript
public readonly scaleUp: ScalingRules;
```

- *Type:* [`cdk8s-plus-27.ScalingRules`](#cdk8s-plus-27.ScalingRules)

The scaling behavior when scaling up.

---

##### `target`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscaler.property.target"></a>

```typescript
public readonly target: IScalable;
```

- *Type:* [`cdk8s-plus-27.IScalable`](#cdk8s-plus-27.IScalable)

The workload to scale up or down.

---

##### `metrics`<sup>Optional</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscaler.property.metrics"></a>

```typescript
public readonly metrics: Metric[];
```

- *Type:* [`cdk8s-plus-27.Metric`](#cdk8s-plus-27.Metric)[]

The metric conditions that trigger a scale up or scale down.

---


### Ingress <a name="cdk8s-plus-27.Ingress"></a>

Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend.

An Ingress can be configured to give services
externally-reachable urls, load balance traffic, terminate SSL, offer name
based virtual hosting etc.

#### Initializers <a name="cdk8s-plus-27.Ingress.Initializer"></a>

```typescript
import { Ingress } from 'cdk8s-plus-27'

new Ingress(scope: Construct, id: string, props?: IngressProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.Ingress.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.IngressProps`](#cdk8s-plus-27.IngressProps)

---

#### Methods <a name="Methods"></a>

##### `addDefaultBackend` <a name="cdk8s-plus-27.Ingress.addDefaultBackend"></a>

```typescript
public addDefaultBackend(backend: IngressBackend)
```

###### `backend`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s-plus-27.IngressBackend`](#cdk8s-plus-27.IngressBackend)

The backend to use for requests that do not match any rule.

---

##### `addHostDefaultBackend` <a name="cdk8s-plus-27.Ingress.addHostDefaultBackend"></a>

```typescript
public addHostDefaultBackend(host: string, backend: IngressBackend)
```

###### `host`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.host"></a>

- *Type:* `string`

The host name to match.

---

###### `backend`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s-plus-27.IngressBackend`](#cdk8s-plus-27.IngressBackend)

The backend to route to.

---

##### `addHostRule` <a name="cdk8s-plus-27.Ingress.addHostRule"></a>

```typescript
public addHostRule(host: string, path: string, backend: IngressBackend, pathType?: HttpIngressPathType)
```

###### `host`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.host"></a>

- *Type:* `string`

The host name.

---

###### `path`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.path"></a>

- *Type:* `string`

The HTTP path.

---

###### `backend`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s-plus-27.IngressBackend`](#cdk8s-plus-27.IngressBackend)

The backend to route requests to.

---

###### `pathType`<sup>Optional</sup> <a name="cdk8s-plus-27.Ingress.parameter.pathType"></a>

- *Type:* [`cdk8s-plus-27.HttpIngressPathType`](#cdk8s-plus-27.HttpIngressPathType)

How the path is matched against request paths.

---

##### `addRule` <a name="cdk8s-plus-27.Ingress.addRule"></a>

```typescript
public addRule(path: string, backend: IngressBackend, pathType?: HttpIngressPathType)
```

###### `path`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.path"></a>

- *Type:* `string`

The HTTP path.

---

###### `backend`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s-plus-27.IngressBackend`](#cdk8s-plus-27.IngressBackend)

The backend to route requests to.

---

###### `pathType`<sup>Optional</sup> <a name="cdk8s-plus-27.Ingress.parameter.pathType"></a>

- *Type:* [`cdk8s-plus-27.HttpIngressPathType`](#cdk8s-plus-27.HttpIngressPathType)

How the path is matched against request paths.

---

##### `addRules` <a name="cdk8s-plus-27.Ingress.addRules"></a>

```typescript
public addRules(rules: IngressRule)
```

###### `rules`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.rules"></a>

- *Type:* [`cdk8s-plus-27.IngressRule`](#cdk8s-plus-27.IngressRule)

The rules to add.

---

##### `addTls` <a name="cdk8s-plus-27.Ingress.addTls"></a>

```typescript
public addTls(tls: IngressTls[])
```

###### `tls`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.parameter.tls"></a>

- *Type:* [`cdk8s-plus-27.IngressTls`](#cdk8s-plus-27.IngressTls)[]

---


#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.Ingress.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---


### Job <a name="cdk8s-plus-27.Job"></a>

A Job creates one or more Pods and ensures that a specified number of them successfully terminate.

As pods successfully complete,
the Job tracks the successful completions. When a specified number of successful completions is reached, the task (ie, Job) is complete.
Deleting a Job will clean up the Pods it created. A simple case is to create one Job object in order to reliably run one Pod to completion.
The Job object will start a new Pod if the first Pod fails or is deleted (for example due to a node hardware failure or a node reboot).
You can also use a Job to run multiple Pods in parallel.

#### Initializers <a name="cdk8s-plus-27.Job.Initializer"></a>

```typescript
import { Job } from 'cdk8s-plus-27'

new Job(scope: Construct, id: string, props?: JobProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Job.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Job.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.Job.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.JobProps`](#cdk8s-plus-27.JobProps)

---



#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.Job.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `activeDeadline`<sup>Optional</sup> <a name="cdk8s-plus-27.Job.property.activeDeadline"></a>

```typescript
public readonly activeDeadline: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

Duration before job is terminated.

If undefined, there is no deadline.

---

##### `backoffLimit`<sup>Optional</sup> <a name="cdk8s-plus-27.Job.property.backoffLimit"></a>

```typescript
public readonly backoffLimit: number;
```

- *Type:* `number`

Number of retries before marking failed.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="cdk8s-plus-27.Job.property.ttlAfterFinished"></a>

```typescript
public readonly ttlAfterFinished: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

TTL before the job is deleted after it is finished.

---


### Namespace <a name="cdk8s-plus-27.Namespace"></a>

- *Implements:* [`cdk8s-plus-27.INamespaceSelector`](#cdk8s-plus-27.INamespaceSelector), [`cdk8s-plus-27.INetworkPolicyPeer`](#cdk8s-plus-27.INetworkPolicyPeer)

In Kubernetes, namespaces provides a mechanism for isolating groups of resources within a single cluster.

Names of resources need to be unique within a namespace, but not across namespaces.
Namespace-based scoping is applicable only for namespaced objects (e.g. Deployments, Services, etc) and
not for cluster-wide objects (e.g. StorageClass, Nodes, PersistentVolumes, etc).

#### Initializers <a name="cdk8s-plus-27.Namespace.Initializer"></a>

```typescript
import { Namespace } from 'cdk8s-plus-27'

new Namespace(scope: Construct, id: string, props?: NamespaceProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Namespace.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Namespace.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.Namespace.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.NamespaceProps`](#cdk8s-plus-27.NamespaceProps)

---

#### Methods <a name="Methods"></a>

##### `toNamespaceSelectorConfig` <a name="cdk8s-plus-27.Namespace.toNamespaceSelectorConfig"></a>

```typescript
public toNamespaceSelectorConfig()
```

##### `toNetworkPolicyPeerConfig` <a name="cdk8s-plus-27.Namespace.toNetworkPolicyPeerConfig"></a>

```typescript
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="cdk8s-plus-27.Namespace.toPodSelector"></a>

```typescript
public toPodSelector()
```


#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.Namespace.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

#### Constants <a name="Constants"></a>

##### `NAME_LABEL` <a name="cdk8s-plus-27.Namespace.property.NAME_LABEL"></a>

- *Type:* `string`

> https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#automatic-labelling

---

### Namespaces <a name="cdk8s-plus-27.Namespaces"></a>

- *Implements:* [`cdk8s-plus-27.INamespaceSelector`](#cdk8s-plus-27.INamespaceSelector), [`cdk8s-plus-27.INetworkPolicyPeer`](#cdk8s-plus-27.INetworkPolicyPeer)

Represents a group of namespaces.

#### Initializers <a name="cdk8s-plus-27.Namespaces.Initializer"></a>

```typescript
import { Namespaces } from 'cdk8s-plus-27'

new Namespaces(scope: Construct, id: string, expressions?: LabelExpression[], names?: string[], labels?: {[ key: string ]: string})
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Namespaces.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Namespaces.parameter.id"></a>

- *Type:* `string`

---

##### `expressions`<sup>Optional</sup> <a name="cdk8s-plus-27.Namespaces.parameter.expressions"></a>

- *Type:* [`cdk8s-plus-27.LabelExpression`](#cdk8s-plus-27.LabelExpression)[]

---

##### `names`<sup>Optional</sup> <a name="cdk8s-plus-27.Namespaces.parameter.names"></a>

- *Type:* `string`[]

---

##### `labels`<sup>Optional</sup> <a name="cdk8s-plus-27.Namespaces.parameter.labels"></a>

- *Type:* {[ key: string ]: `string`}

---

#### Methods <a name="Methods"></a>

##### `toNamespaceSelectorConfig` <a name="cdk8s-plus-27.Namespaces.toNamespaceSelectorConfig"></a>

```typescript
public toNamespaceSelectorConfig()
```

##### `toNetworkPolicyPeerConfig` <a name="cdk8s-plus-27.Namespaces.toNetworkPolicyPeerConfig"></a>

```typescript
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="cdk8s-plus-27.Namespaces.toPodSelector"></a>

```typescript
public toPodSelector()
```

#### Static Functions <a name="Static Functions"></a>

##### `all` <a name="cdk8s-plus-27.Namespaces.all"></a>

```typescript
import { Namespaces } from 'cdk8s-plus-27'

Namespaces.all(scope: Construct, id: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Namespaces.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Namespaces.parameter.id"></a>

- *Type:* `string`

---

##### `select` <a name="cdk8s-plus-27.Namespaces.select"></a>

```typescript
import { Namespaces } from 'cdk8s-plus-27'

Namespaces.select(scope: Construct, id: string, options: NamespacesSelectOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Namespaces.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Namespaces.parameter.id"></a>

- *Type:* `string`

---

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Namespaces.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.NamespacesSelectOptions`](#cdk8s-plus-27.NamespacesSelectOptions)

---



### NetworkPolicy <a name="cdk8s-plus-27.NetworkPolicy"></a>

Control traffic flow at the IP address or port level (OSI layer 3 or 4), network policies are an application-centric construct which allow you to specify how a pod is allowed to communicate with various network peers.

Outgoing traffic is allowed if there are no network policies selecting
   the pod (and cluster policy otherwise allows the traffic),
   OR if the traffic matches at least one egress rule across all of the
   network policies that select the pod.

- Incoming traffic is allowed to a pod if there are no network policies
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

#### Initializers <a name="cdk8s-plus-27.NetworkPolicy.Initializer"></a>

```typescript
import { NetworkPolicy } from 'cdk8s-plus-27'

new NetworkPolicy(scope: Construct, id: string, props?: NetworkPolicyProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicy.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicy.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicy.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.NetworkPolicyProps`](#cdk8s-plus-27.NetworkPolicyProps)

---

#### Methods <a name="Methods"></a>

##### `addEgressRule` <a name="cdk8s-plus-27.NetworkPolicy.addEgressRule"></a>

```typescript
public addEgressRule(peer: INetworkPolicyPeer, ports?: NetworkPolicyPort[])
```

###### `peer`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicy.parameter.peer"></a>

- *Type:* [`cdk8s-plus-27.INetworkPolicyPeer`](#cdk8s-plus-27.INetworkPolicyPeer)

---

###### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicy.parameter.ports"></a>

- *Type:* [`cdk8s-plus-27.NetworkPolicyPort`](#cdk8s-plus-27.NetworkPolicyPort)[]

---

##### `addIngressRule` <a name="cdk8s-plus-27.NetworkPolicy.addIngressRule"></a>

```typescript
public addIngressRule(peer: INetworkPolicyPeer, ports?: NetworkPolicyPort[])
```

###### `peer`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicy.parameter.peer"></a>

- *Type:* [`cdk8s-plus-27.INetworkPolicyPeer`](#cdk8s-plus-27.INetworkPolicyPeer)

---

###### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicy.parameter.ports"></a>

- *Type:* [`cdk8s-plus-27.NetworkPolicyPort`](#cdk8s-plus-27.NetworkPolicyPort)[]

---


#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicy.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---


### NetworkPolicyIpBlock <a name="cdk8s-plus-27.NetworkPolicyIpBlock"></a>

- *Implements:* [`cdk8s-plus-27.INetworkPolicyPeer`](#cdk8s-plus-27.INetworkPolicyPeer)

Describes a particular CIDR (Ex.

"192.168.1.1/24","2001:db9::/64") that is
allowed to the pods matched by a network policy selector.
The except entry describes CIDRs that should not be included within this rule.

#### Methods <a name="Methods"></a>

##### `toNetworkPolicyPeerConfig` <a name="cdk8s-plus-27.NetworkPolicyIpBlock.toNetworkPolicyPeerConfig"></a>

```typescript
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="cdk8s-plus-27.NetworkPolicyIpBlock.toPodSelector"></a>

```typescript
public toPodSelector()
```

#### Static Functions <a name="Static Functions"></a>

##### `anyIpv4` <a name="cdk8s-plus-27.NetworkPolicyIpBlock.anyIpv4"></a>

```typescript
import { NetworkPolicyIpBlock } from 'cdk8s-plus-27'

NetworkPolicyIpBlock.anyIpv4(scope: Construct, id: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `string`

---

##### `anyIpv6` <a name="cdk8s-plus-27.NetworkPolicyIpBlock.anyIpv6"></a>

```typescript
import { NetworkPolicyIpBlock } from 'cdk8s-plus-27'

NetworkPolicyIpBlock.anyIpv6(scope: Construct, id: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `string`

---

##### `ipv4` <a name="cdk8s-plus-27.NetworkPolicyIpBlock.ipv4"></a>

```typescript
import { NetworkPolicyIpBlock } from 'cdk8s-plus-27'

NetworkPolicyIpBlock.ipv4(scope: Construct, id: string, cidrIp: string, except?: string[])
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `string`

---

###### `cidrIp`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.cidrIp"></a>

- *Type:* `string`

---

###### `except`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.except"></a>

- *Type:* `string`[]

---

##### `ipv6` <a name="cdk8s-plus-27.NetworkPolicyIpBlock.ipv6"></a>

```typescript
import { NetworkPolicyIpBlock } from 'cdk8s-plus-27'

NetworkPolicyIpBlock.ipv6(scope: Construct, id: string, cidrIp: string, except?: string[])
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `string`

---

###### `cidrIp`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.cidrIp"></a>

- *Type:* `string`

---

###### `except`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.parameter.except"></a>

- *Type:* `string`[]

---

#### Properties <a name="Properties"></a>

##### `cidr`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.property.cidr"></a>

```typescript
public readonly cidr: string;
```

- *Type:* `string`

A string representing the IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64".

---

##### `except`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyIpBlock.property.except"></a>

```typescript
public readonly except: string[];
```

- *Type:* `string`[]

A slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64". Except values will be rejected if they are outside the CIDR range.

---


### PersistentVolume <a name="cdk8s-plus-27.PersistentVolume"></a>

- *Implements:* [`cdk8s-plus-27.IPersistentVolume`](#cdk8s-plus-27.IPersistentVolume), [`cdk8s-plus-27.IStorage`](#cdk8s-plus-27.IStorage)

A PersistentVolume (PV) is a piece of storage in the cluster that has been provisioned by an administrator or dynamically provisioned using Storage Classes.

It is a resource in the cluster just like a node is a cluster resource.
PVs are volume plugins like Volumes, but have a lifecycle independent of any
individual Pod that uses the PV. This API object captures the details of the
implementation of the storage, be that NFS, iSCSI, or a
cloud-provider-specific storage system.

#### Initializers <a name="cdk8s-plus-27.PersistentVolume.Initializer"></a>

```typescript
import { PersistentVolume } from 'cdk8s-plus-27'

new PersistentVolume(scope: Construct, id: string, props?: PersistentVolumeProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolume.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolume.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.PersistentVolumeProps`](#cdk8s-plus-27.PersistentVolumeProps)

---

#### Methods <a name="Methods"></a>

##### `asVolume` <a name="cdk8s-plus-27.PersistentVolume.asVolume"></a>

```typescript
public asVolume()
```

##### `bind` <a name="cdk8s-plus-27.PersistentVolume.bind"></a>

```typescript
public bind(claim: IPersistentVolumeClaim)
```

###### `claim`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolume.parameter.claim"></a>

- *Type:* [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim)

The PVC to bind to.

---

##### `reserve` <a name="cdk8s-plus-27.PersistentVolume.reserve"></a>

```typescript
public reserve()
```

#### Static Functions <a name="Static Functions"></a>

##### `fromPersistentVolumeName` <a name="cdk8s-plus-27.PersistentVolume.fromPersistentVolumeName"></a>

```typescript
import { PersistentVolume } from 'cdk8s-plus-27'

PersistentVolume.fromPersistentVolumeName(scope: Construct, id: string, volumeName: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolume.parameter.id"></a>

- *Type:* `string`

---

###### `volumeName`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolume.parameter.volumeName"></a>

- *Type:* `string`

---

#### Properties <a name="Properties"></a>

##### `mode`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolume.property.mode"></a>

```typescript
public readonly mode: PersistentVolumeMode;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeMode`](#cdk8s-plus-27.PersistentVolumeMode)

Volume mode of this volume.

---

##### `reclaimPolicy`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolume.property.reclaimPolicy"></a>

```typescript
public readonly reclaimPolicy: PersistentVolumeReclaimPolicy;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeReclaimPolicy`](#cdk8s-plus-27.PersistentVolumeReclaimPolicy)

Reclaim policy of this volume.

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolume.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `accessModes`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolume.property.accessModes"></a>

```typescript
public readonly accessModes: PersistentVolumeAccessMode[];
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeAccessMode`](#cdk8s-plus-27.PersistentVolumeAccessMode)[]

Access modes requirement of this claim.

---

##### `claim`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolume.property.claim"></a>

```typescript
public readonly claim: IPersistentVolumeClaim;
```

- *Type:* [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim)

PVC this volume is bound to.

Undefined means this volume is not yet
claimed by any PVC.

---

##### `mountOptions`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolume.property.mountOptions"></a>

```typescript
public readonly mountOptions: string[];
```

- *Type:* `string`[]

Mount options of this volume.

---

##### `storage`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolume.property.storage"></a>

```typescript
public readonly storage: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

Storage size of this volume.

---

##### `storageClassName`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolume.property.storageClassName"></a>

```typescript
public readonly storageClassName: string;
```

- *Type:* `string`

Storage class this volume belongs to.

---


### PersistentVolumeClaim <a name="cdk8s-plus-27.PersistentVolumeClaim"></a>

- *Implements:* [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim)

A PersistentVolumeClaim (PVC) is a request for storage by a user.

It is similar to a Pod. Pods consume node resources and PVCs consume PV resources.
Pods can request specific levels of resources (CPU and Memory).
Claims can request specific size and access modes

#### Initializers <a name="cdk8s-plus-27.PersistentVolumeClaim.Initializer"></a>

```typescript
import { PersistentVolumeClaim } from 'cdk8s-plus-27'

new PersistentVolumeClaim(scope: Construct, id: string, props?: PersistentVolumeClaimProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.PersistentVolumeClaimProps`](#cdk8s-plus-27.PersistentVolumeClaimProps)

---

#### Methods <a name="Methods"></a>

##### `bind` <a name="cdk8s-plus-27.PersistentVolumeClaim.bind"></a>

```typescript
public bind(vol: IPersistentVolume)
```

###### `vol`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.parameter.vol"></a>

- *Type:* [`cdk8s-plus-27.IPersistentVolume`](#cdk8s-plus-27.IPersistentVolume)

The PV to bind to.

---

#### Static Functions <a name="Static Functions"></a>

##### `fromClaimName` <a name="cdk8s-plus-27.PersistentVolumeClaim.fromClaimName"></a>

```typescript
import { PersistentVolumeClaim } from 'cdk8s-plus-27'

PersistentVolumeClaim.fromClaimName(scope: Construct, id: string, claimName: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.parameter.id"></a>

- *Type:* `string`

---

###### `claimName`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.parameter.claimName"></a>

- *Type:* `string`

---

#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `volumeMode`<sup>Required</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.property.volumeMode"></a>

```typescript
public readonly volumeMode: PersistentVolumeMode;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeMode`](#cdk8s-plus-27.PersistentVolumeMode)

Volume mode requirement of this claim.

---

##### `accessModes`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.property.accessModes"></a>

```typescript
public readonly accessModes: PersistentVolumeAccessMode[];
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeAccessMode`](#cdk8s-plus-27.PersistentVolumeAccessMode)[]

Access modes requirement of this claim.

---

##### `storage`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.property.storage"></a>

```typescript
public readonly storage: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

Storage requirement of this claim.

---

##### `storageClassName`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.property.storageClassName"></a>

```typescript
public readonly storageClassName: string;
```

- *Type:* `string`

Storage class requirment of this claim.

---

##### `volume`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaim.property.volume"></a>

```typescript
public readonly volume: IPersistentVolume;
```

- *Type:* [`cdk8s-plus-27.IPersistentVolume`](#cdk8s-plus-27.IPersistentVolume)

PV this claim is bound to.

Undefined means the claim is not bound
to any specific volume.

---


### Pod <a name="cdk8s-plus-27.Pod"></a>

Pod is a collection of containers that can run on a host.

This resource is
created by clients and scheduled onto hosts.

#### Initializers <a name="cdk8s-plus-27.Pod.Initializer"></a>

```typescript
import { Pod } from 'cdk8s-plus-27'

new Pod(scope: Construct, id: string, props?: PodProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Pod.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Pod.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.Pod.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.PodProps`](#cdk8s-plus-27.PodProps)

---



#### Properties <a name="Properties"></a>

##### `connections`<sup>Required</sup> <a name="cdk8s-plus-27.Pod.property.connections"></a>

```typescript
public readonly connections: PodConnections;
```

- *Type:* [`cdk8s-plus-27.PodConnections`](#cdk8s-plus-27.PodConnections)

---

##### `podMetadata`<sup>Required</sup> <a name="cdk8s-plus-27.Pod.property.podMetadata"></a>

```typescript
public readonly podMetadata: ApiObjectMetadataDefinition;
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.Pod.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `scheduling`<sup>Required</sup> <a name="cdk8s-plus-27.Pod.property.scheduling"></a>

```typescript
public readonly scheduling: PodScheduling;
```

- *Type:* [`cdk8s-plus-27.PodScheduling`](#cdk8s-plus-27.PodScheduling)

---

#### Constants <a name="Constants"></a>

##### `ADDRESS_LABEL` <a name="cdk8s-plus-27.Pod.property.ADDRESS_LABEL"></a>

- *Type:* `string`

This label is autoamtically added by cdk8s to any pod.

It provides
a unique and stable identifier for the pod.

---

### Pods <a name="cdk8s-plus-27.Pods"></a>

- *Implements:* [`cdk8s-plus-27.IPodSelector`](#cdk8s-plus-27.IPodSelector)

Represents a group of pods.

#### Initializers <a name="cdk8s-plus-27.Pods.Initializer"></a>

```typescript
import { Pods } from 'cdk8s-plus-27'

new Pods(scope: Construct, id: string, expressions?: LabelExpression[], labels?: {[ key: string ]: string}, namespaces?: INamespaceSelector)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Pods.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Pods.parameter.id"></a>

- *Type:* `string`

---

##### `expressions`<sup>Optional</sup> <a name="cdk8s-plus-27.Pods.parameter.expressions"></a>

- *Type:* [`cdk8s-plus-27.LabelExpression`](#cdk8s-plus-27.LabelExpression)[]

---

##### `labels`<sup>Optional</sup> <a name="cdk8s-plus-27.Pods.parameter.labels"></a>

- *Type:* {[ key: string ]: `string`}

---

##### `namespaces`<sup>Optional</sup> <a name="cdk8s-plus-27.Pods.parameter.namespaces"></a>

- *Type:* [`cdk8s-plus-27.INamespaceSelector`](#cdk8s-plus-27.INamespaceSelector)

---

#### Methods <a name="Methods"></a>

##### `toNetworkPolicyPeerConfig` <a name="cdk8s-plus-27.Pods.toNetworkPolicyPeerConfig"></a>

```typescript
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="cdk8s-plus-27.Pods.toPodSelector"></a>

```typescript
public toPodSelector()
```

##### `toPodSelectorConfig` <a name="cdk8s-plus-27.Pods.toPodSelectorConfig"></a>

```typescript
public toPodSelectorConfig()
```

#### Static Functions <a name="Static Functions"></a>

##### `all` <a name="cdk8s-plus-27.Pods.all"></a>

```typescript
import { Pods } from 'cdk8s-plus-27'

Pods.all(scope: Construct, id: string, options?: PodsAllOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Pods.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Pods.parameter.id"></a>

- *Type:* `string`

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Pods.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.PodsAllOptions`](#cdk8s-plus-27.PodsAllOptions)

---

##### `select` <a name="cdk8s-plus-27.Pods.select"></a>

```typescript
import { Pods } from 'cdk8s-plus-27'

Pods.select(scope: Construct, id: string, options: PodsSelectOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Pods.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Pods.parameter.id"></a>

- *Type:* `string`

---

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Pods.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.PodsSelectOptions`](#cdk8s-plus-27.PodsSelectOptions)

---



### Resource <a name="cdk8s-plus-27.Resource"></a>

- *Implements:* [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource), [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource), [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

Base class for all Kubernetes objects in stdk8s.

Represents a single
resource.

#### Initializers <a name="cdk8s-plus-27.Resource.Initializer"></a>

```typescript
import { Resource } from 'cdk8s-plus-27'

new Resource(scope: Construct, id: string)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Resource.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Resource.parameter.id"></a>

- *Type:* `string`

---

#### Methods <a name="Methods"></a>

##### `asApiResource` <a name="cdk8s-plus-27.Resource.asApiResource"></a>

```typescript
public asApiResource()
```

##### `asNonApiResource` <a name="cdk8s-plus-27.Resource.asNonApiResource"></a>

```typescript
public asNonApiResource()
```


#### Properties <a name="Properties"></a>

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.Resource.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. "authorization.k8s.io").

---

##### `apiVersion`<sup>Required</sup> <a name="cdk8s-plus-27.Resource.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.Resource.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

The object kind (e.g. "Deployment").

---

##### `metadata`<sup>Required</sup> <a name="cdk8s-plus-27.Resource.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadataDefinition;
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Resource.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The name of this API object.

---

##### `permissions`<sup>Required</sup> <a name="cdk8s-plus-27.Resource.property.permissions"></a>

```typescript
public readonly permissions: ResourcePermissions;
```

- *Type:* [`cdk8s-plus-27.ResourcePermissions`](#cdk8s-plus-27.ResourcePermissions)

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.Resource.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `resourceName`<sup>Optional</sup> <a name="cdk8s-plus-27.Resource.property.resourceName"></a>

```typescript
public readonly resourceName: string;
```

- *Type:* `string`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---


### Role <a name="cdk8s-plus-27.Role"></a>

- *Implements:* [`cdk8s-plus-27.IRole`](#cdk8s-plus-27.IRole)

Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.

#### Initializers <a name="cdk8s-plus-27.Role.Initializer"></a>

```typescript
import { Role } from 'cdk8s-plus-27'

new Role(scope: Construct, id: string, props?: RoleProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.Role.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.RoleProps`](#cdk8s-plus-27.RoleProps)

---

#### Methods <a name="Methods"></a>

##### `allow` <a name="cdk8s-plus-27.Role.allow"></a>

```typescript
public allow(verbs: string[], resources: IApiResource)
```

###### `verbs`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.verbs"></a>

- *Type:* `string`[]

---

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `allowCreate` <a name="cdk8s-plus-27.Role.allowCreate"></a>

```typescript
public allowCreate(resources: IApiResource)
```

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `allowDelete` <a name="cdk8s-plus-27.Role.allowDelete"></a>

```typescript
public allowDelete(resources: IApiResource)
```

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `allowDeleteCollection` <a name="cdk8s-plus-27.Role.allowDeleteCollection"></a>

```typescript
public allowDeleteCollection(resources: IApiResource)
```

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `allowGet` <a name="cdk8s-plus-27.Role.allowGet"></a>

```typescript
public allowGet(resources: IApiResource)
```

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `allowList` <a name="cdk8s-plus-27.Role.allowList"></a>

```typescript
public allowList(resources: IApiResource)
```

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `allowPatch` <a name="cdk8s-plus-27.Role.allowPatch"></a>

```typescript
public allowPatch(resources: IApiResource)
```

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `allowRead` <a name="cdk8s-plus-27.Role.allowRead"></a>

```typescript
public allowRead(resources: IApiResource)
```

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `allowReadWrite` <a name="cdk8s-plus-27.Role.allowReadWrite"></a>

```typescript
public allowReadWrite(resources: IApiResource)
```

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `allowUpdate` <a name="cdk8s-plus-27.Role.allowUpdate"></a>

```typescript
public allowUpdate(resources: IApiResource)
```

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `allowWatch` <a name="cdk8s-plus-27.Role.allowWatch"></a>

```typescript
public allowWatch(resources: IApiResource)
```

###### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.resources"></a>

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

The resource(s) to apply to.

---

##### `bind` <a name="cdk8s-plus-27.Role.bind"></a>

```typescript
public bind(subjects: ISubject)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.subjects"></a>

- *Type:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

a list of subjects to bind to.

---

#### Static Functions <a name="Static Functions"></a>

##### `fromRoleName` <a name="cdk8s-plus-27.Role.fromRoleName"></a>

```typescript
import { Role } from 'cdk8s-plus-27'

Role.fromRoleName(scope: Construct, id: string, name: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.id"></a>

- *Type:* `string`

---

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Role.parameter.name"></a>

- *Type:* `string`

---

#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.Role.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `rules`<sup>Required</sup> <a name="cdk8s-plus-27.Role.property.rules"></a>

```typescript
public readonly rules: RolePolicyRule[];
```

- *Type:* [`cdk8s-plus-27.RolePolicyRule`](#cdk8s-plus-27.RolePolicyRule)[]

Rules associaated with this Role.

Returns a copy, use `allow` to add rules.

---


### RoleBinding <a name="cdk8s-plus-27.RoleBinding"></a>

A RoleBinding grants permissions within a specific namespace to a user or set of users.

#### Initializers <a name="cdk8s-plus-27.RoleBinding.Initializer"></a>

```typescript
import { RoleBinding } from 'cdk8s-plus-27'

new RoleBinding(scope: Construct, id: string, props: RoleBindingProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.RoleBinding.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.RoleBinding.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.RoleBinding.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.RoleBindingProps`](#cdk8s-plus-27.RoleBindingProps)

---

#### Methods <a name="Methods"></a>

##### `addSubjects` <a name="cdk8s-plus-27.RoleBinding.addSubjects"></a>

```typescript
public addSubjects(subjects: ISubject)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s-plus-27.RoleBinding.parameter.subjects"></a>

- *Type:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

The subjects to add.

---


#### Properties <a name="Properties"></a>

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.RoleBinding.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `role`<sup>Required</sup> <a name="cdk8s-plus-27.RoleBinding.property.role"></a>

```typescript
public readonly role: IRole;
```

- *Type:* [`cdk8s-plus-27.IRole`](#cdk8s-plus-27.IRole)

---

##### `subjects`<sup>Required</sup> <a name="cdk8s-plus-27.RoleBinding.property.subjects"></a>

```typescript
public readonly subjects: ISubject[];
```

- *Type:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)[]

---


### Secret <a name="cdk8s-plus-27.Secret"></a>

- *Implements:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)

Kubernetes Secrets let you store and manage sensitive information, such as passwords, OAuth tokens, and ssh keys.

Storing confidential information in a
Secret is safer and more flexible than putting it verbatim in a Pod
definition or in a container image.

> https://kubernetes.io/docs/concepts/configuration/secret

#### Initializers <a name="cdk8s-plus-27.Secret.Initializer"></a>

```typescript
import { Secret } from 'cdk8s-plus-27'

new Secret(scope: Construct, id: string, props?: SecretProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.Secret.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.SecretProps`](#cdk8s-plus-27.SecretProps)

---

#### Methods <a name="Methods"></a>

##### `addStringData` <a name="cdk8s-plus-27.Secret.addStringData"></a>

```typescript
public addStringData(key: string, value: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.parameter.key"></a>

- *Type:* `string`

Key.

---

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.parameter.value"></a>

- *Type:* `string`

Value.

---

##### `envValue` <a name="cdk8s-plus-27.Secret.envValue"></a>

```typescript
public envValue(key: string, options?: EnvValueFromSecretOptions)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.parameter.key"></a>

- *Type:* `string`

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Secret.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.EnvValueFromSecretOptions`](#cdk8s-plus-27.EnvValueFromSecretOptions)

---

##### `getStringData` <a name="cdk8s-plus-27.Secret.getStringData"></a>

```typescript
public getStringData(key: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.parameter.key"></a>

- *Type:* `string`

Key.

---

#### Static Functions <a name="Static Functions"></a>

##### `fromSecretName` <a name="cdk8s-plus-27.Secret.fromSecretName"></a>

```typescript
import { Secret } from 'cdk8s-plus-27'

Secret.fromSecretName(scope: Construct, id: string, name: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.parameter.id"></a>

- *Type:* `string`

---

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.parameter.name"></a>

- *Type:* `string`

---

#### Properties <a name="Properties"></a>

##### `immutable`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.property.immutable"></a>

```typescript
public readonly immutable: boolean;
```

- *Type:* `boolean`

Whether or not the secret is immutable.

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.Secret.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---


### Service <a name="cdk8s-plus-27.Service"></a>

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

#### Initializers <a name="cdk8s-plus-27.Service.Initializer"></a>

```typescript
import { Service } from 'cdk8s-plus-27'

new Service(scope: Construct, id: string, props?: ServiceProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Service.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Service.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.Service.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.ServiceProps`](#cdk8s-plus-27.ServiceProps)

---

#### Methods <a name="Methods"></a>

##### `bind` <a name="cdk8s-plus-27.Service.bind"></a>

```typescript
public bind(port: number, options?: ServiceBindOptions)
```

###### `port`<sup>Required</sup> <a name="cdk8s-plus-27.Service.parameter.port"></a>

- *Type:* `number`

The port definition.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Service.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.ServiceBindOptions`](#cdk8s-plus-27.ServiceBindOptions)

---

##### `exposeViaIngress` <a name="cdk8s-plus-27.Service.exposeViaIngress"></a>

```typescript
public exposeViaIngress(path: string, options?: ExposeServiceViaIngressOptions)
```

###### `path`<sup>Required</sup> <a name="cdk8s-plus-27.Service.parameter.path"></a>

- *Type:* `string`

The path to expose the service under.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Service.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.ExposeServiceViaIngressOptions`](#cdk8s-plus-27.ExposeServiceViaIngressOptions)

Additional options.

---

##### `select` <a name="cdk8s-plus-27.Service.select"></a>

```typescript
public select(selector: IPodSelector)
```

###### `selector`<sup>Required</sup> <a name="cdk8s-plus-27.Service.parameter.selector"></a>

- *Type:* [`cdk8s-plus-27.IPodSelector`](#cdk8s-plus-27.IPodSelector)

---

##### `selectLabel` <a name="cdk8s-plus-27.Service.selectLabel"></a>

```typescript
public selectLabel(key: string, value: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.Service.parameter.key"></a>

- *Type:* `string`

---

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.Service.parameter.value"></a>

- *Type:* `string`

---


#### Properties <a name="Properties"></a>

##### `port`<sup>Required</sup> <a name="cdk8s-plus-27.Service.property.port"></a>

```typescript
public readonly port: number;
```

- *Type:* `number`

Return the first port of the service.

---

##### `ports`<sup>Required</sup> <a name="cdk8s-plus-27.Service.property.ports"></a>

```typescript
public readonly ports: ServicePort[];
```

- *Type:* [`cdk8s-plus-27.ServicePort`](#cdk8s-plus-27.ServicePort)[]

Ports for this service.

Use `bind()` to bind additional service ports.

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.Service.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `type`<sup>Required</sup> <a name="cdk8s-plus-27.Service.property.type"></a>

```typescript
public readonly type: ServiceType;
```

- *Type:* [`cdk8s-plus-27.ServiceType`](#cdk8s-plus-27.ServiceType)

Determines how the Service is exposed.

---

##### `clusterIP`<sup>Optional</sup> <a name="cdk8s-plus-27.Service.property.clusterIP"></a>

```typescript
public readonly clusterIP: string;
```

- *Type:* `string`

The IP address of the service and is usually assigned randomly by the master.

---

##### `externalName`<sup>Optional</sup> <a name="cdk8s-plus-27.Service.property.externalName"></a>

```typescript
public readonly externalName: string;
```

- *Type:* `string`

The externalName to be used for EXTERNAL_NAME types.

---


### ServiceAccount <a name="cdk8s-plus-27.ServiceAccount"></a>

- *Implements:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount), [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the apiserver.
When they do, they are authenticated as a particular Service Account (for
example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account

#### Initializers <a name="cdk8s-plus-27.ServiceAccount.Initializer"></a>

```typescript
import { ServiceAccount } from 'cdk8s-plus-27'

new ServiceAccount(scope: Construct, id: string, props?: ServiceAccountProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccount.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccount.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceAccount.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.ServiceAccountProps`](#cdk8s-plus-27.ServiceAccountProps)

---

#### Methods <a name="Methods"></a>

##### `addSecret` <a name="cdk8s-plus-27.ServiceAccount.addSecret"></a>

```typescript
public addSecret(secr: ISecret)
```

###### `secr`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccount.parameter.secr"></a>

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)

The secret.

---

##### `toSubjectConfiguration` <a name="cdk8s-plus-27.ServiceAccount.toSubjectConfiguration"></a>

```typescript
public toSubjectConfiguration()
```

#### Static Functions <a name="Static Functions"></a>

##### `fromServiceAccountName` <a name="cdk8s-plus-27.ServiceAccount.fromServiceAccountName"></a>

```typescript
import { ServiceAccount } from 'cdk8s-plus-27'

ServiceAccount.fromServiceAccountName(scope: Construct, id: string, name: string, options?: FromServiceAccountNameOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccount.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccount.parameter.id"></a>

- *Type:* `string`

---

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccount.parameter.name"></a>

- *Type:* `string`

The name of the service account resource.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceAccount.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.FromServiceAccountNameOptions`](#cdk8s-plus-27.FromServiceAccountNameOptions)

additional options.

---

#### Properties <a name="Properties"></a>

##### `automountToken`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccount.property.automountToken"></a>

```typescript
public readonly automountToken: boolean;
```

- *Type:* `boolean`

Whether or not a token is automatically mounted for this service account.

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccount.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `secrets`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccount.property.secrets"></a>

```typescript
public readonly secrets: ISecret[];
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)[]

List of secrets allowed to be used by pods running using this service account.

Returns a copy. To add a secret, use `addSecret()`.

---


### ServiceAccountTokenSecret <a name="cdk8s-plus-27.ServiceAccountTokenSecret"></a>

Create a secret for a service account token.

> https://kubernetes.io/docs/concepts/configuration/secret/#service-account-token-secrets

#### Initializers <a name="cdk8s-plus-27.ServiceAccountTokenSecret.Initializer"></a>

```typescript
import { ServiceAccountTokenSecret } from 'cdk8s-plus-27'

new ServiceAccountTokenSecret(scope: Construct, id: string, props: ServiceAccountTokenSecretProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccountTokenSecret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccountTokenSecret.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccountTokenSecret.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.ServiceAccountTokenSecretProps`](#cdk8s-plus-27.ServiceAccountTokenSecretProps)

---





### SshAuthSecret <a name="cdk8s-plus-27.SshAuthSecret"></a>

Create a secret for ssh authentication.

> https://kubernetes.io/docs/concepts/configuration/secret/#ssh-authentication-secrets

#### Initializers <a name="cdk8s-plus-27.SshAuthSecret.Initializer"></a>

```typescript
import { SshAuthSecret } from 'cdk8s-plus-27'

new SshAuthSecret(scope: Construct, id: string, props: SshAuthSecretProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.SshAuthSecret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.SshAuthSecret.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.SshAuthSecret.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.SshAuthSecretProps`](#cdk8s-plus-27.SshAuthSecretProps)

---





### StatefulSet <a name="cdk8s-plus-27.StatefulSet"></a>

- *Implements:* [`cdk8s-plus-27.IScalable`](#cdk8s-plus-27.IScalable)

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

Using StatefulSets
------------------
StatefulSets are valuable for applications that require one or more of the following.

- Stable, unique network identifiers.
- Stable, persistent storage.
- Ordered, graceful deployment and scaling.
- Ordered, automated rolling updates.

#### Initializers <a name="cdk8s-plus-27.StatefulSet.Initializer"></a>

```typescript
import { StatefulSet } from 'cdk8s-plus-27'

new StatefulSet(scope: Construct, id: string, props: StatefulSetProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.StatefulSet.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.StatefulSet.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.StatefulSet.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.StatefulSetProps`](#cdk8s-plus-27.StatefulSetProps)

---

#### Methods <a name="Methods"></a>

##### `markHasAutoscaler` <a name="cdk8s-plus-27.StatefulSet.markHasAutoscaler"></a>

```typescript
public markHasAutoscaler()
```

##### `toScalingTarget` <a name="cdk8s-plus-27.StatefulSet.toScalingTarget"></a>

```typescript
public toScalingTarget()
```


#### Properties <a name="Properties"></a>

##### `minReady`<sup>Required</sup> <a name="cdk8s-plus-27.StatefulSet.property.minReady"></a>

```typescript
public readonly minReady: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---

##### `podManagementPolicy`<sup>Required</sup> <a name="cdk8s-plus-27.StatefulSet.property.podManagementPolicy"></a>

```typescript
public readonly podManagementPolicy: PodManagementPolicy;
```

- *Type:* [`cdk8s-plus-27.PodManagementPolicy`](#cdk8s-plus-27.PodManagementPolicy)

Management policy to use for the set.

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.StatefulSet.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `service`<sup>Required</sup> <a name="cdk8s-plus-27.StatefulSet.property.service"></a>

```typescript
public readonly service: Service;
```

- *Type:* [`cdk8s-plus-27.Service`](#cdk8s-plus-27.Service)

---

##### `strategy`<sup>Required</sup> <a name="cdk8s-plus-27.StatefulSet.property.strategy"></a>

```typescript
public readonly strategy: StatefulSetUpdateStrategy;
```

- *Type:* [`cdk8s-plus-27.StatefulSetUpdateStrategy`](#cdk8s-plus-27.StatefulSetUpdateStrategy)

The update startegy of this stateful set.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSet.property.replicas"></a>

```typescript
public readonly replicas: number;
```

- *Type:* `number`

Number of desired pods.

---

##### `hasAutoscaler`<sup>Required</sup> <a name="cdk8s-plus-27.StatefulSet.property.hasAutoscaler"></a>

```typescript
public readonly hasAutoscaler: boolean;
```

- *Type:* `boolean`

If this is a target of an autoscaler.

---


### TlsSecret <a name="cdk8s-plus-27.TlsSecret"></a>

Create a secret for storing a TLS certificate and its associated key.

> https://kubernetes.io/docs/concepts/configuration/secret/#tls-secrets

#### Initializers <a name="cdk8s-plus-27.TlsSecret.Initializer"></a>

```typescript
import { TlsSecret } from 'cdk8s-plus-27'

new TlsSecret(scope: Construct, id: string, props: TlsSecretProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.TlsSecret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.TlsSecret.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.TlsSecret.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.TlsSecretProps`](#cdk8s-plus-27.TlsSecretProps)

---





### User <a name="cdk8s-plus-27.User"></a>

- *Implements:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

Represents a user.

#### Methods <a name="Methods"></a>

##### `toSubjectConfiguration` <a name="cdk8s-plus-27.User.toSubjectConfiguration"></a>

```typescript
public toSubjectConfiguration()
```

#### Static Functions <a name="Static Functions"></a>

##### `fromName` <a name="cdk8s-plus-27.User.fromName"></a>

```typescript
import { User } from 'cdk8s-plus-27'

User.fromName(scope: Construct, id: string, name: string)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.User.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.User.parameter.id"></a>

- *Type:* `string`

---

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.User.parameter.name"></a>

- *Type:* `string`

---

#### Properties <a name="Properties"></a>

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.User.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.User.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

---

##### `apiGroup`<sup>Optional</sup> <a name="cdk8s-plus-27.User.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

---


### Volume <a name="cdk8s-plus-27.Volume"></a>

- *Implements:* [`cdk8s-plus-27.IStorage`](#cdk8s-plus-27.IStorage)

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

##### `asVolume` <a name="cdk8s-plus-27.Volume.asVolume"></a>

```typescript
public asVolume()
```

#### Static Functions <a name="Static Functions"></a>

##### `fromAwsElasticBlockStore` <a name="cdk8s-plus-27.Volume.fromAwsElasticBlockStore"></a>

```typescript
import { Volume } from 'cdk8s-plus-27'

Volume.fromAwsElasticBlockStore(scope: Construct, id: string, volumeId: string, options?: AwsElasticBlockStoreVolumeOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.id"></a>

- *Type:* `string`

---

###### `volumeId`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.volumeId"></a>

- *Type:* `string`

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Volume.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.AwsElasticBlockStoreVolumeOptions`](#cdk8s-plus-27.AwsElasticBlockStoreVolumeOptions)

---

##### `fromAzureDisk` <a name="cdk8s-plus-27.Volume.fromAzureDisk"></a>

```typescript
import { Volume } from 'cdk8s-plus-27'

Volume.fromAzureDisk(scope: Construct, id: string, diskName: string, diskUri: string, options?: AzureDiskVolumeOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.id"></a>

- *Type:* `string`

---

###### `diskName`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.diskName"></a>

- *Type:* `string`

---

###### `diskUri`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.diskUri"></a>

- *Type:* `string`

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Volume.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.AzureDiskVolumeOptions`](#cdk8s-plus-27.AzureDiskVolumeOptions)

---

##### `fromConfigMap` <a name="cdk8s-plus-27.Volume.fromConfigMap"></a>

```typescript
import { Volume } from 'cdk8s-plus-27'

Volume.fromConfigMap(scope: Construct, id: string, configMap: IConfigMap, options?: ConfigMapVolumeOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.id"></a>

- *Type:* `string`

---

###### `configMap`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.configMap"></a>

- *Type:* [`cdk8s-plus-27.IConfigMap`](#cdk8s-plus-27.IConfigMap)

The config map to use to populate the volume.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Volume.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.ConfigMapVolumeOptions`](#cdk8s-plus-27.ConfigMapVolumeOptions)

Options.

---

##### `fromCsi` <a name="cdk8s-plus-27.Volume.fromCsi"></a>

```typescript
import { Volume } from 'cdk8s-plus-27'

Volume.fromCsi(scope: Construct, id: string, driver: string, options?: CsiVolumeOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.id"></a>

- *Type:* `string`

---

###### `driver`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.driver"></a>

- *Type:* `string`

The name of the CSI driver to use to populate the volume.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Volume.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.CsiVolumeOptions`](#cdk8s-plus-27.CsiVolumeOptions)

Options for the CSI volume, including driver-specific ones.

---

##### `fromEmptyDir` <a name="cdk8s-plus-27.Volume.fromEmptyDir"></a>

```typescript
import { Volume } from 'cdk8s-plus-27'

Volume.fromEmptyDir(scope: Construct, id: string, name: string, options?: EmptyDirVolumeOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.id"></a>

- *Type:* `string`

---

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.name"></a>

- *Type:* `string`

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Volume.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.EmptyDirVolumeOptions`](#cdk8s-plus-27.EmptyDirVolumeOptions)

Additional options.

---

##### `fromGcePersistentDisk` <a name="cdk8s-plus-27.Volume.fromGcePersistentDisk"></a>

```typescript
import { Volume } from 'cdk8s-plus-27'

Volume.fromGcePersistentDisk(scope: Construct, id: string, pdName: string, options?: GCEPersistentDiskVolumeOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.id"></a>

- *Type:* `string`

---

###### `pdName`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.pdName"></a>

- *Type:* `string`

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Volume.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.GCEPersistentDiskVolumeOptions`](#cdk8s-plus-27.GCEPersistentDiskVolumeOptions)

---

##### `fromHostPath` <a name="cdk8s-plus-27.Volume.fromHostPath"></a>

```typescript
import { Volume } from 'cdk8s-plus-27'

Volume.fromHostPath(scope: Construct, id: string, name: string, options: HostPathVolumeOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.id"></a>

- *Type:* `string`

---

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.name"></a>

- *Type:* `string`

---

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.HostPathVolumeOptions`](#cdk8s-plus-27.HostPathVolumeOptions)

---

##### `fromNfs` <a name="cdk8s-plus-27.Volume.fromNfs"></a>

```typescript
import { Volume } from 'cdk8s-plus-27'

Volume.fromNfs(scope: Construct, id: string, name: string, options: NfsVolumeOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.id"></a>

- *Type:* `string`

---

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.name"></a>

- *Type:* `string`

---

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.NfsVolumeOptions`](#cdk8s-plus-27.NfsVolumeOptions)

---

##### `fromPersistentVolumeClaim` <a name="cdk8s-plus-27.Volume.fromPersistentVolumeClaim"></a>

```typescript
import { Volume } from 'cdk8s-plus-27'

Volume.fromPersistentVolumeClaim(scope: Construct, id: string, claim: IPersistentVolumeClaim, options?: PersistentVolumeClaimVolumeOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.id"></a>

- *Type:* `string`

---

###### `claim`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.claim"></a>

- *Type:* [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim)

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Volume.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.PersistentVolumeClaimVolumeOptions`](#cdk8s-plus-27.PersistentVolumeClaimVolumeOptions)

---

##### `fromSecret` <a name="cdk8s-plus-27.Volume.fromSecret"></a>

```typescript
import { Volume } from 'cdk8s-plus-27'

Volume.fromSecret(scope: Construct, id: string, secr: ISecret, options?: SecretVolumeOptions)
```

###### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.id"></a>

- *Type:* `string`

---

###### `secr`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.parameter.secr"></a>

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)

The secret to use to populate the volume.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Volume.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.SecretVolumeOptions`](#cdk8s-plus-27.SecretVolumeOptions)

Options.

---

#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Volume.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

---


### Workload <a name="cdk8s-plus-27.Workload"></a>

A workload is an application running on Kubernetes.

Whether your workload is a single
component or several that work together, on Kubernetes you run it inside a set of pods.
In Kubernetes, a Pod represents a set of running containers on your cluster.

#### Initializers <a name="cdk8s-plus-27.Workload.Initializer"></a>

```typescript
import { Workload } from 'cdk8s-plus-27'

new Workload(scope: Construct, id: string, props: WorkloadProps)
```

##### `scope`<sup>Required</sup> <a name="cdk8s-plus-27.Workload.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s-plus-27.Workload.parameter.id"></a>

- *Type:* `string`

---

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.Workload.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.WorkloadProps`](#cdk8s-plus-27.WorkloadProps)

---

#### Methods <a name="Methods"></a>

##### `select` <a name="cdk8s-plus-27.Workload.select"></a>

```typescript
public select(selectors: LabelSelector)
```

###### `selectors`<sup>Required</sup> <a name="cdk8s-plus-27.Workload.parameter.selectors"></a>

- *Type:* [`cdk8s-plus-27.LabelSelector`](#cdk8s-plus-27.LabelSelector)

---


#### Properties <a name="Properties"></a>

##### `connections`<sup>Required</sup> <a name="cdk8s-plus-27.Workload.property.connections"></a>

```typescript
public readonly connections: PodConnections;
```

- *Type:* [`cdk8s-plus-27.PodConnections`](#cdk8s-plus-27.PodConnections)

---

##### `matchExpressions`<sup>Required</sup> <a name="cdk8s-plus-27.Workload.property.matchExpressions"></a>

```typescript
public readonly matchExpressions: LabelSelectorRequirement[];
```

- *Type:* [`cdk8s-plus-27.LabelSelectorRequirement`](#cdk8s-plus-27.LabelSelectorRequirement)[]

The expression matchers this workload will use in order to select pods.

Returns a a copy. Use `select()` to add expression matchers.

---

##### `matchLabels`<sup>Required</sup> <a name="cdk8s-plus-27.Workload.property.matchLabels"></a>

```typescript
public readonly matchLabels: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}

The label matchers this workload will use in order to select pods.

Returns a a copy. Use `select()` to add label matchers.

---

##### `podMetadata`<sup>Required</sup> <a name="cdk8s-plus-27.Workload.property.podMetadata"></a>

```typescript
public readonly podMetadata: ApiObjectMetadataDefinition;
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

The metadata of pods in this workload.

---

##### `scheduling`<sup>Required</sup> <a name="cdk8s-plus-27.Workload.property.scheduling"></a>

```typescript
public readonly scheduling: WorkloadScheduling;
```

- *Type:* [`cdk8s-plus-27.WorkloadScheduling`](#cdk8s-plus-27.WorkloadScheduling)

---


## Structs <a name="Structs"></a>

### AbstractPodProps <a name="cdk8s-plus-27.AbstractPodProps"></a>

Properties for `AbstractPod`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { AbstractPodProps } from 'cdk8s-plus-27'

const abstractPodProps: AbstractPodProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.automountServiceAccountToken"></a>

```typescript
public readonly automountServiceAccountToken: boolean;
```

- *Type:* `boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.containers"></a>

```typescript
public readonly containers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.dns"></a>

```typescript
public readonly dns: PodDnsProps;
```

- *Type:* [`cdk8s-plus-27.PodDnsProps`](#cdk8s-plus-27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.dockerRegistryAuth"></a>

```typescript
public readonly dockerRegistryAuth: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.hostAliases"></a>

```typescript
public readonly hostAliases: HostAlias[];
```

- *Type:* [`cdk8s-plus-27.HostAlias`](#cdk8s-plus-27.HostAlias)[]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.hostNetwork"></a>

```typescript
public readonly hostNetwork: boolean;
```

- *Type:* `boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.initContainers"></a>

```typescript
public readonly initContainers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.isolate"></a>

```typescript
public readonly isolate: boolean;
```

- *Type:* `boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.restartPolicy"></a>

```typescript
public readonly restartPolicy: RestartPolicy;
```

- *Type:* [`cdk8s-plus-27.RestartPolicy`](#cdk8s-plus-27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.securityContext"></a>

```typescript
public readonly securityContext: PodSecurityContextProps;
```

- *Type:* [`cdk8s-plus-27.PodSecurityContextProps`](#cdk8s-plus-27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.serviceAccount"></a>

```typescript
public readonly serviceAccount: IServiceAccount;
```

- *Type:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)
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

##### `terminationGracePeriod`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.terminationGracePeriod"></a>

```typescript
public readonly terminationGracePeriod: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s-plus-27.AbstractPodProps.property.volumes"></a>

```typescript
public readonly volumes: Volume[];
```

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)[]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

### AddDeploymentOptions <a name="cdk8s-plus-27.AddDeploymentOptions"></a>

Options to add a deployment to a service.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { AddDeploymentOptions } from 'cdk8s-plus-27'

const addDeploymentOptions: AddDeploymentOptions = { ... }
```

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.AddDeploymentOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

##### `nodePort`<sup>Optional</sup> <a name="cdk8s-plus-27.AddDeploymentOptions.property.nodePort"></a>

```typescript
public readonly nodePort: number;
```

- *Type:* `number`
- *Default:* auto-allocate a port if the ServiceType of this Service requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s-plus-27.AddDeploymentOptions.property.protocol"></a>

```typescript
public readonly protocol: Protocol;
```

- *Type:* [`cdk8s-plus-27.Protocol`](#cdk8s-plus-27.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `targetPort`<sup>Optional</sup> <a name="cdk8s-plus-27.AddDeploymentOptions.property.targetPort"></a>

```typescript
public readonly targetPort: number;
```

- *Type:* `number`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

##### `port`<sup>Optional</sup> <a name="cdk8s-plus-27.AddDeploymentOptions.property.port"></a>

```typescript
public readonly port: number;
```

- *Type:* `number`
- *Default:* Copied from the first container of the deployment.

The port number the service will bind to.

---

### AddDirectoryOptions <a name="cdk8s-plus-27.AddDirectoryOptions"></a>

Options for `configmap.addDirectory()`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { AddDirectoryOptions } from 'cdk8s-plus-27'

const addDirectoryOptions: AddDirectoryOptions = { ... }
```

##### `exclude`<sup>Optional</sup> <a name="cdk8s-plus-27.AddDirectoryOptions.property.exclude"></a>

```typescript
public readonly exclude: string[];
```

- *Type:* `string`[]
- *Default:* include all files

Glob patterns to exclude when adding files.

---

##### `keyPrefix`<sup>Optional</sup> <a name="cdk8s-plus-27.AddDirectoryOptions.property.keyPrefix"></a>

```typescript
public readonly keyPrefix: string;
```

- *Type:* `string`
- *Default:* ""

A prefix to add to all keys in the config map.

---

### ApiResourceOptions <a name="cdk8s-plus-27.ApiResourceOptions"></a>

Options for `ApiResource`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ApiResourceOptions } from 'cdk8s-plus-27'

const apiResourceOptions: ApiResourceOptions = { ... }
```

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.ApiResourceOptions.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.ApiResourceOptions.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of the resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

### AwsElasticBlockStorePersistentVolumeProps <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps"></a>

Properties for `AwsElasticBlockStorePersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { AwsElasticBlockStorePersistentVolumeProps } from 'cdk8s-plus-27'

const awsElasticBlockStorePersistentVolumeProps: AwsElasticBlockStorePersistentVolumeProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.accessModes"></a>

```typescript
public readonly accessModes: PersistentVolumeAccessMode[];
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeAccessMode`](#cdk8s-plus-27.PersistentVolumeAccessMode)[]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.claim"></a>

```typescript
public readonly claim: IPersistentVolumeClaim;
```

- *Type:* [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.mountOptions"></a>

```typescript
public readonly mountOptions: string[];
```

- *Type:* `string`[]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.reclaimPolicy"></a>

```typescript
public readonly reclaimPolicy: PersistentVolumeReclaimPolicy;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeReclaimPolicy`](#cdk8s-plus-27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.storage"></a>

```typescript
public readonly storage: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.storageClassName"></a>

```typescript
public readonly storageClassName: string;
```

- *Type:* `string`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.volumeMode"></a>

```typescript
public readonly volumeMode: PersistentVolumeMode;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeMode`](#cdk8s-plus-27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `volumeId`<sup>Required</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.volumeId"></a>

```typescript
public readonly volumeId: string;
```

- *Type:* `string`

Unique ID of the persistent disk resource in AWS (Amazon EBS volume).

More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `fsType`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.fsType"></a>

```typescript
public readonly fsType: string;
```

- *Type:* `string`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `partition`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.partition"></a>

```typescript
public readonly partition: number;
```

- *Type:* `number`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStorePersistentVolumeProps.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### AwsElasticBlockStoreVolumeOptions <a name="cdk8s-plus-27.AwsElasticBlockStoreVolumeOptions"></a>

Options of `Volume.fromAwsElasticBlockStore`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { AwsElasticBlockStoreVolumeOptions } from 'cdk8s-plus-27'

const awsElasticBlockStoreVolumeOptions: AwsElasticBlockStoreVolumeOptions = { ... }
```

##### `fsType`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStoreVolumeOptions.property.fsType"></a>

```typescript
public readonly fsType: string;
```

- *Type:* `string`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStoreVolumeOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* auto-generated

The volume name.

---

##### `partition`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStoreVolumeOptions.property.partition"></a>

```typescript
public readonly partition: number;
```

- *Type:* `number`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.AwsElasticBlockStoreVolumeOptions.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### AzureDiskPersistentVolumeProps <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps"></a>

Properties for `AzureDiskPersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { AzureDiskPersistentVolumeProps } from 'cdk8s-plus-27'

const azureDiskPersistentVolumeProps: AzureDiskPersistentVolumeProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.accessModes"></a>

```typescript
public readonly accessModes: PersistentVolumeAccessMode[];
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeAccessMode`](#cdk8s-plus-27.PersistentVolumeAccessMode)[]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.claim"></a>

```typescript
public readonly claim: IPersistentVolumeClaim;
```

- *Type:* [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.mountOptions"></a>

```typescript
public readonly mountOptions: string[];
```

- *Type:* `string`[]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.reclaimPolicy"></a>

```typescript
public readonly reclaimPolicy: PersistentVolumeReclaimPolicy;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeReclaimPolicy`](#cdk8s-plus-27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.storage"></a>

```typescript
public readonly storage: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.storageClassName"></a>

```typescript
public readonly storageClassName: string;
```

- *Type:* `string`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.volumeMode"></a>

```typescript
public readonly volumeMode: PersistentVolumeMode;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeMode`](#cdk8s-plus-27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `diskName`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.diskName"></a>

```typescript
public readonly diskName: string;
```

- *Type:* `string`

The Name of the data disk in the blob storage.

---

##### `diskUri`<sup>Required</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.diskUri"></a>

```typescript
public readonly diskUri: string;
```

- *Type:* `string`

The URI the data disk in the blob storage.

---

##### `cachingMode`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.cachingMode"></a>

```typescript
public readonly cachingMode: AzureDiskPersistentVolumeCachingMode;
```

- *Type:* [`cdk8s-plus-27.AzureDiskPersistentVolumeCachingMode`](#cdk8s-plus-27.AzureDiskPersistentVolumeCachingMode)
- *Default:* AzureDiskPersistentVolumeCachingMode.NONE.

Host Caching mode.

---

##### `fsType`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.fsType"></a>

```typescript
public readonly fsType: string;
```

- *Type:* `string`
- *Default:* 'ext4'

Filesystem type to mount.

Must be a filesystem type supported by the host operating system.

---

##### `kind`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.kind"></a>

```typescript
public readonly kind: AzureDiskPersistentVolumeKind;
```

- *Type:* [`cdk8s-plus-27.AzureDiskPersistentVolumeKind`](#cdk8s-plus-27.AzureDiskPersistentVolumeKind)
- *Default:* AzureDiskPersistentVolumeKind.SHARED

Kind of disk.

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskPersistentVolumeProps.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

Force the ReadOnly setting in VolumeMounts.

---

### AzureDiskVolumeOptions <a name="cdk8s-plus-27.AzureDiskVolumeOptions"></a>

Options of `Volume.fromAzureDisk`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { AzureDiskVolumeOptions } from 'cdk8s-plus-27'

const azureDiskVolumeOptions: AzureDiskVolumeOptions = { ... }
```

##### `cachingMode`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskVolumeOptions.property.cachingMode"></a>

```typescript
public readonly cachingMode: AzureDiskPersistentVolumeCachingMode;
```

- *Type:* [`cdk8s-plus-27.AzureDiskPersistentVolumeCachingMode`](#cdk8s-plus-27.AzureDiskPersistentVolumeCachingMode)
- *Default:* AzureDiskPersistentVolumeCachingMode.NONE.

Host Caching mode.

---

##### `fsType`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskVolumeOptions.property.fsType"></a>

```typescript
public readonly fsType: string;
```

- *Type:* `string`
- *Default:* 'ext4'

Filesystem type to mount.

Must be a filesystem type supported by the host operating system.

---

##### `kind`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskVolumeOptions.property.kind"></a>

```typescript
public readonly kind: AzureDiskPersistentVolumeKind;
```

- *Type:* [`cdk8s-plus-27.AzureDiskPersistentVolumeKind`](#cdk8s-plus-27.AzureDiskPersistentVolumeKind)
- *Default:* AzureDiskPersistentVolumeKind.SHARED

Kind of disk.

---

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskVolumeOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* auto-generated

The volume name.

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.AzureDiskVolumeOptions.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

Force the ReadOnly setting in VolumeMounts.

---

### BasicAuthSecretProps <a name="cdk8s-plus-27.BasicAuthSecretProps"></a>

Options for `BasicAuthSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { BasicAuthSecretProps } from 'cdk8s-plus-27'

const basicAuthSecretProps: BasicAuthSecretProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.BasicAuthSecretProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s-plus-27.BasicAuthSecretProps.property.immutable"></a>

```typescript
public readonly immutable: boolean;
```

- *Type:* `boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `password`<sup>Required</sup> <a name="cdk8s-plus-27.BasicAuthSecretProps.property.password"></a>

```typescript
public readonly password: string;
```

- *Type:* `string`

The password or token for authentication.

---

##### `username`<sup>Required</sup> <a name="cdk8s-plus-27.BasicAuthSecretProps.property.username"></a>

```typescript
public readonly username: string;
```

- *Type:* `string`

The user name for authentication.

---

### ClusterRoleBindingProps <a name="cdk8s-plus-27.ClusterRoleBindingProps"></a>

Properties for `ClusterRoleBinding`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ClusterRoleBindingProps } from 'cdk8s-plus-27'

const clusterRoleBindingProps: ClusterRoleBindingProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.ClusterRoleBindingProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `role`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRoleBindingProps.property.role"></a>

```typescript
public readonly role: IClusterRole;
```

- *Type:* [`cdk8s-plus-27.IClusterRole`](#cdk8s-plus-27.IClusterRole)

The role to bind to.

---

### ClusterRolePolicyRule <a name="cdk8s-plus-27.ClusterRolePolicyRule"></a>

Policy rule of a `ClusterRole.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ClusterRolePolicyRule } from 'cdk8s-plus-27'

const clusterRolePolicyRule: ClusterRolePolicyRule = { ... }
```

##### `endpoints`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRolePolicyRule.property.endpoints"></a>

```typescript
public readonly endpoints: IApiEndpoint[];
```

- *Type:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)[]

Endpoints this rule applies to.

Can be either api resources
or non api resources.

---

##### `verbs`<sup>Required</sup> <a name="cdk8s-plus-27.ClusterRolePolicyRule.property.verbs"></a>

```typescript
public readonly verbs: string[];
```

- *Type:* `string`[]

Verbs to allow.

(e.g ['get', 'watch'])

---

### ClusterRoleProps <a name="cdk8s-plus-27.ClusterRoleProps"></a>

Properties for `ClusterRole`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ClusterRoleProps } from 'cdk8s-plus-27'

const clusterRoleProps: ClusterRoleProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.ClusterRoleProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `aggregationLabels`<sup>Optional</sup> <a name="cdk8s-plus-27.ClusterRoleProps.property.aggregationLabels"></a>

```typescript
public readonly aggregationLabels: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}

Specify labels that should be used to locate ClusterRoles, whose rules will be automatically filled into this ClusterRole's rules.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s-plus-27.ClusterRoleProps.property.rules"></a>

```typescript
public readonly rules: ClusterRolePolicyRule[];
```

- *Type:* [`cdk8s-plus-27.ClusterRolePolicyRule`](#cdk8s-plus-27.ClusterRolePolicyRule)[]
- *Default:* []

A list of rules the role should allow.

---

### CommandProbeOptions <a name="cdk8s-plus-27.CommandProbeOptions"></a>

Options for `Probe.fromCommand()`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { CommandProbeOptions } from 'cdk8s-plus-27'

const commandProbeOptions: CommandProbeOptions = { ... }
```

##### `failureThreshold`<sup>Optional</sup> <a name="cdk8s-plus-27.CommandProbeOptions.property.failureThreshold"></a>

```typescript
public readonly failureThreshold: number;
```

- *Type:* `number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.CommandProbeOptions.property.initialDelaySeconds"></a>

```typescript
public readonly initialDelaySeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.CommandProbeOptions.property.periodSeconds"></a>

```typescript
public readonly periodSeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="cdk8s-plus-27.CommandProbeOptions.property.successThreshold"></a>

```typescript
public readonly successThreshold: number;
```

- *Type:* `number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.CommandProbeOptions.property.timeoutSeconds"></a>

```typescript
public readonly timeoutSeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

### CommonSecretProps <a name="cdk8s-plus-27.CommonSecretProps"></a>

Common properties for `Secret`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { CommonSecretProps } from 'cdk8s-plus-27'

const commonSecretProps: CommonSecretProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.CommonSecretProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s-plus-27.CommonSecretProps.property.immutable"></a>

```typescript
public readonly immutable: boolean;
```

- *Type:* `boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

### ConfigMapProps <a name="cdk8s-plus-27.ConfigMapProps"></a>

Properties for initialization of `ConfigMap`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ConfigMapProps } from 'cdk8s-plus-27'

const configMapProps: ConfigMapProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMapProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `binaryData`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMapProps.property.binaryData"></a>

```typescript
public readonly binaryData: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}

BinaryData contains the binary data.

Each key must consist of alphanumeric characters, '-', '_' or '.'.
BinaryData can contain byte sequences that are not in the UTF-8 range. The
keys stored in BinaryData must not overlap with the ones in the Data field,
this is enforced during validation process.

You can also add binary data using `configMap.addBinaryData()`.

---

##### `data`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMapProps.property.data"></a>

```typescript
public readonly data: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}

Data contains the configuration data.

Each key must consist of alphanumeric characters, '-', '_' or '.'. Values
with non-UTF-8 byte sequences must use the BinaryData field. The keys
stored in Data must not overlap with the keys in the BinaryData field, this
is enforced during validation process.

You can also add data using `configMap.addData()`.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMapProps.property.immutable"></a>

```typescript
public readonly immutable: boolean;
```

- *Type:* `boolean`
- *Default:* false

If set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

### ConfigMapVolumeOptions <a name="cdk8s-plus-27.ConfigMapVolumeOptions"></a>

Options for the ConfigMap-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ConfigMapVolumeOptions } from 'cdk8s-plus-27'

const configMapVolumeOptions: ConfigMapVolumeOptions = { ... }
```

##### `defaultMode`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMapVolumeOptions.property.defaultMode"></a>

```typescript
public readonly defaultMode: number;
```

- *Type:* `number`
- *Default:* 0644. Directories within the path are not affected by this
setting. This might be in conflict with other options that affect the file
mode, like fsGroup, and the result can be other mode bits set.

Mode bits to use on created files by default.

Must be a value between 0 and
0777. Defaults to 0644. Directories within the path are not affected by
this setting. This might be in conflict with other options that affect the
file mode, like fsGroup, and the result can be other mode bits set.

---

##### `items`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMapVolumeOptions.property.items"></a>

```typescript
public readonly items: {[ key: string ]: PathMapping};
```

- *Type:* {[ key: string ]: [`cdk8s-plus-27.PathMapping`](#cdk8s-plus-27.PathMapping)}
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the ConfigMap, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMapVolumeOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* auto-generated

The volume name.

---

##### `optional`<sup>Optional</sup> <a name="cdk8s-plus-27.ConfigMapVolumeOptions.property.optional"></a>

```typescript
public readonly optional: boolean;
```

- *Type:* `boolean`
- *Default:* undocumented

Specify whether the ConfigMap or its keys must be defined.

---

### ContainerLifecycle <a name="cdk8s-plus-27.ContainerLifecycle"></a>

Container lifecycle properties.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ContainerLifecycle } from 'cdk8s-plus-27'

const containerLifecycle: ContainerLifecycle = { ... }
```

##### `postStart`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerLifecycle.property.postStart"></a>

```typescript
public readonly postStart: Handler;
```

- *Type:* [`cdk8s-plus-27.Handler`](#cdk8s-plus-27.Handler)
- *Default:* No post start handler.

This hook is executed immediately after a container is created.

However,
there is no guarantee that the hook will execute before the container ENTRYPOINT.

---

##### `preStop`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerLifecycle.property.preStop"></a>

```typescript
public readonly preStop: Handler;
```

- *Type:* [`cdk8s-plus-27.Handler`](#cdk8s-plus-27.Handler)
- *Default:* No pre stop handler.

This hook is called immediately before a container is terminated due to an API request or management event such as a liveness/startup probe failure, preemption, resource contention and others.

A call to the PreStop hook fails if the container is already in a terminated or completed state
and the hook must complete before the TERM signal to stop the container can be sent.
The Pod's termination grace period countdown begins before the PreStop hook is executed,
so regardless of the outcome of the handler, the container will eventually terminate
within the Pod's termination grace period. No parameters are passed to the handler.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#pod-termination

---

### ContainerOpts <a name="cdk8s-plus-27.ContainerOpts"></a>

Optional properties of a container.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ContainerOpts } from 'cdk8s-plus-27'

const containerOpts: ContainerOpts = { ... }
```

##### `args`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.args"></a>

```typescript
public readonly args: string[];
```

- *Type:* `string`[]
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

##### `command`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.command"></a>

```typescript
public readonly command: string[];
```

- *Type:* `string`[]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `envFrom`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.envFrom"></a>

```typescript
public readonly envFrom: EnvFrom[];
```

- *Type:* [`cdk8s-plus-27.EnvFrom`](#cdk8s-plus-27.EnvFrom)[]
- *Default:* No sources.

List of sources to populate environment variables in the container.

When a key exists in multiple sources, the value associated with
the last source will take precedence. Values defined by the `envVariables` property
with a duplicate key will take precedence.

---

##### `envVariables`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.envVariables"></a>

```typescript
public readonly envVariables: {[ key: string ]: EnvValue};
```

- *Type:* {[ key: string ]: [`cdk8s-plus-27.EnvValue`](#cdk8s-plus-27.EnvValue)}
- *Default:* No environment variables.

Environment variables to set in the container.

---

##### `imagePullPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.imagePullPolicy"></a>

```typescript
public readonly imagePullPolicy: ImagePullPolicy;
```

- *Type:* [`cdk8s-plus-27.ImagePullPolicy`](#cdk8s-plus-27.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `lifecycle`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.lifecycle"></a>

```typescript
public readonly lifecycle: ContainerLifecycle;
```

- *Type:* [`cdk8s-plus-27.ContainerLifecycle`](#cdk8s-plus-27.ContainerLifecycle)

Describes actions that the management system should take in response to container lifecycle events.

---

##### `liveness`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.liveness"></a>

```typescript
public readonly liveness: Probe;
```

- *Type:* [`cdk8s-plus-27.Probe`](#cdk8s-plus-27.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### ~~`port`~~<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.port"></a>

- *Deprecated:* - use `portNumber`.

```typescript
public readonly port: number;
```

- *Type:* `number`

---

##### `portNumber`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.portNumber"></a>

```typescript
public readonly portNumber: number;
```

- *Type:* `number`
- *Default:* Only the ports mentiond in the `ports` property are exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

This is a convinience property if all you need a single TCP numbered port.
In case more advanced configuartion is required, use the `ports` property.

This port is added to the list of ports mentioned in the `ports` property.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.ports"></a>

```typescript
public readonly ports: ContainerPort[];
```

- *Type:* [`cdk8s-plus-27.ContainerPort`](#cdk8s-plus-27.ContainerPort)[]
- *Default:* Only the port mentioned in the `portNumber` property is exposed.

List of ports to expose from this container.

---

##### `readiness`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.readiness"></a>

```typescript
public readonly readiness: Probe;
```

- *Type:* [`cdk8s-plus-27.Probe`](#cdk8s-plus-27.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `resources`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.resources"></a>

```typescript
public readonly resources: ContainerResources;
```

- *Type:* [`cdk8s-plus-27.ContainerResources`](#cdk8s-plus-27.ContainerResources)
- *Default:* cpu:
     request: 1000 millis
     limit: 1500 millis
   memory:
     request: 512 mebibytes
     limit: 2048 mebibytes

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `securityContext`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.securityContext"></a>

```typescript
public readonly securityContext: ContainerSecurityContextProps;
```

- *Type:* [`cdk8s-plus-27.ContainerSecurityContextProps`](#cdk8s-plus-27.ContainerSecurityContextProps)
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

##### `startup`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.startup"></a>

```typescript
public readonly startup: Probe;
```

- *Type:* [`cdk8s-plus-27.Probe`](#cdk8s-plus-27.Probe)
- *Default:* If a port is provided, then knocks on that port
to determine when the container is ready for readiness and
liveness probe checks.
Otherwise, no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volumeMounts`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.volumeMounts"></a>

```typescript
public readonly volumeMounts: VolumeMount[];
```

- *Type:* [`cdk8s-plus-27.VolumeMount`](#cdk8s-plus-27.VolumeMount)[]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `workingDir`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerOpts.property.workingDir"></a>

```typescript
public readonly workingDir: string;
```

- *Type:* `string`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

### ContainerPort <a name="cdk8s-plus-27.ContainerPort"></a>

Represents a network port in a single container.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ContainerPort } from 'cdk8s-plus-27'

const containerPort: ContainerPort = { ... }
```

##### `number`<sup>Required</sup> <a name="cdk8s-plus-27.ContainerPort.property.number"></a>

```typescript
public readonly number: number;
```

- *Type:* `number`

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

##### `hostIp`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerPort.property.hostIp"></a>

```typescript
public readonly hostIp: string;
```

- *Type:* `string`
- *Default:* 127.0.0.1.

What host IP to bind the external port to.

---

##### `hostPort`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerPort.property.hostPort"></a>

```typescript
public readonly hostPort: number;
```

- *Type:* `number`
- *Default:* auto generated by kubernetes and might change on restarts.

Number of port to expose on the host.

If specified, this must be a valid port number, 0 < x < 65536.
Most containers do not need this.

---

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerPort.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* port is not named.

If specified, this must be an IANA_SVC_NAME and unique within the pod.

Each named port in a pod must have a unique name.
Name for the port that can be referred to by services.

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerPort.property.protocol"></a>

```typescript
public readonly protocol: Protocol;
```

- *Type:* [`cdk8s-plus-27.Protocol`](#cdk8s-plus-27.Protocol)
- *Default:* Protocol.TCP

Protocol for port.

Must be UDP, TCP, or SCTP. Defaults to "TCP".

---

### ContainerProps <a name="cdk8s-plus-27.ContainerProps"></a>

Properties for creating a container.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ContainerProps } from 'cdk8s-plus-27'

const containerProps: ContainerProps = { ... }
```

##### `args`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.args"></a>

```typescript
public readonly args: string[];
```

- *Type:* `string`[]
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

##### `command`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.command"></a>

```typescript
public readonly command: string[];
```

- *Type:* `string`[]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `envFrom`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.envFrom"></a>

```typescript
public readonly envFrom: EnvFrom[];
```

- *Type:* [`cdk8s-plus-27.EnvFrom`](#cdk8s-plus-27.EnvFrom)[]
- *Default:* No sources.

List of sources to populate environment variables in the container.

When a key exists in multiple sources, the value associated with
the last source will take precedence. Values defined by the `envVariables` property
with a duplicate key will take precedence.

---

##### `envVariables`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.envVariables"></a>

```typescript
public readonly envVariables: {[ key: string ]: EnvValue};
```

- *Type:* {[ key: string ]: [`cdk8s-plus-27.EnvValue`](#cdk8s-plus-27.EnvValue)}
- *Default:* No environment variables.

Environment variables to set in the container.

---

##### `imagePullPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.imagePullPolicy"></a>

```typescript
public readonly imagePullPolicy: ImagePullPolicy;
```

- *Type:* [`cdk8s-plus-27.ImagePullPolicy`](#cdk8s-plus-27.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `lifecycle`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.lifecycle"></a>

```typescript
public readonly lifecycle: ContainerLifecycle;
```

- *Type:* [`cdk8s-plus-27.ContainerLifecycle`](#cdk8s-plus-27.ContainerLifecycle)

Describes actions that the management system should take in response to container lifecycle events.

---

##### `liveness`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.liveness"></a>

```typescript
public readonly liveness: Probe;
```

- *Type:* [`cdk8s-plus-27.Probe`](#cdk8s-plus-27.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### ~~`port`~~<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.port"></a>

- *Deprecated:* - use `portNumber`.

```typescript
public readonly port: number;
```

- *Type:* `number`

---

##### `portNumber`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.portNumber"></a>

```typescript
public readonly portNumber: number;
```

- *Type:* `number`
- *Default:* Only the ports mentiond in the `ports` property are exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

This is a convinience property if all you need a single TCP numbered port.
In case more advanced configuartion is required, use the `ports` property.

This port is added to the list of ports mentioned in the `ports` property.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.ports"></a>

```typescript
public readonly ports: ContainerPort[];
```

- *Type:* [`cdk8s-plus-27.ContainerPort`](#cdk8s-plus-27.ContainerPort)[]
- *Default:* Only the port mentioned in the `portNumber` property is exposed.

List of ports to expose from this container.

---

##### `readiness`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.readiness"></a>

```typescript
public readonly readiness: Probe;
```

- *Type:* [`cdk8s-plus-27.Probe`](#cdk8s-plus-27.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `resources`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.resources"></a>

```typescript
public readonly resources: ContainerResources;
```

- *Type:* [`cdk8s-plus-27.ContainerResources`](#cdk8s-plus-27.ContainerResources)
- *Default:* cpu:
     request: 1000 millis
     limit: 1500 millis
   memory:
     request: 512 mebibytes
     limit: 2048 mebibytes

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `securityContext`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.securityContext"></a>

```typescript
public readonly securityContext: ContainerSecurityContextProps;
```

- *Type:* [`cdk8s-plus-27.ContainerSecurityContextProps`](#cdk8s-plus-27.ContainerSecurityContextProps)
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

##### `startup`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.startup"></a>

```typescript
public readonly startup: Probe;
```

- *Type:* [`cdk8s-plus-27.Probe`](#cdk8s-plus-27.Probe)
- *Default:* If a port is provided, then knocks on that port
to determine when the container is ready for readiness and
liveness probe checks.
Otherwise, no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volumeMounts`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.volumeMounts"></a>

```typescript
public readonly volumeMounts: VolumeMount[];
```

- *Type:* [`cdk8s-plus-27.VolumeMount`](#cdk8s-plus-27.VolumeMount)[]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `workingDir`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerProps.property.workingDir"></a>

```typescript
public readonly workingDir: string;
```

- *Type:* `string`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `image`<sup>Required</sup> <a name="cdk8s-plus-27.ContainerProps.property.image"></a>

```typescript
public readonly image: string;
```

- *Type:* `string`

Docker image name.

---

### ContainerResources <a name="cdk8s-plus-27.ContainerResources"></a>

CPU and memory compute resources.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ContainerResources } from 'cdk8s-plus-27'

const containerResources: ContainerResources = { ... }
```

##### `cpu`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerResources.property.cpu"></a>

```typescript
public readonly cpu: CpuResources;
```

- *Type:* [`cdk8s-plus-27.CpuResources`](#cdk8s-plus-27.CpuResources)

---

##### `ephemeralStorage`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerResources.property.ephemeralStorage"></a>

```typescript
public readonly ephemeralStorage: EphemeralStorageResources;
```

- *Type:* [`cdk8s-plus-27.EphemeralStorageResources`](#cdk8s-plus-27.EphemeralStorageResources)

---

##### `memory`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerResources.property.memory"></a>

```typescript
public readonly memory: MemoryResources;
```

- *Type:* [`cdk8s-plus-27.MemoryResources`](#cdk8s-plus-27.MemoryResources)

---

### ContainerSecurityContextProps <a name="cdk8s-plus-27.ContainerSecurityContextProps"></a>

Properties for `ContainerSecurityContext`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ContainerSecurityContextProps } from 'cdk8s-plus-27'

const containerSecurityContextProps: ContainerSecurityContextProps = { ... }
```

##### `allowPrivilegeEscalation`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerSecurityContextProps.property.allowPrivilegeEscalation"></a>

```typescript
public readonly allowPrivilegeEscalation: boolean;
```

- *Type:* `boolean`
- *Default:* false

Whether a process can gain more privileges than its parent process.

---

##### `ensureNonRoot`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerSecurityContextProps.property.ensureNonRoot"></a>

```typescript
public readonly ensureNonRoot: boolean;
```

- *Type:* `boolean`
- *Default:* true

Indicates that the container must run as a non-root user.

If true, the Kubelet will validate the image at runtime to ensure that it does
not run as UID 0 (root) and fail to start the container if it does.

---

##### `group`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerSecurityContextProps.property.group"></a>

```typescript
public readonly group: number;
```

- *Type:* `number`
- *Default:* 26000. An arbitrary number bigger than 9999 is selected here.
This is so that the container is blocked to access host files even if
somehow it manages to get access to host file system.

The GID to run the entrypoint of the container process.

---

##### `privileged`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerSecurityContextProps.property.privileged"></a>

```typescript
public readonly privileged: boolean;
```

- *Type:* `boolean`
- *Default:* false

Run container in privileged mode.

Processes in privileged containers are essentially equivalent to root on the host.

---

##### `readOnlyRootFilesystem`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerSecurityContextProps.property.readOnlyRootFilesystem"></a>

```typescript
public readonly readOnlyRootFilesystem: boolean;
```

- *Type:* `boolean`
- *Default:* true

Whether this container has a read-only root filesystem.

---

##### `user`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerSecurityContextProps.property.user"></a>

```typescript
public readonly user: number;
```

- *Type:* `number`
- *Default:* 25000. An arbitrary number bigger than 9999 is selected here.
This is so that the container is blocked to access host files even if
somehow it manages to get access to host file system.

The UID to run the entrypoint of the container process.

---

### CpuResources <a name="cdk8s-plus-27.CpuResources"></a>

CPU request and limit.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { CpuResources } from 'cdk8s-plus-27'

const cpuResources: CpuResources = { ... }
```

##### `limit`<sup>Optional</sup> <a name="cdk8s-plus-27.CpuResources.property.limit"></a>

```typescript
public readonly limit: Cpu;
```

- *Type:* [`cdk8s-plus-27.Cpu`](#cdk8s-plus-27.Cpu)

---

##### `request`<sup>Optional</sup> <a name="cdk8s-plus-27.CpuResources.property.request"></a>

```typescript
public readonly request: Cpu;
```

- *Type:* [`cdk8s-plus-27.Cpu`](#cdk8s-plus-27.Cpu)

---

### CronJobProps <a name="cdk8s-plus-27.CronJobProps"></a>

Properties for `CronJob`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { CronJobProps } from 'cdk8s-plus-27'

const cronJobProps: CronJobProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.automountServiceAccountToken"></a>

```typescript
public readonly automountServiceAccountToken: boolean;
```

- *Type:* `boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.containers"></a>

```typescript
public readonly containers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.dns"></a>

```typescript
public readonly dns: PodDnsProps;
```

- *Type:* [`cdk8s-plus-27.PodDnsProps`](#cdk8s-plus-27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.dockerRegistryAuth"></a>

```typescript
public readonly dockerRegistryAuth: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.hostAliases"></a>

```typescript
public readonly hostAliases: HostAlias[];
```

- *Type:* [`cdk8s-plus-27.HostAlias`](#cdk8s-plus-27.HostAlias)[]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.hostNetwork"></a>

```typescript
public readonly hostNetwork: boolean;
```

- *Type:* `boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.initContainers"></a>

```typescript
public readonly initContainers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.isolate"></a>

```typescript
public readonly isolate: boolean;
```

- *Type:* `boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.restartPolicy"></a>

```typescript
public readonly restartPolicy: RestartPolicy;
```

- *Type:* [`cdk8s-plus-27.RestartPolicy`](#cdk8s-plus-27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.securityContext"></a>

```typescript
public readonly securityContext: PodSecurityContextProps;
```

- *Type:* [`cdk8s-plus-27.PodSecurityContextProps`](#cdk8s-plus-27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.serviceAccount"></a>

```typescript
public readonly serviceAccount: IServiceAccount;
```

- *Type:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)
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

##### `terminationGracePeriod`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.terminationGracePeriod"></a>

```typescript
public readonly terminationGracePeriod: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.volumes"></a>

```typescript
public readonly volumes: Volume[];
```

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)[]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.podMetadata"></a>

```typescript
public readonly podMetadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.select"></a>

```typescript
public readonly select: boolean;
```

- *Type:* `boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.spread"></a>

```typescript
public readonly spread: boolean;
```

- *Type:* `boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `activeDeadline`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.activeDeadline"></a>

```typescript
public readonly activeDeadline: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoffLimit`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.backoffLimit"></a>

```typescript
public readonly backoffLimit: number;
```

- *Type:* `number`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.ttlAfterFinished"></a>

```typescript
public readonly ttlAfterFinished: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* If this field is unset, the Job won't be automatically deleted.

Limits the lifetime of a Job that has finished execution (either Complete or Failed).

If this field is set, after the Job finishes, it is eligible to
be automatically deleted. When the Job is being deleted, its lifecycle
guarantees (e.g. finalizers) will be honored. If this field is set to zero,
the Job becomes eligible to be deleted immediately after it finishes. This
field is alpha-level and is only honored by servers that enable the
`TTLAfterFinished` feature.

---

##### `schedule`<sup>Required</sup> <a name="cdk8s-plus-27.CronJobProps.property.schedule"></a>

```typescript
public readonly schedule: Cron;
```

- *Type:* [`cdk8s.Cron`](#cdk8s.Cron)

Specifies the time in which the job would run again.

This is defined as a cron expression in the CronJob resource.

---

##### `concurrencyPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.concurrencyPolicy"></a>

```typescript
public readonly concurrencyPolicy: ConcurrencyPolicy;
```

- *Type:* [`cdk8s-plus-27.ConcurrencyPolicy`](#cdk8s-plus-27.ConcurrencyPolicy)
- *Default:* ConcurrencyPolicy.Forbid

Specifies the concurrency policy for the job.

---

##### `failedJobsRetained`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.failedJobsRetained"></a>

```typescript
public readonly failedJobsRetained: number;
```

- *Type:* `number`
- *Default:* 1

Specifies the number of failed jobs history retained.

This would retain the Job and the associated Pod resource and can be useful for debugging.

---

##### `startingDeadline`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.startingDeadline"></a>

```typescript
public readonly startingDeadline: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
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

##### `successfulJobsRetained`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.successfulJobsRetained"></a>

```typescript
public readonly successfulJobsRetained: number;
```

- *Type:* `number`
- *Default:* 3

Specifies the number of successful jobs history retained.

This would retain the Job and the associated Pod resource and can be useful for debugging.

---

##### `suspend`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.suspend"></a>

```typescript
public readonly suspend: boolean;
```

- *Type:* `boolean`
- *Default:* false

Specifies if the cron job should be suspended.

Only applies to future executions, current ones are remained untouched.

---

##### `timeZone`<sup>Optional</sup> <a name="cdk8s-plus-27.CronJobProps.property.timeZone"></a>

```typescript
public readonly timeZone: string;
```

- *Type:* `string`
- *Default:* Timezone of kube-controller-manager process.

Specifies the timezone for the job.

This helps aligining the schedule to follow the specified timezone.

> {@link https://en.wikipedia.org/wiki/List_of_tz_database_time_zones} for list of valid timezone values.

---

### CsiVolumeOptions <a name="cdk8s-plus-27.CsiVolumeOptions"></a>

Options for the CSI driver based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { CsiVolumeOptions } from 'cdk8s-plus-27'

const csiVolumeOptions: CsiVolumeOptions = { ... }
```

##### `attributes`<sup>Optional</sup> <a name="cdk8s-plus-27.CsiVolumeOptions.property.attributes"></a>

```typescript
public readonly attributes: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}
- *Default:* undefined

Any driver-specific attributes to pass to the CSI volume builder.

---

##### `fsType`<sup>Optional</sup> <a name="cdk8s-plus-27.CsiVolumeOptions.property.fsType"></a>

```typescript
public readonly fsType: string;
```

- *Type:* `string`
- *Default:* driver-dependent

The filesystem type to mount.

Ex. "ext4", "xfs", "ntfs". If not provided,
the empty value is passed to the associated CSI driver, which will
determine the default filesystem to apply.

---

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.CsiVolumeOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* auto-generated

The volume name.

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.CsiVolumeOptions.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

Whether the mounted volume should be read-only or not.

---

### DaemonSetProps <a name="cdk8s-plus-27.DaemonSetProps"></a>

Properties for `DaemonSet`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { DaemonSetProps } from 'cdk8s-plus-27'

const daemonSetProps: DaemonSetProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.automountServiceAccountToken"></a>

```typescript
public readonly automountServiceAccountToken: boolean;
```

- *Type:* `boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.containers"></a>

```typescript
public readonly containers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.dns"></a>

```typescript
public readonly dns: PodDnsProps;
```

- *Type:* [`cdk8s-plus-27.PodDnsProps`](#cdk8s-plus-27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.dockerRegistryAuth"></a>

```typescript
public readonly dockerRegistryAuth: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.hostAliases"></a>

```typescript
public readonly hostAliases: HostAlias[];
```

- *Type:* [`cdk8s-plus-27.HostAlias`](#cdk8s-plus-27.HostAlias)[]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.hostNetwork"></a>

```typescript
public readonly hostNetwork: boolean;
```

- *Type:* `boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.initContainers"></a>

```typescript
public readonly initContainers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.isolate"></a>

```typescript
public readonly isolate: boolean;
```

- *Type:* `boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.restartPolicy"></a>

```typescript
public readonly restartPolicy: RestartPolicy;
```

- *Type:* [`cdk8s-plus-27.RestartPolicy`](#cdk8s-plus-27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.securityContext"></a>

```typescript
public readonly securityContext: PodSecurityContextProps;
```

- *Type:* [`cdk8s-plus-27.PodSecurityContextProps`](#cdk8s-plus-27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.serviceAccount"></a>

```typescript
public readonly serviceAccount: IServiceAccount;
```

- *Type:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)
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

##### `terminationGracePeriod`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.terminationGracePeriod"></a>

```typescript
public readonly terminationGracePeriod: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.volumes"></a>

```typescript
public readonly volumes: Volume[];
```

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)[]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.podMetadata"></a>

```typescript
public readonly podMetadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.select"></a>

```typescript
public readonly select: boolean;
```

- *Type:* `boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.spread"></a>

```typescript
public readonly spread: boolean;
```

- *Type:* `boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `minReadySeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.DaemonSetProps.property.minReadySeconds"></a>

```typescript
public readonly minReadySeconds: number;
```

- *Type:* `number`
- *Default:* 0

Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---

### DeploymentExposeViaServiceOptions <a name="cdk8s-plus-27.DeploymentExposeViaServiceOptions"></a>

Options for `Deployment.exposeViaService`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { DeploymentExposeViaServiceOptions } from 'cdk8s-plus-27'

const deploymentExposeViaServiceOptions: DeploymentExposeViaServiceOptions = { ... }
```

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentExposeViaServiceOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* auto generated.

The name of the service to expose.

If you'd like to expose the deployment multiple times,
you must explicitly set a name starting from the second expose call.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentExposeViaServiceOptions.property.ports"></a>

```typescript
public readonly ports: ServicePort[];
```

- *Type:* [`cdk8s-plus-27.ServicePort`](#cdk8s-plus-27.ServicePort)[]
- *Default:* extracted from the deployment.

The ports that the service should bind to.

---

##### `serviceType`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentExposeViaServiceOptions.property.serviceType"></a>

```typescript
public readonly serviceType: ServiceType;
```

- *Type:* [`cdk8s-plus-27.ServiceType`](#cdk8s-plus-27.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

### DeploymentProps <a name="cdk8s-plus-27.DeploymentProps"></a>

Properties for `Deployment`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { DeploymentProps } from 'cdk8s-plus-27'

const deploymentProps: DeploymentProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.automountServiceAccountToken"></a>

```typescript
public readonly automountServiceAccountToken: boolean;
```

- *Type:* `boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.containers"></a>

```typescript
public readonly containers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.dns"></a>

```typescript
public readonly dns: PodDnsProps;
```

- *Type:* [`cdk8s-plus-27.PodDnsProps`](#cdk8s-plus-27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.dockerRegistryAuth"></a>

```typescript
public readonly dockerRegistryAuth: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.hostAliases"></a>

```typescript
public readonly hostAliases: HostAlias[];
```

- *Type:* [`cdk8s-plus-27.HostAlias`](#cdk8s-plus-27.HostAlias)[]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.hostNetwork"></a>

```typescript
public readonly hostNetwork: boolean;
```

- *Type:* `boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.initContainers"></a>

```typescript
public readonly initContainers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.isolate"></a>

```typescript
public readonly isolate: boolean;
```

- *Type:* `boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.restartPolicy"></a>

```typescript
public readonly restartPolicy: RestartPolicy;
```

- *Type:* [`cdk8s-plus-27.RestartPolicy`](#cdk8s-plus-27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.securityContext"></a>

```typescript
public readonly securityContext: PodSecurityContextProps;
```

- *Type:* [`cdk8s-plus-27.PodSecurityContextProps`](#cdk8s-plus-27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.serviceAccount"></a>

```typescript
public readonly serviceAccount: IServiceAccount;
```

- *Type:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)
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

##### `terminationGracePeriod`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.terminationGracePeriod"></a>

```typescript
public readonly terminationGracePeriod: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.volumes"></a>

```typescript
public readonly volumes: Volume[];
```

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)[]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.podMetadata"></a>

```typescript
public readonly podMetadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.select"></a>

```typescript
public readonly select: boolean;
```

- *Type:* `boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.spread"></a>

```typescript
public readonly spread: boolean;
```

- *Type:* `boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `minReady`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.minReady"></a>

```typescript
public readonly minReady: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(0)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

Zero means the pod will be considered available as soon as it is ready.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds

---

##### `progressDeadline`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.progressDeadline"></a>

```typescript
public readonly progressDeadline: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(600)

The maximum duration for a deployment to make progress before it is considered to be failed.

The deployment controller will continue
to process failed deployments and a condition with a ProgressDeadlineExceeded
reason will be surfaced in the deployment status.

Note that progress will not be estimated during the time a deployment is paused.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#progress-deadline-seconds

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.replicas"></a>

```typescript
public readonly replicas: number;
```

- *Type:* `number`
- *Default:* 2

Number of desired pods.

---

##### `strategy`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentProps.property.strategy"></a>

```typescript
public readonly strategy: DeploymentStrategy;
```

- *Type:* [`cdk8s-plus-27.DeploymentStrategy`](#cdk8s-plus-27.DeploymentStrategy)
- *Default:* RollingUpdate with maxSurge and maxUnavailable set to 25%.

Specifies the strategy used to replace old Pods by new ones.

---

### DeploymentStrategyRollingUpdateOptions <a name="cdk8s-plus-27.DeploymentStrategyRollingUpdateOptions"></a>

Options for `DeploymentStrategy.rollingUpdate`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { DeploymentStrategyRollingUpdateOptions } from 'cdk8s-plus-27'

const deploymentStrategyRollingUpdateOptions: DeploymentStrategyRollingUpdateOptions = { ... }
```

##### `maxSurge`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentStrategyRollingUpdateOptions.property.maxSurge"></a>

```typescript
public readonly maxSurge: PercentOrAbsolute;
```

- *Type:* [`cdk8s-plus-27.PercentOrAbsolute`](#cdk8s-plus-27.PercentOrAbsolute)
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

##### `maxUnavailable`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentStrategyRollingUpdateOptions.property.maxUnavailable"></a>

```typescript
public readonly maxUnavailable: PercentOrAbsolute;
```

- *Type:* [`cdk8s-plus-27.PercentOrAbsolute`](#cdk8s-plus-27.PercentOrAbsolute)
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

### DnsOption <a name="cdk8s-plus-27.DnsOption"></a>

Custom DNS option.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { DnsOption } from 'cdk8s-plus-27'

const dnsOption: DnsOption = { ... }
```

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.DnsOption.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

Option name.

---

##### `value`<sup>Optional</sup> <a name="cdk8s-plus-27.DnsOption.property.value"></a>

```typescript
public readonly value: string;
```

- *Type:* `string`
- *Default:* No value.

Option value.

---

### DockerConfigSecretProps <a name="cdk8s-plus-27.DockerConfigSecretProps"></a>

Options for `DockerConfigSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { DockerConfigSecretProps } from 'cdk8s-plus-27'

const dockerConfigSecretProps: DockerConfigSecretProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.DockerConfigSecretProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s-plus-27.DockerConfigSecretProps.property.immutable"></a>

```typescript
public readonly immutable: boolean;
```

- *Type:* `boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `data`<sup>Required</sup> <a name="cdk8s-plus-27.DockerConfigSecretProps.property.data"></a>

```typescript
public readonly data: {[ key: string ]: any};
```

- *Type:* {[ key: string ]: `any`}

JSON content to provide for the `~/.docker/config.json` file. This will be stringified and inserted as stringData.

> https://docs.docker.com/engine/reference/commandline/cli/#sample-configuration-file

---

### EmptyDirVolumeOptions <a name="cdk8s-plus-27.EmptyDirVolumeOptions"></a>

Options for volumes populated with an empty directory.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { EmptyDirVolumeOptions } from 'cdk8s-plus-27'

const emptyDirVolumeOptions: EmptyDirVolumeOptions = { ... }
```

##### `medium`<sup>Optional</sup> <a name="cdk8s-plus-27.EmptyDirVolumeOptions.property.medium"></a>

```typescript
public readonly medium: EmptyDirMedium;
```

- *Type:* [`cdk8s-plus-27.EmptyDirMedium`](#cdk8s-plus-27.EmptyDirMedium)
- *Default:* EmptyDirMedium.DEFAULT

By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment.

However, you can set the emptyDir.medium field to
`EmptyDirMedium.MEMORY` to tell Kubernetes to mount a tmpfs (RAM-backed
filesystem) for you instead. While tmpfs is very fast, be aware that unlike
disks, tmpfs is cleared on node reboot and any files you write will count
against your Container's memory limit.

---

##### `sizeLimit`<sup>Optional</sup> <a name="cdk8s-plus-27.EmptyDirVolumeOptions.property.sizeLimit"></a>

```typescript
public readonly sizeLimit: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* limit is undefined

Total amount of local storage required for this EmptyDir volume.

The size
limit is also applicable for memory medium. The maximum usage on memory
medium EmptyDir would be the minimum value between the SizeLimit specified
here and the sum of memory limits of all containers in a pod.

---

### EnvValueFromConfigMapOptions <a name="cdk8s-plus-27.EnvValueFromConfigMapOptions"></a>

Options to specify an envionment variable value from a ConfigMap key.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { EnvValueFromConfigMapOptions } from 'cdk8s-plus-27'

const envValueFromConfigMapOptions: EnvValueFromConfigMapOptions = { ... }
```

##### `optional`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValueFromConfigMapOptions.property.optional"></a>

```typescript
public readonly optional: boolean;
```

- *Type:* `boolean`
- *Default:* false

Specify whether the ConfigMap or its key must be defined.

---

### EnvValueFromFieldRefOptions <a name="cdk8s-plus-27.EnvValueFromFieldRefOptions"></a>

Options to specify an environment variable value from a field reference.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { EnvValueFromFieldRefOptions } from 'cdk8s-plus-27'

const envValueFromFieldRefOptions: EnvValueFromFieldRefOptions = { ... }
```

##### `apiVersion`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValueFromFieldRefOptions.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

Version of the schema the FieldPath is written in terms of.

---

##### `key`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValueFromFieldRefOptions.property.key"></a>

```typescript
public readonly key: string;
```

- *Type:* `string`

The key to select the pod label or annotation.

---

### EnvValueFromProcessOptions <a name="cdk8s-plus-27.EnvValueFromProcessOptions"></a>

Options to specify an environment variable value from the process environment.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { EnvValueFromProcessOptions } from 'cdk8s-plus-27'

const envValueFromProcessOptions: EnvValueFromProcessOptions = { ... }
```

##### `required`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValueFromProcessOptions.property.required"></a>

```typescript
public readonly required: boolean;
```

- *Type:* `boolean`
- *Default:* false

Specify whether the key must exist in the environment.

If this is set to true, and the key does not exist, an error will thrown.

---

### EnvValueFromResourceOptions <a name="cdk8s-plus-27.EnvValueFromResourceOptions"></a>

Options to specify an environment variable value from a resource.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { EnvValueFromResourceOptions } from 'cdk8s-plus-27'

const envValueFromResourceOptions: EnvValueFromResourceOptions = { ... }
```

##### `container`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValueFromResourceOptions.property.container"></a>

```typescript
public readonly container: Container;
```

- *Type:* [`cdk8s-plus-27.Container`](#cdk8s-plus-27.Container)

The container to select the value from.

---

##### `divisor`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValueFromResourceOptions.property.divisor"></a>

```typescript
public readonly divisor: string;
```

- *Type:* `string`

The output format of the exposed resource.

---

### EnvValueFromSecretOptions <a name="cdk8s-plus-27.EnvValueFromSecretOptions"></a>

Options to specify an environment variable value from a Secret.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { EnvValueFromSecretOptions } from 'cdk8s-plus-27'

const envValueFromSecretOptions: EnvValueFromSecretOptions = { ... }
```

##### `optional`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValueFromSecretOptions.property.optional"></a>

```typescript
public readonly optional: boolean;
```

- *Type:* `boolean`
- *Default:* false

Specify whether the Secret or its key must be defined.

---

### EphemeralStorageResources <a name="cdk8s-plus-27.EphemeralStorageResources"></a>

Emphemeral storage request and limit.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { EphemeralStorageResources } from 'cdk8s-plus-27'

const ephemeralStorageResources: EphemeralStorageResources = { ... }
```

##### `limit`<sup>Optional</sup> <a name="cdk8s-plus-27.EphemeralStorageResources.property.limit"></a>

```typescript
public readonly limit: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

---

##### `request`<sup>Optional</sup> <a name="cdk8s-plus-27.EphemeralStorageResources.property.request"></a>

```typescript
public readonly request: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

---

### ExposeDeploymentViaIngressOptions <a name="cdk8s-plus-27.ExposeDeploymentViaIngressOptions"></a>

Options for exposing a deployment via an ingress.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ExposeDeploymentViaIngressOptions } from 'cdk8s-plus-27'

const exposeDeploymentViaIngressOptions: ExposeDeploymentViaIngressOptions = { ... }
```

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.ExposeDeploymentViaIngressOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* auto generated.

The name of the service to expose.

If you'd like to expose the deployment multiple times,
you must explicitly set a name starting from the second expose call.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.ExposeDeploymentViaIngressOptions.property.ports"></a>

```typescript
public readonly ports: ServicePort[];
```

- *Type:* [`cdk8s-plus-27.ServicePort`](#cdk8s-plus-27.ServicePort)[]
- *Default:* extracted from the deployment.

The ports that the service should bind to.

---

##### `serviceType`<sup>Optional</sup> <a name="cdk8s-plus-27.ExposeDeploymentViaIngressOptions.property.serviceType"></a>

```typescript
public readonly serviceType: ServiceType;
```

- *Type:* [`cdk8s-plus-27.ServiceType`](#cdk8s-plus-27.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

##### `ingress`<sup>Optional</sup> <a name="cdk8s-plus-27.ExposeDeploymentViaIngressOptions.property.ingress"></a>

```typescript
public readonly ingress: Ingress;
```

- *Type:* [`cdk8s-plus-27.Ingress`](#cdk8s-plus-27.Ingress)
- *Default:* An ingress will be automatically created.

The ingress to add rules to.

---

##### `pathType`<sup>Optional</sup> <a name="cdk8s-plus-27.ExposeDeploymentViaIngressOptions.property.pathType"></a>

```typescript
public readonly pathType: HttpIngressPathType;
```

- *Type:* [`cdk8s-plus-27.HttpIngressPathType`](#cdk8s-plus-27.HttpIngressPathType)
- *Default:* HttpIngressPathType.PREFIX

The type of the path.

---

### ExposeServiceViaIngressOptions <a name="cdk8s-plus-27.ExposeServiceViaIngressOptions"></a>

Options for exposing a service using an ingress.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ExposeServiceViaIngressOptions } from 'cdk8s-plus-27'

const exposeServiceViaIngressOptions: ExposeServiceViaIngressOptions = { ... }
```

##### `ingress`<sup>Optional</sup> <a name="cdk8s-plus-27.ExposeServiceViaIngressOptions.property.ingress"></a>

```typescript
public readonly ingress: Ingress;
```

- *Type:* [`cdk8s-plus-27.Ingress`](#cdk8s-plus-27.Ingress)
- *Default:* An ingress will be automatically created.

The ingress to add rules to.

---

##### `pathType`<sup>Optional</sup> <a name="cdk8s-plus-27.ExposeServiceViaIngressOptions.property.pathType"></a>

```typescript
public readonly pathType: HttpIngressPathType;
```

- *Type:* [`cdk8s-plus-27.HttpIngressPathType`](#cdk8s-plus-27.HttpIngressPathType)
- *Default:* HttpIngressPathType.PREFIX

The type of the path.

---

### FromServiceAccountNameOptions <a name="cdk8s-plus-27.FromServiceAccountNameOptions"></a>

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { FromServiceAccountNameOptions } from 'cdk8s-plus-27'

const fromServiceAccountNameOptions: FromServiceAccountNameOptions = { ... }
```

##### `namespaceName`<sup>Optional</sup> <a name="cdk8s-plus-27.FromServiceAccountNameOptions.property.namespaceName"></a>

```typescript
public readonly namespaceName: string;
```

- *Type:* `string`
- *Default:* "default"

The name of the namespace the service account belongs to.

---

### GCEPersistentDiskPersistentVolumeProps <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps"></a>

Properties for `GCEPersistentDiskPersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { GCEPersistentDiskPersistentVolumeProps } from 'cdk8s-plus-27'

const gCEPersistentDiskPersistentVolumeProps: GCEPersistentDiskPersistentVolumeProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.accessModes"></a>

```typescript
public readonly accessModes: PersistentVolumeAccessMode[];
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeAccessMode`](#cdk8s-plus-27.PersistentVolumeAccessMode)[]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.claim"></a>

```typescript
public readonly claim: IPersistentVolumeClaim;
```

- *Type:* [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.mountOptions"></a>

```typescript
public readonly mountOptions: string[];
```

- *Type:* `string`[]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.reclaimPolicy"></a>

```typescript
public readonly reclaimPolicy: PersistentVolumeReclaimPolicy;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeReclaimPolicy`](#cdk8s-plus-27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.storage"></a>

```typescript
public readonly storage: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.storageClassName"></a>

```typescript
public readonly storageClassName: string;
```

- *Type:* `string`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.volumeMode"></a>

```typescript
public readonly volumeMode: PersistentVolumeMode;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeMode`](#cdk8s-plus-27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `pdName`<sup>Required</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.pdName"></a>

```typescript
public readonly pdName: string;
```

- *Type:* `string`

Unique name of the PD resource in GCE.

Used to identify the disk in GCE.

> https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

---

##### `fsType`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.fsType"></a>

```typescript
public readonly fsType: string;
```

- *Type:* `string`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `partition`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.partition"></a>

```typescript
public readonly partition: number;
```

- *Type:* `number`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskPersistentVolumeProps.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### GCEPersistentDiskVolumeOptions <a name="cdk8s-plus-27.GCEPersistentDiskVolumeOptions"></a>

Options of `Volume.fromGcePersistentDisk`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { GCEPersistentDiskVolumeOptions } from 'cdk8s-plus-27'

const gCEPersistentDiskVolumeOptions: GCEPersistentDiskVolumeOptions = { ... }
```

##### `fsType`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskVolumeOptions.property.fsType"></a>

```typescript
public readonly fsType: string;
```

- *Type:* `string`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskVolumeOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* auto-generated

The volume name.

---

##### `partition`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskVolumeOptions.property.partition"></a>

```typescript
public readonly partition: number;
```

- *Type:* `number`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.GCEPersistentDiskVolumeOptions.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### HandlerFromHttpGetOptions <a name="cdk8s-plus-27.HandlerFromHttpGetOptions"></a>

Options for `Handler.fromHttpGet`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { HandlerFromHttpGetOptions } from 'cdk8s-plus-27'

const handlerFromHttpGetOptions: HandlerFromHttpGetOptions = { ... }
```

##### `port`<sup>Optional</sup> <a name="cdk8s-plus-27.HandlerFromHttpGetOptions.property.port"></a>

```typescript
public readonly port: number;
```

- *Type:* `number`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---

### HandlerFromTcpSocketOptions <a name="cdk8s-plus-27.HandlerFromTcpSocketOptions"></a>

Options for `Handler.fromTcpSocket`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { HandlerFromTcpSocketOptions } from 'cdk8s-plus-27'

const handlerFromTcpSocketOptions: HandlerFromTcpSocketOptions = { ... }
```

##### `host`<sup>Optional</sup> <a name="cdk8s-plus-27.HandlerFromTcpSocketOptions.property.host"></a>

```typescript
public readonly host: string;
```

- *Type:* `string`
- *Default:* defaults to the pod IP

The host name to connect to on the container.

---

##### `port`<sup>Optional</sup> <a name="cdk8s-plus-27.HandlerFromTcpSocketOptions.property.port"></a>

```typescript
public readonly port: number;
```

- *Type:* `number`
- *Default:* defaults to `container.port`.

The TCP port to connect to on the container.

---

### HorizontalPodAutoscalerProps <a name="cdk8s-plus-27.HorizontalPodAutoscalerProps"></a>

Properties for HorizontalPodAutoscaler.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { HorizontalPodAutoscalerProps } from 'cdk8s-plus-27'

const horizontalPodAutoscalerProps: HorizontalPodAutoscalerProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscalerProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `maxReplicas`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscalerProps.property.maxReplicas"></a>

```typescript
public readonly maxReplicas: number;
```

- *Type:* `number`

The maximum number of replicas that can be scaled up to.

---

##### `target`<sup>Required</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscalerProps.property.target"></a>

```typescript
public readonly target: IScalable;
```

- *Type:* [`cdk8s-plus-27.IScalable`](#cdk8s-plus-27.IScalable)

The workload to scale up or down.

Scalable workload types:
* Deployment
* StatefulSet

---

##### `metrics`<sup>Optional</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscalerProps.property.metrics"></a>

```typescript
public readonly metrics: Metric[];
```

- *Type:* [`cdk8s-plus-27.Metric`](#cdk8s-plus-27.Metric)[]
- *Default:* If metrics are not provided, then the target resource
constraints (e.g. cpu limit) will be used as scaling metrics.

The metric conditions that trigger a scale up or scale down.

---

##### `minReplicas`<sup>Optional</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscalerProps.property.minReplicas"></a>

```typescript
public readonly minReplicas: number;
```

- *Type:* `number`
- *Default:* 1

The minimum number of replicas that can be scaled down to.

Can be set to 0 if the alpha feature gate `HPAScaleToZero` is enabled and
at least one Object or External metric is configured.

---

##### `scaleDown`<sup>Optional</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscalerProps.property.scaleDown"></a>

```typescript
public readonly scaleDown: ScalingRules;
```

- *Type:* [`cdk8s-plus-27.ScalingRules`](#cdk8s-plus-27.ScalingRules)
- *Default:* Scale down to minReplica count with a 5 minute stabilization window.

The scaling behavior when scaling down.

---

##### `scaleUp`<sup>Optional</sup> <a name="cdk8s-plus-27.HorizontalPodAutoscalerProps.property.scaleUp"></a>

```typescript
public readonly scaleUp: ScalingRules;
```

- *Type:* [`cdk8s-plus-27.ScalingRules`](#cdk8s-plus-27.ScalingRules)
- *Default:* Is the higher of:
* Increase no more than 4 pods per 60 seconds
* Double the number of pods per 60 seconds

The scaling behavior when scaling up.

---

### HostAlias <a name="cdk8s-plus-27.HostAlias"></a>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's /etc/hosts file.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { HostAlias } from 'cdk8s-plus-27'

const hostAlias: HostAlias = { ... }
```

##### `hostnames`<sup>Required</sup> <a name="cdk8s-plus-27.HostAlias.property.hostnames"></a>

```typescript
public readonly hostnames: string[];
```

- *Type:* `string`[]

Hostnames for the chosen IP address.

---

##### `ip`<sup>Required</sup> <a name="cdk8s-plus-27.HostAlias.property.ip"></a>

```typescript
public readonly ip: string;
```

- *Type:* `string`

IP address of the host file entry.

---

### HostPathVolumeOptions <a name="cdk8s-plus-27.HostPathVolumeOptions"></a>

Options for a HostPathVolume-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { HostPathVolumeOptions } from 'cdk8s-plus-27'

const hostPathVolumeOptions: HostPathVolumeOptions = { ... }
```

##### `path`<sup>Required</sup> <a name="cdk8s-plus-27.HostPathVolumeOptions.property.path"></a>

```typescript
public readonly path: string;
```

- *Type:* `string`

The path of the directory on the host.

---

##### `type`<sup>Optional</sup> <a name="cdk8s-plus-27.HostPathVolumeOptions.property.type"></a>

```typescript
public readonly type: HostPathVolumeType;
```

- *Type:* [`cdk8s-plus-27.HostPathVolumeType`](#cdk8s-plus-27.HostPathVolumeType)
- *Default:* HostPathVolumeType.DEFAULT

The expected type of the path found on the host.

---

### HttpGetProbeOptions <a name="cdk8s-plus-27.HttpGetProbeOptions"></a>

Options for `Probe.fromHttpGet()`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { HttpGetProbeOptions } from 'cdk8s-plus-27'

const httpGetProbeOptions: HttpGetProbeOptions = { ... }
```

##### `failureThreshold`<sup>Optional</sup> <a name="cdk8s-plus-27.HttpGetProbeOptions.property.failureThreshold"></a>

```typescript
public readonly failureThreshold: number;
```

- *Type:* `number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.HttpGetProbeOptions.property.initialDelaySeconds"></a>

```typescript
public readonly initialDelaySeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.HttpGetProbeOptions.property.periodSeconds"></a>

```typescript
public readonly periodSeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="cdk8s-plus-27.HttpGetProbeOptions.property.successThreshold"></a>

```typescript
public readonly successThreshold: number;
```

- *Type:* `number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.HttpGetProbeOptions.property.timeoutSeconds"></a>

```typescript
public readonly timeoutSeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `port`<sup>Optional</sup> <a name="cdk8s-plus-27.HttpGetProbeOptions.property.port"></a>

```typescript
public readonly port: number;
```

- *Type:* `number`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---

##### `scheme`<sup>Optional</sup> <a name="cdk8s-plus-27.HttpGetProbeOptions.property.scheme"></a>

```typescript
public readonly scheme: ConnectionScheme;
```

- *Type:* [`cdk8s-plus-27.ConnectionScheme`](#cdk8s-plus-27.ConnectionScheme)
- *Default:* ConnectionScheme.HTTP

Scheme to use for connecting to the host (HTTP or HTTPS).

---

### IngressProps <a name="cdk8s-plus-27.IngressProps"></a>

Properties for `Ingress`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { IngressProps } from 'cdk8s-plus-27'

const ingressProps: IngressProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.IngressProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `defaultBackend`<sup>Optional</sup> <a name="cdk8s-plus-27.IngressProps.property.defaultBackend"></a>

```typescript
public readonly defaultBackend: IngressBackend;
```

- *Type:* [`cdk8s-plus-27.IngressBackend`](#cdk8s-plus-27.IngressBackend)

The default backend services requests that do not match any rule.

Using this option or the `addDefaultBackend()` method is equivalent to
adding a rule with both `path` and `host` undefined.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s-plus-27.IngressProps.property.rules"></a>

```typescript
public readonly rules: IngressRule[];
```

- *Type:* [`cdk8s-plus-27.IngressRule`](#cdk8s-plus-27.IngressRule)[]

Routing rules for this ingress.

Each rule must define an `IngressBackend` that will receive the requests
that match this rule. If both `host` and `path` are not specifiec, this
backend will be used as the default backend of the ingress.

You can also add rules later using `addRule()`, `addHostRule()`,
`addDefaultBackend()` and `addHostDefaultBackend()`.

---

##### `tls`<sup>Optional</sup> <a name="cdk8s-plus-27.IngressProps.property.tls"></a>

```typescript
public readonly tls: IngressTls[];
```

- *Type:* [`cdk8s-plus-27.IngressTls`](#cdk8s-plus-27.IngressTls)[]

TLS settings for this ingress.

Using this option tells the ingress controller to expose a TLS endpoint.
Currently the Ingress only supports a single TLS port, 443. If multiple
members of this list specify different hosts, they will be multiplexed on
the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI.

---

### IngressRule <a name="cdk8s-plus-27.IngressRule"></a>

Represents the rules mapping the paths under a specified host to the related backend services.

Incoming requests are first evaluated for a host match,
then routed to the backend associated with the matching path.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { IngressRule } from 'cdk8s-plus-27'

const ingressRule: IngressRule = { ... }
```

##### `backend`<sup>Required</sup> <a name="cdk8s-plus-27.IngressRule.property.backend"></a>

```typescript
public readonly backend: IngressBackend;
```

- *Type:* [`cdk8s-plus-27.IngressBackend`](#cdk8s-plus-27.IngressBackend)

Backend defines the referenced service endpoint to which the traffic will be forwarded to.

---

##### `host`<sup>Optional</sup> <a name="cdk8s-plus-27.IngressRule.property.host"></a>

```typescript
public readonly host: string;
```

- *Type:* `string`
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

##### `path`<sup>Optional</sup> <a name="cdk8s-plus-27.IngressRule.property.path"></a>

```typescript
public readonly path: string;
```

- *Type:* `string`
- *Default:* If unspecified, the path defaults to a catch all sending traffic
to the backend.

Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'.

---

##### `pathType`<sup>Optional</sup> <a name="cdk8s-plus-27.IngressRule.property.pathType"></a>

```typescript
public readonly pathType: HttpIngressPathType;
```

- *Type:* [`cdk8s-plus-27.HttpIngressPathType`](#cdk8s-plus-27.HttpIngressPathType)

Specify how the path is matched against request paths.

By default, path
types will be matched by prefix.

> https://kubernetes.io/docs/concepts/services-networking/ingress/#path-types

---

### IngressTls <a name="cdk8s-plus-27.IngressTls"></a>

Represents the TLS configuration mapping that is passed to the ingress controller for SSL termination.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { IngressTls } from 'cdk8s-plus-27'

const ingressTls: IngressTls = { ... }
```

##### `hosts`<sup>Optional</sup> <a name="cdk8s-plus-27.IngressTls.property.hosts"></a>

```typescript
public readonly hosts: string[];
```

- *Type:* `string`[]
- *Default:* If unspecified, it defaults to the wildcard host setting for
the loadbalancer controller fulfilling this Ingress.

Hosts are a list of hosts included in the TLS certificate.

The values in
this list must match the name/s used in the TLS Secret.

---

##### `secret`<sup>Optional</sup> <a name="cdk8s-plus-27.IngressTls.property.secret"></a>

```typescript
public readonly secret: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)
- *Default:* If unspecified, it allows SSL routing based on SNI hostname.

Secret is the secret that contains the certificate and key used to terminate SSL traffic on 443.

If the SNI host in a listener conflicts with
the "Host" header field used by an IngressRule, the SNI host is used for
termination and value of the Host header is used for routing.

---

### JobProps <a name="cdk8s-plus-27.JobProps"></a>

Properties for `Job`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { JobProps } from 'cdk8s-plus-27'

const jobProps: JobProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.automountServiceAccountToken"></a>

```typescript
public readonly automountServiceAccountToken: boolean;
```

- *Type:* `boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.containers"></a>

```typescript
public readonly containers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.dns"></a>

```typescript
public readonly dns: PodDnsProps;
```

- *Type:* [`cdk8s-plus-27.PodDnsProps`](#cdk8s-plus-27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.dockerRegistryAuth"></a>

```typescript
public readonly dockerRegistryAuth: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.hostAliases"></a>

```typescript
public readonly hostAliases: HostAlias[];
```

- *Type:* [`cdk8s-plus-27.HostAlias`](#cdk8s-plus-27.HostAlias)[]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.hostNetwork"></a>

```typescript
public readonly hostNetwork: boolean;
```

- *Type:* `boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.initContainers"></a>

```typescript
public readonly initContainers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.isolate"></a>

```typescript
public readonly isolate: boolean;
```

- *Type:* `boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.restartPolicy"></a>

```typescript
public readonly restartPolicy: RestartPolicy;
```

- *Type:* [`cdk8s-plus-27.RestartPolicy`](#cdk8s-plus-27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.securityContext"></a>

```typescript
public readonly securityContext: PodSecurityContextProps;
```

- *Type:* [`cdk8s-plus-27.PodSecurityContextProps`](#cdk8s-plus-27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.serviceAccount"></a>

```typescript
public readonly serviceAccount: IServiceAccount;
```

- *Type:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)
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

##### `terminationGracePeriod`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.terminationGracePeriod"></a>

```typescript
public readonly terminationGracePeriod: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.volumes"></a>

```typescript
public readonly volumes: Volume[];
```

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)[]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.podMetadata"></a>

```typescript
public readonly podMetadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.select"></a>

```typescript
public readonly select: boolean;
```

- *Type:* `boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.spread"></a>

```typescript
public readonly spread: boolean;
```

- *Type:* `boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `activeDeadline`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.activeDeadline"></a>

```typescript
public readonly activeDeadline: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoffLimit`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.backoffLimit"></a>

```typescript
public readonly backoffLimit: number;
```

- *Type:* `number`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="cdk8s-plus-27.JobProps.property.ttlAfterFinished"></a>

```typescript
public readonly ttlAfterFinished: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* If this field is unset, the Job won't be automatically deleted.

Limits the lifetime of a Job that has finished execution (either Complete or Failed).

If this field is set, after the Job finishes, it is eligible to
be automatically deleted. When the Job is being deleted, its lifecycle
guarantees (e.g. finalizers) will be honored. If this field is set to zero,
the Job becomes eligible to be deleted immediately after it finishes. This
field is alpha-level and is only honored by servers that enable the
`TTLAfterFinished` feature.

---

### LabelSelectorOptions <a name="cdk8s-plus-27.LabelSelectorOptions"></a>

Options for `LabelSelector.of`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { LabelSelectorOptions } from 'cdk8s-plus-27'

const labelSelectorOptions: LabelSelectorOptions = { ... }
```

##### `expressions`<sup>Optional</sup> <a name="cdk8s-plus-27.LabelSelectorOptions.property.expressions"></a>

```typescript
public readonly expressions: LabelExpression[];
```

- *Type:* [`cdk8s-plus-27.LabelExpression`](#cdk8s-plus-27.LabelExpression)[]

Expression based label matchers.

---

##### `labels`<sup>Optional</sup> <a name="cdk8s-plus-27.LabelSelectorOptions.property.labels"></a>

```typescript
public readonly labels: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}

Strict label matchers.

---

### LabelSelectorRequirement <a name="cdk8s-plus-27.LabelSelectorRequirement"></a>

A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { LabelSelectorRequirement } from 'cdk8s-plus-27'

const labelSelectorRequirement: LabelSelectorRequirement = { ... }
```

##### `key`<sup>Required</sup> <a name="cdk8s-plus-27.LabelSelectorRequirement.property.key"></a>

```typescript
public readonly key: string;
```

- *Type:* `string`

The label key that the selector applies to.

---

##### `operator`<sup>Required</sup> <a name="cdk8s-plus-27.LabelSelectorRequirement.property.operator"></a>

```typescript
public readonly operator: string;
```

- *Type:* `string`

Represents a key's relationship to a set of values.

---

##### `values`<sup>Optional</sup> <a name="cdk8s-plus-27.LabelSelectorRequirement.property.values"></a>

```typescript
public readonly values: string[];
```

- *Type:* `string`[]

An array of string values.

If the operator is In or NotIn, the values array
must be non-empty. If the operator is Exists or DoesNotExist,
the values array must be empty. This array is replaced during a strategic merge patch.

---

### MemoryResources <a name="cdk8s-plus-27.MemoryResources"></a>

Memory request and limit.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { MemoryResources } from 'cdk8s-plus-27'

const memoryResources: MemoryResources = { ... }
```

##### `limit`<sup>Optional</sup> <a name="cdk8s-plus-27.MemoryResources.property.limit"></a>

```typescript
public readonly limit: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

---

##### `request`<sup>Optional</sup> <a name="cdk8s-plus-27.MemoryResources.property.request"></a>

```typescript
public readonly request: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

---

### MetricContainerResourceOptions <a name="cdk8s-plus-27.MetricContainerResourceOptions"></a>

Options for `Metric.containerResource()`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { MetricContainerResourceOptions } from 'cdk8s-plus-27'

const metricContainerResourceOptions: MetricContainerResourceOptions = { ... }
```

##### `container`<sup>Required</sup> <a name="cdk8s-plus-27.MetricContainerResourceOptions.property.container"></a>

```typescript
public readonly container: Container;
```

- *Type:* [`cdk8s-plus-27.Container`](#cdk8s-plus-27.Container)

Container where the metric can be found.

---

##### `target`<sup>Required</sup> <a name="cdk8s-plus-27.MetricContainerResourceOptions.property.target"></a>

```typescript
public readonly target: MetricTarget;
```

- *Type:* [`cdk8s-plus-27.MetricTarget`](#cdk8s-plus-27.MetricTarget)

Target metric value that will trigger scaling.

---

### MetricObjectOptions <a name="cdk8s-plus-27.MetricObjectOptions"></a>

Options for `Metric.object()`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { MetricObjectOptions } from 'cdk8s-plus-27'

const metricObjectOptions: MetricObjectOptions = { ... }
```

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.MetricObjectOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The name of the metric to scale on.

---

##### `target`<sup>Required</sup> <a name="cdk8s-plus-27.MetricObjectOptions.property.target"></a>

```typescript
public readonly target: MetricTarget;
```

- *Type:* [`cdk8s-plus-27.MetricTarget`](#cdk8s-plus-27.MetricTarget)

The target metric value that will trigger scaling.

---

##### `labelSelector`<sup>Optional</sup> <a name="cdk8s-plus-27.MetricObjectOptions.property.labelSelector"></a>

```typescript
public readonly labelSelector: LabelSelector;
```

- *Type:* [`cdk8s-plus-27.LabelSelector`](#cdk8s-plus-27.LabelSelector)
- *Default:* Just the metric 'name' will be used to gather metrics.

A selector to find a metric by label.

When set, it is passed as an additional parameter to the metrics server
for more specific metrics scoping.

---

##### `object`<sup>Required</sup> <a name="cdk8s-plus-27.MetricObjectOptions.property.object"></a>

```typescript
public readonly object: IResource;
```

- *Type:* [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource)

Resource where the metric can be found.

---

### MetricOptions <a name="cdk8s-plus-27.MetricOptions"></a>

Base options for a Metric.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { MetricOptions } from 'cdk8s-plus-27'

const metricOptions: MetricOptions = { ... }
```

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.MetricOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The name of the metric to scale on.

---

##### `target`<sup>Required</sup> <a name="cdk8s-plus-27.MetricOptions.property.target"></a>

```typescript
public readonly target: MetricTarget;
```

- *Type:* [`cdk8s-plus-27.MetricTarget`](#cdk8s-plus-27.MetricTarget)

The target metric value that will trigger scaling.

---

##### `labelSelector`<sup>Optional</sup> <a name="cdk8s-plus-27.MetricOptions.property.labelSelector"></a>

```typescript
public readonly labelSelector: LabelSelector;
```

- *Type:* [`cdk8s-plus-27.LabelSelector`](#cdk8s-plus-27.LabelSelector)
- *Default:* Just the metric 'name' will be used to gather metrics.

A selector to find a metric by label.

When set, it is passed as an additional parameter to the metrics server
for more specific metrics scoping.

---

### MountOptions <a name="cdk8s-plus-27.MountOptions"></a>

Options for mounts.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { MountOptions } from 'cdk8s-plus-27'

const mountOptions: MountOptions = { ... }
```

##### `propagation`<sup>Optional</sup> <a name="cdk8s-plus-27.MountOptions.property.propagation"></a>

```typescript
public readonly propagation: MountPropagation;
```

- *Type:* [`cdk8s-plus-27.MountPropagation`](#cdk8s-plus-27.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.MountOptions.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

##### `subPath`<sup>Optional</sup> <a name="cdk8s-plus-27.MountOptions.property.subPath"></a>

```typescript
public readonly subPath: string;
```

- *Type:* `string`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

##### `subPathExpr`<sup>Optional</sup> <a name="cdk8s-plus-27.MountOptions.property.subPathExpr"></a>

```typescript
public readonly subPathExpr: string;
```

- *Type:* `string`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root).

`subPathExpr` and `subPath` are mutually exclusive.

---

### NamespaceProps <a name="cdk8s-plus-27.NamespaceProps"></a>

Properties for `Namespace`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NamespaceProps } from 'cdk8s-plus-27'

const namespaceProps: NamespaceProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.NamespaceProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

### NamespaceSelectorConfig <a name="cdk8s-plus-27.NamespaceSelectorConfig"></a>

Configuration for selecting namespaces.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NamespaceSelectorConfig } from 'cdk8s-plus-27'

const namespaceSelectorConfig: NamespaceSelectorConfig = { ... }
```

##### `labelSelector`<sup>Optional</sup> <a name="cdk8s-plus-27.NamespaceSelectorConfig.property.labelSelector"></a>

```typescript
public readonly labelSelector: LabelSelector;
```

- *Type:* [`cdk8s-plus-27.LabelSelector`](#cdk8s-plus-27.LabelSelector)

A selector to select namespaces by labels.

---

##### `names`<sup>Optional</sup> <a name="cdk8s-plus-27.NamespaceSelectorConfig.property.names"></a>

```typescript
public readonly names: string[];
```

- *Type:* `string`[]

A list of names to select namespaces by names.

---

### NamespacesSelectOptions <a name="cdk8s-plus-27.NamespacesSelectOptions"></a>

Options for `Namespaces.select`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NamespacesSelectOptions } from 'cdk8s-plus-27'

const namespacesSelectOptions: NamespacesSelectOptions = { ... }
```

##### `expressions`<sup>Optional</sup> <a name="cdk8s-plus-27.NamespacesSelectOptions.property.expressions"></a>

```typescript
public readonly expressions: LabelExpression[];
```

- *Type:* [`cdk8s-plus-27.LabelExpression`](#cdk8s-plus-27.LabelExpression)[]
- *Default:* no selector requirements.

Namespaces must satisfy these selectors.

The selectors query labels, just like the `labels` property, but they
provide a more advanced matching mechanism.

---

##### `labels`<sup>Optional</sup> <a name="cdk8s-plus-27.NamespacesSelectOptions.property.labels"></a>

```typescript
public readonly labels: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}
- *Default:* no strict labels requirements.

Labels the namespaces must have.

This is equivalent to using an 'Is' selector.

---

##### `names`<sup>Optional</sup> <a name="cdk8s-plus-27.NamespacesSelectOptions.property.names"></a>

```typescript
public readonly names: string[];
```

- *Type:* `string`[]
- *Default:* no name requirements.

Namespaces names must be one of these.

---

### NetworkPolicyAddEgressRuleOptions <a name="cdk8s-plus-27.NetworkPolicyAddEgressRuleOptions"></a>

Options for `NetworkPolicy.addEgressRule`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NetworkPolicyAddEgressRuleOptions } from 'cdk8s-plus-27'

const networkPolicyAddEgressRuleOptions: NetworkPolicyAddEgressRuleOptions = { ... }
```

##### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyAddEgressRuleOptions.property.ports"></a>

```typescript
public readonly ports: NetworkPolicyPort[];
```

- *Type:* [`cdk8s-plus-27.NetworkPolicyPort`](#cdk8s-plus-27.NetworkPolicyPort)[]
- *Default:* If the peer is a managed pod, take its ports. Otherwise, all ports are allowed.

Ports the rule should allow outgoing traffic to.

---

### NetworkPolicyPeerConfig <a name="cdk8s-plus-27.NetworkPolicyPeerConfig"></a>

Configuration for network peers.

A peer can either by an ip block, or a selection of pods, not both.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NetworkPolicyPeerConfig } from 'cdk8s-plus-27'

const networkPolicyPeerConfig: NetworkPolicyPeerConfig = { ... }
```

##### `ipBlock`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyPeerConfig.property.ipBlock"></a>

```typescript
public readonly ipBlock: NetworkPolicyIpBlock;
```

- *Type:* [`cdk8s-plus-27.NetworkPolicyIpBlock`](#cdk8s-plus-27.NetworkPolicyIpBlock)

The ip block this peer represents.

---

##### `podSelector`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyPeerConfig.property.podSelector"></a>

```typescript
public readonly podSelector: PodSelectorConfig;
```

- *Type:* [`cdk8s-plus-27.PodSelectorConfig`](#cdk8s-plus-27.PodSelectorConfig)

The pod selector this peer represents.

---

### NetworkPolicyPortProps <a name="cdk8s-plus-27.NetworkPolicyPortProps"></a>

Properties for `NetworkPolicyPort`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NetworkPolicyPortProps } from 'cdk8s-plus-27'

const networkPolicyPortProps: NetworkPolicyPortProps = { ... }
```

##### `endPort`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyPortProps.property.endPort"></a>

```typescript
public readonly endPort: number;
```

- *Type:* `number`
- *Default:* not a port range.

End port (relative to `port`).

Only applies if `port` is defined.
Use this to specify a port range, rather that a specific one.

---

##### `port`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyPortProps.property.port"></a>

```typescript
public readonly port: number;
```

- *Type:* `number`
- *Default:* all ports are allowed.

Specific port number.

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyPortProps.property.protocol"></a>

```typescript
public readonly protocol: NetworkProtocol;
```

- *Type:* [`cdk8s-plus-27.NetworkProtocol`](#cdk8s-plus-27.NetworkProtocol)
- *Default:* NetworkProtocol.TCP

Protocol.

---

### NetworkPolicyProps <a name="cdk8s-plus-27.NetworkPolicyProps"></a>

Properties for `NetworkPolicy`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NetworkPolicyProps } from 'cdk8s-plus-27'

const networkPolicyProps: NetworkPolicyProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `egress`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyProps.property.egress"></a>

```typescript
public readonly egress: NetworkPolicyTraffic;
```

- *Type:* [`cdk8s-plus-27.NetworkPolicyTraffic`](#cdk8s-plus-27.NetworkPolicyTraffic)
- *Default:* the policy doesn't change egress behavior of the pods it selects.

Egress traffic configuration.

---

##### `ingress`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyProps.property.ingress"></a>

```typescript
public readonly ingress: NetworkPolicyTraffic;
```

- *Type:* [`cdk8s-plus-27.NetworkPolicyTraffic`](#cdk8s-plus-27.NetworkPolicyTraffic)
- *Default:* the policy doesn't change ingress behavior of the pods it selects.

Ingress traffic configuration.

---

##### `selector`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyProps.property.selector"></a>

```typescript
public readonly selector: IPodSelector;
```

- *Type:* [`cdk8s-plus-27.IPodSelector`](#cdk8s-plus-27.IPodSelector)
- *Default:* will select all pods in the namespace of the policy.

Which pods does this policy object applies to.

This can either be a single pod / workload, or a grouping of pods selected
via the `Pods.select` function. Rules is applied to any pods selected by this property.
Multiple network policies can select the same set of pods.
In this case, the rules for each are combined additively.

Note that

---

### NetworkPolicyRule <a name="cdk8s-plus-27.NetworkPolicyRule"></a>

Describes a rule allowing traffic from / to pods matched by a network policy selector.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NetworkPolicyRule } from 'cdk8s-plus-27'

const networkPolicyRule: NetworkPolicyRule = { ... }
```

##### `peer`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyRule.property.peer"></a>

```typescript
public readonly peer: INetworkPolicyPeer;
```

- *Type:* [`cdk8s-plus-27.INetworkPolicyPeer`](#cdk8s-plus-27.INetworkPolicyPeer)

Peer this rule interacts with.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyRule.property.ports"></a>

```typescript
public readonly ports: NetworkPolicyPort[];
```

- *Type:* [`cdk8s-plus-27.NetworkPolicyPort`](#cdk8s-plus-27.NetworkPolicyPort)[]
- *Default:* traffic is allowed on all ports.

The ports of the rule.

---

### NetworkPolicyTraffic <a name="cdk8s-plus-27.NetworkPolicyTraffic"></a>

Describes how the network policy should configure egress / ingress traffic.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NetworkPolicyTraffic } from 'cdk8s-plus-27'

const networkPolicyTraffic: NetworkPolicyTraffic = { ... }
```

##### `default`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyTraffic.property.default"></a>

```typescript
public readonly default: NetworkPolicyTrafficDefault;
```

- *Type:* [`cdk8s-plus-27.NetworkPolicyTrafficDefault`](#cdk8s-plus-27.NetworkPolicyTrafficDefault)
- *Default:* unset, the policy does not change the behavior.

Specifies the default behavior of the policy when no rules are defined.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s-plus-27.NetworkPolicyTraffic.property.rules"></a>

```typescript
public readonly rules: NetworkPolicyRule[];
```

- *Type:* [`cdk8s-plus-27.NetworkPolicyRule`](#cdk8s-plus-27.NetworkPolicyRule)[]
- *Default:* no rules

List of rules to be applied to the selected pods.

If empty, the behavior of the policy is dictated by the `default` property.

---

### NfsVolumeOptions <a name="cdk8s-plus-27.NfsVolumeOptions"></a>

Options for the NFS based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NfsVolumeOptions } from 'cdk8s-plus-27'

const nfsVolumeOptions: NfsVolumeOptions = { ... }
```

##### `path`<sup>Required</sup> <a name="cdk8s-plus-27.NfsVolumeOptions.property.path"></a>

```typescript
public readonly path: string;
```

- *Type:* `string`

Path that is exported by the NFS server.

---

##### `server`<sup>Required</sup> <a name="cdk8s-plus-27.NfsVolumeOptions.property.server"></a>

```typescript
public readonly server: string;
```

- *Type:* `string`

Server is the hostname or IP address of the NFS server.

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.NfsVolumeOptions.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

If set to true, will force the NFS export to be mounted with read-only permissions.

---

### NodeTaintQueryOptions <a name="cdk8s-plus-27.NodeTaintQueryOptions"></a>

Options for `NodeTaintQuery`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { NodeTaintQueryOptions } from 'cdk8s-plus-27'

const nodeTaintQueryOptions: NodeTaintQueryOptions = { ... }
```

##### `effect`<sup>Optional</sup> <a name="cdk8s-plus-27.NodeTaintQueryOptions.property.effect"></a>

```typescript
public readonly effect: TaintEffect;
```

- *Type:* [`cdk8s-plus-27.TaintEffect`](#cdk8s-plus-27.TaintEffect)
- *Default:* all effects are matched.

The taint effect to match.

---

##### `evictAfter`<sup>Optional</sup> <a name="cdk8s-plus-27.NodeTaintQueryOptions.property.evictAfter"></a>

```typescript
public readonly evictAfter: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* bound forever.

How much time should a pod that tolerates the `NO_EXECUTE` effect be bound to the node.

Only applies for the `NO_EXECUTE` effect.

---

### PathMapping <a name="cdk8s-plus-27.PathMapping"></a>

Maps a string key to a path within a volume.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PathMapping } from 'cdk8s-plus-27'

const pathMapping: PathMapping = { ... }
```

##### `path`<sup>Required</sup> <a name="cdk8s-plus-27.PathMapping.property.path"></a>

```typescript
public readonly path: string;
```

- *Type:* `string`

The relative path of the file to map the key to.

May not be an absolute
path. May not contain the path element '..'. May not start with the string
'..'.

---

##### `mode`<sup>Optional</sup> <a name="cdk8s-plus-27.PathMapping.property.mode"></a>

```typescript
public readonly mode: number;
```

- *Type:* `number`

Optional: mode bits to use on this file, must be a value between 0 and 0777.

If not specified, the volume defaultMode will be used. This might be
in conflict with other options that affect the file mode, like fsGroup, and
the result can be other mode bits set.

---

### PersistentVolumeClaimProps <a name="cdk8s-plus-27.PersistentVolumeClaimProps"></a>

Properties for `PersistentVolumeClaim`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PersistentVolumeClaimProps } from 'cdk8s-plus-27'

const persistentVolumeClaimProps: PersistentVolumeClaimProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaimProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaimProps.property.accessModes"></a>

```typescript
public readonly accessModes: PersistentVolumeAccessMode[];
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeAccessMode`](#cdk8s-plus-27.PersistentVolumeAccessMode)[]
- *Default:* No access modes requirement.

Contains the access modes the volume should support.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1

---

##### `storage`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaimProps.property.storage"></a>

```typescript
public readonly storage: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No storage requirement.

Minimum storage size the volume should have.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaimProps.property.storageClassName"></a>

```typescript
public readonly storageClassName: string;
```

- *Type:* `string`
- *Default:* Not set.

Name of the StorageClass required by the claim. When this property is not set, the behavior is as follows:.

If the admission plugin is turned on, the storage class marked as default will be used.
- If the admission plugin is turned off, the pvc can only be bound to volumes without a storage class.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1

---

##### `volume`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaimProps.property.volume"></a>

```typescript
public readonly volume: IPersistentVolume;
```

- *Type:* [`cdk8s-plus-27.IPersistentVolume`](#cdk8s-plus-27.IPersistentVolume)
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

##### `volumeMode`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaimProps.property.volumeMode"></a>

```typescript
public readonly volumeMode: PersistentVolumeMode;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeMode`](#cdk8s-plus-27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

### PersistentVolumeClaimVolumeOptions <a name="cdk8s-plus-27.PersistentVolumeClaimVolumeOptions"></a>

Options for a PersistentVolumeClaim-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PersistentVolumeClaimVolumeOptions } from 'cdk8s-plus-27'

const persistentVolumeClaimVolumeOptions: PersistentVolumeClaimVolumeOptions = { ... }
```

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaimVolumeOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* Derived from the PVC name.

The volume name.

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeClaimVolumeOptions.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

Will force the ReadOnly setting in VolumeMounts.

---

### PersistentVolumeProps <a name="cdk8s-plus-27.PersistentVolumeProps"></a>

Properties for `PersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PersistentVolumeProps } from 'cdk8s-plus-27'

const persistentVolumeProps: PersistentVolumeProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `accessModes`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeProps.property.accessModes"></a>

```typescript
public readonly accessModes: PersistentVolumeAccessMode[];
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeAccessMode`](#cdk8s-plus-27.PersistentVolumeAccessMode)[]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeProps.property.claim"></a>

```typescript
public readonly claim: IPersistentVolumeClaim;
```

- *Type:* [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mountOptions`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeProps.property.mountOptions"></a>

```typescript
public readonly mountOptions: string[];
```

- *Type:* `string`[]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaimPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeProps.property.reclaimPolicy"></a>

```typescript
public readonly reclaimPolicy: PersistentVolumeReclaimPolicy;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeReclaimPolicy`](#cdk8s-plus-27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeProps.property.storage"></a>

```typescript
public readonly storage: Size;
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storageClassName`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeProps.property.storageClassName"></a>

```typescript
public readonly storageClassName: string;
```

- *Type:* `string`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volumeMode`<sup>Optional</sup> <a name="cdk8s-plus-27.PersistentVolumeProps.property.volumeMode"></a>

```typescript
public readonly volumeMode: PersistentVolumeMode;
```

- *Type:* [`cdk8s-plus-27.PersistentVolumeMode`](#cdk8s-plus-27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

### PodConnectionsAllowFromOptions <a name="cdk8s-plus-27.PodConnectionsAllowFromOptions"></a>

Options for `PodConnections.allowFrom`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodConnectionsAllowFromOptions } from 'cdk8s-plus-27'

const podConnectionsAllowFromOptions: PodConnectionsAllowFromOptions = { ... }
```

##### `isolation`<sup>Optional</sup> <a name="cdk8s-plus-27.PodConnectionsAllowFromOptions.property.isolation"></a>

```typescript
public readonly isolation: PodConnectionsIsolation;
```

- *Type:* [`cdk8s-plus-27.PodConnectionsIsolation`](#cdk8s-plus-27.PodConnectionsIsolation)
- *Default:* unset, isolates both the pod and the peer.

Which isolation should be applied to establish the connection.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.PodConnectionsAllowFromOptions.property.ports"></a>

```typescript
public readonly ports: NetworkPolicyPort[];
```

- *Type:* [`cdk8s-plus-27.NetworkPolicyPort`](#cdk8s-plus-27.NetworkPolicyPort)[]
- *Default:* The pod ports.

Ports to allow incoming traffic to.

---

### PodConnectionsAllowToOptions <a name="cdk8s-plus-27.PodConnectionsAllowToOptions"></a>

Options for `PodConnections.allowTo`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodConnectionsAllowToOptions } from 'cdk8s-plus-27'

const podConnectionsAllowToOptions: PodConnectionsAllowToOptions = { ... }
```

##### `isolation`<sup>Optional</sup> <a name="cdk8s-plus-27.PodConnectionsAllowToOptions.property.isolation"></a>

```typescript
public readonly isolation: PodConnectionsIsolation;
```

- *Type:* [`cdk8s-plus-27.PodConnectionsIsolation`](#cdk8s-plus-27.PodConnectionsIsolation)
- *Default:* unset, isolates both the pod and the peer.

Which isolation should be applied to establish the connection.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.PodConnectionsAllowToOptions.property.ports"></a>

```typescript
public readonly ports: NetworkPolicyPort[];
```

- *Type:* [`cdk8s-plus-27.NetworkPolicyPort`](#cdk8s-plus-27.NetworkPolicyPort)[]
- *Default:* If the peer is a managed pod, take its ports. Otherwise, all ports are allowed.

Ports to allow outgoing traffic to.

---

### PodDnsProps <a name="cdk8s-plus-27.PodDnsProps"></a>

Properties for `PodDns`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodDnsProps } from 'cdk8s-plus-27'

const podDnsProps: PodDnsProps = { ... }
```

##### `hostname`<sup>Optional</sup> <a name="cdk8s-plus-27.PodDnsProps.property.hostname"></a>

```typescript
public readonly hostname: string;
```

- *Type:* `string`
- *Default:* Set to a system-defined value.

Specifies the hostname of the Pod.

---

##### `hostnameAsFQDN`<sup>Optional</sup> <a name="cdk8s-plus-27.PodDnsProps.property.hostnameAsFQDN"></a>

```typescript
public readonly hostnameAsFQDN: boolean;
```

- *Type:* `boolean`
- *Default:* false

If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default).

In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname).
In Windows containers, this means setting the registry value of hostname for the registry
key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN.
If a pod does not have FQDN, this has no effect.

---

##### `nameservers`<sup>Optional</sup> <a name="cdk8s-plus-27.PodDnsProps.property.nameservers"></a>

```typescript
public readonly nameservers: string[];
```

- *Type:* `string`[]

A list of IP addresses that will be used as DNS servers for the Pod.

There can be at most 3 IP addresses specified.
When the policy is set to "NONE", the list must contain at least one IP address,
otherwise this property is optional.
The servers listed will be combined to the base nameservers generated from
the specified DNS policy with duplicate addresses removed.

---

##### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.PodDnsProps.property.options"></a>

```typescript
public readonly options: DnsOption[];
```

- *Type:* [`cdk8s-plus-27.DnsOption`](#cdk8s-plus-27.DnsOption)[]

List of objects where each object may have a name property (required) and a value property (optional).

The contents in this property
will be merged to the options generated from the specified DNS policy.
Duplicate entries are removed.

---

##### `policy`<sup>Optional</sup> <a name="cdk8s-plus-27.PodDnsProps.property.policy"></a>

```typescript
public readonly policy: DnsPolicy;
```

- *Type:* [`cdk8s-plus-27.DnsPolicy`](#cdk8s-plus-27.DnsPolicy)
- *Default:* DnsPolicy.CLUSTER_FIRST

Set DNS policy for the pod.

If policy is set to `None`, other configuration must be supplied.

---

##### `searches`<sup>Optional</sup> <a name="cdk8s-plus-27.PodDnsProps.property.searches"></a>

```typescript
public readonly searches: string[];
```

- *Type:* `string`[]

A list of DNS search domains for hostname lookup in the Pod.

When specified, the provided list will be merged into the base
search domain names generated from the chosen DNS policy.
Duplicate domain names are removed.

Kubernetes allows for at most 6 search domains.

---

##### `subdomain`<sup>Optional</sup> <a name="cdk8s-plus-27.PodDnsProps.property.subdomain"></a>

```typescript
public readonly subdomain: string;
```

- *Type:* `string`
- *Default:* No subdomain.

If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>".

---

### PodProps <a name="cdk8s-plus-27.PodProps"></a>

Properties for `Pod`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodProps } from 'cdk8s-plus-27'

const podProps: PodProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.automountServiceAccountToken"></a>

```typescript
public readonly automountServiceAccountToken: boolean;
```

- *Type:* `boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.containers"></a>

```typescript
public readonly containers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.dns"></a>

```typescript
public readonly dns: PodDnsProps;
```

- *Type:* [`cdk8s-plus-27.PodDnsProps`](#cdk8s-plus-27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.dockerRegistryAuth"></a>

```typescript
public readonly dockerRegistryAuth: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.hostAliases"></a>

```typescript
public readonly hostAliases: HostAlias[];
```

- *Type:* [`cdk8s-plus-27.HostAlias`](#cdk8s-plus-27.HostAlias)[]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.hostNetwork"></a>

```typescript
public readonly hostNetwork: boolean;
```

- *Type:* `boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.initContainers"></a>

```typescript
public readonly initContainers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.isolate"></a>

```typescript
public readonly isolate: boolean;
```

- *Type:* `boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.restartPolicy"></a>

```typescript
public readonly restartPolicy: RestartPolicy;
```

- *Type:* [`cdk8s-plus-27.RestartPolicy`](#cdk8s-plus-27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.securityContext"></a>

```typescript
public readonly securityContext: PodSecurityContextProps;
```

- *Type:* [`cdk8s-plus-27.PodSecurityContextProps`](#cdk8s-plus-27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.serviceAccount"></a>

```typescript
public readonly serviceAccount: IServiceAccount;
```

- *Type:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)
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

##### `terminationGracePeriod`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.terminationGracePeriod"></a>

```typescript
public readonly terminationGracePeriod: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s-plus-27.PodProps.property.volumes"></a>

```typescript
public readonly volumes: Volume[];
```

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)[]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

### PodsAllOptions <a name="cdk8s-plus-27.PodsAllOptions"></a>

Options for `Pods.all`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodsAllOptions } from 'cdk8s-plus-27'

const podsAllOptions: PodsAllOptions = { ... }
```

##### `namespaces`<sup>Optional</sup> <a name="cdk8s-plus-27.PodsAllOptions.property.namespaces"></a>

```typescript
public readonly namespaces: Namespaces;
```

- *Type:* [`cdk8s-plus-27.Namespaces`](#cdk8s-plus-27.Namespaces)
- *Default:* unset, implies the namespace of the resource this selection is used in.

Namespaces the pods are allowed to be in.

Use `Namespaces.all()` to allow all namespaces.

---

### PodSchedulingAttractOptions <a name="cdk8s-plus-27.PodSchedulingAttractOptions"></a>

Options for `PodScheduling.attract`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodSchedulingAttractOptions } from 'cdk8s-plus-27'

const podSchedulingAttractOptions: PodSchedulingAttractOptions = { ... }
```

##### `weight`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSchedulingAttractOptions.property.weight"></a>

```typescript
public readonly weight: number;
```

- *Type:* `number`
- *Default:* no weight. assignment is assumed to be required (hard).

Indicates the attraction is optional (soft), with this weight score.

---

### PodSchedulingColocateOptions <a name="cdk8s-plus-27.PodSchedulingColocateOptions"></a>

Options for `PodScheduling.colocate`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodSchedulingColocateOptions } from 'cdk8s-plus-27'

const podSchedulingColocateOptions: PodSchedulingColocateOptions = { ... }
```

##### `topology`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSchedulingColocateOptions.property.topology"></a>

```typescript
public readonly topology: Topology;
```

- *Type:* [`cdk8s-plus-27.Topology`](#cdk8s-plus-27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to coloate on.

---

##### `weight`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSchedulingColocateOptions.property.weight"></a>

```typescript
public readonly weight: number;
```

- *Type:* `number`
- *Default:* no weight. co-location is assumed to be required (hard).

Indicates the co-location is optional (soft), with this weight score.

---

### PodSchedulingSeparateOptions <a name="cdk8s-plus-27.PodSchedulingSeparateOptions"></a>

Options for `PodScheduling.separate`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodSchedulingSeparateOptions } from 'cdk8s-plus-27'

const podSchedulingSeparateOptions: PodSchedulingSeparateOptions = { ... }
```

##### `topology`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSchedulingSeparateOptions.property.topology"></a>

```typescript
public readonly topology: Topology;
```

- *Type:* [`cdk8s-plus-27.Topology`](#cdk8s-plus-27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to separate on.

---

##### `weight`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSchedulingSeparateOptions.property.weight"></a>

```typescript
public readonly weight: number;
```

- *Type:* `number`
- *Default:* no weight. separation is assumed to be required (hard).

Indicates the separation is optional (soft), with this weight score.

---

### PodSecurityContextProps <a name="cdk8s-plus-27.PodSecurityContextProps"></a>

Properties for `PodSecurityContext`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodSecurityContextProps } from 'cdk8s-plus-27'

const podSecurityContextProps: PodSecurityContextProps = { ... }
```

##### `ensureNonRoot`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSecurityContextProps.property.ensureNonRoot"></a>

```typescript
public readonly ensureNonRoot: boolean;
```

- *Type:* `boolean`
- *Default:* true

Indicates that the container must run as a non-root user.

If true, the Kubelet will validate the image at runtime to ensure that it does
not run as UID 0 (root) and fail to start the container if it does.

---

##### `fsGroup`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSecurityContextProps.property.fsGroup"></a>

```typescript
public readonly fsGroup: number;
```

- *Type:* `number`
- *Default:* Volume ownership is not changed.

Modify the ownership and permissions of pod volumes to this GID.

---

##### `fsGroupChangePolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSecurityContextProps.property.fsGroupChangePolicy"></a>

```typescript
public readonly fsGroupChangePolicy: FsGroupChangePolicy;
```

- *Type:* [`cdk8s-plus-27.FsGroupChangePolicy`](#cdk8s-plus-27.FsGroupChangePolicy)
- *Default:* FsGroupChangePolicy.ALWAYS

Defines behavior of changing ownership and permission of the volume before being exposed inside Pod.

This field will only apply to volume types which support fsGroup based ownership(and permissions).
It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir.

---

##### `group`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSecurityContextProps.property.group"></a>

```typescript
public readonly group: number;
```

- *Type:* `number`
- *Default:* Group configured by container runtime

The GID to run the entrypoint of the container process.

---

##### `sysctls`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSecurityContextProps.property.sysctls"></a>

```typescript
public readonly sysctls: Sysctl[];
```

- *Type:* [`cdk8s-plus-27.Sysctl`](#cdk8s-plus-27.Sysctl)[]
- *Default:* No sysctls

Sysctls hold a list of namespaced sysctls used for the pod.

Pods with unsupported sysctls (by the container runtime) might fail to launch.

---

##### `user`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSecurityContextProps.property.user"></a>

```typescript
public readonly user: number;
```

- *Type:* `number`
- *Default:* User specified in image metadata

The UID to run the entrypoint of the container process.

---

### PodSelectorConfig <a name="cdk8s-plus-27.PodSelectorConfig"></a>

Configuration for selecting pods, optionally in particular namespaces.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodSelectorConfig } from 'cdk8s-plus-27'

const podSelectorConfig: PodSelectorConfig = { ... }
```

##### `labelSelector`<sup>Required</sup> <a name="cdk8s-plus-27.PodSelectorConfig.property.labelSelector"></a>

```typescript
public readonly labelSelector: LabelSelector;
```

- *Type:* [`cdk8s-plus-27.LabelSelector`](#cdk8s-plus-27.LabelSelector)

A selector to select pods by labels.

---

##### `namespaces`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSelectorConfig.property.namespaces"></a>

```typescript
public readonly namespaces: NamespaceSelectorConfig;
```

- *Type:* [`cdk8s-plus-27.NamespaceSelectorConfig`](#cdk8s-plus-27.NamespaceSelectorConfig)

Configuration for selecting which namepsaces are the pods allowed to be in.

---

### PodsSelectOptions <a name="cdk8s-plus-27.PodsSelectOptions"></a>

Options for `Pods.select`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { PodsSelectOptions } from 'cdk8s-plus-27'

const podsSelectOptions: PodsSelectOptions = { ... }
```

##### `expressions`<sup>Optional</sup> <a name="cdk8s-plus-27.PodsSelectOptions.property.expressions"></a>

```typescript
public readonly expressions: LabelExpression[];
```

- *Type:* [`cdk8s-plus-27.LabelExpression`](#cdk8s-plus-27.LabelExpression)[]
- *Default:* no expressions requirements.

Expressions the pods must satisify.

---

##### `labels`<sup>Optional</sup> <a name="cdk8s-plus-27.PodsSelectOptions.property.labels"></a>

```typescript
public readonly labels: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}
- *Default:* no strict labels requirements.

Labels the pods must have.

---

##### `namespaces`<sup>Optional</sup> <a name="cdk8s-plus-27.PodsSelectOptions.property.namespaces"></a>

```typescript
public readonly namespaces: Namespaces;
```

- *Type:* [`cdk8s-plus-27.Namespaces`](#cdk8s-plus-27.Namespaces)
- *Default:* unset, implies the namespace of the resource this selection is used in.

Namespaces the pods are allowed to be in.

Use `Namespaces.all()` to allow all namespaces.

---

### ProbeOptions <a name="cdk8s-plus-27.ProbeOptions"></a>

Probe options.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ProbeOptions } from 'cdk8s-plus-27'

const probeOptions: ProbeOptions = { ... }
```

##### `failureThreshold`<sup>Optional</sup> <a name="cdk8s-plus-27.ProbeOptions.property.failureThreshold"></a>

```typescript
public readonly failureThreshold: number;
```

- *Type:* `number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.ProbeOptions.property.initialDelaySeconds"></a>

```typescript
public readonly initialDelaySeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.ProbeOptions.property.periodSeconds"></a>

```typescript
public readonly periodSeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="cdk8s-plus-27.ProbeOptions.property.successThreshold"></a>

```typescript
public readonly successThreshold: number;
```

- *Type:* `number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.ProbeOptions.property.timeoutSeconds"></a>

```typescript
public readonly timeoutSeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

### ResourceProps <a name="cdk8s-plus-27.ResourceProps"></a>

Initialization properties for resources.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ResourceProps } from 'cdk8s-plus-27'

const resourceProps: ResourceProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.ResourceProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

### RoleBindingProps <a name="cdk8s-plus-27.RoleBindingProps"></a>

Properties for `RoleBinding`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { RoleBindingProps } from 'cdk8s-plus-27'

const roleBindingProps: RoleBindingProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.RoleBindingProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `role`<sup>Required</sup> <a name="cdk8s-plus-27.RoleBindingProps.property.role"></a>

```typescript
public readonly role: IRole;
```

- *Type:* [`cdk8s-plus-27.IRole`](#cdk8s-plus-27.IRole)

The role to bind to.

A RoleBinding can reference a Role or a ClusterRole.

---

### RolePolicyRule <a name="cdk8s-plus-27.RolePolicyRule"></a>

Policy rule of a `Role.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { RolePolicyRule } from 'cdk8s-plus-27'

const rolePolicyRule: RolePolicyRule = { ... }
```

##### `resources`<sup>Required</sup> <a name="cdk8s-plus-27.RolePolicyRule.property.resources"></a>

```typescript
public readonly resources: IApiResource[];
```

- *Type:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)[]

Resources this rule applies to.

---

##### `verbs`<sup>Required</sup> <a name="cdk8s-plus-27.RolePolicyRule.property.verbs"></a>

```typescript
public readonly verbs: string[];
```

- *Type:* `string`[]

Verbs to allow.

(e.g ['get', 'watch'])

---

### RoleProps <a name="cdk8s-plus-27.RoleProps"></a>

Properties for `Role`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { RoleProps } from 'cdk8s-plus-27'

const roleProps: RoleProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.RoleProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s-plus-27.RoleProps.property.rules"></a>

```typescript
public readonly rules: RolePolicyRule[];
```

- *Type:* [`cdk8s-plus-27.RolePolicyRule`](#cdk8s-plus-27.RolePolicyRule)[]
- *Default:* []

A list of rules the role should allow.

---

### ScalingPolicy <a name="cdk8s-plus-27.ScalingPolicy"></a>

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ScalingPolicy } from 'cdk8s-plus-27'

const scalingPolicy: ScalingPolicy = { ... }
```

##### `replicas`<sup>Required</sup> <a name="cdk8s-plus-27.ScalingPolicy.property.replicas"></a>

```typescript
public readonly replicas: Replicas;
```

- *Type:* [`cdk8s-plus-27.Replicas`](#cdk8s-plus-27.Replicas)

The type and quantity of replicas to change.

---

##### `duration`<sup>Optional</sup> <a name="cdk8s-plus-27.ScalingPolicy.property.duration"></a>

```typescript
public readonly duration: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* 15 seconds

The amount of time the scaling policy has to continue scaling before the target metric must be revalidated.

Must be greater than 0 seconds and no longer than 30 minutes.

---

### ScalingRules <a name="cdk8s-plus-27.ScalingRules"></a>

Defines the scaling behavior for one direction.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ScalingRules } from 'cdk8s-plus-27'

const scalingRules: ScalingRules = { ... }
```

##### `policies`<sup>Optional</sup> <a name="cdk8s-plus-27.ScalingRules.property.policies"></a>

```typescript
public readonly policies: ScalingPolicy[];
```

- *Type:* [`cdk8s-plus-27.ScalingPolicy`](#cdk8s-plus-27.ScalingPolicy)[]
- *Default:* * Scale up
  * Increase no more than 4 pods per 60 seconds
  * Double the number of pods per 60 seconds
* Scale down
  * Decrease to minReplica count

The scaling policies.

---

##### `stabilizationWindow`<sup>Optional</sup> <a name="cdk8s-plus-27.ScalingRules.property.stabilizationWindow"></a>

```typescript
public readonly stabilizationWindow: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* * On scale down no stabilization is performed.
* On scale up stabilization is performed for 5 minutes.

Defines the window of past metrics that the autoscaler should consider when calculating wether or not autoscaling should occur.

Minimum duration is 1 second, max is 1 hour.

---

##### `strategy`<sup>Optional</sup> <a name="cdk8s-plus-27.ScalingRules.property.strategy"></a>

```typescript
public readonly strategy: ScalingStrategy;
```

- *Type:* [`cdk8s-plus-27.ScalingStrategy`](#cdk8s-plus-27.ScalingStrategy)
- *Default:* MAX_CHANGE

The strategy to use when scaling.

---

### ScalingTarget <a name="cdk8s-plus-27.ScalingTarget"></a>

Properties used to configure the target of an Autoscaler.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ScalingTarget } from 'cdk8s-plus-27'

const scalingTarget: ScalingTarget = { ... }
```

##### `apiVersion`<sup>Required</sup> <a name="cdk8s-plus-27.ScalingTarget.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `containers`<sup>Required</sup> <a name="cdk8s-plus-27.ScalingTarget.property.containers"></a>

```typescript
public readonly containers: Container[];
```

- *Type:* [`cdk8s-plus-27.Container`](#cdk8s-plus-27.Container)[]

Container definitions associated with the target.

---

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.ScalingTarget.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.ScalingTarget.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The Kubernetes name of this resource.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s-plus-27.ScalingTarget.property.replicas"></a>

```typescript
public readonly replicas: number;
```

- *Type:* `number`

The fixed number of replicas defined on the target.

This is used
for validation purposes as Scalable targets should not have a
fixed number of replicas.

---

### SecretProps <a name="cdk8s-plus-27.SecretProps"></a>

Options for `Secret`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { SecretProps } from 'cdk8s-plus-27'

const secretProps: SecretProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.SecretProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s-plus-27.SecretProps.property.immutable"></a>

```typescript
public readonly immutable: boolean;
```

- *Type:* `boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `stringData`<sup>Optional</sup> <a name="cdk8s-plus-27.SecretProps.property.stringData"></a>

```typescript
public readonly stringData: {[ key: string ]: string};
```

- *Type:* {[ key: string ]: `string`}

stringData allows specifying non-binary secret data in string form.

It is
provided as a write-only convenience method. All keys and values are merged
into the data field on write, overwriting any existing values. It is never
output when reading from the API.

---

##### `type`<sup>Optional</sup> <a name="cdk8s-plus-27.SecretProps.property.type"></a>

```typescript
public readonly type: string;
```

- *Type:* `string`
- *Default:* undefined - Don't set a type.

Optional type associated with the secret.

Used to facilitate programmatic
handling of secret data by various controllers.

---

### SecretValue <a name="cdk8s-plus-27.SecretValue"></a>

Represents a specific value in JSON secret.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { SecretValue } from 'cdk8s-plus-27'

const secretValue: SecretValue = { ... }
```

##### `key`<sup>Required</sup> <a name="cdk8s-plus-27.SecretValue.property.key"></a>

```typescript
public readonly key: string;
```

- *Type:* `string`

The JSON key.

---

##### `secret`<sup>Required</sup> <a name="cdk8s-plus-27.SecretValue.property.secret"></a>

```typescript
public readonly secret: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)

The secret.

---

### SecretVolumeOptions <a name="cdk8s-plus-27.SecretVolumeOptions"></a>

Options for the Secret-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { SecretVolumeOptions } from 'cdk8s-plus-27'

const secretVolumeOptions: SecretVolumeOptions = { ... }
```

##### `defaultMode`<sup>Optional</sup> <a name="cdk8s-plus-27.SecretVolumeOptions.property.defaultMode"></a>

```typescript
public readonly defaultMode: number;
```

- *Type:* `number`
- *Default:* 0644. Directories within the path are not affected by this
setting. This might be in conflict with other options that affect the file
mode, like fsGroup, and the result can be other mode bits set.

Mode bits to use on created files by default.

Must be a value between 0 and
0777. Defaults to 0644. Directories within the path are not affected by
this setting. This might be in conflict with other options that affect the
file mode, like fsGroup, and the result can be other mode bits set.

---

##### `items`<sup>Optional</sup> <a name="cdk8s-plus-27.SecretVolumeOptions.property.items"></a>

```typescript
public readonly items: {[ key: string ]: PathMapping};
```

- *Type:* {[ key: string ]: [`cdk8s-plus-27.PathMapping`](#cdk8s-plus-27.PathMapping)}
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced secret will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the secret, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.SecretVolumeOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`
- *Default:* auto-generated

The volume name.

---

##### `optional`<sup>Optional</sup> <a name="cdk8s-plus-27.SecretVolumeOptions.property.optional"></a>

```typescript
public readonly optional: boolean;
```

- *Type:* `boolean`
- *Default:* undocumented

Specify whether the secret or its keys must be defined.

---

### ServiceAccountProps <a name="cdk8s-plus-27.ServiceAccountProps"></a>

Properties for initialization of `ServiceAccount`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ServiceAccountProps } from 'cdk8s-plus-27'

const serviceAccountProps: ServiceAccountProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceAccountProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountToken`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceAccountProps.property.automountToken"></a>

```typescript
public readonly automountToken: boolean;
```

- *Type:* `boolean`
- *Default:* false

Indicates whether pods running as this service account should have an API token automatically mounted.

Can be overridden at the pod level.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `secrets`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceAccountProps.property.secrets"></a>

```typescript
public readonly secrets: ISecret[];
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)[]

List of secrets allowed to be used by pods running using this ServiceAccount.

> https://kubernetes.io/docs/concepts/configuration/secret

---

### ServiceAccountTokenSecretProps <a name="cdk8s-plus-27.ServiceAccountTokenSecretProps"></a>

Options for `ServiceAccountTokenSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ServiceAccountTokenSecretProps } from 'cdk8s-plus-27'

const serviceAccountTokenSecretProps: ServiceAccountTokenSecretProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceAccountTokenSecretProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceAccountTokenSecretProps.property.immutable"></a>

```typescript
public readonly immutable: boolean;
```

- *Type:* `boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `serviceAccount`<sup>Required</sup> <a name="cdk8s-plus-27.ServiceAccountTokenSecretProps.property.serviceAccount"></a>

```typescript
public readonly serviceAccount: IServiceAccount;
```

- *Type:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)

The service account to store a secret for.

---

### ServiceBindOptions <a name="cdk8s-plus-27.ServiceBindOptions"></a>

Options for `Service.bind`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ServiceBindOptions } from 'cdk8s-plus-27'

const serviceBindOptions: ServiceBindOptions = { ... }
```

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceBindOptions.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

##### `nodePort`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceBindOptions.property.nodePort"></a>

```typescript
public readonly nodePort: number;
```

- *Type:* `number`
- *Default:* auto-allocate a port if the ServiceType of this Service requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceBindOptions.property.protocol"></a>

```typescript
public readonly protocol: Protocol;
```

- *Type:* [`cdk8s-plus-27.Protocol`](#cdk8s-plus-27.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `targetPort`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceBindOptions.property.targetPort"></a>

```typescript
public readonly targetPort: number;
```

- *Type:* `number`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

### ServiceIngressBackendOptions <a name="cdk8s-plus-27.ServiceIngressBackendOptions"></a>

Options for setting up backends for ingress rules.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ServiceIngressBackendOptions } from 'cdk8s-plus-27'

const serviceIngressBackendOptions: ServiceIngressBackendOptions = { ... }
```

##### `port`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceIngressBackendOptions.property.port"></a>

```typescript
public readonly port: number;
```

- *Type:* `number`
- *Default:* if the service exposes a single port, this port will be used.

The port to use to access the service.

This option will fail if the service does not expose any ports.
- If the service exposes multiple ports, this option must be specified.
- If the service exposes a single port, this option is optional and if
   specified, it must be the same port exposed by the service.

---

### ServicePort <a name="cdk8s-plus-27.ServicePort"></a>

Definition of a service port.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ServicePort } from 'cdk8s-plus-27'

const servicePort: ServicePort = { ... }
```

##### `name`<sup>Optional</sup> <a name="cdk8s-plus-27.ServicePort.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

##### `nodePort`<sup>Optional</sup> <a name="cdk8s-plus-27.ServicePort.property.nodePort"></a>

```typescript
public readonly nodePort: number;
```

- *Type:* `number`
- *Default:* auto-allocate a port if the ServiceType of this Service requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s-plus-27.ServicePort.property.protocol"></a>

```typescript
public readonly protocol: Protocol;
```

- *Type:* [`cdk8s-plus-27.Protocol`](#cdk8s-plus-27.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `targetPort`<sup>Optional</sup> <a name="cdk8s-plus-27.ServicePort.property.targetPort"></a>

```typescript
public readonly targetPort: number;
```

- *Type:* `number`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

##### `port`<sup>Required</sup> <a name="cdk8s-plus-27.ServicePort.property.port"></a>

```typescript
public readonly port: number;
```

- *Type:* `number`

The port number the service will bind to.

---

### ServiceProps <a name="cdk8s-plus-27.ServiceProps"></a>

Properties for `Service`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { ServiceProps } from 'cdk8s-plus-27'

const serviceProps: ServiceProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `clusterIP`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceProps.property.clusterIP"></a>

```typescript
public readonly clusterIP: string;
```

- *Type:* `string`
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

##### `externalIPs`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceProps.property.externalIPs"></a>

```typescript
public readonly externalIPs: string[];
```

- *Type:* `string`[]
- *Default:* No external IPs.

A list of IP addresses for which nodes in the cluster will also accept traffic for this service.

These IPs are not managed by Kubernetes. The user
is responsible for ensuring that traffic arrives at a node with this IP. A
common example is external load-balancers that are not part of the
Kubernetes system.

---

##### `externalName`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceProps.property.externalName"></a>

```typescript
public readonly externalName: string;
```

- *Type:* `string`
- *Default:* No external name.

The externalName to be used when ServiceType.EXTERNAL_NAME is set.

---

##### `loadBalancerSourceRanges`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceProps.property.loadBalancerSourceRanges"></a>

```typescript
public readonly loadBalancerSourceRanges: string[];
```

- *Type:* `string`[]

A list of CIDR IP addresses, if specified and supported by the platform, will restrict traffic through the cloud-provider load-balancer to the specified client IPs.

More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

---

##### `ports`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceProps.property.ports"></a>

```typescript
public readonly ports: ServicePort[];
```

- *Type:* [`cdk8s-plus-27.ServicePort`](#cdk8s-plus-27.ServicePort)[]
- *Default:* either the selector ports, or none.

The ports this service binds to.

If the selector of the service is a managed pod / workload,
its ports will are automatically extracted and used as the default value.
Otherwise, no ports are bound.

---

##### `selector`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceProps.property.selector"></a>

```typescript
public readonly selector: IPodSelector;
```

- *Type:* [`cdk8s-plus-27.IPodSelector`](#cdk8s-plus-27.IPodSelector)
- *Default:* unset, the service is assumed to have an external process managing
its endpoints, which Kubernetes will not modify.

Which pods should the service select and route to.

You can pass one of the following:

- An instance of `Pod` or any workload resource (e.g `Deployment`, `StatefulSet`, ...)
- Pods selected by the `Pods.select` function. Note that in this case only labels can be specified.

---

##### `type`<sup>Optional</sup> <a name="cdk8s-plus-27.ServiceProps.property.type"></a>

```typescript
public readonly type: ServiceType;
```

- *Type:* [`cdk8s-plus-27.ServiceType`](#cdk8s-plus-27.ServiceType)
- *Default:* ServiceType.ClusterIP

Determines how the Service is exposed.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

---

### SshAuthSecretProps <a name="cdk8s-plus-27.SshAuthSecretProps"></a>

Options for `SshAuthSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { SshAuthSecretProps } from 'cdk8s-plus-27'

const sshAuthSecretProps: SshAuthSecretProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.SshAuthSecretProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s-plus-27.SshAuthSecretProps.property.immutable"></a>

```typescript
public readonly immutable: boolean;
```

- *Type:* `boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `sshPrivateKey`<sup>Required</sup> <a name="cdk8s-plus-27.SshAuthSecretProps.property.sshPrivateKey"></a>

```typescript
public readonly sshPrivateKey: string;
```

- *Type:* `string`

The SSH private key to use.

---

### StatefulSetProps <a name="cdk8s-plus-27.StatefulSetProps"></a>

Properties for initialization of `StatefulSet`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { StatefulSetProps } from 'cdk8s-plus-27'

const statefulSetProps: StatefulSetProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.automountServiceAccountToken"></a>

```typescript
public readonly automountServiceAccountToken: boolean;
```

- *Type:* `boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.containers"></a>

```typescript
public readonly containers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.dns"></a>

```typescript
public readonly dns: PodDnsProps;
```

- *Type:* [`cdk8s-plus-27.PodDnsProps`](#cdk8s-plus-27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.dockerRegistryAuth"></a>

```typescript
public readonly dockerRegistryAuth: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.hostAliases"></a>

```typescript
public readonly hostAliases: HostAlias[];
```

- *Type:* [`cdk8s-plus-27.HostAlias`](#cdk8s-plus-27.HostAlias)[]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.hostNetwork"></a>

```typescript
public readonly hostNetwork: boolean;
```

- *Type:* `boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.initContainers"></a>

```typescript
public readonly initContainers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.isolate"></a>

```typescript
public readonly isolate: boolean;
```

- *Type:* `boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.restartPolicy"></a>

```typescript
public readonly restartPolicy: RestartPolicy;
```

- *Type:* [`cdk8s-plus-27.RestartPolicy`](#cdk8s-plus-27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.securityContext"></a>

```typescript
public readonly securityContext: PodSecurityContextProps;
```

- *Type:* [`cdk8s-plus-27.PodSecurityContextProps`](#cdk8s-plus-27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.serviceAccount"></a>

```typescript
public readonly serviceAccount: IServiceAccount;
```

- *Type:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)
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

##### `terminationGracePeriod`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.terminationGracePeriod"></a>

```typescript
public readonly terminationGracePeriod: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.volumes"></a>

```typescript
public readonly volumes: Volume[];
```

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)[]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.podMetadata"></a>

```typescript
public readonly podMetadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.select"></a>

```typescript
public readonly select: boolean;
```

- *Type:* `boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.spread"></a>

```typescript
public readonly spread: boolean;
```

- *Type:* `boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `minReady`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.minReady"></a>

```typescript
public readonly minReady: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(0)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

Zero means the pod will be considered available as soon as it is ready.

This is an alpha field and requires enabling StatefulSetMinReadySeconds feature gate.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds

---

##### `podManagementPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.podManagementPolicy"></a>

```typescript
public readonly podManagementPolicy: PodManagementPolicy;
```

- *Type:* [`cdk8s-plus-27.PodManagementPolicy`](#cdk8s-plus-27.PodManagementPolicy)
- *Default:* PodManagementPolicy.ORDERED_READY

Pod management policy to use for this statefulset.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.replicas"></a>

```typescript
public readonly replicas: number;
```

- *Type:* `number`
- *Default:* 1

Number of desired pods.

---

##### `service`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.service"></a>

```typescript
public readonly service: Service;
```

- *Type:* [`cdk8s-plus-27.Service`](#cdk8s-plus-27.Service)
- *Default:* A new headless service will be created.

Service to associate with the statefulset.

---

##### `strategy`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetProps.property.strategy"></a>

```typescript
public readonly strategy: StatefulSetUpdateStrategy;
```

- *Type:* [`cdk8s-plus-27.StatefulSetUpdateStrategy`](#cdk8s-plus-27.StatefulSetUpdateStrategy)
- *Default:* RollingUpdate with partition set to 0

Indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.

---

### StatefulSetUpdateStrategyRollingUpdateOptions <a name="cdk8s-plus-27.StatefulSetUpdateStrategyRollingUpdateOptions"></a>

Options for `StatefulSetUpdateStrategy.rollingUpdate`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { StatefulSetUpdateStrategyRollingUpdateOptions } from 'cdk8s-plus-27'

const statefulSetUpdateStrategyRollingUpdateOptions: StatefulSetUpdateStrategyRollingUpdateOptions = { ... }
```

##### `partition`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetUpdateStrategyRollingUpdateOptions.property.partition"></a>

```typescript
public readonly partition: number;
```

- *Type:* `number`
- *Default:* 0

If specified, all Pods with an ordinal that is greater than or equal to the partition will be updated when the StatefulSet's .spec.template is updated. All Pods with an ordinal that is less than the partition will not be updated, and, even if they are deleted, they will be recreated at the previous version.

If the partition is greater than replicas, updates to the pod template will not be propagated to Pods.
In most cases you will not need to use a partition, but they are useful if you want to stage an
update, roll out a canary, or perform a phased roll out.

> https://kubernetes.io/docs/concepts/workloads/controllers/statefulset/#partitions

---

### SubjectConfiguration <a name="cdk8s-plus-27.SubjectConfiguration"></a>

Subject contains a reference to the object or user identities a role binding applies to.

This can either hold a direct API object reference, or a value
for non-objects such as user and group names.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { SubjectConfiguration } from 'cdk8s-plus-27'

const subjectConfiguration: SubjectConfiguration = { ... }
```

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.SubjectConfiguration.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

Kind of object being referenced.

Values defined by this API group are
"User", "Group", and "ServiceAccount". If the Authorizer does not
recognized the kind value, the Authorizer should report an error.

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.SubjectConfiguration.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

Name of the object being referenced.

---

##### `apiGroup`<sup>Optional</sup> <a name="cdk8s-plus-27.SubjectConfiguration.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

APIGroup holds the API group of the referenced subject.

Defaults to "" for
ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User
and Group subjects.

---

##### `namespace`<sup>Optional</sup> <a name="cdk8s-plus-27.SubjectConfiguration.property.namespace"></a>

```typescript
public readonly namespace: string;
```

- *Type:* `string`

Namespace of the referenced object.

If the object kind is non-namespace,
such as "User" or "Group", and this value is not empty the Authorizer
should report an error.

---

### Sysctl <a name="cdk8s-plus-27.Sysctl"></a>

Sysctl defines a kernel parameter to be set.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { Sysctl } from 'cdk8s-plus-27'

const sysctl: Sysctl = { ... }
```

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Sysctl.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

Name of a property to set.

---

##### `value`<sup>Required</sup> <a name="cdk8s-plus-27.Sysctl.property.value"></a>

```typescript
public readonly value: string;
```

- *Type:* `string`

Value of a property to set.

---

### TcpSocketProbeOptions <a name="cdk8s-plus-27.TcpSocketProbeOptions"></a>

Options for `Probe.fromTcpSocket()`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { TcpSocketProbeOptions } from 'cdk8s-plus-27'

const tcpSocketProbeOptions: TcpSocketProbeOptions = { ... }
```

##### `failureThreshold`<sup>Optional</sup> <a name="cdk8s-plus-27.TcpSocketProbeOptions.property.failureThreshold"></a>

```typescript
public readonly failureThreshold: number;
```

- *Type:* `number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.TcpSocketProbeOptions.property.initialDelaySeconds"></a>

```typescript
public readonly initialDelaySeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.TcpSocketProbeOptions.property.periodSeconds"></a>

```typescript
public readonly periodSeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="cdk8s-plus-27.TcpSocketProbeOptions.property.successThreshold"></a>

```typescript
public readonly successThreshold: number;
```

- *Type:* `number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="cdk8s-plus-27.TcpSocketProbeOptions.property.timeoutSeconds"></a>

```typescript
public readonly timeoutSeconds: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `host`<sup>Optional</sup> <a name="cdk8s-plus-27.TcpSocketProbeOptions.property.host"></a>

```typescript
public readonly host: string;
```

- *Type:* `string`
- *Default:* defaults to the pod IP

The host name to connect to on the container.

---

##### `port`<sup>Optional</sup> <a name="cdk8s-plus-27.TcpSocketProbeOptions.property.port"></a>

```typescript
public readonly port: number;
```

- *Type:* `number`
- *Default:* defaults to `container.port`.

The TCP port to connect to on the container.

---

### TlsSecretProps <a name="cdk8s-plus-27.TlsSecretProps"></a>

Options for `TlsSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { TlsSecretProps } from 'cdk8s-plus-27'

const tlsSecretProps: TlsSecretProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.TlsSecretProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s-plus-27.TlsSecretProps.property.immutable"></a>

```typescript
public readonly immutable: boolean;
```

- *Type:* `boolean`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `tlsCert`<sup>Required</sup> <a name="cdk8s-plus-27.TlsSecretProps.property.tlsCert"></a>

```typescript
public readonly tlsCert: string;
```

- *Type:* `string`

The TLS cert.

---

##### `tlsKey`<sup>Required</sup> <a name="cdk8s-plus-27.TlsSecretProps.property.tlsKey"></a>

```typescript
public readonly tlsKey: string;
```

- *Type:* `string`

The TLS key.

---

### VolumeMount <a name="cdk8s-plus-27.VolumeMount"></a>

Mount a volume from the pod to the container.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { VolumeMount } from 'cdk8s-plus-27'

const volumeMount: VolumeMount = { ... }
```

##### `propagation`<sup>Optional</sup> <a name="cdk8s-plus-27.VolumeMount.property.propagation"></a>

```typescript
public readonly propagation: MountPropagation;
```

- *Type:* [`cdk8s-plus-27.MountPropagation`](#cdk8s-plus-27.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

---

##### `readOnly`<sup>Optional</sup> <a name="cdk8s-plus-27.VolumeMount.property.readOnly"></a>

```typescript
public readonly readOnly: boolean;
```

- *Type:* `boolean`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

##### `subPath`<sup>Optional</sup> <a name="cdk8s-plus-27.VolumeMount.property.subPath"></a>

```typescript
public readonly subPath: string;
```

- *Type:* `string`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

##### `subPathExpr`<sup>Optional</sup> <a name="cdk8s-plus-27.VolumeMount.property.subPathExpr"></a>

```typescript
public readonly subPathExpr: string;
```

- *Type:* `string`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root).

`subPathExpr` and `subPath` are mutually exclusive.

---

##### `path`<sup>Required</sup> <a name="cdk8s-plus-27.VolumeMount.property.path"></a>

```typescript
public readonly path: string;
```

- *Type:* `string`

Path within the container at which the volume should be mounted.

Must not
contain ':'.

---

##### `volume`<sup>Required</sup> <a name="cdk8s-plus-27.VolumeMount.property.volume"></a>

```typescript
public readonly volume: Volume;
```

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)

The volume to mount.

---

### WorkloadProps <a name="cdk8s-plus-27.WorkloadProps"></a>

Properties for `Workload`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { WorkloadProps } from 'cdk8s-plus-27'

const workloadProps: WorkloadProps = { ... }
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.metadata"></a>

```typescript
public readonly metadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automountServiceAccountToken`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.automountServiceAccountToken"></a>

```typescript
public readonly automountServiceAccountToken: boolean;
```

- *Type:* `boolean`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.containers"></a>

```typescript
public readonly containers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.dns"></a>

```typescript
public readonly dns: PodDnsProps;
```

- *Type:* [`cdk8s-plus-27.PodDnsProps`](#cdk8s-plus-27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `dockerRegistryAuth`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.dockerRegistryAuth"></a>

```typescript
public readonly dockerRegistryAuth: ISecret;
```

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `hostAliases`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.hostAliases"></a>

```typescript
public readonly hostAliases: HostAlias[];
```

- *Type:* [`cdk8s-plus-27.HostAlias`](#cdk8s-plus-27.HostAlias)[]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `hostNetwork`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.hostNetwork"></a>

```typescript
public readonly hostNetwork: boolean;
```

- *Type:* `boolean`
- *Default:* false

Host network for the pod.

---

##### `initContainers`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.initContainers"></a>

```typescript
public readonly initContainers: ContainerProps[];
```

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)[]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.isolate"></a>

```typescript
public readonly isolate: boolean;
```

- *Type:* `boolean`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restartPolicy`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.restartPolicy"></a>

```typescript
public readonly restartPolicy: RestartPolicy;
```

- *Type:* [`cdk8s-plus-27.RestartPolicy`](#cdk8s-plus-27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `securityContext`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.securityContext"></a>

```typescript
public readonly securityContext: PodSecurityContextProps;
```

- *Type:* [`cdk8s-plus-27.PodSecurityContextProps`](#cdk8s-plus-27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `serviceAccount`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.serviceAccount"></a>

```typescript
public readonly serviceAccount: IServiceAccount;
```

- *Type:* [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)
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

##### `terminationGracePeriod`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.terminationGracePeriod"></a>

```typescript
public readonly terminationGracePeriod: Duration;
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.volumes"></a>

```typescript
public readonly volumes: Volume[];
```

- *Type:* [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume)[]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.podMetadata"></a>

```typescript
public readonly podMetadata: ApiObjectMetadata;
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.select"></a>

```typescript
public readonly select: boolean;
```

- *Type:* `boolean`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadProps.property.spread"></a>

```typescript
public readonly spread: boolean;
```

- *Type:* `boolean`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

### WorkloadSchedulingSpreadOptions <a name="cdk8s-plus-27.WorkloadSchedulingSpreadOptions"></a>

Options for `WorkloadScheduling.spread`.

#### Initializer <a name="[object Object].Initializer"></a>

```typescript
import { WorkloadSchedulingSpreadOptions } from 'cdk8s-plus-27'

const workloadSchedulingSpreadOptions: WorkloadSchedulingSpreadOptions = { ... }
```

##### `topology`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadSchedulingSpreadOptions.property.topology"></a>

```typescript
public readonly topology: Topology;
```

- *Type:* [`cdk8s-plus-27.Topology`](#cdk8s-plus-27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to spread on.

---

##### `weight`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadSchedulingSpreadOptions.property.weight"></a>

```typescript
public readonly weight: number;
```

- *Type:* `number`
- *Default:* no weight. spread is assumed to be required.

Indicates the spread is optional, with this weight score.

---

## Classes <a name="Classes"></a>

### ApiResource <a name="cdk8s-plus-27.ApiResource"></a>

- *Implements:* [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource), [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

Represents information about an API resource type.

#### Methods <a name="Methods"></a>

##### `asApiResource` <a name="cdk8s-plus-27.ApiResource.asApiResource"></a>

```typescript
public asApiResource()
```

##### `asNonApiResource` <a name="cdk8s-plus-27.ApiResource.asNonApiResource"></a>

```typescript
public asNonApiResource()
```

#### Static Functions <a name="Static Functions"></a>

##### `custom` <a name="cdk8s-plus-27.ApiResource.custom"></a>

```typescript
import { ApiResource } from 'cdk8s-plus-27'

ApiResource.custom(options: ApiResourceOptions)
```

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.ApiResource.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.ApiResourceOptions`](#cdk8s-plus-27.ApiResourceOptions)

---

#### Properties <a name="Properties"></a>

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.ApiResource.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.ApiResource.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of the resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

#### Constants <a name="Constants"></a>

##### `API_SERVICES` <a name="cdk8s-plus-27.ApiResource.property.API_SERVICES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for APIService.

---

##### `BINDINGS` <a name="cdk8s-plus-27.ApiResource.property.BINDINGS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Binding.

---

##### `CERTIFICATE_SIGNING_REQUESTS` <a name="cdk8s-plus-27.ApiResource.property.CERTIFICATE_SIGNING_REQUESTS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for CertificateSigningRequest.

---

##### `CLUSTER_ROLE_BINDINGS` <a name="cdk8s-plus-27.ApiResource.property.CLUSTER_ROLE_BINDINGS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for ClusterRoleBinding.

---

##### `CLUSTER_ROLES` <a name="cdk8s-plus-27.ApiResource.property.CLUSTER_ROLES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for ClusterRole.

---

##### `COMPONENT_STATUSES` <a name="cdk8s-plus-27.ApiResource.property.COMPONENT_STATUSES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for ComponentStatus.

---

##### `CONFIG_MAPS` <a name="cdk8s-plus-27.ApiResource.property.CONFIG_MAPS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for ConfigMap.

---

##### `CONTROLLER_REVISIONS` <a name="cdk8s-plus-27.ApiResource.property.CONTROLLER_REVISIONS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for ControllerRevision.

---

##### `CRON_JOBS` <a name="cdk8s-plus-27.ApiResource.property.CRON_JOBS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for CronJob.

---

##### `CSI_DRIVERS` <a name="cdk8s-plus-27.ApiResource.property.CSI_DRIVERS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for CSIDriver.

---

##### `CSI_NODES` <a name="cdk8s-plus-27.ApiResource.property.CSI_NODES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for CSINode.

---

##### `CSI_STORAGE_CAPACITIES` <a name="cdk8s-plus-27.ApiResource.property.CSI_STORAGE_CAPACITIES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for CSIStorageCapacity.

---

##### `CUSTOM_RESOURCE_DEFINITIONS` <a name="cdk8s-plus-27.ApiResource.property.CUSTOM_RESOURCE_DEFINITIONS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for CustomResourceDefinition.

---

##### `DAEMON_SETS` <a name="cdk8s-plus-27.ApiResource.property.DAEMON_SETS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for DaemonSet.

---

##### `DEPLOYMENTS` <a name="cdk8s-plus-27.ApiResource.property.DEPLOYMENTS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Deployment.

---

##### `ENDPOINT_SLICES` <a name="cdk8s-plus-27.ApiResource.property.ENDPOINT_SLICES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for EndpointSlice.

---

##### `ENDPOINTS` <a name="cdk8s-plus-27.ApiResource.property.ENDPOINTS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Endpoints.

---

##### `EVENTS` <a name="cdk8s-plus-27.ApiResource.property.EVENTS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Event.

---

##### `FLOW_SCHEMAS` <a name="cdk8s-plus-27.ApiResource.property.FLOW_SCHEMAS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for FlowSchema.

---

##### `HORIZONTAL_POD_AUTOSCALERS` <a name="cdk8s-plus-27.ApiResource.property.HORIZONTAL_POD_AUTOSCALERS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for HorizontalPodAutoscaler.

---

##### `INGRESS_CLASSES` <a name="cdk8s-plus-27.ApiResource.property.INGRESS_CLASSES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for IngressClass.

---

##### `INGRESSES` <a name="cdk8s-plus-27.ApiResource.property.INGRESSES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Ingress.

---

##### `JOBS` <a name="cdk8s-plus-27.ApiResource.property.JOBS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Job.

---

##### `LEASES` <a name="cdk8s-plus-27.ApiResource.property.LEASES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Lease.

---

##### `LIMIT_RANGES` <a name="cdk8s-plus-27.ApiResource.property.LIMIT_RANGES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for LimitRange.

---

##### `LOCAL_SUBJECT_ACCESS_REVIEWS` <a name="cdk8s-plus-27.ApiResource.property.LOCAL_SUBJECT_ACCESS_REVIEWS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for LocalSubjectAccessReview.

---

##### `MUTATING_WEBHOOK_CONFIGURATIONS` <a name="cdk8s-plus-27.ApiResource.property.MUTATING_WEBHOOK_CONFIGURATIONS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for MutatingWebhookConfiguration.

---

##### `NAMESPACES` <a name="cdk8s-plus-27.ApiResource.property.NAMESPACES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Namespace.

---

##### `NETWORK_POLICIES` <a name="cdk8s-plus-27.ApiResource.property.NETWORK_POLICIES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for NetworkPolicy.

---

##### `NODES` <a name="cdk8s-plus-27.ApiResource.property.NODES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Node.

---

##### `PERSISTENT_VOLUME_CLAIMS` <a name="cdk8s-plus-27.ApiResource.property.PERSISTENT_VOLUME_CLAIMS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for PersistentVolumeClaim.

---

##### `PERSISTENT_VOLUMES` <a name="cdk8s-plus-27.ApiResource.property.PERSISTENT_VOLUMES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for PersistentVolume.

---

##### `POD_DISRUPTION_BUDGETS` <a name="cdk8s-plus-27.ApiResource.property.POD_DISRUPTION_BUDGETS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for PodDisruptionBudget.

---

##### `POD_TEMPLATES` <a name="cdk8s-plus-27.ApiResource.property.POD_TEMPLATES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for PodTemplate.

---

##### `PODS` <a name="cdk8s-plus-27.ApiResource.property.PODS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Pod.

---

##### `PRIORITY_CLASSES` <a name="cdk8s-plus-27.ApiResource.property.PRIORITY_CLASSES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for PriorityClass.

---

##### `PRIORITY_LEVEL_CONFIGURATIONS` <a name="cdk8s-plus-27.ApiResource.property.PRIORITY_LEVEL_CONFIGURATIONS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for PriorityLevelConfiguration.

---

##### `REPLICA_SETS` <a name="cdk8s-plus-27.ApiResource.property.REPLICA_SETS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for ReplicaSet.

---

##### `REPLICATION_CONTROLLERS` <a name="cdk8s-plus-27.ApiResource.property.REPLICATION_CONTROLLERS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for ReplicationController.

---

##### `RESOURCE_QUOTAS` <a name="cdk8s-plus-27.ApiResource.property.RESOURCE_QUOTAS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for ResourceQuota.

---

##### `ROLE_BINDINGS` <a name="cdk8s-plus-27.ApiResource.property.ROLE_BINDINGS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for RoleBinding.

---

##### `ROLES` <a name="cdk8s-plus-27.ApiResource.property.ROLES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Role.

---

##### `RUNTIME_CLASSES` <a name="cdk8s-plus-27.ApiResource.property.RUNTIME_CLASSES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for RuntimeClass.

---

##### `SECRETS` <a name="cdk8s-plus-27.ApiResource.property.SECRETS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Secret.

---

##### `SELF_SUBJECT_ACCESS_REVIEWS` <a name="cdk8s-plus-27.ApiResource.property.SELF_SUBJECT_ACCESS_REVIEWS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for SelfSubjectAccessReview.

---

##### `SELF_SUBJECT_RULES_REVIEWS` <a name="cdk8s-plus-27.ApiResource.property.SELF_SUBJECT_RULES_REVIEWS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for SelfSubjectRulesReview.

---

##### `SERVICE_ACCOUNTS` <a name="cdk8s-plus-27.ApiResource.property.SERVICE_ACCOUNTS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for ServiceAccount.

---

##### `SERVICES` <a name="cdk8s-plus-27.ApiResource.property.SERVICES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for Service.

---

##### `STATEFUL_SETS` <a name="cdk8s-plus-27.ApiResource.property.STATEFUL_SETS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for StatefulSet.

---

##### `STORAGE_CLASSES` <a name="cdk8s-plus-27.ApiResource.property.STORAGE_CLASSES"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for StorageClass.

---

##### `SUBJECT_ACCESS_REVIEWS` <a name="cdk8s-plus-27.ApiResource.property.SUBJECT_ACCESS_REVIEWS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for SubjectAccessReview.

---

##### `TOKEN_REVIEWS` <a name="cdk8s-plus-27.ApiResource.property.TOKEN_REVIEWS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for TokenReview.

---

##### `VALIDATING_WEBHOOK_CONFIGURATIONS` <a name="cdk8s-plus-27.ApiResource.property.VALIDATING_WEBHOOK_CONFIGURATIONS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for ValidatingWebhookConfiguration.

---

##### `VOLUME_ATTACHMENTS` <a name="cdk8s-plus-27.ApiResource.property.VOLUME_ATTACHMENTS"></a>

- *Type:* [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource)

API resource information for VolumeAttachment.

---

### Container <a name="cdk8s-plus-27.Container"></a>

A single application container that you want to run within a pod.

#### Initializers <a name="cdk8s-plus-27.Container.Initializer"></a>

```typescript
import { Container } from 'cdk8s-plus-27'

new Container(props: ContainerProps)
```

##### `props`<sup>Required</sup> <a name="cdk8s-plus-27.Container.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.ContainerProps`](#cdk8s-plus-27.ContainerProps)

---

#### Methods <a name="Methods"></a>

##### `addPort` <a name="cdk8s-plus-27.Container.addPort"></a>

```typescript
public addPort(port: ContainerPort)
```

###### `port`<sup>Required</sup> <a name="cdk8s-plus-27.Container.parameter.port"></a>

- *Type:* [`cdk8s-plus-27.ContainerPort`](#cdk8s-plus-27.ContainerPort)

---

##### `mount` <a name="cdk8s-plus-27.Container.mount"></a>

```typescript
public mount(path: string, storage: IStorage, options?: MountOptions)
```

###### `path`<sup>Required</sup> <a name="cdk8s-plus-27.Container.parameter.path"></a>

- *Type:* `string`

The desired path in the container.

---

###### `storage`<sup>Required</sup> <a name="cdk8s-plus-27.Container.parameter.storage"></a>

- *Type:* [`cdk8s-plus-27.IStorage`](#cdk8s-plus-27.IStorage)

The storage to mount.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Container.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.MountOptions`](#cdk8s-plus-27.MountOptions)

---


#### Properties <a name="Properties"></a>

##### `env`<sup>Required</sup> <a name="cdk8s-plus-27.Container.property.env"></a>

```typescript
public readonly env: Env;
```

- *Type:* [`cdk8s-plus-27.Env`](#cdk8s-plus-27.Env)

The environment of the container.

---

##### `image`<sup>Required</sup> <a name="cdk8s-plus-27.Container.property.image"></a>

```typescript
public readonly image: string;
```

- *Type:* `string`

The container image.

---

##### `imagePullPolicy`<sup>Required</sup> <a name="cdk8s-plus-27.Container.property.imagePullPolicy"></a>

```typescript
public readonly imagePullPolicy: ImagePullPolicy;
```

- *Type:* [`cdk8s-plus-27.ImagePullPolicy`](#cdk8s-plus-27.ImagePullPolicy)

Image pull policy for this container.

---

##### `mounts`<sup>Required</sup> <a name="cdk8s-plus-27.Container.property.mounts"></a>

```typescript
public readonly mounts: VolumeMount[];
```

- *Type:* [`cdk8s-plus-27.VolumeMount`](#cdk8s-plus-27.VolumeMount)[]

Volume mounts configured for this container.

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Container.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The name of the container.

---

##### `ports`<sup>Required</sup> <a name="cdk8s-plus-27.Container.property.ports"></a>

```typescript
public readonly ports: ContainerPort[];
```

- *Type:* [`cdk8s-plus-27.ContainerPort`](#cdk8s-plus-27.ContainerPort)[]

Ports exposed by this containers.

Returns a copy, use `addPort` to modify.

---

##### `securityContext`<sup>Required</sup> <a name="cdk8s-plus-27.Container.property.securityContext"></a>

```typescript
public readonly securityContext: ContainerSecurityContext;
```

- *Type:* [`cdk8s-plus-27.ContainerSecurityContext`](#cdk8s-plus-27.ContainerSecurityContext)

The security context of the container.

---

##### `args`<sup>Optional</sup> <a name="cdk8s-plus-27.Container.property.args"></a>

```typescript
public readonly args: string[];
```

- *Type:* `string`[]

Arguments to the entrypoint.

---

##### `command`<sup>Optional</sup> <a name="cdk8s-plus-27.Container.property.command"></a>

```typescript
public readonly command: string[];
```

- *Type:* `string`[]

Entrypoint array (the command to execute when the container starts).

---

##### ~~`port`~~<sup>Optional</sup> <a name="cdk8s-plus-27.Container.property.port"></a>

- *Deprecated:* - use `portNumber`.

```typescript
public readonly port: number;
```

- *Type:* `number`

---

##### `portNumber`<sup>Optional</sup> <a name="cdk8s-plus-27.Container.property.portNumber"></a>

```typescript
public readonly portNumber: number;
```

- *Type:* `number`

The port number that was configured for this container.

If undefined, either the container doesn't expose a port, or its
port configuration is stored in the `ports` field.

---

##### `resources`<sup>Optional</sup> <a name="cdk8s-plus-27.Container.property.resources"></a>

```typescript
public readonly resources: ContainerResources;
```

- *Type:* [`cdk8s-plus-27.ContainerResources`](#cdk8s-plus-27.ContainerResources)

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `workingDir`<sup>Optional</sup> <a name="cdk8s-plus-27.Container.property.workingDir"></a>

```typescript
public readonly workingDir: string;
```

- *Type:* `string`

The working directory inside the container.

---


### ContainerSecurityContext <a name="cdk8s-plus-27.ContainerSecurityContext"></a>

Container security attributes and settings.

#### Initializers <a name="cdk8s-plus-27.ContainerSecurityContext.Initializer"></a>

```typescript
import { ContainerSecurityContext } from 'cdk8s-plus-27'

new ContainerSecurityContext(props?: ContainerSecurityContextProps)
```

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerSecurityContext.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.ContainerSecurityContextProps`](#cdk8s-plus-27.ContainerSecurityContextProps)

---



#### Properties <a name="Properties"></a>

##### `ensureNonRoot`<sup>Required</sup> <a name="cdk8s-plus-27.ContainerSecurityContext.property.ensureNonRoot"></a>

```typescript
public readonly ensureNonRoot: boolean;
```

- *Type:* `boolean`

---

##### `privileged`<sup>Required</sup> <a name="cdk8s-plus-27.ContainerSecurityContext.property.privileged"></a>

```typescript
public readonly privileged: boolean;
```

- *Type:* `boolean`

---

##### `readOnlyRootFilesystem`<sup>Required</sup> <a name="cdk8s-plus-27.ContainerSecurityContext.property.readOnlyRootFilesystem"></a>

```typescript
public readonly readOnlyRootFilesystem: boolean;
```

- *Type:* `boolean`

---

##### `allowPrivilegeEscalation`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerSecurityContext.property.allowPrivilegeEscalation"></a>

```typescript
public readonly allowPrivilegeEscalation: boolean;
```

- *Type:* `boolean`

---

##### `group`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerSecurityContext.property.group"></a>

```typescript
public readonly group: number;
```

- *Type:* `number`

---

##### `user`<sup>Optional</sup> <a name="cdk8s-plus-27.ContainerSecurityContext.property.user"></a>

```typescript
public readonly user: number;
```

- *Type:* `number`

---


### Cpu <a name="cdk8s-plus-27.Cpu"></a>

Represents the amount of CPU.

The amount can be passed as millis or units.


#### Static Functions <a name="Static Functions"></a>

##### `millis` <a name="cdk8s-plus-27.Cpu.millis"></a>

```typescript
import { Cpu } from 'cdk8s-plus-27'

Cpu.millis(amount: number)
```

###### `amount`<sup>Required</sup> <a name="cdk8s-plus-27.Cpu.parameter.amount"></a>

- *Type:* `number`

---

##### `units` <a name="cdk8s-plus-27.Cpu.units"></a>

```typescript
import { Cpu } from 'cdk8s-plus-27'

Cpu.units(amount: number)
```

###### `amount`<sup>Required</sup> <a name="cdk8s-plus-27.Cpu.parameter.amount"></a>

- *Type:* `number`

---

#### Properties <a name="Properties"></a>

##### `amount`<sup>Required</sup> <a name="cdk8s-plus-27.Cpu.property.amount"></a>

```typescript
public readonly amount: string;
```

- *Type:* `string`

---


### DeploymentStrategy <a name="cdk8s-plus-27.DeploymentStrategy"></a>

Deployment strategies.


#### Static Functions <a name="Static Functions"></a>

##### `recreate` <a name="cdk8s-plus-27.DeploymentStrategy.recreate"></a>

```typescript
import { DeploymentStrategy } from 'cdk8s-plus-27'

DeploymentStrategy.recreate()
```

##### `rollingUpdate` <a name="cdk8s-plus-27.DeploymentStrategy.rollingUpdate"></a>

```typescript
import { DeploymentStrategy } from 'cdk8s-plus-27'

DeploymentStrategy.rollingUpdate(options?: DeploymentStrategyRollingUpdateOptions)
```

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.DeploymentStrategy.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.DeploymentStrategyRollingUpdateOptions`](#cdk8s-plus-27.DeploymentStrategyRollingUpdateOptions)

---



### Env <a name="cdk8s-plus-27.Env"></a>

Container environment variables.

#### Initializers <a name="cdk8s-plus-27.Env.Initializer"></a>

```typescript
import { Env } from 'cdk8s-plus-27'

new Env(sources: EnvFrom[], variables: {[ key: string ]: EnvValue})
```

##### `sources`<sup>Required</sup> <a name="cdk8s-plus-27.Env.parameter.sources"></a>

- *Type:* [`cdk8s-plus-27.EnvFrom`](#cdk8s-plus-27.EnvFrom)[]

---

##### `variables`<sup>Required</sup> <a name="cdk8s-plus-27.Env.parameter.variables"></a>

- *Type:* {[ key: string ]: [`cdk8s-plus-27.EnvValue`](#cdk8s-plus-27.EnvValue)}

---

#### Methods <a name="Methods"></a>

##### `addVariable` <a name="cdk8s-plus-27.Env.addVariable"></a>

```typescript
public addVariable(name: string, value: EnvValue)
```

###### `name`<sup>Required</sup> <a name="cdk8s-plus-27.Env.parameter.name"></a>

- *Type:* `string`

---

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.Env.parameter.value"></a>

- *Type:* [`cdk8s-plus-27.EnvValue`](#cdk8s-plus-27.EnvValue)

---

##### `copyFrom` <a name="cdk8s-plus-27.Env.copyFrom"></a>

```typescript
public copyFrom(from: EnvFrom)
```

###### `from`<sup>Required</sup> <a name="cdk8s-plus-27.Env.parameter.from"></a>

- *Type:* [`cdk8s-plus-27.EnvFrom`](#cdk8s-plus-27.EnvFrom)

---

#### Static Functions <a name="Static Functions"></a>

##### `fromConfigMap` <a name="cdk8s-plus-27.Env.fromConfigMap"></a>

```typescript
import { Env } from 'cdk8s-plus-27'

Env.fromConfigMap(configMap: IConfigMap, prefix?: string)
```

###### `configMap`<sup>Required</sup> <a name="cdk8s-plus-27.Env.parameter.configMap"></a>

- *Type:* [`cdk8s-plus-27.IConfigMap`](#cdk8s-plus-27.IConfigMap)

---

###### `prefix`<sup>Optional</sup> <a name="cdk8s-plus-27.Env.parameter.prefix"></a>

- *Type:* `string`

---

##### `fromSecret` <a name="cdk8s-plus-27.Env.fromSecret"></a>

```typescript
import { Env } from 'cdk8s-plus-27'

Env.fromSecret(secr: ISecret)
```

###### `secr`<sup>Required</sup> <a name="cdk8s-plus-27.Env.parameter.secr"></a>

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)

---

#### Properties <a name="Properties"></a>

##### `sources`<sup>Required</sup> <a name="cdk8s-plus-27.Env.property.sources"></a>

```typescript
public readonly sources: EnvFrom[];
```

- *Type:* [`cdk8s-plus-27.EnvFrom`](#cdk8s-plus-27.EnvFrom)[]

The list of sources used to populate the container environment, in addition to the `variables`.

Returns a copy. To add a source use `container.env.copyFrom()`.

---

##### `variables`<sup>Required</sup> <a name="cdk8s-plus-27.Env.property.variables"></a>

```typescript
public readonly variables: {[ key: string ]: EnvValue};
```

- *Type:* {[ key: string ]: [`cdk8s-plus-27.EnvValue`](#cdk8s-plus-27.EnvValue)}

The environment variables for this container.

Returns a copy. To add environment variables use `container.env.addVariable()`.

---


### EnvFrom <a name="cdk8s-plus-27.EnvFrom"></a>

A collection of env variables defined in other resources.

#### Initializers <a name="cdk8s-plus-27.EnvFrom.Initializer"></a>

```typescript
import { EnvFrom } from 'cdk8s-plus-27'

new EnvFrom(configMap?: IConfigMap, prefix?: string, sec?: ISecret)
```

##### `configMap`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvFrom.parameter.configMap"></a>

- *Type:* [`cdk8s-plus-27.IConfigMap`](#cdk8s-plus-27.IConfigMap)

---

##### `prefix`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvFrom.parameter.prefix"></a>

- *Type:* `string`

---

##### `sec`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvFrom.parameter.sec"></a>

- *Type:* [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)

---





### EnvValue <a name="cdk8s-plus-27.EnvValue"></a>

Utility class for creating reading env values from various sources.


#### Static Functions <a name="Static Functions"></a>

##### `fromConfigMap` <a name="cdk8s-plus-27.EnvValue.fromConfigMap"></a>

```typescript
import { EnvValue } from 'cdk8s-plus-27'

EnvValue.fromConfigMap(configMap: IConfigMap, key: string, options?: EnvValueFromConfigMapOptions)
```

###### `configMap`<sup>Required</sup> <a name="cdk8s-plus-27.EnvValue.parameter.configMap"></a>

- *Type:* [`cdk8s-plus-27.IConfigMap`](#cdk8s-plus-27.IConfigMap)

The config map.

---

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.EnvValue.parameter.key"></a>

- *Type:* `string`

The key to extract the value from.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValue.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.EnvValueFromConfigMapOptions`](#cdk8s-plus-27.EnvValueFromConfigMapOptions)

Additional options.

---

##### `fromFieldRef` <a name="cdk8s-plus-27.EnvValue.fromFieldRef"></a>

```typescript
import { EnvValue } from 'cdk8s-plus-27'

EnvValue.fromFieldRef(fieldPath: EnvFieldPaths, options?: EnvValueFromFieldRefOptions)
```

###### `fieldPath`<sup>Required</sup> <a name="cdk8s-plus-27.EnvValue.parameter.fieldPath"></a>

- *Type:* [`cdk8s-plus-27.EnvFieldPaths`](#cdk8s-plus-27.EnvFieldPaths)

: The field reference.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValue.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.EnvValueFromFieldRefOptions`](#cdk8s-plus-27.EnvValueFromFieldRefOptions)

: Additional options.

---

##### `fromProcess` <a name="cdk8s-plus-27.EnvValue.fromProcess"></a>

```typescript
import { EnvValue } from 'cdk8s-plus-27'

EnvValue.fromProcess(key: string, options?: EnvValueFromProcessOptions)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.EnvValue.parameter.key"></a>

- *Type:* `string`

The key to read.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValue.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.EnvValueFromProcessOptions`](#cdk8s-plus-27.EnvValueFromProcessOptions)

Additional options.

---

##### `fromResource` <a name="cdk8s-plus-27.EnvValue.fromResource"></a>

```typescript
import { EnvValue } from 'cdk8s-plus-27'

EnvValue.fromResource(resource: ResourceFieldPaths, options?: EnvValueFromResourceOptions)
```

###### `resource`<sup>Required</sup> <a name="cdk8s-plus-27.EnvValue.parameter.resource"></a>

- *Type:* [`cdk8s-plus-27.ResourceFieldPaths`](#cdk8s-plus-27.ResourceFieldPaths)

: Resource to select the value from.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValue.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.EnvValueFromResourceOptions`](#cdk8s-plus-27.EnvValueFromResourceOptions)

: Additional options.

---

##### `fromSecretValue` <a name="cdk8s-plus-27.EnvValue.fromSecretValue"></a>

```typescript
import { EnvValue } from 'cdk8s-plus-27'

EnvValue.fromSecretValue(secretValue: SecretValue, options?: EnvValueFromSecretOptions)
```

###### `secretValue`<sup>Required</sup> <a name="cdk8s-plus-27.EnvValue.parameter.secretValue"></a>

- *Type:* [`cdk8s-plus-27.SecretValue`](#cdk8s-plus-27.SecretValue)

The secret value (secrent + key).

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValue.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.EnvValueFromSecretOptions`](#cdk8s-plus-27.EnvValueFromSecretOptions)

Additional options.

---

##### `fromValue` <a name="cdk8s-plus-27.EnvValue.fromValue"></a>

```typescript
import { EnvValue } from 'cdk8s-plus-27'

EnvValue.fromValue(value: string)
```

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.EnvValue.parameter.value"></a>

- *Type:* `string`

The value.

---

#### Properties <a name="Properties"></a>

##### `value`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValue.property.value"></a>

```typescript
public readonly value: any;
```

- *Type:* `any`

---

##### `valueFrom`<sup>Optional</sup> <a name="cdk8s-plus-27.EnvValue.property.valueFrom"></a>

```typescript
public readonly valueFrom: any;
```

- *Type:* `any`

---


### Handler <a name="cdk8s-plus-27.Handler"></a>

Defines a specific action that should be taken.


#### Static Functions <a name="Static Functions"></a>

##### `fromCommand` <a name="cdk8s-plus-27.Handler.fromCommand"></a>

```typescript
import { Handler } from 'cdk8s-plus-27'

Handler.fromCommand(command: string[])
```

###### `command`<sup>Required</sup> <a name="cdk8s-plus-27.Handler.parameter.command"></a>

- *Type:* `string`[]

The command to execute.

---

##### `fromHttpGet` <a name="cdk8s-plus-27.Handler.fromHttpGet"></a>

```typescript
import { Handler } from 'cdk8s-plus-27'

Handler.fromHttpGet(path: string, options?: HandlerFromHttpGetOptions)
```

###### `path`<sup>Required</sup> <a name="cdk8s-plus-27.Handler.parameter.path"></a>

- *Type:* `string`

The URL path to hit.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Handler.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.HandlerFromHttpGetOptions`](#cdk8s-plus-27.HandlerFromHttpGetOptions)

Options.

---

##### `fromTcpSocket` <a name="cdk8s-plus-27.Handler.fromTcpSocket"></a>

```typescript
import { Handler } from 'cdk8s-plus-27'

Handler.fromTcpSocket(options?: HandlerFromTcpSocketOptions)
```

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Handler.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.HandlerFromTcpSocketOptions`](#cdk8s-plus-27.HandlerFromTcpSocketOptions)

Options.

---



### IngressBackend <a name="cdk8s-plus-27.IngressBackend"></a>

The backend for an ingress path.


#### Static Functions <a name="Static Functions"></a>

##### `fromResource` <a name="cdk8s-plus-27.IngressBackend.fromResource"></a>

```typescript
import { IngressBackend } from 'cdk8s-plus-27'

IngressBackend.fromResource(resource: IResource)
```

###### `resource`<sup>Required</sup> <a name="cdk8s-plus-27.IngressBackend.parameter.resource"></a>

- *Type:* [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource)

---

##### `fromService` <a name="cdk8s-plus-27.IngressBackend.fromService"></a>

```typescript
import { IngressBackend } from 'cdk8s-plus-27'

IngressBackend.fromService(serv: Service, options?: ServiceIngressBackendOptions)
```

###### `serv`<sup>Required</sup> <a name="cdk8s-plus-27.IngressBackend.parameter.serv"></a>

- *Type:* [`cdk8s-plus-27.Service`](#cdk8s-plus-27.Service)

The service object.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.IngressBackend.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.ServiceIngressBackendOptions`](#cdk8s-plus-27.ServiceIngressBackendOptions)

---



### LabeledNode <a name="cdk8s-plus-27.LabeledNode"></a>

A node that is matched by label selectors.

#### Initializers <a name="cdk8s-plus-27.LabeledNode.Initializer"></a>

```typescript
import { LabeledNode } from 'cdk8s-plus-27'

new LabeledNode(labelSelector: NodeLabelQuery[])
```

##### `labelSelector`<sup>Required</sup> <a name="cdk8s-plus-27.LabeledNode.parameter.labelSelector"></a>

- *Type:* [`cdk8s-plus-27.NodeLabelQuery`](#cdk8s-plus-27.NodeLabelQuery)[]

---



#### Properties <a name="Properties"></a>

##### `labelSelector`<sup>Required</sup> <a name="cdk8s-plus-27.LabeledNode.property.labelSelector"></a>

```typescript
public readonly labelSelector: NodeLabelQuery[];
```

- *Type:* [`cdk8s-plus-27.NodeLabelQuery`](#cdk8s-plus-27.NodeLabelQuery)[]

---


### LabelExpression <a name="cdk8s-plus-27.LabelExpression"></a>

Represents a query that can be performed against resources with labels.


#### Static Functions <a name="Static Functions"></a>

##### `doesNotExist` <a name="cdk8s-plus-27.LabelExpression.doesNotExist"></a>

```typescript
import { LabelExpression } from 'cdk8s-plus-27'

LabelExpression.doesNotExist(key: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.LabelExpression.parameter.key"></a>

- *Type:* `string`

---

##### `exists` <a name="cdk8s-plus-27.LabelExpression.exists"></a>

```typescript
import { LabelExpression } from 'cdk8s-plus-27'

LabelExpression.exists(key: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.LabelExpression.parameter.key"></a>

- *Type:* `string`

---

##### `in` <a name="cdk8s-plus-27.LabelExpression.in"></a>

```typescript
import { LabelExpression } from 'cdk8s-plus-27'

LabelExpression.in(key: string, values: string[])
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.LabelExpression.parameter.key"></a>

- *Type:* `string`

---

###### `values`<sup>Required</sup> <a name="cdk8s-plus-27.LabelExpression.parameter.values"></a>

- *Type:* `string`[]

---

##### `notIn` <a name="cdk8s-plus-27.LabelExpression.notIn"></a>

```typescript
import { LabelExpression } from 'cdk8s-plus-27'

LabelExpression.notIn(key: string, values: string[])
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.LabelExpression.parameter.key"></a>

- *Type:* `string`

---

###### `values`<sup>Required</sup> <a name="cdk8s-plus-27.LabelExpression.parameter.values"></a>

- *Type:* `string`[]

---

#### Properties <a name="Properties"></a>

##### `key`<sup>Required</sup> <a name="cdk8s-plus-27.LabelExpression.property.key"></a>

```typescript
public readonly key: string;
```

- *Type:* `string`

---

##### `operator`<sup>Required</sup> <a name="cdk8s-plus-27.LabelExpression.property.operator"></a>

```typescript
public readonly operator: string;
```

- *Type:* `string`

---

##### `values`<sup>Optional</sup> <a name="cdk8s-plus-27.LabelExpression.property.values"></a>

```typescript
public readonly values: string[];
```

- *Type:* `string`[]

---


### LabelSelector <a name="cdk8s-plus-27.LabelSelector"></a>

Match a resource by labels.

#### Methods <a name="Methods"></a>

##### `isEmpty` <a name="cdk8s-plus-27.LabelSelector.isEmpty"></a>

```typescript
public isEmpty()
```

#### Static Functions <a name="Static Functions"></a>

##### `of` <a name="cdk8s-plus-27.LabelSelector.of"></a>

```typescript
import { LabelSelector } from 'cdk8s-plus-27'

LabelSelector.of(options?: LabelSelectorOptions)
```

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.LabelSelector.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.LabelSelectorOptions`](#cdk8s-plus-27.LabelSelectorOptions)

---



### Metric <a name="cdk8s-plus-27.Metric"></a>

A metric condition that HorizontalPodAutoscaler's scale on.


#### Static Functions <a name="Static Functions"></a>

##### `containerCpu` <a name="cdk8s-plus-27.Metric.containerCpu"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.containerCpu(options: MetricContainerResourceOptions)
```

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.MetricContainerResourceOptions`](#cdk8s-plus-27.MetricContainerResourceOptions)

---

##### `containerEphemeralStorage` <a name="cdk8s-plus-27.Metric.containerEphemeralStorage"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.containerEphemeralStorage(options: MetricContainerResourceOptions)
```

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.MetricContainerResourceOptions`](#cdk8s-plus-27.MetricContainerResourceOptions)

---

##### `containerMemory` <a name="cdk8s-plus-27.Metric.containerMemory"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.containerMemory(options: MetricContainerResourceOptions)
```

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.MetricContainerResourceOptions`](#cdk8s-plus-27.MetricContainerResourceOptions)

---

##### `containerStorage` <a name="cdk8s-plus-27.Metric.containerStorage"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.containerStorage(options: MetricContainerResourceOptions)
```

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.MetricContainerResourceOptions`](#cdk8s-plus-27.MetricContainerResourceOptions)

---

##### `external` <a name="cdk8s-plus-27.Metric.external"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.external(options: MetricOptions)
```

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.MetricOptions`](#cdk8s-plus-27.MetricOptions)

---

##### `object` <a name="cdk8s-plus-27.Metric.object"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.object(options: MetricObjectOptions)
```

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.MetricObjectOptions`](#cdk8s-plus-27.MetricObjectOptions)

---

##### `pods` <a name="cdk8s-plus-27.Metric.pods"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.pods(options: MetricOptions)
```

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.MetricOptions`](#cdk8s-plus-27.MetricOptions)

---

##### `resourceCpu` <a name="cdk8s-plus-27.Metric.resourceCpu"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.resourceCpu(target: MetricTarget)
```

###### `target`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.target"></a>

- *Type:* [`cdk8s-plus-27.MetricTarget`](#cdk8s-plus-27.MetricTarget)

---

##### `resourceEphemeralStorage` <a name="cdk8s-plus-27.Metric.resourceEphemeralStorage"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.resourceEphemeralStorage(target: MetricTarget)
```

###### `target`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.target"></a>

- *Type:* [`cdk8s-plus-27.MetricTarget`](#cdk8s-plus-27.MetricTarget)

---

##### `resourceMemory` <a name="cdk8s-plus-27.Metric.resourceMemory"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.resourceMemory(target: MetricTarget)
```

###### `target`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.target"></a>

- *Type:* [`cdk8s-plus-27.MetricTarget`](#cdk8s-plus-27.MetricTarget)

---

##### `resourceStorage` <a name="cdk8s-plus-27.Metric.resourceStorage"></a>

```typescript
import { Metric } from 'cdk8s-plus-27'

Metric.resourceStorage(target: MetricTarget)
```

###### `target`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.parameter.target"></a>

- *Type:* [`cdk8s-plus-27.MetricTarget`](#cdk8s-plus-27.MetricTarget)

---

#### Properties <a name="Properties"></a>

##### `type`<sup>Required</sup> <a name="cdk8s-plus-27.Metric.property.type"></a>

```typescript
public readonly type: string;
```

- *Type:* `string`

---


### MetricTarget <a name="cdk8s-plus-27.MetricTarget"></a>

A metric condition that will trigger scaling behavior when satisfied.


#### Static Functions <a name="Static Functions"></a>

##### `averageUtilization` <a name="cdk8s-plus-27.MetricTarget.averageUtilization"></a>

```typescript
import { MetricTarget } from 'cdk8s-plus-27'

MetricTarget.averageUtilization(averageUtilization: number)
```

###### `averageUtilization`<sup>Required</sup> <a name="cdk8s-plus-27.MetricTarget.parameter.averageUtilization"></a>

- *Type:* `number`

The percentage of the utilization metric.

e.g. `50` for 50%.

---

##### `averageValue` <a name="cdk8s-plus-27.MetricTarget.averageValue"></a>

```typescript
import { MetricTarget } from 'cdk8s-plus-27'

MetricTarget.averageValue(averageValue: number)
```

###### `averageValue`<sup>Required</sup> <a name="cdk8s-plus-27.MetricTarget.parameter.averageValue"></a>

- *Type:* `number`

The average metric value.

---

##### `value` <a name="cdk8s-plus-27.MetricTarget.value"></a>

```typescript
import { MetricTarget } from 'cdk8s-plus-27'

MetricTarget.value(value: number)
```

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.MetricTarget.parameter.value"></a>

- *Type:* `number`

The target value.

---



### NamedNode <a name="cdk8s-plus-27.NamedNode"></a>

A node that is matched by its name.

#### Initializers <a name="cdk8s-plus-27.NamedNode.Initializer"></a>

```typescript
import { NamedNode } from 'cdk8s-plus-27'

new NamedNode(name: string)
```

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.NamedNode.parameter.name"></a>

- *Type:* `string`

---



#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.NamedNode.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

---


### NetworkPolicyPort <a name="cdk8s-plus-27.NetworkPolicyPort"></a>

Describes a port to allow traffic on.


#### Static Functions <a name="Static Functions"></a>

##### `allTcp` <a name="cdk8s-plus-27.NetworkPolicyPort.allTcp"></a>

```typescript
import { NetworkPolicyPort } from 'cdk8s-plus-27'

NetworkPolicyPort.allTcp()
```

##### `allUdp` <a name="cdk8s-plus-27.NetworkPolicyPort.allUdp"></a>

```typescript
import { NetworkPolicyPort } from 'cdk8s-plus-27'

NetworkPolicyPort.allUdp()
```

##### `of` <a name="cdk8s-plus-27.NetworkPolicyPort.of"></a>

```typescript
import { NetworkPolicyPort } from 'cdk8s-plus-27'

NetworkPolicyPort.of(props: NetworkPolicyPortProps)
```

###### `props`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyPort.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.NetworkPolicyPortProps`](#cdk8s-plus-27.NetworkPolicyPortProps)

---

##### `tcp` <a name="cdk8s-plus-27.NetworkPolicyPort.tcp"></a>

```typescript
import { NetworkPolicyPort } from 'cdk8s-plus-27'

NetworkPolicyPort.tcp(port: number)
```

###### `port`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyPort.parameter.port"></a>

- *Type:* `number`

---

##### `tcpRange` <a name="cdk8s-plus-27.NetworkPolicyPort.tcpRange"></a>

```typescript
import { NetworkPolicyPort } from 'cdk8s-plus-27'

NetworkPolicyPort.tcpRange(startPort: number, endPort: number)
```

###### `startPort`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyPort.parameter.startPort"></a>

- *Type:* `number`

---

###### `endPort`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyPort.parameter.endPort"></a>

- *Type:* `number`

---

##### `udp` <a name="cdk8s-plus-27.NetworkPolicyPort.udp"></a>

```typescript
import { NetworkPolicyPort } from 'cdk8s-plus-27'

NetworkPolicyPort.udp(port: number)
```

###### `port`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyPort.parameter.port"></a>

- *Type:* `number`

---

##### `udpRange` <a name="cdk8s-plus-27.NetworkPolicyPort.udpRange"></a>

```typescript
import { NetworkPolicyPort } from 'cdk8s-plus-27'

NetworkPolicyPort.udpRange(startPort: number, endPort: number)
```

###### `startPort`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyPort.parameter.startPort"></a>

- *Type:* `number`

---

###### `endPort`<sup>Required</sup> <a name="cdk8s-plus-27.NetworkPolicyPort.parameter.endPort"></a>

- *Type:* `number`

---



### Node <a name="cdk8s-plus-27.Node"></a>

Represents a node in the cluster.

#### Initializers <a name="cdk8s-plus-27.Node.Initializer"></a>

```typescript
import { Node } from 'cdk8s-plus-27'

new Node()
```


#### Static Functions <a name="Static Functions"></a>

##### `labeled` <a name="cdk8s-plus-27.Node.labeled"></a>

```typescript
import { Node } from 'cdk8s-plus-27'

Node.labeled(labelSelector: NodeLabelQuery)
```

###### `labelSelector`<sup>Required</sup> <a name="cdk8s-plus-27.Node.parameter.labelSelector"></a>

- *Type:* [`cdk8s-plus-27.NodeLabelQuery`](#cdk8s-plus-27.NodeLabelQuery)

---

##### `named` <a name="cdk8s-plus-27.Node.named"></a>

```typescript
import { Node } from 'cdk8s-plus-27'

Node.named(nodeName: string)
```

###### `nodeName`<sup>Required</sup> <a name="cdk8s-plus-27.Node.parameter.nodeName"></a>

- *Type:* `string`

---

##### `tainted` <a name="cdk8s-plus-27.Node.tainted"></a>

```typescript
import { Node } from 'cdk8s-plus-27'

Node.tainted(taintSelector: NodeTaintQuery)
```

###### `taintSelector`<sup>Required</sup> <a name="cdk8s-plus-27.Node.parameter.taintSelector"></a>

- *Type:* [`cdk8s-plus-27.NodeTaintQuery`](#cdk8s-plus-27.NodeTaintQuery)

---



### NodeLabelQuery <a name="cdk8s-plus-27.NodeLabelQuery"></a>

Represents a query that can be performed against nodes with labels.


#### Static Functions <a name="Static Functions"></a>

##### `doesNotExist` <a name="cdk8s-plus-27.NodeLabelQuery.doesNotExist"></a>

```typescript
import { NodeLabelQuery } from 'cdk8s-plus-27'

NodeLabelQuery.doesNotExist(key: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.key"></a>

- *Type:* `string`

---

##### `exists` <a name="cdk8s-plus-27.NodeLabelQuery.exists"></a>

```typescript
import { NodeLabelQuery } from 'cdk8s-plus-27'

NodeLabelQuery.exists(key: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.key"></a>

- *Type:* `string`

---

##### `gt` <a name="cdk8s-plus-27.NodeLabelQuery.gt"></a>

```typescript
import { NodeLabelQuery } from 'cdk8s-plus-27'

NodeLabelQuery.gt(key: string, values: string[])
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.key"></a>

- *Type:* `string`

---

###### `values`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.values"></a>

- *Type:* `string`[]

---

##### `in` <a name="cdk8s-plus-27.NodeLabelQuery.in"></a>

```typescript
import { NodeLabelQuery } from 'cdk8s-plus-27'

NodeLabelQuery.in(key: string, values: string[])
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.key"></a>

- *Type:* `string`

---

###### `values`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.values"></a>

- *Type:* `string`[]

---

##### `is` <a name="cdk8s-plus-27.NodeLabelQuery.is"></a>

```typescript
import { NodeLabelQuery } from 'cdk8s-plus-27'

NodeLabelQuery.is(key: string, value: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.key"></a>

- *Type:* `string`

---

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.value"></a>

- *Type:* `string`

---

##### `lt` <a name="cdk8s-plus-27.NodeLabelQuery.lt"></a>

```typescript
import { NodeLabelQuery } from 'cdk8s-plus-27'

NodeLabelQuery.lt(key: string, values: string[])
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.key"></a>

- *Type:* `string`

---

###### `values`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.values"></a>

- *Type:* `string`[]

---

##### `notIn` <a name="cdk8s-plus-27.NodeLabelQuery.notIn"></a>

```typescript
import { NodeLabelQuery } from 'cdk8s-plus-27'

NodeLabelQuery.notIn(key: string, values: string[])
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.key"></a>

- *Type:* `string`

---

###### `values`<sup>Required</sup> <a name="cdk8s-plus-27.NodeLabelQuery.parameter.values"></a>

- *Type:* `string`[]

---



### NodeTaintQuery <a name="cdk8s-plus-27.NodeTaintQuery"></a>

Taint queries that can be perfomed against nodes.


#### Static Functions <a name="Static Functions"></a>

##### `any` <a name="cdk8s-plus-27.NodeTaintQuery.any"></a>

```typescript
import { NodeTaintQuery } from 'cdk8s-plus-27'

NodeTaintQuery.any()
```

##### `exists` <a name="cdk8s-plus-27.NodeTaintQuery.exists"></a>

```typescript
import { NodeTaintQuery } from 'cdk8s-plus-27'

NodeTaintQuery.exists(key: string, options?: NodeTaintQueryOptions)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.NodeTaintQuery.parameter.key"></a>

- *Type:* `string`

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.NodeTaintQuery.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.NodeTaintQueryOptions`](#cdk8s-plus-27.NodeTaintQueryOptions)

---

##### `is` <a name="cdk8s-plus-27.NodeTaintQuery.is"></a>

```typescript
import { NodeTaintQuery } from 'cdk8s-plus-27'

NodeTaintQuery.is(key: string, value: string, options?: NodeTaintQueryOptions)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.NodeTaintQuery.parameter.key"></a>

- *Type:* `string`

---

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.NodeTaintQuery.parameter.value"></a>

- *Type:* `string`

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.NodeTaintQuery.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.NodeTaintQueryOptions`](#cdk8s-plus-27.NodeTaintQueryOptions)

---



### NonApiResource <a name="cdk8s-plus-27.NonApiResource"></a>

- *Implements:* [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

Factory for creating non api resources.

#### Methods <a name="Methods"></a>

##### `asApiResource` <a name="cdk8s-plus-27.NonApiResource.asApiResource"></a>

```typescript
public asApiResource()
```

##### `asNonApiResource` <a name="cdk8s-plus-27.NonApiResource.asNonApiResource"></a>

```typescript
public asNonApiResource()
```

#### Static Functions <a name="Static Functions"></a>

##### `of` <a name="cdk8s-plus-27.NonApiResource.of"></a>

```typescript
import { NonApiResource } from 'cdk8s-plus-27'

NonApiResource.of(url: string)
```

###### `url`<sup>Required</sup> <a name="cdk8s-plus-27.NonApiResource.parameter.url"></a>

- *Type:* `string`

---



### PercentOrAbsolute <a name="cdk8s-plus-27.PercentOrAbsolute"></a>

Union like class repsenting either a ration in percents or an absolute number.

#### Methods <a name="Methods"></a>

##### `isZero` <a name="cdk8s-plus-27.PercentOrAbsolute.isZero"></a>

```typescript
public isZero()
```

#### Static Functions <a name="Static Functions"></a>

##### `absolute` <a name="cdk8s-plus-27.PercentOrAbsolute.absolute"></a>

```typescript
import { PercentOrAbsolute } from 'cdk8s-plus-27'

PercentOrAbsolute.absolute(num: number)
```

###### `num`<sup>Required</sup> <a name="cdk8s-plus-27.PercentOrAbsolute.parameter.num"></a>

- *Type:* `number`

---

##### `percent` <a name="cdk8s-plus-27.PercentOrAbsolute.percent"></a>

```typescript
import { PercentOrAbsolute } from 'cdk8s-plus-27'

PercentOrAbsolute.percent(percent: number)
```

###### `percent`<sup>Required</sup> <a name="cdk8s-plus-27.PercentOrAbsolute.parameter.percent"></a>

- *Type:* `number`

---

#### Properties <a name="Properties"></a>

##### `value`<sup>Required</sup> <a name="cdk8s-plus-27.PercentOrAbsolute.property.value"></a>

```typescript
public readonly value: any;
```

- *Type:* `any`

---


### PodConnections <a name="cdk8s-plus-27.PodConnections"></a>

Controls network isolation rules for inter-pod communication.

#### Initializers <a name="cdk8s-plus-27.PodConnections.Initializer"></a>

```typescript
import { PodConnections } from 'cdk8s-plus-27'

new PodConnections(instance: AbstractPod)
```

##### `instance`<sup>Required</sup> <a name="cdk8s-plus-27.PodConnections.parameter.instance"></a>

- *Type:* [`cdk8s-plus-27.AbstractPod`](#cdk8s-plus-27.AbstractPod)

---

#### Methods <a name="Methods"></a>

##### `allowFrom` <a name="cdk8s-plus-27.PodConnections.allowFrom"></a>

```typescript
public allowFrom(peer: INetworkPolicyPeer, options?: PodConnectionsAllowFromOptions)
```

###### `peer`<sup>Required</sup> <a name="cdk8s-plus-27.PodConnections.parameter.peer"></a>

- *Type:* [`cdk8s-plus-27.INetworkPolicyPeer`](#cdk8s-plus-27.INetworkPolicyPeer)

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.PodConnections.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.PodConnectionsAllowFromOptions`](#cdk8s-plus-27.PodConnectionsAllowFromOptions)

---

##### `allowTo` <a name="cdk8s-plus-27.PodConnections.allowTo"></a>

```typescript
public allowTo(peer: INetworkPolicyPeer, options?: PodConnectionsAllowToOptions)
```

###### `peer`<sup>Required</sup> <a name="cdk8s-plus-27.PodConnections.parameter.peer"></a>

- *Type:* [`cdk8s-plus-27.INetworkPolicyPeer`](#cdk8s-plus-27.INetworkPolicyPeer)

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.PodConnections.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.PodConnectionsAllowToOptions`](#cdk8s-plus-27.PodConnectionsAllowToOptions)

---

##### `isolate` <a name="cdk8s-plus-27.PodConnections.isolate"></a>

```typescript
public isolate()
```




### PodDns <a name="cdk8s-plus-27.PodDns"></a>

Holds dns settings of the pod.

#### Initializers <a name="cdk8s-plus-27.PodDns.Initializer"></a>

```typescript
import { PodDns } from 'cdk8s-plus-27'

new PodDns(props?: PodDnsProps)
```

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.PodDns.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.PodDnsProps`](#cdk8s-plus-27.PodDnsProps)

---

#### Methods <a name="Methods"></a>

##### `addNameserver` <a name="cdk8s-plus-27.PodDns.addNameserver"></a>

```typescript
public addNameserver(nameservers: string)
```

###### `nameservers`<sup>Required</sup> <a name="cdk8s-plus-27.PodDns.parameter.nameservers"></a>

- *Type:* `string`

---

##### `addOption` <a name="cdk8s-plus-27.PodDns.addOption"></a>

```typescript
public addOption(options: DnsOption)
```

###### `options`<sup>Required</sup> <a name="cdk8s-plus-27.PodDns.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.DnsOption`](#cdk8s-plus-27.DnsOption)

---

##### `addSearch` <a name="cdk8s-plus-27.PodDns.addSearch"></a>

```typescript
public addSearch(searches: string)
```

###### `searches`<sup>Required</sup> <a name="cdk8s-plus-27.PodDns.parameter.searches"></a>

- *Type:* `string`

---


#### Properties <a name="Properties"></a>

##### `hostnameAsFQDN`<sup>Required</sup> <a name="cdk8s-plus-27.PodDns.property.hostnameAsFQDN"></a>

```typescript
public readonly hostnameAsFQDN: boolean;
```

- *Type:* `boolean`

Whether or not the pods hostname is set to its FQDN.

---

##### `nameservers`<sup>Required</sup> <a name="cdk8s-plus-27.PodDns.property.nameservers"></a>

```typescript
public readonly nameservers: string[];
```

- *Type:* `string`[]

Nameservers defined for this pod.

---

##### `options`<sup>Required</sup> <a name="cdk8s-plus-27.PodDns.property.options"></a>

```typescript
public readonly options: DnsOption[];
```

- *Type:* [`cdk8s-plus-27.DnsOption`](#cdk8s-plus-27.DnsOption)[]

Custom dns options defined for this pod.

---

##### `policy`<sup>Required</sup> <a name="cdk8s-plus-27.PodDns.property.policy"></a>

```typescript
public readonly policy: DnsPolicy;
```

- *Type:* [`cdk8s-plus-27.DnsPolicy`](#cdk8s-plus-27.DnsPolicy)

The DNS policy of this pod.

---

##### `searches`<sup>Required</sup> <a name="cdk8s-plus-27.PodDns.property.searches"></a>

```typescript
public readonly searches: string[];
```

- *Type:* `string`[]

Search domains defined for this pod.

---

##### `hostname`<sup>Optional</sup> <a name="cdk8s-plus-27.PodDns.property.hostname"></a>

```typescript
public readonly hostname: string;
```

- *Type:* `string`

The configured hostname of the pod.

Undefined means its set to a system-defined value.

---

##### `subdomain`<sup>Optional</sup> <a name="cdk8s-plus-27.PodDns.property.subdomain"></a>

```typescript
public readonly subdomain: string;
```

- *Type:* `string`

The configured subdomain of the pod.

---


### PodScheduling <a name="cdk8s-plus-27.PodScheduling"></a>

Controls the pod scheduling strategy.

#### Initializers <a name="cdk8s-plus-27.PodScheduling.Initializer"></a>

```typescript
import { PodScheduling } from 'cdk8s-plus-27'

new PodScheduling(instance: AbstractPod)
```

##### `instance`<sup>Required</sup> <a name="cdk8s-plus-27.PodScheduling.parameter.instance"></a>

- *Type:* [`cdk8s-plus-27.AbstractPod`](#cdk8s-plus-27.AbstractPod)

---

#### Methods <a name="Methods"></a>

##### `assign` <a name="cdk8s-plus-27.PodScheduling.assign"></a>

```typescript
public assign(node: NamedNode)
```

###### `node`<sup>Required</sup> <a name="cdk8s-plus-27.PodScheduling.parameter.node"></a>

- *Type:* [`cdk8s-plus-27.NamedNode`](#cdk8s-plus-27.NamedNode)

---

##### `attract` <a name="cdk8s-plus-27.PodScheduling.attract"></a>

```typescript
public attract(node: LabeledNode, options?: PodSchedulingAttractOptions)
```

###### `node`<sup>Required</sup> <a name="cdk8s-plus-27.PodScheduling.parameter.node"></a>

- *Type:* [`cdk8s-plus-27.LabeledNode`](#cdk8s-plus-27.LabeledNode)

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.PodScheduling.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.PodSchedulingAttractOptions`](#cdk8s-plus-27.PodSchedulingAttractOptions)

---

##### `colocate` <a name="cdk8s-plus-27.PodScheduling.colocate"></a>

```typescript
public colocate(selector: IPodSelector, options?: PodSchedulingColocateOptions)
```

###### `selector`<sup>Required</sup> <a name="cdk8s-plus-27.PodScheduling.parameter.selector"></a>

- *Type:* [`cdk8s-plus-27.IPodSelector`](#cdk8s-plus-27.IPodSelector)

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.PodScheduling.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.PodSchedulingColocateOptions`](#cdk8s-plus-27.PodSchedulingColocateOptions)

---

##### `separate` <a name="cdk8s-plus-27.PodScheduling.separate"></a>

```typescript
public separate(selector: IPodSelector, options?: PodSchedulingSeparateOptions)
```

###### `selector`<sup>Required</sup> <a name="cdk8s-plus-27.PodScheduling.parameter.selector"></a>

- *Type:* [`cdk8s-plus-27.IPodSelector`](#cdk8s-plus-27.IPodSelector)

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.PodScheduling.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.PodSchedulingSeparateOptions`](#cdk8s-plus-27.PodSchedulingSeparateOptions)

---

##### `tolerate` <a name="cdk8s-plus-27.PodScheduling.tolerate"></a>

```typescript
public tolerate(node: TaintedNode)
```

###### `node`<sup>Required</sup> <a name="cdk8s-plus-27.PodScheduling.parameter.node"></a>

- *Type:* [`cdk8s-plus-27.TaintedNode`](#cdk8s-plus-27.TaintedNode)

---




### PodSecurityContext <a name="cdk8s-plus-27.PodSecurityContext"></a>

Holds pod-level security attributes and common container settings.

#### Initializers <a name="cdk8s-plus-27.PodSecurityContext.Initializer"></a>

```typescript
import { PodSecurityContext } from 'cdk8s-plus-27'

new PodSecurityContext(props?: PodSecurityContextProps)
```

##### `props`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSecurityContext.parameter.props"></a>

- *Type:* [`cdk8s-plus-27.PodSecurityContextProps`](#cdk8s-plus-27.PodSecurityContextProps)

---



#### Properties <a name="Properties"></a>

##### `ensureNonRoot`<sup>Required</sup> <a name="cdk8s-plus-27.PodSecurityContext.property.ensureNonRoot"></a>

```typescript
public readonly ensureNonRoot: boolean;
```

- *Type:* `boolean`

---

##### `fsGroupChangePolicy`<sup>Required</sup> <a name="cdk8s-plus-27.PodSecurityContext.property.fsGroupChangePolicy"></a>

```typescript
public readonly fsGroupChangePolicy: FsGroupChangePolicy;
```

- *Type:* [`cdk8s-plus-27.FsGroupChangePolicy`](#cdk8s-plus-27.FsGroupChangePolicy)

---

##### `sysctls`<sup>Required</sup> <a name="cdk8s-plus-27.PodSecurityContext.property.sysctls"></a>

```typescript
public readonly sysctls: Sysctl[];
```

- *Type:* [`cdk8s-plus-27.Sysctl`](#cdk8s-plus-27.Sysctl)[]

---

##### `fsGroup`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSecurityContext.property.fsGroup"></a>

```typescript
public readonly fsGroup: number;
```

- *Type:* `number`

---

##### `group`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSecurityContext.property.group"></a>

```typescript
public readonly group: number;
```

- *Type:* `number`

---

##### `user`<sup>Optional</sup> <a name="cdk8s-plus-27.PodSecurityContext.property.user"></a>

```typescript
public readonly user: number;
```

- *Type:* `number`

---


### Probe <a name="cdk8s-plus-27.Probe"></a>

Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.


#### Static Functions <a name="Static Functions"></a>

##### `fromCommand` <a name="cdk8s-plus-27.Probe.fromCommand"></a>

```typescript
import { Probe } from 'cdk8s-plus-27'

Probe.fromCommand(command: string[], options?: CommandProbeOptions)
```

###### `command`<sup>Required</sup> <a name="cdk8s-plus-27.Probe.parameter.command"></a>

- *Type:* `string`[]

The command to execute.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Probe.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.CommandProbeOptions`](#cdk8s-plus-27.CommandProbeOptions)

Options.

---

##### `fromHttpGet` <a name="cdk8s-plus-27.Probe.fromHttpGet"></a>

```typescript
import { Probe } from 'cdk8s-plus-27'

Probe.fromHttpGet(path: string, options?: HttpGetProbeOptions)
```

###### `path`<sup>Required</sup> <a name="cdk8s-plus-27.Probe.parameter.path"></a>

- *Type:* `string`

The URL path to hit.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Probe.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.HttpGetProbeOptions`](#cdk8s-plus-27.HttpGetProbeOptions)

Options.

---

##### `fromTcpSocket` <a name="cdk8s-plus-27.Probe.fromTcpSocket"></a>

```typescript
import { Probe } from 'cdk8s-plus-27'

Probe.fromTcpSocket(options?: TcpSocketProbeOptions)
```

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.Probe.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.TcpSocketProbeOptions`](#cdk8s-plus-27.TcpSocketProbeOptions)

Options.

---



### Replicas <a name="cdk8s-plus-27.Replicas"></a>

The amount of replicas that will change.


#### Static Functions <a name="Static Functions"></a>

##### `absolute` <a name="cdk8s-plus-27.Replicas.absolute"></a>

```typescript
import { Replicas } from 'cdk8s-plus-27'

Replicas.absolute(value: number)
```

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.Replicas.parameter.value"></a>

- *Type:* `number`

The amount of change to apply.

Must be greater than 0.

---

##### `percent` <a name="cdk8s-plus-27.Replicas.percent"></a>

```typescript
import { Replicas } from 'cdk8s-plus-27'

Replicas.percent(value: number)
```

###### `value`<sup>Required</sup> <a name="cdk8s-plus-27.Replicas.parameter.value"></a>

- *Type:* `number`

The percentage of change to apply.

Must be greater than 0.

---



### ResourcePermissions <a name="cdk8s-plus-27.ResourcePermissions"></a>

Controls permissions for operations on resources.

#### Initializers <a name="cdk8s-plus-27.ResourcePermissions.Initializer"></a>

```typescript
import { ResourcePermissions } from 'cdk8s-plus-27'

new ResourcePermissions(instance: Resource)
```

##### `instance`<sup>Required</sup> <a name="cdk8s-plus-27.ResourcePermissions.parameter.instance"></a>

- *Type:* [`cdk8s-plus-27.Resource`](#cdk8s-plus-27.Resource)

---

#### Methods <a name="Methods"></a>

##### `grantRead` <a name="cdk8s-plus-27.ResourcePermissions.grantRead"></a>

```typescript
public grantRead(subjects: ISubject)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s-plus-27.ResourcePermissions.parameter.subjects"></a>

- *Type:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

---

##### `grantReadWrite` <a name="cdk8s-plus-27.ResourcePermissions.grantReadWrite"></a>

```typescript
public grantReadWrite(subjects: ISubject)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s-plus-27.ResourcePermissions.parameter.subjects"></a>

- *Type:* [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

---




### StatefulSetUpdateStrategy <a name="cdk8s-plus-27.StatefulSetUpdateStrategy"></a>

StatefulSet update strategies.


#### Static Functions <a name="Static Functions"></a>

##### `onDelete` <a name="cdk8s-plus-27.StatefulSetUpdateStrategy.onDelete"></a>

```typescript
import { StatefulSetUpdateStrategy } from 'cdk8s-plus-27'

StatefulSetUpdateStrategy.onDelete()
```

##### `rollingUpdate` <a name="cdk8s-plus-27.StatefulSetUpdateStrategy.rollingUpdate"></a>

```typescript
import { StatefulSetUpdateStrategy } from 'cdk8s-plus-27'

StatefulSetUpdateStrategy.rollingUpdate(options?: StatefulSetUpdateStrategyRollingUpdateOptions)
```

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.StatefulSetUpdateStrategy.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.StatefulSetUpdateStrategyRollingUpdateOptions`](#cdk8s-plus-27.StatefulSetUpdateStrategyRollingUpdateOptions)

---



### TaintedNode <a name="cdk8s-plus-27.TaintedNode"></a>

A node that is matched by taint selectors.

#### Initializers <a name="cdk8s-plus-27.TaintedNode.Initializer"></a>

```typescript
import { TaintedNode } from 'cdk8s-plus-27'

new TaintedNode(taintSelector: NodeTaintQuery[])
```

##### `taintSelector`<sup>Required</sup> <a name="cdk8s-plus-27.TaintedNode.parameter.taintSelector"></a>

- *Type:* [`cdk8s-plus-27.NodeTaintQuery`](#cdk8s-plus-27.NodeTaintQuery)[]

---



#### Properties <a name="Properties"></a>

##### `taintSelector`<sup>Required</sup> <a name="cdk8s-plus-27.TaintedNode.property.taintSelector"></a>

```typescript
public readonly taintSelector: NodeTaintQuery[];
```

- *Type:* [`cdk8s-plus-27.NodeTaintQuery`](#cdk8s-plus-27.NodeTaintQuery)[]

---


### Topology <a name="cdk8s-plus-27.Topology"></a>

Available topology domains.


#### Static Functions <a name="Static Functions"></a>

##### `custom` <a name="cdk8s-plus-27.Topology.custom"></a>

```typescript
import { Topology } from 'cdk8s-plus-27'

Topology.custom(key: string)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.Topology.parameter.key"></a>

- *Type:* `string`

---

#### Properties <a name="Properties"></a>

##### `key`<sup>Required</sup> <a name="cdk8s-plus-27.Topology.property.key"></a>

```typescript
public readonly key: string;
```

- *Type:* `string`

---

#### Constants <a name="Constants"></a>

##### `HOSTNAME` <a name="cdk8s-plus-27.Topology.property.HOSTNAME"></a>

- *Type:* [`cdk8s-plus-27.Topology`](#cdk8s-plus-27.Topology)

A hostname represents a single node in the cluster.

> https://kubernetes.io/docs/reference/labels-annotations-taints/#kubernetesiohostname

---

##### `REGION` <a name="cdk8s-plus-27.Topology.property.REGION"></a>

- *Type:* [`cdk8s-plus-27.Topology`](#cdk8s-plus-27.Topology)

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

##### `ZONE` <a name="cdk8s-plus-27.Topology.property.ZONE"></a>

- *Type:* [`cdk8s-plus-27.Topology`](#cdk8s-plus-27.Topology)

A zone represents a logical failure domain.

It is common for Kubernetes clusters to
span multiple zones for increased availability. While the exact definition of a zone is
left to infrastructure implementations, common properties of a zone include very low
network latency within a zone, no-cost network traffic within a zone, and failure
independence from other zones. For example, nodes within a zone might share a network
switch, but nodes in different zones should not.

> https://kubernetes.io/docs/reference/labels-annotations-taints/#topologykubernetesiozone

---

### WorkloadScheduling <a name="cdk8s-plus-27.WorkloadScheduling"></a>

Controls the pod scheduling strategy of this workload.

It offers some additional API's on top of the core pod scheduling.

#### Initializers <a name="cdk8s-plus-27.WorkloadScheduling.Initializer"></a>

```typescript
import { WorkloadScheduling } from 'cdk8s-plus-27'

new WorkloadScheduling(instance: AbstractPod)
```

##### `instance`<sup>Required</sup> <a name="cdk8s-plus-27.WorkloadScheduling.parameter.instance"></a>

- *Type:* [`cdk8s-plus-27.AbstractPod`](#cdk8s-plus-27.AbstractPod)

---

#### Methods <a name="Methods"></a>

##### `spread` <a name="cdk8s-plus-27.WorkloadScheduling.spread"></a>

```typescript
public spread(options?: WorkloadSchedulingSpreadOptions)
```

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.WorkloadScheduling.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.WorkloadSchedulingSpreadOptions`](#cdk8s-plus-27.WorkloadSchedulingSpreadOptions)

---




## Protocols <a name="Protocols"></a>

### IApiEndpoint <a name="cdk8s-plus-27.IApiEndpoint"></a>

- *Implemented By:* [`cdk8s-plus-27.AbstractPod`](#cdk8s-plus-27.AbstractPod), [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource), [`cdk8s-plus-27.AwsElasticBlockStorePersistentVolume`](#cdk8s-plus-27.AwsElasticBlockStorePersistentVolume), [`cdk8s-plus-27.AzureDiskPersistentVolume`](#cdk8s-plus-27.AzureDiskPersistentVolume), [`cdk8s-plus-27.BasicAuthSecret`](#cdk8s-plus-27.BasicAuthSecret), [`cdk8s-plus-27.ClusterRole`](#cdk8s-plus-27.ClusterRole), [`cdk8s-plus-27.ClusterRoleBinding`](#cdk8s-plus-27.ClusterRoleBinding), [`cdk8s-plus-27.ConfigMap`](#cdk8s-plus-27.ConfigMap), [`cdk8s-plus-27.CronJob`](#cdk8s-plus-27.CronJob), [`cdk8s-plus-27.DaemonSet`](#cdk8s-plus-27.DaemonSet), [`cdk8s-plus-27.Deployment`](#cdk8s-plus-27.Deployment), [`cdk8s-plus-27.DockerConfigSecret`](#cdk8s-plus-27.DockerConfigSecret), [`cdk8s-plus-27.GCEPersistentDiskPersistentVolume`](#cdk8s-plus-27.GCEPersistentDiskPersistentVolume), [`cdk8s-plus-27.HorizontalPodAutoscaler`](#cdk8s-plus-27.HorizontalPodAutoscaler), [`cdk8s-plus-27.Ingress`](#cdk8s-plus-27.Ingress), [`cdk8s-plus-27.Job`](#cdk8s-plus-27.Job), [`cdk8s-plus-27.Namespace`](#cdk8s-plus-27.Namespace), [`cdk8s-plus-27.NetworkPolicy`](#cdk8s-plus-27.NetworkPolicy), [`cdk8s-plus-27.NonApiResource`](#cdk8s-plus-27.NonApiResource), [`cdk8s-plus-27.PersistentVolume`](#cdk8s-plus-27.PersistentVolume), [`cdk8s-plus-27.PersistentVolumeClaim`](#cdk8s-plus-27.PersistentVolumeClaim), [`cdk8s-plus-27.Pod`](#cdk8s-plus-27.Pod), [`cdk8s-plus-27.Resource`](#cdk8s-plus-27.Resource), [`cdk8s-plus-27.Role`](#cdk8s-plus-27.Role), [`cdk8s-plus-27.RoleBinding`](#cdk8s-plus-27.RoleBinding), [`cdk8s-plus-27.Secret`](#cdk8s-plus-27.Secret), [`cdk8s-plus-27.Service`](#cdk8s-plus-27.Service), [`cdk8s-plus-27.ServiceAccount`](#cdk8s-plus-27.ServiceAccount), [`cdk8s-plus-27.ServiceAccountTokenSecret`](#cdk8s-plus-27.ServiceAccountTokenSecret), [`cdk8s-plus-27.SshAuthSecret`](#cdk8s-plus-27.SshAuthSecret), [`cdk8s-plus-27.StatefulSet`](#cdk8s-plus-27.StatefulSet), [`cdk8s-plus-27.TlsSecret`](#cdk8s-plus-27.TlsSecret), [`cdk8s-plus-27.Workload`](#cdk8s-plus-27.Workload), [`cdk8s-plus-27.IApiEndpoint`](#cdk8s-plus-27.IApiEndpoint)

An API Endpoint can either be a resource descriptor (e.g /pods) or a non resource url (e.g /healthz). It must be one or the other, and not both.

#### Methods <a name="Methods"></a>

##### `asApiResource` <a name="cdk8s-plus-27.IApiEndpoint.asApiResource"></a>

```typescript
public asApiResource()
```

##### `asNonApiResource` <a name="cdk8s-plus-27.IApiEndpoint.asNonApiResource"></a>

```typescript
public asNonApiResource()
```


### IApiResource <a name="cdk8s-plus-27.IApiResource"></a>

- *Implemented By:* [`cdk8s-plus-27.AbstractPod`](#cdk8s-plus-27.AbstractPod), [`cdk8s-plus-27.ApiResource`](#cdk8s-plus-27.ApiResource), [`cdk8s-plus-27.AwsElasticBlockStorePersistentVolume`](#cdk8s-plus-27.AwsElasticBlockStorePersistentVolume), [`cdk8s-plus-27.AzureDiskPersistentVolume`](#cdk8s-plus-27.AzureDiskPersistentVolume), [`cdk8s-plus-27.BasicAuthSecret`](#cdk8s-plus-27.BasicAuthSecret), [`cdk8s-plus-27.ClusterRole`](#cdk8s-plus-27.ClusterRole), [`cdk8s-plus-27.ClusterRoleBinding`](#cdk8s-plus-27.ClusterRoleBinding), [`cdk8s-plus-27.ConfigMap`](#cdk8s-plus-27.ConfigMap), [`cdk8s-plus-27.CronJob`](#cdk8s-plus-27.CronJob), [`cdk8s-plus-27.DaemonSet`](#cdk8s-plus-27.DaemonSet), [`cdk8s-plus-27.Deployment`](#cdk8s-plus-27.Deployment), [`cdk8s-plus-27.DockerConfigSecret`](#cdk8s-plus-27.DockerConfigSecret), [`cdk8s-plus-27.GCEPersistentDiskPersistentVolume`](#cdk8s-plus-27.GCEPersistentDiskPersistentVolume), [`cdk8s-plus-27.HorizontalPodAutoscaler`](#cdk8s-plus-27.HorizontalPodAutoscaler), [`cdk8s-plus-27.Ingress`](#cdk8s-plus-27.Ingress), [`cdk8s-plus-27.Job`](#cdk8s-plus-27.Job), [`cdk8s-plus-27.Namespace`](#cdk8s-plus-27.Namespace), [`cdk8s-plus-27.NetworkPolicy`](#cdk8s-plus-27.NetworkPolicy), [`cdk8s-plus-27.PersistentVolume`](#cdk8s-plus-27.PersistentVolume), [`cdk8s-plus-27.PersistentVolumeClaim`](#cdk8s-plus-27.PersistentVolumeClaim), [`cdk8s-plus-27.Pod`](#cdk8s-plus-27.Pod), [`cdk8s-plus-27.Resource`](#cdk8s-plus-27.Resource), [`cdk8s-plus-27.Role`](#cdk8s-plus-27.Role), [`cdk8s-plus-27.RoleBinding`](#cdk8s-plus-27.RoleBinding), [`cdk8s-plus-27.Secret`](#cdk8s-plus-27.Secret), [`cdk8s-plus-27.Service`](#cdk8s-plus-27.Service), [`cdk8s-plus-27.ServiceAccount`](#cdk8s-plus-27.ServiceAccount), [`cdk8s-plus-27.ServiceAccountTokenSecret`](#cdk8s-plus-27.ServiceAccountTokenSecret), [`cdk8s-plus-27.SshAuthSecret`](#cdk8s-plus-27.SshAuthSecret), [`cdk8s-plus-27.StatefulSet`](#cdk8s-plus-27.StatefulSet), [`cdk8s-plus-27.TlsSecret`](#cdk8s-plus-27.TlsSecret), [`cdk8s-plus-27.Workload`](#cdk8s-plus-27.Workload), [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource), [`cdk8s-plus-27.IClusterRole`](#cdk8s-plus-27.IClusterRole), [`cdk8s-plus-27.IConfigMap`](#cdk8s-plus-27.IConfigMap), [`cdk8s-plus-27.IPersistentVolume`](#cdk8s-plus-27.IPersistentVolume), [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim), [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource), [`cdk8s-plus-27.IRole`](#cdk8s-plus-27.IRole), [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret), [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)

Represents a resource or collection of resources.


#### Properties <a name="Properties"></a>

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.IApiResource.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.IApiResource.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="cdk8s-plus-27.IApiResource.property.resourceName"></a>

```typescript
public readonly resourceName: string;
```

- *Type:* `string`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

### IClusterRole <a name="cdk8s-plus-27.IClusterRole"></a>

- *Extends:* [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource)

- *Implemented By:* [`cdk8s-plus-27.ClusterRole`](#cdk8s-plus-27.ClusterRole), [`cdk8s-plus-27.IClusterRole`](#cdk8s-plus-27.IClusterRole)

Represents a cluster-level role.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.IClusterRole.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.IClusterRole.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.IClusterRole.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="cdk8s-plus-27.IClusterRole.property.resourceName"></a>

```typescript
public readonly resourceName: string;
```

- *Type:* `string`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="cdk8s-plus-27.IClusterRole.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.IClusterRole.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.IClusterRole.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The Kubernetes name of this resource.

---

### IConfigMap <a name="cdk8s-plus-27.IConfigMap"></a>

- *Extends:* [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource)

- *Implemented By:* [`cdk8s-plus-27.ConfigMap`](#cdk8s-plus-27.ConfigMap), [`cdk8s-plus-27.IConfigMap`](#cdk8s-plus-27.IConfigMap)

Represents a config map.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.IConfigMap.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.IConfigMap.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.IConfigMap.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="cdk8s-plus-27.IConfigMap.property.resourceName"></a>

```typescript
public readonly resourceName: string;
```

- *Type:* `string`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="cdk8s-plus-27.IConfigMap.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.IConfigMap.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.IConfigMap.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The Kubernetes name of this resource.

---

### INamespaceSelector <a name="cdk8s-plus-27.INamespaceSelector"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct)

- *Implemented By:* [`cdk8s-plus-27.Namespace`](#cdk8s-plus-27.Namespace), [`cdk8s-plus-27.Namespaces`](#cdk8s-plus-27.Namespaces), [`cdk8s-plus-27.INamespaceSelector`](#cdk8s-plus-27.INamespaceSelector)

Represents an object that can select namespaces.

#### Methods <a name="Methods"></a>

##### `toNamespaceSelectorConfig` <a name="cdk8s-plus-27.INamespaceSelector.toNamespaceSelectorConfig"></a>

```typescript
public toNamespaceSelectorConfig()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.INamespaceSelector.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

### INetworkPolicyPeer <a name="cdk8s-plus-27.INetworkPolicyPeer"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct)

- *Implemented By:* [`cdk8s-plus-27.AbstractPod`](#cdk8s-plus-27.AbstractPod), [`cdk8s-plus-27.CronJob`](#cdk8s-plus-27.CronJob), [`cdk8s-plus-27.DaemonSet`](#cdk8s-plus-27.DaemonSet), [`cdk8s-plus-27.Deployment`](#cdk8s-plus-27.Deployment), [`cdk8s-plus-27.Job`](#cdk8s-plus-27.Job), [`cdk8s-plus-27.Namespace`](#cdk8s-plus-27.Namespace), [`cdk8s-plus-27.Namespaces`](#cdk8s-plus-27.Namespaces), [`cdk8s-plus-27.NetworkPolicyIpBlock`](#cdk8s-plus-27.NetworkPolicyIpBlock), [`cdk8s-plus-27.Pod`](#cdk8s-plus-27.Pod), [`cdk8s-plus-27.StatefulSet`](#cdk8s-plus-27.StatefulSet), [`cdk8s-plus-27.Workload`](#cdk8s-plus-27.Workload), [`cdk8s-plus-27.INetworkPolicyPeer`](#cdk8s-plus-27.INetworkPolicyPeer)

Describes a peer to allow traffic to/from.

#### Methods <a name="Methods"></a>

##### `toNetworkPolicyPeerConfig` <a name="cdk8s-plus-27.INetworkPolicyPeer.toNetworkPolicyPeerConfig"></a>

```typescript
public toNetworkPolicyPeerConfig()
```

##### `toPodSelector` <a name="cdk8s-plus-27.INetworkPolicyPeer.toPodSelector"></a>

```typescript
public toPodSelector()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.INetworkPolicyPeer.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

### IPersistentVolume <a name="cdk8s-plus-27.IPersistentVolume"></a>

- *Extends:* [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource)

- *Implemented By:* [`cdk8s-plus-27.AwsElasticBlockStorePersistentVolume`](#cdk8s-plus-27.AwsElasticBlockStorePersistentVolume), [`cdk8s-plus-27.AzureDiskPersistentVolume`](#cdk8s-plus-27.AzureDiskPersistentVolume), [`cdk8s-plus-27.GCEPersistentDiskPersistentVolume`](#cdk8s-plus-27.GCEPersistentDiskPersistentVolume), [`cdk8s-plus-27.PersistentVolume`](#cdk8s-plus-27.PersistentVolume), [`cdk8s-plus-27.IPersistentVolume`](#cdk8s-plus-27.IPersistentVolume)

Contract of a `PersistentVolumeClaim`.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolume.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolume.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolume.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="cdk8s-plus-27.IPersistentVolume.property.resourceName"></a>

```typescript
public readonly resourceName: string;
```

- *Type:* `string`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolume.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolume.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolume.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The Kubernetes name of this resource.

---

### IPersistentVolumeClaim <a name="cdk8s-plus-27.IPersistentVolumeClaim"></a>

- *Extends:* [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource)

- *Implemented By:* [`cdk8s-plus-27.PersistentVolumeClaim`](#cdk8s-plus-27.PersistentVolumeClaim), [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim)

Contract of a `PersistentVolumeClaim`.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolumeClaim.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolumeClaim.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolumeClaim.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="cdk8s-plus-27.IPersistentVolumeClaim.property.resourceName"></a>

```typescript
public readonly resourceName: string;
```

- *Type:* `string`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolumeClaim.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolumeClaim.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.IPersistentVolumeClaim.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The Kubernetes name of this resource.

---

### IPodSelector <a name="cdk8s-plus-27.IPodSelector"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct)

- *Implemented By:* [`cdk8s-plus-27.AbstractPod`](#cdk8s-plus-27.AbstractPod), [`cdk8s-plus-27.CronJob`](#cdk8s-plus-27.CronJob), [`cdk8s-plus-27.DaemonSet`](#cdk8s-plus-27.DaemonSet), [`cdk8s-plus-27.Deployment`](#cdk8s-plus-27.Deployment), [`cdk8s-plus-27.Job`](#cdk8s-plus-27.Job), [`cdk8s-plus-27.Pod`](#cdk8s-plus-27.Pod), [`cdk8s-plus-27.Pods`](#cdk8s-plus-27.Pods), [`cdk8s-plus-27.StatefulSet`](#cdk8s-plus-27.StatefulSet), [`cdk8s-plus-27.Workload`](#cdk8s-plus-27.Workload), [`cdk8s-plus-27.IPodSelector`](#cdk8s-plus-27.IPodSelector)

Represents an object that can select pods.

#### Methods <a name="Methods"></a>

##### `toPodSelectorConfig` <a name="cdk8s-plus-27.IPodSelector.toPodSelectorConfig"></a>

```typescript
public toPodSelectorConfig()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.IPodSelector.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

### IResource <a name="cdk8s-plus-27.IResource"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct), [`cdk8s-plus-27.IApiResource`](#cdk8s-plus-27.IApiResource)

- *Implemented By:* [`cdk8s-plus-27.AbstractPod`](#cdk8s-plus-27.AbstractPod), [`cdk8s-plus-27.AwsElasticBlockStorePersistentVolume`](#cdk8s-plus-27.AwsElasticBlockStorePersistentVolume), [`cdk8s-plus-27.AzureDiskPersistentVolume`](#cdk8s-plus-27.AzureDiskPersistentVolume), [`cdk8s-plus-27.BasicAuthSecret`](#cdk8s-plus-27.BasicAuthSecret), [`cdk8s-plus-27.ClusterRole`](#cdk8s-plus-27.ClusterRole), [`cdk8s-plus-27.ClusterRoleBinding`](#cdk8s-plus-27.ClusterRoleBinding), [`cdk8s-plus-27.ConfigMap`](#cdk8s-plus-27.ConfigMap), [`cdk8s-plus-27.CronJob`](#cdk8s-plus-27.CronJob), [`cdk8s-plus-27.DaemonSet`](#cdk8s-plus-27.DaemonSet), [`cdk8s-plus-27.Deployment`](#cdk8s-plus-27.Deployment), [`cdk8s-plus-27.DockerConfigSecret`](#cdk8s-plus-27.DockerConfigSecret), [`cdk8s-plus-27.GCEPersistentDiskPersistentVolume`](#cdk8s-plus-27.GCEPersistentDiskPersistentVolume), [`cdk8s-plus-27.HorizontalPodAutoscaler`](#cdk8s-plus-27.HorizontalPodAutoscaler), [`cdk8s-plus-27.Ingress`](#cdk8s-plus-27.Ingress), [`cdk8s-plus-27.Job`](#cdk8s-plus-27.Job), [`cdk8s-plus-27.Namespace`](#cdk8s-plus-27.Namespace), [`cdk8s-plus-27.NetworkPolicy`](#cdk8s-plus-27.NetworkPolicy), [`cdk8s-plus-27.PersistentVolume`](#cdk8s-plus-27.PersistentVolume), [`cdk8s-plus-27.PersistentVolumeClaim`](#cdk8s-plus-27.PersistentVolumeClaim), [`cdk8s-plus-27.Pod`](#cdk8s-plus-27.Pod), [`cdk8s-plus-27.Resource`](#cdk8s-plus-27.Resource), [`cdk8s-plus-27.Role`](#cdk8s-plus-27.Role), [`cdk8s-plus-27.RoleBinding`](#cdk8s-plus-27.RoleBinding), [`cdk8s-plus-27.Secret`](#cdk8s-plus-27.Secret), [`cdk8s-plus-27.Service`](#cdk8s-plus-27.Service), [`cdk8s-plus-27.ServiceAccount`](#cdk8s-plus-27.ServiceAccount), [`cdk8s-plus-27.ServiceAccountTokenSecret`](#cdk8s-plus-27.ServiceAccountTokenSecret), [`cdk8s-plus-27.SshAuthSecret`](#cdk8s-plus-27.SshAuthSecret), [`cdk8s-plus-27.StatefulSet`](#cdk8s-plus-27.StatefulSet), [`cdk8s-plus-27.TlsSecret`](#cdk8s-plus-27.TlsSecret), [`cdk8s-plus-27.Workload`](#cdk8s-plus-27.Workload), [`cdk8s-plus-27.IClusterRole`](#cdk8s-plus-27.IClusterRole), [`cdk8s-plus-27.IConfigMap`](#cdk8s-plus-27.IConfigMap), [`cdk8s-plus-27.IPersistentVolume`](#cdk8s-plus-27.IPersistentVolume), [`cdk8s-plus-27.IPersistentVolumeClaim`](#cdk8s-plus-27.IPersistentVolumeClaim), [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource), [`cdk8s-plus-27.IRole`](#cdk8s-plus-27.IRole), [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret), [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)

Represents a resource.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.IResource.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.IResource.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.IResource.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="cdk8s-plus-27.IResource.property.resourceName"></a>

```typescript
public readonly resourceName: string;
```

- *Type:* `string`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="cdk8s-plus-27.IResource.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.IResource.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.IResource.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The Kubernetes name of this resource.

---

### IRole <a name="cdk8s-plus-27.IRole"></a>

- *Extends:* [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource)

- *Implemented By:* [`cdk8s-plus-27.ClusterRole`](#cdk8s-plus-27.ClusterRole), [`cdk8s-plus-27.Role`](#cdk8s-plus-27.Role), [`cdk8s-plus-27.IRole`](#cdk8s-plus-27.IRole)

A reference to any Role or ClusterRole.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.IRole.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.IRole.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.IRole.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="cdk8s-plus-27.IRole.property.resourceName"></a>

```typescript
public readonly resourceName: string;
```

- *Type:* `string`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="cdk8s-plus-27.IRole.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.IRole.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.IRole.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The Kubernetes name of this resource.

---

### IScalable <a name="cdk8s-plus-27.IScalable"></a>

- *Implemented By:* [`cdk8s-plus-27.Deployment`](#cdk8s-plus-27.Deployment), [`cdk8s-plus-27.StatefulSet`](#cdk8s-plus-27.StatefulSet), [`cdk8s-plus-27.IScalable`](#cdk8s-plus-27.IScalable)

Represents a scalable workload.

#### Methods <a name="Methods"></a>

##### `markHasAutoscaler` <a name="cdk8s-plus-27.IScalable.markHasAutoscaler"></a>

```typescript
public markHasAutoscaler()
```

##### `toScalingTarget` <a name="cdk8s-plus-27.IScalable.toScalingTarget"></a>

```typescript
public toScalingTarget()
```

#### Properties <a name="Properties"></a>

##### `hasAutoscaler`<sup>Required</sup> <a name="cdk8s-plus-27.IScalable.property.hasAutoscaler"></a>

```typescript
public readonly hasAutoscaler: boolean;
```

- *Type:* `boolean`

If this is a target of an autoscaler.

---

### ISecret <a name="cdk8s-plus-27.ISecret"></a>

- *Extends:* [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource)

- *Implemented By:* [`cdk8s-plus-27.BasicAuthSecret`](#cdk8s-plus-27.BasicAuthSecret), [`cdk8s-plus-27.DockerConfigSecret`](#cdk8s-plus-27.DockerConfigSecret), [`cdk8s-plus-27.Secret`](#cdk8s-plus-27.Secret), [`cdk8s-plus-27.ServiceAccountTokenSecret`](#cdk8s-plus-27.ServiceAccountTokenSecret), [`cdk8s-plus-27.SshAuthSecret`](#cdk8s-plus-27.SshAuthSecret), [`cdk8s-plus-27.TlsSecret`](#cdk8s-plus-27.TlsSecret), [`cdk8s-plus-27.ISecret`](#cdk8s-plus-27.ISecret)

#### Methods <a name="Methods"></a>

##### `envValue` <a name="cdk8s-plus-27.ISecret.envValue"></a>

```typescript
public envValue(key: string, options?: EnvValueFromSecretOptions)
```

###### `key`<sup>Required</sup> <a name="cdk8s-plus-27.ISecret.parameter.key"></a>

- *Type:* `string`

Secret's key.

---

###### `options`<sup>Optional</sup> <a name="cdk8s-plus-27.ISecret.parameter.options"></a>

- *Type:* [`cdk8s-plus-27.EnvValueFromSecretOptions`](#cdk8s-plus-27.EnvValueFromSecretOptions)

Additional EnvValue options.

---

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.ISecret.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.ISecret.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.ISecret.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="cdk8s-plus-27.ISecret.property.resourceName"></a>

```typescript
public readonly resourceName: string;
```

- *Type:* `string`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="cdk8s-plus-27.ISecret.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.ISecret.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.ISecret.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The Kubernetes name of this resource.

---

### IServiceAccount <a name="cdk8s-plus-27.IServiceAccount"></a>

- *Extends:* [`cdk8s-plus-27.IResource`](#cdk8s-plus-27.IResource), [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

- *Implemented By:* [`cdk8s-plus-27.ServiceAccount`](#cdk8s-plus-27.ServiceAccount), [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount)


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.IServiceAccount.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `apiGroup`<sup>Required</sup> <a name="cdk8s-plus-27.IServiceAccount.property.apiGroup"></a>

```typescript
public readonly apiGroup: string;
```

- *Type:* `string`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resourceType`<sup>Required</sup> <a name="cdk8s-plus-27.IServiceAccount.property.resourceType"></a>

```typescript
public readonly resourceType: string;
```

- *Type:* `string`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resourceName`<sup>Optional</sup> <a name="cdk8s-plus-27.IServiceAccount.property.resourceName"></a>

```typescript
public readonly resourceName: string;
```

- *Type:* `string`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `apiVersion`<sup>Required</sup> <a name="cdk8s-plus-27.IServiceAccount.property.apiVersion"></a>

```typescript
public readonly apiVersion: string;
```

- *Type:* `string`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s-plus-27.IServiceAccount.property.kind"></a>

```typescript
public readonly kind: string;
```

- *Type:* `string`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s-plus-27.IServiceAccount.property.name"></a>

```typescript
public readonly name: string;
```

- *Type:* `string`

The Kubernetes name of this resource.

---

### IStorage <a name="cdk8s-plus-27.IStorage"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct)

- *Implemented By:* [`cdk8s-plus-27.AwsElasticBlockStorePersistentVolume`](#cdk8s-plus-27.AwsElasticBlockStorePersistentVolume), [`cdk8s-plus-27.AzureDiskPersistentVolume`](#cdk8s-plus-27.AzureDiskPersistentVolume), [`cdk8s-plus-27.GCEPersistentDiskPersistentVolume`](#cdk8s-plus-27.GCEPersistentDiskPersistentVolume), [`cdk8s-plus-27.PersistentVolume`](#cdk8s-plus-27.PersistentVolume), [`cdk8s-plus-27.Volume`](#cdk8s-plus-27.Volume), [`cdk8s-plus-27.IStorage`](#cdk8s-plus-27.IStorage)

Represents a piece of storage in the cluster.

#### Methods <a name="Methods"></a>

##### `asVolume` <a name="cdk8s-plus-27.IStorage.asVolume"></a>

```typescript
public asVolume()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.IStorage.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

### ISubject <a name="cdk8s-plus-27.ISubject"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct)

- *Implemented By:* [`cdk8s-plus-27.AbstractPod`](#cdk8s-plus-27.AbstractPod), [`cdk8s-plus-27.CronJob`](#cdk8s-plus-27.CronJob), [`cdk8s-plus-27.DaemonSet`](#cdk8s-plus-27.DaemonSet), [`cdk8s-plus-27.Deployment`](#cdk8s-plus-27.Deployment), [`cdk8s-plus-27.Group`](#cdk8s-plus-27.Group), [`cdk8s-plus-27.Job`](#cdk8s-plus-27.Job), [`cdk8s-plus-27.Pod`](#cdk8s-plus-27.Pod), [`cdk8s-plus-27.ServiceAccount`](#cdk8s-plus-27.ServiceAccount), [`cdk8s-plus-27.StatefulSet`](#cdk8s-plus-27.StatefulSet), [`cdk8s-plus-27.User`](#cdk8s-plus-27.User), [`cdk8s-plus-27.Workload`](#cdk8s-plus-27.Workload), [`cdk8s-plus-27.IServiceAccount`](#cdk8s-plus-27.IServiceAccount), [`cdk8s-plus-27.ISubject`](#cdk8s-plus-27.ISubject)

Represents an object that can be used as a role binding subject.

#### Methods <a name="Methods"></a>

##### `toSubjectConfiguration` <a name="cdk8s-plus-27.ISubject.toSubjectConfiguration"></a>

```typescript
public toSubjectConfiguration()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s-plus-27.ISubject.property.node"></a>

```typescript
public readonly node: Node;
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

## Enums <a name="Enums"></a>

### AzureDiskPersistentVolumeCachingMode <a name="AzureDiskPersistentVolumeCachingMode"></a>

Azure disk caching modes.

#### `NONE` <a name="cdk8s-plus-27.AzureDiskPersistentVolumeCachingMode.NONE"></a>

None.

---


#### `READ_ONLY` <a name="cdk8s-plus-27.AzureDiskPersistentVolumeCachingMode.READ_ONLY"></a>

ReadOnly.

---


#### `READ_WRITE` <a name="cdk8s-plus-27.AzureDiskPersistentVolumeCachingMode.READ_WRITE"></a>

ReadWrite.

---


### AzureDiskPersistentVolumeKind <a name="AzureDiskPersistentVolumeKind"></a>

Azure Disk kinds.

#### `SHARED` <a name="cdk8s-plus-27.AzureDiskPersistentVolumeKind.SHARED"></a>

Multiple blob disks per storage account.

---


#### `DEDICATED` <a name="cdk8s-plus-27.AzureDiskPersistentVolumeKind.DEDICATED"></a>

Single blob disk per storage account.

---


#### `MANAGED` <a name="cdk8s-plus-27.AzureDiskPersistentVolumeKind.MANAGED"></a>

Azure managed data disk.

---


### ConcurrencyPolicy <a name="ConcurrencyPolicy"></a>

Concurrency policy for CronJobs.

#### `ALLOW` <a name="cdk8s-plus-27.ConcurrencyPolicy.ALLOW"></a>

This policy allows to run job concurrently.

---


#### `FORBID` <a name="cdk8s-plus-27.ConcurrencyPolicy.FORBID"></a>

This policy does not allow to run job concurrently.

It does not let a new job to be scheduled if the previous one is not finished yet.

---


#### `REPLACE` <a name="cdk8s-plus-27.ConcurrencyPolicy.REPLACE"></a>

This policy replaces the currently running job if a new job is being scheduled.

---


### ConnectionScheme <a name="ConnectionScheme"></a>

#### `HTTP` <a name="cdk8s-plus-27.ConnectionScheme.HTTP"></a>

Use HTTP request for connecting to host.

---


#### `HTTPS` <a name="cdk8s-plus-27.ConnectionScheme.HTTPS"></a>

Use HTTPS request for connecting to host.

---


### DnsPolicy <a name="DnsPolicy"></a>

Pod DNS policies.

#### `CLUSTER_FIRST` <a name="cdk8s-plus-27.DnsPolicy.CLUSTER_FIRST"></a>

Any DNS query that does not match the configured cluster domain suffix, such as "www.kubernetes.io", is forwarded to the upstream nameserver inherited from the node. Cluster administrators may have extra stub-domain and upstream DNS servers configured.

---


#### `CLUSTER_FIRST_WITH_HOST_NET` <a name="cdk8s-plus-27.DnsPolicy.CLUSTER_FIRST_WITH_HOST_NET"></a>

For Pods running with hostNetwork, you should explicitly set its DNS policy "ClusterFirstWithHostNet".

---


#### `DEFAULT` <a name="cdk8s-plus-27.DnsPolicy.DEFAULT"></a>

The Pod inherits the name resolution configuration from the node that the pods run on.

---


#### `NONE` <a name="cdk8s-plus-27.DnsPolicy.NONE"></a>

It allows a Pod to ignore DNS settings from the Kubernetes environment.

All DNS settings are supposed to be provided using the dnsConfig
field in the Pod Spec.

---


### EmptyDirMedium <a name="EmptyDirMedium"></a>

The medium on which to store the volume.

#### `DEFAULT` <a name="cdk8s-plus-27.EmptyDirMedium.DEFAULT"></a>

The default volume of the backing node.

---


#### `MEMORY` <a name="cdk8s-plus-27.EmptyDirMedium.MEMORY"></a>

Mount a tmpfs (RAM-backed filesystem) for you instead.

While tmpfs is very
fast, be aware that unlike disks, tmpfs is cleared on node reboot and any
files you write will count against your Container's memory limit.

---


### EnvFieldPaths <a name="EnvFieldPaths"></a>

#### `POD_NAME` <a name="cdk8s-plus-27.EnvFieldPaths.POD_NAME"></a>

The name of the pod.

---


#### `POD_NAMESPACE` <a name="cdk8s-plus-27.EnvFieldPaths.POD_NAMESPACE"></a>

The namespace of the pod.

---


#### `POD_UID` <a name="cdk8s-plus-27.EnvFieldPaths.POD_UID"></a>

The uid of the pod.

---


#### `POD_LABEL` <a name="cdk8s-plus-27.EnvFieldPaths.POD_LABEL"></a>

The labels of the pod.

---


#### `POD_ANNOTATION` <a name="cdk8s-plus-27.EnvFieldPaths.POD_ANNOTATION"></a>

The annotations of the pod.

---


#### `POD_IP` <a name="cdk8s-plus-27.EnvFieldPaths.POD_IP"></a>

The ipAddress of the pod.

---


#### `SERVICE_ACCOUNT_NAME` <a name="cdk8s-plus-27.EnvFieldPaths.SERVICE_ACCOUNT_NAME"></a>

The service account name of the pod.

---


#### `NODE_NAME` <a name="cdk8s-plus-27.EnvFieldPaths.NODE_NAME"></a>

The name of the node.

---


#### `NODE_IP` <a name="cdk8s-plus-27.EnvFieldPaths.NODE_IP"></a>

The ipAddress of the node.

---


#### `POD_IPS` <a name="cdk8s-plus-27.EnvFieldPaths.POD_IPS"></a>

The ipAddresess of the pod.

---


### FsGroupChangePolicy <a name="FsGroupChangePolicy"></a>

#### `ON_ROOT_MISMATCH` <a name="cdk8s-plus-27.FsGroupChangePolicy.ON_ROOT_MISMATCH"></a>

Only change permissions and ownership if permission and ownership of root directory does not match with expected permissions of the volume.

This could help shorten the time it takes to change ownership and permission of a volume

---


#### `ALWAYS` <a name="cdk8s-plus-27.FsGroupChangePolicy.ALWAYS"></a>

Always change permission and ownership of the volume when volume is mounted.

---


### HostPathVolumeType <a name="HostPathVolumeType"></a>

Host path types.

#### `DEFAULT` <a name="cdk8s-plus-27.HostPathVolumeType.DEFAULT"></a>

Empty string (default) is for backward compatibility, which means that no checks will be performed before mounting the hostPath volume.

---


#### `DIRECTORY_OR_CREATE` <a name="cdk8s-plus-27.HostPathVolumeType.DIRECTORY_OR_CREATE"></a>

If nothing exists at the given path, an empty directory will be created there as needed with permission set to 0755, having the same group and ownership with Kubelet.

---


#### `DIRECTORY` <a name="cdk8s-plus-27.HostPathVolumeType.DIRECTORY"></a>

A directory must exist at the given path.

---


#### `FILE_OR_CREATE` <a name="cdk8s-plus-27.HostPathVolumeType.FILE_OR_CREATE"></a>

If nothing exists at the given path, an empty file will be created there as needed with permission set to 0644, having the same group and ownership with Kubelet.

---


#### `FILE` <a name="cdk8s-plus-27.HostPathVolumeType.FILE"></a>

A file must exist at the given path.

---


#### `SOCKET` <a name="cdk8s-plus-27.HostPathVolumeType.SOCKET"></a>

A UNIX socket must exist at the given path.

---


#### `CHAR_DEVICE` <a name="cdk8s-plus-27.HostPathVolumeType.CHAR_DEVICE"></a>

A character device must exist at the given path.

---


#### `BLOCK_DEVICE` <a name="cdk8s-plus-27.HostPathVolumeType.BLOCK_DEVICE"></a>

A block device must exist at the given path.

---


### HttpIngressPathType <a name="HttpIngressPathType"></a>

Specify how the path is matched against request paths.

> https://kubernetes.io/docs/concepts/services-networking/ingress/#path-types

#### `PREFIX` <a name="cdk8s-plus-27.HttpIngressPathType.PREFIX"></a>

Matches the URL path exactly.

---


#### `EXACT` <a name="cdk8s-plus-27.HttpIngressPathType.EXACT"></a>

Matches based on a URL path prefix split by '/'.

---


#### `IMPLEMENTATION_SPECIFIC` <a name="cdk8s-plus-27.HttpIngressPathType.IMPLEMENTATION_SPECIFIC"></a>

Matching is specified by the underlying IngressClass.

---


### ImagePullPolicy <a name="ImagePullPolicy"></a>

#### `ALWAYS` <a name="cdk8s-plus-27.ImagePullPolicy.ALWAYS"></a>

Every time the kubelet launches a container, the kubelet queries the container image registry to resolve the name to an image digest.

If the kubelet has a container image with that exact
digest cached locally, the kubelet uses its cached image; otherwise, the kubelet downloads
(pulls) the image with the resolved digest, and uses that image to launch the container.

Default is Always if ImagePullPolicy is omitted and either the image tag is :latest or
the image tag is omitted.

---


#### `IF_NOT_PRESENT` <a name="cdk8s-plus-27.ImagePullPolicy.IF_NOT_PRESENT"></a>

The image is pulled only if it is not already present locally.

Default is IfNotPresent if ImagePullPolicy is omitted and the image tag is present but
not :latest

---


#### `NEVER` <a name="cdk8s-plus-27.ImagePullPolicy.NEVER"></a>

The image is assumed to exist locally.

No attempt is made to pull the image.

---


### MountPropagation <a name="MountPropagation"></a>

#### `NONE` <a name="cdk8s-plus-27.MountPropagation.NONE"></a>

This volume mount will not receive any subsequent mounts that are mounted to this volume or any of its subdirectories by the host.

In similar
fashion, no mounts created by the Container will be visible on the host.

This is the default mode.

This mode is equal to `private` mount propagation as described in the Linux
kernel documentation

---


#### `HOST_TO_CONTAINER` <a name="cdk8s-plus-27.MountPropagation.HOST_TO_CONTAINER"></a>

This volume mount will receive all subsequent mounts that are mounted to this volume or any of its subdirectories.

In other words, if the host mounts anything inside the volume mount, the
Container will see it mounted there.

Similarly, if any Pod with Bidirectional mount propagation to the same
volume mounts anything there, the Container with HostToContainer mount
propagation will see it.

This mode is equal to `rslave` mount propagation as described in the Linux
kernel documentation

---


#### `BIDIRECTIONAL` <a name="cdk8s-plus-27.MountPropagation.BIDIRECTIONAL"></a>

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

#### `DENY` <a name="cdk8s-plus-27.NetworkPolicyTrafficDefault.DENY"></a>

The policy denies all traffic.

Since rules are additive, additional rules or policies can allow
specific traffic.

---


#### `ALLOW` <a name="cdk8s-plus-27.NetworkPolicyTrafficDefault.ALLOW"></a>

The policy allows all traffic (either ingress or egress).

Since rules are additive, no additional rule or policies can
subsequently deny the traffic.

---


### NetworkProtocol <a name="NetworkProtocol"></a>

Network protocols.

#### `TCP` <a name="cdk8s-plus-27.NetworkProtocol.TCP"></a>

TCP.

---


#### `UDP` <a name="cdk8s-plus-27.NetworkProtocol.UDP"></a>

UDP.

---


#### `SCTP` <a name="cdk8s-plus-27.NetworkProtocol.SCTP"></a>

SCTP.

---


### PersistentVolumeAccessMode <a name="PersistentVolumeAccessMode"></a>

Access Modes.

#### `READ_WRITE_ONCE` <a name="cdk8s-plus-27.PersistentVolumeAccessMode.READ_WRITE_ONCE"></a>

The volume can be mounted as read-write by a single node.

ReadWriteOnce access mode still can allow multiple pods to access
the volume when the pods are running on the same node.

---


#### `READ_ONLY_MANY` <a name="cdk8s-plus-27.PersistentVolumeAccessMode.READ_ONLY_MANY"></a>

The volume can be mounted as read-only by many nodes.

---


#### `READ_WRITE_MANY` <a name="cdk8s-plus-27.PersistentVolumeAccessMode.READ_WRITE_MANY"></a>

The volume can be mounted as read-write by many nodes.

---


#### `READ_WRITE_ONCE_POD` <a name="cdk8s-plus-27.PersistentVolumeAccessMode.READ_WRITE_ONCE_POD"></a>

The volume can be mounted as read-write by a single Pod.

Use ReadWriteOncePod access mode if you want to ensure that
only one pod across whole cluster can read that PVC or write to it.
This is only supported for CSI volumes and Kubernetes version 1.22+.

---


### PersistentVolumeMode <a name="PersistentVolumeMode"></a>

Volume Modes.

#### `FILE_SYSTEM` <a name="cdk8s-plus-27.PersistentVolumeMode.FILE_SYSTEM"></a>

Volume is ounted into Pods into a directory.

If the volume is backed by a block device and the device is empty,
Kubernetes creates a filesystem on the device before mounting it
for the first time.

---


#### `BLOCK` <a name="cdk8s-plus-27.PersistentVolumeMode.BLOCK"></a>

Use a volume as a raw block device.

Such volume is presented into a Pod as a block device,
without any filesystem on it. This mode is useful to provide a Pod the fastest possible way
to access a volume, without any filesystem layer between the Pod
and the volume. On the other hand, the application running in
the Pod must know how to handle a raw block device

---


### PersistentVolumeReclaimPolicy <a name="PersistentVolumeReclaimPolicy"></a>

Reclaim Policies.

#### `RETAIN` <a name="cdk8s-plus-27.PersistentVolumeReclaimPolicy.RETAIN"></a>

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


#### `DELETE` <a name="cdk8s-plus-27.PersistentVolumeReclaimPolicy.DELETE"></a>

For volume plugins that support the Delete reclaim policy, deletion removes both the PersistentVolume object from Kubernetes, as well as the associated storage asset in the external infrastructure, such as an AWS EBS, GCE PD, Azure Disk, or Cinder volume.

Volumes that were dynamically provisioned inherit the reclaim policy of their StorageClass, which defaults to Delete.
The administrator should configure the StorageClass according to users' expectations; otherwise,
the PV must be edited or patched after it is created

---


### PodConnectionsIsolation <a name="PodConnectionsIsolation"></a>

Isolation determines which policies are created when allowing connections from a a pod / workload to peers.

#### `POD` <a name="cdk8s-plus-27.PodConnectionsIsolation.POD"></a>

Only creates network policies that select the pod.

---


#### `PEER` <a name="cdk8s-plus-27.PodConnectionsIsolation.PEER"></a>

Only creates network policies that select the peer.

---


### PodManagementPolicy <a name="PodManagementPolicy"></a>

Controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down.

The default policy is `OrderedReady`, where pods are created in increasing order
(pod-0, then pod-1, etc) and the controller will wait until each pod is ready before
continuing. When scaling down, the pods are removed in the opposite order.

The alternative policy is `Parallel` which will create pods in parallel to match the
desired scale without waiting, and on scale down will delete all pods at once.

#### `ORDERED_READY` <a name="cdk8s-plus-27.PodManagementPolicy.ORDERED_READY"></a>

---


#### `PARALLEL` <a name="cdk8s-plus-27.PodManagementPolicy.PARALLEL"></a>

---


### Protocol <a name="Protocol"></a>

Network protocols.

#### `TCP` <a name="cdk8s-plus-27.Protocol.TCP"></a>

TCP.

---


#### `UDP` <a name="cdk8s-plus-27.Protocol.UDP"></a>

UDP.

---


#### `SCTP` <a name="cdk8s-plus-27.Protocol.SCTP"></a>

SCTP.

---


### ResourceFieldPaths <a name="ResourceFieldPaths"></a>

#### `CPU_LIMIT` <a name="cdk8s-plus-27.ResourceFieldPaths.CPU_LIMIT"></a>

CPU limit of the container.

---


#### `MEMORY_LIMIT` <a name="cdk8s-plus-27.ResourceFieldPaths.MEMORY_LIMIT"></a>

Memory limit of the container.

---


#### `CPU_REQUEST` <a name="cdk8s-plus-27.ResourceFieldPaths.CPU_REQUEST"></a>

CPU request of the container.

---


#### `MEMORY_REQUEST` <a name="cdk8s-plus-27.ResourceFieldPaths.MEMORY_REQUEST"></a>

Memory request of the container.

---


#### `STORAGE_LIMIT` <a name="cdk8s-plus-27.ResourceFieldPaths.STORAGE_LIMIT"></a>

Ephemeral storage limit of the container.

---


#### `STORAGE_REQUEST` <a name="cdk8s-plus-27.ResourceFieldPaths.STORAGE_REQUEST"></a>

Ephemeral storage request of the container.

---


### RestartPolicy <a name="RestartPolicy"></a>

Restart policy for all containers within the pod.

#### `ALWAYS` <a name="cdk8s-plus-27.RestartPolicy.ALWAYS"></a>

Always restart the pod after it exits.

---


#### `ON_FAILURE` <a name="cdk8s-plus-27.RestartPolicy.ON_FAILURE"></a>

Only restart if the pod exits with a non-zero exit code.

---


#### `NEVER` <a name="cdk8s-plus-27.RestartPolicy.NEVER"></a>

Never restart the pod.

---


### ScalingStrategy <a name="ScalingStrategy"></a>

#### `MAX_CHANGE` <a name="cdk8s-plus-27.ScalingStrategy.MAX_CHANGE"></a>

Use the policy that provisions the most changes.

---


#### `MIN_CHANGE` <a name="cdk8s-plus-27.ScalingStrategy.MIN_CHANGE"></a>

Use the policy that provisions the least amount of changes.

---


#### ~~`DISABLED`~~ <a name="cdk8s-plus-27.ScalingStrategy.DISABLED"></a>

- *Deprecated:* - Omit the ScalingRule instead

Disables scaling in this direction.

---


### ServiceType <a name="ServiceType"></a>

For some parts of your application (for example, frontends) you may want to expose a Service onto an external IP address, that's outside of your cluster.

Kubernetes ServiceTypes allow you to specify what kind of Service you want.
The default is ClusterIP.

#### `CLUSTER_IP` <a name="cdk8s-plus-27.ServiceType.CLUSTER_IP"></a>

Exposes the Service on a cluster-internal IP.

Choosing this value makes the Service only reachable from within the cluster.
This is the default ServiceType

---


#### `NODE_PORT` <a name="cdk8s-plus-27.ServiceType.NODE_PORT"></a>

Exposes the Service on each Node's IP at a static port (the NodePort).

A ClusterIP Service, to which the NodePort Service routes, is automatically created.
You'll be able to contact the NodePort Service, from outside the cluster,
by requesting <NodeIP>:<NodePort>.

---


#### `LOAD_BALANCER` <a name="cdk8s-plus-27.ServiceType.LOAD_BALANCER"></a>

Exposes the Service externally using a cloud provider's load balancer.

NodePort and ClusterIP Services, to which the external load balancer routes,
are automatically created.

---


#### `EXTERNAL_NAME` <a name="cdk8s-plus-27.ServiceType.EXTERNAL_NAME"></a>

Maps the Service to the contents of the externalName field (e.g. foo.bar.example.com), by returning a CNAME record with its value. No proxying of any kind is set up.

> Note: You need either kube-dns version 1.7 or CoreDNS version 0.0.8 or higher to use the ExternalName type.

---


### TaintEffect <a name="TaintEffect"></a>

Taint effects.

#### `NO_SCHEDULE` <a name="cdk8s-plus-27.TaintEffect.NO_SCHEDULE"></a>

This means that no pod will be able to schedule onto the node unless it has a matching toleration.

---


#### `PREFER_NO_SCHEDULE` <a name="cdk8s-plus-27.TaintEffect.PREFER_NO_SCHEDULE"></a>

This is a "preference" or "soft" version of `NO_SCHEDULE` -- the system will try to avoid placing a pod that does not tolerate the taint on the node, but it is not required.

---


#### `NO_EXECUTE` <a name="cdk8s-plus-27.TaintEffect.NO_EXECUTE"></a>

This affects pods that are already running on the node as follows:.

Pods that do not tolerate the taint are evicted immediately.
- Pods that tolerate the taint without specifying `duration` remain bound forever.
- Pods that tolerate the taint with a specified `duration` remain bound for
   the specified amount of time.

---

