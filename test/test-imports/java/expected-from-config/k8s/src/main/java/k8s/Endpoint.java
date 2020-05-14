package k8s;

/**
 * Endpoint represents a single logical "backend" implementing a service.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.183Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Endpoint")
@software.amazon.jsii.Jsii.Proxy(Endpoint.Jsii$Proxy.class)
public interface Endpoint extends software.amazon.jsii.JsiiSerializable {

    /**
     * addresses of this endpoint.
     * <p>
     * The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAddresses();

    /**
     * conditions contains information about the current status of the endpoint.
     */
    default @org.jetbrains.annotations.Nullable k8s.EndpointConditions getConditions() {
        return null;
    }

    /**
     * hostname of this endpoint.
     * <p>
     * This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label (RFC 1123) validation.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostname() {
        return null;
    }

    /**
     * targetRef is a reference to a Kubernetes object that represents this endpoint.
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectReference getTargetRef() {
        return null;
    }

    /**
     * topology contains arbitrary topology information associated with the endpoint.
     * <p>
     * These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
     * where the endpoint is located. This should match the corresponding
     * node label.
     * topology.kubernetes.io/zone: the value indicates the zone where the
     * endpoint is located. This should match the corresponding node label.
     * topology.kubernetes.io/region: the value indicates the region where the
     * endpoint is located. This should match the corresponding node label.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTopology() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Endpoint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Endpoint}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> addresses;
        private k8s.EndpointConditions conditions;
        private java.lang.String hostname;
        private k8s.ObjectReference targetRef;
        private java.util.Map<java.lang.String, java.lang.String> topology;

        /**
         * Sets the value of {@link Endpoint#getAddresses}
         * @param addresses addresses of this endpoint. This parameter is required.
         *                  The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
         * @return {@code this}
         */
        public Builder addresses(java.util.List<java.lang.String> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getConditions}
         * @param conditions conditions contains information about the current status of the endpoint.
         * @return {@code this}
         */
        public Builder conditions(k8s.EndpointConditions conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getHostname}
         * @param hostname hostname of this endpoint.
         *                 This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label (RFC 1123) validation.
         * @return {@code this}
         */
        public Builder hostname(java.lang.String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getTargetRef}
         * @param targetRef targetRef is a reference to a Kubernetes object that represents this endpoint.
         * @return {@code this}
         */
        public Builder targetRef(k8s.ObjectReference targetRef) {
            this.targetRef = targetRef;
            return this;
        }

        /**
         * Sets the value of {@link Endpoint#getTopology}
         * @param topology topology contains arbitrary topology information associated with the endpoint.
         *                 These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
         *                 where the endpoint is located. This should match the corresponding
         *                 node label.
         *                 topology.kubernetes.io/zone: the value indicates the zone where the
         *                 endpoint is located. This should match the corresponding node label.
         *                 topology.kubernetes.io/region: the value indicates the region where the
         *                 endpoint is located. This should match the corresponding node label.
         * @return {@code this}
         */
        public Builder topology(java.util.Map<java.lang.String, java.lang.String> topology) {
            this.topology = topology;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Endpoint}
         * @throws NullPointerException if any required attribute was not provided
         */
        public Endpoint build() {
            return new Jsii$Proxy(addresses, conditions, hostname, targetRef, topology);
        }
    }

    /**
     * An implementation for {@link Endpoint}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Endpoint {
        private final java.util.List<java.lang.String> addresses;
        private final k8s.EndpointConditions conditions;
        private final java.lang.String hostname;
        private final k8s.ObjectReference targetRef;
        private final java.util.Map<java.lang.String, java.lang.String> topology;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.addresses = this.jsiiGet("addresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.conditions = this.jsiiGet("conditions", k8s.EndpointConditions.class);
            this.hostname = this.jsiiGet("hostname", java.lang.String.class);
            this.targetRef = this.jsiiGet("targetRef", k8s.ObjectReference.class);
            this.topology = this.jsiiGet("topology", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> addresses, final k8s.EndpointConditions conditions, final java.lang.String hostname, final k8s.ObjectReference targetRef, final java.util.Map<java.lang.String, java.lang.String> topology) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.addresses = java.util.Objects.requireNonNull(addresses, "addresses is required");
            this.conditions = conditions;
            this.hostname = hostname;
            this.targetRef = targetRef;
            this.topology = topology;
        }

        @Override
        public java.util.List<java.lang.String> getAddresses() {
            return this.addresses;
        }

        @Override
        public k8s.EndpointConditions getConditions() {
            return this.conditions;
        }

        @Override
        public java.lang.String getHostname() {
            return this.hostname;
        }

        @Override
        public k8s.ObjectReference getTargetRef() {
            return this.targetRef;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getTopology() {
            return this.topology;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("addresses", om.valueToTree(this.getAddresses()));
            if (this.getConditions() != null) {
                data.set("conditions", om.valueToTree(this.getConditions()));
            }
            if (this.getHostname() != null) {
                data.set("hostname", om.valueToTree(this.getHostname()));
            }
            if (this.getTargetRef() != null) {
                data.set("targetRef", om.valueToTree(this.getTargetRef()));
            }
            if (this.getTopology() != null) {
                data.set("topology", om.valueToTree(this.getTopology()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Endpoint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Endpoint.Jsii$Proxy that = (Endpoint.Jsii$Proxy) o;

            if (!addresses.equals(that.addresses)) return false;
            if (this.conditions != null ? !this.conditions.equals(that.conditions) : that.conditions != null) return false;
            if (this.hostname != null ? !this.hostname.equals(that.hostname) : that.hostname != null) return false;
            if (this.targetRef != null ? !this.targetRef.equals(that.targetRef) : that.targetRef != null) return false;
            return this.topology != null ? this.topology.equals(that.topology) : that.topology == null;
        }

        @Override
        public int hashCode() {
            int result = this.addresses.hashCode();
            result = 31 * result + (this.conditions != null ? this.conditions.hashCode() : 0);
            result = 31 * result + (this.hostname != null ? this.hostname.hashCode() : 0);
            result = 31 * result + (this.targetRef != null ? this.targetRef.hashCode() : 0);
            result = 31 * result + (this.topology != null ? this.topology.hashCode() : 0);
            return result;
        }
    }
}
