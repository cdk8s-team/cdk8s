// mattermostcom
package mattermost_mattermostcom

import (
	_init_ "example.com/test/imports/mattermost_mattermostcom/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"

	"example.com/test/imports/mattermost_mattermostcom/internal"
	"github.com/aws/constructs-go/constructs/v3"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s"
)

// ClusterInstallation is the Schema for the clusterinstallations API.
type ClusterInstallation interface {
	cdk8s.ApiObject
	ApiGroup() *string
	ApiVersion() *string
	Chart() cdk8s.Chart
	Kind() *string
	Metadata() cdk8s.ApiObjectMetadataDefinition
	Name() *string
	AddDependency(dependencies ...constructs.IConstruct)
	AddJsonPatch(ops ...cdk8s.JsonPatch)
	OnPrepare()
	OnSynthesize(session constructs.ISynthesisSession)
	OnValidate() *[]*string
	ToJson() interface{}
	ToString() *string
}

// The jsii proxy struct for ClusterInstallation
type jsiiProxy_ClusterInstallation struct {
	internal.Type__cdk8sApiObject
}

func (j *jsiiProxy_ClusterInstallation) ApiGroup() *string {
	var returns *string
	_jsii_.Get(
		j,
		"apiGroup",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_ClusterInstallation) ApiVersion() *string {
	var returns *string
	_jsii_.Get(
		j,
		"apiVersion",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_ClusterInstallation) Chart() cdk8s.Chart {
	var returns cdk8s.Chart
	_jsii_.Get(
		j,
		"chart",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_ClusterInstallation) Kind() *string {
	var returns *string
	_jsii_.Get(
		j,
		"kind",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_ClusterInstallation) Metadata() cdk8s.ApiObjectMetadataDefinition {
	var returns cdk8s.ApiObjectMetadataDefinition
	_jsii_.Get(
		j,
		"metadata",
		&returns,
	)
	return returns
}

func (j *jsiiProxy_ClusterInstallation) Name() *string {
	var returns *string
	_jsii_.Get(
		j,
		"name",
		&returns,
	)
	return returns
}


// Defines a "ClusterInstallation" API object.
func NewClusterInstallation(scope constructs.Construct, id *string, props *ClusterInstallationProps) ClusterInstallation {
	_init_.Initialize()

	j := jsiiProxy_ClusterInstallation{}

	_jsii_.Create(
		"mattermostcom.ClusterInstallation",
		[]interface{}{scope, id, props},
		&j,
	)

	return &j
}

// Defines a "ClusterInstallation" API object.
func NewClusterInstallation_Override(c ClusterInstallation, scope constructs.Construct, id *string, props *ClusterInstallationProps) {
	_init_.Initialize()

	_jsii_.Create(
		"mattermostcom.ClusterInstallation",
		[]interface{}{scope, id, props},
		c,
	)
}

// Renders a Kubernetes manifest for "ClusterInstallation".
//
// This can be used to inline resource manifests inside other objects (e.g. as templates).
func ClusterInstallation_Manifest(props *ClusterInstallationProps) interface{} {
	_init_.Initialize()

	var returns interface{}

	_jsii_.StaticInvoke(
		"mattermostcom.ClusterInstallation",
		"manifest",
		[]interface{}{props},
		&returns,
	)

	return returns
}

// Returns the `ApiObject` named `Resource` which is a child of the given construct.
//
// If `c` is an `ApiObject`, it is returned directly. Throws an
// exception if the construct does not have a child named `Default` _or_ if
// this child is not an `ApiObject`.
func ClusterInstallation_Of(c constructs.IConstruct) cdk8s.ApiObject {
	_init_.Initialize()

	var returns cdk8s.ApiObject

	_jsii_.StaticInvoke(
		"mattermostcom.ClusterInstallation",
		"of",
		[]interface{}{c},
		&returns,
	)

	return returns
}

func ClusterInstallation_GVK() *cdk8s.GroupVersionKind {
	_init_.Initialize()
	var returns *cdk8s.GroupVersionKind
	_jsii_.StaticGet(
		"mattermostcom.ClusterInstallation",
		"GVK",
		&returns,
	)
	return returns
}

// Create a dependency between this ApiObject and other constructs.
//
// These can be other ApiObjects, Charts, or custom.
func (c *jsiiProxy_ClusterInstallation) AddDependency(dependencies ...constructs.IConstruct) {
	args := []interface{}{}
	for _, a := range dependencies {
		args = append(args, a)
	}

	_jsii_.InvokeVoid(
		c,
		"addDependency",
		args,
	)
}

// Applies a set of RFC-6902 JSON-Patch operations to the manifest synthesized for this API object.
//
// TODO: EXAMPLE
//
func (c *jsiiProxy_ClusterInstallation) AddJsonPatch(ops ...cdk8s.JsonPatch) {
	args := []interface{}{}
	for _, a := range ops {
		args = append(args, a)
	}

	_jsii_.InvokeVoid(
		c,
		"addJsonPatch",
		args,
	)
}

// Perform final modifications before synthesis.
//
// This method can be implemented by derived constructs in order to perform
// final changes before synthesis. prepare() will be called after child
// constructs have been prepared.
//
// This is an advanced framework feature. Only use this if you
// understand the implications.
func (c *jsiiProxy_ClusterInstallation) OnPrepare() {
	_jsii_.InvokeVoid(
		c,
		"onPrepare",
		nil, // no parameters
	)
}

// Allows this construct to emit artifacts into the cloud assembly during synthesis.
//
// This method is usually implemented by framework-level constructs such as `Stack` and `Asset`
// as they participate in synthesizing the cloud assembly.
func (c *jsiiProxy_ClusterInstallation) OnSynthesize(session constructs.ISynthesisSession) {
	_jsii_.InvokeVoid(
		c,
		"onSynthesize",
		[]interface{}{session},
	)
}

// Validate the current construct.
//
// This method can be implemented by derived constructs in order to perform
// validation logic. It is called on all constructs before synthesis.
//
// Returns: An array of validation error messages, or an empty array if there the construct is valid.
// Deprecated: use `Node.addValidation()` to subscribe validation functions on this construct
// instead of overriding this method.
func (c *jsiiProxy_ClusterInstallation) OnValidate() *[]*string {
	var returns *[]*string

	_jsii_.Invoke(
		c,
		"onValidate",
		nil, // no parameters
		&returns,
	)

	return returns
}

// Renders the object to Kubernetes JSON.
func (c *jsiiProxy_ClusterInstallation) ToJson() interface{} {
	var returns interface{}

	_jsii_.Invoke(
		c,
		"toJson",
		nil, // no parameters
		&returns,
	)

	return returns
}

// Returns a string representation of this construct.
func (c *jsiiProxy_ClusterInstallation) ToString() *string {
	var returns *string

	_jsii_.Invoke(
		c,
		"toString",
		nil, // no parameters
		&returns,
	)

	return returns
}

// ClusterInstallation is the Schema for the clusterinstallations API.
type ClusterInstallationProps struct {
	// Specification of the desired behavior of the Mattermost cluster.
	//
	// More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
	Spec *ClusterInstallationSpec `json:"spec"`
	Metadata *cdk8s.ApiObjectMetadata `json:"metadata"`
}

// Specification of the desired behavior of the Mattermost cluster.
//
// More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
type ClusterInstallationSpec struct {
	// IngressName defines the name to be used when creating the ingress rules.
	IngressName *string `json:"ingressName"`
	// If specified, affinity will define the pod's scheduling constraints.
	Affinity *ClusterInstallationSpecAffinity `json:"affinity"`
	// BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.
	BlueGreen *ClusterInstallationSpecBlueGreen `json:"blueGreen"`
	// Canary defines the configuration of Canary deployment for a ClusterInstallation.
	Canary *ClusterInstallationSpecCanary `json:"canary"`
	// Database defines the database configuration for a ClusterInstallation.
	Database *ClusterInstallationSpecDatabase `json:"database"`
	// ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.
	ElasticSearch *ClusterInstallationSpecElasticSearch `json:"elasticSearch"`
	// Image defines the ClusterInstallation Docker image.
	Image *string `json:"image"`
	IngressAnnotations *map[string]*string `json:"ingressAnnotations"`
	// Defines the probe to check if the application is up and running.
	LivenessProbe *ClusterInstallationSpecLivenessProbe `json:"livenessProbe"`
	// Optional environment variables to set in the Mattermost application pods.
	MattermostEnv *[]*ClusterInstallationSpecMattermostEnv `json:"mattermostEnv"`
	// Secret that contains the mattermost license.
	MattermostLicenseSecret *string `json:"mattermostLicenseSecret"`
	// Minio defines the configuration of Minio for a ClusterInstallation.
	Minio *ClusterInstallationSpecMinio `json:"minio"`
	// NodeSelector is a selector which must be true for the pod to fit on a node.
	//
	// Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
	NodeSelector *map[string]*string `json:"nodeSelector"`
	// Defines the probe to check if the application is ready to accept traffic.
	ReadinessProbe *ClusterInstallationSpecReadinessProbe `json:"readinessProbe"`
	// Replicas defines the number of replicas to use for the Mattermost app servers.
	//
	// Setting this will override the number of replicas set by 'Size'.
	Replicas *float64 `json:"replicas"`
	// Defines the resource requests and limits for the Mattermost app server pods.
	Resources *ClusterInstallationSpecResources `json:"resources"`
	ServiceAnnotations *map[string]*string `json:"serviceAnnotations"`
	// Size defines the size of the ClusterInstallation.
	//
	// This is typically specified in number of users. This will set replica and resource requests/limits appropriately for the provided number of users. Accepted values are: 100users, 1000users, 5000users, 10000users, 250000users. Defaults to 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size.
	Size *string `json:"size"`
	UseServiceLoadBalancer *bool `json:"useServiceLoadBalancer"`
	// Version defines the ClusterInstallation Docker image version.
	Version *string `json:"version"`
}

// If specified, affinity will define the pod's scheduling constraints.
type ClusterInstallationSpecAffinity struct {
	// Describes node affinity scheduling rules for the pod.
	NodeAffinity *ClusterInstallationSpecAffinityNodeAffinity `json:"nodeAffinity"`
	// Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
	PodAffinity *ClusterInstallationSpecAffinityPodAffinity `json:"podAffinity"`
	// Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
	PodAntiAffinity *ClusterInstallationSpecAffinityPodAntiAffinity `json:"podAntiAffinity"`
}

// Describes node affinity scheduling rules for the pod.
type ClusterInstallationSpecAffinityNodeAffinity struct {
	// The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
	//
	// The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
	PreferredDuringSchedulingIgnoredDuringExecution *[]*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution `json:"preferredDuringSchedulingIgnoredDuringExecution"`
	// If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.
	//
	// If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
	RequiredDuringSchedulingIgnoredDuringExecution *ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution `json:"requiredDuringSchedulingIgnoredDuringExecution"`
}

// An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
type ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution struct {
	// A node selector term, associated with the corresponding weight.
	Preference *ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference `json:"preference"`
	// Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
	Weight *float64 `json:"weight"`
}

// A node selector term, associated with the corresponding weight.
type ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference struct {
	// A list of node selector requirements by node's labels.
	MatchExpressions *[]*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions `json:"matchExpressions"`
	// A list of node selector requirements by node's fields.
	MatchFields *[]*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields `json:"matchFields"`
}

// A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
type ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions struct {
	// The label key that the selector applies to.
	Key *string `json:"key"`
	// Represents a key's relationship to a set of values.
	//
	// Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
	Operator *string `json:"operator"`
	// An array of string values.
	//
	// If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.
	Values *[]*string `json:"values"`
}

// A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
type ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields struct {
	// The label key that the selector applies to.
	Key *string `json:"key"`
	// Represents a key's relationship to a set of values.
	//
	// Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
	Operator *string `json:"operator"`
	// An array of string values.
	//
	// If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.
	Values *[]*string `json:"values"`
}

// If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.
//
// If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
type ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution struct {
	// Required.
	//
	// A list of node selector terms. The terms are ORed.
	NodeSelectorTerms *[]*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms `json:"nodeSelectorTerms"`
}

// A null or empty node selector term matches no objects.
//
// The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
type ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms struct {
	// A list of node selector requirements by node's labels.
	MatchExpressions *[]*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions `json:"matchExpressions"`
	// A list of node selector requirements by node's fields.
	MatchFields *[]*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields `json:"matchFields"`
}

// A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
type ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions struct {
	// The label key that the selector applies to.
	Key *string `json:"key"`
	// Represents a key's relationship to a set of values.
	//
	// Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
	Operator *string `json:"operator"`
	// An array of string values.
	//
	// If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.
	Values *[]*string `json:"values"`
}

// A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
type ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields struct {
	// The label key that the selector applies to.
	Key *string `json:"key"`
	// Represents a key's relationship to a set of values.
	//
	// Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
	Operator *string `json:"operator"`
	// An array of string values.
	//
	// If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.
	Values *[]*string `json:"values"`
}

// Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
type ClusterInstallationSpecAffinityPodAffinity struct {
	// The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
	//
	// The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
	PreferredDuringSchedulingIgnoredDuringExecution *[]*ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution `json:"preferredDuringSchedulingIgnoredDuringExecution"`
	// If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.
	//
	// If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
	RequiredDuringSchedulingIgnoredDuringExecution *[]*ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution `json:"requiredDuringSchedulingIgnoredDuringExecution"`
}

// The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s).
type ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution struct {
	// Required.
	//
	// A pod affinity term, associated with the corresponding weight.
	PodAffinityTerm *ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm `json:"podAffinityTerm"`
	// weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
	Weight *float64 `json:"weight"`
}

// Required.
//
// A pod affinity term, associated with the corresponding weight.
type ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm struct {
	// This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.
	//
	// Empty topologyKey is not allowed.
	TopologyKey *string `json:"topologyKey"`
	// A label query over a set of resources, in this case pods.
	LabelSelector *ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector `json:"labelSelector"`
	// namespaces specifies which namespaces the labelSelector applies to (matches against);
	//
	// null or empty list means "this pod's namespace"
	Namespaces *[]*string `json:"namespaces"`
}

// A label query over a set of resources, in this case pods.
type ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector struct {
	// matchExpressions is a list of label selector requirements.
	//
	// The requirements are ANDed.
	MatchExpressions *[]*ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions `json:"matchExpressions"`
	// matchLabels is a map of {key,value} pairs.
	//
	// A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
	MatchLabels *map[string]*string `json:"matchLabels"`
}

// A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
type ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions struct {
	// key is the label key that the selector applies to.
	Key *string `json:"key"`
	// operator represents a key's relationship to a set of values.
	//
	// Valid operators are In, NotIn, Exists and DoesNotExist.
	Operator *string `json:"operator"`
	// values is an array of string values.
	//
	// If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
	Values *[]*string `json:"values"`
}

// Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running.
type ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution struct {
	// This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.
	//
	// Empty topologyKey is not allowed.
	TopologyKey *string `json:"topologyKey"`
	// A label query over a set of resources, in this case pods.
	LabelSelector *ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector `json:"labelSelector"`
	// namespaces specifies which namespaces the labelSelector applies to (matches against);
	//
	// null or empty list means "this pod's namespace"
	Namespaces *[]*string `json:"namespaces"`
}

// A label query over a set of resources, in this case pods.
type ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector struct {
	// matchExpressions is a list of label selector requirements.
	//
	// The requirements are ANDed.
	MatchExpressions *[]*ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions `json:"matchExpressions"`
	// matchLabels is a map of {key,value} pairs.
	//
	// A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
	MatchLabels *map[string]*string `json:"matchLabels"`
}

// A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
type ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions struct {
	// key is the label key that the selector applies to.
	Key *string `json:"key"`
	// operator represents a key's relationship to a set of values.
	//
	// Valid operators are In, NotIn, Exists and DoesNotExist.
	Operator *string `json:"operator"`
	// values is an array of string values.
	//
	// If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
	Values *[]*string `json:"values"`
}

// Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
type ClusterInstallationSpecAffinityPodAntiAffinity struct {
	// The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
	//
	// The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
	PreferredDuringSchedulingIgnoredDuringExecution *[]*ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution `json:"preferredDuringSchedulingIgnoredDuringExecution"`
	// If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.
	//
	// If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
	RequiredDuringSchedulingIgnoredDuringExecution *[]*ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution `json:"requiredDuringSchedulingIgnoredDuringExecution"`
}

// The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s).
type ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution struct {
	// Required.
	//
	// A pod affinity term, associated with the corresponding weight.
	PodAffinityTerm *ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm `json:"podAffinityTerm"`
	// weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
	Weight *float64 `json:"weight"`
}

// Required.
//
// A pod affinity term, associated with the corresponding weight.
type ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm struct {
	// This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.
	//
	// Empty topologyKey is not allowed.
	TopologyKey *string `json:"topologyKey"`
	// A label query over a set of resources, in this case pods.
	LabelSelector *ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector `json:"labelSelector"`
	// namespaces specifies which namespaces the labelSelector applies to (matches against);
	//
	// null or empty list means "this pod's namespace"
	Namespaces *[]*string `json:"namespaces"`
}

// A label query over a set of resources, in this case pods.
type ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector struct {
	// matchExpressions is a list of label selector requirements.
	//
	// The requirements are ANDed.
	MatchExpressions *[]*ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions `json:"matchExpressions"`
	// matchLabels is a map of {key,value} pairs.
	//
	// A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
	MatchLabels *map[string]*string `json:"matchLabels"`
}

// A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
type ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions struct {
	// key is the label key that the selector applies to.
	Key *string `json:"key"`
	// operator represents a key's relationship to a set of values.
	//
	// Valid operators are In, NotIn, Exists and DoesNotExist.
	Operator *string `json:"operator"`
	// values is an array of string values.
	//
	// If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
	Values *[]*string `json:"values"`
}

// Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running.
type ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution struct {
	// This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.
	//
	// Empty topologyKey is not allowed.
	TopologyKey *string `json:"topologyKey"`
	// A label query over a set of resources, in this case pods.
	LabelSelector *ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector `json:"labelSelector"`
	// namespaces specifies which namespaces the labelSelector applies to (matches against);
	//
	// null or empty list means "this pod's namespace"
	Namespaces *[]*string `json:"namespaces"`
}

// A label query over a set of resources, in this case pods.
type ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector struct {
	// matchExpressions is a list of label selector requirements.
	//
	// The requirements are ANDed.
	MatchExpressions *[]*ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions `json:"matchExpressions"`
	// matchLabels is a map of {key,value} pairs.
	//
	// A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
	MatchLabels *map[string]*string `json:"matchLabels"`
}

// A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
type ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions struct {
	// key is the label key that the selector applies to.
	Key *string `json:"key"`
	// operator represents a key's relationship to a set of values.
	//
	// Valid operators are In, NotIn, Exists and DoesNotExist.
	Operator *string `json:"operator"`
	// values is an array of string values.
	//
	// If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
	Values *[]*string `json:"values"`
}

// BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.
type ClusterInstallationSpecBlueGreen struct {
	// Blue defines the blue deployment.
	Blue *ClusterInstallationSpecBlueGreenBlue `json:"blue"`
	// Enable defines if BlueGreen deployment will be applied.
	Enable *bool `json:"enable"`
	// Green defines the green deployment.
	Green *ClusterInstallationSpecBlueGreenGreen `json:"green"`
	// ProductionDeployment defines if the current production is blue or green.
	ProductionDeployment *string `json:"productionDeployment"`
}

// Blue defines the blue deployment.
type ClusterInstallationSpecBlueGreenBlue struct {
	// Image defines the base Docker image that will be used for the deployment.
	//
	// Required when BlueGreen or Canary is enabled.
	Image *string `json:"image"`
	// IngressName defines the ingress name that will be used by the deployment.
	//
	// This option is not used for Canary builds.
	IngressName *string `json:"ingressName"`
	// Name defines the name of the deployment.
	Name *string `json:"name"`
	// Version defines the Docker image version that will be used for the deployment.
	//
	// Required when BlueGreen or Canary is enabled.
	Version *string `json:"version"`
}

// Green defines the green deployment.
type ClusterInstallationSpecBlueGreenGreen struct {
	// Image defines the base Docker image that will be used for the deployment.
	//
	// Required when BlueGreen or Canary is enabled.
	Image *string `json:"image"`
	// IngressName defines the ingress name that will be used by the deployment.
	//
	// This option is not used for Canary builds.
	IngressName *string `json:"ingressName"`
	// Name defines the name of the deployment.
	Name *string `json:"name"`
	// Version defines the Docker image version that will be used for the deployment.
	//
	// Required when BlueGreen or Canary is enabled.
	Version *string `json:"version"`
}

// Canary defines the configuration of Canary deployment for a ClusterInstallation.
type ClusterInstallationSpecCanary struct {
	// Deployment defines the canary deployment.
	Deployment *ClusterInstallationSpecCanaryDeployment `json:"deployment"`
	// Enable defines if a canary build will be deployed.
	Enable *bool `json:"enable"`
}

// Deployment defines the canary deployment.
type ClusterInstallationSpecCanaryDeployment struct {
	// Image defines the base Docker image that will be used for the deployment.
	//
	// Required when BlueGreen or Canary is enabled.
	Image *string `json:"image"`
	// IngressName defines the ingress name that will be used by the deployment.
	//
	// This option is not used for Canary builds.
	IngressName *string `json:"ingressName"`
	// Name defines the name of the deployment.
	Name *string `json:"name"`
	// Version defines the Docker image version that will be used for the deployment.
	//
	// Required when BlueGreen or Canary is enabled.
	Version *string `json:"version"`
}

// Database defines the database configuration for a ClusterInstallation.
type ClusterInstallationSpecDatabase struct {
	// Defines the backup retention policy.
	BackupRemoteDeletePolicy *string `json:"backupRemoteDeletePolicy"`
	// Defines the secret to be used when performing a database restore.
	BackupRestoreSecretName *string `json:"backupRestoreSecretName"`
	// Defines the interval for backups in cron expression format.
	BackupSchedule *string `json:"backupSchedule"`
	// Defines the secret to be used for uploading/restoring backup.
	BackupSecretName *string `json:"backupSecretName"`
	// Defines the object storage url for uploading backups.
	BackupUrl *string `json:"backupUrl"`
	// Defines the AWS S3 bucket where the Database Backup is stored.
	//
	// The operator will download the file to restore the data.
	InitBucketUrl *string `json:"initBucketUrl"`
	// Defines the number of database replicas.
	//
	// For redundancy use at least 2 replicas. Setting this will override the number of replicas set by 'Size'.
	Replicas *float64 `json:"replicas"`
	// Defines the resource requests and limits for the database pods.
	Resources *ClusterInstallationSpecDatabaseResources `json:"resources"`
	// Optionally enter the name of an already-existing Secret for connecting to the database.
	//
	// This secret should be configured as follows:
	// User-Managed Database   - Key: DB_CONNECTION_STRING | Value: <FULL_DATABASE_CONNECTION_STRING> Operator-Managed Database   - Key: ROOT_PASSWORD | Value: <ROOT_DATABASE_PASSWORD>   - Key: USER | Value: <USER_NAME>   - Key: PASSWORD | Value: <USER_PASSWORD>   - Key: DATABASE Value: <DATABASE_NAME>
	// Notes:   If you define all secret values for both User-Managed and   Operator-Managed database types, the User-Managed connection string will   take precedence and the Operator-Managed values will be ignored. If the   secret is left blank, the default behavior is to use an Operator-Managed   database with strong randomly-generated database credentials.
	Secret *string `json:"secret"`
	// Defines the storage size for the database.
	//
	// ie 50Gi
	StorageSize *string `json:"storageSize"`
	Type *string `json:"type"`
}

// Defines the resource requests and limits for the database pods.
type ClusterInstallationSpecDatabaseResources struct {
	// Limits describes the maximum amount of compute resources allowed.
	//
	// More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Limits *map[string]*string `json:"limits"`
	// Requests describes the minimum amount of compute resources required.
	//
	// If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Requests *map[string]*string `json:"requests"`
}

// ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.
type ClusterInstallationSpecElasticSearch struct {
	Host *string `json:"host"`
	Password *string `json:"password"`
	Username *string `json:"username"`
}

// Defines the probe to check if the application is up and running.
type ClusterInstallationSpecLivenessProbe struct {
	// One and only one of the following should be specified.
	//
	// Exec specifies the action to take.
	Exec *ClusterInstallationSpecLivenessProbeExec `json:"exec"`
	// Minimum consecutive failures for the probe to be considered failed after having succeeded.
	//
	// Defaults to 3. Minimum value is 1.
	FailureThreshold *float64 `json:"failureThreshold"`
	// HTTPGet specifies the http request to perform.
	HttpGet *ClusterInstallationSpecLivenessProbeHttpGet `json:"httpGet"`
	// Number of seconds after the container has started before liveness probes are initiated.
	//
	// More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
	InitialDelaySeconds *float64 `json:"initialDelaySeconds"`
	// How often (in seconds) to perform the probe.
	//
	// Default to 10 seconds. Minimum value is 1.
	PeriodSeconds *float64 `json:"periodSeconds"`
	// Minimum consecutive successes for the probe to be considered successful after having failed.
	//
	// Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
	SuccessThreshold *float64 `json:"successThreshold"`
	// TCPSocket specifies an action involving a TCP port.
	//
	// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
	TcpSocket *ClusterInstallationSpecLivenessProbeTcpSocket `json:"tcpSocket"`
	// Number of seconds after which the probe times out.
	//
	// Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
	TimeoutSeconds *float64 `json:"timeoutSeconds"`
}

// One and only one of the following should be specified.
//
// Exec specifies the action to take.
type ClusterInstallationSpecLivenessProbeExec struct {
	// Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.
	//
	// The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
	Command *[]*string `json:"command"`
}

// HTTPGet specifies the http request to perform.
type ClusterInstallationSpecLivenessProbeHttpGet struct {
	// Name or number of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port ClusterInstallationSpecLivenessProbeHttpGetPort `json:"port"`
	// Host name to connect to, defaults to the pod IP.
	//
	// You probably want to set "Host" in httpHeaders instead.
	Host *string `json:"host"`
	// Custom headers to set in the request.
	//
	// HTTP allows repeated headers.
	HttpHeaders *[]*ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders `json:"httpHeaders"`
	// Path to access on the HTTP server.
	Path *string `json:"path"`
	// Scheme to use for connecting to the host.
	//
	// Defaults to HTTP.
	Scheme *string `json:"scheme"`
}

// HTTPHeader describes a custom header to be used in HTTP probes.
type ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders struct {
	// The header field name.
	Name *string `json:"name"`
	// The header field value.
	Value *string `json:"value"`
}

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type ClusterInstallationSpecLivenessProbeHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for ClusterInstallationSpecLivenessProbeHttpGetPort
type jsiiProxy_ClusterInstallationSpecLivenessProbeHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_ClusterInstallationSpecLivenessProbeHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ClusterInstallationSpecLivenessProbeHttpGetPort_FromNumber(value *float64) ClusterInstallationSpecLivenessProbeHttpGetPort {
	_init_.Initialize()

	var returns ClusterInstallationSpecLivenessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"mattermostcom.ClusterInstallationSpecLivenessProbeHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ClusterInstallationSpecLivenessProbeHttpGetPort_FromString(value *string) ClusterInstallationSpecLivenessProbeHttpGetPort {
	_init_.Initialize()

	var returns ClusterInstallationSpecLivenessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"mattermostcom.ClusterInstallationSpecLivenessProbeHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// TCPSocket specifies an action involving a TCP port.
//
// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
type ClusterInstallationSpecLivenessProbeTcpSocket struct {
	// Number or name of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port ClusterInstallationSpecLivenessProbeTcpSocketPort `json:"port"`
	// Optional: Host name to connect to, defaults to the pod IP.
	Host *string `json:"host"`
}

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type ClusterInstallationSpecLivenessProbeTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for ClusterInstallationSpecLivenessProbeTcpSocketPort
type jsiiProxy_ClusterInstallationSpecLivenessProbeTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_ClusterInstallationSpecLivenessProbeTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ClusterInstallationSpecLivenessProbeTcpSocketPort_FromNumber(value *float64) ClusterInstallationSpecLivenessProbeTcpSocketPort {
	_init_.Initialize()

	var returns ClusterInstallationSpecLivenessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"mattermostcom.ClusterInstallationSpecLivenessProbeTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ClusterInstallationSpecLivenessProbeTcpSocketPort_FromString(value *string) ClusterInstallationSpecLivenessProbeTcpSocketPort {
	_init_.Initialize()

	var returns ClusterInstallationSpecLivenessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"mattermostcom.ClusterInstallationSpecLivenessProbeTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// EnvVar represents an environment variable present in a Container.
type ClusterInstallationSpecMattermostEnv struct {
	// Name of the environment variable.
	//
	// Must be a C_IDENTIFIER.
	Name *string `json:"name"`
	// Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.
	//
	// If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
	Value *string `json:"value"`
	// Source for the environment variable's value.
	//
	// Cannot be used if value is not empty.
	ValueFrom *ClusterInstallationSpecMattermostEnvValueFrom `json:"valueFrom"`
}

// Source for the environment variable's value.
//
// Cannot be used if value is not empty.
type ClusterInstallationSpecMattermostEnvValueFrom struct {
	// Selects a key of a ConfigMap.
	ConfigMapKeyRef *ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef `json:"configMapKeyRef"`
	// Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
	FieldRef *ClusterInstallationSpecMattermostEnvValueFromFieldRef `json:"fieldRef"`
	// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
	ResourceFieldRef *ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef `json:"resourceFieldRef"`
	// Selects a key of a secret in the pod's namespace.
	SecretKeyRef *ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef `json:"secretKeyRef"`
}

// Selects a key of a ConfigMap.
type ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef struct {
	// The key to select.
	Key *string `json:"key"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
	// Specify whether the ConfigMap or its key must be defined.
	Optional *bool `json:"optional"`
}

// Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
type ClusterInstallationSpecMattermostEnvValueFromFieldRef struct {
	// Path of the field to select in the specified API version.
	FieldPath *string `json:"fieldPath"`
	// Version of the schema the FieldPath is written in terms of, defaults to "v1".
	ApiVersion *string `json:"apiVersion"`
}

// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
type ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef struct {
	// Required: resource to select.
	Resource *string `json:"resource"`
	// Container name: required for volumes, optional for env vars.
	ContainerName *string `json:"containerName"`
	// Specifies the output format of the exposed resources, defaults to "1".
	Divisor *string `json:"divisor"`
}

// Selects a key of a secret in the pod's namespace.
type ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef struct {
	// The key of the secret to select from.
	//
	// Must be a valid secret key.
	Key *string `json:"key"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `json:"name"`
	// Specify whether the Secret or its key must be defined.
	Optional *bool `json:"optional"`
}

// Minio defines the configuration of Minio for a ClusterInstallation.
type ClusterInstallationSpecMinio struct {
	// Set to the bucket name of your external MinIO or S3.
	ExternalBucket *string `json:"externalBucket"`
	// Set to use an external MinIO deployment or S3.
	//
	// Must also set 'Secret' and 'ExternalBucket'.
	ExternalUrl *string `json:"externalUrl"`
	// Defines the number of Minio replicas.
	//
	// Supply 1 to run Minio in standalone mode with no redundancy. Supply 4 or more to run Minio in distributed mode. Note that it is not possible to upgrade Minio from standalone to distributed mode. Setting this will override the number of replicas set by 'Size'. More info: https://docs.min.io/docs/distributed-minio-quickstart-guide.html
	Replicas *float64 `json:"replicas"`
	// Defines the resource requests and limits for the Minio pods.
	Resources *ClusterInstallationSpecMinioResources `json:"resources"`
	// Optionally enter the name of already existing secret.
	//
	// Secret should have two values: "accesskey" and "secretkey". Required when "ExternalURL" is set.
	Secret *string `json:"secret"`
	// Defines the storage size for Minio.
	//
	// ie 50Gi
	StorageSize *string `json:"storageSize"`
}

// Defines the resource requests and limits for the Minio pods.
type ClusterInstallationSpecMinioResources struct {
	// Limits describes the maximum amount of compute resources allowed.
	//
	// More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Limits *map[string]*string `json:"limits"`
	// Requests describes the minimum amount of compute resources required.
	//
	// If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Requests *map[string]*string `json:"requests"`
}

// Defines the probe to check if the application is ready to accept traffic.
type ClusterInstallationSpecReadinessProbe struct {
	// One and only one of the following should be specified.
	//
	// Exec specifies the action to take.
	Exec *ClusterInstallationSpecReadinessProbeExec `json:"exec"`
	// Minimum consecutive failures for the probe to be considered failed after having succeeded.
	//
	// Defaults to 3. Minimum value is 1.
	FailureThreshold *float64 `json:"failureThreshold"`
	// HTTPGet specifies the http request to perform.
	HttpGet *ClusterInstallationSpecReadinessProbeHttpGet `json:"httpGet"`
	// Number of seconds after the container has started before liveness probes are initiated.
	//
	// More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
	InitialDelaySeconds *float64 `json:"initialDelaySeconds"`
	// How often (in seconds) to perform the probe.
	//
	// Default to 10 seconds. Minimum value is 1.
	PeriodSeconds *float64 `json:"periodSeconds"`
	// Minimum consecutive successes for the probe to be considered successful after having failed.
	//
	// Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
	SuccessThreshold *float64 `json:"successThreshold"`
	// TCPSocket specifies an action involving a TCP port.
	//
	// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
	TcpSocket *ClusterInstallationSpecReadinessProbeTcpSocket `json:"tcpSocket"`
	// Number of seconds after which the probe times out.
	//
	// Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
	TimeoutSeconds *float64 `json:"timeoutSeconds"`
}

// One and only one of the following should be specified.
//
// Exec specifies the action to take.
type ClusterInstallationSpecReadinessProbeExec struct {
	// Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.
	//
	// The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
	Command *[]*string `json:"command"`
}

// HTTPGet specifies the http request to perform.
type ClusterInstallationSpecReadinessProbeHttpGet struct {
	// Name or number of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port ClusterInstallationSpecReadinessProbeHttpGetPort `json:"port"`
	// Host name to connect to, defaults to the pod IP.
	//
	// You probably want to set "Host" in httpHeaders instead.
	Host *string `json:"host"`
	// Custom headers to set in the request.
	//
	// HTTP allows repeated headers.
	HttpHeaders *[]*ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders `json:"httpHeaders"`
	// Path to access on the HTTP server.
	Path *string `json:"path"`
	// Scheme to use for connecting to the host.
	//
	// Defaults to HTTP.
	Scheme *string `json:"scheme"`
}

// HTTPHeader describes a custom header to be used in HTTP probes.
type ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders struct {
	// The header field name.
	Name *string `json:"name"`
	// The header field value.
	Value *string `json:"value"`
}

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type ClusterInstallationSpecReadinessProbeHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for ClusterInstallationSpecReadinessProbeHttpGetPort
type jsiiProxy_ClusterInstallationSpecReadinessProbeHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_ClusterInstallationSpecReadinessProbeHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ClusterInstallationSpecReadinessProbeHttpGetPort_FromNumber(value *float64) ClusterInstallationSpecReadinessProbeHttpGetPort {
	_init_.Initialize()

	var returns ClusterInstallationSpecReadinessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"mattermostcom.ClusterInstallationSpecReadinessProbeHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ClusterInstallationSpecReadinessProbeHttpGetPort_FromString(value *string) ClusterInstallationSpecReadinessProbeHttpGetPort {
	_init_.Initialize()

	var returns ClusterInstallationSpecReadinessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"mattermostcom.ClusterInstallationSpecReadinessProbeHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// TCPSocket specifies an action involving a TCP port.
//
// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
type ClusterInstallationSpecReadinessProbeTcpSocket struct {
	// Number or name of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port ClusterInstallationSpecReadinessProbeTcpSocketPort `json:"port"`
	// Optional: Host name to connect to, defaults to the pod IP.
	Host *string `json:"host"`
}

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type ClusterInstallationSpecReadinessProbeTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for ClusterInstallationSpecReadinessProbeTcpSocketPort
type jsiiProxy_ClusterInstallationSpecReadinessProbeTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_ClusterInstallationSpecReadinessProbeTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ClusterInstallationSpecReadinessProbeTcpSocketPort_FromNumber(value *float64) ClusterInstallationSpecReadinessProbeTcpSocketPort {
	_init_.Initialize()

	var returns ClusterInstallationSpecReadinessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"mattermostcom.ClusterInstallationSpecReadinessProbeTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ClusterInstallationSpecReadinessProbeTcpSocketPort_FromString(value *string) ClusterInstallationSpecReadinessProbeTcpSocketPort {
	_init_.Initialize()

	var returns ClusterInstallationSpecReadinessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"mattermostcom.ClusterInstallationSpecReadinessProbeTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

// Defines the resource requests and limits for the Mattermost app server pods.
type ClusterInstallationSpecResources struct {
	// Limits describes the maximum amount of compute resources allowed.
	//
	// More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Limits *map[string]*string `json:"limits"`
	// Requests describes the minimum amount of compute resources required.
	//
	// If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Requests *map[string]*string `json:"requests"`
}

