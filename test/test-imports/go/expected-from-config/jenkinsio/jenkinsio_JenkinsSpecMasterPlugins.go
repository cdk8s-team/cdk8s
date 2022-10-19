// jenkinsio
package jenkinsio


// Plugin defines Jenkins plugin.
type JenkinsSpecMasterPlugins struct {
	// Name is the name of Jenkins plugin.
	Name *string `field:"required" json:"name" yaml:"name"`
	// Version is the version of Jenkins plugin.
	Version *string `field:"required" json:"version" yaml:"version"`
}

