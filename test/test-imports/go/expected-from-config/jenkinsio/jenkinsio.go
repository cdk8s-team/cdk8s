// jenkinsio
package jenkinsio

import (
	_init_ "example.com/test/imports/jenkinsio/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"

	"example.com/test/imports/jenkinsio/internal"
	"github.com/aws/constructs-go/constructs/v3"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s"
)

// Jenkins is the Schema for the jenkins API.
type Jenkins interface {
	cdk8s.ApiObject
	ApiGroup() *string
	ApiVersion() *string
	Chart() cdk8s.Chart
	Kind() *string
	Metadata() cdk8s.ApiObjectMetadataDefinition
	Name() *string
	AddDependency(dependencies ...constructs.IConstruct)
	AddJsonPatch(ops ...cdk8s.JsonPatch)
	OnPrepare()
	OnSynthesize(session constructs.ISynthesisSession)
	OnValidate() *[]*string
	ToJson() interface{}
	ToString() *string
}

// The jsii proxy struct for Jenkins
type jsiiProxy_Jenkins struct {
	internal.Type__cdk8sApiObject
}

func (j *jsiiProxy_Jenkins) ApiGroup() *string {
	var returns *string
	_jsii_.Get(
		j,
		"apiGroup",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_Jenkins) ApiVersion() *string {
	var returns *string
	_jsii_.Get(
		j,
		"apiVersion",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_Jenkins) Chart() cdk8s.Chart {
	var returns cdk8s.Chart
	_jsii_.Get(
		j,
		"chart",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_Jenkins) Kind() *string {
	var returns *string
	_jsii_.Get(
		j,
		"kind",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_Jenkins) Metadata() cdk8s.ApiObjectMetadataDefinition {
	var returns cdk8s.ApiObjectMetadataDefinition
	_jsii_.Get(
		j,
		"metadata",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_Jenkins) Name() *string {
	var returns *string
	_jsii_.Get(
		j,
		"name",
		&returns,
	)
	return returns
}


// Defines a "Jenkins" API object.
func NewJenkins(scope constructs.Construct, id *string, props *JenkinsProps) Jenkins {
	_init_.Initialize()

	j := jsiiProxy_Jenkins{}

	_jsii_.Create(
		"jenkinsio.Jenkins",
		[]interface{}{scope, id, props},
		&j,
	)

	return &j
}

// Defines a "Jenkins" API object.
func NewJenkins_Override(j Jenkins, scope constructs.Construct, id *string, props *JenkinsProps) {
	_init_.Initialize()

	_jsii_.Create(
		"jenkinsio.Jenkins",
		[]interface{}{scope, id, props},
		j,
	)
}

// Renders a Kubernetes manifest for "Jenkins".
//
// This can be used to inline resource manifests inside other objects (e.g. as templates).
func Jenkins_Manifest(props *JenkinsProps) interface{} {
	_init_.Initialize()

	var returns interface{}

	_jsii_.StaticInvoke(
		"jenkinsio.Jenkins",
		"manifest",
		[]interface{}{props},
		&returns,
	)

	return returns
}

// Returns the `ApiObject` named `Resource` which is a child of the given construct.
//
// If `c` is an `ApiObject`, it is returned directly. Throws an
// exception if the construct does not have a child named `Default` _or_ if
// this child is not an `ApiObject`.
func Jenkins_Of(c constructs.IConstruct) cdk8s.ApiObject {
	_init_.Initialize()

	var returns cdk8s.ApiObject

	_jsii_.StaticInvoke(
		"jenkinsio.Jenkins",
		"of",
		[]interface{}{c},
		&returns,
	)

	return returns
}

func Jenkins_GVK() *cdk8s.GroupVersionKind {
	_init_.Initialize()
	var returns *cdk8s.GroupVersionKind
	_jsii_.StaticGet(
		"jenkinsio.Jenkins",
		"GVK",
		&returns,
	)
	return returns
}

// Create a dependency between this ApiObject and other constructs.
//
// These can be other ApiObjects, Charts, or custom.
func (j *jsiiProxy_Jenkins) AddDependency(dependencies ...constructs.IConstruct) {
	args := []interface{}{}
	for _, a := range dependencies {
		args = append(args, a)
	}

	_jsii_.InvokeVoid(
		j,
		"addDependency",
		args,
	)
}

// Applies a set of RFC-6902 JSON-Patch operations to the manifest synthesized for this API object.
//
// TODO: EXAMPLE
//
func (j *jsiiProxy_Jenkins) AddJsonPatch(ops ...cdk8s.JsonPatch) {
	args := []interface{}{}
	for _, a := range ops {
		args = append(args, a)
	}

	_jsii_.InvokeVoid(
		j,
		"addJsonPatch",
		args,
	)
}

// Perform final modifications before synthesis.
//
// This method can be implemented by derived constructs in order to perform
// final changes before synthesis. prepare() will be called after child
// constructs have been prepared.
//
// This is an advanced framework feature. Only use this if you
// understand the implications.
func (j *jsiiProxy_Jenkins) OnPrepare() {
	_jsii_.InvokeVoid(
		j,
		"onPrepare",
		nil, // no parameters
	)
}

// Allows this construct to emit artifacts into the cloud assembly during synthesis.
//
// This method is usually implemented by framework-level constructs such as `Stack` and `Asset`
// as they participate in synthesizing the cloud assembly.
func (j *jsiiProxy_Jenkins) OnSynthesize(session constructs.ISynthesisSession) {
	_jsii_.InvokeVoid(
		j,
		"onSynthesize",
		[]interface{}{session},
	)
}

// Validate the current construct.
//
// This method can be implemented by derived constructs in order to perform
// validation logic. It is called on all constructs before synthesis.
//
// Returns: An array of validation error messages, or an empty array if there the construct is valid.
// Deprecated: use `Node.addValidation()` to subscribe validation functions on this construct
// instead of overriding this method.
func (j *jsiiProxy_Jenkins) OnValidate() *[]*string {
	var returns *[]*string

	_jsii_.Invoke(
		j,
		"onValidate",
		nil, // no parameters
		&returns,
	)

	return returns
}

// Renders the object to Kubernetes JSON.
func (j *jsiiProxy_Jenkins) ToJson() interface{} {
	var returns interface{}

	_jsii_.Invoke(
		j,
		"toJson",
		nil, // no parameters
		&returns,
	)

	return returns
}

// Returns a string representation of this construct.
func (j *jsiiProxy_Jenkins) ToString() *string {
	var returns *string

	_jsii_.Invoke(
		j,
		"toString",
		nil, // no parameters
		&returns,
	)

	return returns
}

// Jenkins is the Schema for the jenkins API.
type JenkinsProps struct {
	Metadata *cdk8s.ApiObjectMetadata `json:"metadata"`
	// Spec defines the desired state of the Jenkins.
	Spec *JenkinsSpec `json:"spec"`
}

// Spec defines the desired state of the Jenkins.
type JenkinsSpec struct {
	// JenkinsAPISettings defines configuration used by the operator to gain admin access to the Jenkins API.
	JenkinsApiSettings *JenkinsSpecJenkinsApiSettings `json:"jenkinsApiSettings"`
	// Master represents Jenkins master pod properties and Jenkins plugins.
	//
	// Every single change here requires a pod restart.
	Master *JenkinsSpecMaster `json:"master"`
	// Backup defines configuration of Jenkins backup More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
	Backup *JenkinsSpecBackup `json:"backup"`
	// ConfigurationAsCode defines configuration of Jenkins customization via Configuration as Code Jenkins plugin.
	ConfigurationAsCode *JenkinsSpecConfigurationAsCode `json:"configurationAsCode"`
	// GroovyScripts defines configuration of Jenkins customization via groovy scripts.
	GroovyScripts *JenkinsSpecGroovyScripts `json:"groovyScripts"`
	// Notifications defines list of a services which are used to inform about Jenkins status Can be used to integrate chat services like Slack, Microsoft Teams or Mailgun.
	Notifications *[]*JenkinsSpecNotifications `json:"notifications"`
	// Backup defines configuration of Jenkins backup restore More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
	Restore *JenkinsSpecRestore `json:"restore"`
	// Roles defines list of extra RBAC roles for the Jenkins Master pod service account.
	Roles *[]*JenkinsSpecRoles `json:"roles"`
	// SeedJobs defines list of Jenkins Seed Job configurations More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-seed-jobs-and-pipelines.
	SeedJobs *[]*JenkinsSpecSeedJobs `json:"seedJobs"`
	// Service is Kubernetes service of Jenkins master HTTP pod Defaults to : port: 8080 type: ClusterIP.
	Service *JenkinsSpecService `json:"service"`
	// ServiceAccount defines Jenkins master service account attributes.
	ServiceAccount *JenkinsSpecServiceAccount `json:"serviceAccount"`
	// Service is Kubernetes service of Jenkins slave pods Defaults to : port: 50000 type: ClusterIP.
	SlaveService *JenkinsSpecSlaveService `json:"slaveService"`
}

// Backup defines configuration of Jenkins backup More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
type JenkinsSpecBackup struct {
	// Action defines action which performs backup in backup container sidecar.
	Action *JenkinsSpecBackupAction `json:"action"`
	// ContainerName is the container name responsible for backup operation.
	ContainerName *string `json:"containerName"`
	// Interval tells how often make backup in seconds Defaults to 30.
	Interval *float64 `json:"interval"`
	// MakeBackupBeforePodDeletion tells operator to make backup before Jenkins master pod deletion.
	MakeBackupBeforePodDeletion *bool `json:"makeBackupBeforePodDeletion"`
}

// Action defines action which performs backup in backup container sidecar.
type JenkinsSpecBackupAction struct {
	// Exec specifies the action to take.
	Exec *JenkinsSpecBackupActionExec `json:"exec"`
}

// Exec specifies the action to take.
type JenkinsSpecBackupActionExec struct {
	// Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.
	//
	// The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
	Command *[]*string `json:"command"`
}

// ConfigurationAsCode defines configuration of Jenkins customization via Configuration as Code Jenkins plugin.
type JenkinsSpecConfigurationAsCode struct {
	Configurations *[]*JenkinsSpecConfigurationAsCodeConfigurations `json:"configurations"`
	// SecretRef is reference to Kubernetes secret.
	Secret *JenkinsSpecConfigurationAsCodeSecret `json:"secret"`
}

// ConfigMapRef is reference to Kubernetes ConfigMap.
type JenkinsSpecConfigurationAsCodeConfigurations struct {
	Name *string `json:"name"`
}

// SecretRef is reference to Kubernetes secret.
type JenkinsSpecConfigurationAsCodeSecret struct {
	Name *string `json:"name"`
}

// GroovyScripts defines configuration of Jenkins customization via groovy scripts.
type JenkinsSpecGroovyScripts struct {
	Configurations *[]*JenkinsSpecGroovyScriptsConfigurations `json:"configurations"`
	// SecretRef is reference to Kubernetes secret.
	Secret *JenkinsSpecGroovyScriptsSecret `json:"secret"`
}

// ConfigMapRef is reference to Kubernetes ConfigMap.
type JenkinsSpecGroovyScriptsConfigurations struct {
	Name *string `json:"name"`
}

// SecretRef is reference to Kubernetes secret.
type JenkinsSpecGroovyScriptsSecret struct {
	Name *string `json:"name"`
}

// JenkinsAPISettings defines configuration used by the operator to gain admin access to the Jenkins API.
type JenkinsSpecJenkinsApiSettings struct {
	// AuthorizationStrategy defines authorization strategy of the operator for the Jenkins API.
	AuthorizationStrategy *string `json:"authorizationStrategy"`
}

// Master represents Jenkins master pod properties and Jenkins plugins.
//
// Every single change here requires a pod restart.
type JenkinsSpecMaster struct {
	// DisableCSRFProtection allows you to toggle CSRF Protection on Jenkins.
	DisableCsrfProtection *bool `json:"disableCsrfProtection"`
	// Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
	//
	// They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
	Annotations *map[string]*string `json:"annotations"`
	// BasePlugins contains plugins required by operator Defaults to : - name: kubernetes version: 1.15.7 - name: workflow-job version: "2.32" - name: workflow-aggregator version: "2.6" - name: git version: 3.10.0 - name: job-dsl version: "1.74" - name: configuration-as-code version: "1.19" - name: configuration-as-code-support version: "1.19" - name: kubernetes-credentials-provider version: 0.12.1.
	BasePlugins *[]*JenkinsSpecMasterBasePlugins `json:"basePlugins"`
	// List of containers belonging to the pod.
	//
	// Containers cannot currently be added or removed. There must be at least one container in a Pod. Defaults to: - image: jenkins/jenkins:lts   imagePullPolicy: Always   livenessProbe:     failureThreshold: 12     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 80     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 5   name: jenkins-master   readinessProbe:     failureThreshold: 3     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 30     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 1   resources:     limits:       cpu: 1500m       memory: 3Gi     requests:       cpu: "1"       memory: 600Mi
	Containers *[]*JenkinsSpecMasterContainers `json:"containers"`
	// ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec.
	//
	// If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
	ImagePullSecrets *[]*JenkinsSpecMasterImagePullSecrets `json:"imagePullSecrets"`
	// Map of string keys and values that can be used to organize and categorize (scope and select) objects.
	//
	// May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
	Labels *map[string]*string `json:"labels"`
	// Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
	//
	// They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations Deprecated: will be removed in the future, please use Annotations(annotations)
	MasterAnnotations *map[string]*string `json:"masterAnnotations"`
	// NodeSelector is a selector which must be true for the pod to fit on a node.
	//
	// Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
	NodeSelector *map[string]*string `json:"nodeSelector"`
	// Plugins contains plugins required by user.
	Plugins *[]*JenkinsSpecMasterPlugins `json:"plugins"`
	// SecurityContext that applies to all the containers of the Jenkins Master.
	//
	// As per kubernetes specification, it can be overridden for each container individually. Defaults to: runAsUser: 1000 fsGroup: 1000
	SecurityContext *JenkinsSpecMasterSecurityContext `json:"securityContext"`
	// If specified, the pod's tolerations.
	Tolerations *[]*JenkinsSpecMasterTolerations `json:"tolerations"`
	// List of volumes that can be mounted by containers belonging to the pod.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes
	Volumes *[]*JenkinsSpecMasterVolumes `json:"volumes"`
}

// Plugin defines Jenkins plugin.
type JenkinsSpecMasterBasePlugins struct {
	// Name is the name of Jenkins plugin.
	Name *string `json:"name"`
	// Version is the version of Jenkins plugin.
	Version *string `json:"version"`
}

// Container defines Kubernetes container attributes.
type JenkinsSpecMasterContainers struct {
	// Docker image name.
	//
	// More info: https://kubernetes.io/docs/concepts/containers/images
	Image *string `json:"image"`
	// Image pull policy.
	//
	// One of Always, Never, IfNotPresent. Defaults to Always.
	ImagePullPolicy *string `json:"imagePullPolicy"`
	// Name of the container specified as a DNS_LABEL.
	//
	// Each container in a pod must have a unique name (DNS_LABEL).
	Name *string `json:"name"`
	// Compute Resources required by this container.
	//
	// More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Resources *JenkinsSpecMasterContainersResources `json:"resources"`
	// Arguments to the entrypoint.
	//
	// The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
	Args *[]*string `json:"args"`
	// Entrypoint array.
	//
	// Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
	Command *[]*string `json:"command"`
	// List of environment variables to set in the container.
	Env *[]*JenkinsSpecMasterContainersEnv `json:"env"`
	// List of sources to populate environment variables in the container.
	//
	// The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence.
	EnvFrom *[]*JenkinsSpecMasterContainersEnvFrom `json:"envFrom"`
	// Actions that the management system should take in response to container lifecycle events.
	Lifecycle *JenkinsSpecMasterContainersLifecycle `json:"lifecycle"`
	// Periodic probe of container liveness.
	//
	// Container will be restarted if the probe fails.
	LivenessProbe *JenkinsSpecMasterContainersLivenessProbe `json:"livenessProbe"`
	// List of ports to expose from the container.
	//
	// Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network.
	Ports *[]*JenkinsSpecMasterContainersPorts `json:"ports"`
	// Periodic probe of container service readiness.
	//
	// Container will be removed from service endpoints if the probe fails.
	ReadinessProbe *JenkinsSpecMasterContainersReadinessProbe `json:"readinessProbe"`
	// Security options the pod should run with.
	//
	// More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
	SecurityContext *JenkinsSpecMasterContainersSecurityContext `json:"securityContext"`
	// Pod volumes to mount into the container's filesystem.
	VolumeMounts *[]*JenkinsSpecMasterContainersVolumeMounts `json:"volumeMounts"`
	// Container's working directory.
	//
	// If not specified, the container runtime's default will be used, which might be configured in the container image.
	WorkingDir *string `json:"workingDir"`
}

// EnvVar represents an environment variable present in a Container.
type JenkinsSpecMasterContainersEnv struct {
	// Name of the environment variable.
	//
	// Must be a C_IDENTIFIER.
	Name *string `json:"name"`
	// Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.
	//
	// If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
	Value *string `json:"value"`
	// Source for the environment variable's value.
	//
	// Cannot be used if value is not empty.
	ValueFrom *JenkinsSpecMasterContainersEnvValueFrom `json:"valueFrom"`
}

// EnvFromSource represents the source of a set of ConfigMaps.
type JenkinsSpecMasterContainersEnvFrom struct {
	// The ConfigMap to select from.
	ConfigMapRef *JenkinsSpecMasterContainersEnvFromConfigMapRef `json:"configMapRef"`
	// An optional identifier to prepend to each key in the ConfigMap.
	//
	// Must be a C_IDENTIFIER.
	Prefix *string `json:"prefix"`
	// The Secret to select from.
	SecretRef *JenkinsSpecMasterContainersEnvFromSecretRef `json:"secretRef"`
}

// The ConfigMap to select from.
type JenkinsSpecMasterContainersEnvFromConfigMapRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
	// Specify whether the ConfigMap must be defined.
	Optional *bool `json:"optional"`
}

// The Secret to select from.
type JenkinsSpecMasterContainersEnvFromSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
	// Specify whether the Secret must be defined.
	Optional *bool `json:"optional"`
}

// Source for the environment variable's value.
//
// Cannot be used if value is not empty.
type JenkinsSpecMasterContainersEnvValueFrom struct {
	// Selects a key of a ConfigMap.
	ConfigMapKeyRef *JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef `json:"configMapKeyRef"`
	// Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.
	FieldRef *JenkinsSpecMasterContainersEnvValueFromFieldRef `json:"fieldRef"`
	// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
	ResourceFieldRef *JenkinsSpecMasterContainersEnvValueFromResourceFieldRef `json:"resourceFieldRef"`
	// Selects a key of a secret in the pod's namespace.
	SecretKeyRef *JenkinsSpecMasterContainersEnvValueFromSecretKeyRef `json:"secretKeyRef"`
}

// Selects a key of a ConfigMap.
type JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef struct {
	// The key to select.
	Key *string `json:"key"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
	// Specify whether the ConfigMap or its key must be defined.
	Optional *bool `json:"optional"`
}

// Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.
type JenkinsSpecMasterContainersEnvValueFromFieldRef struct {
	// Path of the field to select in the specified API version.
	FieldPath *string `json:"fieldPath"`
	// Version of the schema the FieldPath is written in terms of, defaults to "v1".
	ApiVersion *string `json:"apiVersion"`
}

// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
type JenkinsSpecMasterContainersEnvValueFromResourceFieldRef struct {
	// Required: resource to select.
	Resource *string `json:"resource"`
	// Container name: required for volumes, optional for env vars.
	ContainerName *string `json:"containerName"`
	// Specifies the output format of the exposed resources, defaults to "1".
	Divisor *string `json:"divisor"`
}

// Selects a key of a secret in the pod's namespace.
type JenkinsSpecMasterContainersEnvValueFromSecretKeyRef struct {
	// The key of the secret to select from.
	//
	// Must be a valid secret key.
	Key *string `json:"key"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
	// Specify whether the Secret or its key must be defined.
	Optional *bool `json:"optional"`
}

// Actions that the management system should take in response to container lifecycle events.
type JenkinsSpecMasterContainersLifecycle struct {
	// PostStart is called immediately after a container is created.
	//
	// If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
	PostStart *JenkinsSpecMasterContainersLifecyclePostStart `json:"postStart"`
	// PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.
	//
	// The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
	PreStop *JenkinsSpecMasterContainersLifecyclePreStop `json:"preStop"`
}

// PostStart is called immediately after a container is created.
//
// If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
type JenkinsSpecMasterContainersLifecyclePostStart struct {
	// One and only one of the following should be specified.
	//
	// Exec specifies the action to take.
	Exec *JenkinsSpecMasterContainersLifecyclePostStartExec `json:"exec"`
	// HTTPGet specifies the http request to perform.
	HttpGet *JenkinsSpecMasterContainersLifecyclePostStartHttpGet `json:"httpGet"`
	// TCPSocket specifies an action involving a TCP port.
	//
	// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
	TcpSocket *JenkinsSpecMasterContainersLifecyclePostStartTcpSocket `json:"tcpSocket"`
}

// One and only one of the following should be specified.
//
// Exec specifies the action to take.
type JenkinsSpecMasterContainersLifecyclePostStartExec struct {
	// Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.
	//
	// The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
	Command *[]*string `json:"command"`
}

// HTTPGet specifies the http request to perform.
type JenkinsSpecMasterContainersLifecyclePostStartHttpGet struct {
	// Name or number of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort `json:"port"`
	// Host name to connect to, defaults to the pod IP.
	//
	// You probably want to set "Host" in httpHeaders instead.
	Host *string `json:"host"`
	// Custom headers to set in the request.
	//
	// HTTP allows repeated headers.
	HttpHeaders *[]*JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders `json:"httpHeaders"`
	// Path to access on the HTTP server.
	Path *string `json:"path"`
	// Scheme to use for connecting to the host.
	//
	// Defaults to HTTP.
	Scheme *string `json:"scheme"`
}

// HTTPHeader describes a custom header to be used in HTTP probes.
type JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders struct {
	// The header field name.
	Name *string `json:"name"`
	// The header field value.
	Value *string `json:"value"`
}

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort
type jsiiProxy_JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort_FromNumber(value *float64) JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort_FromString(value *string) JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// TCPSocket specifies an action involving a TCP port.
//
// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
type JenkinsSpecMasterContainersLifecyclePostStartTcpSocket struct {
	// Number or name of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort `json:"port"`
	// Optional: Host name to connect to, defaults to the pod IP.
	Host *string `json:"host"`
}

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort
type jsiiProxy_JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort_FromNumber(value *float64) JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort_FromString(value *string) JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.
//
// The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
type JenkinsSpecMasterContainersLifecyclePreStop struct {
	// One and only one of the following should be specified.
	//
	// Exec specifies the action to take.
	Exec *JenkinsSpecMasterContainersLifecyclePreStopExec `json:"exec"`
	// HTTPGet specifies the http request to perform.
	HttpGet *JenkinsSpecMasterContainersLifecyclePreStopHttpGet `json:"httpGet"`
	// TCPSocket specifies an action involving a TCP port.
	//
	// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
	TcpSocket *JenkinsSpecMasterContainersLifecyclePreStopTcpSocket `json:"tcpSocket"`
}

// One and only one of the following should be specified.
//
// Exec specifies the action to take.
type JenkinsSpecMasterContainersLifecyclePreStopExec struct {
	// Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.
	//
	// The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
	Command *[]*string `json:"command"`
}

// HTTPGet specifies the http request to perform.
type JenkinsSpecMasterContainersLifecyclePreStopHttpGet struct {
	// Name or number of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort `json:"port"`
	// Host name to connect to, defaults to the pod IP.
	//
	// You probably want to set "Host" in httpHeaders instead.
	Host *string `json:"host"`
	// Custom headers to set in the request.
	//
	// HTTP allows repeated headers.
	HttpHeaders *[]*JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders `json:"httpHeaders"`
	// Path to access on the HTTP server.
	Path *string `json:"path"`
	// Scheme to use for connecting to the host.
	//
	// Defaults to HTTP.
	Scheme *string `json:"scheme"`
}

// HTTPHeader describes a custom header to be used in HTTP probes.
type JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders struct {
	// The header field name.
	Name *string `json:"name"`
	// The header field value.
	Value *string `json:"value"`
}

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort
type jsiiProxy_JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort_FromNumber(value *float64) JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort_FromString(value *string) JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// TCPSocket specifies an action involving a TCP port.
//
// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
type JenkinsSpecMasterContainersLifecyclePreStopTcpSocket struct {
	// Number or name of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort `json:"port"`
	// Optional: Host name to connect to, defaults to the pod IP.
	Host *string `json:"host"`
}

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort
type jsiiProxy_JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort_FromNumber(value *float64) JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort_FromString(value *string) JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// Periodic probe of container liveness.
//
// Container will be restarted if the probe fails.
type JenkinsSpecMasterContainersLivenessProbe struct {
	// One and only one of the following should be specified.
	//
	// Exec specifies the action to take.
	Exec *JenkinsSpecMasterContainersLivenessProbeExec `json:"exec"`
	// Minimum consecutive failures for the probe to be considered failed after having succeeded.
	//
	// Defaults to 3. Minimum value is 1.
	FailureThreshold *float64 `json:"failureThreshold"`
	// HTTPGet specifies the http request to perform.
	HttpGet *JenkinsSpecMasterContainersLivenessProbeHttpGet `json:"httpGet"`
	// Number of seconds after the container has started before liveness probes are initiated.
	//
	// More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
	InitialDelaySeconds *float64 `json:"initialDelaySeconds"`
	// How often (in seconds) to perform the probe.
	//
	// Default to 10 seconds. Minimum value is 1.
	PeriodSeconds *float64 `json:"periodSeconds"`
	// Minimum consecutive successes for the probe to be considered successful after having failed.
	//
	// Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
	SuccessThreshold *float64 `json:"successThreshold"`
	// TCPSocket specifies an action involving a TCP port.
	//
	// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
	TcpSocket *JenkinsSpecMasterContainersLivenessProbeTcpSocket `json:"tcpSocket"`
	// Number of seconds after which the probe times out.
	//
	// Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
	TimeoutSeconds *float64 `json:"timeoutSeconds"`
}

// One and only one of the following should be specified.
//
// Exec specifies the action to take.
type JenkinsSpecMasterContainersLivenessProbeExec struct {
	// Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.
	//
	// The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
	Command *[]*string `json:"command"`
}

// HTTPGet specifies the http request to perform.
type JenkinsSpecMasterContainersLivenessProbeHttpGet struct {
	// Name or number of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port JenkinsSpecMasterContainersLivenessProbeHttpGetPort `json:"port"`
	// Host name to connect to, defaults to the pod IP.
	//
	// You probably want to set "Host" in httpHeaders instead.
	Host *string `json:"host"`
	// Custom headers to set in the request.
	//
	// HTTP allows repeated headers.
	HttpHeaders *[]*JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders `json:"httpHeaders"`
	// Path to access on the HTTP server.
	Path *string `json:"path"`
	// Scheme to use for connecting to the host.
	//
	// Defaults to HTTP.
	Scheme *string `json:"scheme"`
}

// HTTPHeader describes a custom header to be used in HTTP probes.
type JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders struct {
	// The header field name.
	Name *string `json:"name"`
	// The header field value.
	Value *string `json:"value"`
}

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLivenessProbeHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLivenessProbeHttpGetPort
type jsiiProxy_JenkinsSpecMasterContainersLivenessProbeHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLivenessProbeHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLivenessProbeHttpGetPort_FromNumber(value *float64) JenkinsSpecMasterContainersLivenessProbeHttpGetPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLivenessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLivenessProbeHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLivenessProbeHttpGetPort_FromString(value *string) JenkinsSpecMasterContainersLivenessProbeHttpGetPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLivenessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLivenessProbeHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// TCPSocket specifies an action involving a TCP port.
//
// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
type JenkinsSpecMasterContainersLivenessProbeTcpSocket struct {
	// Number or name of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port JenkinsSpecMasterContainersLivenessProbeTcpSocketPort `json:"port"`
	// Optional: Host name to connect to, defaults to the pod IP.
	Host *string `json:"host"`
}

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLivenessProbeTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLivenessProbeTcpSocketPort
type jsiiProxy_JenkinsSpecMasterContainersLivenessProbeTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLivenessProbeTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLivenessProbeTcpSocketPort_FromNumber(value *float64) JenkinsSpecMasterContainersLivenessProbeTcpSocketPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLivenessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLivenessProbeTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLivenessProbeTcpSocketPort_FromString(value *string) JenkinsSpecMasterContainersLivenessProbeTcpSocketPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersLivenessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLivenessProbeTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// ContainerPort represents a network port in a single container.
type JenkinsSpecMasterContainersPorts struct {
	// Number of port to expose on the pod's IP address.
	//
	// This must be a valid port number, 0 < x < 65536.
	ContainerPort *float64 `json:"containerPort"`
	// What host IP to bind the external port to.
	HostIp *string `json:"hostIp"`
	// Number of port to expose on the host.
	//
	// If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
	HostPort *float64 `json:"hostPort"`
	// If specified, this must be an IANA_SVC_NAME and unique within the pod.
	//
	// Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
	Name *string `json:"name"`
	// Protocol for port.
	//
	// Must be UDP, TCP, or SCTP. Defaults to "TCP".
	Protocol *string `json:"protocol"`
}

// Periodic probe of container service readiness.
//
// Container will be removed from service endpoints if the probe fails.
type JenkinsSpecMasterContainersReadinessProbe struct {
	// One and only one of the following should be specified.
	//
	// Exec specifies the action to take.
	Exec *JenkinsSpecMasterContainersReadinessProbeExec `json:"exec"`
	// Minimum consecutive failures for the probe to be considered failed after having succeeded.
	//
	// Defaults to 3. Minimum value is 1.
	FailureThreshold *float64 `json:"failureThreshold"`
	// HTTPGet specifies the http request to perform.
	HttpGet *JenkinsSpecMasterContainersReadinessProbeHttpGet `json:"httpGet"`
	// Number of seconds after the container has started before liveness probes are initiated.
	//
	// More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
	InitialDelaySeconds *float64 `json:"initialDelaySeconds"`
	// How often (in seconds) to perform the probe.
	//
	// Default to 10 seconds. Minimum value is 1.
	PeriodSeconds *float64 `json:"periodSeconds"`
	// Minimum consecutive successes for the probe to be considered successful after having failed.
	//
	// Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
	SuccessThreshold *float64 `json:"successThreshold"`
	// TCPSocket specifies an action involving a TCP port.
	//
	// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
	TcpSocket *JenkinsSpecMasterContainersReadinessProbeTcpSocket `json:"tcpSocket"`
	// Number of seconds after which the probe times out.
	//
	// Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
	TimeoutSeconds *float64 `json:"timeoutSeconds"`
}

// One and only one of the following should be specified.
//
// Exec specifies the action to take.
type JenkinsSpecMasterContainersReadinessProbeExec struct {
	// Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.
	//
	// The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
	Command *[]*string `json:"command"`
}

// HTTPGet specifies the http request to perform.
type JenkinsSpecMasterContainersReadinessProbeHttpGet struct {
	// Name or number of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port JenkinsSpecMasterContainersReadinessProbeHttpGetPort `json:"port"`
	// Host name to connect to, defaults to the pod IP.
	//
	// You probably want to set "Host" in httpHeaders instead.
	Host *string `json:"host"`
	// Custom headers to set in the request.
	//
	// HTTP allows repeated headers.
	HttpHeaders *[]*JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders `json:"httpHeaders"`
	// Path to access on the HTTP server.
	Path *string `json:"path"`
	// Scheme to use for connecting to the host.
	//
	// Defaults to HTTP.
	Scheme *string `json:"scheme"`
}

// HTTPHeader describes a custom header to be used in HTTP probes.
type JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders struct {
	// The header field name.
	Name *string `json:"name"`
	// The header field value.
	Value *string `json:"value"`
}

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersReadinessProbeHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersReadinessProbeHttpGetPort
type jsiiProxy_JenkinsSpecMasterContainersReadinessProbeHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersReadinessProbeHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersReadinessProbeHttpGetPort_FromNumber(value *float64) JenkinsSpecMasterContainersReadinessProbeHttpGetPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersReadinessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersReadinessProbeHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersReadinessProbeHttpGetPort_FromString(value *string) JenkinsSpecMasterContainersReadinessProbeHttpGetPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersReadinessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersReadinessProbeHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// TCPSocket specifies an action involving a TCP port.
//
// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
type JenkinsSpecMasterContainersReadinessProbeTcpSocket struct {
	// Number or name of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port JenkinsSpecMasterContainersReadinessProbeTcpSocketPort `json:"port"`
	// Optional: Host name to connect to, defaults to the pod IP.
	Host *string `json:"host"`
}

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersReadinessProbeTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersReadinessProbeTcpSocketPort
type jsiiProxy_JenkinsSpecMasterContainersReadinessProbeTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersReadinessProbeTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersReadinessProbeTcpSocketPort_FromNumber(value *float64) JenkinsSpecMasterContainersReadinessProbeTcpSocketPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersReadinessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersReadinessProbeTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersReadinessProbeTcpSocketPort_FromString(value *string) JenkinsSpecMasterContainersReadinessProbeTcpSocketPort {
	_init_.Initialize()

	var returns JenkinsSpecMasterContainersReadinessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersReadinessProbeTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// Compute Resources required by this container.
//
// More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
type JenkinsSpecMasterContainersResources struct {
	// Limits describes the maximum amount of compute resources allowed.
	//
	// More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Limits *map[string]*string `json:"limits"`
	// Requests describes the minimum amount of compute resources required.
	//
	// If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Requests *map[string]*string `json:"requests"`
}

// Security options the pod should run with.
//
// More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
type JenkinsSpecMasterContainersSecurityContext struct {
	// AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process.
	//
	// This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
	AllowPrivilegeEscalation *bool `json:"allowPrivilegeEscalation"`
	// The capabilities to add/drop when running containers.
	//
	// Defaults to the default set of capabilities granted by the container runtime.
	Capabilities *JenkinsSpecMasterContainersSecurityContextCapabilities `json:"capabilities"`
	// Run container in privileged mode.
	//
	// Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
	Privileged *bool `json:"privileged"`
	// procMount denotes the type of proc mount to use for the containers.
	//
	// The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.
	ProcMount *string `json:"procMount"`
	// Whether this container has a read-only root filesystem.
	//
	// Default is false.
	ReadOnlyRootFilesystem *bool `json:"readOnlyRootFilesystem"`
	// The GID to run the entrypoint of the container process.
	//
	// Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	RunAsGroup *float64 `json:"runAsGroup"`
	// Indicates that the container must run as a non-root user.
	//
	// If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	RunAsNonRoot *bool `json:"runAsNonRoot"`
	// The UID to run the entrypoint of the container process.
	//
	// Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	RunAsUser *float64 `json:"runAsUser"`
	// The SELinux context to be applied to the container.
	//
	// If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	SeLinuxOptions *JenkinsSpecMasterContainersSecurityContextSeLinuxOptions `json:"seLinuxOptions"`
	// The Windows specific settings applied to all containers.
	//
	// If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	WindowsOptions *JenkinsSpecMasterContainersSecurityContextWindowsOptions `json:"windowsOptions"`
}

// The capabilities to add/drop when running containers.
//
// Defaults to the default set of capabilities granted by the container runtime.
type JenkinsSpecMasterContainersSecurityContextCapabilities struct {
	// Added capabilities.
	Add *[]*string `json:"add"`
	// Removed capabilities.
	Drop *[]*string `json:"drop"`
}

// The SELinux context to be applied to the container.
//
// If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
type JenkinsSpecMasterContainersSecurityContextSeLinuxOptions struct {
	// Level is SELinux level label that applies to the container.
	Level *string `json:"level"`
	// Role is a SELinux role label that applies to the container.
	Role *string `json:"role"`
	// Type is a SELinux type label that applies to the container.
	Type *string `json:"type"`
	// User is a SELinux user label that applies to the container.
	User *string `json:"user"`
}

// The Windows specific settings applied to all containers.
//
// If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
type JenkinsSpecMasterContainersSecurityContextWindowsOptions struct {
	// GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
	GmsaCredentialSpec *string `json:"gmsaCredentialSpec"`
	// GMSACredentialSpecName is the name of the GMSA credential spec to use.
	//
	// This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
	GmsaCredentialSpecName *string `json:"gmsaCredentialSpecName"`
	// The UserName in Windows to run the entrypoint of the container process.
	//
	// Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.
	RunAsUserName *string `json:"runAsUserName"`
}

// VolumeMount describes a mounting of a Volume within a container.
type JenkinsSpecMasterContainersVolumeMounts struct {
	// Path within the container at which the volume should be mounted.
	//
	// Must not contain ':'.
	MountPath *string `json:"mountPath"`
	// This must match the Name of a Volume.
	Name *string `json:"name"`
	// mountPropagation determines how mounts are propagated from the host to container and the other way around.
	//
	// When not set, MountPropagationNone is used. This field is beta in 1.10.
	MountPropagation *string `json:"mountPropagation"`
	// Mounted read-only if true, read-write otherwise (false or unspecified).
	//
	// Defaults to false.
	ReadOnly *bool `json:"readOnly"`
	// Path within the volume from which the container's volume should be mounted.
	//
	// Defaults to "" (volume's root).
	SubPath *string `json:"subPath"`
	// Expanded path within the volume from which the container's volume should be mounted.
	//
	// Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15.
	SubPathExpr *string `json:"subPathExpr"`
}

// LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
type JenkinsSpecMasterImagePullSecrets struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// Plugin defines Jenkins plugin.
type JenkinsSpecMasterPlugins struct {
	// Name is the name of Jenkins plugin.
	Name *string `json:"name"`
	// Version is the version of Jenkins plugin.
	Version *string `json:"version"`
}

// SecurityContext that applies to all the containers of the Jenkins Master.
//
// As per kubernetes specification, it can be overridden for each container individually. Defaults to: runAsUser: 1000 fsGroup: 1000
type JenkinsSpecMasterSecurityContext struct {
	// A special supplemental group that applies to all containers in a pod.
	//
	// Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
	// 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
	// If unset, the Kubelet will not modify the ownership and permissions of any volume.
	FsGroup *float64 `json:"fsGroup"`
	// The GID to run the entrypoint of the container process.
	//
	// Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
	RunAsGroup *float64 `json:"runAsGroup"`
	// Indicates that the container must run as a non-root user.
	//
	// If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	RunAsNonRoot *bool `json:"runAsNonRoot"`
	// The UID to run the entrypoint of the container process.
	//
	// Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
	RunAsUser *float64 `json:"runAsUser"`
	// The SELinux context to be applied to all containers.
	//
	// If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
	SeLinuxOptions *JenkinsSpecMasterSecurityContextSeLinuxOptions `json:"seLinuxOptions"`
	// A list of groups applied to the first process run in each container, in addition to the container's primary GID.
	//
	// If unspecified, no groups will be added to any container.
	SupplementalGroups *[]*float64 `json:"supplementalGroups"`
	// Sysctls hold a list of namespaced sysctls used for the pod.
	//
	// Pods with unsupported sysctls (by the container runtime) might fail to launch.
	Sysctls *[]*JenkinsSpecMasterSecurityContextSysctls `json:"sysctls"`
	// The Windows specific settings applied to all containers.
	//
	// If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	WindowsOptions *JenkinsSpecMasterSecurityContextWindowsOptions `json:"windowsOptions"`
}

// The SELinux context to be applied to all containers.
//
// If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
type JenkinsSpecMasterSecurityContextSeLinuxOptions struct {
	// Level is SELinux level label that applies to the container.
	Level *string `json:"level"`
	// Role is a SELinux role label that applies to the container.
	Role *string `json:"role"`
	// Type is a SELinux type label that applies to the container.
	Type *string `json:"type"`
	// User is a SELinux user label that applies to the container.
	User *string `json:"user"`
}

// Sysctl defines a kernel parameter to be set.
type JenkinsSpecMasterSecurityContextSysctls struct {
	// Name of a property to set.
	Name *string `json:"name"`
	// Value of a property to set.
	Value *string `json:"value"`
}

// The Windows specific settings applied to all containers.
//
// If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
type JenkinsSpecMasterSecurityContextWindowsOptions struct {
	// GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
	GmsaCredentialSpec *string `json:"gmsaCredentialSpec"`
	// GMSACredentialSpecName is the name of the GMSA credential spec to use.
	//
	// This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
	GmsaCredentialSpecName *string `json:"gmsaCredentialSpecName"`
	// The UserName in Windows to run the entrypoint of the container process.
	//
	// Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.
	RunAsUserName *string `json:"runAsUserName"`
}

// The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
type JenkinsSpecMasterTolerations struct {
	// Effect indicates the taint effect to match.
	//
	// Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
	Effect *string `json:"effect"`
	// Key is the taint key that the toleration applies to.
	//
	// Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
	Key *string `json:"key"`
	// Operator represents a key's relationship to the value.
	//
	// Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
	Operator *string `json:"operator"`
	// TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint.
	//
	// By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
	TolerationSeconds *float64 `json:"tolerationSeconds"`
	// Value is the taint value the toleration matches to.
	//
	// If the operator is Exists, the value should be empty, otherwise just a regular string.
	Value *string `json:"value"`
}

// Volume represents a named volume in a pod that may be accessed by any container in the pod.
type JenkinsSpecMasterVolumes struct {
	// Volume's name.
	//
	// Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
	Name *string `json:"name"`
	// AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
	AwsElasticBlockStore *JenkinsSpecMasterVolumesAwsElasticBlockStore `json:"awsElasticBlockStore"`
	// AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
	AzureDisk *JenkinsSpecMasterVolumesAzureDisk `json:"azureDisk"`
	// AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
	AzureFile *JenkinsSpecMasterVolumesAzureFile `json:"azureFile"`
	// CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
	Cephfs *JenkinsSpecMasterVolumesCephfs `json:"cephfs"`
	// Cinder represents a cinder volume attached and mounted on kubelets host machine.
	//
	// More info: https://examples.k8s.io/mysql-cinder-pd/README.md
	Cinder *JenkinsSpecMasterVolumesCinder `json:"cinder"`
	// ConfigMap represents a configMap that should populate this volume.
	ConfigMap *JenkinsSpecMasterVolumesConfigMap `json:"configMap"`
	// CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
	Csi *JenkinsSpecMasterVolumesCsi `json:"csi"`
	// DownwardAPI represents downward API about the pod that should populate this volume.
	DownwardApi *JenkinsSpecMasterVolumesDownwardApi `json:"downwardApi"`
	// EmptyDir represents a temporary directory that shares a pod's lifetime.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
	EmptyDir *JenkinsSpecMasterVolumesEmptyDir `json:"emptyDir"`
	// FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
	Fc *JenkinsSpecMasterVolumesFc `json:"fc"`
	// FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
	FlexVolume *JenkinsSpecMasterVolumesFlexVolume `json:"flexVolume"`
	// Flocker represents a Flocker volume attached to a kubelet's host machine.
	//
	// This depends on the Flocker control service being running
	Flocker *JenkinsSpecMasterVolumesFlocker `json:"flocker"`
	// GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
	GcePersistentDisk *JenkinsSpecMasterVolumesGcePersistentDisk `json:"gcePersistentDisk"`
	// GitRepo represents a git repository at a particular revision.
	//
	// DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
	GitRepo *JenkinsSpecMasterVolumesGitRepo `json:"gitRepo"`
	// Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.
	//
	// More info: https://examples.k8s.io/volumes/glusterfs/README.md
	Glusterfs *JenkinsSpecMasterVolumesGlusterfs `json:"glusterfs"`
	// HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.
	//
	// This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.
	HostPath *JenkinsSpecMasterVolumesHostPath `json:"hostPath"`
	// ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
	//
	// More info: https://examples.k8s.io/volumes/iscsi/README.md
	Iscsi *JenkinsSpecMasterVolumesIscsi `json:"iscsi"`
	// NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
	Nfs *JenkinsSpecMasterVolumesNfs `json:"nfs"`
	// PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
	PersistentVolumeClaim *JenkinsSpecMasterVolumesPersistentVolumeClaim `json:"persistentVolumeClaim"`
	// PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
	PhotonPersistentDisk *JenkinsSpecMasterVolumesPhotonPersistentDisk `json:"photonPersistentDisk"`
	// PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
	PortworxVolume *JenkinsSpecMasterVolumesPortworxVolume `json:"portworxVolume"`
	// Items for all in one resources secrets, configmaps, and downward API.
	Projected *JenkinsSpecMasterVolumesProjected `json:"projected"`
	// Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
	Quobyte *JenkinsSpecMasterVolumesQuobyte `json:"quobyte"`
	// RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.
	//
	// More info: https://examples.k8s.io/volumes/rbd/README.md
	Rbd *JenkinsSpecMasterVolumesRbd `json:"rbd"`
	// ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
	ScaleIo *JenkinsSpecMasterVolumesScaleIo `json:"scaleIo"`
	// Secret represents a secret that should populate this volume.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
	Secret *JenkinsSpecMasterVolumesSecret `json:"secret"`
	// StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
	Storageos *JenkinsSpecMasterVolumesStorageos `json:"storageos"`
	// VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
	VsphereVolume *JenkinsSpecMasterVolumesVsphereVolume `json:"vsphereVolume"`
}

// AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
//
// More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
type JenkinsSpecMasterVolumesAwsElasticBlockStore struct {
	// Unique ID of the persistent disk resource in AWS (Amazon EBS volume).
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
	VolumeId *string `json:"volumeId"`
	// Filesystem type of the volume that you want to mount.
	//
	// Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore TODO: how do we prevent errors in the filesystem from compromising the machine
	FsType *string `json:"fsType"`
	// The partition in the volume that you want to mount.
	//
	// If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
	Partition *float64 `json:"partition"`
	// Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".
	//
	// If omitted, the default is "false". More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
	ReadOnly *bool `json:"readOnly"`
}

// AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
type JenkinsSpecMasterVolumesAzureDisk struct {
	// The Name of the data disk in the blob storage.
	DiskName *string `json:"diskName"`
	// The URI the data disk in the blob storage.
	DiskUri *string `json:"diskUri"`
	// Host Caching mode: None, Read Only, Read Write.
	CachingMode *string `json:"cachingMode"`
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
	FsType *string `json:"fsType"`
	// Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set).
	//
	// defaults to shared
	Kind *string `json:"kind"`
	// Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `json:"readOnly"`
}

// AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
type JenkinsSpecMasterVolumesAzureFile struct {
	// the name of secret that contains Azure Storage Account Name and Key.
	SecretName *string `json:"secretName"`
	// Share Name.
	ShareName *string `json:"shareName"`
	// Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `json:"readOnly"`
}

// CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
type JenkinsSpecMasterVolumesCephfs struct {
	// Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
	Monitors *[]*string `json:"monitors"`
	// Optional: Used as the mounted root, rather than the full Ceph tree, default is /.
	Path *string `json:"path"`
	// Optional: Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
	ReadOnly *bool `json:"readOnly"`
	// Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
	SecretFile *string `json:"secretFile"`
	// Optional: SecretRef is reference to the authentication secret for User, default is empty.
	//
	// More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
	SecretRef *JenkinsSpecMasterVolumesCephfsSecretRef `json:"secretRef"`
	// Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
	User *string `json:"user"`
}

// Optional: SecretRef is reference to the authentication secret for User, default is empty.
//
// More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
type JenkinsSpecMasterVolumesCephfsSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// Cinder represents a cinder volume attached and mounted on kubelets host machine.
//
// More info: https://examples.k8s.io/mysql-cinder-pd/README.md
type JenkinsSpecMasterVolumesCinder struct {
	// volume id used to identify the volume in cinder.
	//
	// More info: https://examples.k8s.io/mysql-cinder-pd/README.md
	VolumeId *string `json:"volumeId"`
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
	FsType *string `json:"fsType"`
	// Optional: Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
	ReadOnly *bool `json:"readOnly"`
	// Optional: points to a secret object containing parameters used to connect to OpenStack.
	SecretRef *JenkinsSpecMasterVolumesCinderSecretRef `json:"secretRef"`
}

// Optional: points to a secret object containing parameters used to connect to OpenStack.
type JenkinsSpecMasterVolumesCinderSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// ConfigMap represents a configMap that should populate this volume.
type JenkinsSpecMasterVolumesConfigMap struct {
	// Optional: mode bits to use on created files by default.
	//
	// Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	DefaultMode *float64 `json:"defaultMode"`
	// If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.
	//
	// If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
	Items *[]*JenkinsSpecMasterVolumesConfigMapItems `json:"items"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
	// Specify whether the ConfigMap or its keys must be defined.
	Optional *bool `json:"optional"`
}

// Maps a string key to a path within a volume.
type JenkinsSpecMasterVolumesConfigMapItems struct {
	// The key to project.
	Key *string `json:"key"`
	// The relative path of the file to map the key to.
	//
	// May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
	Path *string `json:"path"`
	// Optional: mode bits to use on this file, must be a value between 0 and 0777.
	//
	// If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	Mode *float64 `json:"mode"`
}

// CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
type JenkinsSpecMasterVolumesCsi struct {
	// Driver is the name of the CSI driver that handles this volume.
	//
	// Consult with your admin for the correct name as registered in the cluster.
	Driver *string `json:"driver"`
	// Filesystem type to mount.
	//
	// Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
	FsType *string `json:"fsType"`
	// NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
	//
	// This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
	NodePublishSecretRef *JenkinsSpecMasterVolumesCsiNodePublishSecretRef `json:"nodePublishSecretRef"`
	// Specifies a read-only configuration for the volume.
	//
	// Defaults to false (read/write).
	ReadOnly *bool `json:"readOnly"`
	// VolumeAttributes stores driver-specific properties that are passed to the CSI driver.
	//
	// Consult your driver's documentation for supported values.
	VolumeAttributes *map[string]*string `json:"volumeAttributes"`
}

// NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
//
// This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
type JenkinsSpecMasterVolumesCsiNodePublishSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// DownwardAPI represents downward API about the pod that should populate this volume.
type JenkinsSpecMasterVolumesDownwardApi struct {
	// Optional: mode bits to use on created files by default.
	//
	// Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	DefaultMode *float64 `json:"defaultMode"`
	// Items is a list of downward API volume file.
	Items *[]*JenkinsSpecMasterVolumesDownwardApiItems `json:"items"`
}

// DownwardAPIVolumeFile represents information to create the file containing the pod field.
type JenkinsSpecMasterVolumesDownwardApiItems struct {
	// Required: Path is  the relative path name of the file to be created.
	//
	// Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
	Path *string `json:"path"`
	// Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
	FieldRef *JenkinsSpecMasterVolumesDownwardApiItemsFieldRef `json:"fieldRef"`
	// Optional: mode bits to use on this file, must be a value between 0 and 0777.
	//
	// If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	Mode *float64 `json:"mode"`
	// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
	ResourceFieldRef *JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef `json:"resourceFieldRef"`
}

// Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
type JenkinsSpecMasterVolumesDownwardApiItemsFieldRef struct {
	// Path of the field to select in the specified API version.
	FieldPath *string `json:"fieldPath"`
	// Version of the schema the FieldPath is written in terms of, defaults to "v1".
	ApiVersion *string `json:"apiVersion"`
}

// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
type JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef struct {
	// Required: resource to select.
	Resource *string `json:"resource"`
	// Container name: required for volumes, optional for env vars.
	ContainerName *string `json:"containerName"`
	// Specifies the output format of the exposed resources, defaults to "1".
	Divisor *string `json:"divisor"`
}

// EmptyDir represents a temporary directory that shares a pod's lifetime.
//
// More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
type JenkinsSpecMasterVolumesEmptyDir struct {
	// What type of storage medium should back this directory.
	//
	// The default is "" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
	Medium *string `json:"medium"`
	// Total amount of local storage required for this EmptyDir volume.
	//
	// The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
	SizeLimit *string `json:"sizeLimit"`
}

// FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
type JenkinsSpecMasterVolumesFc struct {
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. TODO: how do we prevent errors in the filesystem from compromising the machine
	FsType *string `json:"fsType"`
	// Optional: FC target lun number.
	Lun *float64 `json:"lun"`
	// Optional: Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `json:"readOnly"`
	// Optional: FC target worldwide names (WWNs).
	TargetWwNs *[]*string `json:"targetWwNs"`
	// Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
	Wwids *[]*string `json:"wwids"`
}

// FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
type JenkinsSpecMasterVolumesFlexVolume struct {
	// Driver is the name of the driver to use for this volume.
	Driver *string `json:"driver"`
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
	FsType *string `json:"fsType"`
	// Optional: Extra command options if any.
	Options *map[string]*string `json:"options"`
	// Optional: Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `json:"readOnly"`
	// Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
	//
	// This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
	SecretRef *JenkinsSpecMasterVolumesFlexVolumeSecretRef `json:"secretRef"`
}

// Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
//
// This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
type JenkinsSpecMasterVolumesFlexVolumeSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// Flocker represents a Flocker volume attached to a kubelet's host machine.
//
// This depends on the Flocker control service being running
type JenkinsSpecMasterVolumesFlocker struct {
	// Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated.
	DatasetName *string `json:"datasetName"`
	// UUID of the dataset.
	//
	// This is unique identifier of a Flocker dataset
	DatasetUuid *string `json:"datasetUuid"`
}

// GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
//
// More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
type JenkinsSpecMasterVolumesGcePersistentDisk struct {
	// Unique name of the PD resource in GCE.
	//
	// Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
	PdName *string `json:"pdName"`
	// Filesystem type of the volume that you want to mount.
	//
	// Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk TODO: how do we prevent errors in the filesystem from compromising the machine
	FsType *string `json:"fsType"`
	// The partition in the volume that you want to mount.
	//
	// If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
	Partition *float64 `json:"partition"`
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	//
	// Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
	ReadOnly *bool `json:"readOnly"`
}

// GitRepo represents a git repository at a particular revision.
//
// DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
type JenkinsSpecMasterVolumesGitRepo struct {
	// Repository URL.
	Repository *string `json:"repository"`
	// Target directory name.
	//
	// Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
	Directory *string `json:"directory"`
	// Commit hash for the specified revision.
	Revision *string `json:"revision"`
}

// Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.
//
// More info: https://examples.k8s.io/volumes/glusterfs/README.md
type JenkinsSpecMasterVolumesGlusterfs struct {
	// EndpointsName is the endpoint name that details Glusterfs topology.
	//
	// More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
	Endpoints *string `json:"endpoints"`
	// Path is the Glusterfs volume path.
	//
	// More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
	Path *string `json:"path"`
	// ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
	//
	// Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
	ReadOnly *bool `json:"readOnly"`
}

// HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.
//
// This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.
type JenkinsSpecMasterVolumesHostPath struct {
	// Path of the directory on the host.
	//
	// If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
	Path *string `json:"path"`
	// Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath.
	Type *string `json:"type"`
}

// ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
//
// More info: https://examples.k8s.io/volumes/iscsi/README.md
type JenkinsSpecMasterVolumesIscsi struct {
	// Target iSCSI Qualified Name.
	Iqn *string `json:"iqn"`
	// iSCSI Target Lun number.
	Lun *float64 `json:"lun"`
	// iSCSI Target Portal.
	//
	// The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
	TargetPortal *string `json:"targetPortal"`
	// whether support iSCSI Discovery CHAP authentication.
	ChapAuthDiscovery *bool `json:"chapAuthDiscovery"`
	// whether support iSCSI Session CHAP authentication.
	ChapAuthSession *bool `json:"chapAuthSession"`
	// Filesystem type of the volume that you want to mount.
	//
	// Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi TODO: how do we prevent errors in the filesystem from compromising the machine
	FsType *string `json:"fsType"`
	// Custom iSCSI Initiator Name.
	//
	// If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
	InitiatorName *string `json:"initiatorName"`
	// iSCSI Interface Name that uses an iSCSI transport.
	//
	// Defaults to 'default' (tcp).
	IscsiInterface *string `json:"iscsiInterface"`
	// iSCSI Target Portal List.
	//
	// The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
	Portals *[]*string `json:"portals"`
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	//
	// Defaults to false.
	ReadOnly *bool `json:"readOnly"`
	// CHAP Secret for iSCSI target and initiator authentication.
	SecretRef *JenkinsSpecMasterVolumesIscsiSecretRef `json:"secretRef"`
}

// CHAP Secret for iSCSI target and initiator authentication.
type JenkinsSpecMasterVolumesIscsiSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
type JenkinsSpecMasterVolumesNfs struct {
	// Path that is exported by the NFS server.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
	Path *string `json:"path"`
	// Server is the hostname or IP address of the NFS server.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
	Server *string `json:"server"`
	// ReadOnly here will force the NFS export to be mounted with read-only permissions.
	//
	// Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
	ReadOnly *bool `json:"readOnly"`
}

// PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
//
// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
type JenkinsSpecMasterVolumesPersistentVolumeClaim struct {
	// ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
	ClaimName *string `json:"claimName"`
	// Will force the ReadOnly setting in VolumeMounts.
	//
	// Default false.
	ReadOnly *bool `json:"readOnly"`
}

// PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
type JenkinsSpecMasterVolumesPhotonPersistentDisk struct {
	// ID that identifies Photon Controller persistent disk.
	PdId *string `json:"pdId"`
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
	FsType *string `json:"fsType"`
}

// PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
type JenkinsSpecMasterVolumesPortworxVolume struct {
	// VolumeID uniquely identifies a Portworx volume.
	VolumeId *string `json:"volumeId"`
	// FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system.
	//
	// Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
	FsType *string `json:"fsType"`
	// Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `json:"readOnly"`
}

// Items for all in one resources secrets, configmaps, and downward API.
type JenkinsSpecMasterVolumesProjected struct {
	// list of volume projections.
	Sources *[]*JenkinsSpecMasterVolumesProjectedSources `json:"sources"`
	// Mode bits to use on created files by default.
	//
	// Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	DefaultMode *float64 `json:"defaultMode"`
}

// Projection that may be projected along with other supported volume types.
type JenkinsSpecMasterVolumesProjectedSources struct {
	// information about the configMap data to project.
	ConfigMap *JenkinsSpecMasterVolumesProjectedSourcesConfigMap `json:"configMap"`
	// information about the downwardAPI data to project.
	DownwardApi *JenkinsSpecMasterVolumesProjectedSourcesDownwardApi `json:"downwardApi"`
	// information about the secret data to project.
	Secret *JenkinsSpecMasterVolumesProjectedSourcesSecret `json:"secret"`
	// information about the serviceAccountToken data to project.
	ServiceAccountToken *JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken `json:"serviceAccountToken"`
}

// information about the configMap data to project.
type JenkinsSpecMasterVolumesProjectedSourcesConfigMap struct {
	// If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.
	//
	// If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
	Items *[]*JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems `json:"items"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
	// Specify whether the ConfigMap or its keys must be defined.
	Optional *bool `json:"optional"`
}

// Maps a string key to a path within a volume.
type JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems struct {
	// The key to project.
	Key *string `json:"key"`
	// The relative path of the file to map the key to.
	//
	// May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
	Path *string `json:"path"`
	// Optional: mode bits to use on this file, must be a value between 0 and 0777.
	//
	// If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	Mode *float64 `json:"mode"`
}

// information about the downwardAPI data to project.
type JenkinsSpecMasterVolumesProjectedSourcesDownwardApi struct {
	// Items is a list of DownwardAPIVolume file.
	Items *[]*JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems `json:"items"`
}

// DownwardAPIVolumeFile represents information to create the file containing the pod field.
type JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems struct {
	// Required: Path is  the relative path name of the file to be created.
	//
	// Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
	Path *string `json:"path"`
	// Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
	FieldRef *JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef `json:"fieldRef"`
	// Optional: mode bits to use on this file, must be a value between 0 and 0777.
	//
	// If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	Mode *float64 `json:"mode"`
	// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
	ResourceFieldRef *JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef `json:"resourceFieldRef"`
}

// Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
type JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef struct {
	// Path of the field to select in the specified API version.
	FieldPath *string `json:"fieldPath"`
	// Version of the schema the FieldPath is written in terms of, defaults to "v1".
	ApiVersion *string `json:"apiVersion"`
}

// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
type JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef struct {
	// Required: resource to select.
	Resource *string `json:"resource"`
	// Container name: required for volumes, optional for env vars.
	ContainerName *string `json:"containerName"`
	// Specifies the output format of the exposed resources, defaults to "1".
	Divisor *string `json:"divisor"`
}

// information about the secret data to project.
type JenkinsSpecMasterVolumesProjectedSourcesSecret struct {
	// If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value.
	//
	// If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
	Items *[]*JenkinsSpecMasterVolumesProjectedSourcesSecretItems `json:"items"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
	// Specify whether the Secret or its key must be defined.
	Optional *bool `json:"optional"`
}

// Maps a string key to a path within a volume.
type JenkinsSpecMasterVolumesProjectedSourcesSecretItems struct {
	// The key to project.
	Key *string `json:"key"`
	// The relative path of the file to map the key to.
	//
	// May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
	Path *string `json:"path"`
	// Optional: mode bits to use on this file, must be a value between 0 and 0777.
	//
	// If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	Mode *float64 `json:"mode"`
}

// information about the serviceAccountToken data to project.
type JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken struct {
	// Path is the path relative to the mount point of the file to project the token into.
	Path *string `json:"path"`
	// Audience is the intended audience of the token.
	//
	// A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
	Audience *string `json:"audience"`
	// ExpirationSeconds is the requested duration of validity of the service account token.
	//
	// As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
	ExpirationSeconds *float64 `json:"expirationSeconds"`
}

// Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
type JenkinsSpecMasterVolumesQuobyte struct {
	// Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes.
	Registry *string `json:"registry"`
	// Volume is a string that references an already created Quobyte volume by name.
	Volume *string `json:"volume"`
	// Group to map volume access to Default is no group.
	Group *string `json:"group"`
	// ReadOnly here will force the Quobyte volume to be mounted with read-only permissions.
	//
	// Defaults to false.
	ReadOnly *bool `json:"readOnly"`
	// Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin.
	Tenant *string `json:"tenant"`
	// User to map volume access to Defaults to serivceaccount user.
	User *string `json:"user"`
}

// RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.
//
// More info: https://examples.k8s.io/volumes/rbd/README.md
type JenkinsSpecMasterVolumesRbd struct {
	// The rados image name.
	//
	// More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	Image *string `json:"image"`
	// A collection of Ceph monitors.
	//
	// More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	Monitors *[]*string `json:"monitors"`
	// Filesystem type of the volume that you want to mount.
	//
	// Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd TODO: how do we prevent errors in the filesystem from compromising the machine
	FsType *string `json:"fsType"`
	// Keyring is the path to key ring for RBDUser.
	//
	// Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	Keyring *string `json:"keyring"`
	// The rados pool name.
	//
	// Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	Pool *string `json:"pool"`
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	//
	// Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	ReadOnly *bool `json:"readOnly"`
	// SecretRef is name of the authentication secret for RBDUser.
	//
	// If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	SecretRef *JenkinsSpecMasterVolumesRbdSecretRef `json:"secretRef"`
	// The rados user name.
	//
	// Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	User *string `json:"user"`
}

// SecretRef is name of the authentication secret for RBDUser.
//
// If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
type JenkinsSpecMasterVolumesRbdSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
type JenkinsSpecMasterVolumesScaleIo struct {
	// The host address of the ScaleIO API Gateway.
	Gateway *string `json:"gateway"`
	// SecretRef references to the secret for ScaleIO user and other sensitive information.
	//
	// If this is not provided, Login operation will fail.
	SecretRef *JenkinsSpecMasterVolumesScaleIoSecretRef `json:"secretRef"`
	// The name of the storage system as configured in ScaleIO.
	System *string `json:"system"`
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
	FsType *string `json:"fsType"`
	// The name of the ScaleIO Protection Domain for the configured storage.
	ProtectionDomain *string `json:"protectionDomain"`
	// Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `json:"readOnly"`
	// Flag to enable/disable SSL communication with Gateway, default false.
	SslEnabled *bool `json:"sslEnabled"`
	// Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
	//
	// Default is ThinProvisioned.
	StorageMode *string `json:"storageMode"`
	// The ScaleIO Storage Pool associated with the protection domain.
	StoragePool *string `json:"storagePool"`
	// The name of a volume already created in the ScaleIO system that is associated with this volume source.
	VolumeName *string `json:"volumeName"`
}

// SecretRef references to the secret for ScaleIO user and other sensitive information.
//
// If this is not provided, Login operation will fail.
type JenkinsSpecMasterVolumesScaleIoSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// Secret represents a secret that should populate this volume.
//
// More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
type JenkinsSpecMasterVolumesSecret struct {
	// Optional: mode bits to use on created files by default.
	//
	// Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	DefaultMode *float64 `json:"defaultMode"`
	// If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value.
	//
	// If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
	Items *[]*JenkinsSpecMasterVolumesSecretItems `json:"items"`
	// Specify whether the Secret or its keys must be defined.
	Optional *bool `json:"optional"`
	// Name of the secret in the pod's namespace to use.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
	SecretName *string `json:"secretName"`
}

// Maps a string key to a path within a volume.
type JenkinsSpecMasterVolumesSecretItems struct {
	// The key to project.
	Key *string `json:"key"`
	// The relative path of the file to map the key to.
	//
	// May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
	Path *string `json:"path"`
	// Optional: mode bits to use on this file, must be a value between 0 and 0777.
	//
	// If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	Mode *float64 `json:"mode"`
}

// StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
type JenkinsSpecMasterVolumesStorageos struct {
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
	FsType *string `json:"fsType"`
	// Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `json:"readOnly"`
	// SecretRef specifies the secret to use for obtaining the StorageOS API credentials.
	//
	// If not specified, default values will be attempted.
	SecretRef *JenkinsSpecMasterVolumesStorageosSecretRef `json:"secretRef"`
	// VolumeName is the human-readable name of the StorageOS volume.
	//
	// Volume names are only unique within a namespace.
	VolumeName *string `json:"volumeName"`
	// VolumeNamespace specifies the scope of the volume within StorageOS.
	//
	// If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
	VolumeNamespace *string `json:"volumeNamespace"`
}

// SecretRef specifies the secret to use for obtaining the StorageOS API credentials.
//
// If not specified, default values will be attempted.
type JenkinsSpecMasterVolumesStorageosSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
type JenkinsSpecMasterVolumesVsphereVolume struct {
	// Path that identifies vSphere volume vmdk.
	VolumePath *string `json:"volumePath"`
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
	FsType *string `json:"fsType"`
	// Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
	StoragePolicyId *string `json:"storagePolicyId"`
	// Storage Policy Based Management (SPBM) profile name.
	StoragePolicyName *string `json:"storagePolicyName"`
}

// Notification is a service configuration used to send notifications about Jenkins status.
type JenkinsSpecNotifications struct {
	// NotificationLevel defines the level of a Notification.
	Level *string `json:"level"`
	Name *string `json:"name"`
	Verbose *bool `json:"verbose"`
	// Mailgun is handler for Mailgun email service notification channel.
	Mailgun *JenkinsSpecNotificationsMailgun `json:"mailgun"`
	// Slack is handler for Slack notification channel.
	Slack *JenkinsSpecNotificationsSlack `json:"slack"`
	// SMTP is handler for sending emails via this protocol.
	Smtp *JenkinsSpecNotificationsSmtp `json:"smtp"`
	// MicrosoftTeams is handler for Microsoft MicrosoftTeams notification channel.
	Teams *JenkinsSpecNotificationsTeams `json:"teams"`
}

// Mailgun is handler for Mailgun email service notification channel.
type JenkinsSpecNotificationsMailgun struct {
	// SecretKeySelector selects a key of a Secret.
	ApiKeySecretKeySelector *JenkinsSpecNotificationsMailgunApiKeySecretKeySelector `json:"apiKeySecretKeySelector"`
	Domain *string `json:"domain"`
	From *string `json:"from"`
	Recipient *string `json:"recipient"`
}

// SecretKeySelector selects a key of a Secret.
type JenkinsSpecNotificationsMailgunApiKeySecretKeySelector struct {
	// The key of the secret to select from.
	//
	// Must be a valid secret key.
	Key *string `json:"key"`
	// The name of the secret in the pod's namespace to select from.
	Secret *JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret `json:"secret"`
}

// The name of the secret in the pod's namespace to select from.
type JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// Slack is handler for Slack notification channel.
type JenkinsSpecNotificationsSlack struct {
	// The web hook URL to Slack App.
	WebHookUrlSecretKeySelector *JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector `json:"webHookUrlSecretKeySelector"`
}

// The web hook URL to Slack App.
type JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector struct {
	// The key of the secret to select from.
	//
	// Must be a valid secret key.
	Key *string `json:"key"`
	// The name of the secret in the pod's namespace to select from.
	Secret *JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret `json:"secret"`
}

// The name of the secret in the pod's namespace to select from.
type JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// SMTP is handler for sending emails via this protocol.
type JenkinsSpecNotificationsSmtp struct {
	From *string `json:"from"`
	// SecretKeySelector selects a key of a Secret.
	PasswordSecretKeySelector *JenkinsSpecNotificationsSmtpPasswordSecretKeySelector `json:"passwordSecretKeySelector"`
	Port *float64 `json:"port"`
	Server *string `json:"server"`
	To *string `json:"to"`
	// SecretKeySelector selects a key of a Secret.
	UsernameSecretKeySelector *JenkinsSpecNotificationsSmtpUsernameSecretKeySelector `json:"usernameSecretKeySelector"`
	TlsInsecureSkipVerify *bool `json:"tlsInsecureSkipVerify"`
}

// SecretKeySelector selects a key of a Secret.
type JenkinsSpecNotificationsSmtpPasswordSecretKeySelector struct {
	// The key of the secret to select from.
	//
	// Must be a valid secret key.
	Key *string `json:"key"`
	// The name of the secret in the pod's namespace to select from.
	Secret *JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret `json:"secret"`
}

// The name of the secret in the pod's namespace to select from.
type JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// SecretKeySelector selects a key of a Secret.
type JenkinsSpecNotificationsSmtpUsernameSecretKeySelector struct {
	// The key of the secret to select from.
	//
	// Must be a valid secret key.
	Key *string `json:"key"`
	// The name of the secret in the pod's namespace to select from.
	Secret *JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret `json:"secret"`
}

// The name of the secret in the pod's namespace to select from.
type JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// MicrosoftTeams is handler for Microsoft MicrosoftTeams notification channel.
type JenkinsSpecNotificationsTeams struct {
	// The web hook URL to MicrosoftTeams App.
	WebHookUrlSecretKeySelector *JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector `json:"webHookUrlSecretKeySelector"`
}

// The web hook URL to MicrosoftTeams App.
type JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector struct {
	// The key of the secret to select from.
	//
	// Must be a valid secret key.
	Key *string `json:"key"`
	// The name of the secret in the pod's namespace to select from.
	Secret *JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret `json:"secret"`
}

// The name of the secret in the pod's namespace to select from.
type JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
}

// Backup defines configuration of Jenkins backup restore More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
type JenkinsSpecRestore struct {
	// Action defines action which performs restore backup in restore container sidecar.
	Action *JenkinsSpecRestoreAction `json:"action"`
	// ContainerName is the container name responsible for restore backup operation.
	ContainerName *string `json:"containerName"`
	// RecoveryOnce if want to restore specific backup set this field and then Jenkins will be restarted and desired backup will be restored.
	RecoveryOnce *float64 `json:"recoveryOnce"`
}

// Action defines action which performs restore backup in restore container sidecar.
type JenkinsSpecRestoreAction struct {
	// Exec specifies the action to take.
	Exec *JenkinsSpecRestoreActionExec `json:"exec"`
}

// Exec specifies the action to take.
type JenkinsSpecRestoreActionExec struct {
	// Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.
	//
	// The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
	Command *[]*string `json:"command"`
}

// RoleRef contains information that points to the role being used.
type JenkinsSpecRoles struct {
	// APIGroup is the group for the resource being referenced.
	ApiGroup *string `json:"apiGroup"`
	// Kind is the type of resource being referenced.
	Kind *string `json:"kind"`
	// Name is the name of resource being referenced.
	Name *string `json:"name"`
}

// SeedJob defines configuration for seed job More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-seed-jobs-and-pipelines.
type JenkinsSpecSeedJobs struct {
	// AdditionalClasspath is setting for Job DSL API plugin to set Additional Classpath.
	AdditionalClasspath *string `json:"additionalClasspath"`
	// BitbucketPushTrigger is used for Bitbucket web hooks.
	BitbucketPushTrigger *bool `json:"bitbucketPushTrigger"`
	// BuildPeriodically is setting for scheduled trigger.
	BuildPeriodically *string `json:"buildPeriodically"`
	// CredentialID is the Kubernetes secret name which stores repository access credentials.
	CredentialId *string `json:"credentialId"`
	// JenkinsCredentialType is the https://jenkinsci.github.io/kubernetes-credentials-provider-plugin/ credential type.
	CredentialType *string `json:"credentialType"`
	// Description is the description of the seed job.
	Description *string `json:"description"`
	// FailOnMissingPlugin is setting for Job DSL API plugin that fails job if required plugin is missing.
	FailOnMissingPlugin *bool `json:"failOnMissingPlugin"`
	// GitHubPushTrigger is used for GitHub web hooks.
	GithubPushTrigger *bool `json:"githubPushTrigger"`
	// ID is the unique seed job name.
	Id *string `json:"id"`
	// IgnoreMissingFiles is setting for Job DSL API plugin to ignore files that miss.
	IgnoreMissingFiles *bool `json:"ignoreMissingFiles"`
	// PollSCM is setting for polling changes in SCM.
	PollScm *string `json:"pollScm"`
	// RepositoryBranch is the repository branch where are seed job definitions.
	RepositoryBranch *string `json:"repositoryBranch"`
	// RepositoryURL is the repository access URL.
	//
	// Can be SSH or HTTPS.
	RepositoryUrl *string `json:"repositoryUrl"`
	// Targets is the repository path where are seed job definitions.
	Targets *string `json:"targets"`
	// UnstableOnDeprecation is setting for Job DSL API plugin that sets build status as unstable if build using deprecated features.
	UnstableOnDeprecation *bool `json:"unstableOnDeprecation"`
}

// Service is Kubernetes service of Jenkins master HTTP pod Defaults to : port: 8080 type: ClusterIP.
type JenkinsSpecService struct {
	// Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
	//
	// They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
	Annotations *map[string]*string `json:"annotations"`
	// Route service traffic to pods with label keys and values matching this selector.
	//
	// If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
	Labels *map[string]*string `json:"labels"`
	// Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.
	//
	// This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
	LoadBalancerIp *string `json:"loadBalancerIp"`
	// If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.
	//
	// This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
	LoadBalancerSourceRanges *[]*string `json:"loadBalancerSourceRanges"`
	// The port on each node on which this service is exposed when type=NodePort or LoadBalancer.
	//
	// Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
	NodePort *float64 `json:"nodePort"`
	// The port that are exposed by this service.
	//
	// More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
	Port *float64 `json:"port"`
	// Type determines how the Service is exposed.
	//
	// Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types
	Type *string `json:"type"`
}

// ServiceAccount defines Jenkins master service account attributes.
type JenkinsSpecServiceAccount struct {
	// Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
	//
	// They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
	Annotations *map[string]*string `json:"annotations"`
}

// Service is Kubernetes service of Jenkins slave pods Defaults to : port: 50000 type: ClusterIP.
type JenkinsSpecSlaveService struct {
	// Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
	//
	// They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
	Annotations *map[string]*string `json:"annotations"`
	// Route service traffic to pods with label keys and values matching this selector.
	//
	// If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
	Labels *map[string]*string `json:"labels"`
	// Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.
	//
	// This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
	LoadBalancerIp *string `json:"loadBalancerIp"`
	// If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.
	//
	// This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
	LoadBalancerSourceRanges *[]*string `json:"loadBalancerSourceRanges"`
	// The port on each node on which this service is exposed when type=NodePort or LoadBalancer.
	//
	// Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
	NodePort *float64 `json:"nodePort"`
	// The port that are exposed by this service.
	//
	// More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
	Port *float64 `json:"port"`
	// Type determines how the Service is exposed.
	//
	// Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types
	Type *string `json:"type"`
}

