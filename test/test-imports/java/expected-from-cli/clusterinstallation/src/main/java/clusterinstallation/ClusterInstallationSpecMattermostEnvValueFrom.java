package clusterinstallation;

/**
 * Source for the environment variable's value.
 * <p>
 * Cannot be used if value is not empty.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.390Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecMattermostEnvValueFrom.Jsii$Proxy.class)
public interface ClusterInstallationSpecMattermostEnvValueFrom extends software.amazon.jsii.JsiiSerializable {

    /**
     * Selects a key of a ConfigMap.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return null;
    }

    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromFieldRef getFieldRef() {
        return null;
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef getResourceFieldRef() {
        return null;
    }

    /**
     * Selects a key of a secret in the pod's namespace.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef getSecretKeyRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecMattermostEnvValueFrom}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecMattermostEnvValueFrom}
     */
    public static final class Builder {
        private clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef configMapKeyRef;
        private clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromFieldRef fieldRef;
        private clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef resourceFieldRef;
        private clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef secretKeyRef;

        /**
         * Sets the value of {@link ClusterInstallationSpecMattermostEnvValueFrom#getConfigMapKeyRef}
         * @param configMapKeyRef Selects a key of a ConfigMap.
         * @return {@code this}
         */
        public Builder configMapKeyRef(clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecMattermostEnvValueFrom#getFieldRef}
         * @param fieldRef Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
         * @return {@code this}
         */
        public Builder fieldRef(clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecMattermostEnvValueFrom#getResourceFieldRef}
         * @param resourceFieldRef Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
         * @return {@code this}
         */
        public Builder resourceFieldRef(clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecMattermostEnvValueFrom#getSecretKeyRef}
         * @param secretKeyRef Selects a key of a secret in the pod's namespace.
         * @return {@code this}
         */
        public Builder secretKeyRef(clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecMattermostEnvValueFrom}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecMattermostEnvValueFrom build() {
            return new Jsii$Proxy(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecMattermostEnvValueFrom}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecMattermostEnvValueFrom {
        private final clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef configMapKeyRef;
        private final clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromFieldRef fieldRef;
        private final clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef resourceFieldRef;
        private final clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef secretKeyRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMapKeyRef = this.jsiiGet("configMapKeyRef", clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef.class);
            this.fieldRef = this.jsiiGet("fieldRef", clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromFieldRef.class);
            this.resourceFieldRef = this.jsiiGet("resourceFieldRef", clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef.class);
            this.secretKeyRef = this.jsiiGet("secretKeyRef", clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef configMapKeyRef, final clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromFieldRef fieldRef, final clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef resourceFieldRef, final clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef secretKeyRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMapKeyRef = configMapKeyRef;
            this.fieldRef = fieldRef;
            this.resourceFieldRef = resourceFieldRef;
            this.secretKeyRef = secretKeyRef;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
            return this.configMapKeyRef;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromFieldRef getFieldRef() {
            return this.fieldRef;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef getResourceFieldRef() {
            return this.resourceFieldRef;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef getSecretKeyRef() {
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
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecMattermostEnvValueFrom.Jsii$Proxy that = (ClusterInstallationSpecMattermostEnvValueFrom.Jsii$Proxy) o;

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
