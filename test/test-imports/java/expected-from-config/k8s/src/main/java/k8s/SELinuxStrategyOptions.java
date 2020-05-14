package k8s;

/**
 * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.401Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.SELinuxStrategyOptions")
@software.amazon.jsii.Jsii.Proxy(SELinuxStrategyOptions.Jsii$Proxy.class)
public interface SELinuxStrategyOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * rule is the strategy that will dictate the allowable labels that may be set.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRule();

    /**
     * seLinuxOptions required to run as;
     * <p>
     * required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     */
    default @org.jetbrains.annotations.Nullable k8s.SELinuxOptions getSeLinuxOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SELinuxStrategyOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SELinuxStrategyOptions}
     */
    public static final class Builder {
        private java.lang.String rule;
        private k8s.SELinuxOptions seLinuxOptions;

        /**
         * Sets the value of {@link SELinuxStrategyOptions#getRule}
         * @param rule rule is the strategy that will dictate the allowable labels that may be set. This parameter is required.
         * @return {@code this}
         */
        public Builder rule(java.lang.String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link SELinuxStrategyOptions#getSeLinuxOptions}
         * @param seLinuxOptions seLinuxOptions required to run as;.
         *                       required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
         * @return {@code this}
         */
        public Builder seLinuxOptions(k8s.SELinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SELinuxStrategyOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public SELinuxStrategyOptions build() {
            return new Jsii$Proxy(rule, seLinuxOptions);
        }
    }

    /**
     * An implementation for {@link SELinuxStrategyOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SELinuxStrategyOptions {
        private final java.lang.String rule;
        private final k8s.SELinuxOptions seLinuxOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rule = this.jsiiGet("rule", java.lang.String.class);
            this.seLinuxOptions = this.jsiiGet("seLinuxOptions", k8s.SELinuxOptions.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String rule, final k8s.SELinuxOptions seLinuxOptions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rule = java.util.Objects.requireNonNull(rule, "rule is required");
            this.seLinuxOptions = seLinuxOptions;
        }

        @Override
        public java.lang.String getRule() {
            return this.rule;
        }

        @Override
        public k8s.SELinuxOptions getSeLinuxOptions() {
            return this.seLinuxOptions;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rule", om.valueToTree(this.getRule()));
            if (this.getSeLinuxOptions() != null) {
                data.set("seLinuxOptions", om.valueToTree(this.getSeLinuxOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SELinuxStrategyOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SELinuxStrategyOptions.Jsii$Proxy that = (SELinuxStrategyOptions.Jsii$Proxy) o;

            if (!rule.equals(that.rule)) return false;
            return this.seLinuxOptions != null ? this.seLinuxOptions.equals(that.seLinuxOptions) : that.seLinuxOptions == null;
        }

        @Override
        public int hashCode() {
            int result = this.rule.hashCode();
            result = 31 * result + (this.seLinuxOptions != null ? this.seLinuxOptions.hashCode() : 0);
            return result;
        }
    }
}
