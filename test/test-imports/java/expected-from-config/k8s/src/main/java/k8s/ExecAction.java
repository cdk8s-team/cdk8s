package k8s;

/**
 * ExecAction describes a "run in container" action.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.220Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ExecAction")
@software.amazon.jsii.Jsii.Proxy(ExecAction.Jsii$Proxy.class)
public interface ExecAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.
     * <p>
     * The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCommand() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ExecAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ExecAction}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> command;

        /**
         * Sets the value of {@link ExecAction#getCommand}
         * @param command Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.
         *                The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
         * @return {@code this}
         */
        public Builder command(java.util.List<java.lang.String> command) {
            this.command = command;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ExecAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ExecAction build() {
            return new Jsii$Proxy(command);
        }
    }

    /**
     * An implementation for {@link ExecAction}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ExecAction {
        private final java.util.List<java.lang.String> command;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.command = this.jsiiGet("command", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> command) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.command = command;
        }

        @Override
        public java.util.List<java.lang.String> getCommand() {
            return this.command;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCommand() != null) {
                data.set("command", om.valueToTree(this.getCommand()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ExecAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ExecAction.Jsii$Proxy that = (ExecAction.Jsii$Proxy) o;

            return this.command != null ? this.command.equals(that.command) : that.command == null;
        }

        @Override
        public int hashCode() {
            int result = this.command != null ? this.command.hashCode() : 0;
            return result;
        }
    }
}
