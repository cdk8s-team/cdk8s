package k8s;

/**
 * RoleBindingList is a collection of RoleBindings.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.394Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.RoleBindingList")
public class RoleBindingList extends org.cdk8s.ApiObject {

    protected RoleBindingList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RoleBindingList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.rbac.v1.RoleBindingList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public RoleBindingList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.RoleBindingListOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.RoleBindingList}.
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
        private final k8s.RoleBindingListOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.RoleBindingListOptions.Builder();
        }

        /**
         * Items is a list of RoleBindings.
         * <p>
         * @return {@code this}
         * @param items Items is a list of RoleBindings. This parameter is required.
         */
        public Builder items(final java.util.List<k8s.RoleBinding> items) {
            this.options.items(items);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final k8s.ListMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.RoleBindingList}.
         */
        public k8s.RoleBindingList build() {
            return new k8s.RoleBindingList(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
