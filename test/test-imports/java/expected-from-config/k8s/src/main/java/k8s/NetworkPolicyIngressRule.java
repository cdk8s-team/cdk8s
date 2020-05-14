package k8s;

/**
 * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector.
 * <p>
 * The traffic must match both ports and from.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.304Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.NetworkPolicyIngressRule")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicyIngressRule.Jsii$Proxy.class)
public interface NetworkPolicyIngressRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * List of sources which should be able to access the pods selected for this rule.
     * <p>
     * Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.NetworkPolicyPeer> getFrom() {
        return null;
    }

    /**
     * List of ports which should be made accessible on the pods selected for this rule.
     * <p>
     * Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.NetworkPolicyPort> getPorts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicyIngressRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicyIngressRule}
     */
    public static final class Builder {
        private java.util.List<k8s.NetworkPolicyPeer> from;
        private java.util.List<k8s.NetworkPolicyPort> ports;

        /**
         * Sets the value of {@link NetworkPolicyIngressRule#getFrom}
         * @param from List of sources which should be able to access the pods selected for this rule.
         *             Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
         * @return {@code this}
         */
        public Builder from(java.util.List<k8s.NetworkPolicyPeer> from) {
            this.from = from;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyIngressRule#getPorts}
         * @param ports List of ports which should be made accessible on the pods selected for this rule.
         *              Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
         * @return {@code this}
         */
        public Builder ports(java.util.List<k8s.NetworkPolicyPort> ports) {
            this.ports = ports;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicyIngressRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        public NetworkPolicyIngressRule build() {
            return new Jsii$Proxy(from, ports);
        }
    }

    /**
     * An implementation for {@link NetworkPolicyIngressRule}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicyIngressRule {
        private final java.util.List<k8s.NetworkPolicyPeer> from;
        private final java.util.List<k8s.NetworkPolicyPort> ports;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.from = this.jsiiGet("from", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.NetworkPolicyPeer.class)));
            this.ports = this.jsiiGet("ports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.NetworkPolicyPort.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.NetworkPolicyPeer> from, final java.util.List<k8s.NetworkPolicyPort> ports) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.from = from;
            this.ports = ports;
        }

        @Override
        public java.util.List<k8s.NetworkPolicyPeer> getFrom() {
            return this.from;
        }

        @Override
        public java.util.List<k8s.NetworkPolicyPort> getPorts() {
            return this.ports;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFrom() != null) {
                data.set("from", om.valueToTree(this.getFrom()));
            }
            if (this.getPorts() != null) {
                data.set("ports", om.valueToTree(this.getPorts()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NetworkPolicyIngressRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicyIngressRule.Jsii$Proxy that = (NetworkPolicyIngressRule.Jsii$Proxy) o;

            if (this.from != null ? !this.from.equals(that.from) : that.from != null) return false;
            return this.ports != null ? this.ports.equals(that.ports) : that.ports == null;
        }

        @Override
        public int hashCode() {
            int result = this.from != null ? this.from.hashCode() : 0;
            result = 31 * result + (this.ports != null ? this.ports.hashCode() : 0);
            return result;
        }
    }
}
