package k8s;

/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.158Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CustomResourceConversion")
@software.amazon.jsii.Jsii.Proxy(CustomResourceConversion.Jsii$Proxy.class)
public interface CustomResourceConversion extends software.amazon.jsii.JsiiSerializable {

    /**
     * strategy specifies how custom resources are converted between versions.
     * <p>
     * Allowed values are: - <code>None</code>: The converter only change the apiVersion and would not touch any other field in the custom resource. - <code>Webhook</code>: API Server will call to an external webhook to do the conversion. Additional information
     * is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStrategy();

    /**
     * webhook describes how to call the conversion webhook.
     * <p>
     * Required when <code>strategy</code> is set to <code>Webhook</code>.
     */
    default @org.jetbrains.annotations.Nullable k8s.WebhookConversion getWebhook() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceConversion}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceConversion}
     */
    public static final class Builder {
        private java.lang.String strategy;
        private k8s.WebhookConversion webhook;

        /**
         * Sets the value of {@link CustomResourceConversion#getStrategy}
         * @param strategy strategy specifies how custom resources are converted between versions. This parameter is required.
         *                 Allowed values are: - <code>None</code>: The converter only change the apiVersion and would not touch any other field in the custom resource. - <code>Webhook</code>: API Server will call to an external webhook to do the conversion. Additional information
         *                 is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
         * @return {@code this}
         */
        public Builder strategy(java.lang.String strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceConversion#getWebhook}
         * @param webhook webhook describes how to call the conversion webhook.
         *                Required when <code>strategy</code> is set to <code>Webhook</code>.
         * @return {@code this}
         */
        public Builder webhook(k8s.WebhookConversion webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceConversion}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CustomResourceConversion build() {
            return new Jsii$Proxy(strategy, webhook);
        }
    }

    /**
     * An implementation for {@link CustomResourceConversion}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceConversion {
        private final java.lang.String strategy;
        private final k8s.WebhookConversion webhook;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.strategy = this.jsiiGet("strategy", java.lang.String.class);
            this.webhook = this.jsiiGet("webhook", k8s.WebhookConversion.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String strategy, final k8s.WebhookConversion webhook) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.strategy = java.util.Objects.requireNonNull(strategy, "strategy is required");
            this.webhook = webhook;
        }

        @Override
        public java.lang.String getStrategy() {
            return this.strategy;
        }

        @Override
        public k8s.WebhookConversion getWebhook() {
            return this.webhook;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("strategy", om.valueToTree(this.getStrategy()));
            if (this.getWebhook() != null) {
                data.set("webhook", om.valueToTree(this.getWebhook()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceConversion"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceConversion.Jsii$Proxy that = (CustomResourceConversion.Jsii$Proxy) o;

            if (!strategy.equals(that.strategy)) return false;
            return this.webhook != null ? this.webhook.equals(that.webhook) : that.webhook == null;
        }

        @Override
        public int hashCode() {
            int result = this.strategy.hashCode();
            result = 31 * result + (this.webhook != null ? this.webhook.hashCode() : 0);
            return result;
        }
    }
}
