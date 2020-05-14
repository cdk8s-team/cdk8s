package k8s;

/**
 * Eviction evicts a pod from its node subject to certain policies and safety constraints.
 * <p>
 * This is a subresource of Pod.  A request to cause such an eviction is created by POSTing to .../pods/<pod name>/evictions.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.218Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Eviction")
public class Eviction extends org.cdk8s.ApiObject {

    protected Eviction(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Eviction(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.policy.v1beta1.Eviction" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public Eviction(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable k8s.EvictionOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.policy.v1beta1.Eviction" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public Eviction(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link k8s.Eviction}.
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
        private k8s.EvictionOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * DeleteOptions may be provided.
         * <p>
         * @return {@code this}
         * @param deleteOptions DeleteOptions may be provided. This parameter is required.
         */
        public Builder deleteOptions(final k8s.DeleteOptions deleteOptions) {
            this.options().deleteOptions(deleteOptions);
            return this;
        }

        /**
         * ObjectMeta describes the pod that is being evicted.
         * <p>
         * @return {@code this}
         * @param metadata ObjectMeta describes the pod that is being evicted. This parameter is required.
         */
        public Builder metadata(final k8s.ObjectMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.Eviction}.
         */
        public k8s.Eviction build() {
            return new k8s.Eviction(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private k8s.EvictionOptions.Builder options() {
            if (this.options == null) {
                this.options = new k8s.EvictionOptions.Builder();
            }
            return this.options;
        }
    }
}
