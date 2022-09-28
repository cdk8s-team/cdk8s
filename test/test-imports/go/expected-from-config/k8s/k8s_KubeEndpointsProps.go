// k8s
package k8s


// Endpoints is a collection of endpoints that implement the actual service.
//
// Example:
// Name: "mysvc",
// Subsets: [
// {
// Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
// Ports: [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
// },
// {
// Addresses: [{"ip": "10.10.3.3"}],
// Ports: [{"name": "a", "port": 93}, {"name": "b", "port": 76}]
// },
// ].
type KubeEndpointsProps struct {
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// The set of all endpoints is the union of all subsets.
	//
	// Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
	Subsets *[]*EndpointSubset `field:"optional" json:"subsets" yaml:"subsets"`
}

