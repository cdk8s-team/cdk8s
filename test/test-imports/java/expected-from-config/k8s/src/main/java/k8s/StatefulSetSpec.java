package k8s;

/**
 * A StatefulSetSpec is the specification of a StatefulSet.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.437Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.StatefulSetSpec")
@software.amazon.jsii.Jsii.Proxy(StatefulSetSpec.Jsii$Proxy.class)
public interface StatefulSetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * selector is a label query over pods that should match the replica count.
     * <p>
     * It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     */
    @org.jetbrains.annotations.NotNull k8s.LabelSelector getSelector();

    /**
     * serviceName is the name of the service that governs this StatefulSet.
     * <p>
     * This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getServiceName();

    /**
     * template is the object that describes the pod that will be created if insufficient replicas are detected.
     * <p>
     * Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
     */
    @org.jetbrains.annotations.NotNull k8s.PodTemplateSpec getTemplate();

    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down.
     * <p>
     * The default policy is <code>OrderedReady</code>, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is <code>Parallel</code> which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPodManagementPolicy() {
        return null;
    }

    /**
     * replicas is the desired number of replicas of the given Template.
     * <p>
     * These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history.
     * <p>
     * The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRevisionHistoryLimit() {
        return null;
    }

    /**
     * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     */
    default @org.jetbrains.annotations.Nullable k8s.StatefulSetUpdateStrategy getUpdateStrategy() {
        return null;
    }

    /**
     * volumeClaimTemplates is a list of claims that pods are allowed to reference.
     * <p>
     * The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.PersistentVolumeClaim> getVolumeClaimTemplates() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetSpec}
     */
    public static final class Builder {
        private k8s.LabelSelector selector;
        private java.lang.String serviceName;
        private k8s.PodTemplateSpec template;
        private java.lang.String podManagementPolicy;
        private java.lang.Number replicas;
        private java.lang.Number revisionHistoryLimit;
        private k8s.StatefulSetUpdateStrategy updateStrategy;
        private java.util.List<k8s.PersistentVolumeClaim> volumeClaimTemplates;

        /**
         * Sets the value of {@link StatefulSetSpec#getSelector}
         * @param selector selector is a label query over pods that should match the replica count. This parameter is required.
         *                 It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * @return {@code this}
         */
        public Builder selector(k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getServiceName}
         * @param serviceName serviceName is the name of the service that governs this StatefulSet. This parameter is required.
         *                    This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
         * @return {@code this}
         */
        public Builder serviceName(java.lang.String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getTemplate}
         * @param template template is the object that describes the pod that will be created if insufficient replicas are detected. This parameter is required.
         *                 Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
         * @return {@code this}
         */
        public Builder template(k8s.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getPodManagementPolicy}
         * @param podManagementPolicy podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down.
         *                            The default policy is <code>OrderedReady</code>, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is <code>Parallel</code> which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
         * @return {@code this}
         */
        public Builder podManagementPolicy(java.lang.String podManagementPolicy) {
            this.podManagementPolicy = podManagementPolicy;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getReplicas}
         * @param replicas replicas is the desired number of replicas of the given Template.
         *                 These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getRevisionHistoryLimit}
         * @param revisionHistoryLimit revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history.
         *                             The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
         * @return {@code this}
         */
        public Builder revisionHistoryLimit(java.lang.Number revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getUpdateStrategy}
         * @param updateStrategy updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
         * @return {@code this}
         */
        public Builder updateStrategy(k8s.StatefulSetUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetSpec#getVolumeClaimTemplates}
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference.
         *                             The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * @return {@code this}
         */
        public Builder volumeClaimTemplates(java.util.List<k8s.PersistentVolumeClaim> volumeClaimTemplates) {
            this.volumeClaimTemplates = volumeClaimTemplates;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public StatefulSetSpec build() {
            return new Jsii$Proxy(selector, serviceName, template, podManagementPolicy, replicas, revisionHistoryLimit, updateStrategy, volumeClaimTemplates);
        }
    }

    /**
     * An implementation for {@link StatefulSetSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetSpec {
        private final k8s.LabelSelector selector;
        private final java.lang.String serviceName;
        private final k8s.PodTemplateSpec template;
        private final java.lang.String podManagementPolicy;
        private final java.lang.Number replicas;
        private final java.lang.Number revisionHistoryLimit;
        private final k8s.StatefulSetUpdateStrategy updateStrategy;
        private final java.util.List<k8s.PersistentVolumeClaim> volumeClaimTemplates;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selector = this.jsiiGet("selector", k8s.LabelSelector.class);
            this.serviceName = this.jsiiGet("serviceName", java.lang.String.class);
            this.template = this.jsiiGet("template", k8s.PodTemplateSpec.class);
            this.podManagementPolicy = this.jsiiGet("podManagementPolicy", java.lang.String.class);
            this.replicas = this.jsiiGet("replicas", java.lang.Number.class);
            this.revisionHistoryLimit = this.jsiiGet("revisionHistoryLimit", java.lang.Number.class);
            this.updateStrategy = this.jsiiGet("updateStrategy", k8s.StatefulSetUpdateStrategy.class);
            this.volumeClaimTemplates = this.jsiiGet("volumeClaimTemplates", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.PersistentVolumeClaim.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.LabelSelector selector, final java.lang.String serviceName, final k8s.PodTemplateSpec template, final java.lang.String podManagementPolicy, final java.lang.Number replicas, final java.lang.Number revisionHistoryLimit, final k8s.StatefulSetUpdateStrategy updateStrategy, final java.util.List<k8s.PersistentVolumeClaim> volumeClaimTemplates) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selector = java.util.Objects.requireNonNull(selector, "selector is required");
            this.serviceName = java.util.Objects.requireNonNull(serviceName, "serviceName is required");
            this.template = java.util.Objects.requireNonNull(template, "template is required");
            this.podManagementPolicy = podManagementPolicy;
            this.replicas = replicas;
            this.revisionHistoryLimit = revisionHistoryLimit;
            this.updateStrategy = updateStrategy;
            this.volumeClaimTemplates = volumeClaimTemplates;
        }

        @Override
        public k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public java.lang.String getServiceName() {
            return this.serviceName;
        }

        @Override
        public k8s.PodTemplateSpec getTemplate() {
            return this.template;
        }

        @Override
        public java.lang.String getPodManagementPolicy() {
            return this.podManagementPolicy;
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
        public k8s.StatefulSetUpdateStrategy getUpdateStrategy() {
            return this.updateStrategy;
        }

        @Override
        public java.util.List<k8s.PersistentVolumeClaim> getVolumeClaimTemplates() {
            return this.volumeClaimTemplates;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("selector", om.valueToTree(this.getSelector()));
            data.set("serviceName", om.valueToTree(this.getServiceName()));
            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getPodManagementPolicy() != null) {
                data.set("podManagementPolicy", om.valueToTree(this.getPodManagementPolicy()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }
            if (this.getRevisionHistoryLimit() != null) {
                data.set("revisionHistoryLimit", om.valueToTree(this.getRevisionHistoryLimit()));
            }
            if (this.getUpdateStrategy() != null) {
                data.set("updateStrategy", om.valueToTree(this.getUpdateStrategy()));
            }
            if (this.getVolumeClaimTemplates() != null) {
                data.set("volumeClaimTemplates", om.valueToTree(this.getVolumeClaimTemplates()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StatefulSetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetSpec.Jsii$Proxy that = (StatefulSetSpec.Jsii$Proxy) o;

            if (!selector.equals(that.selector)) return false;
            if (!serviceName.equals(that.serviceName)) return false;
            if (!template.equals(that.template)) return false;
            if (this.podManagementPolicy != null ? !this.podManagementPolicy.equals(that.podManagementPolicy) : that.podManagementPolicy != null) return false;
            if (this.replicas != null ? !this.replicas.equals(that.replicas) : that.replicas != null) return false;
            if (this.revisionHistoryLimit != null ? !this.revisionHistoryLimit.equals(that.revisionHistoryLimit) : that.revisionHistoryLimit != null) return false;
            if (this.updateStrategy != null ? !this.updateStrategy.equals(that.updateStrategy) : that.updateStrategy != null) return false;
            return this.volumeClaimTemplates != null ? this.volumeClaimTemplates.equals(that.volumeClaimTemplates) : that.volumeClaimTemplates == null;
        }

        @Override
        public int hashCode() {
            int result = this.selector.hashCode();
            result = 31 * result + (this.serviceName.hashCode());
            result = 31 * result + (this.template.hashCode());
            result = 31 * result + (this.podManagementPolicy != null ? this.podManagementPolicy.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            result = 31 * result + (this.revisionHistoryLimit != null ? this.revisionHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.updateStrategy != null ? this.updateStrategy.hashCode() : 0);
            result = 31 * result + (this.volumeClaimTemplates != null ? this.volumeClaimTemplates.hashCode() : 0);
            return result;
        }
    }
}
