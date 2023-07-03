package k8s


// EndpointSubset is a group of addresses with a common set of ports.
//
// The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:
// {
// Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
// Ports:     [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
// }
// The resulting set of endpoints can be viewed as:
// a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
// b: [ 10.10.1.1:309, 10.10.2.2:309 ]
type EndpointSubset struct {
	// IP addresses which offer the related ports that are marked as ready.
	//
	// These endpoints should be considered safe for load balancers and clients to utilize.
	Addresses *[]*EndpointAddress `field:"optional" json:"addresses" yaml:"addresses"`
	// IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
	NotReadyAddresses *[]*EndpointAddress `field:"optional" json:"notReadyAddresses" yaml:"notReadyAddresses"`
	// Port numbers available on the related IP addresses.
	Ports *[]*EndpointPort `field:"optional" json:"ports" yaml:"ports"`
}

