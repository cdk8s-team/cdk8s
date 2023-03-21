// jenkinsio
package jenkinsio


// GitRepo represents a git repository at a particular revision.
//
// DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
type JenkinsSpecMasterVolumesGitRepo struct {
	// Repository URL.
	Repository *string `field:"required" json:"repository" yaml:"repository"`
	// Target directory name.
	//
	// Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
	Directory *string `field:"optional" json:"directory" yaml:"directory"`
	// Commit hash for the specified revision.
	Revision *string `field:"optional" json:"revision" yaml:"revision"`
}

