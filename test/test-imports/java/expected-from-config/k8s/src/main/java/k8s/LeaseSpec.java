package k8s;

/**
 * LeaseSpec is a specification of a Lease.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.276Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.LeaseSpec")
@software.amazon.jsii.Jsii.Proxy(LeaseSpec.Jsii$Proxy.class)
public interface LeaseSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * acquireTime is a time when the current lease was acquired.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getAcquireTime() {
        return null;
    }

    /**
     * holderIdentity contains the identity of the holder of a current lease.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHolderIdentity() {
        return null;
    }

    /**
     * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it.
     * <p>
     * This is measure against time of last observed RenewTime.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getLeaseDurationSeconds() {
        return null;
    }

    /**
     * leaseTransitions is the number of transitions of a lease between holders.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getLeaseTransitions() {
        return null;
    }

    /**
     * renewTime is a time when the current holder of a lease has last updated the lease.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getRenewTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LeaseSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LeaseSpec}
     */
    public static final class Builder {
        private java.time.Instant acquireTime;
        private java.lang.String holderIdentity;
        private java.lang.Number leaseDurationSeconds;
        private java.lang.Number leaseTransitions;
        private java.time.Instant renewTime;

        /**
         * Sets the value of {@link LeaseSpec#getAcquireTime}
         * @param acquireTime acquireTime is a time when the current lease was acquired.
         * @return {@code this}
         */
        public Builder acquireTime(java.time.Instant acquireTime) {
            this.acquireTime = acquireTime;
            return this;
        }

        /**
         * Sets the value of {@link LeaseSpec#getHolderIdentity}
         * @param holderIdentity holderIdentity contains the identity of the holder of a current lease.
         * @return {@code this}
         */
        public Builder holderIdentity(java.lang.String holderIdentity) {
            this.holderIdentity = holderIdentity;
            return this;
        }

        /**
         * Sets the value of {@link LeaseSpec#getLeaseDurationSeconds}
         * @param leaseDurationSeconds leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it.
         *                             This is measure against time of last observed RenewTime.
         * @return {@code this}
         */
        public Builder leaseDurationSeconds(java.lang.Number leaseDurationSeconds) {
            this.leaseDurationSeconds = leaseDurationSeconds;
            return this;
        }

        /**
         * Sets the value of {@link LeaseSpec#getLeaseTransitions}
         * @param leaseTransitions leaseTransitions is the number of transitions of a lease between holders.
         * @return {@code this}
         */
        public Builder leaseTransitions(java.lang.Number leaseTransitions) {
            this.leaseTransitions = leaseTransitions;
            return this;
        }

        /**
         * Sets the value of {@link LeaseSpec#getRenewTime}
         * @param renewTime renewTime is a time when the current holder of a lease has last updated the lease.
         * @return {@code this}
         */
        public Builder renewTime(java.time.Instant renewTime) {
            this.renewTime = renewTime;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LeaseSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public LeaseSpec build() {
            return new Jsii$Proxy(acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, renewTime);
        }
    }

    /**
     * An implementation for {@link LeaseSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LeaseSpec {
        private final java.time.Instant acquireTime;
        private final java.lang.String holderIdentity;
        private final java.lang.Number leaseDurationSeconds;
        private final java.lang.Number leaseTransitions;
        private final java.time.Instant renewTime;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.acquireTime = this.jsiiGet("acquireTime", java.time.Instant.class);
            this.holderIdentity = this.jsiiGet("holderIdentity", java.lang.String.class);
            this.leaseDurationSeconds = this.jsiiGet("leaseDurationSeconds", java.lang.Number.class);
            this.leaseTransitions = this.jsiiGet("leaseTransitions", java.lang.Number.class);
            this.renewTime = this.jsiiGet("renewTime", java.time.Instant.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.time.Instant acquireTime, final java.lang.String holderIdentity, final java.lang.Number leaseDurationSeconds, final java.lang.Number leaseTransitions, final java.time.Instant renewTime) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.acquireTime = acquireTime;
            this.holderIdentity = holderIdentity;
            this.leaseDurationSeconds = leaseDurationSeconds;
            this.leaseTransitions = leaseTransitions;
            this.renewTime = renewTime;
        }

        @Override
        public java.time.Instant getAcquireTime() {
            return this.acquireTime;
        }

        @Override
        public java.lang.String getHolderIdentity() {
            return this.holderIdentity;
        }

        @Override
        public java.lang.Number getLeaseDurationSeconds() {
            return this.leaseDurationSeconds;
        }

        @Override
        public java.lang.Number getLeaseTransitions() {
            return this.leaseTransitions;
        }

        @Override
        public java.time.Instant getRenewTime() {
            return this.renewTime;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAcquireTime() != null) {
                data.set("acquireTime", om.valueToTree(this.getAcquireTime()));
            }
            if (this.getHolderIdentity() != null) {
                data.set("holderIdentity", om.valueToTree(this.getHolderIdentity()));
            }
            if (this.getLeaseDurationSeconds() != null) {
                data.set("leaseDurationSeconds", om.valueToTree(this.getLeaseDurationSeconds()));
            }
            if (this.getLeaseTransitions() != null) {
                data.set("leaseTransitions", om.valueToTree(this.getLeaseTransitions()));
            }
            if (this.getRenewTime() != null) {
                data.set("renewTime", om.valueToTree(this.getRenewTime()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.LeaseSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LeaseSpec.Jsii$Proxy that = (LeaseSpec.Jsii$Proxy) o;

            if (this.acquireTime != null ? !this.acquireTime.equals(that.acquireTime) : that.acquireTime != null) return false;
            if (this.holderIdentity != null ? !this.holderIdentity.equals(that.holderIdentity) : that.holderIdentity != null) return false;
            if (this.leaseDurationSeconds != null ? !this.leaseDurationSeconds.equals(that.leaseDurationSeconds) : that.leaseDurationSeconds != null) return false;
            if (this.leaseTransitions != null ? !this.leaseTransitions.equals(that.leaseTransitions) : that.leaseTransitions != null) return false;
            return this.renewTime != null ? this.renewTime.equals(that.renewTime) : that.renewTime == null;
        }

        @Override
        public int hashCode() {
            int result = this.acquireTime != null ? this.acquireTime.hashCode() : 0;
            result = 31 * result + (this.holderIdentity != null ? this.holderIdentity.hashCode() : 0);
            result = 31 * result + (this.leaseDurationSeconds != null ? this.leaseDurationSeconds.hashCode() : 0);
            result = 31 * result + (this.leaseTransitions != null ? this.leaseTransitions.hashCode() : 0);
            result = 31 * result + (this.renewTime != null ? this.renewTime.hashCode() : 0);
            return result;
        }
    }
}
