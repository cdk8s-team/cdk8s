package jenkins;

/**
 * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.669Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesFlexVolume")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesFlexVolume.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesFlexVolume extends software.amazon.jsii.JsiiSerializable {

    /**
     * Driver is the name of the driver to use for this volume.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Optional: Extra command options if any.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getOptions() {
        return null;
    }

    /**
     * Optional: Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
     * <p>
     * This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef getSecretRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesFlexVolume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesFlexVolume}
     */
    public static final class Builder {
        private java.lang.String driver;
        private java.lang.String fsType;
        private java.util.Map<java.lang.String, java.lang.String> options;
        private java.lang.Boolean readOnly;
        private jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef secretRef;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFlexVolume#getDriver}
         * @param driver Driver is the name of the driver to use for this volume. This parameter is required.
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFlexVolume#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFlexVolume#getOptions}
         * @param options Optional: Extra command options if any.
         * @return {@code this}
         */
        public Builder options(java.util.Map<java.lang.String, java.lang.String> options) {
            this.options = options;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFlexVolume#getReadOnly}
         * @param readOnly Optional: Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFlexVolume#getSecretRef}
         * @param secretRef Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
         *                  This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
         * @return {@code this}
         */
        public Builder secretRef(jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesFlexVolume}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesFlexVolume build() {
            return new Jsii$Proxy(driver, fsType, options, readOnly, secretRef);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesFlexVolume}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesFlexVolume {
        private final java.lang.String driver;
        private final java.lang.String fsType;
        private final java.util.Map<java.lang.String, java.lang.String> options;
        private final java.lang.Boolean readOnly;
        private final jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef secretRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = this.jsiiGet("driver", java.lang.String.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
            this.options = this.jsiiGet("options", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
            this.secretRef = this.jsiiGet("secretRef", jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String driver, final java.lang.String fsType, final java.util.Map<java.lang.String, java.lang.String> options, final java.lang.Boolean readOnly, final jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef secretRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(driver, "driver is required");
            this.fsType = fsType;
            this.options = options;
            this.readOnly = readOnly;
            this.secretRef = secretRef;
        }

        @Override
        public java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getOptions() {
            return this.options;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef getSecretRef() {
            return this.secretRef;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("driver", om.valueToTree(this.getDriver()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getOptions() != null) {
                data.set("options", om.valueToTree(this.getOptions()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesFlexVolume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesFlexVolume.Jsii$Proxy that = (JenkinsSpecMasterVolumesFlexVolume.Jsii$Proxy) o;

            if (!driver.equals(that.driver)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.options != null ? !this.options.equals(that.options) : that.options != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.secretRef != null ? this.secretRef.equals(that.secretRef) : that.secretRef == null;
        }

        @Override
        public int hashCode() {
            int result = this.driver.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.options != null ? this.options.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            return result;
        }
    }
}
