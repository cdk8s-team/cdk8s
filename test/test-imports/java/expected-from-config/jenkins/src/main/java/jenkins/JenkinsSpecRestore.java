package jenkins;

/**
 * Backup defines configuration of Jenkins backup restore More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.702Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecRestore")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecRestore.Jsii$Proxy.class)
public interface JenkinsSpecRestore extends software.amazon.jsii.JsiiSerializable {

    /**
     * Action defines action which performs restore backup in restore container sidecar.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecRestoreAction getAction();

    /**
     * ContainerName is the container name responsible for restore backup operation.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getContainerName();

    /**
     * RecoveryOnce if want to restore specific backup set this field and then Jenkins will be restarted and desired backup will be restored.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRecoveryOnce() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecRestore}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecRestore}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecRestoreAction action;
        private java.lang.String containerName;
        private java.lang.Number recoveryOnce;

        /**
         * Sets the value of {@link JenkinsSpecRestore#getAction}
         * @param action Action defines action which performs restore backup in restore container sidecar. This parameter is required.
         * @return {@code this}
         */
        public Builder action(jenkins.JenkinsSpecRestoreAction action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecRestore#getContainerName}
         * @param containerName ContainerName is the container name responsible for restore backup operation. This parameter is required.
         * @return {@code this}
         */
        public Builder containerName(java.lang.String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecRestore#getRecoveryOnce}
         * @param recoveryOnce RecoveryOnce if want to restore specific backup set this field and then Jenkins will be restarted and desired backup will be restored.
         * @return {@code this}
         */
        public Builder recoveryOnce(java.lang.Number recoveryOnce) {
            this.recoveryOnce = recoveryOnce;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecRestore}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecRestore build() {
            return new Jsii$Proxy(action, containerName, recoveryOnce);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecRestore}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecRestore {
        private final jenkins.JenkinsSpecRestoreAction action;
        private final java.lang.String containerName;
        private final java.lang.Number recoveryOnce;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.action = this.jsiiGet("action", jenkins.JenkinsSpecRestoreAction.class);
            this.containerName = this.jsiiGet("containerName", java.lang.String.class);
            this.recoveryOnce = this.jsiiGet("recoveryOnce", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecRestoreAction action, final java.lang.String containerName, final java.lang.Number recoveryOnce) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.action = java.util.Objects.requireNonNull(action, "action is required");
            this.containerName = java.util.Objects.requireNonNull(containerName, "containerName is required");
            this.recoveryOnce = recoveryOnce;
        }

        @Override
        public jenkins.JenkinsSpecRestoreAction getAction() {
            return this.action;
        }

        @Override
        public java.lang.String getContainerName() {
            return this.containerName;
        }

        @Override
        public java.lang.Number getRecoveryOnce() {
            return this.recoveryOnce;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("action", om.valueToTree(this.getAction()));
            data.set("containerName", om.valueToTree(this.getContainerName()));
            if (this.getRecoveryOnce() != null) {
                data.set("recoveryOnce", om.valueToTree(this.getRecoveryOnce()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecRestore"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecRestore.Jsii$Proxy that = (JenkinsSpecRestore.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            if (!containerName.equals(that.containerName)) return false;
            return this.recoveryOnce != null ? this.recoveryOnce.equals(that.recoveryOnce) : that.recoveryOnce == null;
        }

        @Override
        public int hashCode() {
            int result = this.action.hashCode();
            result = 31 * result + (this.containerName.hashCode());
            result = 31 * result + (this.recoveryOnce != null ? this.recoveryOnce.hashCode() : 0);
            return result;
        }
    }
}
