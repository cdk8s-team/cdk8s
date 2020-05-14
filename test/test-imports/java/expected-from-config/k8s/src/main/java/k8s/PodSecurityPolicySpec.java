package k8s;

/**
 * PodSecurityPolicySpec defines the policy enforced.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.355Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PodSecurityPolicySpec")
@software.amazon.jsii.Jsii.Proxy(PodSecurityPolicySpec.Jsii$Proxy.class)
public interface PodSecurityPolicySpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
     */
    @org.jetbrains.annotations.NotNull k8s.FSGroupStrategyOptions getFsGroup();

    /**
     * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
     */
    @org.jetbrains.annotations.NotNull k8s.RunAsUserStrategyOptions getRunAsUser();

    /**
     * seLinux is the strategy that will dictate the allowable labels that may be set.
     */
    @org.jetbrains.annotations.NotNull k8s.SELinuxStrategyOptions getSeLinux();

    /**
     * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
     */
    @org.jetbrains.annotations.NotNull k8s.SupplementalGroupsStrategyOptions getSupplementalGroups();

    /**
     * allowedCapabilities is a list of capabilities that can be requested to add to the container.
     * <p>
     * Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedCapabilities() {
        return null;
    }

    /**
     * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec.
     * <p>
     * An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is an alpha field, and is only honored if the API server enables the CSIInlineVolume feature gate.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.AllowedCSIDriver> getAllowedCsiDrivers() {
        return null;
    }

    /**
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.
     * <p>
     * Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.AllowedFlexVolume> getAllowedFlexVolumes() {
        return null;
    }

    /**
     * allowedHostPaths is a white list of allowed host paths.
     * <p>
     * Empty indicates that all host paths may be used.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.AllowedHostPath> getAllowedHostPaths() {
        return null;
    }

    /**
     * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
     * <p>
     * Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedProcMountTypes() {
        return null;
    }

    /**
     * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
     * <p>
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
     * <p>
     * Examples: e.g. "foo/<em>" allows "foo/bar", "foo/baz", etc. e.g. "foo.</em>" allows "foo.bar", "foo.baz", etc.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedUnsafeSysctls() {
        return null;
    }

    /**
     * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation.
     * <p>
     * If unspecified, defaults to true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowPrivilegeEscalation() {
        return null;
    }

    /**
     * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.
     * <p>
     * You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDefaultAddCapabilities() {
        return null;
    }

    /**
     * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDefaultAllowPrivilegeEscalation() {
        return null;
    }

    /**
     * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
     * <p>
     * Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
     * <p>
     * Examples: e.g. "foo/<em>" forbids "foo/bar", "foo/baz", etc. e.g. "foo.</em>" forbids "foo.bar", "foo.baz", etc.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getForbiddenSysctls() {
        return null;
    }

    /**
     * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getHostIpc() {
        return null;
    }

    /**
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getHostNetwork() {
        return null;
    }

    /**
     * hostPID determines if the policy allows the use of HostPID in the pod spec.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getHostPid() {
        return null;
    }

    /**
     * hostPorts determines which host port ranges are allowed to be exposed.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.HostPortRange> getHostPorts() {
        return null;
    }

    /**
     * privileged determines if a pod can request to be run as privileged.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPrivileged() {
        return null;
    }

    /**
     * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.
     * <p>
     * If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnlyRootFilesystem() {
        return null;
    }

    /**
     * requiredDropCapabilities are the capabilities that will be dropped from the container.
     * <p>
     * These are required to be dropped and cannot be added.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRequiredDropCapabilities() {
        return null;
    }

    /**
     * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * <p>
     * If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
     */
    default @org.jetbrains.annotations.Nullable k8s.RunAsGroupStrategyOptions getRunAsGroup() {
        return null;
    }

    /**
     * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod.
     * <p>
     * If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
     */
    default @org.jetbrains.annotations.Nullable k8s.RuntimeClassStrategyOptions getRuntimeClass() {
        return null;
    }

    /**
     * volumes is a white list of allowed volume plugins.
     * <p>
     * Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVolumes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSecurityPolicySpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSecurityPolicySpec}
     */
    public static final class Builder {
        private k8s.FSGroupStrategyOptions fsGroup;
        private k8s.RunAsUserStrategyOptions runAsUser;
        private k8s.SELinuxStrategyOptions seLinux;
        private k8s.SupplementalGroupsStrategyOptions supplementalGroups;
        private java.util.List<java.lang.String> allowedCapabilities;
        private java.util.List<k8s.AllowedCSIDriver> allowedCsiDrivers;
        private java.util.List<k8s.AllowedFlexVolume> allowedFlexVolumes;
        private java.util.List<k8s.AllowedHostPath> allowedHostPaths;
        private java.util.List<java.lang.String> allowedProcMountTypes;
        private java.util.List<java.lang.String> allowedUnsafeSysctls;
        private java.lang.Boolean allowPrivilegeEscalation;
        private java.util.List<java.lang.String> defaultAddCapabilities;
        private java.lang.Boolean defaultAllowPrivilegeEscalation;
        private java.util.List<java.lang.String> forbiddenSysctls;
        private java.lang.Boolean hostIpc;
        private java.lang.Boolean hostNetwork;
        private java.lang.Boolean hostPid;
        private java.util.List<k8s.HostPortRange> hostPorts;
        private java.lang.Boolean privileged;
        private java.lang.Boolean readOnlyRootFilesystem;
        private java.util.List<java.lang.String> requiredDropCapabilities;
        private k8s.RunAsGroupStrategyOptions runAsGroup;
        private k8s.RuntimeClassStrategyOptions runtimeClass;
        private java.util.List<java.lang.String> volumes;

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getFsGroup}
         * @param fsGroup fsGroup is the strategy that will dictate what fs group is used by the SecurityContext. This parameter is required.
         * @return {@code this}
         */
        public Builder fsGroup(k8s.FSGroupStrategyOptions fsGroup) {
            this.fsGroup = fsGroup;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getRunAsUser}
         * @param runAsUser runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set. This parameter is required.
         * @return {@code this}
         */
        public Builder runAsUser(k8s.RunAsUserStrategyOptions runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getSeLinux}
         * @param seLinux seLinux is the strategy that will dictate the allowable labels that may be set. This parameter is required.
         * @return {@code this}
         */
        public Builder seLinux(k8s.SELinuxStrategyOptions seLinux) {
            this.seLinux = seLinux;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getSupplementalGroups}
         * @param supplementalGroups supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext. This parameter is required.
         * @return {@code this}
         */
        public Builder supplementalGroups(k8s.SupplementalGroupsStrategyOptions supplementalGroups) {
            this.supplementalGroups = supplementalGroups;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getAllowedCapabilities}
         * @param allowedCapabilities allowedCapabilities is a list of capabilities that can be requested to add to the container.
         *                            Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
         * @return {@code this}
         */
        public Builder allowedCapabilities(java.util.List<java.lang.String> allowedCapabilities) {
            this.allowedCapabilities = allowedCapabilities;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getAllowedCsiDrivers}
         * @param allowedCsiDrivers AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec.
         *                          An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is an alpha field, and is only honored if the API server enables the CSIInlineVolume feature gate.
         * @return {@code this}
         */
        public Builder allowedCsiDrivers(java.util.List<k8s.AllowedCSIDriver> allowedCsiDrivers) {
            this.allowedCsiDrivers = allowedCsiDrivers;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getAllowedFlexVolumes}
         * @param allowedFlexVolumes allowedFlexVolumes is a whitelist of allowed Flexvolumes.
         *                           Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field.
         * @return {@code this}
         */
        public Builder allowedFlexVolumes(java.util.List<k8s.AllowedFlexVolume> allowedFlexVolumes) {
            this.allowedFlexVolumes = allowedFlexVolumes;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getAllowedHostPaths}
         * @param allowedHostPaths allowedHostPaths is a white list of allowed host paths.
         *                         Empty indicates that all host paths may be used.
         * @return {@code this}
         */
        public Builder allowedHostPaths(java.util.List<k8s.AllowedHostPath> allowedHostPaths) {
            this.allowedHostPaths = allowedHostPaths;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getAllowedProcMountTypes}
         * @param allowedProcMountTypes AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
         *                              Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
         * @return {@code this}
         */
        public Builder allowedProcMountTypes(java.util.List<java.lang.String> allowedProcMountTypes) {
            this.allowedProcMountTypes = allowedProcMountTypes;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getAllowedUnsafeSysctls}
         * @param allowedUnsafeSysctls allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
         *                             Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
         *                             <p>
         *                             Examples: e.g. "foo/<em>" allows "foo/bar", "foo/baz", etc. e.g. "foo.</em>" allows "foo.bar", "foo.baz", etc.
         * @return {@code this}
         */
        public Builder allowedUnsafeSysctls(java.util.List<java.lang.String> allowedUnsafeSysctls) {
            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getAllowPrivilegeEscalation}
         * @param allowPrivilegeEscalation allowPrivilegeEscalation determines if a pod can request to allow privilege escalation.
         *                                 If unspecified, defaults to true.
         * @return {@code this}
         */
        public Builder allowPrivilegeEscalation(java.lang.Boolean allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getDefaultAddCapabilities}
         * @param defaultAddCapabilities defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.
         *                               You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
         * @return {@code this}
         */
        public Builder defaultAddCapabilities(java.util.List<java.lang.String> defaultAddCapabilities) {
            this.defaultAddCapabilities = defaultAddCapabilities;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getDefaultAllowPrivilegeEscalation}
         * @param defaultAllowPrivilegeEscalation defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
         * @return {@code this}
         */
        public Builder defaultAllowPrivilegeEscalation(java.lang.Boolean defaultAllowPrivilegeEscalation) {
            this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getForbiddenSysctls}
         * @param forbiddenSysctls forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
         *                         Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
         *                         <p>
         *                         Examples: e.g. "foo/<em>" forbids "foo/bar", "foo/baz", etc. e.g. "foo.</em>" forbids "foo.bar", "foo.baz", etc.
         * @return {@code this}
         */
        public Builder forbiddenSysctls(java.util.List<java.lang.String> forbiddenSysctls) {
            this.forbiddenSysctls = forbiddenSysctls;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getHostIpc}
         * @param hostIpc hostIPC determines if the policy allows the use of HostIPC in the pod spec.
         * @return {@code this}
         */
        public Builder hostIpc(java.lang.Boolean hostIpc) {
            this.hostIpc = hostIpc;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getHostNetwork}
         * @param hostNetwork hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
         * @return {@code this}
         */
        public Builder hostNetwork(java.lang.Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getHostPid}
         * @param hostPid hostPID determines if the policy allows the use of HostPID in the pod spec.
         * @return {@code this}
         */
        public Builder hostPid(java.lang.Boolean hostPid) {
            this.hostPid = hostPid;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getHostPorts}
         * @param hostPorts hostPorts determines which host port ranges are allowed to be exposed.
         * @return {@code this}
         */
        public Builder hostPorts(java.util.List<k8s.HostPortRange> hostPorts) {
            this.hostPorts = hostPorts;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getPrivileged}
         * @param privileged privileged determines if a pod can request to be run as privileged.
         * @return {@code this}
         */
        public Builder privileged(java.lang.Boolean privileged) {
            this.privileged = privileged;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getReadOnlyRootFilesystem}
         * @param readOnlyRootFilesystem readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.
         *                               If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
         * @return {@code this}
         */
        public Builder readOnlyRootFilesystem(java.lang.Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getRequiredDropCapabilities}
         * @param requiredDropCapabilities requiredDropCapabilities are the capabilities that will be dropped from the container.
         *                                 These are required to be dropped and cannot be added.
         * @return {@code this}
         */
        public Builder requiredDropCapabilities(java.util.List<java.lang.String> requiredDropCapabilities) {
            this.requiredDropCapabilities = requiredDropCapabilities;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getRunAsGroup}
         * @param runAsGroup RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
         *                   If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
         * @return {@code this}
         */
        public Builder runAsGroup(k8s.RunAsGroupStrategyOptions runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getRuntimeClass}
         * @param runtimeClass runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod.
         *                     If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
         * @return {@code this}
         */
        public Builder runtimeClass(k8s.RuntimeClassStrategyOptions runtimeClass) {
            this.runtimeClass = runtimeClass;
            return this;
        }

        /**
         * Sets the value of {@link PodSecurityPolicySpec#getVolumes}
         * @param volumes volumes is a white list of allowed volume plugins.
         *                Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
         * @return {@code this}
         */
        public Builder volumes(java.util.List<java.lang.String> volumes) {
            this.volumes = volumes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSecurityPolicySpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PodSecurityPolicySpec build() {
            return new Jsii$Proxy(fsGroup, runAsUser, seLinux, supplementalGroups, allowedCapabilities, allowedCsiDrivers, allowedFlexVolumes, allowedHostPaths, allowedProcMountTypes, allowedUnsafeSysctls, allowPrivilegeEscalation, defaultAddCapabilities, defaultAllowPrivilegeEscalation, forbiddenSysctls, hostIpc, hostNetwork, hostPid, hostPorts, privileged, readOnlyRootFilesystem, requiredDropCapabilities, runAsGroup, runtimeClass, volumes);
        }
    }

    /**
     * An implementation for {@link PodSecurityPolicySpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSecurityPolicySpec {
        private final k8s.FSGroupStrategyOptions fsGroup;
        private final k8s.RunAsUserStrategyOptions runAsUser;
        private final k8s.SELinuxStrategyOptions seLinux;
        private final k8s.SupplementalGroupsStrategyOptions supplementalGroups;
        private final java.util.List<java.lang.String> allowedCapabilities;
        private final java.util.List<k8s.AllowedCSIDriver> allowedCsiDrivers;
        private final java.util.List<k8s.AllowedFlexVolume> allowedFlexVolumes;
        private final java.util.List<k8s.AllowedHostPath> allowedHostPaths;
        private final java.util.List<java.lang.String> allowedProcMountTypes;
        private final java.util.List<java.lang.String> allowedUnsafeSysctls;
        private final java.lang.Boolean allowPrivilegeEscalation;
        private final java.util.List<java.lang.String> defaultAddCapabilities;
        private final java.lang.Boolean defaultAllowPrivilegeEscalation;
        private final java.util.List<java.lang.String> forbiddenSysctls;
        private final java.lang.Boolean hostIpc;
        private final java.lang.Boolean hostNetwork;
        private final java.lang.Boolean hostPid;
        private final java.util.List<k8s.HostPortRange> hostPorts;
        private final java.lang.Boolean privileged;
        private final java.lang.Boolean readOnlyRootFilesystem;
        private final java.util.List<java.lang.String> requiredDropCapabilities;
        private final k8s.RunAsGroupStrategyOptions runAsGroup;
        private final k8s.RuntimeClassStrategyOptions runtimeClass;
        private final java.util.List<java.lang.String> volumes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fsGroup = this.jsiiGet("fsGroup", k8s.FSGroupStrategyOptions.class);
            this.runAsUser = this.jsiiGet("runAsUser", k8s.RunAsUserStrategyOptions.class);
            this.seLinux = this.jsiiGet("seLinux", k8s.SELinuxStrategyOptions.class);
            this.supplementalGroups = this.jsiiGet("supplementalGroups", k8s.SupplementalGroupsStrategyOptions.class);
            this.allowedCapabilities = this.jsiiGet("allowedCapabilities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowedCsiDrivers = this.jsiiGet("allowedCSIDrivers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.AllowedCSIDriver.class)));
            this.allowedFlexVolumes = this.jsiiGet("allowedFlexVolumes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.AllowedFlexVolume.class)));
            this.allowedHostPaths = this.jsiiGet("allowedHostPaths", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.AllowedHostPath.class)));
            this.allowedProcMountTypes = this.jsiiGet("allowedProcMountTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowedUnsafeSysctls = this.jsiiGet("allowedUnsafeSysctls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowPrivilegeEscalation = this.jsiiGet("allowPrivilegeEscalation", java.lang.Boolean.class);
            this.defaultAddCapabilities = this.jsiiGet("defaultAddCapabilities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.defaultAllowPrivilegeEscalation = this.jsiiGet("defaultAllowPrivilegeEscalation", java.lang.Boolean.class);
            this.forbiddenSysctls = this.jsiiGet("forbiddenSysctls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.hostIpc = this.jsiiGet("hostIPC", java.lang.Boolean.class);
            this.hostNetwork = this.jsiiGet("hostNetwork", java.lang.Boolean.class);
            this.hostPid = this.jsiiGet("hostPID", java.lang.Boolean.class);
            this.hostPorts = this.jsiiGet("hostPorts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.HostPortRange.class)));
            this.privileged = this.jsiiGet("privileged", java.lang.Boolean.class);
            this.readOnlyRootFilesystem = this.jsiiGet("readOnlyRootFilesystem", java.lang.Boolean.class);
            this.requiredDropCapabilities = this.jsiiGet("requiredDropCapabilities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.runAsGroup = this.jsiiGet("runAsGroup", k8s.RunAsGroupStrategyOptions.class);
            this.runtimeClass = this.jsiiGet("runtimeClass", k8s.RuntimeClassStrategyOptions.class);
            this.volumes = this.jsiiGet("volumes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.FSGroupStrategyOptions fsGroup, final k8s.RunAsUserStrategyOptions runAsUser, final k8s.SELinuxStrategyOptions seLinux, final k8s.SupplementalGroupsStrategyOptions supplementalGroups, final java.util.List<java.lang.String> allowedCapabilities, final java.util.List<k8s.AllowedCSIDriver> allowedCsiDrivers, final java.util.List<k8s.AllowedFlexVolume> allowedFlexVolumes, final java.util.List<k8s.AllowedHostPath> allowedHostPaths, final java.util.List<java.lang.String> allowedProcMountTypes, final java.util.List<java.lang.String> allowedUnsafeSysctls, final java.lang.Boolean allowPrivilegeEscalation, final java.util.List<java.lang.String> defaultAddCapabilities, final java.lang.Boolean defaultAllowPrivilegeEscalation, final java.util.List<java.lang.String> forbiddenSysctls, final java.lang.Boolean hostIpc, final java.lang.Boolean hostNetwork, final java.lang.Boolean hostPid, final java.util.List<k8s.HostPortRange> hostPorts, final java.lang.Boolean privileged, final java.lang.Boolean readOnlyRootFilesystem, final java.util.List<java.lang.String> requiredDropCapabilities, final k8s.RunAsGroupStrategyOptions runAsGroup, final k8s.RuntimeClassStrategyOptions runtimeClass, final java.util.List<java.lang.String> volumes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fsGroup = java.util.Objects.requireNonNull(fsGroup, "fsGroup is required");
            this.runAsUser = java.util.Objects.requireNonNull(runAsUser, "runAsUser is required");
            this.seLinux = java.util.Objects.requireNonNull(seLinux, "seLinux is required");
            this.supplementalGroups = java.util.Objects.requireNonNull(supplementalGroups, "supplementalGroups is required");
            this.allowedCapabilities = allowedCapabilities;
            this.allowedCsiDrivers = allowedCsiDrivers;
            this.allowedFlexVolumes = allowedFlexVolumes;
            this.allowedHostPaths = allowedHostPaths;
            this.allowedProcMountTypes = allowedProcMountTypes;
            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            this.defaultAddCapabilities = defaultAddCapabilities;
            this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
            this.forbiddenSysctls = forbiddenSysctls;
            this.hostIpc = hostIpc;
            this.hostNetwork = hostNetwork;
            this.hostPid = hostPid;
            this.hostPorts = hostPorts;
            this.privileged = privileged;
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            this.requiredDropCapabilities = requiredDropCapabilities;
            this.runAsGroup = runAsGroup;
            this.runtimeClass = runtimeClass;
            this.volumes = volumes;
        }

        @Override
        public k8s.FSGroupStrategyOptions getFsGroup() {
            return this.fsGroup;
        }

        @Override
        public k8s.RunAsUserStrategyOptions getRunAsUser() {
            return this.runAsUser;
        }

        @Override
        public k8s.SELinuxStrategyOptions getSeLinux() {
            return this.seLinux;
        }

        @Override
        public k8s.SupplementalGroupsStrategyOptions getSupplementalGroups() {
            return this.supplementalGroups;
        }

        @Override
        public java.util.List<java.lang.String> getAllowedCapabilities() {
            return this.allowedCapabilities;
        }

        @Override
        public java.util.List<k8s.AllowedCSIDriver> getAllowedCsiDrivers() {
            return this.allowedCsiDrivers;
        }

        @Override
        public java.util.List<k8s.AllowedFlexVolume> getAllowedFlexVolumes() {
            return this.allowedFlexVolumes;
        }

        @Override
        public java.util.List<k8s.AllowedHostPath> getAllowedHostPaths() {
            return this.allowedHostPaths;
        }

        @Override
        public java.util.List<java.lang.String> getAllowedProcMountTypes() {
            return this.allowedProcMountTypes;
        }

        @Override
        public java.util.List<java.lang.String> getAllowedUnsafeSysctls() {
            return this.allowedUnsafeSysctls;
        }

        @Override
        public java.lang.Boolean getAllowPrivilegeEscalation() {
            return this.allowPrivilegeEscalation;
        }

        @Override
        public java.util.List<java.lang.String> getDefaultAddCapabilities() {
            return this.defaultAddCapabilities;
        }

        @Override
        public java.lang.Boolean getDefaultAllowPrivilegeEscalation() {
            return this.defaultAllowPrivilegeEscalation;
        }

        @Override
        public java.util.List<java.lang.String> getForbiddenSysctls() {
            return this.forbiddenSysctls;
        }

        @Override
        public java.lang.Boolean getHostIpc() {
            return this.hostIpc;
        }

        @Override
        public java.lang.Boolean getHostNetwork() {
            return this.hostNetwork;
        }

        @Override
        public java.lang.Boolean getHostPid() {
            return this.hostPid;
        }

        @Override
        public java.util.List<k8s.HostPortRange> getHostPorts() {
            return this.hostPorts;
        }

        @Override
        public java.lang.Boolean getPrivileged() {
            return this.privileged;
        }

        @Override
        public java.lang.Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        @Override
        public java.util.List<java.lang.String> getRequiredDropCapabilities() {
            return this.requiredDropCapabilities;
        }

        @Override
        public k8s.RunAsGroupStrategyOptions getRunAsGroup() {
            return this.runAsGroup;
        }

        @Override
        public k8s.RuntimeClassStrategyOptions getRuntimeClass() {
            return this.runtimeClass;
        }

        @Override
        public java.util.List<java.lang.String> getVolumes() {
            return this.volumes;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("fsGroup", om.valueToTree(this.getFsGroup()));
            data.set("runAsUser", om.valueToTree(this.getRunAsUser()));
            data.set("seLinux", om.valueToTree(this.getSeLinux()));
            data.set("supplementalGroups", om.valueToTree(this.getSupplementalGroups()));
            if (this.getAllowedCapabilities() != null) {
                data.set("allowedCapabilities", om.valueToTree(this.getAllowedCapabilities()));
            }
            if (this.getAllowedCsiDrivers() != null) {
                data.set("allowedCSIDrivers", om.valueToTree(this.getAllowedCsiDrivers()));
            }
            if (this.getAllowedFlexVolumes() != null) {
                data.set("allowedFlexVolumes", om.valueToTree(this.getAllowedFlexVolumes()));
            }
            if (this.getAllowedHostPaths() != null) {
                data.set("allowedHostPaths", om.valueToTree(this.getAllowedHostPaths()));
            }
            if (this.getAllowedProcMountTypes() != null) {
                data.set("allowedProcMountTypes", om.valueToTree(this.getAllowedProcMountTypes()));
            }
            if (this.getAllowedUnsafeSysctls() != null) {
                data.set("allowedUnsafeSysctls", om.valueToTree(this.getAllowedUnsafeSysctls()));
            }
            if (this.getAllowPrivilegeEscalation() != null) {
                data.set("allowPrivilegeEscalation", om.valueToTree(this.getAllowPrivilegeEscalation()));
            }
            if (this.getDefaultAddCapabilities() != null) {
                data.set("defaultAddCapabilities", om.valueToTree(this.getDefaultAddCapabilities()));
            }
            if (this.getDefaultAllowPrivilegeEscalation() != null) {
                data.set("defaultAllowPrivilegeEscalation", om.valueToTree(this.getDefaultAllowPrivilegeEscalation()));
            }
            if (this.getForbiddenSysctls() != null) {
                data.set("forbiddenSysctls", om.valueToTree(this.getForbiddenSysctls()));
            }
            if (this.getHostIpc() != null) {
                data.set("hostIPC", om.valueToTree(this.getHostIpc()));
            }
            if (this.getHostNetwork() != null) {
                data.set("hostNetwork", om.valueToTree(this.getHostNetwork()));
            }
            if (this.getHostPid() != null) {
                data.set("hostPID", om.valueToTree(this.getHostPid()));
            }
            if (this.getHostPorts() != null) {
                data.set("hostPorts", om.valueToTree(this.getHostPorts()));
            }
            if (this.getPrivileged() != null) {
                data.set("privileged", om.valueToTree(this.getPrivileged()));
            }
            if (this.getReadOnlyRootFilesystem() != null) {
                data.set("readOnlyRootFilesystem", om.valueToTree(this.getReadOnlyRootFilesystem()));
            }
            if (this.getRequiredDropCapabilities() != null) {
                data.set("requiredDropCapabilities", om.valueToTree(this.getRequiredDropCapabilities()));
            }
            if (this.getRunAsGroup() != null) {
                data.set("runAsGroup", om.valueToTree(this.getRunAsGroup()));
            }
            if (this.getRuntimeClass() != null) {
                data.set("runtimeClass", om.valueToTree(this.getRuntimeClass()));
            }
            if (this.getVolumes() != null) {
                data.set("volumes", om.valueToTree(this.getVolumes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodSecurityPolicySpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSecurityPolicySpec.Jsii$Proxy that = (PodSecurityPolicySpec.Jsii$Proxy) o;

            if (!fsGroup.equals(that.fsGroup)) return false;
            if (!runAsUser.equals(that.runAsUser)) return false;
            if (!seLinux.equals(that.seLinux)) return false;
            if (!supplementalGroups.equals(that.supplementalGroups)) return false;
            if (this.allowedCapabilities != null ? !this.allowedCapabilities.equals(that.allowedCapabilities) : that.allowedCapabilities != null) return false;
            if (this.allowedCsiDrivers != null ? !this.allowedCsiDrivers.equals(that.allowedCsiDrivers) : that.allowedCsiDrivers != null) return false;
            if (this.allowedFlexVolumes != null ? !this.allowedFlexVolumes.equals(that.allowedFlexVolumes) : that.allowedFlexVolumes != null) return false;
            if (this.allowedHostPaths != null ? !this.allowedHostPaths.equals(that.allowedHostPaths) : that.allowedHostPaths != null) return false;
            if (this.allowedProcMountTypes != null ? !this.allowedProcMountTypes.equals(that.allowedProcMountTypes) : that.allowedProcMountTypes != null) return false;
            if (this.allowedUnsafeSysctls != null ? !this.allowedUnsafeSysctls.equals(that.allowedUnsafeSysctls) : that.allowedUnsafeSysctls != null) return false;
            if (this.allowPrivilegeEscalation != null ? !this.allowPrivilegeEscalation.equals(that.allowPrivilegeEscalation) : that.allowPrivilegeEscalation != null) return false;
            if (this.defaultAddCapabilities != null ? !this.defaultAddCapabilities.equals(that.defaultAddCapabilities) : that.defaultAddCapabilities != null) return false;
            if (this.defaultAllowPrivilegeEscalation != null ? !this.defaultAllowPrivilegeEscalation.equals(that.defaultAllowPrivilegeEscalation) : that.defaultAllowPrivilegeEscalation != null) return false;
            if (this.forbiddenSysctls != null ? !this.forbiddenSysctls.equals(that.forbiddenSysctls) : that.forbiddenSysctls != null) return false;
            if (this.hostIpc != null ? !this.hostIpc.equals(that.hostIpc) : that.hostIpc != null) return false;
            if (this.hostNetwork != null ? !this.hostNetwork.equals(that.hostNetwork) : that.hostNetwork != null) return false;
            if (this.hostPid != null ? !this.hostPid.equals(that.hostPid) : that.hostPid != null) return false;
            if (this.hostPorts != null ? !this.hostPorts.equals(that.hostPorts) : that.hostPorts != null) return false;
            if (this.privileged != null ? !this.privileged.equals(that.privileged) : that.privileged != null) return false;
            if (this.readOnlyRootFilesystem != null ? !this.readOnlyRootFilesystem.equals(that.readOnlyRootFilesystem) : that.readOnlyRootFilesystem != null) return false;
            if (this.requiredDropCapabilities != null ? !this.requiredDropCapabilities.equals(that.requiredDropCapabilities) : that.requiredDropCapabilities != null) return false;
            if (this.runAsGroup != null ? !this.runAsGroup.equals(that.runAsGroup) : that.runAsGroup != null) return false;
            if (this.runtimeClass != null ? !this.runtimeClass.equals(that.runtimeClass) : that.runtimeClass != null) return false;
            return this.volumes != null ? this.volumes.equals(that.volumes) : that.volumes == null;
        }

        @Override
        public int hashCode() {
            int result = this.fsGroup.hashCode();
            result = 31 * result + (this.runAsUser.hashCode());
            result = 31 * result + (this.seLinux.hashCode());
            result = 31 * result + (this.supplementalGroups.hashCode());
            result = 31 * result + (this.allowedCapabilities != null ? this.allowedCapabilities.hashCode() : 0);
            result = 31 * result + (this.allowedCsiDrivers != null ? this.allowedCsiDrivers.hashCode() : 0);
            result = 31 * result + (this.allowedFlexVolumes != null ? this.allowedFlexVolumes.hashCode() : 0);
            result = 31 * result + (this.allowedHostPaths != null ? this.allowedHostPaths.hashCode() : 0);
            result = 31 * result + (this.allowedProcMountTypes != null ? this.allowedProcMountTypes.hashCode() : 0);
            result = 31 * result + (this.allowedUnsafeSysctls != null ? this.allowedUnsafeSysctls.hashCode() : 0);
            result = 31 * result + (this.allowPrivilegeEscalation != null ? this.allowPrivilegeEscalation.hashCode() : 0);
            result = 31 * result + (this.defaultAddCapabilities != null ? this.defaultAddCapabilities.hashCode() : 0);
            result = 31 * result + (this.defaultAllowPrivilegeEscalation != null ? this.defaultAllowPrivilegeEscalation.hashCode() : 0);
            result = 31 * result + (this.forbiddenSysctls != null ? this.forbiddenSysctls.hashCode() : 0);
            result = 31 * result + (this.hostIpc != null ? this.hostIpc.hashCode() : 0);
            result = 31 * result + (this.hostNetwork != null ? this.hostNetwork.hashCode() : 0);
            result = 31 * result + (this.hostPid != null ? this.hostPid.hashCode() : 0);
            result = 31 * result + (this.hostPorts != null ? this.hostPorts.hashCode() : 0);
            result = 31 * result + (this.privileged != null ? this.privileged.hashCode() : 0);
            result = 31 * result + (this.readOnlyRootFilesystem != null ? this.readOnlyRootFilesystem.hashCode() : 0);
            result = 31 * result + (this.requiredDropCapabilities != null ? this.requiredDropCapabilities.hashCode() : 0);
            result = 31 * result + (this.runAsGroup != null ? this.runAsGroup.hashCode() : 0);
            result = 31 * result + (this.runtimeClass != null ? this.runtimeClass.hashCode() : 0);
            result = 31 * result + (this.volumes != null ? this.volumes.hashCode() : 0);
            return result;
        }
    }
}
