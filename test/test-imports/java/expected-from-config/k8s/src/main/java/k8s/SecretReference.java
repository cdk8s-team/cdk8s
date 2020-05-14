package k8s;

/**
 * SecretReference represents a Secret Reference.
 * <p>
 * It has enough information to retrieve secret in any namespace
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.418Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.SecretReference")
@software.amazon.jsii.Jsii.Proxy(SecretReference.Jsii$Proxy.class)
public interface SecretReference extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name is unique within a namespace to reference a secret resource.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Namespace defines the space within which the secret name must be unique.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecretReference}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecretReference}
     */
    public static final class Builder {
        private java.lang.String name;
        private java.lang.String namespace;

        /**
         * Sets the value of {@link SecretReference#getName}
         * @param name Name is unique within a namespace to reference a secret resource.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SecretReference#getNamespace}
         * @param namespace Namespace defines the space within which the secret name must be unique.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SecretReference}
         * @throws NullPointerException if any required attribute was not provided
         */
        public SecretReference build() {
            return new Jsii$Proxy(name, namespace);
        }
    }

    /**
     * An implementation for {@link SecretReference}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecretReference {
        private final java.lang.String name;
        private final java.lang.String namespace;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.namespace = this.jsiiGet("namespace", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String name, final java.lang.String namespace) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = name;
            this.namespace = namespace;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SecretReference"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecretReference.Jsii$Proxy that = (SecretReference.Jsii$Proxy) o;

            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.namespace != null ? this.namespace.equals(that.namespace) : that.namespace == null;
        }

        @Override
        public int hashCode() {
            int result = this.name != null ? this.name.hashCode() : 0;
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            return result;
        }
    }
}
