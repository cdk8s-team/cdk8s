// jenkinsio
package jenkinsio


// Projection that may be projected along with other supported volume types.
type JenkinsSpecMasterVolumesProjectedSources struct {
	// information about the configMap data to project.
	ConfigMap *JenkinsSpecMasterVolumesProjectedSourcesConfigMap `field:"optional" json:"configMap" yaml:"configMap"`
	// information about the downwardAPI data to project.
	DownwardApi *JenkinsSpecMasterVolumesProjectedSourcesDownwardApi `field:"optional" json:"downwardApi" yaml:"downwardApi"`
	// information about the secret data to project.
	Secret *JenkinsSpecMasterVolumesProjectedSourcesSecret `field:"optional" json:"secret" yaml:"secret"`
	// information about the serviceAccountToken data to project.
	ServiceAccountToken *JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken `field:"optional" json:"serviceAccountToken" yaml:"serviceAccountToken"`
}

