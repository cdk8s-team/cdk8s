package k8s;

/**
 * CrossVersionObjectReference contains enough information to let you identify the referred resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.155Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CrossVersionObjectReference")
@software.amazon.jsii.Jsii.Proxy(CrossVersionObjectReference.Jsii$Proxy.class)
public interface CrossVersionObjectReference extends software.amazon.jsii.JsiiSerializable {

    /**
     * Kind of the referent;
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * Name of the referent;
     * <p>
     * More info: http://kubernetes.io/docs/user-guide/identifiers#names
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * API version of the referent.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CrossVersionObjectReference}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CrossVersionObjectReference}
     */
    public static final class Builder {
        private java.lang.String kind;
        private java.lang.String name;
        private java.lang.String apiVersion;

        /**
         * Sets the value of {@link CrossVersionObjectReference#getKind}
         * @param kind Kind of the referent;. This parameter is required.
         *             More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link CrossVersionObjectReference#getName}
         * @param name Name of the referent;. This parameter is required.
         *             More info: http://kubernetes.io/docs/user-guide/identifiers#names
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CrossVersionObjectReference#getApiVersion}
         * @param apiVersion API version of the referent.
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CrossVersionObjectReference}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CrossVersionObjectReference build() {
            return new Jsii$Proxy(kind, name, apiVersion);
        }
    }

    /**
     * An implementation for {@link CrossVersionObjectReference}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CrossVersionObjectReference {
        private final java.lang.String kind;
        private final java.lang.String name;
        private final java.lang.String apiVersion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kind = this.jsiiGet("kind", java.lang.String.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.apiVersion = this.jsiiGet("apiVersion", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String kind, final java.lang.String name, final java.lang.String apiVersion) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kind = java.util.Objects.requireNonNull(kind, "kind is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.apiVersion = apiVersion;
        }

        @Override
        public java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("kind", om.valueToTree(this.getKind()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getApiVersion() != null) {
                data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CrossVersionObjectReference"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CrossVersionObjectReference.Jsii$Proxy that = (CrossVersionObjectReference.Jsii$Proxy) o;

            if (!kind.equals(that.kind)) return false;
            if (!name.equals(that.name)) return false;
            return this.apiVersion != null ? this.apiVersion.equals(that.apiVersion) : that.apiVersion == null;
        }

        @Override
        public int hashCode() {
            int result = this.kind.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.apiVersion != null ? this.apiVersion.hashCode() : 0);
            return result;
        }
    }
}
