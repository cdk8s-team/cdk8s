package k8s;

/**
 * RuntimeClass defines a class of container runtime supported in the cluster.
 * <p>
 * The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.398Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.RuntimeClass")
public class RuntimeClass extends org.cdk8s.ApiObject {

    protected RuntimeClass(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RuntimeClass(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.node.v1beta1.RuntimeClass" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public RuntimeClass(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.RuntimeClassOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.RuntimeClass}.
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
        private final k8s.RuntimeClassOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.RuntimeClassOptions.Builder();
        }

        /**
         * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class.
         * <p>
         * The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
         * <p>
         * @return {@code this}
         * @param handler Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. This parameter is required.
         */
        public Builder handler(final java.lang.String handler) {
            this.options.handler(handler);
            return this;
        }

        /**
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
         * <p>
         * @return {@code this}
         * @param metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata. This parameter is required.
         */
        public Builder metadata(final k8s.ObjectMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass.
         * <p>
         * For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
         * <p>
         * @return {@code this}
         * @param overhead Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This parameter is required.
         */
        public Builder overhead(final k8s.Overhead overhead) {
            this.options.overhead(overhead);
            return this;
        }

        /**
         * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it.
         * <p>
         * If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
         * <p>
         * @return {@code this}
         * @param scheduling Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. This parameter is required.
         */
        public Builder scheduling(final k8s.Scheduling scheduling) {
            this.options.scheduling(scheduling);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.RuntimeClass}.
         */
        public k8s.RuntimeClass build() {
            return new k8s.RuntimeClass(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
