package clusterinstallation;

/**
 * ClusterInstallation is the Schema for the clusterinstallations API.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.290Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallation")
public class ClusterInstallation extends org.cdk8s.ApiObject {

    protected ClusterInstallation(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ClusterInstallation(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "ClusterInstallation" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public ClusterInstallation(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull clusterinstallation.ClusterInstallationOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link clusterinstallation.ClusterInstallation}.
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
        private final clusterinstallation.ClusterInstallationOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new clusterinstallation.ClusterInstallationOptions.Builder();
        }

        /**
         * Specification of the desired behavior of the Mattermost cluster.
         * <p>
         * More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
         * <p>
         * @return {@code this}
         * @param spec Specification of the desired behavior of the Mattermost cluster. This parameter is required.
         */
        public Builder spec(final clusterinstallation.ClusterInstallationSpec spec) {
            this.options.spec(spec);
            return this;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final java.lang.Object metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link clusterinstallation.ClusterInstallation}.
         */
        public clusterinstallation.ClusterInstallation build() {
            return new clusterinstallation.ClusterInstallation(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
