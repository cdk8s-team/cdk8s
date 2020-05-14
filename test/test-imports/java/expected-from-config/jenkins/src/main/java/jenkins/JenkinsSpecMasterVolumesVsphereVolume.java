package jenkins;

/**
 * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.698Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesVsphereVolume")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesVsphereVolume.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesVsphereVolume extends software.amazon.jsii.JsiiSerializable {

    /**
     * Path that identifies vSphere volume vmdk.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumePath();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStoragePolicyId() {
        return null;
    }

    /**
     * Storage Policy Based Management (SPBM) profile name.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStoragePolicyName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesVsphereVolume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesVsphereVolume}
     */
    public static final class Builder {
        private java.lang.String volumePath;
        private java.lang.String fsType;
        private java.lang.String storagePolicyId;
        private java.lang.String storagePolicyName;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesVsphereVolume#getVolumePath}
         * @param volumePath Path that identifies vSphere volume vmdk. This parameter is required.
         * @return {@code this}
         */
        public Builder volumePath(java.lang.String volumePath) {
            this.volumePath = volumePath;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesVsphereVolume#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesVsphereVolume#getStoragePolicyId}
         * @param storagePolicyId Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
         * @return {@code this}
         */
        public Builder storagePolicyId(java.lang.String storagePolicyId) {
            this.storagePolicyId = storagePolicyId;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesVsphereVolume#getStoragePolicyName}
         * @param storagePolicyName Storage Policy Based Management (SPBM) profile name.
         * @return {@code this}
         */
        public Builder storagePolicyName(java.lang.String storagePolicyName) {
            this.storagePolicyName = storagePolicyName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesVsphereVolume}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesVsphereVolume build() {
            return new Jsii$Proxy(volumePath, fsType, storagePolicyId, storagePolicyName);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesVsphereVolume}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesVsphereVolume {
        private final java.lang.String volumePath;
        private final java.lang.String fsType;
        private final java.lang.String storagePolicyId;
        private final java.lang.String storagePolicyName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.volumePath = this.jsiiGet("volumePath", java.lang.String.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
            this.storagePolicyId = this.jsiiGet("storagePolicyID", java.lang.String.class);
            this.storagePolicyName = this.jsiiGet("storagePolicyName", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String volumePath, final java.lang.String fsType, final java.lang.String storagePolicyId, final java.lang.String storagePolicyName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.volumePath = java.util.Objects.requireNonNull(volumePath, "volumePath is required");
            this.fsType = fsType;
            this.storagePolicyId = storagePolicyId;
            this.storagePolicyName = storagePolicyName;
        }

        @Override
        public java.lang.String getVolumePath() {
            return this.volumePath;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public java.lang.String getStoragePolicyId() {
            return this.storagePolicyId;
        }

        @Override
        public java.lang.String getStoragePolicyName() {
            return this.storagePolicyName;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("volumePath", om.valueToTree(this.getVolumePath()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getStoragePolicyId() != null) {
                data.set("storagePolicyID", om.valueToTree(this.getStoragePolicyId()));
            }
            if (this.getStoragePolicyName() != null) {
                data.set("storagePolicyName", om.valueToTree(this.getStoragePolicyName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesVsphereVolume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesVsphereVolume.Jsii$Proxy that = (JenkinsSpecMasterVolumesVsphereVolume.Jsii$Proxy) o;

            if (!volumePath.equals(that.volumePath)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.storagePolicyId != null ? !this.storagePolicyId.equals(that.storagePolicyId) : that.storagePolicyId != null) return false;
            return this.storagePolicyName != null ? this.storagePolicyName.equals(that.storagePolicyName) : that.storagePolicyName == null;
        }

        @Override
        public int hashCode() {
            int result = this.volumePath.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.storagePolicyId != null ? this.storagePolicyId.hashCode() : 0);
            result = 31 * result + (this.storagePolicyName != null ? this.storagePolicyName.hashCode() : 0);
            return result;
        }
    }
}
