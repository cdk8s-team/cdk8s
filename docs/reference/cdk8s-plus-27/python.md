# cdk8s-plus-27 (Python) <a name="API Reference"></a>

## Constructs <a name="Constructs"></a>

### AbstractPod <a name="cdk8s_plus_27.AbstractPod"></a>

- *Implements:* [`cdk8s_plus_27.IPodSelector`](#cdk8s_plus_27.IPodSelector), [`cdk8s_plus_27.INetworkPolicyPeer`](#cdk8s_plus_27.INetworkPolicyPeer), [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

#### Initializers <a name="cdk8s_plus_27.AbstractPod.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.AbstractPod(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.automount_service_account_token"></a>

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.dns"></a>

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.docker_registry_auth"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.host_aliases"></a>

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.host_network"></a>

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.init_containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.isolate"></a>

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.termination_grace_period"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

#### Methods <a name="Methods"></a>

##### `add_container` <a name="cdk8s_plus_27.AbstractPod.add_container"></a>

```python
def add_container(
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env_from: typing.List[EnvFrom] = None,
  env_variables: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  lifecycle: ContainerLifecycle = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  port_number: typing.Union[int, float] = None,
  ports: typing.List[ContainerPort] = None,
  readiness: Probe = None,
  resources: ContainerResources = None,
  security_context: ContainerSecurityContextProps = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None,
  image: str
)
```

###### `args`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.args"></a>

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

###### `command`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.command"></a>

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

###### `env_from`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.env_from"></a>

- *Type:* typing.List[[`cdk8s_plus_27.EnvFrom`](#cdk8s_plus_27.EnvFrom)]
- *Default:* No sources.

List of sources to populate environment variables in the container.

When a key exists in multiple sources, the value associated with
the last source will take precedence. Values defined by the `envVariables` property
with a duplicate key will take precedence.

---

###### `env_variables`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.env_variables"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_27.EnvValue`](#cdk8s_plus_27.EnvValue)]
- *Default:* No environment variables.

Environment variables to set in the container.

---

###### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.image_pull_policy"></a>

- *Type:* [`cdk8s_plus_27.ImagePullPolicy`](#cdk8s_plus_27.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

###### `lifecycle`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.lifecycle"></a>

- *Type:* [`cdk8s_plus_27.ContainerLifecycle`](#cdk8s_plus_27.ContainerLifecycle)

Describes actions that the management system should take in response to container lifecycle events.

---

###### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.liveness"></a>

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.name"></a>

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

###### ~~`port`~~<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.port"></a>

- *Deprecated:* - use `portNumber`.

- *Type:* `typing.Union[int, float]`

---

###### `port_number`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.port_number"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* Only the ports mentiond in the `ports` property are exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

This is a convinience property if all you need a single TCP numbered port.
In case more advanced configuartion is required, use the `ports` property.

This port is added to the list of ports mentioned in the `ports` property.

---

###### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerPort`](#cdk8s_plus_27.ContainerPort)]
- *Default:* Only the port mentioned in the `portNumber` property is exposed.

List of ports to expose from this container.

---

###### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.readiness"></a>

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

###### `resources`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.ContainerResources`](#cdk8s_plus_27.ContainerResources)
- *Default:* cpu:
     request: 1000 millis
     limit: 1500 millis
   memory:
     request: 512 mebibytes
     limit: 2048 mebibytes

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

###### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.ContainerSecurityContextProps`](#cdk8s_plus_27.ContainerSecurityContextProps)
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

###### `startup`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.startup"></a>

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* If a port is provided, then knocks on that port
to determine when the container is ready for readiness and
liveness probe checks.
Otherwise, no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

###### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.volume_mounts"></a>

- *Type:* typing.List[[`cdk8s_plus_27.VolumeMount`](#cdk8s_plus_27.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

###### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.working_dir"></a>

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

###### `image`<sup>Required</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.image"></a>

- *Type:* `str`

Docker image name.

---

##### `add_host_alias` <a name="cdk8s_plus_27.AbstractPod.add_host_alias"></a>

```python
def add_host_alias(
  hostnames: typing.List[str],
  ip: str
)
```

###### `hostnames`<sup>Required</sup> <a name="cdk8s_plus_27.HostAlias.parameter.hostnames"></a>

- *Type:* typing.List[`str`]

Hostnames for the chosen IP address.

---

###### `ip`<sup>Required</sup> <a name="cdk8s_plus_27.HostAlias.parameter.ip"></a>

- *Type:* `str`

IP address of the host file entry.

---

##### `add_init_container` <a name="cdk8s_plus_27.AbstractPod.add_init_container"></a>

```python
def add_init_container(
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env_from: typing.List[EnvFrom] = None,
  env_variables: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  lifecycle: ContainerLifecycle = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  port_number: typing.Union[int, float] = None,
  ports: typing.List[ContainerPort] = None,
  readiness: Probe = None,
  resources: ContainerResources = None,
  security_context: ContainerSecurityContextProps = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None,
  image: str
)
```

###### `args`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.args"></a>

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

###### `command`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.command"></a>

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

###### `env_from`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.env_from"></a>

- *Type:* typing.List[[`cdk8s_plus_27.EnvFrom`](#cdk8s_plus_27.EnvFrom)]
- *Default:* No sources.

List of sources to populate environment variables in the container.

When a key exists in multiple sources, the value associated with
the last source will take precedence. Values defined by the `envVariables` property
with a duplicate key will take precedence.

---

###### `env_variables`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.env_variables"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_27.EnvValue`](#cdk8s_plus_27.EnvValue)]
- *Default:* No environment variables.

Environment variables to set in the container.

---

###### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.image_pull_policy"></a>

- *Type:* [`cdk8s_plus_27.ImagePullPolicy`](#cdk8s_plus_27.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

###### `lifecycle`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.lifecycle"></a>

- *Type:* [`cdk8s_plus_27.ContainerLifecycle`](#cdk8s_plus_27.ContainerLifecycle)

Describes actions that the management system should take in response to container lifecycle events.

---

###### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.liveness"></a>

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.name"></a>

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

###### ~~`port`~~<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.port"></a>

- *Deprecated:* - use `portNumber`.

- *Type:* `typing.Union[int, float]`

---

###### `port_number`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.port_number"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* Only the ports mentiond in the `ports` property are exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

This is a convinience property if all you need a single TCP numbered port.
In case more advanced configuartion is required, use the `ports` property.

This port is added to the list of ports mentioned in the `ports` property.

---

###### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerPort`](#cdk8s_plus_27.ContainerPort)]
- *Default:* Only the port mentioned in the `portNumber` property is exposed.

List of ports to expose from this container.

---

###### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.readiness"></a>

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

###### `resources`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.ContainerResources`](#cdk8s_plus_27.ContainerResources)
- *Default:* cpu:
     request: 1000 millis
     limit: 1500 millis
   memory:
     request: 512 mebibytes
     limit: 2048 mebibytes

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

###### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.ContainerSecurityContextProps`](#cdk8s_plus_27.ContainerSecurityContextProps)
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

###### `startup`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.startup"></a>

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* If a port is provided, then knocks on that port
to determine when the container is ready for readiness and
liveness probe checks.
Otherwise, no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

###### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.volume_mounts"></a>

- *Type:* typing.List[[`cdk8s_plus_27.VolumeMount`](#cdk8s_plus_27.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

###### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.working_dir"></a>

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

###### `image`<sup>Required</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.image"></a>

- *Type:* `str`

Docker image name.

---

##### `add_volume` <a name="cdk8s_plus_27.AbstractPod.add_volume"></a>

```python
def add_volume(
  vol: Volume
)
```

###### `vol`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.parameter.vol"></a>

- *Type:* [`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)

---

##### `attach_container` <a name="cdk8s_plus_27.AbstractPod.attach_container"></a>

```python
def attach_container(
  cont: Container
)
```

###### `cont`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.parameter.cont"></a>

- *Type:* [`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)

---

##### `to_network_policy_peer_config` <a name="cdk8s_plus_27.AbstractPod.to_network_policy_peer_config"></a>

```python
def to_network_policy_peer_config()
```

##### `to_pod_selector` <a name="cdk8s_plus_27.AbstractPod.to_pod_selector"></a>

```python
def to_pod_selector()
```

##### `to_pod_selector_config` <a name="cdk8s_plus_27.AbstractPod.to_pod_selector_config"></a>

```python
def to_pod_selector_config()
```

##### `to_subject_configuration` <a name="cdk8s_plus_27.AbstractPod.to_subject_configuration"></a>

```python
def to_subject_configuration()
```


#### Properties <a name="Properties"></a>

##### `automount_service_account_token`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.property.automount_service_account_token"></a>

```python
automount_service_account_token: bool
```

- *Type:* `bool`

---

##### `containers`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.property.containers"></a>

```python
containers: typing.List[Container]
```

- *Type:* typing.List[[`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)]

---

##### `dns`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.property.dns"></a>

```python
dns: PodDns
```

- *Type:* [`cdk8s_plus_27.PodDns`](#cdk8s_plus_27.PodDns)

---

##### `host_aliases`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.property.host_aliases"></a>

```python
host_aliases: typing.List[HostAlias]
```

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

---

##### `init_containers`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.property.init_containers"></a>

```python
init_containers: typing.List[Container]
```

- *Type:* typing.List[[`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)]

---

##### `pod_metadata`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadataDefinition
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

---

##### `security_context`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.property.security_context"></a>

```python
security_context: PodSecurityContext
```

- *Type:* [`cdk8s_plus_27.PodSecurityContext`](#cdk8s_plus_27.PodSecurityContext)

---

##### `volumes`<sup>Required</sup> <a name="cdk8s_plus_27.AbstractPod.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPod.property.docker_registry_auth"></a>

```python
docker_registry_auth: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPod.property.host_network"></a>

```python
host_network: bool
```

- *Type:* `bool`

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPod.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPod.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)

---

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPod.property.termination_grace_period"></a>

```python
termination_grace_period: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

---


### AwsElasticBlockStorePersistentVolume <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolume"></a>

Represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

#### Initializers <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolume.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.AwsElasticBlockStorePersistentVolume(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  access_modes: typing.List[PersistentVolumeAccessMode] = None,
  claim: IPersistentVolumeClaim = None,
  mount_options: typing.List[str] = None,
  reclaim_policy: PersistentVolumeReclaimPolicy = None,
  storage: Size = None,
  storage_class_name: str = None,
  volume_mode: PersistentVolumeMode = None,
  volume_id: str,
  fs_type: str = None,
  partition: typing.Union[int, float] = None,
  read_only: bool = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolume.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.access_modes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.claim"></a>

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mount_options`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.mount_options"></a>

- *Type:* typing.List[`str`]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaim_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.reclaim_policy"></a>

- *Type:* [`cdk8s_plus_27.PersistentVolumeReclaimPolicy`](#cdk8s_plus_27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.storage"></a>

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.storage_class_name"></a>

- *Type:* `str`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volume_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.volume_mode"></a>

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `volume_id`<sup>Required</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.volume_id"></a>

- *Type:* `str`

Unique ID of the persistent disk resource in AWS (Amazon EBS volume).

More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.fs_type"></a>

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.partition"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---



#### Properties <a name="Properties"></a>

##### `fs_type`<sup>Required</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolume.property.fs_type"></a>

```python
fs_type: str
```

- *Type:* `str`

File system type of this volume.

---

##### `read_only`<sup>Required</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolume.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`

Whether or not it is mounted as a read-only volume.

---

##### `volume_id`<sup>Required</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolume.property.volume_id"></a>

```python
volume_id: str
```

- *Type:* `str`

Volume id of this volume.

---

##### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolume.property.partition"></a>

```python
partition: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Partition of this volume.

---


### AzureDiskPersistentVolume <a name="cdk8s_plus_27.AzureDiskPersistentVolume"></a>

AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.

#### Initializers <a name="cdk8s_plus_27.AzureDiskPersistentVolume.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.AzureDiskPersistentVolume(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  access_modes: typing.List[PersistentVolumeAccessMode] = None,
  claim: IPersistentVolumeClaim = None,
  mount_options: typing.List[str] = None,
  reclaim_policy: PersistentVolumeReclaimPolicy = None,
  storage: Size = None,
  storage_class_name: str = None,
  volume_mode: PersistentVolumeMode = None,
  disk_name: str,
  disk_uri: str,
  caching_mode: AzureDiskPersistentVolumeCachingMode = None,
  fs_type: str = None,
  kind: AzureDiskPersistentVolumeKind = None,
  read_only: bool = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolume.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.access_modes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.claim"></a>

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mount_options`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.mount_options"></a>

- *Type:* typing.List[`str`]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaim_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.reclaim_policy"></a>

- *Type:* [`cdk8s_plus_27.PersistentVolumeReclaimPolicy`](#cdk8s_plus_27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.storage"></a>

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.storage_class_name"></a>

- *Type:* `str`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volume_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.volume_mode"></a>

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `disk_name`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.disk_name"></a>

- *Type:* `str`

The Name of the data disk in the blob storage.

---

##### `disk_uri`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.disk_uri"></a>

- *Type:* `str`

The URI the data disk in the blob storage.

---

##### `caching_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.caching_mode"></a>

- *Type:* [`cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode`](#cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode)
- *Default:* AzureDiskPersistentVolumeCachingMode.NONE.

Host Caching mode.

---

##### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.fs_type"></a>

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type to mount.

Must be a filesystem type supported by the host operating system.

---

##### `kind`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.kind"></a>

- *Type:* [`cdk8s_plus_27.AzureDiskPersistentVolumeKind`](#cdk8s_plus_27.AzureDiskPersistentVolumeKind)
- *Default:* AzureDiskPersistentVolumeKind.SHARED

Kind of disk.

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

Force the ReadOnly setting in VolumeMounts.

---



#### Properties <a name="Properties"></a>

##### `azure_kind`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolume.property.azure_kind"></a>

```python
azure_kind: AzureDiskPersistentVolumeKind
```

- *Type:* [`cdk8s_plus_27.AzureDiskPersistentVolumeKind`](#cdk8s_plus_27.AzureDiskPersistentVolumeKind)

Azure kind of this volume.

---

##### `caching_mode`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolume.property.caching_mode"></a>

```python
caching_mode: AzureDiskPersistentVolumeCachingMode
```

- *Type:* [`cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode`](#cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode)

Caching mode of this volume.

---

##### `disk_name`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolume.property.disk_name"></a>

```python
disk_name: str
```

- *Type:* `str`

Disk name of this volume.

---

##### `disk_uri`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolume.property.disk_uri"></a>

```python
disk_uri: str
```

- *Type:* `str`

Disk URI of this volume.

---

##### `fs_type`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolume.property.fs_type"></a>

```python
fs_type: str
```

- *Type:* `str`

File system type of this volume.

---

##### `read_only`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolume.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`

Whether or not it is mounted as a read-only volume.

---


### BasicAuthSecret <a name="cdk8s_plus_27.BasicAuthSecret"></a>

Create a secret for basic authentication.

> https://kubernetes.io/docs/concepts/configuration/secret/#basic-authentication-secret

#### Initializers <a name="cdk8s_plus_27.BasicAuthSecret.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.BasicAuthSecret(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  password: str,
  username: str
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.BasicAuthSecret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.BasicAuthSecret.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.BasicAuthSecretProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.BasicAuthSecretProps.parameter.immutable"></a>

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `password`<sup>Required</sup> <a name="cdk8s_plus_27.BasicAuthSecretProps.parameter.password"></a>

- *Type:* `str`

The password or token for authentication.

---

##### `username`<sup>Required</sup> <a name="cdk8s_plus_27.BasicAuthSecretProps.parameter.username"></a>

- *Type:* `str`

The user name for authentication.

---





### ClusterRole <a name="cdk8s_plus_27.ClusterRole"></a>

- *Implements:* [`cdk8s_plus_27.IClusterRole`](#cdk8s_plus_27.IClusterRole), [`cdk8s_plus_27.IRole`](#cdk8s_plus_27.IRole)

ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.

#### Initializers <a name="cdk8s_plus_27.ClusterRole.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ClusterRole(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  aggregation_labels: typing.Mapping[str] = None,
  rules: typing.List[ClusterRolePolicyRule] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ClusterRoleProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `aggregation_labels`<sup>Optional</sup> <a name="cdk8s_plus_27.ClusterRoleProps.parameter.aggregation_labels"></a>

- *Type:* typing.Mapping[`str`]

Specify labels that should be used to locate ClusterRoles, whose rules will be automatically filled into this ClusterRole's rules.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s_plus_27.ClusterRoleProps.parameter.rules"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ClusterRolePolicyRule`](#cdk8s_plus_27.ClusterRolePolicyRule)]
- *Default:* []

A list of rules the role should allow.

---

#### Methods <a name="Methods"></a>

##### `aggregate` <a name="cdk8s_plus_27.ClusterRole.aggregate"></a>

```python
def aggregate(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.key"></a>

- *Type:* `str`

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.value"></a>

- *Type:* `str`

---

##### `allow` <a name="cdk8s_plus_27.ClusterRole.allow"></a>

```python
def allow(
  verbs: typing.List[str],
  endpoints: IApiEndpoint
)
```

###### `verbs`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.verbs"></a>

- *Type:* typing.List[`str`]

---

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The endpoints(s) to apply to.

---

##### `allow_create` <a name="cdk8s_plus_27.ClusterRole.allow_create"></a>

```python
def allow_create(
  endpoints: IApiEndpoint
)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allow_delete` <a name="cdk8s_plus_27.ClusterRole.allow_delete"></a>

```python
def allow_delete(
  endpoints: IApiEndpoint
)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allow_delete_collection` <a name="cdk8s_plus_27.ClusterRole.allow_delete_collection"></a>

```python
def allow_delete_collection(
  endpoints: IApiEndpoint
)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allow_get` <a name="cdk8s_plus_27.ClusterRole.allow_get"></a>

```python
def allow_get(
  endpoints: IApiEndpoint
)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allow_list` <a name="cdk8s_plus_27.ClusterRole.allow_list"></a>

```python
def allow_list(
  endpoints: IApiEndpoint
)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allow_patch` <a name="cdk8s_plus_27.ClusterRole.allow_patch"></a>

```python
def allow_patch(
  endpoints: IApiEndpoint
)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allow_read` <a name="cdk8s_plus_27.ClusterRole.allow_read"></a>

```python
def allow_read(
  endpoints: IApiEndpoint
)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allow_read_write` <a name="cdk8s_plus_27.ClusterRole.allow_read_write"></a>

```python
def allow_read_write(
  endpoints: IApiEndpoint
)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allow_update` <a name="cdk8s_plus_27.ClusterRole.allow_update"></a>

```python
def allow_update(
  endpoints: IApiEndpoint
)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The resource(s) to apply to.

---

##### `allow_watch` <a name="cdk8s_plus_27.ClusterRole.allow_watch"></a>

```python
def allow_watch(
  endpoints: IApiEndpoint
)
```

###### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.endpoints"></a>

- *Type:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

The resource(s) to apply to.

---

##### `bind` <a name="cdk8s_plus_27.ClusterRole.bind"></a>

```python
def bind(
  subjects: ISubject
)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.subjects"></a>

- *Type:* [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

a list of subjects to bind to.

---

##### `bind_in_namespace` <a name="cdk8s_plus_27.ClusterRole.bind_in_namespace"></a>

```python
def bind_in_namespace(
  namespace: str,
  subjects: ISubject
)
```

###### `namespace`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.namespace"></a>

- *Type:* `str`

the namespace to limit permissions to.

---

###### `subjects`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.subjects"></a>

- *Type:* [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

a list of subjects to bind to.

---

##### `combine` <a name="cdk8s_plus_27.ClusterRole.combine"></a>

```python
def combine(
  rol: ClusterRole
)
```

###### `rol`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.rol"></a>

- *Type:* [`cdk8s_plus_27.ClusterRole`](#cdk8s_plus_27.ClusterRole)

---

#### Static Functions <a name="Static Functions"></a>

##### `from_cluster_role_name` <a name="cdk8s_plus_27.ClusterRole.from_cluster_role_name"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ClusterRole.from_cluster_role_name(
  scope: Construct,
  id: str,
  name: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.id"></a>

- *Type:* `str`

---

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.parameter.name"></a>

- *Type:* `str`

---

#### Properties <a name="Properties"></a>

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `rules`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRole.property.rules"></a>

```python
rules: typing.List[ClusterRolePolicyRule]
```

- *Type:* typing.List[[`cdk8s_plus_27.ClusterRolePolicyRule`](#cdk8s_plus_27.ClusterRolePolicyRule)]

Rules associaated with this Role.

Returns a copy, use `allow` to add rules.

---


### ClusterRoleBinding <a name="cdk8s_plus_27.ClusterRoleBinding"></a>

A ClusterRoleBinding grants permissions cluster-wide to a user or set of users.

#### Initializers <a name="cdk8s_plus_27.ClusterRoleBinding.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ClusterRoleBinding(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  role: IClusterRole
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRoleBinding.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRoleBinding.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ClusterRoleBindingProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `role`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRoleBindingProps.parameter.role"></a>

- *Type:* [`cdk8s_plus_27.IClusterRole`](#cdk8s_plus_27.IClusterRole)

The role to bind to.

---

#### Methods <a name="Methods"></a>

##### `add_subjects` <a name="cdk8s_plus_27.ClusterRoleBinding.add_subjects"></a>

```python
def add_subjects(
  subjects: ISubject
)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRoleBinding.parameter.subjects"></a>

- *Type:* [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

The subjects to add.

---


#### Properties <a name="Properties"></a>

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRoleBinding.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `role`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRoleBinding.property.role"></a>

```python
role: IClusterRole
```

- *Type:* [`cdk8s_plus_27.IClusterRole`](#cdk8s_plus_27.IClusterRole)

---

##### `subjects`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRoleBinding.property.subjects"></a>

```python
subjects: typing.List[ISubject]
```

- *Type:* typing.List[[`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)]

---


### ConfigMap <a name="cdk8s_plus_27.ConfigMap"></a>

- *Implements:* [`cdk8s_plus_27.IConfigMap`](#cdk8s_plus_27.IConfigMap)

ConfigMap holds configuration data for pods to consume.

#### Initializers <a name="cdk8s_plus_27.ConfigMap.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ConfigMap(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  binary_data: typing.Mapping[str] = None,
  data: typing.Mapping[str] = None,
  immutable: bool = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `binary_data`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapProps.parameter.binary_data"></a>

- *Type:* typing.Mapping[`str`]

BinaryData contains the binary data.

Each key must consist of alphanumeric characters, '-', '_' or '.'.
BinaryData can contain byte sequences that are not in the UTF-8 range. The
keys stored in BinaryData must not overlap with the ones in the Data field,
this is enforced during validation process.

You can also add binary data using `configMap.addBinaryData()`.

---

##### `data`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapProps.parameter.data"></a>

- *Type:* typing.Mapping[`str`]

Data contains the configuration data.

Each key must consist of alphanumeric characters, '-', '_' or '.'. Values
with non-UTF-8 byte sequences must use the BinaryData field. The keys
stored in Data must not overlap with the keys in the BinaryData field, this
is enforced during validation process.

You can also add data using `configMap.addData()`.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapProps.parameter.immutable"></a>

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

#### Methods <a name="Methods"></a>

##### `add_binary_data` <a name="cdk8s_plus_27.ConfigMap.add_binary_data"></a>

```python
def add_binary_data(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.key"></a>

- *Type:* `str`

The key.

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.value"></a>

- *Type:* `str`

The value.

---

##### `add_data` <a name="cdk8s_plus_27.ConfigMap.add_data"></a>

```python
def add_data(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.key"></a>

- *Type:* `str`

The key.

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.value"></a>

- *Type:* `str`

The value.

---

##### `add_directory` <a name="cdk8s_plus_27.ConfigMap.add_directory"></a>

```python
def add_directory(
  local_dir: str,
  exclude: typing.List[str] = None,
  key_prefix: str = None
)
```

###### `local_dir`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.local_dir"></a>

- *Type:* `str`

A path to a local directory.

---

###### `exclude`<sup>Optional</sup> <a name="cdk8s_plus_27.AddDirectoryOptions.parameter.exclude"></a>

- *Type:* typing.List[`str`]
- *Default:* include all files

Glob patterns to exclude when adding files.

---

###### `key_prefix`<sup>Optional</sup> <a name="cdk8s_plus_27.AddDirectoryOptions.parameter.key_prefix"></a>

- *Type:* `str`
- *Default:* ""

A prefix to add to all keys in the config map.

---

##### `add_file` <a name="cdk8s_plus_27.ConfigMap.add_file"></a>

```python
def add_file(
  local_file: str,
  key: str = None
)
```

###### `local_file`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.local_file"></a>

- *Type:* `str`

The path to the local file.

---

###### `key`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.key"></a>

- *Type:* `str`

The ConfigMap key (default to the file name).

---

#### Static Functions <a name="Static Functions"></a>

##### `from_config_map_name` <a name="cdk8s_plus_27.ConfigMap.from_config_map_name"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ConfigMap.from_config_map_name(
  scope: Construct,
  id: str,
  name: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.id"></a>

- *Type:* `str`

---

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.parameter.name"></a>

- *Type:* `str`

---

#### Properties <a name="Properties"></a>

##### `binary_data`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.property.binary_data"></a>

```python
binary_data: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

The binary data associated with this config map.

Returns a copy. To add data records, use `addBinaryData()` or `addData()`.

---

##### `data`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.property.data"></a>

```python
data: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

The data associated with this config map.

Returns an copy. To add data records, use `addData()` or `addBinaryData()`.

---

##### `immutable`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.property.immutable"></a>

```python
immutable: bool
```

- *Type:* `bool`

Whether or not this config map is immutable.

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.ConfigMap.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---


### CronJob <a name="cdk8s_plus_27.CronJob"></a>

A CronJob is responsible for creating a Job and scheduling it based on provided cron schedule.

This helps running Jobs in a recurring manner.

#### Initializers <a name="cdk8s_plus_27.CronJob.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.CronJob(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None,
  active_deadline: Duration = None,
  backoff_limit: typing.Union[int, float] = None,
  ttl_after_finished: Duration = None,
  schedule: Cron,
  concurrency_policy: ConcurrencyPolicy = None,
  failed_jobs_retained: typing.Union[int, float] = None,
  starting_deadline: Duration = None,
  successful_jobs_retained: typing.Union[int, float] = None,
  suspend: bool = None,
  time_zone: str = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.CronJob.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.CronJob.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.automount_service_account_token"></a>

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.dns"></a>

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.docker_registry_auth"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.host_aliases"></a>

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.host_network"></a>

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.init_containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.isolate"></a>

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.termination_grace_period"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.pod_metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.select"></a>

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.spread"></a>

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `active_deadline`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.active_deadline"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoff_limit`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.backoff_limit"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttl_after_finished`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.ttl_after_finished"></a>

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

##### `schedule`<sup>Required</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.schedule"></a>

- *Type:* [`cdk8s.Cron`](#cdk8s.Cron)

Specifies the time in which the job would run again.

This is defined as a cron expression in the CronJob resource.

---

##### `concurrency_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.concurrency_policy"></a>

- *Type:* [`cdk8s_plus_27.ConcurrencyPolicy`](#cdk8s_plus_27.ConcurrencyPolicy)
- *Default:* ConcurrencyPolicy.Forbid

Specifies the concurrency policy for the job.

---

##### `failed_jobs_retained`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.failed_jobs_retained"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 1

Specifies the number of failed jobs history retained.

This would retain the Job and the associated Pod resource and can be useful for debugging.

---

##### `starting_deadline`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.starting_deadline"></a>

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

##### `successful_jobs_retained`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.successful_jobs_retained"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Specifies the number of successful jobs history retained.

This would retain the Job and the associated Pod resource and can be useful for debugging.

---

##### `suspend`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.suspend"></a>

- *Type:* `bool`
- *Default:* false

Specifies if the cron job should be suspended.

Only applies to future executions, current ones are remained untouched.

---

##### `time_zone`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.parameter.time_zone"></a>

- *Type:* `str`
- *Default:* Timezone of kube-controller-manager process.

Specifies the timezone for the job.

This helps aligining the schedule to follow the specified timezone.

> {@link https://en.wikipedia.org/wiki/List_of_tz_database_time_zones} for list of valid timezone values.

---



#### Properties <a name="Properties"></a>

##### `concurrency_policy`<sup>Required</sup> <a name="cdk8s_plus_27.CronJob.property.concurrency_policy"></a>

```python
concurrency_policy: str
```

- *Type:* `str`

The policy used by this cron job to determine the concurrency mode in which to schedule jobs.

---

##### `failed_jobs_retained`<sup>Required</sup> <a name="cdk8s_plus_27.CronJob.property.failed_jobs_retained"></a>

```python
failed_jobs_retained: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

The number of failed jobs retained by this cron job.

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.CronJob.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

Represents the resource type.

---

##### `schedule`<sup>Required</sup> <a name="cdk8s_plus_27.CronJob.property.schedule"></a>

```python
schedule: Cron
```

- *Type:* [`cdk8s.Cron`](#cdk8s.Cron)

The schedule this cron job is scheduled to run in.

---

##### `starting_deadline`<sup>Required</sup> <a name="cdk8s_plus_27.CronJob.property.starting_deadline"></a>

```python
starting_deadline: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

The time by which the running cron job needs to schedule the next job execution.

The job is considered as failed if it misses this deadline.

---

##### `successful_jobs_retained`<sup>Required</sup> <a name="cdk8s_plus_27.CronJob.property.successful_jobs_retained"></a>

```python
successful_jobs_retained: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

The number of successful jobs retained by this cron job.

---

##### `suspend`<sup>Required</sup> <a name="cdk8s_plus_27.CronJob.property.suspend"></a>

```python
suspend: bool
```

- *Type:* `bool`

Whether or not the cron job is currently suspended or not.

---

##### `time_zone`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJob.property.time_zone"></a>

```python
time_zone: str
```

- *Type:* `str`

The timezone which this cron job would follow to schedule jobs.

---


### DaemonSet <a name="cdk8s_plus_27.DaemonSet"></a>

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

#### Initializers <a name="cdk8s_plus_27.DaemonSet.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.DaemonSet(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None,
  min_ready_seconds: typing.Union[int, float] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.DaemonSet.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.DaemonSet.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.automount_service_account_token"></a>

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.dns"></a>

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.docker_registry_auth"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.host_aliases"></a>

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.host_network"></a>

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.init_containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.isolate"></a>

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.termination_grace_period"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.pod_metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.select"></a>

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.spread"></a>

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `min_ready_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.parameter.min_ready_seconds"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 0

Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---



#### Properties <a name="Properties"></a>

##### `min_ready_seconds`<sup>Required</sup> <a name="cdk8s_plus_27.DaemonSet.property.min_ready_seconds"></a>

```python
min_ready_seconds: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.DaemonSet.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---


### Deployment <a name="cdk8s_plus_27.Deployment"></a>

- *Implements:* [`cdk8s_plus_27.IScalable`](#cdk8s_plus_27.IScalable)

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

#### Initializers <a name="cdk8s_plus_27.Deployment.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Deployment(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None,
  min_ready: Duration = None,
  progress_deadline: Duration = None,
  replicas: typing.Union[int, float] = None,
  strategy: DeploymentStrategy = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Deployment.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Deployment.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.automount_service_account_token"></a>

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.dns"></a>

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.docker_registry_auth"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.host_aliases"></a>

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.host_network"></a>

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.init_containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.isolate"></a>

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.termination_grace_period"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.pod_metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.select"></a>

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.spread"></a>

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `min_ready`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.min_ready"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(0)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

Zero means the pod will be considered available as soon as it is ready.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds

---

##### `progress_deadline`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.progress_deadline"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(600)

The maximum duration for a deployment to make progress before it is considered to be failed.

The deployment controller will continue
to process failed deployments and a condition with a ProgressDeadlineExceeded
reason will be surfaced in the deployment status.

Note that progress will not be estimated during the time a deployment is paused.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#progress-deadline-seconds

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.replicas"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 2

Number of desired pods.

---

##### `strategy`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.parameter.strategy"></a>

- *Type:* [`cdk8s_plus_27.DeploymentStrategy`](#cdk8s_plus_27.DeploymentStrategy)
- *Default:* RollingUpdate with maxSurge and maxUnavailable set to 25%.

Specifies the strategy used to replace old Pods by new ones.

---

#### Methods <a name="Methods"></a>

##### `expose_via_ingress` <a name="cdk8s_plus_27.Deployment.expose_via_ingress"></a>

```python
def expose_via_ingress(
  path: str,
  name: str = None,
  ports: typing.List[ServicePort] = None,
  service_type: ServiceType = None,
  ingress: Ingress = None,
  path_type: HttpIngressPathType = None
)
```

###### `path`<sup>Required</sup> <a name="cdk8s_plus_27.Deployment.parameter.path"></a>

- *Type:* `str`

The ingress path to register under.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* auto generated.

The name of the service to expose.

If you'd like to expose the deployment multiple times,
you must explicitly set a name starting from the second expose call.

---

###### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ServicePort`](#cdk8s_plus_27.ServicePort)]
- *Default:* extracted from the deployment.

The ports that the service should bind to.

---

###### `service_type`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions.parameter.service_type"></a>

- *Type:* [`cdk8s_plus_27.ServiceType`](#cdk8s_plus_27.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

###### `ingress`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions.parameter.ingress"></a>

- *Type:* [`cdk8s_plus_27.Ingress`](#cdk8s_plus_27.Ingress)
- *Default:* An ingress will be automatically created.

The ingress to add rules to.

---

###### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions.parameter.path_type"></a>

- *Type:* [`cdk8s_plus_27.HttpIngressPathType`](#cdk8s_plus_27.HttpIngressPathType)
- *Default:* HttpIngressPathType.PREFIX

The type of the path.

---

##### `expose_via_service` <a name="cdk8s_plus_27.Deployment.expose_via_service"></a>

```python
def expose_via_service(
  name: str = None,
  ports: typing.List[ServicePort] = None,
  service_type: ServiceType = None
)
```

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentExposeViaServiceOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* auto generated.

The name of the service to expose.

If you'd like to expose the deployment multiple times,
you must explicitly set a name starting from the second expose call.

---

###### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentExposeViaServiceOptions.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ServicePort`](#cdk8s_plus_27.ServicePort)]
- *Default:* extracted from the deployment.

The ports that the service should bind to.

---

###### `service_type`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentExposeViaServiceOptions.parameter.service_type"></a>

- *Type:* [`cdk8s_plus_27.ServiceType`](#cdk8s_plus_27.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

##### `mark_has_autoscaler` <a name="cdk8s_plus_27.Deployment.mark_has_autoscaler"></a>

```python
def mark_has_autoscaler()
```

##### `to_scaling_target` <a name="cdk8s_plus_27.Deployment.to_scaling_target"></a>

```python
def to_scaling_target()
```


#### Properties <a name="Properties"></a>

##### `min_ready`<sup>Required</sup> <a name="cdk8s_plus_27.Deployment.property.min_ready"></a>

```python
min_ready: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---

##### `progress_deadline`<sup>Required</sup> <a name="cdk8s_plus_27.Deployment.property.progress_deadline"></a>

```python
progress_deadline: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

The maximum duration for a deployment to make progress before it is considered to be failed.

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.Deployment.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `strategy`<sup>Required</sup> <a name="cdk8s_plus_27.Deployment.property.strategy"></a>

```python
strategy: DeploymentStrategy
```

- *Type:* [`cdk8s_plus_27.DeploymentStrategy`](#cdk8s_plus_27.DeploymentStrategy)

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_27.Deployment.property.replicas"></a>

```python
replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Number of desired pods.

---

##### `has_autoscaler`<sup>Required</sup> <a name="cdk8s_plus_27.Deployment.property.has_autoscaler"></a>

```python
has_autoscaler: bool
```

- *Type:* `bool`

If this is a target of an autoscaler.

---


### DockerConfigSecret <a name="cdk8s_plus_27.DockerConfigSecret"></a>

Create a secret for storing credentials for accessing a container image registry.

> https://kubernetes.io/docs/concepts/configuration/secret/#docker-config-secrets

#### Initializers <a name="cdk8s_plus_27.DockerConfigSecret.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.DockerConfigSecret(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  data: typing.Mapping[typing.Any]
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.DockerConfigSecret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.DockerConfigSecret.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.DockerConfigSecretProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.DockerConfigSecretProps.parameter.immutable"></a>

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `data`<sup>Required</sup> <a name="cdk8s_plus_27.DockerConfigSecretProps.parameter.data"></a>

- *Type:* typing.Mapping[`typing.Any`]

JSON content to provide for the `~/.docker/config.json` file. This will be stringified and inserted as stringData.

> https://docs.docker.com/engine/reference/commandline/cli/#sample-configuration-file

---





### GCEPersistentDiskPersistentVolume <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolume"></a>

GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

Provisioned by an admin.

> https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

#### Initializers <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolume.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.GCEPersistentDiskPersistentVolume(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  access_modes: typing.List[PersistentVolumeAccessMode] = None,
  claim: IPersistentVolumeClaim = None,
  mount_options: typing.List[str] = None,
  reclaim_policy: PersistentVolumeReclaimPolicy = None,
  storage: Size = None,
  storage_class_name: str = None,
  volume_mode: PersistentVolumeMode = None,
  pd_name: str,
  fs_type: str = None,
  partition: typing.Union[int, float] = None,
  read_only: bool = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolume.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.access_modes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.claim"></a>

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mount_options`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.mount_options"></a>

- *Type:* typing.List[`str`]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaim_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.reclaim_policy"></a>

- *Type:* [`cdk8s_plus_27.PersistentVolumeReclaimPolicy`](#cdk8s_plus_27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.storage"></a>

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.storage_class_name"></a>

- *Type:* `str`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volume_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.volume_mode"></a>

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `pd_name`<sup>Required</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.pd_name"></a>

- *Type:* `str`

Unique name of the PD resource in GCE.

Used to identify the disk in GCE.

> https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

---

##### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.fs_type"></a>

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.partition"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---



#### Properties <a name="Properties"></a>

##### `fs_type`<sup>Required</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolume.property.fs_type"></a>

```python
fs_type: str
```

- *Type:* `str`

File system type of this volume.

---

##### `pd_name`<sup>Required</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolume.property.pd_name"></a>

```python
pd_name: str
```

- *Type:* `str`

PD resource in GCE of this volume.

---

##### `read_only`<sup>Required</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolume.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`

Whether or not it is mounted as a read-only volume.

---

##### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolume.property.partition"></a>

```python
partition: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Partition of this volume.

---


### Group <a name="cdk8s_plus_27.Group"></a>

- *Implements:* [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

Represents a group.

#### Methods <a name="Methods"></a>

##### `to_subject_configuration` <a name="cdk8s_plus_27.Group.to_subject_configuration"></a>

```python
def to_subject_configuration()
```

#### Static Functions <a name="Static Functions"></a>

##### `from_name` <a name="cdk8s_plus_27.Group.from_name"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Group.from_name(
  scope: Construct,
  id: str,
  name: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Group.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Group.parameter.id"></a>

- *Type:* `str`

---

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Group.parameter.name"></a>

- *Type:* `str`

---

#### Properties <a name="Properties"></a>

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.Group.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Group.property.name"></a>

```python
name: str
```

- *Type:* `str`

---

##### `api_group`<sup>Optional</sup> <a name="cdk8s_plus_27.Group.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

---


### HorizontalPodAutoscaler <a name="cdk8s_plus_27.HorizontalPodAutoscaler"></a>

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

#### Initializers <a name="cdk8s_plus_27.HorizontalPodAutoscaler.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.HorizontalPodAutoscaler(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  max_replicas: typing.Union[int, float],
  target: IScalable,
  metrics: typing.List[Metric] = None,
  min_replicas: typing.Union[int, float] = None,
  scale_down: ScalingRules = None,
  scale_up: ScalingRules = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscaler.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscaler.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `max_replicas`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.parameter.max_replicas"></a>

- *Type:* `typing.Union[int, float]`

The maximum number of replicas that can be scaled up to.

---

##### `target`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.IScalable`](#cdk8s_plus_27.IScalable)

The workload to scale up or down.

Scalable workload types:

* Deployment
* StatefulSet

---

##### `metrics`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.parameter.metrics"></a>

- *Type:* typing.List[[`cdk8s_plus_27.Metric`](#cdk8s_plus_27.Metric)]
- *Default:* If metrics are not provided, then the target resource
constraints (e.g. cpu limit) will be used as scaling metrics.

The metric conditions that trigger a scale up or scale down.

---

##### `min_replicas`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.parameter.min_replicas"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 1

The minimum number of replicas that can be scaled down to.

Can be set to 0 if the alpha feature gate `HPAScaleToZero` is enabled and
at least one Object or External metric is configured.

---

##### `scale_down`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.parameter.scale_down"></a>

- *Type:* [`cdk8s_plus_27.ScalingRules`](#cdk8s_plus_27.ScalingRules)
- *Default:* Scale down to minReplica count with a 5 minute stabilization window.

The scaling behavior when scaling down.

---

##### `scale_up`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.parameter.scale_up"></a>

- *Type:* [`cdk8s_plus_27.ScalingRules`](#cdk8s_plus_27.ScalingRules)
- *Default:* Is the higher of:
* Increase no more than 4 pods per 60 seconds
* Double the number of pods per 60 seconds

The scaling behavior when scaling up.

---



#### Properties <a name="Properties"></a>

##### `max_replicas`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscaler.property.max_replicas"></a>

```python
max_replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

The maximum number of replicas that can be scaled up to.

---

##### `min_replicas`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscaler.property.min_replicas"></a>

```python
min_replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

The minimum number of replicas that can be scaled down to.

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscaler.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `scale_down`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscaler.property.scale_down"></a>

```python
scale_down: ScalingRules
```

- *Type:* [`cdk8s_plus_27.ScalingRules`](#cdk8s_plus_27.ScalingRules)

The scaling behavior when scaling down.

---

##### `scale_up`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscaler.property.scale_up"></a>

```python
scale_up: ScalingRules
```

- *Type:* [`cdk8s_plus_27.ScalingRules`](#cdk8s_plus_27.ScalingRules)

The scaling behavior when scaling up.

---

##### `target`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscaler.property.target"></a>

```python
target: IScalable
```

- *Type:* [`cdk8s_plus_27.IScalable`](#cdk8s_plus_27.IScalable)

The workload to scale up or down.

---

##### `metrics`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscaler.property.metrics"></a>

```python
metrics: typing.List[Metric]
```

- *Type:* typing.List[[`cdk8s_plus_27.Metric`](#cdk8s_plus_27.Metric)]

The metric conditions that trigger a scale up or scale down.

---


### Ingress <a name="cdk8s_plus_27.Ingress"></a>

Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend.

An Ingress can be configured to give services
externally-reachable urls, load balance traffic, terminate SSL, offer name
based virtual hosting etc.

#### Initializers <a name="cdk8s_plus_27.Ingress.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Ingress(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  default_backend: IngressBackend = None,
  rules: typing.List[IngressRule] = None,
  tls: typing.List[IngressTls] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `default_backend`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressProps.parameter.default_backend"></a>

- *Type:* [`cdk8s_plus_27.IngressBackend`](#cdk8s_plus_27.IngressBackend)

The default backend services requests that do not match any rule.

Using this option or the `addDefaultBackend()` method is equivalent to
adding a rule with both `path` and `host` undefined.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressProps.parameter.rules"></a>

- *Type:* typing.List[[`cdk8s_plus_27.IngressRule`](#cdk8s_plus_27.IngressRule)]

Routing rules for this ingress.

Each rule must define an `IngressBackend` that will receive the requests
that match this rule. If both `host` and `path` are not specifiec, this
backend will be used as the default backend of the ingress.

You can also add rules later using `addRule()`, `addHostRule()`,
`addDefaultBackend()` and `addHostDefaultBackend()`.

---

##### `tls`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressProps.parameter.tls"></a>

- *Type:* typing.List[[`cdk8s_plus_27.IngressTls`](#cdk8s_plus_27.IngressTls)]

TLS settings for this ingress.

Using this option tells the ingress controller to expose a TLS endpoint.
Currently the Ingress only supports a single TLS port, 443. If multiple
members of this list specify different hosts, they will be multiplexed on
the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI.

---

#### Methods <a name="Methods"></a>

##### `add_default_backend` <a name="cdk8s_plus_27.Ingress.add_default_backend"></a>

```python
def add_default_backend(
  backend: IngressBackend
)
```

###### `backend`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s_plus_27.IngressBackend`](#cdk8s_plus_27.IngressBackend)

The backend to use for requests that do not match any rule.

---

##### `add_host_default_backend` <a name="cdk8s_plus_27.Ingress.add_host_default_backend"></a>

```python
def add_host_default_backend(
  host: str,
  backend: IngressBackend
)
```

###### `host`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.host"></a>

- *Type:* `str`

The host name to match.

---

###### `backend`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s_plus_27.IngressBackend`](#cdk8s_plus_27.IngressBackend)

The backend to route to.

---

##### `add_host_rule` <a name="cdk8s_plus_27.Ingress.add_host_rule"></a>

```python
def add_host_rule(
  host: str,
  path: str,
  backend: IngressBackend,
  path_type: HttpIngressPathType = None
)
```

###### `host`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.host"></a>

- *Type:* `str`

The host name.

---

###### `path`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.path"></a>

- *Type:* `str`

The HTTP path.

---

###### `backend`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s_plus_27.IngressBackend`](#cdk8s_plus_27.IngressBackend)

The backend to route requests to.

---

###### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_27.Ingress.parameter.path_type"></a>

- *Type:* [`cdk8s_plus_27.HttpIngressPathType`](#cdk8s_plus_27.HttpIngressPathType)

How the path is matched against request paths.

---

##### `add_rule` <a name="cdk8s_plus_27.Ingress.add_rule"></a>

```python
def add_rule(
  path: str,
  backend: IngressBackend,
  path_type: HttpIngressPathType = None
)
```

###### `path`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.path"></a>

- *Type:* `str`

The HTTP path.

---

###### `backend`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.backend"></a>

- *Type:* [`cdk8s_plus_27.IngressBackend`](#cdk8s_plus_27.IngressBackend)

The backend to route requests to.

---

###### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_27.Ingress.parameter.path_type"></a>

- *Type:* [`cdk8s_plus_27.HttpIngressPathType`](#cdk8s_plus_27.HttpIngressPathType)

How the path is matched against request paths.

---

##### `add_rules` <a name="cdk8s_plus_27.Ingress.add_rules"></a>

```python
def add_rules(
  backend: IngressBackend,
  host: str = None,
  path: str = None,
  path_type: HttpIngressPathType = None
)
```

###### `backend`<sup>Required</sup> <a name="cdk8s_plus_27.IngressRule.parameter.backend"></a>

- *Type:* [`cdk8s_plus_27.IngressBackend`](#cdk8s_plus_27.IngressBackend)

Backend defines the referenced service endpoint to which the traffic will be forwarded to.

---

###### `host`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressRule.parameter.host"></a>

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

###### `path`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressRule.parameter.path"></a>

- *Type:* `str`
- *Default:* If unspecified, the path defaults to a catch all sending traffic
to the backend.

Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'.

---

###### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressRule.parameter.path_type"></a>

- *Type:* [`cdk8s_plus_27.HttpIngressPathType`](#cdk8s_plus_27.HttpIngressPathType)

Specify how the path is matched against request paths.

By default, path
types will be matched by prefix.

> https://kubernetes.io/docs/concepts/services-networking/ingress/#path-types

---

##### `add_tls` <a name="cdk8s_plus_27.Ingress.add_tls"></a>

```python
def add_tls(
  tls: typing.List[IngressTls]
)
```

###### `tls`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.parameter.tls"></a>

- *Type:* typing.List[[`cdk8s_plus_27.IngressTls`](#cdk8s_plus_27.IngressTls)]

---


#### Properties <a name="Properties"></a>

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.Ingress.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---


### Job <a name="cdk8s_plus_27.Job"></a>

A Job creates one or more Pods and ensures that a specified number of them successfully terminate.

As pods successfully complete,
the Job tracks the successful completions. When a specified number of successful completions is reached, the task (ie, Job) is complete.
Deleting a Job will clean up the Pods it created. A simple case is to create one Job object in order to reliably run one Pod to completion.
The Job object will start a new Pod if the first Pod fails or is deleted (for example due to a node hardware failure or a node reboot).
You can also use a Job to run multiple Pods in parallel.

#### Initializers <a name="cdk8s_plus_27.Job.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Job(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None,
  active_deadline: Duration = None,
  backoff_limit: typing.Union[int, float] = None,
  ttl_after_finished: Duration = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Job.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Job.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.automount_service_account_token"></a>

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.dns"></a>

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.docker_registry_auth"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.host_aliases"></a>

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.host_network"></a>

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.init_containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.isolate"></a>

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.termination_grace_period"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.pod_metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.select"></a>

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.spread"></a>

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `active_deadline`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.active_deadline"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoff_limit`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.backoff_limit"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttl_after_finished`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.parameter.ttl_after_finished"></a>

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



#### Properties <a name="Properties"></a>

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.Job.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `active_deadline`<sup>Optional</sup> <a name="cdk8s_plus_27.Job.property.active_deadline"></a>

```python
active_deadline: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

Duration before job is terminated.

If undefined, there is no deadline.

---

##### `backoff_limit`<sup>Optional</sup> <a name="cdk8s_plus_27.Job.property.backoff_limit"></a>

```python
backoff_limit: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Number of retries before marking failed.

---

##### `ttl_after_finished`<sup>Optional</sup> <a name="cdk8s_plus_27.Job.property.ttl_after_finished"></a>

```python
ttl_after_finished: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

TTL before the job is deleted after it is finished.

---


### Namespace <a name="cdk8s_plus_27.Namespace"></a>

- *Implements:* [`cdk8s_plus_27.INamespaceSelector`](#cdk8s_plus_27.INamespaceSelector), [`cdk8s_plus_27.INetworkPolicyPeer`](#cdk8s_plus_27.INetworkPolicyPeer)

In Kubernetes, namespaces provides a mechanism for isolating groups of resources within a single cluster.

Names of resources need to be unique within a namespace, but not across namespaces.
Namespace-based scoping is applicable only for namespaced objects (e.g. Deployments, Services, etc) and
not for cluster-wide objects (e.g. StorageClass, Nodes, PersistentVolumes, etc).

#### Initializers <a name="cdk8s_plus_27.Namespace.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Namespace(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Namespace.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Namespace.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.NamespaceProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

#### Methods <a name="Methods"></a>

##### `to_namespace_selector_config` <a name="cdk8s_plus_27.Namespace.to_namespace_selector_config"></a>

```python
def to_namespace_selector_config()
```

##### `to_network_policy_peer_config` <a name="cdk8s_plus_27.Namespace.to_network_policy_peer_config"></a>

```python
def to_network_policy_peer_config()
```

##### `to_pod_selector` <a name="cdk8s_plus_27.Namespace.to_pod_selector"></a>

```python
def to_pod_selector()
```


#### Properties <a name="Properties"></a>

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.Namespace.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

#### Constants <a name="Constants"></a>

##### `NAME_LABEL` <a name="cdk8s_plus_27.Namespace.property.NAME_LABEL"></a>

- *Type:* `str`

> https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/#automatic-labelling

---

### Namespaces <a name="cdk8s_plus_27.Namespaces"></a>

- *Implements:* [`cdk8s_plus_27.INamespaceSelector`](#cdk8s_plus_27.INamespaceSelector), [`cdk8s_plus_27.INetworkPolicyPeer`](#cdk8s_plus_27.INetworkPolicyPeer)

Represents a group of namespaces.

#### Initializers <a name="cdk8s_plus_27.Namespaces.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Namespaces(
  scope: Construct,
  id: str,
  expressions: typing.List[LabelExpression] = None,
  names: typing.List[str] = None,
  labels: typing.Mapping[str] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Namespaces.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Namespaces.parameter.id"></a>

- *Type:* `str`

---

##### `expressions`<sup>Optional</sup> <a name="cdk8s_plus_27.Namespaces.parameter.expressions"></a>

- *Type:* typing.List[[`cdk8s_plus_27.LabelExpression`](#cdk8s_plus_27.LabelExpression)]

---

##### `names`<sup>Optional</sup> <a name="cdk8s_plus_27.Namespaces.parameter.names"></a>

- *Type:* typing.List[`str`]

---

##### `labels`<sup>Optional</sup> <a name="cdk8s_plus_27.Namespaces.parameter.labels"></a>

- *Type:* typing.Mapping[`str`]

---

#### Methods <a name="Methods"></a>

##### `to_namespace_selector_config` <a name="cdk8s_plus_27.Namespaces.to_namespace_selector_config"></a>

```python
def to_namespace_selector_config()
```

##### `to_network_policy_peer_config` <a name="cdk8s_plus_27.Namespaces.to_network_policy_peer_config"></a>

```python
def to_network_policy_peer_config()
```

##### `to_pod_selector` <a name="cdk8s_plus_27.Namespaces.to_pod_selector"></a>

```python
def to_pod_selector()
```

#### Static Functions <a name="Static Functions"></a>

##### `all` <a name="cdk8s_plus_27.Namespaces.all"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Namespaces.all(
  scope: Construct,
  id: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Namespaces.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Namespaces.parameter.id"></a>

- *Type:* `str`

---

##### `select` <a name="cdk8s_plus_27.Namespaces.select"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Namespaces.select(
  scope: Construct,
  id: str,
  expressions: typing.List[LabelExpression] = None,
  labels: typing.Mapping[str] = None,
  names: typing.List[str] = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Namespaces.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Namespaces.parameter.id"></a>

- *Type:* `str`

---

###### `expressions`<sup>Optional</sup> <a name="cdk8s_plus_27.NamespacesSelectOptions.parameter.expressions"></a>

- *Type:* typing.List[[`cdk8s_plus_27.LabelExpression`](#cdk8s_plus_27.LabelExpression)]
- *Default:* no selector requirements.

Namespaces must satisfy these selectors.

The selectors query labels, just like the `labels` property, but they
provide a more advanced matching mechanism.

---

###### `labels`<sup>Optional</sup> <a name="cdk8s_plus_27.NamespacesSelectOptions.parameter.labels"></a>

- *Type:* typing.Mapping[`str`]
- *Default:* no strict labels requirements.

Labels the namespaces must have.

This is equivalent to using an 'Is' selector.

---

###### `names`<sup>Optional</sup> <a name="cdk8s_plus_27.NamespacesSelectOptions.parameter.names"></a>

- *Type:* typing.List[`str`]
- *Default:* no name requirements.

Namespaces names must be one of these.

---



### NetworkPolicy <a name="cdk8s_plus_27.NetworkPolicy"></a>

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

#### Initializers <a name="cdk8s_plus_27.NetworkPolicy.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicy(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  egress: NetworkPolicyTraffic = None,
  ingress: NetworkPolicyTraffic = None,
  selector: IPodSelector = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicy.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicy.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `egress`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyProps.parameter.egress"></a>

- *Type:* [`cdk8s_plus_27.NetworkPolicyTraffic`](#cdk8s_plus_27.NetworkPolicyTraffic)
- *Default:* the policy doesn't change egress behavior of the pods it selects.

Egress traffic configuration.

---

##### `ingress`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyProps.parameter.ingress"></a>

- *Type:* [`cdk8s_plus_27.NetworkPolicyTraffic`](#cdk8s_plus_27.NetworkPolicyTraffic)
- *Default:* the policy doesn't change ingress behavior of the pods it selects.

Ingress traffic configuration.

---

##### `selector`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyProps.parameter.selector"></a>

- *Type:* [`cdk8s_plus_27.IPodSelector`](#cdk8s_plus_27.IPodSelector)
- *Default:* will select all pods in the namespace of the policy.

Which pods does this policy object applies to.

This can either be a single pod / workload, or a grouping of pods selected
via the `Pods.select` function. Rules is applied to any pods selected by this property.
Multiple network policies can select the same set of pods.
In this case, the rules for each are combined additively.

Note that

---

#### Methods <a name="Methods"></a>

##### `add_egress_rule` <a name="cdk8s_plus_27.NetworkPolicy.add_egress_rule"></a>

```python
def add_egress_rule(
  peer: INetworkPolicyPeer,
  ports: typing.List[NetworkPolicyPort] = None
)
```

###### `peer`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicy.parameter.peer"></a>

- *Type:* [`cdk8s_plus_27.INetworkPolicyPeer`](#cdk8s_plus_27.INetworkPolicyPeer)

---

###### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicy.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_27.NetworkPolicyPort`](#cdk8s_plus_27.NetworkPolicyPort)]

---

##### `add_ingress_rule` <a name="cdk8s_plus_27.NetworkPolicy.add_ingress_rule"></a>

```python
def add_ingress_rule(
  peer: INetworkPolicyPeer,
  ports: typing.List[NetworkPolicyPort] = None
)
```

###### `peer`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicy.parameter.peer"></a>

- *Type:* [`cdk8s_plus_27.INetworkPolicyPeer`](#cdk8s_plus_27.INetworkPolicyPeer)

---

###### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicy.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_27.NetworkPolicyPort`](#cdk8s_plus_27.NetworkPolicyPort)]

---


#### Properties <a name="Properties"></a>

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicy.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---


### NetworkPolicyIpBlock <a name="cdk8s_plus_27.NetworkPolicyIpBlock"></a>

- *Implements:* [`cdk8s_plus_27.INetworkPolicyPeer`](#cdk8s_plus_27.INetworkPolicyPeer)

Describes a particular CIDR (Ex.

"192.168.1.1/24","2001:db9::/64") that is
allowed to the pods matched by a network policy selector.
The except entry describes CIDRs that should not be included within this rule.

#### Methods <a name="Methods"></a>

##### `to_network_policy_peer_config` <a name="cdk8s_plus_27.NetworkPolicyIpBlock.to_network_policy_peer_config"></a>

```python
def to_network_policy_peer_config()
```

##### `to_pod_selector` <a name="cdk8s_plus_27.NetworkPolicyIpBlock.to_pod_selector"></a>

```python
def to_pod_selector()
```

#### Static Functions <a name="Static Functions"></a>

##### `any_ipv4` <a name="cdk8s_plus_27.NetworkPolicyIpBlock.any_ipv4"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyIpBlock.any_ipv4(
  scope: Construct,
  id: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `str`

---

##### `any_ipv6` <a name="cdk8s_plus_27.NetworkPolicyIpBlock.any_ipv6"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyIpBlock.any_ipv6(
  scope: Construct,
  id: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `str`

---

##### `ipv4` <a name="cdk8s_plus_27.NetworkPolicyIpBlock.ipv4"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyIpBlock.ipv4(
  scope: Construct,
  id: str,
  cidr_ip: str,
  except: typing.List[str] = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `str`

---

###### `cidr_ip`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.cidr_ip"></a>

- *Type:* `str`

---

###### `except`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.except"></a>

- *Type:* typing.List[`str`]

---

##### `ipv6` <a name="cdk8s_plus_27.NetworkPolicyIpBlock.ipv6"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyIpBlock.ipv6(
  scope: Construct,
  id: str,
  cidr_ip: str,
  except: typing.List[str] = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.id"></a>

- *Type:* `str`

---

###### `cidr_ip`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.cidr_ip"></a>

- *Type:* `str`

---

###### `except`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.parameter.except"></a>

- *Type:* typing.List[`str`]

---

#### Properties <a name="Properties"></a>

##### `cidr`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.property.cidr"></a>

```python
cidr: str
```

- *Type:* `str`

A string representing the IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64".

---

##### `except`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyIpBlock.property.except"></a>

```python
except: typing.List[str]
```

- *Type:* typing.List[`str`]

A slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64". Except values will be rejected if they are outside the CIDR range.

---


### PersistentVolume <a name="cdk8s_plus_27.PersistentVolume"></a>

- *Implements:* [`cdk8s_plus_27.IPersistentVolume`](#cdk8s_plus_27.IPersistentVolume), [`cdk8s_plus_27.IStorage`](#cdk8s_plus_27.IStorage)

A PersistentVolume (PV) is a piece of storage in the cluster that has been provisioned by an administrator or dynamically provisioned using Storage Classes.

It is a resource in the cluster just like a node is a cluster resource.
PVs are volume plugins like Volumes, but have a lifecycle independent of any
individual Pod that uses the PV. This API object captures the details of the
implementation of the storage, be that NFS, iSCSI, or a
cloud-provider-specific storage system.

#### Initializers <a name="cdk8s_plus_27.PersistentVolume.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PersistentVolume(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  access_modes: typing.List[PersistentVolumeAccessMode] = None,
  claim: IPersistentVolumeClaim = None,
  mount_options: typing.List[str] = None,
  reclaim_policy: PersistentVolumeReclaimPolicy = None,
  storage: Size = None,
  storage_class_name: str = None,
  volume_mode: PersistentVolumeMode = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolume.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.parameter.access_modes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.parameter.claim"></a>

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mount_options`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.parameter.mount_options"></a>

- *Type:* typing.List[`str`]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaim_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.parameter.reclaim_policy"></a>

- *Type:* [`cdk8s_plus_27.PersistentVolumeReclaimPolicy`](#cdk8s_plus_27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.parameter.storage"></a>

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.parameter.storage_class_name"></a>

- *Type:* `str`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volume_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.parameter.volume_mode"></a>

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

#### Methods <a name="Methods"></a>

##### `as_volume` <a name="cdk8s_plus_27.PersistentVolume.as_volume"></a>

```python
def as_volume()
```

##### `bind` <a name="cdk8s_plus_27.PersistentVolume.bind"></a>

```python
def bind(
  claim: IPersistentVolumeClaim
)
```

###### `claim`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolume.parameter.claim"></a>

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)

The PVC to bind to.

---

##### `reserve` <a name="cdk8s_plus_27.PersistentVolume.reserve"></a>

```python
def reserve()
```

#### Static Functions <a name="Static Functions"></a>

##### `from_persistent_volume_name` <a name="cdk8s_plus_27.PersistentVolume.from_persistent_volume_name"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PersistentVolume.from_persistent_volume_name(
  scope: Construct,
  id: str,
  volume_name: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolume.parameter.id"></a>

- *Type:* `str`

---

###### `volume_name`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolume.parameter.volume_name"></a>

- *Type:* `str`

---

#### Properties <a name="Properties"></a>

##### `mode`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolume.property.mode"></a>

```python
mode: PersistentVolumeMode
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)

Volume mode of this volume.

---

##### `reclaim_policy`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolume.property.reclaim_policy"></a>

```python
reclaim_policy: PersistentVolumeReclaimPolicy
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeReclaimPolicy`](#cdk8s_plus_27.PersistentVolumeReclaimPolicy)

Reclaim policy of this volume.

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolume.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolume.property.access_modes"></a>

```python
access_modes: typing.List[PersistentVolumeAccessMode]
```

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]

Access modes requirement of this claim.

---

##### `claim`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolume.property.claim"></a>

```python
claim: IPersistentVolumeClaim
```

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)

PVC this volume is bound to.

Undefined means this volume is not yet
claimed by any PVC.

---

##### `mount_options`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolume.property.mount_options"></a>

```python
mount_options: typing.List[str]
```

- *Type:* typing.List[`str`]

Mount options of this volume.

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolume.property.storage"></a>

```python
storage: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

Storage size of this volume.

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolume.property.storage_class_name"></a>

```python
storage_class_name: str
```

- *Type:* `str`

Storage class this volume belongs to.

---


### PersistentVolumeClaim <a name="cdk8s_plus_27.PersistentVolumeClaim"></a>

- *Implements:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)

A PersistentVolumeClaim (PVC) is a request for storage by a user.

It is similar to a Pod. Pods consume node resources and PVCs consume PV resources.
Pods can request specific levels of resources (CPU and Memory).
Claims can request specific size and access modes

#### Initializers <a name="cdk8s_plus_27.PersistentVolumeClaim.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PersistentVolumeClaim(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  access_modes: typing.List[PersistentVolumeAccessMode] = None,
  storage: Size = None,
  storage_class_name: str = None,
  volume: IPersistentVolume = None,
  volume_mode: PersistentVolumeMode = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.parameter.access_modes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]
- *Default:* No access modes requirement.

Contains the access modes the volume should support.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.parameter.storage"></a>

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No storage requirement.

Minimum storage size the volume should have.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.parameter.storage_class_name"></a>

- *Type:* `str`
- *Default:* Not set.

Name of the StorageClass required by the claim. When this property is not set, the behavior is as follows:.

* If the admission plugin is turned on, the storage class marked as default will be used.
* If the admission plugin is turned off, the pvc can only be bound to volumes without a storage class.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1

---

##### `volume`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.parameter.volume"></a>

- *Type:* [`cdk8s_plus_27.IPersistentVolume`](#cdk8s_plus_27.IPersistentVolume)
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

##### `volume_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.parameter.volume_mode"></a>

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

#### Methods <a name="Methods"></a>

##### `bind` <a name="cdk8s_plus_27.PersistentVolumeClaim.bind"></a>

```python
def bind(
  vol: IPersistentVolume
)
```

###### `vol`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.parameter.vol"></a>

- *Type:* [`cdk8s_plus_27.IPersistentVolume`](#cdk8s_plus_27.IPersistentVolume)

The PV to bind to.

---

#### Static Functions <a name="Static Functions"></a>

##### `from_claim_name` <a name="cdk8s_plus_27.PersistentVolumeClaim.from_claim_name"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PersistentVolumeClaim.from_claim_name(
  scope: Construct,
  id: str,
  claim_name: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.parameter.id"></a>

- *Type:* `str`

---

###### `claim_name`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.parameter.claim_name"></a>

- *Type:* `str`

---

#### Properties <a name="Properties"></a>

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `volume_mode`<sup>Required</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.property.volume_mode"></a>

```python
volume_mode: PersistentVolumeMode
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)

Volume mode requirement of this claim.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.property.access_modes"></a>

```python
access_modes: typing.List[PersistentVolumeAccessMode]
```

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]

Access modes requirement of this claim.

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.property.storage"></a>

```python
storage: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

Storage requirement of this claim.

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.property.storage_class_name"></a>

```python
storage_class_name: str
```

- *Type:* `str`

Storage class requirment of this claim.

---

##### `volume`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaim.property.volume"></a>

```python
volume: IPersistentVolume
```

- *Type:* [`cdk8s_plus_27.IPersistentVolume`](#cdk8s_plus_27.IPersistentVolume)

PV this claim is bound to.

Undefined means the claim is not bound
to any specific volume.

---


### Pod <a name="cdk8s_plus_27.Pod"></a>

Pod is a collection of containers that can run on a host.

This resource is
created by clients and scheduled onto hosts.

#### Initializers <a name="cdk8s_plus_27.Pod.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Pod(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Pod.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Pod.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.automount_service_account_token"></a>

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.dns"></a>

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.docker_registry_auth"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.host_aliases"></a>

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.host_network"></a>

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.init_containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.isolate"></a>

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.termination_grace_period"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---



#### Properties <a name="Properties"></a>

##### `connections`<sup>Required</sup> <a name="cdk8s_plus_27.Pod.property.connections"></a>

```python
connections: PodConnections
```

- *Type:* [`cdk8s_plus_27.PodConnections`](#cdk8s_plus_27.PodConnections)

---

##### `pod_metadata`<sup>Required</sup> <a name="cdk8s_plus_27.Pod.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadataDefinition
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.Pod.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `scheduling`<sup>Required</sup> <a name="cdk8s_plus_27.Pod.property.scheduling"></a>

```python
scheduling: PodScheduling
```

- *Type:* [`cdk8s_plus_27.PodScheduling`](#cdk8s_plus_27.PodScheduling)

---

#### Constants <a name="Constants"></a>

##### `ADDRESS_LABEL` <a name="cdk8s_plus_27.Pod.property.ADDRESS_LABEL"></a>

- *Type:* `str`

This label is autoamtically added by cdk8s to any pod.

It provides
a unique and stable identifier for the pod.

---

### Pods <a name="cdk8s_plus_27.Pods"></a>

- *Implements:* [`cdk8s_plus_27.IPodSelector`](#cdk8s_plus_27.IPodSelector)

Represents a group of pods.

#### Initializers <a name="cdk8s_plus_27.Pods.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Pods(
  scope: Construct,
  id: str,
  expressions: typing.List[LabelExpression] = None,
  labels: typing.Mapping[str] = None,
  namespaces: INamespaceSelector = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Pods.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Pods.parameter.id"></a>

- *Type:* `str`

---

##### `expressions`<sup>Optional</sup> <a name="cdk8s_plus_27.Pods.parameter.expressions"></a>

- *Type:* typing.List[[`cdk8s_plus_27.LabelExpression`](#cdk8s_plus_27.LabelExpression)]

---

##### `labels`<sup>Optional</sup> <a name="cdk8s_plus_27.Pods.parameter.labels"></a>

- *Type:* typing.Mapping[`str`]

---

##### `namespaces`<sup>Optional</sup> <a name="cdk8s_plus_27.Pods.parameter.namespaces"></a>

- *Type:* [`cdk8s_plus_27.INamespaceSelector`](#cdk8s_plus_27.INamespaceSelector)

---

#### Methods <a name="Methods"></a>

##### `to_network_policy_peer_config` <a name="cdk8s_plus_27.Pods.to_network_policy_peer_config"></a>

```python
def to_network_policy_peer_config()
```

##### `to_pod_selector` <a name="cdk8s_plus_27.Pods.to_pod_selector"></a>

```python
def to_pod_selector()
```

##### `to_pod_selector_config` <a name="cdk8s_plus_27.Pods.to_pod_selector_config"></a>

```python
def to_pod_selector_config()
```

#### Static Functions <a name="Static Functions"></a>

##### `all` <a name="cdk8s_plus_27.Pods.all"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Pods.all(
  scope: Construct,
  id: str,
  namespaces: Namespaces = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Pods.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Pods.parameter.id"></a>

- *Type:* `str`

---

###### `namespaces`<sup>Optional</sup> <a name="cdk8s_plus_27.PodsAllOptions.parameter.namespaces"></a>

- *Type:* [`cdk8s_plus_27.Namespaces`](#cdk8s_plus_27.Namespaces)
- *Default:* unset, implies the namespace of the resource this selection is used in.

Namespaces the pods are allowed to be in.

Use `Namespaces.all()` to allow all namespaces.

---

##### `select` <a name="cdk8s_plus_27.Pods.select"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Pods.select(
  scope: Construct,
  id: str,
  expressions: typing.List[LabelExpression] = None,
  labels: typing.Mapping[str] = None,
  namespaces: Namespaces = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Pods.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Pods.parameter.id"></a>

- *Type:* `str`

---

###### `expressions`<sup>Optional</sup> <a name="cdk8s_plus_27.PodsSelectOptions.parameter.expressions"></a>

- *Type:* typing.List[[`cdk8s_plus_27.LabelExpression`](#cdk8s_plus_27.LabelExpression)]
- *Default:* no expressions requirements.

Expressions the pods must satisify.

---

###### `labels`<sup>Optional</sup> <a name="cdk8s_plus_27.PodsSelectOptions.parameter.labels"></a>

- *Type:* typing.Mapping[`str`]
- *Default:* no strict labels requirements.

Labels the pods must have.

---

###### `namespaces`<sup>Optional</sup> <a name="cdk8s_plus_27.PodsSelectOptions.parameter.namespaces"></a>

- *Type:* [`cdk8s_plus_27.Namespaces`](#cdk8s_plus_27.Namespaces)
- *Default:* unset, implies the namespace of the resource this selection is used in.

Namespaces the pods are allowed to be in.

Use `Namespaces.all()` to allow all namespaces.

---



### Resource <a name="cdk8s_plus_27.Resource"></a>

- *Implements:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource), [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource), [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

Base class for all Kubernetes objects in stdk8s.

Represents a single
resource.

#### Initializers <a name="cdk8s_plus_27.Resource.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Resource(
  scope: Construct,
  id: str
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Resource.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Resource.parameter.id"></a>

- *Type:* `str`

---

#### Methods <a name="Methods"></a>

##### `as_api_resource` <a name="cdk8s_plus_27.Resource.as_api_resource"></a>

```python
def as_api_resource()
```

##### `as_non_api_resource` <a name="cdk8s_plus_27.Resource.as_non_api_resource"></a>

```python
def as_non_api_resource()
```


#### Properties <a name="Properties"></a>

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.Resource.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. "authorization.k8s.io").

---

##### `api_version`<sup>Required</sup> <a name="cdk8s_plus_27.Resource.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.Resource.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

The object kind (e.g. "Deployment").

---

##### `metadata`<sup>Required</sup> <a name="cdk8s_plus_27.Resource.property.metadata"></a>

```python
metadata: ApiObjectMetadataDefinition
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Resource.property.name"></a>

```python
name: str
```

- *Type:* `str`

The name of this API object.

---

##### `permissions`<sup>Required</sup> <a name="cdk8s_plus_27.Resource.property.permissions"></a>

```python
permissions: ResourcePermissions
```

- *Type:* [`cdk8s_plus_27.ResourcePermissions`](#cdk8s_plus_27.ResourcePermissions)

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.Resource.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `resource_name`<sup>Optional</sup> <a name="cdk8s_plus_27.Resource.property.resource_name"></a>

```python
resource_name: str
```

- *Type:* `str`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---


### Role <a name="cdk8s_plus_27.Role"></a>

- *Implements:* [`cdk8s_plus_27.IRole`](#cdk8s_plus_27.IRole)

Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.

#### Initializers <a name="cdk8s_plus_27.Role.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Role(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  rules: typing.List[RolePolicyRule] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.RoleProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s_plus_27.RoleProps.parameter.rules"></a>

- *Type:* typing.List[[`cdk8s_plus_27.RolePolicyRule`](#cdk8s_plus_27.RolePolicyRule)]
- *Default:* []

A list of rules the role should allow.

---

#### Methods <a name="Methods"></a>

##### `allow` <a name="cdk8s_plus_27.Role.allow"></a>

```python
def allow(
  verbs: typing.List[str],
  resources: IApiResource
)
```

###### `verbs`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.verbs"></a>

- *Type:* typing.List[`str`]

---

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `allow_create` <a name="cdk8s_plus_27.Role.allow_create"></a>

```python
def allow_create(
  resources: IApiResource
)
```

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `allow_delete` <a name="cdk8s_plus_27.Role.allow_delete"></a>

```python
def allow_delete(
  resources: IApiResource
)
```

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `allow_delete_collection` <a name="cdk8s_plus_27.Role.allow_delete_collection"></a>

```python
def allow_delete_collection(
  resources: IApiResource
)
```

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `allow_get` <a name="cdk8s_plus_27.Role.allow_get"></a>

```python
def allow_get(
  resources: IApiResource
)
```

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `allow_list` <a name="cdk8s_plus_27.Role.allow_list"></a>

```python
def allow_list(
  resources: IApiResource
)
```

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `allow_patch` <a name="cdk8s_plus_27.Role.allow_patch"></a>

```python
def allow_patch(
  resources: IApiResource
)
```

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `allow_read` <a name="cdk8s_plus_27.Role.allow_read"></a>

```python
def allow_read(
  resources: IApiResource
)
```

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `allow_read_write` <a name="cdk8s_plus_27.Role.allow_read_write"></a>

```python
def allow_read_write(
  resources: IApiResource
)
```

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `allow_update` <a name="cdk8s_plus_27.Role.allow_update"></a>

```python
def allow_update(
  resources: IApiResource
)
```

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `allow_watch` <a name="cdk8s_plus_27.Role.allow_watch"></a>

```python
def allow_watch(
  resources: IApiResource
)
```

###### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

The resource(s) to apply to.

---

##### `bind` <a name="cdk8s_plus_27.Role.bind"></a>

```python
def bind(
  subjects: ISubject
)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.subjects"></a>

- *Type:* [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

a list of subjects to bind to.

---

#### Static Functions <a name="Static Functions"></a>

##### `from_role_name` <a name="cdk8s_plus_27.Role.from_role_name"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Role.from_role_name(
  scope: Construct,
  id: str,
  name: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.id"></a>

- *Type:* `str`

---

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Role.parameter.name"></a>

- *Type:* `str`

---

#### Properties <a name="Properties"></a>

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.Role.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `rules`<sup>Required</sup> <a name="cdk8s_plus_27.Role.property.rules"></a>

```python
rules: typing.List[RolePolicyRule]
```

- *Type:* typing.List[[`cdk8s_plus_27.RolePolicyRule`](#cdk8s_plus_27.RolePolicyRule)]

Rules associaated with this Role.

Returns a copy, use `allow` to add rules.

---


### RoleBinding <a name="cdk8s_plus_27.RoleBinding"></a>

A RoleBinding grants permissions within a specific namespace to a user or set of users.

#### Initializers <a name="cdk8s_plus_27.RoleBinding.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.RoleBinding(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  role: IRole
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.RoleBinding.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.RoleBinding.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.RoleBindingProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `role`<sup>Required</sup> <a name="cdk8s_plus_27.RoleBindingProps.parameter.role"></a>

- *Type:* [`cdk8s_plus_27.IRole`](#cdk8s_plus_27.IRole)

The role to bind to.

A RoleBinding can reference a Role or a ClusterRole.

---

#### Methods <a name="Methods"></a>

##### `add_subjects` <a name="cdk8s_plus_27.RoleBinding.add_subjects"></a>

```python
def add_subjects(
  subjects: ISubject
)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s_plus_27.RoleBinding.parameter.subjects"></a>

- *Type:* [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

The subjects to add.

---


#### Properties <a name="Properties"></a>

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.RoleBinding.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `role`<sup>Required</sup> <a name="cdk8s_plus_27.RoleBinding.property.role"></a>

```python
role: IRole
```

- *Type:* [`cdk8s_plus_27.IRole`](#cdk8s_plus_27.IRole)

---

##### `subjects`<sup>Required</sup> <a name="cdk8s_plus_27.RoleBinding.property.subjects"></a>

```python
subjects: typing.List[ISubject]
```

- *Type:* typing.List[[`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)]

---


### Secret <a name="cdk8s_plus_27.Secret"></a>

- *Implements:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)

Kubernetes Secrets let you store and manage sensitive information, such as passwords, OAuth tokens, and ssh keys.

Storing confidential information in a
Secret is safer and more flexible than putting it verbatim in a Pod
definition or in a container image.

> https://kubernetes.io/docs/concepts/configuration/secret

#### Initializers <a name="cdk8s_plus_27.Secret.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Secret(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  string_data: typing.Mapping[str] = None,
  type: str = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretProps.parameter.immutable"></a>

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `string_data`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretProps.parameter.string_data"></a>

- *Type:* typing.Mapping[`str`]

stringData allows specifying non-binary secret data in string form.

It is
provided as a write-only convenience method. All keys and values are merged
into the data field on write, overwriting any existing values. It is never
output when reading from the API.

---

##### `type`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretProps.parameter.type"></a>

- *Type:* `str`
- *Default:* undefined - Don't set a type.

Optional type associated with the secret.

Used to facilitate programmatic
handling of secret data by various controllers.

---

#### Methods <a name="Methods"></a>

##### `add_string_data` <a name="cdk8s_plus_27.Secret.add_string_data"></a>

```python
def add_string_data(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.parameter.key"></a>

- *Type:* `str`

Key.

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.parameter.value"></a>

- *Type:* `str`

Value.

---

##### `env_value` <a name="cdk8s_plus_27.Secret.env_value"></a>

```python
def env_value(
  key: str,
  optional: bool = None
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.parameter.key"></a>

- *Type:* `str`

---

###### `optional`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromSecretOptions.parameter.optional"></a>

- *Type:* `bool`
- *Default:* false

Specify whether the Secret or its key must be defined.

---

##### `get_string_data` <a name="cdk8s_plus_27.Secret.get_string_data"></a>

```python
def get_string_data(
  key: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.parameter.key"></a>

- *Type:* `str`

Key.

---

#### Static Functions <a name="Static Functions"></a>

##### `from_secret_name` <a name="cdk8s_plus_27.Secret.from_secret_name"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Secret.from_secret_name(
  scope: Construct,
  id: str,
  name: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.parameter.id"></a>

- *Type:* `str`

---

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.parameter.name"></a>

- *Type:* `str`

---

#### Properties <a name="Properties"></a>

##### `immutable`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.property.immutable"></a>

```python
immutable: bool
```

- *Type:* `bool`

Whether or not the secret is immutable.

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.Secret.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---


### Service <a name="cdk8s_plus_27.Service"></a>

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

#### Initializers <a name="cdk8s_plus_27.Service.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Service(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  cluster_i_p: str = None,
  external_i_ps: typing.List[str] = None,
  external_name: str = None,
  load_balancer_source_ranges: typing.List[str] = None,
  ports: typing.List[ServicePort] = None,
  selector: IPodSelector = None,
  type: ServiceType = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Service.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Service.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `cluster_i_p`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.parameter.cluster_i_p"></a>

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

##### `external_i_ps`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.parameter.external_i_ps"></a>

- *Type:* typing.List[`str`]
- *Default:* No external IPs.

A list of IP addresses for which nodes in the cluster will also accept traffic for this service.

These IPs are not managed by Kubernetes. The user
is responsible for ensuring that traffic arrives at a node with this IP. A
common example is external load-balancers that are not part of the
Kubernetes system.

---

##### `external_name`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.parameter.external_name"></a>

- *Type:* `str`
- *Default:* No external name.

The externalName to be used when ServiceType.EXTERNAL_NAME is set.

---

##### `load_balancer_source_ranges`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.parameter.load_balancer_source_ranges"></a>

- *Type:* typing.List[`str`]

A list of CIDR IP addresses, if specified and supported by the platform, will restrict traffic through the cloud-provider load-balancer to the specified client IPs.

More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ServicePort`](#cdk8s_plus_27.ServicePort)]
- *Default:* either the selector ports, or none.

The ports this service binds to.

If the selector of the service is a managed pod / workload,
its ports will are automatically extracted and used as the default value.
Otherwise, no ports are bound.

---

##### `selector`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.parameter.selector"></a>

- *Type:* [`cdk8s_plus_27.IPodSelector`](#cdk8s_plus_27.IPodSelector)
- *Default:* unset, the service is assumed to have an external process managing
its endpoints, which Kubernetes will not modify.

Which pods should the service select and route to.

You can pass one of the following:

* An instance of `Pod` or any workload resource (e.g `Deployment`, `StatefulSet`, ...)
* Pods selected by the `Pods.select` function. Note that in this case only labels can be specified.

---

##### `type`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.parameter.type"></a>

- *Type:* [`cdk8s_plus_27.ServiceType`](#cdk8s_plus_27.ServiceType)
- *Default:* ServiceType.ClusterIP

Determines how the Service is exposed.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

---

#### Methods <a name="Methods"></a>

##### `bind` <a name="cdk8s_plus_27.Service.bind"></a>

```python
def bind(
  port: typing.Union[int, float],
  name: str = None,
  node_port: typing.Union[int, float] = None,
  protocol: Protocol = None,
  target_port: typing.Union[int, float] = None
)
```

###### `port`<sup>Required</sup> <a name="cdk8s_plus_27.Service.parameter.port"></a>

- *Type:* `typing.Union[int, float]`

The port definition.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceBindOptions.parameter.name"></a>

- *Type:* `str`

The name of this port within the service.

This must be a DNS_LABEL. All
ports within a ServiceSpec must have unique names. This maps to the 'Name'
field in EndpointPort objects. Optional if only one ServicePort is defined
on this service.

---

###### `node_port`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceBindOptions.parameter.node_port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* auto-allocate a port if the ServiceType of this Service requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

###### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceBindOptions.parameter.protocol"></a>

- *Type:* [`cdk8s_plus_27.Protocol`](#cdk8s_plus_27.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

###### `target_port`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceBindOptions.parameter.target_port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

##### `expose_via_ingress` <a name="cdk8s_plus_27.Service.expose_via_ingress"></a>

```python
def expose_via_ingress(
  path: str,
  ingress: Ingress = None,
  path_type: HttpIngressPathType = None
)
```

###### `path`<sup>Required</sup> <a name="cdk8s_plus_27.Service.parameter.path"></a>

- *Type:* `str`

The path to expose the service under.

---

###### `ingress`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeServiceViaIngressOptions.parameter.ingress"></a>

- *Type:* [`cdk8s_plus_27.Ingress`](#cdk8s_plus_27.Ingress)
- *Default:* An ingress will be automatically created.

The ingress to add rules to.

---

###### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeServiceViaIngressOptions.parameter.path_type"></a>

- *Type:* [`cdk8s_plus_27.HttpIngressPathType`](#cdk8s_plus_27.HttpIngressPathType)
- *Default:* HttpIngressPathType.PREFIX

The type of the path.

---

##### `select` <a name="cdk8s_plus_27.Service.select"></a>

```python
def select(
  selector: IPodSelector
)
```

###### `selector`<sup>Required</sup> <a name="cdk8s_plus_27.Service.parameter.selector"></a>

- *Type:* [`cdk8s_plus_27.IPodSelector`](#cdk8s_plus_27.IPodSelector)

---

##### `select_label` <a name="cdk8s_plus_27.Service.select_label"></a>

```python
def select_label(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.Service.parameter.key"></a>

- *Type:* `str`

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.Service.parameter.value"></a>

- *Type:* `str`

---


#### Properties <a name="Properties"></a>

##### `port`<sup>Required</sup> <a name="cdk8s_plus_27.Service.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Return the first port of the service.

---

##### `ports`<sup>Required</sup> <a name="cdk8s_plus_27.Service.property.ports"></a>

```python
ports: typing.List[ServicePort]
```

- *Type:* typing.List[[`cdk8s_plus_27.ServicePort`](#cdk8s_plus_27.ServicePort)]

Ports for this service.

Use `bind()` to bind additional service ports.

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.Service.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `type`<sup>Required</sup> <a name="cdk8s_plus_27.Service.property.type"></a>

```python
type: ServiceType
```

- *Type:* [`cdk8s_plus_27.ServiceType`](#cdk8s_plus_27.ServiceType)

Determines how the Service is exposed.

---

##### `cluster_i_p`<sup>Optional</sup> <a name="cdk8s_plus_27.Service.property.cluster_i_p"></a>

```python
cluster_i_p: str
```

- *Type:* `str`

The IP address of the service and is usually assigned randomly by the master.

---

##### `external_name`<sup>Optional</sup> <a name="cdk8s_plus_27.Service.property.external_name"></a>

```python
external_name: str
```

- *Type:* `str`

The externalName to be used for EXTERNAL_NAME types.

---


### ServiceAccount <a name="cdk8s_plus_27.ServiceAccount"></a>

- *Implements:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount), [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

A service account provides an identity for processes that run in a Pod.

When you (a human) access the cluster (for example, using kubectl), you are
authenticated by the apiserver as a particular User Account (currently this
is usually admin, unless your cluster administrator has customized your
cluster). Processes in containers inside pods can also contact the apiserver.
When they do, they are authenticated as a particular Service Account (for
example, default).

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account

#### Initializers <a name="cdk8s_plus_27.ServiceAccount.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ServiceAccount(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  automount_token: bool = None,
  secrets: typing.List[ISecret] = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccount.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccount.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceAccountProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_token`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceAccountProps.parameter.automount_token"></a>

- *Type:* `bool`
- *Default:* false

Indicates whether pods running as this service account should have an API token automatically mounted.

Can be overridden at the pod level.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `secrets`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceAccountProps.parameter.secrets"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)]

List of secrets allowed to be used by pods running using this ServiceAccount.

> https://kubernetes.io/docs/concepts/configuration/secret

---

#### Methods <a name="Methods"></a>

##### `add_secret` <a name="cdk8s_plus_27.ServiceAccount.add_secret"></a>

```python
def add_secret(
  secr: ISecret
)
```

###### `secr`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccount.parameter.secr"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)

The secret.

---

##### `to_subject_configuration` <a name="cdk8s_plus_27.ServiceAccount.to_subject_configuration"></a>

```python
def to_subject_configuration()
```

#### Static Functions <a name="Static Functions"></a>

##### `from_service_account_name` <a name="cdk8s_plus_27.ServiceAccount.from_service_account_name"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ServiceAccount.from_service_account_name(
  scope: Construct,
  id: str,
  name: str,
  namespace_name: str = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccount.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccount.parameter.id"></a>

- *Type:* `str`

---

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccount.parameter.name"></a>

- *Type:* `str`

The name of the service account resource.

---

###### `namespace_name`<sup>Optional</sup> <a name="cdk8s_plus_27.FromServiceAccountNameOptions.parameter.namespace_name"></a>

- *Type:* `str`
- *Default:* "default"

The name of the namespace the service account belongs to.

---

#### Properties <a name="Properties"></a>

##### `automount_token`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccount.property.automount_token"></a>

```python
automount_token: bool
```

- *Type:* `bool`

Whether or not a token is automatically mounted for this service account.

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccount.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `secrets`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccount.property.secrets"></a>

```python
secrets: typing.List[ISecret]
```

- *Type:* typing.List[[`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)]

List of secrets allowed to be used by pods running using this service account.

Returns a copy. To add a secret, use `addSecret()`.

---


### ServiceAccountTokenSecret <a name="cdk8s_plus_27.ServiceAccountTokenSecret"></a>

Create a secret for a service account token.

> https://kubernetes.io/docs/concepts/configuration/secret/#service-account-token-secrets

#### Initializers <a name="cdk8s_plus_27.ServiceAccountTokenSecret.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ServiceAccountTokenSecret(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  service_account: IServiceAccount
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccountTokenSecret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccountTokenSecret.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceAccountTokenSecretProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceAccountTokenSecretProps.parameter.immutable"></a>

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `service_account`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccountTokenSecretProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)

The service account to store a secret for.

---





### SshAuthSecret <a name="cdk8s_plus_27.SshAuthSecret"></a>

Create a secret for ssh authentication.

> https://kubernetes.io/docs/concepts/configuration/secret/#ssh-authentication-secrets

#### Initializers <a name="cdk8s_plus_27.SshAuthSecret.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.SshAuthSecret(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  ssh_private_key: str
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.SshAuthSecret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.SshAuthSecret.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.SshAuthSecretProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.SshAuthSecretProps.parameter.immutable"></a>

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `ssh_private_key`<sup>Required</sup> <a name="cdk8s_plus_27.SshAuthSecretProps.parameter.ssh_private_key"></a>

- *Type:* `str`

The SSH private key to use.

---





### StatefulSet <a name="cdk8s_plus_27.StatefulSet"></a>

- *Implements:* [`cdk8s_plus_27.IScalable`](#cdk8s_plus_27.IScalable)

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

#### Initializers <a name="cdk8s_plus_27.StatefulSet.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.StatefulSet(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None,
  min_ready: Duration = None,
  pod_management_policy: PodManagementPolicy = None,
  replicas: typing.Union[int, float] = None,
  service: Service = None,
  strategy: StatefulSetUpdateStrategy = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.StatefulSet.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.StatefulSet.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.automount_service_account_token"></a>

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.dns"></a>

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.docker_registry_auth"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.host_aliases"></a>

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.host_network"></a>

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.init_containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.isolate"></a>

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.termination_grace_period"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.pod_metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.select"></a>

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.spread"></a>

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `min_ready`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.min_ready"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(0)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

Zero means the pod will be considered available as soon as it is ready.

This is an alpha field and requires enabling StatefulSetMinReadySeconds feature gate.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds

---

##### `pod_management_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.pod_management_policy"></a>

- *Type:* [`cdk8s_plus_27.PodManagementPolicy`](#cdk8s_plus_27.PodManagementPolicy)
- *Default:* PodManagementPolicy.ORDERED_READY

Pod management policy to use for this statefulset.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.replicas"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 1

Number of desired pods.

---

##### `service`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.service"></a>

- *Type:* [`cdk8s_plus_27.Service`](#cdk8s_plus_27.Service)
- *Default:* A new headless service will be created.

Service to associate with the statefulset.

---

##### `strategy`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.parameter.strategy"></a>

- *Type:* [`cdk8s_plus_27.StatefulSetUpdateStrategy`](#cdk8s_plus_27.StatefulSetUpdateStrategy)
- *Default:* RollingUpdate with partition set to 0

Indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.

---

#### Methods <a name="Methods"></a>

##### `mark_has_autoscaler` <a name="cdk8s_plus_27.StatefulSet.mark_has_autoscaler"></a>

```python
def mark_has_autoscaler()
```

##### `to_scaling_target` <a name="cdk8s_plus_27.StatefulSet.to_scaling_target"></a>

```python
def to_scaling_target()
```


#### Properties <a name="Properties"></a>

##### `min_ready`<sup>Required</sup> <a name="cdk8s_plus_27.StatefulSet.property.min_ready"></a>

```python
min_ready: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---

##### `pod_management_policy`<sup>Required</sup> <a name="cdk8s_plus_27.StatefulSet.property.pod_management_policy"></a>

```python
pod_management_policy: PodManagementPolicy
```

- *Type:* [`cdk8s_plus_27.PodManagementPolicy`](#cdk8s_plus_27.PodManagementPolicy)

Management policy to use for the set.

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.StatefulSet.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

---

##### `service`<sup>Required</sup> <a name="cdk8s_plus_27.StatefulSet.property.service"></a>

```python
service: Service
```

- *Type:* [`cdk8s_plus_27.Service`](#cdk8s_plus_27.Service)

---

##### `strategy`<sup>Required</sup> <a name="cdk8s_plus_27.StatefulSet.property.strategy"></a>

```python
strategy: StatefulSetUpdateStrategy
```

- *Type:* [`cdk8s_plus_27.StatefulSetUpdateStrategy`](#cdk8s_plus_27.StatefulSetUpdateStrategy)

The update startegy of this stateful set.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSet.property.replicas"></a>

```python
replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Number of desired pods.

---

##### `has_autoscaler`<sup>Required</sup> <a name="cdk8s_plus_27.StatefulSet.property.has_autoscaler"></a>

```python
has_autoscaler: bool
```

- *Type:* `bool`

If this is a target of an autoscaler.

---


### TlsSecret <a name="cdk8s_plus_27.TlsSecret"></a>

Create a secret for storing a TLS certificate and its associated key.

> https://kubernetes.io/docs/concepts/configuration/secret/#tls-secrets

#### Initializers <a name="cdk8s_plus_27.TlsSecret.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.TlsSecret(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  tls_cert: str,
  tls_key: str
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.TlsSecret.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.TlsSecret.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.TlsSecretProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.TlsSecretProps.parameter.immutable"></a>

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `tls_cert`<sup>Required</sup> <a name="cdk8s_plus_27.TlsSecretProps.parameter.tls_cert"></a>

- *Type:* `str`

The TLS cert.

---

##### `tls_key`<sup>Required</sup> <a name="cdk8s_plus_27.TlsSecretProps.parameter.tls_key"></a>

- *Type:* `str`

The TLS key.

---





### User <a name="cdk8s_plus_27.User"></a>

- *Implements:* [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

Represents a user.

#### Methods <a name="Methods"></a>

##### `to_subject_configuration` <a name="cdk8s_plus_27.User.to_subject_configuration"></a>

```python
def to_subject_configuration()
```

#### Static Functions <a name="Static Functions"></a>

##### `from_name` <a name="cdk8s_plus_27.User.from_name"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.User.from_name(
  scope: Construct,
  id: str,
  name: str
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.User.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.User.parameter.id"></a>

- *Type:* `str`

---

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.User.parameter.name"></a>

- *Type:* `str`

---

#### Properties <a name="Properties"></a>

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.User.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.User.property.name"></a>

```python
name: str
```

- *Type:* `str`

---

##### `api_group`<sup>Optional</sup> <a name="cdk8s_plus_27.User.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

---


### Volume <a name="cdk8s_plus_27.Volume"></a>

- *Implements:* [`cdk8s_plus_27.IStorage`](#cdk8s_plus_27.IStorage)

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

##### `as_volume` <a name="cdk8s_plus_27.Volume.as_volume"></a>

```python
def as_volume()
```

#### Static Functions <a name="Static Functions"></a>

##### `from_aws_elastic_block_store` <a name="cdk8s_plus_27.Volume.from_aws_elastic_block_store"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Volume.from_aws_elastic_block_store(
  scope: Construct,
  id: str,
  volume_id: str,
  fs_type: str = None,
  name: str = None,
  partition: typing.Union[int, float] = None,
  read_only: bool = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.id"></a>

- *Type:* `str`

---

###### `volume_id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.volume_id"></a>

- *Type:* `str`

---

###### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStoreVolumeOptions.parameter.fs_type"></a>

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStoreVolumeOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

###### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStoreVolumeOptions.parameter.partition"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

###### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStoreVolumeOptions.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `from_azure_disk` <a name="cdk8s_plus_27.Volume.from_azure_disk"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Volume.from_azure_disk(
  scope: Construct,
  id: str,
  disk_name: str,
  disk_uri: str,
  caching_mode: AzureDiskPersistentVolumeCachingMode = None,
  fs_type: str = None,
  kind: AzureDiskPersistentVolumeKind = None,
  name: str = None,
  read_only: bool = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.id"></a>

- *Type:* `str`

---

###### `disk_name`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.disk_name"></a>

- *Type:* `str`

---

###### `disk_uri`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.disk_uri"></a>

- *Type:* `str`

---

###### `caching_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskVolumeOptions.parameter.caching_mode"></a>

- *Type:* [`cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode`](#cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode)
- *Default:* AzureDiskPersistentVolumeCachingMode.NONE.

Host Caching mode.

---

###### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskVolumeOptions.parameter.fs_type"></a>

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type to mount.

Must be a filesystem type supported by the host operating system.

---

###### `kind`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskVolumeOptions.parameter.kind"></a>

- *Type:* [`cdk8s_plus_27.AzureDiskPersistentVolumeKind`](#cdk8s_plus_27.AzureDiskPersistentVolumeKind)
- *Default:* AzureDiskPersistentVolumeKind.SHARED

Kind of disk.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskVolumeOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

###### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskVolumeOptions.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

Force the ReadOnly setting in VolumeMounts.

---

##### `from_config_map` <a name="cdk8s_plus_27.Volume.from_config_map"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Volume.from_config_map(
  scope: Construct,
  id: str,
  config_map: IConfigMap,
  default_mode: typing.Union[int, float] = None,
  items: typing.Mapping[PathMapping] = None,
  name: str = None,
  optional: bool = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.id"></a>

- *Type:* `str`

---

###### `config_map`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.config_map"></a>

- *Type:* [`cdk8s_plus_27.IConfigMap`](#cdk8s_plus_27.IConfigMap)

The config map to use to populate the volume.

---

###### `default_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapVolumeOptions.parameter.default_mode"></a>

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

###### `items`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapVolumeOptions.parameter.items"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_27.PathMapping`](#cdk8s_plus_27.PathMapping)]
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the ConfigMap, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapVolumeOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

###### `optional`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapVolumeOptions.parameter.optional"></a>

- *Type:* `bool`
- *Default:* undocumented

Specify whether the ConfigMap or its keys must be defined.

---

##### `from_csi` <a name="cdk8s_plus_27.Volume.from_csi"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Volume.from_csi(
  scope: Construct,
  id: str,
  driver: str,
  attributes: typing.Mapping[str] = None,
  fs_type: str = None,
  name: str = None,
  read_only: bool = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.id"></a>

- *Type:* `str`

---

###### `driver`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.driver"></a>

- *Type:* `str`

The name of the CSI driver to use to populate the volume.

---

###### `attributes`<sup>Optional</sup> <a name="cdk8s_plus_27.CsiVolumeOptions.parameter.attributes"></a>

- *Type:* typing.Mapping[`str`]
- *Default:* undefined

Any driver-specific attributes to pass to the CSI volume builder.

---

###### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.CsiVolumeOptions.parameter.fs_type"></a>

- *Type:* `str`
- *Default:* driver-dependent

The filesystem type to mount.

Ex. "ext4", "xfs", "ntfs". If not provided,
the empty value is passed to the associated CSI driver, which will
determine the default filesystem to apply.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.CsiVolumeOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

###### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.CsiVolumeOptions.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

Whether the mounted volume should be read-only or not.

---

##### `from_empty_dir` <a name="cdk8s_plus_27.Volume.from_empty_dir"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Volume.from_empty_dir(
  scope: Construct,
  id: str,
  name: str,
  medium: EmptyDirMedium = None,
  size_limit: Size = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.id"></a>

- *Type:* `str`

---

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.name"></a>

- *Type:* `str`

---

###### `medium`<sup>Optional</sup> <a name="cdk8s_plus_27.EmptyDirVolumeOptions.parameter.medium"></a>

- *Type:* [`cdk8s_plus_27.EmptyDirMedium`](#cdk8s_plus_27.EmptyDirMedium)
- *Default:* EmptyDirMedium.DEFAULT

By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment.

However, you can set the emptyDir.medium field to
`EmptyDirMedium.MEMORY` to tell Kubernetes to mount a tmpfs (RAM-backed
filesystem) for you instead. While tmpfs is very fast, be aware that unlike
disks, tmpfs is cleared on node reboot and any files you write will count
against your Container's memory limit.

---

###### `size_limit`<sup>Optional</sup> <a name="cdk8s_plus_27.EmptyDirVolumeOptions.parameter.size_limit"></a>

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* limit is undefined

Total amount of local storage required for this EmptyDir volume.

The size
limit is also applicable for memory medium. The maximum usage on memory
medium EmptyDir would be the minimum value between the SizeLimit specified
here and the sum of memory limits of all containers in a pod.

---

##### `from_gce_persistent_disk` <a name="cdk8s_plus_27.Volume.from_gce_persistent_disk"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Volume.from_gce_persistent_disk(
  scope: Construct,
  id: str,
  pd_name: str,
  fs_type: str = None,
  name: str = None,
  partition: typing.Union[int, float] = None,
  read_only: bool = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.id"></a>

- *Type:* `str`

---

###### `pd_name`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.pd_name"></a>

- *Type:* `str`

---

###### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskVolumeOptions.parameter.fs_type"></a>

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskVolumeOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

###### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskVolumeOptions.parameter.partition"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

###### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskVolumeOptions.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `from_host_path` <a name="cdk8s_plus_27.Volume.from_host_path"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Volume.from_host_path(
  scope: Construct,
  id: str,
  name: str,
  path: str,
  type: HostPathVolumeType = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.id"></a>

- *Type:* `str`

---

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.name"></a>

- *Type:* `str`

---

###### `path`<sup>Required</sup> <a name="cdk8s_plus_27.HostPathVolumeOptions.parameter.path"></a>

- *Type:* `str`

The path of the directory on the host.

---

###### `type`<sup>Optional</sup> <a name="cdk8s_plus_27.HostPathVolumeOptions.parameter.type"></a>

- *Type:* [`cdk8s_plus_27.HostPathVolumeType`](#cdk8s_plus_27.HostPathVolumeType)
- *Default:* HostPathVolumeType.DEFAULT

The expected type of the path found on the host.

---

##### `from_nfs` <a name="cdk8s_plus_27.Volume.from_nfs"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Volume.from_nfs(
  scope: Construct,
  id: str,
  name: str,
  path: str,
  server: str,
  read_only: bool = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.id"></a>

- *Type:* `str`

---

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.name"></a>

- *Type:* `str`

---

###### `path`<sup>Required</sup> <a name="cdk8s_plus_27.NfsVolumeOptions.parameter.path"></a>

- *Type:* `str`

Path that is exported by the NFS server.

---

###### `server`<sup>Required</sup> <a name="cdk8s_plus_27.NfsVolumeOptions.parameter.server"></a>

- *Type:* `str`

Server is the hostname or IP address of the NFS server.

---

###### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.NfsVolumeOptions.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

If set to true, will force the NFS export to be mounted with read-only permissions.

---

##### `from_persistent_volume_claim` <a name="cdk8s_plus_27.Volume.from_persistent_volume_claim"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Volume.from_persistent_volume_claim(
  scope: Construct,
  id: str,
  claim: IPersistentVolumeClaim,
  name: str = None,
  read_only: bool = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.id"></a>

- *Type:* `str`

---

###### `claim`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.claim"></a>

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimVolumeOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* Derived from the PVC name.

The volume name.

---

###### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimVolumeOptions.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

Will force the ReadOnly setting in VolumeMounts.

---

##### `from_secret` <a name="cdk8s_plus_27.Volume.from_secret"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Volume.from_secret(
  scope: Construct,
  id: str,
  secr: ISecret,
  default_mode: typing.Union[int, float] = None,
  items: typing.Mapping[PathMapping] = None,
  name: str = None,
  optional: bool = None
)
```

###### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

###### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.id"></a>

- *Type:* `str`

---

###### `secr`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.parameter.secr"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)

The secret to use to populate the volume.

---

###### `default_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretVolumeOptions.parameter.default_mode"></a>

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

###### `items`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretVolumeOptions.parameter.items"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_27.PathMapping`](#cdk8s_plus_27.PathMapping)]
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced secret will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the secret, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretVolumeOptions.parameter.name"></a>

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

###### `optional`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretVolumeOptions.parameter.optional"></a>

- *Type:* `bool`
- *Default:* undocumented

Specify whether the secret or its keys must be defined.

---

#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Volume.property.name"></a>

```python
name: str
```

- *Type:* `str`

---


### Workload <a name="cdk8s_plus_27.Workload"></a>

A workload is an application running on Kubernetes.

Whether your workload is a single
component or several that work together, on Kubernetes you run it inside a set of pods.
In Kubernetes, a Pod represents a set of running containers on your cluster.

#### Initializers <a name="cdk8s_plus_27.Workload.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Workload(
  scope: Construct,
  id: str,
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None
)
```

##### `scope`<sup>Required</sup> <a name="cdk8s_plus_27.Workload.parameter.scope"></a>

- *Type:* [`constructs.Construct`](#constructs.Construct)

---

##### `id`<sup>Required</sup> <a name="cdk8s_plus_27.Workload.parameter.id"></a>

- *Type:* `str`

---

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.automount_service_account_token"></a>

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.dns"></a>

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.docker_registry_auth"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.host_aliases"></a>

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.host_network"></a>

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.init_containers"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.isolate"></a>

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.restart_policy"></a>

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.service_account"></a>

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.termination_grace_period"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.volumes"></a>

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.pod_metadata"></a>

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.select"></a>

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.parameter.spread"></a>

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

#### Methods <a name="Methods"></a>

##### `select` <a name="cdk8s_plus_27.Workload.select"></a>

```python
def select(
  selectors: LabelSelector
)
```

###### `selectors`<sup>Required</sup> <a name="cdk8s_plus_27.Workload.parameter.selectors"></a>

- *Type:* [`cdk8s_plus_27.LabelSelector`](#cdk8s_plus_27.LabelSelector)

---


#### Properties <a name="Properties"></a>

##### `connections`<sup>Required</sup> <a name="cdk8s_plus_27.Workload.property.connections"></a>

```python
connections: PodConnections
```

- *Type:* [`cdk8s_plus_27.PodConnections`](#cdk8s_plus_27.PodConnections)

---

##### `match_expressions`<sup>Required</sup> <a name="cdk8s_plus_27.Workload.property.match_expressions"></a>

```python
match_expressions: typing.List[LabelSelectorRequirement]
```

- *Type:* typing.List[[`cdk8s_plus_27.LabelSelectorRequirement`](#cdk8s_plus_27.LabelSelectorRequirement)]

The expression matchers this workload will use in order to select pods.

Returns a a copy. Use `select()` to add expression matchers.

---

##### `match_labels`<sup>Required</sup> <a name="cdk8s_plus_27.Workload.property.match_labels"></a>

```python
match_labels: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

The label matchers this workload will use in order to select pods.

Returns a a copy. Use `select()` to add label matchers.

---

##### `pod_metadata`<sup>Required</sup> <a name="cdk8s_plus_27.Workload.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadataDefinition
```

- *Type:* [`cdk8s.ApiObjectMetadataDefinition`](#cdk8s.ApiObjectMetadataDefinition)

The metadata of pods in this workload.

---

##### `scheduling`<sup>Required</sup> <a name="cdk8s_plus_27.Workload.property.scheduling"></a>

```python
scheduling: WorkloadScheduling
```

- *Type:* [`cdk8s_plus_27.WorkloadScheduling`](#cdk8s_plus_27.WorkloadScheduling)

---


## Structs <a name="Structs"></a>

### AbstractPodProps <a name="cdk8s_plus_27.AbstractPodProps"></a>

Properties for `AbstractPod`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.AbstractPodProps(
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.automount_service_account_token"></a>

```python
automount_service_account_token: bool
```

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.dns"></a>

```python
dns: PodDnsProps
```

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.docker_registry_auth"></a>

```python
docker_registry_auth: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.host_aliases"></a>

```python
host_aliases: typing.List[HostAlias]
```

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.host_network"></a>

```python
host_network: bool
```

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.init_containers"></a>

```python
init_containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.isolate"></a>

```python
isolate: bool
```

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.security_context"></a>

```python
security_context: PodSecurityContextProps
```

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.termination_grace_period"></a>

```python
termination_grace_period: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.AbstractPodProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

### AddDeploymentOptions <a name="cdk8s_plus_27.AddDeploymentOptions"></a>

Options to add a deployment to a service.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.AddDeploymentOptions(
  name: str = None,
  node_port: typing.Union[int, float] = None,
  protocol: Protocol = None,
  target_port: typing.Union[int, float] = None,
  port: typing.Union[int, float] = None
)
```

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.AddDeploymentOptions.property.name"></a>

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

##### `node_port`<sup>Optional</sup> <a name="cdk8s_plus_27.AddDeploymentOptions.property.node_port"></a>

```python
node_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* auto-allocate a port if the ServiceType of this Service requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_27.AddDeploymentOptions.property.protocol"></a>

```python
protocol: Protocol
```

- *Type:* [`cdk8s_plus_27.Protocol`](#cdk8s_plus_27.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `target_port`<sup>Optional</sup> <a name="cdk8s_plus_27.AddDeploymentOptions.property.target_port"></a>

```python
target_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.AddDeploymentOptions.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* Copied from the first container of the deployment.

The port number the service will bind to.

---

### AddDirectoryOptions <a name="cdk8s_plus_27.AddDirectoryOptions"></a>

Options for `configmap.addDirectory()`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.AddDirectoryOptions(
  exclude: typing.List[str] = None,
  key_prefix: str = None
)
```

##### `exclude`<sup>Optional</sup> <a name="cdk8s_plus_27.AddDirectoryOptions.property.exclude"></a>

```python
exclude: typing.List[str]
```

- *Type:* typing.List[`str`]
- *Default:* include all files

Glob patterns to exclude when adding files.

---

##### `key_prefix`<sup>Optional</sup> <a name="cdk8s_plus_27.AddDirectoryOptions.property.key_prefix"></a>

```python
key_prefix: str
```

- *Type:* `str`
- *Default:* ""

A prefix to add to all keys in the config map.

---

### ApiResourceOptions <a name="cdk8s_plus_27.ApiResourceOptions"></a>

Options for `ApiResource`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ApiResourceOptions(
  api_group: str,
  resource_type: str
)
```

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.ApiResourceOptions.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.ApiResourceOptions.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of the resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

### AwsElasticBlockStorePersistentVolumeProps <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps"></a>

Properties for `AwsElasticBlockStorePersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps(
  metadata: ApiObjectMetadata = None,
  access_modes: typing.List[PersistentVolumeAccessMode] = None,
  claim: IPersistentVolumeClaim = None,
  mount_options: typing.List[str] = None,
  reclaim_policy: PersistentVolumeReclaimPolicy = None,
  storage: Size = None,
  storage_class_name: str = None,
  volume_mode: PersistentVolumeMode = None,
  volume_id: str,
  fs_type: str = None,
  partition: typing.Union[int, float] = None,
  read_only: bool = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.access_modes"></a>

```python
access_modes: typing.List[PersistentVolumeAccessMode]
```

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.claim"></a>

```python
claim: IPersistentVolumeClaim
```

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mount_options`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.mount_options"></a>

```python
mount_options: typing.List[str]
```

- *Type:* typing.List[`str`]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaim_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.reclaim_policy"></a>

```python
reclaim_policy: PersistentVolumeReclaimPolicy
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeReclaimPolicy`](#cdk8s_plus_27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.storage"></a>

```python
storage: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.storage_class_name"></a>

```python
storage_class_name: str
```

- *Type:* `str`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volume_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.volume_mode"></a>

```python
volume_mode: PersistentVolumeMode
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `volume_id`<sup>Required</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.volume_id"></a>

```python
volume_id: str
```

- *Type:* `str`

Unique ID of the persistent disk resource in AWS (Amazon EBS volume).

More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.fs_type"></a>

```python
fs_type: str
```

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.partition"></a>

```python
partition: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStorePersistentVolumeProps.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### AwsElasticBlockStoreVolumeOptions <a name="cdk8s_plus_27.AwsElasticBlockStoreVolumeOptions"></a>

Options of `Volume.fromAwsElasticBlockStore`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.AwsElasticBlockStoreVolumeOptions(
  fs_type: str = None,
  name: str = None,
  partition: typing.Union[int, float] = None,
  read_only: bool = None
)
```

##### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStoreVolumeOptions.property.fs_type"></a>

```python
fs_type: str
```

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStoreVolumeOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

##### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStoreVolumeOptions.property.partition"></a>

```python
partition: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.AwsElasticBlockStoreVolumeOptions.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### AzureDiskPersistentVolumeProps <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps"></a>

Properties for `AzureDiskPersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.AzureDiskPersistentVolumeProps(
  metadata: ApiObjectMetadata = None,
  access_modes: typing.List[PersistentVolumeAccessMode] = None,
  claim: IPersistentVolumeClaim = None,
  mount_options: typing.List[str] = None,
  reclaim_policy: PersistentVolumeReclaimPolicy = None,
  storage: Size = None,
  storage_class_name: str = None,
  volume_mode: PersistentVolumeMode = None,
  disk_name: str,
  disk_uri: str,
  caching_mode: AzureDiskPersistentVolumeCachingMode = None,
  fs_type: str = None,
  kind: AzureDiskPersistentVolumeKind = None,
  read_only: bool = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.access_modes"></a>

```python
access_modes: typing.List[PersistentVolumeAccessMode]
```

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.claim"></a>

```python
claim: IPersistentVolumeClaim
```

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mount_options`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.mount_options"></a>

```python
mount_options: typing.List[str]
```

- *Type:* typing.List[`str`]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaim_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.reclaim_policy"></a>

```python
reclaim_policy: PersistentVolumeReclaimPolicy
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeReclaimPolicy`](#cdk8s_plus_27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.storage"></a>

```python
storage: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.storage_class_name"></a>

```python
storage_class_name: str
```

- *Type:* `str`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volume_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.volume_mode"></a>

```python
volume_mode: PersistentVolumeMode
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `disk_name`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.disk_name"></a>

```python
disk_name: str
```

- *Type:* `str`

The Name of the data disk in the blob storage.

---

##### `disk_uri`<sup>Required</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.disk_uri"></a>

```python
disk_uri: str
```

- *Type:* `str`

The URI the data disk in the blob storage.

---

##### `caching_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.caching_mode"></a>

```python
caching_mode: AzureDiskPersistentVolumeCachingMode
```

- *Type:* [`cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode`](#cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode)
- *Default:* AzureDiskPersistentVolumeCachingMode.NONE.

Host Caching mode.

---

##### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.fs_type"></a>

```python
fs_type: str
```

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type to mount.

Must be a filesystem type supported by the host operating system.

---

##### `kind`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.kind"></a>

```python
kind: AzureDiskPersistentVolumeKind
```

- *Type:* [`cdk8s_plus_27.AzureDiskPersistentVolumeKind`](#cdk8s_plus_27.AzureDiskPersistentVolumeKind)
- *Default:* AzureDiskPersistentVolumeKind.SHARED

Kind of disk.

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskPersistentVolumeProps.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Force the ReadOnly setting in VolumeMounts.

---

### AzureDiskVolumeOptions <a name="cdk8s_plus_27.AzureDiskVolumeOptions"></a>

Options of `Volume.fromAzureDisk`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.AzureDiskVolumeOptions(
  caching_mode: AzureDiskPersistentVolumeCachingMode = None,
  fs_type: str = None,
  kind: AzureDiskPersistentVolumeKind = None,
  name: str = None,
  read_only: bool = None
)
```

##### `caching_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskVolumeOptions.property.caching_mode"></a>

```python
caching_mode: AzureDiskPersistentVolumeCachingMode
```

- *Type:* [`cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode`](#cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode)
- *Default:* AzureDiskPersistentVolumeCachingMode.NONE.

Host Caching mode.

---

##### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskVolumeOptions.property.fs_type"></a>

```python
fs_type: str
```

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type to mount.

Must be a filesystem type supported by the host operating system.

---

##### `kind`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskVolumeOptions.property.kind"></a>

```python
kind: AzureDiskPersistentVolumeKind
```

- *Type:* [`cdk8s_plus_27.AzureDiskPersistentVolumeKind`](#cdk8s_plus_27.AzureDiskPersistentVolumeKind)
- *Default:* AzureDiskPersistentVolumeKind.SHARED

Kind of disk.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskVolumeOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.AzureDiskVolumeOptions.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Force the ReadOnly setting in VolumeMounts.

---

### BasicAuthSecretProps <a name="cdk8s_plus_27.BasicAuthSecretProps"></a>

Options for `BasicAuthSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.BasicAuthSecretProps(
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  password: str,
  username: str
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.BasicAuthSecretProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.BasicAuthSecretProps.property.immutable"></a>

```python
immutable: bool
```

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `password`<sup>Required</sup> <a name="cdk8s_plus_27.BasicAuthSecretProps.property.password"></a>

```python
password: str
```

- *Type:* `str`

The password or token for authentication.

---

##### `username`<sup>Required</sup> <a name="cdk8s_plus_27.BasicAuthSecretProps.property.username"></a>

```python
username: str
```

- *Type:* `str`

The user name for authentication.

---

### ClusterRoleBindingProps <a name="cdk8s_plus_27.ClusterRoleBindingProps"></a>

Properties for `ClusterRoleBinding`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ClusterRoleBindingProps(
  metadata: ApiObjectMetadata = None,
  role: IClusterRole
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ClusterRoleBindingProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `role`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRoleBindingProps.property.role"></a>

```python
role: IClusterRole
```

- *Type:* [`cdk8s_plus_27.IClusterRole`](#cdk8s_plus_27.IClusterRole)

The role to bind to.

---

### ClusterRolePolicyRule <a name="cdk8s_plus_27.ClusterRolePolicyRule"></a>

Policy rule of a `ClusterRole.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ClusterRolePolicyRule(
  endpoints: typing.List[IApiEndpoint],
  verbs: typing.List[str]
)
```

##### `endpoints`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRolePolicyRule.property.endpoints"></a>

```python
endpoints: typing.List[IApiEndpoint]
```

- *Type:* typing.List[[`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)]

Endpoints this rule applies to.

Can be either api resources
or non api resources.

---

##### `verbs`<sup>Required</sup> <a name="cdk8s_plus_27.ClusterRolePolicyRule.property.verbs"></a>

```python
verbs: typing.List[str]
```

- *Type:* typing.List[`str`]

Verbs to allow.

(e.g ['get', 'watch'])

---

### ClusterRoleProps <a name="cdk8s_plus_27.ClusterRoleProps"></a>

Properties for `ClusterRole`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ClusterRoleProps(
  metadata: ApiObjectMetadata = None,
  aggregation_labels: typing.Mapping[str] = None,
  rules: typing.List[ClusterRolePolicyRule] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ClusterRoleProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `aggregation_labels`<sup>Optional</sup> <a name="cdk8s_plus_27.ClusterRoleProps.property.aggregation_labels"></a>

```python
aggregation_labels: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

Specify labels that should be used to locate ClusterRoles, whose rules will be automatically filled into this ClusterRole's rules.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s_plus_27.ClusterRoleProps.property.rules"></a>

```python
rules: typing.List[ClusterRolePolicyRule]
```

- *Type:* typing.List[[`cdk8s_plus_27.ClusterRolePolicyRule`](#cdk8s_plus_27.ClusterRolePolicyRule)]
- *Default:* []

A list of rules the role should allow.

---

### CommandProbeOptions <a name="cdk8s_plus_27.CommandProbeOptions"></a>

Options for `Probe.fromCommand()`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.CommandProbeOptions(
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None
)
```

##### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.CommandProbeOptions.property.failure_threshold"></a>

```python
failure_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.CommandProbeOptions.property.initial_delay_seconds"></a>

```python
initial_delay_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.CommandProbeOptions.property.period_seconds"></a>

```python
period_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.CommandProbeOptions.property.success_threshold"></a>

```python
success_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.CommandProbeOptions.property.timeout_seconds"></a>

```python
timeout_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

### CommonSecretProps <a name="cdk8s_plus_27.CommonSecretProps"></a>

Common properties for `Secret`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.CommonSecretProps(
  metadata: ApiObjectMetadata = None,
  immutable: bool = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.CommonSecretProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.CommonSecretProps.property.immutable"></a>

```python
immutable: bool
```

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

### ConfigMapProps <a name="cdk8s_plus_27.ConfigMapProps"></a>

Properties for initialization of `ConfigMap`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ConfigMapProps(
  metadata: ApiObjectMetadata = None,
  binary_data: typing.Mapping[str] = None,
  data: typing.Mapping[str] = None,
  immutable: bool = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `binary_data`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapProps.property.binary_data"></a>

```python
binary_data: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

BinaryData contains the binary data.

Each key must consist of alphanumeric characters, '-', '_' or '.'.
BinaryData can contain byte sequences that are not in the UTF-8 range. The
keys stored in BinaryData must not overlap with the ones in the Data field,
this is enforced during validation process.

You can also add binary data using `configMap.addBinaryData()`.

---

##### `data`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapProps.property.data"></a>

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

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapProps.property.immutable"></a>

```python
immutable: bool
```

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

### ConfigMapVolumeOptions <a name="cdk8s_plus_27.ConfigMapVolumeOptions"></a>

Options for the ConfigMap-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ConfigMapVolumeOptions(
  default_mode: typing.Union[int, float] = None,
  items: typing.Mapping[PathMapping] = None,
  name: str = None,
  optional: bool = None
)
```

##### `default_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapVolumeOptions.property.default_mode"></a>

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

##### `items`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapVolumeOptions.property.items"></a>

```python
items: typing.Mapping[PathMapping]
```

- *Type:* typing.Mapping[[`cdk8s_plus_27.PathMapping`](#cdk8s_plus_27.PathMapping)]
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the ConfigMap, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapVolumeOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

##### `optional`<sup>Optional</sup> <a name="cdk8s_plus_27.ConfigMapVolumeOptions.property.optional"></a>

```python
optional: bool
```

- *Type:* `bool`
- *Default:* undocumented

Specify whether the ConfigMap or its keys must be defined.

---

### ContainerLifecycle <a name="cdk8s_plus_27.ContainerLifecycle"></a>

Container lifecycle properties.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ContainerLifecycle(
  post_start: Handler = None,
  pre_stop: Handler = None
)
```

##### `post_start`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerLifecycle.property.post_start"></a>

```python
post_start: Handler
```

- *Type:* [`cdk8s_plus_27.Handler`](#cdk8s_plus_27.Handler)
- *Default:* No post start handler.

This hook is executed immediately after a container is created.

However,
there is no guarantee that the hook will execute before the container ENTRYPOINT.

---

##### `pre_stop`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerLifecycle.property.pre_stop"></a>

```python
pre_stop: Handler
```

- *Type:* [`cdk8s_plus_27.Handler`](#cdk8s_plus_27.Handler)
- *Default:* No pre stop handler.

This hook is called immediately before a container is terminated due to an API request or management event such as a liveness/startup probe failure, preemption, resource contention and others.

A call to the PreStop hook fails if the container is already in a terminated or completed state
and the hook must complete before the TERM signal to stop the container can be sent.
The Pod's termination grace period countdown begins before the PreStop hook is executed,
so regardless of the outcome of the handler, the container will eventually terminate
within the Pod's termination grace period. No parameters are passed to the handler.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#pod-termination

---

### ContainerOpts <a name="cdk8s_plus_27.ContainerOpts"></a>

Optional properties of a container.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ContainerOpts(
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env_from: typing.List[EnvFrom] = None,
  env_variables: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  lifecycle: ContainerLifecycle = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  port_number: typing.Union[int, float] = None,
  ports: typing.List[ContainerPort] = None,
  readiness: Probe = None,
  resources: ContainerResources = None,
  security_context: ContainerSecurityContextProps = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None
)
```

##### `args`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.args"></a>

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

##### `command`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.command"></a>

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

##### `env_from`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.env_from"></a>

```python
env_from: typing.List[EnvFrom]
```

- *Type:* typing.List[[`cdk8s_plus_27.EnvFrom`](#cdk8s_plus_27.EnvFrom)]
- *Default:* No sources.

List of sources to populate environment variables in the container.

When a key exists in multiple sources, the value associated with
the last source will take precedence. Values defined by the `envVariables` property
with a duplicate key will take precedence.

---

##### `env_variables`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.env_variables"></a>

```python
env_variables: typing.Mapping[EnvValue]
```

- *Type:* typing.Mapping[[`cdk8s_plus_27.EnvValue`](#cdk8s_plus_27.EnvValue)]
- *Default:* No environment variables.

Environment variables to set in the container.

---

##### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.image_pull_policy"></a>

```python
image_pull_policy: ImagePullPolicy
```

- *Type:* [`cdk8s_plus_27.ImagePullPolicy`](#cdk8s_plus_27.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `lifecycle`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.lifecycle"></a>

```python
lifecycle: ContainerLifecycle
```

- *Type:* [`cdk8s_plus_27.ContainerLifecycle`](#cdk8s_plus_27.ContainerLifecycle)

Describes actions that the management system should take in response to container lifecycle events.

---

##### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.liveness"></a>

```python
liveness: Probe
```

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### ~~`port`~~<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.port"></a>

- *Deprecated:* - use `portNumber`.

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

---

##### `port_number`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.port_number"></a>

```python
port_number: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* Only the ports mentiond in the `ports` property are exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

This is a convinience property if all you need a single TCP numbered port.
In case more advanced configuartion is required, use the `ports` property.

This port is added to the list of ports mentioned in the `ports` property.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.ports"></a>

```python
ports: typing.List[ContainerPort]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerPort`](#cdk8s_plus_27.ContainerPort)]
- *Default:* Only the port mentioned in the `portNumber` property is exposed.

List of ports to expose from this container.

---

##### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.readiness"></a>

```python
readiness: Probe
```

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `resources`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.resources"></a>

```python
resources: ContainerResources
```

- *Type:* [`cdk8s_plus_27.ContainerResources`](#cdk8s_plus_27.ContainerResources)
- *Default:* cpu:
     request: 1000 millis
     limit: 1500 millis
   memory:
     request: 512 mebibytes
     limit: 2048 mebibytes

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.security_context"></a>

```python
security_context: ContainerSecurityContextProps
```

- *Type:* [`cdk8s_plus_27.ContainerSecurityContextProps`](#cdk8s_plus_27.ContainerSecurityContextProps)
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

##### `startup`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.startup"></a>

```python
startup: Probe
```

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* If a port is provided, then knocks on that port
to determine when the container is ready for readiness and
liveness probe checks.
Otherwise, no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.volume_mounts"></a>

```python
volume_mounts: typing.List[VolumeMount]
```

- *Type:* typing.List[[`cdk8s_plus_27.VolumeMount`](#cdk8s_plus_27.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerOpts.property.working_dir"></a>

```python
working_dir: str
```

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

### ContainerPort <a name="cdk8s_plus_27.ContainerPort"></a>

Represents a network port in a single container.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ContainerPort(
  number: typing.Union[int, float],
  host_ip: str = None,
  host_port: typing.Union[int, float] = None,
  name: str = None,
  protocol: Protocol = None
)
```

##### `number`<sup>Required</sup> <a name="cdk8s_plus_27.ContainerPort.property.number"></a>

```python
number: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

##### `host_ip`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerPort.property.host_ip"></a>

```python
host_ip: str
```

- *Type:* `str`
- *Default:* 127.0.0.1.

What host IP to bind the external port to.

---

##### `host_port`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerPort.property.host_port"></a>

```python
host_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* auto generated by kubernetes and might change on restarts.

Number of port to expose on the host.

If specified, this must be a valid port number, 0 < x < 65536.
Most containers do not need this.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerPort.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* port is not named.

If specified, this must be an IANA_SVC_NAME and unique within the pod.

Each named port in a pod must have a unique name.
Name for the port that can be referred to by services.

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerPort.property.protocol"></a>

```python
protocol: Protocol
```

- *Type:* [`cdk8s_plus_27.Protocol`](#cdk8s_plus_27.Protocol)
- *Default:* Protocol.TCP

Protocol for port.

Must be UDP, TCP, or SCTP. Defaults to "TCP".

---

### ContainerProps <a name="cdk8s_plus_27.ContainerProps"></a>

Properties for creating a container.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ContainerProps(
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env_from: typing.List[EnvFrom] = None,
  env_variables: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  lifecycle: ContainerLifecycle = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  port_number: typing.Union[int, float] = None,
  ports: typing.List[ContainerPort] = None,
  readiness: Probe = None,
  resources: ContainerResources = None,
  security_context: ContainerSecurityContextProps = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None,
  image: str
)
```

##### `args`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.args"></a>

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

##### `command`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.command"></a>

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

##### `env_from`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.env_from"></a>

```python
env_from: typing.List[EnvFrom]
```

- *Type:* typing.List[[`cdk8s_plus_27.EnvFrom`](#cdk8s_plus_27.EnvFrom)]
- *Default:* No sources.

List of sources to populate environment variables in the container.

When a key exists in multiple sources, the value associated with
the last source will take precedence. Values defined by the `envVariables` property
with a duplicate key will take precedence.

---

##### `env_variables`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.env_variables"></a>

```python
env_variables: typing.Mapping[EnvValue]
```

- *Type:* typing.Mapping[[`cdk8s_plus_27.EnvValue`](#cdk8s_plus_27.EnvValue)]
- *Default:* No environment variables.

Environment variables to set in the container.

---

##### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.image_pull_policy"></a>

```python
image_pull_policy: ImagePullPolicy
```

- *Type:* [`cdk8s_plus_27.ImagePullPolicy`](#cdk8s_plus_27.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `lifecycle`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.lifecycle"></a>

```python
lifecycle: ContainerLifecycle
```

- *Type:* [`cdk8s_plus_27.ContainerLifecycle`](#cdk8s_plus_27.ContainerLifecycle)

Describes actions that the management system should take in response to container lifecycle events.

---

##### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.liveness"></a>

```python
liveness: Probe
```

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### ~~`port`~~<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.port"></a>

- *Deprecated:* - use `portNumber`.

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

---

##### `port_number`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.port_number"></a>

```python
port_number: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* Only the ports mentiond in the `ports` property are exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

This is a convinience property if all you need a single TCP numbered port.
In case more advanced configuartion is required, use the `ports` property.

This port is added to the list of ports mentioned in the `ports` property.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.ports"></a>

```python
ports: typing.List[ContainerPort]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerPort`](#cdk8s_plus_27.ContainerPort)]
- *Default:* Only the port mentioned in the `portNumber` property is exposed.

List of ports to expose from this container.

---

##### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.readiness"></a>

```python
readiness: Probe
```

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `resources`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.resources"></a>

```python
resources: ContainerResources
```

- *Type:* [`cdk8s_plus_27.ContainerResources`](#cdk8s_plus_27.ContainerResources)
- *Default:* cpu:
     request: 1000 millis
     limit: 1500 millis
   memory:
     request: 512 mebibytes
     limit: 2048 mebibytes

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.security_context"></a>

```python
security_context: ContainerSecurityContextProps
```

- *Type:* [`cdk8s_plus_27.ContainerSecurityContextProps`](#cdk8s_plus_27.ContainerSecurityContextProps)
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

##### `startup`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.startup"></a>

```python
startup: Probe
```

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* If a port is provided, then knocks on that port
to determine when the container is ready for readiness and
liveness probe checks.
Otherwise, no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.volume_mounts"></a>

```python
volume_mounts: typing.List[VolumeMount]
```

- *Type:* typing.List[[`cdk8s_plus_27.VolumeMount`](#cdk8s_plus_27.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.property.working_dir"></a>

```python
working_dir: str
```

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `image`<sup>Required</sup> <a name="cdk8s_plus_27.ContainerProps.property.image"></a>

```python
image: str
```

- *Type:* `str`

Docker image name.

---

### ContainerResources <a name="cdk8s_plus_27.ContainerResources"></a>

CPU and memory compute resources.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ContainerResources(
  cpu: CpuResources = None,
  ephemeral_storage: EphemeralStorageResources = None,
  memory: MemoryResources = None
)
```

##### `cpu`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerResources.property.cpu"></a>

```python
cpu: CpuResources
```

- *Type:* [`cdk8s_plus_27.CpuResources`](#cdk8s_plus_27.CpuResources)

---

##### `ephemeral_storage`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerResources.property.ephemeral_storage"></a>

```python
ephemeral_storage: EphemeralStorageResources
```

- *Type:* [`cdk8s_plus_27.EphemeralStorageResources`](#cdk8s_plus_27.EphemeralStorageResources)

---

##### `memory`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerResources.property.memory"></a>

```python
memory: MemoryResources
```

- *Type:* [`cdk8s_plus_27.MemoryResources`](#cdk8s_plus_27.MemoryResources)

---

### ContainerSecurityContextProps <a name="cdk8s_plus_27.ContainerSecurityContextProps"></a>

Properties for `ContainerSecurityContext`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ContainerSecurityContextProps(
  allow_privilege_escalation: bool = None,
  ensure_non_root: bool = None,
  group: typing.Union[int, float] = None,
  privileged: bool = None,
  read_only_root_filesystem: bool = None,
  user: typing.Union[int, float] = None
)
```

##### `allow_privilege_escalation`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.property.allow_privilege_escalation"></a>

```python
allow_privilege_escalation: bool
```

- *Type:* `bool`
- *Default:* false

Whether a process can gain more privileges than its parent process.

---

##### `ensure_non_root`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.property.ensure_non_root"></a>

```python
ensure_non_root: bool
```

- *Type:* `bool`
- *Default:* true

Indicates that the container must run as a non-root user.

If true, the Kubelet will validate the image at runtime to ensure that it does
not run as UID 0 (root) and fail to start the container if it does.

---

##### `group`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.property.group"></a>

```python
group: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 26000. An arbitrary number bigger than 9999 is selected here.
This is so that the container is blocked to access host files even if
somehow it manages to get access to host file system.

The GID to run the entrypoint of the container process.

---

##### `privileged`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.property.privileged"></a>

```python
privileged: bool
```

- *Type:* `bool`
- *Default:* false

Run container in privileged mode.

Processes in privileged containers are essentially equivalent to root on the host.

---

##### `read_only_root_filesystem`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.property.read_only_root_filesystem"></a>

```python
read_only_root_filesystem: bool
```

- *Type:* `bool`
- *Default:* true

Whether this container has a read-only root filesystem.

---

##### `user`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.property.user"></a>

```python
user: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 25000. An arbitrary number bigger than 9999 is selected here.
This is so that the container is blocked to access host files even if
somehow it manages to get access to host file system.

The UID to run the entrypoint of the container process.

---

### CpuResources <a name="cdk8s_plus_27.CpuResources"></a>

CPU request and limit.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.CpuResources(
  limit: Cpu = None,
  request: Cpu = None
)
```

##### `limit`<sup>Optional</sup> <a name="cdk8s_plus_27.CpuResources.property.limit"></a>

```python
limit: Cpu
```

- *Type:* [`cdk8s_plus_27.Cpu`](#cdk8s_plus_27.Cpu)

---

##### `request`<sup>Optional</sup> <a name="cdk8s_plus_27.CpuResources.property.request"></a>

```python
request: Cpu
```

- *Type:* [`cdk8s_plus_27.Cpu`](#cdk8s_plus_27.Cpu)

---

### CronJobProps <a name="cdk8s_plus_27.CronJobProps"></a>

Properties for `CronJob`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.CronJobProps(
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None,
  active_deadline: Duration = None,
  backoff_limit: typing.Union[int, float] = None,
  ttl_after_finished: Duration = None,
  schedule: Cron,
  concurrency_policy: ConcurrencyPolicy = None,
  failed_jobs_retained: typing.Union[int, float] = None,
  starting_deadline: Duration = None,
  successful_jobs_retained: typing.Union[int, float] = None,
  suspend: bool = None,
  time_zone: str = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.automount_service_account_token"></a>

```python
automount_service_account_token: bool
```

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.dns"></a>

```python
dns: PodDnsProps
```

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.docker_registry_auth"></a>

```python
docker_registry_auth: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.host_aliases"></a>

```python
host_aliases: typing.List[HostAlias]
```

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.host_network"></a>

```python
host_network: bool
```

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.init_containers"></a>

```python
init_containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.isolate"></a>

```python
isolate: bool
```

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.security_context"></a>

```python
security_context: PodSecurityContextProps
```

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.termination_grace_period"></a>

```python
termination_grace_period: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.select"></a>

```python
select: bool
```

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.spread"></a>

```python
spread: bool
```

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `active_deadline`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.active_deadline"></a>

```python
active_deadline: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoff_limit`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.backoff_limit"></a>

```python
backoff_limit: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttl_after_finished`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.ttl_after_finished"></a>

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

##### `schedule`<sup>Required</sup> <a name="cdk8s_plus_27.CronJobProps.property.schedule"></a>

```python
schedule: Cron
```

- *Type:* [`cdk8s.Cron`](#cdk8s.Cron)

Specifies the time in which the job would run again.

This is defined as a cron expression in the CronJob resource.

---

##### `concurrency_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.concurrency_policy"></a>

```python
concurrency_policy: ConcurrencyPolicy
```

- *Type:* [`cdk8s_plus_27.ConcurrencyPolicy`](#cdk8s_plus_27.ConcurrencyPolicy)
- *Default:* ConcurrencyPolicy.Forbid

Specifies the concurrency policy for the job.

---

##### `failed_jobs_retained`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.failed_jobs_retained"></a>

```python
failed_jobs_retained: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1

Specifies the number of failed jobs history retained.

This would retain the Job and the associated Pod resource and can be useful for debugging.

---

##### `starting_deadline`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.starting_deadline"></a>

```python
starting_deadline: Duration
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

##### `successful_jobs_retained`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.successful_jobs_retained"></a>

```python
successful_jobs_retained: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Specifies the number of successful jobs history retained.

This would retain the Job and the associated Pod resource and can be useful for debugging.

---

##### `suspend`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.suspend"></a>

```python
suspend: bool
```

- *Type:* `bool`
- *Default:* false

Specifies if the cron job should be suspended.

Only applies to future executions, current ones are remained untouched.

---

##### `time_zone`<sup>Optional</sup> <a name="cdk8s_plus_27.CronJobProps.property.time_zone"></a>

```python
time_zone: str
```

- *Type:* `str`
- *Default:* Timezone of kube-controller-manager process.

Specifies the timezone for the job.

This helps aligining the schedule to follow the specified timezone.

> {@link https://en.wikipedia.org/wiki/List_of_tz_database_time_zones} for list of valid timezone values.

---

### CsiVolumeOptions <a name="cdk8s_plus_27.CsiVolumeOptions"></a>

Options for the CSI driver based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.CsiVolumeOptions(
  attributes: typing.Mapping[str] = None,
  fs_type: str = None,
  name: str = None,
  read_only: bool = None
)
```

##### `attributes`<sup>Optional</sup> <a name="cdk8s_plus_27.CsiVolumeOptions.property.attributes"></a>

```python
attributes: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]
- *Default:* undefined

Any driver-specific attributes to pass to the CSI volume builder.

---

##### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.CsiVolumeOptions.property.fs_type"></a>

```python
fs_type: str
```

- *Type:* `str`
- *Default:* driver-dependent

The filesystem type to mount.

Ex. "ext4", "xfs", "ntfs". If not provided,
the empty value is passed to the associated CSI driver, which will
determine the default filesystem to apply.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.CsiVolumeOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.CsiVolumeOptions.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Whether the mounted volume should be read-only or not.

---

### DaemonSetProps <a name="cdk8s_plus_27.DaemonSetProps"></a>

Properties for `DaemonSet`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.DaemonSetProps(
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None,
  min_ready_seconds: typing.Union[int, float] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.automount_service_account_token"></a>

```python
automount_service_account_token: bool
```

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.dns"></a>

```python
dns: PodDnsProps
```

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.docker_registry_auth"></a>

```python
docker_registry_auth: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.host_aliases"></a>

```python
host_aliases: typing.List[HostAlias]
```

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.host_network"></a>

```python
host_network: bool
```

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.init_containers"></a>

```python
init_containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.isolate"></a>

```python
isolate: bool
```

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.security_context"></a>

```python
security_context: PodSecurityContextProps
```

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.termination_grace_period"></a>

```python
termination_grace_period: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.select"></a>

```python
select: bool
```

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.spread"></a>

```python
spread: bool
```

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `min_ready_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.DaemonSetProps.property.min_ready_seconds"></a>

```python
min_ready_seconds: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 0

Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

---

### DeploymentExposeViaServiceOptions <a name="cdk8s_plus_27.DeploymentExposeViaServiceOptions"></a>

Options for `Deployment.exposeViaService`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.DeploymentExposeViaServiceOptions(
  name: str = None,
  ports: typing.List[ServicePort] = None,
  service_type: ServiceType = None
)
```

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentExposeViaServiceOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* auto generated.

The name of the service to expose.

If you'd like to expose the deployment multiple times,
you must explicitly set a name starting from the second expose call.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentExposeViaServiceOptions.property.ports"></a>

```python
ports: typing.List[ServicePort]
```

- *Type:* typing.List[[`cdk8s_plus_27.ServicePort`](#cdk8s_plus_27.ServicePort)]
- *Default:* extracted from the deployment.

The ports that the service should bind to.

---

##### `service_type`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentExposeViaServiceOptions.property.service_type"></a>

```python
service_type: ServiceType
```

- *Type:* [`cdk8s_plus_27.ServiceType`](#cdk8s_plus_27.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

### DeploymentProps <a name="cdk8s_plus_27.DeploymentProps"></a>

Properties for `Deployment`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.DeploymentProps(
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None,
  min_ready: Duration = None,
  progress_deadline: Duration = None,
  replicas: typing.Union[int, float] = None,
  strategy: DeploymentStrategy = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.automount_service_account_token"></a>

```python
automount_service_account_token: bool
```

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.dns"></a>

```python
dns: PodDnsProps
```

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.docker_registry_auth"></a>

```python
docker_registry_auth: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.host_aliases"></a>

```python
host_aliases: typing.List[HostAlias]
```

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.host_network"></a>

```python
host_network: bool
```

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.init_containers"></a>

```python
init_containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.isolate"></a>

```python
isolate: bool
```

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.security_context"></a>

```python
security_context: PodSecurityContextProps
```

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.termination_grace_period"></a>

```python
termination_grace_period: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.select"></a>

```python
select: bool
```

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.spread"></a>

```python
spread: bool
```

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `min_ready`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.min_ready"></a>

```python
min_ready: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(0)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

Zero means the pod will be considered available as soon as it is ready.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds

---

##### `progress_deadline`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.progress_deadline"></a>

```python
progress_deadline: Duration
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

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.replicas"></a>

```python
replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 2

Number of desired pods.

---

##### `strategy`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentProps.property.strategy"></a>

```python
strategy: DeploymentStrategy
```

- *Type:* [`cdk8s_plus_27.DeploymentStrategy`](#cdk8s_plus_27.DeploymentStrategy)
- *Default:* RollingUpdate with maxSurge and maxUnavailable set to 25%.

Specifies the strategy used to replace old Pods by new ones.

---

### DeploymentStrategyRollingUpdateOptions <a name="cdk8s_plus_27.DeploymentStrategyRollingUpdateOptions"></a>

Options for `DeploymentStrategy.rollingUpdate`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.DeploymentStrategyRollingUpdateOptions(
  max_surge: PercentOrAbsolute = None,
  max_unavailable: PercentOrAbsolute = None
)
```

##### `max_surge`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentStrategyRollingUpdateOptions.property.max_surge"></a>

```python
max_surge: PercentOrAbsolute
```

- *Type:* [`cdk8s_plus_27.PercentOrAbsolute`](#cdk8s_plus_27.PercentOrAbsolute)
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

##### `max_unavailable`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentStrategyRollingUpdateOptions.property.max_unavailable"></a>

```python
max_unavailable: PercentOrAbsolute
```

- *Type:* [`cdk8s_plus_27.PercentOrAbsolute`](#cdk8s_plus_27.PercentOrAbsolute)
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

### DnsOption <a name="cdk8s_plus_27.DnsOption"></a>

Custom DNS option.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.DnsOption(
  name: str,
  value: str = None
)
```

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.DnsOption.property.name"></a>

```python
name: str
```

- *Type:* `str`

Option name.

---

##### `value`<sup>Optional</sup> <a name="cdk8s_plus_27.DnsOption.property.value"></a>

```python
value: str
```

- *Type:* `str`
- *Default:* No value.

Option value.

---

### DockerConfigSecretProps <a name="cdk8s_plus_27.DockerConfigSecretProps"></a>

Options for `DockerConfigSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.DockerConfigSecretProps(
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  data: typing.Mapping[typing.Any]
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.DockerConfigSecretProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.DockerConfigSecretProps.property.immutable"></a>

```python
immutable: bool
```

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `data`<sup>Required</sup> <a name="cdk8s_plus_27.DockerConfigSecretProps.property.data"></a>

```python
data: typing.Mapping[typing.Any]
```

- *Type:* typing.Mapping[`typing.Any`]

JSON content to provide for the `~/.docker/config.json` file. This will be stringified and inserted as stringData.

> https://docs.docker.com/engine/reference/commandline/cli/#sample-configuration-file

---

### EmptyDirVolumeOptions <a name="cdk8s_plus_27.EmptyDirVolumeOptions"></a>

Options for volumes populated with an empty directory.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EmptyDirVolumeOptions(
  medium: EmptyDirMedium = None,
  size_limit: Size = None
)
```

##### `medium`<sup>Optional</sup> <a name="cdk8s_plus_27.EmptyDirVolumeOptions.property.medium"></a>

```python
medium: EmptyDirMedium
```

- *Type:* [`cdk8s_plus_27.EmptyDirMedium`](#cdk8s_plus_27.EmptyDirMedium)
- *Default:* EmptyDirMedium.DEFAULT

By default, emptyDir volumes are stored on whatever medium is backing the node - that might be disk or SSD or network storage, depending on your environment.

However, you can set the emptyDir.medium field to
`EmptyDirMedium.MEMORY` to tell Kubernetes to mount a tmpfs (RAM-backed
filesystem) for you instead. While tmpfs is very fast, be aware that unlike
disks, tmpfs is cleared on node reboot and any files you write will count
against your Container's memory limit.

---

##### `size_limit`<sup>Optional</sup> <a name="cdk8s_plus_27.EmptyDirVolumeOptions.property.size_limit"></a>

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

### EnvValueFromConfigMapOptions <a name="cdk8s_plus_27.EnvValueFromConfigMapOptions"></a>

Options to specify an envionment variable value from a ConfigMap key.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValueFromConfigMapOptions(
  optional: bool = None
)
```

##### `optional`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromConfigMapOptions.property.optional"></a>

```python
optional: bool
```

- *Type:* `bool`
- *Default:* false

Specify whether the ConfigMap or its key must be defined.

---

### EnvValueFromFieldRefOptions <a name="cdk8s_plus_27.EnvValueFromFieldRefOptions"></a>

Options to specify an environment variable value from a field reference.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValueFromFieldRefOptions(
  api_version: str = None,
  key: str = None
)
```

##### `api_version`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromFieldRefOptions.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

Version of the schema the FieldPath is written in terms of.

---

##### `key`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromFieldRefOptions.property.key"></a>

```python
key: str
```

- *Type:* `str`

The key to select the pod label or annotation.

---

### EnvValueFromProcessOptions <a name="cdk8s_plus_27.EnvValueFromProcessOptions"></a>

Options to specify an environment variable value from the process environment.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValueFromProcessOptions(
  required: bool = None
)
```

##### `required`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromProcessOptions.property.required"></a>

```python
required: bool
```

- *Type:* `bool`
- *Default:* false

Specify whether the key must exist in the environment.

If this is set to true, and the key does not exist, an error will thrown.

---

### EnvValueFromResourceOptions <a name="cdk8s_plus_27.EnvValueFromResourceOptions"></a>

Options to specify an environment variable value from a resource.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValueFromResourceOptions(
  container: Container = None,
  divisor: str = None
)
```

##### `container`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromResourceOptions.property.container"></a>

```python
container: Container
```

- *Type:* [`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)

The container to select the value from.

---

##### `divisor`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromResourceOptions.property.divisor"></a>

```python
divisor: str
```

- *Type:* `str`

The output format of the exposed resource.

---

### EnvValueFromSecretOptions <a name="cdk8s_plus_27.EnvValueFromSecretOptions"></a>

Options to specify an environment variable value from a Secret.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValueFromSecretOptions(
  optional: bool = None
)
```

##### `optional`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromSecretOptions.property.optional"></a>

```python
optional: bool
```

- *Type:* `bool`
- *Default:* false

Specify whether the Secret or its key must be defined.

---

### EphemeralStorageResources <a name="cdk8s_plus_27.EphemeralStorageResources"></a>

Emphemeral storage request and limit.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EphemeralStorageResources(
  limit: Size = None,
  request: Size = None
)
```

##### `limit`<sup>Optional</sup> <a name="cdk8s_plus_27.EphemeralStorageResources.property.limit"></a>

```python
limit: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

---

##### `request`<sup>Optional</sup> <a name="cdk8s_plus_27.EphemeralStorageResources.property.request"></a>

```python
request: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

---

### ExposeDeploymentViaIngressOptions <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions"></a>

Options for exposing a deployment via an ingress.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ExposeDeploymentViaIngressOptions(
  name: str = None,
  ports: typing.List[ServicePort] = None,
  service_type: ServiceType = None,
  ingress: Ingress = None,
  path_type: HttpIngressPathType = None
)
```

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* auto generated.

The name of the service to expose.

If you'd like to expose the deployment multiple times,
you must explicitly set a name starting from the second expose call.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions.property.ports"></a>

```python
ports: typing.List[ServicePort]
```

- *Type:* typing.List[[`cdk8s_plus_27.ServicePort`](#cdk8s_plus_27.ServicePort)]
- *Default:* extracted from the deployment.

The ports that the service should bind to.

---

##### `service_type`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions.property.service_type"></a>

```python
service_type: ServiceType
```

- *Type:* [`cdk8s_plus_27.ServiceType`](#cdk8s_plus_27.ServiceType)
- *Default:* ClusterIP.

The type of the exposed service.

---

##### `ingress`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions.property.ingress"></a>

```python
ingress: Ingress
```

- *Type:* [`cdk8s_plus_27.Ingress`](#cdk8s_plus_27.Ingress)
- *Default:* An ingress will be automatically created.

The ingress to add rules to.

---

##### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeDeploymentViaIngressOptions.property.path_type"></a>

```python
path_type: HttpIngressPathType
```

- *Type:* [`cdk8s_plus_27.HttpIngressPathType`](#cdk8s_plus_27.HttpIngressPathType)
- *Default:* HttpIngressPathType.PREFIX

The type of the path.

---

### ExposeServiceViaIngressOptions <a name="cdk8s_plus_27.ExposeServiceViaIngressOptions"></a>

Options for exposing a service using an ingress.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ExposeServiceViaIngressOptions(
  ingress: Ingress = None,
  path_type: HttpIngressPathType = None
)
```

##### `ingress`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeServiceViaIngressOptions.property.ingress"></a>

```python
ingress: Ingress
```

- *Type:* [`cdk8s_plus_27.Ingress`](#cdk8s_plus_27.Ingress)
- *Default:* An ingress will be automatically created.

The ingress to add rules to.

---

##### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_27.ExposeServiceViaIngressOptions.property.path_type"></a>

```python
path_type: HttpIngressPathType
```

- *Type:* [`cdk8s_plus_27.HttpIngressPathType`](#cdk8s_plus_27.HttpIngressPathType)
- *Default:* HttpIngressPathType.PREFIX

The type of the path.

---

### FromServiceAccountNameOptions <a name="cdk8s_plus_27.FromServiceAccountNameOptions"></a>

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.FromServiceAccountNameOptions(
  namespace_name: str = None
)
```

##### `namespace_name`<sup>Optional</sup> <a name="cdk8s_plus_27.FromServiceAccountNameOptions.property.namespace_name"></a>

```python
namespace_name: str
```

- *Type:* `str`
- *Default:* "default"

The name of the namespace the service account belongs to.

---

### GCEPersistentDiskPersistentVolumeProps <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps"></a>

Properties for `GCEPersistentDiskPersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps(
  metadata: ApiObjectMetadata = None,
  access_modes: typing.List[PersistentVolumeAccessMode] = None,
  claim: IPersistentVolumeClaim = None,
  mount_options: typing.List[str] = None,
  reclaim_policy: PersistentVolumeReclaimPolicy = None,
  storage: Size = None,
  storage_class_name: str = None,
  volume_mode: PersistentVolumeMode = None,
  pd_name: str,
  fs_type: str = None,
  partition: typing.Union[int, float] = None,
  read_only: bool = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.access_modes"></a>

```python
access_modes: typing.List[PersistentVolumeAccessMode]
```

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.claim"></a>

```python
claim: IPersistentVolumeClaim
```

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mount_options`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.mount_options"></a>

```python
mount_options: typing.List[str]
```

- *Type:* typing.List[`str`]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaim_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.reclaim_policy"></a>

```python
reclaim_policy: PersistentVolumeReclaimPolicy
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeReclaimPolicy`](#cdk8s_plus_27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.storage"></a>

```python
storage: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.storage_class_name"></a>

```python
storage_class_name: str
```

- *Type:* `str`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volume_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.volume_mode"></a>

```python
volume_mode: PersistentVolumeMode
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

##### `pd_name`<sup>Required</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.pd_name"></a>

```python
pd_name: str
```

- *Type:* `str`

Unique name of the PD resource in GCE.

Used to identify the disk in GCE.

> https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

---

##### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.fs_type"></a>

```python
fs_type: str
```

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.partition"></a>

```python
partition: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskPersistentVolumeProps.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### GCEPersistentDiskVolumeOptions <a name="cdk8s_plus_27.GCEPersistentDiskVolumeOptions"></a>

Options of `Volume.fromGcePersistentDisk`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.GCEPersistentDiskVolumeOptions(
  fs_type: str = None,
  name: str = None,
  partition: typing.Union[int, float] = None,
  read_only: bool = None
)
```

##### `fs_type`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskVolumeOptions.property.fs_type"></a>

```python
fs_type: str
```

- *Type:* `str`
- *Default:* 'ext4'

Filesystem type of the volume that you want to mount.

Tip: Ensure that the filesystem type is supported by the host operating system.

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskVolumeOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

##### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskVolumeOptions.property.partition"></a>

```python
partition: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* No partition.

The partition in the volume that you want to mount.

If omitted, the default is to mount by volume name.
Examples: For volume /dev/sda1, you specify the partition as "1".
Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.GCEPersistentDiskVolumeOptions.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

> https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

---

### HandlerFromHttpGetOptions <a name="cdk8s_plus_27.HandlerFromHttpGetOptions"></a>

Options for `Handler.fromHttpGet`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.HandlerFromHttpGetOptions(
  port: typing.Union[int, float] = None
)
```

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.HandlerFromHttpGetOptions.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---

### HandlerFromTcpSocketOptions <a name="cdk8s_plus_27.HandlerFromTcpSocketOptions"></a>

Options for `Handler.fromTcpSocket`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.HandlerFromTcpSocketOptions(
  host: str = None,
  port: typing.Union[int, float] = None
)
```

##### `host`<sup>Optional</sup> <a name="cdk8s_plus_27.HandlerFromTcpSocketOptions.property.host"></a>

```python
host: str
```

- *Type:* `str`
- *Default:* defaults to the pod IP

The host name to connect to on the container.

---

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.HandlerFromTcpSocketOptions.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* defaults to `container.port`.

The TCP port to connect to on the container.

---

### HorizontalPodAutoscalerProps <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps"></a>

Properties for HorizontalPodAutoscaler.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.HorizontalPodAutoscalerProps(
  metadata: ApiObjectMetadata = None,
  max_replicas: typing.Union[int, float],
  target: IScalable,
  metrics: typing.List[Metric] = None,
  min_replicas: typing.Union[int, float] = None,
  scale_down: ScalingRules = None,
  scale_up: ScalingRules = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `max_replicas`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.property.max_replicas"></a>

```python
max_replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

The maximum number of replicas that can be scaled up to.

---

##### `target`<sup>Required</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.property.target"></a>

```python
target: IScalable
```

- *Type:* [`cdk8s_plus_27.IScalable`](#cdk8s_plus_27.IScalable)

The workload to scale up or down.

Scalable workload types:

* Deployment
* StatefulSet

---

##### `metrics`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.property.metrics"></a>

```python
metrics: typing.List[Metric]
```

- *Type:* typing.List[[`cdk8s_plus_27.Metric`](#cdk8s_plus_27.Metric)]
- *Default:* If metrics are not provided, then the target resource
constraints (e.g. cpu limit) will be used as scaling metrics.

The metric conditions that trigger a scale up or scale down.

---

##### `min_replicas`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.property.min_replicas"></a>

```python
min_replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1

The minimum number of replicas that can be scaled down to.

Can be set to 0 if the alpha feature gate `HPAScaleToZero` is enabled and
at least one Object or External metric is configured.

---

##### `scale_down`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.property.scale_down"></a>

```python
scale_down: ScalingRules
```

- *Type:* [`cdk8s_plus_27.ScalingRules`](#cdk8s_plus_27.ScalingRules)
- *Default:* Scale down to minReplica count with a 5 minute stabilization window.

The scaling behavior when scaling down.

---

##### `scale_up`<sup>Optional</sup> <a name="cdk8s_plus_27.HorizontalPodAutoscalerProps.property.scale_up"></a>

```python
scale_up: ScalingRules
```

- *Type:* [`cdk8s_plus_27.ScalingRules`](#cdk8s_plus_27.ScalingRules)
- *Default:* Is the higher of:
* Increase no more than 4 pods per 60 seconds
* Double the number of pods per 60 seconds

The scaling behavior when scaling up.

---

### HostAlias <a name="cdk8s_plus_27.HostAlias"></a>

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's /etc/hosts file.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.HostAlias(
  hostnames: typing.List[str],
  ip: str
)
```

##### `hostnames`<sup>Required</sup> <a name="cdk8s_plus_27.HostAlias.property.hostnames"></a>

```python
hostnames: typing.List[str]
```

- *Type:* typing.List[`str`]

Hostnames for the chosen IP address.

---

##### `ip`<sup>Required</sup> <a name="cdk8s_plus_27.HostAlias.property.ip"></a>

```python
ip: str
```

- *Type:* `str`

IP address of the host file entry.

---

### HostPathVolumeOptions <a name="cdk8s_plus_27.HostPathVolumeOptions"></a>

Options for a HostPathVolume-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.HostPathVolumeOptions(
  path: str,
  type: HostPathVolumeType = None
)
```

##### `path`<sup>Required</sup> <a name="cdk8s_plus_27.HostPathVolumeOptions.property.path"></a>

```python
path: str
```

- *Type:* `str`

The path of the directory on the host.

---

##### `type`<sup>Optional</sup> <a name="cdk8s_plus_27.HostPathVolumeOptions.property.type"></a>

```python
type: HostPathVolumeType
```

- *Type:* [`cdk8s_plus_27.HostPathVolumeType`](#cdk8s_plus_27.HostPathVolumeType)
- *Default:* HostPathVolumeType.DEFAULT

The expected type of the path found on the host.

---

### HttpGetProbeOptions <a name="cdk8s_plus_27.HttpGetProbeOptions"></a>

Options for `Probe.fromHttpGet()`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.HttpGetProbeOptions(
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None,
  port: typing.Union[int, float] = None,
  scheme: ConnectionScheme = None
)
```

##### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.property.failure_threshold"></a>

```python
failure_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.property.initial_delay_seconds"></a>

```python
initial_delay_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.property.period_seconds"></a>

```python
period_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.property.success_threshold"></a>

```python
success_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.property.timeout_seconds"></a>

```python
timeout_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---

##### `scheme`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.property.scheme"></a>

```python
scheme: ConnectionScheme
```

- *Type:* [`cdk8s_plus_27.ConnectionScheme`](#cdk8s_plus_27.ConnectionScheme)
- *Default:* ConnectionScheme.HTTP

Scheme to use for connecting to the host (HTTP or HTTPS).

---

### IngressProps <a name="cdk8s_plus_27.IngressProps"></a>

Properties for `Ingress`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.IngressProps(
  metadata: ApiObjectMetadata = None,
  default_backend: IngressBackend = None,
  rules: typing.List[IngressRule] = None,
  tls: typing.List[IngressTls] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `default_backend`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressProps.property.default_backend"></a>

```python
default_backend: IngressBackend
```

- *Type:* [`cdk8s_plus_27.IngressBackend`](#cdk8s_plus_27.IngressBackend)

The default backend services requests that do not match any rule.

Using this option or the `addDefaultBackend()` method is equivalent to
adding a rule with both `path` and `host` undefined.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressProps.property.rules"></a>

```python
rules: typing.List[IngressRule]
```

- *Type:* typing.List[[`cdk8s_plus_27.IngressRule`](#cdk8s_plus_27.IngressRule)]

Routing rules for this ingress.

Each rule must define an `IngressBackend` that will receive the requests
that match this rule. If both `host` and `path` are not specifiec, this
backend will be used as the default backend of the ingress.

You can also add rules later using `addRule()`, `addHostRule()`,
`addDefaultBackend()` and `addHostDefaultBackend()`.

---

##### `tls`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressProps.property.tls"></a>

```python
tls: typing.List[IngressTls]
```

- *Type:* typing.List[[`cdk8s_plus_27.IngressTls`](#cdk8s_plus_27.IngressTls)]

TLS settings for this ingress.

Using this option tells the ingress controller to expose a TLS endpoint.
Currently the Ingress only supports a single TLS port, 443. If multiple
members of this list specify different hosts, they will be multiplexed on
the same port according to the hostname specified through the SNI TLS
extension, if the ingress controller fulfilling the ingress supports SNI.

---

### IngressRule <a name="cdk8s_plus_27.IngressRule"></a>

Represents the rules mapping the paths under a specified host to the related backend services.

Incoming requests are first evaluated for a host match,
then routed to the backend associated with the matching path.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.IngressRule(
  backend: IngressBackend,
  host: str = None,
  path: str = None,
  path_type: HttpIngressPathType = None
)
```

##### `backend`<sup>Required</sup> <a name="cdk8s_plus_27.IngressRule.property.backend"></a>

```python
backend: IngressBackend
```

- *Type:* [`cdk8s_plus_27.IngressBackend`](#cdk8s_plus_27.IngressBackend)

Backend defines the referenced service endpoint to which the traffic will be forwarded to.

---

##### `host`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressRule.property.host"></a>

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

##### `path`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressRule.property.path"></a>

```python
path: str
```

- *Type:* `str`
- *Default:* If unspecified, the path defaults to a catch all sending traffic
to the backend.

Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'.

---

##### `path_type`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressRule.property.path_type"></a>

```python
path_type: HttpIngressPathType
```

- *Type:* [`cdk8s_plus_27.HttpIngressPathType`](#cdk8s_plus_27.HttpIngressPathType)

Specify how the path is matched against request paths.

By default, path
types will be matched by prefix.

> https://kubernetes.io/docs/concepts/services-networking/ingress/#path-types

---

### IngressTls <a name="cdk8s_plus_27.IngressTls"></a>

Represents the TLS configuration mapping that is passed to the ingress controller for SSL termination.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.IngressTls(
  hosts: typing.List[str] = None,
  secret: ISecret = None
)
```

##### `hosts`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressTls.property.hosts"></a>

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

##### `secret`<sup>Optional</sup> <a name="cdk8s_plus_27.IngressTls.property.secret"></a>

```python
secret: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* If unspecified, it allows SSL routing based on SNI hostname.

Secret is the secret that contains the certificate and key used to terminate SSL traffic on 443.

If the SNI host in a listener conflicts with
the "Host" header field used by an IngressRule, the SNI host is used for
termination and value of the Host header is used for routing.

---

### JobProps <a name="cdk8s_plus_27.JobProps"></a>

Properties for `Job`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.JobProps(
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None,
  active_deadline: Duration = None,
  backoff_limit: typing.Union[int, float] = None,
  ttl_after_finished: Duration = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.automount_service_account_token"></a>

```python
automount_service_account_token: bool
```

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.dns"></a>

```python
dns: PodDnsProps
```

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.docker_registry_auth"></a>

```python
docker_registry_auth: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.host_aliases"></a>

```python
host_aliases: typing.List[HostAlias]
```

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.host_network"></a>

```python
host_network: bool
```

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.init_containers"></a>

```python
init_containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.isolate"></a>

```python
isolate: bool
```

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.security_context"></a>

```python
security_context: PodSecurityContextProps
```

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.termination_grace_period"></a>

```python
termination_grace_period: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.select"></a>

```python
select: bool
```

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.spread"></a>

```python
spread: bool
```

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `active_deadline`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.active_deadline"></a>

```python
active_deadline: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* If unset, then there is no deadline.

Specifies the duration the job may be active before the system tries to terminate it.

---

##### `backoff_limit`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.backoff_limit"></a>

```python
backoff_limit: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* If not set, system defaults to 6.

Specifies the number of retries before marking this job failed.

---

##### `ttl_after_finished`<sup>Optional</sup> <a name="cdk8s_plus_27.JobProps.property.ttl_after_finished"></a>

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

### LabelSelectorOptions <a name="cdk8s_plus_27.LabelSelectorOptions"></a>

Options for `LabelSelector.of`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.LabelSelectorOptions(
  expressions: typing.List[LabelExpression] = None,
  labels: typing.Mapping[str] = None
)
```

##### `expressions`<sup>Optional</sup> <a name="cdk8s_plus_27.LabelSelectorOptions.property.expressions"></a>

```python
expressions: typing.List[LabelExpression]
```

- *Type:* typing.List[[`cdk8s_plus_27.LabelExpression`](#cdk8s_plus_27.LabelExpression)]

Expression based label matchers.

---

##### `labels`<sup>Optional</sup> <a name="cdk8s_plus_27.LabelSelectorOptions.property.labels"></a>

```python
labels: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]

Strict label matchers.

---

### LabelSelectorRequirement <a name="cdk8s_plus_27.LabelSelectorRequirement"></a>

A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.LabelSelectorRequirement(
  key: str,
  operator: str,
  values: typing.List[str] = None
)
```

##### `key`<sup>Required</sup> <a name="cdk8s_plus_27.LabelSelectorRequirement.property.key"></a>

```python
key: str
```

- *Type:* `str`

The label key that the selector applies to.

---

##### `operator`<sup>Required</sup> <a name="cdk8s_plus_27.LabelSelectorRequirement.property.operator"></a>

```python
operator: str
```

- *Type:* `str`

Represents a key's relationship to a set of values.

---

##### `values`<sup>Optional</sup> <a name="cdk8s_plus_27.LabelSelectorRequirement.property.values"></a>

```python
values: typing.List[str]
```

- *Type:* typing.List[`str`]

An array of string values.

If the operator is In or NotIn, the values array
must be non-empty. If the operator is Exists or DoesNotExist,
the values array must be empty. This array is replaced during a strategic merge patch.

---

### MemoryResources <a name="cdk8s_plus_27.MemoryResources"></a>

Memory request and limit.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.MemoryResources(
  limit: Size = None,
  request: Size = None
)
```

##### `limit`<sup>Optional</sup> <a name="cdk8s_plus_27.MemoryResources.property.limit"></a>

```python
limit: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

---

##### `request`<sup>Optional</sup> <a name="cdk8s_plus_27.MemoryResources.property.request"></a>

```python
request: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)

---

### MetricContainerResourceOptions <a name="cdk8s_plus_27.MetricContainerResourceOptions"></a>

Options for `Metric.containerResource()`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.MetricContainerResourceOptions(
  container: Container,
  target: MetricTarget
)
```

##### `container`<sup>Required</sup> <a name="cdk8s_plus_27.MetricContainerResourceOptions.property.container"></a>

```python
container: Container
```

- *Type:* [`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)

Container where the metric can be found.

---

##### `target`<sup>Required</sup> <a name="cdk8s_plus_27.MetricContainerResourceOptions.property.target"></a>

```python
target: MetricTarget
```

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

Target metric value that will trigger scaling.

---

### MetricObjectOptions <a name="cdk8s_plus_27.MetricObjectOptions"></a>

Options for `Metric.object()`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.MetricObjectOptions(
  name: str,
  target: MetricTarget,
  label_selector: LabelSelector = None,
  object: IResource
)
```

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.MetricObjectOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`

The name of the metric to scale on.

---

##### `target`<sup>Required</sup> <a name="cdk8s_plus_27.MetricObjectOptions.property.target"></a>

```python
target: MetricTarget
```

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

The target metric value that will trigger scaling.

---

##### `label_selector`<sup>Optional</sup> <a name="cdk8s_plus_27.MetricObjectOptions.property.label_selector"></a>

```python
label_selector: LabelSelector
```

- *Type:* [`cdk8s_plus_27.LabelSelector`](#cdk8s_plus_27.LabelSelector)
- *Default:* Just the metric 'name' will be used to gather metrics.

A selector to find a metric by label.

When set, it is passed as an additional parameter to the metrics server
for more specific metrics scoping.

---

##### `object`<sup>Required</sup> <a name="cdk8s_plus_27.MetricObjectOptions.property.object"></a>

```python
object: IResource
```

- *Type:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource)

Resource where the metric can be found.

---

### MetricOptions <a name="cdk8s_plus_27.MetricOptions"></a>

Base options for a Metric.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.MetricOptions(
  name: str,
  target: MetricTarget,
  label_selector: LabelSelector = None
)
```

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.MetricOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`

The name of the metric to scale on.

---

##### `target`<sup>Required</sup> <a name="cdk8s_plus_27.MetricOptions.property.target"></a>

```python
target: MetricTarget
```

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

The target metric value that will trigger scaling.

---

##### `label_selector`<sup>Optional</sup> <a name="cdk8s_plus_27.MetricOptions.property.label_selector"></a>

```python
label_selector: LabelSelector
```

- *Type:* [`cdk8s_plus_27.LabelSelector`](#cdk8s_plus_27.LabelSelector)
- *Default:* Just the metric 'name' will be used to gather metrics.

A selector to find a metric by label.

When set, it is passed as an additional parameter to the metrics server
for more specific metrics scoping.

---

### MountOptions <a name="cdk8s_plus_27.MountOptions"></a>

Options for mounts.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.MountOptions(
  propagation: MountPropagation = None,
  read_only: bool = None,
  sub_path: str = None,
  sub_path_expr: str = None
)
```

##### `propagation`<sup>Optional</sup> <a name="cdk8s_plus_27.MountOptions.property.propagation"></a>

```python
propagation: MountPropagation
```

- *Type:* [`cdk8s_plus_27.MountPropagation`](#cdk8s_plus_27.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.MountOptions.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

##### `sub_path`<sup>Optional</sup> <a name="cdk8s_plus_27.MountOptions.property.sub_path"></a>

```python
sub_path: str
```

- *Type:* `str`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

##### `sub_path_expr`<sup>Optional</sup> <a name="cdk8s_plus_27.MountOptions.property.sub_path_expr"></a>

```python
sub_path_expr: str
```

- *Type:* `str`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root).

`subPathExpr` and `subPath` are mutually exclusive.

---

### NamespaceProps <a name="cdk8s_plus_27.NamespaceProps"></a>

Properties for `Namespace`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NamespaceProps(
  metadata: ApiObjectMetadata = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.NamespaceProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

### NamespaceSelectorConfig <a name="cdk8s_plus_27.NamespaceSelectorConfig"></a>

Configuration for selecting namespaces.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NamespaceSelectorConfig(
  label_selector: LabelSelector = None,
  names: typing.List[str] = None
)
```

##### `label_selector`<sup>Optional</sup> <a name="cdk8s_plus_27.NamespaceSelectorConfig.property.label_selector"></a>

```python
label_selector: LabelSelector
```

- *Type:* [`cdk8s_plus_27.LabelSelector`](#cdk8s_plus_27.LabelSelector)

A selector to select namespaces by labels.

---

##### `names`<sup>Optional</sup> <a name="cdk8s_plus_27.NamespaceSelectorConfig.property.names"></a>

```python
names: typing.List[str]
```

- *Type:* typing.List[`str`]

A list of names to select namespaces by names.

---

### NamespacesSelectOptions <a name="cdk8s_plus_27.NamespacesSelectOptions"></a>

Options for `Namespaces.select`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NamespacesSelectOptions(
  expressions: typing.List[LabelExpression] = None,
  labels: typing.Mapping[str] = None,
  names: typing.List[str] = None
)
```

##### `expressions`<sup>Optional</sup> <a name="cdk8s_plus_27.NamespacesSelectOptions.property.expressions"></a>

```python
expressions: typing.List[LabelExpression]
```

- *Type:* typing.List[[`cdk8s_plus_27.LabelExpression`](#cdk8s_plus_27.LabelExpression)]
- *Default:* no selector requirements.

Namespaces must satisfy these selectors.

The selectors query labels, just like the `labels` property, but they
provide a more advanced matching mechanism.

---

##### `labels`<sup>Optional</sup> <a name="cdk8s_plus_27.NamespacesSelectOptions.property.labels"></a>

```python
labels: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]
- *Default:* no strict labels requirements.

Labels the namespaces must have.

This is equivalent to using an 'Is' selector.

---

##### `names`<sup>Optional</sup> <a name="cdk8s_plus_27.NamespacesSelectOptions.property.names"></a>

```python
names: typing.List[str]
```

- *Type:* typing.List[`str`]
- *Default:* no name requirements.

Namespaces names must be one of these.

---

### NetworkPolicyAddEgressRuleOptions <a name="cdk8s_plus_27.NetworkPolicyAddEgressRuleOptions"></a>

Options for `NetworkPolicy.addEgressRule`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyAddEgressRuleOptions(
  ports: typing.List[NetworkPolicyPort] = None
)
```

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyAddEgressRuleOptions.property.ports"></a>

```python
ports: typing.List[NetworkPolicyPort]
```

- *Type:* typing.List[[`cdk8s_plus_27.NetworkPolicyPort`](#cdk8s_plus_27.NetworkPolicyPort)]
- *Default:* If the peer is a managed pod, take its ports. Otherwise, all ports are allowed.

Ports the rule should allow outgoing traffic to.

---

### NetworkPolicyPeerConfig <a name="cdk8s_plus_27.NetworkPolicyPeerConfig"></a>

Configuration for network peers.

A peer can either by an ip block, or a selection of pods, not both.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyPeerConfig(
  ip_block: NetworkPolicyIpBlock = None,
  pod_selector: PodSelectorConfig = None
)
```

##### `ip_block`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyPeerConfig.property.ip_block"></a>

```python
ip_block: NetworkPolicyIpBlock
```

- *Type:* [`cdk8s_plus_27.NetworkPolicyIpBlock`](#cdk8s_plus_27.NetworkPolicyIpBlock)

The ip block this peer represents.

---

##### `pod_selector`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyPeerConfig.property.pod_selector"></a>

```python
pod_selector: PodSelectorConfig
```

- *Type:* [`cdk8s_plus_27.PodSelectorConfig`](#cdk8s_plus_27.PodSelectorConfig)

The pod selector this peer represents.

---

### NetworkPolicyPortProps <a name="cdk8s_plus_27.NetworkPolicyPortProps"></a>

Properties for `NetworkPolicyPort`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyPortProps(
  end_port: typing.Union[int, float] = None,
  port: typing.Union[int, float] = None,
  protocol: NetworkProtocol = None
)
```

##### `end_port`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyPortProps.property.end_port"></a>

```python
end_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* not a port range.

End port (relative to `port`).

Only applies if `port` is defined.
Use this to specify a port range, rather that a specific one.

---

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyPortProps.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* all ports are allowed.

Specific port number.

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyPortProps.property.protocol"></a>

```python
protocol: NetworkProtocol
```

- *Type:* [`cdk8s_plus_27.NetworkProtocol`](#cdk8s_plus_27.NetworkProtocol)
- *Default:* NetworkProtocol.TCP

Protocol.

---

### NetworkPolicyProps <a name="cdk8s_plus_27.NetworkPolicyProps"></a>

Properties for `NetworkPolicy`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyProps(
  metadata: ApiObjectMetadata = None,
  egress: NetworkPolicyTraffic = None,
  ingress: NetworkPolicyTraffic = None,
  selector: IPodSelector = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `egress`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyProps.property.egress"></a>

```python
egress: NetworkPolicyTraffic
```

- *Type:* [`cdk8s_plus_27.NetworkPolicyTraffic`](#cdk8s_plus_27.NetworkPolicyTraffic)
- *Default:* the policy doesn't change egress behavior of the pods it selects.

Egress traffic configuration.

---

##### `ingress`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyProps.property.ingress"></a>

```python
ingress: NetworkPolicyTraffic
```

- *Type:* [`cdk8s_plus_27.NetworkPolicyTraffic`](#cdk8s_plus_27.NetworkPolicyTraffic)
- *Default:* the policy doesn't change ingress behavior of the pods it selects.

Ingress traffic configuration.

---

##### `selector`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyProps.property.selector"></a>

```python
selector: IPodSelector
```

- *Type:* [`cdk8s_plus_27.IPodSelector`](#cdk8s_plus_27.IPodSelector)
- *Default:* will select all pods in the namespace of the policy.

Which pods does this policy object applies to.

This can either be a single pod / workload, or a grouping of pods selected
via the `Pods.select` function. Rules is applied to any pods selected by this property.
Multiple network policies can select the same set of pods.
In this case, the rules for each are combined additively.

Note that

---

### NetworkPolicyRule <a name="cdk8s_plus_27.NetworkPolicyRule"></a>

Describes a rule allowing traffic from / to pods matched by a network policy selector.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyRule(
  peer: INetworkPolicyPeer,
  ports: typing.List[NetworkPolicyPort] = None
)
```

##### `peer`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyRule.property.peer"></a>

```python
peer: INetworkPolicyPeer
```

- *Type:* [`cdk8s_plus_27.INetworkPolicyPeer`](#cdk8s_plus_27.INetworkPolicyPeer)

Peer this rule interacts with.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyRule.property.ports"></a>

```python
ports: typing.List[NetworkPolicyPort]
```

- *Type:* typing.List[[`cdk8s_plus_27.NetworkPolicyPort`](#cdk8s_plus_27.NetworkPolicyPort)]
- *Default:* traffic is allowed on all ports.

The ports of the rule.

---

### NetworkPolicyTraffic <a name="cdk8s_plus_27.NetworkPolicyTraffic"></a>

Describes how the network policy should configure egress / ingress traffic.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyTraffic(
  default: NetworkPolicyTrafficDefault = None,
  rules: typing.List[NetworkPolicyRule] = None
)
```

##### `default`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyTraffic.property.default"></a>

```python
default: NetworkPolicyTrafficDefault
```

- *Type:* [`cdk8s_plus_27.NetworkPolicyTrafficDefault`](#cdk8s_plus_27.NetworkPolicyTrafficDefault)
- *Default:* unset, the policy does not change the behavior.

Specifies the default behavior of the policy when no rules are defined.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyTraffic.property.rules"></a>

```python
rules: typing.List[NetworkPolicyRule]
```

- *Type:* typing.List[[`cdk8s_plus_27.NetworkPolicyRule`](#cdk8s_plus_27.NetworkPolicyRule)]
- *Default:* no rules

List of rules to be applied to the selected pods.

If empty, the behavior of the policy is dictated by the `default` property.

---

### NfsVolumeOptions <a name="cdk8s_plus_27.NfsVolumeOptions"></a>

Options for the NFS based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NfsVolumeOptions(
  path: str,
  server: str,
  read_only: bool = None
)
```

##### `path`<sup>Required</sup> <a name="cdk8s_plus_27.NfsVolumeOptions.property.path"></a>

```python
path: str
```

- *Type:* `str`

Path that is exported by the NFS server.

---

##### `server`<sup>Required</sup> <a name="cdk8s_plus_27.NfsVolumeOptions.property.server"></a>

```python
server: str
```

- *Type:* `str`

Server is the hostname or IP address of the NFS server.

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.NfsVolumeOptions.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

If set to true, will force the NFS export to be mounted with read-only permissions.

---

### NodeTaintQueryOptions <a name="cdk8s_plus_27.NodeTaintQueryOptions"></a>

Options for `NodeTaintQuery`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeTaintQueryOptions(
  effect: TaintEffect = None,
  evict_after: Duration = None
)
```

##### `effect`<sup>Optional</sup> <a name="cdk8s_plus_27.NodeTaintQueryOptions.property.effect"></a>

```python
effect: TaintEffect
```

- *Type:* [`cdk8s_plus_27.TaintEffect`](#cdk8s_plus_27.TaintEffect)
- *Default:* all effects are matched.

The taint effect to match.

---

##### `evict_after`<sup>Optional</sup> <a name="cdk8s_plus_27.NodeTaintQueryOptions.property.evict_after"></a>

```python
evict_after: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* bound forever.

How much time should a pod that tolerates the `NO_EXECUTE` effect be bound to the node.

Only applies for the `NO_EXECUTE` effect.

---

### PathMapping <a name="cdk8s_plus_27.PathMapping"></a>

Maps a string key to a path within a volume.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PathMapping(
  path: str,
  mode: typing.Union[int, float] = None
)
```

##### `path`<sup>Required</sup> <a name="cdk8s_plus_27.PathMapping.property.path"></a>

```python
path: str
```

- *Type:* `str`

The relative path of the file to map the key to.

May not be an absolute
path. May not contain the path element '..'. May not start with the string
'..'.

---

##### `mode`<sup>Optional</sup> <a name="cdk8s_plus_27.PathMapping.property.mode"></a>

```python
mode: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

Optional: mode bits to use on this file, must be a value between 0 and 0777.

If not specified, the volume defaultMode will be used. This might be
in conflict with other options that affect the file mode, like fsGroup, and
the result can be other mode bits set.

---

### PersistentVolumeClaimProps <a name="cdk8s_plus_27.PersistentVolumeClaimProps"></a>

Properties for `PersistentVolumeClaim`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PersistentVolumeClaimProps(
  metadata: ApiObjectMetadata = None,
  access_modes: typing.List[PersistentVolumeAccessMode] = None,
  storage: Size = None,
  storage_class_name: str = None,
  volume: IPersistentVolume = None,
  volume_mode: PersistentVolumeMode = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.property.access_modes"></a>

```python
access_modes: typing.List[PersistentVolumeAccessMode]
```

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]
- *Default:* No access modes requirement.

Contains the access modes the volume should support.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.property.storage"></a>

```python
storage: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No storage requirement.

Minimum storage size the volume should have.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.property.storage_class_name"></a>

```python
storage_class_name: str
```

- *Type:* `str`
- *Default:* Not set.

Name of the StorageClass required by the claim. When this property is not set, the behavior is as follows:.

* If the admission plugin is turned on, the storage class marked as default will be used.
* If the admission plugin is turned off, the pvc can only be bound to volumes without a storage class.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1

---

##### `volume`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.property.volume"></a>

```python
volume: IPersistentVolume
```

- *Type:* [`cdk8s_plus_27.IPersistentVolume`](#cdk8s_plus_27.IPersistentVolume)
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

##### `volume_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimProps.property.volume_mode"></a>

```python
volume_mode: PersistentVolumeMode
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

### PersistentVolumeClaimVolumeOptions <a name="cdk8s_plus_27.PersistentVolumeClaimVolumeOptions"></a>

Options for a PersistentVolumeClaim-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PersistentVolumeClaimVolumeOptions(
  name: str = None,
  read_only: bool = None
)
```

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimVolumeOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* Derived from the PVC name.

The volume name.

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeClaimVolumeOptions.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Will force the ReadOnly setting in VolumeMounts.

---

### PersistentVolumeProps <a name="cdk8s_plus_27.PersistentVolumeProps"></a>

Properties for `PersistentVolume`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PersistentVolumeProps(
  metadata: ApiObjectMetadata = None,
  access_modes: typing.List[PersistentVolumeAccessMode] = None,
  claim: IPersistentVolumeClaim = None,
  mount_options: typing.List[str] = None,
  reclaim_policy: PersistentVolumeReclaimPolicy = None,
  storage: Size = None,
  storage_class_name: str = None,
  volume_mode: PersistentVolumeMode = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `access_modes`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.property.access_modes"></a>

```python
access_modes: typing.List[PersistentVolumeAccessMode]
```

- *Type:* typing.List[[`cdk8s_plus_27.PersistentVolumeAccessMode`](#cdk8s_plus_27.PersistentVolumeAccessMode)]
- *Default:* No access modes.

Contains all ways the volume can be mounted.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes

---

##### `claim`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.property.claim"></a>

```python
claim: IPersistentVolumeClaim
```

- *Type:* [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)
- *Default:* Not bound to a specific claim.

Part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.

Expected to be non-nil when bound.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding

---

##### `mount_options`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.property.mount_options"></a>

```python
mount_options: typing.List[str]
```

- *Type:* typing.List[`str`]
- *Default:* No options.

A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options

---

##### `reclaim_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.property.reclaim_policy"></a>

```python
reclaim_policy: PersistentVolumeReclaimPolicy
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeReclaimPolicy`](#cdk8s_plus_27.PersistentVolumeReclaimPolicy)
- *Default:* PersistentVolumeReclaimPolicy.RETAIN

When a user is done with their volume, they can delete the PVC objects from the API that allows reclamation of the resource.

The reclaim policy tells the cluster what to do with
the volume after it has been released of its claim.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming

---

##### `storage`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.property.storage"></a>

```python
storage: Size
```

- *Type:* [`cdk8s.Size`](#cdk8s.Size)
- *Default:* No specified.

What is the storage capacity of this volume.

> https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources

---

##### `storage_class_name`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.property.storage_class_name"></a>

```python
storage_class_name: str
```

- *Type:* `str`
- *Default:* Volume does not belong to any storage class.

Name of StorageClass to which this persistent volume belongs.

---

##### `volume_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.PersistentVolumeProps.property.volume_mode"></a>

```python
volume_mode: PersistentVolumeMode
```

- *Type:* [`cdk8s_plus_27.PersistentVolumeMode`](#cdk8s_plus_27.PersistentVolumeMode)
- *Default:* VolumeMode.FILE_SYSTEM

Defines what type of volume is required by the claim.

---

### PodConnectionsAllowFromOptions <a name="cdk8s_plus_27.PodConnectionsAllowFromOptions"></a>

Options for `PodConnections.allowFrom`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodConnectionsAllowFromOptions(
  isolation: PodConnectionsIsolation = None,
  ports: typing.List[NetworkPolicyPort] = None
)
```

##### `isolation`<sup>Optional</sup> <a name="cdk8s_plus_27.PodConnectionsAllowFromOptions.property.isolation"></a>

```python
isolation: PodConnectionsIsolation
```

- *Type:* [`cdk8s_plus_27.PodConnectionsIsolation`](#cdk8s_plus_27.PodConnectionsIsolation)
- *Default:* unset, isolates both the pod and the peer.

Which isolation should be applied to establish the connection.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.PodConnectionsAllowFromOptions.property.ports"></a>

```python
ports: typing.List[NetworkPolicyPort]
```

- *Type:* typing.List[[`cdk8s_plus_27.NetworkPolicyPort`](#cdk8s_plus_27.NetworkPolicyPort)]
- *Default:* The pod ports.

Ports to allow incoming traffic to.

---

### PodConnectionsAllowToOptions <a name="cdk8s_plus_27.PodConnectionsAllowToOptions"></a>

Options for `PodConnections.allowTo`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodConnectionsAllowToOptions(
  isolation: PodConnectionsIsolation = None,
  ports: typing.List[NetworkPolicyPort] = None
)
```

##### `isolation`<sup>Optional</sup> <a name="cdk8s_plus_27.PodConnectionsAllowToOptions.property.isolation"></a>

```python
isolation: PodConnectionsIsolation
```

- *Type:* [`cdk8s_plus_27.PodConnectionsIsolation`](#cdk8s_plus_27.PodConnectionsIsolation)
- *Default:* unset, isolates both the pod and the peer.

Which isolation should be applied to establish the connection.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.PodConnectionsAllowToOptions.property.ports"></a>

```python
ports: typing.List[NetworkPolicyPort]
```

- *Type:* typing.List[[`cdk8s_plus_27.NetworkPolicyPort`](#cdk8s_plus_27.NetworkPolicyPort)]
- *Default:* If the peer is a managed pod, take its ports. Otherwise, all ports are allowed.

Ports to allow outgoing traffic to.

---

### PodDnsProps <a name="cdk8s_plus_27.PodDnsProps"></a>

Properties for `PodDns`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodDnsProps(
  hostname: str = None,
  hostname_as_fqd_n: bool = None,
  nameservers: typing.List[str] = None,
  options: typing.List[DnsOption] = None,
  policy: DnsPolicy = None,
  searches: typing.List[str] = None,
  subdomain: str = None
)
```

##### `hostname`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.property.hostname"></a>

```python
hostname: str
```

- *Type:* `str`
- *Default:* Set to a system-defined value.

Specifies the hostname of the Pod.

---

##### `hostname_as_fqd_n`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.property.hostname_as_fqd_n"></a>

```python
hostname_as_fqd_n: bool
```

- *Type:* `bool`
- *Default:* false

If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default).

In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname).
In Windows containers, this means setting the registry value of hostname for the registry
key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN.
If a pod does not have FQDN, this has no effect.

---

##### `nameservers`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.property.nameservers"></a>

```python
nameservers: typing.List[str]
```

- *Type:* typing.List[`str`]

A list of IP addresses that will be used as DNS servers for the Pod.

There can be at most 3 IP addresses specified.
When the policy is set to "NONE", the list must contain at least one IP address,
otherwise this property is optional.
The servers listed will be combined to the base nameservers generated from
the specified DNS policy with duplicate addresses removed.

---

##### `options`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.property.options"></a>

```python
options: typing.List[DnsOption]
```

- *Type:* typing.List[[`cdk8s_plus_27.DnsOption`](#cdk8s_plus_27.DnsOption)]

List of objects where each object may have a name property (required) and a value property (optional).

The contents in this property
will be merged to the options generated from the specified DNS policy.
Duplicate entries are removed.

---

##### `policy`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.property.policy"></a>

```python
policy: DnsPolicy
```

- *Type:* [`cdk8s_plus_27.DnsPolicy`](#cdk8s_plus_27.DnsPolicy)
- *Default:* DnsPolicy.CLUSTER_FIRST

Set DNS policy for the pod.

If policy is set to `None`, other configuration must be supplied.

---

##### `searches`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.property.searches"></a>

```python
searches: typing.List[str]
```

- *Type:* typing.List[`str`]

A list of DNS search domains for hostname lookup in the Pod.

When specified, the provided list will be merged into the base
search domain names generated from the chosen DNS policy.
Duplicate domain names are removed.

Kubernetes allows for at most 6 search domains.

---

##### `subdomain`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.property.subdomain"></a>

```python
subdomain: str
```

- *Type:* `str`
- *Default:* No subdomain.

If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>".

---

### PodProps <a name="cdk8s_plus_27.PodProps"></a>

Properties for `Pod`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodProps(
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.automount_service_account_token"></a>

```python
automount_service_account_token: bool
```

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.dns"></a>

```python
dns: PodDnsProps
```

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.docker_registry_auth"></a>

```python
docker_registry_auth: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.host_aliases"></a>

```python
host_aliases: typing.List[HostAlias]
```

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.host_network"></a>

```python
host_network: bool
```

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.init_containers"></a>

```python
init_containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.isolate"></a>

```python
isolate: bool
```

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.security_context"></a>

```python
security_context: PodSecurityContextProps
```

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.termination_grace_period"></a>

```python
termination_grace_period: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.PodProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

### PodsAllOptions <a name="cdk8s_plus_27.PodsAllOptions"></a>

Options for `Pods.all`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodsAllOptions(
  namespaces: Namespaces = None
)
```

##### `namespaces`<sup>Optional</sup> <a name="cdk8s_plus_27.PodsAllOptions.property.namespaces"></a>

```python
namespaces: Namespaces
```

- *Type:* [`cdk8s_plus_27.Namespaces`](#cdk8s_plus_27.Namespaces)
- *Default:* unset, implies the namespace of the resource this selection is used in.

Namespaces the pods are allowed to be in.

Use `Namespaces.all()` to allow all namespaces.

---

### PodSchedulingAttractOptions <a name="cdk8s_plus_27.PodSchedulingAttractOptions"></a>

Options for `PodScheduling.attract`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodSchedulingAttractOptions(
  weight: typing.Union[int, float] = None
)
```

##### `weight`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSchedulingAttractOptions.property.weight"></a>

```python
weight: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* no weight. assignment is assumed to be required (hard).

Indicates the attraction is optional (soft), with this weight score.

---

### PodSchedulingColocateOptions <a name="cdk8s_plus_27.PodSchedulingColocateOptions"></a>

Options for `PodScheduling.colocate`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodSchedulingColocateOptions(
  topology: Topology = None,
  weight: typing.Union[int, float] = None
)
```

##### `topology`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSchedulingColocateOptions.property.topology"></a>

```python
topology: Topology
```

- *Type:* [`cdk8s_plus_27.Topology`](#cdk8s_plus_27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to coloate on.

---

##### `weight`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSchedulingColocateOptions.property.weight"></a>

```python
weight: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* no weight. co-location is assumed to be required (hard).

Indicates the co-location is optional (soft), with this weight score.

---

### PodSchedulingSeparateOptions <a name="cdk8s_plus_27.PodSchedulingSeparateOptions"></a>

Options for `PodScheduling.separate`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodSchedulingSeparateOptions(
  topology: Topology = None,
  weight: typing.Union[int, float] = None
)
```

##### `topology`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSchedulingSeparateOptions.property.topology"></a>

```python
topology: Topology
```

- *Type:* [`cdk8s_plus_27.Topology`](#cdk8s_plus_27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to separate on.

---

##### `weight`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSchedulingSeparateOptions.property.weight"></a>

```python
weight: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* no weight. separation is assumed to be required (hard).

Indicates the separation is optional (soft), with this weight score.

---

### PodSecurityContextProps <a name="cdk8s_plus_27.PodSecurityContextProps"></a>

Properties for `PodSecurityContext`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodSecurityContextProps(
  ensure_non_root: bool = None,
  fs_group: typing.Union[int, float] = None,
  fs_group_change_policy: FsGroupChangePolicy = None,
  group: typing.Union[int, float] = None,
  sysctls: typing.List[Sysctl] = None,
  user: typing.Union[int, float] = None
)
```

##### `ensure_non_root`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.property.ensure_non_root"></a>

```python
ensure_non_root: bool
```

- *Type:* `bool`
- *Default:* true

Indicates that the container must run as a non-root user.

If true, the Kubelet will validate the image at runtime to ensure that it does
not run as UID 0 (root) and fail to start the container if it does.

---

##### `fs_group`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.property.fs_group"></a>

```python
fs_group: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* Volume ownership is not changed.

Modify the ownership and permissions of pod volumes to this GID.

---

##### `fs_group_change_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.property.fs_group_change_policy"></a>

```python
fs_group_change_policy: FsGroupChangePolicy
```

- *Type:* [`cdk8s_plus_27.FsGroupChangePolicy`](#cdk8s_plus_27.FsGroupChangePolicy)
- *Default:* FsGroupChangePolicy.ALWAYS

Defines behavior of changing ownership and permission of the volume before being exposed inside Pod.

This field will only apply to volume types which support fsGroup based ownership(and permissions).
It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir.

---

##### `group`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.property.group"></a>

```python
group: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* Group configured by container runtime

The GID to run the entrypoint of the container process.

---

##### `sysctls`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.property.sysctls"></a>

```python
sysctls: typing.List[Sysctl]
```

- *Type:* typing.List[[`cdk8s_plus_27.Sysctl`](#cdk8s_plus_27.Sysctl)]
- *Default:* No sysctls

Sysctls hold a list of namespaced sysctls used for the pod.

Pods with unsupported sysctls (by the container runtime) might fail to launch.

---

##### `user`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.property.user"></a>

```python
user: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* User specified in image metadata

The UID to run the entrypoint of the container process.

---

### PodSelectorConfig <a name="cdk8s_plus_27.PodSelectorConfig"></a>

Configuration for selecting pods, optionally in particular namespaces.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodSelectorConfig(
  label_selector: LabelSelector,
  namespaces: NamespaceSelectorConfig = None
)
```

##### `label_selector`<sup>Required</sup> <a name="cdk8s_plus_27.PodSelectorConfig.property.label_selector"></a>

```python
label_selector: LabelSelector
```

- *Type:* [`cdk8s_plus_27.LabelSelector`](#cdk8s_plus_27.LabelSelector)

A selector to select pods by labels.

---

##### `namespaces`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSelectorConfig.property.namespaces"></a>

```python
namespaces: NamespaceSelectorConfig
```

- *Type:* [`cdk8s_plus_27.NamespaceSelectorConfig`](#cdk8s_plus_27.NamespaceSelectorConfig)

Configuration for selecting which namepsaces are the pods allowed to be in.

---

### PodsSelectOptions <a name="cdk8s_plus_27.PodsSelectOptions"></a>

Options for `Pods.select`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodsSelectOptions(
  expressions: typing.List[LabelExpression] = None,
  labels: typing.Mapping[str] = None,
  namespaces: Namespaces = None
)
```

##### `expressions`<sup>Optional</sup> <a name="cdk8s_plus_27.PodsSelectOptions.property.expressions"></a>

```python
expressions: typing.List[LabelExpression]
```

- *Type:* typing.List[[`cdk8s_plus_27.LabelExpression`](#cdk8s_plus_27.LabelExpression)]
- *Default:* no expressions requirements.

Expressions the pods must satisify.

---

##### `labels`<sup>Optional</sup> <a name="cdk8s_plus_27.PodsSelectOptions.property.labels"></a>

```python
labels: typing.Mapping[str]
```

- *Type:* typing.Mapping[`str`]
- *Default:* no strict labels requirements.

Labels the pods must have.

---

##### `namespaces`<sup>Optional</sup> <a name="cdk8s_plus_27.PodsSelectOptions.property.namespaces"></a>

```python
namespaces: Namespaces
```

- *Type:* [`cdk8s_plus_27.Namespaces`](#cdk8s_plus_27.Namespaces)
- *Default:* unset, implies the namespace of the resource this selection is used in.

Namespaces the pods are allowed to be in.

Use `Namespaces.all()` to allow all namespaces.

---

### ProbeOptions <a name="cdk8s_plus_27.ProbeOptions"></a>

Probe options.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ProbeOptions(
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None
)
```

##### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.ProbeOptions.property.failure_threshold"></a>

```python
failure_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.ProbeOptions.property.initial_delay_seconds"></a>

```python
initial_delay_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.ProbeOptions.property.period_seconds"></a>

```python
period_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.ProbeOptions.property.success_threshold"></a>

```python
success_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.ProbeOptions.property.timeout_seconds"></a>

```python
timeout_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

### ResourceProps <a name="cdk8s_plus_27.ResourceProps"></a>

Initialization properties for resources.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ResourceProps(
  metadata: ApiObjectMetadata = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ResourceProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

### RoleBindingProps <a name="cdk8s_plus_27.RoleBindingProps"></a>

Properties for `RoleBinding`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.RoleBindingProps(
  metadata: ApiObjectMetadata = None,
  role: IRole
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.RoleBindingProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `role`<sup>Required</sup> <a name="cdk8s_plus_27.RoleBindingProps.property.role"></a>

```python
role: IRole
```

- *Type:* [`cdk8s_plus_27.IRole`](#cdk8s_plus_27.IRole)

The role to bind to.

A RoleBinding can reference a Role or a ClusterRole.

---

### RolePolicyRule <a name="cdk8s_plus_27.RolePolicyRule"></a>

Policy rule of a `Role.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.RolePolicyRule(
  resources: typing.List[IApiResource],
  verbs: typing.List[str]
)
```

##### `resources`<sup>Required</sup> <a name="cdk8s_plus_27.RolePolicyRule.property.resources"></a>

```python
resources: typing.List[IApiResource]
```

- *Type:* typing.List[[`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)]

Resources this rule applies to.

---

##### `verbs`<sup>Required</sup> <a name="cdk8s_plus_27.RolePolicyRule.property.verbs"></a>

```python
verbs: typing.List[str]
```

- *Type:* typing.List[`str`]

Verbs to allow.

(e.g ['get', 'watch'])

---

### RoleProps <a name="cdk8s_plus_27.RoleProps"></a>

Properties for `Role`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.RoleProps(
  metadata: ApiObjectMetadata = None,
  rules: typing.List[RolePolicyRule] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.RoleProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `rules`<sup>Optional</sup> <a name="cdk8s_plus_27.RoleProps.property.rules"></a>

```python
rules: typing.List[RolePolicyRule]
```

- *Type:* typing.List[[`cdk8s_plus_27.RolePolicyRule`](#cdk8s_plus_27.RolePolicyRule)]
- *Default:* []

A list of rules the role should allow.

---

### ScalingPolicy <a name="cdk8s_plus_27.ScalingPolicy"></a>

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ScalingPolicy(
  replicas: Replicas,
  duration: Duration = None
)
```

##### `replicas`<sup>Required</sup> <a name="cdk8s_plus_27.ScalingPolicy.property.replicas"></a>

```python
replicas: Replicas
```

- *Type:* [`cdk8s_plus_27.Replicas`](#cdk8s_plus_27.Replicas)

The type and quantity of replicas to change.

---

##### `duration`<sup>Optional</sup> <a name="cdk8s_plus_27.ScalingPolicy.property.duration"></a>

```python
duration: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* 15 seconds

The amount of time the scaling policy has to continue scaling before the target metric must be revalidated.

Must be greater than 0 seconds and no longer than 30 minutes.

---

### ScalingRules <a name="cdk8s_plus_27.ScalingRules"></a>

Defines the scaling behavior for one direction.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ScalingRules(
  policies: typing.List[ScalingPolicy] = None,
  stabilization_window: Duration = None,
  strategy: ScalingStrategy = None
)
```

##### `policies`<sup>Optional</sup> <a name="cdk8s_plus_27.ScalingRules.property.policies"></a>

```python
policies: typing.List[ScalingPolicy]
```

- *Type:* typing.List[[`cdk8s_plus_27.ScalingPolicy`](#cdk8s_plus_27.ScalingPolicy)]
- *Default:* * Scale up
  * Increase no more than 4 pods per 60 seconds
  * Double the number of pods per 60 seconds
* Scale down
  * Decrease to minReplica count

The scaling policies.

---

##### `stabilization_window`<sup>Optional</sup> <a name="cdk8s_plus_27.ScalingRules.property.stabilization_window"></a>

```python
stabilization_window: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* * On scale down no stabilization is performed.
* On scale up stabilization is performed for 5 minutes.

Defines the window of past metrics that the autoscaler should consider when calculating wether or not autoscaling should occur.

Minimum duration is 1 second, max is 1 hour.

---

##### `strategy`<sup>Optional</sup> <a name="cdk8s_plus_27.ScalingRules.property.strategy"></a>

```python
strategy: ScalingStrategy
```

- *Type:* [`cdk8s_plus_27.ScalingStrategy`](#cdk8s_plus_27.ScalingStrategy)
- *Default:* MAX_CHANGE

The strategy to use when scaling.

---

### ScalingTarget <a name="cdk8s_plus_27.ScalingTarget"></a>

Properties used to configure the target of an Autoscaler.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ScalingTarget(
  api_version: str,
  containers: typing.List[Container],
  kind: str,
  name: str,
  replicas: typing.Union[int, float] = None
)
```

##### `api_version`<sup>Required</sup> <a name="cdk8s_plus_27.ScalingTarget.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `containers`<sup>Required</sup> <a name="cdk8s_plus_27.ScalingTarget.property.containers"></a>

```python
containers: typing.List[Container]
```

- *Type:* typing.List[[`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)]

Container definitions associated with the target.

---

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.ScalingTarget.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.ScalingTarget.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_27.ScalingTarget.property.replicas"></a>

```python
replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

The fixed number of replicas defined on the target.

This is used
for validation purposes as Scalable targets should not have a
fixed number of replicas.

---

### SecretProps <a name="cdk8s_plus_27.SecretProps"></a>

Options for `Secret`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.SecretProps(
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  string_data: typing.Mapping[str] = None,
  type: str = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretProps.property.immutable"></a>

```python
immutable: bool
```

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `string_data`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretProps.property.string_data"></a>

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

##### `type`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretProps.property.type"></a>

```python
type: str
```

- *Type:* `str`
- *Default:* undefined - Don't set a type.

Optional type associated with the secret.

Used to facilitate programmatic
handling of secret data by various controllers.

---

### SecretValue <a name="cdk8s_plus_27.SecretValue"></a>

Represents a specific value in JSON secret.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.SecretValue(
  key: str,
  secret: ISecret
)
```

##### `key`<sup>Required</sup> <a name="cdk8s_plus_27.SecretValue.property.key"></a>

```python
key: str
```

- *Type:* `str`

The JSON key.

---

##### `secret`<sup>Required</sup> <a name="cdk8s_plus_27.SecretValue.property.secret"></a>

```python
secret: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)

The secret.

---

### SecretVolumeOptions <a name="cdk8s_plus_27.SecretVolumeOptions"></a>

Options for the Secret-based volume.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.SecretVolumeOptions(
  default_mode: typing.Union[int, float] = None,
  items: typing.Mapping[PathMapping] = None,
  name: str = None,
  optional: bool = None
)
```

##### `default_mode`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretVolumeOptions.property.default_mode"></a>

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

##### `items`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretVolumeOptions.property.items"></a>

```python
items: typing.Mapping[PathMapping]
```

- *Type:* typing.Mapping[[`cdk8s_plus_27.PathMapping`](#cdk8s_plus_27.PathMapping)]
- *Default:* no mapping

If unspecified, each key-value pair in the Data field of the referenced secret will be projected into the volume as a file whose name is the key and content is the value.

If specified, the listed keys will be projected
into the specified paths, and unlisted keys will not be present. If a key
is specified which is not present in the secret, the volume setup will
error unless it is marked optional. Paths must be relative and may not
contain the '..' path or start with '..'.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretVolumeOptions.property.name"></a>

```python
name: str
```

- *Type:* `str`
- *Default:* auto-generated

The volume name.

---

##### `optional`<sup>Optional</sup> <a name="cdk8s_plus_27.SecretVolumeOptions.property.optional"></a>

```python
optional: bool
```

- *Type:* `bool`
- *Default:* undocumented

Specify whether the secret or its keys must be defined.

---

### ServiceAccountProps <a name="cdk8s_plus_27.ServiceAccountProps"></a>

Properties for initialization of `ServiceAccount`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ServiceAccountProps(
  metadata: ApiObjectMetadata = None,
  automount_token: bool = None,
  secrets: typing.List[ISecret] = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceAccountProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_token`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceAccountProps.property.automount_token"></a>

```python
automount_token: bool
```

- *Type:* `bool`
- *Default:* false

Indicates whether pods running as this service account should have an API token automatically mounted.

Can be overridden at the pod level.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `secrets`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceAccountProps.property.secrets"></a>

```python
secrets: typing.List[ISecret]
```

- *Type:* typing.List[[`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)]

List of secrets allowed to be used by pods running using this ServiceAccount.

> https://kubernetes.io/docs/concepts/configuration/secret

---

### ServiceAccountTokenSecretProps <a name="cdk8s_plus_27.ServiceAccountTokenSecretProps"></a>

Options for `ServiceAccountTokenSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ServiceAccountTokenSecretProps(
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  service_account: IServiceAccount
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceAccountTokenSecretProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceAccountTokenSecretProps.property.immutable"></a>

```python
immutable: bool
```

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `service_account`<sup>Required</sup> <a name="cdk8s_plus_27.ServiceAccountTokenSecretProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)

The service account to store a secret for.

---

### ServiceBindOptions <a name="cdk8s_plus_27.ServiceBindOptions"></a>

Options for `Service.bind`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ServiceBindOptions(
  name: str = None,
  node_port: typing.Union[int, float] = None,
  protocol: Protocol = None,
  target_port: typing.Union[int, float] = None
)
```

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceBindOptions.property.name"></a>

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

##### `node_port`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceBindOptions.property.node_port"></a>

```python
node_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* auto-allocate a port if the ServiceType of this Service requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceBindOptions.property.protocol"></a>

```python
protocol: Protocol
```

- *Type:* [`cdk8s_plus_27.Protocol`](#cdk8s_plus_27.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `target_port`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceBindOptions.property.target_port"></a>

```python
target_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

### ServiceIngressBackendOptions <a name="cdk8s_plus_27.ServiceIngressBackendOptions"></a>

Options for setting up backends for ingress rules.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ServiceIngressBackendOptions(
  port: typing.Union[int, float] = None
)
```

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceIngressBackendOptions.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* if the service exposes a single port, this port will be used.

The port to use to access the service.

* This option will fail if the service does not expose any ports.
* If the service exposes multiple ports, this option must be specified.
* If the service exposes a single port, this option is optional and if
  specified, it must be the same port exposed by the service.

---

### ServicePort <a name="cdk8s_plus_27.ServicePort"></a>

Definition of a service port.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ServicePort(
  name: str = None,
  node_port: typing.Union[int, float] = None,
  protocol: Protocol = None,
  target_port: typing.Union[int, float] = None,
  port: typing.Union[int, float]
)
```

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ServicePort.property.name"></a>

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

##### `node_port`<sup>Optional</sup> <a name="cdk8s_plus_27.ServicePort.property.node_port"></a>

```python
node_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* auto-allocate a port if the ServiceType of this Service requires one.

The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

Usually assigned by the system. If specified, it will be
allocated to the service if unused or else creation of the service will
fail. Default is to auto-allocate a port if the ServiceType of this Service
requires one.

> https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

---

##### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_27.ServicePort.property.protocol"></a>

```python
protocol: Protocol
```

- *Type:* [`cdk8s_plus_27.Protocol`](#cdk8s_plus_27.Protocol)
- *Default:* Protocol.TCP

The IP protocol for this port.

Supports "TCP", "UDP", and "SCTP". Default is TCP.

---

##### `target_port`<sup>Optional</sup> <a name="cdk8s_plus_27.ServicePort.property.target_port"></a>

```python
target_port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* The value of `port` will be used.

The port number the service will redirect to.

---

##### `port`<sup>Required</sup> <a name="cdk8s_plus_27.ServicePort.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

The port number the service will bind to.

---

### ServiceProps <a name="cdk8s_plus_27.ServiceProps"></a>

Properties for `Service`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ServiceProps(
  metadata: ApiObjectMetadata = None,
  cluster_i_p: str = None,
  external_i_ps: typing.List[str] = None,
  external_name: str = None,
  load_balancer_source_ranges: typing.List[str] = None,
  ports: typing.List[ServicePort] = None,
  selector: IPodSelector = None,
  type: ServiceType = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `cluster_i_p`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.property.cluster_i_p"></a>

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

##### `external_i_ps`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.property.external_i_ps"></a>

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

##### `external_name`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.property.external_name"></a>

```python
external_name: str
```

- *Type:* `str`
- *Default:* No external name.

The externalName to be used when ServiceType.EXTERNAL_NAME is set.

---

##### `load_balancer_source_ranges`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.property.load_balancer_source_ranges"></a>

```python
load_balancer_source_ranges: typing.List[str]
```

- *Type:* typing.List[`str`]

A list of CIDR IP addresses, if specified and supported by the platform, will restrict traffic through the cloud-provider load-balancer to the specified client IPs.

More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.property.ports"></a>

```python
ports: typing.List[ServicePort]
```

- *Type:* typing.List[[`cdk8s_plus_27.ServicePort`](#cdk8s_plus_27.ServicePort)]
- *Default:* either the selector ports, or none.

The ports this service binds to.

If the selector of the service is a managed pod / workload,
its ports will are automatically extracted and used as the default value.
Otherwise, no ports are bound.

---

##### `selector`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.property.selector"></a>

```python
selector: IPodSelector
```

- *Type:* [`cdk8s_plus_27.IPodSelector`](#cdk8s_plus_27.IPodSelector)
- *Default:* unset, the service is assumed to have an external process managing
its endpoints, which Kubernetes will not modify.

Which pods should the service select and route to.

You can pass one of the following:

* An instance of `Pod` or any workload resource (e.g `Deployment`, `StatefulSet`, ...)
* Pods selected by the `Pods.select` function. Note that in this case only labels can be specified.

---

##### `type`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceProps.property.type"></a>

```python
type: ServiceType
```

- *Type:* [`cdk8s_plus_27.ServiceType`](#cdk8s_plus_27.ServiceType)
- *Default:* ServiceType.ClusterIP

Determines how the Service is exposed.

More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types

---

### SshAuthSecretProps <a name="cdk8s_plus_27.SshAuthSecretProps"></a>

Options for `SshAuthSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.SshAuthSecretProps(
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  ssh_private_key: str
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.SshAuthSecretProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.SshAuthSecretProps.property.immutable"></a>

```python
immutable: bool
```

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `ssh_private_key`<sup>Required</sup> <a name="cdk8s_plus_27.SshAuthSecretProps.property.ssh_private_key"></a>

```python
ssh_private_key: str
```

- *Type:* `str`

The SSH private key to use.

---

### StatefulSetProps <a name="cdk8s_plus_27.StatefulSetProps"></a>

Properties for initialization of `StatefulSet`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.StatefulSetProps(
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None,
  min_ready: Duration = None,
  pod_management_policy: PodManagementPolicy = None,
  replicas: typing.Union[int, float] = None,
  service: Service = None,
  strategy: StatefulSetUpdateStrategy = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.automount_service_account_token"></a>

```python
automount_service_account_token: bool
```

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.dns"></a>

```python
dns: PodDnsProps
```

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.docker_registry_auth"></a>

```python
docker_registry_auth: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.host_aliases"></a>

```python
host_aliases: typing.List[HostAlias]
```

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.host_network"></a>

```python
host_network: bool
```

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.init_containers"></a>

```python
init_containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.isolate"></a>

```python
isolate: bool
```

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.security_context"></a>

```python
security_context: PodSecurityContextProps
```

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.termination_grace_period"></a>

```python
termination_grace_period: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.select"></a>

```python
select: bool
```

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.spread"></a>

```python
spread: bool
```

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

##### `min_ready`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.min_ready"></a>

```python
min_ready: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(0)

Minimum duration for which a newly created pod should be ready without any of its container crashing, for it to be considered available.

Zero means the pod will be considered available as soon as it is ready.

This is an alpha field and requires enabling StatefulSetMinReadySeconds feature gate.

> https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds

---

##### `pod_management_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.pod_management_policy"></a>

```python
pod_management_policy: PodManagementPolicy
```

- *Type:* [`cdk8s_plus_27.PodManagementPolicy`](#cdk8s_plus_27.PodManagementPolicy)
- *Default:* PodManagementPolicy.ORDERED_READY

Pod management policy to use for this statefulset.

---

##### `replicas`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.replicas"></a>

```python
replicas: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1

Number of desired pods.

---

##### `service`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.service"></a>

```python
service: Service
```

- *Type:* [`cdk8s_plus_27.Service`](#cdk8s_plus_27.Service)
- *Default:* A new headless service will be created.

Service to associate with the statefulset.

---

##### `strategy`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetProps.property.strategy"></a>

```python
strategy: StatefulSetUpdateStrategy
```

- *Type:* [`cdk8s_plus_27.StatefulSetUpdateStrategy`](#cdk8s_plus_27.StatefulSetUpdateStrategy)
- *Default:* RollingUpdate with partition set to 0

Indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.

---

### StatefulSetUpdateStrategyRollingUpdateOptions <a name="cdk8s_plus_27.StatefulSetUpdateStrategyRollingUpdateOptions"></a>

Options for `StatefulSetUpdateStrategy.rollingUpdate`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.StatefulSetUpdateStrategyRollingUpdateOptions(
  partition: typing.Union[int, float] = None
)
```

##### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetUpdateStrategyRollingUpdateOptions.property.partition"></a>

```python
partition: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 0

If specified, all Pods with an ordinal that is greater than or equal to the partition will be updated when the StatefulSet's .spec.template is updated. All Pods with an ordinal that is less than the partition will not be updated, and, even if they are deleted, they will be recreated at the previous version.

If the partition is greater than replicas, updates to the pod template will not be propagated to Pods.
In most cases you will not need to use a partition, but they are useful if you want to stage an
update, roll out a canary, or perform a phased roll out.

> https://kubernetes.io/docs/concepts/workloads/controllers/statefulset/#partitions

---

### SubjectConfiguration <a name="cdk8s_plus_27.SubjectConfiguration"></a>

Subject contains a reference to the object or user identities a role binding applies to.

This can either hold a direct API object reference, or a value
for non-objects such as user and group names.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.SubjectConfiguration(
  kind: str,
  name: str,
  api_group: str = None,
  namespace: str = None
)
```

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.SubjectConfiguration.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

Kind of object being referenced.

Values defined by this API group are
"User", "Group", and "ServiceAccount". If the Authorizer does not
recognized the kind value, the Authorizer should report an error.

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.SubjectConfiguration.property.name"></a>

```python
name: str
```

- *Type:* `str`

Name of the object being referenced.

---

##### `api_group`<sup>Optional</sup> <a name="cdk8s_plus_27.SubjectConfiguration.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

APIGroup holds the API group of the referenced subject.

Defaults to "" for
ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User
and Group subjects.

---

##### `namespace`<sup>Optional</sup> <a name="cdk8s_plus_27.SubjectConfiguration.property.namespace"></a>

```python
namespace: str
```

- *Type:* `str`

Namespace of the referenced object.

If the object kind is non-namespace,
such as "User" or "Group", and this value is not empty the Authorizer
should report an error.

---

### Sysctl <a name="cdk8s_plus_27.Sysctl"></a>

Sysctl defines a kernel parameter to be set.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Sysctl(
  name: str,
  value: str
)
```

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Sysctl.property.name"></a>

```python
name: str
```

- *Type:* `str`

Name of a property to set.

---

##### `value`<sup>Required</sup> <a name="cdk8s_plus_27.Sysctl.property.value"></a>

```python
value: str
```

- *Type:* `str`

Value of a property to set.

---

### TcpSocketProbeOptions <a name="cdk8s_plus_27.TcpSocketProbeOptions"></a>

Options for `Probe.fromTcpSocket()`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.TcpSocketProbeOptions(
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None,
  host: str = None,
  port: typing.Union[int, float] = None
)
```

##### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.property.failure_threshold"></a>

```python
failure_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

##### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.property.initial_delay_seconds"></a>

```python
initial_delay_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.property.period_seconds"></a>

```python
period_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

##### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.property.success_threshold"></a>

```python
success_threshold: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

##### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.property.timeout_seconds"></a>

```python
timeout_seconds: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `host`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.property.host"></a>

```python
host: str
```

- *Type:* `str`
- *Default:* defaults to the pod IP

The host name to connect to on the container.

---

##### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.property.port"></a>

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* defaults to `container.port`.

The TCP port to connect to on the container.

---

### TlsSecretProps <a name="cdk8s_plus_27.TlsSecretProps"></a>

Options for `TlsSecret`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.TlsSecretProps(
  metadata: ApiObjectMetadata = None,
  immutable: bool = None,
  tls_cert: str,
  tls_key: str
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.TlsSecretProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `immutable`<sup>Optional</sup> <a name="cdk8s_plus_27.TlsSecretProps.property.immutable"></a>

```python
immutable: bool
```

- *Type:* `bool`
- *Default:* false

If set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified).

If not set to true, the field can be modified at any time.

---

##### `tls_cert`<sup>Required</sup> <a name="cdk8s_plus_27.TlsSecretProps.property.tls_cert"></a>

```python
tls_cert: str
```

- *Type:* `str`

The TLS cert.

---

##### `tls_key`<sup>Required</sup> <a name="cdk8s_plus_27.TlsSecretProps.property.tls_key"></a>

```python
tls_key: str
```

- *Type:* `str`

The TLS key.

---

### VolumeMount <a name="cdk8s_plus_27.VolumeMount"></a>

Mount a volume from the pod to the container.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.VolumeMount(
  propagation: MountPropagation = None,
  read_only: bool = None,
  sub_path: str = None,
  sub_path_expr: str = None,
  path: str,
  volume: Volume
)
```

##### `propagation`<sup>Optional</sup> <a name="cdk8s_plus_27.VolumeMount.property.propagation"></a>

```python
propagation: MountPropagation
```

- *Type:* [`cdk8s_plus_27.MountPropagation`](#cdk8s_plus_27.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

---

##### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.VolumeMount.property.read_only"></a>

```python
read_only: bool
```

- *Type:* `bool`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

##### `sub_path`<sup>Optional</sup> <a name="cdk8s_plus_27.VolumeMount.property.sub_path"></a>

```python
sub_path: str
```

- *Type:* `str`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

##### `sub_path_expr`<sup>Optional</sup> <a name="cdk8s_plus_27.VolumeMount.property.sub_path_expr"></a>

```python
sub_path_expr: str
```

- *Type:* `str`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root).

`subPathExpr` and `subPath` are mutually exclusive.

---

##### `path`<sup>Required</sup> <a name="cdk8s_plus_27.VolumeMount.property.path"></a>

```python
path: str
```

- *Type:* `str`

Path within the container at which the volume should be mounted.

Must not
contain ':'.

---

##### `volume`<sup>Required</sup> <a name="cdk8s_plus_27.VolumeMount.property.volume"></a>

```python
volume: Volume
```

- *Type:* [`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)

The volume to mount.

---

### WorkloadProps <a name="cdk8s_plus_27.WorkloadProps"></a>

Properties for `Workload`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.WorkloadProps(
  metadata: ApiObjectMetadata = None,
  automount_service_account_token: bool = None,
  containers: typing.List[ContainerProps] = None,
  dns: PodDnsProps = None,
  docker_registry_auth: ISecret = None,
  host_aliases: typing.List[HostAlias] = None,
  host_network: bool = None,
  init_containers: typing.List[ContainerProps] = None,
  isolate: bool = None,
  restart_policy: RestartPolicy = None,
  security_context: PodSecurityContextProps = None,
  service_account: IServiceAccount = None,
  termination_grace_period: Duration = None,
  volumes: typing.List[Volume] = None,
  pod_metadata: ApiObjectMetadata = None,
  select: bool = None,
  spread: bool = None
)
```

##### `metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.metadata"></a>

```python
metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

Metadata that all persisted resources must have, which includes all objects users must create.

---

##### `automount_service_account_token`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.automount_service_account_token"></a>

```python
automount_service_account_token: bool
```

- *Type:* `bool`
- *Default:* false

Indicates whether a service account token should be automatically mounted.

> https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/#use-the-default-service-account-to-access-the-api-server

---

##### `containers`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.containers"></a>

```python
containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
- *Default:* No containers. Note that a pod spec must include at least one container.

List of containers belonging to the pod.

Containers cannot currently be
added or removed. There must be at least one container in a Pod.

You can add additionnal containers using `podSpec.addContainer()`

---

##### `dns`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.dns"></a>

```python
dns: PodDnsProps
```

- *Type:* [`cdk8s_plus_27.PodDnsProps`](#cdk8s_plus_27.PodDnsProps)
- *Default:* policy: DnsPolicy.CLUSTER_FIRST
 hostnameAsFQDN: false

DNS settings for the pod.

> https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/

---

##### `docker_registry_auth`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.docker_registry_auth"></a>

```python
docker_registry_auth: ISecret
```

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)
- *Default:* No auth. Images are assumed to be publicly available.

A secret containing docker credentials for authenticating to a registry.

---

##### `host_aliases`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.host_aliases"></a>

```python
host_aliases: typing.List[HostAlias]
```

- *Type:* typing.List[[`cdk8s_plus_27.HostAlias`](#cdk8s_plus_27.HostAlias)]

HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.

---

##### `host_network`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.host_network"></a>

```python
host_network: bool
```

- *Type:* `bool`
- *Default:* false

Host network for the pod.

---

##### `init_containers`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.init_containers"></a>

```python
init_containers: typing.List[ContainerProps]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerProps`](#cdk8s_plus_27.ContainerProps)]
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

##### `isolate`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.isolate"></a>

```python
isolate: bool
```

- *Type:* `bool`
- *Default:* false

Isolates the pod.

This will prevent any ingress or egress connections to / from this pod.
You can however allow explicit connections post instantiation by using the `.connections` property.

---

##### `restart_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.restart_policy"></a>

```python
restart_policy: RestartPolicy
```

- *Type:* [`cdk8s_plus_27.RestartPolicy`](#cdk8s_plus_27.RestartPolicy)
- *Default:* RestartPolicy.ALWAYS

Restart policy for all containers within the pod.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.security_context"></a>

```python
security_context: PodSecurityContextProps
```

- *Type:* [`cdk8s_plus_27.PodSecurityContextProps`](#cdk8s_plus_27.PodSecurityContextProps)
- *Default:* fsGroupChangePolicy: FsGroupChangePolicy.FsGroupChangePolicy.ALWAYS
  ensureNonRoot: true

SecurityContext holds pod-level security attributes and common container settings.

---

##### `service_account`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.service_account"></a>

```python
service_account: IServiceAccount
```

- *Type:* [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)
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

##### `termination_grace_period`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.termination_grace_period"></a>

```python
termination_grace_period: Duration
```

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(30)

Grace period until the pod is terminated.

---

##### `volumes`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.volumes"></a>

```python
volumes: typing.List[Volume]
```

- *Type:* typing.List[[`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume)]
- *Default:* No volumes.

List of volumes that can be mounted by containers belonging to the pod.

You can also add volumes later using `podSpec.addVolume()`

> https://kubernetes.io/docs/concepts/storage/volumes

---

##### `pod_metadata`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.pod_metadata"></a>

```python
pod_metadata: ApiObjectMetadata
```

- *Type:* [`cdk8s.ApiObjectMetadata`](#cdk8s.ApiObjectMetadata)

The pod metadata of this workload.

---

##### `select`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.select"></a>

```python
select: bool
```

- *Type:* `bool`
- *Default:* true

Automatically allocates a pod label selector for this workload and add it to the pod metadata.

This ensures this workload manages pods created by
its pod template.

---

##### `spread`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadProps.property.spread"></a>

```python
spread: bool
```

- *Type:* `bool`
- *Default:* false

Automatically spread pods across hostname and zones.

> https://kubernetes.io/docs/concepts/scheduling-eviction/topology-spread-constraints/#internal-default-constraints

---

### WorkloadSchedulingSpreadOptions <a name="cdk8s_plus_27.WorkloadSchedulingSpreadOptions"></a>

Options for `WorkloadScheduling.spread`.

#### Initializer <a name="[object Object].Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.WorkloadSchedulingSpreadOptions(
  topology: Topology = None,
  weight: typing.Union[int, float] = None
)
```

##### `topology`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadSchedulingSpreadOptions.property.topology"></a>

```python
topology: Topology
```

- *Type:* [`cdk8s_plus_27.Topology`](#cdk8s_plus_27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to spread on.

---

##### `weight`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadSchedulingSpreadOptions.property.weight"></a>

```python
weight: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`
- *Default:* no weight. spread is assumed to be required.

Indicates the spread is optional, with this weight score.

---

## Classes <a name="Classes"></a>

### ApiResource <a name="cdk8s_plus_27.ApiResource"></a>

- *Implements:* [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource), [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

Represents information about an API resource type.

#### Methods <a name="Methods"></a>

##### `as_api_resource` <a name="cdk8s_plus_27.ApiResource.as_api_resource"></a>

```python
def as_api_resource()
```

##### `as_non_api_resource` <a name="cdk8s_plus_27.ApiResource.as_non_api_resource"></a>

```python
def as_non_api_resource()
```

#### Static Functions <a name="Static Functions"></a>

##### `custom` <a name="cdk8s_plus_27.ApiResource.custom"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ApiResource.custom(
  api_group: str,
  resource_type: str
)
```

###### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.ApiResourceOptions.parameter.api_group"></a>

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

###### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.ApiResourceOptions.parameter.resource_type"></a>

- *Type:* `str`

The name of the resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

#### Properties <a name="Properties"></a>

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.ApiResource.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.ApiResource.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of the resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

#### Constants <a name="Constants"></a>

##### `API_SERVICES` <a name="cdk8s_plus_27.ApiResource.property.API_SERVICES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for APIService.

---

##### `BINDINGS` <a name="cdk8s_plus_27.ApiResource.property.BINDINGS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Binding.

---

##### `CERTIFICATE_SIGNING_REQUESTS` <a name="cdk8s_plus_27.ApiResource.property.CERTIFICATE_SIGNING_REQUESTS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for CertificateSigningRequest.

---

##### `CLUSTER_ROLE_BINDINGS` <a name="cdk8s_plus_27.ApiResource.property.CLUSTER_ROLE_BINDINGS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for ClusterRoleBinding.

---

##### `CLUSTER_ROLES` <a name="cdk8s_plus_27.ApiResource.property.CLUSTER_ROLES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for ClusterRole.

---

##### `COMPONENT_STATUSES` <a name="cdk8s_plus_27.ApiResource.property.COMPONENT_STATUSES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for ComponentStatus.

---

##### `CONFIG_MAPS` <a name="cdk8s_plus_27.ApiResource.property.CONFIG_MAPS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for ConfigMap.

---

##### `CONTROLLER_REVISIONS` <a name="cdk8s_plus_27.ApiResource.property.CONTROLLER_REVISIONS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for ControllerRevision.

---

##### `CRON_JOBS` <a name="cdk8s_plus_27.ApiResource.property.CRON_JOBS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for CronJob.

---

##### `CSI_DRIVERS` <a name="cdk8s_plus_27.ApiResource.property.CSI_DRIVERS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for CSIDriver.

---

##### `CSI_NODES` <a name="cdk8s_plus_27.ApiResource.property.CSI_NODES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for CSINode.

---

##### `CSI_STORAGE_CAPACITIES` <a name="cdk8s_plus_27.ApiResource.property.CSI_STORAGE_CAPACITIES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for CSIStorageCapacity.

---

##### `CUSTOM_RESOURCE_DEFINITIONS` <a name="cdk8s_plus_27.ApiResource.property.CUSTOM_RESOURCE_DEFINITIONS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for CustomResourceDefinition.

---

##### `DAEMON_SETS` <a name="cdk8s_plus_27.ApiResource.property.DAEMON_SETS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for DaemonSet.

---

##### `DEPLOYMENTS` <a name="cdk8s_plus_27.ApiResource.property.DEPLOYMENTS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Deployment.

---

##### `ENDPOINT_SLICES` <a name="cdk8s_plus_27.ApiResource.property.ENDPOINT_SLICES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for EndpointSlice.

---

##### `ENDPOINTS` <a name="cdk8s_plus_27.ApiResource.property.ENDPOINTS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Endpoints.

---

##### `EVENTS` <a name="cdk8s_plus_27.ApiResource.property.EVENTS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Event.

---

##### `FLOW_SCHEMAS` <a name="cdk8s_plus_27.ApiResource.property.FLOW_SCHEMAS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for FlowSchema.

---

##### `HORIZONTAL_POD_AUTOSCALERS` <a name="cdk8s_plus_27.ApiResource.property.HORIZONTAL_POD_AUTOSCALERS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for HorizontalPodAutoscaler.

---

##### `INGRESS_CLASSES` <a name="cdk8s_plus_27.ApiResource.property.INGRESS_CLASSES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for IngressClass.

---

##### `INGRESSES` <a name="cdk8s_plus_27.ApiResource.property.INGRESSES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Ingress.

---

##### `JOBS` <a name="cdk8s_plus_27.ApiResource.property.JOBS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Job.

---

##### `LEASES` <a name="cdk8s_plus_27.ApiResource.property.LEASES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Lease.

---

##### `LIMIT_RANGES` <a name="cdk8s_plus_27.ApiResource.property.LIMIT_RANGES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for LimitRange.

---

##### `LOCAL_SUBJECT_ACCESS_REVIEWS` <a name="cdk8s_plus_27.ApiResource.property.LOCAL_SUBJECT_ACCESS_REVIEWS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for LocalSubjectAccessReview.

---

##### `MUTATING_WEBHOOK_CONFIGURATIONS` <a name="cdk8s_plus_27.ApiResource.property.MUTATING_WEBHOOK_CONFIGURATIONS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for MutatingWebhookConfiguration.

---

##### `NAMESPACES` <a name="cdk8s_plus_27.ApiResource.property.NAMESPACES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Namespace.

---

##### `NETWORK_POLICIES` <a name="cdk8s_plus_27.ApiResource.property.NETWORK_POLICIES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for NetworkPolicy.

---

##### `NODES` <a name="cdk8s_plus_27.ApiResource.property.NODES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Node.

---

##### `PERSISTENT_VOLUME_CLAIMS` <a name="cdk8s_plus_27.ApiResource.property.PERSISTENT_VOLUME_CLAIMS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for PersistentVolumeClaim.

---

##### `PERSISTENT_VOLUMES` <a name="cdk8s_plus_27.ApiResource.property.PERSISTENT_VOLUMES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for PersistentVolume.

---

##### `POD_DISRUPTION_BUDGETS` <a name="cdk8s_plus_27.ApiResource.property.POD_DISRUPTION_BUDGETS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for PodDisruptionBudget.

---

##### `POD_TEMPLATES` <a name="cdk8s_plus_27.ApiResource.property.POD_TEMPLATES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for PodTemplate.

---

##### `PODS` <a name="cdk8s_plus_27.ApiResource.property.PODS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Pod.

---

##### `PRIORITY_CLASSES` <a name="cdk8s_plus_27.ApiResource.property.PRIORITY_CLASSES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for PriorityClass.

---

##### `PRIORITY_LEVEL_CONFIGURATIONS` <a name="cdk8s_plus_27.ApiResource.property.PRIORITY_LEVEL_CONFIGURATIONS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for PriorityLevelConfiguration.

---

##### `REPLICA_SETS` <a name="cdk8s_plus_27.ApiResource.property.REPLICA_SETS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for ReplicaSet.

---

##### `REPLICATION_CONTROLLERS` <a name="cdk8s_plus_27.ApiResource.property.REPLICATION_CONTROLLERS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for ReplicationController.

---

##### `RESOURCE_QUOTAS` <a name="cdk8s_plus_27.ApiResource.property.RESOURCE_QUOTAS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for ResourceQuota.

---

##### `ROLE_BINDINGS` <a name="cdk8s_plus_27.ApiResource.property.ROLE_BINDINGS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for RoleBinding.

---

##### `ROLES` <a name="cdk8s_plus_27.ApiResource.property.ROLES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Role.

---

##### `RUNTIME_CLASSES` <a name="cdk8s_plus_27.ApiResource.property.RUNTIME_CLASSES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for RuntimeClass.

---

##### `SECRETS` <a name="cdk8s_plus_27.ApiResource.property.SECRETS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Secret.

---

##### `SELF_SUBJECT_ACCESS_REVIEWS` <a name="cdk8s_plus_27.ApiResource.property.SELF_SUBJECT_ACCESS_REVIEWS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for SelfSubjectAccessReview.

---

##### `SELF_SUBJECT_RULES_REVIEWS` <a name="cdk8s_plus_27.ApiResource.property.SELF_SUBJECT_RULES_REVIEWS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for SelfSubjectRulesReview.

---

##### `SERVICE_ACCOUNTS` <a name="cdk8s_plus_27.ApiResource.property.SERVICE_ACCOUNTS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for ServiceAccount.

---

##### `SERVICES` <a name="cdk8s_plus_27.ApiResource.property.SERVICES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for Service.

---

##### `STATEFUL_SETS` <a name="cdk8s_plus_27.ApiResource.property.STATEFUL_SETS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for StatefulSet.

---

##### `STORAGE_CLASSES` <a name="cdk8s_plus_27.ApiResource.property.STORAGE_CLASSES"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for StorageClass.

---

##### `SUBJECT_ACCESS_REVIEWS` <a name="cdk8s_plus_27.ApiResource.property.SUBJECT_ACCESS_REVIEWS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for SubjectAccessReview.

---

##### `TOKEN_REVIEWS` <a name="cdk8s_plus_27.ApiResource.property.TOKEN_REVIEWS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for TokenReview.

---

##### `VALIDATING_WEBHOOK_CONFIGURATIONS` <a name="cdk8s_plus_27.ApiResource.property.VALIDATING_WEBHOOK_CONFIGURATIONS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for ValidatingWebhookConfiguration.

---

##### `VOLUME_ATTACHMENTS` <a name="cdk8s_plus_27.ApiResource.property.VOLUME_ATTACHMENTS"></a>

- *Type:* [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource)

API resource information for VolumeAttachment.

---

### Container <a name="cdk8s_plus_27.Container"></a>

A single application container that you want to run within a pod.

#### Initializers <a name="cdk8s_plus_27.Container.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Container(
  args: typing.List[str] = None,
  command: typing.List[str] = None,
  env_from: typing.List[EnvFrom] = None,
  env_variables: typing.Mapping[EnvValue] = None,
  image_pull_policy: ImagePullPolicy = None,
  lifecycle: ContainerLifecycle = None,
  liveness: Probe = None,
  name: str = None,
  port: typing.Union[int, float] = None,
  port_number: typing.Union[int, float] = None,
  ports: typing.List[ContainerPort] = None,
  readiness: Probe = None,
  resources: ContainerResources = None,
  security_context: ContainerSecurityContextProps = None,
  startup: Probe = None,
  volume_mounts: typing.List[VolumeMount] = None,
  working_dir: str = None,
  image: str
)
```

##### `args`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.args"></a>

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

##### `command`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.command"></a>

- *Type:* typing.List[`str`]
- *Default:* The docker image's ENTRYPOINT.

Entrypoint array.

Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

---

##### `env_from`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.env_from"></a>

- *Type:* typing.List[[`cdk8s_plus_27.EnvFrom`](#cdk8s_plus_27.EnvFrom)]
- *Default:* No sources.

List of sources to populate environment variables in the container.

When a key exists in multiple sources, the value associated with
the last source will take precedence. Values defined by the `envVariables` property
with a duplicate key will take precedence.

---

##### `env_variables`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.env_variables"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_27.EnvValue`](#cdk8s_plus_27.EnvValue)]
- *Default:* No environment variables.

Environment variables to set in the container.

---

##### `image_pull_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.image_pull_policy"></a>

- *Type:* [`cdk8s_plus_27.ImagePullPolicy`](#cdk8s_plus_27.ImagePullPolicy)
- *Default:* ImagePullPolicy.ALWAYS

Image pull policy for this container.

---

##### `lifecycle`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.lifecycle"></a>

- *Type:* [`cdk8s_plus_27.ContainerLifecycle`](#cdk8s_plus_27.ContainerLifecycle)

Describes actions that the management system should take in response to container lifecycle events.

---

##### `liveness`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.liveness"></a>

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* no liveness probe is defined

Periodic probe of container liveness.

Container will be restarted if the probe fails.

---

##### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.name"></a>

- *Type:* `str`
- *Default:* 'main'

Name of the container specified as a DNS_LABEL.

Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.

---

##### ~~`port`~~<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.port"></a>

- *Deprecated:* - use `portNumber`.

- *Type:* `typing.Union[int, float]`

---

##### `port_number`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.port_number"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* Only the ports mentiond in the `ports` property are exposed.

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

This is a convinience property if all you need a single TCP numbered port.
In case more advanced configuartion is required, use the `ports` property.

This port is added to the list of ports mentioned in the `ports` property.

---

##### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_27.ContainerPort`](#cdk8s_plus_27.ContainerPort)]
- *Default:* Only the port mentioned in the `portNumber` property is exposed.

List of ports to expose from this container.

---

##### `readiness`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.readiness"></a>

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* no readiness probe is defined

Determines when the container is ready to serve traffic.

---

##### `resources`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.resources"></a>

- *Type:* [`cdk8s_plus_27.ContainerResources`](#cdk8s_plus_27.ContainerResources)
- *Default:* cpu:
     request: 1000 millis
     limit: 1500 millis
   memory:
     request: 512 mebibytes
     limit: 2048 mebibytes

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `security_context`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.security_context"></a>

- *Type:* [`cdk8s_plus_27.ContainerSecurityContextProps`](#cdk8s_plus_27.ContainerSecurityContextProps)
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

##### `startup`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.startup"></a>

- *Type:* [`cdk8s_plus_27.Probe`](#cdk8s_plus_27.Probe)
- *Default:* If a port is provided, then knocks on that port
to determine when the container is ready for readiness and
liveness probe checks.
Otherwise, no startup probe is defined.

StartupProbe indicates that the Pod has successfully initialized.

If specified, no other probes are executed until this completes successfully

---

##### `volume_mounts`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.volume_mounts"></a>

- *Type:* typing.List[[`cdk8s_plus_27.VolumeMount`](#cdk8s_plus_27.VolumeMount)]

Pod volumes to mount into the container's filesystem.

Cannot be updated.

---

##### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.working_dir"></a>

- *Type:* `str`
- *Default:* The container runtime's default.

Container's working directory.

If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.

---

##### `image`<sup>Required</sup> <a name="cdk8s_plus_27.ContainerProps.parameter.image"></a>

- *Type:* `str`

Docker image name.

---

#### Methods <a name="Methods"></a>

##### `add_port` <a name="cdk8s_plus_27.Container.add_port"></a>

```python
def add_port(
  number: typing.Union[int, float],
  host_ip: str = None,
  host_port: typing.Union[int, float] = None,
  name: str = None,
  protocol: Protocol = None
)
```

###### `number`<sup>Required</sup> <a name="cdk8s_plus_27.ContainerPort.parameter.number"></a>

- *Type:* `typing.Union[int, float]`

Number of port to expose on the pod's IP address.

This must be a valid port number, 0 < x < 65536.

---

###### `host_ip`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerPort.parameter.host_ip"></a>

- *Type:* `str`
- *Default:* 127.0.0.1.

What host IP to bind the external port to.

---

###### `host_port`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerPort.parameter.host_port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* auto generated by kubernetes and might change on restarts.

Number of port to expose on the host.

If specified, this must be a valid port number, 0 < x < 65536.
Most containers do not need this.

---

###### `name`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerPort.parameter.name"></a>

- *Type:* `str`
- *Default:* port is not named.

If specified, this must be an IANA_SVC_NAME and unique within the pod.

Each named port in a pod must have a unique name.
Name for the port that can be referred to by services.

---

###### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerPort.parameter.protocol"></a>

- *Type:* [`cdk8s_plus_27.Protocol`](#cdk8s_plus_27.Protocol)
- *Default:* Protocol.TCP

Protocol for port.

Must be UDP, TCP, or SCTP. Defaults to "TCP".

---

##### `mount` <a name="cdk8s_plus_27.Container.mount"></a>

```python
def mount(
  path: str,
  storage: IStorage,
  propagation: MountPropagation = None,
  read_only: bool = None,
  sub_path: str = None,
  sub_path_expr: str = None
)
```

###### `path`<sup>Required</sup> <a name="cdk8s_plus_27.Container.parameter.path"></a>

- *Type:* `str`

The desired path in the container.

---

###### `storage`<sup>Required</sup> <a name="cdk8s_plus_27.Container.parameter.storage"></a>

- *Type:* [`cdk8s_plus_27.IStorage`](#cdk8s_plus_27.IStorage)

The storage to mount.

---

###### `propagation`<sup>Optional</sup> <a name="cdk8s_plus_27.MountOptions.parameter.propagation"></a>

- *Type:* [`cdk8s_plus_27.MountPropagation`](#cdk8s_plus_27.MountPropagation)
- *Default:* MountPropagation.NONE

Determines how mounts are propagated from the host to container and the other way around.

When not set, MountPropagationNone is used.

Mount propagation allows for sharing volumes mounted by a Container to
other Containers in the same Pod, or even to other Pods on the same node.

---

###### `read_only`<sup>Optional</sup> <a name="cdk8s_plus_27.MountOptions.parameter.read_only"></a>

- *Type:* `bool`
- *Default:* false

Mounted read-only if true, read-write otherwise (false or unspecified).

Defaults to false.

---

###### `sub_path`<sup>Optional</sup> <a name="cdk8s_plus_27.MountOptions.parameter.sub_path"></a>

- *Type:* `str`
- *Default:* "" the volume's root

Path within the volume from which the container's volume should be mounted.).

---

###### `sub_path_expr`<sup>Optional</sup> <a name="cdk8s_plus_27.MountOptions.parameter.sub_path_expr"></a>

- *Type:* `str`
- *Default:* "" volume's root.

Expanded path within the volume from which the container's volume should be mounted.

Behaves similarly to SubPath but environment variable references
$(VAR_NAME) are expanded using the container's environment. Defaults to ""
(volume's root).

`subPathExpr` and `subPath` are mutually exclusive.

---


#### Properties <a name="Properties"></a>

##### `env`<sup>Required</sup> <a name="cdk8s_plus_27.Container.property.env"></a>

```python
env: Env
```

- *Type:* [`cdk8s_plus_27.Env`](#cdk8s_plus_27.Env)

The environment of the container.

---

##### `image`<sup>Required</sup> <a name="cdk8s_plus_27.Container.property.image"></a>

```python
image: str
```

- *Type:* `str`

The container image.

---

##### `image_pull_policy`<sup>Required</sup> <a name="cdk8s_plus_27.Container.property.image_pull_policy"></a>

```python
image_pull_policy: ImagePullPolicy
```

- *Type:* [`cdk8s_plus_27.ImagePullPolicy`](#cdk8s_plus_27.ImagePullPolicy)

Image pull policy for this container.

---

##### `mounts`<sup>Required</sup> <a name="cdk8s_plus_27.Container.property.mounts"></a>

```python
mounts: typing.List[VolumeMount]
```

- *Type:* typing.List[[`cdk8s_plus_27.VolumeMount`](#cdk8s_plus_27.VolumeMount)]

Volume mounts configured for this container.

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Container.property.name"></a>

```python
name: str
```

- *Type:* `str`

The name of the container.

---

##### `ports`<sup>Required</sup> <a name="cdk8s_plus_27.Container.property.ports"></a>

```python
ports: typing.List[ContainerPort]
```

- *Type:* typing.List[[`cdk8s_plus_27.ContainerPort`](#cdk8s_plus_27.ContainerPort)]

Ports exposed by this containers.

Returns a copy, use `addPort` to modify.

---

##### `security_context`<sup>Required</sup> <a name="cdk8s_plus_27.Container.property.security_context"></a>

```python
security_context: ContainerSecurityContext
```

- *Type:* [`cdk8s_plus_27.ContainerSecurityContext`](#cdk8s_plus_27.ContainerSecurityContext)

The security context of the container.

---

##### `args`<sup>Optional</sup> <a name="cdk8s_plus_27.Container.property.args"></a>

```python
args: typing.List[str]
```

- *Type:* typing.List[`str`]

Arguments to the entrypoint.

---

##### `command`<sup>Optional</sup> <a name="cdk8s_plus_27.Container.property.command"></a>

```python
command: typing.List[str]
```

- *Type:* typing.List[`str`]

Entrypoint array (the command to execute when the container starts).

---

##### ~~`port`~~<sup>Optional</sup> <a name="cdk8s_plus_27.Container.property.port"></a>

- *Deprecated:* - use `portNumber`.

```python
port: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

---

##### `port_number`<sup>Optional</sup> <a name="cdk8s_plus_27.Container.property.port_number"></a>

```python
port_number: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

The port number that was configured for this container.

If undefined, either the container doesn't expose a port, or its
port configuration is stored in the `ports` field.

---

##### `resources`<sup>Optional</sup> <a name="cdk8s_plus_27.Container.property.resources"></a>

```python
resources: ContainerResources
```

- *Type:* [`cdk8s_plus_27.ContainerResources`](#cdk8s_plus_27.ContainerResources)

Compute resources (CPU and memory requests and limits) required by the container.

> https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/

---

##### `working_dir`<sup>Optional</sup> <a name="cdk8s_plus_27.Container.property.working_dir"></a>

```python
working_dir: str
```

- *Type:* `str`

The working directory inside the container.

---


### ContainerSecurityContext <a name="cdk8s_plus_27.ContainerSecurityContext"></a>

Container security attributes and settings.

#### Initializers <a name="cdk8s_plus_27.ContainerSecurityContext.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ContainerSecurityContext(
  allow_privilege_escalation: bool = None,
  ensure_non_root: bool = None,
  group: typing.Union[int, float] = None,
  privileged: bool = None,
  read_only_root_filesystem: bool = None,
  user: typing.Union[int, float] = None
)
```

##### `allow_privilege_escalation`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.parameter.allow_privilege_escalation"></a>

- *Type:* `bool`
- *Default:* false

Whether a process can gain more privileges than its parent process.

---

##### `ensure_non_root`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.parameter.ensure_non_root"></a>

- *Type:* `bool`
- *Default:* true

Indicates that the container must run as a non-root user.

If true, the Kubelet will validate the image at runtime to ensure that it does
not run as UID 0 (root) and fail to start the container if it does.

---

##### `group`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.parameter.group"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 26000. An arbitrary number bigger than 9999 is selected here.
This is so that the container is blocked to access host files even if
somehow it manages to get access to host file system.

The GID to run the entrypoint of the container process.

---

##### `privileged`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.parameter.privileged"></a>

- *Type:* `bool`
- *Default:* false

Run container in privileged mode.

Processes in privileged containers are essentially equivalent to root on the host.

---

##### `read_only_root_filesystem`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.parameter.read_only_root_filesystem"></a>

- *Type:* `bool`
- *Default:* true

Whether this container has a read-only root filesystem.

---

##### `user`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContextProps.parameter.user"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 25000. An arbitrary number bigger than 9999 is selected here.
This is so that the container is blocked to access host files even if
somehow it manages to get access to host file system.

The UID to run the entrypoint of the container process.

---



#### Properties <a name="Properties"></a>

##### `ensure_non_root`<sup>Required</sup> <a name="cdk8s_plus_27.ContainerSecurityContext.property.ensure_non_root"></a>

```python
ensure_non_root: bool
```

- *Type:* `bool`

---

##### `privileged`<sup>Required</sup> <a name="cdk8s_plus_27.ContainerSecurityContext.property.privileged"></a>

```python
privileged: bool
```

- *Type:* `bool`

---

##### `read_only_root_filesystem`<sup>Required</sup> <a name="cdk8s_plus_27.ContainerSecurityContext.property.read_only_root_filesystem"></a>

```python
read_only_root_filesystem: bool
```

- *Type:* `bool`

---

##### `allow_privilege_escalation`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContext.property.allow_privilege_escalation"></a>

```python
allow_privilege_escalation: bool
```

- *Type:* `bool`

---

##### `group`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContext.property.group"></a>

```python
group: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

---

##### `user`<sup>Optional</sup> <a name="cdk8s_plus_27.ContainerSecurityContext.property.user"></a>

```python
user: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

---


### Cpu <a name="cdk8s_plus_27.Cpu"></a>

Represents the amount of CPU.

The amount can be passed as millis or units.


#### Static Functions <a name="Static Functions"></a>

##### `millis` <a name="cdk8s_plus_27.Cpu.millis"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Cpu.millis(
  amount: typing.Union[int, float]
)
```

###### `amount`<sup>Required</sup> <a name="cdk8s_plus_27.Cpu.parameter.amount"></a>

- *Type:* `typing.Union[int, float]`

---

##### `units` <a name="cdk8s_plus_27.Cpu.units"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Cpu.units(
  amount: typing.Union[int, float]
)
```

###### `amount`<sup>Required</sup> <a name="cdk8s_plus_27.Cpu.parameter.amount"></a>

- *Type:* `typing.Union[int, float]`

---

#### Properties <a name="Properties"></a>

##### `amount`<sup>Required</sup> <a name="cdk8s_plus_27.Cpu.property.amount"></a>

```python
amount: str
```

- *Type:* `str`

---


### DeploymentStrategy <a name="cdk8s_plus_27.DeploymentStrategy"></a>

Deployment strategies.


#### Static Functions <a name="Static Functions"></a>

##### `recreate` <a name="cdk8s_plus_27.DeploymentStrategy.recreate"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.DeploymentStrategy.recreate()
```

##### `rolling_update` <a name="cdk8s_plus_27.DeploymentStrategy.rolling_update"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.DeploymentStrategy.rolling_update(
  max_surge: PercentOrAbsolute = None,
  max_unavailable: PercentOrAbsolute = None
)
```

###### `max_surge`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentStrategyRollingUpdateOptions.parameter.max_surge"></a>

- *Type:* [`cdk8s_plus_27.PercentOrAbsolute`](#cdk8s_plus_27.PercentOrAbsolute)
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

###### `max_unavailable`<sup>Optional</sup> <a name="cdk8s_plus_27.DeploymentStrategyRollingUpdateOptions.parameter.max_unavailable"></a>

- *Type:* [`cdk8s_plus_27.PercentOrAbsolute`](#cdk8s_plus_27.PercentOrAbsolute)
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



### Env <a name="cdk8s_plus_27.Env"></a>

Container environment variables.

#### Initializers <a name="cdk8s_plus_27.Env.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Env(
  sources: typing.List[EnvFrom],
  variables: typing.Mapping[EnvValue]
)
```

##### `sources`<sup>Required</sup> <a name="cdk8s_plus_27.Env.parameter.sources"></a>

- *Type:* typing.List[[`cdk8s_plus_27.EnvFrom`](#cdk8s_plus_27.EnvFrom)]

---

##### `variables`<sup>Required</sup> <a name="cdk8s_plus_27.Env.parameter.variables"></a>

- *Type:* typing.Mapping[[`cdk8s_plus_27.EnvValue`](#cdk8s_plus_27.EnvValue)]

---

#### Methods <a name="Methods"></a>

##### `add_variable` <a name="cdk8s_plus_27.Env.add_variable"></a>

```python
def add_variable(
  name: str,
  value: EnvValue
)
```

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.Env.parameter.name"></a>

- *Type:* `str`

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.Env.parameter.value"></a>

- *Type:* [`cdk8s_plus_27.EnvValue`](#cdk8s_plus_27.EnvValue)

---

##### `copy_from` <a name="cdk8s_plus_27.Env.copy_from"></a>

```python
def copy_from(
  from: EnvFrom
)
```

###### `from`<sup>Required</sup> <a name="cdk8s_plus_27.Env.parameter.from"></a>

- *Type:* [`cdk8s_plus_27.EnvFrom`](#cdk8s_plus_27.EnvFrom)

---

#### Static Functions <a name="Static Functions"></a>

##### `from_config_map` <a name="cdk8s_plus_27.Env.from_config_map"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Env.from_config_map(
  config_map: IConfigMap,
  prefix: str = None
)
```

###### `config_map`<sup>Required</sup> <a name="cdk8s_plus_27.Env.parameter.config_map"></a>

- *Type:* [`cdk8s_plus_27.IConfigMap`](#cdk8s_plus_27.IConfigMap)

---

###### `prefix`<sup>Optional</sup> <a name="cdk8s_plus_27.Env.parameter.prefix"></a>

- *Type:* `str`

---

##### `from_secret` <a name="cdk8s_plus_27.Env.from_secret"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Env.from_secret(
  secr: ISecret
)
```

###### `secr`<sup>Required</sup> <a name="cdk8s_plus_27.Env.parameter.secr"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)

---

#### Properties <a name="Properties"></a>

##### `sources`<sup>Required</sup> <a name="cdk8s_plus_27.Env.property.sources"></a>

```python
sources: typing.List[EnvFrom]
```

- *Type:* typing.List[[`cdk8s_plus_27.EnvFrom`](#cdk8s_plus_27.EnvFrom)]

The list of sources used to populate the container environment, in addition to the `variables`.

Returns a copy. To add a source use `container.env.copyFrom()`.

---

##### `variables`<sup>Required</sup> <a name="cdk8s_plus_27.Env.property.variables"></a>

```python
variables: typing.Mapping[EnvValue]
```

- *Type:* typing.Mapping[[`cdk8s_plus_27.EnvValue`](#cdk8s_plus_27.EnvValue)]

The environment variables for this container.

Returns a copy. To add environment variables use `container.env.addVariable()`.

---


### EnvFrom <a name="cdk8s_plus_27.EnvFrom"></a>

A collection of env variables defined in other resources.

#### Initializers <a name="cdk8s_plus_27.EnvFrom.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvFrom(
  config_map: IConfigMap = None,
  prefix: str = None,
  sec: ISecret = None
)
```

##### `config_map`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvFrom.parameter.config_map"></a>

- *Type:* [`cdk8s_plus_27.IConfigMap`](#cdk8s_plus_27.IConfigMap)

---

##### `prefix`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvFrom.parameter.prefix"></a>

- *Type:* `str`

---

##### `sec`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvFrom.parameter.sec"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)

---





### EnvValue <a name="cdk8s_plus_27.EnvValue"></a>

Utility class for creating reading env values from various sources.


#### Static Functions <a name="Static Functions"></a>

##### `from_config_map` <a name="cdk8s_plus_27.EnvValue.from_config_map"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValue.from_config_map(
  config_map: IConfigMap,
  key: str,
  optional: bool = None
)
```

###### `config_map`<sup>Required</sup> <a name="cdk8s_plus_27.EnvValue.parameter.config_map"></a>

- *Type:* [`cdk8s_plus_27.IConfigMap`](#cdk8s_plus_27.IConfigMap)

The config map.

---

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.EnvValue.parameter.key"></a>

- *Type:* `str`

The key to extract the value from.

---

###### `optional`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromConfigMapOptions.parameter.optional"></a>

- *Type:* `bool`
- *Default:* false

Specify whether the ConfigMap or its key must be defined.

---

##### `from_field_ref` <a name="cdk8s_plus_27.EnvValue.from_field_ref"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValue.from_field_ref(
  field_path: EnvFieldPaths,
  api_version: str = None,
  key: str = None
)
```

###### `field_path`<sup>Required</sup> <a name="cdk8s_plus_27.EnvValue.parameter.field_path"></a>

- *Type:* [`cdk8s_plus_27.EnvFieldPaths`](#cdk8s_plus_27.EnvFieldPaths)

: The field reference.

---

###### `api_version`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromFieldRefOptions.parameter.api_version"></a>

- *Type:* `str`

Version of the schema the FieldPath is written in terms of.

---

###### `key`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromFieldRefOptions.parameter.key"></a>

- *Type:* `str`

The key to select the pod label or annotation.

---

##### `from_process` <a name="cdk8s_plus_27.EnvValue.from_process"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValue.from_process(
  key: str,
  required: bool = None
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.EnvValue.parameter.key"></a>

- *Type:* `str`

The key to read.

---

###### `required`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromProcessOptions.parameter.required"></a>

- *Type:* `bool`
- *Default:* false

Specify whether the key must exist in the environment.

If this is set to true, and the key does not exist, an error will thrown.

---

##### `from_resource` <a name="cdk8s_plus_27.EnvValue.from_resource"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValue.from_resource(
  resource: ResourceFieldPaths,
  container: Container = None,
  divisor: str = None
)
```

###### `resource`<sup>Required</sup> <a name="cdk8s_plus_27.EnvValue.parameter.resource"></a>

- *Type:* [`cdk8s_plus_27.ResourceFieldPaths`](#cdk8s_plus_27.ResourceFieldPaths)

: Resource to select the value from.

---

###### `container`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromResourceOptions.parameter.container"></a>

- *Type:* [`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)

The container to select the value from.

---

###### `divisor`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromResourceOptions.parameter.divisor"></a>

- *Type:* `str`

The output format of the exposed resource.

---

##### `from_secret_value` <a name="cdk8s_plus_27.EnvValue.from_secret_value"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValue.from_secret_value(
  key: str,
  secret: ISecret,
  optional: bool = None
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.SecretValue.parameter.key"></a>

- *Type:* `str`

The JSON key.

---

###### `secret`<sup>Required</sup> <a name="cdk8s_plus_27.SecretValue.parameter.secret"></a>

- *Type:* [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)

The secret.

---

###### `optional`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromSecretOptions.parameter.optional"></a>

- *Type:* `bool`
- *Default:* false

Specify whether the Secret or its key must be defined.

---

##### `from_value` <a name="cdk8s_plus_27.EnvValue.from_value"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.EnvValue.from_value(
  value: str
)
```

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.EnvValue.parameter.value"></a>

- *Type:* `str`

The value.

---

#### Properties <a name="Properties"></a>

##### `value`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValue.property.value"></a>

```python
value: typing.Any
```

- *Type:* `typing.Any`

---

##### `value_from`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValue.property.value_from"></a>

```python
value_from: typing.Any
```

- *Type:* `typing.Any`

---


### Handler <a name="cdk8s_plus_27.Handler"></a>

Defines a specific action that should be taken.


#### Static Functions <a name="Static Functions"></a>

##### `from_command` <a name="cdk8s_plus_27.Handler.from_command"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Handler.from_command(
  command: typing.List[str]
)
```

###### `command`<sup>Required</sup> <a name="cdk8s_plus_27.Handler.parameter.command"></a>

- *Type:* typing.List[`str`]

The command to execute.

---

##### `from_http_get` <a name="cdk8s_plus_27.Handler.from_http_get"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Handler.from_http_get(
  path: str,
  port: typing.Union[int, float] = None
)
```

###### `path`<sup>Required</sup> <a name="cdk8s_plus_27.Handler.parameter.path"></a>

- *Type:* `str`

The URL path to hit.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.HandlerFromHttpGetOptions.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---

##### `from_tcp_socket` <a name="cdk8s_plus_27.Handler.from_tcp_socket"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Handler.from_tcp_socket(
  host: str = None,
  port: typing.Union[int, float] = None
)
```

###### `host`<sup>Optional</sup> <a name="cdk8s_plus_27.HandlerFromTcpSocketOptions.parameter.host"></a>

- *Type:* `str`
- *Default:* defaults to the pod IP

The host name to connect to on the container.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.HandlerFromTcpSocketOptions.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* defaults to `container.port`.

The TCP port to connect to on the container.

---



### IngressBackend <a name="cdk8s_plus_27.IngressBackend"></a>

The backend for an ingress path.


#### Static Functions <a name="Static Functions"></a>

##### `from_resource` <a name="cdk8s_plus_27.IngressBackend.from_resource"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.IngressBackend.from_resource(
  resource: IResource
)
```

###### `resource`<sup>Required</sup> <a name="cdk8s_plus_27.IngressBackend.parameter.resource"></a>

- *Type:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource)

---

##### `from_service` <a name="cdk8s_plus_27.IngressBackend.from_service"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.IngressBackend.from_service(
  serv: Service,
  port: typing.Union[int, float] = None
)
```

###### `serv`<sup>Required</sup> <a name="cdk8s_plus_27.IngressBackend.parameter.serv"></a>

- *Type:* [`cdk8s_plus_27.Service`](#cdk8s_plus_27.Service)

The service object.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.ServiceIngressBackendOptions.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* if the service exposes a single port, this port will be used.

The port to use to access the service.

* This option will fail if the service does not expose any ports.
* If the service exposes multiple ports, this option must be specified.
* If the service exposes a single port, this option is optional and if
  specified, it must be the same port exposed by the service.

---



### LabeledNode <a name="cdk8s_plus_27.LabeledNode"></a>

A node that is matched by label selectors.

#### Initializers <a name="cdk8s_plus_27.LabeledNode.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.LabeledNode(
  label_selector: typing.List[NodeLabelQuery]
)
```

##### `label_selector`<sup>Required</sup> <a name="cdk8s_plus_27.LabeledNode.parameter.label_selector"></a>

- *Type:* typing.List[[`cdk8s_plus_27.NodeLabelQuery`](#cdk8s_plus_27.NodeLabelQuery)]

---



#### Properties <a name="Properties"></a>

##### `label_selector`<sup>Required</sup> <a name="cdk8s_plus_27.LabeledNode.property.label_selector"></a>

```python
label_selector: typing.List[NodeLabelQuery]
```

- *Type:* typing.List[[`cdk8s_plus_27.NodeLabelQuery`](#cdk8s_plus_27.NodeLabelQuery)]

---


### LabelExpression <a name="cdk8s_plus_27.LabelExpression"></a>

Represents a query that can be performed against resources with labels.


#### Static Functions <a name="Static Functions"></a>

##### `does_not_exist` <a name="cdk8s_plus_27.LabelExpression.does_not_exist"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.LabelExpression.does_not_exist(
  key: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.LabelExpression.parameter.key"></a>

- *Type:* `str`

---

##### `exists` <a name="cdk8s_plus_27.LabelExpression.exists"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.LabelExpression.exists(
  key: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.LabelExpression.parameter.key"></a>

- *Type:* `str`

---

##### `in` <a name="cdk8s_plus_27.LabelExpression.in"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.LabelExpression.in(
  key: str,
  values: typing.List[str]
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.LabelExpression.parameter.key"></a>

- *Type:* `str`

---

###### `values`<sup>Required</sup> <a name="cdk8s_plus_27.LabelExpression.parameter.values"></a>

- *Type:* typing.List[`str`]

---

##### `not_in` <a name="cdk8s_plus_27.LabelExpression.not_in"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.LabelExpression.not_in(
  key: str,
  values: typing.List[str]
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.LabelExpression.parameter.key"></a>

- *Type:* `str`

---

###### `values`<sup>Required</sup> <a name="cdk8s_plus_27.LabelExpression.parameter.values"></a>

- *Type:* typing.List[`str`]

---

#### Properties <a name="Properties"></a>

##### `key`<sup>Required</sup> <a name="cdk8s_plus_27.LabelExpression.property.key"></a>

```python
key: str
```

- *Type:* `str`

---

##### `operator`<sup>Required</sup> <a name="cdk8s_plus_27.LabelExpression.property.operator"></a>

```python
operator: str
```

- *Type:* `str`

---

##### `values`<sup>Optional</sup> <a name="cdk8s_plus_27.LabelExpression.property.values"></a>

```python
values: typing.List[str]
```

- *Type:* typing.List[`str`]

---


### LabelSelector <a name="cdk8s_plus_27.LabelSelector"></a>

Match a resource by labels.

#### Methods <a name="Methods"></a>

##### `is_empty` <a name="cdk8s_plus_27.LabelSelector.is_empty"></a>

```python
def is_empty()
```

#### Static Functions <a name="Static Functions"></a>

##### `of` <a name="cdk8s_plus_27.LabelSelector.of"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.LabelSelector.of(
  expressions: typing.List[LabelExpression] = None,
  labels: typing.Mapping[str] = None
)
```

###### `expressions`<sup>Optional</sup> <a name="cdk8s_plus_27.LabelSelectorOptions.parameter.expressions"></a>

- *Type:* typing.List[[`cdk8s_plus_27.LabelExpression`](#cdk8s_plus_27.LabelExpression)]

Expression based label matchers.

---

###### `labels`<sup>Optional</sup> <a name="cdk8s_plus_27.LabelSelectorOptions.parameter.labels"></a>

- *Type:* typing.Mapping[`str`]

Strict label matchers.

---



### Metric <a name="cdk8s_plus_27.Metric"></a>

A metric condition that HorizontalPodAutoscaler's scale on.


#### Static Functions <a name="Static Functions"></a>

##### `container_cpu` <a name="cdk8s_plus_27.Metric.container_cpu"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.container_cpu(
  container: Container,
  target: MetricTarget
)
```

###### `container`<sup>Required</sup> <a name="cdk8s_plus_27.MetricContainerResourceOptions.parameter.container"></a>

- *Type:* [`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)

Container where the metric can be found.

---

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.MetricContainerResourceOptions.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

Target metric value that will trigger scaling.

---

##### `container_ephemeral_storage` <a name="cdk8s_plus_27.Metric.container_ephemeral_storage"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.container_ephemeral_storage(
  container: Container,
  target: MetricTarget
)
```

###### `container`<sup>Required</sup> <a name="cdk8s_plus_27.MetricContainerResourceOptions.parameter.container"></a>

- *Type:* [`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)

Container where the metric can be found.

---

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.MetricContainerResourceOptions.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

Target metric value that will trigger scaling.

---

##### `container_memory` <a name="cdk8s_plus_27.Metric.container_memory"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.container_memory(
  container: Container,
  target: MetricTarget
)
```

###### `container`<sup>Required</sup> <a name="cdk8s_plus_27.MetricContainerResourceOptions.parameter.container"></a>

- *Type:* [`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)

Container where the metric can be found.

---

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.MetricContainerResourceOptions.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

Target metric value that will trigger scaling.

---

##### `container_storage` <a name="cdk8s_plus_27.Metric.container_storage"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.container_storage(
  container: Container,
  target: MetricTarget
)
```

###### `container`<sup>Required</sup> <a name="cdk8s_plus_27.MetricContainerResourceOptions.parameter.container"></a>

- *Type:* [`cdk8s_plus_27.Container`](#cdk8s_plus_27.Container)

Container where the metric can be found.

---

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.MetricContainerResourceOptions.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

Target metric value that will trigger scaling.

---

##### `external` <a name="cdk8s_plus_27.Metric.external"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.external(
  name: str,
  target: MetricTarget,
  label_selector: LabelSelector = None
)
```

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.MetricOptions.parameter.name"></a>

- *Type:* `str`

The name of the metric to scale on.

---

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.MetricOptions.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

The target metric value that will trigger scaling.

---

###### `label_selector`<sup>Optional</sup> <a name="cdk8s_plus_27.MetricOptions.parameter.label_selector"></a>

- *Type:* [`cdk8s_plus_27.LabelSelector`](#cdk8s_plus_27.LabelSelector)
- *Default:* Just the metric 'name' will be used to gather metrics.

A selector to find a metric by label.

When set, it is passed as an additional parameter to the metrics server
for more specific metrics scoping.

---

##### `object` <a name="cdk8s_plus_27.Metric.object"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.object(
  name: str,
  target: MetricTarget,
  label_selector: LabelSelector = None,
  object: IResource
)
```

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.MetricObjectOptions.parameter.name"></a>

- *Type:* `str`

The name of the metric to scale on.

---

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.MetricObjectOptions.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

The target metric value that will trigger scaling.

---

###### `label_selector`<sup>Optional</sup> <a name="cdk8s_plus_27.MetricObjectOptions.parameter.label_selector"></a>

- *Type:* [`cdk8s_plus_27.LabelSelector`](#cdk8s_plus_27.LabelSelector)
- *Default:* Just the metric 'name' will be used to gather metrics.

A selector to find a metric by label.

When set, it is passed as an additional parameter to the metrics server
for more specific metrics scoping.

---

###### `object`<sup>Required</sup> <a name="cdk8s_plus_27.MetricObjectOptions.parameter.object"></a>

- *Type:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource)

Resource where the metric can be found.

---

##### `pods` <a name="cdk8s_plus_27.Metric.pods"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.pods(
  name: str,
  target: MetricTarget,
  label_selector: LabelSelector = None
)
```

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.MetricOptions.parameter.name"></a>

- *Type:* `str`

The name of the metric to scale on.

---

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.MetricOptions.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

The target metric value that will trigger scaling.

---

###### `label_selector`<sup>Optional</sup> <a name="cdk8s_plus_27.MetricOptions.parameter.label_selector"></a>

- *Type:* [`cdk8s_plus_27.LabelSelector`](#cdk8s_plus_27.LabelSelector)
- *Default:* Just the metric 'name' will be used to gather metrics.

A selector to find a metric by label.

When set, it is passed as an additional parameter to the metrics server
for more specific metrics scoping.

---

##### `resource_cpu` <a name="cdk8s_plus_27.Metric.resource_cpu"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.resource_cpu(
  target: MetricTarget
)
```

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.Metric.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

---

##### `resource_ephemeral_storage` <a name="cdk8s_plus_27.Metric.resource_ephemeral_storage"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.resource_ephemeral_storage(
  target: MetricTarget
)
```

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.Metric.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

---

##### `resource_memory` <a name="cdk8s_plus_27.Metric.resource_memory"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.resource_memory(
  target: MetricTarget
)
```

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.Metric.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

---

##### `resource_storage` <a name="cdk8s_plus_27.Metric.resource_storage"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Metric.resource_storage(
  target: MetricTarget
)
```

###### `target`<sup>Required</sup> <a name="cdk8s_plus_27.Metric.parameter.target"></a>

- *Type:* [`cdk8s_plus_27.MetricTarget`](#cdk8s_plus_27.MetricTarget)

---

#### Properties <a name="Properties"></a>

##### `type`<sup>Required</sup> <a name="cdk8s_plus_27.Metric.property.type"></a>

```python
type: str
```

- *Type:* `str`

---


### MetricTarget <a name="cdk8s_plus_27.MetricTarget"></a>

A metric condition that will trigger scaling behavior when satisfied.


#### Static Functions <a name="Static Functions"></a>

##### `average_utilization` <a name="cdk8s_plus_27.MetricTarget.average_utilization"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.MetricTarget.average_utilization(
  average_utilization: typing.Union[int, float]
)
```

###### `average_utilization`<sup>Required</sup> <a name="cdk8s_plus_27.MetricTarget.parameter.average_utilization"></a>

- *Type:* `typing.Union[int, float]`

The percentage of the utilization metric.

e.g. `50` for 50%.

---

##### `average_value` <a name="cdk8s_plus_27.MetricTarget.average_value"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.MetricTarget.average_value(
  average_value: typing.Union[int, float]
)
```

###### `average_value`<sup>Required</sup> <a name="cdk8s_plus_27.MetricTarget.parameter.average_value"></a>

- *Type:* `typing.Union[int, float]`

The average metric value.

---

##### `value` <a name="cdk8s_plus_27.MetricTarget.value"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.MetricTarget.value(
  value: typing.Union[int, float]
)
```

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.MetricTarget.parameter.value"></a>

- *Type:* `typing.Union[int, float]`

The target value.

---



### NamedNode <a name="cdk8s_plus_27.NamedNode"></a>

A node that is matched by its name.

#### Initializers <a name="cdk8s_plus_27.NamedNode.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NamedNode(
  name: str
)
```

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.NamedNode.parameter.name"></a>

- *Type:* `str`

---



#### Properties <a name="Properties"></a>

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.NamedNode.property.name"></a>

```python
name: str
```

- *Type:* `str`

---


### NetworkPolicyPort <a name="cdk8s_plus_27.NetworkPolicyPort"></a>

Describes a port to allow traffic on.


#### Static Functions <a name="Static Functions"></a>

##### `all_tcp` <a name="cdk8s_plus_27.NetworkPolicyPort.all_tcp"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyPort.all_tcp()
```

##### `all_udp` <a name="cdk8s_plus_27.NetworkPolicyPort.all_udp"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyPort.all_udp()
```

##### `of` <a name="cdk8s_plus_27.NetworkPolicyPort.of"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyPort.of(
  end_port: typing.Union[int, float] = None,
  port: typing.Union[int, float] = None,
  protocol: NetworkProtocol = None
)
```

###### `end_port`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyPortProps.parameter.end_port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* not a port range.

End port (relative to `port`).

Only applies if `port` is defined.
Use this to specify a port range, rather that a specific one.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyPortProps.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* all ports are allowed.

Specific port number.

---

###### `protocol`<sup>Optional</sup> <a name="cdk8s_plus_27.NetworkPolicyPortProps.parameter.protocol"></a>

- *Type:* [`cdk8s_plus_27.NetworkProtocol`](#cdk8s_plus_27.NetworkProtocol)
- *Default:* NetworkProtocol.TCP

Protocol.

---

##### `tcp` <a name="cdk8s_plus_27.NetworkPolicyPort.tcp"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyPort.tcp(
  port: typing.Union[int, float]
)
```

###### `port`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyPort.parameter.port"></a>

- *Type:* `typing.Union[int, float]`

---

##### `tcp_range` <a name="cdk8s_plus_27.NetworkPolicyPort.tcp_range"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyPort.tcp_range(
  start_port: typing.Union[int, float],
  end_port: typing.Union[int, float]
)
```

###### `start_port`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyPort.parameter.start_port"></a>

- *Type:* `typing.Union[int, float]`

---

###### `end_port`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyPort.parameter.end_port"></a>

- *Type:* `typing.Union[int, float]`

---

##### `udp` <a name="cdk8s_plus_27.NetworkPolicyPort.udp"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyPort.udp(
  port: typing.Union[int, float]
)
```

###### `port`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyPort.parameter.port"></a>

- *Type:* `typing.Union[int, float]`

---

##### `udp_range` <a name="cdk8s_plus_27.NetworkPolicyPort.udp_range"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NetworkPolicyPort.udp_range(
  start_port: typing.Union[int, float],
  end_port: typing.Union[int, float]
)
```

###### `start_port`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyPort.parameter.start_port"></a>

- *Type:* `typing.Union[int, float]`

---

###### `end_port`<sup>Required</sup> <a name="cdk8s_plus_27.NetworkPolicyPort.parameter.end_port"></a>

- *Type:* `typing.Union[int, float]`

---



### Node <a name="cdk8s_plus_27.Node"></a>

Represents a node in the cluster.

#### Initializers <a name="cdk8s_plus_27.Node.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Node()
```


#### Static Functions <a name="Static Functions"></a>

##### `labeled` <a name="cdk8s_plus_27.Node.labeled"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Node.labeled(
  label_selector: NodeLabelQuery
)
```

###### `label_selector`<sup>Required</sup> <a name="cdk8s_plus_27.Node.parameter.label_selector"></a>

- *Type:* [`cdk8s_plus_27.NodeLabelQuery`](#cdk8s_plus_27.NodeLabelQuery)

---

##### `named` <a name="cdk8s_plus_27.Node.named"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Node.named(
  node_name: str
)
```

###### `node_name`<sup>Required</sup> <a name="cdk8s_plus_27.Node.parameter.node_name"></a>

- *Type:* `str`

---

##### `tainted` <a name="cdk8s_plus_27.Node.tainted"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Node.tainted(
  taint_selector: NodeTaintQuery
)
```

###### `taint_selector`<sup>Required</sup> <a name="cdk8s_plus_27.Node.parameter.taint_selector"></a>

- *Type:* [`cdk8s_plus_27.NodeTaintQuery`](#cdk8s_plus_27.NodeTaintQuery)

---



### NodeLabelQuery <a name="cdk8s_plus_27.NodeLabelQuery"></a>

Represents a query that can be performed against nodes with labels.


#### Static Functions <a name="Static Functions"></a>

##### `does_not_exist` <a name="cdk8s_plus_27.NodeLabelQuery.does_not_exist"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeLabelQuery.does_not_exist(
  key: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.key"></a>

- *Type:* `str`

---

##### `exists` <a name="cdk8s_plus_27.NodeLabelQuery.exists"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeLabelQuery.exists(
  key: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.key"></a>

- *Type:* `str`

---

##### `gt` <a name="cdk8s_plus_27.NodeLabelQuery.gt"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeLabelQuery.gt(
  key: str,
  values: typing.List[str]
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.key"></a>

- *Type:* `str`

---

###### `values`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.values"></a>

- *Type:* typing.List[`str`]

---

##### `in` <a name="cdk8s_plus_27.NodeLabelQuery.in"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeLabelQuery.in(
  key: str,
  values: typing.List[str]
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.key"></a>

- *Type:* `str`

---

###### `values`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.values"></a>

- *Type:* typing.List[`str`]

---

##### `is` <a name="cdk8s_plus_27.NodeLabelQuery.is"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeLabelQuery.is(
  key: str,
  value: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.key"></a>

- *Type:* `str`

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.value"></a>

- *Type:* `str`

---

##### `lt` <a name="cdk8s_plus_27.NodeLabelQuery.lt"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeLabelQuery.lt(
  key: str,
  values: typing.List[str]
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.key"></a>

- *Type:* `str`

---

###### `values`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.values"></a>

- *Type:* typing.List[`str`]

---

##### `not_in` <a name="cdk8s_plus_27.NodeLabelQuery.not_in"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeLabelQuery.not_in(
  key: str,
  values: typing.List[str]
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.key"></a>

- *Type:* `str`

---

###### `values`<sup>Required</sup> <a name="cdk8s_plus_27.NodeLabelQuery.parameter.values"></a>

- *Type:* typing.List[`str`]

---



### NodeTaintQuery <a name="cdk8s_plus_27.NodeTaintQuery"></a>

Taint queries that can be perfomed against nodes.


#### Static Functions <a name="Static Functions"></a>

##### `any` <a name="cdk8s_plus_27.NodeTaintQuery.any"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeTaintQuery.any()
```

##### `exists` <a name="cdk8s_plus_27.NodeTaintQuery.exists"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeTaintQuery.exists(
  key: str,
  effect: TaintEffect = None,
  evict_after: Duration = None
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.NodeTaintQuery.parameter.key"></a>

- *Type:* `str`

---

###### `effect`<sup>Optional</sup> <a name="cdk8s_plus_27.NodeTaintQueryOptions.parameter.effect"></a>

- *Type:* [`cdk8s_plus_27.TaintEffect`](#cdk8s_plus_27.TaintEffect)
- *Default:* all effects are matched.

The taint effect to match.

---

###### `evict_after`<sup>Optional</sup> <a name="cdk8s_plus_27.NodeTaintQueryOptions.parameter.evict_after"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* bound forever.

How much time should a pod that tolerates the `NO_EXECUTE` effect be bound to the node.

Only applies for the `NO_EXECUTE` effect.

---

##### `is` <a name="cdk8s_plus_27.NodeTaintQuery.is"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NodeTaintQuery.is(
  key: str,
  value: str,
  effect: TaintEffect = None,
  evict_after: Duration = None
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.NodeTaintQuery.parameter.key"></a>

- *Type:* `str`

---

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.NodeTaintQuery.parameter.value"></a>

- *Type:* `str`

---

###### `effect`<sup>Optional</sup> <a name="cdk8s_plus_27.NodeTaintQueryOptions.parameter.effect"></a>

- *Type:* [`cdk8s_plus_27.TaintEffect`](#cdk8s_plus_27.TaintEffect)
- *Default:* all effects are matched.

The taint effect to match.

---

###### `evict_after`<sup>Optional</sup> <a name="cdk8s_plus_27.NodeTaintQueryOptions.parameter.evict_after"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* bound forever.

How much time should a pod that tolerates the `NO_EXECUTE` effect be bound to the node.

Only applies for the `NO_EXECUTE` effect.

---



### NonApiResource <a name="cdk8s_plus_27.NonApiResource"></a>

- *Implements:* [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

Factory for creating non api resources.

#### Methods <a name="Methods"></a>

##### `as_api_resource` <a name="cdk8s_plus_27.NonApiResource.as_api_resource"></a>

```python
def as_api_resource()
```

##### `as_non_api_resource` <a name="cdk8s_plus_27.NonApiResource.as_non_api_resource"></a>

```python
def as_non_api_resource()
```

#### Static Functions <a name="Static Functions"></a>

##### `of` <a name="cdk8s_plus_27.NonApiResource.of"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.NonApiResource.of(
  url: str
)
```

###### `url`<sup>Required</sup> <a name="cdk8s_plus_27.NonApiResource.parameter.url"></a>

- *Type:* `str`

---



### PercentOrAbsolute <a name="cdk8s_plus_27.PercentOrAbsolute"></a>

Union like class repsenting either a ration in percents or an absolute number.

#### Methods <a name="Methods"></a>

##### `is_zero` <a name="cdk8s_plus_27.PercentOrAbsolute.is_zero"></a>

```python
def is_zero()
```

#### Static Functions <a name="Static Functions"></a>

##### `absolute` <a name="cdk8s_plus_27.PercentOrAbsolute.absolute"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PercentOrAbsolute.absolute(
  num: typing.Union[int, float]
)
```

###### `num`<sup>Required</sup> <a name="cdk8s_plus_27.PercentOrAbsolute.parameter.num"></a>

- *Type:* `typing.Union[int, float]`

---

##### `percent` <a name="cdk8s_plus_27.PercentOrAbsolute.percent"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PercentOrAbsolute.percent(
  percent: typing.Union[int, float]
)
```

###### `percent`<sup>Required</sup> <a name="cdk8s_plus_27.PercentOrAbsolute.parameter.percent"></a>

- *Type:* `typing.Union[int, float]`

---

#### Properties <a name="Properties"></a>

##### `value`<sup>Required</sup> <a name="cdk8s_plus_27.PercentOrAbsolute.property.value"></a>

```python
value: typing.Any
```

- *Type:* `typing.Any`

---


### PodConnections <a name="cdk8s_plus_27.PodConnections"></a>

Controls network isolation rules for inter-pod communication.

#### Initializers <a name="cdk8s_plus_27.PodConnections.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodConnections(
  instance: AbstractPod
)
```

##### `instance`<sup>Required</sup> <a name="cdk8s_plus_27.PodConnections.parameter.instance"></a>

- *Type:* [`cdk8s_plus_27.AbstractPod`](#cdk8s_plus_27.AbstractPod)

---

#### Methods <a name="Methods"></a>

##### `allow_from` <a name="cdk8s_plus_27.PodConnections.allow_from"></a>

```python
def allow_from(
  peer: INetworkPolicyPeer,
  isolation: PodConnectionsIsolation = None,
  ports: typing.List[NetworkPolicyPort] = None
)
```

###### `peer`<sup>Required</sup> <a name="cdk8s_plus_27.PodConnections.parameter.peer"></a>

- *Type:* [`cdk8s_plus_27.INetworkPolicyPeer`](#cdk8s_plus_27.INetworkPolicyPeer)

---

###### `isolation`<sup>Optional</sup> <a name="cdk8s_plus_27.PodConnectionsAllowFromOptions.parameter.isolation"></a>

- *Type:* [`cdk8s_plus_27.PodConnectionsIsolation`](#cdk8s_plus_27.PodConnectionsIsolation)
- *Default:* unset, isolates both the pod and the peer.

Which isolation should be applied to establish the connection.

---

###### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.PodConnectionsAllowFromOptions.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_27.NetworkPolicyPort`](#cdk8s_plus_27.NetworkPolicyPort)]
- *Default:* The pod ports.

Ports to allow incoming traffic to.

---

##### `allow_to` <a name="cdk8s_plus_27.PodConnections.allow_to"></a>

```python
def allow_to(
  peer: INetworkPolicyPeer,
  isolation: PodConnectionsIsolation = None,
  ports: typing.List[NetworkPolicyPort] = None
)
```

###### `peer`<sup>Required</sup> <a name="cdk8s_plus_27.PodConnections.parameter.peer"></a>

- *Type:* [`cdk8s_plus_27.INetworkPolicyPeer`](#cdk8s_plus_27.INetworkPolicyPeer)

---

###### `isolation`<sup>Optional</sup> <a name="cdk8s_plus_27.PodConnectionsAllowToOptions.parameter.isolation"></a>

- *Type:* [`cdk8s_plus_27.PodConnectionsIsolation`](#cdk8s_plus_27.PodConnectionsIsolation)
- *Default:* unset, isolates both the pod and the peer.

Which isolation should be applied to establish the connection.

---

###### `ports`<sup>Optional</sup> <a name="cdk8s_plus_27.PodConnectionsAllowToOptions.parameter.ports"></a>

- *Type:* typing.List[[`cdk8s_plus_27.NetworkPolicyPort`](#cdk8s_plus_27.NetworkPolicyPort)]
- *Default:* If the peer is a managed pod, take its ports. Otherwise, all ports are allowed.

Ports to allow outgoing traffic to.

---

##### `isolate` <a name="cdk8s_plus_27.PodConnections.isolate"></a>

```python
def isolate()
```




### PodDns <a name="cdk8s_plus_27.PodDns"></a>

Holds dns settings of the pod.

#### Initializers <a name="cdk8s_plus_27.PodDns.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodDns(
  hostname: str = None,
  hostname_as_fqd_n: bool = None,
  nameservers: typing.List[str] = None,
  options: typing.List[DnsOption] = None,
  policy: DnsPolicy = None,
  searches: typing.List[str] = None,
  subdomain: str = None
)
```

##### `hostname`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.parameter.hostname"></a>

- *Type:* `str`
- *Default:* Set to a system-defined value.

Specifies the hostname of the Pod.

---

##### `hostname_as_fqd_n`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.parameter.hostname_as_fqd_n"></a>

- *Type:* `bool`
- *Default:* false

If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default).

In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname).
In Windows containers, this means setting the registry value of hostname for the registry
key HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to FQDN.
If a pod does not have FQDN, this has no effect.

---

##### `nameservers`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.parameter.nameservers"></a>

- *Type:* typing.List[`str`]

A list of IP addresses that will be used as DNS servers for the Pod.

There can be at most 3 IP addresses specified.
When the policy is set to "NONE", the list must contain at least one IP address,
otherwise this property is optional.
The servers listed will be combined to the base nameservers generated from
the specified DNS policy with duplicate addresses removed.

---

##### `options`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.parameter.options"></a>

- *Type:* typing.List[[`cdk8s_plus_27.DnsOption`](#cdk8s_plus_27.DnsOption)]

List of objects where each object may have a name property (required) and a value property (optional).

The contents in this property
will be merged to the options generated from the specified DNS policy.
Duplicate entries are removed.

---

##### `policy`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.parameter.policy"></a>

- *Type:* [`cdk8s_plus_27.DnsPolicy`](#cdk8s_plus_27.DnsPolicy)
- *Default:* DnsPolicy.CLUSTER_FIRST

Set DNS policy for the pod.

If policy is set to `None`, other configuration must be supplied.

---

##### `searches`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.parameter.searches"></a>

- *Type:* typing.List[`str`]

A list of DNS search domains for hostname lookup in the Pod.

When specified, the provided list will be merged into the base
search domain names generated from the chosen DNS policy.
Duplicate domain names are removed.

Kubernetes allows for at most 6 search domains.

---

##### `subdomain`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDnsProps.parameter.subdomain"></a>

- *Type:* `str`
- *Default:* No subdomain.

If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>".

---

#### Methods <a name="Methods"></a>

##### `add_nameserver` <a name="cdk8s_plus_27.PodDns.add_nameserver"></a>

```python
def add_nameserver(
  nameservers: str
)
```

###### `nameservers`<sup>Required</sup> <a name="cdk8s_plus_27.PodDns.parameter.nameservers"></a>

- *Type:* `str`

---

##### `add_option` <a name="cdk8s_plus_27.PodDns.add_option"></a>

```python
def add_option(
  name: str,
  value: str = None
)
```

###### `name`<sup>Required</sup> <a name="cdk8s_plus_27.DnsOption.parameter.name"></a>

- *Type:* `str`

Option name.

---

###### `value`<sup>Optional</sup> <a name="cdk8s_plus_27.DnsOption.parameter.value"></a>

- *Type:* `str`
- *Default:* No value.

Option value.

---

##### `add_search` <a name="cdk8s_plus_27.PodDns.add_search"></a>

```python
def add_search(
  searches: str
)
```

###### `searches`<sup>Required</sup> <a name="cdk8s_plus_27.PodDns.parameter.searches"></a>

- *Type:* `str`

---


#### Properties <a name="Properties"></a>

##### `hostname_as_fqd_n`<sup>Required</sup> <a name="cdk8s_plus_27.PodDns.property.hostname_as_fqd_n"></a>

```python
hostname_as_fqd_n: bool
```

- *Type:* `bool`

Whether or not the pods hostname is set to its FQDN.

---

##### `nameservers`<sup>Required</sup> <a name="cdk8s_plus_27.PodDns.property.nameservers"></a>

```python
nameservers: typing.List[str]
```

- *Type:* typing.List[`str`]

Nameservers defined for this pod.

---

##### `options`<sup>Required</sup> <a name="cdk8s_plus_27.PodDns.property.options"></a>

```python
options: typing.List[DnsOption]
```

- *Type:* typing.List[[`cdk8s_plus_27.DnsOption`](#cdk8s_plus_27.DnsOption)]

Custom dns options defined for this pod.

---

##### `policy`<sup>Required</sup> <a name="cdk8s_plus_27.PodDns.property.policy"></a>

```python
policy: DnsPolicy
```

- *Type:* [`cdk8s_plus_27.DnsPolicy`](#cdk8s_plus_27.DnsPolicy)

The DNS policy of this pod.

---

##### `searches`<sup>Required</sup> <a name="cdk8s_plus_27.PodDns.property.searches"></a>

```python
searches: typing.List[str]
```

- *Type:* typing.List[`str`]

Search domains defined for this pod.

---

##### `hostname`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDns.property.hostname"></a>

```python
hostname: str
```

- *Type:* `str`

The configured hostname of the pod.

Undefined means its set to a system-defined value.

---

##### `subdomain`<sup>Optional</sup> <a name="cdk8s_plus_27.PodDns.property.subdomain"></a>

```python
subdomain: str
```

- *Type:* `str`

The configured subdomain of the pod.

---


### PodScheduling <a name="cdk8s_plus_27.PodScheduling"></a>

Controls the pod scheduling strategy.

#### Initializers <a name="cdk8s_plus_27.PodScheduling.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodScheduling(
  instance: AbstractPod
)
```

##### `instance`<sup>Required</sup> <a name="cdk8s_plus_27.PodScheduling.parameter.instance"></a>

- *Type:* [`cdk8s_plus_27.AbstractPod`](#cdk8s_plus_27.AbstractPod)

---

#### Methods <a name="Methods"></a>

##### `assign` <a name="cdk8s_plus_27.PodScheduling.assign"></a>

```python
def assign(
  node: NamedNode
)
```

###### `node`<sup>Required</sup> <a name="cdk8s_plus_27.PodScheduling.parameter.node"></a>

- *Type:* [`cdk8s_plus_27.NamedNode`](#cdk8s_plus_27.NamedNode)

---

##### `attract` <a name="cdk8s_plus_27.PodScheduling.attract"></a>

```python
def attract(
  node: LabeledNode,
  weight: typing.Union[int, float] = None
)
```

###### `node`<sup>Required</sup> <a name="cdk8s_plus_27.PodScheduling.parameter.node"></a>

- *Type:* [`cdk8s_plus_27.LabeledNode`](#cdk8s_plus_27.LabeledNode)

---

###### `weight`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSchedulingAttractOptions.parameter.weight"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* no weight. assignment is assumed to be required (hard).

Indicates the attraction is optional (soft), with this weight score.

---

##### `colocate` <a name="cdk8s_plus_27.PodScheduling.colocate"></a>

```python
def colocate(
  selector: IPodSelector,
  topology: Topology = None,
  weight: typing.Union[int, float] = None
)
```

###### `selector`<sup>Required</sup> <a name="cdk8s_plus_27.PodScheduling.parameter.selector"></a>

- *Type:* [`cdk8s_plus_27.IPodSelector`](#cdk8s_plus_27.IPodSelector)

---

###### `topology`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSchedulingColocateOptions.parameter.topology"></a>

- *Type:* [`cdk8s_plus_27.Topology`](#cdk8s_plus_27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to coloate on.

---

###### `weight`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSchedulingColocateOptions.parameter.weight"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* no weight. co-location is assumed to be required (hard).

Indicates the co-location is optional (soft), with this weight score.

---

##### `separate` <a name="cdk8s_plus_27.PodScheduling.separate"></a>

```python
def separate(
  selector: IPodSelector,
  topology: Topology = None,
  weight: typing.Union[int, float] = None
)
```

###### `selector`<sup>Required</sup> <a name="cdk8s_plus_27.PodScheduling.parameter.selector"></a>

- *Type:* [`cdk8s_plus_27.IPodSelector`](#cdk8s_plus_27.IPodSelector)

---

###### `topology`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSchedulingSeparateOptions.parameter.topology"></a>

- *Type:* [`cdk8s_plus_27.Topology`](#cdk8s_plus_27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to separate on.

---

###### `weight`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSchedulingSeparateOptions.parameter.weight"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* no weight. separation is assumed to be required (hard).

Indicates the separation is optional (soft), with this weight score.

---

##### `tolerate` <a name="cdk8s_plus_27.PodScheduling.tolerate"></a>

```python
def tolerate(
  node: TaintedNode
)
```

###### `node`<sup>Required</sup> <a name="cdk8s_plus_27.PodScheduling.parameter.node"></a>

- *Type:* [`cdk8s_plus_27.TaintedNode`](#cdk8s_plus_27.TaintedNode)

---




### PodSecurityContext <a name="cdk8s_plus_27.PodSecurityContext"></a>

Holds pod-level security attributes and common container settings.

#### Initializers <a name="cdk8s_plus_27.PodSecurityContext.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.PodSecurityContext(
  ensure_non_root: bool = None,
  fs_group: typing.Union[int, float] = None,
  fs_group_change_policy: FsGroupChangePolicy = None,
  group: typing.Union[int, float] = None,
  sysctls: typing.List[Sysctl] = None,
  user: typing.Union[int, float] = None
)
```

##### `ensure_non_root`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.parameter.ensure_non_root"></a>

- *Type:* `bool`
- *Default:* true

Indicates that the container must run as a non-root user.

If true, the Kubelet will validate the image at runtime to ensure that it does
not run as UID 0 (root) and fail to start the container if it does.

---

##### `fs_group`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.parameter.fs_group"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* Volume ownership is not changed.

Modify the ownership and permissions of pod volumes to this GID.

---

##### `fs_group_change_policy`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.parameter.fs_group_change_policy"></a>

- *Type:* [`cdk8s_plus_27.FsGroupChangePolicy`](#cdk8s_plus_27.FsGroupChangePolicy)
- *Default:* FsGroupChangePolicy.ALWAYS

Defines behavior of changing ownership and permission of the volume before being exposed inside Pod.

This field will only apply to volume types which support fsGroup based ownership(and permissions).
It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir.

---

##### `group`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.parameter.group"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* Group configured by container runtime

The GID to run the entrypoint of the container process.

---

##### `sysctls`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.parameter.sysctls"></a>

- *Type:* typing.List[[`cdk8s_plus_27.Sysctl`](#cdk8s_plus_27.Sysctl)]
- *Default:* No sysctls

Sysctls hold a list of namespaced sysctls used for the pod.

Pods with unsupported sysctls (by the container runtime) might fail to launch.

---

##### `user`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContextProps.parameter.user"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* User specified in image metadata

The UID to run the entrypoint of the container process.

---



#### Properties <a name="Properties"></a>

##### `ensure_non_root`<sup>Required</sup> <a name="cdk8s_plus_27.PodSecurityContext.property.ensure_non_root"></a>

```python
ensure_non_root: bool
```

- *Type:* `bool`

---

##### `fs_group_change_policy`<sup>Required</sup> <a name="cdk8s_plus_27.PodSecurityContext.property.fs_group_change_policy"></a>

```python
fs_group_change_policy: FsGroupChangePolicy
```

- *Type:* [`cdk8s_plus_27.FsGroupChangePolicy`](#cdk8s_plus_27.FsGroupChangePolicy)

---

##### `sysctls`<sup>Required</sup> <a name="cdk8s_plus_27.PodSecurityContext.property.sysctls"></a>

```python
sysctls: typing.List[Sysctl]
```

- *Type:* typing.List[[`cdk8s_plus_27.Sysctl`](#cdk8s_plus_27.Sysctl)]

---

##### `fs_group`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContext.property.fs_group"></a>

```python
fs_group: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

---

##### `group`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContext.property.group"></a>

```python
group: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

---

##### `user`<sup>Optional</sup> <a name="cdk8s_plus_27.PodSecurityContext.property.user"></a>

```python
user: typing.Union[int, float]
```

- *Type:* `typing.Union[int, float]`

---


### Probe <a name="cdk8s_plus_27.Probe"></a>

Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.


#### Static Functions <a name="Static Functions"></a>

##### `from_command` <a name="cdk8s_plus_27.Probe.from_command"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Probe.from_command(
  command: typing.List[str],
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None
)
```

###### `command`<sup>Required</sup> <a name="cdk8s_plus_27.Probe.parameter.command"></a>

- *Type:* typing.List[`str`]

The command to execute.

---

###### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.CommandProbeOptions.parameter.failure_threshold"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

###### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.CommandProbeOptions.parameter.initial_delay_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

###### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.CommandProbeOptions.parameter.period_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

###### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.CommandProbeOptions.parameter.success_threshold"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

###### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.CommandProbeOptions.parameter.timeout_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

##### `from_http_get` <a name="cdk8s_plus_27.Probe.from_http_get"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Probe.from_http_get(
  path: str,
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None,
  port: typing.Union[int, float] = None,
  scheme: ConnectionScheme = None
)
```

###### `path`<sup>Required</sup> <a name="cdk8s_plus_27.Probe.parameter.path"></a>

- *Type:* `str`

The URL path to hit.

---

###### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.parameter.failure_threshold"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

###### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.parameter.initial_delay_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

###### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.parameter.period_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

###### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.parameter.success_threshold"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

###### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.parameter.timeout_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* defaults to `container.port`.

The TCP port to use when sending the GET request.

---

###### `scheme`<sup>Optional</sup> <a name="cdk8s_plus_27.HttpGetProbeOptions.parameter.scheme"></a>

- *Type:* [`cdk8s_plus_27.ConnectionScheme`](#cdk8s_plus_27.ConnectionScheme)
- *Default:* ConnectionScheme.HTTP

Scheme to use for connecting to the host (HTTP or HTTPS).

---

##### `from_tcp_socket` <a name="cdk8s_plus_27.Probe.from_tcp_socket"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Probe.from_tcp_socket(
  failure_threshold: typing.Union[int, float] = None,
  initial_delay_seconds: Duration = None,
  period_seconds: Duration = None,
  success_threshold: typing.Union[int, float] = None,
  timeout_seconds: Duration = None,
  host: str = None,
  port: typing.Union[int, float] = None
)
```

###### `failure_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.parameter.failure_threshold"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 3

Minimum consecutive failures for the probe to be considered failed after having succeeded.

Defaults to 3. Minimum value is 1.

---

###### `initial_delay_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.parameter.initial_delay_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* immediate

Number of seconds after the container has started before liveness probes are initiated.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

###### `period_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.parameter.period_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(10) Minimum value is 1.

How often (in seconds) to perform the probe.

Default to 10 seconds. Minimum value is 1.

---

###### `success_threshold`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.parameter.success_threshold"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 1 Must be 1 for liveness and startup. Minimum value is 1.

Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1.

Must be 1 for liveness and startup. Minimum value is 1.

---

###### `timeout_seconds`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.parameter.timeout_seconds"></a>

- *Type:* [`cdk8s.Duration`](#cdk8s.Duration)
- *Default:* Duration.seconds(1)

Number of seconds after which the probe times out.

Defaults to 1 second. Minimum value is 1.

> https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

---

###### `host`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.parameter.host"></a>

- *Type:* `str`
- *Default:* defaults to the pod IP

The host name to connect to on the container.

---

###### `port`<sup>Optional</sup> <a name="cdk8s_plus_27.TcpSocketProbeOptions.parameter.port"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* defaults to `container.port`.

The TCP port to connect to on the container.

---



### Replicas <a name="cdk8s_plus_27.Replicas"></a>

The amount of replicas that will change.


#### Static Functions <a name="Static Functions"></a>

##### `absolute` <a name="cdk8s_plus_27.Replicas.absolute"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Replicas.absolute(
  value: typing.Union[int, float]
)
```

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.Replicas.parameter.value"></a>

- *Type:* `typing.Union[int, float]`

The amount of change to apply.

Must be greater than 0.

---

##### `percent` <a name="cdk8s_plus_27.Replicas.percent"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Replicas.percent(
  value: typing.Union[int, float]
)
```

###### `value`<sup>Required</sup> <a name="cdk8s_plus_27.Replicas.parameter.value"></a>

- *Type:* `typing.Union[int, float]`

The percentage of change to apply.

Must be greater than 0.

---



### ResourcePermissions <a name="cdk8s_plus_27.ResourcePermissions"></a>

Controls permissions for operations on resources.

#### Initializers <a name="cdk8s_plus_27.ResourcePermissions.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.ResourcePermissions(
  instance: Resource
)
```

##### `instance`<sup>Required</sup> <a name="cdk8s_plus_27.ResourcePermissions.parameter.instance"></a>

- *Type:* [`cdk8s_plus_27.Resource`](#cdk8s_plus_27.Resource)

---

#### Methods <a name="Methods"></a>

##### `grant_read` <a name="cdk8s_plus_27.ResourcePermissions.grant_read"></a>

```python
def grant_read(
  subjects: ISubject
)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s_plus_27.ResourcePermissions.parameter.subjects"></a>

- *Type:* [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

---

##### `grant_read_write` <a name="cdk8s_plus_27.ResourcePermissions.grant_read_write"></a>

```python
def grant_read_write(
  subjects: ISubject
)
```

###### `subjects`<sup>Required</sup> <a name="cdk8s_plus_27.ResourcePermissions.parameter.subjects"></a>

- *Type:* [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

---




### StatefulSetUpdateStrategy <a name="cdk8s_plus_27.StatefulSetUpdateStrategy"></a>

StatefulSet update strategies.


#### Static Functions <a name="Static Functions"></a>

##### `on_delete` <a name="cdk8s_plus_27.StatefulSetUpdateStrategy.on_delete"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.StatefulSetUpdateStrategy.on_delete()
```

##### `rolling_update` <a name="cdk8s_plus_27.StatefulSetUpdateStrategy.rolling_update"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.StatefulSetUpdateStrategy.rolling_update(
  partition: typing.Union[int, float] = None
)
```

###### `partition`<sup>Optional</sup> <a name="cdk8s_plus_27.StatefulSetUpdateStrategyRollingUpdateOptions.parameter.partition"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* 0

If specified, all Pods with an ordinal that is greater than or equal to the partition will be updated when the StatefulSet's .spec.template is updated. All Pods with an ordinal that is less than the partition will not be updated, and, even if they are deleted, they will be recreated at the previous version.

If the partition is greater than replicas, updates to the pod template will not be propagated to Pods.
In most cases you will not need to use a partition, but they are useful if you want to stage an
update, roll out a canary, or perform a phased roll out.

> https://kubernetes.io/docs/concepts/workloads/controllers/statefulset/#partitions

---



### TaintedNode <a name="cdk8s_plus_27.TaintedNode"></a>

A node that is matched by taint selectors.

#### Initializers <a name="cdk8s_plus_27.TaintedNode.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.TaintedNode(
  taint_selector: typing.List[NodeTaintQuery]
)
```

##### `taint_selector`<sup>Required</sup> <a name="cdk8s_plus_27.TaintedNode.parameter.taint_selector"></a>

- *Type:* typing.List[[`cdk8s_plus_27.NodeTaintQuery`](#cdk8s_plus_27.NodeTaintQuery)]

---



#### Properties <a name="Properties"></a>

##### `taint_selector`<sup>Required</sup> <a name="cdk8s_plus_27.TaintedNode.property.taint_selector"></a>

```python
taint_selector: typing.List[NodeTaintQuery]
```

- *Type:* typing.List[[`cdk8s_plus_27.NodeTaintQuery`](#cdk8s_plus_27.NodeTaintQuery)]

---


### Topology <a name="cdk8s_plus_27.Topology"></a>

Available topology domains.


#### Static Functions <a name="Static Functions"></a>

##### `custom` <a name="cdk8s_plus_27.Topology.custom"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.Topology.custom(
  key: str
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.Topology.parameter.key"></a>

- *Type:* `str`

---

#### Properties <a name="Properties"></a>

##### `key`<sup>Required</sup> <a name="cdk8s_plus_27.Topology.property.key"></a>

```python
key: str
```

- *Type:* `str`

---

#### Constants <a name="Constants"></a>

##### `HOSTNAME` <a name="cdk8s_plus_27.Topology.property.HOSTNAME"></a>

- *Type:* [`cdk8s_plus_27.Topology`](#cdk8s_plus_27.Topology)

A hostname represents a single node in the cluster.

> https://kubernetes.io/docs/reference/labels-annotations-taints/#kubernetesiohostname

---

##### `REGION` <a name="cdk8s_plus_27.Topology.property.REGION"></a>

- *Type:* [`cdk8s_plus_27.Topology`](#cdk8s_plus_27.Topology)

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

##### `ZONE` <a name="cdk8s_plus_27.Topology.property.ZONE"></a>

- *Type:* [`cdk8s_plus_27.Topology`](#cdk8s_plus_27.Topology)

A zone represents a logical failure domain.

It is common for Kubernetes clusters to
span multiple zones for increased availability. While the exact definition of a zone is
left to infrastructure implementations, common properties of a zone include very low
network latency within a zone, no-cost network traffic within a zone, and failure
independence from other zones. For example, nodes within a zone might share a network
switch, but nodes in different zones should not.

> https://kubernetes.io/docs/reference/labels-annotations-taints/#topologykubernetesiozone

---

### WorkloadScheduling <a name="cdk8s_plus_27.WorkloadScheduling"></a>

Controls the pod scheduling strategy of this workload.

It offers some additional API's on top of the core pod scheduling.

#### Initializers <a name="cdk8s_plus_27.WorkloadScheduling.Initializer"></a>

```python
import cdk8s_plus_27

cdk8s_plus_27.WorkloadScheduling(
  instance: AbstractPod
)
```

##### `instance`<sup>Required</sup> <a name="cdk8s_plus_27.WorkloadScheduling.parameter.instance"></a>

- *Type:* [`cdk8s_plus_27.AbstractPod`](#cdk8s_plus_27.AbstractPod)

---

#### Methods <a name="Methods"></a>

##### `spread` <a name="cdk8s_plus_27.WorkloadScheduling.spread"></a>

```python
def spread(
  topology: Topology = None,
  weight: typing.Union[int, float] = None
)
```

###### `topology`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadSchedulingSpreadOptions.parameter.topology"></a>

- *Type:* [`cdk8s_plus_27.Topology`](#cdk8s_plus_27.Topology)
- *Default:* Topology.HOSTNAME

Which topology to spread on.

---

###### `weight`<sup>Optional</sup> <a name="cdk8s_plus_27.WorkloadSchedulingSpreadOptions.parameter.weight"></a>

- *Type:* `typing.Union[int, float]`
- *Default:* no weight. spread is assumed to be required.

Indicates the spread is optional, with this weight score.

---




## Protocols <a name="Protocols"></a>

### IApiEndpoint <a name="cdk8s_plus_27.IApiEndpoint"></a>

- *Implemented By:* [`cdk8s_plus_27.AbstractPod`](#cdk8s_plus_27.AbstractPod), [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource), [`cdk8s_plus_27.AwsElasticBlockStorePersistentVolume`](#cdk8s_plus_27.AwsElasticBlockStorePersistentVolume), [`cdk8s_plus_27.AzureDiskPersistentVolume`](#cdk8s_plus_27.AzureDiskPersistentVolume), [`cdk8s_plus_27.BasicAuthSecret`](#cdk8s_plus_27.BasicAuthSecret), [`cdk8s_plus_27.ClusterRole`](#cdk8s_plus_27.ClusterRole), [`cdk8s_plus_27.ClusterRoleBinding`](#cdk8s_plus_27.ClusterRoleBinding), [`cdk8s_plus_27.ConfigMap`](#cdk8s_plus_27.ConfigMap), [`cdk8s_plus_27.CronJob`](#cdk8s_plus_27.CronJob), [`cdk8s_plus_27.DaemonSet`](#cdk8s_plus_27.DaemonSet), [`cdk8s_plus_27.Deployment`](#cdk8s_plus_27.Deployment), [`cdk8s_plus_27.DockerConfigSecret`](#cdk8s_plus_27.DockerConfigSecret), [`cdk8s_plus_27.GCEPersistentDiskPersistentVolume`](#cdk8s_plus_27.GCEPersistentDiskPersistentVolume), [`cdk8s_plus_27.HorizontalPodAutoscaler`](#cdk8s_plus_27.HorizontalPodAutoscaler), [`cdk8s_plus_27.Ingress`](#cdk8s_plus_27.Ingress), [`cdk8s_plus_27.Job`](#cdk8s_plus_27.Job), [`cdk8s_plus_27.Namespace`](#cdk8s_plus_27.Namespace), [`cdk8s_plus_27.NetworkPolicy`](#cdk8s_plus_27.NetworkPolicy), [`cdk8s_plus_27.NonApiResource`](#cdk8s_plus_27.NonApiResource), [`cdk8s_plus_27.PersistentVolume`](#cdk8s_plus_27.PersistentVolume), [`cdk8s_plus_27.PersistentVolumeClaim`](#cdk8s_plus_27.PersistentVolumeClaim), [`cdk8s_plus_27.Pod`](#cdk8s_plus_27.Pod), [`cdk8s_plus_27.Resource`](#cdk8s_plus_27.Resource), [`cdk8s_plus_27.Role`](#cdk8s_plus_27.Role), [`cdk8s_plus_27.RoleBinding`](#cdk8s_plus_27.RoleBinding), [`cdk8s_plus_27.Secret`](#cdk8s_plus_27.Secret), [`cdk8s_plus_27.Service`](#cdk8s_plus_27.Service), [`cdk8s_plus_27.ServiceAccount`](#cdk8s_plus_27.ServiceAccount), [`cdk8s_plus_27.ServiceAccountTokenSecret`](#cdk8s_plus_27.ServiceAccountTokenSecret), [`cdk8s_plus_27.SshAuthSecret`](#cdk8s_plus_27.SshAuthSecret), [`cdk8s_plus_27.StatefulSet`](#cdk8s_plus_27.StatefulSet), [`cdk8s_plus_27.TlsSecret`](#cdk8s_plus_27.TlsSecret), [`cdk8s_plus_27.Workload`](#cdk8s_plus_27.Workload), [`cdk8s_plus_27.IApiEndpoint`](#cdk8s_plus_27.IApiEndpoint)

An API Endpoint can either be a resource descriptor (e.g /pods) or a non resource url (e.g /healthz). It must be one or the other, and not both.

#### Methods <a name="Methods"></a>

##### `as_api_resource` <a name="cdk8s_plus_27.IApiEndpoint.as_api_resource"></a>

```python
def as_api_resource()
```

##### `as_non_api_resource` <a name="cdk8s_plus_27.IApiEndpoint.as_non_api_resource"></a>

```python
def as_non_api_resource()
```


### IApiResource <a name="cdk8s_plus_27.IApiResource"></a>

- *Implemented By:* [`cdk8s_plus_27.AbstractPod`](#cdk8s_plus_27.AbstractPod), [`cdk8s_plus_27.ApiResource`](#cdk8s_plus_27.ApiResource), [`cdk8s_plus_27.AwsElasticBlockStorePersistentVolume`](#cdk8s_plus_27.AwsElasticBlockStorePersistentVolume), [`cdk8s_plus_27.AzureDiskPersistentVolume`](#cdk8s_plus_27.AzureDiskPersistentVolume), [`cdk8s_plus_27.BasicAuthSecret`](#cdk8s_plus_27.BasicAuthSecret), [`cdk8s_plus_27.ClusterRole`](#cdk8s_plus_27.ClusterRole), [`cdk8s_plus_27.ClusterRoleBinding`](#cdk8s_plus_27.ClusterRoleBinding), [`cdk8s_plus_27.ConfigMap`](#cdk8s_plus_27.ConfigMap), [`cdk8s_plus_27.CronJob`](#cdk8s_plus_27.CronJob), [`cdk8s_plus_27.DaemonSet`](#cdk8s_plus_27.DaemonSet), [`cdk8s_plus_27.Deployment`](#cdk8s_plus_27.Deployment), [`cdk8s_plus_27.DockerConfigSecret`](#cdk8s_plus_27.DockerConfigSecret), [`cdk8s_plus_27.GCEPersistentDiskPersistentVolume`](#cdk8s_plus_27.GCEPersistentDiskPersistentVolume), [`cdk8s_plus_27.HorizontalPodAutoscaler`](#cdk8s_plus_27.HorizontalPodAutoscaler), [`cdk8s_plus_27.Ingress`](#cdk8s_plus_27.Ingress), [`cdk8s_plus_27.Job`](#cdk8s_plus_27.Job), [`cdk8s_plus_27.Namespace`](#cdk8s_plus_27.Namespace), [`cdk8s_plus_27.NetworkPolicy`](#cdk8s_plus_27.NetworkPolicy), [`cdk8s_plus_27.PersistentVolume`](#cdk8s_plus_27.PersistentVolume), [`cdk8s_plus_27.PersistentVolumeClaim`](#cdk8s_plus_27.PersistentVolumeClaim), [`cdk8s_plus_27.Pod`](#cdk8s_plus_27.Pod), [`cdk8s_plus_27.Resource`](#cdk8s_plus_27.Resource), [`cdk8s_plus_27.Role`](#cdk8s_plus_27.Role), [`cdk8s_plus_27.RoleBinding`](#cdk8s_plus_27.RoleBinding), [`cdk8s_plus_27.Secret`](#cdk8s_plus_27.Secret), [`cdk8s_plus_27.Service`](#cdk8s_plus_27.Service), [`cdk8s_plus_27.ServiceAccount`](#cdk8s_plus_27.ServiceAccount), [`cdk8s_plus_27.ServiceAccountTokenSecret`](#cdk8s_plus_27.ServiceAccountTokenSecret), [`cdk8s_plus_27.SshAuthSecret`](#cdk8s_plus_27.SshAuthSecret), [`cdk8s_plus_27.StatefulSet`](#cdk8s_plus_27.StatefulSet), [`cdk8s_plus_27.TlsSecret`](#cdk8s_plus_27.TlsSecret), [`cdk8s_plus_27.Workload`](#cdk8s_plus_27.Workload), [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource), [`cdk8s_plus_27.IClusterRole`](#cdk8s_plus_27.IClusterRole), [`cdk8s_plus_27.IConfigMap`](#cdk8s_plus_27.IConfigMap), [`cdk8s_plus_27.IPersistentVolume`](#cdk8s_plus_27.IPersistentVolume), [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim), [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource), [`cdk8s_plus_27.IRole`](#cdk8s_plus_27.IRole), [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret), [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)

Represents a resource or collection of resources.


#### Properties <a name="Properties"></a>

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.IApiResource.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.IApiResource.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resource_name`<sup>Optional</sup> <a name="cdk8s_plus_27.IApiResource.property.resource_name"></a>

```python
resource_name: str
```

- *Type:* `str`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

### IClusterRole <a name="cdk8s_plus_27.IClusterRole"></a>

- *Extends:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource)

- *Implemented By:* [`cdk8s_plus_27.ClusterRole`](#cdk8s_plus_27.ClusterRole), [`cdk8s_plus_27.IClusterRole`](#cdk8s_plus_27.IClusterRole)

Represents a cluster-level role.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.IClusterRole.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.IClusterRole.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.IClusterRole.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resource_name`<sup>Optional</sup> <a name="cdk8s_plus_27.IClusterRole.property.resource_name"></a>

```python
resource_name: str
```

- *Type:* `str`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `api_version`<sup>Required</sup> <a name="cdk8s_plus_27.IClusterRole.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.IClusterRole.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.IClusterRole.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### IConfigMap <a name="cdk8s_plus_27.IConfigMap"></a>

- *Extends:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource)

- *Implemented By:* [`cdk8s_plus_27.ConfigMap`](#cdk8s_plus_27.ConfigMap), [`cdk8s_plus_27.IConfigMap`](#cdk8s_plus_27.IConfigMap)

Represents a config map.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.IConfigMap.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.IConfigMap.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.IConfigMap.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resource_name`<sup>Optional</sup> <a name="cdk8s_plus_27.IConfigMap.property.resource_name"></a>

```python
resource_name: str
```

- *Type:* `str`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `api_version`<sup>Required</sup> <a name="cdk8s_plus_27.IConfigMap.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.IConfigMap.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.IConfigMap.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### INamespaceSelector <a name="cdk8s_plus_27.INamespaceSelector"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct)

- *Implemented By:* [`cdk8s_plus_27.Namespace`](#cdk8s_plus_27.Namespace), [`cdk8s_plus_27.Namespaces`](#cdk8s_plus_27.Namespaces), [`cdk8s_plus_27.INamespaceSelector`](#cdk8s_plus_27.INamespaceSelector)

Represents an object that can select namespaces.

#### Methods <a name="Methods"></a>

##### `to_namespace_selector_config` <a name="cdk8s_plus_27.INamespaceSelector.to_namespace_selector_config"></a>

```python
def to_namespace_selector_config()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.INamespaceSelector.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

### INetworkPolicyPeer <a name="cdk8s_plus_27.INetworkPolicyPeer"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct)

- *Implemented By:* [`cdk8s_plus_27.AbstractPod`](#cdk8s_plus_27.AbstractPod), [`cdk8s_plus_27.CronJob`](#cdk8s_plus_27.CronJob), [`cdk8s_plus_27.DaemonSet`](#cdk8s_plus_27.DaemonSet), [`cdk8s_plus_27.Deployment`](#cdk8s_plus_27.Deployment), [`cdk8s_plus_27.Job`](#cdk8s_plus_27.Job), [`cdk8s_plus_27.Namespace`](#cdk8s_plus_27.Namespace), [`cdk8s_plus_27.Namespaces`](#cdk8s_plus_27.Namespaces), [`cdk8s_plus_27.NetworkPolicyIpBlock`](#cdk8s_plus_27.NetworkPolicyIpBlock), [`cdk8s_plus_27.Pod`](#cdk8s_plus_27.Pod), [`cdk8s_plus_27.StatefulSet`](#cdk8s_plus_27.StatefulSet), [`cdk8s_plus_27.Workload`](#cdk8s_plus_27.Workload), [`cdk8s_plus_27.INetworkPolicyPeer`](#cdk8s_plus_27.INetworkPolicyPeer)

Describes a peer to allow traffic to/from.

#### Methods <a name="Methods"></a>

##### `to_network_policy_peer_config` <a name="cdk8s_plus_27.INetworkPolicyPeer.to_network_policy_peer_config"></a>

```python
def to_network_policy_peer_config()
```

##### `to_pod_selector` <a name="cdk8s_plus_27.INetworkPolicyPeer.to_pod_selector"></a>

```python
def to_pod_selector()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.INetworkPolicyPeer.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

### IPersistentVolume <a name="cdk8s_plus_27.IPersistentVolume"></a>

- *Extends:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource)

- *Implemented By:* [`cdk8s_plus_27.AwsElasticBlockStorePersistentVolume`](#cdk8s_plus_27.AwsElasticBlockStorePersistentVolume), [`cdk8s_plus_27.AzureDiskPersistentVolume`](#cdk8s_plus_27.AzureDiskPersistentVolume), [`cdk8s_plus_27.GCEPersistentDiskPersistentVolume`](#cdk8s_plus_27.GCEPersistentDiskPersistentVolume), [`cdk8s_plus_27.PersistentVolume`](#cdk8s_plus_27.PersistentVolume), [`cdk8s_plus_27.IPersistentVolume`](#cdk8s_plus_27.IPersistentVolume)

Contract of a `PersistentVolumeClaim`.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolume.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolume.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolume.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resource_name`<sup>Optional</sup> <a name="cdk8s_plus_27.IPersistentVolume.property.resource_name"></a>

```python
resource_name: str
```

- *Type:* `str`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `api_version`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolume.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolume.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolume.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### IPersistentVolumeClaim <a name="cdk8s_plus_27.IPersistentVolumeClaim"></a>

- *Extends:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource)

- *Implemented By:* [`cdk8s_plus_27.PersistentVolumeClaim`](#cdk8s_plus_27.PersistentVolumeClaim), [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim)

Contract of a `PersistentVolumeClaim`.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolumeClaim.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolumeClaim.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolumeClaim.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resource_name`<sup>Optional</sup> <a name="cdk8s_plus_27.IPersistentVolumeClaim.property.resource_name"></a>

```python
resource_name: str
```

- *Type:* `str`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `api_version`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolumeClaim.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolumeClaim.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.IPersistentVolumeClaim.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### IPodSelector <a name="cdk8s_plus_27.IPodSelector"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct)

- *Implemented By:* [`cdk8s_plus_27.AbstractPod`](#cdk8s_plus_27.AbstractPod), [`cdk8s_plus_27.CronJob`](#cdk8s_plus_27.CronJob), [`cdk8s_plus_27.DaemonSet`](#cdk8s_plus_27.DaemonSet), [`cdk8s_plus_27.Deployment`](#cdk8s_plus_27.Deployment), [`cdk8s_plus_27.Job`](#cdk8s_plus_27.Job), [`cdk8s_plus_27.Pod`](#cdk8s_plus_27.Pod), [`cdk8s_plus_27.Pods`](#cdk8s_plus_27.Pods), [`cdk8s_plus_27.StatefulSet`](#cdk8s_plus_27.StatefulSet), [`cdk8s_plus_27.Workload`](#cdk8s_plus_27.Workload), [`cdk8s_plus_27.IPodSelector`](#cdk8s_plus_27.IPodSelector)

Represents an object that can select pods.

#### Methods <a name="Methods"></a>

##### `to_pod_selector_config` <a name="cdk8s_plus_27.IPodSelector.to_pod_selector_config"></a>

```python
def to_pod_selector_config()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.IPodSelector.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

### IResource <a name="cdk8s_plus_27.IResource"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct), [`cdk8s_plus_27.IApiResource`](#cdk8s_plus_27.IApiResource)

- *Implemented By:* [`cdk8s_plus_27.AbstractPod`](#cdk8s_plus_27.AbstractPod), [`cdk8s_plus_27.AwsElasticBlockStorePersistentVolume`](#cdk8s_plus_27.AwsElasticBlockStorePersistentVolume), [`cdk8s_plus_27.AzureDiskPersistentVolume`](#cdk8s_plus_27.AzureDiskPersistentVolume), [`cdk8s_plus_27.BasicAuthSecret`](#cdk8s_plus_27.BasicAuthSecret), [`cdk8s_plus_27.ClusterRole`](#cdk8s_plus_27.ClusterRole), [`cdk8s_plus_27.ClusterRoleBinding`](#cdk8s_plus_27.ClusterRoleBinding), [`cdk8s_plus_27.ConfigMap`](#cdk8s_plus_27.ConfigMap), [`cdk8s_plus_27.CronJob`](#cdk8s_plus_27.CronJob), [`cdk8s_plus_27.DaemonSet`](#cdk8s_plus_27.DaemonSet), [`cdk8s_plus_27.Deployment`](#cdk8s_plus_27.Deployment), [`cdk8s_plus_27.DockerConfigSecret`](#cdk8s_plus_27.DockerConfigSecret), [`cdk8s_plus_27.GCEPersistentDiskPersistentVolume`](#cdk8s_plus_27.GCEPersistentDiskPersistentVolume), [`cdk8s_plus_27.HorizontalPodAutoscaler`](#cdk8s_plus_27.HorizontalPodAutoscaler), [`cdk8s_plus_27.Ingress`](#cdk8s_plus_27.Ingress), [`cdk8s_plus_27.Job`](#cdk8s_plus_27.Job), [`cdk8s_plus_27.Namespace`](#cdk8s_plus_27.Namespace), [`cdk8s_plus_27.NetworkPolicy`](#cdk8s_plus_27.NetworkPolicy), [`cdk8s_plus_27.PersistentVolume`](#cdk8s_plus_27.PersistentVolume), [`cdk8s_plus_27.PersistentVolumeClaim`](#cdk8s_plus_27.PersistentVolumeClaim), [`cdk8s_plus_27.Pod`](#cdk8s_plus_27.Pod), [`cdk8s_plus_27.Resource`](#cdk8s_plus_27.Resource), [`cdk8s_plus_27.Role`](#cdk8s_plus_27.Role), [`cdk8s_plus_27.RoleBinding`](#cdk8s_plus_27.RoleBinding), [`cdk8s_plus_27.Secret`](#cdk8s_plus_27.Secret), [`cdk8s_plus_27.Service`](#cdk8s_plus_27.Service), [`cdk8s_plus_27.ServiceAccount`](#cdk8s_plus_27.ServiceAccount), [`cdk8s_plus_27.ServiceAccountTokenSecret`](#cdk8s_plus_27.ServiceAccountTokenSecret), [`cdk8s_plus_27.SshAuthSecret`](#cdk8s_plus_27.SshAuthSecret), [`cdk8s_plus_27.StatefulSet`](#cdk8s_plus_27.StatefulSet), [`cdk8s_plus_27.TlsSecret`](#cdk8s_plus_27.TlsSecret), [`cdk8s_plus_27.Workload`](#cdk8s_plus_27.Workload), [`cdk8s_plus_27.IClusterRole`](#cdk8s_plus_27.IClusterRole), [`cdk8s_plus_27.IConfigMap`](#cdk8s_plus_27.IConfigMap), [`cdk8s_plus_27.IPersistentVolume`](#cdk8s_plus_27.IPersistentVolume), [`cdk8s_plus_27.IPersistentVolumeClaim`](#cdk8s_plus_27.IPersistentVolumeClaim), [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource), [`cdk8s_plus_27.IRole`](#cdk8s_plus_27.IRole), [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret), [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)

Represents a resource.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.IResource.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.IResource.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.IResource.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resource_name`<sup>Optional</sup> <a name="cdk8s_plus_27.IResource.property.resource_name"></a>

```python
resource_name: str
```

- *Type:* `str`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `api_version`<sup>Required</sup> <a name="cdk8s_plus_27.IResource.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.IResource.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.IResource.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### IRole <a name="cdk8s_plus_27.IRole"></a>

- *Extends:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource)

- *Implemented By:* [`cdk8s_plus_27.ClusterRole`](#cdk8s_plus_27.ClusterRole), [`cdk8s_plus_27.Role`](#cdk8s_plus_27.Role), [`cdk8s_plus_27.IRole`](#cdk8s_plus_27.IRole)

A reference to any Role or ClusterRole.


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.IRole.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.IRole.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.IRole.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resource_name`<sup>Optional</sup> <a name="cdk8s_plus_27.IRole.property.resource_name"></a>

```python
resource_name: str
```

- *Type:* `str`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `api_version`<sup>Required</sup> <a name="cdk8s_plus_27.IRole.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.IRole.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.IRole.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### IScalable <a name="cdk8s_plus_27.IScalable"></a>

- *Implemented By:* [`cdk8s_plus_27.Deployment`](#cdk8s_plus_27.Deployment), [`cdk8s_plus_27.StatefulSet`](#cdk8s_plus_27.StatefulSet), [`cdk8s_plus_27.IScalable`](#cdk8s_plus_27.IScalable)

Represents a scalable workload.

#### Methods <a name="Methods"></a>

##### `mark_has_autoscaler` <a name="cdk8s_plus_27.IScalable.mark_has_autoscaler"></a>

```python
def mark_has_autoscaler()
```

##### `to_scaling_target` <a name="cdk8s_plus_27.IScalable.to_scaling_target"></a>

```python
def to_scaling_target()
```

#### Properties <a name="Properties"></a>

##### `has_autoscaler`<sup>Required</sup> <a name="cdk8s_plus_27.IScalable.property.has_autoscaler"></a>

```python
has_autoscaler: bool
```

- *Type:* `bool`

If this is a target of an autoscaler.

---

### ISecret <a name="cdk8s_plus_27.ISecret"></a>

- *Extends:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource)

- *Implemented By:* [`cdk8s_plus_27.BasicAuthSecret`](#cdk8s_plus_27.BasicAuthSecret), [`cdk8s_plus_27.DockerConfigSecret`](#cdk8s_plus_27.DockerConfigSecret), [`cdk8s_plus_27.Secret`](#cdk8s_plus_27.Secret), [`cdk8s_plus_27.ServiceAccountTokenSecret`](#cdk8s_plus_27.ServiceAccountTokenSecret), [`cdk8s_plus_27.SshAuthSecret`](#cdk8s_plus_27.SshAuthSecret), [`cdk8s_plus_27.TlsSecret`](#cdk8s_plus_27.TlsSecret), [`cdk8s_plus_27.ISecret`](#cdk8s_plus_27.ISecret)

#### Methods <a name="Methods"></a>

##### `env_value` <a name="cdk8s_plus_27.ISecret.env_value"></a>

```python
def env_value(
  key: str,
  optional: bool = None
)
```

###### `key`<sup>Required</sup> <a name="cdk8s_plus_27.ISecret.parameter.key"></a>

- *Type:* `str`

Secret's key.

---

###### `optional`<sup>Optional</sup> <a name="cdk8s_plus_27.EnvValueFromSecretOptions.parameter.optional"></a>

- *Type:* `bool`
- *Default:* false

Specify whether the Secret or its key must be defined.

---

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.ISecret.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.ISecret.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.ISecret.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resource_name`<sup>Optional</sup> <a name="cdk8s_plus_27.ISecret.property.resource_name"></a>

```python
resource_name: str
```

- *Type:* `str`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `api_version`<sup>Required</sup> <a name="cdk8s_plus_27.ISecret.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.ISecret.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.ISecret.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### IServiceAccount <a name="cdk8s_plus_27.IServiceAccount"></a>

- *Extends:* [`cdk8s_plus_27.IResource`](#cdk8s_plus_27.IResource), [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

- *Implemented By:* [`cdk8s_plus_27.ServiceAccount`](#cdk8s_plus_27.ServiceAccount), [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount)


#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.IServiceAccount.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

##### `api_group`<sup>Required</sup> <a name="cdk8s_plus_27.IServiceAccount.property.api_group"></a>

```python
api_group: str
```

- *Type:* `str`

The group portion of the API version (e.g. `authorization.k8s.io`).

---

##### `resource_type`<sup>Required</sup> <a name="cdk8s_plus_27.IServiceAccount.property.resource_type"></a>

```python
resource_type: str
```

- *Type:* `str`

The name of a resource type as it appears in the relevant API endpoint.

> https://kubernetes.io/docs/reference/access-authn-authz/rbac/#referring-to-resources

---

##### `resource_name`<sup>Optional</sup> <a name="cdk8s_plus_27.IServiceAccount.property.resource_name"></a>

```python
resource_name: str
```

- *Type:* `str`

The unique, namespace-global, name of an object inside the Kubernetes cluster.

If this is omitted, the ApiResource should represent all objects of the given type.

---

##### `api_version`<sup>Required</sup> <a name="cdk8s_plus_27.IServiceAccount.property.api_version"></a>

```python
api_version: str
```

- *Type:* `str`

The object's API version (e.g. "authorization.k8s.io/v1").

---

##### `kind`<sup>Required</sup> <a name="cdk8s_plus_27.IServiceAccount.property.kind"></a>

```python
kind: str
```

- *Type:* `str`

The object kind (e.g. "Deployment").

---

##### `name`<sup>Required</sup> <a name="cdk8s_plus_27.IServiceAccount.property.name"></a>

```python
name: str
```

- *Type:* `str`

The Kubernetes name of this resource.

---

### IStorage <a name="cdk8s_plus_27.IStorage"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct)

- *Implemented By:* [`cdk8s_plus_27.AwsElasticBlockStorePersistentVolume`](#cdk8s_plus_27.AwsElasticBlockStorePersistentVolume), [`cdk8s_plus_27.AzureDiskPersistentVolume`](#cdk8s_plus_27.AzureDiskPersistentVolume), [`cdk8s_plus_27.GCEPersistentDiskPersistentVolume`](#cdk8s_plus_27.GCEPersistentDiskPersistentVolume), [`cdk8s_plus_27.PersistentVolume`](#cdk8s_plus_27.PersistentVolume), [`cdk8s_plus_27.Volume`](#cdk8s_plus_27.Volume), [`cdk8s_plus_27.IStorage`](#cdk8s_plus_27.IStorage)

Represents a piece of storage in the cluster.

#### Methods <a name="Methods"></a>

##### `as_volume` <a name="cdk8s_plus_27.IStorage.as_volume"></a>

```python
def as_volume()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.IStorage.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

### ISubject <a name="cdk8s_plus_27.ISubject"></a>

- *Extends:* [`constructs.IConstruct`](#constructs.IConstruct)

- *Implemented By:* [`cdk8s_plus_27.AbstractPod`](#cdk8s_plus_27.AbstractPod), [`cdk8s_plus_27.CronJob`](#cdk8s_plus_27.CronJob), [`cdk8s_plus_27.DaemonSet`](#cdk8s_plus_27.DaemonSet), [`cdk8s_plus_27.Deployment`](#cdk8s_plus_27.Deployment), [`cdk8s_plus_27.Group`](#cdk8s_plus_27.Group), [`cdk8s_plus_27.Job`](#cdk8s_plus_27.Job), [`cdk8s_plus_27.Pod`](#cdk8s_plus_27.Pod), [`cdk8s_plus_27.ServiceAccount`](#cdk8s_plus_27.ServiceAccount), [`cdk8s_plus_27.StatefulSet`](#cdk8s_plus_27.StatefulSet), [`cdk8s_plus_27.User`](#cdk8s_plus_27.User), [`cdk8s_plus_27.Workload`](#cdk8s_plus_27.Workload), [`cdk8s_plus_27.IServiceAccount`](#cdk8s_plus_27.IServiceAccount), [`cdk8s_plus_27.ISubject`](#cdk8s_plus_27.ISubject)

Represents an object that can be used as a role binding subject.

#### Methods <a name="Methods"></a>

##### `to_subject_configuration` <a name="cdk8s_plus_27.ISubject.to_subject_configuration"></a>

```python
def to_subject_configuration()
```

#### Properties <a name="Properties"></a>

##### `node`<sup>Required</sup> <a name="cdk8s_plus_27.ISubject.property.node"></a>

```python
node: Node
```

- *Type:* [`constructs.Node`](#constructs.Node)

The tree node.

---

## Enums <a name="Enums"></a>

### AzureDiskPersistentVolumeCachingMode <a name="AzureDiskPersistentVolumeCachingMode"></a>

Azure disk caching modes.

#### `NONE` <a name="cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode.NONE"></a>

None.

---


#### `READ_ONLY` <a name="cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode.READ_ONLY"></a>

ReadOnly.

---


#### `READ_WRITE` <a name="cdk8s_plus_27.AzureDiskPersistentVolumeCachingMode.READ_WRITE"></a>

ReadWrite.

---


### AzureDiskPersistentVolumeKind <a name="AzureDiskPersistentVolumeKind"></a>

Azure Disk kinds.

#### `SHARED` <a name="cdk8s_plus_27.AzureDiskPersistentVolumeKind.SHARED"></a>

Multiple blob disks per storage account.

---


#### `DEDICATED` <a name="cdk8s_plus_27.AzureDiskPersistentVolumeKind.DEDICATED"></a>

Single blob disk per storage account.

---


#### `MANAGED` <a name="cdk8s_plus_27.AzureDiskPersistentVolumeKind.MANAGED"></a>

Azure managed data disk.

---


### ConcurrencyPolicy <a name="ConcurrencyPolicy"></a>

Concurrency policy for CronJobs.

#### `ALLOW` <a name="cdk8s_plus_27.ConcurrencyPolicy.ALLOW"></a>

This policy allows to run job concurrently.

---


#### `FORBID` <a name="cdk8s_plus_27.ConcurrencyPolicy.FORBID"></a>

This policy does not allow to run job concurrently.

It does not let a new job to be scheduled if the previous one is not finished yet.

---


#### `REPLACE` <a name="cdk8s_plus_27.ConcurrencyPolicy.REPLACE"></a>

This policy replaces the currently running job if a new job is being scheduled.

---


### ConnectionScheme <a name="ConnectionScheme"></a>

#### `HTTP` <a name="cdk8s_plus_27.ConnectionScheme.HTTP"></a>

Use HTTP request for connecting to host.

---


#### `HTTPS` <a name="cdk8s_plus_27.ConnectionScheme.HTTPS"></a>

Use HTTPS request for connecting to host.

---


### DnsPolicy <a name="DnsPolicy"></a>

Pod DNS policies.

#### `CLUSTER_FIRST` <a name="cdk8s_plus_27.DnsPolicy.CLUSTER_FIRST"></a>

Any DNS query that does not match the configured cluster domain suffix, such as "www.kubernetes.io", is forwarded to the upstream nameserver inherited from the node. Cluster administrators may have extra stub-domain and upstream DNS servers configured.

---


#### `CLUSTER_FIRST_WITH_HOST_NET` <a name="cdk8s_plus_27.DnsPolicy.CLUSTER_FIRST_WITH_HOST_NET"></a>

For Pods running with hostNetwork, you should explicitly set its DNS policy "ClusterFirstWithHostNet".

---


#### `DEFAULT` <a name="cdk8s_plus_27.DnsPolicy.DEFAULT"></a>

The Pod inherits the name resolution configuration from the node that the pods run on.

---


#### `NONE` <a name="cdk8s_plus_27.DnsPolicy.NONE"></a>

It allows a Pod to ignore DNS settings from the Kubernetes environment.

All DNS settings are supposed to be provided using the dnsConfig
field in the Pod Spec.

---


### EmptyDirMedium <a name="EmptyDirMedium"></a>

The medium on which to store the volume.

#### `DEFAULT` <a name="cdk8s_plus_27.EmptyDirMedium.DEFAULT"></a>

The default volume of the backing node.

---


#### `MEMORY` <a name="cdk8s_plus_27.EmptyDirMedium.MEMORY"></a>

Mount a tmpfs (RAM-backed filesystem) for you instead.

While tmpfs is very
fast, be aware that unlike disks, tmpfs is cleared on node reboot and any
files you write will count against your Container's memory limit.

---


### EnvFieldPaths <a name="EnvFieldPaths"></a>

#### `POD_NAME` <a name="cdk8s_plus_27.EnvFieldPaths.POD_NAME"></a>

The name of the pod.

---


#### `POD_NAMESPACE` <a name="cdk8s_plus_27.EnvFieldPaths.POD_NAMESPACE"></a>

The namespace of the pod.

---


#### `POD_UID` <a name="cdk8s_plus_27.EnvFieldPaths.POD_UID"></a>

The uid of the pod.

---


#### `POD_LABEL` <a name="cdk8s_plus_27.EnvFieldPaths.POD_LABEL"></a>

The labels of the pod.

---


#### `POD_ANNOTATION` <a name="cdk8s_plus_27.EnvFieldPaths.POD_ANNOTATION"></a>

The annotations of the pod.

---


#### `POD_IP` <a name="cdk8s_plus_27.EnvFieldPaths.POD_IP"></a>

The ipAddress of the pod.

---


#### `SERVICE_ACCOUNT_NAME` <a name="cdk8s_plus_27.EnvFieldPaths.SERVICE_ACCOUNT_NAME"></a>

The service account name of the pod.

---


#### `NODE_NAME` <a name="cdk8s_plus_27.EnvFieldPaths.NODE_NAME"></a>

The name of the node.

---


#### `NODE_IP` <a name="cdk8s_plus_27.EnvFieldPaths.NODE_IP"></a>

The ipAddress of the node.

---


#### `POD_IPS` <a name="cdk8s_plus_27.EnvFieldPaths.POD_IPS"></a>

The ipAddresess of the pod.

---


### FsGroupChangePolicy <a name="FsGroupChangePolicy"></a>

#### `ON_ROOT_MISMATCH` <a name="cdk8s_plus_27.FsGroupChangePolicy.ON_ROOT_MISMATCH"></a>

Only change permissions and ownership if permission and ownership of root directory does not match with expected permissions of the volume.

This could help shorten the time it takes to change ownership and permission of a volume

---


#### `ALWAYS` <a name="cdk8s_plus_27.FsGroupChangePolicy.ALWAYS"></a>

Always change permission and ownership of the volume when volume is mounted.

---


### HostPathVolumeType <a name="HostPathVolumeType"></a>

Host path types.

#### `DEFAULT` <a name="cdk8s_plus_27.HostPathVolumeType.DEFAULT"></a>

Empty string (default) is for backward compatibility, which means that no checks will be performed before mounting the hostPath volume.

---


#### `DIRECTORY_OR_CREATE` <a name="cdk8s_plus_27.HostPathVolumeType.DIRECTORY_OR_CREATE"></a>

If nothing exists at the given path, an empty directory will be created there as needed with permission set to 0755, having the same group and ownership with Kubelet.

---


#### `DIRECTORY` <a name="cdk8s_plus_27.HostPathVolumeType.DIRECTORY"></a>

A directory must exist at the given path.

---


#### `FILE_OR_CREATE` <a name="cdk8s_plus_27.HostPathVolumeType.FILE_OR_CREATE"></a>

If nothing exists at the given path, an empty file will be created there as needed with permission set to 0644, having the same group and ownership with Kubelet.

---


#### `FILE` <a name="cdk8s_plus_27.HostPathVolumeType.FILE"></a>

A file must exist at the given path.

---


#### `SOCKET` <a name="cdk8s_plus_27.HostPathVolumeType.SOCKET"></a>

A UNIX socket must exist at the given path.

---


#### `CHAR_DEVICE` <a name="cdk8s_plus_27.HostPathVolumeType.CHAR_DEVICE"></a>

A character device must exist at the given path.

---


#### `BLOCK_DEVICE` <a name="cdk8s_plus_27.HostPathVolumeType.BLOCK_DEVICE"></a>

A block device must exist at the given path.

---


### HttpIngressPathType <a name="HttpIngressPathType"></a>

Specify how the path is matched against request paths.

> https://kubernetes.io/docs/concepts/services-networking/ingress/#path-types

#### `PREFIX` <a name="cdk8s_plus_27.HttpIngressPathType.PREFIX"></a>

Matches the URL path exactly.

---


#### `EXACT` <a name="cdk8s_plus_27.HttpIngressPathType.EXACT"></a>

Matches based on a URL path prefix split by '/'.

---


#### `IMPLEMENTATION_SPECIFIC` <a name="cdk8s_plus_27.HttpIngressPathType.IMPLEMENTATION_SPECIFIC"></a>

Matching is specified by the underlying IngressClass.

---


### ImagePullPolicy <a name="ImagePullPolicy"></a>

#### `ALWAYS` <a name="cdk8s_plus_27.ImagePullPolicy.ALWAYS"></a>

Every time the kubelet launches a container, the kubelet queries the container image registry to resolve the name to an image digest.

If the kubelet has a container image with that exact
digest cached locally, the kubelet uses its cached image; otherwise, the kubelet downloads
(pulls) the image with the resolved digest, and uses that image to launch the container.

Default is Always if ImagePullPolicy is omitted and either the image tag is :latest or
the image tag is omitted.

---


#### `IF_NOT_PRESENT` <a name="cdk8s_plus_27.ImagePullPolicy.IF_NOT_PRESENT"></a>

The image is pulled only if it is not already present locally.

Default is IfNotPresent if ImagePullPolicy is omitted and the image tag is present but
not :latest

---


#### `NEVER` <a name="cdk8s_plus_27.ImagePullPolicy.NEVER"></a>

The image is assumed to exist locally.

No attempt is made to pull the image.

---


### MountPropagation <a name="MountPropagation"></a>

#### `NONE` <a name="cdk8s_plus_27.MountPropagation.NONE"></a>

This volume mount will not receive any subsequent mounts that are mounted to this volume or any of its subdirectories by the host.

In similar
fashion, no mounts created by the Container will be visible on the host.

This is the default mode.

This mode is equal to `private` mount propagation as described in the Linux
kernel documentation

---


#### `HOST_TO_CONTAINER` <a name="cdk8s_plus_27.MountPropagation.HOST_TO_CONTAINER"></a>

This volume mount will receive all subsequent mounts that are mounted to this volume or any of its subdirectories.

In other words, if the host mounts anything inside the volume mount, the
Container will see it mounted there.

Similarly, if any Pod with Bidirectional mount propagation to the same
volume mounts anything there, the Container with HostToContainer mount
propagation will see it.

This mode is equal to `rslave` mount propagation as described in the Linux
kernel documentation

---


#### `BIDIRECTIONAL` <a name="cdk8s_plus_27.MountPropagation.BIDIRECTIONAL"></a>

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

#### `DENY` <a name="cdk8s_plus_27.NetworkPolicyTrafficDefault.DENY"></a>

The policy denies all traffic.

Since rules are additive, additional rules or policies can allow
specific traffic.

---


#### `ALLOW` <a name="cdk8s_plus_27.NetworkPolicyTrafficDefault.ALLOW"></a>

The policy allows all traffic (either ingress or egress).

Since rules are additive, no additional rule or policies can
subsequently deny the traffic.

---


### NetworkProtocol <a name="NetworkProtocol"></a>

Network protocols.

#### `TCP` <a name="cdk8s_plus_27.NetworkProtocol.TCP"></a>

TCP.

---


#### `UDP` <a name="cdk8s_plus_27.NetworkProtocol.UDP"></a>

UDP.

---


#### `SCTP` <a name="cdk8s_plus_27.NetworkProtocol.SCTP"></a>

SCTP.

---


### PersistentVolumeAccessMode <a name="PersistentVolumeAccessMode"></a>

Access Modes.

#### `READ_WRITE_ONCE` <a name="cdk8s_plus_27.PersistentVolumeAccessMode.READ_WRITE_ONCE"></a>

The volume can be mounted as read-write by a single node.

ReadWriteOnce access mode still can allow multiple pods to access
the volume when the pods are running on the same node.

---


#### `READ_ONLY_MANY` <a name="cdk8s_plus_27.PersistentVolumeAccessMode.READ_ONLY_MANY"></a>

The volume can be mounted as read-only by many nodes.

---


#### `READ_WRITE_MANY` <a name="cdk8s_plus_27.PersistentVolumeAccessMode.READ_WRITE_MANY"></a>

The volume can be mounted as read-write by many nodes.

---


#### `READ_WRITE_ONCE_POD` <a name="cdk8s_plus_27.PersistentVolumeAccessMode.READ_WRITE_ONCE_POD"></a>

The volume can be mounted as read-write by a single Pod.

Use ReadWriteOncePod access mode if you want to ensure that
only one pod across whole cluster can read that PVC or write to it.
This is only supported for CSI volumes and Kubernetes version 1.22+.

---


### PersistentVolumeMode <a name="PersistentVolumeMode"></a>

Volume Modes.

#### `FILE_SYSTEM` <a name="cdk8s_plus_27.PersistentVolumeMode.FILE_SYSTEM"></a>

Volume is ounted into Pods into a directory.

If the volume is backed by a block device and the device is empty,
Kubernetes creates a filesystem on the device before mounting it
for the first time.

---


#### `BLOCK` <a name="cdk8s_plus_27.PersistentVolumeMode.BLOCK"></a>

Use a volume as a raw block device.

Such volume is presented into a Pod as a block device,
without any filesystem on it. This mode is useful to provide a Pod the fastest possible way
to access a volume, without any filesystem layer between the Pod
and the volume. On the other hand, the application running in
the Pod must know how to handle a raw block device

---


### PersistentVolumeReclaimPolicy <a name="PersistentVolumeReclaimPolicy"></a>

Reclaim Policies.

#### `RETAIN` <a name="cdk8s_plus_27.PersistentVolumeReclaimPolicy.RETAIN"></a>

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


#### `DELETE` <a name="cdk8s_plus_27.PersistentVolumeReclaimPolicy.DELETE"></a>

For volume plugins that support the Delete reclaim policy, deletion removes both the PersistentVolume object from Kubernetes, as well as the associated storage asset in the external infrastructure, such as an AWS EBS, GCE PD, Azure Disk, or Cinder volume.

Volumes that were dynamically provisioned inherit the reclaim policy of their StorageClass, which defaults to Delete.
The administrator should configure the StorageClass according to users' expectations; otherwise,
the PV must be edited or patched after it is created

---


### PodConnectionsIsolation <a name="PodConnectionsIsolation"></a>

Isolation determines which policies are created when allowing connections from a a pod / workload to peers.

#### `POD` <a name="cdk8s_plus_27.PodConnectionsIsolation.POD"></a>

Only creates network policies that select the pod.

---


#### `PEER` <a name="cdk8s_plus_27.PodConnectionsIsolation.PEER"></a>

Only creates network policies that select the peer.

---


### PodManagementPolicy <a name="PodManagementPolicy"></a>

Controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down.

The default policy is `OrderedReady`, where pods are created in increasing order
(pod-0, then pod-1, etc) and the controller will wait until each pod is ready before
continuing. When scaling down, the pods are removed in the opposite order.

The alternative policy is `Parallel` which will create pods in parallel to match the
desired scale without waiting, and on scale down will delete all pods at once.

#### `ORDERED_READY` <a name="cdk8s_plus_27.PodManagementPolicy.ORDERED_READY"></a>

---


#### `PARALLEL` <a name="cdk8s_plus_27.PodManagementPolicy.PARALLEL"></a>

---


### Protocol <a name="Protocol"></a>

Network protocols.

#### `TCP` <a name="cdk8s_plus_27.Protocol.TCP"></a>

TCP.

---


#### `UDP` <a name="cdk8s_plus_27.Protocol.UDP"></a>

UDP.

---


#### `SCTP` <a name="cdk8s_plus_27.Protocol.SCTP"></a>

SCTP.

---


### ResourceFieldPaths <a name="ResourceFieldPaths"></a>

#### `CPU_LIMIT` <a name="cdk8s_plus_27.ResourceFieldPaths.CPU_LIMIT"></a>

CPU limit of the container.

---


#### `MEMORY_LIMIT` <a name="cdk8s_plus_27.ResourceFieldPaths.MEMORY_LIMIT"></a>

Memory limit of the container.

---


#### `CPU_REQUEST` <a name="cdk8s_plus_27.ResourceFieldPaths.CPU_REQUEST"></a>

CPU request of the container.

---


#### `MEMORY_REQUEST` <a name="cdk8s_plus_27.ResourceFieldPaths.MEMORY_REQUEST"></a>

Memory request of the container.

---


#### `STORAGE_LIMIT` <a name="cdk8s_plus_27.ResourceFieldPaths.STORAGE_LIMIT"></a>

Ephemeral storage limit of the container.

---


#### `STORAGE_REQUEST` <a name="cdk8s_plus_27.ResourceFieldPaths.STORAGE_REQUEST"></a>

Ephemeral storage request of the container.

---


### RestartPolicy <a name="RestartPolicy"></a>

Restart policy for all containers within the pod.

#### `ALWAYS` <a name="cdk8s_plus_27.RestartPolicy.ALWAYS"></a>

Always restart the pod after it exits.

---


#### `ON_FAILURE` <a name="cdk8s_plus_27.RestartPolicy.ON_FAILURE"></a>

Only restart if the pod exits with a non-zero exit code.

---


#### `NEVER` <a name="cdk8s_plus_27.RestartPolicy.NEVER"></a>

Never restart the pod.

---


### ScalingStrategy <a name="ScalingStrategy"></a>

#### `MAX_CHANGE` <a name="cdk8s_plus_27.ScalingStrategy.MAX_CHANGE"></a>

Use the policy that provisions the most changes.

---


#### `MIN_CHANGE` <a name="cdk8s_plus_27.ScalingStrategy.MIN_CHANGE"></a>

Use the policy that provisions the least amount of changes.

---


#### ~~`DISABLED`~~ <a name="cdk8s_plus_27.ScalingStrategy.DISABLED"></a>

- *Deprecated:* - Omit the ScalingRule instead

Disables scaling in this direction.

---


### ServiceType <a name="ServiceType"></a>

For some parts of your application (for example, frontends) you may want to expose a Service onto an external IP address, that's outside of your cluster.

Kubernetes ServiceTypes allow you to specify what kind of Service you want.
The default is ClusterIP.

#### `CLUSTER_IP` <a name="cdk8s_plus_27.ServiceType.CLUSTER_IP"></a>

Exposes the Service on a cluster-internal IP.

Choosing this value makes the Service only reachable from within the cluster.
This is the default ServiceType

---


#### `NODE_PORT` <a name="cdk8s_plus_27.ServiceType.NODE_PORT"></a>

Exposes the Service on each Node's IP at a static port (the NodePort).

A ClusterIP Service, to which the NodePort Service routes, is automatically created.
You'll be able to contact the NodePort Service, from outside the cluster,
by requesting <NodeIP>:<NodePort>.

---


#### `LOAD_BALANCER` <a name="cdk8s_plus_27.ServiceType.LOAD_BALANCER"></a>

Exposes the Service externally using a cloud provider's load balancer.

NodePort and ClusterIP Services, to which the external load balancer routes,
are automatically created.

---


#### `EXTERNAL_NAME` <a name="cdk8s_plus_27.ServiceType.EXTERNAL_NAME"></a>

Maps the Service to the contents of the externalName field (e.g. foo.bar.example.com), by returning a CNAME record with its value. No proxying of any kind is set up.

> Note: You need either kube-dns version 1.7 or CoreDNS version 0.0.8 or higher to use the ExternalName type.

---


### TaintEffect <a name="TaintEffect"></a>

Taint effects.

#### `NO_SCHEDULE` <a name="cdk8s_plus_27.TaintEffect.NO_SCHEDULE"></a>

This means that no pod will be able to schedule onto the node unless it has a matching toleration.

---


#### `PREFER_NO_SCHEDULE` <a name="cdk8s_plus_27.TaintEffect.PREFER_NO_SCHEDULE"></a>

This is a "preference" or "soft" version of `NO_SCHEDULE` -- the system will try to avoid placing a pod that does not tolerate the taint on the node, but it is not required.

---


#### `NO_EXECUTE` <a name="cdk8s_plus_27.TaintEffect.NO_EXECUTE"></a>

This affects pods that are already running on the node as follows:.

* Pods that do not tolerate the taint are evicted immediately.
* Pods that tolerate the taint without specifying `duration` remain bound forever.
* Pods that tolerate the taint with a specified `duration` remain bound for
  the specified amount of time.

---

