package jenkins;

/**
 * SecretKeySelector selects a key of a Secret.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.699Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecNotificationsMailgunApiKeySecretKeySelector.Jsii$Proxy.class)
public interface JenkinsSpecNotificationsMailgunApiKeySecretKeySelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * The key of the secret to select from.
     * <p>
     * Must be a valid secret key.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * The name of the secret in the pod's namespace to select from.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret getSecret();

    /**
     * @return a {@link Builder} of {@link JenkinsSpecNotificationsMailgunApiKeySecretKeySelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecNotificationsMailgunApiKeySecretKeySelector}
     */
    public static final class Builder {
        private java.lang.String key;
        private jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret secret;

        /**
         * Sets the value of {@link JenkinsSpecNotificationsMailgunApiKeySecretKeySelector#getKey}
         * @param key The key of the secret to select from. This parameter is required.
         *            Must be a valid secret key.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotificationsMailgunApiKeySecretKeySelector#getSecret}
         * @param secret The name of the secret in the pod's namespace to select from. This parameter is required.
         * @return {@code this}
         */
        public Builder secret(jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecNotificationsMailgunApiKeySecretKeySelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecNotificationsMailgunApiKeySecretKeySelector build() {
            return new Jsii$Proxy(key, secret);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecNotificationsMailgunApiKeySecretKeySelector}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecNotificationsMailgunApiKeySecretKeySelector {
        private final java.lang.String key;
        private final jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret secret;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = this.jsiiGet("key", java.lang.String.class);
            this.secret = this.jsiiGet("secret", jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String key, final jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret secret) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(key, "key is required");
            this.secret = java.util.Objects.requireNonNull(secret, "secret is required");
        }

        @Override
        public java.lang.String getKey() {
            return this.key;
        }

        @Override
        public jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret getSecret() {
            return this.secret;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("secret", om.valueToTree(this.getSecret()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecNotificationsMailgunApiKeySecretKeySelector.Jsii$Proxy that = (JenkinsSpecNotificationsMailgunApiKeySecretKeySelector.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            return this.secret.equals(that.secret);
        }

        @Override
        public int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.secret.hashCode());
            return result;
        }
    }
}
