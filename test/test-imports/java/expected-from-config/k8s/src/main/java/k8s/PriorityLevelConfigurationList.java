package k8s;

/**
 * PriorityLevelConfigurationList is a list of PriorityLevelConfiguration objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.379Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PriorityLevelConfigurationList")
public class PriorityLevelConfigurationList extends org.cdk8s.ApiObject {

    protected PriorityLevelConfigurationList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PriorityLevelConfigurationList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.flowcontrol.v1alpha1.PriorityLevelConfigurationList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public PriorityLevelConfigurationList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.PriorityLevelConfigurationListOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.PriorityLevelConfigurationList}.
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
        private final k8s.PriorityLevelConfigurationListOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.PriorityLevelConfigurationListOptions.Builder();
        }

        /**
         * `items` is a list of request-priorities.
         * <p>
         * @return {@code this}
         * @param items `items` is a list of request-priorities. This parameter is required.
         */
        public Builder items(final java.util.List<k8s.PriorityLevelConfiguration> items) {
            this.options.items(items);
            return this;
        }

        /**
         * `metadata` is the standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata `metadata` is the standard object's metadata. This parameter is required.
         */
        public Builder metadata(final k8s.ListMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.PriorityLevelConfigurationList}.
         */
        public k8s.PriorityLevelConfigurationList build() {
            return new k8s.PriorityLevelConfigurationList(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
