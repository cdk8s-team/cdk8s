package k8s;

/**
 * AuditSinkSpec holds the spec for the audit sink.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.093Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.AuditSinkSpec")
@software.amazon.jsii.Jsii.Proxy(AuditSinkSpec.Jsii$Proxy.class)
public interface AuditSinkSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Policy defines the policy for selecting which events should be sent to the webhook required.
     */
    @org.jetbrains.annotations.NotNull k8s.Policy getPolicy();

    /**
     * Webhook to send events required.
     */
    @org.jetbrains.annotations.NotNull k8s.Webhook getWebhook();

    /**
     * @return a {@link Builder} of {@link AuditSinkSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AuditSinkSpec}
     */
    public static final class Builder {
        private k8s.Policy policy;
        private k8s.Webhook webhook;

        /**
         * Sets the value of {@link AuditSinkSpec#getPolicy}
         * @param policy Policy defines the policy for selecting which events should be sent to the webhook required. This parameter is required.
         * @return {@code this}
         */
        public Builder policy(k8s.Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link AuditSinkSpec#getWebhook}
         * @param webhook Webhook to send events required. This parameter is required.
         * @return {@code this}
         */
        public Builder webhook(k8s.Webhook webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AuditSinkSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public AuditSinkSpec build() {
            return new Jsii$Proxy(policy, webhook);
        }
    }

    /**
     * An implementation for {@link AuditSinkSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AuditSinkSpec {
        private final k8s.Policy policy;
        private final k8s.Webhook webhook;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.policy = this.jsiiGet("policy", k8s.Policy.class);
            this.webhook = this.jsiiGet("webhook", k8s.Webhook.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.Policy policy, final k8s.Webhook webhook) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.policy = java.util.Objects.requireNonNull(policy, "policy is required");
            this.webhook = java.util.Objects.requireNonNull(webhook, "webhook is required");
        }

        @Override
        public k8s.Policy getPolicy() {
            return this.policy;
        }

        @Override
        public k8s.Webhook getWebhook() {
            return this.webhook;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("policy", om.valueToTree(this.getPolicy()));
            data.set("webhook", om.valueToTree(this.getWebhook()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.AuditSinkSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AuditSinkSpec.Jsii$Proxy that = (AuditSinkSpec.Jsii$Proxy) o;

            if (!policy.equals(that.policy)) return false;
            return this.webhook.equals(that.webhook);
        }

        @Override
        public int hashCode() {
            int result = this.policy.hashCode();
            result = 31 * result + (this.webhook.hashCode());
            return result;
        }
    }
}
