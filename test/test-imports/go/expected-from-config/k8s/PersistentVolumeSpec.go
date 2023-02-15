// k8s
package k8s


// PersistentVolumeSpec is the specification of a persistent volume.
type PersistentVolumeSpec struct {
	// AccessModes contains all ways the volume can be mounted.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
	AccessModes *[]*string `field:"optional" json:"accessModes" yaml:"accessModes"`
	// AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
	AwsElasticBlockStore *AwsElasticBlockStoreVolumeSource `field:"optional" json:"awsElasticBlockStore" yaml:"awsElasticBlockStore"`
	// AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
	AzureDisk *AzureDiskVolumeSource `field:"optional" json:"azureDisk" yaml:"azureDisk"`
	// AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
	AzureFile *AzureFilePersistentVolumeSource `field:"optional" json:"azureFile" yaml:"azureFile"`
	// A description of the persistent volume's resources and capacity.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
	Capacity *map[string]Quantity `field:"optional" json:"capacity" yaml:"capacity"`
	// CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
	Cephfs *CephFsPersistentVolumeSource `field:"optional" json:"cephfs" yaml:"cephfs"`
	// Cinder represents a cinder volume attached and mounted on kubelets host machine.
	//
	// More info: https://examples.k8s.io/mysql-cinder-pd/README.md
	Cinder *CinderPersistentVolumeSource `field:"optional" json:"cinder" yaml:"cinder"`
	// ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.
	//
	// Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
	ClaimRef *ObjectReference `field:"optional" json:"claimRef" yaml:"claimRef"`
	// CSI represents storage that is handled by an external CSI driver (Beta feature).
	Csi *CsiPersistentVolumeSource `field:"optional" json:"csi" yaml:"csi"`
	// FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
	Fc *FcVolumeSource `field:"optional" json:"fc" yaml:"fc"`
	// FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
	FlexVolume *FlexPersistentVolumeSource `field:"optional" json:"flexVolume" yaml:"flexVolume"`
	// Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage.
	//
	// This depends on the Flocker control service being running.
	Flocker *FlockerVolumeSource `field:"optional" json:"flocker" yaml:"flocker"`
	// GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
	//
	// Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
	GcePersistentDisk *GcePersistentDiskVolumeSource `field:"optional" json:"gcePersistentDisk" yaml:"gcePersistentDisk"`
	// Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod.
	//
	// Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
	Glusterfs *GlusterfsPersistentVolumeSource `field:"optional" json:"glusterfs" yaml:"glusterfs"`
	// HostPath represents a directory on the host.
	//
	// Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
	HostPath *HostPathVolumeSource `field:"optional" json:"hostPath" yaml:"hostPath"`
	// ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
	//
	// Provisioned by an admin.
	Iscsi *IscsiPersistentVolumeSource `field:"optional" json:"iscsi" yaml:"iscsi"`
	// Local represents directly-attached storage with node affinity.
	Local *LocalVolumeSource `field:"optional" json:"local" yaml:"local"`
	// A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options.
	MountOptions *[]*string `field:"optional" json:"mountOptions" yaml:"mountOptions"`
	// NFS represents an NFS mount on the host.
	//
	// Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
	Nfs *NfsVolumeSource `field:"optional" json:"nfs" yaml:"nfs"`
	// NodeAffinity defines constraints that limit what nodes this volume can be accessed from.
	//
	// This field influences the scheduling of pods that use this volume.
	NodeAffinity *VolumeNodeAffinity `field:"optional" json:"nodeAffinity" yaml:"nodeAffinity"`
	// What happens to a persistent volume when released from its claim.
	//
	// Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
	PersistentVolumeReclaimPolicy *string `field:"optional" json:"persistentVolumeReclaimPolicy" yaml:"persistentVolumeReclaimPolicy"`
	// PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
	PhotonPersistentDisk *PhotonPersistentDiskVolumeSource `field:"optional" json:"photonPersistentDisk" yaml:"photonPersistentDisk"`
	// PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
	PortworxVolume *PortworxVolumeSource `field:"optional" json:"portworxVolume" yaml:"portworxVolume"`
	// Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
	Quobyte *QuobyteVolumeSource `field:"optional" json:"quobyte" yaml:"quobyte"`
	// RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.
	//
	// More info: https://examples.k8s.io/volumes/rbd/README.md
	Rbd *RbdPersistentVolumeSource `field:"optional" json:"rbd" yaml:"rbd"`
	// ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
	ScaleIo *ScaleIoPersistentVolumeSource `field:"optional" json:"scaleIo" yaml:"scaleIo"`
	// Name of StorageClass to which this persistent volume belongs.
	//
	// Empty value means that this volume does not belong to any StorageClass.
	StorageClassName *string `field:"optional" json:"storageClassName" yaml:"storageClassName"`
	// StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md.
	Storageos *StorageOsPersistentVolumeSource `field:"optional" json:"storageos" yaml:"storageos"`
	// volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state.
	//
	// Value of Filesystem is implied when not included in spec. This is a beta feature.
	VolumeMode *string `field:"optional" json:"volumeMode" yaml:"volumeMode"`
	// VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
	VsphereVolume *VsphereVirtualDiskVolumeSource `field:"optional" json:"vsphereVolume" yaml:"vsphereVolume"`
}

