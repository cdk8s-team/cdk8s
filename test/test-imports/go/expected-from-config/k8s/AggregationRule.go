// k8s
package k8s


// AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole.
type AggregationRule struct {
	// ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
	//
	// If any of the selectors match, then the ClusterRole's permissions will be added.
	ClusterRoleSelectors *[]*LabelSelector `field:"optional" json:"clusterRoleSelectors" yaml:"clusterRoleSelectors"`
}

