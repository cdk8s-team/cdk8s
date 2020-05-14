package k8s;

/**
 * ConfigMap holds configuration data for pods to consume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.140Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ConfigMapOptions")
@software.amazon.jsii.Jsii.Proxy(ConfigMapOptions.Jsii$Proxy.class)
public interface ConfigMapOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * BinaryData contains the binary data.
     * <p>
     * Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getBinaryData() {
        return null;
    }

    /**
     * Data contains the configuration data.
     * <p>
     * Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
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
     * @return a {@link Builder} of {@link ConfigMapOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigMapOptions}
     */
    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> binaryData;
        private java.util.Map<java.lang.String, java.lang.String> data;
        private k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link ConfigMapOptions#getBinaryData}
         * @param binaryData BinaryData contains the binary data.
         *                   Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
         * @return {@code this}
         */
        public Builder binaryData(java.util.Map<java.lang.String, java.lang.String> binaryData) {
            this.binaryData = binaryData;
            return this;
        }

        /**
         * Sets the value of {@link ConfigMapOptions#getData}
         * @param data Data contains the configuration data.
         *             Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
         * @return {@code this}
         */
        public Builder data(java.util.Map<java.lang.String, java.lang.String> data) {
            this.data = data;
            return this;
        }

        /**
         * Sets the value of {@link ConfigMapOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigMapOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ConfigMapOptions build() {
            return new Jsii$Proxy(binaryData, data, metadata);
        }
    }

    /**
     * An implementation for {@link ConfigMapOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigMapOptions {
        private final java.util.Map<java.lang.String, java.lang.String> binaryData;
        private final java.util.Map<java.lang.String, java.lang.String> data;
        private final k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.binaryData = this.jsiiGet("binaryData", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.data = this.jsiiGet("data", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.Map<java.lang.String, java.lang.String> binaryData, final java.util.Map<java.lang.String, java.lang.String> data, final k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.binaryData = binaryData;
            this.data = data;
            this.metadata = metadata;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getBinaryData() {
            return this.binaryData;
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
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBinaryData() != null) {
                data.set("binaryData", om.valueToTree(this.getBinaryData()));
            }
            if (this.getData() != null) {
                data.set("data", om.valueToTree(this.getData()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ConfigMapOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigMapOptions.Jsii$Proxy that = (ConfigMapOptions.Jsii$Proxy) o;

            if (this.binaryData != null ? !this.binaryData.equals(that.binaryData) : that.binaryData != null) return false;
            if (this.data != null ? !this.data.equals(that.data) : that.data != null) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public int hashCode() {
            int result = this.binaryData != null ? this.binaryData.hashCode() : 0;
            result = 31 * result + (this.data != null ? this.data.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
