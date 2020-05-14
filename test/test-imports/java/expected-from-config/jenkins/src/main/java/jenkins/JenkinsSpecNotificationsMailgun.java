package jenkins;

/**
 * Mailgun is handler for Mailgun email service notification channel.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.699Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecNotificationsMailgun")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecNotificationsMailgun.Jsii$Proxy.class)
public interface JenkinsSpecNotificationsMailgun extends software.amazon.jsii.JsiiSerializable {

    /**
     * SecretKeySelector selects a key of a Secret.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector getApiKeySecretKeySelector();

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDomain();

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFrom();

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRecipient();

    /**
     * @return a {@link Builder} of {@link JenkinsSpecNotificationsMailgun}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecNotificationsMailgun}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector apiKeySecretKeySelector;
        private java.lang.String domain;
        private java.lang.String from;
        private java.lang.String recipient;

        /**
         * Sets the value of {@link JenkinsSpecNotificationsMailgun#getApiKeySecretKeySelector}
         * @param apiKeySecretKeySelector SecretKeySelector selects a key of a Secret. This parameter is required.
         * @return {@code this}
         */
        public Builder apiKeySecretKeySelector(jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector apiKeySecretKeySelector) {
            this.apiKeySecretKeySelector = apiKeySecretKeySelector;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotificationsMailgun#getDomain}
         * @param domain the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder domain(java.lang.String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotificationsMailgun#getFrom}
         * @param from the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder from(java.lang.String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotificationsMailgun#getRecipient}
         * @param recipient the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder recipient(java.lang.String recipient) {
            this.recipient = recipient;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecNotificationsMailgun}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecNotificationsMailgun build() {
            return new Jsii$Proxy(apiKeySecretKeySelector, domain, from, recipient);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecNotificationsMailgun}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecNotificationsMailgun {
        private final jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector apiKeySecretKeySelector;
        private final java.lang.String domain;
        private final java.lang.String from;
        private final java.lang.String recipient;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiKeySecretKeySelector = this.jsiiGet("apiKeySecretKeySelector", jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector.class);
            this.domain = this.jsiiGet("domain", java.lang.String.class);
            this.from = this.jsiiGet("from", java.lang.String.class);
            this.recipient = this.jsiiGet("recipient", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector apiKeySecretKeySelector, final java.lang.String domain, final java.lang.String from, final java.lang.String recipient) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiKeySecretKeySelector = java.util.Objects.requireNonNull(apiKeySecretKeySelector, "apiKeySecretKeySelector is required");
            this.domain = java.util.Objects.requireNonNull(domain, "domain is required");
            this.from = java.util.Objects.requireNonNull(from, "from is required");
            this.recipient = java.util.Objects.requireNonNull(recipient, "recipient is required");
        }

        @Override
        public jenkins.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector getApiKeySecretKeySelector() {
            return this.apiKeySecretKeySelector;
        }

        @Override
        public java.lang.String getDomain() {
            return this.domain;
        }

        @Override
        public java.lang.String getFrom() {
            return this.from;
        }

        @Override
        public java.lang.String getRecipient() {
            return this.recipient;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiKeySecretKeySelector", om.valueToTree(this.getApiKeySecretKeySelector()));
            data.set("domain", om.valueToTree(this.getDomain()));
            data.set("from", om.valueToTree(this.getFrom()));
            data.set("recipient", om.valueToTree(this.getRecipient()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecNotificationsMailgun"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecNotificationsMailgun.Jsii$Proxy that = (JenkinsSpecNotificationsMailgun.Jsii$Proxy) o;

            if (!apiKeySecretKeySelector.equals(that.apiKeySecretKeySelector)) return false;
            if (!domain.equals(that.domain)) return false;
            if (!from.equals(that.from)) return false;
            return this.recipient.equals(that.recipient);
        }

        @Override
        public int hashCode() {
            int result = this.apiKeySecretKeySelector.hashCode();
            result = 31 * result + (this.domain.hashCode());
            result = 31 * result + (this.from.hashCode());
            result = 31 * result + (this.recipient.hashCode());
            return result;
        }
    }
}
