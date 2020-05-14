package jenkins;

/**
 * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.669Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesFc")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesFc.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesFc extends software.amazon.jsii.JsiiSerializable {

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. TODO: how do we prevent errors in the filesystem from compromising the machine
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Optional: FC target lun number.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getLun() {
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
     * Optional: FC target worldwide names (WWNs).
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTargetWwNs() {
        return null;
    }

    /**
     * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getWwids() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesFc}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesFc}
     */
    public static final class Builder {
        private java.lang.String fsType;
        private java.lang.Number lun;
        private java.lang.Boolean readOnly;
        private java.util.List<java.lang.String> targetWwNs;
        private java.util.List<java.lang.String> wwids;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFc#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. TODO: how do we prevent errors in the filesystem from compromising the machine
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFc#getLun}
         * @param lun Optional: FC target lun number.
         * @return {@code this}
         */
        public Builder lun(java.lang.Number lun) {
            this.lun = lun;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFc#getReadOnly}
         * @param readOnly Optional: Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFc#getTargetWwNs}
         * @param targetWwNs Optional: FC target worldwide names (WWNs).
         * @return {@code this}
         */
        public Builder targetWwNs(java.util.List<java.lang.String> targetWwNs) {
            this.targetWwNs = targetWwNs;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFc#getWwids}
         * @param wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
         * @return {@code this}
         */
        public Builder wwids(java.util.List<java.lang.String> wwids) {
            this.wwids = wwids;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesFc}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesFc build() {
            return new Jsii$Proxy(fsType, lun, readOnly, targetWwNs, wwids);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesFc}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesFc {
        private final java.lang.String fsType;
        private final java.lang.Number lun;
        private final java.lang.Boolean readOnly;
        private final java.util.List<java.lang.String> targetWwNs;
        private final java.util.List<java.lang.String> wwids;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
            this.lun = this.jsiiGet("lun", java.lang.Number.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
            this.targetWwNs = this.jsiiGet("targetWWNs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.wwids = this.jsiiGet("wwids", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String fsType, final java.lang.Number lun, final java.lang.Boolean readOnly, final java.util.List<java.lang.String> targetWwNs, final java.util.List<java.lang.String> wwids) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fsType = fsType;
            this.lun = lun;
            this.readOnly = readOnly;
            this.targetWwNs = targetWwNs;
            this.wwids = wwids;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public java.lang.Number getLun() {
            return this.lun;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public java.util.List<java.lang.String> getTargetWwNs() {
            return this.targetWwNs;
        }

        @Override
        public java.util.List<java.lang.String> getWwids() {
            return this.wwids;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getLun() != null) {
                data.set("lun", om.valueToTree(this.getLun()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getTargetWwNs() != null) {
                data.set("targetWWNs", om.valueToTree(this.getTargetWwNs()));
            }
            if (this.getWwids() != null) {
                data.set("wwids", om.valueToTree(this.getWwids()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesFc"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesFc.Jsii$Proxy that = (JenkinsSpecMasterVolumesFc.Jsii$Proxy) o;

            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.lun != null ? !this.lun.equals(that.lun) : that.lun != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.targetWwNs != null ? !this.targetWwNs.equals(that.targetWwNs) : that.targetWwNs != null) return false;
            return this.wwids != null ? this.wwids.equals(that.wwids) : that.wwids == null;
        }

        @Override
        public int hashCode() {
            int result = this.fsType != null ? this.fsType.hashCode() : 0;
            result = 31 * result + (this.lun != null ? this.lun.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.targetWwNs != null ? this.targetWwNs.hashCode() : 0);
            result = 31 * result + (this.wwids != null ? this.wwids.hashCode() : 0);
            return result;
        }
    }
}
