package jenkinsio


// Action defines action which performs backup in backup container sidecar.
type JenkinsSpecBackupAction struct {
	// Exec specifies the action to take.
	Exec *JenkinsSpecBackupActionExec `field:"optional" json:"exec" yaml:"exec"`
}

