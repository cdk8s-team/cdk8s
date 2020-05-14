package k8s;

/**
 * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.427Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ServiceAccountOptions")
@software.amazon.jsii.Jsii.Proxy(ServiceAccountOptions.Jsii$Proxy.class)
public interface ServiceAccountOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted.
     * <p>
     * Can be overridden at the pod level.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutomountServiceAccountToken() {
        return null;
    }

    /**
     * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount.
     * <p>
     * ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.LocalObjectReference> getImagePullSecrets() {
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
     * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/configuration/secret
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.ObjectReference> getSecrets() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceAccountOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceAccountOptions}
     */
    public static final class Builder {
        private java.lang.Boolean automountServiceAccountToken;
        private java.util.List<k8s.LocalObjectReference> imagePullSecrets;
        private k8s.ObjectMeta metadata;
        private java.util.List<k8s.ObjectReference> secrets;

        /**
         * Sets the value of {@link ServiceAccountOptions#getAutomountServiceAccountToken}
         * @param automountServiceAccountToken AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted.
         *                                     Can be overridden at the pod level.
         * @return {@code this}
         */
        public Builder automountServiceAccountToken(java.lang.Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }

        /**
         * Sets the value of {@link ServiceAccountOptions#getImagePullSecrets}
         * @param imagePullSecrets ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount.
         *                         ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
         * @return {@code this}
         */
        public Builder imagePullSecrets(java.util.List<k8s.LocalObjectReference> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        /**
         * Sets the value of {@link ServiceAccountOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link ServiceAccountOptions#getSecrets}
         * @param secrets Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount.
         *                More info: https://kubernetes.io/docs/concepts/configuration/secret
         * @return {@code this}
         */
        public Builder secrets(java.util.List<k8s.ObjectReference> secrets) {
            this.secrets = secrets;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceAccountOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ServiceAccountOptions build() {
            return new Jsii$Proxy(automountServiceAccountToken, imagePullSecrets, metadata, secrets);
        }
    }

    /**
     * An implementation for {@link ServiceAccountOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceAccountOptions {
        private final java.lang.Boolean automountServiceAccountToken;
        private final java.util.List<k8s.LocalObjectReference> imagePullSecrets;
        private final k8s.ObjectMeta metadata;
        private final java.util.List<k8s.ObjectReference> secrets;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.automountServiceAccountToken = this.jsiiGet("automountServiceAccountToken", java.lang.Boolean.class);
            this.imagePullSecrets = this.jsiiGet("imagePullSecrets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.LocalObjectReference.class)));
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
            this.secrets = this.jsiiGet("secrets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.ObjectReference.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Boolean automountServiceAccountToken, final java.util.List<k8s.LocalObjectReference> imagePullSecrets, final k8s.ObjectMeta metadata, final java.util.List<k8s.ObjectReference> secrets) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.automountServiceAccountToken = automountServiceAccountToken;
            this.imagePullSecrets = imagePullSecrets;
            this.metadata = metadata;
            this.secrets = secrets;
        }

        @Override
        public java.lang.Boolean getAutomountServiceAccountToken() {
            return this.automountServiceAccountToken;
        }

        @Override
        public java.util.List<k8s.LocalObjectReference> getImagePullSecrets() {
            return this.imagePullSecrets;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public java.util.List<k8s.ObjectReference> getSecrets() {
            return this.secrets;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAutomountServiceAccountToken() != null) {
                data.set("automountServiceAccountToken", om.valueToTree(this.getAutomountServiceAccountToken()));
            }
            if (this.getImagePullSecrets() != null) {
                data.set("imagePullSecrets", om.valueToTree(this.getImagePullSecrets()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSecrets() != null) {
                data.set("secrets", om.valueToTree(this.getSecrets()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ServiceAccountOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceAccountOptions.Jsii$Proxy that = (ServiceAccountOptions.Jsii$Proxy) o;

            if (this.automountServiceAccountToken != null ? !this.automountServiceAccountToken.equals(that.automountServiceAccountToken) : that.automountServiceAccountToken != null) return false;
            if (this.imagePullSecrets != null ? !this.imagePullSecrets.equals(that.imagePullSecrets) : that.imagePullSecrets != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.secrets != null ? this.secrets.equals(that.secrets) : that.secrets == null;
        }

        @Override
        public int hashCode() {
            int result = this.automountServiceAccountToken != null ? this.automountServiceAccountToken.hashCode() : 0;
            result = 31 * result + (this.imagePullSecrets != null ? this.imagePullSecrets.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.secrets != null ? this.secrets.hashCode() : 0);
            return result;
        }
    }
}
