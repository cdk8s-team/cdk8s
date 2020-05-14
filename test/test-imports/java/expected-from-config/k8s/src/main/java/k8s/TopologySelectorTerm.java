package k8s;

/**
 * A topology selector term represents the result of label queries.
 * <p>
 * A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.453Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.TopologySelectorTerm")
@software.amazon.jsii.Jsii.Proxy(TopologySelectorTerm.Jsii$Proxy.class)
public interface TopologySelectorTerm extends software.amazon.jsii.JsiiSerializable {

    /**
     * A list of topology selector requirements by labels.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.TopologySelectorLabelRequirement> getMatchLabelExpressions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link TopologySelectorTerm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TopologySelectorTerm}
     */
    public static final class Builder {
        private java.util.List<k8s.TopologySelectorLabelRequirement> matchLabelExpressions;

        /**
         * Sets the value of {@link TopologySelectorTerm#getMatchLabelExpressions}
         * @param matchLabelExpressions A list of topology selector requirements by labels.
         * @return {@code this}
         */
        public Builder matchLabelExpressions(java.util.List<k8s.TopologySelectorLabelRequirement> matchLabelExpressions) {
            this.matchLabelExpressions = matchLabelExpressions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TopologySelectorTerm}
         * @throws NullPointerException if any required attribute was not provided
         */
        public TopologySelectorTerm build() {
            return new Jsii$Proxy(matchLabelExpressions);
        }
    }

    /**
     * An implementation for {@link TopologySelectorTerm}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TopologySelectorTerm {
        private final java.util.List<k8s.TopologySelectorLabelRequirement> matchLabelExpressions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchLabelExpressions = this.jsiiGet("matchLabelExpressions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.TopologySelectorLabelRequirement.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.TopologySelectorLabelRequirement> matchLabelExpressions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchLabelExpressions = matchLabelExpressions;
        }

        @Override
        public java.util.List<k8s.TopologySelectorLabelRequirement> getMatchLabelExpressions() {
            return this.matchLabelExpressions;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchLabelExpressions() != null) {
                data.set("matchLabelExpressions", om.valueToTree(this.getMatchLabelExpressions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.TopologySelectorTerm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TopologySelectorTerm.Jsii$Proxy that = (TopologySelectorTerm.Jsii$Proxy) o;

            return this.matchLabelExpressions != null ? this.matchLabelExpressions.equals(that.matchLabelExpressions) : that.matchLabelExpressions == null;
        }

        @Override
        public int hashCode() {
            int result = this.matchLabelExpressions != null ? this.matchLabelExpressions.hashCode() : 0;
            return result;
        }
    }
}
