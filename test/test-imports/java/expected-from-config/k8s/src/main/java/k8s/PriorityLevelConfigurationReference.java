package k8s;

/**
 * PriorityLevelConfigurationReference contains information that points to the "request-priority" being used.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.380Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PriorityLevelConfigurationReference")
@software.amazon.jsii.Jsii.Proxy(PriorityLevelConfigurationReference.Jsii$Proxy.class)
public interface PriorityLevelConfigurationReference extends software.amazon.jsii.JsiiSerializable {

    /**
     * `name` is the name of the priority level configuration being referenced Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link PriorityLevelConfigurationReference}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PriorityLevelConfigurationReference}
     */
    public static final class Builder {
        private java.lang.String name;

        /**
         * Sets the value of {@link PriorityLevelConfigurationReference#getName}
         * @param name `name` is the name of the priority level configuration being referenced Required. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PriorityLevelConfigurationReference}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PriorityLevelConfigurationReference build() {
            return new Jsii$Proxy(name);
        }
    }

    /**
     * An implementation for {@link PriorityLevelConfigurationReference}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PriorityLevelConfigurationReference {
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = this.jsiiGet("name", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String name) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PriorityLevelConfigurationReference"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PriorityLevelConfigurationReference.Jsii$Proxy that = (PriorityLevelConfigurationReference.Jsii$Proxy) o;

            return this.name.equals(that.name);
        }

        @Override
        public int hashCode() {
            int result = this.name.hashCode();
            return result;
        }
    }
}
