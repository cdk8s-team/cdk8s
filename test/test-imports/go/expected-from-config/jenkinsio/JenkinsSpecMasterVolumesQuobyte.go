// jenkinsio
package jenkinsio


// Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
type JenkinsSpecMasterVolumesQuobyte struct {
	// Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes.
	Registry *string `field:"required" json:"registry" yaml:"registry"`
	// Volume is a string that references an already created Quobyte volume by name.
	Volume *string `field:"required" json:"volume" yaml:"volume"`
	// Group to map volume access to Default is no group.
	Group *string `field:"optional" json:"group" yaml:"group"`
	// ReadOnly here will force the Quobyte volume to be mounted with read-only permissions.
	//
	// Defaults to false.
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
	// Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin.
	Tenant *string `field:"optional" json:"tenant" yaml:"tenant"`
	// User to map volume access to Defaults to serivceaccount user.
	User *string `field:"optional" json:"user" yaml:"user"`
}

