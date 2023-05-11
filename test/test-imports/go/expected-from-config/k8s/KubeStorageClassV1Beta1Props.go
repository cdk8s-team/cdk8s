package k8s


// StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
//
// StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
type KubeStorageClassV1Beta1Props struct {
	// Provisioner indicates the type of the provisioner.
	Provisioner *string `field:"required" json:"provisioner" yaml:"provisioner"`
	// Restrict the node topologies where volumes can be dynamically provisioned.
	//
	// Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
	AllowedTopologies *[]*TopologySelectorTerm `field:"optional" json:"allowedTopologies" yaml:"allowedTopologies"`
	// AllowVolumeExpansion shows whether the storage class allow volume expand.
	AllowVolumeExpansion *bool `field:"optional" json:"allowVolumeExpansion" yaml:"allowVolumeExpansion"`
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
	MountOptions *[]*string `field:"optional" json:"mountOptions" yaml:"mountOptions"`
	// Parameters holds the parameters for the provisioner that should create volumes of this storage class.
	Parameters *map[string]*string `field:"optional" json:"parameters" yaml:"parameters"`
	// Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy.
	//
	// Defaults to Delete.
	ReclaimPolicy *string `field:"optional" json:"reclaimPolicy" yaml:"reclaimPolicy"`
	// VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
	//
	// When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
	VolumeBindingMode *string `field:"optional" json:"volumeBindingMode" yaml:"volumeBindingMode"`
}

