package k8s;

/**
 * Status is a return value for calls that don't return other objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.438Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Status")
public class Status extends org.cdk8s.ApiObject {

    protected Status(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Status(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.apimachinery.pkg.apis.meta.v1.Status" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public Status(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable k8s.StatusOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.apimachinery.pkg.apis.meta.v1.Status" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public Status(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link k8s.Status}.
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
        private k8s.StatusOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * Suggested HTTP return code for this status, 0 if not set.
         * <p>
         * @return {@code this}
         * @param code Suggested HTTP return code for this status, 0 if not set. This parameter is required.
         */
        public Builder code(final java.lang.Number code) {
            this.options().code(code);
            return this;
        }

        /**
         * Extended data associated with the reason.
         * <p>
         * Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
         * <p>
         * @return {@code this}
         * @param details Extended data associated with the reason. This parameter is required.
         */
        public Builder details(final k8s.StatusDetails details) {
            this.options().details(details);
            return this;
        }

        /**
         * A human-readable description of the status of this operation.
         * <p>
         * @return {@code this}
         * @param message A human-readable description of the status of this operation. This parameter is required.
         */
        public Builder message(final java.lang.String message) {
            this.options().message(message);
            return this;
        }

        /**
         * Standard list metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * <p>
         * @return {@code this}
         * @param metadata Standard list metadata. This parameter is required.
         */
        public Builder metadata(final k8s.ListMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * A machine-readable description of why this operation is in the "Failure" status.
         * <p>
         * If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
         * <p>
         * @return {@code this}
         * @param reason A machine-readable description of why this operation is in the "Failure" status. This parameter is required.
         */
        public Builder reason(final java.lang.String reason) {
            this.options().reason(reason);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.Status}.
         */
        public k8s.Status build() {
            return new k8s.Status(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private k8s.StatusOptions.Builder options() {
            if (this.options == null) {
                this.options = new k8s.StatusOptions.Builder();
            }
            return this.options;
        }
    }
}
