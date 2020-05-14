package k8s;

/**
 * Represents an empty directory for a pod.
 * <p>
 * Empty directory volumes support ownership management and SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.182Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EmptyDirVolumeSource")
@software.amazon.jsii.Jsii.Proxy(EmptyDirVolumeSource.Jsii$Proxy.class)
public interface EmptyDirVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * What type of storage medium should back this directory.
     * <p>
     * The default is "" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMedium() {
        return null;
    }

    /**
     * Total amount of local storage required for this EmptyDir volume.
     * <p>
     * The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
     */
    default @org.jetbrains.annotations.Nullable k8s.Quantity getSizeLimit() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmptyDirVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmptyDirVolumeSource}
     */
    public static final class Builder {
        private java.lang.String medium;
        private k8s.Quantity sizeLimit;

        /**
         * Sets the value of {@link EmptyDirVolumeSource#getMedium}
         * @param medium What type of storage medium should back this directory.
         *               The default is "" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
         * @return {@code this}
         */
        public Builder medium(java.lang.String medium) {
            this.medium = medium;
            return this;
        }

        /**
         * Sets the value of {@link EmptyDirVolumeSource#getSizeLimit}
         * @param sizeLimit Total amount of local storage required for this EmptyDir volume.
         *                  The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
         * @return {@code this}
         */
        public Builder sizeLimit(k8s.Quantity sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EmptyDirVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public EmptyDirVolumeSource build() {
            return new Jsii$Proxy(medium, sizeLimit);
        }
    }

    /**
     * An implementation for {@link EmptyDirVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmptyDirVolumeSource {
        private final java.lang.String medium;
        private final k8s.Quantity sizeLimit;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.medium = this.jsiiGet("medium", java.lang.String.class);
            this.sizeLimit = this.jsiiGet("sizeLimit", k8s.Quantity.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String medium, final k8s.Quantity sizeLimit) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.medium = medium;
            this.sizeLimit = sizeLimit;
        }

        @Override
        public java.lang.String getMedium() {
            return this.medium;
        }

        @Override
        public k8s.Quantity getSizeLimit() {
            return this.sizeLimit;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMedium() != null) {
                data.set("medium", om.valueToTree(this.getMedium()));
            }
            if (this.getSizeLimit() != null) {
                data.set("sizeLimit", om.valueToTree(this.getSizeLimit()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EmptyDirVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmptyDirVolumeSource.Jsii$Proxy that = (EmptyDirVolumeSource.Jsii$Proxy) o;

            if (this.medium != null ? !this.medium.equals(that.medium) : that.medium != null) return false;
            return this.sizeLimit != null ? this.sizeLimit.equals(that.sizeLimit) : that.sizeLimit == null;
        }

        @Override
        public int hashCode() {
            int result = this.medium != null ? this.medium.hashCode() : 0;
            result = 31 * result + (this.sizeLimit != null ? this.sizeLimit.hashCode() : 0);
            return result;
        }
    }
}
