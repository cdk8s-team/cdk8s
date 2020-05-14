package k8s;

/**
 * PersistentVolumeSpec is the specification of a persistent volume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.337Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PersistentVolumeSpec")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeSpec.Jsii$Proxy.class)
public interface PersistentVolumeSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * AccessModes contains all ways the volume can be mounted.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessModes() {
        return null;
    }

    /**
     * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     */
    default @org.jetbrains.annotations.Nullable k8s.AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
        return null;
    }

    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     */
    default @org.jetbrains.annotations.Nullable k8s.AzureDiskVolumeSource getAzureDisk() {
        return null;
    }

    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     */
    default @org.jetbrains.annotations.Nullable k8s.AzureFilePersistentVolumeSource getAzureFile() {
        return null;
    }

    /**
     * A description of the persistent volume's resources and capacity.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, k8s.Quantity> getCapacity() {
        return null;
    }

    /**
     * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
     */
    default @org.jetbrains.annotations.Nullable k8s.CephFSPersistentVolumeSource getCephfs() {
        return null;
    }

    /**
     * Cinder represents a cinder volume attached and mounted on kubelets host machine.
     * <p>
     * More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    default @org.jetbrains.annotations.Nullable k8s.CinderPersistentVolumeSource getCinder() {
        return null;
    }

    /**
     * ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.
     * <p>
     * Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectReference getClaimRef() {
        return null;
    }

    /**
     * CSI represents storage that is handled by an external CSI driver (Beta feature).
     */
    default @org.jetbrains.annotations.Nullable k8s.CSIPersistentVolumeSource getCsi() {
        return null;
    }

    /**
     * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
     */
    default @org.jetbrains.annotations.Nullable k8s.FCVolumeSource getFc() {
        return null;
    }

    /**
     * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     */
    default @org.jetbrains.annotations.Nullable k8s.FlexPersistentVolumeSource getFlexVolume() {
        return null;
    }

    /**
     * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage.
     * <p>
     * This depends on the Flocker control service being running
     */
    default @org.jetbrains.annotations.Nullable k8s.FlockerVolumeSource getFlocker() {
        return null;
    }

    /**
     * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    default @org.jetbrains.annotations.Nullable k8s.GCEPersistentDiskVolumeSource getGcePersistentDisk() {
        return null;
    }

    /**
     * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod.
     * <p>
     * Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
     */
    default @org.jetbrains.annotations.Nullable k8s.GlusterfsPersistentVolumeSource getGlusterfs() {
        return null;
    }

    /**
     * HostPath represents a directory on the host.
     * <p>
     * Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     */
    default @org.jetbrains.annotations.Nullable k8s.HostPathVolumeSource getHostPath() {
        return null;
    }

    /**
     * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * Provisioned by an admin.
     */
    default @org.jetbrains.annotations.Nullable k8s.IscsiPersistentVolumeSource getIscsi() {
        return null;
    }

    /**
     * Local represents directly-attached storage with node affinity.
     */
    default @org.jetbrains.annotations.Nullable k8s.LocalVolumeSource getLocal() {
        return null;
    }

    /**
     * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMountOptions() {
        return null;
    }

    /**
     * NFS represents an NFS mount on the host.
     * <p>
     * Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     */
    default @org.jetbrains.annotations.Nullable k8s.NFSVolumeSource getNfs() {
        return null;
    }

    /**
     * NodeAffinity defines constraints that limit what nodes this volume can be accessed from.
     * <p>
     * This field influences the scheduling of pods that use this volume.
     */
    default @org.jetbrains.annotations.Nullable k8s.VolumeNodeAffinity getNodeAffinity() {
        return null;
    }

    /**
     * What happens to a persistent volume when released from its claim.
     * <p>
     * Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPersistentVolumeReclaimPolicy() {
        return null;
    }

    /**
     * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable k8s.PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
        return null;
    }

    /**
     * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable k8s.PortworxVolumeSource getPortworxVolume() {
        return null;
    }

    /**
     * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
     */
    default @org.jetbrains.annotations.Nullable k8s.QuobyteVolumeSource getQuobyte() {
        return null;
    }

    /**
     * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.
     * <p>
     * More info: https://examples.k8s.io/volumes/rbd/README.md
     */
    default @org.jetbrains.annotations.Nullable k8s.RBDPersistentVolumeSource getRbd() {
        return null;
    }

    /**
     * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     */
    default @org.jetbrains.annotations.Nullable k8s.ScaleIOPersistentVolumeSource getScaleIo() {
        return null;
    }

    /**
     * Name of StorageClass to which this persistent volume belongs.
     * <p>
     * Empty value means that this volume does not belong to any StorageClass.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClassName() {
        return null;
    }

    /**
     * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md.
     */
    default @org.jetbrains.annotations.Nullable k8s.StorageOSPersistentVolumeSource getStorageos() {
        return null;
    }

    /**
     * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state.
     * <p>
     * Value of Filesystem is implied when not included in spec. This is a beta feature.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeMode() {
        return null;
    }

    /**
     * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable k8s.VsphereVirtualDiskVolumeSource getVsphereVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeSpec}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> accessModes;
        private k8s.AWSElasticBlockStoreVolumeSource awsElasticBlockStore;
        private k8s.AzureDiskVolumeSource azureDisk;
        private k8s.AzureFilePersistentVolumeSource azureFile;
        private java.util.Map<java.lang.String, k8s.Quantity> capacity;
        private k8s.CephFSPersistentVolumeSource cephfs;
        private k8s.CinderPersistentVolumeSource cinder;
        private k8s.ObjectReference claimRef;
        private k8s.CSIPersistentVolumeSource csi;
        private k8s.FCVolumeSource fc;
        private k8s.FlexPersistentVolumeSource flexVolume;
        private k8s.FlockerVolumeSource flocker;
        private k8s.GCEPersistentDiskVolumeSource gcePersistentDisk;
        private k8s.GlusterfsPersistentVolumeSource glusterfs;
        private k8s.HostPathVolumeSource hostPath;
        private k8s.IscsiPersistentVolumeSource iscsi;
        private k8s.LocalVolumeSource local;
        private java.util.List<java.lang.String> mountOptions;
        private k8s.NFSVolumeSource nfs;
        private k8s.VolumeNodeAffinity nodeAffinity;
        private java.lang.String persistentVolumeReclaimPolicy;
        private k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk;
        private k8s.PortworxVolumeSource portworxVolume;
        private k8s.QuobyteVolumeSource quobyte;
        private k8s.RBDPersistentVolumeSource rbd;
        private k8s.ScaleIOPersistentVolumeSource scaleIo;
        private java.lang.String storageClassName;
        private k8s.StorageOSPersistentVolumeSource storageos;
        private java.lang.String volumeMode;
        private k8s.VsphereVirtualDiskVolumeSource vsphereVolume;

        /**
         * Sets the value of {@link PersistentVolumeSpec#getAccessModes}
         * @param accessModes AccessModes contains all ways the volume can be mounted.
         *                    More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
         * @return {@code this}
         */
        public Builder accessModes(java.util.List<java.lang.String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getAwsElasticBlockStore}
         * @param awsElasticBlockStore AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *                             More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
         * @return {@code this}
         */
        public Builder awsElasticBlockStore(k8s.AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getAzureDisk}
         * @param azureDisk AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
         * @return {@code this}
         */
        public Builder azureDisk(k8s.AzureDiskVolumeSource azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getAzureFile}
         * @param azureFile AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
         * @return {@code this}
         */
        public Builder azureFile(k8s.AzureFilePersistentVolumeSource azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getCapacity}
         * @param capacity A description of the persistent volume's resources and capacity.
         *                 More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
         * @return {@code this}
         */
        public Builder capacity(java.util.Map<java.lang.String, k8s.Quantity> capacity) {
            this.capacity = capacity;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getCephfs}
         * @param cephfs CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
         * @return {@code this}
         */
        public Builder cephfs(k8s.CephFSPersistentVolumeSource cephfs) {
            this.cephfs = cephfs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getCinder}
         * @param cinder Cinder represents a cinder volume attached and mounted on kubelets host machine.
         *               More info: https://examples.k8s.io/mysql-cinder-pd/README.md
         * @return {@code this}
         */
        public Builder cinder(k8s.CinderPersistentVolumeSource cinder) {
            this.cinder = cinder;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getClaimRef}
         * @param claimRef ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim.
         *                 Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
         * @return {@code this}
         */
        public Builder claimRef(k8s.ObjectReference claimRef) {
            this.claimRef = claimRef;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getCsi}
         * @param csi CSI represents storage that is handled by an external CSI driver (Beta feature).
         * @return {@code this}
         */
        public Builder csi(k8s.CSIPersistentVolumeSource csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getFc}
         * @param fc FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
         * @return {@code this}
         */
        public Builder fc(k8s.FCVolumeSource fc) {
            this.fc = fc;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getFlexVolume}
         * @param flexVolume FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
         * @return {@code this}
         */
        public Builder flexVolume(k8s.FlexPersistentVolumeSource flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getFlocker}
         * @param flocker Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage.
         *                This depends on the Flocker control service being running
         * @return {@code this}
         */
        public Builder flocker(k8s.FlockerVolumeSource flocker) {
            this.flocker = flocker;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getGcePersistentDisk}
         * @param gcePersistentDisk GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *                          Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
         * @return {@code this}
         */
        public Builder gcePersistentDisk(k8s.GCEPersistentDiskVolumeSource gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getGlusterfs}
         * @param glusterfs Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod.
         *                  Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
         * @return {@code this}
         */
        public Builder glusterfs(k8s.GlusterfsPersistentVolumeSource glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getHostPath}
         * @param hostPath HostPath represents a directory on the host.
         *                 Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
         * @return {@code this}
         */
        public Builder hostPath(k8s.HostPathVolumeSource hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getIscsi}
         * @param iscsi ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *              Provisioned by an admin.
         * @return {@code this}
         */
        public Builder iscsi(k8s.IscsiPersistentVolumeSource iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getLocal}
         * @param local Local represents directly-attached storage with node affinity.
         * @return {@code this}
         */
        public Builder local(k8s.LocalVolumeSource local) {
            this.local = local;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getMountOptions}
         * @param mountOptions A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options.
         * @return {@code this}
         */
        public Builder mountOptions(java.util.List<java.lang.String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getNfs}
         * @param nfs NFS represents an NFS mount on the host.
         *            Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
         * @return {@code this}
         */
        public Builder nfs(k8s.NFSVolumeSource nfs) {
            this.nfs = nfs;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getNodeAffinity}
         * @param nodeAffinity NodeAffinity defines constraints that limit what nodes this volume can be accessed from.
         *                     This field influences the scheduling of pods that use this volume.
         * @return {@code this}
         */
        public Builder nodeAffinity(k8s.VolumeNodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getPersistentVolumeReclaimPolicy}
         * @param persistentVolumeReclaimPolicy What happens to a persistent volume when released from its claim.
         *                                      Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
         * @return {@code this}
         */
        public Builder persistentVolumeReclaimPolicy(java.lang.String persistentVolumeReclaimPolicy) {
            this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getPhotonPersistentDisk}
         * @param photonPersistentDisk PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder photonPersistentDisk(k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getPortworxVolume}
         * @param portworxVolume PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder portworxVolume(k8s.PortworxVolumeSource portworxVolume) {
            this.portworxVolume = portworxVolume;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getQuobyte}
         * @param quobyte Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
         * @return {@code this}
         */
        public Builder quobyte(k8s.QuobyteVolumeSource quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getRbd}
         * @param rbd RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.
         *            More info: https://examples.k8s.io/volumes/rbd/README.md
         * @return {@code this}
         */
        public Builder rbd(k8s.RBDPersistentVolumeSource rbd) {
            this.rbd = rbd;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getScaleIo}
         * @param scaleIo ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
         * @return {@code this}
         */
        public Builder scaleIo(k8s.ScaleIOPersistentVolumeSource scaleIo) {
            this.scaleIo = scaleIo;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getStorageClassName}
         * @param storageClassName Name of StorageClass to which this persistent volume belongs.
         *                         Empty value means that this volume does not belong to any StorageClass.
         * @return {@code this}
         */
        public Builder storageClassName(java.lang.String storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getStorageos}
         * @param storageos StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md.
         * @return {@code this}
         */
        public Builder storageos(k8s.StorageOSPersistentVolumeSource storageos) {
            this.storageos = storageos;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getVolumeMode}
         * @param volumeMode volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state.
         *                   Value of Filesystem is implied when not included in spec. This is a beta feature.
         * @return {@code this}
         */
        public Builder volumeMode(java.lang.String volumeMode) {
            this.volumeMode = volumeMode;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeSpec#getVsphereVolume}
         * @param vsphereVolume VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder vsphereVolume(k8s.VsphereVirtualDiskVolumeSource vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PersistentVolumeSpec build() {
            return new Jsii$Proxy(accessModes, awsElasticBlockStore, azureDisk, azureFile, capacity, cephfs, cinder, claimRef, csi, fc, flexVolume, flocker, gcePersistentDisk, glusterfs, hostPath, iscsi, local, mountOptions, nfs, nodeAffinity, persistentVolumeReclaimPolicy, photonPersistentDisk, portworxVolume, quobyte, rbd, scaleIo, storageClassName, storageos, volumeMode, vsphereVolume);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeSpec {
        private final java.util.List<java.lang.String> accessModes;
        private final k8s.AWSElasticBlockStoreVolumeSource awsElasticBlockStore;
        private final k8s.AzureDiskVolumeSource azureDisk;
        private final k8s.AzureFilePersistentVolumeSource azureFile;
        private final java.util.Map<java.lang.String, k8s.Quantity> capacity;
        private final k8s.CephFSPersistentVolumeSource cephfs;
        private final k8s.CinderPersistentVolumeSource cinder;
        private final k8s.ObjectReference claimRef;
        private final k8s.CSIPersistentVolumeSource csi;
        private final k8s.FCVolumeSource fc;
        private final k8s.FlexPersistentVolumeSource flexVolume;
        private final k8s.FlockerVolumeSource flocker;
        private final k8s.GCEPersistentDiskVolumeSource gcePersistentDisk;
        private final k8s.GlusterfsPersistentVolumeSource glusterfs;
        private final k8s.HostPathVolumeSource hostPath;
        private final k8s.IscsiPersistentVolumeSource iscsi;
        private final k8s.LocalVolumeSource local;
        private final java.util.List<java.lang.String> mountOptions;
        private final k8s.NFSVolumeSource nfs;
        private final k8s.VolumeNodeAffinity nodeAffinity;
        private final java.lang.String persistentVolumeReclaimPolicy;
        private final k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk;
        private final k8s.PortworxVolumeSource portworxVolume;
        private final k8s.QuobyteVolumeSource quobyte;
        private final k8s.RBDPersistentVolumeSource rbd;
        private final k8s.ScaleIOPersistentVolumeSource scaleIo;
        private final java.lang.String storageClassName;
        private final k8s.StorageOSPersistentVolumeSource storageos;
        private final java.lang.String volumeMode;
        private final k8s.VsphereVirtualDiskVolumeSource vsphereVolume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessModes = this.jsiiGet("accessModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.awsElasticBlockStore = this.jsiiGet("awsElasticBlockStore", k8s.AWSElasticBlockStoreVolumeSource.class);
            this.azureDisk = this.jsiiGet("azureDisk", k8s.AzureDiskVolumeSource.class);
            this.azureFile = this.jsiiGet("azureFile", k8s.AzureFilePersistentVolumeSource.class);
            this.capacity = this.jsiiGet("capacity", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(k8s.Quantity.class)));
            this.cephfs = this.jsiiGet("cephfs", k8s.CephFSPersistentVolumeSource.class);
            this.cinder = this.jsiiGet("cinder", k8s.CinderPersistentVolumeSource.class);
            this.claimRef = this.jsiiGet("claimRef", k8s.ObjectReference.class);
            this.csi = this.jsiiGet("csi", k8s.CSIPersistentVolumeSource.class);
            this.fc = this.jsiiGet("fc", k8s.FCVolumeSource.class);
            this.flexVolume = this.jsiiGet("flexVolume", k8s.FlexPersistentVolumeSource.class);
            this.flocker = this.jsiiGet("flocker", k8s.FlockerVolumeSource.class);
            this.gcePersistentDisk = this.jsiiGet("gcePersistentDisk", k8s.GCEPersistentDiskVolumeSource.class);
            this.glusterfs = this.jsiiGet("glusterfs", k8s.GlusterfsPersistentVolumeSource.class);
            this.hostPath = this.jsiiGet("hostPath", k8s.HostPathVolumeSource.class);
            this.iscsi = this.jsiiGet("iscsi", k8s.IscsiPersistentVolumeSource.class);
            this.local = this.jsiiGet("local", k8s.LocalVolumeSource.class);
            this.mountOptions = this.jsiiGet("mountOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.nfs = this.jsiiGet("nfs", k8s.NFSVolumeSource.class);
            this.nodeAffinity = this.jsiiGet("nodeAffinity", k8s.VolumeNodeAffinity.class);
            this.persistentVolumeReclaimPolicy = this.jsiiGet("persistentVolumeReclaimPolicy", java.lang.String.class);
            this.photonPersistentDisk = this.jsiiGet("photonPersistentDisk", k8s.PhotonPersistentDiskVolumeSource.class);
            this.portworxVolume = this.jsiiGet("portworxVolume", k8s.PortworxVolumeSource.class);
            this.quobyte = this.jsiiGet("quobyte", k8s.QuobyteVolumeSource.class);
            this.rbd = this.jsiiGet("rbd", k8s.RBDPersistentVolumeSource.class);
            this.scaleIo = this.jsiiGet("scaleIO", k8s.ScaleIOPersistentVolumeSource.class);
            this.storageClassName = this.jsiiGet("storageClassName", java.lang.String.class);
            this.storageos = this.jsiiGet("storageos", k8s.StorageOSPersistentVolumeSource.class);
            this.volumeMode = this.jsiiGet("volumeMode", java.lang.String.class);
            this.vsphereVolume = this.jsiiGet("vsphereVolume", k8s.VsphereVirtualDiskVolumeSource.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> accessModes, final k8s.AWSElasticBlockStoreVolumeSource awsElasticBlockStore, final k8s.AzureDiskVolumeSource azureDisk, final k8s.AzureFilePersistentVolumeSource azureFile, final java.util.Map<java.lang.String, k8s.Quantity> capacity, final k8s.CephFSPersistentVolumeSource cephfs, final k8s.CinderPersistentVolumeSource cinder, final k8s.ObjectReference claimRef, final k8s.CSIPersistentVolumeSource csi, final k8s.FCVolumeSource fc, final k8s.FlexPersistentVolumeSource flexVolume, final k8s.FlockerVolumeSource flocker, final k8s.GCEPersistentDiskVolumeSource gcePersistentDisk, final k8s.GlusterfsPersistentVolumeSource glusterfs, final k8s.HostPathVolumeSource hostPath, final k8s.IscsiPersistentVolumeSource iscsi, final k8s.LocalVolumeSource local, final java.util.List<java.lang.String> mountOptions, final k8s.NFSVolumeSource nfs, final k8s.VolumeNodeAffinity nodeAffinity, final java.lang.String persistentVolumeReclaimPolicy, final k8s.PhotonPersistentDiskVolumeSource photonPersistentDisk, final k8s.PortworxVolumeSource portworxVolume, final k8s.QuobyteVolumeSource quobyte, final k8s.RBDPersistentVolumeSource rbd, final k8s.ScaleIOPersistentVolumeSource scaleIo, final java.lang.String storageClassName, final k8s.StorageOSPersistentVolumeSource storageos, final java.lang.String volumeMode, final k8s.VsphereVirtualDiskVolumeSource vsphereVolume) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessModes = accessModes;
            this.awsElasticBlockStore = awsElasticBlockStore;
            this.azureDisk = azureDisk;
            this.azureFile = azureFile;
            this.capacity = capacity;
            this.cephfs = cephfs;
            this.cinder = cinder;
            this.claimRef = claimRef;
            this.csi = csi;
            this.fc = fc;
            this.flexVolume = flexVolume;
            this.flocker = flocker;
            this.gcePersistentDisk = gcePersistentDisk;
            this.glusterfs = glusterfs;
            this.hostPath = hostPath;
            this.iscsi = iscsi;
            this.local = local;
            this.mountOptions = mountOptions;
            this.nfs = nfs;
            this.nodeAffinity = nodeAffinity;
            this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
            this.photonPersistentDisk = photonPersistentDisk;
            this.portworxVolume = portworxVolume;
            this.quobyte = quobyte;
            this.rbd = rbd;
            this.scaleIo = scaleIo;
            this.storageClassName = storageClassName;
            this.storageos = storageos;
            this.volumeMode = volumeMode;
            this.vsphereVolume = vsphereVolume;
        }

        @Override
        public java.util.List<java.lang.String> getAccessModes() {
            return this.accessModes;
        }

        @Override
        public k8s.AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
            return this.awsElasticBlockStore;
        }

        @Override
        public k8s.AzureDiskVolumeSource getAzureDisk() {
            return this.azureDisk;
        }

        @Override
        public k8s.AzureFilePersistentVolumeSource getAzureFile() {
            return this.azureFile;
        }

        @Override
        public java.util.Map<java.lang.String, k8s.Quantity> getCapacity() {
            return this.capacity;
        }

        @Override
        public k8s.CephFSPersistentVolumeSource getCephfs() {
            return this.cephfs;
        }

        @Override
        public k8s.CinderPersistentVolumeSource getCinder() {
            return this.cinder;
        }

        @Override
        public k8s.ObjectReference getClaimRef() {
            return this.claimRef;
        }

        @Override
        public k8s.CSIPersistentVolumeSource getCsi() {
            return this.csi;
        }

        @Override
        public k8s.FCVolumeSource getFc() {
            return this.fc;
        }

        @Override
        public k8s.FlexPersistentVolumeSource getFlexVolume() {
            return this.flexVolume;
        }

        @Override
        public k8s.FlockerVolumeSource getFlocker() {
            return this.flocker;
        }

        @Override
        public k8s.GCEPersistentDiskVolumeSource getGcePersistentDisk() {
            return this.gcePersistentDisk;
        }

        @Override
        public k8s.GlusterfsPersistentVolumeSource getGlusterfs() {
            return this.glusterfs;
        }

        @Override
        public k8s.HostPathVolumeSource getHostPath() {
            return this.hostPath;
        }

        @Override
        public k8s.IscsiPersistentVolumeSource getIscsi() {
            return this.iscsi;
        }

        @Override
        public k8s.LocalVolumeSource getLocal() {
            return this.local;
        }

        @Override
        public java.util.List<java.lang.String> getMountOptions() {
            return this.mountOptions;
        }

        @Override
        public k8s.NFSVolumeSource getNfs() {
            return this.nfs;
        }

        @Override
        public k8s.VolumeNodeAffinity getNodeAffinity() {
            return this.nodeAffinity;
        }

        @Override
        public java.lang.String getPersistentVolumeReclaimPolicy() {
            return this.persistentVolumeReclaimPolicy;
        }

        @Override
        public k8s.PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
            return this.photonPersistentDisk;
        }

        @Override
        public k8s.PortworxVolumeSource getPortworxVolume() {
            return this.portworxVolume;
        }

        @Override
        public k8s.QuobyteVolumeSource getQuobyte() {
            return this.quobyte;
        }

        @Override
        public k8s.RBDPersistentVolumeSource getRbd() {
            return this.rbd;
        }

        @Override
        public k8s.ScaleIOPersistentVolumeSource getScaleIo() {
            return this.scaleIo;
        }

        @Override
        public java.lang.String getStorageClassName() {
            return this.storageClassName;
        }

        @Override
        public k8s.StorageOSPersistentVolumeSource getStorageos() {
            return this.storageos;
        }

        @Override
        public java.lang.String getVolumeMode() {
            return this.volumeMode;
        }

        @Override
        public k8s.VsphereVirtualDiskVolumeSource getVsphereVolume() {
            return this.vsphereVolume;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccessModes() != null) {
                data.set("accessModes", om.valueToTree(this.getAccessModes()));
            }
            if (this.getAwsElasticBlockStore() != null) {
                data.set("awsElasticBlockStore", om.valueToTree(this.getAwsElasticBlockStore()));
            }
            if (this.getAzureDisk() != null) {
                data.set("azureDisk", om.valueToTree(this.getAzureDisk()));
            }
            if (this.getAzureFile() != null) {
                data.set("azureFile", om.valueToTree(this.getAzureFile()));
            }
            if (this.getCapacity() != null) {
                data.set("capacity", om.valueToTree(this.getCapacity()));
            }
            if (this.getCephfs() != null) {
                data.set("cephfs", om.valueToTree(this.getCephfs()));
            }
            if (this.getCinder() != null) {
                data.set("cinder", om.valueToTree(this.getCinder()));
            }
            if (this.getClaimRef() != null) {
                data.set("claimRef", om.valueToTree(this.getClaimRef()));
            }
            if (this.getCsi() != null) {
                data.set("csi", om.valueToTree(this.getCsi()));
            }
            if (this.getFc() != null) {
                data.set("fc", om.valueToTree(this.getFc()));
            }
            if (this.getFlexVolume() != null) {
                data.set("flexVolume", om.valueToTree(this.getFlexVolume()));
            }
            if (this.getFlocker() != null) {
                data.set("flocker", om.valueToTree(this.getFlocker()));
            }
            if (this.getGcePersistentDisk() != null) {
                data.set("gcePersistentDisk", om.valueToTree(this.getGcePersistentDisk()));
            }
            if (this.getGlusterfs() != null) {
                data.set("glusterfs", om.valueToTree(this.getGlusterfs()));
            }
            if (this.getHostPath() != null) {
                data.set("hostPath", om.valueToTree(this.getHostPath()));
            }
            if (this.getIscsi() != null) {
                data.set("iscsi", om.valueToTree(this.getIscsi()));
            }
            if (this.getLocal() != null) {
                data.set("local", om.valueToTree(this.getLocal()));
            }
            if (this.getMountOptions() != null) {
                data.set("mountOptions", om.valueToTree(this.getMountOptions()));
            }
            if (this.getNfs() != null) {
                data.set("nfs", om.valueToTree(this.getNfs()));
            }
            if (this.getNodeAffinity() != null) {
                data.set("nodeAffinity", om.valueToTree(this.getNodeAffinity()));
            }
            if (this.getPersistentVolumeReclaimPolicy() != null) {
                data.set("persistentVolumeReclaimPolicy", om.valueToTree(this.getPersistentVolumeReclaimPolicy()));
            }
            if (this.getPhotonPersistentDisk() != null) {
                data.set("photonPersistentDisk", om.valueToTree(this.getPhotonPersistentDisk()));
            }
            if (this.getPortworxVolume() != null) {
                data.set("portworxVolume", om.valueToTree(this.getPortworxVolume()));
            }
            if (this.getQuobyte() != null) {
                data.set("quobyte", om.valueToTree(this.getQuobyte()));
            }
            if (this.getRbd() != null) {
                data.set("rbd", om.valueToTree(this.getRbd()));
            }
            if (this.getScaleIo() != null) {
                data.set("scaleIO", om.valueToTree(this.getScaleIo()));
            }
            if (this.getStorageClassName() != null) {
                data.set("storageClassName", om.valueToTree(this.getStorageClassName()));
            }
            if (this.getStorageos() != null) {
                data.set("storageos", om.valueToTree(this.getStorageos()));
            }
            if (this.getVolumeMode() != null) {
                data.set("volumeMode", om.valueToTree(this.getVolumeMode()));
            }
            if (this.getVsphereVolume() != null) {
                data.set("vsphereVolume", om.valueToTree(this.getVsphereVolume()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PersistentVolumeSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeSpec.Jsii$Proxy that = (PersistentVolumeSpec.Jsii$Proxy) o;

            if (this.accessModes != null ? !this.accessModes.equals(that.accessModes) : that.accessModes != null) return false;
            if (this.awsElasticBlockStore != null ? !this.awsElasticBlockStore.equals(that.awsElasticBlockStore) : that.awsElasticBlockStore != null) return false;
            if (this.azureDisk != null ? !this.azureDisk.equals(that.azureDisk) : that.azureDisk != null) return false;
            if (this.azureFile != null ? !this.azureFile.equals(that.azureFile) : that.azureFile != null) return false;
            if (this.capacity != null ? !this.capacity.equals(that.capacity) : that.capacity != null) return false;
            if (this.cephfs != null ? !this.cephfs.equals(that.cephfs) : that.cephfs != null) return false;
            if (this.cinder != null ? !this.cinder.equals(that.cinder) : that.cinder != null) return false;
            if (this.claimRef != null ? !this.claimRef.equals(that.claimRef) : that.claimRef != null) return false;
            if (this.csi != null ? !this.csi.equals(that.csi) : that.csi != null) return false;
            if (this.fc != null ? !this.fc.equals(that.fc) : that.fc != null) return false;
            if (this.flexVolume != null ? !this.flexVolume.equals(that.flexVolume) : that.flexVolume != null) return false;
            if (this.flocker != null ? !this.flocker.equals(that.flocker) : that.flocker != null) return false;
            if (this.gcePersistentDisk != null ? !this.gcePersistentDisk.equals(that.gcePersistentDisk) : that.gcePersistentDisk != null) return false;
            if (this.glusterfs != null ? !this.glusterfs.equals(that.glusterfs) : that.glusterfs != null) return false;
            if (this.hostPath != null ? !this.hostPath.equals(that.hostPath) : that.hostPath != null) return false;
            if (this.iscsi != null ? !this.iscsi.equals(that.iscsi) : that.iscsi != null) return false;
            if (this.local != null ? !this.local.equals(that.local) : that.local != null) return false;
            if (this.mountOptions != null ? !this.mountOptions.equals(that.mountOptions) : that.mountOptions != null) return false;
            if (this.nfs != null ? !this.nfs.equals(that.nfs) : that.nfs != null) return false;
            if (this.nodeAffinity != null ? !this.nodeAffinity.equals(that.nodeAffinity) : that.nodeAffinity != null) return false;
            if (this.persistentVolumeReclaimPolicy != null ? !this.persistentVolumeReclaimPolicy.equals(that.persistentVolumeReclaimPolicy) : that.persistentVolumeReclaimPolicy != null) return false;
            if (this.photonPersistentDisk != null ? !this.photonPersistentDisk.equals(that.photonPersistentDisk) : that.photonPersistentDisk != null) return false;
            if (this.portworxVolume != null ? !this.portworxVolume.equals(that.portworxVolume) : that.portworxVolume != null) return false;
            if (this.quobyte != null ? !this.quobyte.equals(that.quobyte) : that.quobyte != null) return false;
            if (this.rbd != null ? !this.rbd.equals(that.rbd) : that.rbd != null) return false;
            if (this.scaleIo != null ? !this.scaleIo.equals(that.scaleIo) : that.scaleIo != null) return false;
            if (this.storageClassName != null ? !this.storageClassName.equals(that.storageClassName) : that.storageClassName != null) return false;
            if (this.storageos != null ? !this.storageos.equals(that.storageos) : that.storageos != null) return false;
            if (this.volumeMode != null ? !this.volumeMode.equals(that.volumeMode) : that.volumeMode != null) return false;
            return this.vsphereVolume != null ? this.vsphereVolume.equals(that.vsphereVolume) : that.vsphereVolume == null;
        }

        @Override
        public int hashCode() {
            int result = this.accessModes != null ? this.accessModes.hashCode() : 0;
            result = 31 * result + (this.awsElasticBlockStore != null ? this.awsElasticBlockStore.hashCode() : 0);
            result = 31 * result + (this.azureDisk != null ? this.azureDisk.hashCode() : 0);
            result = 31 * result + (this.azureFile != null ? this.azureFile.hashCode() : 0);
            result = 31 * result + (this.capacity != null ? this.capacity.hashCode() : 0);
            result = 31 * result + (this.cephfs != null ? this.cephfs.hashCode() : 0);
            result = 31 * result + (this.cinder != null ? this.cinder.hashCode() : 0);
            result = 31 * result + (this.claimRef != null ? this.claimRef.hashCode() : 0);
            result = 31 * result + (this.csi != null ? this.csi.hashCode() : 0);
            result = 31 * result + (this.fc != null ? this.fc.hashCode() : 0);
            result = 31 * result + (this.flexVolume != null ? this.flexVolume.hashCode() : 0);
            result = 31 * result + (this.flocker != null ? this.flocker.hashCode() : 0);
            result = 31 * result + (this.gcePersistentDisk != null ? this.gcePersistentDisk.hashCode() : 0);
            result = 31 * result + (this.glusterfs != null ? this.glusterfs.hashCode() : 0);
            result = 31 * result + (this.hostPath != null ? this.hostPath.hashCode() : 0);
            result = 31 * result + (this.iscsi != null ? this.iscsi.hashCode() : 0);
            result = 31 * result + (this.local != null ? this.local.hashCode() : 0);
            result = 31 * result + (this.mountOptions != null ? this.mountOptions.hashCode() : 0);
            result = 31 * result + (this.nfs != null ? this.nfs.hashCode() : 0);
            result = 31 * result + (this.nodeAffinity != null ? this.nodeAffinity.hashCode() : 0);
            result = 31 * result + (this.persistentVolumeReclaimPolicy != null ? this.persistentVolumeReclaimPolicy.hashCode() : 0);
            result = 31 * result + (this.photonPersistentDisk != null ? this.photonPersistentDisk.hashCode() : 0);
            result = 31 * result + (this.portworxVolume != null ? this.portworxVolume.hashCode() : 0);
            result = 31 * result + (this.quobyte != null ? this.quobyte.hashCode() : 0);
            result = 31 * result + (this.rbd != null ? this.rbd.hashCode() : 0);
            result = 31 * result + (this.scaleIo != null ? this.scaleIo.hashCode() : 0);
            result = 31 * result + (this.storageClassName != null ? this.storageClassName.hashCode() : 0);
            result = 31 * result + (this.storageos != null ? this.storageos.hashCode() : 0);
            result = 31 * result + (this.volumeMode != null ? this.volumeMode.hashCode() : 0);
            result = 31 * result + (this.vsphereVolume != null ? this.vsphereVolume.hashCode() : 0);
            return result;
        }
    }
}
