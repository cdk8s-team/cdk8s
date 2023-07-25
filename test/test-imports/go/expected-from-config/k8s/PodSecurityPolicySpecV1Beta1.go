package k8s


// PodSecurityPolicySpec defines the policy enforced.
type PodSecurityPolicySpecV1Beta1 struct {
	// fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
	FsGroup *FsGroupStrategyOptionsV1Beta1 `field:"required" json:"fsGroup" yaml:"fsGroup"`
	// runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
	RunAsUser *RunAsUserStrategyOptionsV1Beta1 `field:"required" json:"runAsUser" yaml:"runAsUser"`
	// seLinux is the strategy that will dictate the allowable labels that may be set.
	SeLinux *SeLinuxStrategyOptionsV1Beta1 `field:"required" json:"seLinux" yaml:"seLinux"`
	// supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
	SupplementalGroups *SupplementalGroupsStrategyOptionsV1Beta1 `field:"required" json:"supplementalGroups" yaml:"supplementalGroups"`
	// allowedCapabilities is a list of capabilities that can be requested to add to the container.
	//
	// Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
	AllowedCapabilities *[]*string `field:"optional" json:"allowedCapabilities" yaml:"allowedCapabilities"`
	// AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec.
	//
	// An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is an alpha field, and is only honored if the API server enables the CSIInlineVolume feature gate.
	AllowedCsiDrivers *[]*AllowedCsiDriverV1Beta1 `field:"optional" json:"allowedCsiDrivers" yaml:"allowedCsiDrivers"`
	// allowedFlexVolumes is a whitelist of allowed Flexvolumes.
	//
	// Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field.
	AllowedFlexVolumes *[]*AllowedFlexVolumeV1Beta1 `field:"optional" json:"allowedFlexVolumes" yaml:"allowedFlexVolumes"`
	// allowedHostPaths is a white list of allowed host paths.
	//
	// Empty indicates that all host paths may be used.
	AllowedHostPaths *[]*AllowedHostPathV1Beta1 `field:"optional" json:"allowedHostPaths" yaml:"allowedHostPaths"`
	// AllowedProcMountTypes is a whitelist of allowed ProcMountTypes.
	//
	// Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
	AllowedProcMountTypes *[]*string `field:"optional" json:"allowedProcMountTypes" yaml:"allowedProcMountTypes"`
	// allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none.
	//
	// Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
	//
	// Examples: e.g. "foo/*" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
	AllowedUnsafeSysctls *[]*string `field:"optional" json:"allowedUnsafeSysctls" yaml:"allowedUnsafeSysctls"`
	// allowPrivilegeEscalation determines if a pod can request to allow privilege escalation.
	//
	// If unspecified, defaults to true.
	AllowPrivilegeEscalation *bool `field:"optional" json:"allowPrivilegeEscalation" yaml:"allowPrivilegeEscalation"`
	// defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.
	//
	// You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
	DefaultAddCapabilities *[]*string `field:"optional" json:"defaultAddCapabilities" yaml:"defaultAddCapabilities"`
	// defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
	DefaultAllowPrivilegeEscalation *bool `field:"optional" json:"defaultAllowPrivilegeEscalation" yaml:"defaultAllowPrivilegeEscalation"`
	// forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none.
	//
	// Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
	//
	// Examples: e.g. "foo/*" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
	ForbiddenSysctls *[]*string `field:"optional" json:"forbiddenSysctls" yaml:"forbiddenSysctls"`
	// hostIPC determines if the policy allows the use of HostIPC in the pod spec.
	HostIpc *bool `field:"optional" json:"hostIpc" yaml:"hostIpc"`
	// hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
	HostNetwork *bool `field:"optional" json:"hostNetwork" yaml:"hostNetwork"`
	// hostPID determines if the policy allows the use of HostPID in the pod spec.
	HostPid *bool `field:"optional" json:"hostPid" yaml:"hostPid"`
	// hostPorts determines which host port ranges are allowed to be exposed.
	HostPorts *[]*HostPortRangeV1Beta1 `field:"optional" json:"hostPorts" yaml:"hostPorts"`
	// privileged determines if a pod can request to be run as privileged.
	Privileged *bool `field:"optional" json:"privileged" yaml:"privileged"`
	// readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.
	//
	// If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
	ReadOnlyRootFilesystem *bool `field:"optional" json:"readOnlyRootFilesystem" yaml:"readOnlyRootFilesystem"`
	// requiredDropCapabilities are the capabilities that will be dropped from the container.
	//
	// These are required to be dropped and cannot be added.
	RequiredDropCapabilities *[]*string `field:"optional" json:"requiredDropCapabilities" yaml:"requiredDropCapabilities"`
	// RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set.
	//
	// If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
	RunAsGroup *RunAsGroupStrategyOptionsV1Beta1 `field:"optional" json:"runAsGroup" yaml:"runAsGroup"`
	// runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod.
	//
	// If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
	RuntimeClass *RuntimeClassStrategyOptionsV1Beta1 `field:"optional" json:"runtimeClass" yaml:"runtimeClass"`
	// volumes is a white list of allowed volume plugins.
	//
	// Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
	Volumes *[]*string `field:"optional" json:"volumes" yaml:"volumes"`
}

