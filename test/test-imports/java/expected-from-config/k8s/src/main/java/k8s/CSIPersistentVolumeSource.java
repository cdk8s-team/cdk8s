package k8s;

/**
 * Represents storage that is managed by an external CSI volume driver (Beta feature).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.106Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CSIPersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(CSIPersistentVolumeSource.Jsii$Proxy.class)
public interface CSIPersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Driver is the name of the driver to use for this volume.
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls.
     * <p>
     * Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumeHandle();

    /**
     * ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call.
     * <p>
     * This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     */
    default @org.jetbrains.annotations.Nullable k8s.SecretReference getControllerExpandSecretRef() {
        return null;
    }

    /**
     * ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls.
     * <p>
     * This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     */
    default @org.jetbrains.annotations.Nullable k8s.SecretReference getControllerPublishSecretRef() {
        return null;
    }

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
     * <p>
     * This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     */
    default @org.jetbrains.annotations.Nullable k8s.SecretReference getNodePublishSecretRef() {
        return null;
    }

    /**
     * NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls.
     * <p>
     * This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     */
    default @org.jetbrains.annotations.Nullable k8s.SecretReference getNodeStageSecretRef() {
        return null;
    }

    /**
     * Optional: The value to pass to ControllerPublishVolumeRequest.
     * <p>
     * Defaults to false (read/write).
     * <p>
     * Default: false (read/write).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * Attributes of the volume to publish.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CSIPersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CSIPersistentVolumeSource}
     */
    public static final class Builder {
        private java.lang.String driver;
        private java.lang.String volumeHandle;
        private k8s.SecretReference controllerExpandSecretRef;
        private k8s.SecretReference controllerPublishSecretRef;
        private java.lang.String fsType;
        private k8s.SecretReference nodePublishSecretRef;
        private k8s.SecretReference nodeStageSecretRef;
        private java.lang.Boolean readOnly;
        private java.util.Map<java.lang.String, java.lang.String> volumeAttributes;

        /**
         * Sets the value of {@link CSIPersistentVolumeSource#getDriver}
         * @param driver Driver is the name of the driver to use for this volume. This parameter is required.
         *               Required.
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Sets the value of {@link CSIPersistentVolumeSource#getVolumeHandle}
         * @param volumeHandle VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. This parameter is required.
         *                     Required.
         * @return {@code this}
         */
        public Builder volumeHandle(java.lang.String volumeHandle) {
            this.volumeHandle = volumeHandle;
            return this;
        }

        /**
         * Sets the value of {@link CSIPersistentVolumeSource#getControllerExpandSecretRef}
         * @param controllerExpandSecretRef ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call.
         *                                  This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * @return {@code this}
         */
        public Builder controllerExpandSecretRef(k8s.SecretReference controllerExpandSecretRef) {
            this.controllerExpandSecretRef = controllerExpandSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link CSIPersistentVolumeSource#getControllerPublishSecretRef}
         * @param controllerPublishSecretRef ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls.
         *                                   This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * @return {@code this}
         */
        public Builder controllerPublishSecretRef(k8s.SecretReference controllerPublishSecretRef) {
            this.controllerPublishSecretRef = controllerPublishSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link CSIPersistentVolumeSource#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link CSIPersistentVolumeSource#getNodePublishSecretRef}
         * @param nodePublishSecretRef NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
         *                             This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * @return {@code this}
         */
        public Builder nodePublishSecretRef(k8s.SecretReference nodePublishSecretRef) {
            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link CSIPersistentVolumeSource#getNodeStageSecretRef}
         * @param nodeStageSecretRef NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls.
         *                           This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
         * @return {@code this}
         */
        public Builder nodeStageSecretRef(k8s.SecretReference nodeStageSecretRef) {
            this.nodeStageSecretRef = nodeStageSecretRef;
            return this;
        }

        /**
         * Sets the value of {@link CSIPersistentVolumeSource#getReadOnly}
         * @param readOnly Optional: The value to pass to ControllerPublishVolumeRequest.
         *                 Defaults to false (read/write).
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link CSIPersistentVolumeSource#getVolumeAttributes}
         * @param volumeAttributes Attributes of the volume to publish.
         * @return {@code this}
         */
        public Builder volumeAttributes(java.util.Map<java.lang.String, java.lang.String> volumeAttributes) {
            this.volumeAttributes = volumeAttributes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CSIPersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CSIPersistentVolumeSource build() {
            return new Jsii$Proxy(driver, volumeHandle, controllerExpandSecretRef, controllerPublishSecretRef, fsType, nodePublishSecretRef, nodeStageSecretRef, readOnly, volumeAttributes);
        }
    }

    /**
     * An implementation for {@link CSIPersistentVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CSIPersistentVolumeSource {
        private final java.lang.String driver;
        private final java.lang.String volumeHandle;
        private final k8s.SecretReference controllerExpandSecretRef;
        private final k8s.SecretReference controllerPublishSecretRef;
        private final java.lang.String fsType;
        private final k8s.SecretReference nodePublishSecretRef;
        private final k8s.SecretReference nodeStageSecretRef;
        private final java.lang.Boolean readOnly;
        private final java.util.Map<java.lang.String, java.lang.String> volumeAttributes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = this.jsiiGet("driver", java.lang.String.class);
            this.volumeHandle = this.jsiiGet("volumeHandle", java.lang.String.class);
            this.controllerExpandSecretRef = this.jsiiGet("controllerExpandSecretRef", k8s.SecretReference.class);
            this.controllerPublishSecretRef = this.jsiiGet("controllerPublishSecretRef", k8s.SecretReference.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
            this.nodePublishSecretRef = this.jsiiGet("nodePublishSecretRef", k8s.SecretReference.class);
            this.nodeStageSecretRef = this.jsiiGet("nodeStageSecretRef", k8s.SecretReference.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
            this.volumeAttributes = this.jsiiGet("volumeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String driver, final java.lang.String volumeHandle, final k8s.SecretReference controllerExpandSecretRef, final k8s.SecretReference controllerPublishSecretRef, final java.lang.String fsType, final k8s.SecretReference nodePublishSecretRef, final k8s.SecretReference nodeStageSecretRef, final java.lang.Boolean readOnly, final java.util.Map<java.lang.String, java.lang.String> volumeAttributes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(driver, "driver is required");
            this.volumeHandle = java.util.Objects.requireNonNull(volumeHandle, "volumeHandle is required");
            this.controllerExpandSecretRef = controllerExpandSecretRef;
            this.controllerPublishSecretRef = controllerPublishSecretRef;
            this.fsType = fsType;
            this.nodePublishSecretRef = nodePublishSecretRef;
            this.nodeStageSecretRef = nodeStageSecretRef;
            this.readOnly = readOnly;
            this.volumeAttributes = volumeAttributes;
        }

        @Override
        public java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        public java.lang.String getVolumeHandle() {
            return this.volumeHandle;
        }

        @Override
        public k8s.SecretReference getControllerExpandSecretRef() {
            return this.controllerExpandSecretRef;
        }

        @Override
        public k8s.SecretReference getControllerPublishSecretRef() {
            return this.controllerPublishSecretRef;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public k8s.SecretReference getNodePublishSecretRef() {
            return this.nodePublishSecretRef;
        }

        @Override
        public k8s.SecretReference getNodeStageSecretRef() {
            return this.nodeStageSecretRef;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes() {
            return this.volumeAttributes;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("driver", om.valueToTree(this.getDriver()));
            data.set("volumeHandle", om.valueToTree(this.getVolumeHandle()));
            if (this.getControllerExpandSecretRef() != null) {
                data.set("controllerExpandSecretRef", om.valueToTree(this.getControllerExpandSecretRef()));
            }
            if (this.getControllerPublishSecretRef() != null) {
                data.set("controllerPublishSecretRef", om.valueToTree(this.getControllerPublishSecretRef()));
            }
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getNodePublishSecretRef() != null) {
                data.set("nodePublishSecretRef", om.valueToTree(this.getNodePublishSecretRef()));
            }
            if (this.getNodeStageSecretRef() != null) {
                data.set("nodeStageSecretRef", om.valueToTree(this.getNodeStageSecretRef()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getVolumeAttributes() != null) {
                data.set("volumeAttributes", om.valueToTree(this.getVolumeAttributes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CSIPersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CSIPersistentVolumeSource.Jsii$Proxy that = (CSIPersistentVolumeSource.Jsii$Proxy) o;

            if (!driver.equals(that.driver)) return false;
            if (!volumeHandle.equals(that.volumeHandle)) return false;
            if (this.controllerExpandSecretRef != null ? !this.controllerExpandSecretRef.equals(that.controllerExpandSecretRef) : that.controllerExpandSecretRef != null) return false;
            if (this.controllerPublishSecretRef != null ? !this.controllerPublishSecretRef.equals(that.controllerPublishSecretRef) : that.controllerPublishSecretRef != null) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.nodePublishSecretRef != null ? !this.nodePublishSecretRef.equals(that.nodePublishSecretRef) : that.nodePublishSecretRef != null) return false;
            if (this.nodeStageSecretRef != null ? !this.nodeStageSecretRef.equals(that.nodeStageSecretRef) : that.nodeStageSecretRef != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.volumeAttributes != null ? this.volumeAttributes.equals(that.volumeAttributes) : that.volumeAttributes == null;
        }

        @Override
        public int hashCode() {
            int result = this.driver.hashCode();
            result = 31 * result + (this.volumeHandle.hashCode());
            result = 31 * result + (this.controllerExpandSecretRef != null ? this.controllerExpandSecretRef.hashCode() : 0);
            result = 31 * result + (this.controllerPublishSecretRef != null ? this.controllerPublishSecretRef.hashCode() : 0);
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.nodePublishSecretRef != null ? this.nodePublishSecretRef.hashCode() : 0);
            result = 31 * result + (this.nodeStageSecretRef != null ? this.nodeStageSecretRef.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.volumeAttributes != null ? this.volumeAttributes.hashCode() : 0);
            return result;
        }
    }
}
