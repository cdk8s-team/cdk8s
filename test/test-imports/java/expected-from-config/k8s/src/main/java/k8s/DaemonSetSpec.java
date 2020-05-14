package k8s;

/**
 * DaemonSetSpec is the specification of a daemon set.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.175Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.DaemonSetSpec")
@software.amazon.jsii.Jsii.Proxy(DaemonSetSpec.Jsii$Proxy.class)
public interface DaemonSetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * A label query over pods that are managed by the daemon set.
     * <p>
     * Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     */
    @org.jetbrains.annotations.NotNull k8s.LabelSelector getSelector();

    /**
     * An object that describes the pod that will be created.
     * <p>
     * The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     */
    @org.jetbrains.annotations.NotNull k8s.PodTemplateSpec getTemplate();

    /**
     * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available.
     * <p>
     * Defaults to 0 (pod will be considered available as soon as it is ready).
     * <p>
     * Default: 0 (pod will be considered available as soon as it is ready).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinReadySeconds() {
        return null;
    }

    /**
     * The number of old history to retain to allow rollback.
     * <p>
     * This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * <p>
     * Default: 10.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimit() {
        return null;
    }

    /**
     * An update strategy to replace existing DaemonSet pods with new pods.
     */
    default @org.jetbrains.annotations.Nullable k8s.DaemonSetUpdateStrategy getUpdateStrategy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DaemonSetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DaemonSetSpec}
     */
    public static final class Builder {
        private k8s.LabelSelector selector;
        private k8s.PodTemplateSpec template;
        private java.lang.Number minReadySeconds;
        private java.lang.Number revisionHistoryLimit;
        private k8s.DaemonSetUpdateStrategy updateStrategy;

        /**
         * Sets the value of {@link DaemonSetSpec#getSelector}
         * @param selector A label query over pods that are managed by the daemon set. This parameter is required.
         *                 Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * @return {@code this}
         */
        public Builder selector(k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetSpec#getTemplate}
         * @param template An object that describes the pod that will be created. This parameter is required.
         *                 The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
         * @return {@code this}
         */
        public Builder template(k8s.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetSpec#getMinReadySeconds}
         * @param minReadySeconds The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available.
         *                        Defaults to 0 (pod will be considered available as soon as it is ready).
         * @return {@code this}
         */
        public Builder minReadySeconds(java.lang.Number minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetSpec#getRevisionHistoryLimit}
         * @param revisionHistoryLimit The number of old history to retain to allow rollback.
         *                             This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
         * @return {@code this}
         */
        public Builder revisionHistoryLimit(java.lang.Number revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link DaemonSetSpec#getUpdateStrategy}
         * @param updateStrategy An update strategy to replace existing DaemonSet pods with new pods.
         * @return {@code this}
         */
        public Builder updateStrategy(k8s.DaemonSetUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DaemonSetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public DaemonSetSpec build() {
            return new Jsii$Proxy(selector, template, minReadySeconds, revisionHistoryLimit, updateStrategy);
        }
    }

    /**
     * An implementation for {@link DaemonSetSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DaemonSetSpec {
        private final k8s.LabelSelector selector;
        private final k8s.PodTemplateSpec template;
        private final java.lang.Number minReadySeconds;
        private final java.lang.Number revisionHistoryLimit;
        private final k8s.DaemonSetUpdateStrategy updateStrategy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selector = this.jsiiGet("selector", k8s.LabelSelector.class);
            this.template = this.jsiiGet("template", k8s.PodTemplateSpec.class);
            this.minReadySeconds = this.jsiiGet("minReadySeconds", java.lang.Number.class);
            this.revisionHistoryLimit = this.jsiiGet("revisionHistoryLimit", java.lang.Number.class);
            this.updateStrategy = this.jsiiGet("updateStrategy", k8s.DaemonSetUpdateStrategy.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.LabelSelector selector, final k8s.PodTemplateSpec template, final java.lang.Number minReadySeconds, final java.lang.Number revisionHistoryLimit, final k8s.DaemonSetUpdateStrategy updateStrategy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selector = java.util.Objects.requireNonNull(selector, "selector is required");
            this.template = java.util.Objects.requireNonNull(template, "template is required");
            this.minReadySeconds = minReadySeconds;
            this.revisionHistoryLimit = revisionHistoryLimit;
            this.updateStrategy = updateStrategy;
        }

        @Override
        public k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public k8s.PodTemplateSpec getTemplate() {
            return this.template;
        }

        @Override
        public java.lang.Number getMinReadySeconds() {
            return this.minReadySeconds;
        }

        @Override
        public java.lang.Number getRevisionHistoryLimit() {
            return this.revisionHistoryLimit;
        }

        @Override
        public k8s.DaemonSetUpdateStrategy getUpdateStrategy() {
            return this.updateStrategy;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("selector", om.valueToTree(this.getSelector()));
            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getMinReadySeconds() != null) {
                data.set("minReadySeconds", om.valueToTree(this.getMinReadySeconds()));
            }
            if (this.getRevisionHistoryLimit() != null) {
                data.set("revisionHistoryLimit", om.valueToTree(this.getRevisionHistoryLimit()));
            }
            if (this.getUpdateStrategy() != null) {
                data.set("updateStrategy", om.valueToTree(this.getUpdateStrategy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DaemonSetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DaemonSetSpec.Jsii$Proxy that = (DaemonSetSpec.Jsii$Proxy) o;

            if (!selector.equals(that.selector)) return false;
            if (!template.equals(that.template)) return false;
            if (this.minReadySeconds != null ? !this.minReadySeconds.equals(that.minReadySeconds) : that.minReadySeconds != null) return false;
            if (this.revisionHistoryLimit != null ? !this.revisionHistoryLimit.equals(that.revisionHistoryLimit) : that.revisionHistoryLimit != null) return false;
            return this.updateStrategy != null ? this.updateStrategy.equals(that.updateStrategy) : that.updateStrategy == null;
        }

        @Override
        public int hashCode() {
            int result = this.selector.hashCode();
            result = 31 * result + (this.template.hashCode());
            result = 31 * result + (this.minReadySeconds != null ? this.minReadySeconds.hashCode() : 0);
            result = 31 * result + (this.revisionHistoryLimit != null ? this.revisionHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.updateStrategy != null ? this.updateStrategy.hashCode() : 0);
            return result;
        }
    }
}
