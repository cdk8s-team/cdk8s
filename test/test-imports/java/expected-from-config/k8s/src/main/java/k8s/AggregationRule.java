package k8s;

/**
 * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.089Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.AggregationRule")
@software.amazon.jsii.Jsii.Proxy(AggregationRule.Jsii$Proxy.class)
public interface AggregationRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * <p>
     * If any of the selectors match, then the ClusterRole's permissions will be added
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.LabelSelector> getClusterRoleSelectors() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AggregationRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AggregationRule}
     */
    public static final class Builder {
        private java.util.List<k8s.LabelSelector> clusterRoleSelectors;

        /**
         * Sets the value of {@link AggregationRule#getClusterRoleSelectors}
         * @param clusterRoleSelectors ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
         *                             If any of the selectors match, then the ClusterRole's permissions will be added
         * @return {@code this}
         */
        public Builder clusterRoleSelectors(java.util.List<k8s.LabelSelector> clusterRoleSelectors) {
            this.clusterRoleSelectors = clusterRoleSelectors;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AggregationRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        public AggregationRule build() {
            return new Jsii$Proxy(clusterRoleSelectors);
        }
    }

    /**
     * An implementation for {@link AggregationRule}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AggregationRule {
        private final java.util.List<k8s.LabelSelector> clusterRoleSelectors;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clusterRoleSelectors = this.jsiiGet("clusterRoleSelectors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.LabelSelector.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.LabelSelector> clusterRoleSelectors) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clusterRoleSelectors = clusterRoleSelectors;
        }

        @Override
        public java.util.List<k8s.LabelSelector> getClusterRoleSelectors() {
            return this.clusterRoleSelectors;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClusterRoleSelectors() != null) {
                data.set("clusterRoleSelectors", om.valueToTree(this.getClusterRoleSelectors()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.AggregationRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AggregationRule.Jsii$Proxy that = (AggregationRule.Jsii$Proxy) o;

            return this.clusterRoleSelectors != null ? this.clusterRoleSelectors.equals(that.clusterRoleSelectors) : that.clusterRoleSelectors == null;
        }

        @Override
        public int hashCode() {
            int result = this.clusterRoleSelectors != null ? this.clusterRoleSelectors.hashCode() : 0;
            return result;
        }
    }
}
