// k8s
package k8s


// An EphemeralContainer is a container that may be added temporarily to an existing pod for user-initiated activities such as debugging.
//
// Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a pod is removed or restarted. If an ephemeral container causes a pod to exceed its resource allocation, the pod may be evicted. Ephemeral containers may not be added by directly updating the pod spec. They must be added via the pod's ephemeralcontainers subresource, and they will appear in the pod spec once added. This is an alpha feature enabled by the EphemeralContainers feature flag.
type EphemeralContainer struct {
	// Name of the ephemeral container specified as a DNS_LABEL.
	//
	// This name must be unique among all containers, init containers and ephemeral containers.
	Name *string `field:"required" json:"name" yaml:"name"`
	// Arguments to the entrypoint.
	//
	// The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
	Args *[]*string `field:"optional" json:"args" yaml:"args"`
	// Entrypoint array.
	//
	// Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
	Command *[]*string `field:"optional" json:"command" yaml:"command"`
	// List of environment variables to set in the container.
	//
	// Cannot be updated.
	Env *[]*EnvVar `field:"optional" json:"env" yaml:"env"`
	// List of sources to populate environment variables in the container.
	//
	// The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
	EnvFrom *[]*EnvFromSource `field:"optional" json:"envFrom" yaml:"envFrom"`
	// Docker image name.
	//
	// More info: https://kubernetes.io/docs/concepts/containers/images
	Image *string `field:"optional" json:"image" yaml:"image"`
	// Image pull policy.
	//
	// One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
	ImagePullPolicy *string `field:"optional" json:"imagePullPolicy" yaml:"imagePullPolicy"`
	// Lifecycle is not allowed for ephemeral containers.
	Lifecycle *Lifecycle `field:"optional" json:"lifecycle" yaml:"lifecycle"`
	// Probes are not allowed for ephemeral containers.
	LivenessProbe *Probe `field:"optional" json:"livenessProbe" yaml:"livenessProbe"`
	// Ports are not allowed for ephemeral containers.
	Ports *[]*ContainerPort `field:"optional" json:"ports" yaml:"ports"`
	// Probes are not allowed for ephemeral containers.
	ReadinessProbe *Probe `field:"optional" json:"readinessProbe" yaml:"readinessProbe"`
	// Resources are not allowed for ephemeral containers.
	//
	// Ephemeral containers use spare resources already allocated to the pod.
	Resources *ResourceRequirements `field:"optional" json:"resources" yaml:"resources"`
	// SecurityContext is not allowed for ephemeral containers.
	SecurityContext *SecurityContext `field:"optional" json:"securityContext" yaml:"securityContext"`
	// Probes are not allowed for ephemeral containers.
	StartupProbe *Probe `field:"optional" json:"startupProbe" yaml:"startupProbe"`
	// Whether this container should allocate a buffer for stdin in the container runtime.
	//
	// If this is not set, reads from stdin in the container will always result in EOF. Default is false.
	Stdin *bool `field:"optional" json:"stdin" yaml:"stdin"`
	// Whether the container runtime should close the stdin channel after it has been opened by a single attach.
	//
	// When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
	StdinOnce *bool `field:"optional" json:"stdinOnce" yaml:"stdinOnce"`
	// If set, the name of the container from PodSpec that this ephemeral container targets.
	//
	// The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container is run in whatever namespaces are shared for the pod. Note that the container runtime must support this feature.
	TargetContainerName *string `field:"optional" json:"targetContainerName" yaml:"targetContainerName"`
	// Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem.
	//
	// Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
	TerminationMessagePath *string `field:"optional" json:"terminationMessagePath" yaml:"terminationMessagePath"`
	// Indicate how the termination message should be populated.
	//
	// File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
	TerminationMessagePolicy *string `field:"optional" json:"terminationMessagePolicy" yaml:"terminationMessagePolicy"`
	// Whether this container should allocate a TTY for itself, also requires 'stdin' to be true.
	//
	// Default is false.
	Tty *bool `field:"optional" json:"tty" yaml:"tty"`
	// volumeDevices is the list of block devices to be used by the container.
	//
	// This is a beta feature.
	VolumeDevices *[]*VolumeDevice `field:"optional" json:"volumeDevices" yaml:"volumeDevices"`
	// Pod volumes to mount into the container's filesystem.
	//
	// Cannot be updated.
	VolumeMounts *[]*VolumeMount `field:"optional" json:"volumeMounts" yaml:"volumeMounts"`
	// Container's working directory.
	//
	// If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
	WorkingDir *string `field:"optional" json:"workingDir" yaml:"workingDir"`
}

