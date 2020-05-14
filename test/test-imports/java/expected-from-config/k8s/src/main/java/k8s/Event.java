package k8s;

/**
 * Event is a report of an event somewhere in the cluster.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.209Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Event")
public class Event extends org.cdk8s.ApiObject {

    protected Event(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Event(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.core.v1.Event" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public Event(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.EventOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.Event}.
     */
    public static final class Builder {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private final k8s.EventOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.EventOptions.Builder();
        }

        /**
         * The object that this event is about.
         * <p>
         * @return {@code this}
         * @param involvedObject The object that this event is about. This parameter is required.
         */
        public Builder involvedObject(final k8s.ObjectReference involvedObject) {
            this.options.involvedObject(involvedObject);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final k8s.ObjectMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * What action was taken/failed regarding to the Regarding object.
         * <p>
         * @return {@code this}
         * @param action What action was taken/failed regarding to the Regarding object. This parameter is required.
         */
        public Builder action(final java.lang.String action) {
            this.options.action(action);
            return this;
        }

        /**
         * The number of times this event has occurred.
         * <p>
         * @return {@code this}
         * @param count The number of times this event has occurred. This parameter is required.
         */
        public Builder count(final java.lang.Number count) {
            this.options.count(count);
            return this;
        }

        /**
         * Time when this Event was first observed.
         * <p>
         * @return {@code this}
         * @param eventTime Time when this Event was first observed. This parameter is required.
         */
        public Builder eventTime(final java.time.Instant eventTime) {
            this.options.eventTime(eventTime);
            return this;
        }

        /**
         * The time at which the event was first recorded.
         * <p>
         * (Time of server receipt is in TypeMeta.)
         * <p>
         * @return {@code this}
         * @param firstTimestamp The time at which the event was first recorded. This parameter is required.
         */
        public Builder firstTimestamp(final java.time.Instant firstTimestamp) {
            this.options.firstTimestamp(firstTimestamp);
            return this;
        }

        /**
         * The time at which the most recent occurrence of this event was recorded.
         * <p>
         * @return {@code this}
         * @param lastTimestamp The time at which the most recent occurrence of this event was recorded. This parameter is required.
         */
        public Builder lastTimestamp(final java.time.Instant lastTimestamp) {
            this.options.lastTimestamp(lastTimestamp);
            return this;
        }

        /**
         * A human-readable description of the status of this operation.
         * <p>
         * @return {@code this}
         * @param message A human-readable description of the status of this operation. This parameter is required.
         */
        public Builder message(final java.lang.String message) {
            this.options.message(message);
            return this;
        }

        /**
         * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
         * <p>
         * @return {@code this}
         * @param reason This should be a short, machine understandable string that gives the reason for the transition into the object's current status. This parameter is required.
         */
        public Builder reason(final java.lang.String reason) {
            this.options.reason(reason);
            return this;
        }

        /**
         * Optional secondary object for more complex actions.
         * <p>
         * @return {@code this}
         * @param related Optional secondary object for more complex actions. This parameter is required.
         */
        public Builder related(final k8s.ObjectReference related) {
            this.options.related(related);
            return this;
        }

        /**
         * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
         * <p>
         * @return {@code this}
         * @param reportingComponent Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This parameter is required.
         */
        public Builder reportingComponent(final java.lang.String reportingComponent) {
            this.options.reportingComponent(reportingComponent);
            return this;
        }

        /**
         * ID of the controller instance, e.g. `kubelet-xyzf`.
         * <p>
         * @return {@code this}
         * @param reportingInstance ID of the controller instance, e.g. `kubelet-xyzf`. This parameter is required.
         */
        public Builder reportingInstance(final java.lang.String reportingInstance) {
            this.options.reportingInstance(reportingInstance);
            return this;
        }

        /**
         * Data about the Event series this event represents or nil if it's a singleton Event.
         * <p>
         * @return {@code this}
         * @param series Data about the Event series this event represents or nil if it's a singleton Event. This parameter is required.
         */
        public Builder series(final k8s.EventSeries series) {
            this.options.series(series);
            return this;
        }

        /**
         * The component reporting this event.
         * <p>
         * Should be a short machine understandable string.
         * <p>
         * @return {@code this}
         * @param source The component reporting this event. This parameter is required.
         */
        public Builder source(final k8s.EventSource source) {
            this.options.source(source);
            return this;
        }

        /**
         * Type of this event (Normal, Warning), new types could be added in the future.
         * <p>
         * @return {@code this}
         * @param type Type of this event (Normal, Warning), new types could be added in the future. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.options.type(type);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.Event}.
         */
        public k8s.Event build() {
            return new k8s.Event(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
