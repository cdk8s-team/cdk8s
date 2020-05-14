package k8s;

/**
 * RuntimeClass defines a class of container runtime supported in the cluster.
 * <p>
 * The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.399Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.RuntimeClassOptions")
@software.amazon.jsii.Jsii.Proxy(RuntimeClassOptions.Jsii$Proxy.class)
public interface RuntimeClassOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class.
     * <p>
     * The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getHandler();

    /**
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass.
     * <p>
     * For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
     */
    default @org.jetbrains.annotations.Nullable k8s.Overhead getOverhead() {
        return null;
    }

    /**
     * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it.
     * <p>
     * If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     */
    default @org.jetbrains.annotations.Nullable k8s.Scheduling getScheduling() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RuntimeClassOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RuntimeClassOptions}
     */
    public static final class Builder {
        private java.lang.String handler;
        private k8s.ObjectMeta metadata;
        private k8s.Overhead overhead;
        private k8s.Scheduling scheduling;

        /**
         * Sets the value of {@link RuntimeClassOptions#getHandler}
         * @param handler Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. This parameter is required.
         *                The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
         * @return {@code this}
         */
        public Builder handler(java.lang.String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * Sets the value of {@link RuntimeClassOptions#getMetadata}
         * @param metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link RuntimeClassOptions#getOverhead}
         * @param overhead Overhead represents the resource overhead associated with running a pod for a given RuntimeClass.
         *                 For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
         * @return {@code this}
         */
        public Builder overhead(k8s.Overhead overhead) {
            this.overhead = overhead;
            return this;
        }

        /**
         * Sets the value of {@link RuntimeClassOptions#getScheduling}
         * @param scheduling Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it.
         *                   If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
         * @return {@code this}
         */
        public Builder scheduling(k8s.Scheduling scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RuntimeClassOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public RuntimeClassOptions build() {
            return new Jsii$Proxy(handler, metadata, overhead, scheduling);
        }
    }

    /**
     * An implementation for {@link RuntimeClassOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RuntimeClassOptions {
        private final java.lang.String handler;
        private final k8s.ObjectMeta metadata;
        private final k8s.Overhead overhead;
        private final k8s.Scheduling scheduling;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.handler = this.jsiiGet("handler", java.lang.String.class);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
            this.overhead = this.jsiiGet("overhead", k8s.Overhead.class);
            this.scheduling = this.jsiiGet("scheduling", k8s.Scheduling.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String handler, final k8s.ObjectMeta metadata, final k8s.Overhead overhead, final k8s.Scheduling scheduling) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.handler = java.util.Objects.requireNonNull(handler, "handler is required");
            this.metadata = metadata;
            this.overhead = overhead;
            this.scheduling = scheduling;
        }

        @Override
        public java.lang.String getHandler() {
            return this.handler;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public k8s.Overhead getOverhead() {
            return this.overhead;
        }

        @Override
        public k8s.Scheduling getScheduling() {
            return this.scheduling;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("handler", om.valueToTree(this.getHandler()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getOverhead() != null) {
                data.set("overhead", om.valueToTree(this.getOverhead()));
            }
            if (this.getScheduling() != null) {
                data.set("scheduling", om.valueToTree(this.getScheduling()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RuntimeClassOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RuntimeClassOptions.Jsii$Proxy that = (RuntimeClassOptions.Jsii$Proxy) o;

            if (!handler.equals(that.handler)) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            if (this.overhead != null ? !this.overhead.equals(that.overhead) : that.overhead != null) return false;
            return this.scheduling != null ? this.scheduling.equals(that.scheduling) : that.scheduling == null;
        }

        @Override
        public int hashCode() {
            int result = this.handler.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.overhead != null ? this.overhead.hashCode() : 0);
            result = 31 * result + (this.scheduling != null ? this.scheduling.hashCode() : 0);
            return result;
        }
    }
}
