package k8s;

/**
 * This information is immutable after the request is created.
 * <p>
 * Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.116Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CertificateSigningRequestSpec")
@software.amazon.jsii.Jsii.Proxy(CertificateSigningRequestSpec.Jsii$Proxy.class)
public interface CertificateSigningRequestSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Base64-encoded PKCS#10 CSR data.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRequest();

    /**
     * Extra information about the requesting user.
     * <p>
     * See user.Info interface for details.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.util.List<java.lang.String>> getExtra() {
        return null;
    }

    /**
     * Group information about the requesting user.
     * <p>
     * See user.Info interface for details.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGroups() {
        return null;
    }

    /**
     * UID information about the requesting user.
     * <p>
     * See user.Info interface for details.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    /**
     * allowedUsages specifies a set of usage contexts the key will be valid for.
     * <p>
     * See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
     * https://tools.ietf.org/html/rfc5280#section-4.2.1.12
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUsages() {
        return null;
    }

    /**
     * Information about the requesting user.
     * <p>
     * See user.Info interface for details.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUsername() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CertificateSigningRequestSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CertificateSigningRequestSpec}
     */
    public static final class Builder {
        private java.lang.String request;
        private java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra;
        private java.util.List<java.lang.String> groups;
        private java.lang.String uid;
        private java.util.List<java.lang.String> usages;
        private java.lang.String username;

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getRequest}
         * @param request Base64-encoded PKCS#10 CSR data. This parameter is required.
         * @return {@code this}
         */
        public Builder request(java.lang.String request) {
            this.request = request;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getExtra}
         * @param extra Extra information about the requesting user.
         *              See user.Info interface for details.
         * @return {@code this}
         */
        public Builder extra(java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra) {
            this.extra = extra;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getGroups}
         * @param groups Group information about the requesting user.
         *               See user.Info interface for details.
         * @return {@code this}
         */
        public Builder groups(java.util.List<java.lang.String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getUid}
         * @param uid UID information about the requesting user.
         *            See user.Info interface for details.
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getUsages}
         * @param usages allowedUsages specifies a set of usage contexts the key will be valid for.
         *               See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
         *               https://tools.ietf.org/html/rfc5280#section-4.2.1.12
         * @return {@code this}
         */
        public Builder usages(java.util.List<java.lang.String> usages) {
            this.usages = usages;
            return this;
        }

        /**
         * Sets the value of {@link CertificateSigningRequestSpec#getUsername}
         * @param username Information about the requesting user.
         *                 See user.Info interface for details.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CertificateSigningRequestSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CertificateSigningRequestSpec build() {
            return new Jsii$Proxy(request, extra, groups, uid, usages, username);
        }
    }

    /**
     * An implementation for {@link CertificateSigningRequestSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CertificateSigningRequestSpec {
        private final java.lang.String request;
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra;
        private final java.util.List<java.lang.String> groups;
        private final java.lang.String uid;
        private final java.util.List<java.lang.String> usages;
        private final java.lang.String username;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.request = this.jsiiGet("request", java.lang.String.class);
            this.extra = this.jsiiGet("extra", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
            this.groups = this.jsiiGet("groups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.uid = this.jsiiGet("uid", java.lang.String.class);
            this.usages = this.jsiiGet("usages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.username = this.jsiiGet("username", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String request, final java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra, final java.util.List<java.lang.String> groups, final java.lang.String uid, final java.util.List<java.lang.String> usages, final java.lang.String username) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.request = java.util.Objects.requireNonNull(request, "request is required");
            this.extra = extra;
            this.groups = groups;
            this.uid = uid;
            this.usages = usages;
            this.username = username;
        }

        @Override
        public java.lang.String getRequest() {
            return this.request;
        }

        @Override
        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getExtra() {
            return this.extra;
        }

        @Override
        public java.util.List<java.lang.String> getGroups() {
            return this.groups;
        }

        @Override
        public java.lang.String getUid() {
            return this.uid;
        }

        @Override
        public java.util.List<java.lang.String> getUsages() {
            return this.usages;
        }

        @Override
        public java.lang.String getUsername() {
            return this.username;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("request", om.valueToTree(this.getRequest()));
            if (this.getExtra() != null) {
                data.set("extra", om.valueToTree(this.getExtra()));
            }
            if (this.getGroups() != null) {
                data.set("groups", om.valueToTree(this.getGroups()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }
            if (this.getUsages() != null) {
                data.set("usages", om.valueToTree(this.getUsages()));
            }
            if (this.getUsername() != null) {
                data.set("username", om.valueToTree(this.getUsername()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CertificateSigningRequestSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CertificateSigningRequestSpec.Jsii$Proxy that = (CertificateSigningRequestSpec.Jsii$Proxy) o;

            if (!request.equals(that.request)) return false;
            if (this.extra != null ? !this.extra.equals(that.extra) : that.extra != null) return false;
            if (this.groups != null ? !this.groups.equals(that.groups) : that.groups != null) return false;
            if (this.uid != null ? !this.uid.equals(that.uid) : that.uid != null) return false;
            if (this.usages != null ? !this.usages.equals(that.usages) : that.usages != null) return false;
            return this.username != null ? this.username.equals(that.username) : that.username == null;
        }

        @Override
        public int hashCode() {
            int result = this.request.hashCode();
            result = 31 * result + (this.extra != null ? this.extra.hashCode() : 0);
            result = 31 * result + (this.groups != null ? this.groups.hashCode() : 0);
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            result = 31 * result + (this.usages != null ? this.usages.hashCode() : 0);
            result = 31 * result + (this.username != null ? this.username.hashCode() : 0);
            return result;
        }
    }
}
