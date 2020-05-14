package jenkins;

/**
 * Backup defines configuration of Jenkins backup More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.591Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecBackup")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecBackup.Jsii$Proxy.class)
public interface JenkinsSpecBackup extends software.amazon.jsii.JsiiSerializable {

    /**
     * Action defines action which performs backup in backup container sidecar.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecBackupAction getAction();

    /**
     * ContainerName is the container name responsible for backup operation.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getContainerName();

    /**
     * Interval tells how often make backup in seconds Defaults to 30.
     * <p>
     * Default: 30.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getInterval();

    /**
     * MakeBackupBeforePodDeletion tells operator to make backup before Jenkins master pod deletion.
     */
    @org.jetbrains.annotations.NotNull java.lang.Boolean getMakeBackupBeforePodDeletion();

    /**
     * @return a {@link Builder} of {@link JenkinsSpecBackup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecBackup}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecBackupAction action;
        private java.lang.String containerName;
        private java.lang.Number interval;
        private java.lang.Boolean makeBackupBeforePodDeletion;

        /**
         * Sets the value of {@link JenkinsSpecBackup#getAction}
         * @param action Action defines action which performs backup in backup container sidecar. This parameter is required.
         * @return {@code this}
         */
        public Builder action(jenkins.JenkinsSpecBackupAction action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecBackup#getContainerName}
         * @param containerName ContainerName is the container name responsible for backup operation. This parameter is required.
         * @return {@code this}
         */
        public Builder containerName(java.lang.String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecBackup#getInterval}
         * @param interval Interval tells how often make backup in seconds Defaults to 30. This parameter is required.
         * @return {@code this}
         */
        public Builder interval(java.lang.Number interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecBackup#getMakeBackupBeforePodDeletion}
         * @param makeBackupBeforePodDeletion MakeBackupBeforePodDeletion tells operator to make backup before Jenkins master pod deletion. This parameter is required.
         * @return {@code this}
         */
        public Builder makeBackupBeforePodDeletion(java.lang.Boolean makeBackupBeforePodDeletion) {
            this.makeBackupBeforePodDeletion = makeBackupBeforePodDeletion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecBackup}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecBackup build() {
            return new Jsii$Proxy(action, containerName, interval, makeBackupBeforePodDeletion);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecBackup}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecBackup {
        private final jenkins.JenkinsSpecBackupAction action;
        private final java.lang.String containerName;
        private final java.lang.Number interval;
        private final java.lang.Boolean makeBackupBeforePodDeletion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.action = this.jsiiGet("action", jenkins.JenkinsSpecBackupAction.class);
            this.containerName = this.jsiiGet("containerName", java.lang.String.class);
            this.interval = this.jsiiGet("interval", java.lang.Number.class);
            this.makeBackupBeforePodDeletion = this.jsiiGet("makeBackupBeforePodDeletion", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecBackupAction action, final java.lang.String containerName, final java.lang.Number interval, final java.lang.Boolean makeBackupBeforePodDeletion) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.action = java.util.Objects.requireNonNull(action, "action is required");
            this.containerName = java.util.Objects.requireNonNull(containerName, "containerName is required");
            this.interval = java.util.Objects.requireNonNull(interval, "interval is required");
            this.makeBackupBeforePodDeletion = java.util.Objects.requireNonNull(makeBackupBeforePodDeletion, "makeBackupBeforePodDeletion is required");
        }

        @Override
        public jenkins.JenkinsSpecBackupAction getAction() {
            return this.action;
        }

        @Override
        public java.lang.String getContainerName() {
            return this.containerName;
        }

        @Override
        public java.lang.Number getInterval() {
            return this.interval;
        }

        @Override
        public java.lang.Boolean getMakeBackupBeforePodDeletion() {
            return this.makeBackupBeforePodDeletion;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("action", om.valueToTree(this.getAction()));
            data.set("containerName", om.valueToTree(this.getContainerName()));
            data.set("interval", om.valueToTree(this.getInterval()));
            data.set("makeBackupBeforePodDeletion", om.valueToTree(this.getMakeBackupBeforePodDeletion()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecBackup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecBackup.Jsii$Proxy that = (JenkinsSpecBackup.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            if (!containerName.equals(that.containerName)) return false;
            if (!interval.equals(that.interval)) return false;
            return this.makeBackupBeforePodDeletion.equals(that.makeBackupBeforePodDeletion);
        }

        @Override
        public int hashCode() {
            int result = this.action.hashCode();
            result = 31 * result + (this.containerName.hashCode());
            result = 31 * result + (this.interval.hashCode());
            result = 31 * result + (this.makeBackupBeforePodDeletion.hashCode());
            return result;
        }
    }
}
