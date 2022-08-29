// stableexamplecom
package stableexamplecom


type CronTabSpec struct {
	CronSpec *string `field:"optional" json:"cronSpec" yaml:"cronSpec"`
	Image *string `field:"optional" json:"image" yaml:"image"`
	Replicas *float64 `field:"optional" json:"replicas" yaml:"replicas"`
}

