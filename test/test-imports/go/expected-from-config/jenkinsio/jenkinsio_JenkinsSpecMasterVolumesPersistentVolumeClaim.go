// jenkinsio
package jenkinsio


// PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
//
// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
type JenkinsSpecMasterVolumesPersistentVolumeClaim struct {
	// ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
	ClaimName *string `field:"required" json:"claimName" yaml:"claimName"`
	// Will force the ReadOnly setting in VolumeMounts.
	//
	// Default false.
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
}

