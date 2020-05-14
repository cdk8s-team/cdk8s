package k8s;

/**
 * IngressSpec describes the Ingress the user wishes to exist.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.245Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.IngressSpec")
@software.amazon.jsii.Jsii.Proxy(IngressSpec.Jsii$Proxy.class)
public interface IngressSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * A default backend capable of servicing requests that don't match any rule.
     * <p>
     * At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
     */
    default @org.jetbrains.annotations.Nullable k8s.IngressBackend getBackend() {
        return null;
    }

    /**
     * A list of host rules used to configure the Ingress.
     * <p>
     * If unspecified, or no rule matches, all traffic is sent to the default backend.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.IngressRule> getRules() {
        return null;
    }

    /**
     * TLS configuration.
     * <p>
     * Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.IngressTLS> getTls() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressSpec}
     */
    public static final class Builder {
        private k8s.IngressBackend backend;
        private java.util.List<k8s.IngressRule> rules;
        private java.util.List<k8s.IngressTLS> tls;

        /**
         * Sets the value of {@link IngressSpec#getBackend}
         * @param backend A default backend capable of servicing requests that don't match any rule.
         *                At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
         * @return {@code this}
         */
        public Builder backend(k8s.IngressBackend backend) {
            this.backend = backend;
            return this;
        }

        /**
         * Sets the value of {@link IngressSpec#getRules}
         * @param rules A list of host rules used to configure the Ingress.
         *              If unspecified, or no rule matches, all traffic is sent to the default backend.
         * @return {@code this}
         */
        public Builder rules(java.util.List<k8s.IngressRule> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Sets the value of {@link IngressSpec#getTls}
         * @param tls TLS configuration.
         *            Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
         * @return {@code this}
         */
        public Builder tls(java.util.List<k8s.IngressTLS> tls) {
            this.tls = tls;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public IngressSpec build() {
            return new Jsii$Proxy(backend, rules, tls);
        }
    }

    /**
     * An implementation for {@link IngressSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressSpec {
        private final k8s.IngressBackend backend;
        private final java.util.List<k8s.IngressRule> rules;
        private final java.util.List<k8s.IngressTLS> tls;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.backend = this.jsiiGet("backend", k8s.IngressBackend.class);
            this.rules = this.jsiiGet("rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.IngressRule.class)));
            this.tls = this.jsiiGet("tls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.IngressTLS.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.IngressBackend backend, final java.util.List<k8s.IngressRule> rules, final java.util.List<k8s.IngressTLS> tls) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.backend = backend;
            this.rules = rules;
            this.tls = tls;
        }

        @Override
        public k8s.IngressBackend getBackend() {
            return this.backend;
        }

        @Override
        public java.util.List<k8s.IngressRule> getRules() {
            return this.rules;
        }

        @Override
        public java.util.List<k8s.IngressTLS> getTls() {
            return this.tls;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBackend() != null) {
                data.set("backend", om.valueToTree(this.getBackend()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }
            if (this.getTls() != null) {
                data.set("tls", om.valueToTree(this.getTls()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressSpec.Jsii$Proxy that = (IngressSpec.Jsii$Proxy) o;

            if (this.backend != null ? !this.backend.equals(that.backend) : that.backend != null) return false;
            if (this.rules != null ? !this.rules.equals(that.rules) : that.rules != null) return false;
            return this.tls != null ? this.tls.equals(that.tls) : that.tls == null;
        }

        @Override
        public int hashCode() {
            int result = this.backend != null ? this.backend.hashCode() : 0;
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            result = 31 * result + (this.tls != null ? this.tls.hashCode() : 0);
            return result;
        }
    }
}
