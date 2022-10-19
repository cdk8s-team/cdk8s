// jenkinsio
package jenkinsio


// Container defines Kubernetes container attributes.
type JenkinsSpecMasterContainers struct {
	// Docker image name.
	//
	// More info: https://kubernetes.io/docs/concepts/containers/images
	Image *string `field:"required" json:"image" yaml:"image"`
	// Image pull policy.
	//
	// One of Always, Never, IfNotPresent. Defaults to Always.
	ImagePullPolicy *string `field:"required" json:"imagePullPolicy" yaml:"imagePullPolicy"`
	// Name of the container specified as a DNS_LABEL.
	//
	// Each container in a pod must have a unique name (DNS_LABEL).
	Name *string `field:"required" json:"name" yaml:"name"`
	// Compute Resources required by this container.
	//
	// More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Resources *JenkinsSpecMasterContainersResources `field:"required" json:"resources" yaml:"resources"`
	// Arguments to the entrypoint.
	//
	// The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
	Args *[]*string `field:"optional" json:"args" yaml:"args"`
	// Entrypoint array.
	//
	// Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
	Command *[]*string `field:"optional" json:"command" yaml:"command"`
	// List of environment variables to set in the container.
	Env *[]*JenkinsSpecMasterContainersEnv `field:"optional" json:"env" yaml:"env"`
	// List of sources to populate environment variables in the container.
	//
	// The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence.
	EnvFrom *[]*JenkinsSpecMasterContainersEnvFrom `field:"optional" json:"envFrom" yaml:"envFrom"`
	// Actions that the management system should take in response to container lifecycle events.
	Lifecycle *JenkinsSpecMasterContainersLifecycle `field:"optional" json:"lifecycle" yaml:"lifecycle"`
	// Periodic probe of container liveness.
	//
	// Container will be restarted if the probe fails.
	LivenessProbe *JenkinsSpecMasterContainersLivenessProbe `field:"optional" json:"livenessProbe" yaml:"livenessProbe"`
	// List of ports to expose from the container.
	//
	// Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network.
	Ports *[]*JenkinsSpecMasterContainersPorts `field:"optional" json:"ports" yaml:"ports"`
	// Periodic probe of container service readiness.
	//
	// Container will be removed from service endpoints if the probe fails.
	ReadinessProbe *JenkinsSpecMasterContainersReadinessProbe `field:"optional" json:"readinessProbe" yaml:"readinessProbe"`
	// Security options the pod should run with.
	//
	// More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
	SecurityContext *JenkinsSpecMasterContainersSecurityContext `field:"optional" json:"securityContext" yaml:"securityContext"`
	// Pod volumes to mount into the container's filesystem.
	VolumeMounts *[]*JenkinsSpecMasterContainersVolumeMounts `field:"optional" json:"volumeMounts" yaml:"volumeMounts"`
	// Container's working directory.
	//
	// If not specified, the container runtime's default will be used, which might be configured in the container image.
	WorkingDir *string `field:"optional" json:"workingDir" yaml:"workingDir"`
}

