package k8s;

/**
 * HTTPIngressRuleValue is a list of http selectors pointing to backends.
 * <p>
 * In the example: http://<host>/<path>?<searchpart> -&gt; backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.234Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.HTTPIngressRuleValue")
@software.amazon.jsii.Jsii.Proxy(HTTPIngressRuleValue.Jsii$Proxy.class)
public interface HTTPIngressRuleValue extends software.amazon.jsii.JsiiSerializable {

    /**
     * A collection of paths that map requests to backends.
     */
    @org.jetbrains.annotations.NotNull java.util.List<k8s.HTTPIngressPath> getPaths();

    /**
     * @return a {@link Builder} of {@link HTTPIngressRuleValue}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HTTPIngressRuleValue}
     */
    public static final class Builder {
        private java.util.List<k8s.HTTPIngressPath> paths;

        /**
         * Sets the value of {@link HTTPIngressRuleValue#getPaths}
         * @param paths A collection of paths that map requests to backends. This parameter is required.
         * @return {@code this}
         */
        public Builder paths(java.util.List<k8s.HTTPIngressPath> paths) {
            this.paths = paths;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HTTPIngressRuleValue}
         * @throws NullPointerException if any required attribute was not provided
         */
        public HTTPIngressRuleValue build() {
            return new Jsii$Proxy(paths);
        }
    }

    /**
     * An implementation for {@link HTTPIngressRuleValue}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HTTPIngressRuleValue {
        private final java.util.List<k8s.HTTPIngressPath> paths;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.paths = this.jsiiGet("paths", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.HTTPIngressPath.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.HTTPIngressPath> paths) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.paths = java.util.Objects.requireNonNull(paths, "paths is required");
        }

        @Override
        public java.util.List<k8s.HTTPIngressPath> getPaths() {
            return this.paths;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("paths", om.valueToTree(this.getPaths()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HTTPIngressRuleValue"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HTTPIngressRuleValue.Jsii$Proxy that = (HTTPIngressRuleValue.Jsii$Proxy) o;

            return this.paths.equals(that.paths);
        }

        @Override
        public int hashCode() {
            int result = this.paths.hashCode();
            return result;
        }
    }
}
