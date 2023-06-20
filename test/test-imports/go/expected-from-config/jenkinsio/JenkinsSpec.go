package jenkinsio


// Spec defines the desired state of the Jenkins.
type JenkinsSpec struct {
	// JenkinsAPISettings defines configuration used by the operator to gain admin access to the Jenkins API.
	JenkinsApiSettings *JenkinsSpecJenkinsApiSettings `field:"required" json:"jenkinsApiSettings" yaml:"jenkinsApiSettings"`
	// Master represents Jenkins master pod properties and Jenkins plugins.
	//
	// Every single change here requires a pod restart.
	Master *JenkinsSpecMaster `field:"required" json:"master" yaml:"master"`
	// Backup defines configuration of Jenkins backup More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
	Backup *JenkinsSpecBackup `field:"optional" json:"backup" yaml:"backup"`
	// ConfigurationAsCode defines configuration of Jenkins customization via Configuration as Code Jenkins plugin.
	ConfigurationAsCode *JenkinsSpecConfigurationAsCode `field:"optional" json:"configurationAsCode" yaml:"configurationAsCode"`
	// GroovyScripts defines configuration of Jenkins customization via groovy scripts.
	GroovyScripts *JenkinsSpecGroovyScripts `field:"optional" json:"groovyScripts" yaml:"groovyScripts"`
	// Notifications defines list of a services which are used to inform about Jenkins status Can be used to integrate chat services like Slack, Microsoft Teams or Mailgun.
	Notifications *[]*JenkinsSpecNotifications `field:"optional" json:"notifications" yaml:"notifications"`
	// Backup defines configuration of Jenkins backup restore More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
	Restore *JenkinsSpecRestore `field:"optional" json:"restore" yaml:"restore"`
	// Roles defines list of extra RBAC roles for the Jenkins Master pod service account.
	Roles *[]*JenkinsSpecRoles `field:"optional" json:"roles" yaml:"roles"`
	// SeedJobs defines list of Jenkins Seed Job configurations More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-seed-jobs-and-pipelines.
	SeedJobs *[]*JenkinsSpecSeedJobs `field:"optional" json:"seedJobs" yaml:"seedJobs"`
	// Service is Kubernetes service of Jenkins master HTTP pod Defaults to : port: 8080 type: ClusterIP.
	Service *JenkinsSpecService `field:"optional" json:"service" yaml:"service"`
	// ServiceAccount defines Jenkins master service account attributes.
	ServiceAccount *JenkinsSpecServiceAccount `field:"optional" json:"serviceAccount" yaml:"serviceAccount"`
	// Service is Kubernetes service of Jenkins slave pods Defaults to : port: 50000 type: ClusterIP.
	SlaveService *JenkinsSpecSlaveService `field:"optional" json:"slaveService" yaml:"slaveService"`
}

