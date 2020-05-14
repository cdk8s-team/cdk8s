package k8s;

/**
 * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.343Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PodDNSConfig")
@software.amazon.jsii.Jsii.Proxy(PodDNSConfig.Jsii$Proxy.class)
public interface PodDNSConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * A list of DNS name server IP addresses.
     * <p>
     * This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNameservers() {
        return null;
    }

    /**
     * A list of DNS resolver options.
     * <p>
     * This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.PodDNSConfigOption> getOptions() {
        return null;
    }

    /**
     * A list of DNS search domains for host-name lookup.
     * <p>
     * This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSearches() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodDNSConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodDNSConfig}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> nameservers;
        private java.util.List<k8s.PodDNSConfigOption> options;
        private java.util.List<java.lang.String> searches;

        /**
         * Sets the value of {@link PodDNSConfig#getNameservers}
         * @param nameservers A list of DNS name server IP addresses.
         *                    This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
         * @return {@code this}
         */
        public Builder nameservers(java.util.List<java.lang.String> nameservers) {
            this.nameservers = nameservers;
            return this;
        }

        /**
         * Sets the value of {@link PodDNSConfig#getOptions}
         * @param options A list of DNS resolver options.
         *                This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
         * @return {@code this}
         */
        public Builder options(java.util.List<k8s.PodDNSConfigOption> options) {
            this.options = options;
            return this;
        }

        /**
         * Sets the value of {@link PodDNSConfig#getSearches}
         * @param searches A list of DNS search domains for host-name lookup.
         *                 This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
         * @return {@code this}
         */
        public Builder searches(java.util.List<java.lang.String> searches) {
            this.searches = searches;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodDNSConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PodDNSConfig build() {
            return new Jsii$Proxy(nameservers, options, searches);
        }
    }

    /**
     * An implementation for {@link PodDNSConfig}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodDNSConfig {
        private final java.util.List<java.lang.String> nameservers;
        private final java.util.List<k8s.PodDNSConfigOption> options;
        private final java.util.List<java.lang.String> searches;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nameservers = this.jsiiGet("nameservers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.options = this.jsiiGet("options", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.PodDNSConfigOption.class)));
            this.searches = this.jsiiGet("searches", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> nameservers, final java.util.List<k8s.PodDNSConfigOption> options, final java.util.List<java.lang.String> searches) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nameservers = nameservers;
            this.options = options;
            this.searches = searches;
        }

        @Override
        public java.util.List<java.lang.String> getNameservers() {
            return this.nameservers;
        }

        @Override
        public java.util.List<k8s.PodDNSConfigOption> getOptions() {
            return this.options;
        }

        @Override
        public java.util.List<java.lang.String> getSearches() {
            return this.searches;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNameservers() != null) {
                data.set("nameservers", om.valueToTree(this.getNameservers()));
            }
            if (this.getOptions() != null) {
                data.set("options", om.valueToTree(this.getOptions()));
            }
            if (this.getSearches() != null) {
                data.set("searches", om.valueToTree(this.getSearches()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodDNSConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodDNSConfig.Jsii$Proxy that = (PodDNSConfig.Jsii$Proxy) o;

            if (this.nameservers != null ? !this.nameservers.equals(that.nameservers) : that.nameservers != null) return false;
            if (this.options != null ? !this.options.equals(that.options) : that.options != null) return false;
            return this.searches != null ? this.searches.equals(that.searches) : that.searches == null;
        }

        @Override
        public int hashCode() {
            int result = this.nameservers != null ? this.nameservers.hashCode() : 0;
            result = 31 * result + (this.options != null ? this.options.hashCode() : 0);
            result = 31 * result + (this.searches != null ? this.searches.hashCode() : 0);
            return result;
        }
    }
}
