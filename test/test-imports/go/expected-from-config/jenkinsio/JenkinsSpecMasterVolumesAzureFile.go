package jenkinsio


// AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
type JenkinsSpecMasterVolumesAzureFile struct {
	// the name of secret that contains Azure Storage Account Name and Key.
	SecretName *string `field:"required" json:"secretName" yaml:"secretName"`
	// Share Name.
	ShareName *string `field:"required" json:"shareName" yaml:"shareName"`
	// Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
}

