// k8s
package k8s


// SecurityContext holds security configuration that will be applied to a container.
//
// Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
type SecurityContext struct {
	// AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process.
	//
	// This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
	AllowPrivilegeEscalation *bool `field:"optional" json:"allowPrivilegeEscalation" yaml:"allowPrivilegeEscalation"`
	// The capabilities to add/drop when running containers.
	//
	// Defaults to the default set of capabilities granted by the container runtime.
	Capabilities *Capabilities `field:"optional" json:"capabilities" yaml:"capabilities"`
	// Run container in privileged mode.
	//
	// Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
	Privileged *bool `field:"optional" json:"privileged" yaml:"privileged"`
	// procMount denotes the type of proc mount to use for the containers.
	//
	// The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.
	ProcMount *string `field:"optional" json:"procMount" yaml:"procMount"`
	// Whether this container has a read-only root filesystem.
	//
	// Default is false.
	ReadOnlyRootFilesystem *bool `field:"optional" json:"readOnlyRootFilesystem" yaml:"readOnlyRootFilesystem"`
	// The GID to run the entrypoint of the container process.
	//
	// Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	RunAsGroup *float64 `field:"optional" json:"runAsGroup" yaml:"runAsGroup"`
	// Indicates that the container must run as a non-root user.
	//
	// If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	RunAsNonRoot *bool `field:"optional" json:"runAsNonRoot" yaml:"runAsNonRoot"`
	// The UID to run the entrypoint of the container process.
	//
	// Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	RunAsUser *float64 `field:"optional" json:"runAsUser" yaml:"runAsUser"`
	// The SELinux context to be applied to the container.
	//
	// If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	SeLinuxOptions *SeLinuxOptions `field:"optional" json:"seLinuxOptions" yaml:"seLinuxOptions"`
	// The Windows specific settings applied to all containers.
	//
	// If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
	WindowsOptions *WindowsSecurityContextOptions `field:"optional" json:"windowsOptions" yaml:"windowsOptions"`
}

