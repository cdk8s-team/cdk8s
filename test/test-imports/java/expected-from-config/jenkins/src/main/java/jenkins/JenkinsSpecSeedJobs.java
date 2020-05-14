package jenkins;

/**
 * SeedJob defines configuration for seed job More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-seed-jobs-and-pipelines.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.703Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecSeedJobs")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecSeedJobs.Jsii$Proxy.class)
public interface JenkinsSpecSeedJobs extends software.amazon.jsii.JsiiSerializable {

    /**
     * AdditionalClasspath is setting for Job DSL API plugin to set Additional Classpath.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAdditionalClasspath() {
        return null;
    }

    /**
     * BitbucketPushTrigger is used for Bitbucket web hooks.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBitbucketPushTrigger() {
        return null;
    }

    /**
     * BuildPeriodically is setting for scheduled trigger.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBuildPeriodically() {
        return null;
    }

    /**
     * CredentialID is the Kubernetes secret name which stores repository access credentials.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCredentialId() {
        return null;
    }

    /**
     * JenkinsCredentialType is the https://jenkinsci.github.io/kubernetes-credentials-provider-plugin/ credential type.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCredentialType() {
        return null;
    }

    /**
     * Description is the description of the seed job.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * FailOnMissingPlugin is setting for Job DSL API plugin that fails job if required plugin is missing.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getFailOnMissingPlugin() {
        return null;
    }

    /**
     * GitHubPushTrigger is used for GitHub web hooks.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getGithubPushTrigger() {
        return null;
    }

    /**
     * ID is the unique seed job name.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * IgnoreMissingFiles is setting for Job DSL API plugin to ignore files that miss.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnoreMissingFiles() {
        return null;
    }

    /**
     * PollSCM is setting for polling changes in SCM.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPollScm() {
        return null;
    }

    /**
     * RepositoryBranch is the repository branch where are seed job definitions.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepositoryBranch() {
        return null;
    }

    /**
     * RepositoryURL is the repository access URL.
     * <p>
     * Can be SSH or HTTPS.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRepositoryUrl() {
        return null;
    }

    /**
     * Targets is the repository path where are seed job definitions.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTargets() {
        return null;
    }

    /**
     * UnstableOnDeprecation is setting for Job DSL API plugin that sets build status as unstable if build using deprecated features.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUnstableOnDeprecation() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecSeedJobs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecSeedJobs}
     */
    public static final class Builder {
        private java.lang.String additionalClasspath;
        private java.lang.Boolean bitbucketPushTrigger;
        private java.lang.String buildPeriodically;
        private java.lang.String credentialId;
        private java.lang.String credentialType;
        private java.lang.String description;
        private java.lang.Boolean failOnMissingPlugin;
        private java.lang.Boolean githubPushTrigger;
        private java.lang.String id;
        private java.lang.Boolean ignoreMissingFiles;
        private java.lang.String pollScm;
        private java.lang.String repositoryBranch;
        private java.lang.String repositoryUrl;
        private java.lang.String targets;
        private java.lang.Boolean unstableOnDeprecation;

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getAdditionalClasspath}
         * @param additionalClasspath AdditionalClasspath is setting for Job DSL API plugin to set Additional Classpath.
         * @return {@code this}
         */
        public Builder additionalClasspath(java.lang.String additionalClasspath) {
            this.additionalClasspath = additionalClasspath;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getBitbucketPushTrigger}
         * @param bitbucketPushTrigger BitbucketPushTrigger is used for Bitbucket web hooks.
         * @return {@code this}
         */
        public Builder bitbucketPushTrigger(java.lang.Boolean bitbucketPushTrigger) {
            this.bitbucketPushTrigger = bitbucketPushTrigger;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getBuildPeriodically}
         * @param buildPeriodically BuildPeriodically is setting for scheduled trigger.
         * @return {@code this}
         */
        public Builder buildPeriodically(java.lang.String buildPeriodically) {
            this.buildPeriodically = buildPeriodically;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getCredentialId}
         * @param credentialId CredentialID is the Kubernetes secret name which stores repository access credentials.
         * @return {@code this}
         */
        public Builder credentialId(java.lang.String credentialId) {
            this.credentialId = credentialId;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getCredentialType}
         * @param credentialType JenkinsCredentialType is the https://jenkinsci.github.io/kubernetes-credentials-provider-plugin/ credential type.
         * @return {@code this}
         */
        public Builder credentialType(java.lang.String credentialType) {
            this.credentialType = credentialType;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getDescription}
         * @param description Description is the description of the seed job.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getFailOnMissingPlugin}
         * @param failOnMissingPlugin FailOnMissingPlugin is setting for Job DSL API plugin that fails job if required plugin is missing.
         * @return {@code this}
         */
        public Builder failOnMissingPlugin(java.lang.Boolean failOnMissingPlugin) {
            this.failOnMissingPlugin = failOnMissingPlugin;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getGithubPushTrigger}
         * @param githubPushTrigger GitHubPushTrigger is used for GitHub web hooks.
         * @return {@code this}
         */
        public Builder githubPushTrigger(java.lang.Boolean githubPushTrigger) {
            this.githubPushTrigger = githubPushTrigger;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getId}
         * @param id ID is the unique seed job name.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getIgnoreMissingFiles}
         * @param ignoreMissingFiles IgnoreMissingFiles is setting for Job DSL API plugin to ignore files that miss.
         * @return {@code this}
         */
        public Builder ignoreMissingFiles(java.lang.Boolean ignoreMissingFiles) {
            this.ignoreMissingFiles = ignoreMissingFiles;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getPollScm}
         * @param pollScm PollSCM is setting for polling changes in SCM.
         * @return {@code this}
         */
        public Builder pollScm(java.lang.String pollScm) {
            this.pollScm = pollScm;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getRepositoryBranch}
         * @param repositoryBranch RepositoryBranch is the repository branch where are seed job definitions.
         * @return {@code this}
         */
        public Builder repositoryBranch(java.lang.String repositoryBranch) {
            this.repositoryBranch = repositoryBranch;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getRepositoryUrl}
         * @param repositoryUrl RepositoryURL is the repository access URL.
         *                      Can be SSH or HTTPS.
         * @return {@code this}
         */
        public Builder repositoryUrl(java.lang.String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getTargets}
         * @param targets Targets is the repository path where are seed job definitions.
         * @return {@code this}
         */
        public Builder targets(java.lang.String targets) {
            this.targets = targets;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSeedJobs#getUnstableOnDeprecation}
         * @param unstableOnDeprecation UnstableOnDeprecation is setting for Job DSL API plugin that sets build status as unstable if build using deprecated features.
         * @return {@code this}
         */
        public Builder unstableOnDeprecation(java.lang.Boolean unstableOnDeprecation) {
            this.unstableOnDeprecation = unstableOnDeprecation;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecSeedJobs}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecSeedJobs build() {
            return new Jsii$Proxy(additionalClasspath, bitbucketPushTrigger, buildPeriodically, credentialId, credentialType, description, failOnMissingPlugin, githubPushTrigger, id, ignoreMissingFiles, pollScm, repositoryBranch, repositoryUrl, targets, unstableOnDeprecation);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecSeedJobs}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecSeedJobs {
        private final java.lang.String additionalClasspath;
        private final java.lang.Boolean bitbucketPushTrigger;
        private final java.lang.String buildPeriodically;
        private final java.lang.String credentialId;
        private final java.lang.String credentialType;
        private final java.lang.String description;
        private final java.lang.Boolean failOnMissingPlugin;
        private final java.lang.Boolean githubPushTrigger;
        private final java.lang.String id;
        private final java.lang.Boolean ignoreMissingFiles;
        private final java.lang.String pollScm;
        private final java.lang.String repositoryBranch;
        private final java.lang.String repositoryUrl;
        private final java.lang.String targets;
        private final java.lang.Boolean unstableOnDeprecation;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.additionalClasspath = this.jsiiGet("additionalClasspath", java.lang.String.class);
            this.bitbucketPushTrigger = this.jsiiGet("bitbucketPushTrigger", java.lang.Boolean.class);
            this.buildPeriodically = this.jsiiGet("buildPeriodically", java.lang.String.class);
            this.credentialId = this.jsiiGet("credentialID", java.lang.String.class);
            this.credentialType = this.jsiiGet("credentialType", java.lang.String.class);
            this.description = this.jsiiGet("description", java.lang.String.class);
            this.failOnMissingPlugin = this.jsiiGet("failOnMissingPlugin", java.lang.Boolean.class);
            this.githubPushTrigger = this.jsiiGet("githubPushTrigger", java.lang.Boolean.class);
            this.id = this.jsiiGet("id", java.lang.String.class);
            this.ignoreMissingFiles = this.jsiiGet("ignoreMissingFiles", java.lang.Boolean.class);
            this.pollScm = this.jsiiGet("pollSCM", java.lang.String.class);
            this.repositoryBranch = this.jsiiGet("repositoryBranch", java.lang.String.class);
            this.repositoryUrl = this.jsiiGet("repositoryUrl", java.lang.String.class);
            this.targets = this.jsiiGet("targets", java.lang.String.class);
            this.unstableOnDeprecation = this.jsiiGet("unstableOnDeprecation", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String additionalClasspath, final java.lang.Boolean bitbucketPushTrigger, final java.lang.String buildPeriodically, final java.lang.String credentialId, final java.lang.String credentialType, final java.lang.String description, final java.lang.Boolean failOnMissingPlugin, final java.lang.Boolean githubPushTrigger, final java.lang.String id, final java.lang.Boolean ignoreMissingFiles, final java.lang.String pollScm, final java.lang.String repositoryBranch, final java.lang.String repositoryUrl, final java.lang.String targets, final java.lang.Boolean unstableOnDeprecation) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.additionalClasspath = additionalClasspath;
            this.bitbucketPushTrigger = bitbucketPushTrigger;
            this.buildPeriodically = buildPeriodically;
            this.credentialId = credentialId;
            this.credentialType = credentialType;
            this.description = description;
            this.failOnMissingPlugin = failOnMissingPlugin;
            this.githubPushTrigger = githubPushTrigger;
            this.id = id;
            this.ignoreMissingFiles = ignoreMissingFiles;
            this.pollScm = pollScm;
            this.repositoryBranch = repositoryBranch;
            this.repositoryUrl = repositoryUrl;
            this.targets = targets;
            this.unstableOnDeprecation = unstableOnDeprecation;
        }

        @Override
        public java.lang.String getAdditionalClasspath() {
            return this.additionalClasspath;
        }

        @Override
        public java.lang.Boolean getBitbucketPushTrigger() {
            return this.bitbucketPushTrigger;
        }

        @Override
        public java.lang.String getBuildPeriodically() {
            return this.buildPeriodically;
        }

        @Override
        public java.lang.String getCredentialId() {
            return this.credentialId;
        }

        @Override
        public java.lang.String getCredentialType() {
            return this.credentialType;
        }

        @Override
        public java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public java.lang.Boolean getFailOnMissingPlugin() {
            return this.failOnMissingPlugin;
        }

        @Override
        public java.lang.Boolean getGithubPushTrigger() {
            return this.githubPushTrigger;
        }

        @Override
        public java.lang.String getId() {
            return this.id;
        }

        @Override
        public java.lang.Boolean getIgnoreMissingFiles() {
            return this.ignoreMissingFiles;
        }

        @Override
        public java.lang.String getPollScm() {
            return this.pollScm;
        }

        @Override
        public java.lang.String getRepositoryBranch() {
            return this.repositoryBranch;
        }

        @Override
        public java.lang.String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        @Override
        public java.lang.String getTargets() {
            return this.targets;
        }

        @Override
        public java.lang.Boolean getUnstableOnDeprecation() {
            return this.unstableOnDeprecation;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAdditionalClasspath() != null) {
                data.set("additionalClasspath", om.valueToTree(this.getAdditionalClasspath()));
            }
            if (this.getBitbucketPushTrigger() != null) {
                data.set("bitbucketPushTrigger", om.valueToTree(this.getBitbucketPushTrigger()));
            }
            if (this.getBuildPeriodically() != null) {
                data.set("buildPeriodically", om.valueToTree(this.getBuildPeriodically()));
            }
            if (this.getCredentialId() != null) {
                data.set("credentialID", om.valueToTree(this.getCredentialId()));
            }
            if (this.getCredentialType() != null) {
                data.set("credentialType", om.valueToTree(this.getCredentialType()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getFailOnMissingPlugin() != null) {
                data.set("failOnMissingPlugin", om.valueToTree(this.getFailOnMissingPlugin()));
            }
            if (this.getGithubPushTrigger() != null) {
                data.set("githubPushTrigger", om.valueToTree(this.getGithubPushTrigger()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getIgnoreMissingFiles() != null) {
                data.set("ignoreMissingFiles", om.valueToTree(this.getIgnoreMissingFiles()));
            }
            if (this.getPollScm() != null) {
                data.set("pollSCM", om.valueToTree(this.getPollScm()));
            }
            if (this.getRepositoryBranch() != null) {
                data.set("repositoryBranch", om.valueToTree(this.getRepositoryBranch()));
            }
            if (this.getRepositoryUrl() != null) {
                data.set("repositoryUrl", om.valueToTree(this.getRepositoryUrl()));
            }
            if (this.getTargets() != null) {
                data.set("targets", om.valueToTree(this.getTargets()));
            }
            if (this.getUnstableOnDeprecation() != null) {
                data.set("unstableOnDeprecation", om.valueToTree(this.getUnstableOnDeprecation()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecSeedJobs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecSeedJobs.Jsii$Proxy that = (JenkinsSpecSeedJobs.Jsii$Proxy) o;

            if (this.additionalClasspath != null ? !this.additionalClasspath.equals(that.additionalClasspath) : that.additionalClasspath != null) return false;
            if (this.bitbucketPushTrigger != null ? !this.bitbucketPushTrigger.equals(that.bitbucketPushTrigger) : that.bitbucketPushTrigger != null) return false;
            if (this.buildPeriodically != null ? !this.buildPeriodically.equals(that.buildPeriodically) : that.buildPeriodically != null) return false;
            if (this.credentialId != null ? !this.credentialId.equals(that.credentialId) : that.credentialId != null) return false;
            if (this.credentialType != null ? !this.credentialType.equals(that.credentialType) : that.credentialType != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.failOnMissingPlugin != null ? !this.failOnMissingPlugin.equals(that.failOnMissingPlugin) : that.failOnMissingPlugin != null) return false;
            if (this.githubPushTrigger != null ? !this.githubPushTrigger.equals(that.githubPushTrigger) : that.githubPushTrigger != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.ignoreMissingFiles != null ? !this.ignoreMissingFiles.equals(that.ignoreMissingFiles) : that.ignoreMissingFiles != null) return false;
            if (this.pollScm != null ? !this.pollScm.equals(that.pollScm) : that.pollScm != null) return false;
            if (this.repositoryBranch != null ? !this.repositoryBranch.equals(that.repositoryBranch) : that.repositoryBranch != null) return false;
            if (this.repositoryUrl != null ? !this.repositoryUrl.equals(that.repositoryUrl) : that.repositoryUrl != null) return false;
            if (this.targets != null ? !this.targets.equals(that.targets) : that.targets != null) return false;
            return this.unstableOnDeprecation != null ? this.unstableOnDeprecation.equals(that.unstableOnDeprecation) : that.unstableOnDeprecation == null;
        }

        @Override
        public int hashCode() {
            int result = this.additionalClasspath != null ? this.additionalClasspath.hashCode() : 0;
            result = 31 * result + (this.bitbucketPushTrigger != null ? this.bitbucketPushTrigger.hashCode() : 0);
            result = 31 * result + (this.buildPeriodically != null ? this.buildPeriodically.hashCode() : 0);
            result = 31 * result + (this.credentialId != null ? this.credentialId.hashCode() : 0);
            result = 31 * result + (this.credentialType != null ? this.credentialType.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.failOnMissingPlugin != null ? this.failOnMissingPlugin.hashCode() : 0);
            result = 31 * result + (this.githubPushTrigger != null ? this.githubPushTrigger.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.ignoreMissingFiles != null ? this.ignoreMissingFiles.hashCode() : 0);
            result = 31 * result + (this.pollScm != null ? this.pollScm.hashCode() : 0);
            result = 31 * result + (this.repositoryBranch != null ? this.repositoryBranch.hashCode() : 0);
            result = 31 * result + (this.repositoryUrl != null ? this.repositoryUrl.hashCode() : 0);
            result = 31 * result + (this.targets != null ? this.targets.hashCode() : 0);
            result = 31 * result + (this.unstableOnDeprecation != null ? this.unstableOnDeprecation.hashCode() : 0);
            return result;
        }
    }
}
