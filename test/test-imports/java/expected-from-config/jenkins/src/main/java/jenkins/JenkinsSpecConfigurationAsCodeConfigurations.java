package jenkins;

/**
 * ConfigMapRef is reference to Kubernetes ConfigMap.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.593Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecConfigurationAsCodeConfigurations")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecConfigurationAsCodeConfigurations.Jsii$Proxy.class)
public interface JenkinsSpecConfigurationAsCodeConfigurations extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link JenkinsSpecConfigurationAsCodeConfigurations}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecConfigurationAsCodeConfigurations}
     */
    public static final class Builder {
        private java.lang.String name;

        /**
         * Sets the value of {@link JenkinsSpecConfigurationAsCodeConfigurations#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecConfigurationAsCodeConfigurations}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecConfigurationAsCodeConfigurations build() {
            return new Jsii$Proxy(name);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecConfigurationAsCodeConfigurations}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecConfigurationAsCodeConfigurations {
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
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecConfigurationAsCodeConfigurations"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecConfigurationAsCodeConfigurations.Jsii$Proxy that = (JenkinsSpecConfigurationAsCodeConfigurations.Jsii$Proxy) o;

            return this.name.equals(that.name);
        }

        @Override
        public int hashCode() {
            int result = this.name.hashCode();
            return result;
        }
    }
}
