package k8s;

/**
 * Local represents directly-attached storage with node affinity (Beta feature).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.286Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.LocalVolumeSource")
@software.amazon.jsii.Jsii.Proxy(LocalVolumeSource.Jsii$Proxy.class)
public interface LocalVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * The full path to the volume on the node.
     * <p>
     * It can be either a directory or block device (disk, partition, ...).
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * Filesystem type to mount.
     * <p>
     * It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default value is to auto-select a fileystem if unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LocalVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LocalVolumeSource}
     */
    public static final class Builder {
        private java.lang.String path;
        private java.lang.String fsType;

        /**
         * Sets the value of {@link LocalVolumeSource#getPath}
         * @param path The full path to the volume on the node. This parameter is required.
         *             It can be either a directory or block device (disk, partition, ...).
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link LocalVolumeSource#getFsType}
         * @param fsType Filesystem type to mount.
         *               It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default value is to auto-select a fileystem if unspecified.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LocalVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public LocalVolumeSource build() {
            return new Jsii$Proxy(path, fsType);
        }
    }

    /**
     * An implementation for {@link LocalVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LocalVolumeSource {
        private final java.lang.String path;
        private final java.lang.String fsType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = this.jsiiGet("path", java.lang.String.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String path, final java.lang.String fsType) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = java.util.Objects.requireNonNull(path, "path is required");
            this.fsType = fsType;
        }

        @Override
        public java.lang.String getPath() {
            return this.path;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("path", om.valueToTree(this.getPath()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.LocalVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LocalVolumeSource.Jsii$Proxy that = (LocalVolumeSource.Jsii$Proxy) o;

            if (!path.equals(that.path)) return false;
            return this.fsType != null ? this.fsType.equals(that.fsType) : that.fsType == null;
        }

        @Override
        public int hashCode() {
            int result = this.path.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            return result;
        }
    }
}
