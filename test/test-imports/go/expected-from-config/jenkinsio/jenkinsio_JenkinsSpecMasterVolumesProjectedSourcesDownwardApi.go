// jenkinsio
package jenkinsio


// information about the downwardAPI data to project.
type JenkinsSpecMasterVolumesProjectedSourcesDownwardApi struct {
	// Items is a list of DownwardAPIVolume file.
	Items *[]*JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems `field:"optional" json:"items" yaml:"items"`
}

