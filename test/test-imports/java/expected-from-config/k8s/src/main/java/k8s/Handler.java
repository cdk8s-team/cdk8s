package k8s;

/**
 * Handler defines a specific action that should be taken.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.234Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Handler")
@software.amazon.jsii.Jsii.Proxy(Handler.Jsii$Proxy.class)
public interface Handler extends software.amazon.jsii.JsiiSerializable {

    /**
     * One and only one of the following should be specified.
     * <p>
     * Exec specifies the action to take.
     */
    default @org.jetbrains.annotations.Nullable k8s.ExecAction getExec() {
        return null;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    default @org.jetbrains.annotations.Nullable k8s.HTTPGetAction getHttpGet() {
        return null;
    }

    /**
     * TCPSocket specifies an action involving a TCP port.
     * <p>
     * TCP hooks not yet supported
     */
    default @org.jetbrains.annotations.Nullable k8s.TCPSocketAction getTcpSocket() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Handler}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Handler}
     */
    public static final class Builder {
        private k8s.ExecAction exec;
        private k8s.HTTPGetAction httpGet;
        private k8s.TCPSocketAction tcpSocket;

        /**
         * Sets the value of {@link Handler#getExec}
         * @param exec One and only one of the following should be specified.
         *             Exec specifies the action to take.
         * @return {@code this}
         */
        public Builder exec(k8s.ExecAction exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Sets the value of {@link Handler#getHttpGet}
         * @param httpGet HTTPGet specifies the http request to perform.
         * @return {@code this}
         */
        public Builder httpGet(k8s.HTTPGetAction httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        /**
         * Sets the value of {@link Handler#getTcpSocket}
         * @param tcpSocket TCPSocket specifies an action involving a TCP port.
         *                  TCP hooks not yet supported
         * @return {@code this}
         */
        public Builder tcpSocket(k8s.TCPSocketAction tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Handler}
         * @throws NullPointerException if any required attribute was not provided
         */
        public Handler build() {
            return new Jsii$Proxy(exec, httpGet, tcpSocket);
        }
    }

    /**
     * An implementation for {@link Handler}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Handler {
        private final k8s.ExecAction exec;
        private final k8s.HTTPGetAction httpGet;
        private final k8s.TCPSocketAction tcpSocket;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exec = this.jsiiGet("exec", k8s.ExecAction.class);
            this.httpGet = this.jsiiGet("httpGet", k8s.HTTPGetAction.class);
            this.tcpSocket = this.jsiiGet("tcpSocket", k8s.TCPSocketAction.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.ExecAction exec, final k8s.HTTPGetAction httpGet, final k8s.TCPSocketAction tcpSocket) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exec = exec;
            this.httpGet = httpGet;
            this.tcpSocket = tcpSocket;
        }

        @Override
        public k8s.ExecAction getExec() {
            return this.exec;
        }

        @Override
        public k8s.HTTPGetAction getHttpGet() {
            return this.httpGet;
        }

        @Override
        public k8s.TCPSocketAction getTcpSocket() {
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
            struct.set("fqn", om.valueToTree("k8s.Handler"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Handler.Jsii$Proxy that = (Handler.Jsii$Proxy) o;

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
