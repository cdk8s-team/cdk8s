package k8s;

/**
 * A topology selector requirement is a selector that matches given label.
 * <p>
 * This is an alpha feature and may change in the future.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.452Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.TopologySelectorLabelRequirement")
@software.amazon.jsii.Jsii.Proxy(TopologySelectorLabelRequirement.Jsii$Proxy.class)
public interface TopologySelectorLabelRequirement extends software.amazon.jsii.JsiiSerializable {

    /**
     * The label key that the selector applies to.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * An array of string values.
     * <p>
     * One value must match the label to be selected. Each entry in Values is ORed.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getValues();

    /**
     * @return a {@link Builder} of {@link TopologySelectorLabelRequirement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TopologySelectorLabelRequirement}
     */
    public static final class Builder {
        private java.lang.String key;
        private java.util.List<java.lang.String> values;

        /**
         * Sets the value of {@link TopologySelectorLabelRequirement#getKey}
         * @param key The label key that the selector applies to. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link TopologySelectorLabelRequirement#getValues}
         * @param values An array of string values. This parameter is required.
         *               One value must match the label to be selected. Each entry in Values is ORed.
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TopologySelectorLabelRequirement}
         * @throws NullPointerException if any required attribute was not provided
         */
        public TopologySelectorLabelRequirement build() {
            return new Jsii$Proxy(key, values);
        }
    }

    /**
     * An implementation for {@link TopologySelectorLabelRequirement}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TopologySelectorLabelRequirement {
        private final java.lang.String key;
        private final java.util.List<java.lang.String> values;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = this.jsiiGet("key", java.lang.String.class);
            this.values = this.jsiiGet("values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String key, final java.util.List<java.lang.String> values) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(key, "key is required");
            this.values = java.util.Objects.requireNonNull(values, "values is required");
        }

        @Override
        public java.lang.String getKey() {
            return this.key;
        }

        @Override
        public java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("values", om.valueToTree(this.getValues()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.TopologySelectorLabelRequirement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TopologySelectorLabelRequirement.Jsii$Proxy that = (TopologySelectorLabelRequirement.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            return this.values.equals(that.values);
        }

        @Override
        public int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.values.hashCode());
            return result;
        }
    }
}
