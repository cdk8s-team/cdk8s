// k8s
package k8s


// Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
type Preconditions struct {
	// Specifies the target ResourceVersion.
	ResourceVersion *string `field:"optional" json:"resourceVersion" yaml:"resourceVersion"`
	// Specifies the target UID.
	Uid *string `field:"optional" json:"uid" yaml:"uid"`
}

