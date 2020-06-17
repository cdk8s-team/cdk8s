# API Reference

**Classes**

Name|Description
----|-----------
[ConfigMap](#stdk8s-configmap)|ConfigMap holds configuration data for pods to consume.
[Container](#stdk8s-container)|*No description*
[Deployment](#stdk8s-deployment)|*No description*
[DeploymentSpec](#stdk8s-deploymentspec)|*No description*
[Duration](#stdk8s-duration)|Represents a length of time.
[EnvValue](#stdk8s-envvalue)|*No description*
[Job](#stdk8s-job)|*No description*
[JobSpec](#stdk8s-jobspec)|*No description*
[ObjectMeta](#stdk8s-objectmeta)|*No description*
[Pod](#stdk8s-pod)|Pod is a collection of containers that can run on a host.
[PodSpec](#stdk8s-podspec)|A description of a pod.
[PodTemplate](#stdk8s-podtemplate)|*No description*
[PodTemplateSpec](#stdk8s-podtemplatespec)|*No description*
[Resource](#stdk8s-resource)|Base class for all Kubernetes objects in stdk8s.
[Secret](#stdk8s-secret)|*No description*
[Service](#stdk8s-service)|*No description*
[ServiceAccount](#stdk8s-serviceaccount)|*No description*
[ServiceSpec](#stdk8s-servicespec)|*No description*
[Volume](#stdk8s-volume)|*No description*
[VolumeMount](#stdk8s-volumemount)|*No description*


**Structs**

Name|Description
----|-----------
[AddDirectoryOptions](#stdk8s-adddirectoryoptions)|Options for `configmap.addDirectory()`.
[ConfigMapProps](#stdk8s-configmapprops)|Initialization props for config maps.
[ConfigMapVolumeSource](#stdk8s-configmapvolumesource)|*No description*
[ContainerProps](#stdk8s-containerprops)|*No description*
[DeploymentProps](#stdk8s-deploymentprops)|*No description*
[DeploymentSpecProps](#stdk8s-deploymentspecprops)|*No description*
[EnvValueFromConfigMapOptions](#stdk8s-envvaluefromconfigmapoptions)|*No description*
[EnvValueFromProcessOptions](#stdk8s-envvaluefromprocessoptions)|*No description*
[EnvValueFromSecretOptions](#stdk8s-envvaluefromsecretoptions)|*No description*
[ExposeOptions](#stdk8s-exposeoptions)|*No description*
[HostPathVolumeSource](#stdk8s-hostpathvolumesource)|*No description*
[JobProps](#stdk8s-jobprops)|*No description*
[JobSpecProps](#stdk8s-jobspecprops)|*No description*
[ObjectMetaProps](#stdk8s-objectmetaprops)|*No description*
[PodProps](#stdk8s-podprops)|*No description*
[PodSpecProps](#stdk8s-podspecprops)|Properties for initialization `PodSpec`.
[PodTemplateProps](#stdk8s-podtemplateprops)|*No description*
[PodTemplateSpecProps](#stdk8s-podtemplatespecprops)|*No description*
[ResourceProps](#stdk8s-resourceprops)|Initialization properties for resources.
[SecretProps](#stdk8s-secretprops)|*No description*
[ServiceAccountProps](#stdk8s-serviceaccountprops)|*No description*
[ServicePort](#stdk8s-serviceport)|*No description*
[ServiceProps](#stdk8s-serviceprops)|*No description*
[ServiceSpecProps](#stdk8s-servicespecprops)|*No description*
[TimeConversionOptions](#stdk8s-timeconversionoptions)|Options for how to convert time to a different unit.
[VolumeMountProps](#stdk8s-volumemountprops)|*No description*


**Interfaces**

Name|Description
----|-----------
[IConfigMap](#stdk8s-iconfigmap)|Represents a config map.
[IResource](#stdk8s-iresource)|Represents a resource.
[ISecret](#stdk8s-isecret)|*No description*
[IServiceAccount](#stdk8s-iserviceaccount)|*No description*


**Enums**

Name|Description
----|-----------
[RestartPolicy](#stdk8s-restartpolicy)|Restart policy for all containers within the pod.



## class ConfigMap 🔹 <a id="stdk8s-configmap"></a>

ConfigMap holds configuration data for pods to consume.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#stdk8s-iresource), [IConfigMap](#stdk8s-iconfigmap), [IResource](#stdk8s-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#stdk8s-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new ConfigMap(scope: Construct, id: string, props?: ConfigMapProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ConfigMapProps](#stdk8s-configmapprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#stdk8s-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **binaryData** (<code>Map<string, string></code>)  BinaryData contains the binary data. <span style="text-decoration: underline">*Optional*</span>
  * **data** (<code>Map<string, string></code>)  Data contains the configuration data. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.

### Methods


#### addBinaryData(key, value)🔹 <a id="stdk8s-configmap-addbinarydata"></a>

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




#### addData(key, value)🔹 <a id="stdk8s-configmap-adddata"></a>

Adds a data entry to the config map.

<span style="text-decoration: underline">Usage:</span>

```ts
addData(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  The key.
* **value** (<code>string</code>)  The value.




#### addDirectory(localDir, options?)🔹 <a id="stdk8s-configmap-adddirectory"></a>

Adds a directory to the ConfigMap.

<span style="text-decoration: underline">Usage:</span>

```ts
addDirectory(localDir: string, options?: AddDirectoryOptions): void
```

<span style="text-decoration: underline">Parameters:</span>
* **localDir** (<code>string</code>)  A path to a local directory.
* **options** (<code>[AddDirectoryOptions](#stdk8s-adddirectoryoptions)</code>)  Options.
  * **exclude** (<code>Array<string></code>)  Glob patterns to exclude when adding files. <span style="text-decoration: underline">*Default*</span>: include all files
  * **keyPrefix** (<code>string</code>)  A prefix to add to all keys in the config map. <span style="text-decoration: underline">*Default*</span>: ""
  * **recursive** (<code>boolean</code>)  Whether to descend to subdirectories (not supported yet). <span style="text-decoration: underline">*Default*</span>: false




#### addFile(localFile, key?)🔹 <a id="stdk8s-configmap-addfile"></a>

Adds a file to the ConfigMap.

<span style="text-decoration: underline">Usage:</span>

```ts
addFile(localFile: string, key?: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **localFile** (<code>string</code>)  The path to the local file.
* **key** (<code>string</code>)  The ConfigMap key (default to the file name).




#### *static* fromConfigMapName(name)🔹 <a id="stdk8s-configmap-fromconfigmapname"></a>

Represents a ConfigMap created elsewhere.

<span style="text-decoration: underline">Usage:</span>

```ts
static fromConfigMapName(name: string): IConfigMap
```

<span style="text-decoration: underline">Parameters:</span>
* **name** (<code>string</code>)  The name of the config map to import.

<span style="text-decoration: underline">Returns</span>:
* <code>[IConfigMap](#stdk8s-iconfigmap)</code>



## class Container 🔹 <a id="stdk8s-container"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Container(props: ContainerProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[ContainerProps](#stdk8s-containerprops)</code>)  *No description*
  * **image** (<code>string</code>)  *No description* 
  * **command** (<code>Array<string></code>)  The command to execute. <span style="text-decoration: underline">*Optional*</span>
  * **env** (<code>Map<string, [EnvValue](#stdk8s-envvalue)></code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **name** (<code>string</code>)  *No description* <span style="text-decoration: underline">*Default*</span>: "main"
  * **port** (<code>number</code>)  // TODO: make this an array of structs (see k8s#ContainerPort). <span style="text-decoration: underline">*Default*</span>: on port is exposed
  * **workingDir** (<code>string</code>)  Container's working directory. <span style="text-decoration: underline">*Default*</span>: If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.



### Properties


Name | Type | Description 
-----|------|-------------
**env**🔹 | <code>Map<string, [EnvValue](#stdk8s-envvalue)></code> | <span></span>
**image**🔹 | <code>string</code> | <span></span>
**name**🔹 | <code>string</code> | <span></span>
**volumeMounts**🔹 | <code>Array<[VolumeMount](#stdk8s-volumemount)></code> | <span></span>
**command**?🔹 | <code>Array<string></code> | <span style="text-decoration: underline">*Optional*</span>
**port**?🔹 | <code>number</code> | <span style="text-decoration: underline">*Optional*</span>
**workingDir**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>

### Methods


#### addEnv(name, value)🔹 <a id="stdk8s-container-addenv"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
addEnv(name: string, value: EnvValue): void
```

<span style="text-decoration: underline">Parameters:</span>
* **name** (<code>string</code>)  *No description*
* **value** (<code>[EnvValue](#stdk8s-envvalue)</code>)  *No description*




#### mount(options)🔹 <a id="stdk8s-container-mount"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
mount(options: VolumeMount): void
```

<span style="text-decoration: underline">Parameters:</span>
* **options** (<code>[VolumeMount](#stdk8s-volumemount)</code>)  *No description*






## class Deployment 🔹 <a id="stdk8s-deployment"></a>



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#stdk8s-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#stdk8s-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Deployment(scope: Construct, id: string, props?: DeploymentProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[DeploymentProps](#stdk8s-deploymentprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#stdk8s-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[DeploymentSpec](#stdk8s-deploymentspec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[DeploymentSpec](#stdk8s-deploymentspec)</code> | <span></span>

### Methods


#### expose(options)🔹 <a id="stdk8s-deployment-expose"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
expose(options: ExposeOptions): Service
```

<span style="text-decoration: underline">Parameters:</span>
* **options** (<code>[ExposeOptions](#stdk8s-exposeoptions)</code>)  *No description*
  * **port** (<code>number</code>)  *No description* 

<span style="text-decoration: underline">Returns</span>:
* <code>[Service](#stdk8s-service)</code>



## class DeploymentSpec 🔹 <a id="stdk8s-deploymentspec"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new DeploymentSpec(props?: DeploymentSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[DeploymentSpecProps](#stdk8s-deploymentspecprops)</code>)  *No description*
  * **replicas** (<code>number</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **template** (<code>[PodTemplateSpec](#stdk8s-podtemplatespec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**labels**🔹 | <code>Map<string, string></code> | <span></span>
**template**🔹 | <code>[PodTemplateSpec](#stdk8s-podtemplatespec)</code> | <span></span>

### Methods


#### selectByLabel(key, value)🔹 <a id="stdk8s-deploymentspec-selectbylabel"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
selectByLabel(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*
* **value** (<code>string</code>)  *No description*






## class Duration 🔹 <a id="stdk8s-duration"></a>

Represents a length of time.

The amount can be specified either as a literal value (e.g: `10`) which
cannot be negative, or as an unresolved number token.

When the amount is passed as a token, unit conversion is not possible.


### Methods


#### toDays(opts?)🔹 <a id="stdk8s-duration-todays"></a>

Return the total number of days in this Duration.

<span style="text-decoration: underline">Usage:</span>

```ts
toDays(opts?: TimeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[TimeConversionOptions](#stdk8s-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. <span style="text-decoration: underline">*Default*</span>: true

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toHours(opts?)🔹 <a id="stdk8s-duration-tohours"></a>

Return the total number of hours in this Duration.

<span style="text-decoration: underline">Usage:</span>

```ts
toHours(opts?: TimeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[TimeConversionOptions](#stdk8s-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. <span style="text-decoration: underline">*Default*</span>: true

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toHumanString()🔹 <a id="stdk8s-duration-tohumanstring"></a>

Turn this duration into a human-readable string.

<span style="text-decoration: underline">Usage:</span>

```ts
toHumanString(): string
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>string</code>

#### toISOString()⚠️ <a id="stdk8s-duration-toisostring"></a>

Return an ISO 8601 representation of this period.

<span style="text-decoration: underline">Usage:</span>

```ts
toISOString(): string
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>string</code>

#### toIsoString()🔹 <a id="stdk8s-duration-toisostring"></a>

Return an ISO 8601 representation of this period.

<span style="text-decoration: underline">Usage:</span>

```ts
toIsoString(): string
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>string</code>

#### toMilliseconds(opts?)🔹 <a id="stdk8s-duration-tomilliseconds"></a>

Return the total number of milliseconds in this Duration.

<span style="text-decoration: underline">Usage:</span>

```ts
toMilliseconds(opts?: TimeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[TimeConversionOptions](#stdk8s-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. <span style="text-decoration: underline">*Default*</span>: true

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toMinutes(opts?)🔹 <a id="stdk8s-duration-tominutes"></a>

Return the total number of minutes in this Duration.

<span style="text-decoration: underline">Usage:</span>

```ts
toMinutes(opts?: TimeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[TimeConversionOptions](#stdk8s-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. <span style="text-decoration: underline">*Default*</span>: true

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toSeconds(opts?)🔹 <a id="stdk8s-duration-toseconds"></a>

Return the total number of seconds in this Duration.

<span style="text-decoration: underline">Usage:</span>

```ts
toSeconds(opts?: TimeConversionOptions): number
```

<span style="text-decoration: underline">Parameters:</span>
* **opts** (<code>[TimeConversionOptions](#stdk8s-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. <span style="text-decoration: underline">*Default*</span>: true

<span style="text-decoration: underline">Returns</span>:
* <code>number</code>

#### toString()🔹 <a id="stdk8s-duration-tostring"></a>

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

#### *static* days(amount)🔹 <a id="stdk8s-duration-days"></a>

Create a Duration representing an amount of days.

<span style="text-decoration: underline">Usage:</span>

```ts
static days(amount: number): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  the amount of Days the `Duration` will represent.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#stdk8s-duration)</code>

#### *static* hours(amount)🔹 <a id="stdk8s-duration-hours"></a>

Create a Duration representing an amount of hours.

<span style="text-decoration: underline">Usage:</span>

```ts
static hours(amount: number): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  the amount of Hours the `Duration` will represent.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#stdk8s-duration)</code>

#### *static* millis(amount)🔹 <a id="stdk8s-duration-millis"></a>

Create a Duration representing an amount of milliseconds.

<span style="text-decoration: underline">Usage:</span>

```ts
static millis(amount: number): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  the amount of Milliseconds the `Duration` will represent.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#stdk8s-duration)</code>

#### *static* minutes(amount)🔹 <a id="stdk8s-duration-minutes"></a>

Create a Duration representing an amount of minutes.

<span style="text-decoration: underline">Usage:</span>

```ts
static minutes(amount: number): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  the amount of Minutes the `Duration` will represent.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#stdk8s-duration)</code>

#### *static* parse(duration)🔹 <a id="stdk8s-duration-parse"></a>

Parse a period formatted according to the ISO 8601 standard.

<span style="text-decoration: underline">Usage:</span>

```ts
static parse(duration: string): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **duration** (<code>string</code>)  an ISO-formtted duration to be parsed.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#stdk8s-duration)</code>

#### *static* seconds(amount)🔹 <a id="stdk8s-duration-seconds"></a>

Create a Duration representing an amount of seconds.

<span style="text-decoration: underline">Usage:</span>

```ts
static seconds(amount: number): Duration
```

<span style="text-decoration: underline">Parameters:</span>
* **amount** (<code>number</code>)  the amount of Seconds the `Duration` will represent.

<span style="text-decoration: underline">Returns</span>:
* <code>[Duration](#stdk8s-duration)</code>



## class EnvValue 🔹 <a id="stdk8s-envvalue"></a>





### Properties


Name | Type | Description 
-----|------|-------------
**value**?🔹 | <code>any</code> | <span style="text-decoration: underline">*Optional*</span>
**valueFrom**?🔹 | <code>any</code> | <span style="text-decoration: underline">*Optional*</span>

### Methods


#### *static* fromConfigMap(configMap, key, options?)🔹 <a id="stdk8s-envvalue-fromconfigmap"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromConfigMap(configMap: IConfigMap, key: string, options?: EnvValueFromConfigMapOptions): EnvValue
```

<span style="text-decoration: underline">Parameters:</span>
* **configMap** (<code>[IConfigMap](#stdk8s-iconfigmap)</code>)  *No description*
* **key** (<code>string</code>)  *No description*
* **options** (<code>[EnvValueFromConfigMapOptions](#stdk8s-envvaluefromconfigmapoptions)</code>)  *No description*
  * **optional** (<code>boolean</code>)  Specify whether the ConfigMap or its key must be defined. <span style="text-decoration: underline">*Default*</span>: false

<span style="text-decoration: underline">Returns</span>:
* <code>[EnvValue](#stdk8s-envvalue)</code>

#### *static* fromProcess(options)🔹 <a id="stdk8s-envvalue-fromprocess"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromProcess(options: EnvValueFromProcessOptions): EnvValue
```

<span style="text-decoration: underline">Parameters:</span>
* **options** (<code>[EnvValueFromProcessOptions](#stdk8s-envvaluefromprocessoptions)</code>)  *No description*
  * **key** (<code>string</code>)  *No description* 
  * **required** (<code>boolean</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>

<span style="text-decoration: underline">Returns</span>:
* <code>[EnvValue](#stdk8s-envvalue)</code>

#### *static* fromSecret(secret, key, options?)🔹 <a id="stdk8s-envvalue-fromsecret"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromSecret(secret: ISecret, key: string, options?: EnvValueFromSecretOptions): EnvValue
```

<span style="text-decoration: underline">Parameters:</span>
* **secret** (<code>[ISecret](#stdk8s-isecret)</code>)  *No description*
* **key** (<code>string</code>)  *No description*
* **options** (<code>[EnvValueFromSecretOptions](#stdk8s-envvaluefromsecretoptions)</code>)  *No description*
  * **optional** (<code>boolean</code>)  Specify whether the Secret or its key must be defined. <span style="text-decoration: underline">*Default*</span>: false

<span style="text-decoration: underline">Returns</span>:
* <code>[EnvValue](#stdk8s-envvalue)</code>

#### *static* fromValue(value)🔹 <a id="stdk8s-envvalue-fromvalue"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromValue(value: string): EnvValue
```

<span style="text-decoration: underline">Parameters:</span>
* **value** (<code>string</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[EnvValue](#stdk8s-envvalue)</code>

#### *static* of(value)🔹 <a id="stdk8s-envvalue-of"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static of(value: string): EnvValue
```

<span style="text-decoration: underline">Parameters:</span>
* **value** (<code>string</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[EnvValue](#stdk8s-envvalue)</code>



## class Job 🔹 <a id="stdk8s-job"></a>



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#stdk8s-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#stdk8s-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Job(scope: Construct, id: string, props: JobProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[JobProps](#stdk8s-jobprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#stdk8s-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[JobSpec](#stdk8s-jobspec)</code>)  *No description* 



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[JobSpec](#stdk8s-jobspec)</code> | <span></span>



## class JobSpec 🔹 <a id="stdk8s-jobspec"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new JobSpec(props: JobSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[JobSpecProps](#stdk8s-jobspecprops)</code>)  *No description*
  * **template** (<code>[PodTemplateSpec](#stdk8s-podtemplatespec)</code>)  *No description* 
  * **ttlAfterFinished** (<code>[Duration](#stdk8s-duration)</code>)  Limits the lifetime of a Job that has finished execution (either Complete or Failed). <span style="text-decoration: underline">*Default*</span>: If this field is unset, the Job won't be automatically deleted.



### Properties


Name | Type | Description 
-----|------|-------------
**template**🔹 | <code>[PodTemplateSpec](#stdk8s-podtemplatespec)</code> | <span></span>
**ttlAfterFinished**?🔹 | <code>[Duration](#stdk8s-duration)</code> | <span style="text-decoration: underline">*Optional*</span>



## class ObjectMeta 🔹 <a id="stdk8s-objectmeta"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new ObjectMeta(props?: ObjectMetaProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[ObjectMetaProps](#stdk8s-objectmetaprops)</code>)  *No description*
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


#### addAnnotation(key, value)🔹 <a id="stdk8s-objectmeta-addannotation"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
addAnnotation(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*
* **value** (<code>string</code>)  *No description*




#### addLabel(key, value)🔹 <a id="stdk8s-objectmeta-addlabel"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
addLabel(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*
* **value** (<code>string</code>)  *No description*






## class Pod 🔹 <a id="stdk8s-pod"></a>

Pod is a collection of containers that can run on a host.

This resource is
created by clients and scheduled onto hosts.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#stdk8s-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#stdk8s-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Pod(scope: Construct, id: string, props?: PodProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[PodProps](#stdk8s-podprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#stdk8s-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[PodSpec](#stdk8s-podspec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[PodSpec](#stdk8s-podspec)</code> | <span></span>



## class PodSpec 🔹 <a id="stdk8s-podspec"></a>

A description of a pod.


### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new PodSpec(props?: PodSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[PodSpecProps](#stdk8s-podspecprops)</code>)  *No description*
  * **containers** (<code>Array<[Container](#stdk8s-container)></code>)  List of containers belonging to the pod. <span style="text-decoration: underline">*Optional*</span>
  * **restartPolicy** (<code>[RestartPolicy](#stdk8s-restartpolicy)</code>)  Restart policy for all containers within the pod. <span style="text-decoration: underline">*Default*</span>: RestartPolicy.ALWAYS
  * **serviceAccout** (<code>[IServiceAccount](#stdk8s-iserviceaccount)</code>)  A service account provides an identity for processes that run in a Pod. <span style="text-decoration: underline">*Optional*</span>
  * **volumes** (<code>Array<[Volume](#stdk8s-volume)></code>)  List of volumes that can be mounted by containers belonging to the pod. <span style="text-decoration: underline">*Default*</span>: no volumes



### Properties


Name | Type | Description 
-----|------|-------------
**containers**🔹 | <code>Array<[Container](#stdk8s-container)></code> | List of containers belonging to the pod.
**volumes**🔹 | <code>Array<[Volume](#stdk8s-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.
**restartPolicy**?🔹 | <code>[RestartPolicy](#stdk8s-restartpolicy)</code> | Restart policy for all containers within the pod.<br/><span style="text-decoration: underline">*Optional*</span>
**serviceAccount**?🔹 | <code>[IServiceAccount](#stdk8s-iserviceaccount)</code> | The service account used to run this pod.<br/><span style="text-decoration: underline">*Optional*</span>

### Methods


#### addContainer(container)🔹 <a id="stdk8s-podspec-addcontainer"></a>

Adds a container to this pod.

<span style="text-decoration: underline">Usage:</span>

```ts
addContainer(container: Container): void
```

<span style="text-decoration: underline">Parameters:</span>
* **container** (<code>[Container](#stdk8s-container)</code>)  The container to add.




#### addVolume(volume)🔹 <a id="stdk8s-podspec-addvolume"></a>

Adds a volume to this pod.

<span style="text-decoration: underline">Usage:</span>

```ts
addVolume(volume: Volume): void
```

<span style="text-decoration: underline">Parameters:</span>
* **volume** (<code>[Volume](#stdk8s-volume)</code>)  The volume to add.






## class PodTemplate 🔹 <a id="stdk8s-podtemplate"></a>



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#stdk8s-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#stdk8s-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new PodTemplate(scope: Construct, name: string, props: PodTemplateProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **name** (<code>string</code>)  *No description*
* **props** (<code>[PodTemplateProps](#stdk8s-podtemplateprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#stdk8s-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[PodTemplateSpec](#stdk8s-podtemplatespec)</code>)  *No description* 



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.



## class PodTemplateSpec 🔹 <a id="stdk8s-podtemplatespec"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new PodTemplateSpec(props?: PodTemplateSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[PodTemplateSpecProps](#stdk8s-podtemplatespecprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#stdk8s-objectmeta)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **podSpec** (<code>[PodSpec](#stdk8s-podspec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**metadata**🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | <span></span>
**podSpec**🔹 | <code>[PodSpec](#stdk8s-podspec)</code> | <span></span>



## class Resource 🔹 <a id="stdk8s-resource"></a>

Base class for all Kubernetes objects in stdk8s.

Represents a single
resource.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#stdk8s-iresource)
<span style="text-decoration: underline">Extends</span>: [Construct](#constructs-construct)
<span style="text-decoration: underline">Implemented by</span>: [ConfigMap](#stdk8s-configmap), [Deployment](#stdk8s-deployment), [Job](#stdk8s-job), [Pod](#stdk8s-pod), [PodTemplate](#stdk8s-podtemplate), [Secret](#stdk8s-secret), [Service](#stdk8s-service), [ServiceAccount](#stdk8s-serviceaccount)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Resource(scope: Construct, id: string, props: ResourceProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ResourceProps](#stdk8s-resourceprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#stdk8s-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**name**🔹 | <code>string</code> | The name of this API object.
**metadata**?🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | The metadata associated with this resource.<br/><span style="text-decoration: underline">*Optional*</span>



## class Secret 🔹 <a id="stdk8s-secret"></a>



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#stdk8s-iresource), [ISecret](#stdk8s-isecret), [IResource](#stdk8s-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#stdk8s-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Secret(scope: Construct, id: string, props?: SecretProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[SecretProps](#stdk8s-secretprops)</code>)  *No description*



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.

### Methods


#### addEnvVariable(key)🔹 <a id="stdk8s-secret-addenvvariable"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
addEnvVariable(key: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*




#### *static* fromSecretName(name)🔹 <a id="stdk8s-secret-fromsecretname"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromSecretName(name: string): ISecret
```

<span style="text-decoration: underline">Parameters:</span>
* **name** (<code>string</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[ISecret](#stdk8s-isecret)</code>



## class Service 🔹 <a id="stdk8s-service"></a>



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#stdk8s-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#stdk8s-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Service(scope: Construct, id: string, props?: ServiceProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ServiceProps](#stdk8s-serviceprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#stdk8s-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>
  * **spec** (<code>[ServiceSpec](#stdk8s-servicespec)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**spec**🔹 | <code>[ServiceSpec](#stdk8s-servicespec)</code> | <span></span>



## class ServiceAccount 🔹 <a id="stdk8s-serviceaccount"></a>



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct), [IResource](#stdk8s-iresource), [IServiceAccount](#stdk8s-iserviceaccount), [IResource](#stdk8s-iresource)
<span style="text-decoration: underline">Extends</span>: [Resource](#stdk8s-resource)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new ServiceAccount(scope: Construct, id: string, props: ServiceAccountProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ServiceAccountProps](#stdk8s-serviceaccountprops)</code>)  *No description*
  * **metadata** (<code>[ObjectMeta](#stdk8s-objectmeta)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.

### Methods


#### *static* fromServiceAccountName(serviceAccountName)🔹 <a id="stdk8s-serviceaccount-fromserviceaccountname"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromServiceAccountName(serviceAccountName: string): IServiceAccount
```

<span style="text-decoration: underline">Parameters:</span>
* **serviceAccountName** (<code>string</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[IServiceAccount](#stdk8s-iserviceaccount)</code>



## class ServiceSpec 🔹 <a id="stdk8s-servicespec"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new ServiceSpec(props?: ServiceSpecProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[ServiceSpecProps](#stdk8s-servicespecprops)</code>)  *No description*
  * **clusterIP** (<code>string</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **externalIPs** (<code>Array<string></code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **port** (<code>[ServicePort](#stdk8s-serviceport)</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>
  * **type** (<code>string</code>)  *No description* <span style="text-decoration: underline">*Optional*</span>


### Methods


#### addExternalIP(ip)🔹 <a id="stdk8s-servicespec-addexternalip"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
addExternalIP(ip: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **ip** (<code>string</code>)  *No description*




#### selectByLabel(key, value)🔹 <a id="stdk8s-servicespec-selectbylabel"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
selectByLabel(key: string, value: string): void
```

<span style="text-decoration: underline">Parameters:</span>
* **key** (<code>string</code>)  *No description*
* **value** (<code>string</code>)  *No description*






## class Volume 🔹 <a id="stdk8s-volume"></a>





### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | <span></span>
**configMap**?🔹 | <code>[ConfigMapVolumeSource](#stdk8s-configmapvolumesource)</code> | <span style="text-decoration: underline">*Optional*</span>
**hostPath**?🔹 | <code>[HostPathVolumeSource](#stdk8s-hostpathvolumesource)</code> | <span style="text-decoration: underline">*Optional*</span>

### Methods


#### *static* fromConfigMap(configMap)🔹 <a id="stdk8s-volume-fromconfigmap"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromConfigMap(configMap: IConfigMap): Volume
```

<span style="text-decoration: underline">Parameters:</span>
* **configMap** (<code>[IConfigMap](#stdk8s-iconfigmap)</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[Volume](#stdk8s-volume)</code>

#### *static* fromDirectory(directory)🔹 <a id="stdk8s-volume-fromdirectory"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static fromDirectory(directory: string): Volume
```

<span style="text-decoration: underline">Parameters:</span>
* **directory** (<code>string</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>[Volume](#stdk8s-volume)</code>



## class VolumeMount 🔹 <a id="stdk8s-volumemount"></a>




### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new VolumeMount(props: VolumeMountProps)
```

<span style="text-decoration: underline">Parameters:</span>
* **props** (<code>[VolumeMountProps](#stdk8s-volumemountprops)</code>)  *No description*
  * **path** (<code>string</code>)  *No description* 
  * **volume** (<code>[Volume](#stdk8s-volume)</code>)  *No description* 



### Properties


Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | <span></span>
**volume**🔹 | <code>[Volume](#stdk8s-volume)</code> | <span></span>



## struct AddDirectoryOptions 🔹 <a id="stdk8s-adddirectoryoptions"></a>


Options for `configmap.addDirectory()`.



Name | Type | Description 
-----|------|-------------
**exclude**?🔹 | <code>Array<string></code> | Glob patterns to exclude when adding files.<br/><span style="text-decoration: underline">*Default*</span>: include all files
**keyPrefix**?🔹 | <code>string</code> | A prefix to add to all keys in the config map.<br/><span style="text-decoration: underline">*Default*</span>: ""
**recursive**?🔹 | <code>boolean</code> | Whether to descend to subdirectories (not supported yet).<br/><span style="text-decoration: underline">*Default*</span>: false



## struct ConfigMapProps 🔹 <a id="stdk8s-configmapprops"></a>


Initialization props for config maps.



Name | Type | Description 
-----|------|-------------
**binaryData**?🔹 | <code>Map<string, string></code> | BinaryData contains the binary data.<br/><span style="text-decoration: underline">*Optional*</span>
**data**?🔹 | <code>Map<string, string></code> | Data contains the configuration data.<br/><span style="text-decoration: underline">*Optional*</span>
**metadata**?🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct ConfigMapVolumeSource 🔹 <a id="stdk8s-configmapvolumesource"></a>






Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | <span></span>



## struct ContainerProps 🔹 <a id="stdk8s-containerprops"></a>






Name | Type | Description 
-----|------|-------------
**image**🔹 | <code>string</code> | <span></span>
**command**?🔹 | <code>Array<string></code> | The command to execute.<br/><span style="text-decoration: underline">*Optional*</span>
**env**?🔹 | <code>Map<string, [EnvValue](#stdk8s-envvalue)></code> | <span style="text-decoration: underline">*Optional*</span>
**name**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Default*</span>: "main"
**port**?🔹 | <code>number</code> | // TODO: make this an array of structs (see k8s#ContainerPort).<br/><span style="text-decoration: underline">*Default*</span>: on port is exposed
**workingDir**?🔹 | <code>string</code> | Container's working directory.<br/><span style="text-decoration: underline">*Default*</span>: If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.



## struct DeploymentProps 🔹 <a id="stdk8s-deploymentprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[DeploymentSpec](#stdk8s-deploymentspec)</code> | <span style="text-decoration: underline">*Optional*</span>



## struct DeploymentSpecProps 🔹 <a id="stdk8s-deploymentspecprops"></a>






Name | Type | Description 
-----|------|-------------
**replicas**?🔹 | <code>number</code> | <span style="text-decoration: underline">*Optional*</span>
**template**?🔹 | <code>[PodTemplateSpec](#stdk8s-podtemplatespec)</code> | <span style="text-decoration: underline">*Optional*</span>



## struct EnvValueFromConfigMapOptions 🔹 <a id="stdk8s-envvaluefromconfigmapoptions"></a>






Name | Type | Description 
-----|------|-------------
**optional**?🔹 | <code>boolean</code> | Specify whether the ConfigMap or its key must be defined.<br/><span style="text-decoration: underline">*Default*</span>: false



## struct EnvValueFromProcessOptions 🔹 <a id="stdk8s-envvaluefromprocessoptions"></a>






Name | Type | Description 
-----|------|-------------
**key**🔹 | <code>string</code> | <span></span>
**required**?🔹 | <code>boolean</code> | <span style="text-decoration: underline">*Optional*</span>



## struct EnvValueFromSecretOptions 🔹 <a id="stdk8s-envvaluefromsecretoptions"></a>






Name | Type | Description 
-----|------|-------------
**optional**?🔹 | <code>boolean</code> | Specify whether the Secret or its key must be defined.<br/><span style="text-decoration: underline">*Default*</span>: false



## struct ExposeOptions 🔹 <a id="stdk8s-exposeoptions"></a>






Name | Type | Description 
-----|------|-------------
**port**🔹 | <code>number</code> | <span></span>



## struct HostPathVolumeSource 🔹 <a id="stdk8s-hostpathvolumesource"></a>






Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | Path of the directory on the host.
**type**?🔹 | <code>string</code> | Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath.<br/><span style="text-decoration: underline">*Default*</span>: More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath



## interface IConfigMap 🔹 <a id="stdk8s-iconfigmap"></a>

<span style="text-decoration: underline">Implemented by</span>: [ConfigMap](#stdk8s-configmap)
<span style="text-decoration: underline">Obtainable from</span>: [ConfigMap](#stdk8s-configmap).[fromConfigMapName](#stdk8s-configmap#stdk8s-configmap-fromconfigmapname)()

Represents a config map.

### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface IResource 🔹 <a id="stdk8s-iresource"></a>

<span style="text-decoration: underline">Implemented by</span>: [ConfigMap](#stdk8s-configmap), [Deployment](#stdk8s-deployment), [Job](#stdk8s-job), [Pod](#stdk8s-pod), [PodTemplate](#stdk8s-podtemplate), [Secret](#stdk8s-secret), [Service](#stdk8s-service), [ServiceAccount](#stdk8s-serviceaccount)

Represents a resource.

### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface ISecret 🔹 <a id="stdk8s-isecret"></a>

<span style="text-decoration: underline">Implemented by</span>: [Secret](#stdk8s-secret)
<span style="text-decoration: underline">Obtainable from</span>: [Secret](#stdk8s-secret).[fromSecretName](#stdk8s-secret#stdk8s-secret-fromsecretname)()



### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface IServiceAccount 🔹 <a id="stdk8s-iserviceaccount"></a>

<span style="text-decoration: underline">Implemented by</span>: [ServiceAccount](#stdk8s-serviceaccount)
<span style="text-decoration: underline">Obtainable from</span>: [ServiceAccount](#stdk8s-serviceaccount).[fromServiceAccountName](#stdk8s-serviceaccount#stdk8s-serviceaccount-fromserviceaccountname)()



### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## struct JobProps 🔹 <a id="stdk8s-jobprops"></a>






Name | Type | Description 
-----|------|-------------
**spec**🔹 | <code>[JobSpec](#stdk8s-jobspec)</code> | <span></span>
**metadata**?🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct JobSpecProps 🔹 <a id="stdk8s-jobspecprops"></a>






Name | Type | Description 
-----|------|-------------
**template**🔹 | <code>[PodTemplateSpec](#stdk8s-podtemplatespec)</code> | <span></span>
**ttlAfterFinished**?🔹 | <code>[Duration](#stdk8s-duration)</code> | Limits the lifetime of a Job that has finished execution (either Complete or Failed).<br/><span style="text-decoration: underline">*Default*</span>: If this field is unset, the Job won't be automatically deleted.



## struct ObjectMetaProps 🔹 <a id="stdk8s-objectmetaprops"></a>






Name | Type | Description 
-----|------|-------------
**annotations**?🔹 | <code>Map<string, string></code> | <span style="text-decoration: underline">*Optional*</span>
**clusterName**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>
**labels**?🔹 | <code>Map<string, string></code> | <span style="text-decoration: underline">*Optional*</span>
**name**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>
**namespace**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>



## struct PodProps 🔹 <a id="stdk8s-podprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[PodSpec](#stdk8s-podspec)</code> | <span style="text-decoration: underline">*Optional*</span>



## struct PodSpecProps 🔹 <a id="stdk8s-podspecprops"></a>


Properties for initialization `PodSpec`.



Name | Type | Description 
-----|------|-------------
**containers**?🔹 | <code>Array<[Container](#stdk8s-container)></code> | List of containers belonging to the pod.<br/><span style="text-decoration: underline">*Optional*</span>
**restartPolicy**?🔹 | <code>[RestartPolicy](#stdk8s-restartpolicy)</code> | Restart policy for all containers within the pod.<br/><span style="text-decoration: underline">*Default*</span>: RestartPolicy.ALWAYS
**serviceAccout**?🔹 | <code>[IServiceAccount](#stdk8s-iserviceaccount)</code> | A service account provides an identity for processes that run in a Pod.<br/><span style="text-decoration: underline">*Optional*</span>
**volumes**?🔹 | <code>Array<[Volume](#stdk8s-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.<br/><span style="text-decoration: underline">*Default*</span>: no volumes



## struct PodTemplateProps 🔹 <a id="stdk8s-podtemplateprops"></a>






Name | Type | Description 
-----|------|-------------
**spec**🔹 | <code>[PodTemplateSpec](#stdk8s-podtemplatespec)</code> | <span></span>
**metadata**?🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct PodTemplateSpecProps 🔹 <a id="stdk8s-podtemplatespecprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | <span style="text-decoration: underline">*Optional*</span>
**podSpec**?🔹 | <code>[PodSpec](#stdk8s-podspec)</code> | <span style="text-decoration: underline">*Optional*</span>



## struct ResourceProps 🔹 <a id="stdk8s-resourceprops"></a>


Initialization properties for resources.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct SecretProps 🔹 <a id="stdk8s-secretprops"></a>





## struct ServiceAccountProps 🔹 <a id="stdk8s-serviceaccountprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>



## struct ServicePort 🔹 <a id="stdk8s-serviceport"></a>






Name | Type | Description 
-----|------|-------------
**port**🔹 | <code>number</code> | <span></span>
**targetPort**?🔹 | <code>number</code> | <span style="text-decoration: underline">*Optional*</span>



## struct ServiceProps 🔹 <a id="stdk8s-serviceprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ObjectMeta](#stdk8s-objectmeta)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/><span style="text-decoration: underline">*Optional*</span>
**spec**?🔹 | <code>[ServiceSpec](#stdk8s-servicespec)</code> | <span style="text-decoration: underline">*Optional*</span>



## struct ServiceSpecProps 🔹 <a id="stdk8s-servicespecprops"></a>






Name | Type | Description 
-----|------|-------------
**clusterIP**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>
**externalIPs**?🔹 | <code>Array<string></code> | <span style="text-decoration: underline">*Optional*</span>
**port**?🔹 | <code>[ServicePort](#stdk8s-serviceport)</code> | <span style="text-decoration: underline">*Optional*</span>
**type**?🔹 | <code>string</code> | <span style="text-decoration: underline">*Optional*</span>



## struct TimeConversionOptions 🔹 <a id="stdk8s-timeconversionoptions"></a>


Options for how to convert time to a different unit.



Name | Type | Description 
-----|------|-------------
**integral**?🔹 | <code>boolean</code> | If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer.<br/><span style="text-decoration: underline">*Default*</span>: true



## struct VolumeMountProps 🔹 <a id="stdk8s-volumemountprops"></a>






Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | <span></span>
**volume**🔹 | <code>[Volume](#stdk8s-volume)</code> | <span></span>



## enum RestartPolicy 🔹 <a id="stdk8s-restartpolicy"></a>

Restart policy for all containers within the pod.

Name | Description
-----|-----
**ALWAYS** 🔹|Always restart the pod after it exits.
**ON_FAILURE** 🔹|Only restart if the pod exits with a non-zero exit code.
**NEVER** 🔹|Never restart the pod.


