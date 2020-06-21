# API Reference

**Classes**

Name|Description
----|-----------
[ConfigMap](#cdk8s-plus-configmap)|ConfigMap holds configuration data for pods to consume.
[Container](#cdk8s-plus-container)|A single application container that you want to run within a pod.
[Deployment](#cdk8s-plus-deployment)|A Deployment provides declarative updates for Pods and ReplicaSets.
[DeploymentSpec](#cdk8s-plus-deploymentspec)|DeploymentSpec is the specification of the desired behavior of the Deployment.
[Duration](#cdk8s-plus-duration)|Represents a length of time.
[EnvValue](#cdk8s-plus-envvalue)|Utility class for creating reading env values from various sources.
[Job](#cdk8s-plus-job)|A Job creates one or more Pods and ensures that a specified number of them successfully terminate.
[JobSpec](#cdk8s-plus-jobspec)|*No description*
[Pod](#cdk8s-plus-pod)|Pod is a collection of containers that can run on a host.
[PodSpec](#cdk8s-plus-podspec)|A description of a pod.
[PodTemplate](#cdk8s-plus-podtemplate)|Controllers for workload resources create Pods from a pod template and manage those Pods on your behalf.
[PodTemplateSpec](#cdk8s-plus-podtemplatespec)|PodTemplateSpec describes the data a pod should have when created from a template.
[Resource](#cdk8s-plus-resource)|Base class for all Kubernetes objects in stdk8s.
[Secret](#cdk8s-plus-secret)|Kubernetes Secrets let you store and manage sensitive information, such as passwords, OAuth tokens, and ssh keys.
[Service](#cdk8s-plus-service)|An abstract way to expose an application running on a set of Pods as a network service.
[ServiceAccount](#cdk8s-plus-serviceaccount)|A service account provides an identity for processes that run in a Pod.
[ServiceSpec](#cdk8s-plus-servicespec)|A description of a service.
[Size](#cdk8s-plus-size)|Represents the amount of digital storage.
[Volume](#cdk8s-plus-volume)|Volume represents a named volume in a pod that may be accessed by any container in the pod.


**Structs**

Name|Description
----|-----------
[AddDirectoryOptions](#cdk8s-plus-adddirectoryoptions)|Options for `configmap.addDirectory()`.
[ConfigMapProps](#cdk8s-plus-configmapprops)|Properties for initialization of `ConfigMap`.
[ConfigMapVolumeOptions](#cdk8s-plus-configmapvolumeoptions)|Options for the ConfigMap-based volume.
[ContainerProps](#cdk8s-plus-containerprops)|Properties for creating a container.
[DeploymentProps](#cdk8s-plus-deploymentprops)|Properties for initialization of `Deployment`.
[DeploymentSpecProps](#cdk8s-plus-deploymentspecprops)|Properties for initialization of `DeploymentSpec`.
[EmptyDirVolumeOptions](#cdk8s-plus-emptydirvolumeoptions)|Options for volumes populated with an empty directory.
[EnvValueFromConfigMapOptions](#cdk8s-plus-envvaluefromconfigmapoptions)|Options to specify an envionment variable value from a ConfigMap key.
[EnvValueFromProcessOptions](#cdk8s-plus-envvaluefromprocessoptions)|Options to specify an environment variable value from the process environment.
[EnvValueFromSecretOptions](#cdk8s-plus-envvaluefromsecretoptions)|Options to specify an environment variable value from a Secret.
[ExposeOptions](#cdk8s-plus-exposeoptions)|Options for exposing a deployment via a service.
[JobProps](#cdk8s-plus-jobprops)|Properties for initialization of `Job`.
[JobSpecProps](#cdk8s-plus-jobspecprops)|Properties for initialization of `JobSpec`.
[MountOptions](#cdk8s-plus-mountoptions)|Options for mounts.
[PathMapping](#cdk8s-plus-pathmapping)|Maps a string key to a path within a volume.
[PodProps](#cdk8s-plus-podprops)|Properties for initialization of `Pod`.
[PodSpecProps](#cdk8s-plus-podspecprops)|Properties for initialization of `PodSpec`.
[PodTemplateProps](#cdk8s-plus-podtemplateprops)|Properties for initialization of `PodTemplate`.
[PodTemplateSpecProps](#cdk8s-plus-podtemplatespecprops)|Properties for initialization of `PodTemplateSpec`.
[ResourceProps](#cdk8s-plus-resourceprops)|Initialization properties for resources.
[SecretProps](#cdk8s-plus-secretprops)|*No description*
[ServiceAccountProps](#cdk8s-plus-serviceaccountprops)|Properties for initialization of `ServiceAccount`.
[ServicePort](#cdk8s-plus-serviceport)|Definition of a service port.
[ServiceProps](#cdk8s-plus-serviceprops)|Properties for initialization of `Service`.
[ServiceSpecProps](#cdk8s-plus-servicespecprops)|Properties for initialization of `ServiceSpec`.
[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)|Options for how to convert time to a different unit.
[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)|Options for how to convert time to a different unit.
[VolumeMount](#cdk8s-plus-volumemount)|Mount a volume from the pod to the container.


**Interfaces**

Name|Description
----|-----------
[IConfigMap](#cdk8s-plus-iconfigmap)|Represents a config map.
[IResource](#cdk8s-plus-iresource)|Represents a resource.
[ISecret](#cdk8s-plus-isecret)|*No description*
[IServiceAccount](#cdk8s-plus-iserviceaccount)|*No description*


**Enums**

Name|Description
----|-----------
[EmptyDirMedium](#cdk8s-plus-emptydirmedium)|The medium on which to store the volume.
[MountPropagation](#cdk8s-plus-mountpropagation)|*No description*
[RestartPolicy](#cdk8s-plus-restartpolicy)|Restart policy for all containers within the pod.
[ServiceType](#cdk8s-plus-servicetype)|For some parts of your application (for example, frontends) you may want to expose a Service onto an external IP address, that's outside of your cluster.
[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)|Rounding behaviour when converting between units of `Size`.



## class ConfigMap 🔹 <a id="cdk8s-plus-configmap"></a>

ConfigMap holds configuration data for pods to consume.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource), [IConfigMap](#cdk8s-plus-iconfigmap), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new ConfigMap(scope: Construct, id: string, props?: ConfigMapProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ConfigMapProps](#cdk8s-plus-configmapprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **binaryData** (<code>Map<string, string></code>)  BinaryData contains the binary data. <span style="text-decoration: underline">*Optional*</span>
  * **data** (<code>Map<string, string></code>)  Data contains the configuration data. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.

### Methods


#### addBinaryData(key, value)🔹 <a id="cdk8s-plus-configmap-addbinarydata"></a>

Adds a binary data entry to the config map.

BinaryData can contain byte
sequences that are not in the UTF-8 range.

<span style="text-decoration: underline">Usage:</span>

```ts
addBinaryData(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  The key.
* **value** (<code>string</code>)  The value.




#### addData(key, value)🔹 <a id="cdk8s-plus-configmap-adddata"></a>

Adds a data entry to the config map.

<span style="text-decoration: underline">Usage:</span>

```ts
addData(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  The key.
* **value** (<code>string</code>)  The value.




#### addDirectory(localDir, options?)🔹 <a id="cdk8s-plus-configmap-adddirectory"></a>

Adds a directory to the ConfigMap.

<span style="text-decoration: underline">Usage:</span>

```ts
addDirectory(localDir: string, options?: AddDirectoryOptions): void
```

<span style="text-decoration: underline">Parameters:</span>
* **localDir** (<code>string</code>)  A path to a local directory.
* **options** (<code>[AddDirectoryOptions](#cdk8s-plus-adddirectoryoptions)</code>)  Options.
  * **exclude** (<code>Array<string></code>)  Glob patterns to exclude when adding files. <span style="text-decoration: underline">*Default*</span>: include all files
  * **keyPrefix** (<code>string</code>)  A prefix to add to all keys in the config map. <span style="text-decoration: underline">*Default*</span>: ""




#### addFile(localFile, key?)🔹 <a id="cdk8s-plus-configmap-addfile"></a>

Adds a file to the ConfigMap.

<span style="text-decoration: underline">Usage:</span>

```ts
addFile(localFile: string, key?: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **localFile** (<code>string</code>)  The path to the local file.
* **key** (<code>string</code>)  The ConfigMap key (default to the file name).




#### *static* fromConfigMapName(name)🔹 <a id="cdk8s-plus-configmap-fromconfigmapname"></a>

Represents a ConfigMap created elsewhere.

<span style="text-decoration: underline">Usage:</span>

```ts
static fromConfigMapName(name: string): IConfigMap
```

<span style="text-decoration: underline">Parameters:</span>
* **name** (<code>string</code>)  The name of the config map to import.

<span style="text-decoration: underline">Returns</span>:
* <code>[IConfigMap](#cdk8s-plus-iconfigmap)</code>



## class Container 🔹 <a id="cdk8s-plus-container"></a>

A single application container that you want to run within a pod.


### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Container(props: ContainerProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[ContainerProps](#cdk8s-plus-containerprops)</code>)  *No description*
  * **image** (<code>string</code>)  Docker image name. 
  * **command** (<code>Array<string></code>)  Entrypoint array. <span style="text-decoration: underline">*Default*</span>: The docker image's ENTRYPOINT.
  * **env** (<code>Map<string, [EnvValue](#cdk8s-plus-envvalue)></code>)  List of environment variables to set in the container. <span style="text-decoration: underline">*Default*</span>: No environment variables.
  * **name** (<code>string</code>)  Name of the container specified as a DNS_LABEL. <span style="text-decoration: underline">*Default*</span>: 'main'
  * **port** (<code>number</code>)  Number of port to expose on the pod's IP address. <span style="text-decoration: underline">*Default*</span>: No port is exposed.
  * **volumeMounts** (<code>Array<[VolumeMount](#cdk8s-plus-volumemount)></code>)  Pod volumes to mount into the container's filesystem. <span style="text-decoration: underline">*Optional*</span>
  * **workingDir** (<code>string</code>)  Container's working directory. <span style="text-decoration: underline">*Default*</span>: The container runtime's default.



### Properties


Name | Type | Description 
-----|------|-------------
**mounts**🔹 | <code>Array<[VolumeMount](#cdk8s-plus-volumemount)></code> | Volume mounts configured for this container.
**port**?🔹 | <code>number</code> | The port this container exposes.<br/><span style="text-decoration: underline">*Optional*</span>

### Methods


#### addEnv(name, value)🔹 <a id="cdk8s-plus-container-addenv"></a>

Add an environment value to the container.

The variable value can come
from various dynamic sources such a secrets of config maps.

<span style="text-decoration: underline">Usage:</span>

```ts
addEnv(name: string, value: EnvValue): void
```

<span style="text-decoration: underline">Parameters:</span>
* **name** (<code>string</code>)  - The variable name.
* **value** (<code>[EnvValue](#cdk8s-plus-envvalue)</code>)  - The variable value.




#### mount(path, volume, options?)🔹 <a id="cdk8s-plus-container-mount"></a>

Mount a volume to a specific path so that it is accessible by the container.

Every pod that is configured to use this container will autmoatically have access to the volume.

<span style="text-decoration: underline">Usage:</span>

```ts
mount(path: string, volume: Volume, options?: MountOptions): void
```

<span style="text-decoration: underline">Parameters:</span>
* **path** (<code>string</code>)  - The desired path in the container.
* **volume** (<code>[Volume](#cdk8s-plus-volume)</code>)  - The volume to mount.
* **options** (<code>[MountOptions](#cdk8s-plus-mountoptions)</code>)  *No description*
  * **propagation** (<code>[MountPropagation](#cdk8s-plus-mountpropagation)</code>)  Determines how mounts are propagated from the host to container and the other way around. <span style="text-decoration: underline">*Default*</span>: MountPropagation.NONE
  * **readOnly** (<code>boolean</code>)  Mounted read-only if true, read-write otherwise (false or unspecified). <span style="text-decoration: underline">*Default*</span>: false
  * **subPath** (<code>string</code>)  Path within the volume from which the container's volume should be mounted.). <span style="text-decoration: underline">*Default*</span>: "" the volume's root
  * **subPathExpr** (<code>string</code>)  Expanded path within the volume from which the container's volume should be mounted. <span style="text-decoration: underline">*Default*</span>: "" volume's root.






## class Deployment 🔹 <a id="cdk8s-plus-deployment"></a>

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

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Deployment(scope: Construct, id: string, props?: DeploymentProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[DeploymentProps](#cdk8s-plus-deploymentprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[DeploymentSpec](#cdk8s-plus-deploymentspec)</code>)  The spec of the deployment. <span style="text-decoration: underline">*Default*</span>: An empty spec will be created.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[DeploymentSpec](#cdk8s-plus-deploymentspec)</code> | Provides access to the underlying spec.

### Methods


#### expose(options)🔹 <a id="cdk8s-plus-deployment-expose"></a>

Expose a deployment via a service.

This is equivalent to running `kubectl expose deployment <deployment-name>`.

<span style="text-decoration: underline">Usage:</span>

```ts
expose(options: ExposeOptions): Service
```

<span style="text-decoration: underline">Parameters:</span>
* **options** (<code>[ExposeOptions](#cdk8s-plus-exposeoptions)</code>)  - Options.
  * **port** (<code>number</code>)  The port number the service will bind to. 
  * **serviceType** (<code>[ServiceType](#cdk8s-plus-servicetype)</code>)  The type of the exposed service. <span style="text-decoration: underline">*Default*</span>: ClusterIP.

<span style="text-decoration: underline">Returns</span>:
* <code>[Service](#cdk8s-plus-service)</code>



## class DeploymentSpec 🔹 <a id="cdk8s-plus-deploymentspec"></a>

DeploymentSpec is the specification of the desired behavior of the Deployment.


### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new DeploymentSpec(props?: DeploymentSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[DeploymentSpecProps](#cdk8s-plus-deploymentspecprops)</code>)  *No description*
  * **replicas** (<code>number</code>)  Number of desired pods. <span style="text-decoration: underline">*Default*</span>: 1
  * **template** (<code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code>)  The PodTemplateSpec that will be used by a deployment to create pods. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**template**🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | Provides access to the underlying pod template spec.

### Methods


#### selectByLabel(key, value)🔹 <a id="cdk8s-plus-deploymentspec-selectbylabel"></a>

Configure a label selector to this deployment.

Pods that have the label will be selected by deployments configured with this spec.

<span style="text-decoration: underline">Usage:</span>

```ts
selectByLabel(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  - The label key.
* **value** (<code>string</code>)  - The label value.






## class Duration 🔹 <a id="cdk8s-plus-duration"></a>

Represents a length of time.

The amount can be specified either as a literal value (e.g: `10`) which
cannot be negative, or as an unresolved number token.

When the amount is passed as a token, unit conversion is not possible.


### Methods


#### toDays(opts?)🔹 <a id="cdk8s-plus-duration-todays"></a>

Return the total number of days in this Duration.

<span style="text-decoration: underline">Usage:</span>

```ts
toDays(opts?: TimeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. <span style="text-decoration: underline">*Default*</span>: true

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toHours(opts?)🔹 <a id="cdk8s-plus-duration-tohours"></a>

Return the total number of hours in this Duration.

<span style="text-decoration: underline">Usage:</span>

```ts
toHours(opts?: TimeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. <span style="text-decoration: underline">*Default*</span>: true

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toHumanString()🔹 <a id="cdk8s-plus-duration-tohumanstring"></a>

Turn this duration into a human-readable string.

<span style="text-decoration: underline">Usage:</span>

```ts
toHumanString(): string
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>string</code>

#### toISOString()⚠️ <a id="cdk8s-plus-duration-toisostring"></a>

Return an ISO 8601 representation of this period.

<span style="text-decoration: underline">Usage:</span>

```ts
toISOString(): string
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>string</code>

#### toIsoString()🔹 <a id="cdk8s-plus-duration-toisostring"></a>

Return an ISO 8601 representation of this period.

<span style="text-decoration: underline">Usage:</span>

```ts
toIsoString(): string
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>string</code>

#### toMilliseconds(opts?)🔹 <a id="cdk8s-plus-duration-tomilliseconds"></a>

Return the total number of milliseconds in this Duration.

<span style="text-decoration: underline">Usage:</span>

```ts
toMilliseconds(opts?: TimeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. <span style="text-decoration: underline">*Default*</span>: true

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toMinutes(opts?)🔹 <a id="cdk8s-plus-duration-tominutes"></a>

Return the total number of minutes in this Duration.

<span style="text-decoration: underline">Usage:</span>

```ts
toMinutes(opts?: TimeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. <span style="text-decoration: underline">*Default*</span>: true

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toSeconds(opts?)🔹 <a id="cdk8s-plus-duration-toseconds"></a>

Return the total number of seconds in this Duration.

<span style="text-decoration: underline">Usage:</span>

```ts
toSeconds(opts?: TimeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. <span style="text-decoration: underline">*Default*</span>: true

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toString()🔹 <a id="cdk8s-plus-duration-tostring"></a>

Returns a string representation of this `Duration` that is also a Token that cannot be successfully resolved.

This
protects users against inadvertently stringifying a `Duration` object, when they should have called one of the
`to*` methods instead.

<span style="text-decoration: underline">Usage:</span>

```ts
toString(): string
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>string</code>

#### *static* days(amount)🔹 <a id="cdk8s-plus-duration-days"></a>

Create a Duration representing an amount of days.

<span style="text-decoration: underline">Usage:</span>

```ts
static days(amount: number): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  the amount of Days the `Duration` will represent.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#cdk8s-plus-duration)</code>

#### *static* hours(amount)🔹 <a id="cdk8s-plus-duration-hours"></a>

Create a Duration representing an amount of hours.

<span style="text-decoration: underline">Usage:</span>

```ts
static hours(amount: number): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  the amount of Hours the `Duration` will represent.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#cdk8s-plus-duration)</code>

#### *static* millis(amount)🔹 <a id="cdk8s-plus-duration-millis"></a>

Create a Duration representing an amount of milliseconds.

<span style="text-decoration: underline">Usage:</span>

```ts
static millis(amount: number): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  the amount of Milliseconds the `Duration` will represent.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#cdk8s-plus-duration)</code>

#### *static* minutes(amount)🔹 <a id="cdk8s-plus-duration-minutes"></a>

Create a Duration representing an amount of minutes.

<span style="text-decoration: underline">Usage:</span>

```ts
static minutes(amount: number): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  the amount of Minutes the `Duration` will represent.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#cdk8s-plus-duration)</code>

#### *static* parse(duration)🔹 <a id="cdk8s-plus-duration-parse"></a>

Parse a period formatted according to the ISO 8601 standard.

<span style="text-decoration: underline">Usage:</span>

```ts
static parse(duration: string): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **duration** (<code>string</code>)  an ISO-formtted duration to be parsed.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#cdk8s-plus-duration)</code>

#### *static* seconds(amount)🔹 <a id="cdk8s-plus-duration-seconds"></a>

Create a Duration representing an amount of seconds.

<span style="text-decoration: underline">Usage:</span>

```ts
static seconds(amount: number): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  the amount of Seconds the `Duration` will represent.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#cdk8s-plus-duration)</code>



## class EnvValue 🔹 <a id="cdk8s-plus-envvalue"></a>

Utility class for creating reading env values from various sources.



### Properties


Name | Type | Description 
-----|------|-------------
**value**?🔹 | <code>any</code> | <span style="text-decoration: underline">*Optional*</span>
**valueFrom**?🔹 | <code>any</code> | <span style="text-decoration: underline">*Optional*</span>

### Methods


#### *static* fromConfigMap(configMap, key, options?)🔹 <a id="cdk8s-plus-envvalue-fromconfigmap"></a>

Create a value by reading a specific key inside a config map.

<span style="text-decoration: underline">Usage:</span>

```ts
static fromConfigMap(configMap: IConfigMap, key: string, options?: EnvValueFromConfigMapOptions): EnvValue
```

<span style="text-decoration: underline">Parameters:</span>
* **configMap** (<code>[IConfigMap](#cdk8s-plus-iconfigmap)</code>)  - The config map.
* **key** (<code>string</code>)  - The key to extract the value from.
* **options** (<code>[EnvValueFromConfigMapOptions](#cdk8s-plus-envvaluefromconfigmapoptions)</code>)  - Additional options.
  * **optional** (<code>boolean</code>)  Specify whether the ConfigMap or its key must be defined. <span style="text-decoration: underline">*Default*</span>: false

<span style="text-decoration: underline">Returns</span>:
* <code>[EnvValue](#cdk8s-plus-envvalue)</code>

#### *static* fromProcess(key, options?)🔹 <a id="cdk8s-plus-envvalue-fromprocess"></a>

Create a value from a key in the current process environment.

<span style="text-decoration: underline">Usage:</span>

```ts
static fromProcess(key: string, options?: EnvValueFromProcessOptions): EnvValue
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  - The key to read.
* **options** (<code>[EnvValueFromProcessOptions](#cdk8s-plus-envvaluefromprocessoptions)</code>)  - Additional options.
  * **required** (<code>boolean</code>)  Specify whether the key must exist in the environment. <span style="text-decoration: underline">*Default*</span>: false

<span style="text-decoration: underline">Returns</span>:
* <code>[EnvValue](#cdk8s-plus-envvalue)</code>

#### *static* fromSecret(secret, key, options?)🔹 <a id="cdk8s-plus-envvalue-fromsecret"></a>

Create a by reading a specific key inside a secret.

<span style="text-decoration: underline">Usage:</span>

```ts
static fromSecret(secret: ISecret, key: string, options?: EnvValueFromSecretOptions): EnvValue
```

<span style="text-decoration: underline">Parameters:</span>
* **secret** (<code>[ISecret](#cdk8s-plus-isecret)</code>)  - The secret.
* **key** (<code>string</code>)  - The key.
* **options** (<code>[EnvValueFromSecretOptions](#cdk8s-plus-envvaluefromsecretoptions)</code>)  - Additional options.
  * **optional** (<code>boolean</code>)  Specify whether the Secret or its key must be defined. <span style="text-decoration: underline">*Default*</span>: false

<span style="text-decoration: underline">Returns</span>:
* <code>[EnvValue](#cdk8s-plus-envvalue)</code>

#### *static* fromValue(value)🔹 <a id="cdk8s-plus-envvalue-fromvalue"></a>

Create a value from the given argument.

<span style="text-decoration: underline">Usage:</span>

```ts
static fromValue(value: string): EnvValue
```

<span style="text-decoration: underline">Parameters:</span>
* **value** (<code>string</code>)  - The value.

<span style="text-decoration: underline">Returns</span>:
* <code>[EnvValue](#cdk8s-plus-envvalue)</code>



## class Job 🔹 <a id="cdk8s-plus-job"></a>

A Job creates one or more Pods and ensures that a specified number of them successfully terminate.

As pods successfully complete,
the Job tracks the successful completions. When a specified number of successful completions is reached, the task (ie, Job) is complete.
Deleting a Job will clean up the Pods it created. A simple case is to create one Job object in order to reliably run one Pod to completion.
The Job object will start a new Pod if the first Pod fails or is deleted (for example due to a node hardware failure or a node reboot).
You can also use a Job to run multiple Pods in parallel.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Job(scope: Construct, id: string, props?: JobProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[JobProps](#cdk8s-plus-jobprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[JobSpec](#cdk8s-plus-jobspec)</code>)  The spec of the job. <span style="text-decoration: underline">*Default*</span>: An empty spec will be created.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[JobSpec](#cdk8s-plus-jobspec)</code> | <span></span>



## class JobSpec 🔹 <a id="cdk8s-plus-jobspec"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new JobSpec(props?: JobSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[JobSpecProps](#cdk8s-plus-jobspecprops)</code>)  *No description*
  * **template** (<code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **ttlAfterFinished** (<code>[Duration](#cdk8s-plus-duration)</code>)  Limits the lifetime of a Job that has finished execution (either Complete or Failed). <span style="text-decoration: underline">*Default*</span>: If this field is unset, the Job won't be automatically deleted.



### Properties


Name | Type | Description 
-----|------|-------------
**template**🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | <span></span>
**ttlAfterFinished**?🔹 | <code>[Duration](#cdk8s-plus-duration)</code> | <span style="text-decoration: underline">*Optional*</span>



## class Pod 🔹 <a id="cdk8s-plus-pod"></a>

Pod is a collection of containers that can run on a host.

This resource is
created by clients and scheduled onto hosts.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Pod(scope: Construct, id: string, props?: PodProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[PodProps](#cdk8s-plus-podprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[PodSpec](#cdk8s-plus-podspec)</code>)  The spec of the pod. <span style="text-decoration: underline">*Default*</span>: An empty spec will be created.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | Provides access to the underlying spec.



## class PodSpec 🔹 <a id="cdk8s-plus-podspec"></a>

A description of a pod.


### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new PodSpec(props?: PodSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[PodSpecProps](#cdk8s-plus-podspecprops)</code>)  *No description*
  * **containers** (<code>Array<[Container](#cdk8s-plus-container)></code>)  List of containers belonging to the pod. <span style="text-decoration: underline">*Default*</span>: No containers. Note that a pod spec must include at least one container.
  * **restartPolicy** (<code>[RestartPolicy](#cdk8s-plus-restartpolicy)</code>)  Restart policy for all containers within the pod. <span style="text-decoration: underline">*Default*</span>: RestartPolicy.ALWAYS
  * **serviceAccount** (<code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code>)  A service account provides an identity for processes that run in a Pod. <span style="text-decoration: underline">*Default*</span>: No service account.
  * **volumes** (<code>Array<[Volume](#cdk8s-plus-volume)></code>)  List of volumes that can be mounted by containers belonging to the pod. <span style="text-decoration: underline">*Default*</span>: No volumes.



### Properties


Name | Type | Description 
-----|------|-------------
**containers**🔹 | <code>Array<[Container](#cdk8s-plus-container)></code> | List of containers belonging to the pod.
**volumes**🔹 | <code>Array<[Volume](#cdk8s-plus-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-restartpolicy)</code> | Restart policy for all containers within the pod.<br/><span style="text-decoration: underline">*Optional*</span>
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code> | The service account used to run this pod.<br/><span style="text-decoration: underline">*Optional*</span>

### Methods


#### addContainer(container)🔹 <a id="cdk8s-plus-podspec-addcontainer"></a>

Adds a container to this pod.

<span style="text-decoration: underline">Usage:</span>

```ts
addContainer(container: Container): void
```

<span style="text-decoration: underline">Parameters:</span>
* **container** (<code>[Container](#cdk8s-plus-container)</code>)  The container to add.




#### addVolume(volume)🔹 <a id="cdk8s-plus-podspec-addvolume"></a>

Adds a volume to this pod.

<span style="text-decoration: underline">Usage:</span>

```ts
addVolume(volume: Volume): void
```

<span style="text-decoration: underline">Parameters:</span>
* **volume** (<code>[Volume](#cdk8s-plus-volume)</code>)  The volume to add.






## class PodTemplate 🔹 <a id="cdk8s-plus-podtemplate"></a>

Controllers for workload resources create Pods from a pod template and manage those Pods on your behalf.

PodTemplates are specifications for creating Pods, and are included in workload resources such as Deployments, Jobs, and DaemonSets.
Each controller for a workload resource uses the PodTemplate inside the workload object to make actual Pods.
The PodTemplate is part of the desired state of whatever workload resource you used to run your app.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new PodTemplate(scope: Construct, name: string, props?: PodTemplateProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **name** (<code>string</code>)  *No description*
* **props** (<code>[PodTemplateProps](#cdk8s-plus-podtemplateprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | Provides access to the underlying spec.



## class PodTemplateSpec 🔹 <a id="cdk8s-plus-podtemplatespec"></a>

PodTemplateSpec describes the data a pod should have when created from a template.


### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new PodTemplateSpec(props?: PodTemplateSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[PodTemplateSpecProps](#cdk8s-plus-podtemplatespecprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  The metadata of the pod that will be created based on the template. <span style="text-decoration: underline">*Default*</span>: No metadata.
  * **podSpec** (<code>[PodSpec](#cdk8s-plus-podspec)</code>)  The spec of the pod that will be created based on the template. <span style="text-decoration: underline">*Default*</span>: An empty spec will be created.



### Properties


Name | Type | Description 
-----|------|-------------
**metadata**🔹 | <code>[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)</code> | Provides access to the pod metadata this template uses.
**podSpec**🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | Provides access to the pod spec this template uses.



## class Resource 🔹 <a id="cdk8s-plus-resource"></a>

Base class for all Kubernetes objects in stdk8s.

Represents a single
resource.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Construct](#constructs-construct)
<span style="text-decoration: underline">Implemented by</span>: [ConfigMap](#cdk8s-plus-configmap), [Deployment](#cdk8s-plus-deployment), [Job](#cdk8s-plus-job), [Pod](#cdk8s-plus-pod), [PodTemplate](#cdk8s-plus-podtemplate), [Secret](#cdk8s-plus-secret), [Service](#cdk8s-plus-service), [ServiceAccount](#cdk8s-plus-serviceaccount)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Resource(scope: Construct, id: string, _: ResourceProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **_** (<code>[ResourceProps](#cdk8s-plus-resourceprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**metadata**🔹 | <code>[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)</code> | <span></span>
**name**🔹 | <code>string</code> | The name of this API object.



## class Secret 🔹 <a id="cdk8s-plus-secret"></a>

Kubernetes Secrets let you store and manage sensitive information, such as passwords, OAuth tokens, and ssh keys.

Storing confidential information in a
Secret is safer and more flexible than putting it verbatim in a Pod
definition or in a container image.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource), [ISecret](#cdk8s-plus-isecret), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Secret(scope: Construct, id: string, props?: SecretProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[SecretProps](#cdk8s-plus-secretprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.

### Methods


#### addStringData(key, value)🔹 <a id="cdk8s-plus-secret-addstringdata"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
addStringData(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*
* **value** (<code>string</code>)  *No description*




#### *static* fromSecretName(name)🔹 <a id="cdk8s-plus-secret-fromsecretname"></a>

Imports a secret from the cluster as a reference.

<span style="text-decoration: underline">Usage:</span>

```ts
static fromSecretName(name: string): ISecret
```

<span style="text-decoration: underline">Parameters:</span>
* **name** (<code>string</code>)  The name of the secret to reference.

<span style="text-decoration: underline">Returns</span>:
* <code>[ISecret](#cdk8s-plus-isecret)</code>



## class Service 🔹 <a id="cdk8s-plus-service"></a>

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

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Service(scope: Construct, id: string, props?: ServiceProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ServiceProps](#cdk8s-plus-serviceprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[ServiceSpec](#cdk8s-plus-servicespec)</code>)  The spec of the service. <span style="text-decoration: underline">*Default*</span>: An empty spec will be created.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[ServiceSpec](#cdk8s-plus-servicespec)</code> | Provides access to the underlying spec.



## class ServiceAccount 🔹 <a id="cdk8s-plus-serviceaccount"></a>

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the apiserver.
When they do, they are authenticated as a particular Service Account (for
example, default).

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource), [IServiceAccount](#cdk8s-plus-iserviceaccount), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new ServiceAccount(scope: Construct, id: string, props?: ServiceAccountProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ServiceAccountProps](#cdk8s-plus-serviceaccountprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **secrets** (<code>Array<[ISecret](#cdk8s-plus-isecret)></code>)  List of secrets allowed to be used by pods running using this ServiceAccount. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**secrets**🔹 | <code>Array<[ISecret](#cdk8s-plus-isecret)></code> | List of secrets allowed to be used by pods running using this ServiceAccount.

### Methods


#### addSecret(secret)🔹 <a id="cdk8s-plus-serviceaccount-addsecret"></a>

Allow a secret to be accessed by pods using this service account.

<span style="text-decoration: underline">Usage:</span>

```ts
addSecret(secret: ISecret): void
```

<span style="text-decoration: underline">Parameters:</span>
* **secret** (<code>[ISecret](#cdk8s-plus-isecret)</code>)  The secret.




#### *static* fromServiceAccountName(name)🔹 <a id="cdk8s-plus-serviceaccount-fromserviceaccountname"></a>

Imports a service account from the cluster as a reference.

<span style="text-decoration: underline">Usage:</span>

```ts
static fromServiceAccountName(name: string): IServiceAccount
```

<span style="text-decoration: underline">Parameters:</span>
* **name** (<code>string</code>)  The name of the service account resource.

<span style="text-decoration: underline">Returns</span>:
* <code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code>



## class ServiceSpec 🔹 <a id="cdk8s-plus-servicespec"></a>

A description of a service.


### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new ServiceSpec(props?: ServiceSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[ServiceSpecProps](#cdk8s-plus-servicespecprops)</code>)  *No description*
  * **clusterIP** (<code>string</code>)  clusterIP is the IP address of the service and is usually assigned randomly by the master. <span style="text-decoration: underline">*Default*</span>: Automatically assigned.
  * **externalIPs** (<code>Array<string></code>)  externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service. <span style="text-decoration: underline">*Default*</span>: No external IPs.
  * **ports** (<code>Array<[ServicePort](#cdk8s-plus-serviceport)></code>)  The port exposed by this service. <span style="text-decoration: underline">*Optional*</span>
  * **type** (<code>[ServiceType](#cdk8s-plus-servicetype)</code>)  type determines how the Service is exposed. <span style="text-decoration: underline">*Default*</span>: 'ClusterIP'.


### Methods


#### selectByLabel(key, value)🔹 <a id="cdk8s-plus-servicespec-selectbylabel"></a>

Services defined using this spec will select pods according the provided label.

<span style="text-decoration: underline">Usage:</span>

```ts
selectByLabel(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  The label key.
* **value** (<code>string</code>)  The label value.




#### serve(port)🔹 <a id="cdk8s-plus-servicespec-serve"></a>

Configure a port the service will bind to.

This method can be called multiple times.

<span style="text-decoration: underline">Usage:</span>

```ts
serve(port: ServicePort): void
```

<span style="text-decoration: underline">Parameters:</span>
* **port** (<code>[ServicePort](#cdk8s-plus-serviceport)</code>)  The port definition.
  * **port** (<code>number</code>)  The port number the service will bind to. 
  * **targetPort** (<code>number</code>)  The port number the service will redirect to. <span style="text-decoration: underline">*Default*</span>: The value of `port` will be used.






## class Size 🔹 <a id="cdk8s-plus-size"></a>

Represents the amount of digital storage.

The amount can be specified either as a literal value (e.g: `10`) which
cannot be negative, or as an unresolved number token.

When the amount is passed as a token, unit conversion is not possible.


### Methods


#### toGibibytes(opts?)🔹 <a id="cdk8s-plus-size-togibibytes"></a>

Return this storage as a total number of gibibytes.

<span style="text-decoration: underline">Usage:</span>

```ts
toGibibytes(opts?: SizeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. <span style="text-decoration: underline">*Default*</span>: SizeRoundingBehavior.FAIL

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toKibibytes(opts?)🔹 <a id="cdk8s-plus-size-tokibibytes"></a>

Return this storage as a total number of kibibytes.

<span style="text-decoration: underline">Usage:</span>

```ts
toKibibytes(opts?: SizeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. <span style="text-decoration: underline">*Default*</span>: SizeRoundingBehavior.FAIL

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toMebibytes(opts?)🔹 <a id="cdk8s-plus-size-tomebibytes"></a>

Return this storage as a total number of mebibytes.

<span style="text-decoration: underline">Usage:</span>

```ts
toMebibytes(opts?: SizeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. <span style="text-decoration: underline">*Default*</span>: SizeRoundingBehavior.FAIL

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toPebibytes(opts?)🔹 <a id="cdk8s-plus-size-topebibytes"></a>

Return this storage as a total number of pebibytes.

<span style="text-decoration: underline">Usage:</span>

```ts
toPebibytes(opts?: SizeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. <span style="text-decoration: underline">*Default*</span>: SizeRoundingBehavior.FAIL

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toTebibytes(opts?)🔹 <a id="cdk8s-plus-size-totebibytes"></a>

Return this storage as a total number of tebibytes.

<span style="text-decoration: underline">Usage:</span>

```ts
toTebibytes(opts?: SizeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. <span style="text-decoration: underline">*Default*</span>: SizeRoundingBehavior.FAIL

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### *static* gibibytes(amount)🔹 <a id="cdk8s-plus-size-gibibytes"></a>

Create a Storage representing an amount gibibytes.

1 GiB = 1024 MiB

<span style="text-decoration: underline">Usage:</span>

```ts
static gibibytes(amount: number): Size
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[Size](#cdk8s-plus-size)</code>

#### *static* kibibytes(amount)🔹 <a id="cdk8s-plus-size-kibibytes"></a>

Create a Storage representing an amount kibibytes.

1 KiB = 1024 bytes

<span style="text-decoration: underline">Usage:</span>

```ts
static kibibytes(amount: number): Size
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[Size](#cdk8s-plus-size)</code>

#### *static* mebibytes(amount)🔹 <a id="cdk8s-plus-size-mebibytes"></a>

Create a Storage representing an amount mebibytes.

1 MiB = 1024 KiB

<span style="text-decoration: underline">Usage:</span>

```ts
static mebibytes(amount: number): Size
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[Size](#cdk8s-plus-size)</code>

#### *static* pebibyte(amount)🔹 <a id="cdk8s-plus-size-pebibyte"></a>

Create a Storage representing an amount pebibytes.

1 PiB = 1024 TiB

<span style="text-decoration: underline">Usage:</span>

```ts
static pebibyte(amount: number): Size
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[Size](#cdk8s-plus-size)</code>

#### *static* tebibytes(amount)🔹 <a id="cdk8s-plus-size-tebibytes"></a>

Create a Storage representing an amount tebibytes.

1 TiB = 1024 GiB

<span style="text-decoration: underline">Usage:</span>

```ts
static tebibytes(amount: number): Size
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[Size](#cdk8s-plus-size)</code>



## class Volume 🔹 <a id="cdk8s-plus-volume"></a>

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


### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Volume(name: string, config: any)
```

<span style="text-decoration: underline">Parameters:</span>
* **name** (<code>string</code>)  *No description*
* **config** (<code>any</code>)  *No description*



### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | <span></span>

### Methods


#### *static* fromConfigMap(configMap, options?)🔹 <a id="cdk8s-plus-volume-fromconfigmap"></a>

Populate the volume from a ConfigMap.

The configMap resource provides a way to inject configuration data into
Pods. The data stored in a ConfigMap object can be referenced in a volume
of type configMap and then consumed by containerized applications running
in a Pod.

When referencing a configMap object, you can simply provide its name in the
volume to reference it. You can also customize the path to use for a
specific entry in the ConfigMap.

<span style="text-decoration: underline">Usage:</span>

```ts
static fromConfigMap(configMap: IConfigMap, options?: ConfigMapVolumeOptions): Volume
```

<span style="text-decoration: underline">Parameters:</span>
* **configMap** (<code>[IConfigMap](#cdk8s-plus-iconfigmap)</code>)  The config map to use to populate the volume.
* **options** (<code>[ConfigMapVolumeOptions](#cdk8s-plus-configmapvolumeoptions)</code>)  Options.
  * **defaultMode** (<code>number</code>)  Mode bits to use on created files by default. <span style="text-decoration: underline">*Default*</span>: 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
  * **items** (<code>Map<string, [PathMapping](#cdk8s-plus-pathmapping)></code>)  If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. <span style="text-decoration: underline">*Default*</span>: no mapping
  * **name** (<code>string</code>)  The volume name. <span style="text-decoration: underline">*Default*</span>: auto-generated
  * **optional** (<code>boolean</code>)  Specify whether the ConfigMap or its keys must be defined. <span style="text-decoration: underline">*Default*</span>: undocumented

<span style="text-decoration: underline">Returns</span>:
* <code>[Volume](#cdk8s-plus-volume)</code>

#### *static* fromEmptyDir(name, options?)🔹 <a id="cdk8s-plus-volume-fromemptydir"></a>

An emptyDir volume is first created when a Pod is assigned to a Node, and exists as long as that Pod is running on that node.

As the name says, it is
initially empty. Containers in the Pod can all read and write the same
files in the emptyDir volume, though that volume can be mounted at the same
or different paths in each Container. When a Pod is removed from a node for
any reason, the data in the emptyDir is deleted forever.

<span style="text-decoration: underline">Usage:</span>

```ts
static fromEmptyDir(name: string, options?: EmptyDirVolumeOptions): Volume
```

<span style="text-decoration: underline">Parameters:</span>
* **name** (<code>string</code>)  *No description*
* **options** (<code>[EmptyDirVolumeOptions](#cdk8s-plus-emptydirvolumeoptions)</code>)  - Additional options.
  * **medium** (<code>[EmptyDirMedium](#cdk8s-plus-emptydirmedium)</code>)  By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment. <span style="text-decoration: underline">*Default*</span>: EmptyDirMedium.DEFAULT
  * **sizeLimit** (<code>[Size](#cdk8s-plus-size)</code>)  Total amount of local storage required for this EmptyDir volume. <span style="text-decoration: underline">*Default*</span>: limit is undefined

<span style="text-decoration: underline">Returns</span>:
* <code>[Volume](#cdk8s-plus-volume)</code>



## struct AddDirectoryOptions 🔹 <a id="cdk8s-plus-adddirectoryoptions"></a>


Options for `configmap.addDirectory()`.



Name | Type | Description 
-----|------|-------------
**exclude**?🔹 | <code>Array<string></code> | Glob patterns to exclude when adding files.<br/><span style="text-decoration: underline">*Default*</span>: include all files
**keyPrefix**?🔹 | <code>string</code> | A prefix to add to all keys in the config map.<br/><span style="text-decoration: underline">*Default*</span>: ""



## struct ConfigMapProps 🔹 <a id="cdk8s-plus-configmapprops"></a>


Properties for initialization of `ConfigMap`.



Name | Type | Description 
-----|------|-------------
**binaryData**?🔹 | <code>Map<string, string></code> | BinaryData contains the binary data.<br/><span style="text-decoration: underline">*Optional*</span>
**data**?🔹 | <code>Map<string, string></code> | Data contains the configuration data.<br/><span style="text-decoration: underline">*Optional*</span>
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct ConfigMapVolumeOptions 🔹 <a id="cdk8s-plus-configmapvolumeoptions"></a>


Options for the ConfigMap-based volume.



Name | Type | Description 
-----|------|-------------
**defaultMode**?🔹 | <code>number</code> | Mode bits to use on created files by default.<br/><span style="text-decoration: underline">*Default*</span>: 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
**items**?🔹 | <code>Map<string, [PathMapping](#cdk8s-plus-pathmapping)></code> | If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.<br/><span style="text-decoration: underline">*Default*</span>: no mapping
**name**?🔹 | <code>string</code> | The volume name.<br/><span style="text-decoration: underline">*Default*</span>: auto-generated
**optional**?🔹 | <code>boolean</code> | Specify whether the ConfigMap or its keys must be defined.<br/><span style="text-decoration: underline">*Default*</span>: undocumented



## struct ContainerProps 🔹 <a id="cdk8s-plus-containerprops"></a>


Properties for creating a container.



Name | Type | Description 
-----|------|-------------
**image**🔹 | <code>string</code> | Docker image name.
**command**?🔹 | <code>Array<string></code> | Entrypoint array.<br/><span style="text-decoration: underline">*Default*</span>: The docker image's ENTRYPOINT.
**env**?🔹 | <code>Map<string, [EnvValue](#cdk8s-plus-envvalue)></code> | List of environment variables to set in the container.<br/><span style="text-decoration: underline">*Default*</span>: No environment variables.
**name**?🔹 | <code>string</code> | Name of the container specified as a DNS_LABEL.<br/><span style="text-decoration: underline">*Default*</span>: 'main'
**port**?🔹 | <code>number</code> | Number of port to expose on the pod's IP address.<br/><span style="text-decoration: underline">*Default*</span>: No port is exposed.
**volumeMounts**?🔹 | <code>Array<[VolumeMount](#cdk8s-plus-volumemount)></code> | Pod volumes to mount into the container's filesystem.<br/><span style="text-decoration: underline">*Optional*</span>
**workingDir**?🔹 | <code>string</code> | Container's working directory.<br/><span style="text-decoration: underline">*Default*</span>: The container runtime's default.



## struct DeploymentProps 🔹 <a id="cdk8s-plus-deploymentprops"></a>


Properties for initialization of `Deployment`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[DeploymentSpec](#cdk8s-plus-deploymentspec)</code> | The spec of the deployment.<br/><span style="text-decoration: underline">*Default*</span>: An empty spec will be created.



## struct DeploymentSpecProps 🔹 <a id="cdk8s-plus-deploymentspecprops"></a>


Properties for initialization of `DeploymentSpec`.



Name | Type | Description 
-----|------|-------------
**replicas**?🔹 | <code>number</code> | Number of desired pods.<br/><span style="text-decoration: underline">*Default*</span>: 1
**template**?🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | The PodTemplateSpec that will be used by a deployment to create pods.<br/><span style="text-decoration: underline">*Optional*</span>



## struct EmptyDirVolumeOptions 🔹 <a id="cdk8s-plus-emptydirvolumeoptions"></a>


Options for volumes populated with an empty directory.



Name | Type | Description 
-----|------|-------------
**medium**?🔹 | <code>[EmptyDirMedium](#cdk8s-plus-emptydirmedium)</code> | By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment.<br/><span style="text-decoration: underline">*Default*</span>: EmptyDirMedium.DEFAULT
**sizeLimit**?🔹 | <code>[Size](#cdk8s-plus-size)</code> | Total amount of local storage required for this EmptyDir volume.<br/><span style="text-decoration: underline">*Default*</span>: limit is undefined



## struct EnvValueFromConfigMapOptions 🔹 <a id="cdk8s-plus-envvaluefromconfigmapoptions"></a>


Options to specify an envionment variable value from a ConfigMap key.



Name | Type | Description 
-----|------|-------------
**optional**?🔹 | <code>boolean</code> | Specify whether the ConfigMap or its key must be defined.<br/><span style="text-decoration: underline">*Default*</span>: false



## struct EnvValueFromProcessOptions 🔹 <a id="cdk8s-plus-envvaluefromprocessoptions"></a>


Options to specify an environment variable value from the process environment.



Name | Type | Description 
-----|------|-------------
**required**?🔹 | <code>boolean</code> | Specify whether the key must exist in the environment.<br/><span style="text-decoration: underline">*Default*</span>: false



## struct EnvValueFromSecretOptions 🔹 <a id="cdk8s-plus-envvaluefromsecretoptions"></a>


Options to specify an environment variable value from a Secret.



Name | Type | Description 
-----|------|-------------
**optional**?🔹 | <code>boolean</code> | Specify whether the Secret or its key must be defined.<br/><span style="text-decoration: underline">*Default*</span>: false



## struct ExposeOptions 🔹 <a id="cdk8s-plus-exposeoptions"></a>


Options for exposing a deployment via a service.



Name | Type | Description 
-----|------|-------------
**port**🔹 | <code>number</code> | The port number the service will bind to.
**serviceType**?🔹 | <code>[ServiceType](#cdk8s-plus-servicetype)</code> | The type of the exposed service.<br/><span style="text-decoration: underline">*Default*</span>: ClusterIP.



## interface IConfigMap 🔹 <a id="cdk8s-plus-iconfigmap"></a>

<span style="text-decoration: underline">Implemented by</span>: [ConfigMap](#cdk8s-plus-configmap)
<span style="text-decoration: underline">Obtainable from</span>: [ConfigMap](#cdk8s-plus-configmap).[fromConfigMapName](#cdk8s-plus-configmap#cdk8s-plus-configmap-fromconfigmapname)()

Represents a config map.

### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface IResource 🔹 <a id="cdk8s-plus-iresource"></a>

<span style="text-decoration: underline">Implemented by</span>: [ConfigMap](#cdk8s-plus-configmap), [Deployment](#cdk8s-plus-deployment), [Job](#cdk8s-plus-job), [Pod](#cdk8s-plus-pod), [PodTemplate](#cdk8s-plus-podtemplate), [Secret](#cdk8s-plus-secret), [Service](#cdk8s-plus-service), [ServiceAccount](#cdk8s-plus-serviceaccount)

Represents a resource.

### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface ISecret 🔹 <a id="cdk8s-plus-isecret"></a>

<span style="text-decoration: underline">Implemented by</span>: [Secret](#cdk8s-plus-secret)
<span style="text-decoration: underline">Obtainable from</span>: [Secret](#cdk8s-plus-secret).[fromSecretName](#cdk8s-plus-secret#cdk8s-plus-secret-fromsecretname)()



### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface IServiceAccount 🔹 <a id="cdk8s-plus-iserviceaccount"></a>

<span style="text-decoration: underline">Implemented by</span>: [ServiceAccount](#cdk8s-plus-serviceaccount)
<span style="text-decoration: underline">Obtainable from</span>: [ServiceAccount](#cdk8s-plus-serviceaccount).[fromServiceAccountName](#cdk8s-plus-serviceaccount#cdk8s-plus-serviceaccount-fromserviceaccountname)()



### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## struct JobProps 🔹 <a id="cdk8s-plus-jobprops"></a>


Properties for initialization of `Job`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[JobSpec](#cdk8s-plus-jobspec)</code> | The spec of the job.<br/><span style="text-decoration: underline">*Default*</span>: An empty spec will be created.



## struct JobSpecProps 🔹 <a id="cdk8s-plus-jobspecprops"></a>


Properties for initialization of `JobSpec`.



Name | Type | Description 
-----|------|-------------
**template**?🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | <span style="text-decoration: underline">*Optional*</span>
**ttlAfterFinished**?🔹 | <code>[Duration](#cdk8s-plus-duration)</code> | Limits the lifetime of a Job that has finished execution (either Complete or Failed).<br/><span style="text-decoration: underline">*Default*</span>: If this field is unset, the Job won't be automatically deleted.



## struct MountOptions 🔹 <a id="cdk8s-plus-mountoptions"></a>


Options for mounts.



Name | Type | Description 
-----|------|-------------
**propagation**?🔹 | <code>[MountPropagation](#cdk8s-plus-mountpropagation)</code> | Determines how mounts are propagated from the host to container and the other way around.<br/><span style="text-decoration: underline">*Default*</span>: MountPropagation.NONE
**readOnly**?🔹 | <code>boolean</code> | Mounted read-only if true, read-write otherwise (false or unspecified).<br/><span style="text-decoration: underline">*Default*</span>: false
**subPath**?🔹 | <code>string</code> | Path within the volume from which the container's volume should be mounted.).<br/><span style="text-decoration: underline">*Default*</span>: "" the volume's root
**subPathExpr**?🔹 | <code>string</code> | Expanded path within the volume from which the container's volume should be mounted.<br/><span style="text-decoration: underline">*Default*</span>: "" volume's root.



## struct PathMapping 🔹 <a id="cdk8s-plus-pathmapping"></a>


Maps a string key to a path within a volume.



Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | The relative path of the file to map the key to.
**mode**?🔹 | <code>number</code> | Optional: mode bits to use on this file, must be a value between 0 and 0777.<br/><span style="text-decoration: underline">*Optional*</span>



## struct PodProps 🔹 <a id="cdk8s-plus-podprops"></a>


Properties for initialization of `Pod`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | The spec of the pod.<br/><span style="text-decoration: underline">*Default*</span>: An empty spec will be created.



## struct PodSpecProps 🔹 <a id="cdk8s-plus-podspecprops"></a>


Properties for initialization of `PodSpec`.



Name | Type | Description 
-----|------|-------------
**containers**?🔹 | <code>Array<[Container](#cdk8s-plus-container)></code> | List of containers belonging to the pod.<br/><span style="text-decoration: underline">*Default*</span>: No containers. Note that a pod spec must include at least one container.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-restartpolicy)</code> | Restart policy for all containers within the pod.<br/><span style="text-decoration: underline">*Default*</span>: RestartPolicy.ALWAYS
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code> | A service account provides an identity for processes that run in a Pod.<br/><span style="text-decoration: underline">*Default*</span>: No service account.
**volumes**?🔹 | <code>Array<[Volume](#cdk8s-plus-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.<br/><span style="text-decoration: underline">*Default*</span>: No volumes.



## struct PodTemplateProps 🔹 <a id="cdk8s-plus-podtemplateprops"></a>


Properties for initialization of `PodTemplate`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | <span style="text-decoration: underline">*Optional*</span>



## struct PodTemplateSpecProps 🔹 <a id="cdk8s-plus-podtemplatespecprops"></a>


Properties for initialization of `PodTemplateSpec`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | The metadata of the pod that will be created based on the template.<br/><span style="text-decoration: underline">*Default*</span>: No metadata.
**podSpec**?🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | The spec of the pod that will be created based on the template.<br/><span style="text-decoration: underline">*Default*</span>: An empty spec will be created.



## struct ResourceProps 🔹 <a id="cdk8s-plus-resourceprops"></a>


Initialization properties for resources.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct SecretProps 🔹 <a id="cdk8s-plus-secretprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct ServiceAccountProps 🔹 <a id="cdk8s-plus-serviceaccountprops"></a>


Properties for initialization of `ServiceAccount`.

Properties for initialization of `ServiceAccount`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**secrets**?🔹 | <code>Array<[ISecret](#cdk8s-plus-isecret)></code> | List of secrets allowed to be used by pods running using this ServiceAccount.<br/><span style="text-decoration: underline">*Optional*</span>



## struct ServicePort 🔹 <a id="cdk8s-plus-serviceport"></a>


Definition of a service port.



Name | Type | Description 
-----|------|-------------
**port**🔹 | <code>number</code> | The port number the service will bind to.
**targetPort**?🔹 | <code>number</code> | The port number the service will redirect to.<br/><span style="text-decoration: underline">*Default*</span>: The value of `port` will be used.



## struct ServiceProps 🔹 <a id="cdk8s-plus-serviceprops"></a>


Properties for initialization of `Service`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[ServiceSpec](#cdk8s-plus-servicespec)</code> | The spec of the service.<br/><span style="text-decoration: underline">*Default*</span>: An empty spec will be created.



## struct ServiceSpecProps 🔹 <a id="cdk8s-plus-servicespecprops"></a>


Properties for initialization of `ServiceSpec`.



Name | Type | Description 
-----|------|-------------
**clusterIP**?🔹 | <code>string</code> | clusterIP is the IP address of the service and is usually assigned randomly by the master.<br/><span style="text-decoration: underline">*Default*</span>: Automatically assigned.
**externalIPs**?🔹 | <code>Array<string></code> | externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.<br/><span style="text-decoration: underline">*Default*</span>: No external IPs.
**ports**?🔹 | <code>Array<[ServicePort](#cdk8s-plus-serviceport)></code> | The port exposed by this service.<br/><span style="text-decoration: underline">*Optional*</span>
**type**?🔹 | <code>[ServiceType](#cdk8s-plus-servicetype)</code> | type determines how the Service is exposed.<br/><span style="text-decoration: underline">*Default*</span>: 'ClusterIP'.



## struct SizeConversionOptions 🔹 <a id="cdk8s-plus-sizeconversionoptions"></a>


Options for how to convert time to a different unit.



Name | Type | Description 
-----|------|-------------
**rounding**?🔹 | <code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code> | How conversions should behave when it encounters a non-integer result.<br/><span style="text-decoration: underline">*Default*</span>: SizeRoundingBehavior.FAIL



## struct TimeConversionOptions 🔹 <a id="cdk8s-plus-timeconversionoptions"></a>


Options for how to convert time to a different unit.



Name | Type | Description 
-----|------|-------------
**integral**?🔹 | <code>boolean</code> | If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer.<br/><span style="text-decoration: underline">*Default*</span>: true



## struct VolumeMount 🔹 <a id="cdk8s-plus-volumemount"></a>


Mount a volume from the pod to the container.



Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | Path within the container at which the volume should be mounted.
**volume**🔹 | <code>[Volume](#cdk8s-plus-volume)</code> | The volume to mount.
**propagation**?🔹 | <code>[MountPropagation](#cdk8s-plus-mountpropagation)</code> | Determines how mounts are propagated from the host to container and the other way around.<br/><span style="text-decoration: underline">*Default*</span>: MountPropagation.NONE
**readOnly**?🔹 | <code>boolean</code> | Mounted read-only if true, read-write otherwise (false or unspecified).<br/><span style="text-decoration: underline">*Default*</span>: false
**subPath**?🔹 | <code>string</code> | Path within the volume from which the container's volume should be mounted.).<br/><span style="text-decoration: underline">*Default*</span>: "" the volume's root
**subPathExpr**?🔹 | <code>string</code> | Expanded path within the volume from which the container's volume should be mounted.<br/><span style="text-decoration: underline">*Default*</span>: "" volume's root.



## enum EmptyDirMedium 🔹 <a id="cdk8s-plus-emptydirmedium"></a>

The medium on which to store the volume.

Name | Description
-----|-----
**DEFAULT** 🔹|The default volume of the backing node.
**MEMORY** 🔹|Mount a tmpfs (RAM-backed filesystem) for you instead.


## enum MountPropagation 🔹 <a id="cdk8s-plus-mountpropagation"></a>



Name | Description
-----|-----
**NONE** 🔹|This volume mount will not receive any subsequent mounts that are mounted to this volume or any of its subdirectories by the host.
**HOST_TO_CONTAINER** 🔹|This volume mount will receive all subsequent mounts that are mounted to this volume or any of its subdirectories.
**BIDIRECTIONAL** 🔹|This volume mount behaves the same the HostToContainer mount.


## enum RestartPolicy 🔹 <a id="cdk8s-plus-restartpolicy"></a>

Restart policy for all containers within the pod.

Name | Description
-----|-----
**ALWAYS** 🔹|Always restart the pod after it exits.
**ON_FAILURE** 🔹|Only restart if the pod exits with a non-zero exit code.
**NEVER** 🔹|Never restart the pod.


## enum ServiceType 🔹 <a id="cdk8s-plus-servicetype"></a>

For some parts of your application (for example, frontends) you may want to expose a Service onto an external IP address, that's outside of your cluster.

Kubernetes ServiceTypes allow you to specify what kind of Service you want.
The default is ClusterIP.

Name | Description
-----|-----
**CLUSTER_IP** 🔹|Exposes the Service on a cluster-internal IP.
**NODE_PORT** 🔹|Exposes the Service on each Node's IP at a static port (the NodePort).
**LOAD_BALANCER** 🔹|Exposes the Service externally using a cloud provider's load balancer.
**EXTERNAL_NAME** 🔹|Maps the Service to the contents of the externalName field (e.g. foo.bar.example.com), by returning a CNAME record with its value. No proxying of any kind is set up.


## enum SizeRoundingBehavior 🔹 <a id="cdk8s-plus-sizeroundingbehavior"></a>

Rounding behaviour when converting between units of `Size`.

Name | Description
-----|-----
**FAIL** 🔹|Fail the conversion if the result is not an integer.
**FLOOR** 🔹|If the result is not an integer, round it to the closest integer less than the result.
**NONE** 🔹|Don't round.


