package k8s;

/**
 * EndpointSlice represents a subset of the endpoints that implement a service.
 * <p>
 * For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.184Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EndpointSlice")
public class EndpointSlice extends org.cdk8s.ApiObject {

    protected EndpointSlice(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EndpointSlice(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.discovery.v1beta1.EndpointSlice" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public EndpointSlice(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.EndpointSliceOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.EndpointSlice}.
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
        private final k8s.EndpointSliceOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.EndpointSliceOptions.Builder();
        }

        /**
         * addressType specifies the type of address carried by this EndpointSlice.
         * <p>
         * All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
         * <p>
         * @return {@code this}
         * @param addressType addressType specifies the type of address carried by this EndpointSlice. This parameter is required.
         */
        public Builder addressType(final java.lang.String addressType) {
            this.options.addressType(addressType);
            return this;
        }

        /**
         * endpoints is a list of unique endpoints in this slice.
         * <p>
         * Each slice may include a maximum of 1000 endpoints.
         * <p>
         * @return {@code this}
         * @param endpoints endpoints is a list of unique endpoints in this slice. This parameter is required.
         */
        public Builder endpoints(final java.util.List<k8s.Endpoint> endpoints) {
            this.options.endpoints(endpoints);
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
         * ports specifies the list of network ports exposed by each endpoint in this slice.
         * <p>
         * Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
         * <p>
         * @return {@code this}
         * @param ports ports specifies the list of network ports exposed by each endpoint in this slice. This parameter is required.
         */
        public Builder ports(final java.util.List<k8s.EndpointPort> ports) {
            this.options.ports(ports);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.EndpointSlice}.
         */
        public k8s.EndpointSlice build() {
            return new k8s.EndpointSlice(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
