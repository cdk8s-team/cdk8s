package k8s;

/**
 * ReplicationControllerSpec is the specification of a replication controller.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.388Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ReplicationControllerSpec")
@software.amazon.jsii.Jsii.Proxy(ReplicationControllerSpec.Jsii$Proxy.class)
public interface ReplicationControllerSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
     * <p>
     * Defaults to 0 (pod will be considered available as soon as it is ready)
     * <p>
     * Default: 0 (pod will be considered available as soon as it is ready)
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinReadySeconds() {
        return null;
    }

    /**
     * Replicas is the number of desired replicas.
     * <p>
     * This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
     * <p>
     * Default: 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * Selector is a label query over pods that should match the Replicas count.
     * <p>
     * If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getSelector() {
        return null;
    }

    /**
     * Template is the object that describes the pod that will be created if insufficient replicas are detected.
     * <p>
     * This takes precedence over a TemplateRef. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     */
    default @org.jetbrains.annotations.Nullable k8s.PodTemplateSpec getTemplate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicationControllerSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicationControllerSpec}
     */
    public static final class Builder {
        private java.lang.Number minReadySeconds;
        private java.lang.Number replicas;
        private java.util.Map<java.lang.String, java.lang.String> selector;
        private k8s.PodTemplateSpec template;

        /**
         * Sets the value of {@link ReplicationControllerSpec#getMinReadySeconds}
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
         *                        Defaults to 0 (pod will be considered available as soon as it is ready)
         * @return {@code this}
         */
        public Builder minReadySeconds(java.lang.Number minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpec#getReplicas}
         * @param replicas Replicas is the number of desired replicas.
         *                 This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpec#getSelector}
         * @param selector Selector is a label query over pods that should match the Replicas count.
         *                 If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * @return {@code this}
         */
        public Builder selector(java.util.Map<java.lang.String, java.lang.String> selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link ReplicationControllerSpec#getTemplate}
         * @param template Template is the object that describes the pod that will be created if insufficient replicas are detected.
         *                 This takes precedence over a TemplateRef. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
         * @return {@code this}
         */
        public Builder template(k8s.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicationControllerSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ReplicationControllerSpec build() {
            return new Jsii$Proxy(minReadySeconds, replicas, selector, template);
        }
    }

    /**
     * An implementation for {@link ReplicationControllerSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicationControllerSpec {
        private final java.lang.Number minReadySeconds;
        private final java.lang.Number replicas;
        private final java.util.Map<java.lang.String, java.lang.String> selector;
        private final k8s.PodTemplateSpec template;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.minReadySeconds = this.jsiiGet("minReadySeconds", java.lang.Number.class);
            this.replicas = this.jsiiGet("replicas", java.lang.Number.class);
            this.selector = this.jsiiGet("selector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.template = this.jsiiGet("template", k8s.PodTemplateSpec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number minReadySeconds, final java.lang.Number replicas, final java.util.Map<java.lang.String, java.lang.String> selector, final k8s.PodTemplateSpec template) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.minReadySeconds = minReadySeconds;
            this.replicas = replicas;
            this.selector = selector;
            this.template = template;
        }

        @Override
        public java.lang.Number getMinReadySeconds() {
            return this.minReadySeconds;
        }

        @Override
        public java.lang.Number getReplicas() {
            return this.replicas;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getSelector() {
            return this.selector;
        }

        @Override
        public k8s.PodTemplateSpec getTemplate() {
            return this.template;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMinReadySeconds() != null) {
                data.set("minReadySeconds", om.valueToTree(this.getMinReadySeconds()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getTemplate() != null) {
                data.set("template", om.valueToTree(this.getTemplate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ReplicationControllerSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicationControllerSpec.Jsii$Proxy that = (ReplicationControllerSpec.Jsii$Proxy) o;

            if (this.minReadySeconds != null ? !this.minReadySeconds.equals(that.minReadySeconds) : that.minReadySeconds != null) return false;
            if (this.replicas != null ? !this.replicas.equals(that.replicas) : that.replicas != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            return this.template != null ? this.template.equals(that.template) : that.template == null;
        }

        @Override
        public int hashCode() {
            int result = this.minReadySeconds != null ? this.minReadySeconds.hashCode() : 0;
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.template != null ? this.template.hashCode() : 0);
            return result;
        }
    }
}
