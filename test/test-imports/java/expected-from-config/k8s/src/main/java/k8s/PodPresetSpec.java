package k8s;

/**
 * PodPresetSpec is a description of a pod preset.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.349Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PodPresetSpec")
@software.amazon.jsii.Jsii.Proxy(PodPresetSpec.Jsii$Proxy.class)
public interface PodPresetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Env defines the collection of EnvVar to inject into containers.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.EnvVar> getEnv() {
        return null;
    }

    /**
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.EnvFromSource> getEnvFrom() {
        return null;
    }

    /**
     * Selector is a label query over a set of resources, in this case pods.
     * <p>
     * Required.
     */
    default @org.jetbrains.annotations.Nullable k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.VolumeMount> getVolumeMounts() {
        return null;
    }

    /**
     * Volumes defines the collection of Volume to inject into the pod.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.Volume> getVolumes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodPresetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodPresetSpec}
     */
    public static final class Builder {
        private java.util.List<k8s.EnvVar> env;
        private java.util.List<k8s.EnvFromSource> envFrom;
        private k8s.LabelSelector selector;
        private java.util.List<k8s.VolumeMount> volumeMounts;
        private java.util.List<k8s.Volume> volumes;

        /**
         * Sets the value of {@link PodPresetSpec#getEnv}
         * @param env Env defines the collection of EnvVar to inject into containers.
         * @return {@code this}
         */
        public Builder env(java.util.List<k8s.EnvVar> env) {
            this.env = env;
            return this;
        }

        /**
         * Sets the value of {@link PodPresetSpec#getEnvFrom}
         * @param envFrom EnvFrom defines the collection of EnvFromSource to inject into containers.
         * @return {@code this}
         */
        public Builder envFrom(java.util.List<k8s.EnvFromSource> envFrom) {
            this.envFrom = envFrom;
            return this;
        }

        /**
         * Sets the value of {@link PodPresetSpec#getSelector}
         * @param selector Selector is a label query over a set of resources, in this case pods.
         *                 Required.
         * @return {@code this}
         */
        public Builder selector(k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link PodPresetSpec#getVolumeMounts}
         * @param volumeMounts VolumeMounts defines the collection of VolumeMount to inject into containers.
         * @return {@code this}
         */
        public Builder volumeMounts(java.util.List<k8s.VolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        /**
         * Sets the value of {@link PodPresetSpec#getVolumes}
         * @param volumes Volumes defines the collection of Volume to inject into the pod.
         * @return {@code this}
         */
        public Builder volumes(java.util.List<k8s.Volume> volumes) {
            this.volumes = volumes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodPresetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PodPresetSpec build() {
            return new Jsii$Proxy(env, envFrom, selector, volumeMounts, volumes);
        }
    }

    /**
     * An implementation for {@link PodPresetSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodPresetSpec {
        private final java.util.List<k8s.EnvVar> env;
        private final java.util.List<k8s.EnvFromSource> envFrom;
        private final k8s.LabelSelector selector;
        private final java.util.List<k8s.VolumeMount> volumeMounts;
        private final java.util.List<k8s.Volume> volumes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.env = this.jsiiGet("env", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.EnvVar.class)));
            this.envFrom = this.jsiiGet("envFrom", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.EnvFromSource.class)));
            this.selector = this.jsiiGet("selector", k8s.LabelSelector.class);
            this.volumeMounts = this.jsiiGet("volumeMounts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.VolumeMount.class)));
            this.volumes = this.jsiiGet("volumes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.Volume.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.EnvVar> env, final java.util.List<k8s.EnvFromSource> envFrom, final k8s.LabelSelector selector, final java.util.List<k8s.VolumeMount> volumeMounts, final java.util.List<k8s.Volume> volumes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.env = env;
            this.envFrom = envFrom;
            this.selector = selector;
            this.volumeMounts = volumeMounts;
            this.volumes = volumes;
        }

        @Override
        public java.util.List<k8s.EnvVar> getEnv() {
            return this.env;
        }

        @Override
        public java.util.List<k8s.EnvFromSource> getEnvFrom() {
            return this.envFrom;
        }

        @Override
        public k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public java.util.List<k8s.VolumeMount> getVolumeMounts() {
            return this.volumeMounts;
        }

        @Override
        public java.util.List<k8s.Volume> getVolumes() {
            return this.volumes;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEnv() != null) {
                data.set("env", om.valueToTree(this.getEnv()));
            }
            if (this.getEnvFrom() != null) {
                data.set("envFrom", om.valueToTree(this.getEnvFrom()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getVolumeMounts() != null) {
                data.set("volumeMounts", om.valueToTree(this.getVolumeMounts()));
            }
            if (this.getVolumes() != null) {
                data.set("volumes", om.valueToTree(this.getVolumes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodPresetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodPresetSpec.Jsii$Proxy that = (PodPresetSpec.Jsii$Proxy) o;

            if (this.env != null ? !this.env.equals(that.env) : that.env != null) return false;
            if (this.envFrom != null ? !this.envFrom.equals(that.envFrom) : that.envFrom != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            if (this.volumeMounts != null ? !this.volumeMounts.equals(that.volumeMounts) : that.volumeMounts != null) return false;
            return this.volumes != null ? this.volumes.equals(that.volumes) : that.volumes == null;
        }

        @Override
        public int hashCode() {
            int result = this.env != null ? this.env.hashCode() : 0;
            result = 31 * result + (this.envFrom != null ? this.envFrom.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.volumeMounts != null ? this.volumeMounts.hashCode() : 0);
            result = 31 * result + (this.volumes != null ? this.volumes.hashCode() : 0);
            return result;
        }
    }
}
