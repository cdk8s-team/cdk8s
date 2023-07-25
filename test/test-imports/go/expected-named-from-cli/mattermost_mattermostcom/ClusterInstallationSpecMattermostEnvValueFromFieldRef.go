package mattermost_mattermostcom


// Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
type ClusterInstallationSpecMattermostEnvValueFromFieldRef struct {
	// Path of the field to select in the specified API version.
	FieldPath *string `field:"required" json:"fieldPath" yaml:"fieldPath"`
	// Version of the schema the FieldPath is written in terms of, defaults to "v1".
	ApiVersion *string `field:"optional" json:"apiVersion" yaml:"apiVersion"`
}

