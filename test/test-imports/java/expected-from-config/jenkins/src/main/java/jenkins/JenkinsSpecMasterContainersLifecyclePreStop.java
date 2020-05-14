package jenkins;

/**
 * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.
 * <p>
 * The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.615Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersLifecyclePreStop")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersLifecyclePreStop.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersLifecyclePreStop extends software.amazon.jsii.JsiiSerializable {

    /**
     * One and only one of the following should be specified.
     * <p>
     * Exec specifies the action to take.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersLifecyclePreStopExec getExec() {
        return null;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGet getHttpGet() {
        return null;
    }

    /**
     * TCPSocket specifies an action involving a TCP port.
     * <p>
     * TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersLifecyclePreStop}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersLifecyclePreStop}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecMasterContainersLifecyclePreStopExec exec;
        private jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGet httpGet;
        private jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket tcpSocket;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersLifecyclePreStop#getExec}
         * @param exec One and only one of the following should be specified.
         *             Exec specifies the action to take.
         * @return {@code this}
         */
        public Builder exec(jenkins.JenkinsSpecMasterContainersLifecyclePreStopExec exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersLifecyclePreStop#getHttpGet}
         * @param httpGet HTTPGet specifies the http request to perform.
         * @return {@code this}
         */
        public Builder httpGet(jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersLifecyclePreStop#getTcpSocket}
         * @param tcpSocket TCPSocket specifies an action involving a TCP port.
         *                  TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
         * @return {@code this}
         */
        public Builder tcpSocket(jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersLifecyclePreStop}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersLifecyclePreStop build() {
            return new Jsii$Proxy(exec, httpGet, tcpSocket);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersLifecyclePreStop}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersLifecyclePreStop {
        private final jenkins.JenkinsSpecMasterContainersLifecyclePreStopExec exec;
        private final jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGet httpGet;
        private final jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket tcpSocket;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exec = this.jsiiGet("exec", jenkins.JenkinsSpecMasterContainersLifecyclePreStopExec.class);
            this.httpGet = this.jsiiGet("httpGet", jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGet.class);
            this.tcpSocket = this.jsiiGet("tcpSocket", jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecMasterContainersLifecyclePreStopExec exec, final jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGet httpGet, final jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket tcpSocket) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exec = exec;
            this.httpGet = httpGet;
            this.tcpSocket = tcpSocket;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLifecyclePreStopExec getExec() {
            return this.exec;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGet getHttpGet() {
            return this.httpGet;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket getTcpSocket() {
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
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersLifecyclePreStop"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersLifecyclePreStop.Jsii$Proxy that = (JenkinsSpecMasterContainersLifecyclePreStop.Jsii$Proxy) o;

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
