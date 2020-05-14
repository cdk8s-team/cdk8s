package k8s;

/**
 * JobSpec describes how the job execution will look like.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.270Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.JobSpec")
@software.amazon.jsii.Jsii.Proxy(JobSpec.Jsii$Proxy.class)
public interface JobSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Describes the pod that will be created when executing a job.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     */
    @org.jetbrains.annotations.NotNull k8s.PodTemplateSpec getTemplate();

    /**
     * Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it;
     * <p>
     * value must be positive integer
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getActiveDeadlineSeconds() {
        return null;
    }

    /**
     * Specifies the number of retries before marking this job failed.
     * <p>
     * Defaults to 6
     * <p>
     * Default: 6
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getBackoffLimit() {
        return null;
    }

    /**
     * Specifies the desired number of successfully finished pods the job should be run with.
     * <p>
     * Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCompletions() {
        return null;
    }

    /**
     * manualSelector controls generation of pod labels and pod selectors.
     * <p>
     * Leave <code>manualSelector</code> unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see <code>manualSelector=true</code> in jobs that were created with the old <code>extensions/v1beta1</code> API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getManualSelector() {
        return null;
    }

    /**
     * Specifies the maximum desired number of pods the job should run at any given time.
     * <p>
     * The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getParallelism() {
        return null;
    }

    /**
     * A label query over pods that should match the pod count.
     * <p>
     * Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     */
    default @org.jetbrains.annotations.Nullable k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed).
     * <p>
     * If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTtlSecondsAfterFinished() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JobSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JobSpec}
     */
    public static final class Builder {
        private k8s.PodTemplateSpec template;
        private java.lang.Number activeDeadlineSeconds;
        private java.lang.Number backoffLimit;
        private java.lang.Number completions;
        private java.lang.Boolean manualSelector;
        private java.lang.Number parallelism;
        private k8s.LabelSelector selector;
        private java.lang.Number ttlSecondsAfterFinished;

        /**
         * Sets the value of {@link JobSpec#getTemplate}
         * @param template Describes the pod that will be created when executing a job. This parameter is required.
         *                 More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         * @return {@code this}
         */
        public Builder template(k8s.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getActiveDeadlineSeconds}
         * @param activeDeadlineSeconds Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it;.
         *                              value must be positive integer
         * @return {@code this}
         */
        public Builder activeDeadlineSeconds(java.lang.Number activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getBackoffLimit}
         * @param backoffLimit Specifies the number of retries before marking this job failed.
         *                     Defaults to 6
         * @return {@code this}
         */
        public Builder backoffLimit(java.lang.Number backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getCompletions}
         * @param completions Specifies the desired number of successfully finished pods the job should be run with.
         *                    Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         * @return {@code this}
         */
        public Builder completions(java.lang.Number completions) {
            this.completions = completions;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getManualSelector}
         * @param manualSelector manualSelector controls generation of pod labels and pod selectors.
         *                       Leave <code>manualSelector</code> unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see <code>manualSelector=true</code> in jobs that were created with the old <code>extensions/v1beta1</code> API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
         * @return {@code this}
         */
        public Builder manualSelector(java.lang.Boolean manualSelector) {
            this.manualSelector = manualSelector;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getParallelism}
         * @param parallelism Specifies the maximum desired number of pods the job should run at any given time.
         *                    The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         * @return {@code this}
         */
        public Builder parallelism(java.lang.Number parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getSelector}
         * @param selector A label query over pods that should match the pod count.
         *                 Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * @return {@code this}
         */
        public Builder selector(k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link JobSpec#getTtlSecondsAfterFinished}
         * @param ttlSecondsAfterFinished ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed).
         *                                If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature.
         * @return {@code this}
         */
        public Builder ttlSecondsAfterFinished(java.lang.Number ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JobSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JobSpec build() {
            return new Jsii$Proxy(template, activeDeadlineSeconds, backoffLimit, completions, manualSelector, parallelism, selector, ttlSecondsAfterFinished);
        }
    }

    /**
     * An implementation for {@link JobSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JobSpec {
        private final k8s.PodTemplateSpec template;
        private final java.lang.Number activeDeadlineSeconds;
        private final java.lang.Number backoffLimit;
        private final java.lang.Number completions;
        private final java.lang.Boolean manualSelector;
        private final java.lang.Number parallelism;
        private final k8s.LabelSelector selector;
        private final java.lang.Number ttlSecondsAfterFinished;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.template = this.jsiiGet("template", k8s.PodTemplateSpec.class);
            this.activeDeadlineSeconds = this.jsiiGet("activeDeadlineSeconds", java.lang.Number.class);
            this.backoffLimit = this.jsiiGet("backoffLimit", java.lang.Number.class);
            this.completions = this.jsiiGet("completions", java.lang.Number.class);
            this.manualSelector = this.jsiiGet("manualSelector", java.lang.Boolean.class);
            this.parallelism = this.jsiiGet("parallelism", java.lang.Number.class);
            this.selector = this.jsiiGet("selector", k8s.LabelSelector.class);
            this.ttlSecondsAfterFinished = this.jsiiGet("ttlSecondsAfterFinished", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.PodTemplateSpec template, final java.lang.Number activeDeadlineSeconds, final java.lang.Number backoffLimit, final java.lang.Number completions, final java.lang.Boolean manualSelector, final java.lang.Number parallelism, final k8s.LabelSelector selector, final java.lang.Number ttlSecondsAfterFinished) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.template = java.util.Objects.requireNonNull(template, "template is required");
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            this.backoffLimit = backoffLimit;
            this.completions = completions;
            this.manualSelector = manualSelector;
            this.parallelism = parallelism;
            this.selector = selector;
            this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
        }

        @Override
        public k8s.PodTemplateSpec getTemplate() {
            return this.template;
        }

        @Override
        public java.lang.Number getActiveDeadlineSeconds() {
            return this.activeDeadlineSeconds;
        }

        @Override
        public java.lang.Number getBackoffLimit() {
            return this.backoffLimit;
        }

        @Override
        public java.lang.Number getCompletions() {
            return this.completions;
        }

        @Override
        public java.lang.Boolean getManualSelector() {
            return this.manualSelector;
        }

        @Override
        public java.lang.Number getParallelism() {
            return this.parallelism;
        }

        @Override
        public k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public java.lang.Number getTtlSecondsAfterFinished() {
            return this.ttlSecondsAfterFinished;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("template", om.valueToTree(this.getTemplate()));
            if (this.getActiveDeadlineSeconds() != null) {
                data.set("activeDeadlineSeconds", om.valueToTree(this.getActiveDeadlineSeconds()));
            }
            if (this.getBackoffLimit() != null) {
                data.set("backoffLimit", om.valueToTree(this.getBackoffLimit()));
            }
            if (this.getCompletions() != null) {
                data.set("completions", om.valueToTree(this.getCompletions()));
            }
            if (this.getManualSelector() != null) {
                data.set("manualSelector", om.valueToTree(this.getManualSelector()));
            }
            if (this.getParallelism() != null) {
                data.set("parallelism", om.valueToTree(this.getParallelism()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getTtlSecondsAfterFinished() != null) {
                data.set("ttlSecondsAfterFinished", om.valueToTree(this.getTtlSecondsAfterFinished()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.JobSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JobSpec.Jsii$Proxy that = (JobSpec.Jsii$Proxy) o;

            if (!template.equals(that.template)) return false;
            if (this.activeDeadlineSeconds != null ? !this.activeDeadlineSeconds.equals(that.activeDeadlineSeconds) : that.activeDeadlineSeconds != null) return false;
            if (this.backoffLimit != null ? !this.backoffLimit.equals(that.backoffLimit) : that.backoffLimit != null) return false;
            if (this.completions != null ? !this.completions.equals(that.completions) : that.completions != null) return false;
            if (this.manualSelector != null ? !this.manualSelector.equals(that.manualSelector) : that.manualSelector != null) return false;
            if (this.parallelism != null ? !this.parallelism.equals(that.parallelism) : that.parallelism != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            return this.ttlSecondsAfterFinished != null ? this.ttlSecondsAfterFinished.equals(that.ttlSecondsAfterFinished) : that.ttlSecondsAfterFinished == null;
        }

        @Override
        public int hashCode() {
            int result = this.template.hashCode();
            result = 31 * result + (this.activeDeadlineSeconds != null ? this.activeDeadlineSeconds.hashCode() : 0);
            result = 31 * result + (this.backoffLimit != null ? this.backoffLimit.hashCode() : 0);
            result = 31 * result + (this.completions != null ? this.completions.hashCode() : 0);
            result = 31 * result + (this.manualSelector != null ? this.manualSelector.hashCode() : 0);
            result = 31 * result + (this.parallelism != null ? this.parallelism.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.ttlSecondsAfterFinished != null ? this.ttlSecondsAfterFinished.hashCode() : 0);
            return result;
        }
    }
}
