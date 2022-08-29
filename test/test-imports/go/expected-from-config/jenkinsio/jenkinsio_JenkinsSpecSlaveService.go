// jenkinsio
package jenkinsio


// Service is Kubernetes service of Jenkins slave pods Defaults to : port: 50000 type: ClusterIP.
type JenkinsSpecSlaveService struct {
	// Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
	//
	// They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
	Annotations *map[string]*string `field:"optional" json:"annotations" yaml:"annotations"`
	// Route service traffic to pods with label keys and values matching this selector.
	//
	// If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
	Labels *map[string]*string `field:"optional" json:"labels" yaml:"labels"`
	// Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.
	//
	// This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
	LoadBalancerIp *string `field:"optional" json:"loadBalancerIp" yaml:"loadBalancerIp"`
	// If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.
	//
	// This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
	LoadBalancerSourceRanges *[]*string `field:"optional" json:"loadBalancerSourceRanges" yaml:"loadBalancerSourceRanges"`
	// The port on each node on which this service is exposed when type=NodePort or LoadBalancer.
	//
	// Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
	NodePort *float64 `field:"optional" json:"nodePort" yaml:"nodePort"`
	// The port that are exposed by this service.
	//
	// More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
	Port *float64 `field:"optional" json:"port" yaml:"port"`
	// Type determines how the Service is exposed.
	//
	// Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types
	Type *string `field:"optional" json:"type" yaml:"type"`
}

