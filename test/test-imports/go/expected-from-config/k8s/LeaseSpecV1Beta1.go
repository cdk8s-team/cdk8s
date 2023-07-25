package k8s

import (
	"time"
)

// LeaseSpec is a specification of a Lease.
type LeaseSpecV1Beta1 struct {
	// acquireTime is a time when the current lease was acquired.
	AcquireTime *time.Time `field:"optional" json:"acquireTime" yaml:"acquireTime"`
	// holderIdentity contains the identity of the holder of a current lease.
	HolderIdentity *string `field:"optional" json:"holderIdentity" yaml:"holderIdentity"`
	// leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it.
	//
	// This is measure against time of last observed RenewTime.
	LeaseDurationSeconds *float64 `field:"optional" json:"leaseDurationSeconds" yaml:"leaseDurationSeconds"`
	// leaseTransitions is the number of transitions of a lease between holders.
	LeaseTransitions *float64 `field:"optional" json:"leaseTransitions" yaml:"leaseTransitions"`
	// renewTime is a time when the current holder of a lease has last updated the lease.
	RenewTime *time.Time `field:"optional" json:"renewTime" yaml:"renewTime"`
}

