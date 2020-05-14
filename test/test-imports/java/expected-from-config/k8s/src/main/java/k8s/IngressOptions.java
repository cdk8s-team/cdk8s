package k8s;

/**
 * Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend.
 * <p>
 * An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.244Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.IngressOptions")
@software.amazon.jsii.Jsii.Proxy(IngressOptions.Jsii$Proxy.class)
public interface IngressOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Spec is the desired state of the Ingress.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     */
    default @org.jetbrains.annotations.Nullable k8s.IngressSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressOptions}
     */
    public static final class Builder {
        private k8s.ObjectMeta metadata;
        private k8s.IngressSpec spec;

        /**
         * Sets the value of {@link IngressOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link IngressOptions#getSpec}
         * @param spec Spec is the desired state of the Ingress.
         *             More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * @return {@code this}
         */
        public Builder spec(k8s.IngressSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public IngressOptions build() {
            return new Jsii$Proxy(metadata, spec);
        }
    }

    /**
     * An implementation for {@link IngressOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressOptions {
        private final k8s.ObjectMeta metadata;
        private final k8s.IngressSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
            this.spec = this.jsiiGet("spec", k8s.IngressSpec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.ObjectMeta metadata, final k8s.IngressSpec spec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.spec = spec;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public k8s.IngressSpec getSpec() {
            return this.spec;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressOptions.Jsii$Proxy that = (IngressOptions.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
