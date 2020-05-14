package k8s;

/**
 * Binding ties one object to another;
 * <p>
 * for example, a pod is bound to a node by a scheduler. Deprecated in 1.7, please use the bindings subresource of pods instead.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.096Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.BindingOptions")
@software.amazon.jsii.Jsii.Proxy(BindingOptions.Jsii$Proxy.class)
public interface BindingOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * The target object that you want to bind to the standard object.
     */
    @org.jetbrains.annotations.NotNull k8s.ObjectReference getTarget();

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BindingOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BindingOptions}
     */
    public static final class Builder {
        private k8s.ObjectReference target;
        private k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link BindingOptions#getTarget}
         * @param target The target object that you want to bind to the standard object. This parameter is required.
         * @return {@code this}
         */
        public Builder target(k8s.ObjectReference target) {
            this.target = target;
            return this;
        }

        /**
         * Sets the value of {@link BindingOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BindingOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public BindingOptions build() {
            return new Jsii$Proxy(target, metadata);
        }
    }

    /**
     * An implementation for {@link BindingOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BindingOptions {
        private final k8s.ObjectReference target;
        private final k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.target = this.jsiiGet("target", k8s.ObjectReference.class);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.ObjectReference target, final k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.target = java.util.Objects.requireNonNull(target, "target is required");
            this.metadata = metadata;
        }

        @Override
        public k8s.ObjectReference getTarget() {
            return this.target;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("target", om.valueToTree(this.getTarget()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.BindingOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BindingOptions.Jsii$Proxy that = (BindingOptions.Jsii$Proxy) o;

            if (!target.equals(that.target)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public int hashCode() {
            int result = this.target.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
