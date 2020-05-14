package k8s;

/**
 * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
 * <p>
 * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.442Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.StorageClassOptions")
@software.amazon.jsii.Jsii.Proxy(StorageClassOptions.Jsii$Proxy.class)
public interface StorageClassOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Provisioner indicates the type of the provisioner.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getProvisioner();

    /**
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * <p>
     * Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.TopologySelectorTerm> getAllowedTopologies() {
        return null;
    }

    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowVolumeExpansion() {
        return null;
    }

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMountOptions() {
        return null;
    }

    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return null;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy.
     * <p>
     * Defaults to Delete.
     * <p>
     * Default: Delete.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReclaimPolicy() {
        return null;
    }

    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
     * <p>
     * When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeBindingMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StorageClassOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StorageClassOptions}
     */
    public static final class Builder {
        private java.lang.String provisioner;
        private java.util.List<k8s.TopologySelectorTerm> allowedTopologies;
        private java.lang.Boolean allowVolumeExpansion;
        private k8s.ObjectMeta metadata;
        private java.util.List<java.lang.String> mountOptions;
        private java.util.Map<java.lang.String, java.lang.String> parameters;
        private java.lang.String reclaimPolicy;
        private java.lang.String volumeBindingMode;

        /**
         * Sets the value of {@link StorageClassOptions#getProvisioner}
         * @param provisioner Provisioner indicates the type of the provisioner. This parameter is required.
         * @return {@code this}
         */
        public Builder provisioner(java.lang.String provisioner) {
            this.provisioner = provisioner;
            return this;
        }

        /**
         * Sets the value of {@link StorageClassOptions#getAllowedTopologies}
         * @param allowedTopologies Restrict the node topologies where volumes can be dynamically provisioned.
         *                          Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
         * @return {@code this}
         */
        public Builder allowedTopologies(java.util.List<k8s.TopologySelectorTerm> allowedTopologies) {
            this.allowedTopologies = allowedTopologies;
            return this;
        }

        /**
         * Sets the value of {@link StorageClassOptions#getAllowVolumeExpansion}
         * @param allowVolumeExpansion AllowVolumeExpansion shows whether the storage class allow volume expand.
         * @return {@code this}
         */
        public Builder allowVolumeExpansion(java.lang.Boolean allowVolumeExpansion) {
            this.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }

        /**
         * Sets the value of {@link StorageClassOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link StorageClassOptions#getMountOptions}
         * @param mountOptions Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
         * @return {@code this}
         */
        public Builder mountOptions(java.util.List<java.lang.String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        /**
         * Sets the value of {@link StorageClassOptions#getParameters}
         * @param parameters Parameters holds the parameters for the provisioner that should create volumes of this storage class.
         * @return {@code this}
         */
        public Builder parameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sets the value of {@link StorageClassOptions#getReclaimPolicy}
         * @param reclaimPolicy Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy.
         *                      Defaults to Delete.
         * @return {@code this}
         */
        public Builder reclaimPolicy(java.lang.String reclaimPolicy) {
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }

        /**
         * Sets the value of {@link StorageClassOptions#getVolumeBindingMode}
         * @param volumeBindingMode VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
         *                          When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
         * @return {@code this}
         */
        public Builder volumeBindingMode(java.lang.String volumeBindingMode) {
            this.volumeBindingMode = volumeBindingMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StorageClassOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public StorageClassOptions build() {
            return new Jsii$Proxy(provisioner, allowedTopologies, allowVolumeExpansion, metadata, mountOptions, parameters, reclaimPolicy, volumeBindingMode);
        }
    }

    /**
     * An implementation for {@link StorageClassOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StorageClassOptions {
        private final java.lang.String provisioner;
        private final java.util.List<k8s.TopologySelectorTerm> allowedTopologies;
        private final java.lang.Boolean allowVolumeExpansion;
        private final k8s.ObjectMeta metadata;
        private final java.util.List<java.lang.String> mountOptions;
        private final java.util.Map<java.lang.String, java.lang.String> parameters;
        private final java.lang.String reclaimPolicy;
        private final java.lang.String volumeBindingMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.provisioner = this.jsiiGet("provisioner", java.lang.String.class);
            this.allowedTopologies = this.jsiiGet("allowedTopologies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.TopologySelectorTerm.class)));
            this.allowVolumeExpansion = this.jsiiGet("allowVolumeExpansion", java.lang.Boolean.class);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
            this.mountOptions = this.jsiiGet("mountOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.parameters = this.jsiiGet("parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.reclaimPolicy = this.jsiiGet("reclaimPolicy", java.lang.String.class);
            this.volumeBindingMode = this.jsiiGet("volumeBindingMode", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String provisioner, final java.util.List<k8s.TopologySelectorTerm> allowedTopologies, final java.lang.Boolean allowVolumeExpansion, final k8s.ObjectMeta metadata, final java.util.List<java.lang.String> mountOptions, final java.util.Map<java.lang.String, java.lang.String> parameters, final java.lang.String reclaimPolicy, final java.lang.String volumeBindingMode) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.provisioner = java.util.Objects.requireNonNull(provisioner, "provisioner is required");
            this.allowedTopologies = allowedTopologies;
            this.allowVolumeExpansion = allowVolumeExpansion;
            this.metadata = metadata;
            this.mountOptions = mountOptions;
            this.parameters = parameters;
            this.reclaimPolicy = reclaimPolicy;
            this.volumeBindingMode = volumeBindingMode;
        }

        @Override
        public java.lang.String getProvisioner() {
            return this.provisioner;
        }

        @Override
        public java.util.List<k8s.TopologySelectorTerm> getAllowedTopologies() {
            return this.allowedTopologies;
        }

        @Override
        public java.lang.Boolean getAllowVolumeExpansion() {
            return this.allowVolumeExpansion;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public java.util.List<java.lang.String> getMountOptions() {
            return this.mountOptions;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getParameters() {
            return this.parameters;
        }

        @Override
        public java.lang.String getReclaimPolicy() {
            return this.reclaimPolicy;
        }

        @Override
        public java.lang.String getVolumeBindingMode() {
            return this.volumeBindingMode;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("provisioner", om.valueToTree(this.getProvisioner()));
            if (this.getAllowedTopologies() != null) {
                data.set("allowedTopologies", om.valueToTree(this.getAllowedTopologies()));
            }
            if (this.getAllowVolumeExpansion() != null) {
                data.set("allowVolumeExpansion", om.valueToTree(this.getAllowVolumeExpansion()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getMountOptions() != null) {
                data.set("mountOptions", om.valueToTree(this.getMountOptions()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }
            if (this.getReclaimPolicy() != null) {
                data.set("reclaimPolicy", om.valueToTree(this.getReclaimPolicy()));
            }
            if (this.getVolumeBindingMode() != null) {
                data.set("volumeBindingMode", om.valueToTree(this.getVolumeBindingMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StorageClassOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StorageClassOptions.Jsii$Proxy that = (StorageClassOptions.Jsii$Proxy) o;

            if (!provisioner.equals(that.provisioner)) return false;
            if (this.allowedTopologies != null ? !this.allowedTopologies.equals(that.allowedTopologies) : that.allowedTopologies != null) return false;
            if (this.allowVolumeExpansion != null ? !this.allowVolumeExpansion.equals(that.allowVolumeExpansion) : that.allowVolumeExpansion != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            if (this.mountOptions != null ? !this.mountOptions.equals(that.mountOptions) : that.mountOptions != null) return false;
            if (this.parameters != null ? !this.parameters.equals(that.parameters) : that.parameters != null) return false;
            if (this.reclaimPolicy != null ? !this.reclaimPolicy.equals(that.reclaimPolicy) : that.reclaimPolicy != null) return false;
            return this.volumeBindingMode != null ? this.volumeBindingMode.equals(that.volumeBindingMode) : that.volumeBindingMode == null;
        }

        @Override
        public int hashCode() {
            int result = this.provisioner.hashCode();
            result = 31 * result + (this.allowedTopologies != null ? this.allowedTopologies.hashCode() : 0);
            result = 31 * result + (this.allowVolumeExpansion != null ? this.allowVolumeExpansion.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.mountOptions != null ? this.mountOptions.hashCode() : 0);
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            result = 31 * result + (this.reclaimPolicy != null ? this.reclaimPolicy.hashCode() : 0);
            result = 31 * result + (this.volumeBindingMode != null ? this.volumeBindingMode.hashCode() : 0);
            return result;
        }
    }
}
