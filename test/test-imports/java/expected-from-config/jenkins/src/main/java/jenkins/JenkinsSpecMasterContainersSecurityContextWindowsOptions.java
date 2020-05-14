package jenkins;

/**
 * The Windows specific settings applied to all containers.
 * <p>
 * If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.635Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersSecurityContextWindowsOptions.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersSecurityContextWindowsOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGmsaCredentialSpec() {
        return null;
    }

    /**
     * GMSACredentialSpecName is the name of the GMSA credential spec to use.
     * <p>
     * This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGmsaCredentialSpecName() {
        return null;
    }

    /**
     * The UserName in Windows to run the entrypoint of the container process.
     * <p>
     * Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.
     * <p>
     * Default: the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRunAsUserName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersSecurityContextWindowsOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersSecurityContextWindowsOptions}
     */
    public static final class Builder {
        private java.lang.String gmsaCredentialSpec;
        private java.lang.String gmsaCredentialSpecName;
        private java.lang.String runAsUserName;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContextWindowsOptions#getGmsaCredentialSpec}
         * @param gmsaCredentialSpec GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
         * @return {@code this}
         */
        public Builder gmsaCredentialSpec(java.lang.String gmsaCredentialSpec) {
            this.gmsaCredentialSpec = gmsaCredentialSpec;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContextWindowsOptions#getGmsaCredentialSpecName}
         * @param gmsaCredentialSpecName GMSACredentialSpecName is the name of the GMSA credential spec to use.
         *                               This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
         * @return {@code this}
         */
        public Builder gmsaCredentialSpecName(java.lang.String gmsaCredentialSpecName) {
            this.gmsaCredentialSpecName = gmsaCredentialSpecName;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContextWindowsOptions#getRunAsUserName}
         * @param runAsUserName The UserName in Windows to run the entrypoint of the container process.
         *                      Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.
         * @return {@code this}
         */
        public Builder runAsUserName(java.lang.String runAsUserName) {
            this.runAsUserName = runAsUserName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersSecurityContextWindowsOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersSecurityContextWindowsOptions build() {
            return new Jsii$Proxy(gmsaCredentialSpec, gmsaCredentialSpecName, runAsUserName);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersSecurityContextWindowsOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersSecurityContextWindowsOptions {
        private final java.lang.String gmsaCredentialSpec;
        private final java.lang.String gmsaCredentialSpecName;
        private final java.lang.String runAsUserName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.gmsaCredentialSpec = this.jsiiGet("gmsaCredentialSpec", java.lang.String.class);
            this.gmsaCredentialSpecName = this.jsiiGet("gmsaCredentialSpecName", java.lang.String.class);
            this.runAsUserName = this.jsiiGet("runAsUserName", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String gmsaCredentialSpec, final java.lang.String gmsaCredentialSpecName, final java.lang.String runAsUserName) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.gmsaCredentialSpec = gmsaCredentialSpec;
            this.gmsaCredentialSpecName = gmsaCredentialSpecName;
            this.runAsUserName = runAsUserName;
        }

        @Override
        public java.lang.String getGmsaCredentialSpec() {
            return this.gmsaCredentialSpec;
        }

        @Override
        public java.lang.String getGmsaCredentialSpecName() {
            return this.gmsaCredentialSpecName;
        }

        @Override
        public java.lang.String getRunAsUserName() {
            return this.runAsUserName;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getGmsaCredentialSpec() != null) {
                data.set("gmsaCredentialSpec", om.valueToTree(this.getGmsaCredentialSpec()));
            }
            if (this.getGmsaCredentialSpecName() != null) {
                data.set("gmsaCredentialSpecName", om.valueToTree(this.getGmsaCredentialSpecName()));
            }
            if (this.getRunAsUserName() != null) {
                data.set("runAsUserName", om.valueToTree(this.getRunAsUserName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersSecurityContextWindowsOptions.Jsii$Proxy that = (JenkinsSpecMasterContainersSecurityContextWindowsOptions.Jsii$Proxy) o;

            if (this.gmsaCredentialSpec != null ? !this.gmsaCredentialSpec.equals(that.gmsaCredentialSpec) : that.gmsaCredentialSpec != null) return false;
            if (this.gmsaCredentialSpecName != null ? !this.gmsaCredentialSpecName.equals(that.gmsaCredentialSpecName) : that.gmsaCredentialSpecName != null) return false;
            return this.runAsUserName != null ? this.runAsUserName.equals(that.runAsUserName) : that.runAsUserName == null;
        }

        @Override
        public int hashCode() {
            int result = this.gmsaCredentialSpec != null ? this.gmsaCredentialSpec.hashCode() : 0;
            result = 31 * result + (this.gmsaCredentialSpecName != null ? this.gmsaCredentialSpecName.hashCode() : 0);
            result = 31 * result + (this.runAsUserName != null ? this.runAsUserName.hashCode() : 0);
            return result;
        }
    }
}
