package k8s;

/**
 * Secret holds secret data of a certain type.
 * <p>
 * The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.418Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.SecretOptions")
@software.amazon.jsii.Jsii.Proxy(SecretOptions.Jsii$Proxy.class)
public interface SecretOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Data contains the secret data.
     * <p>
     * Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getData() {
        return null;
    }

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * stringData allows specifying non-binary secret data in string form.
     * <p>
     * It is provided as a write-only convenience method. All keys and values are merged into the data field on write, overwriting any existing values. It is never output when reading from the API.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getStringData() {
        return null;
    }

    /**
     * Used to facilitate programmatic handling of secret data.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecretOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecretOptions}
     */
    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> data;
        private k8s.ObjectMeta metadata;
        private java.util.Map<java.lang.String, java.lang.String> stringData;
        private java.lang.String type;

        /**
         * Sets the value of {@link SecretOptions#getData}
         * @param data Data contains the secret data.
         *             Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
         * @return {@code this}
         */
        public Builder data(java.util.Map<java.lang.String, java.lang.String> data) {
            this.data = data;
            return this;
        }

        /**
         * Sets the value of {@link SecretOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link SecretOptions#getStringData}
         * @param stringData stringData allows specifying non-binary secret data in string form.
         *                   It is provided as a write-only convenience method. All keys and values are merged into the data field on write, overwriting any existing values. It is never output when reading from the API.
         * @return {@code this}
         */
        public Builder stringData(java.util.Map<java.lang.String, java.lang.String> stringData) {
            this.stringData = stringData;
            return this;
        }

        /**
         * Sets the value of {@link SecretOptions#getType}
         * @param type Used to facilitate programmatic handling of secret data.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SecretOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public SecretOptions build() {
            return new Jsii$Proxy(data, metadata, stringData, type);
        }
    }

    /**
     * An implementation for {@link SecretOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecretOptions {
        private final java.util.Map<java.lang.String, java.lang.String> data;
        private final k8s.ObjectMeta metadata;
        private final java.util.Map<java.lang.String, java.lang.String> stringData;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.data = this.jsiiGet("data", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
            this.stringData = this.jsiiGet("stringData", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = this.jsiiGet("type", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.Map<java.lang.String, java.lang.String> data, final k8s.ObjectMeta metadata, final java.util.Map<java.lang.String, java.lang.String> stringData, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.data = data;
            this.metadata = metadata;
            this.stringData = stringData;
            this.type = type;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getData() {
            return this.data;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getStringData() {
            return this.stringData;
        }

        @Override
        public java.lang.String getType() {
            return this.type;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getData() != null) {
                data.set("data", om.valueToTree(this.getData()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getStringData() != null) {
                data.set("stringData", om.valueToTree(this.getStringData()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SecretOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecretOptions.Jsii$Proxy that = (SecretOptions.Jsii$Proxy) o;

            if (this.data != null ? !this.data.equals(that.data) : that.data != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            if (this.stringData != null ? !this.stringData.equals(that.stringData) : that.stringData != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public int hashCode() {
            int result = this.data != null ? this.data.hashCode() : 0;
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.stringData != null ? this.stringData.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
