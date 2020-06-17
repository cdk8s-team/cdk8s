# API Reference

**Classes**

Name|Description
----|-----------
[ConfigMap](#cdk8s-plus-configmap)|ConfigMap holds configuration data for pods to consume.
[Container](#cdk8s-plus-container)|A single application container that you want to run within a pod.
[Deployment](#cdk8s-plus-deployment)|*No description*
[DeploymentSpec](#cdk8s-plus-deploymentspec)|*No description*
[Duration](#cdk8s-plus-duration)|Represents a length of time.
[EnvValue](#cdk8s-plus-envvalue)|Utility class for creating reading env values from various sources.
[Job](#cdk8s-plus-job)|*No description*
[JobSpec](#cdk8s-plus-jobspec)|*No description*
[ObjectMeta](#cdk8s-plus-objectmeta)|*No description*
[Pod](#cdk8s-plus-pod)|Pod is a collection of containers that can run on a host.
[PodSpec](#cdk8s-plus-podspec)|A description of a pod.
[PodTemplate](#cdk8s-plus-podtemplate)|*No description*
[PodTemplateSpec](#cdk8s-plus-podtemplatespec)|*No description*
[Resource](#cdk8s-plus-resource)|Base class for all Kubernetes objects in stdk8s.
[Secret](#cdk8s-plus-secret)|*No description*
[Service](#cdk8s-plus-service)|*No description*
[ServiceAccount](#cdk8s-plus-serviceaccount)|*No description*
[ServiceSpec](#cdk8s-plus-servicespec)|*No description*
[Volume](#cdk8s-plus-volume)|*No description*
[VolumeMount](#cdk8s-plus-volumemount)|*No description*


**Structs**

Name|Description
----|-----------
[AddDirectoryOptions](#cdk8s-plus-adddirectoryoptions)|Options for `configmap.addDirectory()`.
[ConfigMapProps](#cdk8s-plus-configmapprops)|Initialization props for config maps.
[ConfigMapVolumeSource](#cdk8s-plus-configmapvolumesource)|*No description*
[ContainerProps](#cdk8s-plus-containerprops)|Properties for creating a container.
[DeploymentProps](#cdk8s-plus-deploymentprops)|*No description*
[DeploymentSpecProps](#cdk8s-plus-deploymentspecprops)|*No description*
[EnvValueFromConfigMapOptions](#cdk8s-plus-envvaluefromconfigmapoptions)|Options to specify an envionment variable value from a ConfigMap key.
[EnvValueFromProcessOptions](#cdk8s-plus-envvaluefromprocessoptions)|Options to specify an environment variable value from the process environment.
[EnvValueFromSecretOptions](#cdk8s-plus-envvaluefromsecretoptions)|Options to specify an environment variable value from a Secret.
[ExposeOptions](#cdk8s-plus-exposeoptions)|*No description*
[HostPathVolumeSource](#cdk8s-plus-hostpathvolumesource)|*No description*
[JobProps](#cdk8s-plus-jobprops)|*No description*
[JobSpecProps](#cdk8s-plus-jobspecprops)|*No description*
[ObjectMetaProps](#cdk8s-plus-objectmetaprops)|*No description*
[PodProps](#cdk8s-plus-podprops)|*No description*
[PodSpecProps](#cdk8s-plus-podspecprops)|Properties for initialization `PodSpec`.
[PodTemplateProps](#cdk8s-plus-podtemplateprops)|*No description*
[PodTemplateSpecProps](#cdk8s-plus-podtemplatespecprops)|*No description*
[ResourceProps](#cdk8s-plus-resourceprops)|Initialization properties for resources.
[SecretProps](#cdk8s-plus-secretprops)|*No description*
[ServiceAccountProps](#cdk8s-plus-serviceaccountprops)|*No description*
[ServicePort](#cdk8s-plus-serviceport)|*No description*
[ServiceProps](#cdk8s-plus-serviceprops)|*No description*
[ServiceSpecProps](#cdk8s-plus-servicespecprops)|*No description*
[TimeConversionOptions](#cdk8s-plus-timeconversionoptions)|Options for how to convert time to a different unit.
[VolumeMountProps](#cdk8s-plus-volumemountprops)|*No description*


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
[RestartPolicy](#cdk8s-plus-restartpolicy)|Restart policy for all containers within the pod.



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
  * **metadata** (<code>[ObjectMeta](#cdk8s-plus-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
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
  * **recursive** (<code>boolean</code>)  Whether to descend to subdirectories (not supported yet). <span style="text-decoration: underline">*Default*</span>: false




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
  * **workingDir** (<code>string</code>)  Container's working directory. <span style="text-decoration: underline">*Default*</span>: The container runtime's default.



### Properties


Name | Type | Description 
-----|------|-------------
**port**?🔹 | <code>number</code> | The port this conainer exposes.<br/><span style="text-decoration: underline">*Optional*</span>

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




#### mount(path, volume)🔹 <a id="cdk8s-plus-container-mount"></a>

Mount a volume to a specific path so that it is accessible by the container.

Every pod that is configured to use this container will autmoatically have access to the volume.

<span style="text-decoration: underline">Usage:</span>

```ts
mount(path: string, volume: Volume): void
```

<span style="text-decoration: underline">Parameters:</span>
* **path** (<code>string</code>)  - The desired path in the container.
* **volume** (<code>[Volume](#cdk8s-plus-volume)</code>)  - The volume to mount.






## class Deployment 🔹 <a id="cdk8s-plus-deployment"></a>



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
  * **metadata** (<code>[ObjectMeta](#cdk8s-plus-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[DeploymentSpec](#cdk8s-plus-deploymentspec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[DeploymentSpec](#cdk8s-plus-deploymentspec)</code> | <span></span>

### Methods


#### expose(options)🔹 <a id="cdk8s-plus-deployment-expose"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
expose(options: ExposeOptions): Service
```

<span style="text-decoration: underline">Parameters:</span>
* **options** (<code>[ExposeOptions](#cdk8s-plus-exposeoptions)</code>)  *No description*
  * **port** (<code>number</code>)  *No description* 

<span style="text-decoration: underline">Returns</span>:
* <code>[Service](#cdk8s-plus-service)</code>



## class DeploymentSpec 🔹 <a id="cdk8s-plus-deploymentspec"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new DeploymentSpec(props?: DeploymentSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[DeploymentSpecProps](#cdk8s-plus-deploymentspecprops)</code>)  *No description*
  * **replicas** (<code>number</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **template** (<code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**labels**🔹 | <code>Map<string, string></code> | <span></span>
**template**🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | <span></span>

### Methods


#### selectByLabel(key, value)🔹 <a id="cdk8s-plus-deploymentspec-selectbylabel"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
selectByLabel(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*
* **value** (<code>string</code>)  *No description*






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



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Job(scope: Construct, id: string, props: JobProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[JobProps](#cdk8s-plus-jobprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#cdk8s-plus-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[JobSpec](#cdk8s-plus-jobspec)</code>)  *No description* 



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[JobSpec](#cdk8s-plus-jobspec)</code> | <span></span>



## class JobSpec 🔹 <a id="cdk8s-plus-jobspec"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new JobSpec(props: JobSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[JobSpecProps](#cdk8s-plus-jobspecprops)</code>)  *No description*
  * **template** (<code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code>)  *No description* 
  * **ttlAfterFinished** (<code>[Duration](#cdk8s-plus-duration)</code>)  Limits the lifetime of a Job that has finished execution (either Complete or Failed). <span style="text-decoration: underline">*Default*</span>: If this field is unset, the Job won't be automatically deleted.



### Properties


Name | Type | Description 
-----|------|-------------
**template**🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | <span></span>
**ttlAfterFinished**?🔹 | <code>[Duration](#cdk8s-plus-duration)</code> | <span style="text-decoration: underline">*Optional*</span>



## class ObjectMeta 🔹 <a id="cdk8s-plus-objectmeta"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new ObjectMeta(props?: ObjectMetaProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[ObjectMetaProps](#cdk8s-plus-objectmetaprops)</code>)  *No description*
  * **annotations** (<code>Map<string, string></code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **clusterName** (<code>string</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **labels** (<code>Map<string, string></code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **name** (<code>string</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **namespace** (<code>string</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**annotations**🔹 | <code>Map<string, string></code> | <span></span>
**labels**🔹 | <code>Map<string, string></code> | <span></span>
**clusterName**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>
**name**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>
**namespace**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>

### Methods


#### addAnnotation(key, value)🔹 <a id="cdk8s-plus-objectmeta-addannotation"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
addAnnotation(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*
* **value** (<code>string</code>)  *No description*




#### addLabel(key, value)🔹 <a id="cdk8s-plus-objectmeta-addlabel"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
addLabel(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*
* **value** (<code>string</code>)  *No description*






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
  * **metadata** (<code>[ObjectMeta](#cdk8s-plus-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[PodSpec](#cdk8s-plus-podspec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | <span></span>



## class PodSpec 🔹 <a id="cdk8s-plus-podspec"></a>

A description of a pod.


### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new PodSpec(props?: PodSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[PodSpecProps](#cdk8s-plus-podspecprops)</code>)  *No description*
  * **containers** (<code>Array<[Container](#cdk8s-plus-container)></code>)  List of containers belonging to the pod. <span style="text-decoration: underline">*Optional*</span>
  * **restartPolicy** (<code>[RestartPolicy](#cdk8s-plus-restartpolicy)</code>)  Restart policy for all containers within the pod. <span style="text-decoration: underline">*Default*</span>: RestartPolicy.ALWAYS
  * **serviceAccout** (<code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code>)  A service account provides an identity for processes that run in a Pod. <span style="text-decoration: underline">*Optional*</span>
  * **volumes** (<code>Array<[Volume](#cdk8s-plus-volume)></code>)  List of volumes that can be mounted by containers belonging to the pod. <span style="text-decoration: underline">*Default*</span>: no volumes



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



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new PodTemplate(scope: Construct, name: string, props: PodTemplateProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **name** (<code>string</code>)  *No description*
* **props** (<code>[PodTemplateProps](#cdk8s-plus-podtemplateprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#cdk8s-plus-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code>)  *No description* 



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.



## class PodTemplateSpec 🔹 <a id="cdk8s-plus-podtemplatespec"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new PodTemplateSpec(props?: PodTemplateSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[PodTemplateSpecProps](#cdk8s-plus-podtemplatespecprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#cdk8s-plus-objectmeta)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **podSpec** (<code>[PodSpec](#cdk8s-plus-podspec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**metadata**🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | <span></span>
**podSpec**🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | <span></span>



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
new Resource(scope: Construct, id: string, props: ResourceProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ResourceProps](#cdk8s-plus-resourceprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#cdk8s-plus-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**name**🔹 | <code>string</code> | The name of this API object.
**metadata**?🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | The metadata associated with this resource.<br/><span style="text-decoration: underline">*Optional*</span>



## class Secret 🔹 <a id="cdk8s-plus-secret"></a>



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



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.

### Methods


#### addEnvVariable(key)🔹 <a id="cdk8s-plus-secret-addenvvariable"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
addEnvVariable(key: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*




#### *static* fromSecretName(name)🔹 <a id="cdk8s-plus-secret-fromsecretname"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromSecretName(name: string): ISecret
```

<span style="text-decoration: underline">Parameters:</span>
* **name** (<code>string</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[ISecret](#cdk8s-plus-isecret)</code>



## class Service 🔹 <a id="cdk8s-plus-service"></a>



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
  * **metadata** (<code>[ObjectMeta](#cdk8s-plus-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[ServiceSpec](#cdk8s-plus-servicespec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[ServiceSpec](#cdk8s-plus-servicespec)</code> | <span></span>



## class ServiceAccount 🔹 <a id="cdk8s-plus-serviceaccount"></a>



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-iresource), [IServiceAccount](#cdk8s-plus-iserviceaccount), [IResource](#cdk8s-plus-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#cdk8s-plus-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new ServiceAccount(scope: Construct, id: string, props: ServiceAccountProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ServiceAccountProps](#cdk8s-plus-serviceaccountprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#cdk8s-plus-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.

### Methods


#### *static* fromServiceAccountName(serviceAccountName)🔹 <a id="cdk8s-plus-serviceaccount-fromserviceaccountname"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromServiceAccountName(serviceAccountName: string): IServiceAccount
```

<span style="text-decoration: underline">Parameters:</span>
* **serviceAccountName** (<code>string</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code>



## class ServiceSpec 🔹 <a id="cdk8s-plus-servicespec"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new ServiceSpec(props?: ServiceSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[ServiceSpecProps](#cdk8s-plus-servicespecprops)</code>)  *No description*
  * **clusterIP** (<code>string</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **externalIPs** (<code>Array<string></code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **port** (<code>[ServicePort](#cdk8s-plus-serviceport)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **type** (<code>string</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>


### Methods


#### addExternalIP(ip)🔹 <a id="cdk8s-plus-servicespec-addexternalip"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
addExternalIP(ip: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **ip** (<code>string</code>)  *No description*




#### selectByLabel(key, value)🔹 <a id="cdk8s-plus-servicespec-selectbylabel"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
selectByLabel(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*
* **value** (<code>string</code>)  *No description*






## class Volume 🔹 <a id="cdk8s-plus-volume"></a>





### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | <span></span>
**configMap**?🔹 | <code>[ConfigMapVolumeSource](#cdk8s-plus-configmapvolumesource)</code> | <span style="text-decoration: underline">*Optional*</span>
**hostPath**?🔹 | <code>[HostPathVolumeSource](#cdk8s-plus-hostpathvolumesource)</code> | <span style="text-decoration: underline">*Optional*</span>

### Methods


#### *static* fromConfigMap(configMap)🔹 <a id="cdk8s-plus-volume-fromconfigmap"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromConfigMap(configMap: IConfigMap): Volume
```

<span style="text-decoration: underline">Parameters:</span>
* **configMap** (<code>[IConfigMap](#cdk8s-plus-iconfigmap)</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[Volume](#cdk8s-plus-volume)</code>

#### *static* fromDirectory(directory)🔹 <a id="cdk8s-plus-volume-fromdirectory"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromDirectory(directory: string): Volume
```

<span style="text-decoration: underline">Parameters:</span>
* **directory** (<code>string</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[Volume](#cdk8s-plus-volume)</code>



## class VolumeMount 🔹 <a id="cdk8s-plus-volumemount"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new VolumeMount(props: VolumeMountProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[VolumeMountProps](#cdk8s-plus-volumemountprops)</code>)  *No description*
  * **path** (<code>string</code>)  *No description* 
  * **volume** (<code>[Volume](#cdk8s-plus-volume)</code>)  *No description* 



### Properties


Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | <span></span>
**volume**🔹 | <code>[Volume](#cdk8s-plus-volume)</code> | <span></span>



## struct AddDirectoryOptions 🔹 <a id="cdk8s-plus-adddirectoryoptions"></a>


Options for `configmap.addDirectory()`.



Name | Type | Description 
-----|------|-------------
**exclude**?🔹 | <code>Array<string></code> | Glob patterns to exclude when adding files.<br/><span style="text-decoration: underline">*Default*</span>: include all files
**keyPrefix**?🔹 | <code>string</code> | A prefix to add to all keys in the config map.<br/><span style="text-decoration: underline">*Default*</span>: ""
**recursive**?🔹 | <code>boolean</code> | Whether to descend to subdirectories (not supported yet).<br/><span style="text-decoration: underline">*Default*</span>: false



## struct ConfigMapProps 🔹 <a id="cdk8s-plus-configmapprops"></a>


Initialization props for config maps.



Name | Type | Description 
-----|------|-------------
**binaryData**?🔹 | <code>Map<string, string></code> | BinaryData contains the binary data.<br/><span style="text-decoration: underline">*Optional*</span>
**data**?🔹 | <code>Map<string, string></code> | Data contains the configuration data.<br/><span style="text-decoration: underline">*Optional*</span>
**metadata**?🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct ConfigMapVolumeSource 🔹 <a id="cdk8s-plus-configmapvolumesource"></a>






Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | <span></span>



## struct ContainerProps 🔹 <a id="cdk8s-plus-containerprops"></a>


Properties for creating a container.



Name | Type | Description 
-----|------|-------------
**image**🔹 | <code>string</code> | Docker image name.
**command**?🔹 | <code>Array<string></code> | Entrypoint array.<br/><span style="text-decoration: underline">*Default*</span>: The docker image's ENTRYPOINT.
**env**?🔹 | <code>Map<string, [EnvValue](#cdk8s-plus-envvalue)></code> | List of environment variables to set in the container.<br/><span style="text-decoration: underline">*Default*</span>: No environment variables.
**name**?🔹 | <code>string</code> | Name of the container specified as a DNS_LABEL.<br/><span style="text-decoration: underline">*Default*</span>: 'main'
**port**?🔹 | <code>number</code> | Number of port to expose on the pod's IP address.<br/><span style="text-decoration: underline">*Default*</span>: No port is exposed.
**workingDir**?🔹 | <code>string</code> | Container's working directory.<br/><span style="text-decoration: underline">*Default*</span>: The container runtime's default.



## struct DeploymentProps 🔹 <a id="cdk8s-plus-deploymentprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[DeploymentSpec](#cdk8s-plus-deploymentspec)</code> | <span style="text-decoration: underline">*Optional*</span>



## struct DeploymentSpecProps 🔹 <a id="cdk8s-plus-deploymentspecprops"></a>






Name | Type | Description 
-----|------|-------------
**replicas**?🔹 | <code>number</code> | <span style="text-decoration: underline">*Optional*</span>
**template**?🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | <span style="text-decoration: underline">*Optional*</span>



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






Name | Type | Description 
-----|------|-------------
**port**🔹 | <code>number</code> | <span></span>



## struct HostPathVolumeSource 🔹 <a id="cdk8s-plus-hostpathvolumesource"></a>






Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | Path of the directory on the host.
**type**?🔹 | <code>string</code> | Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath.<br/><span style="text-decoration: underline">*Default*</span>: More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath



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






Name | Type | Description 
-----|------|-------------
**spec**🔹 | <code>[JobSpec](#cdk8s-plus-jobspec)</code> | <span></span>
**metadata**?🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct JobSpecProps 🔹 <a id="cdk8s-plus-jobspecprops"></a>






Name | Type | Description 
-----|------|-------------
**template**🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | <span></span>
**ttlAfterFinished**?🔹 | <code>[Duration](#cdk8s-plus-duration)</code> | Limits the lifetime of a Job that has finished execution (either Complete or Failed).<br/><span style="text-decoration: underline">*Default*</span>: If this field is unset, the Job won't be automatically deleted.



## struct ObjectMetaProps 🔹 <a id="cdk8s-plus-objectmetaprops"></a>






Name | Type | Description 
-----|------|-------------
**annotations**?🔹 | <code>Map<string, string></code> | <span style="text-decoration: underline">*Optional*</span>
**clusterName**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>
**labels**?🔹 | <code>Map<string, string></code> | <span style="text-decoration: underline">*Optional*</span>
**name**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>
**namespace**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>



## struct PodProps 🔹 <a id="cdk8s-plus-podprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | <span style="text-decoration: underline">*Optional*</span>



## struct PodSpecProps 🔹 <a id="cdk8s-plus-podspecprops"></a>


Properties for initialization `PodSpec`.



Name | Type | Description 
-----|------|-------------
**containers**?🔹 | <code>Array<[Container](#cdk8s-plus-container)></code> | List of containers belonging to the pod.<br/><span style="text-decoration: underline">*Optional*</span>
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-restartpolicy)</code> | Restart policy for all containers within the pod.<br/><span style="text-decoration: underline">*Default*</span>: RestartPolicy.ALWAYS
**serviceAccout**?🔹 | <code>[IServiceAccount](#cdk8s-plus-iserviceaccount)</code> | A service account provides an identity for processes that run in a Pod.<br/><span style="text-decoration: underline">*Optional*</span>
**volumes**?🔹 | <code>Array<[Volume](#cdk8s-plus-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.<br/><span style="text-decoration: underline">*Default*</span>: no volumes



## struct PodTemplateProps 🔹 <a id="cdk8s-plus-podtemplateprops"></a>






Name | Type | Description 
-----|------|-------------
**spec**🔹 | <code>[PodTemplateSpec](#cdk8s-plus-podtemplatespec)</code> | <span></span>
**metadata**?🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct PodTemplateSpecProps 🔹 <a id="cdk8s-plus-podtemplatespecprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | <span style="text-decoration: underline">*Optional*</span>
**podSpec**?🔹 | <code>[PodSpec](#cdk8s-plus-podspec)</code> | <span style="text-decoration: underline">*Optional*</span>



## struct ResourceProps 🔹 <a id="cdk8s-plus-resourceprops"></a>


Initialization properties for resources.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct SecretProps 🔹 <a id="cdk8s-plus-secretprops"></a>





## struct ServiceAccountProps 🔹 <a id="cdk8s-plus-serviceaccountprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct ServicePort 🔹 <a id="cdk8s-plus-serviceport"></a>






Name | Type | Description 
-----|------|-------------
**port**🔹 | <code>number</code> | <span></span>
**targetPort**?🔹 | <code>number</code> | <span style="text-decoration: underline">*Optional*</span>



## struct ServiceProps 🔹 <a id="cdk8s-plus-serviceprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#cdk8s-plus-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[ServiceSpec](#cdk8s-plus-servicespec)</code> | <span style="text-decoration: underline">*Optional*</span>



## struct ServiceSpecProps 🔹 <a id="cdk8s-plus-servicespecprops"></a>






Name | Type | Description 
-----|------|-------------
**clusterIP**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>
**externalIPs**?🔹 | <code>Array<string></code> | <span style="text-decoration: underline">*Optional*</span>
**port**?🔹 | <code>[ServicePort](#cdk8s-plus-serviceport)</code> | <span style="text-decoration: underline">*Optional*</span>
**type**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>



## struct TimeConversionOptions 🔹 <a id="cdk8s-plus-timeconversionoptions"></a>


Options for how to convert time to a different unit.



Name | Type | Description 
-----|------|-------------
**integral**?🔹 | <code>boolean</code> | If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer.<br/><span style="text-decoration: underline">*Default*</span>: true



## struct VolumeMountProps 🔹 <a id="cdk8s-plus-volumemountprops"></a>






Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | <span></span>
**volume**🔹 | <code>[Volume](#cdk8s-plus-volume)</code> | <span></span>



## enum RestartPolicy 🔹 <a id="cdk8s-plus-restartpolicy"></a>

Restart policy for all containers within the pod.

Name | Description
-----|-----
**ALWAYS** 🔹|Always restart the pod after it exits.
**ON_FAILURE** 🔹|Only restart if the pod exits with a non-zero exit code.
**NEVER** 🔹|Never restart the pod.


