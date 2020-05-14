package k8s;

/**
 * FlowSchemaSpec describes how the FlowSchema's specification looks like.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.228Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.FlowSchemaSpec")
@software.amazon.jsii.Jsii.Proxy(FlowSchemaSpec.Jsii$Proxy.class)
public interface FlowSchemaSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster.
     * <p>
     * If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     */
    @org.jetbrains.annotations.NotNull k8s.PriorityLevelConfigurationReference getPriorityLevelConfiguration();

    /**
     * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema.
     * <p>
     * <code>nil</code> specifies that the distinguisher is disabled and thus will always be the empty string.
     */
    default @org.jetbrains.annotations.Nullable k8s.FlowDistinguisherMethod getDistinguisherMethod() {
        return null;
    }

    /**
     * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request.
     * <p>
     * The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be non-negative. Note that if the precedence is not specified or zero, it will be set to 1000 as default.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMatchingPrecedence() {
        return null;
    }

    /**
     * `rules` describes which requests will match this flow schema.
     * <p>
     * This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.PolicyRulesWithSubjects> getRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FlowSchemaSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FlowSchemaSpec}
     */
    public static final class Builder {
        private k8s.PriorityLevelConfigurationReference priorityLevelConfiguration;
        private k8s.FlowDistinguisherMethod distinguisherMethod;
        private java.lang.Number matchingPrecedence;
        private java.util.List<k8s.PolicyRulesWithSubjects> rules;

        /**
         * Sets the value of {@link FlowSchemaSpec#getPriorityLevelConfiguration}
         * @param priorityLevelConfiguration `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. This parameter is required.
         *                                   If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
         * @return {@code this}
         */
        public Builder priorityLevelConfiguration(k8s.PriorityLevelConfigurationReference priorityLevelConfiguration) {
            this.priorityLevelConfiguration = priorityLevelConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link FlowSchemaSpec#getDistinguisherMethod}
         * @param distinguisherMethod `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema.
         *                            <code>nil</code> specifies that the distinguisher is disabled and thus will always be the empty string.
         * @return {@code this}
         */
        public Builder distinguisherMethod(k8s.FlowDistinguisherMethod distinguisherMethod) {
            this.distinguisherMethod = distinguisherMethod;
            return this;
        }

        /**
         * Sets the value of {@link FlowSchemaSpec#getMatchingPrecedence}
         * @param matchingPrecedence `matchingPrecedence` is used to choose among the FlowSchemas that match a given request.
         *                           The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be non-negative. Note that if the precedence is not specified or zero, it will be set to 1000 as default.
         * @return {@code this}
         */
        public Builder matchingPrecedence(java.lang.Number matchingPrecedence) {
            this.matchingPrecedence = matchingPrecedence;
            return this;
        }

        /**
         * Sets the value of {@link FlowSchemaSpec#getRules}
         * @param rules `rules` describes which requests will match this flow schema.
         *              This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
         * @return {@code this}
         */
        public Builder rules(java.util.List<k8s.PolicyRulesWithSubjects> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FlowSchemaSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public FlowSchemaSpec build() {
            return new Jsii$Proxy(priorityLevelConfiguration, distinguisherMethod, matchingPrecedence, rules);
        }
    }

    /**
     * An implementation for {@link FlowSchemaSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FlowSchemaSpec {
        private final k8s.PriorityLevelConfigurationReference priorityLevelConfiguration;
        private final k8s.FlowDistinguisherMethod distinguisherMethod;
        private final java.lang.Number matchingPrecedence;
        private final java.util.List<k8s.PolicyRulesWithSubjects> rules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.priorityLevelConfiguration = this.jsiiGet("priorityLevelConfiguration", k8s.PriorityLevelConfigurationReference.class);
            this.distinguisherMethod = this.jsiiGet("distinguisherMethod", k8s.FlowDistinguisherMethod.class);
            this.matchingPrecedence = this.jsiiGet("matchingPrecedence", java.lang.Number.class);
            this.rules = this.jsiiGet("rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.PolicyRulesWithSubjects.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.PriorityLevelConfigurationReference priorityLevelConfiguration, final k8s.FlowDistinguisherMethod distinguisherMethod, final java.lang.Number matchingPrecedence, final java.util.List<k8s.PolicyRulesWithSubjects> rules) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.priorityLevelConfiguration = java.util.Objects.requireNonNull(priorityLevelConfiguration, "priorityLevelConfiguration is required");
            this.distinguisherMethod = distinguisherMethod;
            this.matchingPrecedence = matchingPrecedence;
            this.rules = rules;
        }

        @Override
        public k8s.PriorityLevelConfigurationReference getPriorityLevelConfiguration() {
            return this.priorityLevelConfiguration;
        }

        @Override
        public k8s.FlowDistinguisherMethod getDistinguisherMethod() {
            return this.distinguisherMethod;
        }

        @Override
        public java.lang.Number getMatchingPrecedence() {
            return this.matchingPrecedence;
        }

        @Override
        public java.util.List<k8s.PolicyRulesWithSubjects> getRules() {
            return this.rules;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("priorityLevelConfiguration", om.valueToTree(this.getPriorityLevelConfiguration()));
            if (this.getDistinguisherMethod() != null) {
                data.set("distinguisherMethod", om.valueToTree(this.getDistinguisherMethod()));
            }
            if (this.getMatchingPrecedence() != null) {
                data.set("matchingPrecedence", om.valueToTree(this.getMatchingPrecedence()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.FlowSchemaSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FlowSchemaSpec.Jsii$Proxy that = (FlowSchemaSpec.Jsii$Proxy) o;

            if (!priorityLevelConfiguration.equals(that.priorityLevelConfiguration)) return false;
            if (this.distinguisherMethod != null ? !this.distinguisherMethod.equals(that.distinguisherMethod) : that.distinguisherMethod != null) return false;
            if (this.matchingPrecedence != null ? !this.matchingPrecedence.equals(that.matchingPrecedence) : that.matchingPrecedence != null) return false;
            return this.rules != null ? this.rules.equals(that.rules) : that.rules == null;
        }

        @Override
        public int hashCode() {
            int result = this.priorityLevelConfiguration.hashCode();
            result = 31 * result + (this.distinguisherMethod != null ? this.distinguisherMethod.hashCode() : 0);
            result = 31 * result + (this.matchingPrecedence != null ? this.matchingPrecedence.hashCode() : 0);
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            return result;
        }
    }
}
