package k8s;

/**
 * configuration of a horizontal pod autoscaler.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.235Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.HorizontalPodAutoscaler")
public class HorizontalPodAutoscaler extends org.cdk8s.ApiObject {

    protected HorizontalPodAutoscaler(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected HorizontalPodAutoscaler(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.autoscaling.v1.HorizontalPodAutoscaler" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public HorizontalPodAutoscaler(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable k8s.HorizontalPodAutoscalerOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.autoscaling.v1.HorizontalPodAutoscaler" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public HorizontalPodAutoscaler(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link k8s.HorizontalPodAutoscaler}.
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
        private k8s.HorizontalPodAutoscalerOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * Standard object metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object metadata. This parameter is required.
         */
        public Builder metadata(final k8s.ObjectMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * behaviour of autoscaler.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
         * <p>
         * @return {@code this}
         * @param spec behaviour of autoscaler. This parameter is required.
         */
        public Builder spec(final k8s.HorizontalPodAutoscalerSpec spec) {
            this.options().spec(spec);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.HorizontalPodAutoscaler}.
         */
        public k8s.HorizontalPodAutoscaler build() {
            return new k8s.HorizontalPodAutoscaler(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private k8s.HorizontalPodAutoscalerOptions.Builder options() {
            if (this.options == null) {
                this.options = new k8s.HorizontalPodAutoscalerOptions.Builder();
            }
            return this.options;
        }
    }
}
