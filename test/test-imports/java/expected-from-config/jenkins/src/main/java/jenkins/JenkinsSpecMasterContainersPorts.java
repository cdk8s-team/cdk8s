package jenkins;

/**
 * ContainerPort represents a network port in a single container.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.621Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersPorts")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersPorts.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersPorts extends software.amazon.jsii.JsiiSerializable {

    /**
     * Number of port to expose on the pod's IP address.
     * <p>
     * This must be a valid port number, 0 &lt; x &lt; 65536.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getContainerPort();

    /**
     * What host IP to bind the external port to.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostIp() {
        return null;
    }

    /**
     * Number of port to expose on the host.
     * <p>
     * If specified, this must be a valid port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getHostPort() {
        return null;
    }

    /**
     * If specified, this must be an IANA_SVC_NAME and unique within the pod.
     * <p>
     * Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Protocol for port.
     * <p>
     * Must be UDP, TCP, or SCTP. Defaults to "TCP".
     * <p>
     * Default: TCP".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersPorts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersPorts}
     */
    public static final class Builder {
        private java.lang.Number containerPort;
        private java.lang.String hostIp;
        private java.lang.Number hostPort;
        private java.lang.String name;
        private java.lang.String protocol;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersPorts#getContainerPort}
         * @param containerPort Number of port to expose on the pod's IP address. This parameter is required.
         *                      This must be a valid port number, 0 &lt; x &lt; 65536.
         * @return {@code this}
         */
        public Builder containerPort(java.lang.Number containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersPorts#getHostIp}
         * @param hostIp What host IP to bind the external port to.
         * @return {@code this}
         */
        public Builder hostIp(java.lang.String hostIp) {
            this.hostIp = hostIp;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersPorts#getHostPort}
         * @param hostPort Number of port to expose on the host.
         *                 If specified, this must be a valid port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
         * @return {@code this}
         */
        public Builder hostPort(java.lang.Number hostPort) {
            this.hostPort = hostPort;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersPorts#getName}
         * @param name If specified, this must be an IANA_SVC_NAME and unique within the pod.
         *             Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersPorts#getProtocol}
         * @param protocol Protocol for port.
         *                 Must be UDP, TCP, or SCTP. Defaults to "TCP".
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersPorts}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersPorts build() {
            return new Jsii$Proxy(containerPort, hostIp, hostPort, name, protocol);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersPorts}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersPorts {
        private final java.lang.Number containerPort;
        private final java.lang.String hostIp;
        private final java.lang.Number hostPort;
        private final java.lang.String name;
        private final java.lang.String protocol;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.containerPort = this.jsiiGet("containerPort", java.lang.Number.class);
            this.hostIp = this.jsiiGet("hostIP", java.lang.String.class);
            this.hostPort = this.jsiiGet("hostPort", java.lang.Number.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.protocol = this.jsiiGet("protocol", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number containerPort, final java.lang.String hostIp, final java.lang.Number hostPort, final java.lang.String name, final java.lang.String protocol) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.containerPort = java.util.Objects.requireNonNull(containerPort, "containerPort is required");
            this.hostIp = hostIp;
            this.hostPort = hostPort;
            this.name = name;
            this.protocol = protocol;
        }

        @Override
        public java.lang.Number getContainerPort() {
            return this.containerPort;
        }

        @Override
        public java.lang.String getHostIp() {
            return this.hostIp;
        }

        @Override
        public java.lang.Number getHostPort() {
            return this.hostPort;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("containerPort", om.valueToTree(this.getContainerPort()));
            if (this.getHostIp() != null) {
                data.set("hostIP", om.valueToTree(this.getHostIp()));
            }
            if (this.getHostPort() != null) {
                data.set("hostPort", om.valueToTree(this.getHostPort()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersPorts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersPorts.Jsii$Proxy that = (JenkinsSpecMasterContainersPorts.Jsii$Proxy) o;

            if (!containerPort.equals(that.containerPort)) return false;
            if (this.hostIp != null ? !this.hostIp.equals(that.hostIp) : that.hostIp != null) return false;
            if (this.hostPort != null ? !this.hostPort.equals(that.hostPort) : that.hostPort != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.protocol != null ? this.protocol.equals(that.protocol) : that.protocol == null;
        }

        @Override
        public int hashCode() {
            int result = this.containerPort.hashCode();
            result = 31 * result + (this.hostIp != null ? this.hostIp.hashCode() : 0);
            result = 31 * result + (this.hostPort != null ? this.hostPort.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            return result;
        }
    }
}
