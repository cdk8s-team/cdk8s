package jenkins;

/**
 * information about the downwardAPI data to project.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.686Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesProjectedSourcesDownwardApi.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesProjectedSourcesDownwardApi extends software.amazon.jsii.JsiiSerializable {

    /**
     * Items is a list of DownwardAPIVolume file.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems> getItems() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesProjectedSourcesDownwardApi}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesProjectedSourcesDownwardApi}
     */
    public static final class Builder {
        private java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems> items;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesProjectedSourcesDownwardApi#getItems}
         * @param items Items is a list of DownwardAPIVolume file.
         * @return {@code this}
         */
        public Builder items(java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems> items) {
            this.items = items;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesProjectedSourcesDownwardApi}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesProjectedSourcesDownwardApi build() {
            return new Jsii$Proxy(items);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesProjectedSourcesDownwardApi}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesProjectedSourcesDownwardApi {
        private final java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems> items;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = this.jsiiGet("items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems> items) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = items;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems> getItems() {
            return this.items;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getItems() != null) {
                data.set("items", om.valueToTree(this.getItems()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesProjectedSourcesDownwardApi.Jsii$Proxy that = (JenkinsSpecMasterVolumesProjectedSourcesDownwardApi.Jsii$Proxy) o;

            return this.items != null ? this.items.equals(that.items) : that.items == null;
        }

        @Override
        public int hashCode() {
            int result = this.items != null ? this.items.hashCode() : 0;
            return result;
        }
    }
}
