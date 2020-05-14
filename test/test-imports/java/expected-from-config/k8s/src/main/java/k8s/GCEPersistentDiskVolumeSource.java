package k8s;

/**
 * Represents a Persistent Disk resource in Google Compute Engine.
 * <p>
 * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.229Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.GCEPersistentDiskVolumeSource")
@software.amazon.jsii.Jsii.Proxy(GCEPersistentDiskVolumeSource.Jsii$Proxy.class)
public interface GCEPersistentDiskVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Unique name of the PD resource in GCE.
     * <p>
     * Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPdName();

    /**
     * Filesystem type of the volume that you want to mount.
     * <p>
     * Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * The partition in the volume that you want to mount.
     * <p>
     * If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPartition() {
        return null;
    }

    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * <p>
     * Default: false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GCEPersistentDiskVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GCEPersistentDiskVolumeSource}
     */
    public static final class Builder {
        private java.lang.String pdName;
        private java.lang.String fsType;
        private java.lang.Number partition;
        private java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link GCEPersistentDiskVolumeSource#getPdName}
         * @param pdName Unique name of the PD resource in GCE. This parameter is required.
         *               Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
         * @return {@code this}
         */
        public Builder pdName(java.lang.String pdName) {
            this.pdName = pdName;
            return this;
        }

        /**
         * Sets the value of {@link GCEPersistentDiskVolumeSource#getFsType}
         * @param fsType Filesystem type of the volume that you want to mount.
         *               Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link GCEPersistentDiskVolumeSource#getPartition}
         * @param partition The partition in the volume that you want to mount.
         *                  If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
         * @return {@code this}
         */
        public Builder partition(java.lang.Number partition) {
            this.partition = partition;
            return this;
        }

        /**
         * Sets the value of {@link GCEPersistentDiskVolumeSource#getReadOnly}
         * @param readOnly ReadOnly here will force the ReadOnly setting in VolumeMounts.
         *                 Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GCEPersistentDiskVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public GCEPersistentDiskVolumeSource build() {
            return new Jsii$Proxy(pdName, fsType, partition, readOnly);
        }
    }

    /**
     * An implementation for {@link GCEPersistentDiskVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GCEPersistentDiskVolumeSource {
        private final java.lang.String pdName;
        private final java.lang.String fsType;
        private final java.lang.Number partition;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pdName = this.jsiiGet("pdName", java.lang.String.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
            this.partition = this.jsiiGet("partition", java.lang.Number.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String pdName, final java.lang.String fsType, final java.lang.Number partition, final java.lang.Boolean readOnly) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pdName = java.util.Objects.requireNonNull(pdName, "pdName is required");
            this.fsType = fsType;
            this.partition = partition;
            this.readOnly = readOnly;
        }

        @Override
        public java.lang.String getPdName() {
            return this.pdName;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public java.lang.Number getPartition() {
            return this.partition;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("pdName", om.valueToTree(this.getPdName()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getPartition() != null) {
                data.set("partition", om.valueToTree(this.getPartition()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.GCEPersistentDiskVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GCEPersistentDiskVolumeSource.Jsii$Proxy that = (GCEPersistentDiskVolumeSource.Jsii$Proxy) o;

            if (!pdName.equals(that.pdName)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.partition != null ? !this.partition.equals(that.partition) : that.partition != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public int hashCode() {
            int result = this.pdName.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.partition != null ? this.partition.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
