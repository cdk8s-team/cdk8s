package k8s;

/**
 * Secret holds secret data of a certain type.
 * <p>
 * The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.405Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Secret")
public class Secret extends org.cdk8s.ApiObject {

    protected Secret(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Secret(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.core.v1.Secret" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public Secret(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable k8s.SecretOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.core.v1.Secret" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public Secret(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link k8s.Secret}.
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
        private k8s.SecretOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * Data contains the secret data.
         * <p>
         * Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
         * <p>
         * @return {@code this}
         * @param data Data contains the secret data. This parameter is required.
         */
        public Builder data(final java.util.Map<java.lang.String, java.lang.String> data) {
            this.options().data(data);
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
            this.options().metadata(metadata);
            return this;
        }

        /**
         * stringData allows specifying non-binary secret data in string form.
         * <p>
         * It is provided as a write-only convenience method. All keys and values are merged into the data field on write, overwriting any existing values. It is never output when reading from the API.
         * <p>
         * @return {@code this}
         * @param stringData stringData allows specifying non-binary secret data in string form. This parameter is required.
         */
        public Builder stringData(final java.util.Map<java.lang.String, java.lang.String> stringData) {
            this.options().stringData(stringData);
            return this;
        }

        /**
         * Used to facilitate programmatic handling of secret data.
         * <p>
         * @return {@code this}
         * @param type Used to facilitate programmatic handling of secret data. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.options().type(type);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.Secret}.
         */
        public k8s.Secret build() {
            return new k8s.Secret(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private k8s.SecretOptions.Builder options() {
            if (this.options == null) {
                this.options = new k8s.SecretOptions.Builder();
            }
            return this.options;
        }
    }
}
