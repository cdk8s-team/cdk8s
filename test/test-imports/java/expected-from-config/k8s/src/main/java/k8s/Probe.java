package k8s;

/**
 * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.381Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Probe")
@software.amazon.jsii.Jsii.Proxy(Probe.Jsii$Proxy.class)
public interface Probe extends software.amazon.jsii.JsiiSerializable {

    /**
     * One and only one of the following should be specified.
     * <p>
     * Exec specifies the action to take.
     */
    default @org.jetbrains.annotations.Nullable k8s.ExecAction getExec() {
        return null;
    }

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded.
     * <p>
     * Defaults to 3. Minimum value is 1.
     * <p>
     * Default: 3. Minimum value is 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getFailureThreshold() {
        return null;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    default @org.jetbrains.annotations.Nullable k8s.HTTPGetAction getHttpGet() {
        return null;
    }

    /**
     * Number of seconds after the container has started before liveness probes are initiated.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getInitialDelaySeconds() {
        return null;
    }

    /**
     * How often (in seconds) to perform the probe.
     * <p>
     * Default to 10 seconds. Minimum value is 1.
     * <p>
     * Default: 10 seconds. Minimum value is 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPeriodSeconds() {
        return null;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed.
     * <p>
     * Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * <p>
     * Default: 1. Must be 1 for liveness and startup. Minimum value is 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSuccessThreshold() {
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
     * Number of seconds after which the probe times out.
     * <p>
     * Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * <p>
     * Default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Probe}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Probe}
     */
    public static final class Builder {
        private k8s.ExecAction exec;
        private java.lang.Number failureThreshold;
        private k8s.HTTPGetAction httpGet;
        private java.lang.Number initialDelaySeconds;
        private java.lang.Number periodSeconds;
        private java.lang.Number successThreshold;
        private k8s.TCPSocketAction tcpSocket;
        private java.lang.Number timeoutSeconds;

        /**
         * Sets the value of {@link Probe#getExec}
         * @param exec One and only one of the following should be specified.
         *             Exec specifies the action to take.
         * @return {@code this}
         */
        public Builder exec(k8s.ExecAction exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getFailureThreshold}
         * @param failureThreshold Minimum consecutive failures for the probe to be considered failed after having succeeded.
         *                         Defaults to 3. Minimum value is 1.
         * @return {@code this}
         */
        public Builder failureThreshold(java.lang.Number failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getHttpGet}
         * @param httpGet HTTPGet specifies the http request to perform.
         * @return {@code this}
         */
        public Builder httpGet(k8s.HTTPGetAction httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getInitialDelaySeconds}
         * @param initialDelaySeconds Number of seconds after the container has started before liveness probes are initiated.
         *                            More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
         * @return {@code this}
         */
        public Builder initialDelaySeconds(java.lang.Number initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getPeriodSeconds}
         * @param periodSeconds How often (in seconds) to perform the probe.
         *                      Default to 10 seconds. Minimum value is 1.
         * @return {@code this}
         */
        public Builder periodSeconds(java.lang.Number periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getSuccessThreshold}
         * @param successThreshold Minimum consecutive successes for the probe to be considered successful after having failed.
         *                         Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
         * @return {@code this}
         */
        public Builder successThreshold(java.lang.Number successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getTcpSocket}
         * @param tcpSocket TCPSocket specifies an action involving a TCP port.
         *                  TCP hooks not yet supported
         * @return {@code this}
         */
        public Builder tcpSocket(k8s.TCPSocketAction tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getTimeoutSeconds}
         * @param timeoutSeconds Number of seconds after which the probe times out.
         *                       Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
         * @return {@code this}
         */
        public Builder timeoutSeconds(java.lang.Number timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Probe}
         * @throws NullPointerException if any required attribute was not provided
         */
        public Probe build() {
            return new Jsii$Proxy(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, timeoutSeconds);
        }
    }

    /**
     * An implementation for {@link Probe}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Probe {
        private final k8s.ExecAction exec;
        private final java.lang.Number failureThreshold;
        private final k8s.HTTPGetAction httpGet;
        private final java.lang.Number initialDelaySeconds;
        private final java.lang.Number periodSeconds;
        private final java.lang.Number successThreshold;
        private final k8s.TCPSocketAction tcpSocket;
        private final java.lang.Number timeoutSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exec = this.jsiiGet("exec", k8s.ExecAction.class);
            this.failureThreshold = this.jsiiGet("failureThreshold", java.lang.Number.class);
            this.httpGet = this.jsiiGet("httpGet", k8s.HTTPGetAction.class);
            this.initialDelaySeconds = this.jsiiGet("initialDelaySeconds", java.lang.Number.class);
            this.periodSeconds = this.jsiiGet("periodSeconds", java.lang.Number.class);
            this.successThreshold = this.jsiiGet("successThreshold", java.lang.Number.class);
            this.tcpSocket = this.jsiiGet("tcpSocket", k8s.TCPSocketAction.class);
            this.timeoutSeconds = this.jsiiGet("timeoutSeconds", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.ExecAction exec, final java.lang.Number failureThreshold, final k8s.HTTPGetAction httpGet, final java.lang.Number initialDelaySeconds, final java.lang.Number periodSeconds, final java.lang.Number successThreshold, final k8s.TCPSocketAction tcpSocket, final java.lang.Number timeoutSeconds) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exec = exec;
            this.failureThreshold = failureThreshold;
            this.httpGet = httpGet;
            this.initialDelaySeconds = initialDelaySeconds;
            this.periodSeconds = periodSeconds;
            this.successThreshold = successThreshold;
            this.tcpSocket = tcpSocket;
            this.timeoutSeconds = timeoutSeconds;
        }

        @Override
        public k8s.ExecAction getExec() {
            return this.exec;
        }

        @Override
        public java.lang.Number getFailureThreshold() {
            return this.failureThreshold;
        }

        @Override
        public k8s.HTTPGetAction getHttpGet() {
            return this.httpGet;
        }

        @Override
        public java.lang.Number getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        @Override
        public java.lang.Number getPeriodSeconds() {
            return this.periodSeconds;
        }

        @Override
        public java.lang.Number getSuccessThreshold() {
            return this.successThreshold;
        }

        @Override
        public k8s.TCPSocketAction getTcpSocket() {
            return this.tcpSocket;
        }

        @Override
        public java.lang.Number getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExec() != null) {
                data.set("exec", om.valueToTree(this.getExec()));
            }
            if (this.getFailureThreshold() != null) {
                data.set("failureThreshold", om.valueToTree(this.getFailureThreshold()));
            }
            if (this.getHttpGet() != null) {
                data.set("httpGet", om.valueToTree(this.getHttpGet()));
            }
            if (this.getInitialDelaySeconds() != null) {
                data.set("initialDelaySeconds", om.valueToTree(this.getInitialDelaySeconds()));
            }
            if (this.getPeriodSeconds() != null) {
                data.set("periodSeconds", om.valueToTree(this.getPeriodSeconds()));
            }
            if (this.getSuccessThreshold() != null) {
                data.set("successThreshold", om.valueToTree(this.getSuccessThreshold()));
            }
            if (this.getTcpSocket() != null) {
                data.set("tcpSocket", om.valueToTree(this.getTcpSocket()));
            }
            if (this.getTimeoutSeconds() != null) {
                data.set("timeoutSeconds", om.valueToTree(this.getTimeoutSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Probe"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Probe.Jsii$Proxy that = (Probe.Jsii$Proxy) o;

            if (this.exec != null ? !this.exec.equals(that.exec) : that.exec != null) return false;
            if (this.failureThreshold != null ? !this.failureThreshold.equals(that.failureThreshold) : that.failureThreshold != null) return false;
            if (this.httpGet != null ? !this.httpGet.equals(that.httpGet) : that.httpGet != null) return false;
            if (this.initialDelaySeconds != null ? !this.initialDelaySeconds.equals(that.initialDelaySeconds) : that.initialDelaySeconds != null) return false;
            if (this.periodSeconds != null ? !this.periodSeconds.equals(that.periodSeconds) : that.periodSeconds != null) return false;
            if (this.successThreshold != null ? !this.successThreshold.equals(that.successThreshold) : that.successThreshold != null) return false;
            if (this.tcpSocket != null ? !this.tcpSocket.equals(that.tcpSocket) : that.tcpSocket != null) return false;
            return this.timeoutSeconds != null ? this.timeoutSeconds.equals(that.timeoutSeconds) : that.timeoutSeconds == null;
        }

        @Override
        public int hashCode() {
            int result = this.exec != null ? this.exec.hashCode() : 0;
            result = 31 * result + (this.failureThreshold != null ? this.failureThreshold.hashCode() : 0);
            result = 31 * result + (this.httpGet != null ? this.httpGet.hashCode() : 0);
            result = 31 * result + (this.initialDelaySeconds != null ? this.initialDelaySeconds.hashCode() : 0);
            result = 31 * result + (this.periodSeconds != null ? this.periodSeconds.hashCode() : 0);
            result = 31 * result + (this.successThreshold != null ? this.successThreshold.hashCode() : 0);
            result = 31 * result + (this.tcpSocket != null ? this.tcpSocket.hashCode() : 0);
            result = 31 * result + (this.timeoutSeconds != null ? this.timeoutSeconds.hashCode() : 0);
            return result;
        }
    }
}
