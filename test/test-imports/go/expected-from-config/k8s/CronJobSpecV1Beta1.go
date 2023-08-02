package k8s


// CronJobSpec describes how the job execution will look like and when it will actually run.
type CronJobSpecV1Beta1 struct {
	// Specifies the job that will be created when executing a CronJob.
	JobTemplate *JobTemplateSpecV1Beta1 `field:"required" json:"jobTemplate" yaml:"jobTemplate"`
	// The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
	Schedule *string `field:"required" json:"schedule" yaml:"schedule"`
	// Specifies how to treat concurrent executions of a Job.
	//
	// Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one.
	ConcurrencyPolicy *string `field:"optional" json:"concurrencyPolicy" yaml:"concurrencyPolicy"`
	// The number of failed finished jobs to retain.
	//
	// This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
	FailedJobsHistoryLimit *float64 `field:"optional" json:"failedJobsHistoryLimit" yaml:"failedJobsHistoryLimit"`
	// Optional deadline in seconds for starting the job if it misses scheduled time for any reason.
	//
	// Missed jobs executions will be counted as failed ones.
	StartingDeadlineSeconds *float64 `field:"optional" json:"startingDeadlineSeconds" yaml:"startingDeadlineSeconds"`
	// The number of successful finished jobs to retain.
	//
	// This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
	SuccessfulJobsHistoryLimit *float64 `field:"optional" json:"successfulJobsHistoryLimit" yaml:"successfulJobsHistoryLimit"`
	// This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.
	//
	// Defaults to false.
	Suspend *bool `field:"optional" json:"suspend" yaml:"suspend"`
}

