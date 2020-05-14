package k8s;

/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.287Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ManagedFieldsEntry")
@software.amazon.jsii.Jsii.Proxy(ManagedFieldsEntry.Jsii$Proxy.class)
public interface ManagedFieldsEntry extends software.amazon.jsii.JsiiSerializable {

    /**
     * APIVersion defines the version of this resource that this field set applies to.
     * <p>
     * The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiVersion() {
        return null;
    }

    /**
     * FieldsType is the discriminator for the different fields format and version.
     * <p>
     * There is currently only one possible value: "FieldsV1"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFieldsType() {
        return null;
    }

    /**
     * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getFieldsV1() {
        return null;
    }

    /**
     * Manager is an identifier of the workflow managing these fields.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getManager() {
        return null;
    }

    /**
     * Operation is the type of operation which lead to this ManagedFieldsEntry being created.
     * <p>
     * The only valid values for this field are 'Apply' and 'Update'.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOperation() {
        return null;
    }

    /**
     * Time is timestamp of when these fields were set.
     * <p>
     * It should always be empty if Operation is 'Apply'
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ManagedFieldsEntry}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ManagedFieldsEntry}
     */
    public static final class Builder {
        private java.lang.String apiVersion;
        private java.lang.String fieldsType;
        private java.lang.Object fieldsV1;
        private java.lang.String manager;
        private java.lang.String operation;
        private java.time.Instant time;

        /**
         * Sets the value of {@link ManagedFieldsEntry#getApiVersion}
         * @param apiVersion APIVersion defines the version of this resource that this field set applies to.
         *                   The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getFieldsType}
         * @param fieldsType FieldsType is the discriminator for the different fields format and version.
         *                   There is currently only one possible value: "FieldsV1"
         * @return {@code this}
         */
        public Builder fieldsType(java.lang.String fieldsType) {
            this.fieldsType = fieldsType;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getFieldsV1}
         * @param fieldsV1 FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
         * @return {@code this}
         */
        public Builder fieldsV1(java.lang.Object fieldsV1) {
            this.fieldsV1 = fieldsV1;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getManager}
         * @param manager Manager is an identifier of the workflow managing these fields.
         * @return {@code this}
         */
        public Builder manager(java.lang.String manager) {
            this.manager = manager;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getOperation}
         * @param operation Operation is the type of operation which lead to this ManagedFieldsEntry being created.
         *                  The only valid values for this field are 'Apply' and 'Update'.
         * @return {@code this}
         */
        public Builder operation(java.lang.String operation) {
            this.operation = operation;
            return this;
        }

        /**
         * Sets the value of {@link ManagedFieldsEntry#getTime}
         * @param time Time is timestamp of when these fields were set.
         *             It should always be empty if Operation is 'Apply'
         * @return {@code this}
         */
        public Builder time(java.time.Instant time) {
            this.time = time;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ManagedFieldsEntry}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ManagedFieldsEntry build() {
            return new Jsii$Proxy(apiVersion, fieldsType, fieldsV1, manager, operation, time);
        }
    }

    /**
     * An implementation for {@link ManagedFieldsEntry}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ManagedFieldsEntry {
        private final java.lang.String apiVersion;
        private final java.lang.String fieldsType;
        private final java.lang.Object fieldsV1;
        private final java.lang.String manager;
        private final java.lang.String operation;
        private final java.time.Instant time;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = this.jsiiGet("apiVersion", java.lang.String.class);
            this.fieldsType = this.jsiiGet("fieldsType", java.lang.String.class);
            this.fieldsV1 = this.jsiiGet("fieldsV1", java.lang.Object.class);
            this.manager = this.jsiiGet("manager", java.lang.String.class);
            this.operation = this.jsiiGet("operation", java.lang.String.class);
            this.time = this.jsiiGet("time", java.time.Instant.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String apiVersion, final java.lang.String fieldsType, final java.lang.Object fieldsV1, final java.lang.String manager, final java.lang.String operation, final java.time.Instant time) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = apiVersion;
            this.fieldsType = fieldsType;
            this.fieldsV1 = fieldsV1;
            this.manager = manager;
            this.operation = operation;
            this.time = time;
        }

        @Override
        public java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public java.lang.String getFieldsType() {
            return this.fieldsType;
        }

        @Override
        public java.lang.Object getFieldsV1() {
            return this.fieldsV1;
        }

        @Override
        public java.lang.String getManager() {
            return this.manager;
        }

        @Override
        public java.lang.String getOperation() {
            return this.operation;
        }

        @Override
        public java.time.Instant getTime() {
            return this.time;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApiVersion() != null) {
                data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            }
            if (this.getFieldsType() != null) {
                data.set("fieldsType", om.valueToTree(this.getFieldsType()));
            }
            if (this.getFieldsV1() != null) {
                data.set("fieldsV1", om.valueToTree(this.getFieldsV1()));
            }
            if (this.getManager() != null) {
                data.set("manager", om.valueToTree(this.getManager()));
            }
            if (this.getOperation() != null) {
                data.set("operation", om.valueToTree(this.getOperation()));
            }
            if (this.getTime() != null) {
                data.set("time", om.valueToTree(this.getTime()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ManagedFieldsEntry"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ManagedFieldsEntry.Jsii$Proxy that = (ManagedFieldsEntry.Jsii$Proxy) o;

            if (this.apiVersion != null ? !this.apiVersion.equals(that.apiVersion) : that.apiVersion != null) return false;
            if (this.fieldsType != null ? !this.fieldsType.equals(that.fieldsType) : that.fieldsType != null) return false;
            if (this.fieldsV1 != null ? !this.fieldsV1.equals(that.fieldsV1) : that.fieldsV1 != null) return false;
            if (this.manager != null ? !this.manager.equals(that.manager) : that.manager != null) return false;
            if (this.operation != null ? !this.operation.equals(that.operation) : that.operation != null) return false;
            return this.time != null ? this.time.equals(that.time) : that.time == null;
        }

        @Override
        public int hashCode() {
            int result = this.apiVersion != null ? this.apiVersion.hashCode() : 0;
            result = 31 * result + (this.fieldsType != null ? this.fieldsType.hashCode() : 0);
            result = 31 * result + (this.fieldsV1 != null ? this.fieldsV1.hashCode() : 0);
            result = 31 * result + (this.manager != null ? this.manager.hashCode() : 0);
            result = 31 * result + (this.operation != null ? this.operation.hashCode() : 0);
            result = 31 * result + (this.time != null ? this.time.hashCode() : 0);
            return result;
        }
    }
}
