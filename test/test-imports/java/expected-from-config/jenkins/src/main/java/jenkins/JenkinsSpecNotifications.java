package jenkins;

/**
 * Notification is a service configuration used to send notifications about Jenkins status.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.699Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecNotifications")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecNotifications.Jsii$Proxy.class)
public interface JenkinsSpecNotifications extends software.amazon.jsii.JsiiSerializable {

    /**
     * NotificationLevel defines the level of a Notification.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLevel();

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     */
    @org.jetbrains.annotations.NotNull java.lang.Boolean getVerbose();

    /**
     * Mailgun is handler for Mailgun email service notification channel.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecNotificationsMailgun getMailgun() {
        return null;
    }

    /**
     * Slack is handler for Slack notification channel.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecNotificationsSlack getSlack() {
        return null;
    }

    /**
     * SMTP is handler for sending emails via this protocol.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecNotificationsSmtp getSmtp() {
        return null;
    }

    /**
     * MicrosoftTeams is handler for Microsoft MicrosoftTeams notification channel.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecNotificationsTeams getTeams() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecNotifications}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecNotifications}
     */
    public static final class Builder {
        private java.lang.String level;
        private java.lang.String name;
        private java.lang.Boolean verbose;
        private jenkins.JenkinsSpecNotificationsMailgun mailgun;
        private jenkins.JenkinsSpecNotificationsSlack slack;
        private jenkins.JenkinsSpecNotificationsSmtp smtp;
        private jenkins.JenkinsSpecNotificationsTeams teams;

        /**
         * Sets the value of {@link JenkinsSpecNotifications#getLevel}
         * @param level NotificationLevel defines the level of a Notification. This parameter is required.
         * @return {@code this}
         */
        public Builder level(java.lang.String level) {
            this.level = level;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotifications#getName}
         * @param name the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotifications#getVerbose}
         * @param verbose the value to be set. This parameter is required.
         * @return {@code this}
         */
        public Builder verbose(java.lang.Boolean verbose) {
            this.verbose = verbose;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotifications#getMailgun}
         * @param mailgun Mailgun is handler for Mailgun email service notification channel.
         * @return {@code this}
         */
        public Builder mailgun(jenkins.JenkinsSpecNotificationsMailgun mailgun) {
            this.mailgun = mailgun;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotifications#getSlack}
         * @param slack Slack is handler for Slack notification channel.
         * @return {@code this}
         */
        public Builder slack(jenkins.JenkinsSpecNotificationsSlack slack) {
            this.slack = slack;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotifications#getSmtp}
         * @param smtp SMTP is handler for sending emails via this protocol.
         * @return {@code this}
         */
        public Builder smtp(jenkins.JenkinsSpecNotificationsSmtp smtp) {
            this.smtp = smtp;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecNotifications#getTeams}
         * @param teams MicrosoftTeams is handler for Microsoft MicrosoftTeams notification channel.
         * @return {@code this}
         */
        public Builder teams(jenkins.JenkinsSpecNotificationsTeams teams) {
            this.teams = teams;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecNotifications}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecNotifications build() {
            return new Jsii$Proxy(level, name, verbose, mailgun, slack, smtp, teams);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecNotifications}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecNotifications {
        private final java.lang.String level;
        private final java.lang.String name;
        private final java.lang.Boolean verbose;
        private final jenkins.JenkinsSpecNotificationsMailgun mailgun;
        private final jenkins.JenkinsSpecNotificationsSlack slack;
        private final jenkins.JenkinsSpecNotificationsSmtp smtp;
        private final jenkins.JenkinsSpecNotificationsTeams teams;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.level = this.jsiiGet("level", java.lang.String.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.verbose = this.jsiiGet("verbose", java.lang.Boolean.class);
            this.mailgun = this.jsiiGet("mailgun", jenkins.JenkinsSpecNotificationsMailgun.class);
            this.slack = this.jsiiGet("slack", jenkins.JenkinsSpecNotificationsSlack.class);
            this.smtp = this.jsiiGet("smtp", jenkins.JenkinsSpecNotificationsSmtp.class);
            this.teams = this.jsiiGet("teams", jenkins.JenkinsSpecNotificationsTeams.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String level, final java.lang.String name, final java.lang.Boolean verbose, final jenkins.JenkinsSpecNotificationsMailgun mailgun, final jenkins.JenkinsSpecNotificationsSlack slack, final jenkins.JenkinsSpecNotificationsSmtp smtp, final jenkins.JenkinsSpecNotificationsTeams teams) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.level = java.util.Objects.requireNonNull(level, "level is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.verbose = java.util.Objects.requireNonNull(verbose, "verbose is required");
            this.mailgun = mailgun;
            this.slack = slack;
            this.smtp = smtp;
            this.teams = teams;
        }

        @Override
        public java.lang.String getLevel() {
            return this.level;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.Boolean getVerbose() {
            return this.verbose;
        }

        @Override
        public jenkins.JenkinsSpecNotificationsMailgun getMailgun() {
            return this.mailgun;
        }

        @Override
        public jenkins.JenkinsSpecNotificationsSlack getSlack() {
            return this.slack;
        }

        @Override
        public jenkins.JenkinsSpecNotificationsSmtp getSmtp() {
            return this.smtp;
        }

        @Override
        public jenkins.JenkinsSpecNotificationsTeams getTeams() {
            return this.teams;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("level", om.valueToTree(this.getLevel()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("verbose", om.valueToTree(this.getVerbose()));
            if (this.getMailgun() != null) {
                data.set("mailgun", om.valueToTree(this.getMailgun()));
            }
            if (this.getSlack() != null) {
                data.set("slack", om.valueToTree(this.getSlack()));
            }
            if (this.getSmtp() != null) {
                data.set("smtp", om.valueToTree(this.getSmtp()));
            }
            if (this.getTeams() != null) {
                data.set("teams", om.valueToTree(this.getTeams()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecNotifications"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecNotifications.Jsii$Proxy that = (JenkinsSpecNotifications.Jsii$Proxy) o;

            if (!level.equals(that.level)) return false;
            if (!name.equals(that.name)) return false;
            if (!verbose.equals(that.verbose)) return false;
            if (this.mailgun != null ? !this.mailgun.equals(that.mailgun) : that.mailgun != null) return false;
            if (this.slack != null ? !this.slack.equals(that.slack) : that.slack != null) return false;
            if (this.smtp != null ? !this.smtp.equals(that.smtp) : that.smtp != null) return false;
            return this.teams != null ? this.teams.equals(that.teams) : that.teams == null;
        }

        @Override
        public int hashCode() {
            int result = this.level.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.verbose.hashCode());
            result = 31 * result + (this.mailgun != null ? this.mailgun.hashCode() : 0);
            result = 31 * result + (this.slack != null ? this.slack.hashCode() : 0);
            result = 31 * result + (this.smtp != null ? this.smtp.hashCode() : 0);
            result = 31 * result + (this.teams != null ? this.teams.hashCode() : 0);
            return result;
        }
    }
}
