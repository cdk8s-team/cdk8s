// jenkinsio
package jenkinsio


// Action defines action which performs restore backup in restore container sidecar.
type JenkinsSpecRestoreAction struct {
	// Exec specifies the action to take.
	Exec *JenkinsSpecRestoreActionExec `field:"optional" json:"exec" yaml:"exec"`
}

