package jenkins;

/**
 * Cinder represents a cinder volume attached and mounted on kubelets host machine.
 * <p>
 * More info: https://examples.k8s.io/mysql-cinder-pd/README.md
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.660Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesCinder")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesCinder.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesCinder extends software.amazon.jsii.JsiiSerializable {

    /**
     * volume id used to identify the volume in cinder.
     * <p>
     * More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumeId();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Optional: Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * Optional: points to a secret object containing parameters used to connect to OpenStack.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesCinderSecretRef getSecretRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesCinder}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesCinder}
     */
    public static final class Builder {
        private java.lang.String volumeId;
        private java.lang.String fsType;
        private java.lang.Boolean readOnly;
        private jenkins.JenkinsSpecMasterVolumesCinderSecretRef secretRef;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesCinder#getVolumeId}
         * @param volumeId volume id used to identify the volume in cinder. This parameter is required.
         *                 More info: https://examples.k8s.io/mysql-cinder-pd/README.md
         * @return {@code this}
         */
        public Builder volumeId(java.lang.String volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesCinder#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesCinder#getReadOnly}
         * @param readOnly Optional: Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesCinder#getSecretRef}
         * @param secretRef Optional: points to a secret object containing parameters used to connect to OpenStack.
         * @return {@code this}
         */
        public Builder secretRef(jenkins.JenkinsSpecMasterVolumesCinderSecretRef secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesCinder}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesCinder build() {
            return new Jsii$Proxy(volumeId, fsType, readOnly, secretRef);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesCinder}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesCinder {
        private final java.lang.String volumeId;
        private final java.lang.String fsType;
        private final java.lang.Boolean readOnly;
        private final jenkins.JenkinsSpecMasterVolumesCinderSecretRef secretRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.volumeId = this.jsiiGet("volumeID", java.lang.String.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
            this.secretRef = this.jsiiGet("secretRef", jenkins.JenkinsSpecMasterVolumesCinderSecretRef.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String volumeId, final java.lang.String fsType, final java.lang.Boolean readOnly, final jenkins.JenkinsSpecMasterVolumesCinderSecretRef secretRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.volumeId = java.util.Objects.requireNonNull(volumeId, "volumeId is required");
            this.fsType = fsType;
            this.readOnly = readOnly;
            this.secretRef = secretRef;
        }

        @Override
        public java.lang.String getVolumeId() {
            return this.volumeId;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesCinderSecretRef getSecretRef() {
            return this.secretRef;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("volumeID", om.valueToTree(this.getVolumeId()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesCinder"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesCinder.Jsii$Proxy that = (JenkinsSpecMasterVolumesCinder.Jsii$Proxy) o;

            if (!volumeId.equals(that.volumeId)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.secretRef != null ? this.secretRef.equals(that.secretRef) : that.secretRef == null;
        }

        @Override
        public int hashCode() {
            int result = this.volumeId.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            return result;
        }
    }
}
