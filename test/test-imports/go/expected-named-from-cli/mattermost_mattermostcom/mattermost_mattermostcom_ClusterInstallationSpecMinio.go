// mattermost_mattermostcom
package mattermost_mattermostcom


// Minio defines the configuration of Minio for a ClusterInstallation.
type ClusterInstallationSpecMinio struct {
	// Set to the bucket name of your external MinIO or S3.
	ExternalBucket *string `field:"optional" json:"externalBucket" yaml:"externalBucket"`
	// Set to use an external MinIO deployment or S3.
	//
	// Must also set 'Secret' and 'ExternalBucket'.
	ExternalUrl *string `field:"optional" json:"externalUrl" yaml:"externalUrl"`
	// Defines the number of Minio replicas.
	//
	// Supply 1 to run Minio in standalone mode with no redundancy. Supply 4 or more to run Minio in distributed mode. Note that it is not possible to upgrade Minio from standalone to distributed mode. Setting this will override the number of replicas set by 'Size'. More info: https://docs.min.io/docs/distributed-minio-quickstart-guide.html
	Replicas *float64 `field:"optional" json:"replicas" yaml:"replicas"`
	// Defines the resource requests and limits for the Minio pods.
	Resources *ClusterInstallationSpecMinioResources `field:"optional" json:"resources" yaml:"resources"`
	// Optionally enter the name of already existing secret.
	//
	// Secret should have two values: "accesskey" and "secretkey". Required when "ExternalURL" is set.
	Secret *string `field:"optional" json:"secret" yaml:"secret"`
	// Defines the storage size for Minio.
	//
	// ie 50Gi.
	StorageSize *string `field:"optional" json:"storageSize" yaml:"storageSize"`
}

