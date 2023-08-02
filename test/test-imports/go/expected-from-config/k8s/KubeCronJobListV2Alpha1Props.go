package k8s


// CronJobList is a collection of cron jobs.
type KubeCronJobListV2Alpha1Props struct {
	// items is the list of CronJobs.
	Items *[]*KubeCronJobV2Alpha1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

