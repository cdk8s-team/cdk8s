package jenkins;

/**
 * HTTPGet specifies the http request to perform.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.625Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGet")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersReadinessProbeHttpGet.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersReadinessProbeHttpGet extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name or number of the port to access on the container.
     * <p>
     * Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetPort getPort();

    /**
     * Host name to connect to, defaults to the pod IP.
     * <p>
     * You probably want to set "Host" in httpHeaders instead.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHost() {
        return null;
    }

    /**
     * Custom headers to set in the request.
     * <p>
     * HTTP allows repeated headers.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
        return null;
    }

    /**
     * Path to access on the HTTP server.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * Scheme to use for connecting to the host.
     * <p>
     * Defaults to HTTP.
     * <p>
     * Default: HTTP.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getScheme() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersReadinessProbeHttpGet}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersReadinessProbeHttpGet}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetPort port;
        private java.lang.String host;
        private java.util.List<jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
        private java.lang.String path;
        private java.lang.String scheme;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersReadinessProbeHttpGet#getPort}
         * @param port Name or number of the port to access on the container. This parameter is required.
         *             Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
         * @return {@code this}
         */
        public Builder port(jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetPort port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersReadinessProbeHttpGet#getHost}
         * @param host Host name to connect to, defaults to the pod IP.
         *             You probably want to set "Host" in httpHeaders instead.
         * @return {@code this}
         */
        public Builder host(java.lang.String host) {
            this.host = host;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersReadinessProbeHttpGet#getHttpHeaders}
         * @param httpHeaders Custom headers to set in the request.
         *                    HTTP allows repeated headers.
         * @return {@code this}
         */
        public Builder httpHeaders(java.util.List<jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersReadinessProbeHttpGet#getPath}
         * @param path Path to access on the HTTP server.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersReadinessProbeHttpGet#getScheme}
         * @param scheme Scheme to use for connecting to the host.
         *               Defaults to HTTP.
         * @return {@code this}
         */
        public Builder scheme(java.lang.String scheme) {
            this.scheme = scheme;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersReadinessProbeHttpGet}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersReadinessProbeHttpGet build() {
            return new Jsii$Proxy(port, host, httpHeaders, path, scheme);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersReadinessProbeHttpGet}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersReadinessProbeHttpGet {
        private final jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetPort port;
        private final java.lang.String host;
        private final java.util.List<jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders> httpHeaders;
        private final java.lang.String path;
        private final java.lang.String scheme;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.port = this.jsiiGet("port", jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetPort.class);
            this.host = this.jsiiGet("host", java.lang.String.class);
            this.httpHeaders = this.jsiiGet("httpHeaders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders.class)));
            this.path = this.jsiiGet("path", java.lang.String.class);
            this.scheme = this.jsiiGet("scheme", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetPort port, final java.lang.String host, final java.util.List<jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders> httpHeaders, final java.lang.String path, final java.lang.String scheme) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.port = java.util.Objects.requireNonNull(port, "port is required");
            this.host = host;
            this.httpHeaders = httpHeaders;
            this.path = path;
            this.scheme = scheme;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetPort getPort() {
            return this.port;
        }

        @Override
        public java.lang.String getHost() {
            return this.host;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders> getHttpHeaders() {
            return this.httpHeaders;
        }

        @Override
        public java.lang.String getPath() {
            return this.path;
        }

        @Override
        public java.lang.String getScheme() {
            return this.scheme;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("port", om.valueToTree(this.getPort()));
            if (this.getHost() != null) {
                data.set("host", om.valueToTree(this.getHost()));
            }
            if (this.getHttpHeaders() != null) {
                data.set("httpHeaders", om.valueToTree(this.getHttpHeaders()));
            }
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getScheme() != null) {
                data.set("scheme", om.valueToTree(this.getScheme()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersReadinessProbeHttpGet"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersReadinessProbeHttpGet.Jsii$Proxy that = (JenkinsSpecMasterContainersReadinessProbeHttpGet.Jsii$Proxy) o;

            if (!port.equals(that.port)) return false;
            if (this.host != null ? !this.host.equals(that.host) : that.host != null) return false;
            if (this.httpHeaders != null ? !this.httpHeaders.equals(that.httpHeaders) : that.httpHeaders != null) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            return this.scheme != null ? this.scheme.equals(that.scheme) : that.scheme == null;
        }

        @Override
        public int hashCode() {
            int result = this.port.hashCode();
            result = 31 * result + (this.host != null ? this.host.hashCode() : 0);
            result = 31 * result + (this.httpHeaders != null ? this.httpHeaders.hashCode() : 0);
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            result = 31 * result + (this.scheme != null ? this.scheme.hashCode() : 0);
            return result;
        }
    }
}
