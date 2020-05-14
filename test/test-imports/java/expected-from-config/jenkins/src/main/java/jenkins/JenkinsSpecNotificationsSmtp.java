package jenkins;

/**
 * SMTP is handler for sending emails via this protocol.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.700Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecNotificationsSmtp")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecNotificationsSmtp.Jsii$Proxy.class)
public interface JenkinsSpecNotificationsSmtp extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFrom();

    /**
     * SecretKeySelector selects a key of a Secret.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelector getPasswordSecretKeySelector();

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getPort();

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.String getServer();

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTo();

    /**
     * SecretKeySelector selects a key of a Secret.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelector getUsernameSecretKeySelector();

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTlsInsecureSkipVerify() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecNotificationsSmtp}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecNotificationsSmtp}
     */
    public static final class Builder {
        private java.lang.String from;
        private jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelector passwordSecretKeySelector;
        private java.lang.Number port;
        private java.lang.String server;
        private java.lang.String to;
        private jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelector usernameSecretKeySelector;
        private java.lang.Boolean tlsInsecureSkipVerify;

        /**
         * Sets the value of {@link JenkinsSpecNotificationsSmtp#getFrom}
         * @param from the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder from(java.lang.String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotificationsSmtp#getPasswordSecretKeySelector}
         * @param passwordSecretKeySelector SecretKeySelector selects a key of a Secret. This parameter is required.
         * @return {@code this}
         */
        public Builder passwordSecretKeySelector(jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelector passwordSecretKeySelector) {
            this.passwordSecretKeySelector = passwordSecretKeySelector;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotificationsSmtp#getPort}
         * @param port the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotificationsSmtp#getServer}
         * @param server the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder server(java.lang.String server) {
            this.server = server;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotificationsSmtp#getTo}
         * @param to the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder to(java.lang.String to) {
            this.to = to;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotificationsSmtp#getUsernameSecretKeySelector}
         * @param usernameSecretKeySelector SecretKeySelector selects a key of a Secret. This parameter is required.
         * @return {@code this}
         */
        public Builder usernameSecretKeySelector(jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelector usernameSecretKeySelector) {
            this.usernameSecretKeySelector = usernameSecretKeySelector;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotificationsSmtp#getTlsInsecureSkipVerify}
         * @param tlsInsecureSkipVerify the value to be set.
         * @return {@code this}
         */
        public Builder tlsInsecureSkipVerify(java.lang.Boolean tlsInsecureSkipVerify) {
            this.tlsInsecureSkipVerify = tlsInsecureSkipVerify;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecNotificationsSmtp}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecNotificationsSmtp build() {
            return new Jsii$Proxy(from, passwordSecretKeySelector, port, server, to, usernameSecretKeySelector, tlsInsecureSkipVerify);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecNotificationsSmtp}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecNotificationsSmtp {
        private final java.lang.String from;
        private final jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelector passwordSecretKeySelector;
        private final java.lang.Number port;
        private final java.lang.String server;
        private final java.lang.String to;
        private final jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelector usernameSecretKeySelector;
        private final java.lang.Boolean tlsInsecureSkipVerify;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.from = this.jsiiGet("from", java.lang.String.class);
            this.passwordSecretKeySelector = this.jsiiGet("passwordSecretKeySelector", jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelector.class);
            this.port = this.jsiiGet("port", java.lang.Number.class);
            this.server = this.jsiiGet("server", java.lang.String.class);
            this.to = this.jsiiGet("to", java.lang.String.class);
            this.usernameSecretKeySelector = this.jsiiGet("usernameSecretKeySelector", jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelector.class);
            this.tlsInsecureSkipVerify = this.jsiiGet("tlsInsecureSkipVerify", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String from, final jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelector passwordSecretKeySelector, final java.lang.Number port, final java.lang.String server, final java.lang.String to, final jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelector usernameSecretKeySelector, final java.lang.Boolean tlsInsecureSkipVerify) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.from = java.util.Objects.requireNonNull(from, "from is required");
            this.passwordSecretKeySelector = java.util.Objects.requireNonNull(passwordSecretKeySelector, "passwordSecretKeySelector is required");
            this.port = java.util.Objects.requireNonNull(port, "port is required");
            this.server = java.util.Objects.requireNonNull(server, "server is required");
            this.to = java.util.Objects.requireNonNull(to, "to is required");
            this.usernameSecretKeySelector = java.util.Objects.requireNonNull(usernameSecretKeySelector, "usernameSecretKeySelector is required");
            this.tlsInsecureSkipVerify = tlsInsecureSkipVerify;
        }

        @Override
        public java.lang.String getFrom() {
            return this.from;
        }

        @Override
        public jenkins.JenkinsSpecNotificationsSmtpPasswordSecretKeySelector getPasswordSecretKeySelector() {
            return this.passwordSecretKeySelector;
        }

        @Override
        public java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public java.lang.String getServer() {
            return this.server;
        }

        @Override
        public java.lang.String getTo() {
            return this.to;
        }

        @Override
        public jenkins.JenkinsSpecNotificationsSmtpUsernameSecretKeySelector getUsernameSecretKeySelector() {
            return this.usernameSecretKeySelector;
        }

        @Override
        public java.lang.Boolean getTlsInsecureSkipVerify() {
            return this.tlsInsecureSkipVerify;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("from", om.valueToTree(this.getFrom()));
            data.set("passwordSecretKeySelector", om.valueToTree(this.getPasswordSecretKeySelector()));
            data.set("port", om.valueToTree(this.getPort()));
            data.set("server", om.valueToTree(this.getServer()));
            data.set("to", om.valueToTree(this.getTo()));
            data.set("usernameSecretKeySelector", om.valueToTree(this.getUsernameSecretKeySelector()));
            if (this.getTlsInsecureSkipVerify() != null) {
                data.set("tlsInsecureSkipVerify", om.valueToTree(this.getTlsInsecureSkipVerify()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecNotificationsSmtp"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecNotificationsSmtp.Jsii$Proxy that = (JenkinsSpecNotificationsSmtp.Jsii$Proxy) o;

            if (!from.equals(that.from)) return false;
            if (!passwordSecretKeySelector.equals(that.passwordSecretKeySelector)) return false;
            if (!port.equals(that.port)) return false;
            if (!server.equals(that.server)) return false;
            if (!to.equals(that.to)) return false;
            if (!usernameSecretKeySelector.equals(that.usernameSecretKeySelector)) return false;
            return this.tlsInsecureSkipVerify != null ? this.tlsInsecureSkipVerify.equals(that.tlsInsecureSkipVerify) : that.tlsInsecureSkipVerify == null;
        }

        @Override
        public int hashCode() {
            int result = this.from.hashCode();
            result = 31 * result + (this.passwordSecretKeySelector.hashCode());
            result = 31 * result + (this.port.hashCode());
            result = 31 * result + (this.server.hashCode());
            result = 31 * result + (this.to.hashCode());
            result = 31 * result + (this.usernameSecretKeySelector.hashCode());
            result = 31 * result + (this.tlsInsecureSkipVerify != null ? this.tlsInsecureSkipVerify.hashCode() : 0);
            return result;
        }
    }
}
