package k8s;

/**
 * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to use.
 * <p>
 * It requires the path prefix to be defined.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.090Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.AllowedHostPath")
@software.amazon.jsii.Jsii.Proxy(AllowedHostPath.Jsii$Proxy.class)
public interface AllowedHostPath extends software.amazon.jsii.JsiiSerializable {

    /**
     * pathPrefix is the path prefix that the host volume must match.
     * <p>
     * It does not support <code>*</code>. Trailing slashes are trimmed when validating the path prefix with a host path.
     * <p>
     * Examples: <code>/foo</code> would allow <code>/foo</code>, <code>/foo/</code> and <code>/foo/bar</code> <code>/foo</code> would not allow <code>/food</code> or <code>/etc/foo</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPathPrefix() {
        return null;
    }

    /**
     * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AllowedHostPath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AllowedHostPath}
     */
    public static final class Builder {
        private java.lang.String pathPrefix;
        private java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link AllowedHostPath#getPathPrefix}
         * @param pathPrefix pathPrefix is the path prefix that the host volume must match.
         *                   It does not support <code>*</code>. Trailing slashes are trimmed when validating the path prefix with a host path.
         *                   <p>
         *                   Examples: <code>/foo</code> would allow <code>/foo</code>, <code>/foo/</code> and <code>/foo/bar</code> <code>/foo</code> would not allow <code>/food</code> or <code>/etc/foo</code>
         * @return {@code this}
         */
        public Builder pathPrefix(java.lang.String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * Sets the value of {@link AllowedHostPath#getReadOnly}
         * @param readOnly when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AllowedHostPath}
         * @throws NullPointerException if any required attribute was not provided
         */
        public AllowedHostPath build() {
            return new Jsii$Proxy(pathPrefix, readOnly);
        }
    }

    /**
     * An implementation for {@link AllowedHostPath}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AllowedHostPath {
        private final java.lang.String pathPrefix;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pathPrefix = this.jsiiGet("pathPrefix", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String pathPrefix, final java.lang.Boolean readOnly) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pathPrefix = pathPrefix;
            this.readOnly = readOnly;
        }

        @Override
        public java.lang.String getPathPrefix() {
            return this.pathPrefix;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPathPrefix() != null) {
                data.set("pathPrefix", om.valueToTree(this.getPathPrefix()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.AllowedHostPath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AllowedHostPath.Jsii$Proxy that = (AllowedHostPath.Jsii$Proxy) o;

            if (this.pathPrefix != null ? !this.pathPrefix.equals(that.pathPrefix) : that.pathPrefix != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public int hashCode() {
            int result = this.pathPrefix != null ? this.pathPrefix.hashCode() : 0;
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
