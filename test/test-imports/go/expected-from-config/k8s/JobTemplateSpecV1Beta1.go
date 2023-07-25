package k8s


// JobTemplateSpec describes the data a Job should have when created from a template.
type JobTemplateSpecV1Beta1 struct {
	// Standard object's metadata of the jobs created from this template.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Specification of the desired behavior of the job.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *JobSpec `field:"optional" json:"spec" yaml:"spec"`
}

