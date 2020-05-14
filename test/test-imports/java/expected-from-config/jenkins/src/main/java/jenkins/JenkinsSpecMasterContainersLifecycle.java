package jenkins;

/**
 * Actions that the management system should take in response to container lifecycle events.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.608Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersLifecycle")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersLifecycle.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersLifecycle extends software.amazon.jsii.JsiiSerializable {

    /**
     * PostStart is called immediately after a container is created.
     * <p>
     * If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersLifecyclePostStart getPostStart() {
        return null;
    }

    /**
     * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.
     * <p>
     * The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersLifecyclePreStop getPreStop() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersLifecycle}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersLifecycle}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecMasterContainersLifecyclePostStart postStart;
        private jenkins.JenkinsSpecMasterContainersLifecyclePreStop preStop;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersLifecycle#getPostStart}
         * @param postStart PostStart is called immediately after a container is created.
         *                  If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
         * @return {@code this}
         */
        public Builder postStart(jenkins.JenkinsSpecMasterContainersLifecyclePostStart postStart) {
            this.postStart = postStart;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersLifecycle#getPreStop}
         * @param preStop PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.
         *                The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
         * @return {@code this}
         */
        public Builder preStop(jenkins.JenkinsSpecMasterContainersLifecyclePreStop preStop) {
            this.preStop = preStop;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersLifecycle}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersLifecycle build() {
            return new Jsii$Proxy(postStart, preStop);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersLifecycle}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersLifecycle {
        private final jenkins.JenkinsSpecMasterContainersLifecyclePostStart postStart;
        private final jenkins.JenkinsSpecMasterContainersLifecyclePreStop preStop;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.postStart = this.jsiiGet("postStart", jenkins.JenkinsSpecMasterContainersLifecyclePostStart.class);
            this.preStop = this.jsiiGet("preStop", jenkins.JenkinsSpecMasterContainersLifecyclePreStop.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecMasterContainersLifecyclePostStart postStart, final jenkins.JenkinsSpecMasterContainersLifecyclePreStop preStop) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.postStart = postStart;
            this.preStop = preStop;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLifecyclePostStart getPostStart() {
            return this.postStart;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLifecyclePreStop getPreStop() {
            return this.preStop;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPostStart() != null) {
                data.set("postStart", om.valueToTree(this.getPostStart()));
            }
            if (this.getPreStop() != null) {
                data.set("preStop", om.valueToTree(this.getPreStop()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersLifecycle"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersLifecycle.Jsii$Proxy that = (JenkinsSpecMasterContainersLifecycle.Jsii$Proxy) o;

            if (this.postStart != null ? !this.postStart.equals(that.postStart) : that.postStart != null) return false;
            return this.preStop != null ? this.preStop.equals(that.preStop) : that.preStop == null;
        }

        @Override
        public int hashCode() {
            int result = this.postStart != null ? this.postStart.hashCode() : 0;
            result = 31 * result + (this.preStop != null ? this.preStop.hashCode() : 0);
            return result;
        }
    }
}
