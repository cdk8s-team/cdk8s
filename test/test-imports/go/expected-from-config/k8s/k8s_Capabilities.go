// k8s
package k8s


// Adds and removes POSIX capabilities from running containers.
type Capabilities struct {
	// Added capabilities.
	Add *[]*string `field:"optional" json:"add" yaml:"add"`
	// Removed capabilities.
	Drop *[]*string `field:"optional" json:"drop" yaml:"drop"`
}

