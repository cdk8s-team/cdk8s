package k8s;

/**
 * EndpointPort is a tuple that describes a single port.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.184Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EndpointPort")
@software.amazon.jsii.Jsii.Proxy(EndpointPort.Jsii$Proxy.class)
public interface EndpointPort extends software.amazon.jsii.JsiiSerializable {

    /**
     * The port number of the endpoint.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPort();

    /**
     * The name of this port.
     * <p>
     * This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * The IP protocol for this port.
     * <p>
     * Must be UDP, TCP, or SCTP. Default is TCP.
     * <p>
     * Default: TCP.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointPort}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointPort}
     */
    public static final class Builder {
        private java.lang.Number port;
        private java.lang.String name;
        private java.lang.String protocol;

        /**
         * Sets the value of {@link EndpointPort#getPort}
         * @param port The port number of the endpoint. This parameter is required.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link EndpointPort#getName}
         * @param name The name of this port.
         *             This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EndpointPort#getProtocol}
         * @param protocol The IP protocol for this port.
         *                 Must be UDP, TCP, or SCTP. Default is TCP.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointPort}
         * @throws NullPointerException if any required attribute was not provided
         */
        public EndpointPort build() {
            return new Jsii$Proxy(port, name, protocol);
        }
    }

    /**
     * An implementation for {@link EndpointPort}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointPort {
        private final java.lang.Number port;
        private final java.lang.String name;
        private final java.lang.String protocol;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.port = this.jsiiGet("port", java.lang.Number.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.protocol = this.jsiiGet("protocol", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number port, final java.lang.String name, final java.lang.String protocol) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.port = java.util.Objects.requireNonNull(port, "port is required");
            this.name = name;
            this.protocol = protocol;
        }

        @Override
        public java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("port", om.valueToTree(this.getPort()));
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointPort"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointPort.Jsii$Proxy that = (EndpointPort.Jsii$Proxy) o;

            if (!port.equals(that.port)) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.protocol != null ? this.protocol.equals(that.protocol) : that.protocol == null;
        }

        @Override
        public int hashCode() {
            int result = this.port.hashCode();
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            return result;
        }
    }
}
