package k8s;

/**
 * volumeDevice describes a mapping of a raw block device within a container.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.472Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.VolumeDevice")
@software.amazon.jsii.Jsii.Proxy(VolumeDevice.Jsii$Proxy.class)
public interface VolumeDevice extends software.amazon.jsii.JsiiSerializable {

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDevicePath();

    /**
     * name must match the name of a persistentVolumeClaim in the pod.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link VolumeDevice}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeDevice}
     */
    public static final class Builder {
        private java.lang.String devicePath;
        private java.lang.String name;

        /**
         * Sets the value of {@link VolumeDevice#getDevicePath}
         * @param devicePath devicePath is the path inside of the container that the device will be mapped to. This parameter is required.
         * @return {@code this}
         */
        public Builder devicePath(java.lang.String devicePath) {
            this.devicePath = devicePath;
            return this;
        }

        /**
         * Sets the value of {@link VolumeDevice#getName}
         * @param name name must match the name of a persistentVolumeClaim in the pod. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VolumeDevice}
         * @throws NullPointerException if any required attribute was not provided
         */
        public VolumeDevice build() {
            return new Jsii$Proxy(devicePath, name);
        }
    }

    /**
     * An implementation for {@link VolumeDevice}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeDevice {
        private final java.lang.String devicePath;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.devicePath = this.jsiiGet("devicePath", java.lang.String.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String devicePath, final java.lang.String name) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.devicePath = java.util.Objects.requireNonNull(devicePath, "devicePath is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
        }

        @Override
        public java.lang.String getDevicePath() {
            return this.devicePath;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("devicePath", om.valueToTree(this.getDevicePath()));
            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VolumeDevice"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeDevice.Jsii$Proxy that = (VolumeDevice.Jsii$Proxy) o;

            if (!devicePath.equals(that.devicePath)) return false;
            return this.name.equals(that.name);
        }

        @Override
        public int hashCode() {
            int result = this.devicePath.hashCode();
            result = 31 * result + (this.name.hashCode());
            return result;
        }
    }
}
