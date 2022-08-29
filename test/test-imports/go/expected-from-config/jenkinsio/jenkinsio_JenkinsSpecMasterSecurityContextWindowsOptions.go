// jenkinsio
package jenkinsio


// The Windows specific settings applied to all containers.
//
// If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
type JenkinsSpecMasterSecurityContextWindowsOptions struct {
	// GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
	GmsaCredentialSpec *string `field:"optional" json:"gmsaCredentialSpec" yaml:"gmsaCredentialSpec"`
	// GMSACredentialSpecName is the name of the GMSA credential spec to use.
	//
	// This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
	GmsaCredentialSpecName *string `field:"optional" json:"gmsaCredentialSpecName" yaml:"gmsaCredentialSpecName"`
	// The UserName in Windows to run the entrypoint of the container process.
	//
	// Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.
	RunAsUserName *string `field:"optional" json:"runAsUserName" yaml:"runAsUserName"`
}

