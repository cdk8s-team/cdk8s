// k8s
package k8s


// AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
type AzureFilePersistentVolumeSource struct {
	// the name of secret that contains Azure Storage Account Name and Key.
	SecretName *string `field:"required" json:"secretName" yaml:"secretName"`
	// Share Name.
	ShareName *string `field:"required" json:"shareName" yaml:"shareName"`
	// Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
	// the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod.
	SecretNamespace *string `field:"optional" json:"secretNamespace" yaml:"secretNamespace"`
}

