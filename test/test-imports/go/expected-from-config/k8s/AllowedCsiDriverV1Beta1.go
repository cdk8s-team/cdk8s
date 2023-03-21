// k8s
package k8s


// AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
type AllowedCsiDriverV1Beta1 struct {
	// Name is the registered name of the CSI driver.
	Name *string `field:"required" json:"name" yaml:"name"`
}

