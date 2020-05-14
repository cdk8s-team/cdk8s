package k8s;

/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.180Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.DeploymentSpec")
@software.amazon.jsii.Jsii.Proxy(DeploymentSpec.Jsii$Proxy.class)
public interface DeploymentSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Label selector for pods.
     * <p>
     * Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.
     */
    @org.jetbrains.annotations.NotNull k8s.LabelSelector getSelector();

    /**
     * Template describes the pods that will be created.
     */
    @org.jetbrains.annotations.NotNull k8s.PodTemplateSpec getTemplate();

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
     * Indicates that the deployment is paused.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPaused() {
        return null;
    }

    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed.
     * <p>
     * The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * <p>
     * Default: 600s.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getProgressDeadlineSeconds() {
        return null;
    }

    /**
     * Number of desired pods.
     * <p>
     * This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * <p>
     * Default: 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * The number of old ReplicaSets to retain to allow rollback.
     * <p>
     * This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * <p>
     * Default: 10.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimit() {
        return null;
    }

    /**
     * The deployment strategy to use to replace existing pods with new ones.
     */
    default @org.jetbrains.annotations.Nullable k8s.DeploymentStrategy getStrategy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentSpec}
     */
    public static final class Builder {
        private k8s.LabelSelector selector;
        private k8s.PodTemplateSpec template;
        private java.lang.Number minReadySeconds;
        private java.lang.Boolean paused;
        private java.lang.Number progressDeadlineSeconds;
        private java.lang.Number replicas;
        private java.lang.Number revisionHistoryLimit;
        private k8s.DeploymentStrategy strategy;

        /**
         * Sets the value of {@link DeploymentSpec#getSelector}
         * @param selector Label selector for pods. This parameter is required.
         *                 Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.
         * @return {@code this}
         */
        public Builder selector(k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpec#getTemplate}
         * @param template Template describes the pods that will be created. This parameter is required.
         * @return {@code this}
         */
        public Builder template(k8s.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpec#getMinReadySeconds}
         * @param minReadySeconds Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
         *                        Defaults to 0 (pod will be considered available as soon as it is ready)
         * @return {@code this}
         */
        public Builder minReadySeconds(java.lang.Number minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpec#getPaused}
         * @param paused Indicates that the deployment is paused.
         * @return {@code this}
         */
        public Builder paused(java.lang.Boolean paused) {
            this.paused = paused;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpec#getProgressDeadlineSeconds}
         * @param progressDeadlineSeconds The maximum time in seconds for a deployment to make progress before it is considered to be failed.
         *                                The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
         * @return {@code this}
         */
        public Builder progressDeadlineSeconds(java.lang.Number progressDeadlineSeconds) {
            this.progressDeadlineSeconds = progressDeadlineSeconds;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpec#getReplicas}
         * @param replicas Number of desired pods.
         *                 This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpec#getRevisionHistoryLimit}
         * @param revisionHistoryLimit The number of old ReplicaSets to retain to allow rollback.
         *                             This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
         * @return {@code this}
         */
        public Builder revisionHistoryLimit(java.lang.Number revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentSpec#getStrategy}
         * @param strategy The deployment strategy to use to replace existing pods with new ones.
         * @return {@code this}
         */
        public Builder strategy(k8s.DeploymentStrategy strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public DeploymentSpec build() {
            return new Jsii$Proxy(selector, template, minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, strategy);
        }
    }

    /**
     * An implementation for {@link DeploymentSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentSpec {
        private final k8s.LabelSelector selector;
        private final k8s.PodTemplateSpec template;
        private final java.lang.Number minReadySeconds;
        private final java.lang.Boolean paused;
        private final java.lang.Number progressDeadlineSeconds;
        private final java.lang.Number replicas;
        private final java.lang.Number revisionHistoryLimit;
        private final k8s.DeploymentStrategy strategy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selector = this.jsiiGet("selector", k8s.LabelSelector.class);
            this.template = this.jsiiGet("template", k8s.PodTemplateSpec.class);
            this.minReadySeconds = this.jsiiGet("minReadySeconds", java.lang.Number.class);
            this.paused = this.jsiiGet("paused", java.lang.Boolean.class);
            this.progressDeadlineSeconds = this.jsiiGet("progressDeadlineSeconds", java.lang.Number.class);
            this.replicas = this.jsiiGet("replicas", java.lang.Number.class);
            this.revisionHistoryLimit = this.jsiiGet("revisionHistoryLimit", java.lang.Number.class);
            this.strategy = this.jsiiGet("strategy", k8s.DeploymentStrategy.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.LabelSelector selector, final k8s.PodTemplateSpec template, final java.lang.Number minReadySeconds, final java.lang.Boolean paused, final java.lang.Number progressDeadlineSeconds, final java.lang.Number replicas, final java.lang.Number revisionHistoryLimit, final k8s.DeploymentStrategy strategy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selector = java.util.Objects.requireNonNull(selector, "selector is required");
            this.template = java.util.Objects.requireNonNull(template, "template is required");
            this.minReadySeconds = minReadySeconds;
            this.paused = paused;
            this.progressDeadlineSeconds = progressDeadlineSeconds;
            this.replicas = replicas;
            this.revisionHistoryLimit = revisionHistoryLimit;
            this.strategy = strategy;
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
        public java.lang.Boolean getPaused() {
            return this.paused;
        }

        @Override
        public java.lang.Number getProgressDeadlineSeconds() {
            return this.progressDeadlineSeconds;
        }

        @Override
        public java.lang.Number getReplicas() {
            return this.replicas;
        }

        @Override
        public java.lang.Number getRevisionHistoryLimit() {
            return this.revisionHistoryLimit;
        }

        @Override
        public k8s.DeploymentStrategy getStrategy() {
            return this.strategy;
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
            if (this.getPaused() != null) {
                data.set("paused", om.valueToTree(this.getPaused()));
            }
            if (this.getProgressDeadlineSeconds() != null) {
                data.set("progressDeadlineSeconds", om.valueToTree(this.getProgressDeadlineSeconds()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }
            if (this.getRevisionHistoryLimit() != null) {
                data.set("revisionHistoryLimit", om.valueToTree(this.getRevisionHistoryLimit()));
            }
            if (this.getStrategy() != null) {
                data.set("strategy", om.valueToTree(this.getStrategy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeploymentSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentSpec.Jsii$Proxy that = (DeploymentSpec.Jsii$Proxy) o;

            if (!selector.equals(that.selector)) return false;
            if (!template.equals(that.template)) return false;
            if (this.minReadySeconds != null ? !this.minReadySeconds.equals(that.minReadySeconds) : that.minReadySeconds != null) return false;
            if (this.paused != null ? !this.paused.equals(that.paused) : that.paused != null) return false;
            if (this.progressDeadlineSeconds != null ? !this.progressDeadlineSeconds.equals(that.progressDeadlineSeconds) : that.progressDeadlineSeconds != null) return false;
            if (this.replicas != null ? !this.replicas.equals(that.replicas) : that.replicas != null) return false;
            if (this.revisionHistoryLimit != null ? !this.revisionHistoryLimit.equals(that.revisionHistoryLimit) : that.revisionHistoryLimit != null) return false;
            return this.strategy != null ? this.strategy.equals(that.strategy) : that.strategy == null;
        }

        @Override
        public int hashCode() {
            int result = this.selector.hashCode();
            result = 31 * result + (this.template.hashCode());
            result = 31 * result + (this.minReadySeconds != null ? this.minReadySeconds.hashCode() : 0);
            result = 31 * result + (this.paused != null ? this.paused.hashCode() : 0);
            result = 31 * result + (this.progressDeadlineSeconds != null ? this.progressDeadlineSeconds.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            result = 31 * result + (this.revisionHistoryLimit != null ? this.revisionHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.strategy != null ? this.strategy.hashCode() : 0);
            return result;
        }
    }
}
