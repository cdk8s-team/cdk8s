package k8s;

/**
 * BoundObjectReference is a reference to an object that a token is bound to.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.097Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.BoundObjectReference")
@software.amazon.jsii.Jsii.Proxy(BoundObjectReference.Jsii$Proxy.class)
public interface BoundObjectReference extends software.amazon.jsii.JsiiSerializable {

    /**
     * API version of the referent.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiVersion() {
        return null;
    }

    /**
     * Kind of the referent.
     * <p>
     * Valid kinds are 'Pod' and 'Secret'.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * Name of the referent.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * UID of the referent.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BoundObjectReference}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BoundObjectReference}
     */
    public static final class Builder {
        private java.lang.String apiVersion;
        private java.lang.String kind;
        private java.lang.String name;
        private java.lang.String uid;

        /**
         * Sets the value of {@link BoundObjectReference#getApiVersion}
         * @param apiVersion API version of the referent.
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link BoundObjectReference#getKind}
         * @param kind Kind of the referent.
         *             Valid kinds are 'Pod' and 'Secret'.
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link BoundObjectReference#getName}
         * @param name Name of the referent.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link BoundObjectReference#getUid}
         * @param uid UID of the referent.
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BoundObjectReference}
         * @throws NullPointerException if any required attribute was not provided
         */
        public BoundObjectReference build() {
            return new Jsii$Proxy(apiVersion, kind, name, uid);
        }
    }

    /**
     * An implementation for {@link BoundObjectReference}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BoundObjectReference {
        private final java.lang.String apiVersion;
        private final java.lang.String kind;
        private final java.lang.String name;
        private final java.lang.String uid;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = this.jsiiGet("apiVersion", java.lang.String.class);
            this.kind = this.jsiiGet("kind", java.lang.String.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.uid = this.jsiiGet("uid", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String apiVersion, final java.lang.String kind, final java.lang.String name, final java.lang.String uid) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = apiVersion;
            this.kind = kind;
            this.name = name;
            this.uid = uid;
        }

        @Override
        public java.lang.String getApiVersion() {
            return this.apiVersion;
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
        public java.lang.String getUid() {
            return this.uid;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApiVersion() != null) {
                data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.BoundObjectReference"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BoundObjectReference.Jsii$Proxy that = (BoundObjectReference.Jsii$Proxy) o;

            if (this.apiVersion != null ? !this.apiVersion.equals(that.apiVersion) : that.apiVersion != null) return false;
            if (this.kind != null ? !this.kind.equals(that.kind) : that.kind != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.uid != null ? this.uid.equals(that.uid) : that.uid == null;
        }

        @Override
        public int hashCode() {
            int result = this.apiVersion != null ? this.apiVersion.hashCode() : 0;
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            return result;
        }
    }
}
