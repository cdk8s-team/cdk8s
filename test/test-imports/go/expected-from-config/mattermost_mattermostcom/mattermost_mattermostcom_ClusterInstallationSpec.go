// mattermost_mattermostcom
package mattermost_mattermostcom


// Specification of the desired behavior of the Mattermost cluster.
//
// More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
type ClusterInstallationSpec struct {
	// IngressName defines the name to be used when creating the ingress rules.
	IngressName *string `field:"required" json:"ingressName" yaml:"ingressName"`
	// If specified, affinity will define the pod's scheduling constraints.
	Affinity *ClusterInstallationSpecAffinity `field:"optional" json:"affinity" yaml:"affinity"`
	// BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.
	BlueGreen *ClusterInstallationSpecBlueGreen `field:"optional" json:"blueGreen" yaml:"blueGreen"`
	// Canary defines the configuration of Canary deployment for a ClusterInstallation.
	Canary *ClusterInstallationSpecCanary `field:"optional" json:"canary" yaml:"canary"`
	// Database defines the database configuration for a ClusterInstallation.
	Database *ClusterInstallationSpecDatabase `field:"optional" json:"database" yaml:"database"`
	// ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.
	ElasticSearch *ClusterInstallationSpecElasticSearch `field:"optional" json:"elasticSearch" yaml:"elasticSearch"`
	// Image defines the ClusterInstallation Docker image.
	Image *string `field:"optional" json:"image" yaml:"image"`
	IngressAnnotations *map[string]*string `field:"optional" json:"ingressAnnotations" yaml:"ingressAnnotations"`
	// Defines the probe to check if the application is up and running.
	LivenessProbe *ClusterInstallationSpecLivenessProbe `field:"optional" json:"livenessProbe" yaml:"livenessProbe"`
	// Optional environment variables to set in the Mattermost application pods.
	MattermostEnv *[]*ClusterInstallationSpecMattermostEnv `field:"optional" json:"mattermostEnv" yaml:"mattermostEnv"`
	// Secret that contains the mattermost license.
	MattermostLicenseSecret *string `field:"optional" json:"mattermostLicenseSecret" yaml:"mattermostLicenseSecret"`
	// Minio defines the configuration of Minio for a ClusterInstallation.
	Minio *ClusterInstallationSpecMinio `field:"optional" json:"minio" yaml:"minio"`
	// NodeSelector is a selector which must be true for the pod to fit on a node.
	//
	// Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
	NodeSelector *map[string]*string `field:"optional" json:"nodeSelector" yaml:"nodeSelector"`
	// Defines the probe to check if the application is ready to accept traffic.
	ReadinessProbe *ClusterInstallationSpecReadinessProbe `field:"optional" json:"readinessProbe" yaml:"readinessProbe"`
	// Replicas defines the number of replicas to use for the Mattermost app servers.
	//
	// Setting this will override the number of replicas set by 'Size'.
	Replicas *float64 `field:"optional" json:"replicas" yaml:"replicas"`
	// Defines the resource requests and limits for the Mattermost app server pods.
	Resources *ClusterInstallationSpecResources `field:"optional" json:"resources" yaml:"resources"`
	ServiceAnnotations *map[string]*string `field:"optional" json:"serviceAnnotations" yaml:"serviceAnnotations"`
	// Size defines the size of the ClusterInstallation.
	//
	// This is typically specified in number of users. This will set replica and resource requests/limits appropriately for the provided number of users. Accepted values are: 100users, 1000users, 5000users, 10000users, 250000users. Defaults to 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size.
	Size *string `field:"optional" json:"size" yaml:"size"`
	UseServiceLoadBalancer *bool `field:"optional" json:"useServiceLoadBalancer" yaml:"useServiceLoadBalancer"`
	// Version defines the ClusterInstallation Docker image version.
	Version *string `field:"optional" json:"version" yaml:"version"`
}

