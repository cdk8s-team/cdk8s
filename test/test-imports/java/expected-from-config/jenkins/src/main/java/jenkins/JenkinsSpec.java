package jenkins;

/**
 * Spec defines the desired state of the Jenkins.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.588Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpec")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpec.Jsii$Proxy.class)
public interface JenkinsSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * JenkinsAPISettings defines configuration used by the operator to gain admin access to the Jenkins API.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecJenkinsApiSettings getJenkinsApiSettings();

    /**
     * Master represents Jenkins master pod properties and Jenkins plugins.
     * <p>
     * Every single change here requires a pod restart.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecMaster getMaster();

    /**
     * Backup defines configuration of Jenkins backup More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecBackup getBackup() {
        return null;
    }

    /**
     * ConfigurationAsCode defines configuration of Jenkins customization via Configuration as Code Jenkins plugin.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecConfigurationAsCode getConfigurationAsCode() {
        return null;
    }

    /**
     * GroovyScripts defines configuration of Jenkins customization via groovy scripts.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecGroovyScripts getGroovyScripts() {
        return null;
    }

    /**
     * Notifications defines list of a services which are used to inform about Jenkins status Can be used to integrate chat services like Slack, Microsoft Teams or Mailgun.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecNotifications> getNotifications() {
        return null;
    }

    /**
     * Backup defines configuration of Jenkins backup restore More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecRestore getRestore() {
        return null;
    }

    /**
     * Roles defines list of extra RBAC roles for the Jenkins Master pod service account.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecRoles> getRoles() {
        return null;
    }

    /**
     * SeedJobs defines list of Jenkins Seed Job configurations More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-seed-jobs-and-pipelines.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecSeedJobs> getSeedJobs() {
        return null;
    }

    /**
     * Service is Kubernetes service of Jenkins master HTTP pod Defaults to : port: 8080 type: ClusterIP.
     * <p>
     * Default: port: 8080 type: ClusterIP
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecService getService() {
        return null;
    }

    /**
     * ServiceAccount defines Jenkins master service account attributes.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecServiceAccount getServiceAccount() {
        return null;
    }

    /**
     * Service is Kubernetes service of Jenkins slave pods Defaults to : port: 50000 type: ClusterIP.
     * <p>
     * Default: port: 50000 type: ClusterIP
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecSlaveService getSlaveService() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpec}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecJenkinsApiSettings jenkinsApiSettings;
        private jenkins.JenkinsSpecMaster master;
        private jenkins.JenkinsSpecBackup backup;
        private jenkins.JenkinsSpecConfigurationAsCode configurationAsCode;
        private jenkins.JenkinsSpecGroovyScripts groovyScripts;
        private java.util.List<jenkins.JenkinsSpecNotifications> notifications;
        private jenkins.JenkinsSpecRestore restore;
        private java.util.List<jenkins.JenkinsSpecRoles> roles;
        private java.util.List<jenkins.JenkinsSpecSeedJobs> seedJobs;
        private jenkins.JenkinsSpecService service;
        private jenkins.JenkinsSpecServiceAccount serviceAccount;
        private jenkins.JenkinsSpecSlaveService slaveService;

        /**
         * Sets the value of {@link JenkinsSpec#getJenkinsApiSettings}
         * @param jenkinsApiSettings JenkinsAPISettings defines configuration used by the operator to gain admin access to the Jenkins API. This parameter is required.
         * @return {@code this}
         */
        public Builder jenkinsApiSettings(jenkins.JenkinsSpecJenkinsApiSettings jenkinsApiSettings) {
            this.jenkinsApiSettings = jenkinsApiSettings;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getMaster}
         * @param master Master represents Jenkins master pod properties and Jenkins plugins. This parameter is required.
         *               Every single change here requires a pod restart.
         * @return {@code this}
         */
        public Builder master(jenkins.JenkinsSpecMaster master) {
            this.master = master;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getBackup}
         * @param backup Backup defines configuration of Jenkins backup More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
         * @return {@code this}
         */
        public Builder backup(jenkins.JenkinsSpecBackup backup) {
            this.backup = backup;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getConfigurationAsCode}
         * @param configurationAsCode ConfigurationAsCode defines configuration of Jenkins customization via Configuration as Code Jenkins plugin.
         * @return {@code this}
         */
        public Builder configurationAsCode(jenkins.JenkinsSpecConfigurationAsCode configurationAsCode) {
            this.configurationAsCode = configurationAsCode;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getGroovyScripts}
         * @param groovyScripts GroovyScripts defines configuration of Jenkins customization via groovy scripts.
         * @return {@code this}
         */
        public Builder groovyScripts(jenkins.JenkinsSpecGroovyScripts groovyScripts) {
            this.groovyScripts = groovyScripts;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getNotifications}
         * @param notifications Notifications defines list of a services which are used to inform about Jenkins status Can be used to integrate chat services like Slack, Microsoft Teams or Mailgun.
         * @return {@code this}
         */
        public Builder notifications(java.util.List<jenkins.JenkinsSpecNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getRestore}
         * @param restore Backup defines configuration of Jenkins backup restore More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
         * @return {@code this}
         */
        public Builder restore(jenkins.JenkinsSpecRestore restore) {
            this.restore = restore;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getRoles}
         * @param roles Roles defines list of extra RBAC roles for the Jenkins Master pod service account.
         * @return {@code this}
         */
        public Builder roles(java.util.List<jenkins.JenkinsSpecRoles> roles) {
            this.roles = roles;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getSeedJobs}
         * @param seedJobs SeedJobs defines list of Jenkins Seed Job configurations More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-seed-jobs-and-pipelines.
         * @return {@code this}
         */
        public Builder seedJobs(java.util.List<jenkins.JenkinsSpecSeedJobs> seedJobs) {
            this.seedJobs = seedJobs;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getService}
         * @param service Service is Kubernetes service of Jenkins master HTTP pod Defaults to : port: 8080 type: ClusterIP.
         * @return {@code this}
         */
        public Builder service(jenkins.JenkinsSpecService service) {
            this.service = service;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getServiceAccount}
         * @param serviceAccount ServiceAccount defines Jenkins master service account attributes.
         * @return {@code this}
         */
        public Builder serviceAccount(jenkins.JenkinsSpecServiceAccount serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpec#getSlaveService}
         * @param slaveService Service is Kubernetes service of Jenkins slave pods Defaults to : port: 50000 type: ClusterIP.
         * @return {@code this}
         */
        public Builder slaveService(jenkins.JenkinsSpecSlaveService slaveService) {
            this.slaveService = slaveService;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpec build() {
            return new Jsii$Proxy(jenkinsApiSettings, master, backup, configurationAsCode, groovyScripts, notifications, restore, roles, seedJobs, service, serviceAccount, slaveService);
        }
    }

    /**
     * An implementation for {@link JenkinsSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpec {
        private final jenkins.JenkinsSpecJenkinsApiSettings jenkinsApiSettings;
        private final jenkins.JenkinsSpecMaster master;
        private final jenkins.JenkinsSpecBackup backup;
        private final jenkins.JenkinsSpecConfigurationAsCode configurationAsCode;
        private final jenkins.JenkinsSpecGroovyScripts groovyScripts;
        private final java.util.List<jenkins.JenkinsSpecNotifications> notifications;
        private final jenkins.JenkinsSpecRestore restore;
        private final java.util.List<jenkins.JenkinsSpecRoles> roles;
        private final java.util.List<jenkins.JenkinsSpecSeedJobs> seedJobs;
        private final jenkins.JenkinsSpecService service;
        private final jenkins.JenkinsSpecServiceAccount serviceAccount;
        private final jenkins.JenkinsSpecSlaveService slaveService;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jenkinsApiSettings = this.jsiiGet("jenkinsAPISettings", jenkins.JenkinsSpecJenkinsApiSettings.class);
            this.master = this.jsiiGet("master", jenkins.JenkinsSpecMaster.class);
            this.backup = this.jsiiGet("backup", jenkins.JenkinsSpecBackup.class);
            this.configurationAsCode = this.jsiiGet("configurationAsCode", jenkins.JenkinsSpecConfigurationAsCode.class);
            this.groovyScripts = this.jsiiGet("groovyScripts", jenkins.JenkinsSpecGroovyScripts.class);
            this.notifications = this.jsiiGet("notifications", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecNotifications.class)));
            this.restore = this.jsiiGet("restore", jenkins.JenkinsSpecRestore.class);
            this.roles = this.jsiiGet("roles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecRoles.class)));
            this.seedJobs = this.jsiiGet("seedJobs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecSeedJobs.class)));
            this.service = this.jsiiGet("service", jenkins.JenkinsSpecService.class);
            this.serviceAccount = this.jsiiGet("serviceAccount", jenkins.JenkinsSpecServiceAccount.class);
            this.slaveService = this.jsiiGet("slaveService", jenkins.JenkinsSpecSlaveService.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecJenkinsApiSettings jenkinsApiSettings, final jenkins.JenkinsSpecMaster master, final jenkins.JenkinsSpecBackup backup, final jenkins.JenkinsSpecConfigurationAsCode configurationAsCode, final jenkins.JenkinsSpecGroovyScripts groovyScripts, final java.util.List<jenkins.JenkinsSpecNotifications> notifications, final jenkins.JenkinsSpecRestore restore, final java.util.List<jenkins.JenkinsSpecRoles> roles, final java.util.List<jenkins.JenkinsSpecSeedJobs> seedJobs, final jenkins.JenkinsSpecService service, final jenkins.JenkinsSpecServiceAccount serviceAccount, final jenkins.JenkinsSpecSlaveService slaveService) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jenkinsApiSettings = java.util.Objects.requireNonNull(jenkinsApiSettings, "jenkinsApiSettings is required");
            this.master = java.util.Objects.requireNonNull(master, "master is required");
            this.backup = backup;
            this.configurationAsCode = configurationAsCode;
            this.groovyScripts = groovyScripts;
            this.notifications = notifications;
            this.restore = restore;
            this.roles = roles;
            this.seedJobs = seedJobs;
            this.service = service;
            this.serviceAccount = serviceAccount;
            this.slaveService = slaveService;
        }

        @Override
        public jenkins.JenkinsSpecJenkinsApiSettings getJenkinsApiSettings() {
            return this.jenkinsApiSettings;
        }

        @Override
        public jenkins.JenkinsSpecMaster getMaster() {
            return this.master;
        }

        @Override
        public jenkins.JenkinsSpecBackup getBackup() {
            return this.backup;
        }

        @Override
        public jenkins.JenkinsSpecConfigurationAsCode getConfigurationAsCode() {
            return this.configurationAsCode;
        }

        @Override
        public jenkins.JenkinsSpecGroovyScripts getGroovyScripts() {
            return this.groovyScripts;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecNotifications> getNotifications() {
            return this.notifications;
        }

        @Override
        public jenkins.JenkinsSpecRestore getRestore() {
            return this.restore;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecRoles> getRoles() {
            return this.roles;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecSeedJobs> getSeedJobs() {
            return this.seedJobs;
        }

        @Override
        public jenkins.JenkinsSpecService getService() {
            return this.service;
        }

        @Override
        public jenkins.JenkinsSpecServiceAccount getServiceAccount() {
            return this.serviceAccount;
        }

        @Override
        public jenkins.JenkinsSpecSlaveService getSlaveService() {
            return this.slaveService;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("jenkinsAPISettings", om.valueToTree(this.getJenkinsApiSettings()));
            data.set("master", om.valueToTree(this.getMaster()));
            if (this.getBackup() != null) {
                data.set("backup", om.valueToTree(this.getBackup()));
            }
            if (this.getConfigurationAsCode() != null) {
                data.set("configurationAsCode", om.valueToTree(this.getConfigurationAsCode()));
            }
            if (this.getGroovyScripts() != null) {
                data.set("groovyScripts", om.valueToTree(this.getGroovyScripts()));
            }
            if (this.getNotifications() != null) {
                data.set("notifications", om.valueToTree(this.getNotifications()));
            }
            if (this.getRestore() != null) {
                data.set("restore", om.valueToTree(this.getRestore()));
            }
            if (this.getRoles() != null) {
                data.set("roles", om.valueToTree(this.getRoles()));
            }
            if (this.getSeedJobs() != null) {
                data.set("seedJobs", om.valueToTree(this.getSeedJobs()));
            }
            if (this.getService() != null) {
                data.set("service", om.valueToTree(this.getService()));
            }
            if (this.getServiceAccount() != null) {
                data.set("serviceAccount", om.valueToTree(this.getServiceAccount()));
            }
            if (this.getSlaveService() != null) {
                data.set("slaveService", om.valueToTree(this.getSlaveService()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpec.Jsii$Proxy that = (JenkinsSpec.Jsii$Proxy) o;

            if (!jenkinsApiSettings.equals(that.jenkinsApiSettings)) return false;
            if (!master.equals(that.master)) return false;
            if (this.backup != null ? !this.backup.equals(that.backup) : that.backup != null) return false;
            if (this.configurationAsCode != null ? !this.configurationAsCode.equals(that.configurationAsCode) : that.configurationAsCode != null) return false;
            if (this.groovyScripts != null ? !this.groovyScripts.equals(that.groovyScripts) : that.groovyScripts != null) return false;
            if (this.notifications != null ? !this.notifications.equals(that.notifications) : that.notifications != null) return false;
            if (this.restore != null ? !this.restore.equals(that.restore) : that.restore != null) return false;
            if (this.roles != null ? !this.roles.equals(that.roles) : that.roles != null) return false;
            if (this.seedJobs != null ? !this.seedJobs.equals(that.seedJobs) : that.seedJobs != null) return false;
            if (this.service != null ? !this.service.equals(that.service) : that.service != null) return false;
            if (this.serviceAccount != null ? !this.serviceAccount.equals(that.serviceAccount) : that.serviceAccount != null) return false;
            return this.slaveService != null ? this.slaveService.equals(that.slaveService) : that.slaveService == null;
        }

        @Override
        public int hashCode() {
            int result = this.jenkinsApiSettings.hashCode();
            result = 31 * result + (this.master.hashCode());
            result = 31 * result + (this.backup != null ? this.backup.hashCode() : 0);
            result = 31 * result + (this.configurationAsCode != null ? this.configurationAsCode.hashCode() : 0);
            result = 31 * result + (this.groovyScripts != null ? this.groovyScripts.hashCode() : 0);
            result = 31 * result + (this.notifications != null ? this.notifications.hashCode() : 0);
            result = 31 * result + (this.restore != null ? this.restore.hashCode() : 0);
            result = 31 * result + (this.roles != null ? this.roles.hashCode() : 0);
            result = 31 * result + (this.seedJobs != null ? this.seedJobs.hashCode() : 0);
            result = 31 * result + (this.service != null ? this.service.hashCode() : 0);
            result = 31 * result + (this.serviceAccount != null ? this.serviceAccount.hashCode() : 0);
            result = 31 * result + (this.slaveService != null ? this.slaveService.hashCode() : 0);
            return result;
        }
    }
}
