package k8s;

/**
 * IngressTLS describes the transport layer security associated with an Ingress.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.245Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.IngressTLS")
@software.amazon.jsii.Jsii.Proxy(IngressTLS.Jsii$Proxy.class)
public interface IngressTLS extends software.amazon.jsii.JsiiSerializable {

    /**
     * Hosts are a list of hosts included in the TLS certificate.
     * <p>
     * The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     * <p>
     * Default: the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getHosts() {
        return null;
    }

    /**
     * SecretName is the name of the secret used to terminate SSL traffic on 443.
     * <p>
     * Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressTLS}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressTLS}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> hosts;
        private java.lang.String secretName;

        /**
         * Sets the value of {@link IngressTLS#getHosts}
         * @param hosts Hosts are a list of hosts included in the TLS certificate.
         *              The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
         * @return {@code this}
         */
        public Builder hosts(java.util.List<java.lang.String> hosts) {
            this.hosts = hosts;
            return this;
        }

        /**
         * Sets the value of {@link IngressTLS#getSecretName}
         * @param secretName SecretName is the name of the secret used to terminate SSL traffic on 443.
         *                   Field is left optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
         * @return {@code this}
         */
        public Builder secretName(java.lang.String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressTLS}
         * @throws NullPointerException if any required attribute was not provided
         */
        public IngressTLS build() {
            return new Jsii$Proxy(hosts, secretName);
        }
    }

    /**
     * An implementation for {@link IngressTLS}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressTLS {
        private final java.util.List<java.lang.String> hosts;
        private final java.lang.String secretName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hosts = this.jsiiGet("hosts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.secretName = this.jsiiGet("secretName", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> hosts, final java.lang.String secretName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hosts = hosts;
            this.secretName = secretName;
        }

        @Override
        public java.util.List<java.lang.String> getHosts() {
            return this.hosts;
        }

        @Override
        public java.lang.String getSecretName() {
            return this.secretName;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHosts() != null) {
                data.set("hosts", om.valueToTree(this.getHosts()));
            }
            if (this.getSecretName() != null) {
                data.set("secretName", om.valueToTree(this.getSecretName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressTLS"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressTLS.Jsii$Proxy that = (IngressTLS.Jsii$Proxy) o;

            if (this.hosts != null ? !this.hosts.equals(that.hosts) : that.hosts != null) return false;
            return this.secretName != null ? this.secretName.equals(that.secretName) : that.secretName == null;
        }

        @Override
        public int hashCode() {
            int result = this.hosts != null ? this.hosts.hashCode() : 0;
            result = 31 * result + (this.secretName != null ? this.secretName.hashCode() : 0);
            return result;
        }
    }
}
