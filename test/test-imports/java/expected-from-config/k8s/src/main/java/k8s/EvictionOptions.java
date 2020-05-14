package k8s;

/**
 * Eviction evicts a pod from its node subject to certain policies and safety constraints.
 * <p>
 * This is a subresource of Pod.  A request to cause such an eviction is created by POSTing to .../pods/<pod name>/evictions.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.219Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EvictionOptions")
@software.amazon.jsii.Jsii.Proxy(EvictionOptions.Jsii$Proxy.class)
public interface EvictionOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * DeleteOptions may be provided.
     */
    default @org.jetbrains.annotations.Nullable k8s.DeleteOptions getDeleteOptions() {
        return null;
    }

    /**
     * ObjectMeta describes the pod that is being evicted.
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EvictionOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EvictionOptions}
     */
    public static final class Builder {
        private k8s.DeleteOptions deleteOptions;
        private k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link EvictionOptions#getDeleteOptions}
         * @param deleteOptions DeleteOptions may be provided.
         * @return {@code this}
         */
        public Builder deleteOptions(k8s.DeleteOptions deleteOptions) {
            this.deleteOptions = deleteOptions;
            return this;
        }

        /**
         * Sets the value of {@link EvictionOptions#getMetadata}
         * @param metadata ObjectMeta describes the pod that is being evicted.
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EvictionOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public EvictionOptions build() {
            return new Jsii$Proxy(deleteOptions, metadata);
        }
    }

    /**
     * An implementation for {@link EvictionOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EvictionOptions {
        private final k8s.DeleteOptions deleteOptions;
        private final k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deleteOptions = this.jsiiGet("deleteOptions", k8s.DeleteOptions.class);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.DeleteOptions deleteOptions, final k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deleteOptions = deleteOptions;
            this.metadata = metadata;
        }

        @Override
        public k8s.DeleteOptions getDeleteOptions() {
            return this.deleteOptions;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDeleteOptions() != null) {
                data.set("deleteOptions", om.valueToTree(this.getDeleteOptions()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EvictionOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EvictionOptions.Jsii$Proxy that = (EvictionOptions.Jsii$Proxy) o;

            if (this.deleteOptions != null ? !this.deleteOptions.equals(that.deleteOptions) : that.deleteOptions != null) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public int hashCode() {
            int result = this.deleteOptions != null ? this.deleteOptions.hashCode() : 0;
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
