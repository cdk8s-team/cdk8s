package k8s;

/**
 * CronJobSpec describes how the job execution will look like and when it will actually run.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.153Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CronJobSpec")
@software.amazon.jsii.Jsii.Proxy(CronJobSpec.Jsii$Proxy.class)
public interface CronJobSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specifies the job that will be created when executing a CronJob.
     */
    @org.jetbrains.annotations.NotNull k8s.JobTemplateSpec getJobTemplate();

    /**
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSchedule();

    /**
     * Specifies how to treat concurrent executions of a Job.
     * <p>
     * Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getConcurrencyPolicy() {
        return null;
    }

    /**
     * The number of failed finished jobs to retain.
     * <p>
     * This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * <p>
     * Default: 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getFailedJobsHistoryLimit() {
        return null;
    }

    /**
     * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.
     * <p>
     * Missed jobs executions will be counted as failed ones.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getStartingDeadlineSeconds() {
        return null;
    }

    /**
     * The number of successful finished jobs to retain.
     * <p>
     * This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
     * <p>
     * Default: 3.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSuccessfulJobsHistoryLimit() {
        return null;
    }

    /**
     * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.
     * <p>
     * Defaults to false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSuspend() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CronJobSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CronJobSpec}
     */
    public static final class Builder {
        private k8s.JobTemplateSpec jobTemplate;
        private java.lang.String schedule;
        private java.lang.String concurrencyPolicy;
        private java.lang.Number failedJobsHistoryLimit;
        private java.lang.Number startingDeadlineSeconds;
        private java.lang.Number successfulJobsHistoryLimit;
        private java.lang.Boolean suspend;

        /**
         * Sets the value of {@link CronJobSpec#getJobTemplate}
         * @param jobTemplate Specifies the job that will be created when executing a CronJob. This parameter is required.
         * @return {@code this}
         */
        public Builder jobTemplate(k8s.JobTemplateSpec jobTemplate) {
            this.jobTemplate = jobTemplate;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpec#getSchedule}
         * @param schedule The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron. This parameter is required.
         * @return {@code this}
         */
        public Builder schedule(java.lang.String schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpec#getConcurrencyPolicy}
         * @param concurrencyPolicy Specifies how to treat concurrent executions of a Job.
         *                          Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
         * @return {@code this}
         */
        public Builder concurrencyPolicy(java.lang.String concurrencyPolicy) {
            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpec#getFailedJobsHistoryLimit}
         * @param failedJobsHistoryLimit The number of failed finished jobs to retain.
         *                               This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
         * @return {@code this}
         */
        public Builder failedJobsHistoryLimit(java.lang.Number failedJobsHistoryLimit) {
            this.failedJobsHistoryLimit = failedJobsHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpec#getStartingDeadlineSeconds}
         * @param startingDeadlineSeconds Optional deadline in seconds for starting the job if it misses scheduled time for any reason.
         *                                Missed jobs executions will be counted as failed ones.
         * @return {@code this}
         */
        public Builder startingDeadlineSeconds(java.lang.Number startingDeadlineSeconds) {
            this.startingDeadlineSeconds = startingDeadlineSeconds;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpec#getSuccessfulJobsHistoryLimit}
         * @param successfulJobsHistoryLimit The number of successful finished jobs to retain.
         *                                   This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
         * @return {@code this}
         */
        public Builder successfulJobsHistoryLimit(java.lang.Number successfulJobsHistoryLimit) {
            this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
            return this;
        }

        /**
         * Sets the value of {@link CronJobSpec#getSuspend}
         * @param suspend This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.
         *                Defaults to false.
         * @return {@code this}
         */
        public Builder suspend(java.lang.Boolean suspend) {
            this.suspend = suspend;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CronJobSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CronJobSpec build() {
            return new Jsii$Proxy(jobTemplate, schedule, concurrencyPolicy, failedJobsHistoryLimit, startingDeadlineSeconds, successfulJobsHistoryLimit, suspend);
        }
    }

    /**
     * An implementation for {@link CronJobSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CronJobSpec {
        private final k8s.JobTemplateSpec jobTemplate;
        private final java.lang.String schedule;
        private final java.lang.String concurrencyPolicy;
        private final java.lang.Number failedJobsHistoryLimit;
        private final java.lang.Number startingDeadlineSeconds;
        private final java.lang.Number successfulJobsHistoryLimit;
        private final java.lang.Boolean suspend;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jobTemplate = this.jsiiGet("jobTemplate", k8s.JobTemplateSpec.class);
            this.schedule = this.jsiiGet("schedule", java.lang.String.class);
            this.concurrencyPolicy = this.jsiiGet("concurrencyPolicy", java.lang.String.class);
            this.failedJobsHistoryLimit = this.jsiiGet("failedJobsHistoryLimit", java.lang.Number.class);
            this.startingDeadlineSeconds = this.jsiiGet("startingDeadlineSeconds", java.lang.Number.class);
            this.successfulJobsHistoryLimit = this.jsiiGet("successfulJobsHistoryLimit", java.lang.Number.class);
            this.suspend = this.jsiiGet("suspend", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.JobTemplateSpec jobTemplate, final java.lang.String schedule, final java.lang.String concurrencyPolicy, final java.lang.Number failedJobsHistoryLimit, final java.lang.Number startingDeadlineSeconds, final java.lang.Number successfulJobsHistoryLimit, final java.lang.Boolean suspend) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jobTemplate = java.util.Objects.requireNonNull(jobTemplate, "jobTemplate is required");
            this.schedule = java.util.Objects.requireNonNull(schedule, "schedule is required");
            this.concurrencyPolicy = concurrencyPolicy;
            this.failedJobsHistoryLimit = failedJobsHistoryLimit;
            this.startingDeadlineSeconds = startingDeadlineSeconds;
            this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
            this.suspend = suspend;
        }

        @Override
        public k8s.JobTemplateSpec getJobTemplate() {
            return this.jobTemplate;
        }

        @Override
        public java.lang.String getSchedule() {
            return this.schedule;
        }

        @Override
        public java.lang.String getConcurrencyPolicy() {
            return this.concurrencyPolicy;
        }

        @Override
        public java.lang.Number getFailedJobsHistoryLimit() {
            return this.failedJobsHistoryLimit;
        }

        @Override
        public java.lang.Number getStartingDeadlineSeconds() {
            return this.startingDeadlineSeconds;
        }

        @Override
        public java.lang.Number getSuccessfulJobsHistoryLimit() {
            return this.successfulJobsHistoryLimit;
        }

        @Override
        public java.lang.Boolean getSuspend() {
            return this.suspend;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("jobTemplate", om.valueToTree(this.getJobTemplate()));
            data.set("schedule", om.valueToTree(this.getSchedule()));
            if (this.getConcurrencyPolicy() != null) {
                data.set("concurrencyPolicy", om.valueToTree(this.getConcurrencyPolicy()));
            }
            if (this.getFailedJobsHistoryLimit() != null) {
                data.set("failedJobsHistoryLimit", om.valueToTree(this.getFailedJobsHistoryLimit()));
            }
            if (this.getStartingDeadlineSeconds() != null) {
                data.set("startingDeadlineSeconds", om.valueToTree(this.getStartingDeadlineSeconds()));
            }
            if (this.getSuccessfulJobsHistoryLimit() != null) {
                data.set("successfulJobsHistoryLimit", om.valueToTree(this.getSuccessfulJobsHistoryLimit()));
            }
            if (this.getSuspend() != null) {
                data.set("suspend", om.valueToTree(this.getSuspend()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CronJobSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CronJobSpec.Jsii$Proxy that = (CronJobSpec.Jsii$Proxy) o;

            if (!jobTemplate.equals(that.jobTemplate)) return false;
            if (!schedule.equals(that.schedule)) return false;
            if (this.concurrencyPolicy != null ? !this.concurrencyPolicy.equals(that.concurrencyPolicy) : that.concurrencyPolicy != null) return false;
            if (this.failedJobsHistoryLimit != null ? !this.failedJobsHistoryLimit.equals(that.failedJobsHistoryLimit) : that.failedJobsHistoryLimit != null) return false;
            if (this.startingDeadlineSeconds != null ? !this.startingDeadlineSeconds.equals(that.startingDeadlineSeconds) : that.startingDeadlineSeconds != null) return false;
            if (this.successfulJobsHistoryLimit != null ? !this.successfulJobsHistoryLimit.equals(that.successfulJobsHistoryLimit) : that.successfulJobsHistoryLimit != null) return false;
            return this.suspend != null ? this.suspend.equals(that.suspend) : that.suspend == null;
        }

        @Override
        public int hashCode() {
            int result = this.jobTemplate.hashCode();
            result = 31 * result + (this.schedule.hashCode());
            result = 31 * result + (this.concurrencyPolicy != null ? this.concurrencyPolicy.hashCode() : 0);
            result = 31 * result + (this.failedJobsHistoryLimit != null ? this.failedJobsHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.startingDeadlineSeconds != null ? this.startingDeadlineSeconds.hashCode() : 0);
            result = 31 * result + (this.successfulJobsHistoryLimit != null ? this.successfulJobsHistoryLimit.hashCode() : 0);
            result = 31 * result + (this.suspend != null ? this.suspend.hashCode() : 0);
            return result;
        }
    }
}
