# API Reference

**Classes**

Name|Description
----|-----------
[ConfigMap](#cdk8s-plus-17-configmap)|ConfigMap holds configuration data for pods to consume.
[Container](#cdk8s-plus-17-container)|A single application container that you want to run within a pod.
[Deployment](#cdk8s-plus-17-deployment)|A Deployment provides declarative updates for Pods and ReplicaSets.
[EnvValue](#cdk8s-plus-17-envvalue)|Utility class for creating reading env values from various sources.
[IngressV1Beta1](#cdk8s-plus-17-ingressv1beta1)|Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend.
[IngressV1Beta1Backend](#cdk8s-plus-17-ingressv1beta1backend)|The backend for an ingress path.
[Job](#cdk8s-plus-17-job)|A Job creates one or more Pods and ensures that a specified number of them successfully terminate.
[Pod](#cdk8s-plus-17-pod)|Pod is a collection of containers that can run on a host.
[PodSpec](#cdk8s-plus-17-podspec)|Provides read/write capabilities ontop of a `PodSpecProps`.
[PodTemplate](#cdk8s-plus-17-podtemplate)|Provides read/write capabilities ontop of a `PodTemplateProps`.
[Probe](#cdk8s-plus-17-probe)|Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
[Resource](#cdk8s-plus-17-resource)|Base class for all Kubernetes objects in stdk8s.
[Secret](#cdk8s-plus-17-secret)|Kubernetes Secrets let you store and manage sensitive information, such as passwords, OAuth tokens, and ssh keys.
[Service](#cdk8s-plus-17-service)|An abstract way to expose an application running on a set of Pods as a network service.
[ServiceAccount](#cdk8s-plus-17-serviceaccount)|A service account provides an identity for processes that run in a Pod.
[Volume](#cdk8s-plus-17-volume)|Volume represents a named volume in a pod that may be accessed by any container in the pod.


**Structs**

Name|Description
----|-----------
[AddDirectoryOptions](#cdk8s-plus-17-adddirectoryoptions)|Options for `configmap.addDirectory()`.
[CommandProbeOptions](#cdk8s-plus-17-commandprobeoptions)|Options for `Probe.fromCommand()`.
[ConfigMapProps](#cdk8s-plus-17-configmapprops)|Properties for initialization of `ConfigMap`.
[ConfigMapVolumeOptions](#cdk8s-plus-17-configmapvolumeoptions)|Options for the ConfigMap-based volume.
[ContainerProps](#cdk8s-plus-17-containerprops)|Properties for creating a container.
[DeploymentProps](#cdk8s-plus-17-deploymentprops)|Properties for initialization of `Deployment`.
[EmptyDirVolumeOptions](#cdk8s-plus-17-emptydirvolumeoptions)|Options for volumes populated with an empty directory.
[EnvValueFromConfigMapOptions](#cdk8s-plus-17-envvaluefromconfigmapoptions)|Options to specify an envionment variable value from a ConfigMap key.
[EnvValueFromProcessOptions](#cdk8s-plus-17-envvaluefromprocessoptions)|Options to specify an environment variable value from the process environment.
[EnvValueFromSecretOptions](#cdk8s-plus-17-envvaluefromsecretoptions)|Options to specify an environment variable value from a Secret.
[ExposeOptions](#cdk8s-plus-17-exposeoptions)|Options for exposing a deployment via a service.
[HttpGetProbeOptions](#cdk8s-plus-17-httpgetprobeoptions)|Options for `Probe.fromHttpGet()`.
[IngressV1Beta1Props](#cdk8s-plus-17-ingressv1beta1props)|Properties for `Ingress`.
[IngressV1Beta1Rule](#cdk8s-plus-17-ingressv1beta1rule)|Represents the rules mapping the paths under a specified host to the related backend services.
[JobProps](#cdk8s-plus-17-jobprops)|Properties for initialization of `Job`.
[MountOptions](#cdk8s-plus-17-mountoptions)|Options for mounts.
[PathMapping](#cdk8s-plus-17-pathmapping)|Maps a string key to a path within a volume.
[PodProps](#cdk8s-plus-17-podprops)|Properties for initialization of `Pod`.
[PodSpecProps](#cdk8s-plus-17-podspecprops)|Properties of a `PodSpec`.
[PodTemplateProps](#cdk8s-plus-17-podtemplateprops)|Properties of a `PodTemplate`.
[ProbeOptions](#cdk8s-plus-17-probeoptions)|Probe options.
[ResourceProps](#cdk8s-plus-17-resourceprops)|Initialization properties for resources.
[SecretProps](#cdk8s-plus-17-secretprops)|*No description*
[SecretValue](#cdk8s-plus-17-secretvalue)|Represents a specific value in JSON secret.
[ServiceAccountProps](#cdk8s-plus-17-serviceaccountprops)|Properties for initialization of `ServiceAccount`.
[ServiceIngressV1BetaBackendOptions](#cdk8s-plus-17-serviceingressv1betabackendoptions)|Options for setting up backends for ingress rules.
[ServicePort](#cdk8s-plus-17-serviceport)|Definition of a service port.
[ServicePortOptions](#cdk8s-plus-17-serviceportoptions)|*No description*
[ServiceProps](#cdk8s-plus-17-serviceprops)|Properties for initialization of `Service`.
[VolumeMount](#cdk8s-plus-17-volumemount)|Mount a volume from the pod to the container.


**Interfaces**

Name|Description
----|-----------
[IConfigMap](#cdk8s-plus-17-iconfigmap)|Represents a config map.
[IPodSpec](#cdk8s-plus-17-ipodspec)|Represents a resource that can be configured with a kuberenets pod spec. (e.g `Deployment`, `Job`, `Pod`, ...).
[IPodTemplate](#cdk8s-plus-17-ipodtemplate)|Represents a resource that can be configured with a kuberenets pod template. (e.g `Deployment`, `Job`, ...).
[IResource](#cdk8s-plus-17-iresource)|Represents a resource.
[ISecret](#cdk8s-plus-17-isecret)|*No description*
[IServiceAccount](#cdk8s-plus-17-iserviceaccount)|*No description*


**Enums**

Name|Description
----|-----------
[EmptyDirMedium](#cdk8s-plus-17-emptydirmedium)|The medium on which to store the volume.
[ImagePullPolicy](#cdk8s-plus-17-imagepullpolicy)|*No description*
[MountPropagation](#cdk8s-plus-17-mountpropagation)|*No description*
[Protocol](#cdk8s-plus-17-protocol)|*No description*
[RestartPolicy](#cdk8s-plus-17-restartpolicy)|Restart policy for all containers within the pod.
[ServiceType](#cdk8s-plus-17-servicetype)|For some parts of your application (for example, frontends) you may want to expose a Service onto an external IP address, that's outside of your cluster.



## class ConfigMap 🔹 <a id="cdk8s-plus-17-configmap"></a>

ConfigMap holds configuration data for pods to consume.

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-17-iresource), [IConfigMap](#cdk8s-plus-17-iconfigmap), [IResource](#cdk8s-plus-17-iresource)
__Extends__: [Resource](#cdk8s-plus-17-resource)

### Initializer




```ts
new ConfigMap(scope: Construct, id: string, props?: ConfigMapProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ConfigMapProps](#cdk8s-plus-17-configmapprops)</code>)  *No description*
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


#### addBinaryData(key, value)🔹 <a id="cdk8s-plus-17-configmap-addbinarydata"></a>

Adds a binary data entry to the config map.

BinaryData can contain byte
sequences that are not in the UTF-8 range.

```ts
addBinaryData(key: string, value: string): void
```

* **key** (<code>string</code>)  The key.
* **value** (<code>string</code>)  The value.




#### addData(key, value)🔹 <a id="cdk8s-plus-17-configmap-adddata"></a>

Adds a data entry to the config map.

```ts
addData(key: string, value: string): void
```

* **key** (<code>string</code>)  The key.
* **value** (<code>string</code>)  The value.




#### addDirectory(localDir, options?)🔹 <a id="cdk8s-plus-17-configmap-adddirectory"></a>

Adds a directory to the ConfigMap.

```ts
addDirectory(localDir: string, options?: AddDirectoryOptions): void
```

* **localDir** (<code>string</code>)  A path to a local directory.
* **options** (<code>[AddDirectoryOptions](#cdk8s-plus-17-adddirectoryoptions)</code>)  Options.
  * **exclude** (<code>Array<string></code>)  Glob patterns to exclude when adding files. __*Default*__: include all files
  * **keyPrefix** (<code>string</code>)  A prefix to add to all keys in the config map. __*Default*__: ""




#### addFile(localFile, key?)🔹 <a id="cdk8s-plus-17-configmap-addfile"></a>

Adds a file to the ConfigMap.

```ts
addFile(localFile: string, key?: string): void
```

* **localFile** (<code>string</code>)  The path to the local file.
* **key** (<code>string</code>)  The ConfigMap key (default to the file name).




#### *static* fromConfigMapName(name)🔹 <a id="cdk8s-plus-17-configmap-fromconfigmapname"></a>

Represents a ConfigMap created elsewhere.

```ts
static fromConfigMapName(name: string): IConfigMap
```

* **name** (<code>string</code>)  The name of the config map to import.

__Returns__:
* <code>[IConfigMap](#cdk8s-plus-17-iconfigmap)</code>



## class Container 🔹 <a id="cdk8s-plus-17-container"></a>

A single application container that you want to run within a pod.


### Initializer




```ts
new Container(props: ContainerProps)
```

* **props** (<code>[ContainerProps](#cdk8s-plus-17-containerprops)</code>)  *No description*
  * **image** (<code>string</code>)  Docker image name. 
  * **args** (<code>Array<string></code>)  Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided. __*Default*__: []
  * **command** (<code>Array<string></code>)  Entrypoint array. __*Default*__: The docker image's ENTRYPOINT.
  * **env** (<code>Map<string, [EnvValue](#cdk8s-plus-17-envvalue)></code>)  List of environment variables to set in the container. __*Default*__: No environment variables.
  * **imagePullPolicy** (<code>[ImagePullPolicy](#cdk8s-plus-17-imagepullpolicy)</code>)  Image pull policy for this container. __*Default*__: ImagePullPolicy.ALWAYS
  * **liveness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Periodic probe of container liveness. __*Default*__: no liveness probe is defined
  * **name** (<code>string</code>)  Name of the container specified as a DNS_LABEL. __*Default*__: 'main'
  * **port** (<code>number</code>)  Number of port to expose on the pod's IP address. __*Default*__: No port is exposed.
  * **readiness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Determines when the container is ready to serve traffic. __*Default*__: no readiness probe is defined
  * **startup** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  StartupProbe indicates that the Pod has successfully initialized. __*Default*__: no startup probe is defined.
  * **volumeMounts** (<code>Array<[VolumeMount](#cdk8s-plus-17-volumemount)></code>)  Pod volumes to mount into the container's filesystem. __*Optional*__
  * **workingDir** (<code>string</code>)  Container's working directory. __*Default*__: The container runtime's default.



### Properties


Name | Type | Description 
-----|------|-------------
**env**🔹 | <code>Map<string, [EnvValue](#cdk8s-plus-17-envvalue)></code> | The environment variables for this container.
**image**🔹 | <code>string</code> | The container image.
**imagePullPolicy**🔹 | <code>[ImagePullPolicy](#cdk8s-plus-17-imagepullpolicy)</code> | Image pull policy for this container.
**mounts**🔹 | <code>Array<[VolumeMount](#cdk8s-plus-17-volumemount)></code> | Volume mounts configured for this container.
**name**🔹 | <code>string</code> | The name of the container.
**args**?🔹 | <code>Array<string></code> | Arguments to the entrypoint.<br/>__*Optional*__
**command**?🔹 | <code>Array<string></code> | Entrypoint array (the command to execute when the container starts).<br/>__*Optional*__
**port**?🔹 | <code>number</code> | The port this container exposes.<br/>__*Optional*__
**workingDir**?🔹 | <code>string</code> | The working directory inside the container.<br/>__*Optional*__

### Methods


#### addEnv(name, value)🔹 <a id="cdk8s-plus-17-container-addenv"></a>

Add an environment value to the container.

The variable value can come
from various dynamic sources such a secrets of config maps.

```ts
addEnv(name: string, value: EnvValue): void
```

* **name** (<code>string</code>)  - The variable name.
* **value** (<code>[EnvValue](#cdk8s-plus-17-envvalue)</code>)  - The variable value.




#### mount(path, volume, options?)🔹 <a id="cdk8s-plus-17-container-mount"></a>

Mount a volume to a specific path so that it is accessible by the container.

Every pod that is configured to use this container will autmoatically have access to the volume.

```ts
mount(path: string, volume: Volume, options?: MountOptions): void
```

* **path** (<code>string</code>)  - The desired path in the container.
* **volume** (<code>[Volume](#cdk8s-plus-17-volume)</code>)  - The volume to mount.
* **options** (<code>[MountOptions](#cdk8s-plus-17-mountoptions)</code>)  *No description*
  * **propagation** (<code>[MountPropagation](#cdk8s-plus-17-mountpropagation)</code>)  Determines how mounts are propagated from the host to container and the other way around. __*Default*__: MountPropagation.NONE
  * **readOnly** (<code>boolean</code>)  Mounted read-only if true, read-write otherwise (false or unspecified). __*Default*__: false
  * **subPath** (<code>string</code>)  Path within the volume from which the container's volume should be mounted.). __*Default*__: "" the volume's root
  * **subPathExpr** (<code>string</code>)  Expanded path within the volume from which the container's volume should be mounted. __*Default*__: "" volume's root.






## class Deployment 🔹 <a id="cdk8s-plus-17-deployment"></a>

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

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-17-iresource), [IPodTemplate](#cdk8s-plus-17-ipodtemplate), [IPodSpec](#cdk8s-plus-17-ipodspec)
__Extends__: [Resource](#cdk8s-plus-17-resource)

### Initializer




```ts
new Deployment(scope: Construct, id: string, props?: DeploymentProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[DeploymentProps](#cdk8s-plus-17-deploymentprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **containers** (<code>Array<[ContainerProps](#cdk8s-plus-17-containerprops)></code>)  List of containers belonging to the pod. __*Default*__: No containers. Note that a pod spec must include at least one container.
  * **restartPolicy** (<code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code>)  Restart policy for all containers within the pod. __*Default*__: RestartPolicy.ALWAYS
  * **serviceAccount** (<code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code>)  A service account provides an identity for processes that run in a Pod. __*Default*__: No service account.
  * **volumes** (<code>Array<[Volume](#cdk8s-plus-17-volume)></code>)  List of volumes that can be mounted by containers belonging to the pod. __*Default*__: No volumes.
  * **podMetadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  The pod metadata. __*Optional*__
  * **defaultSelector** (<code>boolean</code>)  Automatically allocates a pod selector for this deployment. __*Default*__: true
  * **replicas** (<code>number</code>)  Number of desired pods. __*Default*__: 1



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**containers**🔹 | <code>Array<[Container](#cdk8s-plus-17-container)></code> | The containers belonging to the pod.
**labelSelector**🔹 | <code>Map<string, string></code> | The labels this deployment will match against in order to select pods.
**podMetadata**🔹 | <code>[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)</code> | Provides read/write access to the underlying pod metadata of the resource.
**replicas**🔹 | <code>number</code> | Number of desired pods.
**volumes**🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | The volumes associated with this pod.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Optional*__
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | The service account used to run this pod.<br/>__*Optional*__

### Methods


#### addContainer(container)🔹 <a id="cdk8s-plus-17-deployment-addcontainer"></a>

Add a container to the pod.

```ts
addContainer(container: ContainerProps): Container
```

* **container** (<code>[ContainerProps](#cdk8s-plus-17-containerprops)</code>)  *No description*
  * **image** (<code>string</code>)  Docker image name. 
  * **args** (<code>Array<string></code>)  Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided. __*Default*__: []
  * **command** (<code>Array<string></code>)  Entrypoint array. __*Default*__: The docker image's ENTRYPOINT.
  * **env** (<code>Map<string, [EnvValue](#cdk8s-plus-17-envvalue)></code>)  List of environment variables to set in the container. __*Default*__: No environment variables.
  * **imagePullPolicy** (<code>[ImagePullPolicy](#cdk8s-plus-17-imagepullpolicy)</code>)  Image pull policy for this container. __*Default*__: ImagePullPolicy.ALWAYS
  * **liveness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Periodic probe of container liveness. __*Default*__: no liveness probe is defined
  * **name** (<code>string</code>)  Name of the container specified as a DNS_LABEL. __*Default*__: 'main'
  * **port** (<code>number</code>)  Number of port to expose on the pod's IP address. __*Default*__: No port is exposed.
  * **readiness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Determines when the container is ready to serve traffic. __*Default*__: no readiness probe is defined
  * **startup** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  StartupProbe indicates that the Pod has successfully initialized. __*Default*__: no startup probe is defined.
  * **volumeMounts** (<code>Array<[VolumeMount](#cdk8s-plus-17-volumemount)></code>)  Pod volumes to mount into the container's filesystem. __*Optional*__
  * **workingDir** (<code>string</code>)  Container's working directory. __*Default*__: The container runtime's default.

__Returns__:
* <code>[Container](#cdk8s-plus-17-container)</code>

#### addVolume(volume)🔹 <a id="cdk8s-plus-17-deployment-addvolume"></a>

Add a volume to the pod.

```ts
addVolume(volume: Volume): void
```

* **volume** (<code>[Volume](#cdk8s-plus-17-volume)</code>)  *No description*




#### expose(port, options?)🔹 <a id="cdk8s-plus-17-deployment-expose"></a>

Expose a deployment via a service.

This is equivalent to running `kubectl expose deployment <deployment-name>`.

```ts
expose(port: number, options?: ExposeOptions): Service
```

* **port** (<code>number</code>)  The port number the service will bind to.
* **options** (<code>[ExposeOptions](#cdk8s-plus-17-exposeoptions)</code>)  Options to determine details of the service and port exposed.
  * **name** (<code>string</code>)  The name of the service to expose. __*Default*__: undefined Uses the system generated name.
  * **protocol** (<code>[Protocol](#cdk8s-plus-17-protocol)</code>)  The IP protocol for this port. __*Default*__: Protocol.TCP
  * **serviceType** (<code>[ServiceType](#cdk8s-plus-17-servicetype)</code>)  The type of the exposed service. __*Default*__: ClusterIP.
  * **targetPort** (<code>number</code>)  The port number the service will redirect to. __*Default*__: The port of the first container in the deployment (ie. containers[0].port)

__Returns__:
* <code>[Service](#cdk8s-plus-17-service)</code>

#### selectByLabel(key, value)🔹 <a id="cdk8s-plus-17-deployment-selectbylabel"></a>

Configure a label selector to this deployment.

Pods that have the label will be selected by deployments configured with this spec.

```ts
selectByLabel(key: string, value: string): void
```

* **key** (<code>string</code>)  - The label key.
* **value** (<code>string</code>)  - The label value.






## class EnvValue 🔹 <a id="cdk8s-plus-17-envvalue"></a>

Utility class for creating reading env values from various sources.



### Properties


Name | Type | Description 
-----|------|-------------
**value**?🔹 | <code>any</code> | __*Optional*__
**valueFrom**?🔹 | <code>any</code> | __*Optional*__

### Methods


#### *static* fromConfigMap(configMap, key, options?)🔹 <a id="cdk8s-plus-17-envvalue-fromconfigmap"></a>

Create a value by reading a specific key inside a config map.

```ts
static fromConfigMap(configMap: IConfigMap, key: string, options?: EnvValueFromConfigMapOptions): EnvValue
```

* **configMap** (<code>[IConfigMap](#cdk8s-plus-17-iconfigmap)</code>)  - The config map.
* **key** (<code>string</code>)  - The key to extract the value from.
* **options** (<code>[EnvValueFromConfigMapOptions](#cdk8s-plus-17-envvaluefromconfigmapoptions)</code>)  - Additional options.
  * **optional** (<code>boolean</code>)  Specify whether the ConfigMap or its key must be defined. __*Default*__: false

__Returns__:
* <code>[EnvValue](#cdk8s-plus-17-envvalue)</code>

#### *static* fromProcess(key, options?)🔹 <a id="cdk8s-plus-17-envvalue-fromprocess"></a>

Create a value from a key in the current process environment.

```ts
static fromProcess(key: string, options?: EnvValueFromProcessOptions): EnvValue
```

* **key** (<code>string</code>)  - The key to read.
* **options** (<code>[EnvValueFromProcessOptions](#cdk8s-plus-17-envvaluefromprocessoptions)</code>)  - Additional options.
  * **required** (<code>boolean</code>)  Specify whether the key must exist in the environment. __*Default*__: false

__Returns__:
* <code>[EnvValue](#cdk8s-plus-17-envvalue)</code>

#### *static* fromSecretValue(secretValue, options?)🔹 <a id="cdk8s-plus-17-envvalue-fromsecretvalue"></a>

Defines an environment value from a secret JSON value.

```ts
static fromSecretValue(secretValue: SecretValue, options?: EnvValueFromSecretOptions): EnvValue
```

* **secretValue** (<code>[SecretValue](#cdk8s-plus-17-secretvalue)</code>)  The secret value (secrent + key).
* **options** (<code>[EnvValueFromSecretOptions](#cdk8s-plus-17-envvaluefromsecretoptions)</code>)  Additional options.
  * **optional** (<code>boolean</code>)  Specify whether the Secret or its key must be defined. __*Default*__: false

__Returns__:
* <code>[EnvValue](#cdk8s-plus-17-envvalue)</code>

#### *static* fromValue(value)🔹 <a id="cdk8s-plus-17-envvalue-fromvalue"></a>

Create a value from the given argument.

```ts
static fromValue(value: string): EnvValue
```

* **value** (<code>string</code>)  - The value.

__Returns__:
* <code>[EnvValue](#cdk8s-plus-17-envvalue)</code>



## class IngressV1Beta1 🔹 <a id="cdk8s-plus-17-ingressv1beta1"></a>

Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend.

An Ingress can be configured to give services
externally-reachable urls, load balance traffic, terminate SSL, offer name
based virtual hosting etc.

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-17-iresource)
__Extends__: [Resource](#cdk8s-plus-17-resource)

### Initializer




```ts
new IngressV1Beta1(scope: Construct, id: string, props?: IngressV1Beta1Props)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[IngressV1Beta1Props](#cdk8s-plus-17-ingressv1beta1props)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **defaultBackend** (<code>[IngressV1Beta1Backend](#cdk8s-plus-17-ingressv1beta1backend)</code>)  The default backend services requests that do not match any rule. __*Optional*__
  * **rules** (<code>Array<[IngressV1Beta1Rule](#cdk8s-plus-17-ingressv1beta1rule)></code>)  Routing rules for this ingress. __*Optional*__



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.

### Methods


#### addDefaultBackend(backend)🔹 <a id="cdk8s-plus-17-ingressv1beta1-adddefaultbackend"></a>

Defines the default backend for this ingress.

A default backend capable of
servicing requests that don't match any rule.

```ts
addDefaultBackend(backend: IngressV1Beta1Backend): void
```

* **backend** (<code>[IngressV1Beta1Backend](#cdk8s-plus-17-ingressv1beta1backend)</code>)  The backend to use for requests that do not match any rule.




#### addHostDefaultBackend(host, backend)🔹 <a id="cdk8s-plus-17-ingressv1beta1-addhostdefaultbackend"></a>

Specify a default backend for a specific host name.

This backend will be used as a catch-all for requests
targeted to this host name (the `Host` header matches this value).

```ts
addHostDefaultBackend(host: string, backend: IngressV1Beta1Backend): void
```

* **host** (<code>string</code>)  The host name to match.
* **backend** (<code>[IngressV1Beta1Backend](#cdk8s-plus-17-ingressv1beta1backend)</code>)  The backend to route to.




#### addHostRule(host, path, backend)🔹 <a id="cdk8s-plus-17-ingressv1beta1-addhostrule"></a>

Adds an ingress rule applied to requests to a specific host and a specific HTTP path (the `Host` header matches this value).

```ts
addHostRule(host: string, path: string, backend: IngressV1Beta1Backend): void
```

* **host** (<code>string</code>)  The host name.
* **path** (<code>string</code>)  The HTTP path.
* **backend** (<code>[IngressV1Beta1Backend](#cdk8s-plus-17-ingressv1beta1backend)</code>)  The backend to route requests to.




#### addRule(path, backend)🔹 <a id="cdk8s-plus-17-ingressv1beta1-addrule"></a>

Adds an ingress rule applied to requests sent to a specific HTTP path.

```ts
addRule(path: string, backend: IngressV1Beta1Backend): void
```

* **path** (<code>string</code>)  The HTTP path.
* **backend** (<code>[IngressV1Beta1Backend](#cdk8s-plus-17-ingressv1beta1backend)</code>)  The backend to route requests to.




#### addRules(...rules)🔹 <a id="cdk8s-plus-17-ingressv1beta1-addrules"></a>

Adds rules to this ingress.

```ts
addRules(...rules: IngressV1Beta1Rule[]): void
```

* **rules** (<code>[IngressV1Beta1Rule](#cdk8s-plus-17-ingressv1beta1rule)</code>)  The rules to add.
  * **backend** (<code>[IngressV1Beta1Backend](#cdk8s-plus-17-ingressv1beta1backend)</code>)  Backend defines the referenced service endpoint to which the traffic will be forwarded to. 
  * **host** (<code>string</code>)  Host is the fully qualified domain name of a network host, as defined by RFC 3986. __*Default*__: If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
  * **path** (<code>string</code>)  Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. __*Default*__: If unspecified, the path defaults to a catch all sending traffic to the backend.




#### protected onValidate()🔹 <a id="cdk8s-plus-17-ingressv1beta1-onvalidate"></a>

(deprecated) Validate the current construct.

This method can be implemented by derived constructs in order to perform
validation logic. It is called on all constructs before synthesis.

```ts
protected onValidate(): Array<string>
```


__Returns__:
* <code>Array<string></code>



## class IngressV1Beta1Backend 🔹 <a id="cdk8s-plus-17-ingressv1beta1backend"></a>

The backend for an ingress path.


### Methods


#### *static* fromService(service, options?)🔹 <a id="cdk8s-plus-17-ingressv1beta1backend-fromservice"></a>

A Kubernetes `Service` to use as the backend for this path.

```ts
static fromService(service: Service, options?: ServiceIngressV1BetaBackendOptions): IngressV1Beta1Backend
```

* **service** (<code>[Service](#cdk8s-plus-17-service)</code>)  The service object.
* **options** (<code>[ServiceIngressV1BetaBackendOptions](#cdk8s-plus-17-serviceingressv1betabackendoptions)</code>)  *No description*
  * **port** (<code>number</code>)  The port to use to access the service. __*Default*__: if the service exposes a single port, this port will be used.

__Returns__:
* <code>[IngressV1Beta1Backend](#cdk8s-plus-17-ingressv1beta1backend)</code>



## class Job 🔹 <a id="cdk8s-plus-17-job"></a>

A Job creates one or more Pods and ensures that a specified number of them successfully terminate.

As pods successfully complete,
the Job tracks the successful completions. When a specified number of successful completions is reached, the task (ie, Job) is complete.
Deleting a Job will clean up the Pods it created. A simple case is to create one Job object in order to reliably run one Pod to completion.
The Job object will start a new Pod if the first Pod fails or is deleted (for example due to a node hardware failure or a node reboot).
You can also use a Job to run multiple Pods in parallel.

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-17-iresource), [IPodTemplate](#cdk8s-plus-17-ipodtemplate), [IPodSpec](#cdk8s-plus-17-ipodspec)
__Extends__: [Resource](#cdk8s-plus-17-resource)

### Initializer




```ts
new Job(scope: Construct, id: string, props?: JobProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[JobProps](#cdk8s-plus-17-jobprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **containers** (<code>Array<[ContainerProps](#cdk8s-plus-17-containerprops)></code>)  List of containers belonging to the pod. __*Default*__: No containers. Note that a pod spec must include at least one container.
  * **restartPolicy** (<code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code>)  Restart policy for all containers within the pod. __*Default*__: RestartPolicy.ALWAYS
  * **serviceAccount** (<code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code>)  A service account provides an identity for processes that run in a Pod. __*Default*__: No service account.
  * **volumes** (<code>Array<[Volume](#cdk8s-plus-17-volume)></code>)  List of volumes that can be mounted by containers belonging to the pod. __*Default*__: No volumes.
  * **podMetadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  The pod metadata. __*Optional*__
  * **ttlAfterFinished** (<code>[Duration](#cdk8s-duration)</code>)  Limits the lifetime of a Job that has finished execution (either Complete or Failed). __*Default*__: If this field is unset, the Job won't be automatically deleted.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**containers**🔹 | <code>Array<[Container](#cdk8s-plus-17-container)></code> | The containers belonging to the pod.
**podMetadata**🔹 | <code>[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)</code> | Provides read/write access to the underlying pod metadata of the resource.
**volumes**🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | The volumes associated with this pod.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Optional*__
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | The service account used to run this pod.<br/>__*Optional*__
**ttlAfterFinished**?🔹 | <code>[Duration](#cdk8s-duration)</code> | TTL before the job is deleted after it is finished.<br/>__*Optional*__

### Methods


#### addContainer(container)🔹 <a id="cdk8s-plus-17-job-addcontainer"></a>

Add a container to the pod.

```ts
addContainer(container: ContainerProps): Container
```

* **container** (<code>[ContainerProps](#cdk8s-plus-17-containerprops)</code>)  *No description*
  * **image** (<code>string</code>)  Docker image name. 
  * **args** (<code>Array<string></code>)  Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided. __*Default*__: []
  * **command** (<code>Array<string></code>)  Entrypoint array. __*Default*__: The docker image's ENTRYPOINT.
  * **env** (<code>Map<string, [EnvValue](#cdk8s-plus-17-envvalue)></code>)  List of environment variables to set in the container. __*Default*__: No environment variables.
  * **imagePullPolicy** (<code>[ImagePullPolicy](#cdk8s-plus-17-imagepullpolicy)</code>)  Image pull policy for this container. __*Default*__: ImagePullPolicy.ALWAYS
  * **liveness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Periodic probe of container liveness. __*Default*__: no liveness probe is defined
  * **name** (<code>string</code>)  Name of the container specified as a DNS_LABEL. __*Default*__: 'main'
  * **port** (<code>number</code>)  Number of port to expose on the pod's IP address. __*Default*__: No port is exposed.
  * **readiness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Determines when the container is ready to serve traffic. __*Default*__: no readiness probe is defined
  * **startup** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  StartupProbe indicates that the Pod has successfully initialized. __*Default*__: no startup probe is defined.
  * **volumeMounts** (<code>Array<[VolumeMount](#cdk8s-plus-17-volumemount)></code>)  Pod volumes to mount into the container's filesystem. __*Optional*__
  * **workingDir** (<code>string</code>)  Container's working directory. __*Default*__: The container runtime's default.

__Returns__:
* <code>[Container](#cdk8s-plus-17-container)</code>

#### addVolume(volume)🔹 <a id="cdk8s-plus-17-job-addvolume"></a>

Add a volume to the pod.

```ts
addVolume(volume: Volume): void
```

* **volume** (<code>[Volume](#cdk8s-plus-17-volume)</code>)  *No description*






## class Pod 🔹 <a id="cdk8s-plus-17-pod"></a>

Pod is a collection of containers that can run on a host.

This resource is
created by clients and scheduled onto hosts.

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-17-iresource), [IPodSpec](#cdk8s-plus-17-ipodspec)
__Extends__: [Resource](#cdk8s-plus-17-resource)

### Initializer




```ts
new Pod(scope: Construct, id: string, props?: PodProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[PodProps](#cdk8s-plus-17-podprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **containers** (<code>Array<[ContainerProps](#cdk8s-plus-17-containerprops)></code>)  List of containers belonging to the pod. __*Default*__: No containers. Note that a pod spec must include at least one container.
  * **restartPolicy** (<code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code>)  Restart policy for all containers within the pod. __*Default*__: RestartPolicy.ALWAYS
  * **serviceAccount** (<code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code>)  A service account provides an identity for processes that run in a Pod. __*Default*__: No service account.
  * **volumes** (<code>Array<[Volume](#cdk8s-plus-17-volume)></code>)  List of volumes that can be mounted by containers belonging to the pod. __*Default*__: No volumes.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**containers**🔹 | <code>Array<[Container](#cdk8s-plus-17-container)></code> | The containers belonging to the pod.
**volumes**🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | The volumes associated with this pod.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Optional*__
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | The service account used to run this pod.<br/>__*Optional*__

### Methods


#### addContainer(container)🔹 <a id="cdk8s-plus-17-pod-addcontainer"></a>

Add a container to the pod.

```ts
addContainer(container: ContainerProps): Container
```

* **container** (<code>[ContainerProps](#cdk8s-plus-17-containerprops)</code>)  *No description*
  * **image** (<code>string</code>)  Docker image name. 
  * **args** (<code>Array<string></code>)  Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided. __*Default*__: []
  * **command** (<code>Array<string></code>)  Entrypoint array. __*Default*__: The docker image's ENTRYPOINT.
  * **env** (<code>Map<string, [EnvValue](#cdk8s-plus-17-envvalue)></code>)  List of environment variables to set in the container. __*Default*__: No environment variables.
  * **imagePullPolicy** (<code>[ImagePullPolicy](#cdk8s-plus-17-imagepullpolicy)</code>)  Image pull policy for this container. __*Default*__: ImagePullPolicy.ALWAYS
  * **liveness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Periodic probe of container liveness. __*Default*__: no liveness probe is defined
  * **name** (<code>string</code>)  Name of the container specified as a DNS_LABEL. __*Default*__: 'main'
  * **port** (<code>number</code>)  Number of port to expose on the pod's IP address. __*Default*__: No port is exposed.
  * **readiness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Determines when the container is ready to serve traffic. __*Default*__: no readiness probe is defined
  * **startup** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  StartupProbe indicates that the Pod has successfully initialized. __*Default*__: no startup probe is defined.
  * **volumeMounts** (<code>Array<[VolumeMount](#cdk8s-plus-17-volumemount)></code>)  Pod volumes to mount into the container's filesystem. __*Optional*__
  * **workingDir** (<code>string</code>)  Container's working directory. __*Default*__: The container runtime's default.

__Returns__:
* <code>[Container](#cdk8s-plus-17-container)</code>

#### addVolume(volume)🔹 <a id="cdk8s-plus-17-pod-addvolume"></a>

Add a volume to the pod.

```ts
addVolume(volume: Volume): void
```

* **volume** (<code>[Volume](#cdk8s-plus-17-volume)</code>)  *No description*






## class PodSpec 🔹 <a id="cdk8s-plus-17-podspec"></a>

Provides read/write capabilities ontop of a `PodSpecProps`.

__Implements__: [IPodSpec](#cdk8s-plus-17-ipodspec)

### Initializer




```ts
new PodSpec(props?: PodSpecProps)
```

* **props** (<code>[PodSpecProps](#cdk8s-plus-17-podspecprops)</code>)  *No description*
  * **containers** (<code>Array<[ContainerProps](#cdk8s-plus-17-containerprops)></code>)  List of containers belonging to the pod. __*Default*__: No containers. Note that a pod spec must include at least one container.
  * **restartPolicy** (<code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code>)  Restart policy for all containers within the pod. __*Default*__: RestartPolicy.ALWAYS
  * **serviceAccount** (<code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code>)  A service account provides an identity for processes that run in a Pod. __*Default*__: No service account.
  * **volumes** (<code>Array<[Volume](#cdk8s-plus-17-volume)></code>)  List of volumes that can be mounted by containers belonging to the pod. __*Default*__: No volumes.



### Properties


Name | Type | Description 
-----|------|-------------
**containers**🔹 | <code>Array<[Container](#cdk8s-plus-17-container)></code> | The containers belonging to the pod.
**volumes**🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | The volumes associated with this pod.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Optional*__
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | The service account used to run this pod.<br/>__*Optional*__

### Methods


#### addContainer(container)🔹 <a id="cdk8s-plus-17-podspec-addcontainer"></a>

Add a container to the pod.

```ts
addContainer(container: ContainerProps): Container
```

* **container** (<code>[ContainerProps](#cdk8s-plus-17-containerprops)</code>)  *No description*
  * **image** (<code>string</code>)  Docker image name. 
  * **args** (<code>Array<string></code>)  Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided. __*Default*__: []
  * **command** (<code>Array<string></code>)  Entrypoint array. __*Default*__: The docker image's ENTRYPOINT.
  * **env** (<code>Map<string, [EnvValue](#cdk8s-plus-17-envvalue)></code>)  List of environment variables to set in the container. __*Default*__: No environment variables.
  * **imagePullPolicy** (<code>[ImagePullPolicy](#cdk8s-plus-17-imagepullpolicy)</code>)  Image pull policy for this container. __*Default*__: ImagePullPolicy.ALWAYS
  * **liveness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Periodic probe of container liveness. __*Default*__: no liveness probe is defined
  * **name** (<code>string</code>)  Name of the container specified as a DNS_LABEL. __*Default*__: 'main'
  * **port** (<code>number</code>)  Number of port to expose on the pod's IP address. __*Default*__: No port is exposed.
  * **readiness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Determines when the container is ready to serve traffic. __*Default*__: no readiness probe is defined
  * **startup** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  StartupProbe indicates that the Pod has successfully initialized. __*Default*__: no startup probe is defined.
  * **volumeMounts** (<code>Array<[VolumeMount](#cdk8s-plus-17-volumemount)></code>)  Pod volumes to mount into the container's filesystem. __*Optional*__
  * **workingDir** (<code>string</code>)  Container's working directory. __*Default*__: The container runtime's default.

__Returns__:
* <code>[Container](#cdk8s-plus-17-container)</code>

#### addVolume(volume)🔹 <a id="cdk8s-plus-17-podspec-addvolume"></a>

Add a volume to the pod.

```ts
addVolume(volume: Volume): void
```

* **volume** (<code>[Volume](#cdk8s-plus-17-volume)</code>)  *No description*






## class PodTemplate 🔹 <a id="cdk8s-plus-17-podtemplate"></a>

Provides read/write capabilities ontop of a `PodTemplateProps`.

__Implements__: [IPodSpec](#cdk8s-plus-17-ipodspec), [IPodTemplate](#cdk8s-plus-17-ipodtemplate), [IPodSpec](#cdk8s-plus-17-ipodspec)
__Extends__: [PodSpec](#cdk8s-plus-17-podspec)

### Initializer




```ts
new PodTemplate(props?: PodTemplateProps)
```

* **props** (<code>[PodTemplateProps](#cdk8s-plus-17-podtemplateprops)</code>)  *No description*
  * **containers** (<code>Array<[ContainerProps](#cdk8s-plus-17-containerprops)></code>)  List of containers belonging to the pod. __*Default*__: No containers. Note that a pod spec must include at least one container.
  * **restartPolicy** (<code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code>)  Restart policy for all containers within the pod. __*Default*__: RestartPolicy.ALWAYS
  * **serviceAccount** (<code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code>)  A service account provides an identity for processes that run in a Pod. __*Default*__: No service account.
  * **volumes** (<code>Array<[Volume](#cdk8s-plus-17-volume)></code>)  List of volumes that can be mounted by containers belonging to the pod. __*Default*__: No volumes.
  * **podMetadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  The pod metadata. __*Optional*__



### Properties


Name | Type | Description 
-----|------|-------------
**podMetadata**🔹 | <code>[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)</code> | Provides read/write access to the underlying pod metadata of the resource.



## class Probe 🔹 <a id="cdk8s-plus-17-probe"></a>

Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.


### Initializer




```ts
new Probe()
```



### Methods


#### *static* fromCommand(command, options?)🔹 <a id="cdk8s-plus-17-probe-fromcommand"></a>

Defines a probe based on a command which is executed within the container.

```ts
static fromCommand(command: Array<string>, options?: CommandProbeOptions): Probe
```

* **command** (<code>Array<string></code>)  The command to execute.
* **options** (<code>[CommandProbeOptions](#cdk8s-plus-17-commandprobeoptions)</code>)  Options.
  * **failureThreshold** (<code>number</code>)  Minimum consecutive failures for the probe to be considered failed after having succeeded. __*Default*__: 3
  * **initialDelaySeconds** (<code>[Duration](#cdk8s-duration)</code>)  Number of seconds after the container has started before liveness probes are initiated. __*Default*__: immediate
  * **periodSeconds** (<code>[Duration](#cdk8s-duration)</code>)  How often (in seconds) to perform the probe. __*Default*__: Duration.seconds(10) Minimum value is 1.
  * **successThreshold** (<code>number</code>)  Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. __*Default*__: 1 Must be 1 for liveness and startup. Minimum value is 1.
  * **timeoutSeconds** (<code>[Duration](#cdk8s-duration)</code>)  Number of seconds after which the probe times out. __*Default*__: Duration.seconds(1)

__Returns__:
* <code>[Probe](#cdk8s-plus-17-probe)</code>

#### *static* fromHttpGet(path, options?)🔹 <a id="cdk8s-plus-17-probe-fromhttpget"></a>

Defines a probe based on an HTTP GET request to the IP address of the container.

```ts
static fromHttpGet(path: string, options?: HttpGetProbeOptions): Probe
```

* **path** (<code>string</code>)  The URL path to hit.
* **options** (<code>[HttpGetProbeOptions](#cdk8s-plus-17-httpgetprobeoptions)</code>)  Options.
  * **failureThreshold** (<code>number</code>)  Minimum consecutive failures for the probe to be considered failed after having succeeded. __*Default*__: 3
  * **initialDelaySeconds** (<code>[Duration](#cdk8s-duration)</code>)  Number of seconds after the container has started before liveness probes are initiated. __*Default*__: immediate
  * **periodSeconds** (<code>[Duration](#cdk8s-duration)</code>)  How often (in seconds) to perform the probe. __*Default*__: Duration.seconds(10) Minimum value is 1.
  * **successThreshold** (<code>number</code>)  Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. __*Default*__: 1 Must be 1 for liveness and startup. Minimum value is 1.
  * **timeoutSeconds** (<code>[Duration](#cdk8s-duration)</code>)  Number of seconds after which the probe times out. __*Default*__: Duration.seconds(1)
  * **port** (<code>number</code>)  The TCP port to use when sending the GET request. __*Default*__: defaults to `container.port`.

__Returns__:
* <code>[Probe](#cdk8s-plus-17-probe)</code>



## class Resource 🔹 <a id="cdk8s-plus-17-resource"></a>

Base class for all Kubernetes objects in stdk8s.

Represents a single
resource.

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-17-iresource)
__Extends__: [Construct](#constructs-construct)
__Implemented by__: [ConfigMap](#cdk8s-plus-17-configmap), [Deployment](#cdk8s-plus-17-deployment), [IngressV1Beta1](#cdk8s-plus-17-ingressv1beta1), [Job](#cdk8s-plus-17-job), [Pod](#cdk8s-plus-17-pod), [Secret](#cdk8s-plus-17-secret), [Service](#cdk8s-plus-17-service), [ServiceAccount](#cdk8s-plus-17-serviceaccount)

### Initializer




```ts
new Resource(scope: Construct, id: string, _: ResourceProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **_** (<code>[ResourceProps](#cdk8s-plus-17-resourceprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**metadata**🔹 | <code>[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)</code> | <span></span>
**name**🔹 | <code>string</code> | The name of this API object.



## class Secret 🔹 <a id="cdk8s-plus-17-secret"></a>

Kubernetes Secrets let you store and manage sensitive information, such as passwords, OAuth tokens, and ssh keys.

Storing confidential information in a
Secret is safer and more flexible than putting it verbatim in a Pod
definition or in a container image.

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-17-iresource), [ISecret](#cdk8s-plus-17-isecret), [IResource](#cdk8s-plus-17-iresource)
__Extends__: [Resource](#cdk8s-plus-17-resource)

### Initializer




```ts
new Secret(scope: Construct, id: string, props?: SecretProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[SecretProps](#cdk8s-plus-17-secretprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **stringData** (<code>Map<string, string></code>)  stringData allows specifying non-binary secret data in string form. __*Optional*__
  * **type** (<code>string</code>)  Optional type associated with the secret. __*Default*__: undefined - Don't set a type.



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.

### Methods


#### addStringData(key, value)🔹 <a id="cdk8s-plus-17-secret-addstringdata"></a>

Adds a string data field to the secert.

```ts
addStringData(key: string, value: string): void
```

* **key** (<code>string</code>)  Key.
* **value** (<code>string</code>)  Value.




#### getStringData(key)🔹 <a id="cdk8s-plus-17-secret-getstringdata"></a>

Gets a string data by key or undefined.

```ts
getStringData(key: string): string
```

* **key** (<code>string</code>)  Key.

__Returns__:
* <code>string</code>

#### *static* fromSecretName(name)🔹 <a id="cdk8s-plus-17-secret-fromsecretname"></a>

Imports a secret from the cluster as a reference.

```ts
static fromSecretName(name: string): ISecret
```

* **name** (<code>string</code>)  The name of the secret to reference.

__Returns__:
* <code>[ISecret](#cdk8s-plus-17-isecret)</code>



## class Service 🔹 <a id="cdk8s-plus-17-service"></a>

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

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-17-iresource)
__Extends__: [Resource](#cdk8s-plus-17-resource)

### Initializer




```ts
new Service(scope: Construct, id: string, props?: ServiceProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ServiceProps](#cdk8s-plus-17-serviceprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **clusterIP** (<code>string</code>)  The IP address of the service and is usually assigned randomly by the master. __*Default*__: Automatically assigned.
  * **externalIPs** (<code>Array<string></code>)  A list of IP addresses for which nodes in the cluster will also accept traffic for this service. __*Default*__: No external IPs.
  * **ports** (<code>Array<[ServicePort](#cdk8s-plus-17-serviceport)></code>)  The port exposed by this service. __*Optional*__
  * **type** (<code>[ServiceType](#cdk8s-plus-17-servicetype)</code>)  Determines how the Service is exposed. __*Default*__: ServiceType.ClusterIP



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**ports**🔹 | <code>Array<[ServicePort](#cdk8s-plus-17-serviceport)></code> | Ports for this service.
**selector**🔹 | <code>Map<string, string></code> | Returns the labels which are used to select pods for this service.
**type**🔹 | <code>[ServiceType](#cdk8s-plus-17-servicetype)</code> | Determines how the Service is exposed.
**clusterIP**?🔹 | <code>string</code> | The IP address of the service and is usually assigned randomly by the master.<br/>__*Optional*__

### Methods


#### addDeployment(deployment, port, options?)🔹 <a id="cdk8s-plus-17-service-adddeployment"></a>

Associate a deployment to this service.

If not targetPort is specific in the portOptions, then requests will be routed
to the port exposed by the first container in the deployment's pods.
The deployment's `labelSelector` will be used to select pods.

```ts
addDeployment(deployment: Deployment, port: number, options?: ServicePortOptions): void
```

* **deployment** (<code>[Deployment](#cdk8s-plus-17-deployment)</code>)  The deployment to expose.
* **port** (<code>number</code>)  The external port.
* **options** (<code>[ServicePortOptions](#cdk8s-plus-17-serviceportoptions)</code>)  Optional settings for the port.
  * **name** (<code>string</code>)  The name of this port within the service. __*Optional*__
  * **nodePort** (<code>number</code>)  The port on each node on which this service is exposed when type=NodePort or LoadBalancer. __*Default*__: to auto-allocate a port if the ServiceType of this Service requires one.
  * **protocol** (<code>[Protocol](#cdk8s-plus-17-protocol)</code>)  The IP protocol for this port. __*Default*__: Protocol.TCP
  * **targetPort** (<code>number</code>)  The port number the service will redirect to. __*Default*__: The value of `port` will be used.




#### addSelector(label, value)🔹 <a id="cdk8s-plus-17-service-addselector"></a>

Services defined using this spec will select pods according the provided label.

```ts
addSelector(label: string, value: string): void
```

* **label** (<code>string</code>)  The label key.
* **value** (<code>string</code>)  The label value.




#### serve(port, options?)🔹 <a id="cdk8s-plus-17-service-serve"></a>

Configure a port the service will bind to.

This method can be called multiple times.

```ts
serve(port: number, options?: ServicePortOptions): void
```

* **port** (<code>number</code>)  The port definition.
* **options** (<code>[ServicePortOptions](#cdk8s-plus-17-serviceportoptions)</code>)  *No description*
  * **name** (<code>string</code>)  The name of this port within the service. __*Optional*__
  * **nodePort** (<code>number</code>)  The port on each node on which this service is exposed when type=NodePort or LoadBalancer. __*Default*__: to auto-allocate a port if the ServiceType of this Service requires one.
  * **protocol** (<code>[Protocol](#cdk8s-plus-17-protocol)</code>)  The IP protocol for this port. __*Default*__: Protocol.TCP
  * **targetPort** (<code>number</code>)  The port number the service will redirect to. __*Default*__: The value of `port` will be used.






## class ServiceAccount 🔹 <a id="cdk8s-plus-17-serviceaccount"></a>

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the apiserver.
When they do, they are authenticated as a particular Service Account (for
example, default).

__Implements__: [IConstruct](#constructs-iconstruct), [IResource](#cdk8s-plus-17-iresource), [IServiceAccount](#cdk8s-plus-17-iserviceaccount), [IResource](#cdk8s-plus-17-iresource)
__Extends__: [Resource](#cdk8s-plus-17-resource)

### Initializer




```ts
new ServiceAccount(scope: Construct, id: string, props?: ServiceAccountProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ServiceAccountProps](#cdk8s-plus-17-serviceaccountprops)</code>)  *No description*
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Metadata that all persisted resources must have, which includes all objects users must create. __*Optional*__
  * **secrets** (<code>Array<[ISecret](#cdk8s-plus-17-isecret)></code>)  List of secrets allowed to be used by pods running using this ServiceAccount. __*Optional*__



### Properties


Name | Type | Description 
-----|------|-------------
**apiObject**🔹 | <code>[ApiObject](#cdk8s-apiobject)</code> | The underlying cdk8s API object.
**secrets**🔹 | <code>Array<[ISecret](#cdk8s-plus-17-isecret)></code> | List of secrets allowed to be used by pods running using this service account.

### Methods


#### addSecret(secret)🔹 <a id="cdk8s-plus-17-serviceaccount-addsecret"></a>

Allow a secret to be accessed by pods using this service account.

```ts
addSecret(secret: ISecret): void
```

* **secret** (<code>[ISecret](#cdk8s-plus-17-isecret)</code>)  The secret.




#### *static* fromServiceAccountName(name)🔹 <a id="cdk8s-plus-17-serviceaccount-fromserviceaccountname"></a>

Imports a service account from the cluster as a reference.

```ts
static fromServiceAccountName(name: string): IServiceAccount
```

* **name** (<code>string</code>)  The name of the service account resource.

__Returns__:
* <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code>



## class Volume 🔹 <a id="cdk8s-plus-17-volume"></a>

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


#### *static* fromConfigMap(configMap, options?)🔹 <a id="cdk8s-plus-17-volume-fromconfigmap"></a>

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

* **configMap** (<code>[IConfigMap](#cdk8s-plus-17-iconfigmap)</code>)  The config map to use to populate the volume.
* **options** (<code>[ConfigMapVolumeOptions](#cdk8s-plus-17-configmapvolumeoptions)</code>)  Options.
  * **defaultMode** (<code>number</code>)  Mode bits to use on created files by default. __*Default*__: 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
  * **items** (<code>Map<string, [PathMapping](#cdk8s-plus-17-pathmapping)></code>)  If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. __*Default*__: no mapping
  * **name** (<code>string</code>)  The volume name. __*Default*__: auto-generated
  * **optional** (<code>boolean</code>)  Specify whether the ConfigMap or its keys must be defined. __*Default*__: undocumented

__Returns__:
* <code>[Volume](#cdk8s-plus-17-volume)</code>

#### *static* fromEmptyDir(name, options?)🔹 <a id="cdk8s-plus-17-volume-fromemptydir"></a>

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
* **options** (<code>[EmptyDirVolumeOptions](#cdk8s-plus-17-emptydirvolumeoptions)</code>)  - Additional options.
  * **medium** (<code>[EmptyDirMedium](#cdk8s-plus-17-emptydirmedium)</code>)  By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment. __*Default*__: EmptyDirMedium.DEFAULT
  * **sizeLimit** (<code>[Size](#cdk8s-size)</code>)  Total amount of local storage required for this EmptyDir volume. __*Default*__: limit is undefined

__Returns__:
* <code>[Volume](#cdk8s-plus-17-volume)</code>



## struct AddDirectoryOptions 🔹 <a id="cdk8s-plus-17-adddirectoryoptions"></a>


Options for `configmap.addDirectory()`.



Name | Type | Description 
-----|------|-------------
**exclude**?🔹 | <code>Array<string></code> | Glob patterns to exclude when adding files.<br/>__*Default*__: include all files
**keyPrefix**?🔹 | <code>string</code> | A prefix to add to all keys in the config map.<br/>__*Default*__: ""



## struct CommandProbeOptions 🔹 <a id="cdk8s-plus-17-commandprobeoptions"></a>


Options for `Probe.fromCommand()`.



Name | Type | Description 
-----|------|-------------
**failureThreshold**?🔹 | <code>number</code> | Minimum consecutive failures for the probe to be considered failed after having succeeded.<br/>__*Default*__: 3
**initialDelaySeconds**?🔹 | <code>[Duration](#cdk8s-duration)</code> | Number of seconds after the container has started before liveness probes are initiated.<br/>__*Default*__: immediate
**periodSeconds**?🔹 | <code>[Duration](#cdk8s-duration)</code> | How often (in seconds) to perform the probe.<br/>__*Default*__: Duration.seconds(10) Minimum value is 1.
**successThreshold**?🔹 | <code>number</code> | Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.<br/>__*Default*__: 1 Must be 1 for liveness and startup. Minimum value is 1.
**timeoutSeconds**?🔹 | <code>[Duration](#cdk8s-duration)</code> | Number of seconds after which the probe times out.<br/>__*Default*__: Duration.seconds(1)



## struct ConfigMapProps 🔹 <a id="cdk8s-plus-17-configmapprops"></a>


Properties for initialization of `ConfigMap`.



Name | Type | Description 
-----|------|-------------
**binaryData**?🔹 | <code>Map<string, string></code> | BinaryData contains the binary data.<br/>__*Optional*__
**data**?🔹 | <code>Map<string, string></code> | Data contains the configuration data.<br/>__*Optional*__
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__



## struct ConfigMapVolumeOptions 🔹 <a id="cdk8s-plus-17-configmapvolumeoptions"></a>


Options for the ConfigMap-based volume.



Name | Type | Description 
-----|------|-------------
**defaultMode**?🔹 | <code>number</code> | Mode bits to use on created files by default.<br/>__*Default*__: 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
**items**?🔹 | <code>Map<string, [PathMapping](#cdk8s-plus-17-pathmapping)></code> | If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.<br/>__*Default*__: no mapping
**name**?🔹 | <code>string</code> | The volume name.<br/>__*Default*__: auto-generated
**optional**?🔹 | <code>boolean</code> | Specify whether the ConfigMap or its keys must be defined.<br/>__*Default*__: undocumented



## struct ContainerProps 🔹 <a id="cdk8s-plus-17-containerprops"></a>


Properties for creating a container.



Name | Type | Description 
-----|------|-------------
**image**🔹 | <code>string</code> | Docker image name.
**args**?🔹 | <code>Array<string></code> | Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided.<br/>__*Default*__: []
**command**?🔹 | <code>Array<string></code> | Entrypoint array.<br/>__*Default*__: The docker image's ENTRYPOINT.
**env**?🔹 | <code>Map<string, [EnvValue](#cdk8s-plus-17-envvalue)></code> | List of environment variables to set in the container.<br/>__*Default*__: No environment variables.
**imagePullPolicy**?🔹 | <code>[ImagePullPolicy](#cdk8s-plus-17-imagepullpolicy)</code> | Image pull policy for this container.<br/>__*Default*__: ImagePullPolicy.ALWAYS
**liveness**?🔹 | <code>[Probe](#cdk8s-plus-17-probe)</code> | Periodic probe of container liveness.<br/>__*Default*__: no liveness probe is defined
**name**?🔹 | <code>string</code> | Name of the container specified as a DNS_LABEL.<br/>__*Default*__: 'main'
**port**?🔹 | <code>number</code> | Number of port to expose on the pod's IP address.<br/>__*Default*__: No port is exposed.
**readiness**?🔹 | <code>[Probe](#cdk8s-plus-17-probe)</code> | Determines when the container is ready to serve traffic.<br/>__*Default*__: no readiness probe is defined
**startup**?🔹 | <code>[Probe](#cdk8s-plus-17-probe)</code> | StartupProbe indicates that the Pod has successfully initialized.<br/>__*Default*__: no startup probe is defined.
**volumeMounts**?🔹 | <code>Array<[VolumeMount](#cdk8s-plus-17-volumemount)></code> | Pod volumes to mount into the container's filesystem.<br/>__*Optional*__
**workingDir**?🔹 | <code>string</code> | Container's working directory.<br/>__*Default*__: The container runtime's default.



## struct DeploymentProps 🔹 <a id="cdk8s-plus-17-deploymentprops"></a>


Properties for initialization of `Deployment`.



Name | Type | Description 
-----|------|-------------
**containers**?🔹 | <code>Array<[ContainerProps](#cdk8s-plus-17-containerprops)></code> | List of containers belonging to the pod.<br/>__*Default*__: No containers. Note that a pod spec must include at least one container.
**defaultSelector**?🔹 | <code>boolean</code> | Automatically allocates a pod selector for this deployment.<br/>__*Default*__: true
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**podMetadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | The pod metadata.<br/>__*Optional*__
**replicas**?🔹 | <code>number</code> | Number of desired pods.<br/>__*Default*__: 1
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Default*__: RestartPolicy.ALWAYS
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | A service account provides an identity for processes that run in a Pod.<br/>__*Default*__: No service account.
**volumes**?🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.<br/>__*Default*__: No volumes.



## struct EmptyDirVolumeOptions 🔹 <a id="cdk8s-plus-17-emptydirvolumeoptions"></a>


Options for volumes populated with an empty directory.



Name | Type | Description 
-----|------|-------------
**medium**?🔹 | <code>[EmptyDirMedium](#cdk8s-plus-17-emptydirmedium)</code> | By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment.<br/>__*Default*__: EmptyDirMedium.DEFAULT
**sizeLimit**?🔹 | <code>[Size](#cdk8s-size)</code> | Total amount of local storage required for this EmptyDir volume.<br/>__*Default*__: limit is undefined



## struct EnvValueFromConfigMapOptions 🔹 <a id="cdk8s-plus-17-envvaluefromconfigmapoptions"></a>


Options to specify an envionment variable value from a ConfigMap key.



Name | Type | Description 
-----|------|-------------
**optional**?🔹 | <code>boolean</code> | Specify whether the ConfigMap or its key must be defined.<br/>__*Default*__: false



## struct EnvValueFromProcessOptions 🔹 <a id="cdk8s-plus-17-envvaluefromprocessoptions"></a>


Options to specify an environment variable value from the process environment.



Name | Type | Description 
-----|------|-------------
**required**?🔹 | <code>boolean</code> | Specify whether the key must exist in the environment.<br/>__*Default*__: false



## struct EnvValueFromSecretOptions 🔹 <a id="cdk8s-plus-17-envvaluefromsecretoptions"></a>


Options to specify an environment variable value from a Secret.



Name | Type | Description 
-----|------|-------------
**optional**?🔹 | <code>boolean</code> | Specify whether the Secret or its key must be defined.<br/>__*Default*__: false



## struct ExposeOptions 🔹 <a id="cdk8s-plus-17-exposeoptions"></a>


Options for exposing a deployment via a service.



Name | Type | Description 
-----|------|-------------
**name**?🔹 | <code>string</code> | The name of the service to expose.<br/>__*Default*__: undefined Uses the system generated name.
**protocol**?🔹 | <code>[Protocol](#cdk8s-plus-17-protocol)</code> | The IP protocol for this port.<br/>__*Default*__: Protocol.TCP
**serviceType**?🔹 | <code>[ServiceType](#cdk8s-plus-17-servicetype)</code> | The type of the exposed service.<br/>__*Default*__: ClusterIP.
**targetPort**?🔹 | <code>number</code> | The port number the service will redirect to.<br/>__*Default*__: The port of the first container in the deployment (ie. containers[0].port)



## struct HttpGetProbeOptions 🔹 <a id="cdk8s-plus-17-httpgetprobeoptions"></a>


Options for `Probe.fromHttpGet()`.



Name | Type | Description 
-----|------|-------------
**failureThreshold**?🔹 | <code>number</code> | Minimum consecutive failures for the probe to be considered failed after having succeeded.<br/>__*Default*__: 3
**initialDelaySeconds**?🔹 | <code>[Duration](#cdk8s-duration)</code> | Number of seconds after the container has started before liveness probes are initiated.<br/>__*Default*__: immediate
**periodSeconds**?🔹 | <code>[Duration](#cdk8s-duration)</code> | How often (in seconds) to perform the probe.<br/>__*Default*__: Duration.seconds(10) Minimum value is 1.
**port**?🔹 | <code>number</code> | The TCP port to use when sending the GET request.<br/>__*Default*__: defaults to `container.port`.
**successThreshold**?🔹 | <code>number</code> | Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.<br/>__*Default*__: 1 Must be 1 for liveness and startup. Minimum value is 1.
**timeoutSeconds**?🔹 | <code>[Duration](#cdk8s-duration)</code> | Number of seconds after which the probe times out.<br/>__*Default*__: Duration.seconds(1)



## interface IConfigMap 🔹 <a id="cdk8s-plus-17-iconfigmap"></a>

__Implemented by__: [ConfigMap](#cdk8s-plus-17-configmap)
__Obtainable from__: [ConfigMap](#cdk8s-plus-17-configmap).[fromConfigMapName](#cdk8s-plus-17-configmap#cdk8s-plus-17-configmap-fromconfigmapname)()

Represents a config map.

### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface IPodSpec 🔹 <a id="cdk8s-plus-17-ipodspec"></a>

__Implemented by__: [Deployment](#cdk8s-plus-17-deployment), [Job](#cdk8s-plus-17-job), [Pod](#cdk8s-plus-17-pod), [PodSpec](#cdk8s-plus-17-podspec), [PodTemplate](#cdk8s-plus-17-podtemplate)

Represents a resource that can be configured with a kuberenets pod spec. (e.g `Deployment`, `Job`, `Pod`, ...).

Use the `PodSpec` class as an implementation helper.

### Properties


Name | Type | Description 
-----|------|-------------
**containers**🔹 | <code>Array<[Container](#cdk8s-plus-17-container)></code> | The containers belonging to the pod.
**volumes**🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | The volumes associated with this pod.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Optional*__
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | The service account used to run this pod.<br/>__*Optional*__

### Methods


#### addContainer(container)🔹 <a id="cdk8s-plus-17-ipodspec-addcontainer"></a>

Add a container to the pod.

```ts
addContainer(container: ContainerProps): Container
```

* **container** (<code>[ContainerProps](#cdk8s-plus-17-containerprops)</code>)  The container.
  * **image** (<code>string</code>)  Docker image name. 
  * **args** (<code>Array<string></code>)  Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided. __*Default*__: []
  * **command** (<code>Array<string></code>)  Entrypoint array. __*Default*__: The docker image's ENTRYPOINT.
  * **env** (<code>Map<string, [EnvValue](#cdk8s-plus-17-envvalue)></code>)  List of environment variables to set in the container. __*Default*__: No environment variables.
  * **imagePullPolicy** (<code>[ImagePullPolicy](#cdk8s-plus-17-imagepullpolicy)</code>)  Image pull policy for this container. __*Default*__: ImagePullPolicy.ALWAYS
  * **liveness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Periodic probe of container liveness. __*Default*__: no liveness probe is defined
  * **name** (<code>string</code>)  Name of the container specified as a DNS_LABEL. __*Default*__: 'main'
  * **port** (<code>number</code>)  Number of port to expose on the pod's IP address. __*Default*__: No port is exposed.
  * **readiness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Determines when the container is ready to serve traffic. __*Default*__: no readiness probe is defined
  * **startup** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  StartupProbe indicates that the Pod has successfully initialized. __*Default*__: no startup probe is defined.
  * **volumeMounts** (<code>Array<[VolumeMount](#cdk8s-plus-17-volumemount)></code>)  Pod volumes to mount into the container's filesystem. __*Optional*__
  * **workingDir** (<code>string</code>)  Container's working directory. __*Default*__: The container runtime's default.

__Returns__:
* <code>[Container](#cdk8s-plus-17-container)</code>

#### addVolume(volume)🔹 <a id="cdk8s-plus-17-ipodspec-addvolume"></a>

Add a volume to the pod.

```ts
addVolume(volume: Volume): void
```

* **volume** (<code>[Volume](#cdk8s-plus-17-volume)</code>)  The volume.






## interface IPodTemplate 🔹 <a id="cdk8s-plus-17-ipodtemplate"></a>

__Implemented by__: [Deployment](#cdk8s-plus-17-deployment), [Job](#cdk8s-plus-17-job), [PodTemplate](#cdk8s-plus-17-podtemplate)

Represents a resource that can be configured with a kuberenets pod template. (e.g `Deployment`, `Job`, ...).

Use the `PodTemplate` class as an implementation helper.

### Properties


Name | Type | Description 
-----|------|-------------
**containers**🔹 | <code>Array<[Container](#cdk8s-plus-17-container)></code> | The containers belonging to the pod.
**podMetadata**🔹 | <code>[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)</code> | Provides read/write access to the underlying pod metadata of the resource.
**volumes**🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | The volumes associated with this pod.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Optional*__
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | The service account used to run this pod.<br/>__*Optional*__

### Methods


#### addContainer(container)🔹 <a id="cdk8s-plus-17-ipodtemplate-addcontainer"></a>

Add a container to the pod.

```ts
addContainer(container: ContainerProps): Container
```

* **container** (<code>[ContainerProps](#cdk8s-plus-17-containerprops)</code>)  The container.
  * **image** (<code>string</code>)  Docker image name. 
  * **args** (<code>Array<string></code>)  Arguments to the entrypoint. The docker image's CMD is used if `command` is not provided. __*Default*__: []
  * **command** (<code>Array<string></code>)  Entrypoint array. __*Default*__: The docker image's ENTRYPOINT.
  * **env** (<code>Map<string, [EnvValue](#cdk8s-plus-17-envvalue)></code>)  List of environment variables to set in the container. __*Default*__: No environment variables.
  * **imagePullPolicy** (<code>[ImagePullPolicy](#cdk8s-plus-17-imagepullpolicy)</code>)  Image pull policy for this container. __*Default*__: ImagePullPolicy.ALWAYS
  * **liveness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Periodic probe of container liveness. __*Default*__: no liveness probe is defined
  * **name** (<code>string</code>)  Name of the container specified as a DNS_LABEL. __*Default*__: 'main'
  * **port** (<code>number</code>)  Number of port to expose on the pod's IP address. __*Default*__: No port is exposed.
  * **readiness** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  Determines when the container is ready to serve traffic. __*Default*__: no readiness probe is defined
  * **startup** (<code>[Probe](#cdk8s-plus-17-probe)</code>)  StartupProbe indicates that the Pod has successfully initialized. __*Default*__: no startup probe is defined.
  * **volumeMounts** (<code>Array<[VolumeMount](#cdk8s-plus-17-volumemount)></code>)  Pod volumes to mount into the container's filesystem. __*Optional*__
  * **workingDir** (<code>string</code>)  Container's working directory. __*Default*__: The container runtime's default.

__Returns__:
* <code>[Container](#cdk8s-plus-17-container)</code>

#### addVolume(volume)🔹 <a id="cdk8s-plus-17-ipodtemplate-addvolume"></a>

Add a volume to the pod.

```ts
addVolume(volume: Volume): void
```

* **volume** (<code>[Volume](#cdk8s-plus-17-volume)</code>)  The volume.






## interface IResource 🔹 <a id="cdk8s-plus-17-iresource"></a>

__Implemented by__: [ConfigMap](#cdk8s-plus-17-configmap), [Deployment](#cdk8s-plus-17-deployment), [IngressV1Beta1](#cdk8s-plus-17-ingressv1beta1), [Job](#cdk8s-plus-17-job), [Pod](#cdk8s-plus-17-pod), [Secret](#cdk8s-plus-17-secret), [Service](#cdk8s-plus-17-service), [ServiceAccount](#cdk8s-plus-17-serviceaccount)

Represents a resource.

### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface ISecret 🔹 <a id="cdk8s-plus-17-isecret"></a>

__Implemented by__: [Secret](#cdk8s-plus-17-secret)
__Obtainable from__: [Secret](#cdk8s-plus-17-secret).[fromSecretName](#cdk8s-plus-17-secret#cdk8s-plus-17-secret-fromsecretname)()



### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## interface IServiceAccount 🔹 <a id="cdk8s-plus-17-iserviceaccount"></a>

__Implemented by__: [ServiceAccount](#cdk8s-plus-17-serviceaccount)
__Obtainable from__: [ServiceAccount](#cdk8s-plus-17-serviceaccount).[fromServiceAccountName](#cdk8s-plus-17-serviceaccount#cdk8s-plus-17-serviceaccount-fromserviceaccountname)()



### Properties


Name | Type | Description 
-----|------|-------------
**name**🔹 | <code>string</code> | The Kubernetes name of this resource.



## struct IngressV1Beta1Props 🔹 <a id="cdk8s-plus-17-ingressv1beta1props"></a>


Properties for `Ingress`.



Name | Type | Description 
-----|------|-------------
**defaultBackend**?🔹 | <code>[IngressV1Beta1Backend](#cdk8s-plus-17-ingressv1beta1backend)</code> | The default backend services requests that do not match any rule.<br/>__*Optional*__
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**rules**?🔹 | <code>Array<[IngressV1Beta1Rule](#cdk8s-plus-17-ingressv1beta1rule)></code> | Routing rules for this ingress.<br/>__*Optional*__



## struct IngressV1Beta1Rule 🔹 <a id="cdk8s-plus-17-ingressv1beta1rule"></a>


Represents the rules mapping the paths under a specified host to the related backend services.

Incoming requests are first evaluated for a host match,
then routed to the backend associated with the matching path.



Name | Type | Description 
-----|------|-------------
**backend**🔹 | <code>[IngressV1Beta1Backend](#cdk8s-plus-17-ingressv1beta1backend)</code> | Backend defines the referenced service endpoint to which the traffic will be forwarded to.
**host**?🔹 | <code>string</code> | Host is the fully qualified domain name of a network host, as defined by RFC 3986.<br/>__*Default*__: If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
**path**?🔹 | <code>string</code> | Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'.<br/>__*Default*__: If unspecified, the path defaults to a catch all sending traffic to the backend.



## struct JobProps 🔹 <a id="cdk8s-plus-17-jobprops"></a>


Properties for initialization of `Job`.



Name | Type | Description 
-----|------|-------------
**containers**?🔹 | <code>Array<[ContainerProps](#cdk8s-plus-17-containerprops)></code> | List of containers belonging to the pod.<br/>__*Default*__: No containers. Note that a pod spec must include at least one container.
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**podMetadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | The pod metadata.<br/>__*Optional*__
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Default*__: RestartPolicy.ALWAYS
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | A service account provides an identity for processes that run in a Pod.<br/>__*Default*__: No service account.
**ttlAfterFinished**?🔹 | <code>[Duration](#cdk8s-duration)</code> | Limits the lifetime of a Job that has finished execution (either Complete or Failed).<br/>__*Default*__: If this field is unset, the Job won't be automatically deleted.
**volumes**?🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.<br/>__*Default*__: No volumes.



## struct MountOptions 🔹 <a id="cdk8s-plus-17-mountoptions"></a>


Options for mounts.



Name | Type | Description 
-----|------|-------------
**propagation**?🔹 | <code>[MountPropagation](#cdk8s-plus-17-mountpropagation)</code> | Determines how mounts are propagated from the host to container and the other way around.<br/>__*Default*__: MountPropagation.NONE
**readOnly**?🔹 | <code>boolean</code> | Mounted read-only if true, read-write otherwise (false or unspecified).<br/>__*Default*__: false
**subPath**?🔹 | <code>string</code> | Path within the volume from which the container's volume should be mounted.).<br/>__*Default*__: "" the volume's root
**subPathExpr**?🔹 | <code>string</code> | Expanded path within the volume from which the container's volume should be mounted.<br/>__*Default*__: "" volume's root.



## struct PathMapping 🔹 <a id="cdk8s-plus-17-pathmapping"></a>


Maps a string key to a path within a volume.



Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | The relative path of the file to map the key to.
**mode**?🔹 | <code>number</code> | Optional: mode bits to use on this file, must be a value between 0 and 0777.<br/>__*Optional*__



## struct PodProps 🔹 <a id="cdk8s-plus-17-podprops"></a>


Properties for initialization of `Pod`.



Name | Type | Description 
-----|------|-------------
**containers**?🔹 | <code>Array<[ContainerProps](#cdk8s-plus-17-containerprops)></code> | List of containers belonging to the pod.<br/>__*Default*__: No containers. Note that a pod spec must include at least one container.
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Default*__: RestartPolicy.ALWAYS
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | A service account provides an identity for processes that run in a Pod.<br/>__*Default*__: No service account.
**volumes**?🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.<br/>__*Default*__: No volumes.



## struct PodSpecProps 🔹 <a id="cdk8s-plus-17-podspecprops"></a>


Properties of a `PodSpec`.



Name | Type | Description 
-----|------|-------------
**containers**?🔹 | <code>Array<[ContainerProps](#cdk8s-plus-17-containerprops)></code> | List of containers belonging to the pod.<br/>__*Default*__: No containers. Note that a pod spec must include at least one container.
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Default*__: RestartPolicy.ALWAYS
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | A service account provides an identity for processes that run in a Pod.<br/>__*Default*__: No service account.
**volumes**?🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.<br/>__*Default*__: No volumes.



## struct PodTemplateProps 🔹 <a id="cdk8s-plus-17-podtemplateprops"></a>


Properties of a `PodTemplate`.

Adds metadata information on top of the spec.



Name | Type | Description 
-----|------|-------------
**containers**?🔹 | <code>Array<[ContainerProps](#cdk8s-plus-17-containerprops)></code> | List of containers belonging to the pod.<br/>__*Default*__: No containers. Note that a pod spec must include at least one container.
**podMetadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | The pod metadata.<br/>__*Optional*__
**restartPolicy**?🔹 | <code>[RestartPolicy](#cdk8s-plus-17-restartpolicy)</code> | Restart policy for all containers within the pod.<br/>__*Default*__: RestartPolicy.ALWAYS
**serviceAccount**?🔹 | <code>[IServiceAccount](#cdk8s-plus-17-iserviceaccount)</code> | A service account provides an identity for processes that run in a Pod.<br/>__*Default*__: No service account.
**volumes**?🔹 | <code>Array<[Volume](#cdk8s-plus-17-volume)></code> | List of volumes that can be mounted by containers belonging to the pod.<br/>__*Default*__: No volumes.



## struct ProbeOptions 🔹 <a id="cdk8s-plus-17-probeoptions"></a>


Probe options.



Name | Type | Description 
-----|------|-------------
**failureThreshold**?🔹 | <code>number</code> | Minimum consecutive failures for the probe to be considered failed after having succeeded.<br/>__*Default*__: 3
**initialDelaySeconds**?🔹 | <code>[Duration](#cdk8s-duration)</code> | Number of seconds after the container has started before liveness probes are initiated.<br/>__*Default*__: immediate
**periodSeconds**?🔹 | <code>[Duration](#cdk8s-duration)</code> | How often (in seconds) to perform the probe.<br/>__*Default*__: Duration.seconds(10) Minimum value is 1.
**successThreshold**?🔹 | <code>number</code> | Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.<br/>__*Default*__: 1 Must be 1 for liveness and startup. Minimum value is 1.
**timeoutSeconds**?🔹 | <code>[Duration](#cdk8s-duration)</code> | Number of seconds after which the probe times out.<br/>__*Default*__: Duration.seconds(1)



## struct ResourceProps 🔹 <a id="cdk8s-plus-17-resourceprops"></a>


Initialization properties for resources.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__



## struct SecretProps 🔹 <a id="cdk8s-plus-17-secretprops"></a>






Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**stringData**?🔹 | <code>Map<string, string></code> | stringData allows specifying non-binary secret data in string form.<br/>__*Optional*__
**type**?🔹 | <code>string</code> | Optional type associated with the secret.<br/>__*Default*__: undefined - Don't set a type.



## struct SecretValue 🔹 <a id="cdk8s-plus-17-secretvalue"></a>


Represents a specific value in JSON secret.



Name | Type | Description 
-----|------|-------------
**key**🔹 | <code>string</code> | The JSON key.
**secret**🔹 | <code>[ISecret](#cdk8s-plus-17-isecret)</code> | The secret.



## struct ServiceAccountProps 🔹 <a id="cdk8s-plus-17-serviceaccountprops"></a>


Properties for initialization of `ServiceAccount`.

Properties for initialization of `ServiceAccount`.



Name | Type | Description 
-----|------|-------------
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**secrets**?🔹 | <code>Array<[ISecret](#cdk8s-plus-17-isecret)></code> | List of secrets allowed to be used by pods running using this ServiceAccount.<br/>__*Optional*__



## struct ServiceIngressV1BetaBackendOptions 🔹 <a id="cdk8s-plus-17-serviceingressv1betabackendoptions"></a>


Options for setting up backends for ingress rules.



Name | Type | Description 
-----|------|-------------
**port**?🔹 | <code>number</code> | The port to use to access the service.<br/>__*Default*__: if the service exposes a single port, this port will be used.



## struct ServicePort 🔹 <a id="cdk8s-plus-17-serviceport"></a>


Definition of a service port.



Name | Type | Description 
-----|------|-------------
**port**🔹 | <code>number</code> | The port number the service will bind to.
**name**?🔹 | <code>string</code> | The name of this port within the service.<br/>__*Optional*__
**nodePort**?🔹 | <code>number</code> | The port on each node on which this service is exposed when type=NodePort or LoadBalancer.<br/>__*Default*__: to auto-allocate a port if the ServiceType of this Service requires one.
**protocol**?🔹 | <code>[Protocol](#cdk8s-plus-17-protocol)</code> | The IP protocol for this port.<br/>__*Default*__: Protocol.TCP
**targetPort**?🔹 | <code>number</code> | The port number the service will redirect to.<br/>__*Default*__: The value of `port` will be used.



## struct ServicePortOptions 🔹 <a id="cdk8s-plus-17-serviceportoptions"></a>






Name | Type | Description 
-----|------|-------------
**name**?🔹 | <code>string</code> | The name of this port within the service.<br/>__*Optional*__
**nodePort**?🔹 | <code>number</code> | The port on each node on which this service is exposed when type=NodePort or LoadBalancer.<br/>__*Default*__: to auto-allocate a port if the ServiceType of this Service requires one.
**protocol**?🔹 | <code>[Protocol](#cdk8s-plus-17-protocol)</code> | The IP protocol for this port.<br/>__*Default*__: Protocol.TCP
**targetPort**?🔹 | <code>number</code> | The port number the service will redirect to.<br/>__*Default*__: The value of `port` will be used.



## struct ServiceProps 🔹 <a id="cdk8s-plus-17-serviceprops"></a>


Properties for initialization of `Service`.



Name | Type | Description 
-----|------|-------------
**clusterIP**?🔹 | <code>string</code> | The IP address of the service and is usually assigned randomly by the master.<br/>__*Default*__: Automatically assigned.
**externalIPs**?🔹 | <code>Array<string></code> | A list of IP addresses for which nodes in the cluster will also accept traffic for this service.<br/>__*Default*__: No external IPs.
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Metadata that all persisted resources must have, which includes all objects users must create.<br/>__*Optional*__
**ports**?🔹 | <code>Array<[ServicePort](#cdk8s-plus-17-serviceport)></code> | The port exposed by this service.<br/>__*Optional*__
**type**?🔹 | <code>[ServiceType](#cdk8s-plus-17-servicetype)</code> | Determines how the Service is exposed.<br/>__*Default*__: ServiceType.ClusterIP



## struct VolumeMount 🔹 <a id="cdk8s-plus-17-volumemount"></a>


Mount a volume from the pod to the container.



Name | Type | Description 
-----|------|-------------
**path**🔹 | <code>string</code> | Path within the container at which the volume should be mounted.
**volume**🔹 | <code>[Volume](#cdk8s-plus-17-volume)</code> | The volume to mount.
**propagation**?🔹 | <code>[MountPropagation](#cdk8s-plus-17-mountpropagation)</code> | Determines how mounts are propagated from the host to container and the other way around.<br/>__*Default*__: MountPropagation.NONE
**readOnly**?🔹 | <code>boolean</code> | Mounted read-only if true, read-write otherwise (false or unspecified).<br/>__*Default*__: false
**subPath**?🔹 | <code>string</code> | Path within the volume from which the container's volume should be mounted.).<br/>__*Default*__: "" the volume's root
**subPathExpr**?🔹 | <code>string</code> | Expanded path within the volume from which the container's volume should be mounted.<br/>__*Default*__: "" volume's root.



## enum EmptyDirMedium 🔹 <a id="cdk8s-plus-17-emptydirmedium"></a>

The medium on which to store the volume.

Name | Description
-----|-----
**DEFAULT** 🔹|The default volume of the backing node.
**MEMORY** 🔹|Mount a tmpfs (RAM-backed filesystem) for you instead.


## enum ImagePullPolicy 🔹 <a id="cdk8s-plus-17-imagepullpolicy"></a>



Name | Description
-----|-----
**ALWAYS** 🔹|Every time the kubelet launches a container, the kubelet queries the container image registry to resolve the name to an image digest.
**IF_NOT_PRESENT** 🔹|The image is pulled only if it is not already present locally.
**NEVER** 🔹|The image is assumed to exist locally.


## enum MountPropagation 🔹 <a id="cdk8s-plus-17-mountpropagation"></a>



Name | Description
-----|-----
**NONE** 🔹|This volume mount will not receive any subsequent mounts that are mounted to this volume or any of its subdirectories by the host.
**HOST_TO_CONTAINER** 🔹|This volume mount will receive all subsequent mounts that are mounted to this volume or any of its subdirectories.
**BIDIRECTIONAL** 🔹|This volume mount behaves the same the HostToContainer mount.


## enum Protocol 🔹 <a id="cdk8s-plus-17-protocol"></a>



Name | Description
-----|-----
**TCP** 🔹|
**UDP** 🔹|
**SCTP** 🔹|


## enum RestartPolicy 🔹 <a id="cdk8s-plus-17-restartpolicy"></a>

Restart policy for all containers within the pod.

Name | Description
-----|-----
**ALWAYS** 🔹|Always restart the pod after it exits.
**ON_FAILURE** 🔹|Only restart if the pod exits with a non-zero exit code.
**NEVER** 🔹|Never restart the pod.


## enum ServiceType 🔹 <a id="cdk8s-plus-17-servicetype"></a>

For some parts of your application (for example, frontends) you may want to expose a Service onto an external IP address, that's outside of your cluster.

Kubernetes ServiceTypes allow you to specify what kind of Service you want.
The default is ClusterIP.

Name | Description
-----|-----
**CLUSTER_IP** 🔹|Exposes the Service on a cluster-internal IP.
**NODE_PORT** 🔹|Exposes the Service on each Node's IP at a static port (the NodePort).
**LOAD_BALANCER** 🔹|Exposes the Service externally using a cloud provider's load balancer.
**EXTERNAL_NAME** 🔹|Maps the Service to the contents of the externalName field (e.g. foo.bar.example.com), by returning a CNAME record with its value. No proxying of any kind is set up.


