package jenkins;

/**
 * ConfigurationAsCode defines configuration of Jenkins customization via Configuration as Code Jenkins plugin.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.592Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecConfigurationAsCode")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecConfigurationAsCode.Jsii$Proxy.class)
public interface JenkinsSpecConfigurationAsCode extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    @org.jetbrains.annotations.NotNull java.util.List<jenkins.JenkinsSpecConfigurationAsCodeConfigurations> getConfigurations();

    /**
     * SecretRef is reference to Kubernetes secret.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecConfigurationAsCodeSecret getSecret();

    /**
     * @return a {@link Builder} of {@link JenkinsSpecConfigurationAsCode}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecConfigurationAsCode}
     */
    public static final class Builder {
        private java.util.List<jenkins.JenkinsSpecConfigurationAsCodeConfigurations> configurations;
        private jenkins.JenkinsSpecConfigurationAsCodeSecret secret;

        /**
         * Sets the value of {@link JenkinsSpecConfigurationAsCode#getConfigurations}
         * @param configurations the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder configurations(java.util.List<jenkins.JenkinsSpecConfigurationAsCodeConfigurations> configurations) {
            this.configurations = configurations;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecConfigurationAsCode#getSecret}
         * @param secret SecretRef is reference to Kubernetes secret. This parameter is required.
         * @return {@code this}
         */
        public Builder secret(jenkins.JenkinsSpecConfigurationAsCodeSecret secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecConfigurationAsCode}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecConfigurationAsCode build() {
            return new Jsii$Proxy(configurations, secret);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecConfigurationAsCode}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecConfigurationAsCode {
        private final java.util.List<jenkins.JenkinsSpecConfigurationAsCodeConfigurations> configurations;
        private final jenkins.JenkinsSpecConfigurationAsCodeSecret secret;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configurations = this.jsiiGet("configurations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecConfigurationAsCodeConfigurations.class)));
            this.secret = this.jsiiGet("secret", jenkins.JenkinsSpecConfigurationAsCodeSecret.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<jenkins.JenkinsSpecConfigurationAsCodeConfigurations> configurations, final jenkins.JenkinsSpecConfigurationAsCodeSecret secret) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configurations = java.util.Objects.requireNonNull(configurations, "configurations is required");
            this.secret = java.util.Objects.requireNonNull(secret, "secret is required");
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecConfigurationAsCodeConfigurations> getConfigurations() {
            return this.configurations;
        }

        @Override
        public jenkins.JenkinsSpecConfigurationAsCodeSecret getSecret() {
            return this.secret;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("configurations", om.valueToTree(this.getConfigurations()));
            data.set("secret", om.valueToTree(this.getSecret()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecConfigurationAsCode"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecConfigurationAsCode.Jsii$Proxy that = (JenkinsSpecConfigurationAsCode.Jsii$Proxy) o;

            if (!configurations.equals(that.configurations)) return false;
            return this.secret.equals(that.secret);
        }

        @Override
        public int hashCode() {
            int result = this.configurations.hashCode();
            result = 31 * result + (this.secret.hashCode());
            return result;
        }
    }
}
