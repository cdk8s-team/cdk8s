package k8s;

/**
 * ClientIPConfig represents the configurations of Client IP based session affinity.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.119Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ClientIPConfig")
@software.amazon.jsii.Jsii.Proxy(ClientIPConfig.Jsii$Proxy.class)
public interface ClientIPConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * timeoutSeconds specifies the seconds of ClientIP type session sticky time.
     * <p>
     * The value must be &gt;0 &amp;&amp; &lt;=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClientIPConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClientIPConfig}
     */
    public static final class Builder {
        private java.lang.Number timeoutSeconds;

        /**
         * Sets the value of {@link ClientIPConfig#getTimeoutSeconds}
         * @param timeoutSeconds timeoutSeconds specifies the seconds of ClientIP type session sticky time.
         *                       The value must be &gt;0 &amp;&amp; &lt;=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).
         * @return {@code this}
         */
        public Builder timeoutSeconds(java.lang.Number timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClientIPConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClientIPConfig build() {
            return new Jsii$Proxy(timeoutSeconds);
        }
    }

    /**
     * An implementation for {@link ClientIPConfig}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClientIPConfig {
        private final java.lang.Number timeoutSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.timeoutSeconds = this.jsiiGet("timeoutSeconds", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number timeoutSeconds) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.timeoutSeconds = timeoutSeconds;
        }

        @Override
        public java.lang.Number getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getTimeoutSeconds() != null) {
                data.set("timeoutSeconds", om.valueToTree(this.getTimeoutSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ClientIPConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClientIPConfig.Jsii$Proxy that = (ClientIPConfig.Jsii$Proxy) o;

            return this.timeoutSeconds != null ? this.timeoutSeconds.equals(that.timeoutSeconds) : that.timeoutSeconds == null;
        }

        @Override
        public int hashCode() {
            int result = this.timeoutSeconds != null ? this.timeoutSeconds.hashCode() : 0;
            return result;
        }
    }
}
