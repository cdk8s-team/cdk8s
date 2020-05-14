package k8s;

/**
 * ReplicaSetSpec is the specification of a ReplicaSet.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.386Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ReplicaSetSpec")
@software.amazon.jsii.Jsii.Proxy(ReplicaSetSpec.Jsii$Proxy.class)
public interface ReplicaSetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Selector is a label query over pods that should match the replica count.
     * <p>
     * Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     */
    @org.jetbrains.annotations.NotNull k8s.LabelSelector getSelector();

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
     * This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * <p>
     * Default: 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * Template is the object that describes the pod that will be created if insufficient replicas are detected.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     */
    default @org.jetbrains.annotations.Nullable k8s.PodTemplateSpec getTemplate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ReplicaSetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ReplicaSetSpec}
     */
    public static final class Builder {
        private k8s.LabelSelector selector;
        private java.lang.Number minReadySeconds;
        private java.lang.Number replicas;
        private k8s.PodTemplateSpec template;

        /**
         * Sets the value of {@link ReplicaSetSpec#getSelector}
         * @param selector Selector is a label query over pods that should match the replica count. This parameter is required.
         *                 Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * @return {@code this}
         */
        public Builder selector(k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link ReplicaSetSpec#getMinReadySeconds}
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
         *                        Defaults to 0 (pod will be considered available as soon as it is ready)
         * @return {@code this}
         */
        public Builder minReadySeconds(java.lang.Number minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * Sets the value of {@link ReplicaSetSpec#getReplicas}
         * @param replicas Replicas is the number of desired replicas.
         *                 This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Sets the value of {@link ReplicaSetSpec#getTemplate}
         * @param template Template is the object that describes the pod that will be created if insufficient replicas are detected.
         *                 More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
         * @return {@code this}
         */
        public Builder template(k8s.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ReplicaSetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ReplicaSetSpec build() {
            return new Jsii$Proxy(selector, minReadySeconds, replicas, template);
        }
    }

    /**
     * An implementation for {@link ReplicaSetSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ReplicaSetSpec {
        private final k8s.LabelSelector selector;
        private final java.lang.Number minReadySeconds;
        private final java.lang.Number replicas;
        private final k8s.PodTemplateSpec template;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selector = this.jsiiGet("selector", k8s.LabelSelector.class);
            this.minReadySeconds = this.jsiiGet("minReadySeconds", java.lang.Number.class);
            this.replicas = this.jsiiGet("replicas", java.lang.Number.class);
            this.template = this.jsiiGet("template", k8s.PodTemplateSpec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.LabelSelector selector, final java.lang.Number minReadySeconds, final java.lang.Number replicas, final k8s.PodTemplateSpec template) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selector = java.util.Objects.requireNonNull(selector, "selector is required");
            this.minReadySeconds = minReadySeconds;
            this.replicas = replicas;
            this.template = template;
        }

        @Override
        public k8s.LabelSelector getSelector() {
            return this.selector;
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
        public k8s.PodTemplateSpec getTemplate() {
            return this.template;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("selector", om.valueToTree(this.getSelector()));
            if (this.getMinReadySeconds() != null) {
                data.set("minReadySeconds", om.valueToTree(this.getMinReadySeconds()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }
            if (this.getTemplate() != null) {
                data.set("template", om.valueToTree(this.getTemplate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ReplicaSetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ReplicaSetSpec.Jsii$Proxy that = (ReplicaSetSpec.Jsii$Proxy) o;

            if (!selector.equals(that.selector)) return false;
            if (this.minReadySeconds != null ? !this.minReadySeconds.equals(that.minReadySeconds) : that.minReadySeconds != null) return false;
            if (this.replicas != null ? !this.replicas.equals(that.replicas) : that.replicas != null) return false;
            return this.template != null ? this.template.equals(that.template) : that.template == null;
        }

        @Override
        public int hashCode() {
            int result = this.selector.hashCode();
            result = 31 * result + (this.minReadySeconds != null ? this.minReadySeconds.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            result = 31 * result + (this.template != null ? this.template.hashCode() : 0);
            return result;
        }
    }
}
