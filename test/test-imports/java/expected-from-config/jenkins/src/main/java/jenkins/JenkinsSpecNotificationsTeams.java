package jenkins;

/**
 * MicrosoftTeams is handler for Microsoft MicrosoftTeams notification channel.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.701Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecNotificationsTeams")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecNotificationsTeams.Jsii$Proxy.class)
public interface JenkinsSpecNotificationsTeams extends software.amazon.jsii.JsiiSerializable {

    /**
     * The web hook URL to MicrosoftTeams App.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector getWebHookUrlSecretKeySelector();

    /**
     * @return a {@link Builder} of {@link JenkinsSpecNotificationsTeams}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecNotificationsTeams}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector webHookUrlSecretKeySelector;

        /**
         * Sets the value of {@link JenkinsSpecNotificationsTeams#getWebHookUrlSecretKeySelector}
         * @param webHookUrlSecretKeySelector The web hook URL to MicrosoftTeams App. This parameter is required.
         * @return {@code this}
         */
        public Builder webHookUrlSecretKeySelector(jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector webHookUrlSecretKeySelector) {
            this.webHookUrlSecretKeySelector = webHookUrlSecretKeySelector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecNotificationsTeams}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecNotificationsTeams build() {
            return new Jsii$Proxy(webHookUrlSecretKeySelector);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecNotificationsTeams}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecNotificationsTeams {
        private final jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector webHookUrlSecretKeySelector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.webHookUrlSecretKeySelector = this.jsiiGet("webHookURLSecretKeySelector", jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector webHookUrlSecretKeySelector) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.webHookUrlSecretKeySelector = java.util.Objects.requireNonNull(webHookUrlSecretKeySelector, "webHookUrlSecretKeySelector is required");
        }

        @Override
        public jenkins.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector getWebHookUrlSecretKeySelector() {
            return this.webHookUrlSecretKeySelector;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("webHookURLSecretKeySelector", om.valueToTree(this.getWebHookUrlSecretKeySelector()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecNotificationsTeams"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecNotificationsTeams.Jsii$Proxy that = (JenkinsSpecNotificationsTeams.Jsii$Proxy) o;

            return this.webHookUrlSecretKeySelector.equals(that.webHookUrlSecretKeySelector);
        }

        @Override
        public int hashCode() {
            int result = this.webHookUrlSecretKeySelector.hashCode();
            return result;
        }
    }
}
