package jenkins;

/**
 * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.650Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesAzureDisk")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesAzureDisk.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesAzureDisk extends software.amazon.jsii.JsiiSerializable {

    /**
     * The Name of the data disk in the blob storage.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDiskName();

    /**
     * The URI the data disk in the blob storage.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDiskUri();

    /**
     * Host Caching mode: None, Read Only, Read Write.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCachingMode() {
        return null;
    }

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set).
     * <p>
     * defaults to shared
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesAzureDisk}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesAzureDisk}
     */
    public static final class Builder {
        private java.lang.String diskName;
        private java.lang.String diskUri;
        private java.lang.String cachingMode;
        private java.lang.String fsType;
        private java.lang.String kind;
        private java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesAzureDisk#getDiskName}
         * @param diskName The Name of the data disk in the blob storage. This parameter is required.
         * @return {@code this}
         */
        public Builder diskName(java.lang.String diskName) {
            this.diskName = diskName;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesAzureDisk#getDiskUri}
         * @param diskUri The URI the data disk in the blob storage. This parameter is required.
         * @return {@code this}
         */
        public Builder diskUri(java.lang.String diskUri) {
            this.diskUri = diskUri;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesAzureDisk#getCachingMode}
         * @param cachingMode Host Caching mode: None, Read Only, Read Write.
         * @return {@code this}
         */
        public Builder cachingMode(java.lang.String cachingMode) {
            this.cachingMode = cachingMode;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesAzureDisk#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesAzureDisk#getKind}
         * @param kind Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set).
         *             defaults to shared
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesAzureDisk#getReadOnly}
         * @param readOnly Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesAzureDisk}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesAzureDisk build() {
            return new Jsii$Proxy(diskName, diskUri, cachingMode, fsType, kind, readOnly);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesAzureDisk}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesAzureDisk {
        private final java.lang.String diskName;
        private final java.lang.String diskUri;
        private final java.lang.String cachingMode;
        private final java.lang.String fsType;
        private final java.lang.String kind;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.diskName = this.jsiiGet("diskName", java.lang.String.class);
            this.diskUri = this.jsiiGet("diskURI", java.lang.String.class);
            this.cachingMode = this.jsiiGet("cachingMode", java.lang.String.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
            this.kind = this.jsiiGet("kind", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String diskName, final java.lang.String diskUri, final java.lang.String cachingMode, final java.lang.String fsType, final java.lang.String kind, final java.lang.Boolean readOnly) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.diskName = java.util.Objects.requireNonNull(diskName, "diskName is required");
            this.diskUri = java.util.Objects.requireNonNull(diskUri, "diskUri is required");
            this.cachingMode = cachingMode;
            this.fsType = fsType;
            this.kind = kind;
            this.readOnly = readOnly;
        }

        @Override
        public java.lang.String getDiskName() {
            return this.diskName;
        }

        @Override
        public java.lang.String getDiskUri() {
            return this.diskUri;
        }

        @Override
        public java.lang.String getCachingMode() {
            return this.cachingMode;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("diskName", om.valueToTree(this.getDiskName()));
            data.set("diskURI", om.valueToTree(this.getDiskUri()));
            if (this.getCachingMode() != null) {
                data.set("cachingMode", om.valueToTree(this.getCachingMode()));
            }
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesAzureDisk"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesAzureDisk.Jsii$Proxy that = (JenkinsSpecMasterVolumesAzureDisk.Jsii$Proxy) o;

            if (!diskName.equals(that.diskName)) return false;
            if (!diskUri.equals(that.diskUri)) return false;
            if (this.cachingMode != null ? !this.cachingMode.equals(that.cachingMode) : that.cachingMode != null) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.kind != null ? !this.kind.equals(that.kind) : that.kind != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public int hashCode() {
            int result = this.diskName.hashCode();
            result = 31 * result + (this.diskUri.hashCode());
            result = 31 * result + (this.cachingMode != null ? this.cachingMode.hashCode() : 0);
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
