package k8s;

/**
 * ControllerRevision implements an immutable snapshot of state data.
 * <p>
 * Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.149Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ControllerRevision")
public class ControllerRevision extends org.cdk8s.ApiObject {

    protected ControllerRevision(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ControllerRevision(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.apps.v1.ControllerRevision" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public ControllerRevision(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.ControllerRevisionOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.ControllerRevision}.
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
        private final k8s.ControllerRevisionOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.ControllerRevisionOptions.Builder();
        }

        /**
         * Revision indicates the revision of the state represented by Data.
         * <p>
         * @return {@code this}
         * @param revision Revision indicates the revision of the state represented by Data. This parameter is required.
         */
        public Builder revision(final java.lang.Number revision) {
            this.options.revision(revision);
            return this;
        }

        /**
         * Data is the serialized representation of the state.
         * <p>
         * @return {@code this}
         * @param data Data is the serialized representation of the state. This parameter is required.
         */
        public Builder data(final java.lang.Object data) {
            this.options.data(data);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final k8s.ObjectMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.ControllerRevision}.
         */
        public k8s.ControllerRevision build() {
            return new k8s.ControllerRevision(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
