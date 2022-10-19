// k8s
package k8s


// ConfigMap holds configuration data for pods to consume.
type KubeConfigMapProps struct {
	// BinaryData contains the binary data.
	//
	// Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
	BinaryData *map[string]*string `field:"optional" json:"binaryData" yaml:"binaryData"`
	// Data contains the configuration data.
	//
	// Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
	Data *map[string]*string `field:"optional" json:"data" yaml:"data"`
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

