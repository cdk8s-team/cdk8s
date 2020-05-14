package clusterinstallation;

import static java.util.Arrays.asList;

import java.util.List;
import software.amazon.jsii.JsiiModule;

public final class $Module extends JsiiModule {
    public $Module() {
        super("clusterinstallation", "0.0.0", $Module.class, "clusterinstallation@0.0.0.jsii.tgz");
    }

    @Override
    public List<Class<? extends JsiiModule>> getDependencies() {
        return asList(org.cdk8s.$Module.class, software.constructs.$Module.class);
    }

    @Override
    protected Class<?> resolveClass(final String fqn) throws ClassNotFoundException {
        switch (fqn) {
            case "clusterinstallation.ClusterInstallation": return clusterinstallation.ClusterInstallation.class;
            case "clusterinstallation.ClusterInstallationOptions": return clusterinstallation.ClusterInstallationOptions.class;
            case "clusterinstallation.ClusterInstallationSpec": return clusterinstallation.ClusterInstallationSpec.class;
            case "clusterinstallation.ClusterInstallationSpecAffinity": return clusterinstallation.ClusterInstallationSpecAffinity.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityNodeAffinity": return clusterinstallation.ClusterInstallationSpecAffinityNodeAffinity.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution": return clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference": return clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions": return clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields": return clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution": return clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms": return clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions": return clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields": return clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAffinity": return clusterinstallation.ClusterInstallationSpecAffinityPodAffinity.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution": return clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm": return clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector": return clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions": return clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution": return clusterinstallation.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector": return clusterinstallation.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions": return clusterinstallation.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinity": return clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinity.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution": return clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm": return clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector": return clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions": return clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution": return clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector": return clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector.class;
            case "clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions": return clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions.class;
            case "clusterinstallation.ClusterInstallationSpecBlueGreen": return clusterinstallation.ClusterInstallationSpecBlueGreen.class;
            case "clusterinstallation.ClusterInstallationSpecBlueGreenBlue": return clusterinstallation.ClusterInstallationSpecBlueGreenBlue.class;
            case "clusterinstallation.ClusterInstallationSpecBlueGreenGreen": return clusterinstallation.ClusterInstallationSpecBlueGreenGreen.class;
            case "clusterinstallation.ClusterInstallationSpecCanary": return clusterinstallation.ClusterInstallationSpecCanary.class;
            case "clusterinstallation.ClusterInstallationSpecCanaryDeployment": return clusterinstallation.ClusterInstallationSpecCanaryDeployment.class;
            case "clusterinstallation.ClusterInstallationSpecDatabase": return clusterinstallation.ClusterInstallationSpecDatabase.class;
            case "clusterinstallation.ClusterInstallationSpecDatabaseResources": return clusterinstallation.ClusterInstallationSpecDatabaseResources.class;
            case "clusterinstallation.ClusterInstallationSpecElasticSearch": return clusterinstallation.ClusterInstallationSpecElasticSearch.class;
            case "clusterinstallation.ClusterInstallationSpecLivenessProbe": return clusterinstallation.ClusterInstallationSpecLivenessProbe.class;
            case "clusterinstallation.ClusterInstallationSpecLivenessProbeExec": return clusterinstallation.ClusterInstallationSpecLivenessProbeExec.class;
            case "clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGet": return clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGet.class;
            case "clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders": return clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders.class;
            case "clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetPort": return clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetPort.class;
            case "clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocket": return clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocket.class;
            case "clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocketPort": return clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocketPort.class;
            case "clusterinstallation.ClusterInstallationSpecMattermostEnv": return clusterinstallation.ClusterInstallationSpecMattermostEnv.class;
            case "clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom": return clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom.class;
            case "clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef": return clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef.class;
            case "clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromFieldRef": return clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromFieldRef.class;
            case "clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef": return clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef.class;
            case "clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef": return clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef.class;
            case "clusterinstallation.ClusterInstallationSpecMinio": return clusterinstallation.ClusterInstallationSpecMinio.class;
            case "clusterinstallation.ClusterInstallationSpecMinioResources": return clusterinstallation.ClusterInstallationSpecMinioResources.class;
            case "clusterinstallation.ClusterInstallationSpecReadinessProbe": return clusterinstallation.ClusterInstallationSpecReadinessProbe.class;
            case "clusterinstallation.ClusterInstallationSpecReadinessProbeExec": return clusterinstallation.ClusterInstallationSpecReadinessProbeExec.class;
            case "clusterinstallation.ClusterInstallationSpecReadinessProbeHttpGet": return clusterinstallation.ClusterInstallationSpecReadinessProbeHttpGet.class;
            case "clusterinstallation.ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders": return clusterinstallation.ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders.class;
            case "clusterinstallation.ClusterInstallationSpecReadinessProbeHttpGetPort": return clusterinstallation.ClusterInstallationSpecReadinessProbeHttpGetPort.class;
            case "clusterinstallation.ClusterInstallationSpecReadinessProbeTcpSocket": return clusterinstallation.ClusterInstallationSpecReadinessProbeTcpSocket.class;
            case "clusterinstallation.ClusterInstallationSpecReadinessProbeTcpSocketPort": return clusterinstallation.ClusterInstallationSpecReadinessProbeTcpSocketPort.class;
            case "clusterinstallation.ClusterInstallationSpecResources": return clusterinstallation.ClusterInstallationSpecResources.class;
            default: throw new ClassNotFoundException("Unknown JSII type: " + fqn);
        }
    }
}
