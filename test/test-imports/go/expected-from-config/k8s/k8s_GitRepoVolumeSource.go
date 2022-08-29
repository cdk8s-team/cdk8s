// k8s
package k8s


// Represents a volume that is populated with the contents of a git repository.
//
// Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
//
// DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
type GitRepoVolumeSource struct {
	// Repository URL.
	Repository *string `field:"required" json:"repository" yaml:"repository"`
	// Target directory name.
	//
	// Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
	Directory *string `field:"optional" json:"directory" yaml:"directory"`
	// Commit hash for the specified revision.
	Revision *string `field:"optional" json:"revision" yaml:"revision"`
}

