package jenkins;

/**
 * PostStart is called immediately after a container is created.
 * <p>
 * If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.609Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersLifecyclePostStart")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersLifecyclePostStart.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersLifecyclePostStart extends software.amazon.jsii.JsiiSerializable {

    /**
     * One and only one of the following should be specified.
     * <p>
     * Exec specifies the action to take.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersLifecyclePostStartExec getExec() {
        return null;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGet getHttpGet() {
        return null;
    }

    /**
     * TCPSocket specifies an action involving a TCP port.
     * <p>
     * TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersLifecyclePostStart}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersLifecyclePostStart}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecMasterContainersLifecyclePostStartExec exec;
        private jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGet httpGet;
        private jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocket tcpSocket;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersLifecyclePostStart#getExec}
         * @param exec One and only one of the following should be specified.
         *             Exec specifies the action to take.
         * @return {@code this}
         */
        public Builder exec(jenkins.JenkinsSpecMasterContainersLifecyclePostStartExec exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersLifecyclePostStart#getHttpGet}
         * @param httpGet HTTPGet specifies the http request to perform.
         * @return {@code this}
         */
        public Builder httpGet(jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersLifecyclePostStart#getTcpSocket}
         * @param tcpSocket TCPSocket specifies an action involving a TCP port.
         *                  TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
         * @return {@code this}
         */
        public Builder tcpSocket(jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersLifecyclePostStart}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersLifecyclePostStart build() {
            return new Jsii$Proxy(exec, httpGet, tcpSocket);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersLifecyclePostStart}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersLifecyclePostStart {
        private final jenkins.JenkinsSpecMasterContainersLifecyclePostStartExec exec;
        private final jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGet httpGet;
        private final jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocket tcpSocket;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exec = this.jsiiGet("exec", jenkins.JenkinsSpecMasterContainersLifecyclePostStartExec.class);
            this.httpGet = this.jsiiGet("httpGet", jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGet.class);
            this.tcpSocket = this.jsiiGet("tcpSocket", jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocket.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecMasterContainersLifecyclePostStartExec exec, final jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGet httpGet, final jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocket tcpSocket) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exec = exec;
            this.httpGet = httpGet;
            this.tcpSocket = tcpSocket;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLifecyclePostStartExec getExec() {
            return this.exec;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLifecyclePostStartHttpGet getHttpGet() {
            return this.httpGet;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLifecyclePostStartTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExec() != null) {
                data.set("exec", om.valueToTree(this.getExec()));
            }
            if (this.getHttpGet() != null) {
                data.set("httpGet", om.valueToTree(this.getHttpGet()));
            }
            if (this.getTcpSocket() != null) {
                data.set("tcpSocket", om.valueToTree(this.getTcpSocket()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersLifecyclePostStart"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersLifecyclePostStart.Jsii$Proxy that = (JenkinsSpecMasterContainersLifecyclePostStart.Jsii$Proxy) o;

            if (this.exec != null ? !this.exec.equals(that.exec) : that.exec != null) return false;
            if (this.httpGet != null ? !this.httpGet.equals(that.httpGet) : that.httpGet != null) return false;
            return this.tcpSocket != null ? this.tcpSocket.equals(that.tcpSocket) : that.tcpSocket == null;
        }

        @Override
        public int hashCode() {
            int result = this.exec != null ? this.exec.hashCode() : 0;
            result = 31 * result + (this.httpGet != null ? this.httpGet.hashCode() : 0);
            result = 31 * result + (this.tcpSocket != null ? this.tcpSocket.hashCode() : 0);
            return result;
        }
    }
}
