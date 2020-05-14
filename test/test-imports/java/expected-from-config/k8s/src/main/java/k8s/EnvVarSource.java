package k8s;

/**
 * EnvVarSource represents a source for the value of an EnvVar.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.202Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EnvVarSource")
@software.amazon.jsii.Jsii.Proxy(EnvVarSource.Jsii$Proxy.class)
public interface EnvVarSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Selects a key of a ConfigMap.
     */
    default @org.jetbrains.annotations.Nullable k8s.ConfigMapKeySelector getConfigMapKeyRef() {
        return null;
    }

    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectFieldSelector getFieldRef() {
        return null;
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     */
    default @org.jetbrains.annotations.Nullable k8s.ResourceFieldSelector getResourceFieldRef() {
        return null;
    }

    /**
     * Selects a key of a secret in the pod's namespace.
     */
    default @org.jetbrains.annotations.Nullable k8s.SecretKeySelector getSecretKeyRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EnvVarSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EnvVarSource}
     */
    public static final class Builder {
        private k8s.ConfigMapKeySelector configMapKeyRef;
        private k8s.ObjectFieldSelector fieldRef;
        private k8s.ResourceFieldSelector resourceFieldRef;
        private k8s.SecretKeySelector secretKeyRef;

        /**
         * Sets the value of {@link EnvVarSource#getConfigMapKeyRef}
         * @param configMapKeyRef Selects a key of a ConfigMap.
         * @return {@code this}
         */
        public Builder configMapKeyRef(k8s.ConfigMapKeySelector configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        /**
         * Sets the value of {@link EnvVarSource#getFieldRef}
         * @param fieldRef Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
         * @return {@code this}
         */
        public Builder fieldRef(k8s.ObjectFieldSelector fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        /**
         * Sets the value of {@link EnvVarSource#getResourceFieldRef}
         * @param resourceFieldRef Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
         * @return {@code this}
         */
        public Builder resourceFieldRef(k8s.ResourceFieldSelector resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * Sets the value of {@link EnvVarSource#getSecretKeyRef}
         * @param secretKeyRef Selects a key of a secret in the pod's namespace.
         * @return {@code this}
         */
        public Builder secretKeyRef(k8s.SecretKeySelector secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EnvVarSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public EnvVarSource build() {
            return new Jsii$Proxy(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
        }
    }

    /**
     * An implementation for {@link EnvVarSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EnvVarSource {
        private final k8s.ConfigMapKeySelector configMapKeyRef;
        private final k8s.ObjectFieldSelector fieldRef;
        private final k8s.ResourceFieldSelector resourceFieldRef;
        private final k8s.SecretKeySelector secretKeyRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMapKeyRef = this.jsiiGet("configMapKeyRef", k8s.ConfigMapKeySelector.class);
            this.fieldRef = this.jsiiGet("fieldRef", k8s.ObjectFieldSelector.class);
            this.resourceFieldRef = this.jsiiGet("resourceFieldRef", k8s.ResourceFieldSelector.class);
            this.secretKeyRef = this.jsiiGet("secretKeyRef", k8s.SecretKeySelector.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.ConfigMapKeySelector configMapKeyRef, final k8s.ObjectFieldSelector fieldRef, final k8s.ResourceFieldSelector resourceFieldRef, final k8s.SecretKeySelector secretKeyRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMapKeyRef = configMapKeyRef;
            this.fieldRef = fieldRef;
            this.resourceFieldRef = resourceFieldRef;
            this.secretKeyRef = secretKeyRef;
        }

        @Override
        public k8s.ConfigMapKeySelector getConfigMapKeyRef() {
            return this.configMapKeyRef;
        }

        @Override
        public k8s.ObjectFieldSelector getFieldRef() {
            return this.fieldRef;
        }

        @Override
        public k8s.ResourceFieldSelector getResourceFieldRef() {
            return this.resourceFieldRef;
        }

        @Override
        public k8s.SecretKeySelector getSecretKeyRef() {
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
            struct.set("fqn", om.valueToTree("k8s.EnvVarSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EnvVarSource.Jsii$Proxy that = (EnvVarSource.Jsii$Proxy) o;

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
