package k8s;

/**
 * IngressBackend describes all endpoints for a given service and port.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.240Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.IngressBackend")
@software.amazon.jsii.Jsii.Proxy(IngressBackend.Jsii$Proxy.class)
public interface IngressBackend extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the name of the referenced service.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getServiceName();

    /**
     * Specifies the port of the referenced service.
     */
    @org.jetbrains.annotations.NotNull k8s.IntOrString getServicePort();

    /**
     * @return a {@link Builder} of {@link IngressBackend}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressBackend}
     */
    public static final class Builder {
        private java.lang.String serviceName;
        private k8s.IntOrString servicePort;

        /**
         * Sets the value of {@link IngressBackend#getServiceName}
         * @param serviceName Specifies the name of the referenced service. This parameter is required.
         * @return {@code this}
         */
        public Builder serviceName(java.lang.String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Sets the value of {@link IngressBackend#getServicePort}
         * @param servicePort Specifies the port of the referenced service. This parameter is required.
         * @return {@code this}
         */
        public Builder servicePort(k8s.IntOrString servicePort) {
            this.servicePort = servicePort;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressBackend}
         * @throws NullPointerException if any required attribute was not provided
         */
        public IngressBackend build() {
            return new Jsii$Proxy(serviceName, servicePort);
        }
    }

    /**
     * An implementation for {@link IngressBackend}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressBackend {
        private final java.lang.String serviceName;
        private final k8s.IntOrString servicePort;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.serviceName = this.jsiiGet("serviceName", java.lang.String.class);
            this.servicePort = this.jsiiGet("servicePort", k8s.IntOrString.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String serviceName, final k8s.IntOrString servicePort) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.serviceName = java.util.Objects.requireNonNull(serviceName, "serviceName is required");
            this.servicePort = java.util.Objects.requireNonNull(servicePort, "servicePort is required");
        }

        @Override
        public java.lang.String getServiceName() {
            return this.serviceName;
        }

        @Override
        public k8s.IntOrString getServicePort() {
            return this.servicePort;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("serviceName", om.valueToTree(this.getServiceName()));
            data.set("servicePort", om.valueToTree(this.getServicePort()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressBackend"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressBackend.Jsii$Proxy that = (IngressBackend.Jsii$Proxy) o;

            if (!serviceName.equals(that.serviceName)) return false;
            return this.servicePort.equals(that.servicePort);
        }

        @Override
        public int hashCode() {
            int result = this.serviceName.hashCode();
            result = 31 * result + (this.servicePort.hashCode());
            return result;
        }
    }
}
