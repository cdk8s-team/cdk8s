package jenkins;

/**
 * JenkinsAPISettings defines configuration used by the operator to gain admin access to the Jenkins API.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.594Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecJenkinsApiSettings")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecJenkinsApiSettings.Jsii$Proxy.class)
public interface JenkinsSpecJenkinsApiSettings extends software.amazon.jsii.JsiiSerializable {

    /**
     * AuthorizationStrategy defines authorization strategy of the operator for the Jenkins API.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAuthorizationStrategy();

    /**
     * @return a {@link Builder} of {@link JenkinsSpecJenkinsApiSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecJenkinsApiSettings}
     */
    public static final class Builder {
        private java.lang.String authorizationStrategy;

        /**
         * Sets the value of {@link JenkinsSpecJenkinsApiSettings#getAuthorizationStrategy}
         * @param authorizationStrategy AuthorizationStrategy defines authorization strategy of the operator for the Jenkins API. This parameter is required.
         * @return {@code this}
         */
        public Builder authorizationStrategy(java.lang.String authorizationStrategy) {
            this.authorizationStrategy = authorizationStrategy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecJenkinsApiSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecJenkinsApiSettings build() {
            return new Jsii$Proxy(authorizationStrategy);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecJenkinsApiSettings}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecJenkinsApiSettings {
        private final java.lang.String authorizationStrategy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.authorizationStrategy = this.jsiiGet("authorizationStrategy", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String authorizationStrategy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.authorizationStrategy = java.util.Objects.requireNonNull(authorizationStrategy, "authorizationStrategy is required");
        }

        @Override
        public java.lang.String getAuthorizationStrategy() {
            return this.authorizationStrategy;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("authorizationStrategy", om.valueToTree(this.getAuthorizationStrategy()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecJenkinsApiSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecJenkinsApiSettings.Jsii$Proxy that = (JenkinsSpecJenkinsApiSettings.Jsii$Proxy) o;

            return this.authorizationStrategy.equals(that.authorizationStrategy);
        }

        @Override
        public int hashCode() {
            int result = this.authorizationStrategy.hashCode();
            return result;
        }
    }
}
