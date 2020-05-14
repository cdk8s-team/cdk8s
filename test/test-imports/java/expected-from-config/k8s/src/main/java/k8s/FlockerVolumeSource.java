package k8s;

/**
 * Represents a Flocker volume mounted by the Flocker agent.
 * <p>
 * One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.222Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.FlockerVolumeSource")
@software.amazon.jsii.Jsii.Proxy(FlockerVolumeSource.Jsii$Proxy.class)
public interface FlockerVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDatasetName() {
        return null;
    }

    /**
     * UUID of the dataset.
     * <p>
     * This is unique identifier of a Flocker dataset
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDatasetUuid() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FlockerVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FlockerVolumeSource}
     */
    public static final class Builder {
        private java.lang.String datasetName;
        private java.lang.String datasetUuid;

        /**
         * Sets the value of {@link FlockerVolumeSource#getDatasetName}
         * @param datasetName Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated.
         * @return {@code this}
         */
        public Builder datasetName(java.lang.String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * Sets the value of {@link FlockerVolumeSource#getDatasetUuid}
         * @param datasetUuid UUID of the dataset.
         *                    This is unique identifier of a Flocker dataset
         * @return {@code this}
         */
        public Builder datasetUuid(java.lang.String datasetUuid) {
            this.datasetUuid = datasetUuid;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FlockerVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public FlockerVolumeSource build() {
            return new Jsii$Proxy(datasetName, datasetUuid);
        }
    }

    /**
     * An implementation for {@link FlockerVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FlockerVolumeSource {
        private final java.lang.String datasetName;
        private final java.lang.String datasetUuid;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.datasetName = this.jsiiGet("datasetName", java.lang.String.class);
            this.datasetUuid = this.jsiiGet("datasetUUID", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String datasetName, final java.lang.String datasetUuid) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.datasetName = datasetName;
            this.datasetUuid = datasetUuid;
        }

        @Override
        public java.lang.String getDatasetName() {
            return this.datasetName;
        }

        @Override
        public java.lang.String getDatasetUuid() {
            return this.datasetUuid;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDatasetName() != null) {
                data.set("datasetName", om.valueToTree(this.getDatasetName()));
            }
            if (this.getDatasetUuid() != null) {
                data.set("datasetUUID", om.valueToTree(this.getDatasetUuid()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.FlockerVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FlockerVolumeSource.Jsii$Proxy that = (FlockerVolumeSource.Jsii$Proxy) o;

            if (this.datasetName != null ? !this.datasetName.equals(that.datasetName) : that.datasetName != null) return false;
            return this.datasetUuid != null ? this.datasetUuid.equals(that.datasetUuid) : that.datasetUuid == null;
        }

        @Override
        public int hashCode() {
            int result = this.datasetName != null ? this.datasetName.hashCode() : 0;
            result = 31 * result + (this.datasetUuid != null ? this.datasetUuid.hashCode() : 0);
            return result;
        }
    }
}
