package k8s;

/**
 * Event is a report of an event somewhere in the cluster.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.216Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EventOptions")
@software.amazon.jsii.Jsii.Proxy(EventOptions.Jsii$Proxy.class)
public interface EventOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * The object that this event is about.
     */
    @org.jetbrains.annotations.NotNull k8s.ObjectReference getInvolvedObject();

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    @org.jetbrains.annotations.NotNull k8s.ObjectMeta getMetadata();

    /**
     * What action was taken/failed regarding to the Regarding object.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAction() {
        return null;
    }

    /**
     * The number of times this event has occurred.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCount() {
        return null;
    }

    /**
     * Time when this Event was first observed.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getEventTime() {
        return null;
    }

    /**
     * The time at which the event was first recorded.
     * <p>
     * (Time of server receipt is in TypeMeta.)
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getFirstTimestamp() {
        return null;
    }

    /**
     * The time at which the most recent occurrence of this event was recorded.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getLastTimestamp() {
        return null;
    }

    /**
     * A human-readable description of the status of this operation.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessage() {
        return null;
    }

    /**
     * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReason() {
        return null;
    }

    /**
     * Optional secondary object for more complex actions.
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectReference getRelated() {
        return null;
    }

    /**
     * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReportingComponent() {
        return null;
    }

    /**
     * ID of the controller instance, e.g. `kubelet-xyzf`.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReportingInstance() {
        return null;
    }

    /**
     * Data about the Event series this event represents or nil if it's a singleton Event.
     */
    default @org.jetbrains.annotations.Nullable k8s.EventSeries getSeries() {
        return null;
    }

    /**
     * The component reporting this event.
     * <p>
     * Should be a short machine understandable string.
     */
    default @org.jetbrains.annotations.Nullable k8s.EventSource getSource() {
        return null;
    }

    /**
     * Type of this event (Normal, Warning), new types could be added in the future.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EventOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EventOptions}
     */
    public static final class Builder {
        private k8s.ObjectReference involvedObject;
        private k8s.ObjectMeta metadata;
        private java.lang.String action;
        private java.lang.Number count;
        private java.time.Instant eventTime;
        private java.time.Instant firstTimestamp;
        private java.time.Instant lastTimestamp;
        private java.lang.String message;
        private java.lang.String reason;
        private k8s.ObjectReference related;
        private java.lang.String reportingComponent;
        private java.lang.String reportingInstance;
        private k8s.EventSeries series;
        private k8s.EventSource source;
        private java.lang.String type;

        /**
         * Sets the value of {@link EventOptions#getInvolvedObject}
         * @param involvedObject The object that this event is about. This parameter is required.
         * @return {@code this}
         */
        public Builder involvedObject(k8s.ObjectReference involvedObject) {
            this.involvedObject = involvedObject;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getMetadata}
         * @param metadata Standard object's metadata. This parameter is required.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getAction}
         * @param action What action was taken/failed regarding to the Regarding object.
         * @return {@code this}
         */
        public Builder action(java.lang.String action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getCount}
         * @param count The number of times this event has occurred.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getEventTime}
         * @param eventTime Time when this Event was first observed.
         * @return {@code this}
         */
        public Builder eventTime(java.time.Instant eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getFirstTimestamp}
         * @param firstTimestamp The time at which the event was first recorded.
         *                       (Time of server receipt is in TypeMeta.)
         * @return {@code this}
         */
        public Builder firstTimestamp(java.time.Instant firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getLastTimestamp}
         * @param lastTimestamp The time at which the most recent occurrence of this event was recorded.
         * @return {@code this}
         */
        public Builder lastTimestamp(java.time.Instant lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getMessage}
         * @param message A human-readable description of the status of this operation.
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getReason}
         * @param reason This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
         * @return {@code this}
         */
        public Builder reason(java.lang.String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getRelated}
         * @param related Optional secondary object for more complex actions.
         * @return {@code this}
         */
        public Builder related(k8s.ObjectReference related) {
            this.related = related;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getReportingComponent}
         * @param reportingComponent Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
         * @return {@code this}
         */
        public Builder reportingComponent(java.lang.String reportingComponent) {
            this.reportingComponent = reportingComponent;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getReportingInstance}
         * @param reportingInstance ID of the controller instance, e.g. `kubelet-xyzf`.
         * @return {@code this}
         */
        public Builder reportingInstance(java.lang.String reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getSeries}
         * @param series Data about the Event series this event represents or nil if it's a singleton Event.
         * @return {@code this}
         */
        public Builder series(k8s.EventSeries series) {
            this.series = series;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getSource}
         * @param source The component reporting this event.
         *               Should be a short machine understandable string.
         * @return {@code this}
         */
        public Builder source(k8s.EventSource source) {
            this.source = source;
            return this;
        }

        /**
         * Sets the value of {@link EventOptions#getType}
         * @param type Type of this event (Normal, Warning), new types could be added in the future.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EventOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public EventOptions build() {
            return new Jsii$Proxy(involvedObject, metadata, action, count, eventTime, firstTimestamp, lastTimestamp, message, reason, related, reportingComponent, reportingInstance, series, source, type);
        }
    }

    /**
     * An implementation for {@link EventOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EventOptions {
        private final k8s.ObjectReference involvedObject;
        private final k8s.ObjectMeta metadata;
        private final java.lang.String action;
        private final java.lang.Number count;
        private final java.time.Instant eventTime;
        private final java.time.Instant firstTimestamp;
        private final java.time.Instant lastTimestamp;
        private final java.lang.String message;
        private final java.lang.String reason;
        private final k8s.ObjectReference related;
        private final java.lang.String reportingComponent;
        private final java.lang.String reportingInstance;
        private final k8s.EventSeries series;
        private final k8s.EventSource source;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.involvedObject = this.jsiiGet("involvedObject", k8s.ObjectReference.class);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
            this.action = this.jsiiGet("action", java.lang.String.class);
            this.count = this.jsiiGet("count", java.lang.Number.class);
            this.eventTime = this.jsiiGet("eventTime", java.time.Instant.class);
            this.firstTimestamp = this.jsiiGet("firstTimestamp", java.time.Instant.class);
            this.lastTimestamp = this.jsiiGet("lastTimestamp", java.time.Instant.class);
            this.message = this.jsiiGet("message", java.lang.String.class);
            this.reason = this.jsiiGet("reason", java.lang.String.class);
            this.related = this.jsiiGet("related", k8s.ObjectReference.class);
            this.reportingComponent = this.jsiiGet("reportingComponent", java.lang.String.class);
            this.reportingInstance = this.jsiiGet("reportingInstance", java.lang.String.class);
            this.series = this.jsiiGet("series", k8s.EventSeries.class);
            this.source = this.jsiiGet("source", k8s.EventSource.class);
            this.type = this.jsiiGet("type", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.ObjectReference involvedObject, final k8s.ObjectMeta metadata, final java.lang.String action, final java.lang.Number count, final java.time.Instant eventTime, final java.time.Instant firstTimestamp, final java.time.Instant lastTimestamp, final java.lang.String message, final java.lang.String reason, final k8s.ObjectReference related, final java.lang.String reportingComponent, final java.lang.String reportingInstance, final k8s.EventSeries series, final k8s.EventSource source, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.involvedObject = java.util.Objects.requireNonNull(involvedObject, "involvedObject is required");
            this.metadata = java.util.Objects.requireNonNull(metadata, "metadata is required");
            this.action = action;
            this.count = count;
            this.eventTime = eventTime;
            this.firstTimestamp = firstTimestamp;
            this.lastTimestamp = lastTimestamp;
            this.message = message;
            this.reason = reason;
            this.related = related;
            this.reportingComponent = reportingComponent;
            this.reportingInstance = reportingInstance;
            this.series = series;
            this.source = source;
            this.type = type;
        }

        @Override
        public k8s.ObjectReference getInvolvedObject() {
            return this.involvedObject;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public java.lang.String getAction() {
            return this.action;
        }

        @Override
        public java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public java.time.Instant getEventTime() {
            return this.eventTime;
        }

        @Override
        public java.time.Instant getFirstTimestamp() {
            return this.firstTimestamp;
        }

        @Override
        public java.time.Instant getLastTimestamp() {
            return this.lastTimestamp;
        }

        @Override
        public java.lang.String getMessage() {
            return this.message;
        }

        @Override
        public java.lang.String getReason() {
            return this.reason;
        }

        @Override
        public k8s.ObjectReference getRelated() {
            return this.related;
        }

        @Override
        public java.lang.String getReportingComponent() {
            return this.reportingComponent;
        }

        @Override
        public java.lang.String getReportingInstance() {
            return this.reportingInstance;
        }

        @Override
        public k8s.EventSeries getSeries() {
            return this.series;
        }

        @Override
        public k8s.EventSource getSource() {
            return this.source;
        }

        @Override
        public java.lang.String getType() {
            return this.type;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("involvedObject", om.valueToTree(this.getInvolvedObject()));
            data.set("metadata", om.valueToTree(this.getMetadata()));
            if (this.getAction() != null) {
                data.set("action", om.valueToTree(this.getAction()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getEventTime() != null) {
                data.set("eventTime", om.valueToTree(this.getEventTime()));
            }
            if (this.getFirstTimestamp() != null) {
                data.set("firstTimestamp", om.valueToTree(this.getFirstTimestamp()));
            }
            if (this.getLastTimestamp() != null) {
                data.set("lastTimestamp", om.valueToTree(this.getLastTimestamp()));
            }
            if (this.getMessage() != null) {
                data.set("message", om.valueToTree(this.getMessage()));
            }
            if (this.getReason() != null) {
                data.set("reason", om.valueToTree(this.getReason()));
            }
            if (this.getRelated() != null) {
                data.set("related", om.valueToTree(this.getRelated()));
            }
            if (this.getReportingComponent() != null) {
                data.set("reportingComponent", om.valueToTree(this.getReportingComponent()));
            }
            if (this.getReportingInstance() != null) {
                data.set("reportingInstance", om.valueToTree(this.getReportingInstance()));
            }
            if (this.getSeries() != null) {
                data.set("series", om.valueToTree(this.getSeries()));
            }
            if (this.getSource() != null) {
                data.set("source", om.valueToTree(this.getSource()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EventOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EventOptions.Jsii$Proxy that = (EventOptions.Jsii$Proxy) o;

            if (!involvedObject.equals(that.involvedObject)) return false;
            if (!metadata.equals(that.metadata)) return false;
            if (this.action != null ? !this.action.equals(that.action) : that.action != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.eventTime != null ? !this.eventTime.equals(that.eventTime) : that.eventTime != null) return false;
            if (this.firstTimestamp != null ? !this.firstTimestamp.equals(that.firstTimestamp) : that.firstTimestamp != null) return false;
            if (this.lastTimestamp != null ? !this.lastTimestamp.equals(that.lastTimestamp) : that.lastTimestamp != null) return false;
            if (this.message != null ? !this.message.equals(that.message) : that.message != null) return false;
            if (this.reason != null ? !this.reason.equals(that.reason) : that.reason != null) return false;
            if (this.related != null ? !this.related.equals(that.related) : that.related != null) return false;
            if (this.reportingComponent != null ? !this.reportingComponent.equals(that.reportingComponent) : that.reportingComponent != null) return false;
            if (this.reportingInstance != null ? !this.reportingInstance.equals(that.reportingInstance) : that.reportingInstance != null) return false;
            if (this.series != null ? !this.series.equals(that.series) : that.series != null) return false;
            if (this.source != null ? !this.source.equals(that.source) : that.source != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public int hashCode() {
            int result = this.involvedObject.hashCode();
            result = 31 * result + (this.metadata.hashCode());
            result = 31 * result + (this.action != null ? this.action.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.eventTime != null ? this.eventTime.hashCode() : 0);
            result = 31 * result + (this.firstTimestamp != null ? this.firstTimestamp.hashCode() : 0);
            result = 31 * result + (this.lastTimestamp != null ? this.lastTimestamp.hashCode() : 0);
            result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
            result = 31 * result + (this.reason != null ? this.reason.hashCode() : 0);
            result = 31 * result + (this.related != null ? this.related.hashCode() : 0);
            result = 31 * result + (this.reportingComponent != null ? this.reportingComponent.hashCode() : 0);
            result = 31 * result + (this.reportingInstance != null ? this.reportingInstance.hashCode() : 0);
            result = 31 * result + (this.series != null ? this.series.hashCode() : 0);
            result = 31 * result + (this.source != null ? this.source.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
