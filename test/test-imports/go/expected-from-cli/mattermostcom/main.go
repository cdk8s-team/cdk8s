package mattermostcom

import (
	"reflect"

	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

func init() {
	_jsii_.RegisterClass(
		"mattermostcom.ClusterInstallation",
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
		"mattermostcom.ClusterInstallationProps",
		reflect.TypeOf((*ClusterInstallationProps)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpec",
		reflect.TypeOf((*ClusterInstallationSpec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinity",
		reflect.TypeOf((*ClusterInstallationSpecAffinity)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityNodeAffinity",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinity)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields",
		reflect.TypeOf((*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAffinity",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinity)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinity",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinity)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions",
		reflect.TypeOf((*ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecBlueGreen",
		reflect.TypeOf((*ClusterInstallationSpecBlueGreen)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecBlueGreenBlue",
		reflect.TypeOf((*ClusterInstallationSpecBlueGreenBlue)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecBlueGreenGreen",
		reflect.TypeOf((*ClusterInstallationSpecBlueGreenGreen)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecCanary",
		reflect.TypeOf((*ClusterInstallationSpecCanary)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecCanaryDeployment",
		reflect.TypeOf((*ClusterInstallationSpecCanaryDeployment)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecDatabase",
		reflect.TypeOf((*ClusterInstallationSpecDatabase)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecDatabaseResources",
		reflect.TypeOf((*ClusterInstallationSpecDatabaseResources)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecElasticSearch",
		reflect.TypeOf((*ClusterInstallationSpecElasticSearch)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecLivenessProbe",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbe)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecLivenessProbeExec",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeExec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecLivenessProbeHttpGet",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeHttpGet)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"mattermostcom.ClusterInstallationSpecLivenessProbeHttpGetPort",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeHttpGetPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ClusterInstallationSpecLivenessProbeHttpGetPort{}
		},
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecLivenessProbeTcpSocket",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeTcpSocket)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"mattermostcom.ClusterInstallationSpecLivenessProbeTcpSocketPort",
		reflect.TypeOf((*ClusterInstallationSpecLivenessProbeTcpSocketPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ClusterInstallationSpecLivenessProbeTcpSocketPort{}
		},
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecMattermostEnv",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnv)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecMattermostEnvValueFrom",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnvValueFrom)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecMattermostEnvValueFromFieldRef",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnvValueFromFieldRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef",
		reflect.TypeOf((*ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecMinio",
		reflect.TypeOf((*ClusterInstallationSpecMinio)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecMinioResources",
		reflect.TypeOf((*ClusterInstallationSpecMinioResources)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecReadinessProbe",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbe)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecReadinessProbeExec",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeExec)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecReadinessProbeHttpGet",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeHttpGet)(nil)).Elem(),
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"mattermostcom.ClusterInstallationSpecReadinessProbeHttpGetPort",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeHttpGetPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ClusterInstallationSpecReadinessProbeHttpGetPort{}
		},
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecReadinessProbeTcpSocket",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeTcpSocket)(nil)).Elem(),
	)
	_jsii_.RegisterClass(
		"mattermostcom.ClusterInstallationSpecReadinessProbeTcpSocketPort",
		reflect.TypeOf((*ClusterInstallationSpecReadinessProbeTcpSocketPort)(nil)).Elem(),
		[]_jsii_.Member{
			_jsii_.MemberProperty{JsiiProperty: "value", GoGetter: "Value"},
		},
		func() interface{} {
			return &jsiiProxy_ClusterInstallationSpecReadinessProbeTcpSocketPort{}
		},
	)
	_jsii_.RegisterStruct(
		"mattermostcom.ClusterInstallationSpecResources",
		reflect.TypeOf((*ClusterInstallationSpecResources)(nil)).Elem(),
	)
}
