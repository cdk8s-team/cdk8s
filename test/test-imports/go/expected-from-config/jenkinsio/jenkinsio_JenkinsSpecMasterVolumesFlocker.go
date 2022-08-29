// jenkinsio
package jenkinsio


// Flocker represents a Flocker volume attached to a kubelet's host machine.
//
// This depends on the Flocker control service being running.
type JenkinsSpecMasterVolumesFlocker struct {
	// Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated.
	DatasetName *string `field:"optional" json:"datasetName" yaml:"datasetName"`
	// UUID of the dataset.
	//
	// This is unique identifier of a Flocker dataset.
	DatasetUuid *string `field:"optional" json:"datasetUuid" yaml:"datasetUuid"`
}

