package k8s;

/**
 * ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.465Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ValidatingWebhookConfiguration")
public class ValidatingWebhookConfiguration extends org.cdk8s.ApiObject {

    protected ValidatingWebhookConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ValidatingWebhookConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public ValidatingWebhookConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable k8s.ValidatingWebhookConfigurationOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public ValidatingWebhookConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link k8s.ValidatingWebhookConfiguration}.
     */
    public static final class Builder {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private k8s.ValidatingWebhookConfigurationOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * Standard object metadata;
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object metadata;. This parameter is required.
         */
        public Builder metadata(final k8s.ObjectMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * Webhooks is a list of webhooks and the affected resources and operations.
         * <p>
         * @return {@code this}
         * @param webhooks Webhooks is a list of webhooks and the affected resources and operations. This parameter is required.
         */
        public Builder webhooks(final java.util.List<k8s.ValidatingWebhook> webhooks) {
            this.options().webhooks(webhooks);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.ValidatingWebhookConfiguration}.
         */
        public k8s.ValidatingWebhookConfiguration build() {
            return new k8s.ValidatingWebhookConfiguration(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private k8s.ValidatingWebhookConfigurationOptions.Builder options() {
            if (this.options == null) {
                this.options = new k8s.ValidatingWebhookConfigurationOptions.Builder();
            }
            return this.options;
        }
    }
}
