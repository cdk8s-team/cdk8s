package k8s;

/**
 * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.472Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.VolumeAttachmentSpec")
@software.amazon.jsii.Jsii.Proxy(VolumeAttachmentSpec.Jsii$Proxy.class)
public interface VolumeAttachmentSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Attacher indicates the name of the volume driver that MUST handle this request.
     * <p>
     * This is the name returned by GetPluginName().
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAttacher();

    /**
     * The node that the volume should be attached to.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getNodeName();

    /**
     * Source represents the volume that should be attached.
     */
    @org.jetbrains.annotations.NotNull k8s.VolumeAttachmentSource getSource();

    /**
     * @return a {@link Builder} of {@link VolumeAttachmentSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeAttachmentSpec}
     */
    public static final class Builder {
        private java.lang.String attacher;
        private java.lang.String nodeName;
        private k8s.VolumeAttachmentSource source;

        /**
         * Sets the value of {@link VolumeAttachmentSpec#getAttacher}
         * @param attacher Attacher indicates the name of the volume driver that MUST handle this request. This parameter is required.
         *                 This is the name returned by GetPluginName().
         * @return {@code this}
         */
        public Builder attacher(java.lang.String attacher) {
            this.attacher = attacher;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentSpec#getNodeName}
         * @param nodeName The node that the volume should be attached to. This parameter is required.
         * @return {@code this}
         */
        public Builder nodeName(java.lang.String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentSpec#getSource}
         * @param source Source represents the volume that should be attached. This parameter is required.
         * @return {@code this}
         */
        public Builder source(k8s.VolumeAttachmentSource source) {
            this.source = source;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VolumeAttachmentSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public VolumeAttachmentSpec build() {
            return new Jsii$Proxy(attacher, nodeName, source);
        }
    }

    /**
     * An implementation for {@link VolumeAttachmentSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeAttachmentSpec {
        private final java.lang.String attacher;
        private final java.lang.String nodeName;
        private final k8s.VolumeAttachmentSource source;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.attacher = this.jsiiGet("attacher", java.lang.String.class);
            this.nodeName = this.jsiiGet("nodeName", java.lang.String.class);
            this.source = this.jsiiGet("source", k8s.VolumeAttachmentSource.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String attacher, final java.lang.String nodeName, final k8s.VolumeAttachmentSource source) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attacher = java.util.Objects.requireNonNull(attacher, "attacher is required");
            this.nodeName = java.util.Objects.requireNonNull(nodeName, "nodeName is required");
            this.source = java.util.Objects.requireNonNull(source, "source is required");
        }

        @Override
        public java.lang.String getAttacher() {
            return this.attacher;
        }

        @Override
        public java.lang.String getNodeName() {
            return this.nodeName;
        }

        @Override
        public k8s.VolumeAttachmentSource getSource() {
            return this.source;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("attacher", om.valueToTree(this.getAttacher()));
            data.set("nodeName", om.valueToTree(this.getNodeName()));
            data.set("source", om.valueToTree(this.getSource()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VolumeAttachmentSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeAttachmentSpec.Jsii$Proxy that = (VolumeAttachmentSpec.Jsii$Proxy) o;

            if (!attacher.equals(that.attacher)) return false;
            if (!nodeName.equals(that.nodeName)) return false;
            return this.source.equals(that.source);
        }

        @Override
        public int hashCode() {
            int result = this.attacher.hashCode();
            result = 31 * result + (this.nodeName.hashCode());
            result = 31 * result + (this.source.hashCode());
            return result;
        }
    }
}
