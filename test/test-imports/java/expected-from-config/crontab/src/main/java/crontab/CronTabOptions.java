package crontab;

/**
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:13.120Z")
@software.amazon.jsii.Jsii(module = crontab.$Module.class, fqn = "crontab.CronTabOptions")
@software.amazon.jsii.Jsii.Proxy(CronTabOptions.Jsii$Proxy.class)
public interface CronTabOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable crontab.CronTabSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronTabOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronTabOptions}
     */
    public static final class Builder {
        private crontab.CronTabSpec spec;

        /**
         * Sets the value of {@link CronTabOptions#getSpec}
         * @param spec the value to be set.
         * @return {@code this}
         */
        public Builder spec(crontab.CronTabSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronTabOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CronTabOptions build() {
            return new Jsii$Proxy(spec);
        }
    }

    /**
     * An implementation for {@link CronTabOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronTabOptions {
        private final crontab.CronTabSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = this.jsiiGet("spec", crontab.CronTabSpec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final crontab.CronTabSpec spec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.spec = spec;
        }

        @Override
        public crontab.CronTabSpec getSpec() {
            return this.spec;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("crontab.CronTabOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronTabOptions.Jsii$Proxy that = (CronTabOptions.Jsii$Proxy) o;

            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public int hashCode() {
            int result = this.spec != null ? this.spec.hashCode() : 0;
            return result;
        }
    }
}
