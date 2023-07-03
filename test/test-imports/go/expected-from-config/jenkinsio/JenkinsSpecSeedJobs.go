package jenkinsio


// SeedJob defines configuration for seed job More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-seed-jobs-and-pipelines.
type JenkinsSpecSeedJobs struct {
	// AdditionalClasspath is setting for Job DSL API plugin to set Additional Classpath.
	AdditionalClasspath *string `field:"optional" json:"additionalClasspath" yaml:"additionalClasspath"`
	// BitbucketPushTrigger is used for Bitbucket web hooks.
	BitbucketPushTrigger *bool `field:"optional" json:"bitbucketPushTrigger" yaml:"bitbucketPushTrigger"`
	// BuildPeriodically is setting for scheduled trigger.
	BuildPeriodically *string `field:"optional" json:"buildPeriodically" yaml:"buildPeriodically"`
	// CredentialID is the Kubernetes secret name which stores repository access credentials.
	CredentialId *string `field:"optional" json:"credentialId" yaml:"credentialId"`
	// JenkinsCredentialType is the https://jenkinsci.github.io/kubernetes-credentials-provider-plugin/ credential type.
	CredentialType *string `field:"optional" json:"credentialType" yaml:"credentialType"`
	// Description is the description of the seed job.
	Description *string `field:"optional" json:"description" yaml:"description"`
	// FailOnMissingPlugin is setting for Job DSL API plugin that fails job if required plugin is missing.
	FailOnMissingPlugin *bool `field:"optional" json:"failOnMissingPlugin" yaml:"failOnMissingPlugin"`
	// GitHubPushTrigger is used for GitHub web hooks.
	GithubPushTrigger *bool `field:"optional" json:"githubPushTrigger" yaml:"githubPushTrigger"`
	// ID is the unique seed job name.
	Id *string `field:"optional" json:"id" yaml:"id"`
	// IgnoreMissingFiles is setting for Job DSL API plugin to ignore files that miss.
	IgnoreMissingFiles *bool `field:"optional" json:"ignoreMissingFiles" yaml:"ignoreMissingFiles"`
	// PollSCM is setting for polling changes in SCM.
	PollScm *string `field:"optional" json:"pollScm" yaml:"pollScm"`
	// RepositoryBranch is the repository branch where are seed job definitions.
	RepositoryBranch *string `field:"optional" json:"repositoryBranch" yaml:"repositoryBranch"`
	// RepositoryURL is the repository access URL.
	//
	// Can be SSH or HTTPS.
	RepositoryUrl *string `field:"optional" json:"repositoryUrl" yaml:"repositoryUrl"`
	// Targets is the repository path where are seed job definitions.
	Targets *string `field:"optional" json:"targets" yaml:"targets"`
	// UnstableOnDeprecation is setting for Job DSL API plugin that sets build status as unstable if build using deprecated features.
	UnstableOnDeprecation *bool `field:"optional" json:"unstableOnDeprecation" yaml:"unstableOnDeprecation"`
}

