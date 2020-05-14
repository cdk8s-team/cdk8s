package k8s;

/**
 * EndpointAddress is a tuple that describes single IP address.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.183Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EndpointAddress")
@software.amazon.jsii.Jsii.Proxy(EndpointAddress.Jsii$Proxy.class)
public interface EndpointAddress extends software.amazon.jsii.JsiiSerializable {

    /**
     * The IP of this endpoint.
     * <p>
     * May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIp();

    /**
     * The Hostname of this endpoint.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostname() {
        return null;
    }

    /**
     * Optional: Node hosting this endpoint.
     * <p>
     * This can be used to determine endpoints local to a node.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNodeName() {
        return null;
    }

    /**
     * Reference to object providing the endpoint.
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectReference getTargetRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointAddress}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointAddress}
     */
    public static final class Builder {
        private java.lang.String ip;
        private java.lang.String hostname;
        private java.lang.String nodeName;
        private k8s.ObjectReference targetRef;

        /**
         * Sets the value of {@link EndpointAddress#getIp}
         * @param ip The IP of this endpoint. This parameter is required.
         *           May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
         * @return {@code this}
         */
        public Builder ip(java.lang.String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * Sets the value of {@link EndpointAddress#getHostname}
         * @param hostname The Hostname of this endpoint.
         * @return {@code this}
         */
        public Builder hostname(java.lang.String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Sets the value of {@link EndpointAddress#getNodeName}
         * @param nodeName Optional: Node hosting this endpoint.
         *                 This can be used to determine endpoints local to a node.
         * @return {@code this}
         */
        public Builder nodeName(java.lang.String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Sets the value of {@link EndpointAddress#getTargetRef}
         * @param targetRef Reference to object providing the endpoint.
         * @return {@code this}
         */
        public Builder targetRef(k8s.ObjectReference targetRef) {
            this.targetRef = targetRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointAddress}
         * @throws NullPointerException if any required attribute was not provided
         */
        public EndpointAddress build() {
            return new Jsii$Proxy(ip, hostname, nodeName, targetRef);
        }
    }

    /**
     * An implementation for {@link EndpointAddress}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointAddress {
        private final java.lang.String ip;
        private final java.lang.String hostname;
        private final java.lang.String nodeName;
        private final k8s.ObjectReference targetRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ip = this.jsiiGet("ip", java.lang.String.class);
            this.hostname = this.jsiiGet("hostname", java.lang.String.class);
            this.nodeName = this.jsiiGet("nodeName", java.lang.String.class);
            this.targetRef = this.jsiiGet("targetRef", k8s.ObjectReference.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String ip, final java.lang.String hostname, final java.lang.String nodeName, final k8s.ObjectReference targetRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ip = java.util.Objects.requireNonNull(ip, "ip is required");
            this.hostname = hostname;
            this.nodeName = nodeName;
            this.targetRef = targetRef;
        }

        @Override
        public java.lang.String getIp() {
            return this.ip;
        }

        @Override
        public java.lang.String getHostname() {
            return this.hostname;
        }

        @Override
        public java.lang.String getNodeName() {
            return this.nodeName;
        }

        @Override
        public k8s.ObjectReference getTargetRef() {
            return this.targetRef;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("ip", om.valueToTree(this.getIp()));
            if (this.getHostname() != null) {
                data.set("hostname", om.valueToTree(this.getHostname()));
            }
            if (this.getNodeName() != null) {
                data.set("nodeName", om.valueToTree(this.getNodeName()));
            }
            if (this.getTargetRef() != null) {
                data.set("targetRef", om.valueToTree(this.getTargetRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointAddress"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointAddress.Jsii$Proxy that = (EndpointAddress.Jsii$Proxy) o;

            if (!ip.equals(that.ip)) return false;
            if (this.hostname != null ? !this.hostname.equals(that.hostname) : that.hostname != null) return false;
            if (this.nodeName != null ? !this.nodeName.equals(that.nodeName) : that.nodeName != null) return false;
            return this.targetRef != null ? this.targetRef.equals(that.targetRef) : that.targetRef == null;
        }

        @Override
        public int hashCode() {
            int result = this.ip.hashCode();
            result = 31 * result + (this.hostname != null ? this.hostname.hashCode() : 0);
            result = 31 * result + (this.nodeName != null ? this.nodeName.hashCode() : 0);
            result = 31 * result + (this.targetRef != null ? this.targetRef.hashCode() : 0);
            return result;
        }
    }
}
