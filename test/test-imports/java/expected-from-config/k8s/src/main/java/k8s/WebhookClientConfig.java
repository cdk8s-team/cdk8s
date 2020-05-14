package k8s;

/**
 * WebhookClientConfig contains the information to make a TLS connection with the webhook.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.474Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.WebhookClientConfig")
@software.amazon.jsii.Jsii.Proxy(WebhookClientConfig.Jsii$Proxy.class)
public interface WebhookClientConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
     * <p>
     * If unspecified, system trust roots on the apiserver are used.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCaBundle() {
        return null;
    }

    /**
     * `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
     * <p>
     * If the webhook is running within the cluster, then you should use <code>service</code>.
     */
    default @org.jetbrains.annotations.Nullable k8s.ServiceReference getService() {
        return null;
    }

    /**
     * `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`).
     * <p>
     * Exactly one of <code>url</code> or <code>service</code> must be specified.
     * <p>
     * The <code>host</code> should not refer to a service running in the cluster; use the <code>service</code> field instead. The host might be resolved via external DNS in some apiservers (e.g., <code>kube-apiserver</code> cannot resolve in-cluster DNS as that would be a layering violation). <code>host</code> may also be an IP address.
     * <p>
     * Please note that using <code>localhost</code> or <code>127.0.0.1</code> as a <code>host</code> is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
     * <p>
     * The scheme must be "https"; the URL must begin with "https://".
     * <p>
     * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
     * <p>
     * Attempting to use a user or basic auth e.g. "user:password&#64;" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUrl() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WebhookClientConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WebhookClientConfig}
     */
    public static final class Builder {
        private java.lang.String caBundle;
        private k8s.ServiceReference service;
        private java.lang.String url;

        /**
         * Sets the value of {@link WebhookClientConfig#getCaBundle}
         * @param caBundle `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.
         *                 If unspecified, system trust roots on the apiserver are used.
         * @return {@code this}
         */
        public Builder caBundle(java.lang.String caBundle) {
            this.caBundle = caBundle;
            return this;
        }

        /**
         * Sets the value of {@link WebhookClientConfig#getService}
         * @param service `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
         *                If the webhook is running within the cluster, then you should use <code>service</code>.
         * @return {@code this}
         */
        public Builder service(k8s.ServiceReference service) {
            this.service = service;
            return this;
        }

        /**
         * Sets the value of {@link WebhookClientConfig#getUrl}
         * @param url `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`).
         *            Exactly one of <code>url</code> or <code>service</code> must be specified.
         *            <p>
         *            The <code>host</code> should not refer to a service running in the cluster; use the <code>service</code> field instead. The host might be resolved via external DNS in some apiservers (e.g., <code>kube-apiserver</code> cannot resolve in-cluster DNS as that would be a layering violation). <code>host</code> may also be an IP address.
         *            <p>
         *            Please note that using <code>localhost</code> or <code>127.0.0.1</code> as a <code>host</code> is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
         *            <p>
         *            The scheme must be "https"; the URL must begin with "https://".
         *            <p>
         *            A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
         *            <p>
         *            Attempting to use a user or basic auth e.g. "user:password&#64;" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
         * @return {@code this}
         */
        public Builder url(java.lang.String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WebhookClientConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        public WebhookClientConfig build() {
            return new Jsii$Proxy(caBundle, service, url);
        }
    }

    /**
     * An implementation for {@link WebhookClientConfig}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WebhookClientConfig {
        private final java.lang.String caBundle;
        private final k8s.ServiceReference service;
        private final java.lang.String url;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.caBundle = this.jsiiGet("caBundle", java.lang.String.class);
            this.service = this.jsiiGet("service", k8s.ServiceReference.class);
            this.url = this.jsiiGet("url", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String caBundle, final k8s.ServiceReference service, final java.lang.String url) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.caBundle = caBundle;
            this.service = service;
            this.url = url;
        }

        @Override
        public java.lang.String getCaBundle() {
            return this.caBundle;
        }

        @Override
        public k8s.ServiceReference getService() {
            return this.service;
        }

        @Override
        public java.lang.String getUrl() {
            return this.url;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCaBundle() != null) {
                data.set("caBundle", om.valueToTree(this.getCaBundle()));
            }
            if (this.getService() != null) {
                data.set("service", om.valueToTree(this.getService()));
            }
            if (this.getUrl() != null) {
                data.set("url", om.valueToTree(this.getUrl()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.WebhookClientConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WebhookClientConfig.Jsii$Proxy that = (WebhookClientConfig.Jsii$Proxy) o;

            if (this.caBundle != null ? !this.caBundle.equals(that.caBundle) : that.caBundle != null) return false;
            if (this.service != null ? !this.service.equals(that.service) : that.service != null) return false;
            return this.url != null ? this.url.equals(that.url) : that.url == null;
        }

        @Override
        public int hashCode() {
            int result = this.caBundle != null ? this.caBundle.hashCode() : 0;
            result = 31 * result + (this.service != null ? this.service.hashCode() : 0);
            result = 31 * result + (this.url != null ? this.url.hashCode() : 0);
            return result;
        }
    }
}
