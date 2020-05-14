package jenkins;

/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.642Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumes")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumes.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumes extends software.amazon.jsii.JsiiSerializable {

    /**
     * Volume's name.
     * <p>
     * Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return null;
    }

    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesAzureDisk getAzureDisk() {
        return null;
    }

    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesAzureFile getAzureFile() {
        return null;
    }

    /**
     * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesCephfs getCephfs() {
        return null;
    }

    /**
     * Cinder represents a cinder volume attached and mounted on kubelets host machine.
     * <p>
     * More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesCinder getCinder() {
        return null;
    }

    /**
     * ConfigMap represents a configMap that should populate this volume.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesConfigMap getConfigMap() {
        return null;
    }

    /**
     * CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesCsi getCsi() {
        return null;
    }

    /**
     * DownwardAPI represents downward API about the pod that should populate this volume.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesDownwardApi getDownwardApi() {
        return null;
    }

    /**
     * EmptyDir represents a temporary directory that shares a pod's lifetime.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesEmptyDir getEmptyDir() {
        return null;
    }

    /**
     * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesFc getFc() {
        return null;
    }

    /**
     * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesFlexVolume getFlexVolume() {
        return null;
    }

    /**
     * Flocker represents a Flocker volume attached to a kubelet's host machine.
     * <p>
     * This depends on the Flocker control service being running
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesFlocker getFlocker() {
        return null;
    }

    /**
     * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesGcePersistentDisk getGcePersistentDisk() {
        return null;
    }

    /**
     * GitRepo represents a git repository at a particular revision.
     * <p>
     * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesGitRepo getGitRepo() {
        return null;
    }

    /**
     * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.
     * <p>
     * More info: https://examples.k8s.io/volumes/glusterfs/README.md
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesGlusterfs getGlusterfs() {
        return null;
    }

    /**
     * HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.
     * <p>
     * This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesHostPath getHostPath() {
        return null;
    }

    /**
     * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
     * <p>
     * More info: https://examples.k8s.io/volumes/iscsi/README.md
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesIscsi getIscsi() {
        return null;
    }

    /**
     * NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesNfs getNfs() {
        return null;
    }

    /**
     * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return null;
    }

    /**
     * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return null;
    }

    /**
     * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesPortworxVolume getPortworxVolume() {
        return null;
    }

    /**
     * Items for all in one resources secrets, configmaps, and downward API.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesProjected getProjected() {
        return null;
    }

    /**
     * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesQuobyte getQuobyte() {
        return null;
    }

    /**
     * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.
     * <p>
     * More info: https://examples.k8s.io/volumes/rbd/README.md
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesRbd getRbd() {
        return null;
    }

    /**
     * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesScaleIo getScaleIo() {
        return null;
    }

    /**
     * Secret represents a secret that should populate this volume.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesSecret getSecret() {
        return null;
    }

    /**
     * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesStorageos getStorageos() {
        return null;
    }

    /**
     * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesVsphereVolume getVsphereVolume() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumes}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumes}
     */
    public static final class Builder {
        private java.lang.String name;
        private jenkins.JenkinsSpecMasterVolumesAwsElasticBlockStore awsElasticBlockStore;
        private jenkins.JenkinsSpecMasterVolumesAzureDisk azureDisk;
        private jenkins.JenkinsSpecMasterVolumesAzureFile azureFile;
        private jenkins.JenkinsSpecMasterVolumesCephfs cephfs;
        private jenkins.JenkinsSpecMasterVolumesCinder cinder;
        private jenkins.JenkinsSpecMasterVolumesConfigMap configMap;
        private jenkins.JenkinsSpecMasterVolumesCsi csi;
        private jenkins.JenkinsSpecMasterVolumesDownwardApi downwardApi;
        private jenkins.JenkinsSpecMasterVolumesEmptyDir emptyDir;
        private jenkins.JenkinsSpecMasterVolumesFc fc;
        private jenkins.JenkinsSpecMasterVolumesFlexVolume flexVolume;
        private jenkins.JenkinsSpecMasterVolumesFlocker flocker;
        private jenkins.JenkinsSpecMasterVolumesGcePersistentDisk gcePersistentDisk;
        private jenkins.JenkinsSpecMasterVolumesGitRepo gitRepo;
        private jenkins.JenkinsSpecMasterVolumesGlusterfs glusterfs;
        private jenkins.JenkinsSpecMasterVolumesHostPath hostPath;
        private jenkins.JenkinsSpecMasterVolumesIscsi iscsi;
        private jenkins.JenkinsSpecMasterVolumesNfs nfs;
        private jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim persistentVolumeClaim;
        private jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk photonPersistentDisk;
        private jenkins.JenkinsSpecMasterVolumesPortworxVolume portworxVolume;
        private jenkins.JenkinsSpecMasterVolumesProjected projected;
        private jenkins.JenkinsSpecMasterVolumesQuobyte quobyte;
        private jenkins.JenkinsSpecMasterVolumesRbd rbd;
        private jenkins.JenkinsSpecMasterVolumesScaleIo scaleIo;
        private jenkins.JenkinsSpecMasterVolumesSecret secret;
        private jenkins.JenkinsSpecMasterVolumesStorageos storageos;
        private jenkins.JenkinsSpecMasterVolumesVsphereVolume vsphereVolume;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getName}
         * @param name Volume's name. This parameter is required.
         *             Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getAwsElasticBlockStore}
         * @param awsElasticBlockStore AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *                             More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
         * @return {@code this}
         */
        public Builder awsElasticBlockStore(jenkins.JenkinsSpecMasterVolumesAwsElasticBlockStore awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getAzureDisk}
         * @param azureDisk AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
         * @return {@code this}
         */
        public Builder azureDisk(jenkins.JenkinsSpecMasterVolumesAzureDisk azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getAzureFile}
         * @param azureFile AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
         * @return {@code this}
         */
        public Builder azureFile(jenkins.JenkinsSpecMasterVolumesAzureFile azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getCephfs}
         * @param cephfs CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
         * @return {@code this}
         */
        public Builder cephfs(jenkins.JenkinsSpecMasterVolumesCephfs cephfs) {
            this.cephfs = cephfs;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getCinder}
         * @param cinder Cinder represents a cinder volume attached and mounted on kubelets host machine.
         *               More info: https://examples.k8s.io/mysql-cinder-pd/README.md
         * @return {@code this}
         */
        public Builder cinder(jenkins.JenkinsSpecMasterVolumesCinder cinder) {
            this.cinder = cinder;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getConfigMap}
         * @param configMap ConfigMap represents a configMap that should populate this volume.
         * @return {@code this}
         */
        public Builder configMap(jenkins.JenkinsSpecMasterVolumesConfigMap configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getCsi}
         * @param csi CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
         * @return {@code this}
         */
        public Builder csi(jenkins.JenkinsSpecMasterVolumesCsi csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getDownwardApi}
         * @param downwardApi DownwardAPI represents downward API about the pod that should populate this volume.
         * @return {@code this}
         */
        public Builder downwardApi(jenkins.JenkinsSpecMasterVolumesDownwardApi downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getEmptyDir}
         * @param emptyDir EmptyDir represents a temporary directory that shares a pod's lifetime.
         *                 More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
         * @return {@code this}
         */
        public Builder emptyDir(jenkins.JenkinsSpecMasterVolumesEmptyDir emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getFc}
         * @param fc FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
         * @return {@code this}
         */
        public Builder fc(jenkins.JenkinsSpecMasterVolumesFc fc) {
            this.fc = fc;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getFlexVolume}
         * @param flexVolume FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
         * @return {@code this}
         */
        public Builder flexVolume(jenkins.JenkinsSpecMasterVolumesFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getFlocker}
         * @param flocker Flocker represents a Flocker volume attached to a kubelet's host machine.
         *                This depends on the Flocker control service being running
         * @return {@code this}
         */
        public Builder flocker(jenkins.JenkinsSpecMasterVolumesFlocker flocker) {
            this.flocker = flocker;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getGcePersistentDisk}
         * @param gcePersistentDisk GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *                          More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
         * @return {@code this}
         */
        public Builder gcePersistentDisk(jenkins.JenkinsSpecMasterVolumesGcePersistentDisk gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getGitRepo}
         * @param gitRepo GitRepo represents a git repository at a particular revision.
         *                DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
         * @return {@code this}
         */
        public Builder gitRepo(jenkins.JenkinsSpecMasterVolumesGitRepo gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getGlusterfs}
         * @param glusterfs Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.
         *                  More info: https://examples.k8s.io/volumes/glusterfs/README.md
         * @return {@code this}
         */
        public Builder glusterfs(jenkins.JenkinsSpecMasterVolumesGlusterfs glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getHostPath}
         * @param hostPath HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.
         *                 This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.
         * @return {@code this}
         */
        public Builder hostPath(jenkins.JenkinsSpecMasterVolumesHostPath hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getIscsi}
         * @param iscsi ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
         *              More info: https://examples.k8s.io/volumes/iscsi/README.md
         * @return {@code this}
         */
        public Builder iscsi(jenkins.JenkinsSpecMasterVolumesIscsi iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getNfs}
         * @param nfs NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
         * @return {@code this}
         */
        public Builder nfs(jenkins.JenkinsSpecMasterVolumesNfs nfs) {
            this.nfs = nfs;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getPersistentVolumeClaim}
         * @param persistentVolumeClaim PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
         *                              More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
         * @return {@code this}
         */
        public Builder persistentVolumeClaim(jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim persistentVolumeClaim) {
            this.persistentVolumeClaim = persistentVolumeClaim;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getPhotonPersistentDisk}
         * @param photonPersistentDisk PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder photonPersistentDisk(jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getPortworxVolume}
         * @param portworxVolume PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder portworxVolume(jenkins.JenkinsSpecMasterVolumesPortworxVolume portworxVolume) {
            this.portworxVolume = portworxVolume;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getProjected}
         * @param projected Items for all in one resources secrets, configmaps, and downward API.
         * @return {@code this}
         */
        public Builder projected(jenkins.JenkinsSpecMasterVolumesProjected projected) {
            this.projected = projected;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getQuobyte}
         * @param quobyte Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
         * @return {@code this}
         */
        public Builder quobyte(jenkins.JenkinsSpecMasterVolumesQuobyte quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getRbd}
         * @param rbd RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.
         *            More info: https://examples.k8s.io/volumes/rbd/README.md
         * @return {@code this}
         */
        public Builder rbd(jenkins.JenkinsSpecMasterVolumesRbd rbd) {
            this.rbd = rbd;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getScaleIo}
         * @param scaleIo ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
         * @return {@code this}
         */
        public Builder scaleIo(jenkins.JenkinsSpecMasterVolumesScaleIo scaleIo) {
            this.scaleIo = scaleIo;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getSecret}
         * @param secret Secret represents a secret that should populate this volume.
         *               More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
         * @return {@code this}
         */
        public Builder secret(jenkins.JenkinsSpecMasterVolumesSecret secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getStorageos}
         * @param storageos StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
         * @return {@code this}
         */
        public Builder storageos(jenkins.JenkinsSpecMasterVolumesStorageos storageos) {
            this.storageos = storageos;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumes#getVsphereVolume}
         * @param vsphereVolume VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
         * @return {@code this}
         */
        public Builder vsphereVolume(jenkins.JenkinsSpecMasterVolumesVsphereVolume vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumes}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumes build() {
            return new Jsii$Proxy(name, awsElasticBlockStore, azureDisk, azureFile, cephfs, cinder, configMap, csi, downwardApi, emptyDir, fc, flexVolume, flocker, gcePersistentDisk, gitRepo, glusterfs, hostPath, iscsi, nfs, persistentVolumeClaim, photonPersistentDisk, portworxVolume, projected, quobyte, rbd, scaleIo, secret, storageos, vsphereVolume);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumes}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumes {
        private final java.lang.String name;
        private final jenkins.JenkinsSpecMasterVolumesAwsElasticBlockStore awsElasticBlockStore;
        private final jenkins.JenkinsSpecMasterVolumesAzureDisk azureDisk;
        private final jenkins.JenkinsSpecMasterVolumesAzureFile azureFile;
        private final jenkins.JenkinsSpecMasterVolumesCephfs cephfs;
        private final jenkins.JenkinsSpecMasterVolumesCinder cinder;
        private final jenkins.JenkinsSpecMasterVolumesConfigMap configMap;
        private final jenkins.JenkinsSpecMasterVolumesCsi csi;
        private final jenkins.JenkinsSpecMasterVolumesDownwardApi downwardApi;
        private final jenkins.JenkinsSpecMasterVolumesEmptyDir emptyDir;
        private final jenkins.JenkinsSpecMasterVolumesFc fc;
        private final jenkins.JenkinsSpecMasterVolumesFlexVolume flexVolume;
        private final jenkins.JenkinsSpecMasterVolumesFlocker flocker;
        private final jenkins.JenkinsSpecMasterVolumesGcePersistentDisk gcePersistentDisk;
        private final jenkins.JenkinsSpecMasterVolumesGitRepo gitRepo;
        private final jenkins.JenkinsSpecMasterVolumesGlusterfs glusterfs;
        private final jenkins.JenkinsSpecMasterVolumesHostPath hostPath;
        private final jenkins.JenkinsSpecMasterVolumesIscsi iscsi;
        private final jenkins.JenkinsSpecMasterVolumesNfs nfs;
        private final jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim persistentVolumeClaim;
        private final jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk photonPersistentDisk;
        private final jenkins.JenkinsSpecMasterVolumesPortworxVolume portworxVolume;
        private final jenkins.JenkinsSpecMasterVolumesProjected projected;
        private final jenkins.JenkinsSpecMasterVolumesQuobyte quobyte;
        private final jenkins.JenkinsSpecMasterVolumesRbd rbd;
        private final jenkins.JenkinsSpecMasterVolumesScaleIo scaleIo;
        private final jenkins.JenkinsSpecMasterVolumesSecret secret;
        private final jenkins.JenkinsSpecMasterVolumesStorageos storageos;
        private final jenkins.JenkinsSpecMasterVolumesVsphereVolume vsphereVolume;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.awsElasticBlockStore = this.jsiiGet("awsElasticBlockStore", jenkins.JenkinsSpecMasterVolumesAwsElasticBlockStore.class);
            this.azureDisk = this.jsiiGet("azureDisk", jenkins.JenkinsSpecMasterVolumesAzureDisk.class);
            this.azureFile = this.jsiiGet("azureFile", jenkins.JenkinsSpecMasterVolumesAzureFile.class);
            this.cephfs = this.jsiiGet("cephfs", jenkins.JenkinsSpecMasterVolumesCephfs.class);
            this.cinder = this.jsiiGet("cinder", jenkins.JenkinsSpecMasterVolumesCinder.class);
            this.configMap = this.jsiiGet("configMap", jenkins.JenkinsSpecMasterVolumesConfigMap.class);
            this.csi = this.jsiiGet("csi", jenkins.JenkinsSpecMasterVolumesCsi.class);
            this.downwardApi = this.jsiiGet("downwardAPI", jenkins.JenkinsSpecMasterVolumesDownwardApi.class);
            this.emptyDir = this.jsiiGet("emptyDir", jenkins.JenkinsSpecMasterVolumesEmptyDir.class);
            this.fc = this.jsiiGet("fc", jenkins.JenkinsSpecMasterVolumesFc.class);
            this.flexVolume = this.jsiiGet("flexVolume", jenkins.JenkinsSpecMasterVolumesFlexVolume.class);
            this.flocker = this.jsiiGet("flocker", jenkins.JenkinsSpecMasterVolumesFlocker.class);
            this.gcePersistentDisk = this.jsiiGet("gcePersistentDisk", jenkins.JenkinsSpecMasterVolumesGcePersistentDisk.class);
            this.gitRepo = this.jsiiGet("gitRepo", jenkins.JenkinsSpecMasterVolumesGitRepo.class);
            this.glusterfs = this.jsiiGet("glusterfs", jenkins.JenkinsSpecMasterVolumesGlusterfs.class);
            this.hostPath = this.jsiiGet("hostPath", jenkins.JenkinsSpecMasterVolumesHostPath.class);
            this.iscsi = this.jsiiGet("iscsi", jenkins.JenkinsSpecMasterVolumesIscsi.class);
            this.nfs = this.jsiiGet("nfs", jenkins.JenkinsSpecMasterVolumesNfs.class);
            this.persistentVolumeClaim = this.jsiiGet("persistentVolumeClaim", jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim.class);
            this.photonPersistentDisk = this.jsiiGet("photonPersistentDisk", jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk.class);
            this.portworxVolume = this.jsiiGet("portworxVolume", jenkins.JenkinsSpecMasterVolumesPortworxVolume.class);
            this.projected = this.jsiiGet("projected", jenkins.JenkinsSpecMasterVolumesProjected.class);
            this.quobyte = this.jsiiGet("quobyte", jenkins.JenkinsSpecMasterVolumesQuobyte.class);
            this.rbd = this.jsiiGet("rbd", jenkins.JenkinsSpecMasterVolumesRbd.class);
            this.scaleIo = this.jsiiGet("scaleIO", jenkins.JenkinsSpecMasterVolumesScaleIo.class);
            this.secret = this.jsiiGet("secret", jenkins.JenkinsSpecMasterVolumesSecret.class);
            this.storageos = this.jsiiGet("storageos", jenkins.JenkinsSpecMasterVolumesStorageos.class);
            this.vsphereVolume = this.jsiiGet("vsphereVolume", jenkins.JenkinsSpecMasterVolumesVsphereVolume.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String name, final jenkins.JenkinsSpecMasterVolumesAwsElasticBlockStore awsElasticBlockStore, final jenkins.JenkinsSpecMasterVolumesAzureDisk azureDisk, final jenkins.JenkinsSpecMasterVolumesAzureFile azureFile, final jenkins.JenkinsSpecMasterVolumesCephfs cephfs, final jenkins.JenkinsSpecMasterVolumesCinder cinder, final jenkins.JenkinsSpecMasterVolumesConfigMap configMap, final jenkins.JenkinsSpecMasterVolumesCsi csi, final jenkins.JenkinsSpecMasterVolumesDownwardApi downwardApi, final jenkins.JenkinsSpecMasterVolumesEmptyDir emptyDir, final jenkins.JenkinsSpecMasterVolumesFc fc, final jenkins.JenkinsSpecMasterVolumesFlexVolume flexVolume, final jenkins.JenkinsSpecMasterVolumesFlocker flocker, final jenkins.JenkinsSpecMasterVolumesGcePersistentDisk gcePersistentDisk, final jenkins.JenkinsSpecMasterVolumesGitRepo gitRepo, final jenkins.JenkinsSpecMasterVolumesGlusterfs glusterfs, final jenkins.JenkinsSpecMasterVolumesHostPath hostPath, final jenkins.JenkinsSpecMasterVolumesIscsi iscsi, final jenkins.JenkinsSpecMasterVolumesNfs nfs, final jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim persistentVolumeClaim, final jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk photonPersistentDisk, final jenkins.JenkinsSpecMasterVolumesPortworxVolume portworxVolume, final jenkins.JenkinsSpecMasterVolumesProjected projected, final jenkins.JenkinsSpecMasterVolumesQuobyte quobyte, final jenkins.JenkinsSpecMasterVolumesRbd rbd, final jenkins.JenkinsSpecMasterVolumesScaleIo scaleIo, final jenkins.JenkinsSpecMasterVolumesSecret secret, final jenkins.JenkinsSpecMasterVolumesStorageos storageos, final jenkins.JenkinsSpecMasterVolumesVsphereVolume vsphereVolume) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.awsElasticBlockStore = awsElasticBlockStore;
            this.azureDisk = azureDisk;
            this.azureFile = azureFile;
            this.cephfs = cephfs;
            this.cinder = cinder;
            this.configMap = configMap;
            this.csi = csi;
            this.downwardApi = downwardApi;
            this.emptyDir = emptyDir;
            this.fc = fc;
            this.flexVolume = flexVolume;
            this.flocker = flocker;
            this.gcePersistentDisk = gcePersistentDisk;
            this.gitRepo = gitRepo;
            this.glusterfs = glusterfs;
            this.hostPath = hostPath;
            this.iscsi = iscsi;
            this.nfs = nfs;
            this.persistentVolumeClaim = persistentVolumeClaim;
            this.photonPersistentDisk = photonPersistentDisk;
            this.portworxVolume = portworxVolume;
            this.projected = projected;
            this.quobyte = quobyte;
            this.rbd = rbd;
            this.scaleIo = scaleIo;
            this.secret = secret;
            this.storageos = storageos;
            this.vsphereVolume = vsphereVolume;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
            return this.awsElasticBlockStore;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesAzureDisk getAzureDisk() {
            return this.azureDisk;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesAzureFile getAzureFile() {
            return this.azureFile;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesCephfs getCephfs() {
            return this.cephfs;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesCinder getCinder() {
            return this.cinder;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesConfigMap getConfigMap() {
            return this.configMap;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesCsi getCsi() {
            return this.csi;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesDownwardApi getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesEmptyDir getEmptyDir() {
            return this.emptyDir;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesFc getFc() {
            return this.fc;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesFlocker getFlocker() {
            return this.flocker;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesGcePersistentDisk getGcePersistentDisk() {
            return this.gcePersistentDisk;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesGitRepo getGitRepo() {
            return this.gitRepo;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesGlusterfs getGlusterfs() {
            return this.glusterfs;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesHostPath getHostPath() {
            return this.hostPath;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesIscsi getIscsi() {
            return this.iscsi;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesNfs getNfs() {
            return this.nfs;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
            return this.persistentVolumeClaim;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
            return this.photonPersistentDisk;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesPortworxVolume getPortworxVolume() {
            return this.portworxVolume;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesProjected getProjected() {
            return this.projected;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesQuobyte getQuobyte() {
            return this.quobyte;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesRbd getRbd() {
            return this.rbd;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesScaleIo getScaleIo() {
            return this.scaleIo;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesSecret getSecret() {
            return this.secret;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesStorageos getStorageos() {
            return this.storageos;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesVsphereVolume getVsphereVolume() {
            return this.vsphereVolume;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getAwsElasticBlockStore() != null) {
                data.set("awsElasticBlockStore", om.valueToTree(this.getAwsElasticBlockStore()));
            }
            if (this.getAzureDisk() != null) {
                data.set("azureDisk", om.valueToTree(this.getAzureDisk()));
            }
            if (this.getAzureFile() != null) {
                data.set("azureFile", om.valueToTree(this.getAzureFile()));
            }
            if (this.getCephfs() != null) {
                data.set("cephfs", om.valueToTree(this.getCephfs()));
            }
            if (this.getCinder() != null) {
                data.set("cinder", om.valueToTree(this.getCinder()));
            }
            if (this.getConfigMap() != null) {
                data.set("configMap", om.valueToTree(this.getConfigMap()));
            }
            if (this.getCsi() != null) {
                data.set("csi", om.valueToTree(this.getCsi()));
            }
            if (this.getDownwardApi() != null) {
                data.set("downwardAPI", om.valueToTree(this.getDownwardApi()));
            }
            if (this.getEmptyDir() != null) {
                data.set("emptyDir", om.valueToTree(this.getEmptyDir()));
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
            if (this.getGitRepo() != null) {
                data.set("gitRepo", om.valueToTree(this.getGitRepo()));
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
            if (this.getNfs() != null) {
                data.set("nfs", om.valueToTree(this.getNfs()));
            }
            if (this.getPersistentVolumeClaim() != null) {
                data.set("persistentVolumeClaim", om.valueToTree(this.getPersistentVolumeClaim()));
            }
            if (this.getPhotonPersistentDisk() != null) {
                data.set("photonPersistentDisk", om.valueToTree(this.getPhotonPersistentDisk()));
            }
            if (this.getPortworxVolume() != null) {
                data.set("portworxVolume", om.valueToTree(this.getPortworxVolume()));
            }
            if (this.getProjected() != null) {
                data.set("projected", om.valueToTree(this.getProjected()));
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
            if (this.getSecret() != null) {
                data.set("secret", om.valueToTree(this.getSecret()));
            }
            if (this.getStorageos() != null) {
                data.set("storageos", om.valueToTree(this.getStorageos()));
            }
            if (this.getVsphereVolume() != null) {
                data.set("vsphereVolume", om.valueToTree(this.getVsphereVolume()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumes"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumes.Jsii$Proxy that = (JenkinsSpecMasterVolumes.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.awsElasticBlockStore != null ? !this.awsElasticBlockStore.equals(that.awsElasticBlockStore) : that.awsElasticBlockStore != null) return false;
            if (this.azureDisk != null ? !this.azureDisk.equals(that.azureDisk) : that.azureDisk != null) return false;
            if (this.azureFile != null ? !this.azureFile.equals(that.azureFile) : that.azureFile != null) return false;
            if (this.cephfs != null ? !this.cephfs.equals(that.cephfs) : that.cephfs != null) return false;
            if (this.cinder != null ? !this.cinder.equals(that.cinder) : that.cinder != null) return false;
            if (this.configMap != null ? !this.configMap.equals(that.configMap) : that.configMap != null) return false;
            if (this.csi != null ? !this.csi.equals(that.csi) : that.csi != null) return false;
            if (this.downwardApi != null ? !this.downwardApi.equals(that.downwardApi) : that.downwardApi != null) return false;
            if (this.emptyDir != null ? !this.emptyDir.equals(that.emptyDir) : that.emptyDir != null) return false;
            if (this.fc != null ? !this.fc.equals(that.fc) : that.fc != null) return false;
            if (this.flexVolume != null ? !this.flexVolume.equals(that.flexVolume) : that.flexVolume != null) return false;
            if (this.flocker != null ? !this.flocker.equals(that.flocker) : that.flocker != null) return false;
            if (this.gcePersistentDisk != null ? !this.gcePersistentDisk.equals(that.gcePersistentDisk) : that.gcePersistentDisk != null) return false;
            if (this.gitRepo != null ? !this.gitRepo.equals(that.gitRepo) : that.gitRepo != null) return false;
            if (this.glusterfs != null ? !this.glusterfs.equals(that.glusterfs) : that.glusterfs != null) return false;
            if (this.hostPath != null ? !this.hostPath.equals(that.hostPath) : that.hostPath != null) return false;
            if (this.iscsi != null ? !this.iscsi.equals(that.iscsi) : that.iscsi != null) return false;
            if (this.nfs != null ? !this.nfs.equals(that.nfs) : that.nfs != null) return false;
            if (this.persistentVolumeClaim != null ? !this.persistentVolumeClaim.equals(that.persistentVolumeClaim) : that.persistentVolumeClaim != null) return false;
            if (this.photonPersistentDisk != null ? !this.photonPersistentDisk.equals(that.photonPersistentDisk) : that.photonPersistentDisk != null) return false;
            if (this.portworxVolume != null ? !this.portworxVolume.equals(that.portworxVolume) : that.portworxVolume != null) return false;
            if (this.projected != null ? !this.projected.equals(that.projected) : that.projected != null) return false;
            if (this.quobyte != null ? !this.quobyte.equals(that.quobyte) : that.quobyte != null) return false;
            if (this.rbd != null ? !this.rbd.equals(that.rbd) : that.rbd != null) return false;
            if (this.scaleIo != null ? !this.scaleIo.equals(that.scaleIo) : that.scaleIo != null) return false;
            if (this.secret != null ? !this.secret.equals(that.secret) : that.secret != null) return false;
            if (this.storageos != null ? !this.storageos.equals(that.storageos) : that.storageos != null) return false;
            return this.vsphereVolume != null ? this.vsphereVolume.equals(that.vsphereVolume) : that.vsphereVolume == null;
        }

        @Override
        public int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.awsElasticBlockStore != null ? this.awsElasticBlockStore.hashCode() : 0);
            result = 31 * result + (this.azureDisk != null ? this.azureDisk.hashCode() : 0);
            result = 31 * result + (this.azureFile != null ? this.azureFile.hashCode() : 0);
            result = 31 * result + (this.cephfs != null ? this.cephfs.hashCode() : 0);
            result = 31 * result + (this.cinder != null ? this.cinder.hashCode() : 0);
            result = 31 * result + (this.configMap != null ? this.configMap.hashCode() : 0);
            result = 31 * result + (this.csi != null ? this.csi.hashCode() : 0);
            result = 31 * result + (this.downwardApi != null ? this.downwardApi.hashCode() : 0);
            result = 31 * result + (this.emptyDir != null ? this.emptyDir.hashCode() : 0);
            result = 31 * result + (this.fc != null ? this.fc.hashCode() : 0);
            result = 31 * result + (this.flexVolume != null ? this.flexVolume.hashCode() : 0);
            result = 31 * result + (this.flocker != null ? this.flocker.hashCode() : 0);
            result = 31 * result + (this.gcePersistentDisk != null ? this.gcePersistentDisk.hashCode() : 0);
            result = 31 * result + (this.gitRepo != null ? this.gitRepo.hashCode() : 0);
            result = 31 * result + (this.glusterfs != null ? this.glusterfs.hashCode() : 0);
            result = 31 * result + (this.hostPath != null ? this.hostPath.hashCode() : 0);
            result = 31 * result + (this.iscsi != null ? this.iscsi.hashCode() : 0);
            result = 31 * result + (this.nfs != null ? this.nfs.hashCode() : 0);
            result = 31 * result + (this.persistentVolumeClaim != null ? this.persistentVolumeClaim.hashCode() : 0);
            result = 31 * result + (this.photonPersistentDisk != null ? this.photonPersistentDisk.hashCode() : 0);
            result = 31 * result + (this.portworxVolume != null ? this.portworxVolume.hashCode() : 0);
            result = 31 * result + (this.projected != null ? this.projected.hashCode() : 0);
            result = 31 * result + (this.quobyte != null ? this.quobyte.hashCode() : 0);
            result = 31 * result + (this.rbd != null ? this.rbd.hashCode() : 0);
            result = 31 * result + (this.scaleIo != null ? this.scaleIo.hashCode() : 0);
            result = 31 * result + (this.secret != null ? this.secret.hashCode() : 0);
            result = 31 * result + (this.storageos != null ? this.storageos.hashCode() : 0);
            result = 31 * result + (this.vsphereVolume != null ? this.vsphereVolume.hashCode() : 0);
            return result;
        }
    }
}
