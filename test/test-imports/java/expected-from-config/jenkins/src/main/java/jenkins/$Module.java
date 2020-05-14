package jenkins;

import static java.util.Arrays.asList;

import java.util.List;
import software.amazon.jsii.JsiiModule;

public final class $Module extends JsiiModule {
    public $Module() {
        super("jenkins", "0.0.0", $Module.class, "jenkins@0.0.0.jsii.tgz");
    }

    @Override
    public List<Class<? extends JsiiModule>> getDependencies() {
        return asList(org.cdk8s.$Module.class, software.constructs.$Module.class);
    }

    @Override
    protected Class<?> resolveClass(final String fqn) throws ClassNotFoundException {
        switch (fqn) {
            case "jenkins.Jenkins": return jenkins.Jenkins.class;
            case "jenkins.JenkinsOptions": return jenkins.JenkinsOptions.class;
            case "jenkins.JenkinsSpec": return jenkins.JenkinsSpec.class;
            case "jenkins.JenkinsSpecBackup": return jenkins.JenkinsSpecBackup.class;
            case "jenkins.JenkinsSpecBackupAction": return jenkins.JenkinsSpecBackupAction.class;
            case "jenkins.JenkinsSpecBackupActionExec": return jenkins.JenkinsSpecBackupActionExec.class;
            case "jenkins.JenkinsSpecConfigurationAsCode": return jenkins.JenkinsSpecConfigurationAsCode.class;
            case "jenkins.JenkinsSpecConfigurationAsCodeConfigurations": return jenkins.JenkinsSpecConfigurationAsCodeConfigurations.class;
            case "jenkins.JenkinsSpecConfigurationAsCodeSecret": return jenkins.JenkinsSpecConfigurationAsCodeSecret.class;
            case "jenkins.JenkinsSpecGroovyScripts": return jenkins.JenkinsSpecGroovyScripts.class;
            case "jenkins.JenkinsSpecGroovyScriptsConfigurations": return jenkins.JenkinsSpecGroovyScriptsConfigurations.class;
            case "jenkins.JenkinsSpecGroovyScriptsSecret": return jenkins.JenkinsSpecGroovyScriptsSecret.class;
            case "jenkins.JenkinsSpecJenkinsApiSettings": return jenkins.JenkinsSpecJenkinsApiSettings.class;
            case "jenkins.JenkinsSpecMaster": return jenkins.JenkinsSpecMaster.class;
            case "jenkins.JenkinsSpecMasterBasePlugins": return jenkins.JenkinsSpecMasterBasePlugins.class;
            case "jenkins.JenkinsSpecMasterContainers": return jenkins.JenkinsSpecMasterContainers.class;
            case "jenkins.JenkinsSpecMasterContainersEnv": return jenkins.JenkinsSpecMasterContainersEnv.class;
            case "jenkins.JenkinsSpecMasterContainersEnvFrom": return jenkins.JenkinsSpecMasterContainersEnvFrom.class;
            case "jenkins.JenkinsSpecMasterContainersEnvFromConfigMapRef": return jenkins.JenkinsSpecMasterContainersEnvFromConfigMapRef.class;
            case "jenkins.JenkinsSpecMasterContainersEnvFromSecretRef": return jenkins.JenkinsSpecMasterContainersEnvFromSecretRef.class;
            case "jenkins.JenkinsSpecMasterContainersEnvValueFrom": return jenkins.JenkinsSpecMasterContainersEnvValueFrom.class;
            case "jenkins.JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef": return jenkins.JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef.class;
            case "jenkins.JenkinsSpecMasterContainersEnvValueFromFieldRef": return jenkins.JenkinsSpecMasterContainersEnvValueFromFieldRef.class;
            case "jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef": return jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef.class;
            case "jenkins.JenkinsSpecMasterContainersEnvValueFromSecretKeyRef": return jenkins.JenkinsSpecMasterContainersEnvValueFromSecretKeyRef.class;
            case "jenkins.JenkinsSpecMasterContainersLifecycle": return jenkins.JenkinsSpecMasterContainersLifecycle.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePostStart": return jenkins.JenkinsSpecMasterContainersLifecyclePostStart.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePostStartExec": return jenkins.JenkinsSpecMasterContainersLifecyclePostStartExec.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGet": return jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGet.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders": return jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort": return jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocket": return jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocket.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort": return jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePreStop": return jenkins.JenkinsSpecMasterContainersLifecyclePreStop.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePreStopExec": return jenkins.JenkinsSpecMasterContainersLifecyclePreStopExec.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGet": return jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGet.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders": return jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort": return jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket": return jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket.class;
            case "jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort": return jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort.class;
            case "jenkins.JenkinsSpecMasterContainersLivenessProbe": return jenkins.JenkinsSpecMasterContainersLivenessProbe.class;
            case "jenkins.JenkinsSpecMasterContainersLivenessProbeExec": return jenkins.JenkinsSpecMasterContainersLivenessProbeExec.class;
            case "jenkins.JenkinsSpecMasterContainersLivenessProbeHttpGet": return jenkins.JenkinsSpecMasterContainersLivenessProbeHttpGet.class;
            case "jenkins.JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders": return jenkins.JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders.class;
            case "jenkins.JenkinsSpecMasterContainersLivenessProbeHttpGetPort": return jenkins.JenkinsSpecMasterContainersLivenessProbeHttpGetPort.class;
            case "jenkins.JenkinsSpecMasterContainersLivenessProbeTcpSocket": return jenkins.JenkinsSpecMasterContainersLivenessProbeTcpSocket.class;
            case "jenkins.JenkinsSpecMasterContainersLivenessProbeTcpSocketPort": return jenkins.JenkinsSpecMasterContainersLivenessProbeTcpSocketPort.class;
            case "jenkins.JenkinsSpecMasterContainersPorts": return jenkins.JenkinsSpecMasterContainersPorts.class;
            case "jenkins.JenkinsSpecMasterContainersReadinessProbe": return jenkins.JenkinsSpecMasterContainersReadinessProbe.class;
            case "jenkins.JenkinsSpecMasterContainersReadinessProbeExec": return jenkins.JenkinsSpecMasterContainersReadinessProbeExec.class;
            case "jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGet": return jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGet.class;
            case "jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders": return jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders.class;
            case "jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetPort": return jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetPort.class;
            case "jenkins.JenkinsSpecMasterContainersReadinessProbeTcpSocket": return jenkins.JenkinsSpecMasterContainersReadinessProbeTcpSocket.class;
            case "jenkins.JenkinsSpecMasterContainersReadinessProbeTcpSocketPort": return jenkins.JenkinsSpecMasterContainersReadinessProbeTcpSocketPort.class;
            case "jenkins.JenkinsSpecMasterContainersResources": return jenkins.JenkinsSpecMasterContainersResources.class;
            case "jenkins.JenkinsSpecMasterContainersSecurityContext": return jenkins.JenkinsSpecMasterContainersSecurityContext.class;
            case "jenkins.JenkinsSpecMasterContainersSecurityContextCapabilities": return jenkins.JenkinsSpecMasterContainersSecurityContextCapabilities.class;
            case "jenkins.JenkinsSpecMasterContainersSecurityContextSeLinuxOptions": return jenkins.JenkinsSpecMasterContainersSecurityContextSeLinuxOptions.class;
            case "jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions": return jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions.class;
            case "jenkins.JenkinsSpecMasterContainersVolumeMounts": return jenkins.JenkinsSpecMasterContainersVolumeMounts.class;
            case "jenkins.JenkinsSpecMasterImagePullSecrets": return jenkins.JenkinsSpecMasterImagePullSecrets.class;
            case "jenkins.JenkinsSpecMasterPlugins": return jenkins.JenkinsSpecMasterPlugins.class;
            case "jenkins.JenkinsSpecMasterSecurityContext": return jenkins.JenkinsSpecMasterSecurityContext.class;
            case "jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions": return jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions.class;
            case "jenkins.JenkinsSpecMasterSecurityContextSysctls": return jenkins.JenkinsSpecMasterSecurityContextSysctls.class;
            case "jenkins.JenkinsSpecMasterSecurityContextWindowsOptions": return jenkins.JenkinsSpecMasterSecurityContextWindowsOptions.class;
            case "jenkins.JenkinsSpecMasterTolerations": return jenkins.JenkinsSpecMasterTolerations.class;
            case "jenkins.JenkinsSpecMasterVolumes": return jenkins.JenkinsSpecMasterVolumes.class;
            case "jenkins.JenkinsSpecMasterVolumesAwsElasticBlockStore": return jenkins.JenkinsSpecMasterVolumesAwsElasticBlockStore.class;
            case "jenkins.JenkinsSpecMasterVolumesAzureDisk": return jenkins.JenkinsSpecMasterVolumesAzureDisk.class;
            case "jenkins.JenkinsSpecMasterVolumesAzureFile": return jenkins.JenkinsSpecMasterVolumesAzureFile.class;
            case "jenkins.JenkinsSpecMasterVolumesCephfs": return jenkins.JenkinsSpecMasterVolumesCephfs.class;
            case "jenkins.JenkinsSpecMasterVolumesCephfsSecretRef": return jenkins.JenkinsSpecMasterVolumesCephfsSecretRef.class;
            case "jenkins.JenkinsSpecMasterVolumesCinder": return jenkins.JenkinsSpecMasterVolumesCinder.class;
            case "jenkins.JenkinsSpecMasterVolumesCinderSecretRef": return jenkins.JenkinsSpecMasterVolumesCinderSecretRef.class;
            case "jenkins.JenkinsSpecMasterVolumesConfigMap": return jenkins.JenkinsSpecMasterVolumesConfigMap.class;
            case "jenkins.JenkinsSpecMasterVolumesConfigMapItems": return jenkins.JenkinsSpecMasterVolumesConfigMapItems.class;
            case "jenkins.JenkinsSpecMasterVolumesCsi": return jenkins.JenkinsSpecMasterVolumesCsi.class;
            case "jenkins.JenkinsSpecMasterVolumesCsiNodePublishSecretRef": return jenkins.JenkinsSpecMasterVolumesCsiNodePublishSecretRef.class;
            case "jenkins.JenkinsSpecMasterVolumesDownwardApi": return jenkins.JenkinsSpecMasterVolumesDownwardApi.class;
            case "jenkins.JenkinsSpecMasterVolumesDownwardApiItems": return jenkins.JenkinsSpecMasterVolumesDownwardApiItems.class;
            case "jenkins.JenkinsSpecMasterVolumesDownwardApiItemsFieldRef": return jenkins.JenkinsSpecMasterVolumesDownwardApiItemsFieldRef.class;
            case "jenkins.JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef": return jenkins.JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef.class;
            case "jenkins.JenkinsSpecMasterVolumesEmptyDir": return jenkins.JenkinsSpecMasterVolumesEmptyDir.class;
            case "jenkins.JenkinsSpecMasterVolumesFc": return jenkins.JenkinsSpecMasterVolumesFc.class;
            case "jenkins.JenkinsSpecMasterVolumesFlexVolume": return jenkins.JenkinsSpecMasterVolumesFlexVolume.class;
            case "jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef": return jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef.class;
            case "jenkins.JenkinsSpecMasterVolumesFlocker": return jenkins.JenkinsSpecMasterVolumesFlocker.class;
            case "jenkins.JenkinsSpecMasterVolumesGcePersistentDisk": return jenkins.JenkinsSpecMasterVolumesGcePersistentDisk.class;
            case "jenkins.JenkinsSpecMasterVolumesGitRepo": return jenkins.JenkinsSpecMasterVolumesGitRepo.class;
            case "jenkins.JenkinsSpecMasterVolumesGlusterfs": return jenkins.JenkinsSpecMasterVolumesGlusterfs.class;
            case "jenkins.JenkinsSpecMasterVolumesHostPath": return jenkins.JenkinsSpecMasterVolumesHostPath.class;
            case "jenkins.JenkinsSpecMasterVolumesIscsi": return jenkins.JenkinsSpecMasterVolumesIscsi.class;
            case "jenkins.JenkinsSpecMasterVolumesIscsiSecretRef": return jenkins.JenkinsSpecMasterVolumesIscsiSecretRef.class;
            case "jenkins.JenkinsSpecMasterVolumesNfs": return jenkins.JenkinsSpecMasterVolumesNfs.class;
            case "jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim": return jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim.class;
            case "jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk": return jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk.class;
            case "jenkins.JenkinsSpecMasterVolumesPortworxVolume": return jenkins.JenkinsSpecMasterVolumesPortworxVolume.class;
            case "jenkins.JenkinsSpecMasterVolumesProjected": return jenkins.JenkinsSpecMasterVolumesProjected.class;
            case "jenkins.JenkinsSpecMasterVolumesProjectedSources": return jenkins.JenkinsSpecMasterVolumesProjectedSources.class;
            case "jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMap": return jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMap.class;
            case "jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems": return jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems.class;
            case "jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi": return jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi.class;
            case "jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems": return jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems.class;
            case "jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef": return jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef.class;
            case "jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef": return jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef.class;
            case "jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecret": return jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecret.class;
            case "jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecretItems": return jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecretItems.class;
            case "jenkins.JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken": return jenkins.JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken.class;
            case "jenkins.JenkinsSpecMasterVolumesQuobyte": return jenkins.JenkinsSpecMasterVolumesQuobyte.class;
            case "jenkins.JenkinsSpecMasterVolumesRbd": return jenkins.JenkinsSpecMasterVolumesRbd.class;
            case "jenkins.JenkinsSpecMasterVolumesRbdSecretRef": return jenkins.JenkinsSpecMasterVolumesRbdSecretRef.class;
            case "jenkins.JenkinsSpecMasterVolumesScaleIo": return jenkins.JenkinsSpecMasterVolumesScaleIo.class;
            case "jenkins.JenkinsSpecMasterVolumesScaleIoSecretRef": return jenkins.JenkinsSpecMasterVolumesScaleIoSecretRef.class;
            case "jenkins.JenkinsSpecMasterVolumesSecret": return jenkins.JenkinsSpecMasterVolumesSecret.class;
            case "jenkins.JenkinsSpecMasterVolumesSecretItems": return jenkins.JenkinsSpecMasterVolumesSecretItems.class;
            case "jenkins.JenkinsSpecMasterVolumesStorageos": return jenkins.JenkinsSpecMasterVolumesStorageos.class;
            case "jenkins.JenkinsSpecMasterVolumesStorageosSecretRef": return jenkins.JenkinsSpecMasterVolumesStorageosSecretRef.class;
            case "jenkins.JenkinsSpecMasterVolumesVsphereVolume": return jenkins.JenkinsSpecMasterVolumesVsphereVolume.class;
            case "jenkins.JenkinsSpecNotifications": return jenkins.JenkinsSpecNotifications.class;
            case "jenkins.JenkinsSpecNotificationsMailgun": return jenkins.JenkinsSpecNotificationsMailgun.class;
            case "jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector": return jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector.class;
            case "jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret": return jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret.class;
            case "jenkins.JenkinsSpecNotificationsSlack": return jenkins.JenkinsSpecNotificationsSlack.class;
            case "jenkins.JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector": return jenkins.JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector.class;
            case "jenkins.JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret": return jenkins.JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret.class;
            case "jenkins.JenkinsSpecNotificationsSmtp": return jenkins.JenkinsSpecNotificationsSmtp.class;
            case "jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelector": return jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelector.class;
            case "jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret": return jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret.class;
            case "jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelector": return jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelector.class;
            case "jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret": return jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret.class;
            case "jenkins.JenkinsSpecNotificationsTeams": return jenkins.JenkinsSpecNotificationsTeams.class;
            case "jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector": return jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector.class;
            case "jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret": return jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret.class;
            case "jenkins.JenkinsSpecRestore": return jenkins.JenkinsSpecRestore.class;
            case "jenkins.JenkinsSpecRestoreAction": return jenkins.JenkinsSpecRestoreAction.class;
            case "jenkins.JenkinsSpecRestoreActionExec": return jenkins.JenkinsSpecRestoreActionExec.class;
            case "jenkins.JenkinsSpecRoles": return jenkins.JenkinsSpecRoles.class;
            case "jenkins.JenkinsSpecSeedJobs": return jenkins.JenkinsSpecSeedJobs.class;
            case "jenkins.JenkinsSpecService": return jenkins.JenkinsSpecService.class;
            case "jenkins.JenkinsSpecServiceAccount": return jenkins.JenkinsSpecServiceAccount.class;
            case "jenkins.JenkinsSpecSlaveService": return jenkins.JenkinsSpecSlaveService.class;
            default: throw new ClassNotFoundException("Unknown JSII type: " + fqn);
        }
    }
}
