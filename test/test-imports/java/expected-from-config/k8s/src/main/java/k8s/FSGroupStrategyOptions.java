package k8s;

/**
 * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.220Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.FSGroupStrategyOptions")
@software.amazon.jsii.Jsii.Proxy(FSGroupStrategyOptions.Jsii$Proxy.class)
public interface FSGroupStrategyOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * ranges are the allowed ranges of fs groups.
     * <p>
     * If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.IdRange> getRanges() {
        return null;
    }

    /**
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRule() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FSGroupStrategyOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FSGroupStrategyOptions}
     */
    public static final class Builder {
        private java.util.List<k8s.IdRange> ranges;
        private java.lang.String rule;

        /**
         * Sets the value of {@link FSGroupStrategyOptions#getRanges}
         * @param ranges ranges are the allowed ranges of fs groups.
         *               If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
         * @return {@code this}
         */
        public Builder ranges(java.util.List<k8s.IdRange> ranges) {
            this.ranges = ranges;
            return this;
        }

        /**
         * Sets the value of {@link FSGroupStrategyOptions#getRule}
         * @param rule rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
         * @return {@code this}
         */
        public Builder rule(java.lang.String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FSGroupStrategyOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public FSGroupStrategyOptions build() {
            return new Jsii$Proxy(ranges, rule);
        }
    }

    /**
     * An implementation for {@link FSGroupStrategyOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FSGroupStrategyOptions {
        private final java.util.List<k8s.IdRange> ranges;
        private final java.lang.String rule;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ranges = this.jsiiGet("ranges", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.IdRange.class)));
            this.rule = this.jsiiGet("rule", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.IdRange> ranges, final java.lang.String rule) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ranges = ranges;
            this.rule = rule;
        }

        @Override
        public java.util.List<k8s.IdRange> getRanges() {
            return this.ranges;
        }

        @Override
        public java.lang.String getRule() {
            return this.rule;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRanges() != null) {
                data.set("ranges", om.valueToTree(this.getRanges()));
            }
            if (this.getRule() != null) {
                data.set("rule", om.valueToTree(this.getRule()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.FSGroupStrategyOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FSGroupStrategyOptions.Jsii$Proxy that = (FSGroupStrategyOptions.Jsii$Proxy) o;

            if (this.ranges != null ? !this.ranges.equals(that.ranges) : that.ranges != null) return false;
            return this.rule != null ? this.rule.equals(that.rule) : that.rule == null;
        }

        @Override
        public int hashCode() {
            int result = this.ranges != null ? this.ranges.hashCode() : 0;
            result = 31 * result + (this.rule != null ? this.rule.hashCode() : 0);
            return result;
        }
    }
}
