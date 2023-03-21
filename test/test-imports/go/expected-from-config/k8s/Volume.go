// k8s
package k8s


// Volume represents a named volume in a pod that may be accessed by any container in the pod.
type Volume struct {
	// Volume's name.
	//
	// Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
	Name *string `field:"required" json:"name" yaml:"name"`
	// AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
	AwsElasticBlockStore *AwsElasticBlockStoreVolumeSource `field:"optional" json:"awsElasticBlockStore" yaml:"awsElasticBlockStore"`
	// AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
	AzureDisk *AzureDiskVolumeSource `field:"optional" json:"azureDisk" yaml:"azureDisk"`
	// AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
	AzureFile *AzureFileVolumeSource `field:"optional" json:"azureFile" yaml:"azureFile"`
	// CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
	Cephfs *CephFsVolumeSource `field:"optional" json:"cephfs" yaml:"cephfs"`
	// Cinder represents a cinder volume attached and mounted on kubelets host machine.
	//
	// More info: https://examples.k8s.io/mysql-cinder-pd/README.md
	Cinder *CinderVolumeSource `field:"optional" json:"cinder" yaml:"cinder"`
	// ConfigMap represents a configMap that should populate this volume.
	ConfigMap *ConfigMapVolumeSource `field:"optional" json:"configMap" yaml:"configMap"`
	// CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
	Csi *CsiVolumeSource `field:"optional" json:"csi" yaml:"csi"`
	// DownwardAPI represents downward API about the pod that should populate this volume.
	DownwardApi *DownwardApiVolumeSource `field:"optional" json:"downwardApi" yaml:"downwardApi"`
	// EmptyDir represents a temporary directory that shares a pod's lifetime.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
	EmptyDir *EmptyDirVolumeSource `field:"optional" json:"emptyDir" yaml:"emptyDir"`
	// FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
	Fc *FcVolumeSource `field:"optional" json:"fc" yaml:"fc"`
	// FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
	FlexVolume *FlexVolumeSource `field:"optional" json:"flexVolume" yaml:"flexVolume"`
	// Flocker represents a Flocker volume attached to a kubelet's host machine.
	//
	// This depends on the Flocker control service being running.
	Flocker *FlockerVolumeSource `field:"optional" json:"flocker" yaml:"flocker"`
	// GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
	GcePersistentDisk *GcePersistentDiskVolumeSource `field:"optional" json:"gcePersistentDisk" yaml:"gcePersistentDisk"`
	// GitRepo represents a git repository at a particular revision.
	//
	// DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
	GitRepo *GitRepoVolumeSource `field:"optional" json:"gitRepo" yaml:"gitRepo"`
	// Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.
	//
	// More info: https://examples.k8s.io/volumes/glusterfs/README.md
	Glusterfs *GlusterfsVolumeSource `field:"optional" json:"glusterfs" yaml:"glusterfs"`
	// HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.
	//
	// This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
	HostPath *HostPathVolumeSource `field:"optional" json:"hostPath" yaml:"hostPath"`
	// ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
	//
	// More info: https://examples.k8s.io/volumes/iscsi/README.md
	Iscsi *IscsiVolumeSource `field:"optional" json:"iscsi" yaml:"iscsi"`
	// NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
	Nfs *NfsVolumeSource `field:"optional" json:"nfs" yaml:"nfs"`
	// PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
	PersistentVolumeClaim *PersistentVolumeClaimVolumeSource `field:"optional" json:"persistentVolumeClaim" yaml:"persistentVolumeClaim"`
	// PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
	PhotonPersistentDisk *PhotonPersistentDiskVolumeSource `field:"optional" json:"photonPersistentDisk" yaml:"photonPersistentDisk"`
	// PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
	PortworxVolume *PortworxVolumeSource `field:"optional" json:"portworxVolume" yaml:"portworxVolume"`
	// Items for all in one resources secrets, configmaps, and downward API.
	Projected *ProjectedVolumeSource `field:"optional" json:"projected" yaml:"projected"`
	// Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
	Quobyte *QuobyteVolumeSource `field:"optional" json:"quobyte" yaml:"quobyte"`
	// RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.
	//
	// More info: https://examples.k8s.io/volumes/rbd/README.md
	Rbd *RbdVolumeSource `field:"optional" json:"rbd" yaml:"rbd"`
	// ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
	ScaleIo *ScaleIoVolumeSource `field:"optional" json:"scaleIo" yaml:"scaleIo"`
	// Secret represents a secret that should populate this volume.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
	Secret *SecretVolumeSource `field:"optional" json:"secret" yaml:"secret"`
	// StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
	Storageos *StorageOsVolumeSource `field:"optional" json:"storageos" yaml:"storageos"`
	// VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
	VsphereVolume *VsphereVirtualDiskVolumeSource `field:"optional" json:"vsphereVolume" yaml:"vsphereVolume"`
}

