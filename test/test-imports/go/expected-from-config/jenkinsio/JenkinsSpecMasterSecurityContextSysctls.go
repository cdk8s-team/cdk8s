// jenkinsio
package jenkinsio


// Sysctl defines a kernel parameter to be set.
type JenkinsSpecMasterSecurityContextSysctls struct {
	// Name of a property to set.
	Name *string `field:"required" json:"name" yaml:"name"`
	// Value of a property to set.
	Value *string `field:"required" json:"value" yaml:"value"`
}

