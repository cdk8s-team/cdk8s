package k8s;

/**
 * ClusterRoleBinding references a ClusterRole, but not contain it.
 * <p>
 * It can reference a ClusterRole in the global namespace, and adds who information via Subject.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.121Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ClusterRoleBinding")
public class ClusterRoleBinding extends org.cdk8s.ApiObject {

    protected ClusterRoleBinding(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ClusterRoleBinding(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.rbac.v1.ClusterRoleBinding" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public ClusterRoleBinding(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.ClusterRoleBindingOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.ClusterRoleBinding}.
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
        private final k8s.ClusterRoleBindingOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.ClusterRoleBindingOptions.Builder();
        }

        /**
         * RoleRef can only reference a ClusterRole in the global namespace.
         * <p>
         * If the RoleRef cannot be resolved, the Authorizer must return an error.
         * <p>
         * @return {@code this}
         * @param roleRef RoleRef can only reference a ClusterRole in the global namespace. This parameter is required.
         */
        public Builder roleRef(final k8s.RoleRef roleRef) {
            this.options.roleRef(roleRef);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final k8s.ObjectMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * Subjects holds references to the objects the role applies to.
         * <p>
         * @return {@code this}
         * @param subjects Subjects holds references to the objects the role applies to. This parameter is required.
         */
        public Builder subjects(final java.util.List<k8s.Subject> subjects) {
            this.options.subjects(subjects);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.ClusterRoleBinding}.
         */
        public k8s.ClusterRoleBinding build() {
            return new k8s.ClusterRoleBinding(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
