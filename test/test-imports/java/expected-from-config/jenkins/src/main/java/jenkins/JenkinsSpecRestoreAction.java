package jenkins;

/**
 * Action defines action which performs restore backup in restore container sidecar.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.702Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecRestoreAction")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecRestoreAction.Jsii$Proxy.class)
public interface JenkinsSpecRestoreAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * Exec specifies the action to take.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecRestoreActionExec getExec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecRestoreAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecRestoreAction}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecRestoreActionExec exec;

        /**
         * Sets the value of {@link JenkinsSpecRestoreAction#getExec}
         * @param exec Exec specifies the action to take.
         * @return {@code this}
         */
        public Builder exec(jenkins.JenkinsSpecRestoreActionExec exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecRestoreAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecRestoreAction build() {
            return new Jsii$Proxy(exec);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecRestoreAction}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecRestoreAction {
        private final jenkins.JenkinsSpecRestoreActionExec exec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exec = this.jsiiGet("exec", jenkins.JenkinsSpecRestoreActionExec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecRestoreActionExec exec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exec = exec;
        }

        @Override
        public jenkins.JenkinsSpecRestoreActionExec getExec() {
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
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecRestoreAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecRestoreAction.Jsii$Proxy that = (JenkinsSpecRestoreAction.Jsii$Proxy) o;

            return this.exec != null ? this.exec.equals(that.exec) : that.exec == null;
        }

        @Override
        public int hashCode() {
            int result = this.exec != null ? this.exec.hashCode() : 0;
            return result;
        }
    }
}
