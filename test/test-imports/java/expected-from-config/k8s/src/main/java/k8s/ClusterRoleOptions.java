package k8s;

/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.131Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ClusterRoleOptions")
@software.amazon.jsii.Jsii.Proxy(ClusterRoleOptions.Jsii$Proxy.class)
public interface ClusterRoleOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
     * <p>
     * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     */
    default @org.jetbrains.annotations.Nullable k8s.AggregationRule getAggregationRule() {
        return null;
    }

    /**
     * Standard object's metadata.
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Rules holds all the PolicyRules for this ClusterRole.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.PolicyRule> getRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterRoleOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterRoleOptions}
     */
    public static final class Builder {
        private k8s.AggregationRule aggregationRule;
        private k8s.ObjectMeta metadata;
        private java.util.List<k8s.PolicyRule> rules;

        /**
         * Sets the value of {@link ClusterRoleOptions#getAggregationRule}
         * @param aggregationRule AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
         *                        If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
         * @return {@code this}
         */
        public Builder aggregationRule(k8s.AggregationRule aggregationRule) {
            this.aggregationRule = aggregationRule;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleOptions#getMetadata}
         * @param metadata Standard object's metadata.
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleOptions#getRules}
         * @param rules Rules holds all the PolicyRules for this ClusterRole.
         * @return {@code this}
         */
        public Builder rules(java.util.List<k8s.PolicyRule> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterRoleOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterRoleOptions build() {
            return new Jsii$Proxy(aggregationRule, metadata, rules);
        }
    }

    /**
     * An implementation for {@link ClusterRoleOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterRoleOptions {
        private final k8s.AggregationRule aggregationRule;
        private final k8s.ObjectMeta metadata;
        private final java.util.List<k8s.PolicyRule> rules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.aggregationRule = this.jsiiGet("aggregationRule", k8s.AggregationRule.class);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
            this.rules = this.jsiiGet("rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.PolicyRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.AggregationRule aggregationRule, final k8s.ObjectMeta metadata, final java.util.List<k8s.PolicyRule> rules) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.aggregationRule = aggregationRule;
            this.metadata = metadata;
            this.rules = rules;
        }

        @Override
        public k8s.AggregationRule getAggregationRule() {
            return this.aggregationRule;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public java.util.List<k8s.PolicyRule> getRules() {
            return this.rules;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAggregationRule() != null) {
                data.set("aggregationRule", om.valueToTree(this.getAggregationRule()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ClusterRoleOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterRoleOptions.Jsii$Proxy that = (ClusterRoleOptions.Jsii$Proxy) o;

            if (this.aggregationRule != null ? !this.aggregationRule.equals(that.aggregationRule) : that.aggregationRule != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.rules != null ? this.rules.equals(that.rules) : that.rules == null;
        }

        @Override
        public int hashCode() {
            int result = this.aggregationRule != null ? this.aggregationRule.hashCode() : 0;
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            return result;
        }
    }
}
