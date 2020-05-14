package k8s;

/**
 * ScaleSpec describes the attributes of a scale subresource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.404Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ScaleSpec")
@software.amazon.jsii.Jsii.Proxy(ScaleSpec.Jsii$Proxy.class)
public interface ScaleSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * desired number of instances for the scaled object.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ScaleSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ScaleSpec}
     */
    public static final class Builder {
        private java.lang.Number replicas;

        /**
         * Sets the value of {@link ScaleSpec#getReplicas}
         * @param replicas desired number of instances for the scaled object.
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ScaleSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ScaleSpec build() {
            return new Jsii$Proxy(replicas);
        }
    }

    /**
     * An implementation for {@link ScaleSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ScaleSpec {
        private final java.lang.Number replicas;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.replicas = this.jsiiGet("replicas", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number replicas) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.replicas = replicas;
        }

        @Override
        public java.lang.Number getReplicas() {
            return this.replicas;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ScaleSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ScaleSpec.Jsii$Proxy that = (ScaleSpec.Jsii$Proxy) o;

            return this.replicas != null ? this.replicas.equals(that.replicas) : that.replicas == null;
        }

        @Override
        public int hashCode() {
            int result = this.replicas != null ? this.replicas.hashCode() : 0;
            return result;
        }
    }
}
