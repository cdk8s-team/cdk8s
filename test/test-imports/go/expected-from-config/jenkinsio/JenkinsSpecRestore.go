package jenkinsio


// Backup defines configuration of Jenkins backup restore More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
type JenkinsSpecRestore struct {
	// Action defines action which performs restore backup in restore container sidecar.
	Action *JenkinsSpecRestoreAction `field:"required" json:"action" yaml:"action"`
	// ContainerName is the container name responsible for restore backup operation.
	ContainerName *string `field:"required" json:"containerName" yaml:"containerName"`
	// RecoveryOnce if want to restore specific backup set this field and then Jenkins will be restarted and desired backup will be restored.
	RecoveryOnce *float64 `field:"optional" json:"recoveryOnce" yaml:"recoveryOnce"`
}

