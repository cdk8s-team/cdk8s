package k8s;

/**
 * EnvFromSource represents the source of a set of ConfigMaps.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.201Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EnvFromSource")
@software.amazon.jsii.Jsii.Proxy(EnvFromSource.Jsii$Proxy.class)
public interface EnvFromSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * The ConfigMap to select from.
     */
    default @org.jetbrains.annotations.Nullable k8s.ConfigMapEnvSource getConfigMapRef() {
        return null;
    }

    /**
     * An optional identifier to prepend to each key in the ConfigMap.
     * <p>
     * Must be a C_IDENTIFIER.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * The Secret to select from.
     */
    default @org.jetbrains.annotations.Nullable k8s.SecretEnvSource getSecretRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EnvFromSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EnvFromSource}
     */
    public static final class Builder {
        private k8s.ConfigMapEnvSource configMapRef;
        private java.lang.String prefix;
        private k8s.SecretEnvSource secretRef;

        /**
         * Sets the value of {@link EnvFromSource#getConfigMapRef}
         * @param configMapRef The ConfigMap to select from.
         * @return {@code this}
         */
        public Builder configMapRef(k8s.ConfigMapEnvSource configMapRef) {
            this.configMapRef = configMapRef;
            return this;
        }

        /**
         * Sets the value of {@link EnvFromSource#getPrefix}
         * @param prefix An optional identifier to prepend to each key in the ConfigMap.
         *               Must be a C_IDENTIFIER.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link EnvFromSource#getSecretRef}
         * @param secretRef The Secret to select from.
         * @return {@code this}
         */
        public Builder secretRef(k8s.SecretEnvSource secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EnvFromSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public EnvFromSource build() {
            return new Jsii$Proxy(configMapRef, prefix, secretRef);
        }
    }

    /**
     * An implementation for {@link EnvFromSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EnvFromSource {
        private final k8s.ConfigMapEnvSource configMapRef;
        private final java.lang.String prefix;
        private final k8s.SecretEnvSource secretRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMapRef = this.jsiiGet("configMapRef", k8s.ConfigMapEnvSource.class);
            this.prefix = this.jsiiGet("prefix", java.lang.String.class);
            this.secretRef = this.jsiiGet("secretRef", k8s.SecretEnvSource.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.ConfigMapEnvSource configMapRef, final java.lang.String prefix, final k8s.SecretEnvSource secretRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMapRef = configMapRef;
            this.prefix = prefix;
            this.secretRef = secretRef;
        }

        @Override
        public k8s.ConfigMapEnvSource getConfigMapRef() {
            return this.configMapRef;
        }

        @Override
        public java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public k8s.SecretEnvSource getSecretRef() {
            return this.secretRef;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigMapRef() != null) {
                data.set("configMapRef", om.valueToTree(this.getConfigMapRef()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EnvFromSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EnvFromSource.Jsii$Proxy that = (EnvFromSource.Jsii$Proxy) o;

            if (this.configMapRef != null ? !this.configMapRef.equals(that.configMapRef) : that.configMapRef != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            return this.secretRef != null ? this.secretRef.equals(that.secretRef) : that.secretRef == null;
        }

        @Override
        public int hashCode() {
            int result = this.configMapRef != null ? this.configMapRef.hashCode() : 0;
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            return result;
        }
    }
}
