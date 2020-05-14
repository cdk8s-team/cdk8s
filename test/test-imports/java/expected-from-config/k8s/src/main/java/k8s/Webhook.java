package k8s;

/**
 * Webhook holds the configuration of the webhook.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.474Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Webhook")
@software.amazon.jsii.Jsii.Proxy(Webhook.Jsii$Proxy.class)
public interface Webhook extends software.amazon.jsii.JsiiSerializable {

    /**
     * ClientConfig holds the connection parameters for the webhook required.
     */
    @org.jetbrains.annotations.NotNull k8s.WebhookClientConfig getClientConfig();

    /**
     * Throttle holds the options for throttling the webhook.
     */
    default @org.jetbrains.annotations.Nullable k8s.WebhookThrottleConfig getThrottle() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Webhook}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Webhook}
     */
    public static final class Builder {
        private k8s.WebhookClientConfig clientConfig;
        private k8s.WebhookThrottleConfig throttle;

        /**
         * Sets the value of {@link Webhook#getClientConfig}
         * @param clientConfig ClientConfig holds the connection parameters for the webhook required. This parameter is required.
         * @return {@code this}
         */
        public Builder clientConfig(k8s.WebhookClientConfig clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        /**
         * Sets the value of {@link Webhook#getThrottle}
         * @param throttle Throttle holds the options for throttling the webhook.
         * @return {@code this}
         */
        public Builder throttle(k8s.WebhookThrottleConfig throttle) {
            this.throttle = throttle;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Webhook}
         * @throws NullPointerException if any required attribute was not provided
         */
        public Webhook build() {
            return new Jsii$Proxy(clientConfig, throttle);
        }
    }

    /**
     * An implementation for {@link Webhook}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Webhook {
        private final k8s.WebhookClientConfig clientConfig;
        private final k8s.WebhookThrottleConfig throttle;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientConfig = this.jsiiGet("clientConfig", k8s.WebhookClientConfig.class);
            this.throttle = this.jsiiGet("throttle", k8s.WebhookThrottleConfig.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.WebhookClientConfig clientConfig, final k8s.WebhookThrottleConfig throttle) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientConfig = java.util.Objects.requireNonNull(clientConfig, "clientConfig is required");
            this.throttle = throttle;
        }

        @Override
        public k8s.WebhookClientConfig getClientConfig() {
            return this.clientConfig;
        }

        @Override
        public k8s.WebhookThrottleConfig getThrottle() {
            return this.throttle;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("clientConfig", om.valueToTree(this.getClientConfig()));
            if (this.getThrottle() != null) {
                data.set("throttle", om.valueToTree(this.getThrottle()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Webhook"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Webhook.Jsii$Proxy that = (Webhook.Jsii$Proxy) o;

            if (!clientConfig.equals(that.clientConfig)) return false;
            return this.throttle != null ? this.throttle.equals(that.throttle) : that.throttle == null;
        }

        @Override
        public int hashCode() {
            int result = this.clientConfig.hashCode();
            result = 31 * result + (this.throttle != null ? this.throttle.hashCode() : 0);
            return result;
        }
    }
}
