package k8s


// AuditSink represents a cluster level audit sink.
type KubeAuditSinkV1Alpha1Props struct {
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec defines the audit configuration spec.
	Spec *AuditSinkSpecV1Alpha1 `field:"optional" json:"spec" yaml:"spec"`
}

