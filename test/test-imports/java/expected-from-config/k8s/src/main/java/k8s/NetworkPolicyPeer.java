package k8s;

/**
 * NetworkPolicyPeer describes a peer to allow traffic from.
 * <p>
 * Only certain combinations of fields are allowed
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.307Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.NetworkPolicyPeer")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicyPeer.Jsii$Proxy.class)
public interface NetworkPolicyPeer extends software.amazon.jsii.JsiiSerializable {

    /**
     * IPBlock defines policy on a particular IPBlock.
     * <p>
     * If this field is set then neither of the other fields can be.
     */
    default @org.jetbrains.annotations.Nullable k8s.IpBlock getIpBlock() {
        return null;
    }

    /**
     * Selects Namespaces using cluster-scoped labels.
     * <p>
     * This field follows standard label selector semantics; if present but empty, it selects all namespaces.
     * <p>
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     */
    default @org.jetbrains.annotations.Nullable k8s.LabelSelector getNamespaceSelector() {
        return null;
    }

    /**
     * This is a label selector which selects Pods.
     * <p>
     * This field follows standard label selector semantics; if present but empty, it selects all pods.
     * <p>
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     */
    default @org.jetbrains.annotations.Nullable k8s.LabelSelector getPodSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicyPeer}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicyPeer}
     */
    public static final class Builder {
        private k8s.IpBlock ipBlock;
        private k8s.LabelSelector namespaceSelector;
        private k8s.LabelSelector podSelector;

        /**
         * Sets the value of {@link NetworkPolicyPeer#getIpBlock}
         * @param ipBlock IPBlock defines policy on a particular IPBlock.
         *                If this field is set then neither of the other fields can be.
         * @return {@code this}
         */
        public Builder ipBlock(k8s.IpBlock ipBlock) {
            this.ipBlock = ipBlock;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyPeer#getNamespaceSelector}
         * @param namespaceSelector Selects Namespaces using cluster-scoped labels.
         *                          This field follows standard label selector semantics; if present but empty, it selects all namespaces.
         *                          <p>
         *                          If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
         * @return {@code this}
         */
        public Builder namespaceSelector(k8s.LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyPeer#getPodSelector}
         * @param podSelector This is a label selector which selects Pods.
         *                    This field follows standard label selector semantics; if present but empty, it selects all pods.
         *                    <p>
         *                    If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
         * @return {@code this}
         */
        public Builder podSelector(k8s.LabelSelector podSelector) {
            this.podSelector = podSelector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicyPeer}
         * @throws NullPointerException if any required attribute was not provided
         */
        public NetworkPolicyPeer build() {
            return new Jsii$Proxy(ipBlock, namespaceSelector, podSelector);
        }
    }

    /**
     * An implementation for {@link NetworkPolicyPeer}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicyPeer {
        private final k8s.IpBlock ipBlock;
        private final k8s.LabelSelector namespaceSelector;
        private final k8s.LabelSelector podSelector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ipBlock = this.jsiiGet("ipBlock", k8s.IpBlock.class);
            this.namespaceSelector = this.jsiiGet("namespaceSelector", k8s.LabelSelector.class);
            this.podSelector = this.jsiiGet("podSelector", k8s.LabelSelector.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.IpBlock ipBlock, final k8s.LabelSelector namespaceSelector, final k8s.LabelSelector podSelector) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ipBlock = ipBlock;
            this.namespaceSelector = namespaceSelector;
            this.podSelector = podSelector;
        }

        @Override
        public k8s.IpBlock getIpBlock() {
            return this.ipBlock;
        }

        @Override
        public k8s.LabelSelector getNamespaceSelector() {
            return this.namespaceSelector;
        }

        @Override
        public k8s.LabelSelector getPodSelector() {
            return this.podSelector;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getIpBlock() != null) {
                data.set("ipBlock", om.valueToTree(this.getIpBlock()));
            }
            if (this.getNamespaceSelector() != null) {
                data.set("namespaceSelector", om.valueToTree(this.getNamespaceSelector()));
            }
            if (this.getPodSelector() != null) {
                data.set("podSelector", om.valueToTree(this.getPodSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NetworkPolicyPeer"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicyPeer.Jsii$Proxy that = (NetworkPolicyPeer.Jsii$Proxy) o;

            if (this.ipBlock != null ? !this.ipBlock.equals(that.ipBlock) : that.ipBlock != null) return false;
            if (this.namespaceSelector != null ? !this.namespaceSelector.equals(that.namespaceSelector) : that.namespaceSelector != null) return false;
            return this.podSelector != null ? this.podSelector.equals(that.podSelector) : that.podSelector == null;
        }

        @Override
        public int hashCode() {
            int result = this.ipBlock != null ? this.ipBlock.hashCode() : 0;
            result = 31 * result + (this.namespaceSelector != null ? this.namespaceSelector.hashCode() : 0);
            result = 31 * result + (this.podSelector != null ? this.podSelector.hashCode() : 0);
            return result;
        }
    }
}
