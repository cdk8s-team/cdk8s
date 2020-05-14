package k8s;

/**
 * A node selector represents the union of the results of one or more label queries over a set of nodes;
 * <p>
 * that is, it represents the OR of the selectors represented by the node selector terms.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.314Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.NodeSelector")
@software.amazon.jsii.Jsii.Proxy(NodeSelector.Jsii$Proxy.class)
public interface NodeSelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required.
     * <p>
     * A list of node selector terms. The terms are ORed.
     */
    @org.jetbrains.annotations.NotNull java.util.List<k8s.NodeSelectorTerm> getNodeSelectorTerms();

    /**
     * @return a {@link Builder} of {@link NodeSelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NodeSelector}
     */
    public static final class Builder {
        private java.util.List<k8s.NodeSelectorTerm> nodeSelectorTerms;

        /**
         * Sets the value of {@link NodeSelector#getNodeSelectorTerms}
         * @param nodeSelectorTerms Required. This parameter is required.
         *                          A list of node selector terms. The terms are ORed.
         * @return {@code this}
         */
        public Builder nodeSelectorTerms(java.util.List<k8s.NodeSelectorTerm> nodeSelectorTerms) {
            this.nodeSelectorTerms = nodeSelectorTerms;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NodeSelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        public NodeSelector build() {
            return new Jsii$Proxy(nodeSelectorTerms);
        }
    }

    /**
     * An implementation for {@link NodeSelector}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NodeSelector {
        private final java.util.List<k8s.NodeSelectorTerm> nodeSelectorTerms;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nodeSelectorTerms = this.jsiiGet("nodeSelectorTerms", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.NodeSelectorTerm.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.NodeSelectorTerm> nodeSelectorTerms) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nodeSelectorTerms = java.util.Objects.requireNonNull(nodeSelectorTerms, "nodeSelectorTerms is required");
        }

        @Override
        public java.util.List<k8s.NodeSelectorTerm> getNodeSelectorTerms() {
            return this.nodeSelectorTerms;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("nodeSelectorTerms", om.valueToTree(this.getNodeSelectorTerms()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NodeSelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NodeSelector.Jsii$Proxy that = (NodeSelector.Jsii$Proxy) o;

            return this.nodeSelectorTerms.equals(that.nodeSelectorTerms);
        }

        @Override
        public int hashCode() {
            int result = this.nodeSelectorTerms.hashCode();
            return result;
        }
    }
}
