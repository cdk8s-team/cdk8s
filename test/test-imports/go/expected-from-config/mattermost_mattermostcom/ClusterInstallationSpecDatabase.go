package mattermost_mattermostcom


// Database defines the database configuration for a ClusterInstallation.
type ClusterInstallationSpecDatabase struct {
	// Defines the backup retention policy.
	BackupRemoteDeletePolicy *string `field:"optional" json:"backupRemoteDeletePolicy" yaml:"backupRemoteDeletePolicy"`
	// Defines the secret to be used when performing a database restore.
	BackupRestoreSecretName *string `field:"optional" json:"backupRestoreSecretName" yaml:"backupRestoreSecretName"`
	// Defines the interval for backups in cron expression format.
	BackupSchedule *string `field:"optional" json:"backupSchedule" yaml:"backupSchedule"`
	// Defines the secret to be used for uploading/restoring backup.
	BackupSecretName *string `field:"optional" json:"backupSecretName" yaml:"backupSecretName"`
	// Defines the object storage url for uploading backups.
	BackupUrl *string `field:"optional" json:"backupUrl" yaml:"backupUrl"`
	// Defines the AWS S3 bucket where the Database Backup is stored.
	//
	// The operator will download the file to restore the data.
	InitBucketUrl *string `field:"optional" json:"initBucketUrl" yaml:"initBucketUrl"`
	// Defines the number of database replicas.
	//
	// For redundancy use at least 2 replicas. Setting this will override the number of replicas set by 'Size'.
	Replicas *float64 `field:"optional" json:"replicas" yaml:"replicas"`
	// Defines the resource requests and limits for the database pods.
	Resources *ClusterInstallationSpecDatabaseResources `field:"optional" json:"resources" yaml:"resources"`
	// Optionally enter the name of an already-existing Secret for connecting to the database.
	//
	// This secret should be configured as follows:
	// User-Managed Database   - Key: DB_CONNECTION_STRING | Value: <FULL_DATABASE_CONNECTION_STRING> Operator-Managed Database   - Key: ROOT_PASSWORD | Value: <ROOT_DATABASE_PASSWORD>   - Key: USER | Value: <USER_NAME>   - Key: PASSWORD | Value: <USER_PASSWORD>   - Key: DATABASE Value: <DATABASE_NAME>
	// Notes:   If you define all secret values for both User-Managed and   Operator-Managed database types, the User-Managed connection string will   take precedence and the Operator-Managed values will be ignored. If the   secret is left blank, the default behavior is to use an Operator-Managed   database with strong randomly-generated database credentials.
	Secret *string `field:"optional" json:"secret" yaml:"secret"`
	// Defines the storage size for the database.
	//
	// ie 50Gi.
	StorageSize *string `field:"optional" json:"storageSize" yaml:"storageSize"`
	Type *string `field:"optional" json:"type" yaml:"type"`
}

