package k8s;

/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.334Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PersistentVolumeClaimSpec")
@software.amazon.jsii.Jsii.Proxy(PersistentVolumeClaimSpec.Jsii$Proxy.class)
public interface PersistentVolumeClaimSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * AccessModes contains the desired access modes the volume should have.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessModes() {
        return null;
    }

    /**
     * This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source.
     * <p>
     * If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
     */
    default @org.jetbrains.annotations.Nullable k8s.TypedLocalObjectReference getDataSource() {
        return null;
    }

    /**
     * Resources represents the minimum resources the volume should have.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     */
    default @org.jetbrains.annotations.Nullable k8s.ResourceRequirements getResources() {
        return null;
    }

    /**
     * A label query over volumes to consider for binding.
     */
    default @org.jetbrains.annotations.Nullable k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * Name of the StorageClass required by the claim.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageClassName() {
        return null;
    }

    /**
     * volumeMode defines what type of volume is required by the claim.
     * <p>
     * Value of Filesystem is implied when not included in claim spec. This is a beta feature.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeMode() {
        return null;
    }

    /**
     * VolumeName is the binding reference to the PersistentVolume backing this claim.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVolumeName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PersistentVolumeClaimSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PersistentVolumeClaimSpec}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> accessModes;
        private k8s.TypedLocalObjectReference dataSource;
        private k8s.ResourceRequirements resources;
        private k8s.LabelSelector selector;
        private java.lang.String storageClassName;
        private java.lang.String volumeMode;
        private java.lang.String volumeName;

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getAccessModes}
         * @param accessModes AccessModes contains the desired access modes the volume should have.
         *                    More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
         * @return {@code this}
         */
        public Builder accessModes(java.util.List<java.lang.String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getDataSource}
         * @param dataSource This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source.
         *                   If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
         * @return {@code this}
         */
        public Builder dataSource(k8s.TypedLocalObjectReference dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getResources}
         * @param resources Resources represents the minimum resources the volume should have.
         *                  More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
         * @return {@code this}
         */
        public Builder resources(k8s.ResourceRequirements resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getSelector}
         * @param selector A label query over volumes to consider for binding.
         * @return {@code this}
         */
        public Builder selector(k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getStorageClassName}
         * @param storageClassName Name of the StorageClass required by the claim.
         *                         More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
         * @return {@code this}
         */
        public Builder storageClassName(java.lang.String storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getVolumeMode}
         * @param volumeMode volumeMode defines what type of volume is required by the claim.
         *                   Value of Filesystem is implied when not included in claim spec. This is a beta feature.
         * @return {@code this}
         */
        public Builder volumeMode(java.lang.String volumeMode) {
            this.volumeMode = volumeMode;
            return this;
        }

        /**
         * Sets the value of {@link PersistentVolumeClaimSpec#getVolumeName}
         * @param volumeName VolumeName is the binding reference to the PersistentVolume backing this claim.
         * @return {@code this}
         */
        public Builder volumeName(java.lang.String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PersistentVolumeClaimSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PersistentVolumeClaimSpec build() {
            return new Jsii$Proxy(accessModes, dataSource, resources, selector, storageClassName, volumeMode, volumeName);
        }
    }

    /**
     * An implementation for {@link PersistentVolumeClaimSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PersistentVolumeClaimSpec {
        private final java.util.List<java.lang.String> accessModes;
        private final k8s.TypedLocalObjectReference dataSource;
        private final k8s.ResourceRequirements resources;
        private final k8s.LabelSelector selector;
        private final java.lang.String storageClassName;
        private final java.lang.String volumeMode;
        private final java.lang.String volumeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessModes = this.jsiiGet("accessModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.dataSource = this.jsiiGet("dataSource", k8s.TypedLocalObjectReference.class);
            this.resources = this.jsiiGet("resources", k8s.ResourceRequirements.class);
            this.selector = this.jsiiGet("selector", k8s.LabelSelector.class);
            this.storageClassName = this.jsiiGet("storageClassName", java.lang.String.class);
            this.volumeMode = this.jsiiGet("volumeMode", java.lang.String.class);
            this.volumeName = this.jsiiGet("volumeName", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> accessModes, final k8s.TypedLocalObjectReference dataSource, final k8s.ResourceRequirements resources, final k8s.LabelSelector selector, final java.lang.String storageClassName, final java.lang.String volumeMode, final java.lang.String volumeName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessModes = accessModes;
            this.dataSource = dataSource;
            this.resources = resources;
            this.selector = selector;
            this.storageClassName = storageClassName;
            this.volumeMode = volumeMode;
            this.volumeName = volumeName;
        }

        @Override
        public java.util.List<java.lang.String> getAccessModes() {
            return this.accessModes;
        }

        @Override
        public k8s.TypedLocalObjectReference getDataSource() {
            return this.dataSource;
        }

        @Override
        public k8s.ResourceRequirements getResources() {
            return this.resources;
        }

        @Override
        public k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public java.lang.String getStorageClassName() {
            return this.storageClassName;
        }

        @Override
        public java.lang.String getVolumeMode() {
            return this.volumeMode;
        }

        @Override
        public java.lang.String getVolumeName() {
            return this.volumeName;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccessModes() != null) {
                data.set("accessModes", om.valueToTree(this.getAccessModes()));
            }
            if (this.getDataSource() != null) {
                data.set("dataSource", om.valueToTree(this.getDataSource()));
            }
            if (this.getResources() != null) {
                data.set("resources", om.valueToTree(this.getResources()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getStorageClassName() != null) {
                data.set("storageClassName", om.valueToTree(this.getStorageClassName()));
            }
            if (this.getVolumeMode() != null) {
                data.set("volumeMode", om.valueToTree(this.getVolumeMode()));
            }
            if (this.getVolumeName() != null) {
                data.set("volumeName", om.valueToTree(this.getVolumeName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PersistentVolumeClaimSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersistentVolumeClaimSpec.Jsii$Proxy that = (PersistentVolumeClaimSpec.Jsii$Proxy) o;

            if (this.accessModes != null ? !this.accessModes.equals(that.accessModes) : that.accessModes != null) return false;
            if (this.dataSource != null ? !this.dataSource.equals(that.dataSource) : that.dataSource != null) return false;
            if (this.resources != null ? !this.resources.equals(that.resources) : that.resources != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            if (this.storageClassName != null ? !this.storageClassName.equals(that.storageClassName) : that.storageClassName != null) return false;
            if (this.volumeMode != null ? !this.volumeMode.equals(that.volumeMode) : that.volumeMode != null) return false;
            return this.volumeName != null ? this.volumeName.equals(that.volumeName) : that.volumeName == null;
        }

        @Override
        public int hashCode() {
            int result = this.accessModes != null ? this.accessModes.hashCode() : 0;
            result = 31 * result + (this.dataSource != null ? this.dataSource.hashCode() : 0);
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.storageClassName != null ? this.storageClassName.hashCode() : 0);
            result = 31 * result + (this.volumeMode != null ? this.volumeMode.hashCode() : 0);
            result = 31 * result + (this.volumeName != null ? this.volumeName.hashCode() : 0);
            return result;
        }
    }
}
