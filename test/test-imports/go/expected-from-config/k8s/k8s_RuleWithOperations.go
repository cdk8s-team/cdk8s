// k8s
package k8s


// RuleWithOperations is a tuple of Operations and Resources.
//
// It is recommended to make sure that all the tuple expansions are valid.
type RuleWithOperations struct {
	// APIGroups is the API groups the resources belong to.
	//
	// '*' is all groups. If '*' is present, the length of the slice must be one. Required.
	ApiGroups *[]*string `field:"optional" json:"apiGroups" yaml:"apiGroups"`
	// APIVersions is the API versions the resources belong to.
	//
	// '*' is all versions. If '*' is present, the length of the slice must be one. Required.
	ApiVersions *[]*string `field:"optional" json:"apiVersions" yaml:"apiVersions"`
	// Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations.
	//
	// If '*' is present, the length of the slice must be one. Required.
	Operations *[]*string `field:"optional" json:"operations" yaml:"operations"`
	// Resources is a list of resources this rule applies to.
	//
	// For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/*' means all subresources of pods. '_/scale' means all scale subresources. '_/*' means all resources and their subresources.
	//
	// If wildcard is present, the validation rule will ensure resources do not overlap with each other.
	//
	// Depending on the enclosing object, subresources might not be allowed. Required.
	Resources *[]*string `field:"optional" json:"resources" yaml:"resources"`
	// scope specifies the scope of this rule.
	//
	// Valid values are "Cluster", "Namespaced", and "*" "Cluster" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. "Namespaced" means that only namespaced resources will match this rule. "*" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is "*".
	Scope *string `field:"optional" json:"scope" yaml:"scope"`
}

