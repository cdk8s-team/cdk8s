// k8s
package k8s


// Represents a Flocker volume mounted by the Flocker agent.
//
// One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
type FlockerVolumeSource struct {
	// Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated.
	DatasetName *string `field:"optional" json:"datasetName" yaml:"datasetName"`
	// UUID of the dataset.
	//
	// This is unique identifier of a Flocker dataset.
	DatasetUuid *string `field:"optional" json:"datasetUuid" yaml:"datasetUuid"`
}

