package k8s;

/**
 * APIServiceSpec contains information for locating and communicating with a server.
 * <p>
 * Only https is supported, though you are able to disable certificate verification.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.084Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.APIServiceSpec")
@software.amazon.jsii.Jsii.Proxy(APIServiceSpec.Jsii$Proxy.class)
public interface APIServiceSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * GroupPriorityMininum is the priority this group should have at least.
     * <p>
     * Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getGroupPriorityMinimum();

    /**
     * Service is a reference to the service for this API server.
     * <p>
     * It must communicate on port 443 If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
     */
    @org.jetbrains.annotations.NotNull k8s.ServiceReference getService();

    /**
     * VersionPriority controls the ordering of this API version inside of its group.
     * <p>
     * Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getVersionPriority();

    /**
     * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate.
     * <p>
     * If unspecified, system trust roots on the apiserver are used.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCaBundle() {
        return null;
    }

    /**
     * Group is the API group name this server hosts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server.
     * <p>
     * This is strongly discouraged.  You should use the CABundle instead.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInsecureSkipTlsVerify() {
        return null;
    }

    /**
     * Version is the API version this server hosts.
     * <p>
     * For example, "v1"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link APIServiceSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link APIServiceSpec}
     */
    public static final class Builder {
        private java.lang.Number groupPriorityMinimum;
        private k8s.ServiceReference service;
        private java.lang.Number versionPriority;
        private java.lang.String caBundle;
        private java.lang.String group;
        private java.lang.Boolean insecureSkipTlsVerify;
        private java.lang.String version;

        /**
         * Sets the value of {@link APIServiceSpec#getGroupPriorityMinimum}
         * @param groupPriorityMinimum GroupPriorityMininum is the priority this group should have at least. This parameter is required.
         *                             Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
         * @return {@code this}
         */
        public Builder groupPriorityMinimum(java.lang.Number groupPriorityMinimum) {
            this.groupPriorityMinimum = groupPriorityMinimum;
            return this;
        }

        /**
         * Sets the value of {@link APIServiceSpec#getService}
         * @param service Service is a reference to the service for this API server. This parameter is required.
         *                It must communicate on port 443 If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
         * @return {@code this}
         */
        public Builder service(k8s.ServiceReference service) {
            this.service = service;
            return this;
        }

        /**
         * Sets the value of {@link APIServiceSpec#getVersionPriority}
         * @param versionPriority VersionPriority controls the ordering of this API version inside of its group. This parameter is required.
         *                        Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
         * @return {@code this}
         */
        public Builder versionPriority(java.lang.Number versionPriority) {
            this.versionPriority = versionPriority;
            return this;
        }

        /**
         * Sets the value of {@link APIServiceSpec#getCaBundle}
         * @param caBundle CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate.
         *                 If unspecified, system trust roots on the apiserver are used.
         * @return {@code this}
         */
        public Builder caBundle(java.lang.String caBundle) {
            this.caBundle = caBundle;
            return this;
        }

        /**
         * Sets the value of {@link APIServiceSpec#getGroup}
         * @param group Group is the API group name this server hosts.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link APIServiceSpec#getInsecureSkipTlsVerify}
         * @param insecureSkipTlsVerify InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server.
         *                              This is strongly discouraged.  You should use the CABundle instead.
         * @return {@code this}
         */
        public Builder insecureSkipTlsVerify(java.lang.Boolean insecureSkipTlsVerify) {
            this.insecureSkipTlsVerify = insecureSkipTlsVerify;
            return this;
        }

        /**
         * Sets the value of {@link APIServiceSpec#getVersion}
         * @param version Version is the API version this server hosts.
         *                For example, "v1"
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link APIServiceSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public APIServiceSpec build() {
            return new Jsii$Proxy(groupPriorityMinimum, service, versionPriority, caBundle, group, insecureSkipTlsVerify, version);
        }
    }

    /**
     * An implementation for {@link APIServiceSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements APIServiceSpec {
        private final java.lang.Number groupPriorityMinimum;
        private final k8s.ServiceReference service;
        private final java.lang.Number versionPriority;
        private final java.lang.String caBundle;
        private final java.lang.String group;
        private final java.lang.Boolean insecureSkipTlsVerify;
        private final java.lang.String version;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.groupPriorityMinimum = this.jsiiGet("groupPriorityMinimum", java.lang.Number.class);
            this.service = this.jsiiGet("service", k8s.ServiceReference.class);
            this.versionPriority = this.jsiiGet("versionPriority", java.lang.Number.class);
            this.caBundle = this.jsiiGet("caBundle", java.lang.String.class);
            this.group = this.jsiiGet("group", java.lang.String.class);
            this.insecureSkipTlsVerify = this.jsiiGet("insecureSkipTLSVerify", java.lang.Boolean.class);
            this.version = this.jsiiGet("version", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number groupPriorityMinimum, final k8s.ServiceReference service, final java.lang.Number versionPriority, final java.lang.String caBundle, final java.lang.String group, final java.lang.Boolean insecureSkipTlsVerify, final java.lang.String version) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.groupPriorityMinimum = java.util.Objects.requireNonNull(groupPriorityMinimum, "groupPriorityMinimum is required");
            this.service = java.util.Objects.requireNonNull(service, "service is required");
            this.versionPriority = java.util.Objects.requireNonNull(versionPriority, "versionPriority is required");
            this.caBundle = caBundle;
            this.group = group;
            this.insecureSkipTlsVerify = insecureSkipTlsVerify;
            this.version = version;
        }

        @Override
        public java.lang.Number getGroupPriorityMinimum() {
            return this.groupPriorityMinimum;
        }

        @Override
        public k8s.ServiceReference getService() {
            return this.service;
        }

        @Override
        public java.lang.Number getVersionPriority() {
            return this.versionPriority;
        }

        @Override
        public java.lang.String getCaBundle() {
            return this.caBundle;
        }

        @Override
        public java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public java.lang.Boolean getInsecureSkipTlsVerify() {
            return this.insecureSkipTlsVerify;
        }

        @Override
        public java.lang.String getVersion() {
            return this.version;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("groupPriorityMinimum", om.valueToTree(this.getGroupPriorityMinimum()));
            data.set("service", om.valueToTree(this.getService()));
            data.set("versionPriority", om.valueToTree(this.getVersionPriority()));
            if (this.getCaBundle() != null) {
                data.set("caBundle", om.valueToTree(this.getCaBundle()));
            }
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getInsecureSkipTlsVerify() != null) {
                data.set("insecureSkipTLSVerify", om.valueToTree(this.getInsecureSkipTlsVerify()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.APIServiceSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            APIServiceSpec.Jsii$Proxy that = (APIServiceSpec.Jsii$Proxy) o;

            if (!groupPriorityMinimum.equals(that.groupPriorityMinimum)) return false;
            if (!service.equals(that.service)) return false;
            if (!versionPriority.equals(that.versionPriority)) return false;
            if (this.caBundle != null ? !this.caBundle.equals(that.caBundle) : that.caBundle != null) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.insecureSkipTlsVerify != null ? !this.insecureSkipTlsVerify.equals(that.insecureSkipTlsVerify) : that.insecureSkipTlsVerify != null) return false;
            return this.version != null ? this.version.equals(that.version) : that.version == null;
        }

        @Override
        public int hashCode() {
            int result = this.groupPriorityMinimum.hashCode();
            result = 31 * result + (this.service.hashCode());
            result = 31 * result + (this.versionPriority.hashCode());
            result = 31 * result + (this.caBundle != null ? this.caBundle.hashCode() : 0);
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.insecureSkipTlsVerify != null ? this.insecureSkipTlsVerify.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            return result;
        }
    }
}
