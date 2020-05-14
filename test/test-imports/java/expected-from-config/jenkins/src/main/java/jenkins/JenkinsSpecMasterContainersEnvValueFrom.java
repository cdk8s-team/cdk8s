package jenkins;

/**
 * Source for the environment variable's value.
 * <p>
 * Cannot be used if value is not empty.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.602Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersEnvValueFrom")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersEnvValueFrom.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersEnvValueFrom extends software.amazon.jsii.JsiiSerializable {

    /**
     * Selects a key of a ConfigMap.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return null;
    }

    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersEnvValueFromFieldRef getFieldRef() {
        return null;
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return null;
    }

    /**
     * Selects a key of a secret in the pod's namespace.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersEnvValueFrom}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersEnvValueFrom}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
        private jenkins.JenkinsSpecMasterContainersEnvValueFromFieldRef fieldRef;
        private jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef resourceFieldRef;
        private jenkins.JenkinsSpecMasterContainersEnvValueFromSecretKeyRef secretKeyRef;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersEnvValueFrom#getConfigMapKeyRef}
         * @param configMapKeyRef Selects a key of a ConfigMap.
         * @return {@code this}
         */
        public Builder configMapKeyRef(jenkins.JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersEnvValueFrom#getFieldRef}
         * @param fieldRef Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.
         * @return {@code this}
         */
        public Builder fieldRef(jenkins.JenkinsSpecMasterContainersEnvValueFromFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersEnvValueFrom#getResourceFieldRef}
         * @param resourceFieldRef Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
         * @return {@code this}
         */
        public Builder resourceFieldRef(jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersEnvValueFrom#getSecretKeyRef}
         * @param secretKeyRef Selects a key of a secret in the pod's namespace.
         * @return {@code this}
         */
        public Builder secretKeyRef(jenkins.JenkinsSpecMasterContainersEnvValueFromSecretKeyRef secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersEnvValueFrom}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersEnvValueFrom build() {
            return new Jsii$Proxy(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersEnvValueFrom}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersEnvValueFrom {
        private final jenkins.JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
        private final jenkins.JenkinsSpecMasterContainersEnvValueFromFieldRef fieldRef;
        private final jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef resourceFieldRef;
        private final jenkins.JenkinsSpecMasterContainersEnvValueFromSecretKeyRef secretKeyRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMapKeyRef = this.jsiiGet("configMapKeyRef", jenkins.JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef.class);
            this.fieldRef = this.jsiiGet("fieldRef", jenkins.JenkinsSpecMasterContainersEnvValueFromFieldRef.class);
            this.resourceFieldRef = this.jsiiGet("resourceFieldRef", jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef.class);
            this.secretKeyRef = this.jsiiGet("secretKeyRef", jenkins.JenkinsSpecMasterContainersEnvValueFromSecretKeyRef.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef configMapKeyRef, final jenkins.JenkinsSpecMasterContainersEnvValueFromFieldRef fieldRef, final jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef resourceFieldRef, final jenkins.JenkinsSpecMasterContainersEnvValueFromSecretKeyRef secretKeyRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMapKeyRef = configMapKeyRef;
            this.fieldRef = fieldRef;
            this.resourceFieldRef = resourceFieldRef;
            this.secretKeyRef = secretKeyRef;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
            return this.configMapKeyRef;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersEnvValueFromFieldRef getFieldRef() {
            return this.fieldRef;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
            return this.resourceFieldRef;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
            return this.secretKeyRef;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigMapKeyRef() != null) {
                data.set("configMapKeyRef", om.valueToTree(this.getConfigMapKeyRef()));
            }
            if (this.getFieldRef() != null) {
                data.set("fieldRef", om.valueToTree(this.getFieldRef()));
            }
            if (this.getResourceFieldRef() != null) {
                data.set("resourceFieldRef", om.valueToTree(this.getResourceFieldRef()));
            }
            if (this.getSecretKeyRef() != null) {
                data.set("secretKeyRef", om.valueToTree(this.getSecretKeyRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersEnvValueFrom"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersEnvValueFrom.Jsii$Proxy that = (JenkinsSpecMasterContainersEnvValueFrom.Jsii$Proxy) o;

            if (this.configMapKeyRef != null ? !this.configMapKeyRef.equals(that.configMapKeyRef) : that.configMapKeyRef != null) return false;
            if (this.fieldRef != null ? !this.fieldRef.equals(that.fieldRef) : that.fieldRef != null) return false;
            if (this.resourceFieldRef != null ? !this.resourceFieldRef.equals(that.resourceFieldRef) : that.resourceFieldRef != null) return false;
            return this.secretKeyRef != null ? this.secretKeyRef.equals(that.secretKeyRef) : that.secretKeyRef == null;
        }

        @Override
        public int hashCode() {
            int result = this.configMapKeyRef != null ? this.configMapKeyRef.hashCode() : 0;
            result = 31 * result + (this.fieldRef != null ? this.fieldRef.hashCode() : 0);
            result = 31 * result + (this.resourceFieldRef != null ? this.resourceFieldRef.hashCode() : 0);
            result = 31 * result + (this.secretKeyRef != null ? this.secretKeyRef.hashCode() : 0);
            return result;
        }
    }
}
