package crontab;

/**
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:13.126Z")
@software.amazon.jsii.Jsii(module = crontab.$Module.class, fqn = "crontab.CronTabSpec")
@software.amazon.jsii.Jsii.Proxy(CronTabSpec.Jsii$Proxy.class)
public interface CronTabSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCronSpec() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImage() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronTabSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronTabSpec}
     */
    public static final class Builder {
        private java.lang.String cronSpec;
        private java.lang.String image;
        private java.lang.Number replicas;

        /**
         * Sets the value of {@link CronTabSpec#getCronSpec}
         * @param cronSpec the value to be set.
         * @return {@code this}
         */
        public Builder cronSpec(java.lang.String cronSpec) {
            this.cronSpec = cronSpec;
            return this;
        }

        /**
         * Sets the value of {@link CronTabSpec#getImage}
         * @param image the value to be set.
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link CronTabSpec#getReplicas}
         * @param replicas the value to be set.
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronTabSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CronTabSpec build() {
            return new Jsii$Proxy(cronSpec, image, replicas);
        }
    }

    /**
     * An implementation for {@link CronTabSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronTabSpec {
        private final java.lang.String cronSpec;
        private final java.lang.String image;
        private final java.lang.Number replicas;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cronSpec = this.jsiiGet("cronSpec", java.lang.String.class);
            this.image = this.jsiiGet("image", java.lang.String.class);
            this.replicas = this.jsiiGet("replicas", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String cronSpec, final java.lang.String image, final java.lang.Number replicas) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cronSpec = cronSpec;
            this.image = image;
            this.replicas = replicas;
        }

        @Override
        public java.lang.String getCronSpec() {
            return this.cronSpec;
        }

        @Override
        public java.lang.String getImage() {
            return this.image;
        }

        @Override
        public java.lang.Number getReplicas() {
            return this.replicas;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCronSpec() != null) {
                data.set("cronSpec", om.valueToTree(this.getCronSpec()));
            }
            if (this.getImage() != null) {
                data.set("image", om.valueToTree(this.getImage()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("crontab.CronTabSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronTabSpec.Jsii$Proxy that = (CronTabSpec.Jsii$Proxy) o;

            if (this.cronSpec != null ? !this.cronSpec.equals(that.cronSpec) : that.cronSpec != null) return false;
            if (this.image != null ? !this.image.equals(that.image) : that.image != null) return false;
            return this.replicas != null ? this.replicas.equals(that.replicas) : that.replicas == null;
        }

        @Override
        public int hashCode() {
            int result = this.cronSpec != null ? this.cronSpec.hashCode() : 0;
            result = 31 * result + (this.image != null ? this.image.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            return result;
        }
    }
}
