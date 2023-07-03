package k8s


// AuditSinkList is a list of AuditSink items.
type KubeAuditSinkListV1Alpha1Props struct {
	// List of audit configurations.
	Items *[]*KubeAuditSinkV1Alpha1Props `field:"required" json:"items" yaml:"items"`
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

