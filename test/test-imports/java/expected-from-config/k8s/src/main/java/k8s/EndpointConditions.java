package k8s;

/**
 * EndpointConditions represents the current condition of an endpoint.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.184Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EndpointConditions")
@software.amazon.jsii.Jsii.Proxy(EndpointConditions.Jsii$Proxy.class)
public interface EndpointConditions extends software.amazon.jsii.JsiiSerializable {

    /**
     * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint.
     * <p>
     * A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReady() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointConditions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointConditions}
     */
    public static final class Builder {
        private java.lang.Boolean ready;

        /**
         * Sets the value of {@link EndpointConditions#getReady}
         * @param ready ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint.
         *              A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
         * @return {@code this}
         */
        public Builder ready(java.lang.Boolean ready) {
            this.ready = ready;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointConditions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public EndpointConditions build() {
            return new Jsii$Proxy(ready);
        }
    }

    /**
     * An implementation for {@link EndpointConditions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointConditions {
        private final java.lang.Boolean ready;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ready = this.jsiiGet("ready", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Boolean ready) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ready = ready;
        }

        @Override
        public java.lang.Boolean getReady() {
            return this.ready;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getReady() != null) {
                data.set("ready", om.valueToTree(this.getReady()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointConditions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointConditions.Jsii$Proxy that = (EndpointConditions.Jsii$Proxy) o;

            return this.ready != null ? this.ready.equals(that.ready) : that.ready == null;
        }

        @Override
        public int hashCode() {
            int result = this.ready != null ? this.ready.hashCode() : 0;
            return result;
        }
    }
}
