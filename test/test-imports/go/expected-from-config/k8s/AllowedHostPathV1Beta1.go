package k8s


// AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to use.
//
// It requires the path prefix to be defined.
type AllowedHostPathV1Beta1 struct {
	// pathPrefix is the path prefix that the host volume must match.
	//
	// It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.
	//
	// Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`.
	PathPrefix *string `field:"optional" json:"pathPrefix" yaml:"pathPrefix"`
	// when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
}

