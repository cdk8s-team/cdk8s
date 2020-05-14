package k8s;

/**
 * ControllerRevision implements an immutable snapshot of state data.
 * <p>
 * Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.151Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ControllerRevisionOptions")
@software.amazon.jsii.Jsii.Proxy(ControllerRevisionOptions.Jsii$Proxy.class)
public interface ControllerRevisionOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Revision indicates the revision of the state represented by Data.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getRevision();

    /**
     * Data is the serialized representation of the state.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getData() {
        return null;
    }

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ControllerRevisionOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ControllerRevisionOptions}
     */
    public static final class Builder {
        private java.lang.Number revision;
        private java.lang.Object data;
        private k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link ControllerRevisionOptions#getRevision}
         * @param revision Revision indicates the revision of the state represented by Data. This parameter is required.
         * @return {@code this}
         */
        public Builder revision(java.lang.Number revision) {
            this.revision = revision;
            return this;
        }

        /**
         * Sets the value of {@link ControllerRevisionOptions#getData}
         * @param data Data is the serialized representation of the state.
         * @return {@code this}
         */
        public Builder data(java.lang.Object data) {
            this.data = data;
            return this;
        }

        /**
         * Sets the value of {@link ControllerRevisionOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ControllerRevisionOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ControllerRevisionOptions build() {
            return new Jsii$Proxy(revision, data, metadata);
        }
    }

    /**
     * An implementation for {@link ControllerRevisionOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ControllerRevisionOptions {
        private final java.lang.Number revision;
        private final java.lang.Object data;
        private final k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.revision = this.jsiiGet("revision", java.lang.Number.class);
            this.data = this.jsiiGet("data", java.lang.Object.class);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number revision, final java.lang.Object data, final k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.revision = java.util.Objects.requireNonNull(revision, "revision is required");
            this.data = data;
            this.metadata = metadata;
        }

        @Override
        public java.lang.Number getRevision() {
            return this.revision;
        }

        @Override
        public java.lang.Object getData() {
            return this.data;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("revision", om.valueToTree(this.getRevision()));
            if (this.getData() != null) {
                data.set("data", om.valueToTree(this.getData()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ControllerRevisionOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ControllerRevisionOptions.Jsii$Proxy that = (ControllerRevisionOptions.Jsii$Proxy) o;

            if (!revision.equals(that.revision)) return false;
            if (this.data != null ? !this.data.equals(that.data) : that.data != null) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public int hashCode() {
            int result = this.revision.hashCode();
            result = 31 * result + (this.data != null ? this.data.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
