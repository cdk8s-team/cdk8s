package k8s;

/**
 * PriorityClass defines mapping from a priority class name to the priority integer value.
 * <p>
 * The value can be any valid integer.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.377Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PriorityClass")
public class PriorityClass extends org.cdk8s.ApiObject {

    protected PriorityClass(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PriorityClass(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.scheduling.v1.PriorityClass" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public PriorityClass(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.PriorityClassOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.PriorityClass}.
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
        private final k8s.PriorityClassOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.PriorityClassOptions.Builder();
        }

        /**
         * The value of this priority class.
         * <p>
         * This is the actual priority that pods receive when they have the name of this class in their pod spec.
         * <p>
         * @return {@code this}
         * @param value The value of this priority class. This parameter is required.
         */
        public Builder value(final java.lang.Number value) {
            this.options.value(value);
            return this;
        }

        /**
         * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
         * <p>
         * @return {@code this}
         * @param description description is an arbitrary string that usually provides guidelines on when this priority class should be used. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.options.description(description);
            return this;
        }

        /**
         * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class.
         * <p>
         * Only one PriorityClass can be marked as <code>globalDefault</code>. However, if more than one PriorityClasses exists with their <code>globalDefault</code> field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
         * <p>
         * @return {@code this}
         * @param globalDefault globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. This parameter is required.
         */
        public Builder globalDefault(final java.lang.Boolean globalDefault) {
            this.options.globalDefault(globalDefault);
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
         * PreemptionPolicy is the Policy for preempting pods with lower priority.
         * <p>
         * One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
         * <p>
         * Default: PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
         * <p>
         * @return {@code this}
         * @param preemptionPolicy PreemptionPolicy is the Policy for preempting pods with lower priority. This parameter is required.
         */
        public Builder preemptionPolicy(final java.lang.String preemptionPolicy) {
            this.options.preemptionPolicy(preemptionPolicy);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.PriorityClass}.
         */
        public k8s.PriorityClass build() {
            return new k8s.PriorityClass(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
