package k8s;

/**
 * ScaleIOVolumeSource represents a persistent ScaleIO volume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.403Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ScaleIOVolumeSource")
@software.amazon.jsii.Jsii.Proxy(ScaleIOVolumeSource.Jsii$Proxy.class)
public interface ScaleIOVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * The host address of the ScaleIO API Gateway.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getGateway();

    /**
     * SecretRef references to the secret for ScaleIO user and other sensitive information.
     * <p>
     * If this is not provided, Login operation will fail.
     */
    @org.jetbrains.annotations.NotNull k8s.LocalObjectReference getSecretRef();

    /**
     * The name of the storage system as configured in ScaleIO.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSystem();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
     * <p>
     * Default: xfs".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * The name of the ScaleIO Protection Domain for the configured storage.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtectionDomain() {
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
     * Flag to enable/disable SSL communication with Gateway, default false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSslEnabled() {
        return null;
    }

    /**
     * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
     * <p>
     * Default is ThinProvisioned.
     * <p>
     * Default: ThinProvisioned.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageMode() {
        return null;
    }

    /**
     * The ScaleIO Storage Pool associated with the protection domain.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStoragePool() {
        return null;
    }

    /**
     * The name of a volume already created in the ScaleIO system that is associated with this volume source.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ScaleIOVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ScaleIOVolumeSource}
     */
    public static final class Builder {
        private java.lang.String gateway;
        private k8s.LocalObjectReference secretRef;
        private java.lang.String system;
        private java.lang.String fsType;
        private java.lang.String protectionDomain;
        private java.lang.Boolean readOnly;
        private java.lang.Boolean sslEnabled;
        private java.lang.String storageMode;
        private java.lang.String storagePool;
        private java.lang.String volumeName;

        /**
         * Sets the value of {@link ScaleIOVolumeSource#getGateway}
         * @param gateway The host address of the ScaleIO API Gateway. This parameter is required.
         * @return {@code this}
         */
        public Builder gateway(java.lang.String gateway) {
            this.gateway = gateway;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIOVolumeSource#getSecretRef}
         * @param secretRef SecretRef references to the secret for ScaleIO user and other sensitive information. This parameter is required.
         *                  If this is not provided, Login operation will fail.
         * @return {@code this}
         */
        public Builder secretRef(k8s.LocalObjectReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIOVolumeSource#getSystem}
         * @param system The name of the storage system as configured in ScaleIO. This parameter is required.
         * @return {@code this}
         */
        public Builder system(java.lang.String system) {
            this.system = system;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIOVolumeSource#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIOVolumeSource#getProtectionDomain}
         * @param protectionDomain The name of the ScaleIO Protection Domain for the configured storage.
         * @return {@code this}
         */
        public Builder protectionDomain(java.lang.String protectionDomain) {
            this.protectionDomain = protectionDomain;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIOVolumeSource#getReadOnly}
         * @param readOnly Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIOVolumeSource#getSslEnabled}
         * @param sslEnabled Flag to enable/disable SSL communication with Gateway, default false.
         * @return {@code this}
         */
        public Builder sslEnabled(java.lang.Boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIOVolumeSource#getStorageMode}
         * @param storageMode Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
         *                    Default is ThinProvisioned.
         * @return {@code this}
         */
        public Builder storageMode(java.lang.String storageMode) {
            this.storageMode = storageMode;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIOVolumeSource#getStoragePool}
         * @param storagePool The ScaleIO Storage Pool associated with the protection domain.
         * @return {@code this}
         */
        public Builder storagePool(java.lang.String storagePool) {
            this.storagePool = storagePool;
            return this;
        }

        /**
         * Sets the value of {@link ScaleIOVolumeSource#getVolumeName}
         * @param volumeName The name of a volume already created in the ScaleIO system that is associated with this volume source.
         * @return {@code this}
         */
        public Builder volumeName(java.lang.String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ScaleIOVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ScaleIOVolumeSource build() {
            return new Jsii$Proxy(gateway, secretRef, system, fsType, protectionDomain, readOnly, sslEnabled, storageMode, storagePool, volumeName);
        }
    }

    /**
     * An implementation for {@link ScaleIOVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ScaleIOVolumeSource {
        private final java.lang.String gateway;
        private final k8s.LocalObjectReference secretRef;
        private final java.lang.String system;
        private final java.lang.String fsType;
        private final java.lang.String protectionDomain;
        private final java.lang.Boolean readOnly;
        private final java.lang.Boolean sslEnabled;
        private final java.lang.String storageMode;
        private final java.lang.String storagePool;
        private final java.lang.String volumeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.gateway = this.jsiiGet("gateway", java.lang.String.class);
            this.secretRef = this.jsiiGet("secretRef", k8s.LocalObjectReference.class);
            this.system = this.jsiiGet("system", java.lang.String.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
            this.protectionDomain = this.jsiiGet("protectionDomain", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
            this.sslEnabled = this.jsiiGet("sslEnabled", java.lang.Boolean.class);
            this.storageMode = this.jsiiGet("storageMode", java.lang.String.class);
            this.storagePool = this.jsiiGet("storagePool", java.lang.String.class);
            this.volumeName = this.jsiiGet("volumeName", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String gateway, final k8s.LocalObjectReference secretRef, final java.lang.String system, final java.lang.String fsType, final java.lang.String protectionDomain, final java.lang.Boolean readOnly, final java.lang.Boolean sslEnabled, final java.lang.String storageMode, final java.lang.String storagePool, final java.lang.String volumeName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.gateway = java.util.Objects.requireNonNull(gateway, "gateway is required");
            this.secretRef = java.util.Objects.requireNonNull(secretRef, "secretRef is required");
            this.system = java.util.Objects.requireNonNull(system, "system is required");
            this.fsType = fsType;
            this.protectionDomain = protectionDomain;
            this.readOnly = readOnly;
            this.sslEnabled = sslEnabled;
            this.storageMode = storageMode;
            this.storagePool = storagePool;
            this.volumeName = volumeName;
        }

        @Override
        public java.lang.String getGateway() {
            return this.gateway;
        }

        @Override
        public k8s.LocalObjectReference getSecretRef() {
            return this.secretRef;
        }

        @Override
        public java.lang.String getSystem() {
            return this.system;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public java.lang.String getProtectionDomain() {
            return this.protectionDomain;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public java.lang.Boolean getSslEnabled() {
            return this.sslEnabled;
        }

        @Override
        public java.lang.String getStorageMode() {
            return this.storageMode;
        }

        @Override
        public java.lang.String getStoragePool() {
            return this.storagePool;
        }

        @Override
        public java.lang.String getVolumeName() {
            return this.volumeName;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("gateway", om.valueToTree(this.getGateway()));
            data.set("secretRef", om.valueToTree(this.getSecretRef()));
            data.set("system", om.valueToTree(this.getSystem()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getProtectionDomain() != null) {
                data.set("protectionDomain", om.valueToTree(this.getProtectionDomain()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSslEnabled() != null) {
                data.set("sslEnabled", om.valueToTree(this.getSslEnabled()));
            }
            if (this.getStorageMode() != null) {
                data.set("storageMode", om.valueToTree(this.getStorageMode()));
            }
            if (this.getStoragePool() != null) {
                data.set("storagePool", om.valueToTree(this.getStoragePool()));
            }
            if (this.getVolumeName() != null) {
                data.set("volumeName", om.valueToTree(this.getVolumeName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ScaleIOVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ScaleIOVolumeSource.Jsii$Proxy that = (ScaleIOVolumeSource.Jsii$Proxy) o;

            if (!gateway.equals(that.gateway)) return false;
            if (!secretRef.equals(that.secretRef)) return false;
            if (!system.equals(that.system)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.protectionDomain != null ? !this.protectionDomain.equals(that.protectionDomain) : that.protectionDomain != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.sslEnabled != null ? !this.sslEnabled.equals(that.sslEnabled) : that.sslEnabled != null) return false;
            if (this.storageMode != null ? !this.storageMode.equals(that.storageMode) : that.storageMode != null) return false;
            if (this.storagePool != null ? !this.storagePool.equals(that.storagePool) : that.storagePool != null) return false;
            return this.volumeName != null ? this.volumeName.equals(that.volumeName) : that.volumeName == null;
        }

        @Override
        public int hashCode() {
            int result = this.gateway.hashCode();
            result = 31 * result + (this.secretRef.hashCode());
            result = 31 * result + (this.system.hashCode());
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.protectionDomain != null ? this.protectionDomain.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.sslEnabled != null ? this.sslEnabled.hashCode() : 0);
            result = 31 * result + (this.storageMode != null ? this.storageMode.hashCode() : 0);
            result = 31 * result + (this.storagePool != null ? this.storagePool.hashCode() : 0);
            result = 31 * result + (this.volumeName != null ? this.volumeName.hashCode() : 0);
            return result;
        }
    }
}
