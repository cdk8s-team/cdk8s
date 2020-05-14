package k8s;

/**
 * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.463Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ValidatingWebhook")
@software.amazon.jsii.Jsii.Proxy(ValidatingWebhook.Jsii$Proxy.class)
public interface ValidatingWebhook extends software.amazon.jsii.JsiiSerializable {

    /**
     * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects.
     * <p>
     * API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAdmissionReviewVersions();

    /**
     * ClientConfig defines how to communicate with the hook.
     * <p>
     * Required
     */
    @org.jetbrains.annotations.NotNull k8s.WebhookClientConfig getClientConfig();

    /**
     * The name of the admission webhook.
     * <p>
     * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * SideEffects states whether this webhook has side effects.
     * <p>
     * Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSideEffects();

    /**
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail.
     * <p>
     * Defaults to Fail.
     * <p>
     * Default: Fail.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFailurePolicy() {
        return null;
    }

    /**
     * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
     * <p>
     * <ul>
     * <li>Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.</li>
     * <li>Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.</li>
     * </ul>
     * <p>
     * Defaults to "Equivalent"
     * <p>
     * Default: Equivalent"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMatchPolicy() {
        return null;
    }

    /**
     * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector.
     * <p>
     * If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
     * <p>
     * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
     * "matchExpressions": [
     * {
     * "key": "runlevel",
     * "operator": "NotIn",
     * "values": [
     * "0",
     * "1"
     * ]
     * }
     * ]
     * }
     * <p>
     * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
     * "matchExpressions": [
     * {
     * "key": "environment",
     * "operator": "In",
     * "values": [
     * "prod",
     * "staging"
     * ]
     * }
     * ]
     * }
     * <p>
     * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more examples of label selectors.
     * <p>
     * Default to the empty LabelSelector, which matches everything.
     * <p>
     * Default: the empty LabelSelector, which matches everything.
     */
    default @org.jetbrains.annotations.Nullable k8s.LabelSelector getNamespaceSelector() {
        return null;
    }

    /**
     * ObjectSelector decides whether to run the webhook based on if the object has matching labels.
     * <p>
     * objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * <p>
     * Default: the empty LabelSelector, which matches everything.
     */
    default @org.jetbrains.annotations.Nullable k8s.LabelSelector getObjectSelector() {
        return null;
    }

    /**
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * <p>
     * The webhook cares about an operation if it matches <em>any</em> Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.RuleWithOperations> getRules() {
        return null;
    }

    /**
     * TimeoutSeconds specifies the timeout for this webhook.
     * <p>
     * After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
     * <p>
     * Default: 10 seconds.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ValidatingWebhook}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ValidatingWebhook}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> admissionReviewVersions;
        private k8s.WebhookClientConfig clientConfig;
        private java.lang.String name;
        private java.lang.String sideEffects;
        private java.lang.String failurePolicy;
        private java.lang.String matchPolicy;
        private k8s.LabelSelector namespaceSelector;
        private k8s.LabelSelector objectSelector;
        private java.util.List<k8s.RuleWithOperations> rules;
        private java.lang.Number timeoutSeconds;

        /**
         * Sets the value of {@link ValidatingWebhook#getAdmissionReviewVersions}
         * @param admissionReviewVersions AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. This parameter is required.
         *                                API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
         * @return {@code this}
         */
        public Builder admissionReviewVersions(java.util.List<java.lang.String> admissionReviewVersions) {
            this.admissionReviewVersions = admissionReviewVersions;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhook#getClientConfig}
         * @param clientConfig ClientConfig defines how to communicate with the hook. This parameter is required.
         *                     Required
         * @return {@code this}
         */
        public Builder clientConfig(k8s.WebhookClientConfig clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhook#getName}
         * @param name The name of the admission webhook. This parameter is required.
         *             Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhook#getSideEffects}
         * @param sideEffects SideEffects states whether this webhook has side effects. This parameter is required.
         *                    Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.
         * @return {@code this}
         */
        public Builder sideEffects(java.lang.String sideEffects) {
            this.sideEffects = sideEffects;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhook#getFailurePolicy}
         * @param failurePolicy FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail.
         *                      Defaults to Fail.
         * @return {@code this}
         */
        public Builder failurePolicy(java.lang.String failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhook#getMatchPolicy}
         * @param matchPolicy matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
         *                    <ul>
         *                    <li>Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.</li>
         *                    <li>Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.</li>
         *                    </ul>
         *                    <p>
         *                    Defaults to "Equivalent"
         * @return {@code this}
         */
        public Builder matchPolicy(java.lang.String matchPolicy) {
            this.matchPolicy = matchPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhook#getNamespaceSelector}
         * @param namespaceSelector NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector.
         *                          If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
         *                          <p>
         *                          For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
         *                          "matchExpressions": [
         *                          {
         *                          "key": "runlevel",
         *                          "operator": "NotIn",
         *                          "values": [
         *                          "0",
         *                          "1"
         *                          ]
         *                          }
         *                          ]
         *                          }
         *                          <p>
         *                          If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
         *                          "matchExpressions": [
         *                          {
         *                          "key": "environment",
         *                          "operator": "In",
         *                          "values": [
         *                          "prod",
         *                          "staging"
         *                          ]
         *                          }
         *                          ]
         *                          }
         *                          <p>
         *                          See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more examples of label selectors.
         *                          <p>
         *                          Default to the empty LabelSelector, which matches everything.
         * @return {@code this}
         */
        public Builder namespaceSelector(k8s.LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhook#getObjectSelector}
         * @param objectSelector ObjectSelector decides whether to run the webhook based on if the object has matching labels.
         *                       objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
         * @return {@code this}
         */
        public Builder objectSelector(k8s.LabelSelector objectSelector) {
            this.objectSelector = objectSelector;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhook#getRules}
         * @param rules Rules describes what operations on what resources/subresources the webhook cares about.
         *              The webhook cares about an operation if it matches <em>any</em> Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
         * @return {@code this}
         */
        public Builder rules(java.util.List<k8s.RuleWithOperations> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhook#getTimeoutSeconds}
         * @param timeoutSeconds TimeoutSeconds specifies the timeout for this webhook.
         *                       After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
         * @return {@code this}
         */
        public Builder timeoutSeconds(java.lang.Number timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ValidatingWebhook}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ValidatingWebhook build() {
            return new Jsii$Proxy(admissionReviewVersions, clientConfig, name, sideEffects, failurePolicy, matchPolicy, namespaceSelector, objectSelector, rules, timeoutSeconds);
        }
    }

    /**
     * An implementation for {@link ValidatingWebhook}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ValidatingWebhook {
        private final java.util.List<java.lang.String> admissionReviewVersions;
        private final k8s.WebhookClientConfig clientConfig;
        private final java.lang.String name;
        private final java.lang.String sideEffects;
        private final java.lang.String failurePolicy;
        private final java.lang.String matchPolicy;
        private final k8s.LabelSelector namespaceSelector;
        private final k8s.LabelSelector objectSelector;
        private final java.util.List<k8s.RuleWithOperations> rules;
        private final java.lang.Number timeoutSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.admissionReviewVersions = this.jsiiGet("admissionReviewVersions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.clientConfig = this.jsiiGet("clientConfig", k8s.WebhookClientConfig.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.sideEffects = this.jsiiGet("sideEffects", java.lang.String.class);
            this.failurePolicy = this.jsiiGet("failurePolicy", java.lang.String.class);
            this.matchPolicy = this.jsiiGet("matchPolicy", java.lang.String.class);
            this.namespaceSelector = this.jsiiGet("namespaceSelector", k8s.LabelSelector.class);
            this.objectSelector = this.jsiiGet("objectSelector", k8s.LabelSelector.class);
            this.rules = this.jsiiGet("rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.RuleWithOperations.class)));
            this.timeoutSeconds = this.jsiiGet("timeoutSeconds", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> admissionReviewVersions, final k8s.WebhookClientConfig clientConfig, final java.lang.String name, final java.lang.String sideEffects, final java.lang.String failurePolicy, final java.lang.String matchPolicy, final k8s.LabelSelector namespaceSelector, final k8s.LabelSelector objectSelector, final java.util.List<k8s.RuleWithOperations> rules, final java.lang.Number timeoutSeconds) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.admissionReviewVersions = java.util.Objects.requireNonNull(admissionReviewVersions, "admissionReviewVersions is required");
            this.clientConfig = java.util.Objects.requireNonNull(clientConfig, "clientConfig is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.sideEffects = java.util.Objects.requireNonNull(sideEffects, "sideEffects is required");
            this.failurePolicy = failurePolicy;
            this.matchPolicy = matchPolicy;
            this.namespaceSelector = namespaceSelector;
            this.objectSelector = objectSelector;
            this.rules = rules;
            this.timeoutSeconds = timeoutSeconds;
        }

        @Override
        public java.util.List<java.lang.String> getAdmissionReviewVersions() {
            return this.admissionReviewVersions;
        }

        @Override
        public k8s.WebhookClientConfig getClientConfig() {
            return this.clientConfig;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getSideEffects() {
            return this.sideEffects;
        }

        @Override
        public java.lang.String getFailurePolicy() {
            return this.failurePolicy;
        }

        @Override
        public java.lang.String getMatchPolicy() {
            return this.matchPolicy;
        }

        @Override
        public k8s.LabelSelector getNamespaceSelector() {
            return this.namespaceSelector;
        }

        @Override
        public k8s.LabelSelector getObjectSelector() {
            return this.objectSelector;
        }

        @Override
        public java.util.List<k8s.RuleWithOperations> getRules() {
            return this.rules;
        }

        @Override
        public java.lang.Number getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("admissionReviewVersions", om.valueToTree(this.getAdmissionReviewVersions()));
            data.set("clientConfig", om.valueToTree(this.getClientConfig()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("sideEffects", om.valueToTree(this.getSideEffects()));
            if (this.getFailurePolicy() != null) {
                data.set("failurePolicy", om.valueToTree(this.getFailurePolicy()));
            }
            if (this.getMatchPolicy() != null) {
                data.set("matchPolicy", om.valueToTree(this.getMatchPolicy()));
            }
            if (this.getNamespaceSelector() != null) {
                data.set("namespaceSelector", om.valueToTree(this.getNamespaceSelector()));
            }
            if (this.getObjectSelector() != null) {
                data.set("objectSelector", om.valueToTree(this.getObjectSelector()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }
            if (this.getTimeoutSeconds() != null) {
                data.set("timeoutSeconds", om.valueToTree(this.getTimeoutSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ValidatingWebhook"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ValidatingWebhook.Jsii$Proxy that = (ValidatingWebhook.Jsii$Proxy) o;

            if (!admissionReviewVersions.equals(that.admissionReviewVersions)) return false;
            if (!clientConfig.equals(that.clientConfig)) return false;
            if (!name.equals(that.name)) return false;
            if (!sideEffects.equals(that.sideEffects)) return false;
            if (this.failurePolicy != null ? !this.failurePolicy.equals(that.failurePolicy) : that.failurePolicy != null) return false;
            if (this.matchPolicy != null ? !this.matchPolicy.equals(that.matchPolicy) : that.matchPolicy != null) return false;
            if (this.namespaceSelector != null ? !this.namespaceSelector.equals(that.namespaceSelector) : that.namespaceSelector != null) return false;
            if (this.objectSelector != null ? !this.objectSelector.equals(that.objectSelector) : that.objectSelector != null) return false;
            if (this.rules != null ? !this.rules.equals(that.rules) : that.rules != null) return false;
            return this.timeoutSeconds != null ? this.timeoutSeconds.equals(that.timeoutSeconds) : that.timeoutSeconds == null;
        }

        @Override
        public int hashCode() {
            int result = this.admissionReviewVersions.hashCode();
            result = 31 * result + (this.clientConfig.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.sideEffects.hashCode());
            result = 31 * result + (this.failurePolicy != null ? this.failurePolicy.hashCode() : 0);
            result = 31 * result + (this.matchPolicy != null ? this.matchPolicy.hashCode() : 0);
            result = 31 * result + (this.namespaceSelector != null ? this.namespaceSelector.hashCode() : 0);
            result = 31 * result + (this.objectSelector != null ? this.objectSelector.hashCode() : 0);
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            result = 31 * result + (this.timeoutSeconds != null ? this.timeoutSeconds.hashCode() : 0);
            return result;
        }
    }
}
