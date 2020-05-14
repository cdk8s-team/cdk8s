package k8s;

/**
 * Lifecycle describes actions that the management system should take in response to container lifecycle events.
 * <p>
 * For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.277Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Lifecycle")
@software.amazon.jsii.Jsii.Proxy(Lifecycle.Jsii$Proxy.class)
public interface Lifecycle extends software.amazon.jsii.JsiiSerializable {

    /**
     * PostStart is called immediately after a container is created.
     * <p>
     * If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     */
    default @org.jetbrains.annotations.Nullable k8s.Handler getPostStart() {
        return null;
    }

    /**
     * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.
     * <p>
     * The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     */
    default @org.jetbrains.annotations.Nullable k8s.Handler getPreStop() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Lifecycle}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Lifecycle}
     */
    public static final class Builder {
        private k8s.Handler postStart;
        private k8s.Handler preStop;

        /**
         * Sets the value of {@link Lifecycle#getPostStart}
         * @param postStart PostStart is called immediately after a container is created.
         *                  If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
         * @return {@code this}
         */
        public Builder postStart(k8s.Handler postStart) {
            this.postStart = postStart;
            return this;
        }

        /**
         * Sets the value of {@link Lifecycle#getPreStop}
         * @param preStop PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.
         *                The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
         * @return {@code this}
         */
        public Builder preStop(k8s.Handler preStop) {
            this.preStop = preStop;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Lifecycle}
         * @throws NullPointerException if any required attribute was not provided
         */
        public Lifecycle build() {
            return new Jsii$Proxy(postStart, preStop);
        }
    }

    /**
     * An implementation for {@link Lifecycle}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Lifecycle {
        private final k8s.Handler postStart;
        private final k8s.Handler preStop;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.postStart = this.jsiiGet("postStart", k8s.Handler.class);
            this.preStop = this.jsiiGet("preStop", k8s.Handler.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.Handler postStart, final k8s.Handler preStop) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.postStart = postStart;
            this.preStop = preStop;
        }

        @Override
        public k8s.Handler getPostStart() {
            return this.postStart;
        }

        @Override
        public k8s.Handler getPreStop() {
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
            struct.set("fqn", om.valueToTree("k8s.Lifecycle"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Lifecycle.Jsii$Proxy that = (Lifecycle.Jsii$Proxy) o;

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
