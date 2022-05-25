package mattermost_mattermostcom

import (
	"reflect"

	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

func init() {
	_jsii_.RegisterClass(
		"mattermost_mattermostcom.ClusterInstallation",
		reflect.TypeOf((*ClusterInstallation)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberMethod{JsiiMethod: "addDependency", GoMethod: "AddDependency"},
			_jsii_.MemberMethod{JsiiMethod: "addJsonPatch", GoMethod: "AddJsonPatch"},
			_jsii_.MemberProperty{JsiiProperty: "apiGroup", GoGetter: "ApiGroup"},
			_jsii_.MemberProperty{JsiiProperty: "apiVersion", GoGetter: "ApiVersion"},
			_jsii_.MemberProperty{JsiiProperty: "chart", GoGetter: "Chart"},
			_jsii_.MemberProperty{JsiiProperty: "kind", GoGetter: "Kind"},
			_jsii_.MemberProperty{JsiiProperty: "metadata", GoGetter: "Metadata"},
			_jsii_.MemberProperty{JsiiProperty: "name", GoGetter: "Name"},
			_jsii_.MemberProperty{JsiiProperty: "node", GoGetter: "Node"},
			_jsii_.MemberMethod{JsiiMethod: "toJson", GoMethod: "ToJson"},
			_jsii_.MemberMethod{JsiiMethod: "toString", GoMethod: "ToString"},
		},
		func() interface{} {
			j := jsiiProxy_ClusterInstallation{}
			_jsii_.InitJsiiProxy(&j.Type__cdk8sApiObject)
			return &j
		},
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationProps",
		reflect.TypeOf((*ClusterInstallationProps)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpec",
		reflect.TypeOf((*ClusterInstallationSpec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinity",
		reflect.TypeOf((*ClusterInstallationSpecAffinity)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityNodeAffinity",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinity)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAffinity",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinity)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinity",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinity)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecBlueGreen",
		reflect.TypeOf((*ClusterInstallationSpecBlueGreen)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecBlueGreenBlue",
		reflect.TypeOf((*ClusterInstallationSpecBlueGreenBlue)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecBlueGreenGreen",
		reflect.TypeOf((*ClusterInstallationSpecBlueGreenGreen)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecCanary",
		reflect.TypeOf((*ClusterInstallationSpecCanary)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecCanaryDeployment",
		reflect.TypeOf((*ClusterInstallationSpecCanaryDeployment)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecDatabase",
		reflect.TypeOf((*ClusterInstallationSpecDatabase)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecDatabaseResources",
		reflect.TypeOf((*ClusterInstallationSpecDatabaseResources)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecElasticSearch",
		reflect.TypeOf((*ClusterInstallationSpecElasticSearch)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbe",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbe)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbeExec",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeExec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbeHttpGet",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeHttpGet)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbeHttpGetPort",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeHttpGetPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ClusterInstallationSpecLivenessProbeHttpGetPort{}
		},
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbeTcpSocket",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeTcpSocket)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbeTcpSocketPort",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeTcpSocketPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ClusterInstallationSpecLivenessProbeTcpSocketPort{}
		},
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecMattermostEnv",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnv)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecMattermostEnvValueFrom",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnvValueFrom)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecMattermostEnvValueFromFieldRef",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnvValueFromFieldRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecMinio",
		reflect.TypeOf((*ClusterInstallationSpecMinio)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecMinioResources",
		reflect.TypeOf((*ClusterInstallationSpecMinioResources)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbe",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbe)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbeExec",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeExec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbeHttpGet",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeHttpGet)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbeHttpGetPort",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeHttpGetPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ClusterInstallationSpecReadinessProbeHttpGetPort{}
		},
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbeTcpSocket",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeTcpSocket)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbeTcpSocketPort",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeTcpSocketPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ClusterInstallationSpecReadinessProbeTcpSocketPort{}
		},
	)
	_jsii_.RegisterStruct(
		"mattermost_mattermostcom.ClusterInstallationSpecResources",
		reflect.TypeOf((*ClusterInstallationSpecResources)(nil)).Elem(),
	)
}
