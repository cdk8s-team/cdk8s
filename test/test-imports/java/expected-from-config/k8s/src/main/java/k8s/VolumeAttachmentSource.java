package k8s;

/**
 * VolumeAttachmentSource represents a volume that should be attached.
 * <p>
 * Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.472Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.VolumeAttachmentSource")
@software.amazon.jsii.Jsii.Proxy(VolumeAttachmentSource.Jsii$Proxy.class)
public interface VolumeAttachmentSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource.
     * <p>
     * This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
     */
    default @org.jetbrains.annotations.Nullable k8s.PersistentVolumeSpec getInlineVolumeSpec() {
        return null;
    }

    /**
     * Name of the persistent volume to attach.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPersistentVolumeName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VolumeAttachmentSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeAttachmentSource}
     */
    public static final class Builder {
        private k8s.PersistentVolumeSpec inlineVolumeSpec;
        private java.lang.String persistentVolumeName;

        /**
         * Sets the value of {@link VolumeAttachmentSource#getInlineVolumeSpec}
         * @param inlineVolumeSpec inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource.
         *                         This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
         * @return {@code this}
         */
        public Builder inlineVolumeSpec(k8s.PersistentVolumeSpec inlineVolumeSpec) {
            this.inlineVolumeSpec = inlineVolumeSpec;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentSource#getPersistentVolumeName}
         * @param persistentVolumeName Name of the persistent volume to attach.
         * @return {@code this}
         */
        public Builder persistentVolumeName(java.lang.String persistentVolumeName) {
            this.persistentVolumeName = persistentVolumeName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VolumeAttachmentSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public VolumeAttachmentSource build() {
            return new Jsii$Proxy(inlineVolumeSpec, persistentVolumeName);
        }
    }

    /**
     * An implementation for {@link VolumeAttachmentSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeAttachmentSource {
        private final k8s.PersistentVolumeSpec inlineVolumeSpec;
        private final java.lang.String persistentVolumeName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.inlineVolumeSpec = this.jsiiGet("inlineVolumeSpec", k8s.PersistentVolumeSpec.class);
            this.persistentVolumeName = this.jsiiGet("persistentVolumeName", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.PersistentVolumeSpec inlineVolumeSpec, final java.lang.String persistentVolumeName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.inlineVolumeSpec = inlineVolumeSpec;
            this.persistentVolumeName = persistentVolumeName;
        }

        @Override
        public k8s.PersistentVolumeSpec getInlineVolumeSpec() {
            return this.inlineVolumeSpec;
        }

        @Override
        public java.lang.String getPersistentVolumeName() {
            return this.persistentVolumeName;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getInlineVolumeSpec() != null) {
                data.set("inlineVolumeSpec", om.valueToTree(this.getInlineVolumeSpec()));
            }
            if (this.getPersistentVolumeName() != null) {
                data.set("persistentVolumeName", om.valueToTree(this.getPersistentVolumeName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VolumeAttachmentSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeAttachmentSource.Jsii$Proxy that = (VolumeAttachmentSource.Jsii$Proxy) o;

            if (this.inlineVolumeSpec != null ? !this.inlineVolumeSpec.equals(that.inlineVolumeSpec) : that.inlineVolumeSpec != null) return false;
            return this.persistentVolumeName != null ? this.persistentVolumeName.equals(that.persistentVolumeName) : that.persistentVolumeName == null;
        }

        @Override
        public int hashCode() {
            int result = this.inlineVolumeSpec != null ? this.inlineVolumeSpec.hashCode() : 0;
            result = 31 * result + (this.persistentVolumeName != null ? this.persistentVolumeName.hashCode() : 0);
            return result;
        }
    }
}
