package k8s;

/**
 * NamespaceSpec describes the attributes on a Namespace.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.300Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.NamespaceSpec")
@software.amazon.jsii.Jsii.Proxy(NamespaceSpec.Jsii$Proxy.class)
public interface NamespaceSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Finalizers is an opaque list of values that must be empty to permanently remove object from storage.
     * <p>
     * More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getFinalizers() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NamespaceSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NamespaceSpec}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> finalizers;

        /**
         * Sets the value of {@link NamespaceSpec#getFinalizers}
         * @param finalizers Finalizers is an opaque list of values that must be empty to permanently remove object from storage.
         *                   More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
         * @return {@code this}
         */
        public Builder finalizers(java.util.List<java.lang.String> finalizers) {
            this.finalizers = finalizers;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NamespaceSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public NamespaceSpec build() {
            return new Jsii$Proxy(finalizers);
        }
    }

    /**
     * An implementation for {@link NamespaceSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NamespaceSpec {
        private final java.util.List<java.lang.String> finalizers;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.finalizers = this.jsiiGet("finalizers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> finalizers) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.finalizers = finalizers;
        }

        @Override
        public java.util.List<java.lang.String> getFinalizers() {
            return this.finalizers;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFinalizers() != null) {
                data.set("finalizers", om.valueToTree(this.getFinalizers()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NamespaceSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NamespaceSpec.Jsii$Proxy that = (NamespaceSpec.Jsii$Proxy) o;

            return this.finalizers != null ? this.finalizers.equals(that.finalizers) : that.finalizers == null;
        }

        @Override
        public int hashCode() {
            int result = this.finalizers != null ? this.finalizers.hashCode() : 0;
            return result;
        }
    }
}
