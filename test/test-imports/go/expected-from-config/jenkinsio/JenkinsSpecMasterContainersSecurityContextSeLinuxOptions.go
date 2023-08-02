package jenkinsio


// The SELinux context to be applied to the container.
//
// If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
type JenkinsSpecMasterContainersSecurityContextSeLinuxOptions struct {
	// Level is SELinux level label that applies to the container.
	Level *string `field:"optional" json:"level" yaml:"level"`
	// Role is a SELinux role label that applies to the container.
	Role *string `field:"optional" json:"role" yaml:"role"`
	// Type is a SELinux type label that applies to the container.
	Type *string `field:"optional" json:"type" yaml:"type"`
	// User is a SELinux user label that applies to the container.
	User *string `field:"optional" json:"user" yaml:"user"`
}

