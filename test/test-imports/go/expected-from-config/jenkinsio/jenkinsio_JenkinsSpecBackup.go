// jenkinsio
package jenkinsio


// Backup defines configuration of Jenkins backup More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
type JenkinsSpecBackup struct {
	// Action defines action which performs backup in backup container sidecar.
	Action *JenkinsSpecBackupAction `field:"required" json:"action" yaml:"action"`
	// ContainerName is the container name responsible for backup operation.
	ContainerName *string `field:"required" json:"containerName" yaml:"containerName"`
	// Interval tells how often make backup in seconds Defaults to 30.
	Interval *float64 `field:"required" json:"interval" yaml:"interval"`
	// MakeBackupBeforePodDeletion tells operator to make backup before Jenkins master pod deletion.
	MakeBackupBeforePodDeletion *bool `field:"required" json:"makeBackupBeforePodDeletion" yaml:"makeBackupBeforePodDeletion"`
}

