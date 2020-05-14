package jenkins;

/**
 * Action defines action which performs backup in backup container sidecar.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.592Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecBackupAction")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecBackupAction.Jsii$Proxy.class)
public interface JenkinsSpecBackupAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * Exec specifies the action to take.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecBackupActionExec getExec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecBackupAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecBackupAction}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecBackupActionExec exec;

        /**
         * Sets the value of {@link JenkinsSpecBackupAction#getExec}
         * @param exec Exec specifies the action to take.
         * @return {@code this}
         */
        public Builder exec(jenkins.JenkinsSpecBackupActionExec exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecBackupAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecBackupAction build() {
            return new Jsii$Proxy(exec);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecBackupAction}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecBackupAction {
        private final jenkins.JenkinsSpecBackupActionExec exec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exec = this.jsiiGet("exec", jenkins.JenkinsSpecBackupActionExec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecBackupActionExec exec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exec = exec;
        }

        @Override
        public jenkins.JenkinsSpecBackupActionExec getExec() {
            return this.exec;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExec() != null) {
                data.set("exec", om.valueToTree(this.getExec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecBackupAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecBackupAction.Jsii$Proxy that = (JenkinsSpecBackupAction.Jsii$Proxy) o;

            return this.exec != null ? this.exec.equals(that.exec) : that.exec == null;
        }

        @Override
        public int hashCode() {
            int result = this.exec != null ? this.exec.hashCode() : 0;
            return result;
        }
    }
}
