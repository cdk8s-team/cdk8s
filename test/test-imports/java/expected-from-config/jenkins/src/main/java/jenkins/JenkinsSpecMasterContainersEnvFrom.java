package jenkins;

/**
 * EnvFromSource represents the source of a set of ConfigMaps.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.601Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersEnvFrom")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersEnvFrom.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersEnvFrom extends software.amazon.jsii.JsiiSerializable {

    /**
     * The ConfigMap to select from.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersEnvFromConfigMapRef getConfigMapRef() {
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
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersEnvFromSecretRef getSecretRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersEnvFrom}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersEnvFrom}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecMasterContainersEnvFromConfigMapRef configMapRef;
        private java.lang.String prefix;
        private jenkins.JenkinsSpecMasterContainersEnvFromSecretRef secretRef;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersEnvFrom#getConfigMapRef}
         * @param configMapRef The ConfigMap to select from.
         * @return {@code this}
         */
        public Builder configMapRef(jenkins.JenkinsSpecMasterContainersEnvFromConfigMapRef configMapRef) {
            this.configMapRef = configMapRef;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersEnvFrom#getPrefix}
         * @param prefix An optional identifier to prepend to each key in the ConfigMap.
         *               Must be a C_IDENTIFIER.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersEnvFrom#getSecretRef}
         * @param secretRef The Secret to select from.
         * @return {@code this}
         */
        public Builder secretRef(jenkins.JenkinsSpecMasterContainersEnvFromSecretRef secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersEnvFrom}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersEnvFrom build() {
            return new Jsii$Proxy(configMapRef, prefix, secretRef);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersEnvFrom}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersEnvFrom {
        private final jenkins.JenkinsSpecMasterContainersEnvFromConfigMapRef configMapRef;
        private final java.lang.String prefix;
        private final jenkins.JenkinsSpecMasterContainersEnvFromSecretRef secretRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMapRef = this.jsiiGet("configMapRef", jenkins.JenkinsSpecMasterContainersEnvFromConfigMapRef.class);
            this.prefix = this.jsiiGet("prefix", java.lang.String.class);
            this.secretRef = this.jsiiGet("secretRef", jenkins.JenkinsSpecMasterContainersEnvFromSecretRef.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecMasterContainersEnvFromConfigMapRef configMapRef, final java.lang.String prefix, final jenkins.JenkinsSpecMasterContainersEnvFromSecretRef secretRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMapRef = configMapRef;
            this.prefix = prefix;
            this.secretRef = secretRef;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersEnvFromConfigMapRef getConfigMapRef() {
            return this.configMapRef;
        }

        @Override
        public java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersEnvFromSecretRef getSecretRef() {
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
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersEnvFrom"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersEnvFrom.Jsii$Proxy that = (JenkinsSpecMasterContainersEnvFrom.Jsii$Proxy) o;

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
