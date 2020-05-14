package k8s;

/**
 * CustomResourceDefinitionList is a list of CustomResourceDefinition objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.159Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CustomResourceDefinitionList")
public class CustomResourceDefinitionList extends org.cdk8s.ApiObject {

    protected CustomResourceDefinitionList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CustomResourceDefinitionList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinitionList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public CustomResourceDefinitionList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.CustomResourceDefinitionListOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.CustomResourceDefinitionList}.
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
        private final k8s.CustomResourceDefinitionListOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.CustomResourceDefinitionListOptions.Builder();
        }

        /**
         * items list individual CustomResourceDefinition objects.
         * <p>
         * @return {@code this}
         * @param items items list individual CustomResourceDefinition objects. This parameter is required.
         */
        public Builder items(final java.util.List<k8s.CustomResourceDefinition> items) {
            this.options.items(items);
            return this;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final k8s.ListMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.CustomResourceDefinitionList}.
         */
        public k8s.CustomResourceDefinitionList build() {
            return new k8s.CustomResourceDefinitionList(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
