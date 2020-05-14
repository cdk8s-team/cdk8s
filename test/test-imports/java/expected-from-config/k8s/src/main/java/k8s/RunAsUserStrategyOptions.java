package k8s;

/**
 * RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.398Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.RunAsUserStrategyOptions")
@software.amazon.jsii.Jsii.Proxy(RunAsUserStrategyOptions.Jsii$Proxy.class)
public interface RunAsUserStrategyOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRule();

    /**
     * ranges are the allowed ranges of uids that may be used.
     * <p>
     * If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.IdRange> getRanges() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RunAsUserStrategyOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RunAsUserStrategyOptions}
     */
    public static final class Builder {
        private java.lang.String rule;
        private java.util.List<k8s.IdRange> ranges;

        /**
         * Sets the value of {@link RunAsUserStrategyOptions#getRule}
         * @param rule rule is the strategy that will dictate the allowable RunAsUser values that may be set. This parameter is required.
         * @return {@code this}
         */
        public Builder rule(java.lang.String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sets the value of {@link RunAsUserStrategyOptions#getRanges}
         * @param ranges ranges are the allowed ranges of uids that may be used.
         *               If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
         * @return {@code this}
         */
        public Builder ranges(java.util.List<k8s.IdRange> ranges) {
            this.ranges = ranges;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RunAsUserStrategyOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public RunAsUserStrategyOptions build() {
            return new Jsii$Proxy(rule, ranges);
        }
    }

    /**
     * An implementation for {@link RunAsUserStrategyOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RunAsUserStrategyOptions {
        private final java.lang.String rule;
        private final java.util.List<k8s.IdRange> ranges;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rule = this.jsiiGet("rule", java.lang.String.class);
            this.ranges = this.jsiiGet("ranges", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.IdRange.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String rule, final java.util.List<k8s.IdRange> ranges) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rule = java.util.Objects.requireNonNull(rule, "rule is required");
            this.ranges = ranges;
        }

        @Override
        public java.lang.String getRule() {
            return this.rule;
        }

        @Override
        public java.util.List<k8s.IdRange> getRanges() {
            return this.ranges;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rule", om.valueToTree(this.getRule()));
            if (this.getRanges() != null) {
                data.set("ranges", om.valueToTree(this.getRanges()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RunAsUserStrategyOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RunAsUserStrategyOptions.Jsii$Proxy that = (RunAsUserStrategyOptions.Jsii$Proxy) o;

            if (!rule.equals(that.rule)) return false;
            return this.ranges != null ? this.ranges.equals(that.ranges) : that.ranges == null;
        }

        @Override
        public int hashCode() {
            int result = this.rule.hashCode();
            result = 31 * result + (this.ranges != null ? this.ranges.hashCode() : 0);
            return result;
        }
    }
}
