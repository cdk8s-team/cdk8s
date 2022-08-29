// jenkinsio
package jenkinsio


// Master represents Jenkins master pod properties and Jenkins plugins.
//
// Every single change here requires a pod restart.
type JenkinsSpecMaster struct {
	// DisableCSRFProtection allows you to toggle CSRF Protection on Jenkins.
	DisableCsrfProtection *bool `field:"required" json:"disableCsrfProtection" yaml:"disableCsrfProtection"`
	// Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
	//
	// They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
	Annotations *map[string]*string `field:"optional" json:"annotations" yaml:"annotations"`
	// BasePlugins contains plugins required by operator Defaults to : - name: kubernetes version: 1.15.7 - name: workflow-job version: "2.32" - name: workflow-aggregator version: "2.6" - name: git version: 3.10.0 - name: job-dsl version: "1.74" - name: configuration-as-code version: "1.19" - name: configuration-as-code-support version: "1.19" - name: kubernetes-credentials-provider version: 0.12.1.
	BasePlugins *[]*JenkinsSpecMasterBasePlugins `field:"optional" json:"basePlugins" yaml:"basePlugins"`
	// List of containers belonging to the pod.
	//
	// Containers cannot currently be added or removed. There must be at least one container in a Pod. Defaults to: - image: jenkins/jenkins:lts   imagePullPolicy: Always   livenessProbe:     failureThreshold: 12     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 80     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 5   name: jenkins-master   readinessProbe:     failureThreshold: 3     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 30     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 1   resources:     limits:       cpu: 1500m       memory: 3Gi     requests:       cpu: "1"       memory: 600Mi
	Containers *[]*JenkinsSpecMasterContainers `field:"optional" json:"containers" yaml:"containers"`
	// ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec.
	//
	// If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
	ImagePullSecrets *[]*JenkinsSpecMasterImagePullSecrets `field:"optional" json:"imagePullSecrets" yaml:"imagePullSecrets"`
	// Map of string keys and values that can be used to organize and categorize (scope and select) objects.
	//
	// May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
	Labels *map[string]*string `field:"optional" json:"labels" yaml:"labels"`
	// Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
	//
	// They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations Deprecated: will be removed in the future, please use Annotations(annotations)
	MasterAnnotations *map[string]*string `field:"optional" json:"masterAnnotations" yaml:"masterAnnotations"`
	// NodeSelector is a selector which must be true for the pod to fit on a node.
	//
	// Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
	NodeSelector *map[string]*string `field:"optional" json:"nodeSelector" yaml:"nodeSelector"`
	// Plugins contains plugins required by user.
	Plugins *[]*JenkinsSpecMasterPlugins `field:"optional" json:"plugins" yaml:"plugins"`
	// SecurityContext that applies to all the containers of the Jenkins Master.
	//
	// As per kubernetes specification, it can be overridden for each container individually. Defaults to: runAsUser: 1000 fsGroup: 1000
	SecurityContext *JenkinsSpecMasterSecurityContext `field:"optional" json:"securityContext" yaml:"securityContext"`
	// If specified, the pod's tolerations.
	Tolerations *[]*JenkinsSpecMasterTolerations `field:"optional" json:"tolerations" yaml:"tolerations"`
	// List of volumes that can be mounted by containers belonging to the pod.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes
	Volumes *[]*JenkinsSpecMasterVolumes `field:"optional" json:"volumes" yaml:"volumes"`
}

