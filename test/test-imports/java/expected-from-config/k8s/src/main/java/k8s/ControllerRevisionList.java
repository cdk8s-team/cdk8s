package k8s;

/**
 * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.150Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ControllerRevisionList")
public class ControllerRevisionList extends org.cdk8s.ApiObject {

    protected ControllerRevisionList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ControllerRevisionList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.apps.v1.ControllerRevisionList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public ControllerRevisionList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.ControllerRevisionListOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.ControllerRevisionList}.
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
        private final k8s.ControllerRevisionListOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.ControllerRevisionListOptions.Builder();
        }

        /**
         * Items is the list of ControllerRevisions.
         * <p>
         * @return {@code this}
         * @param items Items is the list of ControllerRevisions. This parameter is required.
         */
        public Builder items(final java.util.List<k8s.ControllerRevision> items) {
            this.options.items(items);
            return this;
        }

        /**
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
         * <p>
         * @return {@code this}
         * @param metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. This parameter is required.
         */
        public Builder metadata(final k8s.ListMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.ControllerRevisionList}.
         */
        public k8s.ControllerRevisionList build() {
            return new k8s.ControllerRevisionList(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
