package jenkins;

/**
 * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.683Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesPhotonPersistentDisk.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesPhotonPersistentDisk extends software.amazon.jsii.JsiiSerializable {

    /**
     * ID that identifies Photon Controller persistent disk.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPdId();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesPhotonPersistentDisk}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesPhotonPersistentDisk}
     */
    public static final class Builder {
        private java.lang.String pdId;
        private java.lang.String fsType;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesPhotonPersistentDisk#getPdId}
         * @param pdId ID that identifies Photon Controller persistent disk. This parameter is required.
         * @return {@code this}
         */
        public Builder pdId(java.lang.String pdId) {
            this.pdId = pdId;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesPhotonPersistentDisk#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesPhotonPersistentDisk}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesPhotonPersistentDisk build() {
            return new Jsii$Proxy(pdId, fsType);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesPhotonPersistentDisk}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesPhotonPersistentDisk {
        private final java.lang.String pdId;
        private final java.lang.String fsType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pdId = this.jsiiGet("pdID", java.lang.String.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String pdId, final java.lang.String fsType) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pdId = java.util.Objects.requireNonNull(pdId, "pdId is required");
            this.fsType = fsType;
        }

        @Override
        public java.lang.String getPdId() {
            return this.pdId;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("pdID", om.valueToTree(this.getPdId()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesPhotonPersistentDisk"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesPhotonPersistentDisk.Jsii$Proxy that = (JenkinsSpecMasterVolumesPhotonPersistentDisk.Jsii$Proxy) o;

            if (!pdId.equals(that.pdId)) return false;
            return this.fsType != null ? this.fsType.equals(that.fsType) : that.fsType == null;
        }

        @Override
        public int hashCode() {
            int result = this.pdId.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            return result;
        }
    }
}
