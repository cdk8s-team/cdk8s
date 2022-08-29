// jenkinsio
package jenkinsio


// The capabilities to add/drop when running containers.
//
// Defaults to the default set of capabilities granted by the container runtime.
type JenkinsSpecMasterContainersSecurityContextCapabilities struct {
	// Added capabilities.
	Add *[]*string `field:"optional" json:"add" yaml:"add"`
	// Removed capabilities.
	Drop *[]*string `field:"optional" json:"drop" yaml:"drop"`
}

