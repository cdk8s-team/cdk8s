package k8s;

/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.094Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.AzureFilePersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(AzureFilePersistentVolumeSource.Jsii$Proxy.class)
public interface AzureFilePersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * the name of secret that contains Azure Storage Account Name and Key.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSecretName();

    /**
     * Share Name.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getShareName();

    /**
     * Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretNamespace() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AzureFilePersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AzureFilePersistentVolumeSource}
     */
    public static final class Builder {
        private java.lang.String secretName;
        private java.lang.String shareName;
        private java.lang.Boolean readOnly;
        private java.lang.String secretNamespace;

        /**
         * Sets the value of {@link AzureFilePersistentVolumeSource#getSecretName}
         * @param secretName the name of secret that contains Azure Storage Account Name and Key. This parameter is required.
         * @return {@code this}
         */
        public Builder secretName(java.lang.String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Sets the value of {@link AzureFilePersistentVolumeSource#getShareName}
         * @param shareName Share Name. This parameter is required.
         * @return {@code this}
         */
        public Builder shareName(java.lang.String shareName) {
            this.shareName = shareName;
            return this;
        }

        /**
         * Sets the value of {@link AzureFilePersistentVolumeSource#getReadOnly}
         * @param readOnly Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link AzureFilePersistentVolumeSource#getSecretNamespace}
         * @param secretNamespace the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod.
         * @return {@code this}
         */
        public Builder secretNamespace(java.lang.String secretNamespace) {
            this.secretNamespace = secretNamespace;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AzureFilePersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public AzureFilePersistentVolumeSource build() {
            return new Jsii$Proxy(secretName, shareName, readOnly, secretNamespace);
        }
    }

    /**
     * An implementation for {@link AzureFilePersistentVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AzureFilePersistentVolumeSource {
        private final java.lang.String secretName;
        private final java.lang.String shareName;
        private final java.lang.Boolean readOnly;
        private final java.lang.String secretNamespace;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.secretName = this.jsiiGet("secretName", java.lang.String.class);
            this.shareName = this.jsiiGet("shareName", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
            this.secretNamespace = this.jsiiGet("secretNamespace", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String secretName, final java.lang.String shareName, final java.lang.Boolean readOnly, final java.lang.String secretNamespace) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.secretName = java.util.Objects.requireNonNull(secretName, "secretName is required");
            this.shareName = java.util.Objects.requireNonNull(shareName, "shareName is required");
            this.readOnly = readOnly;
            this.secretNamespace = secretNamespace;
        }

        @Override
        public java.lang.String getSecretName() {
            return this.secretName;
        }

        @Override
        public java.lang.String getShareName() {
            return this.shareName;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public java.lang.String getSecretNamespace() {
            return this.secretNamespace;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("secretName", om.valueToTree(this.getSecretName()));
            data.set("shareName", om.valueToTree(this.getShareName()));
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretNamespace() != null) {
                data.set("secretNamespace", om.valueToTree(this.getSecretNamespace()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.AzureFilePersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AzureFilePersistentVolumeSource.Jsii$Proxy that = (AzureFilePersistentVolumeSource.Jsii$Proxy) o;

            if (!secretName.equals(that.secretName)) return false;
            if (!shareName.equals(that.shareName)) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.secretNamespace != null ? this.secretNamespace.equals(that.secretNamespace) : that.secretNamespace == null;
        }

        @Override
        public int hashCode() {
            int result = this.secretName.hashCode();
            result = 31 * result + (this.shareName.hashCode());
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretNamespace != null ? this.secretNamespace.hashCode() : 0);
            return result;
        }
    }
}
