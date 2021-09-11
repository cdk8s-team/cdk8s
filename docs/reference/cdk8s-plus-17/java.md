# cdk8s-plus-17 (Java) <a name="API Reference"></a>

## Constructs <a name="Constructs"></a>

### ConfigMap <a name="org.cdk8s.plus17.ConfigMap"></a>

- *Implements:* [`org.cdk8s.plus17.IConfigMap`](#org.cdk8s.plus17.IConfigMap)

ConfigMap holds configuration data for pods to consume.

#### Initializers <a name="org.cdk8s.plus17.ConfigMap.Initializer"></a>

```java
import org.cdk8s.plus17.ConfigMap;

ConfigMap.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .binaryData(java.util.Map<java.lang.String, java.lang.String>)
//  .data(java.util.Map<java.lang.String, java.lang.String>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMapProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `binaryData`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMapProps.parameter.binaryData"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

BinaryData contains the binary data.

Each key must consist of alphanumeric characters, '-', '_' or '.'.
BinaryData can contain byte sequences that are not in the UTF-8 range. The
keys stored in BinaryData must not overlap with the ones in the Data field,
this is enforced during validation process. Using this field will require
1.10+ apiserver and kubelet.

You can also add binary data using `configMap.addBinaryData()`.

---

##### `data`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMapProps.parameter.data"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

Data contains the configuration data.

Each key must consist of alphanumeric characters, '-', '_' or '.'. Values
with non-UTF-8 byte sequences must use the BinaryData field. The keys
stored in Data must not overlap with the keys in the BinaryData field, this
is enforced during validation process.

You can also add data using `configMap.addData()`.

---

#### Methods <a name="Methods"></a>

##### `addBinaryData` <a name="org.cdk8s.plus17.ConfigMap.addBinaryData"></a>

```java
public addBinaryData(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.key"></a>

- *Type:* `java.lang.String`

The key.

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.value"></a>

- *Type:* `java.lang.String`

The value.

---

##### `addData` <a name="org.cdk8s.plus17.ConfigMap.addData"></a>

```java
public addData(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.key"></a>

- *Type:* `java.lang.String`

The key.

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.value"></a>

- *Type:* `java.lang.String`

The value.

---

##### `addDirectory` <a name="org.cdk8s.plus17.ConfigMap.addDirectory"></a>

```java
public addDirectory(java.lang.String localDir)
public addDirectory(java.lang.String localDir, AddDirectoryOptions options)
```

###### `localDir`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.localDir"></a>

- *Type:* `java.lang.String`

A path to a local directory.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.AddDirectoryOptions`](#org.cdk8s.plus17.AddDirectoryOptions)

Options.

---

##### `addFile` <a name="org.cdk8s.plus17.ConfigMap.addFile"></a>

```java
public addFile(java.lang.String localFile)
public addFile(java.lang.String localFile, java.lang.String key)
```

###### `localFile`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.localFile"></a>

- *Type:* `java.lang.String`

The path to the local file.

---

###### `key`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.key"></a>

- *Type:* `java.lang.String`

The ConfigMap key (default to the file name).

---

#### Static Functions <a name="Static Functions"></a>

##### `fromConfigMapName` <a name="org.cdk8s.plus17.ConfigMap.fromConfigMapName"></a>

```java
import org.cdk8s.plus17.ConfigMap;

ConfigMap.fromConfigMapName(java.lang.String name)
```

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.parameter.name"></a>

- *Type:* `java.lang.String`

The name of the config map to import.

---

#### Properties <a name="Properties"></a>

##### `binaryData`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.property.binaryData"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

The binary data associated with this config map.

Returns a copy. To add data records, use `addBinaryData()` or `addData()`.

---

##### `data`<sup>Required</sup> <a name="org.cdk8s.plus17.ConfigMap.property.data"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

The data associated with this config map.

Returns an copy. To add data records, use `addData()` or `addBinaryData()`.

---


### Deployment <a name="org.cdk8s.plus17.Deployment"></a>

- *Implements:* [`org.cdk8s.plus17.IPodTemplate`](#org.cdk8s.plus17.IPodTemplate)

A Deployment provides declarative updates for Pods and ReplicaSets.

You describe a desired state in a Deployment, and the Deployment Controller changes the actual
state to the desired state at a controlled rate. You can define Deployments to create new ReplicaSets, or to remove
existing Deployments and adopt all their resources with new Deployments.

> Note: Do not manage ReplicaSets owned by a Deployment. Consider opening an issue in the main Kubernetes repository if your use case is not covered below.

Use Case
---------

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

#### Initializers <a name="org.cdk8s.plus17.Deployment.Initializer"></a>

```java
import org.cdk8s.plus17.Deployment;

Deployment.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .defaultSelector(java.lang.Boolean)
//  .replicas(java.lang.Number)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.parameter.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `defaultSelector`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.parameter.defaultSelector"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod selector for this deployment.

If this is set to `false` you must define your selector through
`deployment.podMetadata.addLabel()` and `deployment.selectByLabel()`.

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.parameter.replicas"></a>

- *Type:* `java.lang.Number`
- *Default:* 1

Number of desired pods.

---

#### Methods <a name="Methods"></a>

##### `addContainer` <a name="org.cdk8s.plus17.Deployment.addContainer"></a>

```java
public addContainer(ContainerProps container)
```

###### `container`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.parameter.container"></a>

- *Type:* [`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)

---

##### `addVolume` <a name="org.cdk8s.plus17.Deployment.addVolume"></a>

```java
public addVolume(Volume volume)
```

###### `volume`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.parameter.volume"></a>

- *Type:* [`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)

---

##### `expose` <a name="org.cdk8s.plus17.Deployment.expose"></a>

```java
public expose(java.lang.Number port)
public expose(java.lang.Number port, ExposeOptions options)
```

###### `port`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.parameter.port"></a>

- *Type:* `java.lang.Number`

The port number the service will bind to.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.Deployment.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.ExposeOptions`](#org.cdk8s.plus17.ExposeOptions)

Options to determine details of the service and port exposed.

---

##### `selectByLabel` <a name="org.cdk8s.plus17.Deployment.selectByLabel"></a>

```java
public selectByLabel(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.parameter.key"></a>

- *Type:* `java.lang.String`

The label key.

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.parameter.value"></a>

- *Type:* `java.lang.String`

The label value.

---


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Container`](#org.cdk8s.plus17.Container)>

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `labelSelector`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.property.labelSelector"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

The labels this deployment will match against in order to select pods.

Returns a a copy. Use `selectByLabel()` to add labels.

---

##### `podMetadata`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.property.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadataDefinition`](#org.cdk8s.ApiObjectMetadataDefinition)

Provides read/write access to the underlying pod metadata of the resource.

---

##### `replicas`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.property.replicas"></a>

- *Type:* `java.lang.Number`

Number of desired pods.

---

##### `volumes`<sup>Required</sup> <a name="org.cdk8s.plus17.Deployment.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.Deployment.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.Deployment.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)

The service account used to run this pod.

---


### IngressV1Beta1 <a name="org.cdk8s.plus17.IngressV1Beta1"></a>

Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend.

An Ingress can be configured to give services
externally-reachable urls, load balance traffic, terminate SSL, offer name
based virtual hosting etc.

#### Initializers <a name="org.cdk8s.plus17.IngressV1Beta1.Initializer"></a>

```java
import org.cdk8s.plus17.IngressV1Beta1;

IngressV1Beta1.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .defaultBackend(IngressV1Beta1Backend)
//  .rules(java.util.List<IngressV1Beta1Rule>)
//  .tls(java.util.List<IngressV1Beta1Tls>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Props.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `defaultBackend`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Props.parameter.defaultBackend"></a>

- *Type:* [`org.cdk8s.plus17.IngressV1Beta1Backend`](#org.cdk8s.plus17.IngressV1Beta1Backend)

The default backend services requests that do not match any rule.

Using this option or the `addDefaultBackend()` method is equivalent to
adding a rule with both `path` and `host` undefined.

---

##### `rules`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Props.parameter.rules"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.IngressV1Beta1Rule`](#org.cdk8s.plus17.IngressV1Beta1Rule)>

Routing rules for this ingress.

Each rule must define an `IngressBackend` that will receive the requests
that match this rule. If both `host` and `path` are not specifiec, this
backend will be used as the default backend of the ingress.

You can also add rules later using `addRule()`, `addHostRule()`,
`addDefaultBackend()` and `addHostDefaultBackend()`.

---

##### `tls`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Props.parameter.tls"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.IngressV1Beta1Tls`](#org.cdk8s.plus17.IngressV1Beta1Tls)>

TLS settings for this ingress.

Using this option tells the ingress controller to expose a TLS endpoint.
Currently the Ingress only supports a single TLS port, 443. If multiple
members of this list specify different hosts, they will be multiplexed on
the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI.

---

#### Methods <a name="Methods"></a>

##### `addDefaultBackend` <a name="org.cdk8s.plus17.IngressV1Beta1.addDefaultBackend"></a>

```java
public addDefaultBackend(IngressV1Beta1Backend backend)
```

###### `backend`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.backend"></a>

- *Type:* [`org.cdk8s.plus17.IngressV1Beta1Backend`](#org.cdk8s.plus17.IngressV1Beta1Backend)

The backend to use for requests that do not match any rule.

---

##### `addHostDefaultBackend` <a name="org.cdk8s.plus17.IngressV1Beta1.addHostDefaultBackend"></a>

```java
public addHostDefaultBackend(java.lang.String host, IngressV1Beta1Backend backend)
```

###### `host`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.host"></a>

- *Type:* `java.lang.String`

The host name to match.

---

###### `backend`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.backend"></a>

- *Type:* [`org.cdk8s.plus17.IngressV1Beta1Backend`](#org.cdk8s.plus17.IngressV1Beta1Backend)

The backend to route to.

---

##### `addHostRule` <a name="org.cdk8s.plus17.IngressV1Beta1.addHostRule"></a>

```java
public addHostRule(java.lang.String host, java.lang.String path, IngressV1Beta1Backend backend)
```

###### `host`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.host"></a>

- *Type:* `java.lang.String`

The host name.

---

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.path"></a>

- *Type:* `java.lang.String`

The HTTP path.

---

###### `backend`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.backend"></a>

- *Type:* [`org.cdk8s.plus17.IngressV1Beta1Backend`](#org.cdk8s.plus17.IngressV1Beta1Backend)

The backend to route requests to.

---

##### `addRule` <a name="org.cdk8s.plus17.IngressV1Beta1.addRule"></a>

```java
public addRule(java.lang.String path, IngressV1Beta1Backend backend)
```

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.path"></a>

- *Type:* `java.lang.String`

The HTTP path.

---

###### `backend`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.backend"></a>

- *Type:* [`org.cdk8s.plus17.IngressV1Beta1Backend`](#org.cdk8s.plus17.IngressV1Beta1Backend)

The backend to route requests to.

---

##### `addRules` <a name="org.cdk8s.plus17.IngressV1Beta1.addRules"></a>

```java
public addRules(IngressV1Beta1Rule rules)
```

###### `rules`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.rules"></a>

- *Type:* [`org.cdk8s.plus17.IngressV1Beta1Rule`](#org.cdk8s.plus17.IngressV1Beta1Rule)

The rules to add.

---

##### `addTls` <a name="org.cdk8s.plus17.IngressV1Beta1.addTls"></a>

```java
public addTls(java.util.List<IngressV1Beta1Tls> tls)
```

###### `tls`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1.parameter.tls"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.IngressV1Beta1Tls`](#org.cdk8s.plus17.IngressV1Beta1Tls)>

---




### Job <a name="org.cdk8s.plus17.Job"></a>

- *Implements:* [`org.cdk8s.plus17.IPodTemplate`](#org.cdk8s.plus17.IPodTemplate)

A Job creates one or more Pods and ensures that a specified number of them successfully terminate.

As pods successfully complete,
the Job tracks the successful completions. When a specified number of successful completions is reached, the task (ie, Job) is complete.
Deleting a Job will clean up the Pods it created. A simple case is to create one Job object in order to reliably run one Pod to completion.
The Job object will start a new Pod if the first Pod fails or is deleted (for example due to a node hardware failure or a node reboot).
You can also use a Job to run multiple Pods in parallel.

#### Initializers <a name="org.cdk8s.plus17.Job.Initializer"></a>

```java
import org.cdk8s.plus17.Job;

Job.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .activeDeadline(Duration)
//  .backoffLimit(java.lang.Number)
//  .ttlAfterFinished(Duration)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus17.Job.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus17.Job.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.parameter.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `activeDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.parameter.activeDeadline"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoffLimit`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.parameter.backoffLimit"></a>

- *Type:* `java.lang.Number`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.parameter.ttlAfterFinished"></a>

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

#### Methods <a name="Methods"></a>

##### `addContainer` <a name="org.cdk8s.plus17.Job.addContainer"></a>

```java
public addContainer(ContainerProps container)
```

###### `container`<sup>Required</sup> <a name="org.cdk8s.plus17.Job.parameter.container"></a>

- *Type:* [`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)

---

##### `addVolume` <a name="org.cdk8s.plus17.Job.addVolume"></a>

```java
public addVolume(Volume volume)
```

###### `volume`<sup>Required</sup> <a name="org.cdk8s.plus17.Job.parameter.volume"></a>

- *Type:* [`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)

---


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="org.cdk8s.plus17.Job.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Container`](#org.cdk8s.plus17.Container)>

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `podMetadata`<sup>Required</sup> <a name="org.cdk8s.plus17.Job.property.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadataDefinition`](#org.cdk8s.ApiObjectMetadataDefinition)

Provides read/write access to the underlying pod metadata of the resource.

---

##### `volumes`<sup>Required</sup> <a name="org.cdk8s.plus17.Job.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `activeDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus17.Job.property.activeDeadline"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)

Duration before job is terminated.

If undefined, there is no deadline.

---

##### `backoffLimit`<sup>Optional</sup> <a name="org.cdk8s.plus17.Job.property.backoffLimit"></a>

- *Type:* `java.lang.Number`

Number of retries before marking failed.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.Job.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.Job.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)

The service account used to run this pod.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="org.cdk8s.plus17.Job.property.ttlAfterFinished"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)

TTL before the job is deleted after it is finished.

---


### Pod <a name="org.cdk8s.plus17.Pod"></a>

- *Implements:* [`org.cdk8s.plus17.IPodSpec`](#org.cdk8s.plus17.IPodSpec)

Pod is a collection of containers that can run on a host.

This resource is
created by clients and scheduled onto hosts.

#### Initializers <a name="org.cdk8s.plus17.Pod.Initializer"></a>

```java
import org.cdk8s.plus17.Pod;

Pod.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus17.Pod.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus17.Pod.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

#### Methods <a name="Methods"></a>

##### `addContainer` <a name="org.cdk8s.plus17.Pod.addContainer"></a>

```java
public addContainer(ContainerProps container)
```

###### `container`<sup>Required</sup> <a name="org.cdk8s.plus17.Pod.parameter.container"></a>

- *Type:* [`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)

---

##### `addVolume` <a name="org.cdk8s.plus17.Pod.addVolume"></a>

```java
public addVolume(Volume volume)
```

###### `volume`<sup>Required</sup> <a name="org.cdk8s.plus17.Pod.parameter.volume"></a>

- *Type:* [`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)

---


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="org.cdk8s.plus17.Pod.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Container`](#org.cdk8s.plus17.Container)>

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `volumes`<sup>Required</sup> <a name="org.cdk8s.plus17.Pod.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.Pod.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.Pod.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)

The service account used to run this pod.

---


### Resource <a name="org.cdk8s.plus17.Resource"></a>

- *Implements:* [`org.cdk8s.plus17.IResource`](#org.cdk8s.plus17.IResource)

Base class for all Kubernetes objects in stdk8s.

Represents a single
resource.

#### Initializers <a name="org.cdk8s.plus17.Resource.Initializer"></a>

```java
import org.cdk8s.plus17.Resource;

Resource.Builder.create(Construct scope, java.lang.String id)
//  .nodeFactory(INodeFactory)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus17.Resource.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

The scope in which to define this construct.

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus17.Resource.parameter.id"></a>

- *Type:* `java.lang.String`

The scoped construct ID.

Must be unique amongst siblings. If
the ID includes a path separator (`/`), then it will be replaced by double
dash `--`.

---

##### `nodeFactory`<sup>Optional</sup> <a name="software.constructs.ConstructOptions.parameter.nodeFactory"></a>

- *Type:* [`software.constructs.INodeFactory`](#software.constructs.INodeFactory)
- *Default:* the default `Node` is associated

A factory for attaching `Node`s to the construct.

---



#### Properties <a name="Properties"></a>

##### `metadata`<sup>Required</sup> <a name="org.cdk8s.plus17.Resource.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadataDefinition`](#org.cdk8s.ApiObjectMetadataDefinition)

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.Resource.property.name"></a>

- *Type:* `java.lang.String`

The name of this API object.

---


### Secret <a name="org.cdk8s.plus17.Secret"></a>

- *Implements:* [`org.cdk8s.plus17.ISecret`](#org.cdk8s.plus17.ISecret)

Kubernetes Secrets let you store and manage sensitive information, such as passwords, OAuth tokens, and ssh keys.

Storing confidential information in a
Secret is safer and more flexible than putting it verbatim in a Pod
definition or in a container image.

> https://kubernetes.io/docs/concepts/configuration/secret

#### Initializers <a name="org.cdk8s.plus17.Secret.Initializer"></a>

```java
import org.cdk8s.plus17.Secret;

Secret.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .stringData(java.util.Map<java.lang.String, java.lang.String>)
//  .type(java.lang.String)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus17.Secret.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus17.Secret.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.SecretProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `stringData`<sup>Optional</sup> <a name="org.cdk8s.plus17.SecretProps.parameter.stringData"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

stringData allows specifying non-binary secret data in string form.

It is
provided as a write-only convenience method. All keys and values are merged
into the data field on write, overwriting any existing values. It is never
output when reading from the API.

---

##### `type`<sup>Optional</sup> <a name="org.cdk8s.plus17.SecretProps.parameter.type"></a>

- *Type:* `java.lang.String`
- *Default:* undefined - Don't set a type.

Optional type associated with the secret.

Used to facilitate programmatic
handling of secret data by various controllers.

---

#### Methods <a name="Methods"></a>

##### `addStringData` <a name="org.cdk8s.plus17.Secret.addStringData"></a>

```java
public addStringData(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus17.Secret.parameter.key"></a>

- *Type:* `java.lang.String`

Key.

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus17.Secret.parameter.value"></a>

- *Type:* `java.lang.String`

Value.

---

##### `getStringData` <a name="org.cdk8s.plus17.Secret.getStringData"></a>

```java
public getStringData(java.lang.String key)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus17.Secret.parameter.key"></a>

- *Type:* `java.lang.String`

Key.

---

#### Static Functions <a name="Static Functions"></a>

##### `fromSecretName` <a name="org.cdk8s.plus17.Secret.fromSecretName"></a>

```java
import org.cdk8s.plus17.Secret;

Secret.fromSecretName(java.lang.String name)
```

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.Secret.parameter.name"></a>

- *Type:* `java.lang.String`

The name of the secret to reference.

---



### Service <a name="org.cdk8s.plus17.Service"></a>

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

#### Initializers <a name="org.cdk8s.plus17.Service.Initializer"></a>

```java
import org.cdk8s.plus17.Service;

Service.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .clusterIP(java.lang.String)
//  .externalIPs(java.util.List<java.lang.String>)
//  .externalName(java.lang.String)
//  .loadBalancerSourceRanges(java.util.List<java.lang.String>)
//  .ports(java.util.List<ServicePort>)
//  .type(ServiceType)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus17.Service.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus17.Service.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `clusterIP`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.parameter.clusterIP"></a>

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

##### `externalIPs`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.parameter.externalIPs"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No external IPs.

A list of IP addresses for which nodes in the cluster will also accept traffic for this service.

These IPs are not managed by Kubernetes. The user
is responsible for ensuring that traffic arrives at a node with this IP. A
common example is external load-balancers that are not part of the
Kubernetes system.

---

##### `externalName`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.parameter.externalName"></a>

- *Type:* `java.lang.String`
- *Default:* No external name.

The externalName to be used when ServiceType.EXTERNAL_NAME is set.

---

##### `loadBalancerSourceRanges`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.parameter.loadBalancerSourceRanges"></a>

- *Type:* java.util.List<`java.lang.String`>

A list of CIDR IP addresses, if specified and supported by the platform, will restrict traffic through the cloud-provider load-balancer to the specified client IPs.

More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.parameter.ports"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ServicePort`](#org.cdk8s.plus17.ServicePort)>

The port exposed by this service.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

---

##### `type`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.parameter.type"></a>

- *Type:* [`org.cdk8s.plus17.ServiceType`](#org.cdk8s.plus17.ServiceType)
- *Default:* ServiceType.ClusterIP

Determines how the Service is exposed.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

---

#### Methods <a name="Methods"></a>

##### `addDeployment` <a name="org.cdk8s.plus17.Service.addDeployment"></a>

```java
public addDeployment(Deployment deployment, java.lang.Number port)
public addDeployment(Deployment deployment, java.lang.Number port, ServicePortOptions options)
```

###### `deployment`<sup>Required</sup> <a name="org.cdk8s.plus17.Service.parameter.deployment"></a>

- *Type:* [`org.cdk8s.plus17.Deployment`](#org.cdk8s.plus17.Deployment)

The deployment to expose.

---

###### `port`<sup>Required</sup> <a name="org.cdk8s.plus17.Service.parameter.port"></a>

- *Type:* `java.lang.Number`

The external port.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.Service.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.ServicePortOptions`](#org.cdk8s.plus17.ServicePortOptions)

Optional settings for the port.

---

##### `addSelector` <a name="org.cdk8s.plus17.Service.addSelector"></a>

```java
public addSelector(java.lang.String label, java.lang.String value)
```

###### `label`<sup>Required</sup> <a name="org.cdk8s.plus17.Service.parameter.label"></a>

- *Type:* `java.lang.String`

The label key.

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus17.Service.parameter.value"></a>

- *Type:* `java.lang.String`

The label value.

---

##### `serve` <a name="org.cdk8s.plus17.Service.serve"></a>

```java
public serve(java.lang.Number port)
public serve(java.lang.Number port, ServicePortOptions options)
```

###### `port`<sup>Required</sup> <a name="org.cdk8s.plus17.Service.parameter.port"></a>

- *Type:* `java.lang.Number`

The port definition.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.Service.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.ServicePortOptions`](#org.cdk8s.plus17.ServicePortOptions)

---


#### Properties <a name="Properties"></a>

##### `ports`<sup>Required</sup> <a name="org.cdk8s.plus17.Service.property.ports"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ServicePort`](#org.cdk8s.plus17.ServicePort)>

Ports for this service.

Use `serve()` to expose additional service ports.

---

##### `selector`<sup>Required</sup> <a name="org.cdk8s.plus17.Service.property.selector"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

Returns the labels which are used to select pods for this service.

---

##### `type`<sup>Required</sup> <a name="org.cdk8s.plus17.Service.property.type"></a>

- *Type:* [`org.cdk8s.plus17.ServiceType`](#org.cdk8s.plus17.ServiceType)

Determines how the Service is exposed.

---

##### `clusterIP`<sup>Optional</sup> <a name="org.cdk8s.plus17.Service.property.clusterIP"></a>

- *Type:* `java.lang.String`

The IP address of the service and is usually assigned randomly by the master.

---

##### `externalName`<sup>Optional</sup> <a name="org.cdk8s.plus17.Service.property.externalName"></a>

- *Type:* `java.lang.String`

The externalName to be used for EXTERNAL_NAME types.

---


### ServiceAccount <a name="org.cdk8s.plus17.ServiceAccount"></a>

- *Implements:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the apiserver.
When they do, they are authenticated as a particular Service Account (for
example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account

#### Initializers <a name="org.cdk8s.plus17.ServiceAccount.Initializer"></a>

```java
import org.cdk8s.plus17.ServiceAccount;

ServiceAccount.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .secrets(java.util.List<ISecret>)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus17.ServiceAccount.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus17.ServiceAccount.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceAccountProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `secrets`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceAccountProps.parameter.secrets"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ISecret`](#org.cdk8s.plus17.ISecret)>

List of secrets allowed to be used by pods running using this ServiceAccount.

> https://kubernetes.io/docs/concepts/configuration/secret

---

#### Methods <a name="Methods"></a>

##### `addSecret` <a name="org.cdk8s.plus17.ServiceAccount.addSecret"></a>

```java
public addSecret(ISecret secret)
```

###### `secret`<sup>Required</sup> <a name="org.cdk8s.plus17.ServiceAccount.parameter.secret"></a>

- *Type:* [`org.cdk8s.plus17.ISecret`](#org.cdk8s.plus17.ISecret)

The secret.

---

#### Static Functions <a name="Static Functions"></a>

##### `fromServiceAccountName` <a name="org.cdk8s.plus17.ServiceAccount.fromServiceAccountName"></a>

```java
import org.cdk8s.plus17.ServiceAccount;

ServiceAccount.fromServiceAccountName(java.lang.String name)
```

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.ServiceAccount.parameter.name"></a>

- *Type:* `java.lang.String`

The name of the service account resource.

---

#### Properties <a name="Properties"></a>

##### `secrets`<sup>Required</sup> <a name="org.cdk8s.plus17.ServiceAccount.property.secrets"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ISecret`](#org.cdk8s.plus17.ISecret)>

List of secrets allowed to be used by pods running using this service account.

Returns a copy. To add a secret, use `addSecret()`.

---


### StatefulSet <a name="org.cdk8s.plus17.StatefulSet"></a>

- *Implements:* [`org.cdk8s.plus17.IPodTemplate`](#org.cdk8s.plus17.IPodTemplate)

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

#### Initializers <a name="org.cdk8s.plus17.StatefulSet.Initializer"></a>

```java
import org.cdk8s.plus17.StatefulSet;

StatefulSet.Builder.create(Construct scope, java.lang.String id)
//  .metadata(ApiObjectMetadata)
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
    .service(Service)
//  .defaultSelector(java.lang.Boolean)
//  .podManagementPolicy(PodManagementPolicy)
//  .replicas(java.lang.Number)
    .build();
```

##### `scope`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.parameter.scope"></a>

- *Type:* [`software.constructs.Construct`](#software.constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.parameter.id"></a>

- *Type:* `java.lang.String`

---

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.parameter.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.parameter.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `service`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSetProps.parameter.service"></a>

- *Type:* [`org.cdk8s.plus17.Service`](#org.cdk8s.plus17.Service)

Service to associate with the statefulset.

---

##### `defaultSelector`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.parameter.defaultSelector"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod selector for this statefulset.

If this is set to `false` you must define your selector through
`statefulset.podMetadata.addLabel()` and `statefulset.selectByLabel()`.

---

##### `podManagementPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.parameter.podManagementPolicy"></a>

- *Type:* [`org.cdk8s.plus17.PodManagementPolicy`](#org.cdk8s.plus17.PodManagementPolicy)
- *Default:* PodManagementPolicy.ORDERED_READY

Pod management policy to use for this statefulset.

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.parameter.replicas"></a>

- *Type:* `java.lang.Number`
- *Default:* 1

Number of desired pods.

---

#### Methods <a name="Methods"></a>

##### `addContainer` <a name="org.cdk8s.plus17.StatefulSet.addContainer"></a>

```java
public addContainer(ContainerProps container)
```

###### `container`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.parameter.container"></a>

- *Type:* [`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)

---

##### `addVolume` <a name="org.cdk8s.plus17.StatefulSet.addVolume"></a>

```java
public addVolume(Volume volume)
```

###### `volume`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.parameter.volume"></a>

- *Type:* [`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)

---

##### `selectByLabel` <a name="org.cdk8s.plus17.StatefulSet.selectByLabel"></a>

```java
public selectByLabel(java.lang.String key, java.lang.String value)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.parameter.key"></a>

- *Type:* `java.lang.String`

The label key.

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.parameter.value"></a>

- *Type:* `java.lang.String`

The label value.

---


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Container`](#org.cdk8s.plus17.Container)>

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `labelSelector`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.property.labelSelector"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

The labels this statefulset will match against in order to select pods.

Returns a a copy. Use `selectByLabel()` to add labels.

---

##### `podManagementPolicy`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.property.podManagementPolicy"></a>

- *Type:* [`org.cdk8s.plus17.PodManagementPolicy`](#org.cdk8s.plus17.PodManagementPolicy)

Management policy to use for the set.

---

##### `podMetadata`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.property.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadataDefinition`](#org.cdk8s.ApiObjectMetadataDefinition)

Provides read/write access to the underlying pod metadata of the resource.

---

##### `replicas`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.property.replicas"></a>

- *Type:* `java.lang.Number`

Number of desired pods.

---

##### `volumes`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSet.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSet.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSet.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)

The service account used to run this pod.

---


## Structs <a name="Structs"></a>

### AddDirectoryOptions <a name="org.cdk8s.plus17.AddDirectoryOptions"></a>

Options for `configmap.addDirectory()`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.AddDirectoryOptions;

AddDirectoryOptions.builder()
//  .exclude(java.util.List<java.lang.String>)
//  .keyPrefix(java.lang.String)
    .build();
```

##### `exclude`<sup>Optional</sup> <a name="org.cdk8s.plus17.AddDirectoryOptions.property.exclude"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* include all files

Glob patterns to exclude when adding files.

---

##### `keyPrefix`<sup>Optional</sup> <a name="org.cdk8s.plus17.AddDirectoryOptions.property.keyPrefix"></a>

- *Type:* `java.lang.String`
- *Default:* ""

A prefix to add to all keys in the config map.

---

### CommandProbeOptions <a name="org.cdk8s.plus17.CommandProbeOptions"></a>

Options for `Probe.fromCommand()`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.CommandProbeOptions;

CommandProbeOptions.builder()
//  .failureThreshold(java.lang.Number)
//  .initialDelaySeconds(Duration)
//  .periodSeconds(Duration)
//  .successThreshold(java.lang.Number)
//  .timeoutSeconds(Duration)
    .build();
```

##### `failureThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus17.CommandProbeOptions.property.failureThreshold"></a>

- *Type:* `java.lang.Number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="org.cdk8s.plus17.CommandProbeOptions.property.initialDelaySeconds"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus17.CommandProbeOptions.property.periodSeconds"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus17.CommandProbeOptions.property.successThreshold"></a>

- *Type:* `java.lang.Number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus17.CommandProbeOptions.property.timeoutSeconds"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

### ConfigMapProps <a name="org.cdk8s.plus17.ConfigMapProps"></a>

Properties for initialization of `ConfigMap`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ConfigMapProps;

ConfigMapProps.builder()
//  .metadata(ApiObjectMetadata)
//  .binaryData(java.util.Map<java.lang.String, java.lang.String>)
//  .data(java.util.Map<java.lang.String, java.lang.String>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMapProps.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `binaryData`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMapProps.property.binaryData"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

BinaryData contains the binary data.

Each key must consist of alphanumeric characters, '-', '_' or '.'.
BinaryData can contain byte sequences that are not in the UTF-8 range. The
keys stored in BinaryData must not overlap with the ones in the Data field,
this is enforced during validation process. Using this field will require
1.10+ apiserver and kubelet.

You can also add binary data using `configMap.addBinaryData()`.

---

##### `data`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMapProps.property.data"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

Data contains the configuration data.

Each key must consist of alphanumeric characters, '-', '_' or '.'. Values
with non-UTF-8 byte sequences must use the BinaryData field. The keys
stored in Data must not overlap with the keys in the BinaryData field, this
is enforced during validation process.

You can also add data using `configMap.addData()`.

---

### ConfigMapVolumeOptions <a name="org.cdk8s.plus17.ConfigMapVolumeOptions"></a>

Options for the ConfigMap-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ConfigMapVolumeOptions;

ConfigMapVolumeOptions.builder()
//  .defaultMode(java.lang.Number)
//  .items(java.util.Map<java.lang.String, PathMapping>)
//  .name(java.lang.String)
//  .optional(java.lang.Boolean)
    .build();
```

##### `defaultMode`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMapVolumeOptions.property.defaultMode"></a>

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

##### `items`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMapVolumeOptions.property.items"></a>

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus17.PathMapping`](#org.cdk8s.plus17.PathMapping)>
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the ConfigMap, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMapVolumeOptions.property.name"></a>

- *Type:* `java.lang.String`
- *Default:* auto-generated

The volume name.

---

##### `optional`<sup>Optional</sup> <a name="org.cdk8s.plus17.ConfigMapVolumeOptions.property.optional"></a>

- *Type:* `java.lang.Boolean`
- *Default:* undocumented

Specify whether the ConfigMap or its keys must be defined.

---

### ContainerProps <a name="org.cdk8s.plus17.ContainerProps"></a>

Properties for creating a container.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ContainerProps;

ContainerProps.builder()
    .image(java.lang.String)
//  .args(java.util.List<java.lang.String>)
//  .command(java.util.List<java.lang.String>)
//  .env(java.util.Map<java.lang.String, EnvValue>)
//  .imagePullPolicy(ImagePullPolicy)
//  .liveness(Probe)
//  .name(java.lang.String)
//  .port(java.lang.Number)
//  .readiness(Probe)
//  .startup(Probe)
//  .volumeMounts(java.util.List<VolumeMount>)
//  .workingDir(java.lang.String)
    .build();
```

##### `image`<sup>Required</sup> <a name="org.cdk8s.plus17.ContainerProps.property.image"></a>

- *Type:* `java.lang.String`

Docker image name.

---

##### `args`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.args"></a>

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

##### `command`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.command"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `env`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.env"></a>

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus17.EnvValue`](#org.cdk8s.plus17.EnvValue)>
- *Default:* No environment variables.

List of environment variables to set in the container.

Cannot be updated.

---

##### `imagePullPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.imagePullPolicy"></a>

- *Type:* [`org.cdk8s.plus17.ImagePullPolicy`](#org.cdk8s.plus17.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `liveness`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.liveness"></a>

- *Type:* [`org.cdk8s.plus17.Probe`](#org.cdk8s.plus17.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.name"></a>

- *Type:* `java.lang.String`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.port"></a>

- *Type:* `java.lang.Number`
- *Default:* No port is exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

##### `readiness`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.readiness"></a>

- *Type:* [`org.cdk8s.plus17.Probe`](#org.cdk8s.plus17.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `startup`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.startup"></a>

- *Type:* [`org.cdk8s.plus17.Probe`](#org.cdk8s.plus17.Probe)
- *Default:* no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volumeMounts`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.volumeMounts"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.VolumeMount`](#org.cdk8s.plus17.VolumeMount)>

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `workingDir`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.property.workingDir"></a>

- *Type:* `java.lang.String`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

### DeploymentProps <a name="org.cdk8s.plus17.DeploymentProps"></a>

Properties for initialization of `Deployment`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.DeploymentProps;

DeploymentProps.builder()
//  .metadata(ApiObjectMetadata)
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .defaultSelector(java.lang.Boolean)
//  .replicas(java.lang.Number)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.property.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `defaultSelector`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.property.defaultSelector"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod selector for this deployment.

If this is set to `false` you must define your selector through
`deployment.podMetadata.addLabel()` and `deployment.selectByLabel()`.

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus17.DeploymentProps.property.replicas"></a>

- *Type:* `java.lang.Number`
- *Default:* 1

Number of desired pods.

---

### EmptyDirVolumeOptions <a name="org.cdk8s.plus17.EmptyDirVolumeOptions"></a>

Options for volumes populated with an empty directory.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.EmptyDirVolumeOptions;

EmptyDirVolumeOptions.builder()
//  .medium(EmptyDirMedium)
//  .sizeLimit(Size)
    .build();
```

##### `medium`<sup>Optional</sup> <a name="org.cdk8s.plus17.EmptyDirVolumeOptions.property.medium"></a>

- *Type:* [`org.cdk8s.plus17.EmptyDirMedium`](#org.cdk8s.plus17.EmptyDirMedium)
- *Default:* EmptyDirMedium.DEFAULT

By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment.

However, you can set the emptyDir.medium field to
`EmptyDirMedium.MEMORY` to tell Kubernetes to mount a tmpfs (RAM-backed
filesystem) for you instead. While tmpfs is very fast, be aware that unlike
disks, tmpfs is cleared on node reboot and any files you write will count
against your Container's memory limit.

---

##### `sizeLimit`<sup>Optional</sup> <a name="org.cdk8s.plus17.EmptyDirVolumeOptions.property.sizeLimit"></a>

- *Type:* [`org.cdk8s.Size`](#org.cdk8s.Size)
- *Default:* limit is undefined

Total amount of local storage required for this EmptyDir volume.

The size
limit is also applicable for memory medium. The maximum usage on memory
medium EmptyDir would be the minimum value between the SizeLimit specified
here and the sum of memory limits of all containers in a pod.

---

### EnvValueFromConfigMapOptions <a name="org.cdk8s.plus17.EnvValueFromConfigMapOptions"></a>

Options to specify an envionment variable value from a ConfigMap key.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.EnvValueFromConfigMapOptions;

EnvValueFromConfigMapOptions.builder()
//  .optional(java.lang.Boolean)
    .build();
```

##### `optional`<sup>Optional</sup> <a name="org.cdk8s.plus17.EnvValueFromConfigMapOptions.property.optional"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify whether the ConfigMap or its key must be defined.

---

### EnvValueFromProcessOptions <a name="org.cdk8s.plus17.EnvValueFromProcessOptions"></a>

Options to specify an environment variable value from the process environment.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.EnvValueFromProcessOptions;

EnvValueFromProcessOptions.builder()
//  .required(java.lang.Boolean)
    .build();
```

##### `required`<sup>Optional</sup> <a name="org.cdk8s.plus17.EnvValueFromProcessOptions.property.required"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify whether the key must exist in the environment.

If this is set to true, and the key does not exist, an error will thrown.

---

### EnvValueFromSecretOptions <a name="org.cdk8s.plus17.EnvValueFromSecretOptions"></a>

Options to specify an environment variable value from a Secret.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.EnvValueFromSecretOptions;

EnvValueFromSecretOptions.builder()
//  .optional(java.lang.Boolean)
    .build();
```

##### `optional`<sup>Optional</sup> <a name="org.cdk8s.plus17.EnvValueFromSecretOptions.property.optional"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Specify whether the Secret or its key must be defined.

---

### ExposeOptions <a name="org.cdk8s.plus17.ExposeOptions"></a>

Options for exposing a deployment via a service.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ExposeOptions;

ExposeOptions.builder()
//  .name(java.lang.String)
//  .protocol(Protocol)
//  .serviceType(ServiceType)
//  .targetPort(java.lang.Number)
    .build();
```

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus17.ExposeOptions.property.name"></a>

- *Type:* `java.lang.String`
- *Default:* undefined Uses the system generated name.

The name of the service to expose.

This will be set on the Service.metadata and must be a DNS_LABEL

---

##### `protocol`<sup>Optional</sup> <a name="org.cdk8s.plus17.ExposeOptions.property.protocol"></a>

- *Type:* [`org.cdk8s.plus17.Protocol`](#org.cdk8s.plus17.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `serviceType`<sup>Optional</sup> <a name="org.cdk8s.plus17.ExposeOptions.property.serviceType"></a>

- *Type:* [`org.cdk8s.plus17.ServiceType`](#org.cdk8s.plus17.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

##### `targetPort`<sup>Optional</sup> <a name="org.cdk8s.plus17.ExposeOptions.property.targetPort"></a>

- *Type:* `java.lang.Number`
- *Default:* The port of the first container in the deployment (ie. containers[0].port)

The port number the service will redirect to.

---

### HttpGetProbeOptions <a name="org.cdk8s.plus17.HttpGetProbeOptions"></a>

Options for `Probe.fromHttpGet()`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.HttpGetProbeOptions;

HttpGetProbeOptions.builder()
//  .failureThreshold(java.lang.Number)
//  .initialDelaySeconds(Duration)
//  .periodSeconds(Duration)
//  .successThreshold(java.lang.Number)
//  .timeoutSeconds(Duration)
//  .port(java.lang.Number)
    .build();
```

##### `failureThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus17.HttpGetProbeOptions.property.failureThreshold"></a>

- *Type:* `java.lang.Number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="org.cdk8s.plus17.HttpGetProbeOptions.property.initialDelaySeconds"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus17.HttpGetProbeOptions.property.periodSeconds"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus17.HttpGetProbeOptions.property.successThreshold"></a>

- *Type:* `java.lang.Number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus17.HttpGetProbeOptions.property.timeoutSeconds"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus17.HttpGetProbeOptions.property.port"></a>

- *Type:* `java.lang.Number`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---

### IngressV1Beta1Props <a name="org.cdk8s.plus17.IngressV1Beta1Props"></a>

Properties for `Ingress`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.IngressV1Beta1Props;

IngressV1Beta1Props.builder()
//  .metadata(ApiObjectMetadata)
//  .defaultBackend(IngressV1Beta1Backend)
//  .rules(java.util.List<IngressV1Beta1Rule>)
//  .tls(java.util.List<IngressV1Beta1Tls>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Props.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `defaultBackend`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Props.property.defaultBackend"></a>

- *Type:* [`org.cdk8s.plus17.IngressV1Beta1Backend`](#org.cdk8s.plus17.IngressV1Beta1Backend)

The default backend services requests that do not match any rule.

Using this option or the `addDefaultBackend()` method is equivalent to
adding a rule with both `path` and `host` undefined.

---

##### `rules`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Props.property.rules"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.IngressV1Beta1Rule`](#org.cdk8s.plus17.IngressV1Beta1Rule)>

Routing rules for this ingress.

Each rule must define an `IngressBackend` that will receive the requests
that match this rule. If both `host` and `path` are not specifiec, this
backend will be used as the default backend of the ingress.

You can also add rules later using `addRule()`, `addHostRule()`,
`addDefaultBackend()` and `addHostDefaultBackend()`.

---

##### `tls`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Props.property.tls"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.IngressV1Beta1Tls`](#org.cdk8s.plus17.IngressV1Beta1Tls)>

TLS settings for this ingress.

Using this option tells the ingress controller to expose a TLS endpoint.
Currently the Ingress only supports a single TLS port, 443. If multiple
members of this list specify different hosts, they will be multiplexed on
the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI.

---

### IngressV1Beta1Rule <a name="org.cdk8s.plus17.IngressV1Beta1Rule"></a>

Represents the rules mapping the paths under a specified host to the related backend services.

Incoming requests are first evaluated for a host match,
then routed to the backend associated with the matching path.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.IngressV1Beta1Rule;

IngressV1Beta1Rule.builder()
    .backend(IngressV1Beta1Backend)
//  .host(java.lang.String)
//  .path(java.lang.String)
    .build();
```

##### `backend`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Rule.property.backend"></a>

- *Type:* [`org.cdk8s.plus17.IngressV1Beta1Backend`](#org.cdk8s.plus17.IngressV1Beta1Backend)

Backend defines the referenced service endpoint to which the traffic will be forwarded to.

---

##### `host`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Rule.property.host"></a>

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

##### `path`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Rule.property.path"></a>

- *Type:* `java.lang.String`
- *Default:* If unspecified, the path defaults to a catch all sending traffic
to the backend.

Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'.

---

### IngressV1Beta1Tls <a name="org.cdk8s.plus17.IngressV1Beta1Tls"></a>

Represents the TLS configuration mapping that is passed to the ingress controller for SSL termination.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.IngressV1Beta1Tls;

IngressV1Beta1Tls.builder()
//  .hosts(java.util.List<java.lang.String>)
//  .secret(ISecret)
    .build();
```

##### `hosts`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Tls.property.hosts"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* If unspecified, it defaults to the wildcard host setting for
the loadbalancer controller fulfilling this Ingress.

Hosts are a list of hosts included in the TLS certificate.

The values in
this list must match the name/s used in the TLS Secret.

---

##### `secret`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Tls.property.secret"></a>

- *Type:* [`org.cdk8s.plus17.ISecret`](#org.cdk8s.plus17.ISecret)
- *Default:* If unspecified, it allows SSL routing based on SNI hostname.

Secret is the secret that contains the certificate and key used to terminate SSL traffic on 443.

If the SNI host in a listener conflicts with
the "Host" header field used by an IngressRule, the SNI host is used for
termination and value of the Host header is used for routing.

---

### JobProps <a name="org.cdk8s.plus17.JobProps"></a>

Properties for initialization of `Job`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.JobProps;

JobProps.builder()
//  .metadata(ApiObjectMetadata)
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
//  .activeDeadline(Duration)
//  .backoffLimit(java.lang.Number)
//  .ttlAfterFinished(Duration)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.property.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `activeDeadline`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.property.activeDeadline"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoffLimit`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.property.backoffLimit"></a>

- *Type:* `java.lang.Number`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttlAfterFinished`<sup>Optional</sup> <a name="org.cdk8s.plus17.JobProps.property.ttlAfterFinished"></a>

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

### MountOptions <a name="org.cdk8s.plus17.MountOptions"></a>

Options for mounts.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.MountOptions;

MountOptions.builder()
//  .propagation(MountPropagation)
//  .readOnly(java.lang.Boolean)
//  .subPath(java.lang.String)
//  .subPathExpr(java.lang.String)
    .build();
```

##### `propagation`<sup>Optional</sup> <a name="org.cdk8s.plus17.MountOptions.property.propagation"></a>

- *Type:* [`org.cdk8s.plus17.MountPropagation`](#org.cdk8s.plus17.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

This field is beta in 1.10.

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus17.MountOptions.property.readOnly"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

##### `subPath`<sup>Optional</sup> <a name="org.cdk8s.plus17.MountOptions.property.subPath"></a>

- *Type:* `java.lang.String`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

##### `subPathExpr`<sup>Optional</sup> <a name="org.cdk8s.plus17.MountOptions.property.subPathExpr"></a>

- *Type:* `java.lang.String`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root). SubPathExpr and SubPath are mutually exclusive. This field
is beta in 1.15.

`subPathExpr` and `subPath` are mutually exclusive. This field is beta in
1.15.

---

### PathMapping <a name="org.cdk8s.plus17.PathMapping"></a>

Maps a string key to a path within a volume.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.PathMapping;

PathMapping.builder()
    .path(java.lang.String)
//  .mode(java.lang.Number)
    .build();
```

##### `path`<sup>Required</sup> <a name="org.cdk8s.plus17.PathMapping.property.path"></a>

- *Type:* `java.lang.String`

The relative path of the file to map the key to.

May not be an absolute
path. May not contain the path element '..'. May not start with the string
'..'.

---

##### `mode`<sup>Optional</sup> <a name="org.cdk8s.plus17.PathMapping.property.mode"></a>

- *Type:* `java.lang.Number`

Optional: mode bits to use on this file, must be a value between 0 and 0777.

If not specified, the volume defaultMode will be used. This might be
in conflict with other options that affect the file mode, like fsGroup, and
the result can be other mode bits set.

---

### PodProps <a name="org.cdk8s.plus17.PodProps"></a>

Properties for initialization of `Pod`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.PodProps;

PodProps.builder()
//  .metadata(ApiObjectMetadata)
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodProps.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodProps.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodProps.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodProps.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodProps.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

### PodSpecProps <a name="org.cdk8s.plus17.PodSpecProps"></a>

Properties of a `PodSpec`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.PodSpecProps;

PodSpecProps.builder()
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
    .build();
```

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodSpecProps.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodSpecProps.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodSpecProps.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodSpecProps.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

### PodTemplateProps <a name="org.cdk8s.plus17.PodTemplateProps"></a>

Properties of a `PodTemplate`.

Adds metadata information on top of the spec.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.PodTemplateProps;

PodTemplateProps.builder()
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
    .build();
```

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodTemplateProps.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodTemplateProps.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodTemplateProps.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodTemplateProps.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodTemplateProps.property.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata.

---

### ProbeOptions <a name="org.cdk8s.plus17.ProbeOptions"></a>

Probe options.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ProbeOptions;

ProbeOptions.builder()
//  .failureThreshold(java.lang.Number)
//  .initialDelaySeconds(Duration)
//  .periodSeconds(Duration)
//  .successThreshold(java.lang.Number)
//  .timeoutSeconds(Duration)
    .build();
```

##### `failureThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus17.ProbeOptions.property.failureThreshold"></a>

- *Type:* `java.lang.Number`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initialDelaySeconds`<sup>Optional</sup> <a name="org.cdk8s.plus17.ProbeOptions.property.initialDelaySeconds"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `periodSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus17.ProbeOptions.property.periodSeconds"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `successThreshold`<sup>Optional</sup> <a name="org.cdk8s.plus17.ProbeOptions.property.successThreshold"></a>

- *Type:* `java.lang.Number`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeoutSeconds`<sup>Optional</sup> <a name="org.cdk8s.plus17.ProbeOptions.property.timeoutSeconds"></a>

- *Type:* [`org.cdk8s.Duration`](#org.cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

### ResourceProps <a name="org.cdk8s.plus17.ResourceProps"></a>

Initialization properties for resources.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ResourceProps;

ResourceProps.builder()
//  .metadata(ApiObjectMetadata)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.ResourceProps.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

### SecretProps <a name="org.cdk8s.plus17.SecretProps"></a>

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.SecretProps;

SecretProps.builder()
//  .metadata(ApiObjectMetadata)
//  .stringData(java.util.Map<java.lang.String, java.lang.String>)
//  .type(java.lang.String)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.SecretProps.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `stringData`<sup>Optional</sup> <a name="org.cdk8s.plus17.SecretProps.property.stringData"></a>

- *Type:* java.util.Map<java.lang.String, `java.lang.String`>

stringData allows specifying non-binary secret data in string form.

It is
provided as a write-only convenience method. All keys and values are merged
into the data field on write, overwriting any existing values. It is never
output when reading from the API.

---

##### `type`<sup>Optional</sup> <a name="org.cdk8s.plus17.SecretProps.property.type"></a>

- *Type:* `java.lang.String`
- *Default:* undefined - Don't set a type.

Optional type associated with the secret.

Used to facilitate programmatic
handling of secret data by various controllers.

---

### SecretValue <a name="org.cdk8s.plus17.SecretValue"></a>

Represents a specific value in JSON secret.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.SecretValue;

SecretValue.builder()
    .key(java.lang.String)
    .secret(ISecret)
    .build();
```

##### `key`<sup>Required</sup> <a name="org.cdk8s.plus17.SecretValue.property.key"></a>

- *Type:* `java.lang.String`

The JSON key.

---

##### `secret`<sup>Required</sup> <a name="org.cdk8s.plus17.SecretValue.property.secret"></a>

- *Type:* [`org.cdk8s.plus17.ISecret`](#org.cdk8s.plus17.ISecret)

The secret.

---

### ServiceAccountProps <a name="org.cdk8s.plus17.ServiceAccountProps"></a>

Properties for initialization of `ServiceAccount`.

Properties for initialization of `ServiceAccount`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ServiceAccountProps;

ServiceAccountProps.builder()
//  .metadata(ApiObjectMetadata)
//  .secrets(java.util.List<ISecret>)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceAccountProps.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `secrets`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceAccountProps.property.secrets"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ISecret`](#org.cdk8s.plus17.ISecret)>

List of secrets allowed to be used by pods running using this ServiceAccount.

> https://kubernetes.io/docs/concepts/configuration/secret

---

### ServiceIngressV1BetaBackendOptions <a name="org.cdk8s.plus17.ServiceIngressV1BetaBackendOptions"></a>

Options for setting up backends for ingress rules.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ServiceIngressV1BetaBackendOptions;

ServiceIngressV1BetaBackendOptions.builder()
//  .port(java.lang.Number)
    .build();
```

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceIngressV1BetaBackendOptions.property.port"></a>

- *Type:* `java.lang.Number`
- *Default:* if the service exposes a single port, this port will be used.

The port to use to access the service.

This option will fail if the service does not expose any ports.
- If the service exposes multiple ports, this option must be specified.
- If the service exposes a single port, this option is optional and if
   specified, it must be the same port exposed by the service.

---

### ServicePort <a name="org.cdk8s.plus17.ServicePort"></a>

Definition of a service port.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ServicePort;

ServicePort.builder()
//  .name(java.lang.String)
//  .nodePort(java.lang.Number)
//  .protocol(Protocol)
//  .targetPort(java.lang.Number)
    .port(java.lang.Number)
    .build();
```

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServicePort.property.name"></a>

- *Type:* `java.lang.String`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

##### `nodePort`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServicePort.property.nodePort"></a>

- *Type:* `java.lang.Number`
- *Default:* to auto-allocate a port if the ServiceType of this Service
requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServicePort.property.protocol"></a>

- *Type:* [`org.cdk8s.plus17.Protocol`](#org.cdk8s.plus17.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `targetPort`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServicePort.property.targetPort"></a>

- *Type:* `java.lang.Number`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

##### `port`<sup>Required</sup> <a name="org.cdk8s.plus17.ServicePort.property.port"></a>

- *Type:* `java.lang.Number`

The port number the service will bind to.

---

### ServicePortOptions <a name="org.cdk8s.plus17.ServicePortOptions"></a>

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ServicePortOptions;

ServicePortOptions.builder()
//  .name(java.lang.String)
//  .nodePort(java.lang.Number)
//  .protocol(Protocol)
//  .targetPort(java.lang.Number)
    .build();
```

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServicePortOptions.property.name"></a>

- *Type:* `java.lang.String`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

##### `nodePort`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServicePortOptions.property.nodePort"></a>

- *Type:* `java.lang.Number`
- *Default:* to auto-allocate a port if the ServiceType of this Service
requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServicePortOptions.property.protocol"></a>

- *Type:* [`org.cdk8s.plus17.Protocol`](#org.cdk8s.plus17.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `targetPort`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServicePortOptions.property.targetPort"></a>

- *Type:* `java.lang.Number`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

### ServiceProps <a name="org.cdk8s.plus17.ServiceProps"></a>

Properties for initialization of `Service`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.ServiceProps;

ServiceProps.builder()
//  .metadata(ApiObjectMetadata)
//  .clusterIP(java.lang.String)
//  .externalIPs(java.util.List<java.lang.String>)
//  .externalName(java.lang.String)
//  .loadBalancerSourceRanges(java.util.List<java.lang.String>)
//  .ports(java.util.List<ServicePort>)
//  .type(ServiceType)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `clusterIP`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.property.clusterIP"></a>

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

##### `externalIPs`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.property.externalIPs"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* No external IPs.

A list of IP addresses for which nodes in the cluster will also accept traffic for this service.

These IPs are not managed by Kubernetes. The user
is responsible for ensuring that traffic arrives at a node with this IP. A
common example is external load-balancers that are not part of the
Kubernetes system.

---

##### `externalName`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.property.externalName"></a>

- *Type:* `java.lang.String`
- *Default:* No external name.

The externalName to be used when ServiceType.EXTERNAL_NAME is set.

---

##### `loadBalancerSourceRanges`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.property.loadBalancerSourceRanges"></a>

- *Type:* java.util.List<`java.lang.String`>

A list of CIDR IP addresses, if specified and supported by the platform, will restrict traffic through the cloud-provider load-balancer to the specified client IPs.

More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

---

##### `ports`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.property.ports"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ServicePort`](#org.cdk8s.plus17.ServicePort)>

The port exposed by this service.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

---

##### `type`<sup>Optional</sup> <a name="org.cdk8s.plus17.ServiceProps.property.type"></a>

- *Type:* [`org.cdk8s.plus17.ServiceType`](#org.cdk8s.plus17.ServiceType)
- *Default:* ServiceType.ClusterIP

Determines how the Service is exposed.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

---

### StatefulSetProps <a name="org.cdk8s.plus17.StatefulSetProps"></a>

Properties for initialization of `StatefulSet`.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.StatefulSetProps;

StatefulSetProps.builder()
//  .metadata(ApiObjectMetadata)
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
    .service(Service)
//  .defaultSelector(java.lang.Boolean)
//  .podManagementPolicy(PodManagementPolicy)
//  .replicas(java.lang.Number)
    .build();
```

##### `metadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.property.metadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.property.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `service`<sup>Required</sup> <a name="org.cdk8s.plus17.StatefulSetProps.property.service"></a>

- *Type:* [`org.cdk8s.plus17.Service`](#org.cdk8s.plus17.Service)

Service to associate with the statefulset.

---

##### `defaultSelector`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.property.defaultSelector"></a>

- *Type:* `java.lang.Boolean`
- *Default:* true

Automatically allocates a pod selector for this statefulset.

If this is set to `false` you must define your selector through
`statefulset.podMetadata.addLabel()` and `statefulset.selectByLabel()`.

---

##### `podManagementPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.property.podManagementPolicy"></a>

- *Type:* [`org.cdk8s.plus17.PodManagementPolicy`](#org.cdk8s.plus17.PodManagementPolicy)
- *Default:* PodManagementPolicy.ORDERED_READY

Pod management policy to use for this statefulset.

---

##### `replicas`<sup>Optional</sup> <a name="org.cdk8s.plus17.StatefulSetProps.property.replicas"></a>

- *Type:* `java.lang.Number`
- *Default:* 1

Number of desired pods.

---

### VolumeMount <a name="org.cdk8s.plus17.VolumeMount"></a>

Mount a volume from the pod to the container.

#### Initializer <a name="[object Object].Initializer"></a>

```java
import org.cdk8s.plus17.VolumeMount;

VolumeMount.builder()
//  .propagation(MountPropagation)
//  .readOnly(java.lang.Boolean)
//  .subPath(java.lang.String)
//  .subPathExpr(java.lang.String)
    .path(java.lang.String)
    .volume(Volume)
    .build();
```

##### `propagation`<sup>Optional</sup> <a name="org.cdk8s.plus17.VolumeMount.property.propagation"></a>

- *Type:* [`org.cdk8s.plus17.MountPropagation`](#org.cdk8s.plus17.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

This field is beta in 1.10.

---

##### `readOnly`<sup>Optional</sup> <a name="org.cdk8s.plus17.VolumeMount.property.readOnly"></a>

- *Type:* `java.lang.Boolean`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

##### `subPath`<sup>Optional</sup> <a name="org.cdk8s.plus17.VolumeMount.property.subPath"></a>

- *Type:* `java.lang.String`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

##### `subPathExpr`<sup>Optional</sup> <a name="org.cdk8s.plus17.VolumeMount.property.subPathExpr"></a>

- *Type:* `java.lang.String`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root). SubPathExpr and SubPath are mutually exclusive. This field
is beta in 1.15.

`subPathExpr` and `subPath` are mutually exclusive. This field is beta in
1.15.

---

##### `path`<sup>Required</sup> <a name="org.cdk8s.plus17.VolumeMount.property.path"></a>

- *Type:* `java.lang.String`

Path within the container at which the volume should be mounted.

Must not
contain ':'.

---

##### `volume`<sup>Required</sup> <a name="org.cdk8s.plus17.VolumeMount.property.volume"></a>

- *Type:* [`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)

The volume to mount.

---

## Classes <a name="Classes"></a>

### Container <a name="org.cdk8s.plus17.Container"></a>

A single application container that you want to run within a pod.

#### Initializers <a name="org.cdk8s.plus17.Container.Initializer"></a>

```java
import org.cdk8s.plus17.Container;

Container.Builder.create()
    .image(java.lang.String)
//  .args(java.util.List<java.lang.String>)
//  .command(java.util.List<java.lang.String>)
//  .env(java.util.Map<java.lang.String, EnvValue>)
//  .imagePullPolicy(ImagePullPolicy)
//  .liveness(Probe)
//  .name(java.lang.String)
//  .port(java.lang.Number)
//  .readiness(Probe)
//  .startup(Probe)
//  .volumeMounts(java.util.List<VolumeMount>)
//  .workingDir(java.lang.String)
    .build();
```

##### `image`<sup>Required</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.image"></a>

- *Type:* `java.lang.String`

Docker image name.

---

##### `args`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.args"></a>

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

##### `command`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.command"></a>

- *Type:* java.util.List<`java.lang.String`>
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `env`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.env"></a>

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus17.EnvValue`](#org.cdk8s.plus17.EnvValue)>
- *Default:* No environment variables.

List of environment variables to set in the container.

Cannot be updated.

---

##### `imagePullPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.imagePullPolicy"></a>

- *Type:* [`org.cdk8s.plus17.ImagePullPolicy`](#org.cdk8s.plus17.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `liveness`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.liveness"></a>

- *Type:* [`org.cdk8s.plus17.Probe`](#org.cdk8s.plus17.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.name"></a>

- *Type:* `java.lang.String`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.port"></a>

- *Type:* `java.lang.Number`
- *Default:* No port is exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

##### `readiness`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.readiness"></a>

- *Type:* [`org.cdk8s.plus17.Probe`](#org.cdk8s.plus17.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `startup`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.startup"></a>

- *Type:* [`org.cdk8s.plus17.Probe`](#org.cdk8s.plus17.Probe)
- *Default:* no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volumeMounts`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.volumeMounts"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.VolumeMount`](#org.cdk8s.plus17.VolumeMount)>

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `workingDir`<sup>Optional</sup> <a name="org.cdk8s.plus17.ContainerProps.parameter.workingDir"></a>

- *Type:* `java.lang.String`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

#### Methods <a name="Methods"></a>

##### `addEnv` <a name="org.cdk8s.plus17.Container.addEnv"></a>

```java
public addEnv(java.lang.String name, EnvValue value)
```

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.Container.parameter.name"></a>

- *Type:* `java.lang.String`

The variable name.

---

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus17.Container.parameter.value"></a>

- *Type:* [`org.cdk8s.plus17.EnvValue`](#org.cdk8s.plus17.EnvValue)

The variable value.

---

##### `mount` <a name="org.cdk8s.plus17.Container.mount"></a>

```java
public mount(java.lang.String path, Volume volume)
public mount(java.lang.String path, Volume volume, MountOptions options)
```

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus17.Container.parameter.path"></a>

- *Type:* `java.lang.String`

The desired path in the container.

---

###### `volume`<sup>Required</sup> <a name="org.cdk8s.plus17.Container.parameter.volume"></a>

- *Type:* [`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)

The volume to mount.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.Container.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.MountOptions`](#org.cdk8s.plus17.MountOptions)

---


#### Properties <a name="Properties"></a>

##### `env`<sup>Required</sup> <a name="org.cdk8s.plus17.Container.property.env"></a>

- *Type:* java.util.Map<java.lang.String, [`org.cdk8s.plus17.EnvValue`](#org.cdk8s.plus17.EnvValue)>

The environment variables for this container.

Returns a copy. To add environment variables use `addEnv()`.

---

##### `image`<sup>Required</sup> <a name="org.cdk8s.plus17.Container.property.image"></a>

- *Type:* `java.lang.String`

The container image.

---

##### `imagePullPolicy`<sup>Required</sup> <a name="org.cdk8s.plus17.Container.property.imagePullPolicy"></a>

- *Type:* [`org.cdk8s.plus17.ImagePullPolicy`](#org.cdk8s.plus17.ImagePullPolicy)

Image pull policy for this container.

---

##### `mounts`<sup>Required</sup> <a name="org.cdk8s.plus17.Container.property.mounts"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.VolumeMount`](#org.cdk8s.plus17.VolumeMount)>

Volume mounts configured for this container.

---

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.Container.property.name"></a>

- *Type:* `java.lang.String`

The name of the container.

---

##### `args`<sup>Optional</sup> <a name="org.cdk8s.plus17.Container.property.args"></a>

- *Type:* java.util.List<`java.lang.String`>

Arguments to the entrypoint.

---

##### `command`<sup>Optional</sup> <a name="org.cdk8s.plus17.Container.property.command"></a>

- *Type:* java.util.List<`java.lang.String`>

Entrypoint array (the command to execute when the container starts).

---

##### `port`<sup>Optional</sup> <a name="org.cdk8s.plus17.Container.property.port"></a>

- *Type:* `java.lang.Number`

The port this container exposes.

---

##### `workingDir`<sup>Optional</sup> <a name="org.cdk8s.plus17.Container.property.workingDir"></a>

- *Type:* `java.lang.String`

The working directory inside the container.

---


### EnvValue <a name="org.cdk8s.plus17.EnvValue"></a>

Utility class for creating reading env values from various sources.


#### Static Functions <a name="Static Functions"></a>

##### `fromConfigMap` <a name="org.cdk8s.plus17.EnvValue.fromConfigMap"></a>

```java
import org.cdk8s.plus17.EnvValue;

EnvValue.fromConfigMap(IConfigMap configMap, java.lang.String key)
EnvValue.fromConfigMap(IConfigMap configMap, java.lang.String key, EnvValueFromConfigMapOptions options)
```

###### `configMap`<sup>Required</sup> <a name="org.cdk8s.plus17.EnvValue.parameter.configMap"></a>

- *Type:* [`org.cdk8s.plus17.IConfigMap`](#org.cdk8s.plus17.IConfigMap)

The config map.

---

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus17.EnvValue.parameter.key"></a>

- *Type:* `java.lang.String`

The key to extract the value from.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.EnvValue.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.EnvValueFromConfigMapOptions`](#org.cdk8s.plus17.EnvValueFromConfigMapOptions)

Additional options.

---

##### `fromProcess` <a name="org.cdk8s.plus17.EnvValue.fromProcess"></a>

```java
import org.cdk8s.plus17.EnvValue;

EnvValue.fromProcess(java.lang.String key)
EnvValue.fromProcess(java.lang.String key, EnvValueFromProcessOptions options)
```

###### `key`<sup>Required</sup> <a name="org.cdk8s.plus17.EnvValue.parameter.key"></a>

- *Type:* `java.lang.String`

The key to read.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.EnvValue.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.EnvValueFromProcessOptions`](#org.cdk8s.plus17.EnvValueFromProcessOptions)

Additional options.

---

##### `fromSecretValue` <a name="org.cdk8s.plus17.EnvValue.fromSecretValue"></a>

```java
import org.cdk8s.plus17.EnvValue;

EnvValue.fromSecretValue(SecretValue secretValue)
EnvValue.fromSecretValue(SecretValue secretValue, EnvValueFromSecretOptions options)
```

###### `secretValue`<sup>Required</sup> <a name="org.cdk8s.plus17.EnvValue.parameter.secretValue"></a>

- *Type:* [`org.cdk8s.plus17.SecretValue`](#org.cdk8s.plus17.SecretValue)

The secret value (secrent + key).

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.EnvValue.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.EnvValueFromSecretOptions`](#org.cdk8s.plus17.EnvValueFromSecretOptions)

Additional options.

---

##### `fromValue` <a name="org.cdk8s.plus17.EnvValue.fromValue"></a>

```java
import org.cdk8s.plus17.EnvValue;

EnvValue.fromValue(java.lang.String value)
```

###### `value`<sup>Required</sup> <a name="org.cdk8s.plus17.EnvValue.parameter.value"></a>

- *Type:* `java.lang.String`

The value.

---

#### Properties <a name="Properties"></a>

##### `value`<sup>Optional</sup> <a name="org.cdk8s.plus17.EnvValue.property.value"></a>

- *Type:* `java.lang.Object`

---

##### `valueFrom`<sup>Optional</sup> <a name="org.cdk8s.plus17.EnvValue.property.valueFrom"></a>

- *Type:* `java.lang.Object`

---


### IngressV1Beta1Backend <a name="org.cdk8s.plus17.IngressV1Beta1Backend"></a>

The backend for an ingress path.


#### Static Functions <a name="Static Functions"></a>

##### `fromService` <a name="org.cdk8s.plus17.IngressV1Beta1Backend.fromService"></a>

```java
import org.cdk8s.plus17.IngressV1Beta1Backend;

IngressV1Beta1Backend.fromService(Service service)
IngressV1Beta1Backend.fromService(Service service, ServiceIngressV1BetaBackendOptions options)
```

###### `service`<sup>Required</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Backend.parameter.service"></a>

- *Type:* [`org.cdk8s.plus17.Service`](#org.cdk8s.plus17.Service)

The service object.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.IngressV1Beta1Backend.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.ServiceIngressV1BetaBackendOptions`](#org.cdk8s.plus17.ServiceIngressV1BetaBackendOptions)

---



### PodSpec <a name="org.cdk8s.plus17.PodSpec"></a>

- *Implements:* [`org.cdk8s.plus17.IPodSpec`](#org.cdk8s.plus17.IPodSpec)

Provides read/write capabilities ontop of a `PodSpecProps`.

#### Initializers <a name="org.cdk8s.plus17.PodSpec.Initializer"></a>

```java
import org.cdk8s.plus17.PodSpec;

PodSpec.Builder.create()
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
    .build();
```

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodSpecProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodSpecProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodSpecProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodSpecProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

#### Methods <a name="Methods"></a>

##### `addContainer` <a name="org.cdk8s.plus17.PodSpec.addContainer"></a>

```java
public addContainer(ContainerProps container)
```

###### `container`<sup>Required</sup> <a name="org.cdk8s.plus17.PodSpec.parameter.container"></a>

- *Type:* [`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)

---

##### `addVolume` <a name="org.cdk8s.plus17.PodSpec.addVolume"></a>

```java
public addVolume(Volume volume)
```

###### `volume`<sup>Required</sup> <a name="org.cdk8s.plus17.PodSpec.parameter.volume"></a>

- *Type:* [`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)

---


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="org.cdk8s.plus17.PodSpec.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Container`](#org.cdk8s.plus17.Container)>

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `volumes`<sup>Required</sup> <a name="org.cdk8s.plus17.PodSpec.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodSpec.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodSpec.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)

The service account used to run this pod.

---


### PodTemplate <a name="org.cdk8s.plus17.PodTemplate"></a>

- *Implements:* [`org.cdk8s.plus17.IPodTemplate`](#org.cdk8s.plus17.IPodTemplate)

Provides read/write capabilities ontop of a `PodTemplateProps`.

#### Initializers <a name="org.cdk8s.plus17.PodTemplate.Initializer"></a>

```java
import org.cdk8s.plus17.PodTemplate;

PodTemplate.Builder.create()
//  .containers(java.util.List<ContainerProps>)
//  .restartPolicy(RestartPolicy)
//  .serviceAccount(IServiceAccount)
//  .volumes(java.util.List<Volume>)
//  .podMetadata(ApiObjectMetadata)
    .build();
```

##### `containers`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodTemplateProps.parameter.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)>
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodTemplateProps.parameter.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodTemplateProps.parameter.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodTemplateProps.parameter.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `podMetadata`<sup>Optional</sup> <a name="org.cdk8s.plus17.PodTemplateProps.parameter.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadata`](#org.cdk8s.ApiObjectMetadata)

The pod metadata.

---



#### Properties <a name="Properties"></a>

##### `podMetadata`<sup>Required</sup> <a name="org.cdk8s.plus17.PodTemplate.property.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadataDefinition`](#org.cdk8s.ApiObjectMetadataDefinition)

Provides read/write access to the underlying pod metadata of the resource.

---


### Probe <a name="org.cdk8s.plus17.Probe"></a>

Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.

#### Initializers <a name="org.cdk8s.plus17.Probe.Initializer"></a>

```java
import org.cdk8s.plus17.Probe;

new Probe();
```


#### Static Functions <a name="Static Functions"></a>

##### `fromCommand` <a name="org.cdk8s.plus17.Probe.fromCommand"></a>

```java
import org.cdk8s.plus17.Probe;

Probe.fromCommand(java.util.List<java.lang.String> command)
Probe.fromCommand(java.util.List<java.lang.String> command, CommandProbeOptions options)
```

###### `command`<sup>Required</sup> <a name="org.cdk8s.plus17.Probe.parameter.command"></a>

- *Type:* java.util.List<`java.lang.String`>

The command to execute.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.Probe.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.CommandProbeOptions`](#org.cdk8s.plus17.CommandProbeOptions)

Options.

---

##### `fromHttpGet` <a name="org.cdk8s.plus17.Probe.fromHttpGet"></a>

```java
import org.cdk8s.plus17.Probe;

Probe.fromHttpGet(java.lang.String path)
Probe.fromHttpGet(java.lang.String path, HttpGetProbeOptions options)
```

###### `path`<sup>Required</sup> <a name="org.cdk8s.plus17.Probe.parameter.path"></a>

- *Type:* `java.lang.String`

The URL path to hit.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.Probe.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.HttpGetProbeOptions`](#org.cdk8s.plus17.HttpGetProbeOptions)

Options.

---



### Volume <a name="org.cdk8s.plus17.Volume"></a>

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

#### Initializers <a name="org.cdk8s.plus17.Volume.Initializer"></a>

```java
import org.cdk8s.plus17.Volume;

new Volume(java.lang.String name, java.lang.Object config);
```

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.Volume.parameter.name"></a>

- *Type:* `java.lang.String`

---

##### `config`<sup>Required</sup> <a name="org.cdk8s.plus17.Volume.parameter.config"></a>

- *Type:* `java.lang.Object`

---


#### Static Functions <a name="Static Functions"></a>

##### `fromConfigMap` <a name="org.cdk8s.plus17.Volume.fromConfigMap"></a>

```java
import org.cdk8s.plus17.Volume;

Volume.fromConfigMap(IConfigMap configMap)
Volume.fromConfigMap(IConfigMap configMap, ConfigMapVolumeOptions options)
```

###### `configMap`<sup>Required</sup> <a name="org.cdk8s.plus17.Volume.parameter.configMap"></a>

- *Type:* [`org.cdk8s.plus17.IConfigMap`](#org.cdk8s.plus17.IConfigMap)

The config map to use to populate the volume.

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.ConfigMapVolumeOptions`](#org.cdk8s.plus17.ConfigMapVolumeOptions)

Options.

---

##### `fromEmptyDir` <a name="org.cdk8s.plus17.Volume.fromEmptyDir"></a>

```java
import org.cdk8s.plus17.Volume;

Volume.fromEmptyDir(java.lang.String name)
Volume.fromEmptyDir(java.lang.String name, EmptyDirVolumeOptions options)
```

###### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.Volume.parameter.name"></a>

- *Type:* `java.lang.String`

---

###### `options`<sup>Optional</sup> <a name="org.cdk8s.plus17.Volume.parameter.options"></a>

- *Type:* [`org.cdk8s.plus17.EmptyDirVolumeOptions`](#org.cdk8s.plus17.EmptyDirVolumeOptions)

Additional options.

---

#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.Volume.property.name"></a>

- *Type:* `java.lang.String`

---


## Protocols <a name="Protocols"></a>

### IConfigMap <a name="org.cdk8s.plus17.IConfigMap"></a>

- *Extends:* [`org.cdk8s.plus17.IResource`](#org.cdk8s.plus17.IResource)

- *Implemented By:* [`org.cdk8s.plus17.ConfigMap`](#org.cdk8s.plus17.ConfigMap), [`org.cdk8s.plus17.IConfigMap`](#org.cdk8s.plus17.IConfigMap)

Represents a config map.


#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.IConfigMap.property.name"></a>

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### IPodSpec <a name="org.cdk8s.plus17.IPodSpec"></a>

- *Implemented By:* [`org.cdk8s.plus17.Deployment`](#org.cdk8s.plus17.Deployment), [`org.cdk8s.plus17.Job`](#org.cdk8s.plus17.Job), [`org.cdk8s.plus17.Pod`](#org.cdk8s.plus17.Pod), [`org.cdk8s.plus17.PodSpec`](#org.cdk8s.plus17.PodSpec), [`org.cdk8s.plus17.PodTemplate`](#org.cdk8s.plus17.PodTemplate), [`org.cdk8s.plus17.StatefulSet`](#org.cdk8s.plus17.StatefulSet), [`org.cdk8s.plus17.IPodSpec`](#org.cdk8s.plus17.IPodSpec), [`org.cdk8s.plus17.IPodTemplate`](#org.cdk8s.plus17.IPodTemplate)

Represents a resource that can be configured with a kuberenets pod spec. (e.g `Deployment`, `Job`, `Pod`, ...).

Use the `PodSpec` class as an implementation helper.

#### Methods <a name="Methods"></a>

##### `addContainer` <a name="org.cdk8s.plus17.IPodSpec.addContainer"></a>

```java
public addContainer(ContainerProps container)
```

###### `container`<sup>Required</sup> <a name="org.cdk8s.plus17.IPodSpec.parameter.container"></a>

- *Type:* [`org.cdk8s.plus17.ContainerProps`](#org.cdk8s.plus17.ContainerProps)

The container.

---

##### `addVolume` <a name="org.cdk8s.plus17.IPodSpec.addVolume"></a>

```java
public addVolume(Volume volume)
```

###### `volume`<sup>Required</sup> <a name="org.cdk8s.plus17.IPodSpec.parameter.volume"></a>

- *Type:* [`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)

The volume.

---

#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="org.cdk8s.plus17.IPodSpec.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Container`](#org.cdk8s.plus17.Container)>

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `volumes`<sup>Required</sup> <a name="org.cdk8s.plus17.IPodSpec.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.IPodSpec.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.IPodSpec.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)

The service account used to run this pod.

---

### IPodTemplate <a name="org.cdk8s.plus17.IPodTemplate"></a>

- *Extends:* [`org.cdk8s.plus17.IPodSpec`](#org.cdk8s.plus17.IPodSpec)

- *Implemented By:* [`org.cdk8s.plus17.Deployment`](#org.cdk8s.plus17.Deployment), [`org.cdk8s.plus17.Job`](#org.cdk8s.plus17.Job), [`org.cdk8s.plus17.PodTemplate`](#org.cdk8s.plus17.PodTemplate), [`org.cdk8s.plus17.StatefulSet`](#org.cdk8s.plus17.StatefulSet), [`org.cdk8s.plus17.IPodTemplate`](#org.cdk8s.plus17.IPodTemplate)

Represents a resource that can be configured with a kuberenets pod template. (e.g `Deployment`, `Job`, ...).

Use the `PodTemplate` class as an implementation helper.


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="org.cdk8s.plus17.IPodTemplate.property.containers"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Container`](#org.cdk8s.plus17.Container)>

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `volumes`<sup>Required</sup> <a name="org.cdk8s.plus17.IPodTemplate.property.volumes"></a>

- *Type:* java.util.List<[`org.cdk8s.plus17.Volume`](#org.cdk8s.plus17.Volume)>

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restartPolicy`<sup>Optional</sup> <a name="org.cdk8s.plus17.IPodTemplate.property.restartPolicy"></a>

- *Type:* [`org.cdk8s.plus17.RestartPolicy`](#org.cdk8s.plus17.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `serviceAccount`<sup>Optional</sup> <a name="org.cdk8s.plus17.IPodTemplate.property.serviceAccount"></a>

- *Type:* [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)

The service account used to run this pod.

---

##### `podMetadata`<sup>Required</sup> <a name="org.cdk8s.plus17.IPodTemplate.property.podMetadata"></a>

- *Type:* [`org.cdk8s.ApiObjectMetadataDefinition`](#org.cdk8s.ApiObjectMetadataDefinition)

Provides read/write access to the underlying pod metadata of the resource.

---

### IResource <a name="org.cdk8s.plus17.IResource"></a>

- *Implemented By:* [`org.cdk8s.plus17.ConfigMap`](#org.cdk8s.plus17.ConfigMap), [`org.cdk8s.plus17.Deployment`](#org.cdk8s.plus17.Deployment), [`org.cdk8s.plus17.IngressV1Beta1`](#org.cdk8s.plus17.IngressV1Beta1), [`org.cdk8s.plus17.Job`](#org.cdk8s.plus17.Job), [`org.cdk8s.plus17.Pod`](#org.cdk8s.plus17.Pod), [`org.cdk8s.plus17.Resource`](#org.cdk8s.plus17.Resource), [`org.cdk8s.plus17.Secret`](#org.cdk8s.plus17.Secret), [`org.cdk8s.plus17.Service`](#org.cdk8s.plus17.Service), [`org.cdk8s.plus17.ServiceAccount`](#org.cdk8s.plus17.ServiceAccount), [`org.cdk8s.plus17.StatefulSet`](#org.cdk8s.plus17.StatefulSet), [`org.cdk8s.plus17.IConfigMap`](#org.cdk8s.plus17.IConfigMap), [`org.cdk8s.plus17.IResource`](#org.cdk8s.plus17.IResource), [`org.cdk8s.plus17.ISecret`](#org.cdk8s.plus17.ISecret), [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)

Represents a resource.


#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.IResource.property.name"></a>

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### ISecret <a name="org.cdk8s.plus17.ISecret"></a>

- *Extends:* [`org.cdk8s.plus17.IResource`](#org.cdk8s.plus17.IResource)

- *Implemented By:* [`org.cdk8s.plus17.Secret`](#org.cdk8s.plus17.Secret), [`org.cdk8s.plus17.ISecret`](#org.cdk8s.plus17.ISecret)


#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.ISecret.property.name"></a>

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

### IServiceAccount <a name="org.cdk8s.plus17.IServiceAccount"></a>

- *Extends:* [`org.cdk8s.plus17.IResource`](#org.cdk8s.plus17.IResource)

- *Implemented By:* [`org.cdk8s.plus17.ServiceAccount`](#org.cdk8s.plus17.ServiceAccount), [`org.cdk8s.plus17.IServiceAccount`](#org.cdk8s.plus17.IServiceAccount)


#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="org.cdk8s.plus17.IServiceAccount.property.name"></a>

- *Type:* `java.lang.String`

The Kubernetes name of this resource.

---

## Enums <a name="Enums"></a>

### EmptyDirMedium <a name="EmptyDirMedium"></a>

The medium on which to store the volume.

#### `DEFAULT` <a name="org.cdk8s.plus17.EmptyDirMedium.DEFAULT"></a>

The default volume of the backing node.

---


#### `MEMORY` <a name="org.cdk8s.plus17.EmptyDirMedium.MEMORY"></a>

Mount a tmpfs (RAM-backed filesystem) for you instead.

While tmpfs is very
fast, be aware that unlike disks, tmpfs is cleared on node reboot and any
files you write will count against your Container's memory limit.

---


### ImagePullPolicy <a name="ImagePullPolicy"></a>

#### `ALWAYS` <a name="org.cdk8s.plus17.ImagePullPolicy.ALWAYS"></a>

Every time the kubelet launches a container, the kubelet queries the container image registry to resolve the name to an image digest.

If the kubelet has a container image with that exact
digest cached locally, the kubelet uses its cached image; otherwise, the kubelet downloads
(pulls) the image with the resolved digest, and uses that image to launch the container.

Default is Always if ImagePullPolicy is omitted and either the image tag is :latest or
the image tag is omitted.

---


#### `IF_NOT_PRESENT` <a name="org.cdk8s.plus17.ImagePullPolicy.IF_NOT_PRESENT"></a>

The image is pulled only if it is not already present locally.

Default is IfNotPresent if ImagePullPolicy is omitted and the image tag is present but
not :latest

---


#### `NEVER` <a name="org.cdk8s.plus17.ImagePullPolicy.NEVER"></a>

The image is assumed to exist locally.

No attempt is made to pull the image.

---


### MountPropagation <a name="MountPropagation"></a>

#### `NONE` <a name="org.cdk8s.plus17.MountPropagation.NONE"></a>

This volume mount will not receive any subsequent mounts that are mounted to this volume or any of its subdirectories by the host.

In similar
fashion, no mounts created by the Container will be visible on the host.

This is the default mode.

This mode is equal to `private` mount propagation as described in the Linux
kernel documentation

---


#### `HOST_TO_CONTAINER` <a name="org.cdk8s.plus17.MountPropagation.HOST_TO_CONTAINER"></a>

This volume mount will receive all subsequent mounts that are mounted to this volume or any of its subdirectories.

In other words, if the host mounts anything inside the volume mount, the
Container will see it mounted there.

Similarly, if any Pod with Bidirectional mount propagation to the same
volume mounts anything there, the Container with HostToContainer mount
propagation will see it.

This mode is equal to `rslave` mount propagation as described in the Linux
kernel documentation

---


#### `BIDIRECTIONAL` <a name="org.cdk8s.plus17.MountPropagation.BIDIRECTIONAL"></a>

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


### PodManagementPolicy <a name="PodManagementPolicy"></a>

Controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down.

The default policy is `OrderedReady`, where pods are created in increasing order
(pod-0, then pod-1, etc) and the controller will wait until each pod is ready before
continuing. When scaling down, the pods are removed in the opposite order.

The alternative policy is `Parallel` which will create pods in parallel to match the
desired scale without waiting, and on scale down will delete all pods at once.

#### `ORDERED_READY` <a name="org.cdk8s.plus17.PodManagementPolicy.ORDERED_READY"></a>

---


#### `PARALLEL` <a name="org.cdk8s.plus17.PodManagementPolicy.PARALLEL"></a>

---


### Protocol <a name="Protocol"></a>

#### `TCP` <a name="org.cdk8s.plus17.Protocol.TCP"></a>

---


#### `UDP` <a name="org.cdk8s.plus17.Protocol.UDP"></a>

---


#### `SCTP` <a name="org.cdk8s.plus17.Protocol.SCTP"></a>

---


### RestartPolicy <a name="RestartPolicy"></a>

Restart policy for all containers within the pod.

#### `ALWAYS` <a name="org.cdk8s.plus17.RestartPolicy.ALWAYS"></a>

Always restart the pod after it exits.

---


#### `ON_FAILURE` <a name="org.cdk8s.plus17.RestartPolicy.ON_FAILURE"></a>

Only restart if the pod exits with a non-zero exit code.

---


#### `NEVER` <a name="org.cdk8s.plus17.RestartPolicy.NEVER"></a>

Never restart the pod.

---


### ServiceType <a name="ServiceType"></a>

For some parts of your application (for example, frontends) you may want to expose a Service onto an external IP address, that's outside of your cluster.

Kubernetes ServiceTypes allow you to specify what kind of Service you want.
The default is ClusterIP.

#### `CLUSTER_IP` <a name="org.cdk8s.plus17.ServiceType.CLUSTER_IP"></a>

Exposes the Service on a cluster-internal IP.

Choosing this value makes the Service only reachable from within the cluster.
This is the default ServiceType

---


#### `NODE_PORT` <a name="org.cdk8s.plus17.ServiceType.NODE_PORT"></a>

Exposes the Service on each Node's IP at a static port (the NodePort).

A ClusterIP Service, to which the NodePort Service routes, is automatically created.
You'll be able to contact the NodePort Service, from outside the cluster,
by requesting <NodeIP>:<NodePort>.

---


#### `LOAD_BALANCER` <a name="org.cdk8s.plus17.ServiceType.LOAD_BALANCER"></a>

Exposes the Service externally using a cloud provider's load balancer.

NodePort and ClusterIP Services, to which the external load balancer routes,
are automatically created.

---


#### `EXTERNAL_NAME` <a name="org.cdk8s.plus17.ServiceType.EXTERNAL_NAME"></a>

Maps the Service to the contents of the externalName field (e.g. foo.bar.example.com), by returning a CNAME record with its value. No proxying of any kind is set up.

> Note: You need either kube-dns version 1.7 or CoreDNS version 0.0.8 or higher to use the ExternalName type.

---

