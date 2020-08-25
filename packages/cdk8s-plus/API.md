# API Reference

**Classes**

Name|Description
----|-----------
[ConfigMap](#cdk8s-plus-configmap)|ConfigMap holds configuration data for pods to consume.
[Container](#cdk8s-plus-container)|A single application container that you want to run within a pod.
[Deployment](#cdk8s-plus-deployment)|A Deployment provides declarative updates for Pods and ReplicaSets.
[DeploymentSpecDefinition](#cdk8s-plus-deploymentspecdefinition)|DeploymentSpec is the specification of the desired behavior of the Deployment.
[Duration](#cdk8s-plus-duration)|Represents a length of time.
[EnvValue](#cdk8s-plus-envvalue)|Utility class for creating reading env values from various sources.
[Job](#cdk8s-plus-job)|A Job creates one or more Pods and ensures that a specified number of them successfully terminate.
[JobSpecDefinition](#cdk8s-plus-jobspecdefinition)|*No description*
[Pod](#cdk8s-plus-pod)|Pod is a collection of containers that can run on a host.
[PodSpecDefinition](#cdk8s-plus-podspecdefinition)|A description of a pod.
[Resource](#cdk8s-plus-resource)|Base class for all Kubernetes objects in stdk8s.
[Secret](#cdk8s-plus-secret)|Kubernetes Secrets let you store and manage sensitive information, such as passwords, OAuth tokens, and ssh keys.
[Service](#cdk8s-plus-service)|An abstract way to expose an application running on a set of Pods as a network service.
[ServiceAccount](#cdk8s-plus-serviceaccount)|A service account provides an identity for processes that run in a Pod.
[ServiceSpecDefinition](#cdk8s-plus-servicespecdefinition)|A description of a service.
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
[DeploymentSpec](#cdk8s-plus-deploymentspec)|Properties for initialization of `DeploymentSpec`.
[EmptyDirVolumeOptions](#cdk8s-plus-emptydirvolumeoptions)|Options for volumes populated with an empty directory.
[EnvValueFromConfigMapOptions](#cdk8s-plus-envvaluefromconfigmapoptions)|Options to specify an envionment variable value from a ConfigMap key.
[EnvValueFromProcessOptions](#cdk8s-plus-envvaluefromprocessoptions)|Options to specify an environment variable value from the process environment.
[EnvValueFromSecretOptions](#cdk8s-plus-envvaluefromsecretoptions)|Options to specify an environment variable value from a Secret.
[ExposeOptions](#cdk8s-plus-exposeoptions)|Options for exposing a deployment via a service.
[JobProps](#cdk8s-plus-jobprops)|Properties for initialization of `Job`.
[JobSpec](#cdk8s-plus-jobspec)|Properties for initialization of `JobSpec`.
[MountOptions](#cdk8s-plus-mountoptions)|Options for mounts.
[PathMapping](#cdk8s-plus-pathmapping)|Maps a string key to a path within a volume.
[PodProps](#cdk8s-plus-podprops)|Properties for initialization of `Pod`.
[PodSpec](#cdk8s-plus-podspec)|Properties for initialization of `PodSpec`.
[ResourceProps](#cdk8s-plus-resourceprops)|Initialization properties for resources.
[SecretProps](#cdk8s-plus-secretprops)|*No description*
[ServiceAccountProps](#cdk8s-plus-serviceaccountprops)|Properties for initialization of `ServiceAccount`.
[ServicePort](#cdk8s-plus-serviceport)|Definition of a service port.
[ServicePortOptions](#cdk8s-plus-serviceportoptions)|*No description*
[ServiceProps](#cdk8s-plus-serviceprops)|Properties for initialization of `Service`.
[ServiceSpec](#cdk8s-plus-servicespec)|Properties for initialization of `ServiceSpec`.
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
[Protocol](#cdk8s-plus-protocol)|*No description*
[RestartPolicy](#cdk8s-plus-restartpolicy)|Restart policy for all containers within the pod.
[ServiceType](#cdk8s-plus-servicetype)|For some parts of your application (for example, frontends) you may want to expose a Service onto an external IP address, that's outside of your cluster.
[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)|Rounding behaviour when converting between units of `Size`.



## class ConfigMap 🔹 <a id="cdk8s-plus-configmap"></a>

ConfigMap holds configuration data for pods to consume.

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource), [IConfigMap](#cdk8s-plus-iconfigmap), [IResource](#cdk8s-plus-iresource)
__Extends__: [Resource](#cdk8s-plus-resource)

### Initializer




```ts
new ConfigMap(scope: Construct, id: string, props?: ConfigMapProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ConfigMapProps](#cdk8s-plus-configmapprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **binaryData** (<code>Map<string, string></code>)  BinaryData contains the binary data. __*Optional*__
  * **data** (<code>Map<string, string></code>)  Data contains the configuration data. __*Optional*__



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**binaryData**🔹 | <code>Map<string, string></code> | The binary data associated with this config map.
**data**🔹 | <code>Map<string, string></code> | The data associated with this config map.

### Methods


#### addBinaryData(key, value)🔹 <a id="cdk8s-plus-configmap-addbinarydata"></a>

Adds a binary data entry to the config map.

BinaryData can contain byte
sequences that are not in the UTF-8 range.

```ts
addBinaryData(key: string, value: string): void
```

* **key** (<code>string</code>)  The key.
* **value** (<code>string</code>)  The value.




#### addData(key, value)🔹 <a id="cdk8s-plus-configmap-adddata"></a>

Adds a data entry to the config map.

```ts
addData(key: string, value: string): void
```

* **key** (<code>string</code>)  The key.
* **value** (<code>string</code>)  The value.




#### addDirectory(localDir, options?)🔹 <a id="cdk8s-plus-configmap-adddirectory"></a>

Adds a directory to the ConfigMap.

```ts
addDirectory(localDir: string, options?: AddDirectoryOptions): void
```

* **localDir** (<code>string</code>)  A path to a local directory.
* **options** (<code>[AddDirectoryOptions](#cdk8s-plus-adddirectoryoptions)</code>)  Options.
  * **exclude** (<code>Array<string></code>)  Glob patterns to exclude when adding files. __*Default*__: include all files
  * **keyPrefix** (<code>string</code>)  A prefix to add to all keys in the config map. __*Default*__: ""




#### addFile(localFile, key?)🔹 <a id="cdk8s-plus-configmap-addfile"></a>

Adds a file to the ConfigMap.

```ts
addFile(localFile: string, key?: string): void
```

* **localFile** (<code>string</code>)  The path to the local file.
* **key** (<code>string</code>)  The ConfigMap key (default to the file name).




#### *static* fromConfigMapName(name)🔹 <a id="cdk8s-plus-configmap-fromconfigmapname"></a>

Represents a ConfigMap created elsewhere.

```ts
static fromConfigMapName(name: string): IConfigMap
```

* **name** (<code>string</code>)  The name of the config map to import.

__Returns__:
* <code>[IConfigMap](#cdk8s-plus-iconfigmap)</code>



## class Container 🔹 <a id="cdk8s-plus-container"></a>

A single application container that you want to run within a pod.


### Initializer




```ts
new Container(props: ContainerProps)
```

* **props** (<code>[ContainerProps](#cdk8s-plus-containerprops)</code>)  *No description*
  * **image** (<code>string</code>)  Docker image name. 
  * **command** (<code>Array<string></code>)  Entrypoint array. __*Default*__: The docker image's ENTRYPOINT.
  * **env** (<code>Map<string, [EnvValue](#cdk8s-plus-envvalue)></code>)  List of environment variables to set in the container. __*Default*__: No environment variables.
  * **name** (<code>string</code>)  Name of the container specified as a DNS_LABEL. __*Default*__: 'main'
  * **port** (<code>number</code>)  Number of port to expose on the pod's IP address. __*Default*__: No port is exposed.
  * **volumeMounts** (<code>Array<[VolumeMount](#cdk8s-plus-volumemount)></code>)  Pod volumes to mount into the container's filesystem. __*Optional*__
  * **workingDir** (<code>string</code>)  Container's working directory. __*Default*__: The container runtime's default.



### Properties


Name | Type | Description 
-----|------|-------------
**env**🔹 | <code>Map<string, [EnvValue](#cdk8s-plus-envvalue)></code> | The environment variables for this container.
**image**🔹 | <code>string</code> | The container image.
**mounts**🔹 | <code>Array<[VolumeMount](#cdk8s-plus-volumemount)></code> | Volume mounts configured for this container.
**name**🔹 | <code>string</code> | The name of the container.
**command**?🔹 | <code>Array<string></code> | Entrypoint array (the command to execute when the container starts).<br/>__*Optional*__
**port**?🔹 | <code>number</code> | The port this container exposes.<br/>__*Optional*__
**workingDir**?🔹 | <code>string</code> | The working directory inside the container.<br/>__*Optional*__

### Methods


#### addEnv(name, value)🔹 <a id="cdk8s-plus-container-addenv"></a>

Add an environment value to the container.

The variable value can come
from various dynamic sources such a secrets of config maps.

```ts
addEnv(name: string, value: EnvValue): void
```

* **name** (<code>string</code>)  - The variable name.
* **value** (<code>[EnvValue](#cdk8s-plus-envvalue)</code>)  - The variable value.




#### mount(path, volume, options?)🔹 <a id="cdk8s-plus-container-mount"></a>

Mount a volume to a specific path so that it is accessible by the container.

Every pod that is configured to use this container will autmoatically have access to the volume.

```ts
mount(path: string, volume: Volume, options?: MountOptions): void
```

* **path** (<code>string</code>)  - The desired path in the container.
* **volume** (<code>[Volume](#cdk8s-plus-volume)</code>)  - The volume to mount.
* **options** (<code>[MountOptions](#cdk8s-plus-mountoptions)</code>)  *No description*
  * **propagation** (<code>[MountPropagation](#cdk8s-plus-mountpropagation)</code>)  Determines how mounts are propagated from the host to container and the other way around. __*Default*__: MountPropagation.NONE
  * **readOnly** (<code>boolean</code>)  Mounted read-only if true, read-write otherwise (false or unspecified). __*Default*__: false
  * **subPath** (<code>string</code>)  Path within the volume from which the container's volume should be mounted.). __*Default*__: "" the volume's root
  * **subPathExpr** (<code>string</code>)  Expanded path within the volume from which the container's volume should be mounted. __*Default*__: "" volume's root.






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

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
__Extends__: [Resource](#cdk8s-plus-resource)

### Initializer




```ts
new Deployment(scope: Construct, id: string, props?: DeploymentProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[DeploymentProps](#cdk8s-plus-deploymentprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **spec** (<code>[DeploymentSpec](#cdk8s-plus-deploymentspec)</code>)  The spec of the deployment. __*Default*__: An empty spec will be created.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[DeploymentSpecDefinition](#cdk8s-plus-deploymentspecdefinition)</code> | Provides access to the underlying spec.

### Methods


#### expose(options)🔹 <a id="cdk8s-plus-deployment-expose"></a>

Expose a deployment via a service.

This is equivalent to running `kubectl expose deployment <deployment-name>`.

```ts
expose(options: ExposeOptions): Service
```

* **options** (<code>[ExposeOptions](#cdk8s-plus-exposeoptions)</code>)  - Options.
  * **port** (<code>number</code>)  The port number the service will bind to. 
  * **serviceType** (<code>[ServiceType](#cdk8s-plus-servicetype)</code>)  The type of the exposed service. __*Default*__: ClusterIP.

__Returns__:
* <code>[Service](#cdk8s-plus-service)</code>



## class DeploymentSpecDefinition 🔹 <a id="cdk8s-plus-deploymentspecdefinition"></a>

DeploymentSpec is the specification of the desired behavior of the Deployment.


### Initializer




```ts
new DeploymentSpecDefinition(props?: DeploymentSpec)
```

* **props** (<code>[DeploymentSpec](#cdk8s-plus-deploymentspec)</code>)  *No description*
  * **podMetadataTemplate** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Template for pod metadata. __*Optional*__
  * **podSpecTemplate** (<code>[PodSpec](#cdk8s-plus-podspec)</code>)  Template for pod specs. __*Optional*__
  * **replicas** (<code>number</code>)  Number of desired pods. __*Default*__: 1



### Properties


Name | Type | Description 
-----|------|-------------
**labelSelector**🔹 | <code>Map<string, string></code> | The labels this deployment will match against in order to select pods.
**podMetadataTemplate**🔹 | <code>[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)</code> | Template for pod metadata.
**podSpecTemplate**🔹 | <code>[PodSpecDefinition](#cdk8s-plus-podspecdefinition)</code> | Provides access to the underlying pod template spec.
**replicas**?🔹 | <code>number</code> | Number of desired pods.<br/>__*Optional*__

### Methods


#### selectByLabel(key, value)🔹 <a id="cdk8s-plus-deploymentspecdefinition-selectbylabel"></a>

Configure a label selector to this deployment.

Pods that have the label will be selected by deployments configured with this spec.

```ts
selectByLabel(key: string, value: string): void
```

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

```ts
toDays(opts?: TimeConversionOptions): number
```

* **opts** (<code>[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. __*Default*__: true

__Returns__:
* <code>number</code>

#### toHours(opts?)🔹 <a id="cdk8s-plus-duration-tohours"></a>

Return the total number of hours in this Duration.

```ts
toHours(opts?: TimeConversionOptions): number
```

* **opts** (<code>[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. __*Default*__: true

__Returns__:
* <code>number</code>

#### toHumanString()🔹 <a id="cdk8s-plus-duration-tohumanstring"></a>

Turn this duration into a human-readable string.

```ts
toHumanString(): string
```


__Returns__:
* <code>string</code>

#### toISOString()⚠️ <a id="cdk8s-plus-duration-toisostring"></a>

Return an ISO 8601 representation of this period.

```ts
toISOString(): string
```


__Returns__:
* <code>string</code>

#### toIsoString()🔹 <a id="cdk8s-plus-duration-toisostring"></a>

Return an ISO 8601 representation of this period.

```ts
toIsoString(): string
```


__Returns__:
* <code>string</code>

#### toMilliseconds(opts?)🔹 <a id="cdk8s-plus-duration-tomilliseconds"></a>

Return the total number of milliseconds in this Duration.

```ts
toMilliseconds(opts?: TimeConversionOptions): number
```

* **opts** (<code>[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. __*Default*__: true

__Returns__:
* <code>number</code>

#### toMinutes(opts?)🔹 <a id="cdk8s-plus-duration-tominutes"></a>

Return the total number of minutes in this Duration.

```ts
toMinutes(opts?: TimeConversionOptions): number
```

* **opts** (<code>[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. __*Default*__: true

__Returns__:
* <code>number</code>

#### toSeconds(opts?)🔹 <a id="cdk8s-plus-duration-toseconds"></a>

Return the total number of seconds in this Duration.

```ts
toSeconds(opts?: TimeConversionOptions): number
```

* **opts** (<code>[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. __*Default*__: true

__Returns__:
* <code>number</code>

#### toString()🔹 <a id="cdk8s-plus-duration-tostring"></a>

Returns a string representation of this `Duration` that is also a Token that cannot be successfully resolved.

This
protects users against inadvertently stringifying a `Duration` object, when they should have called one of the
`to*` methods instead.

```ts
toString(): string
```


__Returns__:
* <code>string</code>

#### *static* days(amount)🔹 <a id="cdk8s-plus-duration-days"></a>

Create a Duration representing an amount of days.

```ts
static days(amount: number): Duration
```

* **amount** (<code>number</code>)  the amount of Days the `Duration` will represent.

__Returns__:
* <code>[Duration](#cdk8s-plus-duration)</code>

#### *static* hours(amount)🔹 <a id="cdk8s-plus-duration-hours"></a>

Create a Duration representing an amount of hours.

```ts
static hours(amount: number): Duration
```

* **amount** (<code>number</code>)  the amount of Hours the `Duration` will represent.

__Returns__:
* <code>[Duration](#cdk8s-plus-duration)</code>

#### *static* millis(amount)🔹 <a id="cdk8s-plus-duration-millis"></a>

Create a Duration representing an amount of milliseconds.

```ts
static millis(amount: number): Duration
```

* **amount** (<code>number</code>)  the amount of Milliseconds the `Duration` will represent.

__Returns__:
* <code>[Duration](#cdk8s-plus-duration)</code>

#### *static* minutes(amount)🔹 <a id="cdk8s-plus-duration-minutes"></a>

Create a Duration representing an amount of minutes.

```ts
static minutes(amount: number): Duration
```

* **amount** (<code>number</code>)  the amount of Minutes the `Duration` will represent.

__Returns__:
* <code>[Duration](#cdk8s-plus-duration)</code>

#### *static* parse(duration)🔹 <a id="cdk8s-plus-duration-parse"></a>

Parse a period formatted according to the ISO 8601 standard.

```ts
static parse(duration: string): Duration
```

* **duration** (<code>string</code>)  an ISO-formtted duration to be parsed.

__Returns__:
* <code>[Duration](#cdk8s-plus-duration)</code>

#### *static* seconds(amount)🔹 <a id="cdk8s-plus-duration-seconds"></a>

Create a Duration representing an amount of seconds.

```ts
static seconds(amount: number): Duration
```

* **amount** (<code>number</code>)  the amount of Seconds the `Duration` will represent.

__Returns__:
* <code>[Duration](#cdk8s-plus-duration)</code>



## class EnvValue 🔹 <a id="cdk8s-plus-envvalue"></a>

Utility class for creating reading env values from various sources.



### Properties


Name | Type | Description 
-----|------|-------------
**value**?🔹 | <code>any</code> | __*Optional*__
**valueFrom**?🔹 | <code>any</code> | __*Optional*__

### Methods


#### *static* fromConfigMap(configMap, key, options?)🔹 <a id="cdk8s-plus-envvalue-fromconfigmap"></a>

Create a value by reading a specific key inside a config map.

```ts
static fromConfigMap(configMap: IConfigMap, key: string, options?: EnvValueFromConfigMapOptions): EnvValue
```

* **configMap** (<code>[IConfigMap](#cdk8s-plus-iconfigmap)</code>)  - The config map.
* **key** (<code>string</code>)  - The key to extract the value from.
* **options** (<code>[EnvValueFromConfigMapOptions](#cdk8s-plus-envvaluefromconfigmapoptions)</code>)  - Additional options.
  * **optional** (<code>boolean</code>)  Specify whether the ConfigMap or its key must be defined. __*Default*__: false

__Returns__:
* <code>[EnvValue](#cdk8s-plus-envvalue)</code>

#### *static* fromProcess(key, options?)🔹 <a id="cdk8s-plus-envvalue-fromprocess"></a>

Create a value from a key in the current process environment.

```ts
static fromProcess(key: string, options?: EnvValueFromProcessOptions): EnvValue
```

* **key** (<code>string</code>)  - The key to read.
* **options** (<code>[EnvValueFromProcessOptions](#cdk8s-plus-envvaluefromprocessoptions)</code>)  - Additional options.
  * **required** (<code>boolean</code>)  Specify whether the key must exist in the environment. __*Default*__: false

__Returns__:
* <code>[EnvValue](#cdk8s-plus-envvalue)</code>

#### *static* fromSecret(secret, key, options?)🔹 <a id="cdk8s-plus-envvalue-fromsecret"></a>

Create a by reading a specific key inside a secret.

```ts
static fromSecret(secret: ISecret, key: string, options?: EnvValueFromSecretOptions): EnvValue
```

* **secret** (<code>[ISecret](#cdk8s-plus-isecret)</code>)  - The secret.
* **key** (<code>string</code>)  - The key.
* **options** (<code>[EnvValueFromSecretOptions](#cdk8s-plus-envvaluefromsecretoptions)</code>)  - Additional options.
  * **optional** (<code>boolean</code>)  Specify whether the Secret or its key must be defined. __*Default*__: false

__Returns__:
* <code>[EnvValue](#cdk8s-plus-envvalue)</code>

#### *static* fromValue(value)🔹 <a id="cdk8s-plus-envvalue-fromvalue"></a>

Create a value from the given argument.

```ts
static fromValue(value: string): EnvValue
```

* **value** (<code>string</code>)  - The value.

__Returns__:
* <code>[EnvValue](#cdk8s-plus-envvalue)</code>



## class Job 🔹 <a id="cdk8s-plus-job"></a>

A Job creates one or more Pods and ensures that a specified number of them successfully terminate.

As pods successfully complete,
the Job tracks the successful completions. When a specified number of successful completions is reached, the task (ie, Job) is complete.
Deleting a Job will clean up the Pods it created. A simple case is to create one Job object in order to reliably run one Pod to completion.
The Job object will start a new Pod if the first Pod fails or is deleted (for example due to a node hardware failure or a node reboot).
You can also use a Job to run multiple Pods in parallel.

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
__Extends__: [Resource](#cdk8s-plus-resource)

### Initializer




```ts
new Job(scope: Construct, id: string, props?: JobProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[JobProps](#cdk8s-plus-jobprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **spec** (<code>[JobSpec](#cdk8s-plus-jobspec)</code>)  The spec of the job. __*Default*__: An empty spec will be created.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[JobSpecDefinition](#cdk8s-plus-jobspecdefinition)</code> | <span></span>



## class JobSpecDefinition 🔹 <a id="cdk8s-plus-jobspecdefinition"></a>




### Initializer




```ts
new JobSpecDefinition(props?: JobSpec)
```

* **props** (<code>[JobSpec](#cdk8s-plus-jobspec)</code>)  *No description*
  * **podMetadataTemplate** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  The metadata of pods created by this job. __*Optional*__
  * **podSpecTemplate** (<code>[PodSpec](#cdk8s-plus-podspec)</code>)  The spec of pods created by this job. __*Optional*__
  * **ttlAfterFinished** (<code>[Duration](#cdk8s-plus-duration)</code>)  Limits the lifetime of a Job that has finished execution (either Complete or Failed). __*Default*__: If this field is unset, the Job won't be automatically deleted.



### Properties


Name | Type | Description 
-----|------|-------------
**podMetadataTemplate**🔹 | <code>[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)</code> | The metadata for pods created by this job.
**podSpecTemplate**🔹 | <code>[PodSpecDefinition](#cdk8s-plus-podspecdefinition)</code> | The spec for pods created by this job.
**ttlAfterFinished**?🔹 | <code>[Duration](#cdk8s-plus-duration)</code> | TTL before the job is deleted after it is finished.<br/>__*Optional*__



## class Pod 🔹 <a id="cdk8s-plus-pod"></a>

Pod is a collection of containers that can run on a host.

This resource is
created by clients and scheduled onto hosts.

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
__Extends__: [Resource](#cdk8s-plus-resource)

### Initializer




```ts
new Pod(scope: Construct, id: string, props?: PodProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[PodProps](#cdk8s-plus-podprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **spec** (<code>[PodSpec](#cdk8s-plus-podspec)</code>)  The spec of the pod. __*Default*__: An empty spec will be created.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[PodSpecDefinition](#cdk8s-plus-podspecdefinition)</code> | Provides access to the underlying spec.



## class PodSpecDefinition 🔹 <a id="cdk8s-plus-podspecdefinition"></a>

A description of a pod.


### Initializer




```ts
new PodSpecDefinition(props?: PodSpec)
```

* **props** (<code>[PodSpec](#cdk8s-plus-podspec)</code>)  *No description*
  * **containers** (<code>Array<[Container](#cdk8s-plus-container)></code>)  List of containers belonging to the pod. __*Default*__: No containers. Note that a pod spec must include at least one container.
  * **restartPolicy** (<code>[RestartPolicy](#cdk8s-plus-restartpolicy)</code>)  Restart policy for all containers within the pod. __*Default*__: RestartPolicy.ALWAYS
  * **serviceAccount** (<code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code>)  A service account provides an identity for processes that run in a Pod. __*Default*__: No service account.
  * **volumes** (<code>Array<[Volume](#cdk8s-plus-volume)></code>)  List of volumes that can be mounted by containers belonging to the pod. __*Default*__: No volumes.



### Properties


Name | Type | Description 
-----|------|-------------
**containers**🔹 | <code>Array<[Container](#cdk8s-plus-container)></code> | List of containers belonging to the pod.
**volumes**🔹 | <code>Array<[Volume](#cdk8s-plus-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Optional*__
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code> | The service account used to run this pod.<br/>__*Optional*__

### Methods


#### addContainer(container)🔹 <a id="cdk8s-plus-podspecdefinition-addcontainer"></a>

Adds a container to this pod.

```ts
addContainer(container: Container): void
```

* **container** (<code>[Container](#cdk8s-plus-container)</code>)  The container to add.




#### addVolume(volume)🔹 <a id="cdk8s-plus-podspecdefinition-addvolume"></a>

Adds a volume to this pod.

```ts
addVolume(volume: Volume): void
```

* **volume** (<code>[Volume](#cdk8s-plus-volume)</code>)  The volume to add.






## class Resource 🔹 <a id="cdk8s-plus-resource"></a>

Base class for all Kubernetes objects in stdk8s.

Represents a single
resource.

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
__Extends__: [Construct](#constructs-construct)
__Implemented by__: [ConfigMap](#cdk8s-plus-configmap), [Deployment](#cdk8s-plus-deployment), [Job](#cdk8s-plus-job), [Pod](#cdk8s-plus-pod), [Secret](#cdk8s-plus-secret), [Service](#cdk8s-plus-service), [ServiceAccount](#cdk8s-plus-serviceaccount)

### Initializer




```ts
new Resource(scope: Construct, id: string, _: ResourceProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **_** (<code>[ResourceProps](#cdk8s-plus-resourceprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__



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

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource), [ISecret](#cdk8s-plus-isecret), [IResource](#cdk8s-plus-iresource)
__Extends__: [Resource](#cdk8s-plus-resource)

### Initializer




```ts
new Secret(scope: Construct, id: string, props?: SecretProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[SecretProps](#cdk8s-plus-secretprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **stringData** (<code>Map<string, string></code>)  stringData allows specifying non-binary secret data in string form. __*Optional*__



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.

### Methods


#### addStringData(key, value)🔹 <a id="cdk8s-plus-secret-addstringdata"></a>

Adds a string data field to the secert.

```ts
addStringData(key: string, value: string): void
```

* **key** (<code>string</code>)  Key.
* **value** (<code>string</code>)  Value.




#### getStringData(key)🔹 <a id="cdk8s-plus-secret-getstringdata"></a>

Gets a string data by key or undefined.

```ts
getStringData(key: string): string
```

* **key** (<code>string</code>)  Key.

__Returns__:
* <code>string</code>

#### *static* fromSecretName(name)🔹 <a id="cdk8s-plus-secret-fromsecretname"></a>

Imports a secret from the cluster as a reference.

```ts
static fromSecretName(name: string): ISecret
```

* **name** (<code>string</code>)  The name of the secret to reference.

__Returns__:
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

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
__Extends__: [Resource](#cdk8s-plus-resource)

### Initializer




```ts
new Service(scope: Construct, id: string, props?: ServiceProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ServiceProps](#cdk8s-plus-serviceprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **spec** (<code>[ServiceSpec](#cdk8s-plus-servicespec)</code>)  The spec of the service. __*Default*__: An empty spec will be created.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[ServiceSpecDefinition](#cdk8s-plus-servicespecdefinition)</code> | Provides access to the underlying spec.



## class ServiceAccount 🔹 <a id="cdk8s-plus-serviceaccount"></a>

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the apiserver.
When they do, they are authenticated as a particular Service Account (for
example, default).

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource), [IServiceAccount](#cdk8s-plus-iserviceaccount), [IResource](#cdk8s-plus-iresource)
__Extends__: [Resource](#cdk8s-plus-resource)

### Initializer




```ts
new ServiceAccount(scope: Construct, id: string, props?: ServiceAccountProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ServiceAccountProps](#cdk8s-plus-serviceaccountprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **secrets** (<code>Array<[ISecret](#cdk8s-plus-isecret)></code>)  List of secrets allowed to be used by pods running using this ServiceAccount. __*Optional*__



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**secrets**🔹 | <code>Array<[ISecret](#cdk8s-plus-isecret)></code> | List of secrets allowed to be used by pods running using this service account.

### Methods


#### addSecret(secret)🔹 <a id="cdk8s-plus-serviceaccount-addsecret"></a>

Allow a secret to be accessed by pods using this service account.

```ts
addSecret(secret: ISecret): void
```

* **secret** (<code>[ISecret](#cdk8s-plus-isecret)</code>)  The secret.




#### *static* fromServiceAccountName(name)🔹 <a id="cdk8s-plus-serviceaccount-fromserviceaccountname"></a>

Imports a service account from the cluster as a reference.

```ts
static fromServiceAccountName(name: string): IServiceAccount
```

* **name** (<code>string</code>)  The name of the service account resource.

__Returns__:
* <code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code>



## class ServiceSpecDefinition 🔹 <a id="cdk8s-plus-servicespecdefinition"></a>

A description of a service.


### Initializer




```ts
new ServiceSpecDefinition(props?: ServiceSpec)
```

* **props** (<code>[ServiceSpec](#cdk8s-plus-servicespec)</code>)  *No description*
  * **clusterIP** (<code>string</code>)  The IP address of the service and is usually assigned randomly by the master. __*Default*__: Automatically assigned.
  * **externalIPs** (<code>Array<string></code>)  A list of IP addresses for which nodes in the cluster will also accept traffic for this service. __*Default*__: No external IPs.
  * **ports** (<code>Array<[ServicePort](#cdk8s-plus-serviceport)></code>)  The port exposed by this service. __*Optional*__
  * **type** (<code>[ServiceType](#cdk8s-plus-servicetype)</code>)  Determines how the Service is exposed. __*Default*__: ServiceType.ClusterIP



### Properties


Name | Type | Description 
-----|------|-------------
**selector**🔹 | <code>Map<string, string></code> | Returns the labels which are used to select pods for this service.
**type**🔹 | <code>[ServiceType](#cdk8s-plus-servicetype)</code> | Determines how the Service is exposed.
**clusterIP**?🔹 | <code>string</code> | The IP address of the service and is usually assigned randomly by the master.<br/>__*Optional*__

### Methods


#### addSelector(label, value)🔹 <a id="cdk8s-plus-servicespecdefinition-addselector"></a>

Services defined using this spec will select pods according the provided label.

```ts
addSelector(label: string, value: string): void
```

* **label** (<code>string</code>)  The label key.
* **value** (<code>string</code>)  The label value.




#### serve(port, options?)🔹 <a id="cdk8s-plus-servicespecdefinition-serve"></a>

Configure a port the service will bind to.

This method can be called multiple times.

```ts
serve(port: number, options?: ServicePortOptions): void
```

* **port** (<code>number</code>)  The port definition.
* **options** (<code>[ServicePortOptions](#cdk8s-plus-serviceportoptions)</code>)  *No description*
  * **name** (<code>string</code>)  The name of this port within the service. __*Optional*__
  * **nodePort** (<code>number</code>)  The port on each node on which this service is exposed when type=NodePort or LoadBalancer. __*Default*__: to auto-allocate a port if the ServiceType of this Service requires one.
  * **protocol** (<code>[Protocol](#cdk8s-plus-protocol)</code>)  The IP protocol for this port. __*Default*__: Protocol.TCP
  * **targetPort** (<code>number</code>)  The port number the service will redirect to. __*Default*__: The value of `port` will be used.






## class Size 🔹 <a id="cdk8s-plus-size"></a>

Represents the amount of digital storage.

The amount can be specified either as a literal value (e.g: `10`) which
cannot be negative, or as an unresolved number token.

When the amount is passed as a token, unit conversion is not possible.


### Methods


#### toGibibytes(opts?)🔹 <a id="cdk8s-plus-size-togibibytes"></a>

Return this storage as a total number of gibibytes.

```ts
toGibibytes(opts?: SizeConversionOptions): number
```

* **opts** (<code>[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. __*Default*__: SizeRoundingBehavior.FAIL

__Returns__:
* <code>number</code>

#### toKibibytes(opts?)🔹 <a id="cdk8s-plus-size-tokibibytes"></a>

Return this storage as a total number of kibibytes.

```ts
toKibibytes(opts?: SizeConversionOptions): number
```

* **opts** (<code>[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. __*Default*__: SizeRoundingBehavior.FAIL

__Returns__:
* <code>number</code>

#### toMebibytes(opts?)🔹 <a id="cdk8s-plus-size-tomebibytes"></a>

Return this storage as a total number of mebibytes.

```ts
toMebibytes(opts?: SizeConversionOptions): number
```

* **opts** (<code>[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. __*Default*__: SizeRoundingBehavior.FAIL

__Returns__:
* <code>number</code>

#### toPebibytes(opts?)🔹 <a id="cdk8s-plus-size-topebibytes"></a>

Return this storage as a total number of pebibytes.

```ts
toPebibytes(opts?: SizeConversionOptions): number
```

* **opts** (<code>[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. __*Default*__: SizeRoundingBehavior.FAIL

__Returns__:
* <code>number</code>

#### toTebibytes(opts?)🔹 <a id="cdk8s-plus-size-totebibytes"></a>

Return this storage as a total number of tebibytes.

```ts
toTebibytes(opts?: SizeConversionOptions): number
```

* **opts** (<code>[SizeConversionOptions](#cdk8s-plus-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. __*Default*__: SizeRoundingBehavior.FAIL

__Returns__:
* <code>number</code>

#### *static* gibibytes(amount)🔹 <a id="cdk8s-plus-size-gibibytes"></a>

Create a Storage representing an amount gibibytes.

1 GiB = 1024 MiB

```ts
static gibibytes(amount: number): Size
```

* **amount** (<code>number</code>)  *No description*

__Returns__:
* <code>[Size](#cdk8s-plus-size)</code>

#### *static* kibibytes(amount)🔹 <a id="cdk8s-plus-size-kibibytes"></a>

Create a Storage representing an amount kibibytes.

1 KiB = 1024 bytes

```ts
static kibibytes(amount: number): Size
```

* **amount** (<code>number</code>)  *No description*

__Returns__:
* <code>[Size](#cdk8s-plus-size)</code>

#### *static* mebibytes(amount)🔹 <a id="cdk8s-plus-size-mebibytes"></a>

Create a Storage representing an amount mebibytes.

1 MiB = 1024 KiB

```ts
static mebibytes(amount: number): Size
```

* **amount** (<code>number</code>)  *No description*

__Returns__:
* <code>[Size](#cdk8s-plus-size)</code>

#### *static* pebibyte(amount)🔹 <a id="cdk8s-plus-size-pebibyte"></a>

Create a Storage representing an amount pebibytes.

1 PiB = 1024 TiB

```ts
static pebibyte(amount: number): Size
```

* **amount** (<code>number</code>)  *No description*

__Returns__:
* <code>[Size](#cdk8s-plus-size)</code>

#### *static* tebibytes(amount)🔹 <a id="cdk8s-plus-size-tebibytes"></a>

Create a Storage representing an amount tebibytes.

1 TiB = 1024 GiB

```ts
static tebibytes(amount: number): Size
```

* **amount** (<code>number</code>)  *No description*

__Returns__:
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




```ts
new Volume(name: string, config: any)
```

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

```ts
static fromConfigMap(configMap: IConfigMap, options?: ConfigMapVolumeOptions): Volume
```

* **configMap** (<code>[IConfigMap](#cdk8s-plus-iconfigmap)</code>)  The config map to use to populate the volume.
* **options** (<code>[ConfigMapVolumeOptions](#cdk8s-plus-configmapvolumeoptions)</code>)  Options.
  * **defaultMode** (<code>number</code>)  Mode bits to use on created files by default. __*Default*__: 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
  * **items** (<code>Map<string, [PathMapping](#cdk8s-plus-pathmapping)></code>)  If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. __*Default*__: no mapping
  * **name** (<code>string</code>)  The volume name. __*Default*__: auto-generated
  * **optional** (<code>boolean</code>)  Specify whether the ConfigMap or its keys must be defined. __*Default*__: undocumented

__Returns__:
* <code>[Volume](#cdk8s-plus-volume)</code>

#### *static* fromEmptyDir(name, options?)🔹 <a id="cdk8s-plus-volume-fromemptydir"></a>

An emptyDir volume is first created when a Pod is assigned to a Node, and exists as long as that Pod is running on that node.

As the name says, it is
initially empty. Containers in the Pod can all read and write the same
files in the emptyDir volume, though that volume can be mounted at the same
or different paths in each Container. When a Pod is removed from a node for
any reason, the data in the emptyDir is deleted forever.

```ts
static fromEmptyDir(name: string, options?: EmptyDirVolumeOptions): Volume
```

* **name** (<code>string</code>)  *No description*
* **options** (<code>[EmptyDirVolumeOptions](#cdk8s-plus-emptydirvolumeoptions)</code>)  - Additional options.
  * **medium** (<code>[EmptyDirMedium](#cdk8s-plus-emptydirmedium)</code>)  By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment. __*Default*__: EmptyDirMedium.DEFAULT
  * **sizeLimit** (<code>[Size](#cdk8s-plus-size)</code>)  Total amount of local storage required for this EmptyDir volume. __*Default*__: limit is undefined

__Returns__:
* <code>[Volume](#cdk8s-plus-volume)</code>



## struct AddDirectoryOptions 🔹 <a id="cdk8s-plus-adddirectoryoptions"></a>


Options for `configmap.addDirectory()`.



Name | Type | Description 
-----|------|-------------
**exclude**?🔹 | <code>Array<string></code> | Glob patterns to exclude when adding files.<br/>__*Default*__: include all files
**keyPrefix**?🔹 | <code>string</code> | A prefix to add to all keys in the config map.<br/>__*Default*__: ""



## struct ConfigMapProps 🔹 <a id="cdk8s-plus-configmapprops"></a>


Properties for initialization of `ConfigMap`.



Name | Type | Description 
-----|------|-------------
**binaryData**?🔹 | <code>Map<string, string></code> | BinaryData contains the binary data.<br/>__*Optional*__
**data**?🔹 | <code>Map<string, string></code> | Data contains the configuration data.<br/>__*Optional*__
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__



## struct ConfigMapVolumeOptions 🔹 <a id="cdk8s-plus-configmapvolumeoptions"></a>


Options for the ConfigMap-based volume.



Name | Type | Description 
-----|------|-------------
**defaultMode**?🔹 | <code>number</code> | Mode bits to use on created files by default.<br/>__*Default*__: 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
**items**?🔹 | <code>Map<string, [PathMapping](#cdk8s-plus-pathmapping)></code> | If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.<br/>__*Default*__: no mapping
**name**?🔹 | <code>string</code> | The volume name.<br/>__*Default*__: auto-generated
**optional**?🔹 | <code>boolean</code> | Specify whether the ConfigMap or its keys must be defined.<br/>__*Default*__: undocumented



## struct ContainerProps 🔹 <a id="cdk8s-plus-containerprops"></a>


Properties for creating a container.



Name | Type | Description 
-----|------|-------------
**image**🔹 | <code>string</code> | Docker image name.
**command**?🔹 | <code>Array<string></code> | Entrypoint array.<br/>__*Default*__: The docker image's ENTRYPOINT.
**env**?🔹 | <code>Map<string, [EnvValue](#cdk8s-plus-envvalue)></code> | List of environment variables to set in the container.<br/>__*Default*__: No environment variables.
**name**?🔹 | <code>string</code> | Name of the container specified as a DNS_LABEL.<br/>__*Default*__: 'main'
**port**?🔹 | <code>number</code> | Number of port to expose on the pod's IP address.<br/>__*Default*__: No port is exposed.
**volumeMounts**?🔹 | <code>Array<[VolumeMount](#cdk8s-plus-volumemount)></code> | Pod volumes to mount into the container's filesystem.<br/>__*Optional*__
**workingDir**?🔹 | <code>string</code> | Container's working directory.<br/>__*Default*__: The container runtime's default.



## struct DeploymentProps 🔹 <a id="cdk8s-plus-deploymentprops"></a>


Properties for initialization of `Deployment`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**spec**?🔹 | <code>[DeploymentSpec](#cdk8s-plus-deploymentspec)</code> | The spec of the deployment.<br/>__*Default*__: An empty spec will be created.



## struct DeploymentSpec 🔹 <a id="cdk8s-plus-deploymentspec"></a>


Properties for initialization of `DeploymentSpec`.



Name | Type | Description 
-----|------|-------------
**podMetadataTemplate**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Template for pod metadata.<br/>__*Optional*__
**podSpecTemplate**?🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | Template for pod specs.<br/>__*Optional*__
**replicas**?🔹 | <code>number</code> | Number of desired pods.<br/>__*Default*__: 1



## struct EmptyDirVolumeOptions 🔹 <a id="cdk8s-plus-emptydirvolumeoptions"></a>


Options for volumes populated with an empty directory.



Name | Type | Description 
-----|------|-------------
**medium**?🔹 | <code>[EmptyDirMedium](#cdk8s-plus-emptydirmedium)</code> | By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment.<br/>__*Default*__: EmptyDirMedium.DEFAULT
**sizeLimit**?🔹 | <code>[Size](#cdk8s-plus-size)</code> | Total amount of local storage required for this EmptyDir volume.<br/>__*Default*__: limit is undefined



## struct EnvValueFromConfigMapOptions 🔹 <a id="cdk8s-plus-envvaluefromconfigmapoptions"></a>


Options to specify an envionment variable value from a ConfigMap key.



Name | Type | Description 
-----|------|-------------
**optional**?🔹 | <code>boolean</code> | Specify whether the ConfigMap or its key must be defined.<br/>__*Default*__: false



## struct EnvValueFromProcessOptions 🔹 <a id="cdk8s-plus-envvaluefromprocessoptions"></a>


Options to specify an environment variable value from the process environment.



Name | Type | Description 
-----|------|-------------
**required**?🔹 | <code>boolean</code> | Specify whether the key must exist in the environment.<br/>__*Default*__: false



## struct EnvValueFromSecretOptions 🔹 <a id="cdk8s-plus-envvaluefromsecretoptions"></a>


Options to specify an environment variable value from a Secret.



Name | Type | Description 
-----|------|-------------
**optional**?🔹 | <code>boolean</code> | Specify whether the Secret or its key must be defined.<br/>__*Default*__: false



## struct ExposeOptions 🔹 <a id="cdk8s-plus-exposeoptions"></a>


Options for exposing a deployment via a service.



Name | Type | Description 
-----|------|-------------
**port**🔹 | <code>number</code> | The port number the service will bind to.
**serviceType**?🔹 | <code>[ServiceType](#cdk8s-plus-servicetype)</code> | The type of the exposed service.<br/>__*Default*__: ClusterIP.



## interface IConfigMap 🔹 <a id="cdk8s-plus-iconfigmap"></a>

__Implemented by__: [ConfigMap](#cdk8s-plus-configmap)
__Obtainable from__: [ConfigMap](#cdk8s-plus-configmap).[fromConfigMapName](#cdk8s-plus-configmap#cdk8s-plus-configmap-fromconfigmapname)()

Represents a config map.

### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface IResource 🔹 <a id="cdk8s-plus-iresource"></a>

__Implemented by__: [ConfigMap](#cdk8s-plus-configmap), [Deployment](#cdk8s-plus-deployment), [Job](#cdk8s-plus-job), [Pod](#cdk8s-plus-pod), [Secret](#cdk8s-plus-secret), [Service](#cdk8s-plus-service), [ServiceAccount](#cdk8s-plus-serviceaccount)

Represents a resource.

### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface ISecret 🔹 <a id="cdk8s-plus-isecret"></a>

__Implemented by__: [Secret](#cdk8s-plus-secret)
__Obtainable from__: [Secret](#cdk8s-plus-secret).[fromSecretName](#cdk8s-plus-secret#cdk8s-plus-secret-fromsecretname)()



### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface IServiceAccount 🔹 <a id="cdk8s-plus-iserviceaccount"></a>

__Implemented by__: [ServiceAccount](#cdk8s-plus-serviceaccount)
__Obtainable from__: [ServiceAccount](#cdk8s-plus-serviceaccount).[fromServiceAccountName](#cdk8s-plus-serviceaccount#cdk8s-plus-serviceaccount-fromserviceaccountname)()



### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## struct JobProps 🔹 <a id="cdk8s-plus-jobprops"></a>


Properties for initialization of `Job`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**spec**?🔹 | <code>[JobSpec](#cdk8s-plus-jobspec)</code> | The spec of the job.<br/>__*Default*__: An empty spec will be created.



## struct JobSpec 🔹 <a id="cdk8s-plus-jobspec"></a>


Properties for initialization of `JobSpec`.



Name | Type | Description 
-----|------|-------------
**podMetadataTemplate**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | The metadata of pods created by this job.<br/>__*Optional*__
**podSpecTemplate**?🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | The spec of pods created by this job.<br/>__*Optional*__
**ttlAfterFinished**?🔹 | <code>[Duration](#cdk8s-plus-duration)</code> | Limits the lifetime of a Job that has finished execution (either Complete or Failed).<br/>__*Default*__: If this field is unset, the Job won't be automatically deleted.



## struct MountOptions 🔹 <a id="cdk8s-plus-mountoptions"></a>


Options for mounts.



Name | Type | Description 
-----|------|-------------
**propagation**?🔹 | <code>[MountPropagation](#cdk8s-plus-mountpropagation)</code> | Determines how mounts are propagated from the host to container and the other way around.<br/>__*Default*__: MountPropagation.NONE
**readOnly**?🔹 | <code>boolean</code> | Mounted read-only if true, read-write otherwise (false or unspecified).<br/>__*Default*__: false
**subPath**?🔹 | <code>string</code> | Path within the volume from which the container's volume should be mounted.).<br/>__*Default*__: "" the volume's root
**subPathExpr**?🔹 | <code>string</code> | Expanded path within the volume from which the container's volume should be mounted.<br/>__*Default*__: "" volume's root.



## struct PathMapping 🔹 <a id="cdk8s-plus-pathmapping"></a>


Maps a string key to a path within a volume.



Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | The relative path of the file to map the key to.
**mode**?🔹 | <code>number</code> | Optional: mode bits to use on this file, must be a value between 0 and 0777.<br/>__*Optional*__



## struct PodProps 🔹 <a id="cdk8s-plus-podprops"></a>


Properties for initialization of `Pod`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**spec**?🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | The spec of the pod.<br/>__*Default*__: An empty spec will be created.



## struct PodSpec 🔹 <a id="cdk8s-plus-podspec"></a>


Properties for initialization of `PodSpec`.



Name | Type | Description 
-----|------|-------------
**containers**?🔹 | <code>Array<[Container](#cdk8s-plus-container)></code> | List of containers belonging to the pod.<br/>__*Default*__: No containers. Note that a pod spec must include at least one container.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Default*__: RestartPolicy.ALWAYS
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code> | A service account provides an identity for processes that run in a Pod.<br/>__*Default*__: No service account.
**volumes**?🔹 | <code>Array<[Volume](#cdk8s-plus-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.<br/>__*Default*__: No volumes.



## struct ResourceProps 🔹 <a id="cdk8s-plus-resourceprops"></a>


Initialization properties for resources.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__



## struct SecretProps 🔹 <a id="cdk8s-plus-secretprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**stringData**?🔹 | <code>Map<string, string></code> | stringData allows specifying non-binary secret data in string form.<br/>__*Optional*__



## struct ServiceAccountProps 🔹 <a id="cdk8s-plus-serviceaccountprops"></a>


Properties for initialization of `ServiceAccount`.

Properties for initialization of `ServiceAccount`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**secrets**?🔹 | <code>Array<[ISecret](#cdk8s-plus-isecret)></code> | List of secrets allowed to be used by pods running using this ServiceAccount.<br/>__*Optional*__



## struct ServicePort 🔹 <a id="cdk8s-plus-serviceport"></a>


Definition of a service port.



Name | Type | Description 
-----|------|-------------
**port**🔹 | <code>number</code> | The port number the service will bind to.
**name**?🔹 | <code>string</code> | The name of this port within the service.<br/>__*Optional*__
**nodePort**?🔹 | <code>number</code> | The port on each node on which this service is exposed when type=NodePort or LoadBalancer.<br/>__*Default*__: to auto-allocate a port if the ServiceType of this Service requires one.
**protocol**?🔹 | <code>[Protocol](#cdk8s-plus-protocol)</code> | The IP protocol for this port.<br/>__*Default*__: Protocol.TCP
**targetPort**?🔹 | <code>number</code> | The port number the service will redirect to.<br/>__*Default*__: The value of `port` will be used.



## struct ServicePortOptions 🔹 <a id="cdk8s-plus-serviceportoptions"></a>






Name | Type | Description 
-----|------|-------------
**name**?🔹 | <code>string</code> | The name of this port within the service.<br/>__*Optional*__
**nodePort**?🔹 | <code>number</code> | The port on each node on which this service is exposed when type=NodePort or LoadBalancer.<br/>__*Default*__: to auto-allocate a port if the ServiceType of this Service requires one.
**protocol**?🔹 | <code>[Protocol](#cdk8s-plus-protocol)</code> | The IP protocol for this port.<br/>__*Default*__: Protocol.TCP
**targetPort**?🔹 | <code>number</code> | The port number the service will redirect to.<br/>__*Default*__: The value of `port` will be used.



## struct ServiceProps 🔹 <a id="cdk8s-plus-serviceprops"></a>


Properties for initialization of `Service`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**spec**?🔹 | <code>[ServiceSpec](#cdk8s-plus-servicespec)</code> | The spec of the service.<br/>__*Default*__: An empty spec will be created.



## struct ServiceSpec 🔹 <a id="cdk8s-plus-servicespec"></a>


Properties for initialization of `ServiceSpec`.



Name | Type | Description 
-----|------|-------------
**clusterIP**?🔹 | <code>string</code> | The IP address of the service and is usually assigned randomly by the master.<br/>__*Default*__: Automatically assigned.
**externalIPs**?🔹 | <code>Array<string></code> | A list of IP addresses for which nodes in the cluster will also accept traffic for this service.<br/>__*Default*__: No external IPs.
**ports**?🔹 | <code>Array<[ServicePort](#cdk8s-plus-serviceport)></code> | The port exposed by this service.<br/>__*Optional*__
**type**?🔹 | <code>[ServiceType](#cdk8s-plus-servicetype)</code> | Determines how the Service is exposed.<br/>__*Default*__: ServiceType.ClusterIP



## struct SizeConversionOptions 🔹 <a id="cdk8s-plus-sizeconversionoptions"></a>


Options for how to convert time to a different unit.



Name | Type | Description 
-----|------|-------------
**rounding**?🔹 | <code>[SizeRoundingBehavior](#cdk8s-plus-sizeroundingbehavior)</code> | How conversions should behave when it encounters a non-integer result.<br/>__*Default*__: SizeRoundingBehavior.FAIL



## struct TimeConversionOptions 🔹 <a id="cdk8s-plus-timeconversionoptions"></a>


Options for how to convert time to a different unit.



Name | Type | Description 
-----|------|-------------
**integral**?🔹 | <code>boolean</code> | If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer.<br/>__*Default*__: true



## struct VolumeMount 🔹 <a id="cdk8s-plus-volumemount"></a>


Mount a volume from the pod to the container.



Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | Path within the container at which the volume should be mounted.
**volume**🔹 | <code>[Volume](#cdk8s-plus-volume)</code> | The volume to mount.
**propagation**?🔹 | <code>[MountPropagation](#cdk8s-plus-mountpropagation)</code> | Determines how mounts are propagated from the host to container and the other way around.<br/>__*Default*__: MountPropagation.NONE
**readOnly**?🔹 | <code>boolean</code> | Mounted read-only if true, read-write otherwise (false or unspecified).<br/>__*Default*__: false
**subPath**?🔹 | <code>string</code> | Path within the volume from which the container's volume should be mounted.).<br/>__*Default*__: "" the volume's root
**subPathExpr**?🔹 | <code>string</code> | Expanded path within the volume from which the container's volume should be mounted.<br/>__*Default*__: "" volume's root.



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


## enum Protocol 🔹 <a id="cdk8s-plus-protocol"></a>



Name | Description
-----|-----
**TCP** 🔹|
**UDP** 🔹|
**SCTP** 🔹|


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


