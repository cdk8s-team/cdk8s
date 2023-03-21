// k8s
package k8s


// Represents downward API info for projecting into a projected volume.
//
// Note that this is identical to a downwardAPI volume source without the default mode.
type DownwardApiProjection struct {
	// Items is a list of DownwardAPIVolume file.
	Items *[]*DownwardApiVolumeFile `field:"optional" json:"items" yaml:"items"`
}

