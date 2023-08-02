package k8s


// DEPRECATED.
type RollbackConfigV1Beta1 struct {
	// The revision to rollback to.
	//
	// If set to 0, rollback to the last revision.
	Revision *float64 `field:"optional" json:"revision" yaml:"revision"`
}

