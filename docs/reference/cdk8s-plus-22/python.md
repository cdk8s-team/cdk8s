# cdk8s-plus-22 (Python) <a name="API Reference"></a>

## Constructs <a name="Constructs"></a>

### ConfigMap <a name="cdk8s_plus_22.ConfigMap"></a>

- *Implements:* [`cdk8s_plus_22.IConfigMap`](#cdk8s_plus_22.IConfigMap)

ConfigMap holds configuration data for pods to consume.

#### Initializers <a name="cdk8s_plus_22.ConfigMap.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ConfigMap(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  binary_data: typing.Mapping[str] = None,
  data: typing.Mapping[str] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `binary_data`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapProps.parameter.binary_data"></a>

- *Type:* typing.Mapping[`str`]

BinaryData contains the binary data.

Each key must consist of alphanumeric characters, '-', '_' or '.'.
BinaryData can contain byte sequences that are not in the UTF-8 range. The
keys stored in BinaryData must not overlap with the ones in the Data field,
this is enforced during validation process. Using this field will require
1.10+ apiserver and kubelet.

You can also add binary data using `configMap.addBinaryData()`.

---

##### `data`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapProps.parameter.data"></a>

- *Type:* typing.Mapping[`str`]

Data contains the configuration data.

Each key must consist of alphanumeric characters, '-', '_' or '.'. Values
with non-UTF-8 byte sequences must use the BinaryData field. The keys
stored in Data must not overlap with the keys in the BinaryData field, this
is enforced during validation process.

You can also add data using `configMap.addData()`.

---

#### Methods <a name="Methods"></a>

##### `add_binary_data` <a name="cdk8s_plus_22.ConfigMap.add_binary_data"></a>

```python
def add_binary_data(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.parameter.key"></a>

- *Type:* `str`

The key.

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.parameter.value"></a>

- *Type:* `str`

The value.

---

##### `add_data` <a name="cdk8s_plus_22.ConfigMap.add_data"></a>

```python
def add_data(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.parameter.key"></a>

- *Type:* `str`

The key.

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.parameter.value"></a>

- *Type:* `str`

The value.

---

##### `add_directory` <a name="cdk8s_plus_22.ConfigMap.add_directory"></a>

```python
def add_directory(
  local_dir: str,
  exclude: typing.List[str] = None,
  key_prefix: str = None
)
```

###### `local_dir`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.parameter.local_dir"></a>

- *Type:* `str`

A path to a local directory.

---

###### `exclude`<sup>Optional</sup> <a name="cdk8s_plus_22.AddDirectoryOptions.parameter.exclude"></a>

- *Type:* typing.List[`str`]
- *Default:* include all files

Glob patterns to exclude when adding files.

---

###### `key_prefix`<sup>Optional</sup> <a name="cdk8s_plus_22.AddDirectoryOptions.parameter.key_prefix"></a>

- *Type:* `str`
- *Default:* ""

A prefix to add to all keys in the config map.

---

##### `add_file` <a name="cdk8s_plus_22.ConfigMap.add_file"></a>

```python
def add_file(
  local_file: str,
  key: str = None
)
```

###### `local_file`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.parameter.local_file"></a>

- *Type:* `str`

The path to the local file.

---

###### `key`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMap.parameter.key"></a>

- *Type:* `str`

The ConfigMap key (default to the file name).

---

#### Static Functions <a name="Static Functions"></a>

##### `from_config_map_name` <a name="cdk8s_plus_22.ConfigMap.from_config_map_name"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ConfigMap.from_config_map_name(
  name: str
)
```

###### `name`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.parameter.name"></a>

- *Type:* `str`

The name of the config map to import.

---

#### Properties <a name="Properties"></a>

##### `binary_data`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.property.binary_data"></a>

```python
binary_data: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

The binary data associated with this config map.

Returns a copy. To add data records, use `addBinaryData()` or `addData()`.

---

##### `data`<sup>Required</sup> <a name="cdk8s_plus_22.ConfigMap.property.data"></a>

```python
data: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

The data associated with this config map.

Returns an copy. To add data records, use `addData()` or `addBinaryData()`.

---


### Deployment <a name="cdk8s_plus_22.Deployment"></a>

- *Implements:* [`cdk8s_plus_22.IPodTemplate`](#cdk8s_plus_22.IPodTemplate)

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

#### Initializers <a name="cdk8s_plus_22.Deployment.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Deployment(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  default_selector: bool = None,
  replicas: typing.Union[int, float] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.parameter.pod_metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `default_selector`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.parameter.default_selector"></a>

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod selector for this deployment.

If this is set to `false` you must define your selector through
`deployment.podMetadata.addLabel()` and `deployment.selectByLabel()`.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.parameter.replicas"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 1

Number of desired pods.

---

#### Methods <a name="Methods"></a>

##### `add_container` <a name="cdk8s_plus_22.Deployment.add_container"></a>

```python
def add_container(
  image: str,
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  readiness: Probe = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None
)
```

###### `image`<sup>Required</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image"></a>

- *Type:* `str`

Docker image name.

---

###### `args`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.args"></a>

- *Type:* typing.List[`str`]
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

###### `command`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.command"></a>

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

###### `env`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.env"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_22.EnvValue`](#cdk8s_plus_22.EnvValue)]
- *Default:* No environment variables.

List of environment variables to set in the container.

Cannot be updated.

---

###### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image_pull_policy"></a>

- *Type:* [`cdk8s_plus_22.ImagePullPolicy`](#cdk8s_plus_22.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

###### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.liveness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.name"></a>

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No port is exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

###### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.readiness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

###### `startup`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.startup"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

###### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.volume_mounts"></a>

- *Type:* typing.List[[`cdk8s_plus_22.VolumeMount`](#cdk8s_plus_22.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

###### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.working_dir"></a>

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `add_volume` <a name="cdk8s_plus_22.Deployment.add_volume"></a>

```python
def add_volume(
  volume: Volume
)
```

###### `volume`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.parameter.volume"></a>

- *Type:* [`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)

---

##### `expose` <a name="cdk8s_plus_22.Deployment.expose"></a>

```python
def expose(
  port: typing.Union[int, float],
  name: str = None,
  protocol: Protocol = None,
  service_type: ServiceType = None,
  target_port: typing.Union[int, float] = None
)
```

###### `port`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.parameter.port"></a>

- *Type:* `typing.Union[int, float]`

The port number the service will bind to.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ExposeOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* undefined Uses the system generated name.

The name of the service to expose.

This will be set on the Service.metadata and must be a DNS_LABEL

---

###### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_22.ExposeOptions.parameter.protocol"></a>

- *Type:* [`cdk8s_plus_22.Protocol`](#cdk8s_plus_22.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

###### `service_type`<sup>Optional</sup> <a name="cdk8s_plus_22.ExposeOptions.parameter.service_type"></a>

- *Type:* [`cdk8s_plus_22.ServiceType`](#cdk8s_plus_22.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

###### `target_port`<sup>Optional</sup> <a name="cdk8s_plus_22.ExposeOptions.parameter.target_port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* The port of the first container in the deployment (ie. containers[0].port)

The port number the service will redirect to.

---

##### `select_by_label` <a name="cdk8s_plus_22.Deployment.select_by_label"></a>

```python
def select_by_label(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.parameter.key"></a>

- *Type:* `str`

The label key.

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.parameter.value"></a>

- *Type:* `str`

The label value.

---


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.property.containers"></a>

```python
containers: typing.List[Container]
```

- *Type:* typing.List[[`cdk8s_plus_22.Container`](#cdk8s_plus_22.Container)]

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `label_selector`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.property.label_selector"></a>

```python
label_selector: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

The labels this deployment will match against in order to select pods.

Returns a a copy. Use `selectByLabel()` to add labels.

---

##### `pod_metadata`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadataDefinition
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

Provides read/write access to the underlying pod metadata of the resource.

---

##### `replicas`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.property.replicas"></a>

```python
replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Number of desired pods.

---

##### `volumes`<sup>Required</sup> <a name="cdk8s_plus_22.Deployment.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.Deployment.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.Deployment.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)

The service account used to run this pod.

---


### Ingress <a name="cdk8s_plus_22.Ingress"></a>

Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend.

An Ingress can be configured to give services
externally-reachable urls, load balance traffic, terminate SSL, offer name
based virtual hosting etc.

#### Initializers <a name="cdk8s_plus_22.Ingress.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Ingress(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  default_backend: IngressBackend = None,
  rules: typing.List[IngressRule] = None,
  tls: typing.List[IngressTls] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `default_backend`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressProps.parameter.default_backend"></a>

- *Type:* [`cdk8s_plus_22.IngressBackend`](#cdk8s_plus_22.IngressBackend)

The default backend services requests that do not match any rule.

Using this option or the `addDefaultBackend()` method is equivalent to
adding a rule with both `path` and `host` undefined.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressProps.parameter.rules"></a>

- *Type:* typing.List[[`cdk8s_plus_22.IngressRule`](#cdk8s_plus_22.IngressRule)]

Routing rules for this ingress.

Each rule must define an `IngressBackend` that will receive the requests
that match this rule. If both `host` and `path` are not specifiec, this
backend will be used as the default backend of the ingress.

You can also add rules later using `addRule()`, `addHostRule()`,
`addDefaultBackend()` and `addHostDefaultBackend()`.

---

##### `tls`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressProps.parameter.tls"></a>

- *Type:* typing.List[[`cdk8s_plus_22.IngressTls`](#cdk8s_plus_22.IngressTls)]

TLS settings for this ingress.

Using this option tells the ingress controller to expose a TLS endpoint.
Currently the Ingress only supports a single TLS port, 443. If multiple
members of this list specify different hosts, they will be multiplexed on
the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI.

---

#### Methods <a name="Methods"></a>

##### `add_default_backend` <a name="cdk8s_plus_22.Ingress.add_default_backend"></a>

```python
def add_default_backend(
  backend: IngressBackend
)
```

###### `backend`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s_plus_22.IngressBackend`](#cdk8s_plus_22.IngressBackend)

The backend to use for requests that do not match any rule.

---

##### `add_host_default_backend` <a name="cdk8s_plus_22.Ingress.add_host_default_backend"></a>

```python
def add_host_default_backend(
  host: str,
  backend: IngressBackend
)
```

###### `host`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.host"></a>

- *Type:* `str`

The host name to match.

---

###### `backend`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s_plus_22.IngressBackend`](#cdk8s_plus_22.IngressBackend)

The backend to route to.

---

##### `add_host_rule` <a name="cdk8s_plus_22.Ingress.add_host_rule"></a>

```python
def add_host_rule(
  host: str,
  path: str,
  backend: IngressBackend,
  path_type: HttpIngressPathType = None
)
```

###### `host`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.host"></a>

- *Type:* `str`

The host name.

---

###### `path`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.path"></a>

- *Type:* `str`

The HTTP path.

---

###### `backend`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s_plus_22.IngressBackend`](#cdk8s_plus_22.IngressBackend)

The backend to route requests to.

---

###### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_22.Ingress.parameter.path_type"></a>

- *Type:* [`cdk8s_plus_22.HttpIngressPathType`](#cdk8s_plus_22.HttpIngressPathType)

How the path is matched against request paths.

---

##### `add_rule` <a name="cdk8s_plus_22.Ingress.add_rule"></a>

```python
def add_rule(
  path: str,
  backend: IngressBackend,
  path_type: HttpIngressPathType = None
)
```

###### `path`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.path"></a>

- *Type:* `str`

The HTTP path.

---

###### `backend`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s_plus_22.IngressBackend`](#cdk8s_plus_22.IngressBackend)

The backend to route requests to.

---

###### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_22.Ingress.parameter.path_type"></a>

- *Type:* [`cdk8s_plus_22.HttpIngressPathType`](#cdk8s_plus_22.HttpIngressPathType)

How the path is matched against request paths.

---

##### `add_rules` <a name="cdk8s_plus_22.Ingress.add_rules"></a>

```python
def add_rules(
  backend: IngressBackend,
  host: str = None,
  path: str = None,
  path_type: HttpIngressPathType = None
)
```

###### `backend`<sup>Required</sup> <a name="cdk8s_plus_22.IngressRule.parameter.backend"></a>

- *Type:* [`cdk8s_plus_22.IngressBackend`](#cdk8s_plus_22.IngressBackend)

Backend defines the referenced service endpoint to which the traffic will be forwarded to.

---

###### `host`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressRule.parameter.host"></a>

- *Type:* `str`
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

###### `path`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressRule.parameter.path"></a>

- *Type:* `str`
- *Default:* If unspecified, the path defaults to a catch all sending traffic
to the backend.

Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'.

---

###### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressRule.parameter.path_type"></a>

- *Type:* [`cdk8s_plus_22.HttpIngressPathType`](#cdk8s_plus_22.HttpIngressPathType)

Specify how the path is matched against request paths.

By default, path
types will be matched by prefix.

> https://kubernetes.io/docs/concepts/services-networking/ingress/#path-types

---

##### `add_tls` <a name="cdk8s_plus_22.Ingress.add_tls"></a>

```python
def add_tls(
  tls: typing.List[IngressTls]
)
```

###### `tls`<sup>Required</sup> <a name="cdk8s_plus_22.Ingress.parameter.tls"></a>

- *Type:* typing.List[[`cdk8s_plus_22.IngressTls`](#cdk8s_plus_22.IngressTls)]

---




### Job <a name="cdk8s_plus_22.Job"></a>

- *Implements:* [`cdk8s_plus_22.IPodTemplate`](#cdk8s_plus_22.IPodTemplate)

A Job creates one or more Pods and ensures that a specified number of them successfully terminate.

As pods successfully complete,
the Job tracks the successful completions. When a specified number of successful completions is reached, the task (ie, Job) is complete.
Deleting a Job will clean up the Pods it created. A simple case is to create one Job object in order to reliably run one Pod to completion.
The Job object will start a new Pod if the first Pod fails or is deleted (for example due to a node hardware failure or a node reboot).
You can also use a Job to run multiple Pods in parallel.

#### Initializers <a name="cdk8s_plus_22.Job.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Job(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  active_deadline: Duration = None,
  backoff_limit: typing.Union[int, float] = None,
  ttl_after_finished: Duration = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_22.Job.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_22.Job.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.parameter.pod_metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `active_deadline`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.parameter.active_deadline"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoff_limit`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.parameter.backoff_limit"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttl_after_finished`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.parameter.ttl_after_finished"></a>

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

#### Methods <a name="Methods"></a>

##### `add_container` <a name="cdk8s_plus_22.Job.add_container"></a>

```python
def add_container(
  image: str,
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  readiness: Probe = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None
)
```

###### `image`<sup>Required</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image"></a>

- *Type:* `str`

Docker image name.

---

###### `args`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.args"></a>

- *Type:* typing.List[`str`]
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

###### `command`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.command"></a>

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

###### `env`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.env"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_22.EnvValue`](#cdk8s_plus_22.EnvValue)]
- *Default:* No environment variables.

List of environment variables to set in the container.

Cannot be updated.

---

###### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image_pull_policy"></a>

- *Type:* [`cdk8s_plus_22.ImagePullPolicy`](#cdk8s_plus_22.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

###### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.liveness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.name"></a>

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No port is exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

###### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.readiness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

###### `startup`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.startup"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

###### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.volume_mounts"></a>

- *Type:* typing.List[[`cdk8s_plus_22.VolumeMount`](#cdk8s_plus_22.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

###### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.working_dir"></a>

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `add_volume` <a name="cdk8s_plus_22.Job.add_volume"></a>

```python
def add_volume(
  volume: Volume
)
```

###### `volume`<sup>Required</sup> <a name="cdk8s_plus_22.Job.parameter.volume"></a>

- *Type:* [`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)

---


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="cdk8s_plus_22.Job.property.containers"></a>

```python
containers: typing.List[Container]
```

- *Type:* typing.List[[`cdk8s_plus_22.Container`](#cdk8s_plus_22.Container)]

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `pod_metadata`<sup>Required</sup> <a name="cdk8s_plus_22.Job.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadataDefinition
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

Provides read/write access to the underlying pod metadata of the resource.

---

##### `volumes`<sup>Required</sup> <a name="cdk8s_plus_22.Job.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `active_deadline`<sup>Optional</sup> <a name="cdk8s_plus_22.Job.property.active_deadline"></a>

```python
active_deadline: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

Duration before job is terminated.

If undefined, there is no deadline.

---

##### `backoff_limit`<sup>Optional</sup> <a name="cdk8s_plus_22.Job.property.backoff_limit"></a>

```python
backoff_limit: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Number of retries before marking failed.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.Job.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.Job.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)

The service account used to run this pod.

---

##### `ttl_after_finished`<sup>Optional</sup> <a name="cdk8s_plus_22.Job.property.ttl_after_finished"></a>

```python
ttl_after_finished: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

TTL before the job is deleted after it is finished.

---


### Pod <a name="cdk8s_plus_22.Pod"></a>

- *Implements:* [`cdk8s_plus_22.IPodSpec`](#cdk8s_plus_22.IPodSpec)

Pod is a collection of containers that can run on a host.

This resource is
created by clients and scheduled onto hosts.

#### Initializers <a name="cdk8s_plus_22.Pod.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Pod(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_22.Pod.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_22.Pod.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.PodProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.PodProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.PodProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.PodProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.PodProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

#### Methods <a name="Methods"></a>

##### `add_container` <a name="cdk8s_plus_22.Pod.add_container"></a>

```python
def add_container(
  image: str,
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  readiness: Probe = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None
)
```

###### `image`<sup>Required</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image"></a>

- *Type:* `str`

Docker image name.

---

###### `args`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.args"></a>

- *Type:* typing.List[`str`]
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

###### `command`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.command"></a>

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

###### `env`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.env"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_22.EnvValue`](#cdk8s_plus_22.EnvValue)]
- *Default:* No environment variables.

List of environment variables to set in the container.

Cannot be updated.

---

###### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image_pull_policy"></a>

- *Type:* [`cdk8s_plus_22.ImagePullPolicy`](#cdk8s_plus_22.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

###### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.liveness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.name"></a>

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No port is exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

###### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.readiness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

###### `startup`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.startup"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

###### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.volume_mounts"></a>

- *Type:* typing.List[[`cdk8s_plus_22.VolumeMount`](#cdk8s_plus_22.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

###### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.working_dir"></a>

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `add_volume` <a name="cdk8s_plus_22.Pod.add_volume"></a>

```python
def add_volume(
  volume: Volume
)
```

###### `volume`<sup>Required</sup> <a name="cdk8s_plus_22.Pod.parameter.volume"></a>

- *Type:* [`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)

---


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="cdk8s_plus_22.Pod.property.containers"></a>

```python
containers: typing.List[Container]
```

- *Type:* typing.List[[`cdk8s_plus_22.Container`](#cdk8s_plus_22.Container)]

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `volumes`<sup>Required</sup> <a name="cdk8s_plus_22.Pod.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.Pod.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.Pod.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)

The service account used to run this pod.

---


### Resource <a name="cdk8s_plus_22.Resource"></a>

- *Implements:* [`cdk8s_plus_22.IResource`](#cdk8s_plus_22.IResource)

Base class for all Kubernetes objects in stdk8s.

Represents a single
resource.

#### Initializers <a name="cdk8s_plus_22.Resource.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Resource(
  scope: Construct,
  id: str,
  node_factory: INodeFactory = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_22.Resource.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

The scope in which to define this construct.

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_22.Resource.parameter.id"></a>

- *Type:* `str`

The scoped construct ID.

Must be unique amongst siblings. If
the ID includes a path separator (`/`), then it will be replaced by double
dash `--`.

---

##### `node_factory`<sup>Optional</sup> <a name="constructs.ConstructOptions.parameter.node_factory"></a>

- *Type:* [`constructs.INodeFactory`](#constructs.INodeFactory)
- *Default:* the default `Node` is associated

A factory for attaching `Node`s to the construct.

---



#### Properties <a name="Properties"></a>

##### `metadata`<sup>Required</sup> <a name="cdk8s_plus_22.Resource.property.metadata"></a>

```python
metadata: ApiObjectMetadataDefinition
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_22.Resource.property.name"></a>

```python
name: str
```

- *Type:* `str`

The name of this API object.

---


### Secret <a name="cdk8s_plus_22.Secret"></a>

- *Implements:* [`cdk8s_plus_22.ISecret`](#cdk8s_plus_22.ISecret)

Kubernetes Secrets let you store and manage sensitive information, such as passwords, OAuth tokens, and ssh keys.

Storing confidential information in a
Secret is safer and more flexible than putting it verbatim in a Pod
definition or in a container image.

> https://kubernetes.io/docs/concepts/configuration/secret

#### Initializers <a name="cdk8s_plus_22.Secret.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Secret(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  string_data: typing.Mapping[str] = None,
  type: str = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_22.Secret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_22.Secret.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.SecretProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `string_data`<sup>Optional</sup> <a name="cdk8s_plus_22.SecretProps.parameter.string_data"></a>

- *Type:* typing.Mapping[`str`]

stringData allows specifying non-binary secret data in string form.

It is
provided as a write-only convenience method. All keys and values are merged
into the data field on write, overwriting any existing values. It is never
output when reading from the API.

---

##### `type`<sup>Optional</sup> <a name="cdk8s_plus_22.SecretProps.parameter.type"></a>

- *Type:* `str`
- *Default:* undefined - Don't set a type.

Optional type associated with the secret.

Used to facilitate programmatic
handling of secret data by various controllers.

---

#### Methods <a name="Methods"></a>

##### `add_string_data` <a name="cdk8s_plus_22.Secret.add_string_data"></a>

```python
def add_string_data(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_22.Secret.parameter.key"></a>

- *Type:* `str`

Key.

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_22.Secret.parameter.value"></a>

- *Type:* `str`

Value.

---

##### `get_string_data` <a name="cdk8s_plus_22.Secret.get_string_data"></a>

```python
def get_string_data(
  key: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_22.Secret.parameter.key"></a>

- *Type:* `str`

Key.

---

#### Static Functions <a name="Static Functions"></a>

##### `from_secret_name` <a name="cdk8s_plus_22.Secret.from_secret_name"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Secret.from_secret_name(
  name: str
)
```

###### `name`<sup>Required</sup> <a name="cdk8s_plus_22.Secret.parameter.name"></a>

- *Type:* `str`

The name of the secret to reference.

---



### Service <a name="cdk8s_plus_22.Service"></a>

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

#### Initializers <a name="cdk8s_plus_22.Service.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Service(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  cluster_i_p: str = None,
  external_i_ps: typing.List[str] = None,
  external_name: str = None,
  load_balancer_source_ranges: typing.List[str] = None,
  ports: typing.List[ServicePort] = None,
  type: ServiceType = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_22.Service.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_22.Service.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `cluster_i_p`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.parameter.cluster_i_p"></a>

- *Type:* `str`
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

##### `external_i_ps`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.parameter.external_i_ps"></a>

- *Type:* typing.List[`str`]
- *Default:* No external IPs.

A list of IP addresses for which nodes in the cluster will also accept traffic for this service.

These IPs are not managed by Kubernetes. The user
is responsible for ensuring that traffic arrives at a node with this IP. A
common example is external load-balancers that are not part of the
Kubernetes system.

---

##### `external_name`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.parameter.external_name"></a>

- *Type:* `str`
- *Default:* No external name.

The externalName to be used when ServiceType.EXTERNAL_NAME is set.

---

##### `load_balancer_source_ranges`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.parameter.load_balancer_source_ranges"></a>

- *Type:* typing.List[`str`]

A list of CIDR IP addresses, if specified and supported by the platform, will restrict traffic through the cloud-provider load-balancer to the specified client IPs.

More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_22.ServicePort`](#cdk8s_plus_22.ServicePort)]

The port exposed by this service.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

---

##### `type`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.parameter.type"></a>

- *Type:* [`cdk8s_plus_22.ServiceType`](#cdk8s_plus_22.ServiceType)
- *Default:* ServiceType.ClusterIP

Determines how the Service is exposed.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

---

#### Methods <a name="Methods"></a>

##### `add_deployment` <a name="cdk8s_plus_22.Service.add_deployment"></a>

```python
def add_deployment(
  deployment: Deployment,
  port: typing.Union[int, float],
  name: str = None,
  node_port: typing.Union[int, float] = None,
  protocol: Protocol = None,
  target_port: typing.Union[int, float] = None
)
```

###### `deployment`<sup>Required</sup> <a name="cdk8s_plus_22.Service.parameter.deployment"></a>

- *Type:* [`cdk8s_plus_22.Deployment`](#cdk8s_plus_22.Deployment)

The deployment to expose.

---

###### `port`<sup>Required</sup> <a name="cdk8s_plus_22.Service.parameter.port"></a>

- *Type:* `typing.Union[int, float]`

The external port.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.parameter.name"></a>

- *Type:* `str`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

###### `node_port`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.parameter.node_port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* to auto-allocate a port if the ServiceType of this Service
requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

###### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.parameter.protocol"></a>

- *Type:* [`cdk8s_plus_22.Protocol`](#cdk8s_plus_22.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

###### `target_port`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.parameter.target_port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

##### `add_selector` <a name="cdk8s_plus_22.Service.add_selector"></a>

```python
def add_selector(
  label: str,
  value: str
)
```

###### `label`<sup>Required</sup> <a name="cdk8s_plus_22.Service.parameter.label"></a>

- *Type:* `str`

The label key.

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_22.Service.parameter.value"></a>

- *Type:* `str`

The label value.

---

##### `serve` <a name="cdk8s_plus_22.Service.serve"></a>

```python
def serve(
  port: typing.Union[int, float],
  name: str = None,
  node_port: typing.Union[int, float] = None,
  protocol: Protocol = None,
  target_port: typing.Union[int, float] = None
)
```

###### `port`<sup>Required</sup> <a name="cdk8s_plus_22.Service.parameter.port"></a>

- *Type:* `typing.Union[int, float]`

The port definition.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.parameter.name"></a>

- *Type:* `str`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

###### `node_port`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.parameter.node_port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* to auto-allocate a port if the ServiceType of this Service
requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

###### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.parameter.protocol"></a>

- *Type:* [`cdk8s_plus_22.Protocol`](#cdk8s_plus_22.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

###### `target_port`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.parameter.target_port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---


#### Properties <a name="Properties"></a>

##### `ports`<sup>Required</sup> <a name="cdk8s_plus_22.Service.property.ports"></a>

```python
ports: typing.List[ServicePort]
```

- *Type:* typing.List[[`cdk8s_plus_22.ServicePort`](#cdk8s_plus_22.ServicePort)]

Ports for this service.

Use `serve()` to expose additional service ports.

---

##### `selector`<sup>Required</sup> <a name="cdk8s_plus_22.Service.property.selector"></a>

```python
selector: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

Returns the labels which are used to select pods for this service.

---

##### `type`<sup>Required</sup> <a name="cdk8s_plus_22.Service.property.type"></a>

```python
type: ServiceType
```

- *Type:* [`cdk8s_plus_22.ServiceType`](#cdk8s_plus_22.ServiceType)

Determines how the Service is exposed.

---

##### `cluster_i_p`<sup>Optional</sup> <a name="cdk8s_plus_22.Service.property.cluster_i_p"></a>

```python
cluster_i_p: str
```

- *Type:* `str`

The IP address of the service and is usually assigned randomly by the master.

---

##### `external_name`<sup>Optional</sup> <a name="cdk8s_plus_22.Service.property.external_name"></a>

```python
external_name: str
```

- *Type:* `str`

The externalName to be used for EXTERNAL_NAME types.

---


### ServiceAccount <a name="cdk8s_plus_22.ServiceAccount"></a>

- *Implements:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the apiserver.
When they do, they are authenticated as a particular Service Account (for
example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account

#### Initializers <a name="cdk8s_plus_22.ServiceAccount.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ServiceAccount(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  secrets: typing.List[ISecret] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_22.ServiceAccount.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_22.ServiceAccount.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceAccountProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `secrets`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceAccountProps.parameter.secrets"></a>

- *Type:* typing.List[[`cdk8s_plus_22.ISecret`](#cdk8s_plus_22.ISecret)]

List of secrets allowed to be used by pods running using this ServiceAccount.

> https://kubernetes.io/docs/concepts/configuration/secret

---

#### Methods <a name="Methods"></a>

##### `add_secret` <a name="cdk8s_plus_22.ServiceAccount.add_secret"></a>

```python
def add_secret(
  secret: ISecret
)
```

###### `secret`<sup>Required</sup> <a name="cdk8s_plus_22.ServiceAccount.parameter.secret"></a>

- *Type:* [`cdk8s_plus_22.ISecret`](#cdk8s_plus_22.ISecret)

The secret.

---

#### Static Functions <a name="Static Functions"></a>

##### `from_service_account_name` <a name="cdk8s_plus_22.ServiceAccount.from_service_account_name"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ServiceAccount.from_service_account_name(
  name: str
)
```

###### `name`<sup>Required</sup> <a name="cdk8s_plus_22.ServiceAccount.parameter.name"></a>

- *Type:* `str`

The name of the service account resource.

---

#### Properties <a name="Properties"></a>

##### `secrets`<sup>Required</sup> <a name="cdk8s_plus_22.ServiceAccount.property.secrets"></a>

```python
secrets: typing.List[ISecret]
```

- *Type:* typing.List[[`cdk8s_plus_22.ISecret`](#cdk8s_plus_22.ISecret)]

List of secrets allowed to be used by pods running using this service account.

Returns a copy. To add a secret, use `addSecret()`.

---


### StatefulSet <a name="cdk8s_plus_22.StatefulSet"></a>

- *Implements:* [`cdk8s_plus_22.IPodTemplate`](#cdk8s_plus_22.IPodTemplate)

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

#### Initializers <a name="cdk8s_plus_22.StatefulSet.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.StatefulSet(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  service: Service,
  default_selector: bool = None,
  pod_management_policy: PodManagementPolicy = None,
  replicas: typing.Union[int, float] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.parameter.pod_metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `service`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSetProps.parameter.service"></a>

- *Type:* [`cdk8s_plus_22.Service`](#cdk8s_plus_22.Service)

Service to associate with the statefulset.

---

##### `default_selector`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.parameter.default_selector"></a>

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod selector for this statefulset.

If this is set to `false` you must define your selector through
`statefulset.podMetadata.addLabel()` and `statefulset.selectByLabel()`.

---

##### `pod_management_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.parameter.pod_management_policy"></a>

- *Type:* [`cdk8s_plus_22.PodManagementPolicy`](#cdk8s_plus_22.PodManagementPolicy)
- *Default:* PodManagementPolicy.ORDERED_READY

Pod management policy to use for this statefulset.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.parameter.replicas"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 1

Number of desired pods.

---

#### Methods <a name="Methods"></a>

##### `add_container` <a name="cdk8s_plus_22.StatefulSet.add_container"></a>

```python
def add_container(
  image: str,
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  readiness: Probe = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None
)
```

###### `image`<sup>Required</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image"></a>

- *Type:* `str`

Docker image name.

---

###### `args`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.args"></a>

- *Type:* typing.List[`str`]
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

###### `command`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.command"></a>

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

###### `env`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.env"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_22.EnvValue`](#cdk8s_plus_22.EnvValue)]
- *Default:* No environment variables.

List of environment variables to set in the container.

Cannot be updated.

---

###### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image_pull_policy"></a>

- *Type:* [`cdk8s_plus_22.ImagePullPolicy`](#cdk8s_plus_22.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

###### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.liveness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.name"></a>

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No port is exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

###### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.readiness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

###### `startup`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.startup"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

###### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.volume_mounts"></a>

- *Type:* typing.List[[`cdk8s_plus_22.VolumeMount`](#cdk8s_plus_22.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

###### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.working_dir"></a>

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `add_volume` <a name="cdk8s_plus_22.StatefulSet.add_volume"></a>

```python
def add_volume(
  volume: Volume
)
```

###### `volume`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.parameter.volume"></a>

- *Type:* [`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)

---

##### `select_by_label` <a name="cdk8s_plus_22.StatefulSet.select_by_label"></a>

```python
def select_by_label(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.parameter.key"></a>

- *Type:* `str`

The label key.

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.parameter.value"></a>

- *Type:* `str`

The label value.

---


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.property.containers"></a>

```python
containers: typing.List[Container]
```

- *Type:* typing.List[[`cdk8s_plus_22.Container`](#cdk8s_plus_22.Container)]

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `label_selector`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.property.label_selector"></a>

```python
label_selector: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

The labels this statefulset will match against in order to select pods.

Returns a a copy. Use `selectByLabel()` to add labels.

---

##### `pod_management_policy`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.property.pod_management_policy"></a>

```python
pod_management_policy: PodManagementPolicy
```

- *Type:* [`cdk8s_plus_22.PodManagementPolicy`](#cdk8s_plus_22.PodManagementPolicy)

Management policy to use for the set.

---

##### `pod_metadata`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadataDefinition
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

Provides read/write access to the underlying pod metadata of the resource.

---

##### `replicas`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.property.replicas"></a>

```python
replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Number of desired pods.

---

##### `volumes`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSet.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSet.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSet.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)

The service account used to run this pod.

---


## Structs <a name="Structs"></a>

### AddDirectoryOptions <a name="cdk8s_plus_22.AddDirectoryOptions"></a>

Options for `configmap.addDirectory()`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.AddDirectoryOptions(
  exclude: typing.List[str] = None,
  key_prefix: str = None
)
```

##### `exclude`<sup>Optional</sup> <a name="cdk8s_plus_22.AddDirectoryOptions.property.exclude"></a>

```python
exclude: typing.List[str]
```

- *Type:* typing.List[`str`]
- *Default:* include all files

Glob patterns to exclude when adding files.

---

##### `key_prefix`<sup>Optional</sup> <a name="cdk8s_plus_22.AddDirectoryOptions.property.key_prefix"></a>

```python
key_prefix: str
```

- *Type:* `str`
- *Default:* ""

A prefix to add to all keys in the config map.

---

### CommandProbeOptions <a name="cdk8s_plus_22.CommandProbeOptions"></a>

Options for `Probe.fromCommand()`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.CommandProbeOptions(
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None
)
```

##### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_22.CommandProbeOptions.property.failure_threshold"></a>

```python
failure_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.CommandProbeOptions.property.initial_delay_seconds"></a>

```python
initial_delay_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.CommandProbeOptions.property.period_seconds"></a>

```python
period_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_22.CommandProbeOptions.property.success_threshold"></a>

```python
success_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.CommandProbeOptions.property.timeout_seconds"></a>

```python
timeout_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

### ConfigMapProps <a name="cdk8s_plus_22.ConfigMapProps"></a>

Properties for initialization of `ConfigMap`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ConfigMapProps(
  metadata: ApiObjectMetadata = None,
  binary_data: typing.Mapping[str] = None,
  data: typing.Mapping[str] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `binary_data`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapProps.property.binary_data"></a>

```python
binary_data: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

BinaryData contains the binary data.

Each key must consist of alphanumeric characters, '-', '_' or '.'.
BinaryData can contain byte sequences that are not in the UTF-8 range. The
keys stored in BinaryData must not overlap with the ones in the Data field,
this is enforced during validation process. Using this field will require
1.10+ apiserver and kubelet.

You can also add binary data using `configMap.addBinaryData()`.

---

##### `data`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapProps.property.data"></a>

```python
data: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

Data contains the configuration data.

Each key must consist of alphanumeric characters, '-', '_' or '.'. Values
with non-UTF-8 byte sequences must use the BinaryData field. The keys
stored in Data must not overlap with the keys in the BinaryData field, this
is enforced during validation process.

You can also add data using `configMap.addData()`.

---

### ConfigMapVolumeOptions <a name="cdk8s_plus_22.ConfigMapVolumeOptions"></a>

Options for the ConfigMap-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ConfigMapVolumeOptions(
  default_mode: typing.Union[int, float] = None,
  items: typing.Mapping[PathMapping] = None,
  name: str = None,
  optional: bool = None
)
```

##### `default_mode`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapVolumeOptions.property.default_mode"></a>

```python
default_mode: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 0644. Directories within the path are not affected by this
setting. This might be in conflict with other options that affect the file
mode, like fsGroup, and the result can be other mode bits set.

Mode bits to use on created files by default.

Must be a value between 0 and
0777. Defaults to 0644. Directories within the path are not affected by
this setting. This might be in conflict with other options that affect the
file mode, like fsGroup, and the result can be other mode bits set.

---

##### `items`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapVolumeOptions.property.items"></a>

```python
items: typing.Mapping[PathMapping]
```

- *Type:* typing.Mapping[[`cdk8s_plus_22.PathMapping`](#cdk8s_plus_22.PathMapping)]
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the ConfigMap, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapVolumeOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

##### `optional`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapVolumeOptions.property.optional"></a>

```python
optional: bool
```

- *Type:* `bool`
- *Default:* undocumented

Specify whether the ConfigMap or its keys must be defined.

---

### ContainerProps <a name="cdk8s_plus_22.ContainerProps"></a>

Properties for creating a container.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ContainerProps(
  image: str,
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  readiness: Probe = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None
)
```

##### `image`<sup>Required</sup> <a name="cdk8s_plus_22.ContainerProps.property.image"></a>

```python
image: str
```

- *Type:* `str`

Docker image name.

---

##### `args`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.args"></a>

```python
args: typing.List[str]
```

- *Type:* typing.List[`str`]
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

##### `command`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.command"></a>

```python
command: typing.List[str]
```

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `env`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.env"></a>

```python
env: typing.Mapping[EnvValue]
```

- *Type:* typing.Mapping[[`cdk8s_plus_22.EnvValue`](#cdk8s_plus_22.EnvValue)]
- *Default:* No environment variables.

List of environment variables to set in the container.

Cannot be updated.

---

##### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.image_pull_policy"></a>

```python
image_pull_policy: ImagePullPolicy
```

- *Type:* [`cdk8s_plus_22.ImagePullPolicy`](#cdk8s_plus_22.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.liveness"></a>

```python
liveness: Probe
```

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* No port is exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

##### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.readiness"></a>

```python
readiness: Probe
```

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `startup`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.startup"></a>

```python
startup: Probe
```

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.volume_mounts"></a>

```python
volume_mounts: typing.List[VolumeMount]
```

- *Type:* typing.List[[`cdk8s_plus_22.VolumeMount`](#cdk8s_plus_22.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.property.working_dir"></a>

```python
working_dir: str
```

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

### DeploymentProps <a name="cdk8s_plus_22.DeploymentProps"></a>

Properties for initialization of `Deployment`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.DeploymentProps(
  metadata: ApiObjectMetadata = None,
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  default_selector: bool = None,
  replicas: typing.Union[int, float] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `default_selector`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.property.default_selector"></a>

```python
default_selector: bool
```

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod selector for this deployment.

If this is set to `false` you must define your selector through
`deployment.podMetadata.addLabel()` and `deployment.selectByLabel()`.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_22.DeploymentProps.property.replicas"></a>

```python
replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1

Number of desired pods.

---

### EmptyDirVolumeOptions <a name="cdk8s_plus_22.EmptyDirVolumeOptions"></a>

Options for volumes populated with an empty directory.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.EmptyDirVolumeOptions(
  medium: EmptyDirMedium = None,
  size_limit: Size = None
)
```

##### `medium`<sup>Optional</sup> <a name="cdk8s_plus_22.EmptyDirVolumeOptions.property.medium"></a>

```python
medium: EmptyDirMedium
```

- *Type:* [`cdk8s_plus_22.EmptyDirMedium`](#cdk8s_plus_22.EmptyDirMedium)
- *Default:* EmptyDirMedium.DEFAULT

By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment.

However, you can set the emptyDir.medium field to
`EmptyDirMedium.MEMORY` to tell Kubernetes to mount a tmpfs (RAM-backed
filesystem) for you instead. While tmpfs is very fast, be aware that unlike
disks, tmpfs is cleared on node reboot and any files you write will count
against your Container's memory limit.

---

##### `size_limit`<sup>Optional</sup> <a name="cdk8s_plus_22.EmptyDirVolumeOptions.property.size_limit"></a>

```python
size_limit: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* limit is undefined

Total amount of local storage required for this EmptyDir volume.

The size
limit is also applicable for memory medium. The maximum usage on memory
medium EmptyDir would be the minimum value between the SizeLimit specified
here and the sum of memory limits of all containers in a pod.

---

### EnvValueFromConfigMapOptions <a name="cdk8s_plus_22.EnvValueFromConfigMapOptions"></a>

Options to specify an envionment variable value from a ConfigMap key.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.EnvValueFromConfigMapOptions(
  optional: bool = None
)
```

##### `optional`<sup>Optional</sup> <a name="cdk8s_plus_22.EnvValueFromConfigMapOptions.property.optional"></a>

```python
optional: bool
```

- *Type:* `bool`
- *Default:* false

Specify whether the ConfigMap or its key must be defined.

---

### EnvValueFromProcessOptions <a name="cdk8s_plus_22.EnvValueFromProcessOptions"></a>

Options to specify an environment variable value from the process environment.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.EnvValueFromProcessOptions(
  required: bool = None
)
```

##### `required`<sup>Optional</sup> <a name="cdk8s_plus_22.EnvValueFromProcessOptions.property.required"></a>

```python
required: bool
```

- *Type:* `bool`
- *Default:* false

Specify whether the key must exist in the environment.

If this is set to true, and the key does not exist, an error will thrown.

---

### EnvValueFromSecretOptions <a name="cdk8s_plus_22.EnvValueFromSecretOptions"></a>

Options to specify an environment variable value from a Secret.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.EnvValueFromSecretOptions(
  optional: bool = None
)
```

##### `optional`<sup>Optional</sup> <a name="cdk8s_plus_22.EnvValueFromSecretOptions.property.optional"></a>

```python
optional: bool
```

- *Type:* `bool`
- *Default:* false

Specify whether the Secret or its key must be defined.

---

### ExposeOptions <a name="cdk8s_plus_22.ExposeOptions"></a>

Options for exposing a deployment via a service.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ExposeOptions(
  name: str = None,
  protocol: Protocol = None,
  service_type: ServiceType = None,
  target_port: typing.Union[int, float] = None
)
```

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ExposeOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* undefined Uses the system generated name.

The name of the service to expose.

This will be set on the Service.metadata and must be a DNS_LABEL

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_22.ExposeOptions.property.protocol"></a>

```python
protocol: Protocol
```

- *Type:* [`cdk8s_plus_22.Protocol`](#cdk8s_plus_22.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `service_type`<sup>Optional</sup> <a name="cdk8s_plus_22.ExposeOptions.property.service_type"></a>

```python
service_type: ServiceType
```

- *Type:* [`cdk8s_plus_22.ServiceType`](#cdk8s_plus_22.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

##### `target_port`<sup>Optional</sup> <a name="cdk8s_plus_22.ExposeOptions.property.target_port"></a>

```python
target_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* The port of the first container in the deployment (ie. containers[0].port)

The port number the service will redirect to.

---

### HttpGetProbeOptions <a name="cdk8s_plus_22.HttpGetProbeOptions"></a>

Options for `Probe.fromHttpGet()`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.HttpGetProbeOptions(
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None,
  port: typing.Union[int, float] = None
)
```

##### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.property.failure_threshold"></a>

```python
failure_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.property.initial_delay_seconds"></a>

```python
initial_delay_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.property.period_seconds"></a>

```python
period_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.property.success_threshold"></a>

```python
success_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.property.timeout_seconds"></a>

```python
timeout_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---

### IngressProps <a name="cdk8s_plus_22.IngressProps"></a>

Properties for `Ingress`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.IngressProps(
  metadata: ApiObjectMetadata = None,
  default_backend: IngressBackend = None,
  rules: typing.List[IngressRule] = None,
  tls: typing.List[IngressTls] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `default_backend`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressProps.property.default_backend"></a>

```python
default_backend: IngressBackend
```

- *Type:* [`cdk8s_plus_22.IngressBackend`](#cdk8s_plus_22.IngressBackend)

The default backend services requests that do not match any rule.

Using this option or the `addDefaultBackend()` method is equivalent to
adding a rule with both `path` and `host` undefined.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressProps.property.rules"></a>

```python
rules: typing.List[IngressRule]
```

- *Type:* typing.List[[`cdk8s_plus_22.IngressRule`](#cdk8s_plus_22.IngressRule)]

Routing rules for this ingress.

Each rule must define an `IngressBackend` that will receive the requests
that match this rule. If both `host` and `path` are not specifiec, this
backend will be used as the default backend of the ingress.

You can also add rules later using `addRule()`, `addHostRule()`,
`addDefaultBackend()` and `addHostDefaultBackend()`.

---

##### `tls`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressProps.property.tls"></a>

```python
tls: typing.List[IngressTls]
```

- *Type:* typing.List[[`cdk8s_plus_22.IngressTls`](#cdk8s_plus_22.IngressTls)]

TLS settings for this ingress.

Using this option tells the ingress controller to expose a TLS endpoint.
Currently the Ingress only supports a single TLS port, 443. If multiple
members of this list specify different hosts, they will be multiplexed on
the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI.

---

### IngressRule <a name="cdk8s_plus_22.IngressRule"></a>

Represents the rules mapping the paths under a specified host to the related backend services.

Incoming requests are first evaluated for a host match,
then routed to the backend associated with the matching path.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.IngressRule(
  backend: IngressBackend,
  host: str = None,
  path: str = None,
  path_type: HttpIngressPathType = None
)
```

##### `backend`<sup>Required</sup> <a name="cdk8s_plus_22.IngressRule.property.backend"></a>

```python
backend: IngressBackend
```

- *Type:* [`cdk8s_plus_22.IngressBackend`](#cdk8s_plus_22.IngressBackend)

Backend defines the referenced service endpoint to which the traffic will be forwarded to.

---

##### `host`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressRule.property.host"></a>

```python
host: str
```

- *Type:* `str`
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

##### `path`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressRule.property.path"></a>

```python
path: str
```

- *Type:* `str`
- *Default:* If unspecified, the path defaults to a catch all sending traffic
to the backend.

Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'.

---

##### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressRule.property.path_type"></a>

```python
path_type: HttpIngressPathType
```

- *Type:* [`cdk8s_plus_22.HttpIngressPathType`](#cdk8s_plus_22.HttpIngressPathType)

Specify how the path is matched against request paths.

By default, path
types will be matched by prefix.

> https://kubernetes.io/docs/concepts/services-networking/ingress/#path-types

---

### IngressTls <a name="cdk8s_plus_22.IngressTls"></a>

Represents the TLS configuration mapping that is passed to the ingress controller for SSL termination.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.IngressTls(
  hosts: typing.List[str] = None,
  secret: ISecret = None
)
```

##### `hosts`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressTls.property.hosts"></a>

```python
hosts: typing.List[str]
```

- *Type:* typing.List[`str`]
- *Default:* If unspecified, it defaults to the wildcard host setting for
the loadbalancer controller fulfilling this Ingress.

Hosts are a list of hosts included in the TLS certificate.

The values in
this list must match the name/s used in the TLS Secret.

---

##### `secret`<sup>Optional</sup> <a name="cdk8s_plus_22.IngressTls.property.secret"></a>

```python
secret: ISecret
```

- *Type:* [`cdk8s_plus_22.ISecret`](#cdk8s_plus_22.ISecret)
- *Default:* If unspecified, it allows SSL routing based on SNI hostname.

Secret is the secret that contains the certificate and key used to terminate SSL traffic on 443.

If the SNI host in a listener conflicts with
the "Host" header field used by an IngressRule, the SNI host is used for
termination and value of the Host header is used for routing.

---

### JobProps <a name="cdk8s_plus_22.JobProps"></a>

Properties for initialization of `Job`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.JobProps(
  metadata: ApiObjectMetadata = None,
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  active_deadline: Duration = None,
  backoff_limit: typing.Union[int, float] = None,
  ttl_after_finished: Duration = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `active_deadline`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.property.active_deadline"></a>

```python
active_deadline: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoff_limit`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.property.backoff_limit"></a>

```python
backoff_limit: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttl_after_finished`<sup>Optional</sup> <a name="cdk8s_plus_22.JobProps.property.ttl_after_finished"></a>

```python
ttl_after_finished: Duration
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

### MountOptions <a name="cdk8s_plus_22.MountOptions"></a>

Options for mounts.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.MountOptions(
  propagation: MountPropagation = None,
  read_only: bool = None,
  sub_path: str = None,
  sub_path_expr: str = None
)
```

##### `propagation`<sup>Optional</sup> <a name="cdk8s_plus_22.MountOptions.property.propagation"></a>

```python
propagation: MountPropagation
```

- *Type:* [`cdk8s_plus_22.MountPropagation`](#cdk8s_plus_22.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

This field is beta in 1.10.

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_22.MountOptions.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

##### `sub_path`<sup>Optional</sup> <a name="cdk8s_plus_22.MountOptions.property.sub_path"></a>

```python
sub_path: str
```

- *Type:* `str`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

##### `sub_path_expr`<sup>Optional</sup> <a name="cdk8s_plus_22.MountOptions.property.sub_path_expr"></a>

```python
sub_path_expr: str
```

- *Type:* `str`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root). SubPathExpr and SubPath are mutually exclusive. This field
is beta in 1.15.

`subPathExpr` and `subPath` are mutually exclusive. This field is beta in
1.15.

---

### PathMapping <a name="cdk8s_plus_22.PathMapping"></a>

Maps a string key to a path within a volume.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.PathMapping(
  path: str,
  mode: typing.Union[int, float] = None
)
```

##### `path`<sup>Required</sup> <a name="cdk8s_plus_22.PathMapping.property.path"></a>

```python
path: str
```

- *Type:* `str`

The relative path of the file to map the key to.

May not be an absolute
path. May not contain the path element '..'. May not start with the string
'..'.

---

##### `mode`<sup>Optional</sup> <a name="cdk8s_plus_22.PathMapping.property.mode"></a>

```python
mode: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Optional: mode bits to use on this file, must be a value between 0 and 0777.

If not specified, the volume defaultMode will be used. This might be
in conflict with other options that affect the file mode, like fsGroup, and
the result can be other mode bits set.

---

### PodProps <a name="cdk8s_plus_22.PodProps"></a>

Properties for initialization of `Pod`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.PodProps(
  metadata: ApiObjectMetadata = None,
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.PodProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.PodProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.PodProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.PodProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.PodProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

### PodSpecProps <a name="cdk8s_plus_22.PodSpecProps"></a>

Properties of a `PodSpec`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.PodSpecProps(
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None
)
```

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.PodSpecProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.PodSpecProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.PodSpecProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.PodSpecProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

### PodTemplateProps <a name="cdk8s_plus_22.PodTemplateProps"></a>

Properties of a `PodTemplate`.

Adds metadata information on top of the spec.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.PodTemplateProps(
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None
)
```

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.PodTemplateProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.PodTemplateProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.PodTemplateProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.PodTemplateProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.PodTemplateProps.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata.

---

### ProbeOptions <a name="cdk8s_plus_22.ProbeOptions"></a>

Probe options.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ProbeOptions(
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None
)
```

##### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_22.ProbeOptions.property.failure_threshold"></a>

```python
failure_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.ProbeOptions.property.initial_delay_seconds"></a>

```python
initial_delay_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.ProbeOptions.property.period_seconds"></a>

```python
period_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_22.ProbeOptions.property.success_threshold"></a>

```python
success_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.ProbeOptions.property.timeout_seconds"></a>

```python
timeout_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

### ResourceProps <a name="cdk8s_plus_22.ResourceProps"></a>

Initialization properties for resources.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ResourceProps(
  metadata: ApiObjectMetadata = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.ResourceProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

### SecretProps <a name="cdk8s_plus_22.SecretProps"></a>

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.SecretProps(
  metadata: ApiObjectMetadata = None,
  string_data: typing.Mapping[str] = None,
  type: str = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.SecretProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `string_data`<sup>Optional</sup> <a name="cdk8s_plus_22.SecretProps.property.string_data"></a>

```python
string_data: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

stringData allows specifying non-binary secret data in string form.

It is
provided as a write-only convenience method. All keys and values are merged
into the data field on write, overwriting any existing values. It is never
output when reading from the API.

---

##### `type`<sup>Optional</sup> <a name="cdk8s_plus_22.SecretProps.property.type"></a>

```python
type: str
```

- *Type:* `str`
- *Default:* undefined - Don't set a type.

Optional type associated with the secret.

Used to facilitate programmatic
handling of secret data by various controllers.

---

### SecretValue <a name="cdk8s_plus_22.SecretValue"></a>

Represents a specific value in JSON secret.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.SecretValue(
  key: str,
  secret: ISecret
)
```

##### `key`<sup>Required</sup> <a name="cdk8s_plus_22.SecretValue.property.key"></a>

```python
key: str
```

- *Type:* `str`

The JSON key.

---

##### `secret`<sup>Required</sup> <a name="cdk8s_plus_22.SecretValue.property.secret"></a>

```python
secret: ISecret
```

- *Type:* [`cdk8s_plus_22.ISecret`](#cdk8s_plus_22.ISecret)

The secret.

---

### ServiceAccountProps <a name="cdk8s_plus_22.ServiceAccountProps"></a>

Properties for initialization of `ServiceAccount`.

Properties for initialization of `ServiceAccount`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ServiceAccountProps(
  metadata: ApiObjectMetadata = None,
  secrets: typing.List[ISecret] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceAccountProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `secrets`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceAccountProps.property.secrets"></a>

```python
secrets: typing.List[ISecret]
```

- *Type:* typing.List[[`cdk8s_plus_22.ISecret`](#cdk8s_plus_22.ISecret)]

List of secrets allowed to be used by pods running using this ServiceAccount.

> https://kubernetes.io/docs/concepts/configuration/secret

---

### ServiceIngressBackendOptions <a name="cdk8s_plus_22.ServiceIngressBackendOptions"></a>

Options for setting up backends for ingress rules.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ServiceIngressBackendOptions(
  port: typing.Union[int, float] = None
)
```

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceIngressBackendOptions.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* if the service exposes a single port, this port will be used.

The port to use to access the service.

This option will fail if the service does not expose any ports.
- If the service exposes multiple ports, this option must be specified.
- If the service exposes a single port, this option is optional and if
   specified, it must be the same port exposed by the service.

---

### ServicePort <a name="cdk8s_plus_22.ServicePort"></a>

Definition of a service port.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ServicePort(
  name: str = None,
  node_port: typing.Union[int, float] = None,
  protocol: Protocol = None,
  target_port: typing.Union[int, float] = None,
  port: typing.Union[int, float]
)
```

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePort.property.name"></a>

```python
name: str
```

- *Type:* `str`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

##### `node_port`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePort.property.node_port"></a>

```python
node_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* to auto-allocate a port if the ServiceType of this Service
requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePort.property.protocol"></a>

```python
protocol: Protocol
```

- *Type:* [`cdk8s_plus_22.Protocol`](#cdk8s_plus_22.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `target_port`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePort.property.target_port"></a>

```python
target_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

##### `port`<sup>Required</sup> <a name="cdk8s_plus_22.ServicePort.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

The port number the service will bind to.

---

### ServicePortOptions <a name="cdk8s_plus_22.ServicePortOptions"></a>

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ServicePortOptions(
  name: str = None,
  node_port: typing.Union[int, float] = None,
  protocol: Protocol = None,
  target_port: typing.Union[int, float] = None
)
```

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

##### `node_port`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.property.node_port"></a>

```python
node_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* to auto-allocate a port if the ServiceType of this Service
requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.property.protocol"></a>

```python
protocol: Protocol
```

- *Type:* [`cdk8s_plus_22.Protocol`](#cdk8s_plus_22.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `target_port`<sup>Optional</sup> <a name="cdk8s_plus_22.ServicePortOptions.property.target_port"></a>

```python
target_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

### ServiceProps <a name="cdk8s_plus_22.ServiceProps"></a>

Properties for initialization of `Service`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.ServiceProps(
  metadata: ApiObjectMetadata = None,
  cluster_i_p: str = None,
  external_i_ps: typing.List[str] = None,
  external_name: str = None,
  load_balancer_source_ranges: typing.List[str] = None,
  ports: typing.List[ServicePort] = None,
  type: ServiceType = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `cluster_i_p`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.property.cluster_i_p"></a>

```python
cluster_i_p: str
```

- *Type:* `str`
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

##### `external_i_ps`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.property.external_i_ps"></a>

```python
external_i_ps: typing.List[str]
```

- *Type:* typing.List[`str`]
- *Default:* No external IPs.

A list of IP addresses for which nodes in the cluster will also accept traffic for this service.

These IPs are not managed by Kubernetes. The user
is responsible for ensuring that traffic arrives at a node with this IP. A
common example is external load-balancers that are not part of the
Kubernetes system.

---

##### `external_name`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.property.external_name"></a>

```python
external_name: str
```

- *Type:* `str`
- *Default:* No external name.

The externalName to be used when ServiceType.EXTERNAL_NAME is set.

---

##### `load_balancer_source_ranges`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.property.load_balancer_source_ranges"></a>

```python
load_balancer_source_ranges: typing.List[str]
```

- *Type:* typing.List[`str`]

A list of CIDR IP addresses, if specified and supported by the platform, will restrict traffic through the cloud-provider load-balancer to the specified client IPs.

More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.property.ports"></a>

```python
ports: typing.List[ServicePort]
```

- *Type:* typing.List[[`cdk8s_plus_22.ServicePort`](#cdk8s_plus_22.ServicePort)]

The port exposed by this service.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

---

##### `type`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceProps.property.type"></a>

```python
type: ServiceType
```

- *Type:* [`cdk8s_plus_22.ServiceType`](#cdk8s_plus_22.ServiceType)
- *Default:* ServiceType.ClusterIP

Determines how the Service is exposed.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

---

### StatefulSetProps <a name="cdk8s_plus_22.StatefulSetProps"></a>

Properties for initialization of `StatefulSet`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.StatefulSetProps(
  metadata: ApiObjectMetadata = None,
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  service: Service,
  default_selector: bool = None,
  pod_management_policy: PodManagementPolicy = None,
  replicas: typing.Union[int, float] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata.

---

##### `service`<sup>Required</sup> <a name="cdk8s_plus_22.StatefulSetProps.property.service"></a>

```python
service: Service
```

- *Type:* [`cdk8s_plus_22.Service`](#cdk8s_plus_22.Service)

Service to associate with the statefulset.

---

##### `default_selector`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.property.default_selector"></a>

```python
default_selector: bool
```

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod selector for this statefulset.

If this is set to `false` you must define your selector through
`statefulset.podMetadata.addLabel()` and `statefulset.selectByLabel()`.

---

##### `pod_management_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.property.pod_management_policy"></a>

```python
pod_management_policy: PodManagementPolicy
```

- *Type:* [`cdk8s_plus_22.PodManagementPolicy`](#cdk8s_plus_22.PodManagementPolicy)
- *Default:* PodManagementPolicy.ORDERED_READY

Pod management policy to use for this statefulset.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_22.StatefulSetProps.property.replicas"></a>

```python
replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1

Number of desired pods.

---

### VolumeMount <a name="cdk8s_plus_22.VolumeMount"></a>

Mount a volume from the pod to the container.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.VolumeMount(
  propagation: MountPropagation = None,
  read_only: bool = None,
  sub_path: str = None,
  sub_path_expr: str = None,
  path: str,
  volume: Volume
)
```

##### `propagation`<sup>Optional</sup> <a name="cdk8s_plus_22.VolumeMount.property.propagation"></a>

```python
propagation: MountPropagation
```

- *Type:* [`cdk8s_plus_22.MountPropagation`](#cdk8s_plus_22.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

This field is beta in 1.10.

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_22.VolumeMount.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

##### `sub_path`<sup>Optional</sup> <a name="cdk8s_plus_22.VolumeMount.property.sub_path"></a>

```python
sub_path: str
```

- *Type:* `str`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

##### `sub_path_expr`<sup>Optional</sup> <a name="cdk8s_plus_22.VolumeMount.property.sub_path_expr"></a>

```python
sub_path_expr: str
```

- *Type:* `str`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root). SubPathExpr and SubPath are mutually exclusive. This field
is beta in 1.15.

`subPathExpr` and `subPath` are mutually exclusive. This field is beta in
1.15.

---

##### `path`<sup>Required</sup> <a name="cdk8s_plus_22.VolumeMount.property.path"></a>

```python
path: str
```

- *Type:* `str`

Path within the container at which the volume should be mounted.

Must not
contain ':'.

---

##### `volume`<sup>Required</sup> <a name="cdk8s_plus_22.VolumeMount.property.volume"></a>

```python
volume: Volume
```

- *Type:* [`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)

The volume to mount.

---

## Classes <a name="Classes"></a>

### Container <a name="cdk8s_plus_22.Container"></a>

A single application container that you want to run within a pod.

#### Initializers <a name="cdk8s_plus_22.Container.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Container(
  image: str,
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  readiness: Probe = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None
)
```

##### `image`<sup>Required</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image"></a>

- *Type:* `str`

Docker image name.

---

##### `args`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.args"></a>

- *Type:* typing.List[`str`]
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

##### `command`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.command"></a>

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `env`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.env"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_22.EnvValue`](#cdk8s_plus_22.EnvValue)]
- *Default:* No environment variables.

List of environment variables to set in the container.

Cannot be updated.

---

##### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image_pull_policy"></a>

- *Type:* [`cdk8s_plus_22.ImagePullPolicy`](#cdk8s_plus_22.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.liveness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.name"></a>

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No port is exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

##### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.readiness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `startup`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.startup"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.volume_mounts"></a>

- *Type:* typing.List[[`cdk8s_plus_22.VolumeMount`](#cdk8s_plus_22.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.working_dir"></a>

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

#### Methods <a name="Methods"></a>

##### `add_env` <a name="cdk8s_plus_22.Container.add_env"></a>

```python
def add_env(
  name: str,
  value: EnvValue
)
```

###### `name`<sup>Required</sup> <a name="cdk8s_plus_22.Container.parameter.name"></a>

- *Type:* `str`

The variable name.

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_22.Container.parameter.value"></a>

- *Type:* [`cdk8s_plus_22.EnvValue`](#cdk8s_plus_22.EnvValue)

The variable value.

---

##### `mount` <a name="cdk8s_plus_22.Container.mount"></a>

```python
def mount(
  path: str,
  volume: Volume,
  propagation: MountPropagation = None,
  read_only: bool = None,
  sub_path: str = None,
  sub_path_expr: str = None
)
```

###### `path`<sup>Required</sup> <a name="cdk8s_plus_22.Container.parameter.path"></a>

- *Type:* `str`

The desired path in the container.

---

###### `volume`<sup>Required</sup> <a name="cdk8s_plus_22.Container.parameter.volume"></a>

- *Type:* [`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)

The volume to mount.

---

###### `propagation`<sup>Optional</sup> <a name="cdk8s_plus_22.MountOptions.parameter.propagation"></a>

- *Type:* [`cdk8s_plus_22.MountPropagation`](#cdk8s_plus_22.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

This field is beta in 1.10.

---

###### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_22.MountOptions.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

###### `sub_path`<sup>Optional</sup> <a name="cdk8s_plus_22.MountOptions.parameter.sub_path"></a>

- *Type:* `str`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

###### `sub_path_expr`<sup>Optional</sup> <a name="cdk8s_plus_22.MountOptions.parameter.sub_path_expr"></a>

- *Type:* `str`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root). SubPathExpr and SubPath are mutually exclusive. This field
is beta in 1.15.

`subPathExpr` and `subPath` are mutually exclusive. This field is beta in
1.15.

---


#### Properties <a name="Properties"></a>

##### `env`<sup>Required</sup> <a name="cdk8s_plus_22.Container.property.env"></a>

```python
env: typing.Mapping[EnvValue]
```

- *Type:* typing.Mapping[[`cdk8s_plus_22.EnvValue`](#cdk8s_plus_22.EnvValue)]

The environment variables for this container.

Returns a copy. To add environment variables use `addEnv()`.

---

##### `image`<sup>Required</sup> <a name="cdk8s_plus_22.Container.property.image"></a>

```python
image: str
```

- *Type:* `str`

The container image.

---

##### `image_pull_policy`<sup>Required</sup> <a name="cdk8s_plus_22.Container.property.image_pull_policy"></a>

```python
image_pull_policy: ImagePullPolicy
```

- *Type:* [`cdk8s_plus_22.ImagePullPolicy`](#cdk8s_plus_22.ImagePullPolicy)

Image pull policy for this container.

---

##### `mounts`<sup>Required</sup> <a name="cdk8s_plus_22.Container.property.mounts"></a>

```python
mounts: typing.List[VolumeMount]
```

- *Type:* typing.List[[`cdk8s_plus_22.VolumeMount`](#cdk8s_plus_22.VolumeMount)]

Volume mounts configured for this container.

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_22.Container.property.name"></a>

```python
name: str
```

- *Type:* `str`

The name of the container.

---

##### `args`<sup>Optional</sup> <a name="cdk8s_plus_22.Container.property.args"></a>

```python
args: typing.List[str]
```

- *Type:* typing.List[`str`]

Arguments to the entrypoint.

---

##### `command`<sup>Optional</sup> <a name="cdk8s_plus_22.Container.property.command"></a>

```python
command: typing.List[str]
```

- *Type:* typing.List[`str`]

Entrypoint array (the command to execute when the container starts).

---

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.Container.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

The port this container exposes.

---

##### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_22.Container.property.working_dir"></a>

```python
working_dir: str
```

- *Type:* `str`

The working directory inside the container.

---


### EnvValue <a name="cdk8s_plus_22.EnvValue"></a>

Utility class for creating reading env values from various sources.


#### Static Functions <a name="Static Functions"></a>

##### `from_config_map` <a name="cdk8s_plus_22.EnvValue.from_config_map"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.EnvValue.from_config_map(
  config_map: IConfigMap,
  key: str,
  optional: bool = None
)
```

###### `config_map`<sup>Required</sup> <a name="cdk8s_plus_22.EnvValue.parameter.config_map"></a>

- *Type:* [`cdk8s_plus_22.IConfigMap`](#cdk8s_plus_22.IConfigMap)

The config map.

---

###### `key`<sup>Required</sup> <a name="cdk8s_plus_22.EnvValue.parameter.key"></a>

- *Type:* `str`

The key to extract the value from.

---

###### `optional`<sup>Optional</sup> <a name="cdk8s_plus_22.EnvValueFromConfigMapOptions.parameter.optional"></a>

- *Type:* `bool`
- *Default:* false

Specify whether the ConfigMap or its key must be defined.

---

##### `from_process` <a name="cdk8s_plus_22.EnvValue.from_process"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.EnvValue.from_process(
  key: str,
  required: bool = None
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_22.EnvValue.parameter.key"></a>

- *Type:* `str`

The key to read.

---

###### `required`<sup>Optional</sup> <a name="cdk8s_plus_22.EnvValueFromProcessOptions.parameter.required"></a>

- *Type:* `bool`
- *Default:* false

Specify whether the key must exist in the environment.

If this is set to true, and the key does not exist, an error will thrown.

---

##### `from_secret_value` <a name="cdk8s_plus_22.EnvValue.from_secret_value"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.EnvValue.from_secret_value(
  key: str,
  secret: ISecret,
  optional: bool = None
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_22.SecretValue.parameter.key"></a>

- *Type:* `str`

The JSON key.

---

###### `secret`<sup>Required</sup> <a name="cdk8s_plus_22.SecretValue.parameter.secret"></a>

- *Type:* [`cdk8s_plus_22.ISecret`](#cdk8s_plus_22.ISecret)

The secret.

---

###### `optional`<sup>Optional</sup> <a name="cdk8s_plus_22.EnvValueFromSecretOptions.parameter.optional"></a>

- *Type:* `bool`
- *Default:* false

Specify whether the Secret or its key must be defined.

---

##### `from_value` <a name="cdk8s_plus_22.EnvValue.from_value"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.EnvValue.from_value(
  value: str
)
```

###### `value`<sup>Required</sup> <a name="cdk8s_plus_22.EnvValue.parameter.value"></a>

- *Type:* `str`

The value.

---

#### Properties <a name="Properties"></a>

##### `value`<sup>Optional</sup> <a name="cdk8s_plus_22.EnvValue.property.value"></a>

```python
value: typing.Any
```

- *Type:* `typing.Any`

---

##### `value_from`<sup>Optional</sup> <a name="cdk8s_plus_22.EnvValue.property.value_from"></a>

```python
value_from: typing.Any
```

- *Type:* `typing.Any`

---


### IngressBackend <a name="cdk8s_plus_22.IngressBackend"></a>

The backend for an ingress path.


#### Static Functions <a name="Static Functions"></a>

##### `from_service` <a name="cdk8s_plus_22.IngressBackend.from_service"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.IngressBackend.from_service(
  service: Service,
  port: typing.Union[int, float] = None
)
```

###### `service`<sup>Required</sup> <a name="cdk8s_plus_22.IngressBackend.parameter.service"></a>

- *Type:* [`cdk8s_plus_22.Service`](#cdk8s_plus_22.Service)

The service object.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.ServiceIngressBackendOptions.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* if the service exposes a single port, this port will be used.

The port to use to access the service.

This option will fail if the service does not expose any ports.
- If the service exposes multiple ports, this option must be specified.
- If the service exposes a single port, this option is optional and if
   specified, it must be the same port exposed by the service.

---



### PodSpec <a name="cdk8s_plus_22.PodSpec"></a>

- *Implements:* [`cdk8s_plus_22.IPodSpec`](#cdk8s_plus_22.IPodSpec)

Provides read/write capabilities ontop of a `PodSpecProps`.

#### Initializers <a name="cdk8s_plus_22.PodSpec.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.PodSpec(
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None
)
```

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.PodSpecProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.PodSpecProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.PodSpecProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.PodSpecProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

#### Methods <a name="Methods"></a>

##### `add_container` <a name="cdk8s_plus_22.PodSpec.add_container"></a>

```python
def add_container(
  image: str,
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  readiness: Probe = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None
)
```

###### `image`<sup>Required</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image"></a>

- *Type:* `str`

Docker image name.

---

###### `args`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.args"></a>

- *Type:* typing.List[`str`]
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

###### `command`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.command"></a>

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

###### `env`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.env"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_22.EnvValue`](#cdk8s_plus_22.EnvValue)]
- *Default:* No environment variables.

List of environment variables to set in the container.

Cannot be updated.

---

###### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image_pull_policy"></a>

- *Type:* [`cdk8s_plus_22.ImagePullPolicy`](#cdk8s_plus_22.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

###### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.liveness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.name"></a>

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No port is exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

###### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.readiness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

###### `startup`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.startup"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

###### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.volume_mounts"></a>

- *Type:* typing.List[[`cdk8s_plus_22.VolumeMount`](#cdk8s_plus_22.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

###### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.working_dir"></a>

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `add_volume` <a name="cdk8s_plus_22.PodSpec.add_volume"></a>

```python
def add_volume(
  volume: Volume
)
```

###### `volume`<sup>Required</sup> <a name="cdk8s_plus_22.PodSpec.parameter.volume"></a>

- *Type:* [`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)

---


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="cdk8s_plus_22.PodSpec.property.containers"></a>

```python
containers: typing.List[Container]
```

- *Type:* typing.List[[`cdk8s_plus_22.Container`](#cdk8s_plus_22.Container)]

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `volumes`<sup>Required</sup> <a name="cdk8s_plus_22.PodSpec.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.PodSpec.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.PodSpec.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)

The service account used to run this pod.

---


### PodTemplate <a name="cdk8s_plus_22.PodTemplate"></a>

- *Implements:* [`cdk8s_plus_22.IPodTemplate`](#cdk8s_plus_22.IPodTemplate)

Provides read/write capabilities ontop of a `PodTemplateProps`.

#### Initializers <a name="cdk8s_plus_22.PodTemplate.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.PodTemplate(
  containers: typing.List[ContainerProps] = None,
  restart_policy: RestartPolicy = None,
  service_account: IServiceAccount = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None
)
```

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_22.PodTemplateProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_22.ContainerProps`](#cdk8s_plus_22.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.PodTemplateProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.PodTemplateProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)
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

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_22.PodTemplateProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_22.PodTemplateProps.parameter.pod_metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata.

---



#### Properties <a name="Properties"></a>

##### `pod_metadata`<sup>Required</sup> <a name="cdk8s_plus_22.PodTemplate.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadataDefinition
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

Provides read/write access to the underlying pod metadata of the resource.

---


### Probe <a name="cdk8s_plus_22.Probe"></a>

Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.

#### Initializers <a name="cdk8s_plus_22.Probe.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Probe()
```


#### Static Functions <a name="Static Functions"></a>

##### `from_command` <a name="cdk8s_plus_22.Probe.from_command"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Probe.from_command(
  command: typing.List[str],
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None
)
```

###### `command`<sup>Required</sup> <a name="cdk8s_plus_22.Probe.parameter.command"></a>

- *Type:* typing.List[`str`]

The command to execute.

---

###### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_22.CommandProbeOptions.parameter.failure_threshold"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

###### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.CommandProbeOptions.parameter.initial_delay_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

###### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.CommandProbeOptions.parameter.period_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

###### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_22.CommandProbeOptions.parameter.success_threshold"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

###### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.CommandProbeOptions.parameter.timeout_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `from_http_get` <a name="cdk8s_plus_22.Probe.from_http_get"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Probe.from_http_get(
  path: str,
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None,
  port: typing.Union[int, float] = None
)
```

###### `path`<sup>Required</sup> <a name="cdk8s_plus_22.Probe.parameter.path"></a>

- *Type:* `str`

The URL path to hit.

---

###### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.parameter.failure_threshold"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

###### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.parameter.initial_delay_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

###### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.parameter.period_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

###### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.parameter.success_threshold"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

###### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.parameter.timeout_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.HttpGetProbeOptions.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---



### Volume <a name="cdk8s_plus_22.Volume"></a>

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

#### Initializers <a name="cdk8s_plus_22.Volume.Initializer"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Volume(
  name: str,
  config: typing.Any
)
```

##### `name`<sup>Required</sup> <a name="cdk8s_plus_22.Volume.parameter.name"></a>

- *Type:* `str`

---

##### `config`<sup>Required</sup> <a name="cdk8s_plus_22.Volume.parameter.config"></a>

- *Type:* `typing.Any`

---


#### Static Functions <a name="Static Functions"></a>

##### `from_config_map` <a name="cdk8s_plus_22.Volume.from_config_map"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Volume.from_config_map(
  config_map: IConfigMap,
  default_mode: typing.Union[int, float] = None,
  items: typing.Mapping[PathMapping] = None,
  name: str = None,
  optional: bool = None
)
```

###### `config_map`<sup>Required</sup> <a name="cdk8s_plus_22.Volume.parameter.config_map"></a>

- *Type:* [`cdk8s_plus_22.IConfigMap`](#cdk8s_plus_22.IConfigMap)

The config map to use to populate the volume.

---

###### `default_mode`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapVolumeOptions.parameter.default_mode"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 0644. Directories within the path are not affected by this
setting. This might be in conflict with other options that affect the file
mode, like fsGroup, and the result can be other mode bits set.

Mode bits to use on created files by default.

Must be a value between 0 and
0777. Defaults to 0644. Directories within the path are not affected by
this setting. This might be in conflict with other options that affect the
file mode, like fsGroup, and the result can be other mode bits set.

---

###### `items`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapVolumeOptions.parameter.items"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_22.PathMapping`](#cdk8s_plus_22.PathMapping)]
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the ConfigMap, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapVolumeOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

###### `optional`<sup>Optional</sup> <a name="cdk8s_plus_22.ConfigMapVolumeOptions.parameter.optional"></a>

- *Type:* `bool`
- *Default:* undocumented

Specify whether the ConfigMap or its keys must be defined.

---

##### `from_empty_dir` <a name="cdk8s_plus_22.Volume.from_empty_dir"></a>

```python
import cdk8s_plus_22

cdk8s_plus_22.Volume.from_empty_dir(
  name: str,
  medium: EmptyDirMedium = None,
  size_limit: Size = None
)
```

###### `name`<sup>Required</sup> <a name="cdk8s_plus_22.Volume.parameter.name"></a>

- *Type:* `str`

---

###### `medium`<sup>Optional</sup> <a name="cdk8s_plus_22.EmptyDirVolumeOptions.parameter.medium"></a>

- *Type:* [`cdk8s_plus_22.EmptyDirMedium`](#cdk8s_plus_22.EmptyDirMedium)
- *Default:* EmptyDirMedium.DEFAULT

By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment.

However, you can set the emptyDir.medium field to
`EmptyDirMedium.MEMORY` to tell Kubernetes to mount a tmpfs (RAM-backed
filesystem) for you instead. While tmpfs is very fast, be aware that unlike
disks, tmpfs is cleared on node reboot and any files you write will count
against your Container's memory limit.

---

###### `size_limit`<sup>Optional</sup> <a name="cdk8s_plus_22.EmptyDirVolumeOptions.parameter.size_limit"></a>

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* limit is undefined

Total amount of local storage required for this EmptyDir volume.

The size
limit is also applicable for memory medium. The maximum usage on memory
medium EmptyDir would be the minimum value between the SizeLimit specified
here and the sum of memory limits of all containers in a pod.

---

#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="cdk8s_plus_22.Volume.property.name"></a>

```python
name: str
```

- *Type:* `str`

---


## Protocols <a name="Protocols"></a>

### IConfigMap <a name="cdk8s_plus_22.IConfigMap"></a>

- *Extends:* [`cdk8s_plus_22.IResource`](#cdk8s_plus_22.IResource)

- *Implemented By:* [`cdk8s_plus_22.ConfigMap`](#cdk8s_plus_22.ConfigMap), [`cdk8s_plus_22.IConfigMap`](#cdk8s_plus_22.IConfigMap)

Represents a config map.


#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="cdk8s_plus_22.IConfigMap.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### IPodSpec <a name="cdk8s_plus_22.IPodSpec"></a>

- *Implemented By:* [`cdk8s_plus_22.Deployment`](#cdk8s_plus_22.Deployment), [`cdk8s_plus_22.Job`](#cdk8s_plus_22.Job), [`cdk8s_plus_22.Pod`](#cdk8s_plus_22.Pod), [`cdk8s_plus_22.PodSpec`](#cdk8s_plus_22.PodSpec), [`cdk8s_plus_22.PodTemplate`](#cdk8s_plus_22.PodTemplate), [`cdk8s_plus_22.StatefulSet`](#cdk8s_plus_22.StatefulSet), [`cdk8s_plus_22.IPodSpec`](#cdk8s_plus_22.IPodSpec), [`cdk8s_plus_22.IPodTemplate`](#cdk8s_plus_22.IPodTemplate)

Represents a resource that can be configured with a kuberenets pod spec. (e.g `Deployment`, `Job`, `Pod`, ...).

Use the `PodSpec` class as an implementation helper.

#### Methods <a name="Methods"></a>

##### `add_container` <a name="cdk8s_plus_22.IPodSpec.add_container"></a>

```python
def add_container(
  image: str,
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  readiness: Probe = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None
)
```

###### `image`<sup>Required</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image"></a>

- *Type:* `str`

Docker image name.

---

###### `args`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.args"></a>

- *Type:* typing.List[`str`]
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

###### `command`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.command"></a>

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

###### `env`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.env"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_22.EnvValue`](#cdk8s_plus_22.EnvValue)]
- *Default:* No environment variables.

List of environment variables to set in the container.

Cannot be updated.

---

###### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.image_pull_policy"></a>

- *Type:* [`cdk8s_plus_22.ImagePullPolicy`](#cdk8s_plus_22.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

###### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.liveness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.name"></a>

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No port is exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

###### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.readiness"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

###### `startup`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.startup"></a>

- *Type:* [`cdk8s_plus_22.Probe`](#cdk8s_plus_22.Probe)
- *Default:* no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

###### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.volume_mounts"></a>

- *Type:* typing.List[[`cdk8s_plus_22.VolumeMount`](#cdk8s_plus_22.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

###### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_22.ContainerProps.parameter.working_dir"></a>

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `add_volume` <a name="cdk8s_plus_22.IPodSpec.add_volume"></a>

```python
def add_volume(
  volume: Volume
)
```

###### `volume`<sup>Required</sup> <a name="cdk8s_plus_22.IPodSpec.parameter.volume"></a>

- *Type:* [`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)

The volume.

---

#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="cdk8s_plus_22.IPodSpec.property.containers"></a>

```python
containers: typing.List[Container]
```

- *Type:* typing.List[[`cdk8s_plus_22.Container`](#cdk8s_plus_22.Container)]

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `volumes`<sup>Required</sup> <a name="cdk8s_plus_22.IPodSpec.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.IPodSpec.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.IPodSpec.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)

The service account used to run this pod.

---

### IPodTemplate <a name="cdk8s_plus_22.IPodTemplate"></a>

- *Extends:* [`cdk8s_plus_22.IPodSpec`](#cdk8s_plus_22.IPodSpec)

- *Implemented By:* [`cdk8s_plus_22.Deployment`](#cdk8s_plus_22.Deployment), [`cdk8s_plus_22.Job`](#cdk8s_plus_22.Job), [`cdk8s_plus_22.PodTemplate`](#cdk8s_plus_22.PodTemplate), [`cdk8s_plus_22.StatefulSet`](#cdk8s_plus_22.StatefulSet), [`cdk8s_plus_22.IPodTemplate`](#cdk8s_plus_22.IPodTemplate)

Represents a resource that can be configured with a kuberenets pod template. (e.g `Deployment`, `Job`, ...).

Use the `PodTemplate` class as an implementation helper.


#### Properties <a name="Properties"></a>

##### `containers`<sup>Required</sup> <a name="cdk8s_plus_22.IPodTemplate.property.containers"></a>

```python
containers: typing.List[Container]
```

- *Type:* typing.List[[`cdk8s_plus_22.Container`](#cdk8s_plus_22.Container)]

The containers belonging to the pod.

Use `addContainer` to add containers.

---

##### `volumes`<sup>Required</sup> <a name="cdk8s_plus_22.IPodTemplate.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_22.Volume`](#cdk8s_plus_22.Volume)]

The volumes associated with this pod.

Use `addVolume` to add volumes.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_22.IPodTemplate.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_22.RestartPolicy`](#cdk8s_plus_22.RestartPolicy)

Restart policy for all containers within the pod.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_22.IPodTemplate.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)

The service account used to run this pod.

---

##### `pod_metadata`<sup>Required</sup> <a name="cdk8s_plus_22.IPodTemplate.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadataDefinition
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

Provides read/write access to the underlying pod metadata of the resource.

---

### IResource <a name="cdk8s_plus_22.IResource"></a>

- *Implemented By:* [`cdk8s_plus_22.ConfigMap`](#cdk8s_plus_22.ConfigMap), [`cdk8s_plus_22.Deployment`](#cdk8s_plus_22.Deployment), [`cdk8s_plus_22.Ingress`](#cdk8s_plus_22.Ingress), [`cdk8s_plus_22.Job`](#cdk8s_plus_22.Job), [`cdk8s_plus_22.Pod`](#cdk8s_plus_22.Pod), [`cdk8s_plus_22.Resource`](#cdk8s_plus_22.Resource), [`cdk8s_plus_22.Secret`](#cdk8s_plus_22.Secret), [`cdk8s_plus_22.Service`](#cdk8s_plus_22.Service), [`cdk8s_plus_22.ServiceAccount`](#cdk8s_plus_22.ServiceAccount), [`cdk8s_plus_22.StatefulSet`](#cdk8s_plus_22.StatefulSet), [`cdk8s_plus_22.IConfigMap`](#cdk8s_plus_22.IConfigMap), [`cdk8s_plus_22.IResource`](#cdk8s_plus_22.IResource), [`cdk8s_plus_22.ISecret`](#cdk8s_plus_22.ISecret), [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)

Represents a resource.


#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="cdk8s_plus_22.IResource.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### ISecret <a name="cdk8s_plus_22.ISecret"></a>

- *Extends:* [`cdk8s_plus_22.IResource`](#cdk8s_plus_22.IResource)

- *Implemented By:* [`cdk8s_plus_22.Secret`](#cdk8s_plus_22.Secret), [`cdk8s_plus_22.ISecret`](#cdk8s_plus_22.ISecret)


#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="cdk8s_plus_22.ISecret.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### IServiceAccount <a name="cdk8s_plus_22.IServiceAccount"></a>

- *Extends:* [`cdk8s_plus_22.IResource`](#cdk8s_plus_22.IResource)

- *Implemented By:* [`cdk8s_plus_22.ServiceAccount`](#cdk8s_plus_22.ServiceAccount), [`cdk8s_plus_22.IServiceAccount`](#cdk8s_plus_22.IServiceAccount)


#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="cdk8s_plus_22.IServiceAccount.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

## Enums <a name="Enums"></a>

### EmptyDirMedium <a name="EmptyDirMedium"></a>

The medium on which to store the volume.

#### `DEFAULT` <a name="cdk8s_plus_22.EmptyDirMedium.DEFAULT"></a>

The default volume of the backing node.

---


#### `MEMORY` <a name="cdk8s_plus_22.EmptyDirMedium.MEMORY"></a>

Mount a tmpfs (RAM-backed filesystem) for you instead.

While tmpfs is very
fast, be aware that unlike disks, tmpfs is cleared on node reboot and any
files you write will count against your Container's memory limit.

---


### HttpIngressPathType <a name="HttpIngressPathType"></a>

Specify how the path is matched against request paths.

> https://kubernetes.io/docs/concepts/services-networking/ingress/#path-types

#### `PREFIX` <a name="cdk8s_plus_22.HttpIngressPathType.PREFIX"></a>

Matches the URL path exactly.

---


#### `EXACT` <a name="cdk8s_plus_22.HttpIngressPathType.EXACT"></a>

Matches based on a URL path prefix split by '/'.

---


#### `IMPLEMENTATION_SPECIFIC` <a name="cdk8s_plus_22.HttpIngressPathType.IMPLEMENTATION_SPECIFIC"></a>

Matching is specified by the underlying IngressClass.

---


### ImagePullPolicy <a name="ImagePullPolicy"></a>

#### `ALWAYS` <a name="cdk8s_plus_22.ImagePullPolicy.ALWAYS"></a>

Every time the kubelet launches a container, the kubelet queries the container image registry to resolve the name to an image digest.

If the kubelet has a container image with that exact
digest cached locally, the kubelet uses its cached image; otherwise, the kubelet downloads
(pulls) the image with the resolved digest, and uses that image to launch the container.

Default is Always if ImagePullPolicy is omitted and either the image tag is :latest or
the image tag is omitted.

---


#### `IF_NOT_PRESENT` <a name="cdk8s_plus_22.ImagePullPolicy.IF_NOT_PRESENT"></a>

The image is pulled only if it is not already present locally.

Default is IfNotPresent if ImagePullPolicy is omitted and the image tag is present but
not :latest

---


#### `NEVER` <a name="cdk8s_plus_22.ImagePullPolicy.NEVER"></a>

The image is assumed to exist locally.

No attempt is made to pull the image.

---


### MountPropagation <a name="MountPropagation"></a>

#### `NONE` <a name="cdk8s_plus_22.MountPropagation.NONE"></a>

This volume mount will not receive any subsequent mounts that are mounted to this volume or any of its subdirectories by the host.

In similar
fashion, no mounts created by the Container will be visible on the host.

This is the default mode.

This mode is equal to `private` mount propagation as described in the Linux
kernel documentation

---


#### `HOST_TO_CONTAINER` <a name="cdk8s_plus_22.MountPropagation.HOST_TO_CONTAINER"></a>

This volume mount will receive all subsequent mounts that are mounted to this volume or any of its subdirectories.

In other words, if the host mounts anything inside the volume mount, the
Container will see it mounted there.

Similarly, if any Pod with Bidirectional mount propagation to the same
volume mounts anything there, the Container with HostToContainer mount
propagation will see it.

This mode is equal to `rslave` mount propagation as described in the Linux
kernel documentation

---


#### `BIDIRECTIONAL` <a name="cdk8s_plus_22.MountPropagation.BIDIRECTIONAL"></a>

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

#### `ORDERED_READY` <a name="cdk8s_plus_22.PodManagementPolicy.ORDERED_READY"></a>

---


#### `PARALLEL` <a name="cdk8s_plus_22.PodManagementPolicy.PARALLEL"></a>

---


### Protocol <a name="Protocol"></a>

#### `TCP` <a name="cdk8s_plus_22.Protocol.TCP"></a>

---


#### `UDP` <a name="cdk8s_plus_22.Protocol.UDP"></a>

---


#### `SCTP` <a name="cdk8s_plus_22.Protocol.SCTP"></a>

---


### RestartPolicy <a name="RestartPolicy"></a>

Restart policy for all containers within the pod.

#### `ALWAYS` <a name="cdk8s_plus_22.RestartPolicy.ALWAYS"></a>

Always restart the pod after it exits.

---


#### `ON_FAILURE` <a name="cdk8s_plus_22.RestartPolicy.ON_FAILURE"></a>

Only restart if the pod exits with a non-zero exit code.

---


#### `NEVER` <a name="cdk8s_plus_22.RestartPolicy.NEVER"></a>

Never restart the pod.

---


### ServiceType <a name="ServiceType"></a>

For some parts of your application (for example, frontends) you may want to expose a Service onto an external IP address, that's outside of your cluster.

Kubernetes ServiceTypes allow you to specify what kind of Service you want.
The default is ClusterIP.

#### `CLUSTER_IP` <a name="cdk8s_plus_22.ServiceType.CLUSTER_IP"></a>

Exposes the Service on a cluster-internal IP.

Choosing this value makes the Service only reachable from within the cluster.
This is the default ServiceType

---


#### `NODE_PORT` <a name="cdk8s_plus_22.ServiceType.NODE_PORT"></a>

Exposes the Service on each Node's IP at a static port (the NodePort).

A ClusterIP Service, to which the NodePort Service routes, is automatically created.
You'll be able to contact the NodePort Service, from outside the cluster,
by requesting <NodeIP>:<NodePort>.

---


#### `LOAD_BALANCER` <a name="cdk8s_plus_22.ServiceType.LOAD_BALANCER"></a>

Exposes the Service externally using a cloud provider's load balancer.

NodePort and ClusterIP Services, to which the external load balancer routes,
are automatically created.

---


#### `EXTERNAL_NAME` <a name="cdk8s_plus_22.ServiceType.EXTERNAL_NAME"></a>

Maps the Service to the contents of the externalName field (e.g. foo.bar.example.com), by returning a CNAME record with its value. No proxying of any kind is set up.

> Note: You need either kube-dns version 1.7 or CoreDNS version 0.0.8 or higher to use the ExternalName type.

---

