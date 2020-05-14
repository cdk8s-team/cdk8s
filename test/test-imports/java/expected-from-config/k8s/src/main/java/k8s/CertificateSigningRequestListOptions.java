package k8s;

/**
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.116Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CertificateSigningRequestListOptions")
@software.amazon.jsii.Jsii.Proxy(CertificateSigningRequestListOptions.Jsii$Proxy.class)
public interface CertificateSigningRequestListOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    @org.jetbrains.annotations.NotNull java.util.List<k8s.CertificateSigningRequest> getItems();

    /**
     */
    default @org.jetbrains.annotations.Nullable k8s.ListMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSigningRequestListOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSigningRequestListOptions}
     */
    public static final class Builder {
        private java.util.List<k8s.CertificateSigningRequest> items;
        private k8s.ListMeta metadata;

        /**
         * Sets the value of {@link CertificateSigningRequestListOptions#getItems}
         * @param items the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder items(java.util.List<k8s.CertificateSigningRequest> items) {
            this.items = items;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestListOptions#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(k8s.ListMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSigningRequestListOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CertificateSigningRequestListOptions build() {
            return new Jsii$Proxy(items, metadata);
        }
    }

    /**
     * An implementation for {@link CertificateSigningRequestListOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSigningRequestListOptions {
        private final java.util.List<k8s.CertificateSigningRequest> items;
        private final k8s.ListMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = this.jsiiGet("items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.CertificateSigningRequest.class)));
            this.metadata = this.jsiiGet("metadata", k8s.ListMeta.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.CertificateSigningRequest> items, final k8s.ListMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = java.util.Objects.requireNonNull(items, "items is required");
            this.metadata = metadata;
        }

        @Override
        public java.util.List<k8s.CertificateSigningRequest> getItems() {
            return this.items;
        }

        @Override
        public k8s.ListMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("items", om.valueToTree(this.getItems()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CertificateSigningRequestListOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSigningRequestListOptions.Jsii$Proxy that = (CertificateSigningRequestListOptions.Jsii$Proxy) o;

            if (!items.equals(that.items)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public int hashCode() {
            int result = this.items.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
