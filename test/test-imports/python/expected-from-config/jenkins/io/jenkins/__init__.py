import abc
import builtins
import datetime
import enum
import typing

import jsii
import jsii.compat
import publication

from ._jsii import *

import cdk8s
import constructs


class Jenkins(
    cdk8s.ApiObject,
    metaclass=jsii.JSIIMeta,
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.Jenkins",
):
    """Jenkins is the Schema for the jenkins API.

    schema:
    :schema:: Jenkins
    """

    def __init__(
        self,
        scope: constructs.Construct,
        name: str,
        *,
        metadata: typing.Any = None,
        spec: typing.Optional["JenkinsSpec"] = None,
    ) -> None:
        """Defines a "Jenkins" API object.

        :param scope: the scope in which to define this object.
        :param name: a scope-local name for the object.
        :param metadata: 
        :param spec: Spec defines the desired state of the Jenkins.
        """
        options = JenkinsOptions(metadata=metadata, spec=spec)

        jsii.create(Jenkins, self, [scope, name, options])


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsOptions",
    jsii_struct_bases=[],
    name_mapping={"metadata": "metadata", "spec": "spec"},
)
class JenkinsOptions:
    def __init__(
        self,
        *,
        metadata: typing.Any = None,
        spec: typing.Optional["JenkinsSpec"] = None,
    ) -> None:
        """Jenkins is the Schema for the jenkins API.

        :param metadata: 
        :param spec: Spec defines the desired state of the Jenkins.

        schema:
        :schema:: Jenkins
        """
        if isinstance(spec, dict):
            spec = JenkinsSpec(**spec)
        self._values = {}
        if metadata is not None:
            self._values["metadata"] = metadata
        if spec is not None:
            self._values["spec"] = spec

    @builtins.property
    def metadata(self) -> typing.Any:
        """
        schema:
        :schema:: Jenkins#metadata
        """
        return self._values.get("metadata")

    @builtins.property
    def spec(self) -> typing.Optional["JenkinsSpec"]:
        """Spec defines the desired state of the Jenkins.

        schema:
        :schema:: Jenkins#spec
        """
        return self._values.get("spec")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsOptions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpec",
    jsii_struct_bases=[],
    name_mapping={
        "jenkins_api_settings": "jenkinsAPISettings",
        "master": "master",
        "backup": "backup",
        "configuration_as_code": "configurationAsCode",
        "groovy_scripts": "groovyScripts",
        "notifications": "notifications",
        "restore": "restore",
        "roles": "roles",
        "seed_jobs": "seedJobs",
        "service": "service",
        "service_account": "serviceAccount",
        "slave_service": "slaveService",
    },
)
class JenkinsSpec:
    def __init__(
        self,
        *,
        jenkins_api_settings: "JenkinsSpecJenkinsApiSettings",
        master: "JenkinsSpecMaster",
        backup: typing.Optional["JenkinsSpecBackup"] = None,
        configuration_as_code: typing.Optional["JenkinsSpecConfigurationAsCode"] = None,
        groovy_scripts: typing.Optional["JenkinsSpecGroovyScripts"] = None,
        notifications: typing.Optional[typing.List["JenkinsSpecNotifications"]] = None,
        restore: typing.Optional["JenkinsSpecRestore"] = None,
        roles: typing.Optional[typing.List["JenkinsSpecRoles"]] = None,
        seed_jobs: typing.Optional[typing.List["JenkinsSpecSeedJobs"]] = None,
        service: typing.Optional["JenkinsSpecService"] = None,
        service_account: typing.Optional["JenkinsSpecServiceAccount"] = None,
        slave_service: typing.Optional["JenkinsSpecSlaveService"] = None,
    ) -> None:
        """Spec defines the desired state of the Jenkins.

        :param jenkins_api_settings: JenkinsAPISettings defines configuration used by the operator to gain admin access to the Jenkins API.
        :param master: Master represents Jenkins master pod properties and Jenkins plugins. Every single change here requires a pod restart.
        :param backup: Backup defines configuration of Jenkins backup More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
        :param configuration_as_code: ConfigurationAsCode defines configuration of Jenkins customization via Configuration as Code Jenkins plugin.
        :param groovy_scripts: GroovyScripts defines configuration of Jenkins customization via groovy scripts.
        :param notifications: Notifications defines list of a services which are used to inform about Jenkins status Can be used to integrate chat services like Slack, Microsoft Teams or Mailgun.
        :param restore: Backup defines configuration of Jenkins backup restore More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.
        :param roles: Roles defines list of extra RBAC roles for the Jenkins Master pod service account.
        :param seed_jobs: SeedJobs defines list of Jenkins Seed Job configurations More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-seed-jobs-and-pipelines.
        :param service: Service is Kubernetes service of Jenkins master HTTP pod Defaults to : port: 8080 type: ClusterIP. Default: port: 8080 type: ClusterIP
        :param service_account: ServiceAccount defines Jenkins master service account attributes.
        :param slave_service: Service is Kubernetes service of Jenkins slave pods Defaults to : port: 50000 type: ClusterIP. Default: port: 50000 type: ClusterIP

        schema:
        :schema:: JenkinsSpec
        """
        if isinstance(jenkins_api_settings, dict):
            jenkins_api_settings = JenkinsSpecJenkinsApiSettings(**jenkins_api_settings)
        if isinstance(master, dict):
            master = JenkinsSpecMaster(**master)
        if isinstance(backup, dict):
            backup = JenkinsSpecBackup(**backup)
        if isinstance(configuration_as_code, dict):
            configuration_as_code = JenkinsSpecConfigurationAsCode(
                **configuration_as_code
            )
        if isinstance(groovy_scripts, dict):
            groovy_scripts = JenkinsSpecGroovyScripts(**groovy_scripts)
        if isinstance(restore, dict):
            restore = JenkinsSpecRestore(**restore)
        if isinstance(service, dict):
            service = JenkinsSpecService(**service)
        if isinstance(service_account, dict):
            service_account = JenkinsSpecServiceAccount(**service_account)
        if isinstance(slave_service, dict):
            slave_service = JenkinsSpecSlaveService(**slave_service)
        self._values = {
            "jenkins_api_settings": jenkins_api_settings,
            "master": master,
        }
        if backup is not None:
            self._values["backup"] = backup
        if configuration_as_code is not None:
            self._values["configuration_as_code"] = configuration_as_code
        if groovy_scripts is not None:
            self._values["groovy_scripts"] = groovy_scripts
        if notifications is not None:
            self._values["notifications"] = notifications
        if restore is not None:
            self._values["restore"] = restore
        if roles is not None:
            self._values["roles"] = roles
        if seed_jobs is not None:
            self._values["seed_jobs"] = seed_jobs
        if service is not None:
            self._values["service"] = service
        if service_account is not None:
            self._values["service_account"] = service_account
        if slave_service is not None:
            self._values["slave_service"] = slave_service

    @builtins.property
    def jenkins_api_settings(self) -> "JenkinsSpecJenkinsApiSettings":
        """JenkinsAPISettings defines configuration used by the operator to gain admin access to the Jenkins API.

        schema:
        :schema:: JenkinsSpec#jenkinsAPISettings
        """
        return self._values.get("jenkins_api_settings")

    @builtins.property
    def master(self) -> "JenkinsSpecMaster":
        """Master represents Jenkins master pod properties and Jenkins plugins.

        Every single change here requires a pod restart.

        schema:
        :schema:: JenkinsSpec#master
        """
        return self._values.get("master")

    @builtins.property
    def backup(self) -> typing.Optional["JenkinsSpecBackup"]:
        """Backup defines configuration of Jenkins backup More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.

        schema:
        :schema:: JenkinsSpec#backup
        """
        return self._values.get("backup")

    @builtins.property
    def configuration_as_code(
        self,
    ) -> typing.Optional["JenkinsSpecConfigurationAsCode"]:
        """ConfigurationAsCode defines configuration of Jenkins customization via Configuration as Code Jenkins plugin.

        schema:
        :schema:: JenkinsSpec#configurationAsCode
        """
        return self._values.get("configuration_as_code")

    @builtins.property
    def groovy_scripts(self) -> typing.Optional["JenkinsSpecGroovyScripts"]:
        """GroovyScripts defines configuration of Jenkins customization via groovy scripts.

        schema:
        :schema:: JenkinsSpec#groovyScripts
        """
        return self._values.get("groovy_scripts")

    @builtins.property
    def notifications(self) -> typing.Optional[typing.List["JenkinsSpecNotifications"]]:
        """Notifications defines list of a services which are used to inform about Jenkins status Can be used to integrate chat services like Slack, Microsoft Teams or Mailgun.

        schema:
        :schema:: JenkinsSpec#notifications
        """
        return self._values.get("notifications")

    @builtins.property
    def restore(self) -> typing.Optional["JenkinsSpecRestore"]:
        """Backup defines configuration of Jenkins backup restore More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.

        schema:
        :schema:: JenkinsSpec#restore
        """
        return self._values.get("restore")

    @builtins.property
    def roles(self) -> typing.Optional[typing.List["JenkinsSpecRoles"]]:
        """Roles defines list of extra RBAC roles for the Jenkins Master pod service account.

        schema:
        :schema:: JenkinsSpec#roles
        """
        return self._values.get("roles")

    @builtins.property
    def seed_jobs(self) -> typing.Optional[typing.List["JenkinsSpecSeedJobs"]]:
        """SeedJobs defines list of Jenkins Seed Job configurations More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-seed-jobs-and-pipelines.

        schema:
        :schema:: JenkinsSpec#seedJobs
        """
        return self._values.get("seed_jobs")

    @builtins.property
    def service(self) -> typing.Optional["JenkinsSpecService"]:
        """Service is Kubernetes service of Jenkins master HTTP pod Defaults to : port: 8080 type: ClusterIP.

        default
        :default: port: 8080 type: ClusterIP

        schema:
        :schema:: JenkinsSpec#service
        """
        return self._values.get("service")

    @builtins.property
    def service_account(self) -> typing.Optional["JenkinsSpecServiceAccount"]:
        """ServiceAccount defines Jenkins master service account attributes.

        schema:
        :schema:: JenkinsSpec#serviceAccount
        """
        return self._values.get("service_account")

    @builtins.property
    def slave_service(self) -> typing.Optional["JenkinsSpecSlaveService"]:
        """Service is Kubernetes service of Jenkins slave pods Defaults to : port: 50000 type: ClusterIP.

        default
        :default: port: 50000 type: ClusterIP

        schema:
        :schema:: JenkinsSpec#slaveService
        """
        return self._values.get("slave_service")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecBackup",
    jsii_struct_bases=[],
    name_mapping={
        "action": "action",
        "container_name": "containerName",
        "interval": "interval",
        "make_backup_before_pod_deletion": "makeBackupBeforePodDeletion",
    },
)
class JenkinsSpecBackup:
    def __init__(
        self,
        *,
        action: "JenkinsSpecBackupAction",
        container_name: str,
        interval: jsii.Number,
        make_backup_before_pod_deletion: bool,
    ) -> None:
        """Backup defines configuration of Jenkins backup More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.

        :param action: Action defines action which performs backup in backup container sidecar.
        :param container_name: ContainerName is the container name responsible for backup operation.
        :param interval: Interval tells how often make backup in seconds Defaults to 30. Default: 30.
        :param make_backup_before_pod_deletion: MakeBackupBeforePodDeletion tells operator to make backup before Jenkins master pod deletion.

        schema:
        :schema:: JenkinsSpecBackup
        """
        if isinstance(action, dict):
            action = JenkinsSpecBackupAction(**action)
        self._values = {
            "action": action,
            "container_name": container_name,
            "interval": interval,
            "make_backup_before_pod_deletion": make_backup_before_pod_deletion,
        }

    @builtins.property
    def action(self) -> "JenkinsSpecBackupAction":
        """Action defines action which performs backup in backup container sidecar.

        schema:
        :schema:: JenkinsSpecBackup#action
        """
        return self._values.get("action")

    @builtins.property
    def container_name(self) -> str:
        """ContainerName is the container name responsible for backup operation.

        schema:
        :schema:: JenkinsSpecBackup#containerName
        """
        return self._values.get("container_name")

    @builtins.property
    def interval(self) -> jsii.Number:
        """Interval tells how often make backup in seconds Defaults to 30.

        default
        :default: 30.

        schema:
        :schema:: JenkinsSpecBackup#interval
        """
        return self._values.get("interval")

    @builtins.property
    def make_backup_before_pod_deletion(self) -> bool:
        """MakeBackupBeforePodDeletion tells operator to make backup before Jenkins master pod deletion.

        schema:
        :schema:: JenkinsSpecBackup#makeBackupBeforePodDeletion
        """
        return self._values.get("make_backup_before_pod_deletion")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecBackup(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecBackupAction",
    jsii_struct_bases=[],
    name_mapping={"exec": "exec"},
)
class JenkinsSpecBackupAction:
    def __init__(
        self, *, exec: typing.Optional["JenkinsSpecBackupActionExec"] = None
    ) -> None:
        """Action defines action which performs backup in backup container sidecar.

        :param exec: Exec specifies the action to take.

        schema:
        :schema:: JenkinsSpecBackupAction
        """
        if isinstance(exec, dict):
            exec = JenkinsSpecBackupActionExec(**exec)
        self._values = {}
        if exec is not None:
            self._values["exec"] = exec

    @builtins.property
    def exec(self) -> typing.Optional["JenkinsSpecBackupActionExec"]:
        """Exec specifies the action to take.

        schema:
        :schema:: JenkinsSpecBackupAction#exec
        """
        return self._values.get("exec")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecBackupAction(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecBackupActionExec",
    jsii_struct_bases=[],
    name_mapping={"command": "command"},
)
class JenkinsSpecBackupActionExec:
    def __init__(self, *, command: typing.Optional[typing.List[str]] = None) -> None:
        """Exec specifies the action to take.

        :param command: Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecBackupActionExec
        """
        self._values = {}
        if command is not None:
            self._values["command"] = command

    @builtins.property
    def command(self) -> typing.Optional[typing.List[str]]:
        """Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.

        The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecBackupActionExec#command
        """
        return self._values.get("command")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecBackupActionExec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecConfigurationAsCode",
    jsii_struct_bases=[],
    name_mapping={"configurations": "configurations", "secret": "secret"},
)
class JenkinsSpecConfigurationAsCode:
    def __init__(
        self,
        *,
        configurations: typing.List["JenkinsSpecConfigurationAsCodeConfigurations"],
        secret: "JenkinsSpecConfigurationAsCodeSecret",
    ) -> None:
        """ConfigurationAsCode defines configuration of Jenkins customization via Configuration as Code Jenkins plugin.

        :param configurations: 
        :param secret: SecretRef is reference to Kubernetes secret.

        schema:
        :schema:: JenkinsSpecConfigurationAsCode
        """
        if isinstance(secret, dict):
            secret = JenkinsSpecConfigurationAsCodeSecret(**secret)
        self._values = {
            "configurations": configurations,
            "secret": secret,
        }

    @builtins.property
    def configurations(
        self,
    ) -> typing.List["JenkinsSpecConfigurationAsCodeConfigurations"]:
        """
        schema:
        :schema:: JenkinsSpecConfigurationAsCode#configurations
        """
        return self._values.get("configurations")

    @builtins.property
    def secret(self) -> "JenkinsSpecConfigurationAsCodeSecret":
        """SecretRef is reference to Kubernetes secret.

        schema:
        :schema:: JenkinsSpecConfigurationAsCode#secret
        """
        return self._values.get("secret")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecConfigurationAsCode(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecConfigurationAsCodeConfigurations",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecConfigurationAsCodeConfigurations:
    def __init__(self, *, name: str) -> None:
        """ConfigMapRef is reference to Kubernetes ConfigMap.

        :param name: 

        schema:
        :schema:: JenkinsSpecConfigurationAsCodeConfigurations
        """
        self._values = {
            "name": name,
        }

    @builtins.property
    def name(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecConfigurationAsCodeConfigurations#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecConfigurationAsCodeConfigurations(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecConfigurationAsCodeSecret",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecConfigurationAsCodeSecret:
    def __init__(self, *, name: str) -> None:
        """SecretRef is reference to Kubernetes secret.

        :param name: 

        schema:
        :schema:: JenkinsSpecConfigurationAsCodeSecret
        """
        self._values = {
            "name": name,
        }

    @builtins.property
    def name(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecConfigurationAsCodeSecret#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecConfigurationAsCodeSecret(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecGroovyScripts",
    jsii_struct_bases=[],
    name_mapping={"configurations": "configurations", "secret": "secret"},
)
class JenkinsSpecGroovyScripts:
    def __init__(
        self,
        *,
        configurations: typing.List["JenkinsSpecGroovyScriptsConfigurations"],
        secret: "JenkinsSpecGroovyScriptsSecret",
    ) -> None:
        """GroovyScripts defines configuration of Jenkins customization via groovy scripts.

        :param configurations: 
        :param secret: SecretRef is reference to Kubernetes secret.

        schema:
        :schema:: JenkinsSpecGroovyScripts
        """
        if isinstance(secret, dict):
            secret = JenkinsSpecGroovyScriptsSecret(**secret)
        self._values = {
            "configurations": configurations,
            "secret": secret,
        }

    @builtins.property
    def configurations(self) -> typing.List["JenkinsSpecGroovyScriptsConfigurations"]:
        """
        schema:
        :schema:: JenkinsSpecGroovyScripts#configurations
        """
        return self._values.get("configurations")

    @builtins.property
    def secret(self) -> "JenkinsSpecGroovyScriptsSecret":
        """SecretRef is reference to Kubernetes secret.

        schema:
        :schema:: JenkinsSpecGroovyScripts#secret
        """
        return self._values.get("secret")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecGroovyScripts(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecGroovyScriptsConfigurations",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecGroovyScriptsConfigurations:
    def __init__(self, *, name: str) -> None:
        """ConfigMapRef is reference to Kubernetes ConfigMap.

        :param name: 

        schema:
        :schema:: JenkinsSpecGroovyScriptsConfigurations
        """
        self._values = {
            "name": name,
        }

    @builtins.property
    def name(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecGroovyScriptsConfigurations#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecGroovyScriptsConfigurations(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecGroovyScriptsSecret",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecGroovyScriptsSecret:
    def __init__(self, *, name: str) -> None:
        """SecretRef is reference to Kubernetes secret.

        :param name: 

        schema:
        :schema:: JenkinsSpecGroovyScriptsSecret
        """
        self._values = {
            "name": name,
        }

    @builtins.property
    def name(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecGroovyScriptsSecret#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecGroovyScriptsSecret(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecJenkinsApiSettings",
    jsii_struct_bases=[],
    name_mapping={"authorization_strategy": "authorizationStrategy"},
)
class JenkinsSpecJenkinsApiSettings:
    def __init__(self, *, authorization_strategy: str) -> None:
        """JenkinsAPISettings defines configuration used by the operator to gain admin access to the Jenkins API.

        :param authorization_strategy: AuthorizationStrategy defines authorization strategy of the operator for the Jenkins API.

        schema:
        :schema:: JenkinsSpecJenkinsApiSettings
        """
        self._values = {
            "authorization_strategy": authorization_strategy,
        }

    @builtins.property
    def authorization_strategy(self) -> str:
        """AuthorizationStrategy defines authorization strategy of the operator for the Jenkins API.

        schema:
        :schema:: JenkinsSpecJenkinsApiSettings#authorizationStrategy
        """
        return self._values.get("authorization_strategy")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecJenkinsApiSettings(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMaster",
    jsii_struct_bases=[],
    name_mapping={
        "disable_csrf_protection": "disableCSRFProtection",
        "annotations": "annotations",
        "base_plugins": "basePlugins",
        "containers": "containers",
        "image_pull_secrets": "imagePullSecrets",
        "labels": "labels",
        "master_annotations": "masterAnnotations",
        "node_selector": "nodeSelector",
        "plugins": "plugins",
        "security_context": "securityContext",
        "tolerations": "tolerations",
        "volumes": "volumes",
    },
)
class JenkinsSpecMaster:
    def __init__(
        self,
        *,
        disable_csrf_protection: bool,
        annotations: typing.Optional[typing.Mapping[str, str]] = None,
        base_plugins: typing.Optional[
            typing.List["JenkinsSpecMasterBasePlugins"]
        ] = None,
        containers: typing.Optional[typing.List["JenkinsSpecMasterContainers"]] = None,
        image_pull_secrets: typing.Optional[
            typing.List["JenkinsSpecMasterImagePullSecrets"]
        ] = None,
        labels: typing.Optional[typing.Mapping[str, str]] = None,
        master_annotations: typing.Optional[typing.Mapping[str, str]] = None,
        node_selector: typing.Optional[typing.Mapping[str, str]] = None,
        plugins: typing.Optional[typing.List["JenkinsSpecMasterPlugins"]] = None,
        security_context: typing.Optional["JenkinsSpecMasterSecurityContext"] = None,
        tolerations: typing.Optional[
            typing.List["JenkinsSpecMasterTolerations"]
        ] = None,
        volumes: typing.Optional[typing.List["JenkinsSpecMasterVolumes"]] = None,
    ) -> None:
        """Master represents Jenkins master pod properties and Jenkins plugins.

        Every single change here requires a pod restart.

        :param disable_csrf_protection: DisableCSRFProtection allows you to toggle CSRF Protection on Jenkins.
        :param annotations: Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
        :param base_plugins: BasePlugins contains plugins required by operator Defaults to : - name: kubernetes version: 1.15.7 - name: workflow-job version: "2.32" - name: workflow-aggregator version: "2.6" - name: git version: 3.10.0 - name: job-dsl version: "1.74" - name: configuration-as-code version: "1.19" - name: configuration-as-code-support version: "1.19" - name: kubernetes-credentials-provider version: 0.12.1. Default: name: kubernetes version: 1.15.7 - name: workflow-job version: "2.32" - name: workflow-aggregator version: "2.6" - name: git version: 3.10.0 - name: job-dsl version: "1.74" - name: configuration-as-code version: "1.19" - name: configuration-as-code-support version: "1.19" - name: kubernetes-credentials-provider version: 0.12.1
        :param containers: List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Defaults to: - image: jenkins/jenkins:lts imagePullPolicy: Always livenessProbe: failureThreshold: 12 httpGet: path: /login port: http scheme: HTTP initialDelaySeconds: 80 periodSeconds: 10 successThreshold: 1 timeoutSeconds: 5 name: jenkins-master readinessProbe: failureThreshold: 3 httpGet: path: /login port: http scheme: HTTP initialDelaySeconds: 30 periodSeconds: 10 successThreshold: 1 timeoutSeconds: 1 resources: limits: cpu: 1500m memory: 3Gi requests: cpu: "1" memory: 600Mi Default: image: jenkins/jenkins:lts imagePullPolicy: Always livenessProbe: failureThreshold: 12 httpGet: path: /login port: http scheme: HTTP initialDelaySeconds: 80 periodSeconds: 10 successThreshold: 1 timeoutSeconds: 5 name: jenkins-master readinessProbe: failureThreshold: 3 httpGet: path: /login port: http scheme: HTTP initialDelaySeconds: 30 periodSeconds: 10 successThreshold: 1 timeoutSeconds: 1 resources: limits: cpu: 1500m memory: 3Gi requests: cpu: "1" memory: 600Mi
        :param image_pull_secrets: ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
        :param labels: Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
        :param master_annotations: Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations Deprecated: will be removed in the future, please use Annotations(annotations)
        :param node_selector: NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
        :param plugins: Plugins contains plugins required by user.
        :param security_context: SecurityContext that applies to all the containers of the Jenkins Master. As per kubernetes specification, it can be overridden for each container individually. Defaults to: runAsUser: 1000 fsGroup: 1000 Default: runAsUser: 1000 fsGroup: 1000
        :param tolerations: If specified, the pod's tolerations.
        :param volumes: List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes

        schema:
        :schema:: JenkinsSpecMaster
        """
        if isinstance(security_context, dict):
            security_context = JenkinsSpecMasterSecurityContext(**security_context)
        self._values = {
            "disable_csrf_protection": disable_csrf_protection,
        }
        if annotations is not None:
            self._values["annotations"] = annotations
        if base_plugins is not None:
            self._values["base_plugins"] = base_plugins
        if containers is not None:
            self._values["containers"] = containers
        if image_pull_secrets is not None:
            self._values["image_pull_secrets"] = image_pull_secrets
        if labels is not None:
            self._values["labels"] = labels
        if master_annotations is not None:
            self._values["master_annotations"] = master_annotations
        if node_selector is not None:
            self._values["node_selector"] = node_selector
        if plugins is not None:
            self._values["plugins"] = plugins
        if security_context is not None:
            self._values["security_context"] = security_context
        if tolerations is not None:
            self._values["tolerations"] = tolerations
        if volumes is not None:
            self._values["volumes"] = volumes

    @builtins.property
    def disable_csrf_protection(self) -> bool:
        """DisableCSRFProtection allows you to toggle CSRF Protection on Jenkins.

        schema:
        :schema:: JenkinsSpecMaster#disableCSRFProtection
        """
        return self._values.get("disable_csrf_protection")

    @builtins.property
    def annotations(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.

        They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations

        schema:
        :schema:: JenkinsSpecMaster#annotations
        """
        return self._values.get("annotations")

    @builtins.property
    def base_plugins(
        self,
    ) -> typing.Optional[typing.List["JenkinsSpecMasterBasePlugins"]]:
        """BasePlugins contains plugins required by operator Defaults to : - name: kubernetes version: 1.15.7 - name: workflow-job version: "2.32" - name: workflow-aggregator version: "2.6" - name: git version: 3.10.0 - name: job-dsl version: "1.74" - name: configuration-as-code version: "1.19" - name: configuration-as-code-support version: "1.19" - name: kubernetes-credentials-provider version: 0.12.1.

        default
        :default: name: kubernetes version: 1.15.7 - name: workflow-job version: "2.32" - name: workflow-aggregator version: "2.6" - name: git version: 3.10.0 - name: job-dsl version: "1.74" - name: configuration-as-code version: "1.19" - name: configuration-as-code-support version: "1.19" - name: kubernetes-credentials-provider version: 0.12.1

        schema:
        :schema:: JenkinsSpecMaster#basePlugins
        """
        return self._values.get("base_plugins")

    @builtins.property
    def containers(self) -> typing.Optional[typing.List["JenkinsSpecMasterContainers"]]:
        """List of containers belonging to the pod.

        Containers cannot currently be added or removed. There must be at least one container in a Pod. Defaults to: - image: jenkins/jenkins:lts   imagePullPolicy: Always   livenessProbe:     failureThreshold: 12     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 80     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 5   name: jenkins-master   readinessProbe:     failureThreshold: 3     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 30     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 1   resources:     limits:       cpu: 1500m       memory: 3Gi     requests:       cpu: "1"       memory: 600Mi

        default
        :default: image: jenkins/jenkins:lts   imagePullPolicy: Always   livenessProbe:     failureThreshold: 12     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 80     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 5   name: jenkins-master   readinessProbe:     failureThreshold: 3     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 30     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 1   resources:     limits:       cpu: 1500m       memory: 3Gi     requests:       cpu: "1"       memory: 600Mi

        schema:
        :schema:: JenkinsSpecMaster#containers
        """
        return self._values.get("containers")

    @builtins.property
    def image_pull_secrets(
        self,
    ) -> typing.Optional[typing.List["JenkinsSpecMasterImagePullSecrets"]]:
        """ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec.

        If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod

        schema:
        :schema:: JenkinsSpecMaster#imagePullSecrets
        """
        return self._values.get("image_pull_secrets")

    @builtins.property
    def labels(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Map of string keys and values that can be used to organize and categorize (scope and select) objects.

        May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels

        schema:
        :schema:: JenkinsSpecMaster#labels
        """
        return self._values.get("labels")

    @builtins.property
    def master_annotations(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.

        They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations Deprecated: will be removed in the future, please use Annotations(annotations)

        schema:
        :schema:: JenkinsSpecMaster#masterAnnotations
        """
        return self._values.get("master_annotations")

    @builtins.property
    def node_selector(self) -> typing.Optional[typing.Mapping[str, str]]:
        """NodeSelector is a selector which must be true for the pod to fit on a node.

        Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/

        schema:
        :schema:: JenkinsSpecMaster#nodeSelector
        """
        return self._values.get("node_selector")

    @builtins.property
    def plugins(self) -> typing.Optional[typing.List["JenkinsSpecMasterPlugins"]]:
        """Plugins contains plugins required by user.

        schema:
        :schema:: JenkinsSpecMaster#plugins
        """
        return self._values.get("plugins")

    @builtins.property
    def security_context(self) -> typing.Optional["JenkinsSpecMasterSecurityContext"]:
        """SecurityContext that applies to all the containers of the Jenkins Master.

        As per kubernetes specification, it can be overridden for each container individually. Defaults to: runAsUser: 1000 fsGroup: 1000

        default
        :default: runAsUser: 1000 fsGroup: 1000

        schema:
        :schema:: JenkinsSpecMaster#securityContext
        """
        return self._values.get("security_context")

    @builtins.property
    def tolerations(
        self,
    ) -> typing.Optional[typing.List["JenkinsSpecMasterTolerations"]]:
        """If specified, the pod's tolerations.

        schema:
        :schema:: JenkinsSpecMaster#tolerations
        """
        return self._values.get("tolerations")

    @builtins.property
    def volumes(self) -> typing.Optional[typing.List["JenkinsSpecMasterVolumes"]]:
        """List of volumes that can be mounted by containers belonging to the pod.

        More info: https://kubernetes.io/docs/concepts/storage/volumes

        schema:
        :schema:: JenkinsSpecMaster#volumes
        """
        return self._values.get("volumes")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMaster(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterBasePlugins",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "version": "version"},
)
class JenkinsSpecMasterBasePlugins:
    def __init__(self, *, name: str, version: str) -> None:
        """Plugin defines Jenkins plugin.

        :param name: Name is the name of Jenkins plugin.
        :param version: Version is the version of Jenkins plugin.

        schema:
        :schema:: JenkinsSpecMasterBasePlugins
        """
        self._values = {
            "name": name,
            "version": version,
        }

    @builtins.property
    def name(self) -> str:
        """Name is the name of Jenkins plugin.

        schema:
        :schema:: JenkinsSpecMasterBasePlugins#name
        """
        return self._values.get("name")

    @builtins.property
    def version(self) -> str:
        """Version is the version of Jenkins plugin.

        schema:
        :schema:: JenkinsSpecMasterBasePlugins#version
        """
        return self._values.get("version")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterBasePlugins(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainers",
    jsii_struct_bases=[],
    name_mapping={
        "image": "image",
        "image_pull_policy": "imagePullPolicy",
        "name": "name",
        "resources": "resources",
        "args": "args",
        "command": "command",
        "env": "env",
        "env_from": "envFrom",
        "lifecycle": "lifecycle",
        "liveness_probe": "livenessProbe",
        "ports": "ports",
        "readiness_probe": "readinessProbe",
        "security_context": "securityContext",
        "volume_mounts": "volumeMounts",
        "working_dir": "workingDir",
    },
)
class JenkinsSpecMasterContainers:
    def __init__(
        self,
        *,
        image: str,
        image_pull_policy: str,
        name: str,
        resources: "JenkinsSpecMasterContainersResources",
        args: typing.Optional[typing.List[str]] = None,
        command: typing.Optional[typing.List[str]] = None,
        env: typing.Optional[typing.List["JenkinsSpecMasterContainersEnv"]] = None,
        env_from: typing.Optional[
            typing.List["JenkinsSpecMasterContainersEnvFrom"]
        ] = None,
        lifecycle: typing.Optional["JenkinsSpecMasterContainersLifecycle"] = None,
        liveness_probe: typing.Optional[
            "JenkinsSpecMasterContainersLivenessProbe"
        ] = None,
        ports: typing.Optional[typing.List["JenkinsSpecMasterContainersPorts"]] = None,
        readiness_probe: typing.Optional[
            "JenkinsSpecMasterContainersReadinessProbe"
        ] = None,
        security_context: typing.Optional[
            "JenkinsSpecMasterContainersSecurityContext"
        ] = None,
        volume_mounts: typing.Optional[
            typing.List["JenkinsSpecMasterContainersVolumeMounts"]
        ] = None,
        working_dir: typing.Optional[str] = None,
    ) -> None:
        """Container defines Kubernetes container attributes.

        :param image: Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images
        :param image_pull_policy: Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always. Default: Always.
        :param name: Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL).
        :param resources: Compute Resources required by this container. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
        :param args: Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
        :param command: Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
        :param env: List of environment variables to set in the container.
        :param env_from: List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence.
        :param lifecycle: Actions that the management system should take in response to container lifecycle events.
        :param liveness_probe: Periodic probe of container liveness. Container will be restarted if the probe fails.
        :param ports: List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network.
        :param readiness_probe: Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails.
        :param security_context: Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
        :param volume_mounts: Pod volumes to mount into the container's filesystem.
        :param working_dir: Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image.

        schema:
        :schema:: JenkinsSpecMasterContainers
        """
        if isinstance(resources, dict):
            resources = JenkinsSpecMasterContainersResources(**resources)
        if isinstance(lifecycle, dict):
            lifecycle = JenkinsSpecMasterContainersLifecycle(**lifecycle)
        if isinstance(liveness_probe, dict):
            liveness_probe = JenkinsSpecMasterContainersLivenessProbe(**liveness_probe)
        if isinstance(readiness_probe, dict):
            readiness_probe = JenkinsSpecMasterContainersReadinessProbe(
                **readiness_probe
            )
        if isinstance(security_context, dict):
            security_context = JenkinsSpecMasterContainersSecurityContext(
                **security_context
            )
        self._values = {
            "image": image,
            "image_pull_policy": image_pull_policy,
            "name": name,
            "resources": resources,
        }
        if args is not None:
            self._values["args"] = args
        if command is not None:
            self._values["command"] = command
        if env is not None:
            self._values["env"] = env
        if env_from is not None:
            self._values["env_from"] = env_from
        if lifecycle is not None:
            self._values["lifecycle"] = lifecycle
        if liveness_probe is not None:
            self._values["liveness_probe"] = liveness_probe
        if ports is not None:
            self._values["ports"] = ports
        if readiness_probe is not None:
            self._values["readiness_probe"] = readiness_probe
        if security_context is not None:
            self._values["security_context"] = security_context
        if volume_mounts is not None:
            self._values["volume_mounts"] = volume_mounts
        if working_dir is not None:
            self._values["working_dir"] = working_dir

    @builtins.property
    def image(self) -> str:
        """Docker image name.

        More info: https://kubernetes.io/docs/concepts/containers/images

        schema:
        :schema:: JenkinsSpecMasterContainers#image
        """
        return self._values.get("image")

    @builtins.property
    def image_pull_policy(self) -> str:
        """Image pull policy.

        One of Always, Never, IfNotPresent. Defaults to Always.

        default
        :default: Always.

        schema:
        :schema:: JenkinsSpecMasterContainers#imagePullPolicy
        """
        return self._values.get("image_pull_policy")

    @builtins.property
    def name(self) -> str:
        """Name of the container specified as a DNS_LABEL.

        Each container in a pod must have a unique name (DNS_LABEL).

        schema:
        :schema:: JenkinsSpecMasterContainers#name
        """
        return self._values.get("name")

    @builtins.property
    def resources(self) -> "JenkinsSpecMasterContainersResources":
        """Compute Resources required by this container.

        More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        schema:
        :schema:: JenkinsSpecMasterContainers#resources
        """
        return self._values.get("resources")

    @builtins.property
    def args(self) -> typing.Optional[typing.List[str]]:
        """Arguments to the entrypoint.

        The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

        schema:
        :schema:: JenkinsSpecMasterContainers#args
        """
        return self._values.get("args")

    @builtins.property
    def command(self) -> typing.Optional[typing.List[str]]:
        """Entrypoint array.

        Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell

        schema:
        :schema:: JenkinsSpecMasterContainers#command
        """
        return self._values.get("command")

    @builtins.property
    def env(self) -> typing.Optional[typing.List["JenkinsSpecMasterContainersEnv"]]:
        """List of environment variables to set in the container.

        schema:
        :schema:: JenkinsSpecMasterContainers#env
        """
        return self._values.get("env")

    @builtins.property
    def env_from(
        self,
    ) -> typing.Optional[typing.List["JenkinsSpecMasterContainersEnvFrom"]]:
        """List of sources to populate environment variables in the container.

        The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence.

        schema:
        :schema:: JenkinsSpecMasterContainers#envFrom
        """
        return self._values.get("env_from")

    @builtins.property
    def lifecycle(self) -> typing.Optional["JenkinsSpecMasterContainersLifecycle"]:
        """Actions that the management system should take in response to container lifecycle events.

        schema:
        :schema:: JenkinsSpecMasterContainers#lifecycle
        """
        return self._values.get("lifecycle")

    @builtins.property
    def liveness_probe(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLivenessProbe"]:
        """Periodic probe of container liveness.

        Container will be restarted if the probe fails.

        schema:
        :schema:: JenkinsSpecMasterContainers#livenessProbe
        """
        return self._values.get("liveness_probe")

    @builtins.property
    def ports(self) -> typing.Optional[typing.List["JenkinsSpecMasterContainersPorts"]]:
        """List of ports to expose from the container.

        Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network.

        schema:
        :schema:: JenkinsSpecMasterContainers#ports
        """
        return self._values.get("ports")

    @builtins.property
    def readiness_probe(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersReadinessProbe"]:
        """Periodic probe of container service readiness.

        Container will be removed from service endpoints if the probe fails.

        schema:
        :schema:: JenkinsSpecMasterContainers#readinessProbe
        """
        return self._values.get("readiness_probe")

    @builtins.property
    def security_context(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersSecurityContext"]:
        """Security options the pod should run with.

        More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/

        schema:
        :schema:: JenkinsSpecMasterContainers#securityContext
        """
        return self._values.get("security_context")

    @builtins.property
    def volume_mounts(
        self,
    ) -> typing.Optional[typing.List["JenkinsSpecMasterContainersVolumeMounts"]]:
        """Pod volumes to mount into the container's filesystem.

        schema:
        :schema:: JenkinsSpecMasterContainers#volumeMounts
        """
        return self._values.get("volume_mounts")

    @builtins.property
    def working_dir(self) -> typing.Optional[str]:
        """Container's working directory.

        If not specified, the container runtime's default will be used, which might be configured in the container image.

        schema:
        :schema:: JenkinsSpecMasterContainers#workingDir
        """
        return self._values.get("working_dir")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainers(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersEnv",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value", "value_from": "valueFrom"},
)
class JenkinsSpecMasterContainersEnv:
    def __init__(
        self,
        *,
        name: str,
        value: typing.Optional[str] = None,
        value_from: typing.Optional["JenkinsSpecMasterContainersEnvValueFrom"] = None,
    ) -> None:
        """EnvVar represents an environment variable present in a Container.

        :param name: Name of the environment variable. Must be a C_IDENTIFIER.
        :param value: Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "". Default: .
        :param value_from: Source for the environment variable's value. Cannot be used if value is not empty.

        schema:
        :schema:: JenkinsSpecMasterContainersEnv
        """
        if isinstance(value_from, dict):
            value_from = JenkinsSpecMasterContainersEnvValueFrom(**value_from)
        self._values = {
            "name": name,
        }
        if value is not None:
            self._values["value"] = value
        if value_from is not None:
            self._values["value_from"] = value_from

    @builtins.property
    def name(self) -> str:
        """Name of the environment variable.

        Must be a C_IDENTIFIER.

        schema:
        :schema:: JenkinsSpecMasterContainersEnv#name
        """
        return self._values.get("name")

    @builtins.property
    def value(self) -> typing.Optional[str]:
        """Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.

        If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".

        default
        :default: .

        schema:
        :schema:: JenkinsSpecMasterContainersEnv#value
        """
        return self._values.get("value")

    @builtins.property
    def value_from(self) -> typing.Optional["JenkinsSpecMasterContainersEnvValueFrom"]:
        """Source for the environment variable's value.

        Cannot be used if value is not empty.

        schema:
        :schema:: JenkinsSpecMasterContainersEnv#valueFrom
        """
        return self._values.get("value_from")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersEnv(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersEnvFrom",
    jsii_struct_bases=[],
    name_mapping={
        "config_map_ref": "configMapRef",
        "prefix": "prefix",
        "secret_ref": "secretRef",
    },
)
class JenkinsSpecMasterContainersEnvFrom:
    def __init__(
        self,
        *,
        config_map_ref: typing.Optional[
            "JenkinsSpecMasterContainersEnvFromConfigMapRef"
        ] = None,
        prefix: typing.Optional[str] = None,
        secret_ref: typing.Optional[
            "JenkinsSpecMasterContainersEnvFromSecretRef"
        ] = None,
    ) -> None:
        """EnvFromSource represents the source of a set of ConfigMaps.

        :param config_map_ref: The ConfigMap to select from.
        :param prefix: An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
        :param secret_ref: The Secret to select from.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvFrom
        """
        if isinstance(config_map_ref, dict):
            config_map_ref = JenkinsSpecMasterContainersEnvFromConfigMapRef(
                **config_map_ref
            )
        if isinstance(secret_ref, dict):
            secret_ref = JenkinsSpecMasterContainersEnvFromSecretRef(**secret_ref)
        self._values = {}
        if config_map_ref is not None:
            self._values["config_map_ref"] = config_map_ref
        if prefix is not None:
            self._values["prefix"] = prefix
        if secret_ref is not None:
            self._values["secret_ref"] = secret_ref

    @builtins.property
    def config_map_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersEnvFromConfigMapRef"]:
        """The ConfigMap to select from.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvFrom#configMapRef
        """
        return self._values.get("config_map_ref")

    @builtins.property
    def prefix(self) -> typing.Optional[str]:
        """An optional identifier to prepend to each key in the ConfigMap.

        Must be a C_IDENTIFIER.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvFrom#prefix
        """
        return self._values.get("prefix")

    @builtins.property
    def secret_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersEnvFromSecretRef"]:
        """The Secret to select from.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvFrom#secretRef
        """
        return self._values.get("secret_ref")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersEnvFrom(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersEnvFromConfigMapRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "optional": "optional"},
)
class JenkinsSpecMasterContainersEnvFromConfigMapRef:
    def __init__(
        self,
        *,
        name: typing.Optional[str] = None,
        optional: typing.Optional[bool] = None,
    ) -> None:
        """The ConfigMap to select from.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
        :param optional: Specify whether the ConfigMap must be defined.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvFromConfigMapRef
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name
        if optional is not None:
            self._values["optional"] = optional

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterContainersEnvFromConfigMapRef#name
        """
        return self._values.get("name")

    @builtins.property
    def optional(self) -> typing.Optional[bool]:
        """Specify whether the ConfigMap must be defined.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvFromConfigMapRef#optional
        """
        return self._values.get("optional")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersEnvFromConfigMapRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersEnvFromSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "optional": "optional"},
)
class JenkinsSpecMasterContainersEnvFromSecretRef:
    def __init__(
        self,
        *,
        name: typing.Optional[str] = None,
        optional: typing.Optional[bool] = None,
    ) -> None:
        """The Secret to select from.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
        :param optional: Specify whether the Secret must be defined.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvFromSecretRef
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name
        if optional is not None:
            self._values["optional"] = optional

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterContainersEnvFromSecretRef#name
        """
        return self._values.get("name")

    @builtins.property
    def optional(self) -> typing.Optional[bool]:
        """Specify whether the Secret must be defined.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvFromSecretRef#optional
        """
        return self._values.get("optional")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersEnvFromSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersEnvValueFrom",
    jsii_struct_bases=[],
    name_mapping={
        "config_map_key_ref": "configMapKeyRef",
        "field_ref": "fieldRef",
        "resource_field_ref": "resourceFieldRef",
        "secret_key_ref": "secretKeyRef",
    },
)
class JenkinsSpecMasterContainersEnvValueFrom:
    def __init__(
        self,
        *,
        config_map_key_ref: typing.Optional[
            "JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef"
        ] = None,
        field_ref: typing.Optional[
            "JenkinsSpecMasterContainersEnvValueFromFieldRef"
        ] = None,
        resource_field_ref: typing.Optional[
            "JenkinsSpecMasterContainersEnvValueFromResourceFieldRef"
        ] = None,
        secret_key_ref: typing.Optional[
            "JenkinsSpecMasterContainersEnvValueFromSecretKeyRef"
        ] = None,
    ) -> None:
        """Source for the environment variable's value.

        Cannot be used if value is not empty.

        :param config_map_key_ref: Selects a key of a ConfigMap.
        :param field_ref: Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.
        :param resource_field_ref: Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
        :param secret_key_ref: Selects a key of a secret in the pod's namespace.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFrom
        """
        if isinstance(config_map_key_ref, dict):
            config_map_key_ref = JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef(
                **config_map_key_ref
            )
        if isinstance(field_ref, dict):
            field_ref = JenkinsSpecMasterContainersEnvValueFromFieldRef(**field_ref)
        if isinstance(resource_field_ref, dict):
            resource_field_ref = JenkinsSpecMasterContainersEnvValueFromResourceFieldRef(
                **resource_field_ref
            )
        if isinstance(secret_key_ref, dict):
            secret_key_ref = JenkinsSpecMasterContainersEnvValueFromSecretKeyRef(
                **secret_key_ref
            )
        self._values = {}
        if config_map_key_ref is not None:
            self._values["config_map_key_ref"] = config_map_key_ref
        if field_ref is not None:
            self._values["field_ref"] = field_ref
        if resource_field_ref is not None:
            self._values["resource_field_ref"] = resource_field_ref
        if secret_key_ref is not None:
            self._values["secret_key_ref"] = secret_key_ref

    @builtins.property
    def config_map_key_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef"]:
        """Selects a key of a ConfigMap.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFrom#configMapKeyRef
        """
        return self._values.get("config_map_key_ref")

    @builtins.property
    def field_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersEnvValueFromFieldRef"]:
        """Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFrom#fieldRef
        """
        return self._values.get("field_ref")

    @builtins.property
    def resource_field_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersEnvValueFromResourceFieldRef"]:
        """Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFrom#resourceFieldRef
        """
        return self._values.get("resource_field_ref")

    @builtins.property
    def secret_key_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersEnvValueFromSecretKeyRef"]:
        """Selects a key of a secret in the pod's namespace.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFrom#secretKeyRef
        """
        return self._values.get("secret_key_ref")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersEnvValueFrom(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "name": "name", "optional": "optional"},
)
class JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef:
    def __init__(
        self,
        *,
        key: str,
        name: typing.Optional[str] = None,
        optional: typing.Optional[bool] = None,
    ) -> None:
        """Selects a key of a ConfigMap.

        :param key: The key to select.
        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
        :param optional: Specify whether the ConfigMap or its key must be defined.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef
        """
        self._values = {
            "key": key,
        }
        if name is not None:
            self._values["name"] = name
        if optional is not None:
            self._values["optional"] = optional

    @builtins.property
    def key(self) -> str:
        """The key to select.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef#key
        """
        return self._values.get("key")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef#name
        """
        return self._values.get("name")

    @builtins.property
    def optional(self) -> typing.Optional[bool]:
        """Specify whether the ConfigMap or its key must be defined.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef#optional
        """
        return self._values.get("optional")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersEnvValueFromFieldRef",
    jsii_struct_bases=[],
    name_mapping={"field_path": "fieldPath", "api_version": "apiVersion"},
)
class JenkinsSpecMasterContainersEnvValueFromFieldRef:
    def __init__(
        self, *, field_path: str, api_version: typing.Optional[str] = None
    ) -> None:
        """Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.

        :param field_path: Path of the field to select in the specified API version.
        :param api_version: Version of the schema the FieldPath is written in terms of, defaults to "v1".

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromFieldRef
        """
        self._values = {
            "field_path": field_path,
        }
        if api_version is not None:
            self._values["api_version"] = api_version

    @builtins.property
    def field_path(self) -> str:
        """Path of the field to select in the specified API version.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromFieldRef#fieldPath
        """
        return self._values.get("field_path")

    @builtins.property
    def api_version(self) -> typing.Optional[str]:
        """Version of the schema the FieldPath is written in terms of, defaults to "v1".

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromFieldRef#apiVersion
        """
        return self._values.get("api_version")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersEnvValueFromFieldRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef",
    jsii_struct_bases=[],
    name_mapping={
        "resource": "resource",
        "container_name": "containerName",
        "divisor": "divisor",
    },
)
class JenkinsSpecMasterContainersEnvValueFromResourceFieldRef:
    def __init__(
        self,
        *,
        resource: str,
        container_name: typing.Optional[str] = None,
        divisor: typing.Optional[str] = None,
    ) -> None:
        """Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.

        :param resource: Required: resource to select.
        :param container_name: Container name: required for volumes, optional for env vars.
        :param divisor: Specifies the output format of the exposed resources, defaults to "1".

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromResourceFieldRef
        """
        self._values = {
            "resource": resource,
        }
        if container_name is not None:
            self._values["container_name"] = container_name
        if divisor is not None:
            self._values["divisor"] = divisor

    @builtins.property
    def resource(self) -> str:
        """Required: resource to select.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromResourceFieldRef#resource
        """
        return self._values.get("resource")

    @builtins.property
    def container_name(self) -> typing.Optional[str]:
        """Container name: required for volumes, optional for env vars.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromResourceFieldRef#containerName
        """
        return self._values.get("container_name")

    @builtins.property
    def divisor(self) -> typing.Optional[str]:
        """Specifies the output format of the exposed resources, defaults to "1".

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromResourceFieldRef#divisor
        """
        return self._values.get("divisor")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterContainersEnvValueFromResourceFieldRef(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersEnvValueFromSecretKeyRef",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "name": "name", "optional": "optional"},
)
class JenkinsSpecMasterContainersEnvValueFromSecretKeyRef:
    def __init__(
        self,
        *,
        key: str,
        name: typing.Optional[str] = None,
        optional: typing.Optional[bool] = None,
    ) -> None:
        """Selects a key of a secret in the pod's namespace.

        :param key: The key of the secret to select from. Must be a valid secret key.
        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
        :param optional: Specify whether the Secret or its key must be defined.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromSecretKeyRef
        """
        self._values = {
            "key": key,
        }
        if name is not None:
            self._values["name"] = name
        if optional is not None:
            self._values["optional"] = optional

    @builtins.property
    def key(self) -> str:
        """The key of the secret to select from.

        Must be a valid secret key.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromSecretKeyRef#key
        """
        return self._values.get("key")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromSecretKeyRef#name
        """
        return self._values.get("name")

    @builtins.property
    def optional(self) -> typing.Optional[bool]:
        """Specify whether the Secret or its key must be defined.

        schema:
        :schema:: JenkinsSpecMasterContainersEnvValueFromSecretKeyRef#optional
        """
        return self._values.get("optional")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersEnvValueFromSecretKeyRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecycle",
    jsii_struct_bases=[],
    name_mapping={"post_start": "postStart", "pre_stop": "preStop"},
)
class JenkinsSpecMasterContainersLifecycle:
    def __init__(
        self,
        *,
        post_start: typing.Optional[
            "JenkinsSpecMasterContainersLifecyclePostStart"
        ] = None,
        pre_stop: typing.Optional["JenkinsSpecMasterContainersLifecyclePreStop"] = None,
    ) -> None:
        """Actions that the management system should take in response to container lifecycle events.

        :param post_start: PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
        :param pre_stop: PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks

        schema:
        :schema:: JenkinsSpecMasterContainersLifecycle
        """
        if isinstance(post_start, dict):
            post_start = JenkinsSpecMasterContainersLifecyclePostStart(**post_start)
        if isinstance(pre_stop, dict):
            pre_stop = JenkinsSpecMasterContainersLifecyclePreStop(**pre_stop)
        self._values = {}
        if post_start is not None:
            self._values["post_start"] = post_start
        if pre_stop is not None:
            self._values["pre_stop"] = pre_stop

    @builtins.property
    def post_start(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLifecyclePostStart"]:
        """PostStart is called immediately after a container is created.

        If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks

        schema:
        :schema:: JenkinsSpecMasterContainersLifecycle#postStart
        """
        return self._values.get("post_start")

    @builtins.property
    def pre_stop(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLifecyclePreStop"]:
        """PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.

        The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks

        schema:
        :schema:: JenkinsSpecMasterContainersLifecycle#preStop
        """
        return self._values.get("pre_stop")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLifecycle(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePostStart",
    jsii_struct_bases=[],
    name_mapping={"exec": "exec", "http_get": "httpGet", "tcp_socket": "tcpSocket"},
)
class JenkinsSpecMasterContainersLifecyclePostStart:
    def __init__(
        self,
        *,
        exec: typing.Optional[
            "JenkinsSpecMasterContainersLifecyclePostStartExec"
        ] = None,
        http_get: typing.Optional[
            "JenkinsSpecMasterContainersLifecyclePostStartHttpGet"
        ] = None,
        tcp_socket: typing.Optional[
            "JenkinsSpecMasterContainersLifecyclePostStartTcpSocket"
        ] = None,
    ) -> None:
        """PostStart is called immediately after a container is created.

        If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks

        :param exec: One and only one of the following should be specified. Exec specifies the action to take.
        :param http_get: HTTPGet specifies the http request to perform.
        :param tcp_socket: TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStart
        """
        if isinstance(exec, dict):
            exec = JenkinsSpecMasterContainersLifecyclePostStartExec(**exec)
        if isinstance(http_get, dict):
            http_get = JenkinsSpecMasterContainersLifecyclePostStartHttpGet(**http_get)
        if isinstance(tcp_socket, dict):
            tcp_socket = JenkinsSpecMasterContainersLifecyclePostStartTcpSocket(
                **tcp_socket
            )
        self._values = {}
        if exec is not None:
            self._values["exec"] = exec
        if http_get is not None:
            self._values["http_get"] = http_get
        if tcp_socket is not None:
            self._values["tcp_socket"] = tcp_socket

    @builtins.property
    def exec(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLifecyclePostStartExec"]:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStart#exec
        """
        return self._values.get("exec")

    @builtins.property
    def http_get(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLifecyclePostStartHttpGet"]:
        """HTTPGet specifies the http request to perform.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStart#httpGet
        """
        return self._values.get("http_get")

    @builtins.property
    def tcp_socket(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLifecyclePostStartTcpSocket"]:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStart#tcpSocket
        """
        return self._values.get("tcp_socket")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLifecyclePostStart(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePostStartExec",
    jsii_struct_bases=[],
    name_mapping={"command": "command"},
)
class JenkinsSpecMasterContainersLifecyclePostStartExec:
    def __init__(self, *, command: typing.Optional[typing.List[str]] = None) -> None:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        :param command: Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartExec
        """
        self._values = {}
        if command is not None:
            self._values["command"] = command

    @builtins.property
    def command(self) -> typing.Optional[typing.List[str]]:
        """Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.

        The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartExec#command
        """
        return self._values.get("command")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLifecyclePostStartExec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePostStartHttpGet",
    jsii_struct_bases=[],
    name_mapping={
        "port": "port",
        "host": "host",
        "http_headers": "httpHeaders",
        "path": "path",
        "scheme": "scheme",
    },
)
class JenkinsSpecMasterContainersLifecyclePostStartHttpGet:
    def __init__(
        self,
        *,
        port: "JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort",
        host: typing.Optional[str] = None,
        http_headers: typing.Optional[
            typing.List[
                "JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders"
            ]
        ] = None,
        path: typing.Optional[str] = None,
        scheme: typing.Optional[str] = None,
    ) -> None:
        """HTTPGet specifies the http request to perform.

        :param port: Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
        :param http_headers: Custom headers to set in the request. HTTP allows repeated headers.
        :param path: Path to access on the HTTP server.
        :param scheme: Scheme to use for connecting to the host. Defaults to HTTP. Default: HTTP.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartHttpGet
        """
        self._values = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host
        if http_headers is not None:
            self._values["http_headers"] = http_headers
        if path is not None:
            self._values["path"] = path
        if scheme is not None:
            self._values["scheme"] = scheme

    @builtins.property
    def port(self) -> "JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort":
        """Name or number of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartHttpGet#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Host name to connect to, defaults to the pod IP.

        You probably want to set "Host" in httpHeaders instead.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartHttpGet#host
        """
        return self._values.get("host")

    @builtins.property
    def http_headers(
        self,
    ) -> typing.Optional[
        typing.List["JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders"]
    ]:
        """Custom headers to set in the request.

        HTTP allows repeated headers.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartHttpGet#httpHeaders
        """
        return self._values.get("http_headers")

    @builtins.property
    def path(self) -> typing.Optional[str]:
        """Path to access on the HTTP server.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartHttpGet#path
        """
        return self._values.get("path")

    @builtins.property
    def scheme(self) -> typing.Optional[str]:
        """Scheme to use for connecting to the host.

        Defaults to HTTP.

        default
        :default: HTTP.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartHttpGet#scheme
        """
        return self._values.get("scheme")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLifecyclePostStartHttpGet(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value"},
)
class JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders:
    def __init__(self, *, name: str, value: str) -> None:
        """HTTPHeader describes a custom header to be used in HTTP probes.

        :param name: The header field name.
        :param value: The header field value.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders
        """
        self._values = {
            "name": name,
            "value": value,
        }

    @builtins.property
    def name(self) -> str:
        """The header field name.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders#name
        """
        return self._values.get("name")

    @builtins.property
    def value(self) -> str:
        """The header field value.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders#value
        """
        return self._values.get("value")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


class JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort",
):
    """Name or number of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePostStartTcpSocket",
    jsii_struct_bases=[],
    name_mapping={"port": "port", "host": "host"},
)
class JenkinsSpecMasterContainersLifecyclePostStartTcpSocket:
    def __init__(
        self,
        *,
        port: "JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort",
        host: typing.Optional[str] = None,
    ) -> None:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        :param port: Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartTcpSocket
        """
        self._values = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host

    @builtins.property
    def port(self) -> "JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort":
        """Number or name of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartTcpSocket#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePostStartTcpSocket#host
        """
        return self._values.get("host")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLifecyclePostStartTcpSocket(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort",
):
    """Number or name of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePreStop",
    jsii_struct_bases=[],
    name_mapping={"exec": "exec", "http_get": "httpGet", "tcp_socket": "tcpSocket"},
)
class JenkinsSpecMasterContainersLifecyclePreStop:
    def __init__(
        self,
        *,
        exec: typing.Optional["JenkinsSpecMasterContainersLifecyclePreStopExec"] = None,
        http_get: typing.Optional[
            "JenkinsSpecMasterContainersLifecyclePreStopHttpGet"
        ] = None,
        tcp_socket: typing.Optional[
            "JenkinsSpecMasterContainersLifecyclePreStopTcpSocket"
        ] = None,
    ) -> None:
        """PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.

        The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks

        :param exec: One and only one of the following should be specified. Exec specifies the action to take.
        :param http_get: HTTPGet specifies the http request to perform.
        :param tcp_socket: TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStop
        """
        if isinstance(exec, dict):
            exec = JenkinsSpecMasterContainersLifecyclePreStopExec(**exec)
        if isinstance(http_get, dict):
            http_get = JenkinsSpecMasterContainersLifecyclePreStopHttpGet(**http_get)
        if isinstance(tcp_socket, dict):
            tcp_socket = JenkinsSpecMasterContainersLifecyclePreStopTcpSocket(
                **tcp_socket
            )
        self._values = {}
        if exec is not None:
            self._values["exec"] = exec
        if http_get is not None:
            self._values["http_get"] = http_get
        if tcp_socket is not None:
            self._values["tcp_socket"] = tcp_socket

    @builtins.property
    def exec(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLifecyclePreStopExec"]:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStop#exec
        """
        return self._values.get("exec")

    @builtins.property
    def http_get(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLifecyclePreStopHttpGet"]:
        """HTTPGet specifies the http request to perform.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStop#httpGet
        """
        return self._values.get("http_get")

    @builtins.property
    def tcp_socket(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLifecyclePreStopTcpSocket"]:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStop#tcpSocket
        """
        return self._values.get("tcp_socket")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLifecyclePreStop(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePreStopExec",
    jsii_struct_bases=[],
    name_mapping={"command": "command"},
)
class JenkinsSpecMasterContainersLifecyclePreStopExec:
    def __init__(self, *, command: typing.Optional[typing.List[str]] = None) -> None:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        :param command: Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopExec
        """
        self._values = {}
        if command is not None:
            self._values["command"] = command

    @builtins.property
    def command(self) -> typing.Optional[typing.List[str]]:
        """Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.

        The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopExec#command
        """
        return self._values.get("command")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLifecyclePreStopExec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePreStopHttpGet",
    jsii_struct_bases=[],
    name_mapping={
        "port": "port",
        "host": "host",
        "http_headers": "httpHeaders",
        "path": "path",
        "scheme": "scheme",
    },
)
class JenkinsSpecMasterContainersLifecyclePreStopHttpGet:
    def __init__(
        self,
        *,
        port: "JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort",
        host: typing.Optional[str] = None,
        http_headers: typing.Optional[
            typing.List["JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders"]
        ] = None,
        path: typing.Optional[str] = None,
        scheme: typing.Optional[str] = None,
    ) -> None:
        """HTTPGet specifies the http request to perform.

        :param port: Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
        :param http_headers: Custom headers to set in the request. HTTP allows repeated headers.
        :param path: Path to access on the HTTP server.
        :param scheme: Scheme to use for connecting to the host. Defaults to HTTP. Default: HTTP.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopHttpGet
        """
        self._values = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host
        if http_headers is not None:
            self._values["http_headers"] = http_headers
        if path is not None:
            self._values["path"] = path
        if scheme is not None:
            self._values["scheme"] = scheme

    @builtins.property
    def port(self) -> "JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort":
        """Name or number of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopHttpGet#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Host name to connect to, defaults to the pod IP.

        You probably want to set "Host" in httpHeaders instead.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopHttpGet#host
        """
        return self._values.get("host")

    @builtins.property
    def http_headers(
        self,
    ) -> typing.Optional[
        typing.List["JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders"]
    ]:
        """Custom headers to set in the request.

        HTTP allows repeated headers.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopHttpGet#httpHeaders
        """
        return self._values.get("http_headers")

    @builtins.property
    def path(self) -> typing.Optional[str]:
        """Path to access on the HTTP server.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopHttpGet#path
        """
        return self._values.get("path")

    @builtins.property
    def scheme(self) -> typing.Optional[str]:
        """Scheme to use for connecting to the host.

        Defaults to HTTP.

        default
        :default: HTTP.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopHttpGet#scheme
        """
        return self._values.get("scheme")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLifecyclePreStopHttpGet(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value"},
)
class JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders:
    def __init__(self, *, name: str, value: str) -> None:
        """HTTPHeader describes a custom header to be used in HTTP probes.

        :param name: The header field name.
        :param value: The header field value.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders
        """
        self._values = {
            "name": name,
            "value": value,
        }

    @builtins.property
    def name(self) -> str:
        """The header field name.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders#name
        """
        return self._values.get("name")

    @builtins.property
    def value(self) -> str:
        """The header field value.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders#value
        """
        return self._values.get("value")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


class JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort",
):
    """Name or number of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket",
    jsii_struct_bases=[],
    name_mapping={"port": "port", "host": "host"},
)
class JenkinsSpecMasterContainersLifecyclePreStopTcpSocket:
    def __init__(
        self,
        *,
        port: "JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort",
        host: typing.Optional[str] = None,
    ) -> None:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        :param port: Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopTcpSocket
        """
        self._values = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host

    @builtins.property
    def port(self) -> "JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort":
        """Number or name of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopTcpSocket#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: JenkinsSpecMasterContainersLifecyclePreStopTcpSocket#host
        """
        return self._values.get("host")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLifecyclePreStopTcpSocket(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort",
):
    """Number or name of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLivenessProbe",
    jsii_struct_bases=[],
    name_mapping={
        "exec": "exec",
        "failure_threshold": "failureThreshold",
        "http_get": "httpGet",
        "initial_delay_seconds": "initialDelaySeconds",
        "period_seconds": "periodSeconds",
        "success_threshold": "successThreshold",
        "tcp_socket": "tcpSocket",
        "timeout_seconds": "timeoutSeconds",
    },
)
class JenkinsSpecMasterContainersLivenessProbe:
    def __init__(
        self,
        *,
        exec: typing.Optional["JenkinsSpecMasterContainersLivenessProbeExec"] = None,
        failure_threshold: typing.Optional[jsii.Number] = None,
        http_get: typing.Optional[
            "JenkinsSpecMasterContainersLivenessProbeHttpGet"
        ] = None,
        initial_delay_seconds: typing.Optional[jsii.Number] = None,
        period_seconds: typing.Optional[jsii.Number] = None,
        success_threshold: typing.Optional[jsii.Number] = None,
        tcp_socket: typing.Optional[
            "JenkinsSpecMasterContainersLivenessProbeTcpSocket"
        ] = None,
        timeout_seconds: typing.Optional[jsii.Number] = None,
    ) -> None:
        """Periodic probe of container liveness.

        Container will be restarted if the probe fails.

        :param exec: One and only one of the following should be specified. Exec specifies the action to take.
        :param failure_threshold: Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Default: 3. Minimum value is 1.
        :param http_get: HTTPGet specifies the http request to perform.
        :param initial_delay_seconds: Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
        :param period_seconds: How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Default: 10 seconds. Minimum value is 1.
        :param success_threshold: Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Default: 1. Must be 1 for liveness and startup. Minimum value is 1.
        :param tcp_socket: TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
        :param timeout_seconds: Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes Default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbe
        """
        if isinstance(exec, dict):
            exec = JenkinsSpecMasterContainersLivenessProbeExec(**exec)
        if isinstance(http_get, dict):
            http_get = JenkinsSpecMasterContainersLivenessProbeHttpGet(**http_get)
        if isinstance(tcp_socket, dict):
            tcp_socket = JenkinsSpecMasterContainersLivenessProbeTcpSocket(**tcp_socket)
        self._values = {}
        if exec is not None:
            self._values["exec"] = exec
        if failure_threshold is not None:
            self._values["failure_threshold"] = failure_threshold
        if http_get is not None:
            self._values["http_get"] = http_get
        if initial_delay_seconds is not None:
            self._values["initial_delay_seconds"] = initial_delay_seconds
        if period_seconds is not None:
            self._values["period_seconds"] = period_seconds
        if success_threshold is not None:
            self._values["success_threshold"] = success_threshold
        if tcp_socket is not None:
            self._values["tcp_socket"] = tcp_socket
        if timeout_seconds is not None:
            self._values["timeout_seconds"] = timeout_seconds

    @builtins.property
    def exec(self) -> typing.Optional["JenkinsSpecMasterContainersLivenessProbeExec"]:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbe#exec
        """
        return self._values.get("exec")

    @builtins.property
    def failure_threshold(self) -> typing.Optional[jsii.Number]:
        """Minimum consecutive failures for the probe to be considered failed after having succeeded.

        Defaults to 3. Minimum value is 1.

        default
        :default: 3. Minimum value is 1.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbe#failureThreshold
        """
        return self._values.get("failure_threshold")

    @builtins.property
    def http_get(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLivenessProbeHttpGet"]:
        """HTTPGet specifies the http request to perform.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbe#httpGet
        """
        return self._values.get("http_get")

    @builtins.property
    def initial_delay_seconds(self) -> typing.Optional[jsii.Number]:
        """Number of seconds after the container has started before liveness probes are initiated.

        More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbe#initialDelaySeconds
        """
        return self._values.get("initial_delay_seconds")

    @builtins.property
    def period_seconds(self) -> typing.Optional[jsii.Number]:
        """How often (in seconds) to perform the probe.

        Default to 10 seconds. Minimum value is 1.

        default
        :default: 10 seconds. Minimum value is 1.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbe#periodSeconds
        """
        return self._values.get("period_seconds")

    @builtins.property
    def success_threshold(self) -> typing.Optional[jsii.Number]:
        """Minimum consecutive successes for the probe to be considered successful after having failed.

        Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.

        default
        :default: 1. Must be 1 for liveness and startup. Minimum value is 1.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbe#successThreshold
        """
        return self._values.get("success_threshold")

    @builtins.property
    def tcp_socket(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersLivenessProbeTcpSocket"]:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbe#tcpSocket
        """
        return self._values.get("tcp_socket")

    @builtins.property
    def timeout_seconds(self) -> typing.Optional[jsii.Number]:
        """Number of seconds after which the probe times out.

        Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        default
        :default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbe#timeoutSeconds
        """
        return self._values.get("timeout_seconds")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLivenessProbe(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLivenessProbeExec",
    jsii_struct_bases=[],
    name_mapping={"command": "command"},
)
class JenkinsSpecMasterContainersLivenessProbeExec:
    def __init__(self, *, command: typing.Optional[typing.List[str]] = None) -> None:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        :param command: Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeExec
        """
        self._values = {}
        if command is not None:
            self._values["command"] = command

    @builtins.property
    def command(self) -> typing.Optional[typing.List[str]]:
        """Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.

        The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeExec#command
        """
        return self._values.get("command")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLivenessProbeExec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLivenessProbeHttpGet",
    jsii_struct_bases=[],
    name_mapping={
        "port": "port",
        "host": "host",
        "http_headers": "httpHeaders",
        "path": "path",
        "scheme": "scheme",
    },
)
class JenkinsSpecMasterContainersLivenessProbeHttpGet:
    def __init__(
        self,
        *,
        port: "JenkinsSpecMasterContainersLivenessProbeHttpGetPort",
        host: typing.Optional[str] = None,
        http_headers: typing.Optional[
            typing.List["JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders"]
        ] = None,
        path: typing.Optional[str] = None,
        scheme: typing.Optional[str] = None,
    ) -> None:
        """HTTPGet specifies the http request to perform.

        :param port: Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
        :param http_headers: Custom headers to set in the request. HTTP allows repeated headers.
        :param path: Path to access on the HTTP server.
        :param scheme: Scheme to use for connecting to the host. Defaults to HTTP. Default: HTTP.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeHttpGet
        """
        self._values = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host
        if http_headers is not None:
            self._values["http_headers"] = http_headers
        if path is not None:
            self._values["path"] = path
        if scheme is not None:
            self._values["scheme"] = scheme

    @builtins.property
    def port(self) -> "JenkinsSpecMasterContainersLivenessProbeHttpGetPort":
        """Name or number of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeHttpGet#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Host name to connect to, defaults to the pod IP.

        You probably want to set "Host" in httpHeaders instead.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeHttpGet#host
        """
        return self._values.get("host")

    @builtins.property
    def http_headers(
        self,
    ) -> typing.Optional[
        typing.List["JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders"]
    ]:
        """Custom headers to set in the request.

        HTTP allows repeated headers.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeHttpGet#httpHeaders
        """
        return self._values.get("http_headers")

    @builtins.property
    def path(self) -> typing.Optional[str]:
        """Path to access on the HTTP server.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeHttpGet#path
        """
        return self._values.get("path")

    @builtins.property
    def scheme(self) -> typing.Optional[str]:
        """Scheme to use for connecting to the host.

        Defaults to HTTP.

        default
        :default: HTTP.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeHttpGet#scheme
        """
        return self._values.get("scheme")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLivenessProbeHttpGet(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value"},
)
class JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders:
    def __init__(self, *, name: str, value: str) -> None:
        """HTTPHeader describes a custom header to be used in HTTP probes.

        :param name: The header field name.
        :param value: The header field value.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders
        """
        self._values = {
            "name": name,
            "value": value,
        }

    @builtins.property
    def name(self) -> str:
        """The header field name.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders#name
        """
        return self._values.get("name")

    @builtins.property
    def value(self) -> str:
        """The header field value.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders#value
        """
        return self._values.get("value")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


class JenkinsSpecMasterContainersLivenessProbeHttpGetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLivenessProbeHttpGetPort",
):
    """Name or number of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: JenkinsSpecMasterContainersLivenessProbeHttpGetPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "JenkinsSpecMasterContainersLivenessProbeHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "JenkinsSpecMasterContainersLivenessProbeHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLivenessProbeTcpSocket",
    jsii_struct_bases=[],
    name_mapping={"port": "port", "host": "host"},
)
class JenkinsSpecMasterContainersLivenessProbeTcpSocket:
    def __init__(
        self,
        *,
        port: "JenkinsSpecMasterContainersLivenessProbeTcpSocketPort",
        host: typing.Optional[str] = None,
    ) -> None:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        :param port: Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeTcpSocket
        """
        self._values = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host

    @builtins.property
    def port(self) -> "JenkinsSpecMasterContainersLivenessProbeTcpSocketPort":
        """Number or name of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeTcpSocket#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: JenkinsSpecMasterContainersLivenessProbeTcpSocket#host
        """
        return self._values.get("host")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersLivenessProbeTcpSocket(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class JenkinsSpecMasterContainersLivenessProbeTcpSocketPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersLivenessProbeTcpSocketPort",
):
    """Number or name of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: JenkinsSpecMasterContainersLivenessProbeTcpSocketPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "JenkinsSpecMasterContainersLivenessProbeTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "JenkinsSpecMasterContainersLivenessProbeTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersPorts",
    jsii_struct_bases=[],
    name_mapping={
        "container_port": "containerPort",
        "host_ip": "hostIP",
        "host_port": "hostPort",
        "name": "name",
        "protocol": "protocol",
    },
)
class JenkinsSpecMasterContainersPorts:
    def __init__(
        self,
        *,
        container_port: jsii.Number,
        host_ip: typing.Optional[str] = None,
        host_port: typing.Optional[jsii.Number] = None,
        name: typing.Optional[str] = None,
        protocol: typing.Optional[str] = None,
    ) -> None:
        """ContainerPort represents a network port in a single container.

        :param container_port: Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
        :param host_ip: What host IP to bind the external port to.
        :param host_port: Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
        :param name: If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
        :param protocol: Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP". Default: TCP".

        schema:
        :schema:: JenkinsSpecMasterContainersPorts
        """
        self._values = {
            "container_port": container_port,
        }
        if host_ip is not None:
            self._values["host_ip"] = host_ip
        if host_port is not None:
            self._values["host_port"] = host_port
        if name is not None:
            self._values["name"] = name
        if protocol is not None:
            self._values["protocol"] = protocol

    @builtins.property
    def container_port(self) -> jsii.Number:
        """Number of port to expose on the pod's IP address.

        This must be a valid port number, 0 < x < 65536.

        schema:
        :schema:: JenkinsSpecMasterContainersPorts#containerPort
        """
        return self._values.get("container_port")

    @builtins.property
    def host_ip(self) -> typing.Optional[str]:
        """What host IP to bind the external port to.

        schema:
        :schema:: JenkinsSpecMasterContainersPorts#hostIP
        """
        return self._values.get("host_ip")

    @builtins.property
    def host_port(self) -> typing.Optional[jsii.Number]:
        """Number of port to expose on the host.

        If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.

        schema:
        :schema:: JenkinsSpecMasterContainersPorts#hostPort
        """
        return self._values.get("host_port")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """If specified, this must be an IANA_SVC_NAME and unique within the pod.

        Each named port in a pod must have a unique name. Name for the port that can be referred to by services.

        schema:
        :schema:: JenkinsSpecMasterContainersPorts#name
        """
        return self._values.get("name")

    @builtins.property
    def protocol(self) -> typing.Optional[str]:
        """Protocol for port.

        Must be UDP, TCP, or SCTP. Defaults to "TCP".

        default
        :default: TCP".

        schema:
        :schema:: JenkinsSpecMasterContainersPorts#protocol
        """
        return self._values.get("protocol")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersPorts(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersReadinessProbe",
    jsii_struct_bases=[],
    name_mapping={
        "exec": "exec",
        "failure_threshold": "failureThreshold",
        "http_get": "httpGet",
        "initial_delay_seconds": "initialDelaySeconds",
        "period_seconds": "periodSeconds",
        "success_threshold": "successThreshold",
        "tcp_socket": "tcpSocket",
        "timeout_seconds": "timeoutSeconds",
    },
)
class JenkinsSpecMasterContainersReadinessProbe:
    def __init__(
        self,
        *,
        exec: typing.Optional["JenkinsSpecMasterContainersReadinessProbeExec"] = None,
        failure_threshold: typing.Optional[jsii.Number] = None,
        http_get: typing.Optional[
            "JenkinsSpecMasterContainersReadinessProbeHttpGet"
        ] = None,
        initial_delay_seconds: typing.Optional[jsii.Number] = None,
        period_seconds: typing.Optional[jsii.Number] = None,
        success_threshold: typing.Optional[jsii.Number] = None,
        tcp_socket: typing.Optional[
            "JenkinsSpecMasterContainersReadinessProbeTcpSocket"
        ] = None,
        timeout_seconds: typing.Optional[jsii.Number] = None,
    ) -> None:
        """Periodic probe of container service readiness.

        Container will be removed from service endpoints if the probe fails.

        :param exec: One and only one of the following should be specified. Exec specifies the action to take.
        :param failure_threshold: Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Default: 3. Minimum value is 1.
        :param http_get: HTTPGet specifies the http request to perform.
        :param initial_delay_seconds: Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
        :param period_seconds: How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Default: 10 seconds. Minimum value is 1.
        :param success_threshold: Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Default: 1. Must be 1 for liveness and startup. Minimum value is 1.
        :param tcp_socket: TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
        :param timeout_seconds: Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes Default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbe
        """
        if isinstance(exec, dict):
            exec = JenkinsSpecMasterContainersReadinessProbeExec(**exec)
        if isinstance(http_get, dict):
            http_get = JenkinsSpecMasterContainersReadinessProbeHttpGet(**http_get)
        if isinstance(tcp_socket, dict):
            tcp_socket = JenkinsSpecMasterContainersReadinessProbeTcpSocket(
                **tcp_socket
            )
        self._values = {}
        if exec is not None:
            self._values["exec"] = exec
        if failure_threshold is not None:
            self._values["failure_threshold"] = failure_threshold
        if http_get is not None:
            self._values["http_get"] = http_get
        if initial_delay_seconds is not None:
            self._values["initial_delay_seconds"] = initial_delay_seconds
        if period_seconds is not None:
            self._values["period_seconds"] = period_seconds
        if success_threshold is not None:
            self._values["success_threshold"] = success_threshold
        if tcp_socket is not None:
            self._values["tcp_socket"] = tcp_socket
        if timeout_seconds is not None:
            self._values["timeout_seconds"] = timeout_seconds

    @builtins.property
    def exec(self) -> typing.Optional["JenkinsSpecMasterContainersReadinessProbeExec"]:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbe#exec
        """
        return self._values.get("exec")

    @builtins.property
    def failure_threshold(self) -> typing.Optional[jsii.Number]:
        """Minimum consecutive failures for the probe to be considered failed after having succeeded.

        Defaults to 3. Minimum value is 1.

        default
        :default: 3. Minimum value is 1.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbe#failureThreshold
        """
        return self._values.get("failure_threshold")

    @builtins.property
    def http_get(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersReadinessProbeHttpGet"]:
        """HTTPGet specifies the http request to perform.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbe#httpGet
        """
        return self._values.get("http_get")

    @builtins.property
    def initial_delay_seconds(self) -> typing.Optional[jsii.Number]:
        """Number of seconds after the container has started before liveness probes are initiated.

        More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbe#initialDelaySeconds
        """
        return self._values.get("initial_delay_seconds")

    @builtins.property
    def period_seconds(self) -> typing.Optional[jsii.Number]:
        """How often (in seconds) to perform the probe.

        Default to 10 seconds. Minimum value is 1.

        default
        :default: 10 seconds. Minimum value is 1.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbe#periodSeconds
        """
        return self._values.get("period_seconds")

    @builtins.property
    def success_threshold(self) -> typing.Optional[jsii.Number]:
        """Minimum consecutive successes for the probe to be considered successful after having failed.

        Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.

        default
        :default: 1. Must be 1 for liveness and startup. Minimum value is 1.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbe#successThreshold
        """
        return self._values.get("success_threshold")

    @builtins.property
    def tcp_socket(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersReadinessProbeTcpSocket"]:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbe#tcpSocket
        """
        return self._values.get("tcp_socket")

    @builtins.property
    def timeout_seconds(self) -> typing.Optional[jsii.Number]:
        """Number of seconds after which the probe times out.

        Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        default
        :default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbe#timeoutSeconds
        """
        return self._values.get("timeout_seconds")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersReadinessProbe(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersReadinessProbeExec",
    jsii_struct_bases=[],
    name_mapping={"command": "command"},
)
class JenkinsSpecMasterContainersReadinessProbeExec:
    def __init__(self, *, command: typing.Optional[typing.List[str]] = None) -> None:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        :param command: Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeExec
        """
        self._values = {}
        if command is not None:
            self._values["command"] = command

    @builtins.property
    def command(self) -> typing.Optional[typing.List[str]]:
        """Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.

        The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeExec#command
        """
        return self._values.get("command")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersReadinessProbeExec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersReadinessProbeHttpGet",
    jsii_struct_bases=[],
    name_mapping={
        "port": "port",
        "host": "host",
        "http_headers": "httpHeaders",
        "path": "path",
        "scheme": "scheme",
    },
)
class JenkinsSpecMasterContainersReadinessProbeHttpGet:
    def __init__(
        self,
        *,
        port: "JenkinsSpecMasterContainersReadinessProbeHttpGetPort",
        host: typing.Optional[str] = None,
        http_headers: typing.Optional[
            typing.List["JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders"]
        ] = None,
        path: typing.Optional[str] = None,
        scheme: typing.Optional[str] = None,
    ) -> None:
        """HTTPGet specifies the http request to perform.

        :param port: Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
        :param http_headers: Custom headers to set in the request. HTTP allows repeated headers.
        :param path: Path to access on the HTTP server.
        :param scheme: Scheme to use for connecting to the host. Defaults to HTTP. Default: HTTP.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeHttpGet
        """
        self._values = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host
        if http_headers is not None:
            self._values["http_headers"] = http_headers
        if path is not None:
            self._values["path"] = path
        if scheme is not None:
            self._values["scheme"] = scheme

    @builtins.property
    def port(self) -> "JenkinsSpecMasterContainersReadinessProbeHttpGetPort":
        """Name or number of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeHttpGet#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Host name to connect to, defaults to the pod IP.

        You probably want to set "Host" in httpHeaders instead.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeHttpGet#host
        """
        return self._values.get("host")

    @builtins.property
    def http_headers(
        self,
    ) -> typing.Optional[
        typing.List["JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders"]
    ]:
        """Custom headers to set in the request.

        HTTP allows repeated headers.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeHttpGet#httpHeaders
        """
        return self._values.get("http_headers")

    @builtins.property
    def path(self) -> typing.Optional[str]:
        """Path to access on the HTTP server.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeHttpGet#path
        """
        return self._values.get("path")

    @builtins.property
    def scheme(self) -> typing.Optional[str]:
        """Scheme to use for connecting to the host.

        Defaults to HTTP.

        default
        :default: HTTP.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeHttpGet#scheme
        """
        return self._values.get("scheme")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersReadinessProbeHttpGet(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value"},
)
class JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders:
    def __init__(self, *, name: str, value: str) -> None:
        """HTTPHeader describes a custom header to be used in HTTP probes.

        :param name: The header field name.
        :param value: The header field value.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders
        """
        self._values = {
            "name": name,
            "value": value,
        }

    @builtins.property
    def name(self) -> str:
        """The header field name.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders#name
        """
        return self._values.get("name")

    @builtins.property
    def value(self) -> str:
        """The header field value.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders#value
        """
        return self._values.get("value")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


class JenkinsSpecMasterContainersReadinessProbeHttpGetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersReadinessProbeHttpGetPort",
):
    """Name or number of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: JenkinsSpecMasterContainersReadinessProbeHttpGetPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "JenkinsSpecMasterContainersReadinessProbeHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "JenkinsSpecMasterContainersReadinessProbeHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersReadinessProbeTcpSocket",
    jsii_struct_bases=[],
    name_mapping={"port": "port", "host": "host"},
)
class JenkinsSpecMasterContainersReadinessProbeTcpSocket:
    def __init__(
        self,
        *,
        port: "JenkinsSpecMasterContainersReadinessProbeTcpSocketPort",
        host: typing.Optional[str] = None,
    ) -> None:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        :param port: Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeTcpSocket
        """
        self._values = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host

    @builtins.property
    def port(self) -> "JenkinsSpecMasterContainersReadinessProbeTcpSocketPort":
        """Number or name of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeTcpSocket#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: JenkinsSpecMasterContainersReadinessProbeTcpSocket#host
        """
        return self._values.get("host")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersReadinessProbeTcpSocket(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class JenkinsSpecMasterContainersReadinessProbeTcpSocketPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersReadinessProbeTcpSocketPort",
):
    """Number or name of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: JenkinsSpecMasterContainersReadinessProbeTcpSocketPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "JenkinsSpecMasterContainersReadinessProbeTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "JenkinsSpecMasterContainersReadinessProbeTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersResources",
    jsii_struct_bases=[],
    name_mapping={"limits": "limits", "requests": "requests"},
)
class JenkinsSpecMasterContainersResources:
    def __init__(
        self,
        *,
        limits: typing.Optional[typing.Mapping[str, str]] = None,
        requests: typing.Optional[typing.Mapping[str, str]] = None,
    ) -> None:
        """Compute Resources required by this container.

        More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :param limits: Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
        :param requests: Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        schema:
        :schema:: JenkinsSpecMasterContainersResources
        """
        self._values = {}
        if limits is not None:
            self._values["limits"] = limits
        if requests is not None:
            self._values["requests"] = requests

    @builtins.property
    def limits(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Limits describes the maximum amount of compute resources allowed.

        More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        schema:
        :schema:: JenkinsSpecMasterContainersResources#limits
        """
        return self._values.get("limits")

    @builtins.property
    def requests(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Requests describes the minimum amount of compute resources required.

        If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        schema:
        :schema:: JenkinsSpecMasterContainersResources#requests
        """
        return self._values.get("requests")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersResources(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersSecurityContext",
    jsii_struct_bases=[],
    name_mapping={
        "allow_privilege_escalation": "allowPrivilegeEscalation",
        "capabilities": "capabilities",
        "privileged": "privileged",
        "proc_mount": "procMount",
        "read_only_root_filesystem": "readOnlyRootFilesystem",
        "run_as_group": "runAsGroup",
        "run_as_non_root": "runAsNonRoot",
        "run_as_user": "runAsUser",
        "se_linux_options": "seLinuxOptions",
        "windows_options": "windowsOptions",
    },
)
class JenkinsSpecMasterContainersSecurityContext:
    def __init__(
        self,
        *,
        allow_privilege_escalation: typing.Optional[bool] = None,
        capabilities: typing.Optional[
            "JenkinsSpecMasterContainersSecurityContextCapabilities"
        ] = None,
        privileged: typing.Optional[bool] = None,
        proc_mount: typing.Optional[str] = None,
        read_only_root_filesystem: typing.Optional[bool] = None,
        run_as_group: typing.Optional[jsii.Number] = None,
        run_as_non_root: typing.Optional[bool] = None,
        run_as_user: typing.Optional[jsii.Number] = None,
        se_linux_options: typing.Optional[
            "JenkinsSpecMasterContainersSecurityContextSeLinuxOptions"
        ] = None,
        windows_options: typing.Optional[
            "JenkinsSpecMasterContainersSecurityContextWindowsOptions"
        ] = None,
    ) -> None:
        """Security options the pod should run with.

        More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/

        :param allow_privilege_escalation: AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
        :param capabilities: The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime. Default: the default set of capabilities granted by the container runtime.
        :param privileged: Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Default: false.
        :param proc_mount: procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.
        :param read_only_root_filesystem: Whether this container has a read-only root filesystem. Default is false. Default: false.
        :param run_as_group: The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
        :param run_as_non_root: Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
        :param run_as_user: The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Default: user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
        :param se_linux_options: The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
        :param windows_options: The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext
        """
        if isinstance(capabilities, dict):
            capabilities = JenkinsSpecMasterContainersSecurityContextCapabilities(
                **capabilities
            )
        if isinstance(se_linux_options, dict):
            se_linux_options = JenkinsSpecMasterContainersSecurityContextSeLinuxOptions(
                **se_linux_options
            )
        if isinstance(windows_options, dict):
            windows_options = JenkinsSpecMasterContainersSecurityContextWindowsOptions(
                **windows_options
            )
        self._values = {}
        if allow_privilege_escalation is not None:
            self._values["allow_privilege_escalation"] = allow_privilege_escalation
        if capabilities is not None:
            self._values["capabilities"] = capabilities
        if privileged is not None:
            self._values["privileged"] = privileged
        if proc_mount is not None:
            self._values["proc_mount"] = proc_mount
        if read_only_root_filesystem is not None:
            self._values["read_only_root_filesystem"] = read_only_root_filesystem
        if run_as_group is not None:
            self._values["run_as_group"] = run_as_group
        if run_as_non_root is not None:
            self._values["run_as_non_root"] = run_as_non_root
        if run_as_user is not None:
            self._values["run_as_user"] = run_as_user
        if se_linux_options is not None:
            self._values["se_linux_options"] = se_linux_options
        if windows_options is not None:
            self._values["windows_options"] = windows_options

    @builtins.property
    def allow_privilege_escalation(self) -> typing.Optional[bool]:
        """AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process.

        This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext#allowPrivilegeEscalation
        """
        return self._values.get("allow_privilege_escalation")

    @builtins.property
    def capabilities(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersSecurityContextCapabilities"]:
        """The capabilities to add/drop when running containers.

        Defaults to the default set of capabilities granted by the container runtime.

        default
        :default: the default set of capabilities granted by the container runtime.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext#capabilities
        """
        return self._values.get("capabilities")

    @builtins.property
    def privileged(self) -> typing.Optional[bool]:
        """Run container in privileged mode.

        Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.

        default
        :default: false.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext#privileged
        """
        return self._values.get("privileged")

    @builtins.property
    def proc_mount(self) -> typing.Optional[str]:
        """procMount denotes the type of proc mount to use for the containers.

        The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext#procMount
        """
        return self._values.get("proc_mount")

    @builtins.property
    def read_only_root_filesystem(self) -> typing.Optional[bool]:
        """Whether this container has a read-only root filesystem.

        Default is false.

        default
        :default: false.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext#readOnlyRootFilesystem
        """
        return self._values.get("read_only_root_filesystem")

    @builtins.property
    def run_as_group(self) -> typing.Optional[jsii.Number]:
        """The GID to run the entrypoint of the container process.

        Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext#runAsGroup
        """
        return self._values.get("run_as_group")

    @builtins.property
    def run_as_non_root(self) -> typing.Optional[bool]:
        """Indicates that the container must run as a non-root user.

        If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext#runAsNonRoot
        """
        return self._values.get("run_as_non_root")

    @builtins.property
    def run_as_user(self) -> typing.Optional[jsii.Number]:
        """The UID to run the entrypoint of the container process.

        Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        default
        :default: user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext#runAsUser
        """
        return self._values.get("run_as_user")

    @builtins.property
    def se_linux_options(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersSecurityContextSeLinuxOptions"]:
        """The SELinux context to be applied to the container.

        If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext#seLinuxOptions
        """
        return self._values.get("se_linux_options")

    @builtins.property
    def windows_options(
        self,
    ) -> typing.Optional["JenkinsSpecMasterContainersSecurityContextWindowsOptions"]:
        """The Windows specific settings applied to all containers.

        If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContext#windowsOptions
        """
        return self._values.get("windows_options")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersSecurityContext(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersSecurityContextCapabilities",
    jsii_struct_bases=[],
    name_mapping={"add": "add", "drop": "drop"},
)
class JenkinsSpecMasterContainersSecurityContextCapabilities:
    def __init__(
        self,
        *,
        add: typing.Optional[typing.List[str]] = None,
        drop: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """The capabilities to add/drop when running containers.

        Defaults to the default set of capabilities granted by the container runtime.

        :param add: Added capabilities.
        :param drop: Removed capabilities.

        default
        :default: the default set of capabilities granted by the container runtime.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextCapabilities
        """
        self._values = {}
        if add is not None:
            self._values["add"] = add
        if drop is not None:
            self._values["drop"] = drop

    @builtins.property
    def add(self) -> typing.Optional[typing.List[str]]:
        """Added capabilities.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextCapabilities#add
        """
        return self._values.get("add")

    @builtins.property
    def drop(self) -> typing.Optional[typing.List[str]]:
        """Removed capabilities.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextCapabilities#drop
        """
        return self._values.get("drop")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersSecurityContextCapabilities(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersSecurityContextSeLinuxOptions",
    jsii_struct_bases=[],
    name_mapping={"level": "level", "role": "role", "type": "type", "user": "user"},
)
class JenkinsSpecMasterContainersSecurityContextSeLinuxOptions:
    def __init__(
        self,
        *,
        level: typing.Optional[str] = None,
        role: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        user: typing.Optional[str] = None,
    ) -> None:
        """The SELinux context to be applied to the container.

        If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        :param level: Level is SELinux level label that applies to the container.
        :param role: Role is a SELinux role label that applies to the container.
        :param type: Type is a SELinux type label that applies to the container.
        :param user: User is a SELinux user label that applies to the container.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextSeLinuxOptions
        """
        self._values = {}
        if level is not None:
            self._values["level"] = level
        if role is not None:
            self._values["role"] = role
        if type is not None:
            self._values["type"] = type
        if user is not None:
            self._values["user"] = user

    @builtins.property
    def level(self) -> typing.Optional[str]:
        """Level is SELinux level label that applies to the container.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextSeLinuxOptions#level
        """
        return self._values.get("level")

    @builtins.property
    def role(self) -> typing.Optional[str]:
        """Role is a SELinux role label that applies to the container.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextSeLinuxOptions#role
        """
        return self._values.get("role")

    @builtins.property
    def type(self) -> typing.Optional[str]:
        """Type is a SELinux type label that applies to the container.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextSeLinuxOptions#type
        """
        return self._values.get("type")

    @builtins.property
    def user(self) -> typing.Optional[str]:
        """User is a SELinux user label that applies to the container.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextSeLinuxOptions#user
        """
        return self._values.get("user")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterContainersSecurityContextSeLinuxOptions(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersSecurityContextWindowsOptions",
    jsii_struct_bases=[],
    name_mapping={
        "gmsa_credential_spec": "gmsaCredentialSpec",
        "gmsa_credential_spec_name": "gmsaCredentialSpecName",
        "run_as_user_name": "runAsUserName",
    },
)
class JenkinsSpecMasterContainersSecurityContextWindowsOptions:
    def __init__(
        self,
        *,
        gmsa_credential_spec: typing.Optional[str] = None,
        gmsa_credential_spec_name: typing.Optional[str] = None,
        run_as_user_name: typing.Optional[str] = None,
    ) -> None:
        """The Windows specific settings applied to all containers.

        If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        :param gmsa_credential_spec: GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
        :param gmsa_credential_spec_name: GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
        :param run_as_user_name: The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag. Default: the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextWindowsOptions
        """
        self._values = {}
        if gmsa_credential_spec is not None:
            self._values["gmsa_credential_spec"] = gmsa_credential_spec
        if gmsa_credential_spec_name is not None:
            self._values["gmsa_credential_spec_name"] = gmsa_credential_spec_name
        if run_as_user_name is not None:
            self._values["run_as_user_name"] = run_as_user_name

    @builtins.property
    def gmsa_credential_spec(self) -> typing.Optional[str]:
        """GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextWindowsOptions#gmsaCredentialSpec
        """
        return self._values.get("gmsa_credential_spec")

    @builtins.property
    def gmsa_credential_spec_name(self) -> typing.Optional[str]:
        """GMSACredentialSpecName is the name of the GMSA credential spec to use.

        This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextWindowsOptions#gmsaCredentialSpecName
        """
        return self._values.get("gmsa_credential_spec_name")

    @builtins.property
    def run_as_user_name(self) -> typing.Optional[str]:
        """The UserName in Windows to run the entrypoint of the container process.

        Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.

        default
        :default: the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.

        schema:
        :schema:: JenkinsSpecMasterContainersSecurityContextWindowsOptions#runAsUserName
        """
        return self._values.get("run_as_user_name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterContainersSecurityContextWindowsOptions(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterContainersVolumeMounts",
    jsii_struct_bases=[],
    name_mapping={
        "mount_path": "mountPath",
        "name": "name",
        "mount_propagation": "mountPropagation",
        "read_only": "readOnly",
        "sub_path": "subPath",
        "sub_path_expr": "subPathExpr",
    },
)
class JenkinsSpecMasterContainersVolumeMounts:
    def __init__(
        self,
        *,
        mount_path: str,
        name: str,
        mount_propagation: typing.Optional[str] = None,
        read_only: typing.Optional[bool] = None,
        sub_path: typing.Optional[str] = None,
        sub_path_expr: typing.Optional[str] = None,
    ) -> None:
        """VolumeMount describes a mounting of a Volume within a container.

        :param mount_path: Path within the container at which the volume should be mounted. Must not contain ':'.
        :param name: This must match the Name of a Volume.
        :param mount_propagation: mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
        :param read_only: Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false. Default: false.
        :param sub_path: Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root). Default: volume's root).
        :param sub_path_expr: Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15. Default: volume's root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15.

        schema:
        :schema:: JenkinsSpecMasterContainersVolumeMounts
        """
        self._values = {
            "mount_path": mount_path,
            "name": name,
        }
        if mount_propagation is not None:
            self._values["mount_propagation"] = mount_propagation
        if read_only is not None:
            self._values["read_only"] = read_only
        if sub_path is not None:
            self._values["sub_path"] = sub_path
        if sub_path_expr is not None:
            self._values["sub_path_expr"] = sub_path_expr

    @builtins.property
    def mount_path(self) -> str:
        """Path within the container at which the volume should be mounted.

        Must not contain ':'.

        schema:
        :schema:: JenkinsSpecMasterContainersVolumeMounts#mountPath
        """
        return self._values.get("mount_path")

    @builtins.property
    def name(self) -> str:
        """This must match the Name of a Volume.

        schema:
        :schema:: JenkinsSpecMasterContainersVolumeMounts#name
        """
        return self._values.get("name")

    @builtins.property
    def mount_propagation(self) -> typing.Optional[str]:
        """mountPropagation determines how mounts are propagated from the host to container and the other way around.

        When not set, MountPropagationNone is used. This field is beta in 1.10.

        schema:
        :schema:: JenkinsSpecMasterContainersVolumeMounts#mountPropagation
        """
        return self._values.get("mount_propagation")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Mounted read-only if true, read-write otherwise (false or unspecified).

        Defaults to false.

        default
        :default: false.

        schema:
        :schema:: JenkinsSpecMasterContainersVolumeMounts#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def sub_path(self) -> typing.Optional[str]:
        """Path within the volume from which the container's volume should be mounted.

        Defaults to "" (volume's root).

        default
        :default: volume's root).

        schema:
        :schema:: JenkinsSpecMasterContainersVolumeMounts#subPath
        """
        return self._values.get("sub_path")

    @builtins.property
    def sub_path_expr(self) -> typing.Optional[str]:
        """Expanded path within the volume from which the container's volume should be mounted.

        Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15.

        default
        :default: volume's root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15.

        schema:
        :schema:: JenkinsSpecMasterContainersVolumeMounts#subPathExpr
        """
        return self._values.get("sub_path_expr")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterContainersVolumeMounts(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterImagePullSecrets",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecMasterImagePullSecrets:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterImagePullSecrets
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterImagePullSecrets#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterImagePullSecrets(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterPlugins",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "version": "version"},
)
class JenkinsSpecMasterPlugins:
    def __init__(self, *, name: str, version: str) -> None:
        """Plugin defines Jenkins plugin.

        :param name: Name is the name of Jenkins plugin.
        :param version: Version is the version of Jenkins plugin.

        schema:
        :schema:: JenkinsSpecMasterPlugins
        """
        self._values = {
            "name": name,
            "version": version,
        }

    @builtins.property
    def name(self) -> str:
        """Name is the name of Jenkins plugin.

        schema:
        :schema:: JenkinsSpecMasterPlugins#name
        """
        return self._values.get("name")

    @builtins.property
    def version(self) -> str:
        """Version is the version of Jenkins plugin.

        schema:
        :schema:: JenkinsSpecMasterPlugins#version
        """
        return self._values.get("version")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterPlugins(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterSecurityContext",
    jsii_struct_bases=[],
    name_mapping={
        "fs_group": "fsGroup",
        "run_as_group": "runAsGroup",
        "run_as_non_root": "runAsNonRoot",
        "run_as_user": "runAsUser",
        "se_linux_options": "seLinuxOptions",
        "supplemental_groups": "supplementalGroups",
        "sysctls": "sysctls",
        "windows_options": "windowsOptions",
    },
)
class JenkinsSpecMasterSecurityContext:
    def __init__(
        self,
        *,
        fs_group: typing.Optional[jsii.Number] = None,
        run_as_group: typing.Optional[jsii.Number] = None,
        run_as_non_root: typing.Optional[bool] = None,
        run_as_user: typing.Optional[jsii.Number] = None,
        se_linux_options: typing.Optional[
            "JenkinsSpecMasterSecurityContextSeLinuxOptions"
        ] = None,
        supplemental_groups: typing.Optional[typing.List[jsii.Number]] = None,
        sysctls: typing.Optional[
            typing.List["JenkinsSpecMasterSecurityContextSysctls"]
        ] = None,
        windows_options: typing.Optional[
            "JenkinsSpecMasterSecurityContextWindowsOptions"
        ] = None,
    ) -> None:
        """SecurityContext that applies to all the containers of the Jenkins Master.

        As per kubernetes specification, it can be overridden for each container individually. Defaults to: runAsUser: 1000 fsGroup: 1000

        :param fs_group: A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod: 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw---- If unset, the Kubelet will not modify the ownership and permissions of any volume.
        :param run_as_group: The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
        :param run_as_non_root: Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
        :param run_as_user: The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Default: user specified in image metadata if unspecified. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
        :param se_linux_options: The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container. May also be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
        :param supplemental_groups: A list of groups applied to the first process run in each container, in addition to the container's primary GID. If unspecified, no groups will be added to any container.
        :param sysctls: Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch.
        :param windows_options: The Windows specific settings applied to all containers. If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        default
        :default: runAsUser: 1000 fsGroup: 1000

        schema:
        :schema:: JenkinsSpecMasterSecurityContext
        """
        if isinstance(se_linux_options, dict):
            se_linux_options = JenkinsSpecMasterSecurityContextSeLinuxOptions(
                **se_linux_options
            )
        if isinstance(windows_options, dict):
            windows_options = JenkinsSpecMasterSecurityContextWindowsOptions(
                **windows_options
            )
        self._values = {}
        if fs_group is not None:
            self._values["fs_group"] = fs_group
        if run_as_group is not None:
            self._values["run_as_group"] = run_as_group
        if run_as_non_root is not None:
            self._values["run_as_non_root"] = run_as_non_root
        if run_as_user is not None:
            self._values["run_as_user"] = run_as_user
        if se_linux_options is not None:
            self._values["se_linux_options"] = se_linux_options
        if supplemental_groups is not None:
            self._values["supplemental_groups"] = supplemental_groups
        if sysctls is not None:
            self._values["sysctls"] = sysctls
        if windows_options is not None:
            self._values["windows_options"] = windows_options

    @builtins.property
    def fs_group(self) -> typing.Optional[jsii.Number]:
        """A special supplemental group that applies to all containers in a pod.

        Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:

        1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
           If unset, the Kubelet will not modify the ownership and permissions of any volume.

        schema:
        :schema:: JenkinsSpecMasterSecurityContext#fsGroup
        """
        return self._values.get("fs_group")

    @builtins.property
    def run_as_group(self) -> typing.Optional[jsii.Number]:
        """The GID to run the entrypoint of the container process.

        Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.

        schema:
        :schema:: JenkinsSpecMasterSecurityContext#runAsGroup
        """
        return self._values.get("run_as_group")

    @builtins.property
    def run_as_non_root(self) -> typing.Optional[bool]:
        """Indicates that the container must run as a non-root user.

        If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        schema:
        :schema:: JenkinsSpecMasterSecurityContext#runAsNonRoot
        """
        return self._values.get("run_as_non_root")

    @builtins.property
    def run_as_user(self) -> typing.Optional[jsii.Number]:
        """The UID to run the entrypoint of the container process.

        Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.

        default
        :default: user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.

        schema:
        :schema:: JenkinsSpecMasterSecurityContext#runAsUser
        """
        return self._values.get("run_as_user")

    @builtins.property
    def se_linux_options(
        self,
    ) -> typing.Optional["JenkinsSpecMasterSecurityContextSeLinuxOptions"]:
        """The SELinux context to be applied to all containers.

        If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.

        schema:
        :schema:: JenkinsSpecMasterSecurityContext#seLinuxOptions
        """
        return self._values.get("se_linux_options")

    @builtins.property
    def supplemental_groups(self) -> typing.Optional[typing.List[jsii.Number]]:
        """A list of groups applied to the first process run in each container, in addition to the container's primary GID.

        If unspecified, no groups will be added to any container.

        schema:
        :schema:: JenkinsSpecMasterSecurityContext#supplementalGroups
        """
        return self._values.get("supplemental_groups")

    @builtins.property
    def sysctls(
        self,
    ) -> typing.Optional[typing.List["JenkinsSpecMasterSecurityContextSysctls"]]:
        """Sysctls hold a list of namespaced sysctls used for the pod.

        Pods with unsupported sysctls (by the container runtime) might fail to launch.

        schema:
        :schema:: JenkinsSpecMasterSecurityContext#sysctls
        """
        return self._values.get("sysctls")

    @builtins.property
    def windows_options(
        self,
    ) -> typing.Optional["JenkinsSpecMasterSecurityContextWindowsOptions"]:
        """The Windows specific settings applied to all containers.

        If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        schema:
        :schema:: JenkinsSpecMasterSecurityContext#windowsOptions
        """
        return self._values.get("windows_options")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterSecurityContext(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterSecurityContextSeLinuxOptions",
    jsii_struct_bases=[],
    name_mapping={"level": "level", "role": "role", "type": "type", "user": "user"},
)
class JenkinsSpecMasterSecurityContextSeLinuxOptions:
    def __init__(
        self,
        *,
        level: typing.Optional[str] = None,
        role: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
        user: typing.Optional[str] = None,
    ) -> None:
        """The SELinux context to be applied to all containers.

        If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.

        :param level: Level is SELinux level label that applies to the container.
        :param role: Role is a SELinux role label that applies to the container.
        :param type: Type is a SELinux type label that applies to the container.
        :param user: User is a SELinux user label that applies to the container.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextSeLinuxOptions
        """
        self._values = {}
        if level is not None:
            self._values["level"] = level
        if role is not None:
            self._values["role"] = role
        if type is not None:
            self._values["type"] = type
        if user is not None:
            self._values["user"] = user

    @builtins.property
    def level(self) -> typing.Optional[str]:
        """Level is SELinux level label that applies to the container.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextSeLinuxOptions#level
        """
        return self._values.get("level")

    @builtins.property
    def role(self) -> typing.Optional[str]:
        """Role is a SELinux role label that applies to the container.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextSeLinuxOptions#role
        """
        return self._values.get("role")

    @builtins.property
    def type(self) -> typing.Optional[str]:
        """Type is a SELinux type label that applies to the container.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextSeLinuxOptions#type
        """
        return self._values.get("type")

    @builtins.property
    def user(self) -> typing.Optional[str]:
        """User is a SELinux user label that applies to the container.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextSeLinuxOptions#user
        """
        return self._values.get("user")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterSecurityContextSeLinuxOptions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterSecurityContextSysctls",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value"},
)
class JenkinsSpecMasterSecurityContextSysctls:
    def __init__(self, *, name: str, value: str) -> None:
        """Sysctl defines a kernel parameter to be set.

        :param name: Name of a property to set.
        :param value: Value of a property to set.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextSysctls
        """
        self._values = {
            "name": name,
            "value": value,
        }

    @builtins.property
    def name(self) -> str:
        """Name of a property to set.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextSysctls#name
        """
        return self._values.get("name")

    @builtins.property
    def value(self) -> str:
        """Value of a property to set.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextSysctls#value
        """
        return self._values.get("value")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterSecurityContextSysctls(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterSecurityContextWindowsOptions",
    jsii_struct_bases=[],
    name_mapping={
        "gmsa_credential_spec": "gmsaCredentialSpec",
        "gmsa_credential_spec_name": "gmsaCredentialSpecName",
        "run_as_user_name": "runAsUserName",
    },
)
class JenkinsSpecMasterSecurityContextWindowsOptions:
    def __init__(
        self,
        *,
        gmsa_credential_spec: typing.Optional[str] = None,
        gmsa_credential_spec_name: typing.Optional[str] = None,
        run_as_user_name: typing.Optional[str] = None,
    ) -> None:
        """The Windows specific settings applied to all containers.

        If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.

        :param gmsa_credential_spec: GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
        :param gmsa_credential_spec_name: GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
        :param run_as_user_name: The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag. Default: the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextWindowsOptions
        """
        self._values = {}
        if gmsa_credential_spec is not None:
            self._values["gmsa_credential_spec"] = gmsa_credential_spec
        if gmsa_credential_spec_name is not None:
            self._values["gmsa_credential_spec_name"] = gmsa_credential_spec_name
        if run_as_user_name is not None:
            self._values["run_as_user_name"] = run_as_user_name

    @builtins.property
    def gmsa_credential_spec(self) -> typing.Optional[str]:
        """GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextWindowsOptions#gmsaCredentialSpec
        """
        return self._values.get("gmsa_credential_spec")

    @builtins.property
    def gmsa_credential_spec_name(self) -> typing.Optional[str]:
        """GMSACredentialSpecName is the name of the GMSA credential spec to use.

        This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextWindowsOptions#gmsaCredentialSpecName
        """
        return self._values.get("gmsa_credential_spec_name")

    @builtins.property
    def run_as_user_name(self) -> typing.Optional[str]:
        """The UserName in Windows to run the entrypoint of the container process.

        Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.

        default
        :default: the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.

        schema:
        :schema:: JenkinsSpecMasterSecurityContextWindowsOptions#runAsUserName
        """
        return self._values.get("run_as_user_name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterSecurityContextWindowsOptions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterTolerations",
    jsii_struct_bases=[],
    name_mapping={
        "effect": "effect",
        "key": "key",
        "operator": "operator",
        "toleration_seconds": "tolerationSeconds",
        "value": "value",
    },
)
class JenkinsSpecMasterTolerations:
    def __init__(
        self,
        *,
        effect: typing.Optional[str] = None,
        key: typing.Optional[str] = None,
        operator: typing.Optional[str] = None,
        toleration_seconds: typing.Optional[jsii.Number] = None,
        value: typing.Optional[str] = None,
    ) -> None:
        """The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator .

        :param effect: Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
        :param key: Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
        :param operator: Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category. Default: Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
        :param toleration_seconds: TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
        :param value: Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.

        schema:
        :schema:: JenkinsSpecMasterTolerations
        """
        self._values = {}
        if effect is not None:
            self._values["effect"] = effect
        if key is not None:
            self._values["key"] = key
        if operator is not None:
            self._values["operator"] = operator
        if toleration_seconds is not None:
            self._values["toleration_seconds"] = toleration_seconds
        if value is not None:
            self._values["value"] = value

    @builtins.property
    def effect(self) -> typing.Optional[str]:
        """Effect indicates the taint effect to match.

        Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.

        schema:
        :schema:: JenkinsSpecMasterTolerations#effect
        """
        return self._values.get("effect")

    @builtins.property
    def key(self) -> typing.Optional[str]:
        """Key is the taint key that the toleration applies to.

        Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.

        schema:
        :schema:: JenkinsSpecMasterTolerations#key
        """
        return self._values.get("key")

    @builtins.property
    def operator(self) -> typing.Optional[str]:
        """Operator represents a key's relationship to the value.

        Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.

        default
        :default: Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.

        schema:
        :schema:: JenkinsSpecMasterTolerations#operator
        """
        return self._values.get("operator")

    @builtins.property
    def toleration_seconds(self) -> typing.Optional[jsii.Number]:
        """TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint.

        By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.

        schema:
        :schema:: JenkinsSpecMasterTolerations#tolerationSeconds
        """
        return self._values.get("toleration_seconds")

    @builtins.property
    def value(self) -> typing.Optional[str]:
        """Value is the taint value the toleration matches to.

        If the operator is Exists, the value should be empty, otherwise just a regular string.

        schema:
        :schema:: JenkinsSpecMasterTolerations#value
        """
        return self._values.get("value")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterTolerations(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumes",
    jsii_struct_bases=[],
    name_mapping={
        "name": "name",
        "aws_elastic_block_store": "awsElasticBlockStore",
        "azure_disk": "azureDisk",
        "azure_file": "azureFile",
        "cephfs": "cephfs",
        "cinder": "cinder",
        "config_map": "configMap",
        "csi": "csi",
        "downward_api": "downwardAPI",
        "empty_dir": "emptyDir",
        "fc": "fc",
        "flex_volume": "flexVolume",
        "flocker": "flocker",
        "gce_persistent_disk": "gcePersistentDisk",
        "git_repo": "gitRepo",
        "glusterfs": "glusterfs",
        "host_path": "hostPath",
        "iscsi": "iscsi",
        "nfs": "nfs",
        "persistent_volume_claim": "persistentVolumeClaim",
        "photon_persistent_disk": "photonPersistentDisk",
        "portworx_volume": "portworxVolume",
        "projected": "projected",
        "quobyte": "quobyte",
        "rbd": "rbd",
        "scale_io": "scaleIO",
        "secret": "secret",
        "storageos": "storageos",
        "vsphere_volume": "vsphereVolume",
    },
)
class JenkinsSpecMasterVolumes:
    def __init__(
        self,
        *,
        name: str,
        aws_elastic_block_store: typing.Optional[
            "JenkinsSpecMasterVolumesAwsElasticBlockStore"
        ] = None,
        azure_disk: typing.Optional["JenkinsSpecMasterVolumesAzureDisk"] = None,
        azure_file: typing.Optional["JenkinsSpecMasterVolumesAzureFile"] = None,
        cephfs: typing.Optional["JenkinsSpecMasterVolumesCephfs"] = None,
        cinder: typing.Optional["JenkinsSpecMasterVolumesCinder"] = None,
        config_map: typing.Optional["JenkinsSpecMasterVolumesConfigMap"] = None,
        csi: typing.Optional["JenkinsSpecMasterVolumesCsi"] = None,
        downward_api: typing.Optional["JenkinsSpecMasterVolumesDownwardApi"] = None,
        empty_dir: typing.Optional["JenkinsSpecMasterVolumesEmptyDir"] = None,
        fc: typing.Optional["JenkinsSpecMasterVolumesFc"] = None,
        flex_volume: typing.Optional["JenkinsSpecMasterVolumesFlexVolume"] = None,
        flocker: typing.Optional["JenkinsSpecMasterVolumesFlocker"] = None,
        gce_persistent_disk: typing.Optional[
            "JenkinsSpecMasterVolumesGcePersistentDisk"
        ] = None,
        git_repo: typing.Optional["JenkinsSpecMasterVolumesGitRepo"] = None,
        glusterfs: typing.Optional["JenkinsSpecMasterVolumesGlusterfs"] = None,
        host_path: typing.Optional["JenkinsSpecMasterVolumesHostPath"] = None,
        iscsi: typing.Optional["JenkinsSpecMasterVolumesIscsi"] = None,
        nfs: typing.Optional["JenkinsSpecMasterVolumesNfs"] = None,
        persistent_volume_claim: typing.Optional[
            "JenkinsSpecMasterVolumesPersistentVolumeClaim"
        ] = None,
        photon_persistent_disk: typing.Optional[
            "JenkinsSpecMasterVolumesPhotonPersistentDisk"
        ] = None,
        portworx_volume: typing.Optional[
            "JenkinsSpecMasterVolumesPortworxVolume"
        ] = None,
        projected: typing.Optional["JenkinsSpecMasterVolumesProjected"] = None,
        quobyte: typing.Optional["JenkinsSpecMasterVolumesQuobyte"] = None,
        rbd: typing.Optional["JenkinsSpecMasterVolumesRbd"] = None,
        scale_io: typing.Optional["JenkinsSpecMasterVolumesScaleIo"] = None,
        secret: typing.Optional["JenkinsSpecMasterVolumesSecret"] = None,
        storageos: typing.Optional["JenkinsSpecMasterVolumesStorageos"] = None,
        vsphere_volume: typing.Optional["JenkinsSpecMasterVolumesVsphereVolume"] = None,
    ) -> None:
        """Volume represents a named volume in a pod that may be accessed by any container in the pod.

        :param name: Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
        :param aws_elastic_block_store: AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
        :param azure_disk: AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
        :param azure_file: AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
        :param cephfs: CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
        :param cinder: Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
        :param config_map: ConfigMap represents a configMap that should populate this volume.
        :param csi: CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
        :param downward_api: DownwardAPI represents downward API about the pod that should populate this volume.
        :param empty_dir: EmptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
        :param fc: FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
        :param flex_volume: FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
        :param flocker: Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
        :param gce_persistent_disk: GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
        :param git_repo: GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
        :param glusterfs: Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
        :param host_path: HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.
        :param iscsi: ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
        :param nfs: NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
        :param persistent_volume_claim: PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
        :param photon_persistent_disk: PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.
        :param portworx_volume: PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.
        :param projected: Items for all in one resources secrets, configmaps, and downward API.
        :param quobyte: Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.
        :param rbd: RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
        :param scale_io: ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
        :param secret: Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
        :param storageos: StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
        :param vsphere_volume: VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.

        schema:
        :schema:: JenkinsSpecMasterVolumes
        """
        if isinstance(aws_elastic_block_store, dict):
            aws_elastic_block_store = JenkinsSpecMasterVolumesAwsElasticBlockStore(
                **aws_elastic_block_store
            )
        if isinstance(azure_disk, dict):
            azure_disk = JenkinsSpecMasterVolumesAzureDisk(**azure_disk)
        if isinstance(azure_file, dict):
            azure_file = JenkinsSpecMasterVolumesAzureFile(**azure_file)
        if isinstance(cephfs, dict):
            cephfs = JenkinsSpecMasterVolumesCephfs(**cephfs)
        if isinstance(cinder, dict):
            cinder = JenkinsSpecMasterVolumesCinder(**cinder)
        if isinstance(config_map, dict):
            config_map = JenkinsSpecMasterVolumesConfigMap(**config_map)
        if isinstance(csi, dict):
            csi = JenkinsSpecMasterVolumesCsi(**csi)
        if isinstance(downward_api, dict):
            downward_api = JenkinsSpecMasterVolumesDownwardApi(**downward_api)
        if isinstance(empty_dir, dict):
            empty_dir = JenkinsSpecMasterVolumesEmptyDir(**empty_dir)
        if isinstance(fc, dict):
            fc = JenkinsSpecMasterVolumesFc(**fc)
        if isinstance(flex_volume, dict):
            flex_volume = JenkinsSpecMasterVolumesFlexVolume(**flex_volume)
        if isinstance(flocker, dict):
            flocker = JenkinsSpecMasterVolumesFlocker(**flocker)
        if isinstance(gce_persistent_disk, dict):
            gce_persistent_disk = JenkinsSpecMasterVolumesGcePersistentDisk(
                **gce_persistent_disk
            )
        if isinstance(git_repo, dict):
            git_repo = JenkinsSpecMasterVolumesGitRepo(**git_repo)
        if isinstance(glusterfs, dict):
            glusterfs = JenkinsSpecMasterVolumesGlusterfs(**glusterfs)
        if isinstance(host_path, dict):
            host_path = JenkinsSpecMasterVolumesHostPath(**host_path)
        if isinstance(iscsi, dict):
            iscsi = JenkinsSpecMasterVolumesIscsi(**iscsi)
        if isinstance(nfs, dict):
            nfs = JenkinsSpecMasterVolumesNfs(**nfs)
        if isinstance(persistent_volume_claim, dict):
            persistent_volume_claim = JenkinsSpecMasterVolumesPersistentVolumeClaim(
                **persistent_volume_claim
            )
        if isinstance(photon_persistent_disk, dict):
            photon_persistent_disk = JenkinsSpecMasterVolumesPhotonPersistentDisk(
                **photon_persistent_disk
            )
        if isinstance(portworx_volume, dict):
            portworx_volume = JenkinsSpecMasterVolumesPortworxVolume(**portworx_volume)
        if isinstance(projected, dict):
            projected = JenkinsSpecMasterVolumesProjected(**projected)
        if isinstance(quobyte, dict):
            quobyte = JenkinsSpecMasterVolumesQuobyte(**quobyte)
        if isinstance(rbd, dict):
            rbd = JenkinsSpecMasterVolumesRbd(**rbd)
        if isinstance(scale_io, dict):
            scale_io = JenkinsSpecMasterVolumesScaleIo(**scale_io)
        if isinstance(secret, dict):
            secret = JenkinsSpecMasterVolumesSecret(**secret)
        if isinstance(storageos, dict):
            storageos = JenkinsSpecMasterVolumesStorageos(**storageos)
        if isinstance(vsphere_volume, dict):
            vsphere_volume = JenkinsSpecMasterVolumesVsphereVolume(**vsphere_volume)
        self._values = {
            "name": name,
        }
        if aws_elastic_block_store is not None:
            self._values["aws_elastic_block_store"] = aws_elastic_block_store
        if azure_disk is not None:
            self._values["azure_disk"] = azure_disk
        if azure_file is not None:
            self._values["azure_file"] = azure_file
        if cephfs is not None:
            self._values["cephfs"] = cephfs
        if cinder is not None:
            self._values["cinder"] = cinder
        if config_map is not None:
            self._values["config_map"] = config_map
        if csi is not None:
            self._values["csi"] = csi
        if downward_api is not None:
            self._values["downward_api"] = downward_api
        if empty_dir is not None:
            self._values["empty_dir"] = empty_dir
        if fc is not None:
            self._values["fc"] = fc
        if flex_volume is not None:
            self._values["flex_volume"] = flex_volume
        if flocker is not None:
            self._values["flocker"] = flocker
        if gce_persistent_disk is not None:
            self._values["gce_persistent_disk"] = gce_persistent_disk
        if git_repo is not None:
            self._values["git_repo"] = git_repo
        if glusterfs is not None:
            self._values["glusterfs"] = glusterfs
        if host_path is not None:
            self._values["host_path"] = host_path
        if iscsi is not None:
            self._values["iscsi"] = iscsi
        if nfs is not None:
            self._values["nfs"] = nfs
        if persistent_volume_claim is not None:
            self._values["persistent_volume_claim"] = persistent_volume_claim
        if photon_persistent_disk is not None:
            self._values["photon_persistent_disk"] = photon_persistent_disk
        if portworx_volume is not None:
            self._values["portworx_volume"] = portworx_volume
        if projected is not None:
            self._values["projected"] = projected
        if quobyte is not None:
            self._values["quobyte"] = quobyte
        if rbd is not None:
            self._values["rbd"] = rbd
        if scale_io is not None:
            self._values["scale_io"] = scale_io
        if secret is not None:
            self._values["secret"] = secret
        if storageos is not None:
            self._values["storageos"] = storageos
        if vsphere_volume is not None:
            self._values["vsphere_volume"] = vsphere_volume

    @builtins.property
    def name(self) -> str:
        """Volume's name.

        Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names

        schema:
        :schema:: JenkinsSpecMasterVolumes#name
        """
        return self._values.get("name")

    @builtins.property
    def aws_elastic_block_store(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesAwsElasticBlockStore"]:
        """AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

        schema:
        :schema:: JenkinsSpecMasterVolumes#awsElasticBlockStore
        """
        return self._values.get("aws_elastic_block_store")

    @builtins.property
    def azure_disk(self) -> typing.Optional["JenkinsSpecMasterVolumesAzureDisk"]:
        """AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.

        schema:
        :schema:: JenkinsSpecMasterVolumes#azureDisk
        """
        return self._values.get("azure_disk")

    @builtins.property
    def azure_file(self) -> typing.Optional["JenkinsSpecMasterVolumesAzureFile"]:
        """AzureFile represents an Azure File Service mount on the host and bind mount to the pod.

        schema:
        :schema:: JenkinsSpecMasterVolumes#azureFile
        """
        return self._values.get("azure_file")

    @builtins.property
    def cephfs(self) -> typing.Optional["JenkinsSpecMasterVolumesCephfs"]:
        """CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.

        schema:
        :schema:: JenkinsSpecMasterVolumes#cephfs
        """
        return self._values.get("cephfs")

    @builtins.property
    def cinder(self) -> typing.Optional["JenkinsSpecMasterVolumesCinder"]:
        """Cinder represents a cinder volume attached and mounted on kubelets host machine.

        More info: https://examples.k8s.io/mysql-cinder-pd/README.md

        schema:
        :schema:: JenkinsSpecMasterVolumes#cinder
        """
        return self._values.get("cinder")

    @builtins.property
    def config_map(self) -> typing.Optional["JenkinsSpecMasterVolumesConfigMap"]:
        """ConfigMap represents a configMap that should populate this volume.

        schema:
        :schema:: JenkinsSpecMasterVolumes#configMap
        """
        return self._values.get("config_map")

    @builtins.property
    def csi(self) -> typing.Optional["JenkinsSpecMasterVolumesCsi"]:
        """CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).

        schema:
        :schema:: JenkinsSpecMasterVolumes#csi
        """
        return self._values.get("csi")

    @builtins.property
    def downward_api(self) -> typing.Optional["JenkinsSpecMasterVolumesDownwardApi"]:
        """DownwardAPI represents downward API about the pod that should populate this volume.

        schema:
        :schema:: JenkinsSpecMasterVolumes#downwardAPI
        """
        return self._values.get("downward_api")

    @builtins.property
    def empty_dir(self) -> typing.Optional["JenkinsSpecMasterVolumesEmptyDir"]:
        """EmptyDir represents a temporary directory that shares a pod's lifetime.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir

        schema:
        :schema:: JenkinsSpecMasterVolumes#emptyDir
        """
        return self._values.get("empty_dir")

    @builtins.property
    def fc(self) -> typing.Optional["JenkinsSpecMasterVolumesFc"]:
        """FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.

        schema:
        :schema:: JenkinsSpecMasterVolumes#fc
        """
        return self._values.get("fc")

    @builtins.property
    def flex_volume(self) -> typing.Optional["JenkinsSpecMasterVolumesFlexVolume"]:
        """FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.

        schema:
        :schema:: JenkinsSpecMasterVolumes#flexVolume
        """
        return self._values.get("flex_volume")

    @builtins.property
    def flocker(self) -> typing.Optional["JenkinsSpecMasterVolumesFlocker"]:
        """Flocker represents a Flocker volume attached to a kubelet's host machine.

        This depends on the Flocker control service being running

        schema:
        :schema:: JenkinsSpecMasterVolumes#flocker
        """
        return self._values.get("flocker")

    @builtins.property
    def gce_persistent_disk(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesGcePersistentDisk"]:
        """GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

        schema:
        :schema:: JenkinsSpecMasterVolumes#gcePersistentDisk
        """
        return self._values.get("gce_persistent_disk")

    @builtins.property
    def git_repo(self) -> typing.Optional["JenkinsSpecMasterVolumesGitRepo"]:
        """GitRepo represents a git repository at a particular revision.

        DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.

        schema:
        :schema:: JenkinsSpecMasterVolumes#gitRepo
        """
        return self._values.get("git_repo")

    @builtins.property
    def glusterfs(self) -> typing.Optional["JenkinsSpecMasterVolumesGlusterfs"]:
        """Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.

        More info: https://examples.k8s.io/volumes/glusterfs/README.md

        schema:
        :schema:: JenkinsSpecMasterVolumes#glusterfs
        """
        return self._values.get("glusterfs")

    @builtins.property
    def host_path(self) -> typing.Optional["JenkinsSpecMasterVolumesHostPath"]:
        """HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.

        This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.

        schema:
        :schema:: JenkinsSpecMasterVolumes#hostPath
        """
        return self._values.get("host_path")

    @builtins.property
    def iscsi(self) -> typing.Optional["JenkinsSpecMasterVolumesIscsi"]:
        """ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

        More info: https://examples.k8s.io/volumes/iscsi/README.md

        schema:
        :schema:: JenkinsSpecMasterVolumes#iscsi
        """
        return self._values.get("iscsi")

    @builtins.property
    def nfs(self) -> typing.Optional["JenkinsSpecMasterVolumesNfs"]:
        """NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.

        schema:
        :schema:: JenkinsSpecMasterVolumes#nfs
        """
        return self._values.get("nfs")

    @builtins.property
    def persistent_volume_claim(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesPersistentVolumeClaim"]:
        """PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.

        More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims

        schema:
        :schema:: JenkinsSpecMasterVolumes#persistentVolumeClaim
        """
        return self._values.get("persistent_volume_claim")

    @builtins.property
    def photon_persistent_disk(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesPhotonPersistentDisk"]:
        """PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.

        schema:
        :schema:: JenkinsSpecMasterVolumes#photonPersistentDisk
        """
        return self._values.get("photon_persistent_disk")

    @builtins.property
    def portworx_volume(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesPortworxVolume"]:
        """PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.

        schema:
        :schema:: JenkinsSpecMasterVolumes#portworxVolume
        """
        return self._values.get("portworx_volume")

    @builtins.property
    def projected(self) -> typing.Optional["JenkinsSpecMasterVolumesProjected"]:
        """Items for all in one resources secrets, configmaps, and downward API.

        schema:
        :schema:: JenkinsSpecMasterVolumes#projected
        """
        return self._values.get("projected")

    @builtins.property
    def quobyte(self) -> typing.Optional["JenkinsSpecMasterVolumesQuobyte"]:
        """Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.

        schema:
        :schema:: JenkinsSpecMasterVolumes#quobyte
        """
        return self._values.get("quobyte")

    @builtins.property
    def rbd(self) -> typing.Optional["JenkinsSpecMasterVolumesRbd"]:
        """RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.

        More info: https://examples.k8s.io/volumes/rbd/README.md

        schema:
        :schema:: JenkinsSpecMasterVolumes#rbd
        """
        return self._values.get("rbd")

    @builtins.property
    def scale_io(self) -> typing.Optional["JenkinsSpecMasterVolumesScaleIo"]:
        """ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.

        schema:
        :schema:: JenkinsSpecMasterVolumes#scaleIO
        """
        return self._values.get("scale_io")

    @builtins.property
    def secret(self) -> typing.Optional["JenkinsSpecMasterVolumesSecret"]:
        """Secret represents a secret that should populate this volume.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#secret

        schema:
        :schema:: JenkinsSpecMasterVolumes#secret
        """
        return self._values.get("secret")

    @builtins.property
    def storageos(self) -> typing.Optional["JenkinsSpecMasterVolumesStorageos"]:
        """StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.

        schema:
        :schema:: JenkinsSpecMasterVolumes#storageos
        """
        return self._values.get("storageos")

    @builtins.property
    def vsphere_volume(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesVsphereVolume"]:
        """VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.

        schema:
        :schema:: JenkinsSpecMasterVolumes#vsphereVolume
        """
        return self._values.get("vsphere_volume")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumes(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesAwsElasticBlockStore",
    jsii_struct_bases=[],
    name_mapping={
        "volume_id": "volumeID",
        "fs_type": "fsType",
        "partition": "partition",
        "read_only": "readOnly",
    },
)
class JenkinsSpecMasterVolumesAwsElasticBlockStore:
    def __init__(
        self,
        *,
        volume_id: str,
        fs_type: typing.Optional[str] = None,
        partition: typing.Optional[jsii.Number] = None,
        read_only: typing.Optional[bool] = None,
    ) -> None:
        """AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

        :param volume_id: Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
        :param fs_type: Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore TODO: how do we prevent errors in the filesystem from compromising the machine
        :param partition: The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
        :param read_only: Specify "true" to force and set the ReadOnly property in VolumeMounts to "true". If omitted, the default is "false". More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

        schema:
        :schema:: JenkinsSpecMasterVolumesAwsElasticBlockStore
        """
        self._values = {
            "volume_id": volume_id,
        }
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if partition is not None:
            self._values["partition"] = partition
        if read_only is not None:
            self._values["read_only"] = read_only

    @builtins.property
    def volume_id(self) -> str:
        """Unique ID of the persistent disk resource in AWS (Amazon EBS volume).

        More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

        schema:
        :schema:: JenkinsSpecMasterVolumesAwsElasticBlockStore#volumeID
        """
        return self._values.get("volume_id")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type of the volume that you want to mount.

        Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore TODO: how do we prevent errors in the filesystem from compromising the machine

        schema:
        :schema:: JenkinsSpecMasterVolumesAwsElasticBlockStore#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def partition(self) -> typing.Optional[jsii.Number]:
        """The partition in the volume that you want to mount.

        If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).

        schema:
        :schema:: JenkinsSpecMasterVolumesAwsElasticBlockStore#partition
        """
        return self._values.get("partition")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Specify "true" to force and set the ReadOnly property in VolumeMounts to "true".

        If omitted, the default is "false". More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore

        schema:
        :schema:: JenkinsSpecMasterVolumesAwsElasticBlockStore#readOnly
        """
        return self._values.get("read_only")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesAwsElasticBlockStore(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesAzureDisk",
    jsii_struct_bases=[],
    name_mapping={
        "disk_name": "diskName",
        "disk_uri": "diskURI",
        "caching_mode": "cachingMode",
        "fs_type": "fsType",
        "kind": "kind",
        "read_only": "readOnly",
    },
)
class JenkinsSpecMasterVolumesAzureDisk:
    def __init__(
        self,
        *,
        disk_name: str,
        disk_uri: str,
        caching_mode: typing.Optional[str] = None,
        fs_type: typing.Optional[str] = None,
        kind: typing.Optional[str] = None,
        read_only: typing.Optional[bool] = None,
    ) -> None:
        """AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.

        :param disk_name: The Name of the data disk in the blob storage.
        :param disk_uri: The URI the data disk in the blob storage.
        :param caching_mode: Host Caching mode: None, Read Only, Read Write.
        :param fs_type: Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
        :param kind: Expected values Shared: multiple blob disks per storage account Dedicated: single blob disk per storage account Managed: azure managed data disk (only in managed availability set). defaults to shared
        :param read_only: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureDisk
        """
        self._values = {
            "disk_name": disk_name,
            "disk_uri": disk_uri,
        }
        if caching_mode is not None:
            self._values["caching_mode"] = caching_mode
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if kind is not None:
            self._values["kind"] = kind
        if read_only is not None:
            self._values["read_only"] = read_only

    @builtins.property
    def disk_name(self) -> str:
        """The Name of the data disk in the blob storage.

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureDisk#diskName
        """
        return self._values.get("disk_name")

    @builtins.property
    def disk_uri(self) -> str:
        """The URI the data disk in the blob storage.

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureDisk#diskURI
        """
        return self._values.get("disk_uri")

    @builtins.property
    def caching_mode(self) -> typing.Optional[str]:
        """Host Caching mode: None, Read Only, Read Write.

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureDisk#cachingMode
        """
        return self._values.get("caching_mode")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type to mount.

        Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureDisk#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def kind(self) -> typing.Optional[str]:
        """Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set).

        defaults to shared

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureDisk#kind
        """
        return self._values.get("kind")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Defaults to false (read/write).

        ReadOnly here will force the ReadOnly setting in VolumeMounts.

        default
        :default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureDisk#readOnly
        """
        return self._values.get("read_only")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesAzureDisk(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesAzureFile",
    jsii_struct_bases=[],
    name_mapping={
        "secret_name": "secretName",
        "share_name": "shareName",
        "read_only": "readOnly",
    },
)
class JenkinsSpecMasterVolumesAzureFile:
    def __init__(
        self,
        *,
        secret_name: str,
        share_name: str,
        read_only: typing.Optional[bool] = None,
    ) -> None:
        """AzureFile represents an Azure File Service mount on the host and bind mount to the pod.

        :param secret_name: the name of secret that contains Azure Storage Account Name and Key.
        :param share_name: Share Name.
        :param read_only: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureFile
        """
        self._values = {
            "secret_name": secret_name,
            "share_name": share_name,
        }
        if read_only is not None:
            self._values["read_only"] = read_only

    @builtins.property
    def secret_name(self) -> str:
        """the name of secret that contains Azure Storage Account Name and Key.

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureFile#secretName
        """
        return self._values.get("secret_name")

    @builtins.property
    def share_name(self) -> str:
        """Share Name.

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureFile#shareName
        """
        return self._values.get("share_name")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Defaults to false (read/write).

        ReadOnly here will force the ReadOnly setting in VolumeMounts.

        default
        :default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.

        schema:
        :schema:: JenkinsSpecMasterVolumesAzureFile#readOnly
        """
        return self._values.get("read_only")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesAzureFile(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesCephfs",
    jsii_struct_bases=[],
    name_mapping={
        "monitors": "monitors",
        "path": "path",
        "read_only": "readOnly",
        "secret_file": "secretFile",
        "secret_ref": "secretRef",
        "user": "user",
    },
)
class JenkinsSpecMasterVolumesCephfs:
    def __init__(
        self,
        *,
        monitors: typing.List[str],
        path: typing.Optional[str] = None,
        read_only: typing.Optional[bool] = None,
        secret_file: typing.Optional[str] = None,
        secret_ref: typing.Optional["JenkinsSpecMasterVolumesCephfsSecretRef"] = None,
        user: typing.Optional[str] = None,
    ) -> None:
        """CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.

        :param monitors: Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
        :param path: Optional: Used as the mounted root, rather than the full Ceph tree, default is /.
        :param read_only: Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
        :param secret_file: Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
        :param secret_ref: Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
        :param user: Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.

        schema:
        :schema:: JenkinsSpecMasterVolumesCephfs
        """
        if isinstance(secret_ref, dict):
            secret_ref = JenkinsSpecMasterVolumesCephfsSecretRef(**secret_ref)
        self._values = {
            "monitors": monitors,
        }
        if path is not None:
            self._values["path"] = path
        if read_only is not None:
            self._values["read_only"] = read_only
        if secret_file is not None:
            self._values["secret_file"] = secret_file
        if secret_ref is not None:
            self._values["secret_ref"] = secret_ref
        if user is not None:
            self._values["user"] = user

    @builtins.property
    def monitors(self) -> typing.List[str]:
        """Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.

        schema:
        :schema:: JenkinsSpecMasterVolumesCephfs#monitors
        """
        return self._values.get("monitors")

    @builtins.property
    def path(self) -> typing.Optional[str]:
        """Optional: Used as the mounted root, rather than the full Ceph tree, default is /.

        schema:
        :schema:: JenkinsSpecMasterVolumesCephfs#path
        """
        return self._values.get("path")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Optional: Defaults to false (read/write).

        ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it

        default
        :default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesCephfs#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def secret_file(self) -> typing.Optional[str]:
        """Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.

        schema:
        :schema:: JenkinsSpecMasterVolumesCephfs#secretFile
        """
        return self._values.get("secret_file")

    @builtins.property
    def secret_ref(self) -> typing.Optional["JenkinsSpecMasterVolumesCephfsSecretRef"]:
        """Optional: SecretRef is reference to the authentication secret for User, default is empty.

        More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesCephfs#secretRef
        """
        return self._values.get("secret_ref")

    @builtins.property
    def user(self) -> typing.Optional[str]:
        """Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.

        schema:
        :schema:: JenkinsSpecMasterVolumesCephfs#user
        """
        return self._values.get("user")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesCephfs(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesCephfsSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecMasterVolumesCephfsSecretRef:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """Optional: SecretRef is reference to the authentication secret for User, default is empty.

        More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesCephfsSecretRef
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesCephfsSecretRef#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesCephfsSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesCinder",
    jsii_struct_bases=[],
    name_mapping={
        "volume_id": "volumeID",
        "fs_type": "fsType",
        "read_only": "readOnly",
        "secret_ref": "secretRef",
    },
)
class JenkinsSpecMasterVolumesCinder:
    def __init__(
        self,
        *,
        volume_id: str,
        fs_type: typing.Optional[str] = None,
        read_only: typing.Optional[bool] = None,
        secret_ref: typing.Optional["JenkinsSpecMasterVolumesCinderSecretRef"] = None,
    ) -> None:
        """Cinder represents a cinder volume attached and mounted on kubelets host machine.

        More info: https://examples.k8s.io/mysql-cinder-pd/README.md

        :param volume_id: volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
        :param fs_type: Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
        :param read_only: Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
        :param secret_ref: Optional: points to a secret object containing parameters used to connect to OpenStack.

        schema:
        :schema:: JenkinsSpecMasterVolumesCinder
        """
        if isinstance(secret_ref, dict):
            secret_ref = JenkinsSpecMasterVolumesCinderSecretRef(**secret_ref)
        self._values = {
            "volume_id": volume_id,
        }
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if read_only is not None:
            self._values["read_only"] = read_only
        if secret_ref is not None:
            self._values["secret_ref"] = secret_ref

    @builtins.property
    def volume_id(self) -> str:
        """volume id used to identify the volume in cinder.

        More info: https://examples.k8s.io/mysql-cinder-pd/README.md

        schema:
        :schema:: JenkinsSpecMasterVolumesCinder#volumeID
        """
        return self._values.get("volume_id")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type to mount.

        Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md

        schema:
        :schema:: JenkinsSpecMasterVolumesCinder#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Optional: Defaults to false (read/write).

        ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md

        default
        :default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md

        schema:
        :schema:: JenkinsSpecMasterVolumesCinder#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def secret_ref(self) -> typing.Optional["JenkinsSpecMasterVolumesCinderSecretRef"]:
        """Optional: points to a secret object containing parameters used to connect to OpenStack.

        schema:
        :schema:: JenkinsSpecMasterVolumesCinder#secretRef
        """
        return self._values.get("secret_ref")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesCinder(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesCinderSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecMasterVolumesCinderSecretRef:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """Optional: points to a secret object containing parameters used to connect to OpenStack.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesCinderSecretRef
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesCinderSecretRef#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesCinderSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesConfigMap",
    jsii_struct_bases=[],
    name_mapping={
        "default_mode": "defaultMode",
        "items": "items",
        "name": "name",
        "optional": "optional",
    },
)
class JenkinsSpecMasterVolumesConfigMap:
    def __init__(
        self,
        *,
        default_mode: typing.Optional[jsii.Number] = None,
        items: typing.Optional[
            typing.List["JenkinsSpecMasterVolumesConfigMapItems"]
        ] = None,
        name: typing.Optional[str] = None,
        optional: typing.Optional[bool] = None,
    ) -> None:
        """ConfigMap represents a configMap that should populate this volume.

        :param default_mode: Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set. Default: 644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
        :param items: If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
        :param optional: Specify whether the ConfigMap or its keys must be defined.

        schema:
        :schema:: JenkinsSpecMasterVolumesConfigMap
        """
        self._values = {}
        if default_mode is not None:
            self._values["default_mode"] = default_mode
        if items is not None:
            self._values["items"] = items
        if name is not None:
            self._values["name"] = name
        if optional is not None:
            self._values["optional"] = optional

    @builtins.property
    def default_mode(self) -> typing.Optional[jsii.Number]:
        """Optional: mode bits to use on created files by default.

        Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        default
        :default: 644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesConfigMap#defaultMode
        """
        return self._values.get("default_mode")

    @builtins.property
    def items(
        self,
    ) -> typing.Optional[typing.List["JenkinsSpecMasterVolumesConfigMapItems"]]:
        """If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.

        If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.

        schema:
        :schema:: JenkinsSpecMasterVolumesConfigMap#items
        """
        return self._values.get("items")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesConfigMap#name
        """
        return self._values.get("name")

    @builtins.property
    def optional(self) -> typing.Optional[bool]:
        """Specify whether the ConfigMap or its keys must be defined.

        schema:
        :schema:: JenkinsSpecMasterVolumesConfigMap#optional
        """
        return self._values.get("optional")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesConfigMap(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesConfigMapItems",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "path": "path", "mode": "mode"},
)
class JenkinsSpecMasterVolumesConfigMapItems:
    def __init__(
        self, *, key: str, path: str, mode: typing.Optional[jsii.Number] = None
    ) -> None:
        """Maps a string key to a path within a volume.

        :param key: The key to project.
        :param path: The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
        :param mode: Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesConfigMapItems
        """
        self._values = {
            "key": key,
            "path": path,
        }
        if mode is not None:
            self._values["mode"] = mode

    @builtins.property
    def key(self) -> str:
        """The key to project.

        schema:
        :schema:: JenkinsSpecMasterVolumesConfigMapItems#key
        """
        return self._values.get("key")

    @builtins.property
    def path(self) -> str:
        """The relative path of the file to map the key to.

        May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.

        schema:
        :schema:: JenkinsSpecMasterVolumesConfigMapItems#path
        """
        return self._values.get("path")

    @builtins.property
    def mode(self) -> typing.Optional[jsii.Number]:
        """Optional: mode bits to use on this file, must be a value between 0 and 0777.

        If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesConfigMapItems#mode
        """
        return self._values.get("mode")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesConfigMapItems(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesCsi",
    jsii_struct_bases=[],
    name_mapping={
        "driver": "driver",
        "fs_type": "fsType",
        "node_publish_secret_ref": "nodePublishSecretRef",
        "read_only": "readOnly",
        "volume_attributes": "volumeAttributes",
    },
)
class JenkinsSpecMasterVolumesCsi:
    def __init__(
        self,
        *,
        driver: str,
        fs_type: typing.Optional[str] = None,
        node_publish_secret_ref: typing.Optional[
            "JenkinsSpecMasterVolumesCsiNodePublishSecretRef"
        ] = None,
        read_only: typing.Optional[bool] = None,
        volume_attributes: typing.Optional[typing.Mapping[str, str]] = None,
    ) -> None:
        """CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).

        :param driver: Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
        :param fs_type: Filesystem type to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
        :param node_publish_secret_ref: NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
        :param read_only: Specifies a read-only configuration for the volume. Defaults to false (read/write). Default: false (read/write).
        :param volume_attributes: VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.

        schema:
        :schema:: JenkinsSpecMasterVolumesCsi
        """
        if isinstance(node_publish_secret_ref, dict):
            node_publish_secret_ref = JenkinsSpecMasterVolumesCsiNodePublishSecretRef(
                **node_publish_secret_ref
            )
        self._values = {
            "driver": driver,
        }
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if node_publish_secret_ref is not None:
            self._values["node_publish_secret_ref"] = node_publish_secret_ref
        if read_only is not None:
            self._values["read_only"] = read_only
        if volume_attributes is not None:
            self._values["volume_attributes"] = volume_attributes

    @builtins.property
    def driver(self) -> str:
        """Driver is the name of the CSI driver that handles this volume.

        Consult with your admin for the correct name as registered in the cluster.

        schema:
        :schema:: JenkinsSpecMasterVolumesCsi#driver
        """
        return self._values.get("driver")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type to mount.

        Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.

        schema:
        :schema:: JenkinsSpecMasterVolumesCsi#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def node_publish_secret_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesCsiNodePublishSecretRef"]:
        """NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.

        This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.

        schema:
        :schema:: JenkinsSpecMasterVolumesCsi#nodePublishSecretRef
        """
        return self._values.get("node_publish_secret_ref")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Specifies a read-only configuration for the volume.

        Defaults to false (read/write).

        default
        :default: false (read/write).

        schema:
        :schema:: JenkinsSpecMasterVolumesCsi#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def volume_attributes(self) -> typing.Optional[typing.Mapping[str, str]]:
        """VolumeAttributes stores driver-specific properties that are passed to the CSI driver.

        Consult your driver's documentation for supported values.

        schema:
        :schema:: JenkinsSpecMasterVolumesCsi#volumeAttributes
        """
        return self._values.get("volume_attributes")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesCsi(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesCsiNodePublishSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecMasterVolumesCsiNodePublishSecretRef:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.

        This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesCsiNodePublishSecretRef
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesCsiNodePublishSecretRef#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesCsiNodePublishSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesDownwardApi",
    jsii_struct_bases=[],
    name_mapping={"default_mode": "defaultMode", "items": "items"},
)
class JenkinsSpecMasterVolumesDownwardApi:
    def __init__(
        self,
        *,
        default_mode: typing.Optional[jsii.Number] = None,
        items: typing.Optional[
            typing.List["JenkinsSpecMasterVolumesDownwardApiItems"]
        ] = None,
    ) -> None:
        """DownwardAPI represents downward API about the pod that should populate this volume.

        :param default_mode: Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set. Default: 644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
        :param items: Items is a list of downward API volume file.

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApi
        """
        self._values = {}
        if default_mode is not None:
            self._values["default_mode"] = default_mode
        if items is not None:
            self._values["items"] = items

    @builtins.property
    def default_mode(self) -> typing.Optional[jsii.Number]:
        """Optional: mode bits to use on created files by default.

        Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        default
        :default: 644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApi#defaultMode
        """
        return self._values.get("default_mode")

    @builtins.property
    def items(
        self,
    ) -> typing.Optional[typing.List["JenkinsSpecMasterVolumesDownwardApiItems"]]:
        """Items is a list of downward API volume file.

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApi#items
        """
        return self._values.get("items")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesDownwardApi(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesDownwardApiItems",
    jsii_struct_bases=[],
    name_mapping={
        "path": "path",
        "field_ref": "fieldRef",
        "mode": "mode",
        "resource_field_ref": "resourceFieldRef",
    },
)
class JenkinsSpecMasterVolumesDownwardApiItems:
    def __init__(
        self,
        *,
        path: str,
        field_ref: typing.Optional[
            "JenkinsSpecMasterVolumesDownwardApiItemsFieldRef"
        ] = None,
        mode: typing.Optional[jsii.Number] = None,
        resource_field_ref: typing.Optional[
            "JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef"
        ] = None,
    ) -> None:
        """DownwardAPIVolumeFile represents information to create the file containing the pod field.

        :param path: Required: Path is the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
        :param field_ref: Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
        :param mode: Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
        :param resource_field_ref: Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItems
        """
        if isinstance(field_ref, dict):
            field_ref = JenkinsSpecMasterVolumesDownwardApiItemsFieldRef(**field_ref)
        if isinstance(resource_field_ref, dict):
            resource_field_ref = JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef(
                **resource_field_ref
            )
        self._values = {
            "path": path,
        }
        if field_ref is not None:
            self._values["field_ref"] = field_ref
        if mode is not None:
            self._values["mode"] = mode
        if resource_field_ref is not None:
            self._values["resource_field_ref"] = resource_field_ref

    @builtins.property
    def path(self) -> str:
        """Required: Path is  the relative path name of the file to be created.

        Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItems#path
        """
        return self._values.get("path")

    @builtins.property
    def field_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesDownwardApiItemsFieldRef"]:
        """Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItems#fieldRef
        """
        return self._values.get("field_ref")

    @builtins.property
    def mode(self) -> typing.Optional[jsii.Number]:
        """Optional: mode bits to use on this file, must be a value between 0 and 0777.

        If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItems#mode
        """
        return self._values.get("mode")

    @builtins.property
    def resource_field_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef"]:
        """Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItems#resourceFieldRef
        """
        return self._values.get("resource_field_ref")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesDownwardApiItems(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesDownwardApiItemsFieldRef",
    jsii_struct_bases=[],
    name_mapping={"field_path": "fieldPath", "api_version": "apiVersion"},
)
class JenkinsSpecMasterVolumesDownwardApiItemsFieldRef:
    def __init__(
        self, *, field_path: str, api_version: typing.Optional[str] = None
    ) -> None:
        """Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.

        :param field_path: Path of the field to select in the specified API version.
        :param api_version: Version of the schema the FieldPath is written in terms of, defaults to "v1".

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItemsFieldRef
        """
        self._values = {
            "field_path": field_path,
        }
        if api_version is not None:
            self._values["api_version"] = api_version

    @builtins.property
    def field_path(self) -> str:
        """Path of the field to select in the specified API version.

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItemsFieldRef#fieldPath
        """
        return self._values.get("field_path")

    @builtins.property
    def api_version(self) -> typing.Optional[str]:
        """Version of the schema the FieldPath is written in terms of, defaults to "v1".

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItemsFieldRef#apiVersion
        """
        return self._values.get("api_version")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesDownwardApiItemsFieldRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef",
    jsii_struct_bases=[],
    name_mapping={
        "resource": "resource",
        "container_name": "containerName",
        "divisor": "divisor",
    },
)
class JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef:
    def __init__(
        self,
        *,
        resource: str,
        container_name: typing.Optional[str] = None,
        divisor: typing.Optional[str] = None,
    ) -> None:
        """Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.

        :param resource: Required: resource to select.
        :param container_name: Container name: required for volumes, optional for env vars.
        :param divisor: Specifies the output format of the exposed resources, defaults to "1".

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef
        """
        self._values = {
            "resource": resource,
        }
        if container_name is not None:
            self._values["container_name"] = container_name
        if divisor is not None:
            self._values["divisor"] = divisor

    @builtins.property
    def resource(self) -> str:
        """Required: resource to select.

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef#resource
        """
        return self._values.get("resource")

    @builtins.property
    def container_name(self) -> typing.Optional[str]:
        """Container name: required for volumes, optional for env vars.

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef#containerName
        """
        return self._values.get("container_name")

    @builtins.property
    def divisor(self) -> typing.Optional[str]:
        """Specifies the output format of the exposed resources, defaults to "1".

        schema:
        :schema:: JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef#divisor
        """
        return self._values.get("divisor")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesEmptyDir",
    jsii_struct_bases=[],
    name_mapping={"medium": "medium", "size_limit": "sizeLimit"},
)
class JenkinsSpecMasterVolumesEmptyDir:
    def __init__(
        self,
        *,
        medium: typing.Optional[str] = None,
        size_limit: typing.Optional[str] = None,
    ) -> None:
        """EmptyDir represents a temporary directory that shares a pod's lifetime.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir

        :param medium: What type of storage medium should back this directory. The default is "" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
        :param size_limit: Total amount of local storage required for this EmptyDir volume. The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir

        schema:
        :schema:: JenkinsSpecMasterVolumesEmptyDir
        """
        self._values = {}
        if medium is not None:
            self._values["medium"] = medium
        if size_limit is not None:
            self._values["size_limit"] = size_limit

    @builtins.property
    def medium(self) -> typing.Optional[str]:
        """What type of storage medium should back this directory.

        The default is "" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir

        schema:
        :schema:: JenkinsSpecMasterVolumesEmptyDir#medium
        """
        return self._values.get("medium")

    @builtins.property
    def size_limit(self) -> typing.Optional[str]:
        """Total amount of local storage required for this EmptyDir volume.

        The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir

        schema:
        :schema:: JenkinsSpecMasterVolumesEmptyDir#sizeLimit
        """
        return self._values.get("size_limit")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesEmptyDir(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesFc",
    jsii_struct_bases=[],
    name_mapping={
        "fs_type": "fsType",
        "lun": "lun",
        "read_only": "readOnly",
        "target_ww_ns": "targetWWNs",
        "wwids": "wwids",
    },
)
class JenkinsSpecMasterVolumesFc:
    def __init__(
        self,
        *,
        fs_type: typing.Optional[str] = None,
        lun: typing.Optional[jsii.Number] = None,
        read_only: typing.Optional[bool] = None,
        target_ww_ns: typing.Optional[typing.List[str]] = None,
        wwids: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.

        :param fs_type: Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. TODO: how do we prevent errors in the filesystem from compromising the machine
        :param lun: Optional: FC target lun number.
        :param read_only: Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
        :param target_ww_ns: Optional: FC target worldwide names (WWNs).
        :param wwids: Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.

        schema:
        :schema:: JenkinsSpecMasterVolumesFc
        """
        self._values = {}
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if lun is not None:
            self._values["lun"] = lun
        if read_only is not None:
            self._values["read_only"] = read_only
        if target_ww_ns is not None:
            self._values["target_ww_ns"] = target_ww_ns
        if wwids is not None:
            self._values["wwids"] = wwids

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type to mount.

        Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. TODO: how do we prevent errors in the filesystem from compromising the machine

        schema:
        :schema:: JenkinsSpecMasterVolumesFc#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def lun(self) -> typing.Optional[jsii.Number]:
        """Optional: FC target lun number.

        schema:
        :schema:: JenkinsSpecMasterVolumesFc#lun
        """
        return self._values.get("lun")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Optional: Defaults to false (read/write).

        ReadOnly here will force the ReadOnly setting in VolumeMounts.

        default
        :default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.

        schema:
        :schema:: JenkinsSpecMasterVolumesFc#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def target_ww_ns(self) -> typing.Optional[typing.List[str]]:
        """Optional: FC target worldwide names (WWNs).

        schema:
        :schema:: JenkinsSpecMasterVolumesFc#targetWWNs
        """
        return self._values.get("target_ww_ns")

    @builtins.property
    def wwids(self) -> typing.Optional[typing.List[str]]:
        """Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.

        schema:
        :schema:: JenkinsSpecMasterVolumesFc#wwids
        """
        return self._values.get("wwids")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesFc(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesFlexVolume",
    jsii_struct_bases=[],
    name_mapping={
        "driver": "driver",
        "fs_type": "fsType",
        "options": "options",
        "read_only": "readOnly",
        "secret_ref": "secretRef",
    },
)
class JenkinsSpecMasterVolumesFlexVolume:
    def __init__(
        self,
        *,
        driver: str,
        fs_type: typing.Optional[str] = None,
        options: typing.Optional[typing.Mapping[str, str]] = None,
        read_only: typing.Optional[bool] = None,
        secret_ref: typing.Optional[
            "JenkinsSpecMasterVolumesFlexVolumeSecretRef"
        ] = None,
    ) -> None:
        """FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.

        :param driver: Driver is the name of the driver to use for this volume.
        :param fs_type: Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
        :param options: Optional: Extra command options if any.
        :param read_only: Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
        :param secret_ref: Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.

        schema:
        :schema:: JenkinsSpecMasterVolumesFlexVolume
        """
        if isinstance(secret_ref, dict):
            secret_ref = JenkinsSpecMasterVolumesFlexVolumeSecretRef(**secret_ref)
        self._values = {
            "driver": driver,
        }
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if options is not None:
            self._values["options"] = options
        if read_only is not None:
            self._values["read_only"] = read_only
        if secret_ref is not None:
            self._values["secret_ref"] = secret_ref

    @builtins.property
    def driver(self) -> str:
        """Driver is the name of the driver to use for this volume.

        schema:
        :schema:: JenkinsSpecMasterVolumesFlexVolume#driver
        """
        return self._values.get("driver")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type to mount.

        Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.

        schema:
        :schema:: JenkinsSpecMasterVolumesFlexVolume#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def options(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Optional: Extra command options if any.

        schema:
        :schema:: JenkinsSpecMasterVolumesFlexVolume#options
        """
        return self._values.get("options")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Optional: Defaults to false (read/write).

        ReadOnly here will force the ReadOnly setting in VolumeMounts.

        default
        :default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.

        schema:
        :schema:: JenkinsSpecMasterVolumesFlexVolume#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def secret_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesFlexVolumeSecretRef"]:
        """Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.

        This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.

        schema:
        :schema:: JenkinsSpecMasterVolumesFlexVolume#secretRef
        """
        return self._values.get("secret_ref")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesFlexVolume(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesFlexVolumeSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecMasterVolumesFlexVolumeSecretRef:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.

        This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesFlexVolumeSecretRef
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesFlexVolumeSecretRef#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesFlexVolumeSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesFlocker",
    jsii_struct_bases=[],
    name_mapping={"dataset_name": "datasetName", "dataset_uuid": "datasetUUID"},
)
class JenkinsSpecMasterVolumesFlocker:
    def __init__(
        self,
        *,
        dataset_name: typing.Optional[str] = None,
        dataset_uuid: typing.Optional[str] = None,
    ) -> None:
        """Flocker represents a Flocker volume attached to a kubelet's host machine.

        This depends on the Flocker control service being running

        :param dataset_name: Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated.
        :param dataset_uuid: UUID of the dataset. This is unique identifier of a Flocker dataset

        schema:
        :schema:: JenkinsSpecMasterVolumesFlocker
        """
        self._values = {}
        if dataset_name is not None:
            self._values["dataset_name"] = dataset_name
        if dataset_uuid is not None:
            self._values["dataset_uuid"] = dataset_uuid

    @builtins.property
    def dataset_name(self) -> typing.Optional[str]:
        """Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated.

        schema:
        :schema:: JenkinsSpecMasterVolumesFlocker#datasetName
        """
        return self._values.get("dataset_name")

    @builtins.property
    def dataset_uuid(self) -> typing.Optional[str]:
        """UUID of the dataset.

        This is unique identifier of a Flocker dataset

        schema:
        :schema:: JenkinsSpecMasterVolumesFlocker#datasetUUID
        """
        return self._values.get("dataset_uuid")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesFlocker(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesGcePersistentDisk",
    jsii_struct_bases=[],
    name_mapping={
        "pd_name": "pdName",
        "fs_type": "fsType",
        "partition": "partition",
        "read_only": "readOnly",
    },
)
class JenkinsSpecMasterVolumesGcePersistentDisk:
    def __init__(
        self,
        *,
        pd_name: str,
        fs_type: typing.Optional[str] = None,
        partition: typing.Optional[jsii.Number] = None,
        read_only: typing.Optional[bool] = None,
    ) -> None:
        """GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

        :param pd_name: Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
        :param fs_type: Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk TODO: how do we prevent errors in the filesystem from compromising the machine
        :param partition: The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
        :param read_only: ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk Default: false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

        schema:
        :schema:: JenkinsSpecMasterVolumesGcePersistentDisk
        """
        self._values = {
            "pd_name": pd_name,
        }
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if partition is not None:
            self._values["partition"] = partition
        if read_only is not None:
            self._values["read_only"] = read_only

    @builtins.property
    def pd_name(self) -> str:
        """Unique name of the PD resource in GCE.

        Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

        schema:
        :schema:: JenkinsSpecMasterVolumesGcePersistentDisk#pdName
        """
        return self._values.get("pd_name")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type of the volume that you want to mount.

        Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk TODO: how do we prevent errors in the filesystem from compromising the machine

        schema:
        :schema:: JenkinsSpecMasterVolumesGcePersistentDisk#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def partition(self) -> typing.Optional[jsii.Number]:
        """The partition in the volume that you want to mount.

        If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

        schema:
        :schema:: JenkinsSpecMasterVolumesGcePersistentDisk#partition
        """
        return self._values.get("partition")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """ReadOnly here will force the ReadOnly setting in VolumeMounts.

        Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

        default
        :default: false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk

        schema:
        :schema:: JenkinsSpecMasterVolumesGcePersistentDisk#readOnly
        """
        return self._values.get("read_only")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesGcePersistentDisk(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesGitRepo",
    jsii_struct_bases=[],
    name_mapping={
        "repository": "repository",
        "directory": "directory",
        "revision": "revision",
    },
)
class JenkinsSpecMasterVolumesGitRepo:
    def __init__(
        self,
        *,
        repository: str,
        directory: typing.Optional[str] = None,
        revision: typing.Optional[str] = None,
    ) -> None:
        """GitRepo represents a git repository at a particular revision.

        DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.

        :param repository: Repository URL.
        :param directory: Target directory name. Must not contain or start with '..'. If '.' is supplied, the volume directory will be the git repository. Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
        :param revision: Commit hash for the specified revision.

        schema:
        :schema:: JenkinsSpecMasterVolumesGitRepo
        """
        self._values = {
            "repository": repository,
        }
        if directory is not None:
            self._values["directory"] = directory
        if revision is not None:
            self._values["revision"] = revision

    @builtins.property
    def repository(self) -> str:
        """Repository URL.

        schema:
        :schema:: JenkinsSpecMasterVolumesGitRepo#repository
        """
        return self._values.get("repository")

    @builtins.property
    def directory(self) -> typing.Optional[str]:
        """Target directory name.

        Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.

        schema:
        :schema:: JenkinsSpecMasterVolumesGitRepo#directory
        """
        return self._values.get("directory")

    @builtins.property
    def revision(self) -> typing.Optional[str]:
        """Commit hash for the specified revision.

        schema:
        :schema:: JenkinsSpecMasterVolumesGitRepo#revision
        """
        return self._values.get("revision")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesGitRepo(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesGlusterfs",
    jsii_struct_bases=[],
    name_mapping={"endpoints": "endpoints", "path": "path", "read_only": "readOnly"},
)
class JenkinsSpecMasterVolumesGlusterfs:
    def __init__(
        self, *, endpoints: str, path: str, read_only: typing.Optional[bool] = None
    ) -> None:
        """Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.

        More info: https://examples.k8s.io/volumes/glusterfs/README.md

        :param endpoints: EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
        :param path: Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
        :param read_only: ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod Default: false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod

        schema:
        :schema:: JenkinsSpecMasterVolumesGlusterfs
        """
        self._values = {
            "endpoints": endpoints,
            "path": path,
        }
        if read_only is not None:
            self._values["read_only"] = read_only

    @builtins.property
    def endpoints(self) -> str:
        """EndpointsName is the endpoint name that details Glusterfs topology.

        More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod

        schema:
        :schema:: JenkinsSpecMasterVolumesGlusterfs#endpoints
        """
        return self._values.get("endpoints")

    @builtins.property
    def path(self) -> str:
        """Path is the Glusterfs volume path.

        More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod

        schema:
        :schema:: JenkinsSpecMasterVolumesGlusterfs#path
        """
        return self._values.get("path")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.

        Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod

        default
        :default: false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod

        schema:
        :schema:: JenkinsSpecMasterVolumesGlusterfs#readOnly
        """
        return self._values.get("read_only")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesGlusterfs(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesHostPath",
    jsii_struct_bases=[],
    name_mapping={"path": "path", "type": "type"},
)
class JenkinsSpecMasterVolumesHostPath:
    def __init__(self, *, path: str, type: typing.Optional[str] = None) -> None:
        """HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.

        This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.

        :param path: Path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
        :param type: Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath. Default: More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath

        schema:
        :schema:: JenkinsSpecMasterVolumesHostPath
        """
        self._values = {
            "path": path,
        }
        if type is not None:
            self._values["type"] = type

    @builtins.property
    def path(self) -> str:
        """Path of the directory on the host.

        If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath

        schema:
        :schema:: JenkinsSpecMasterVolumesHostPath#path
        """
        return self._values.get("path")

    @builtins.property
    def type(self) -> typing.Optional[str]:
        """Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath.

        default
        :default: More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath

        schema:
        :schema:: JenkinsSpecMasterVolumesHostPath#type
        """
        return self._values.get("type")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesHostPath(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesIscsi",
    jsii_struct_bases=[],
    name_mapping={
        "iqn": "iqn",
        "lun": "lun",
        "target_portal": "targetPortal",
        "chap_auth_discovery": "chapAuthDiscovery",
        "chap_auth_session": "chapAuthSession",
        "fs_type": "fsType",
        "initiator_name": "initiatorName",
        "iscsi_interface": "iscsiInterface",
        "portals": "portals",
        "read_only": "readOnly",
        "secret_ref": "secretRef",
    },
)
class JenkinsSpecMasterVolumesIscsi:
    def __init__(
        self,
        *,
        iqn: str,
        lun: jsii.Number,
        target_portal: str,
        chap_auth_discovery: typing.Optional[bool] = None,
        chap_auth_session: typing.Optional[bool] = None,
        fs_type: typing.Optional[str] = None,
        initiator_name: typing.Optional[str] = None,
        iscsi_interface: typing.Optional[str] = None,
        portals: typing.Optional[typing.List[str]] = None,
        read_only: typing.Optional[bool] = None,
        secret_ref: typing.Optional["JenkinsSpecMasterVolumesIscsiSecretRef"] = None,
    ) -> None:
        """ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod.

        More info: https://examples.k8s.io/volumes/iscsi/README.md

        :param iqn: Target iSCSI Qualified Name.
        :param lun: iSCSI Target Lun number.
        :param target_portal: iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
        :param chap_auth_discovery: whether support iSCSI Discovery CHAP authentication.
        :param chap_auth_session: whether support iSCSI Session CHAP authentication.
        :param fs_type: Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi TODO: how do we prevent errors in the filesystem from compromising the machine
        :param initiator_name: Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface : will be created for the connection.
        :param iscsi_interface: iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp). Default: default' (tcp).
        :param portals: iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
        :param read_only: ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. Default: false.
        :param secret_ref: CHAP Secret for iSCSI target and initiator authentication.

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi
        """
        if isinstance(secret_ref, dict):
            secret_ref = JenkinsSpecMasterVolumesIscsiSecretRef(**secret_ref)
        self._values = {
            "iqn": iqn,
            "lun": lun,
            "target_portal": target_portal,
        }
        if chap_auth_discovery is not None:
            self._values["chap_auth_discovery"] = chap_auth_discovery
        if chap_auth_session is not None:
            self._values["chap_auth_session"] = chap_auth_session
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if initiator_name is not None:
            self._values["initiator_name"] = initiator_name
        if iscsi_interface is not None:
            self._values["iscsi_interface"] = iscsi_interface
        if portals is not None:
            self._values["portals"] = portals
        if read_only is not None:
            self._values["read_only"] = read_only
        if secret_ref is not None:
            self._values["secret_ref"] = secret_ref

    @builtins.property
    def iqn(self) -> str:
        """Target iSCSI Qualified Name.

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#iqn
        """
        return self._values.get("iqn")

    @builtins.property
    def lun(self) -> jsii.Number:
        """iSCSI Target Lun number.

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#lun
        """
        return self._values.get("lun")

    @builtins.property
    def target_portal(self) -> str:
        """iSCSI Target Portal.

        The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#targetPortal
        """
        return self._values.get("target_portal")

    @builtins.property
    def chap_auth_discovery(self) -> typing.Optional[bool]:
        """whether support iSCSI Discovery CHAP authentication.

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#chapAuthDiscovery
        """
        return self._values.get("chap_auth_discovery")

    @builtins.property
    def chap_auth_session(self) -> typing.Optional[bool]:
        """whether support iSCSI Session CHAP authentication.

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#chapAuthSession
        """
        return self._values.get("chap_auth_session")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type of the volume that you want to mount.

        Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi TODO: how do we prevent errors in the filesystem from compromising the machine

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def initiator_name(self) -> typing.Optional[str]:
        """Custom iSCSI Initiator Name.

        If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface : will be created for the connection.

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#initiatorName
        """
        return self._values.get("initiator_name")

    @builtins.property
    def iscsi_interface(self) -> typing.Optional[str]:
        """iSCSI Interface Name that uses an iSCSI transport.

        Defaults to 'default' (tcp).

        default
        :default: default' (tcp).

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#iscsiInterface
        """
        return self._values.get("iscsi_interface")

    @builtins.property
    def portals(self) -> typing.Optional[typing.List[str]]:
        """iSCSI Target Portal List.

        The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#portals
        """
        return self._values.get("portals")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """ReadOnly here will force the ReadOnly setting in VolumeMounts.

        Defaults to false.

        default
        :default: false.

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def secret_ref(self) -> typing.Optional["JenkinsSpecMasterVolumesIscsiSecretRef"]:
        """CHAP Secret for iSCSI target and initiator authentication.

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsi#secretRef
        """
        return self._values.get("secret_ref")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesIscsi(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesIscsiSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecMasterVolumesIscsiSecretRef:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """CHAP Secret for iSCSI target and initiator authentication.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsiSecretRef
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesIscsiSecretRef#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesIscsiSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesNfs",
    jsii_struct_bases=[],
    name_mapping={"path": "path", "server": "server", "read_only": "readOnly"},
)
class JenkinsSpecMasterVolumesNfs:
    def __init__(
        self, *, path: str, server: str, read_only: typing.Optional[bool] = None
    ) -> None:
        """NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.

        :param path: Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
        :param server: Server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
        :param read_only: ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs Default: false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs

        schema:
        :schema:: JenkinsSpecMasterVolumesNfs
        """
        self._values = {
            "path": path,
            "server": server,
        }
        if read_only is not None:
            self._values["read_only"] = read_only

    @builtins.property
    def path(self) -> str:
        """Path that is exported by the NFS server.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs

        schema:
        :schema:: JenkinsSpecMasterVolumesNfs#path
        """
        return self._values.get("path")

    @builtins.property
    def server(self) -> str:
        """Server is the hostname or IP address of the NFS server.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs

        schema:
        :schema:: JenkinsSpecMasterVolumesNfs#server
        """
        return self._values.get("server")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """ReadOnly here will force the NFS export to be mounted with read-only permissions.

        Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs

        default
        :default: false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs

        schema:
        :schema:: JenkinsSpecMasterVolumesNfs#readOnly
        """
        return self._values.get("read_only")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesNfs(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesPersistentVolumeClaim",
    jsii_struct_bases=[],
    name_mapping={"claim_name": "claimName", "read_only": "readOnly"},
)
class JenkinsSpecMasterVolumesPersistentVolumeClaim:
    def __init__(
        self, *, claim_name: str, read_only: typing.Optional[bool] = None
    ) -> None:
        """PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.

        More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims

        :param claim_name: ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
        :param read_only: Will force the ReadOnly setting in VolumeMounts. Default false.

        schema:
        :schema:: JenkinsSpecMasterVolumesPersistentVolumeClaim
        """
        self._values = {
            "claim_name": claim_name,
        }
        if read_only is not None:
            self._values["read_only"] = read_only

    @builtins.property
    def claim_name(self) -> str:
        """ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume.

        More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims

        schema:
        :schema:: JenkinsSpecMasterVolumesPersistentVolumeClaim#claimName
        """
        return self._values.get("claim_name")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Will force the ReadOnly setting in VolumeMounts.

        Default false.

        schema:
        :schema:: JenkinsSpecMasterVolumesPersistentVolumeClaim#readOnly
        """
        return self._values.get("read_only")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesPersistentVolumeClaim(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesPhotonPersistentDisk",
    jsii_struct_bases=[],
    name_mapping={"pd_id": "pdID", "fs_type": "fsType"},
)
class JenkinsSpecMasterVolumesPhotonPersistentDisk:
    def __init__(self, *, pd_id: str, fs_type: typing.Optional[str] = None) -> None:
        """PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine.

        :param pd_id: ID that identifies Photon Controller persistent disk.
        :param fs_type: Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.

        schema:
        :schema:: JenkinsSpecMasterVolumesPhotonPersistentDisk
        """
        self._values = {
            "pd_id": pd_id,
        }
        if fs_type is not None:
            self._values["fs_type"] = fs_type

    @builtins.property
    def pd_id(self) -> str:
        """ID that identifies Photon Controller persistent disk.

        schema:
        :schema:: JenkinsSpecMasterVolumesPhotonPersistentDisk#pdID
        """
        return self._values.get("pd_id")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type to mount.

        Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.

        schema:
        :schema:: JenkinsSpecMasterVolumesPhotonPersistentDisk#fsType
        """
        return self._values.get("fs_type")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesPhotonPersistentDisk(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesPortworxVolume",
    jsii_struct_bases=[],
    name_mapping={
        "volume_id": "volumeID",
        "fs_type": "fsType",
        "read_only": "readOnly",
    },
)
class JenkinsSpecMasterVolumesPortworxVolume:
    def __init__(
        self,
        *,
        volume_id: str,
        fs_type: typing.Optional[str] = None,
        read_only: typing.Optional[bool] = None,
    ) -> None:
        """PortworxVolume represents a portworx volume attached and mounted on kubelets host machine.

        :param volume_id: VolumeID uniquely identifies a Portworx volume.
        :param fs_type: FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
        :param read_only: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.

        schema:
        :schema:: JenkinsSpecMasterVolumesPortworxVolume
        """
        self._values = {
            "volume_id": volume_id,
        }
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if read_only is not None:
            self._values["read_only"] = read_only

    @builtins.property
    def volume_id(self) -> str:
        """VolumeID uniquely identifies a Portworx volume.

        schema:
        :schema:: JenkinsSpecMasterVolumesPortworxVolume#volumeID
        """
        return self._values.get("volume_id")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system.

        Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.

        schema:
        :schema:: JenkinsSpecMasterVolumesPortworxVolume#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Defaults to false (read/write).

        ReadOnly here will force the ReadOnly setting in VolumeMounts.

        default
        :default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.

        schema:
        :schema:: JenkinsSpecMasterVolumesPortworxVolume#readOnly
        """
        return self._values.get("read_only")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesPortworxVolume(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjected",
    jsii_struct_bases=[],
    name_mapping={"sources": "sources", "default_mode": "defaultMode"},
)
class JenkinsSpecMasterVolumesProjected:
    def __init__(
        self,
        *,
        sources: typing.List["JenkinsSpecMasterVolumesProjectedSources"],
        default_mode: typing.Optional[jsii.Number] = None,
    ) -> None:
        """Items for all in one resources secrets, configmaps, and downward API.

        :param sources: list of volume projections.
        :param default_mode: Mode bits to use on created files by default. Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjected
        """
        self._values = {
            "sources": sources,
        }
        if default_mode is not None:
            self._values["default_mode"] = default_mode

    @builtins.property
    def sources(self) -> typing.List["JenkinsSpecMasterVolumesProjectedSources"]:
        """list of volume projections.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjected#sources
        """
        return self._values.get("sources")

    @builtins.property
    def default_mode(self) -> typing.Optional[jsii.Number]:
        """Mode bits to use on created files by default.

        Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjected#defaultMode
        """
        return self._values.get("default_mode")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesProjected(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjectedSources",
    jsii_struct_bases=[],
    name_mapping={
        "config_map": "configMap",
        "downward_api": "downwardAPI",
        "secret": "secret",
        "service_account_token": "serviceAccountToken",
    },
)
class JenkinsSpecMasterVolumesProjectedSources:
    def __init__(
        self,
        *,
        config_map: typing.Optional[
            "JenkinsSpecMasterVolumesProjectedSourcesConfigMap"
        ] = None,
        downward_api: typing.Optional[
            "JenkinsSpecMasterVolumesProjectedSourcesDownwardApi"
        ] = None,
        secret: typing.Optional[
            "JenkinsSpecMasterVolumesProjectedSourcesSecret"
        ] = None,
        service_account_token: typing.Optional[
            "JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken"
        ] = None,
    ) -> None:
        """Projection that may be projected along with other supported volume types.

        :param config_map: information about the configMap data to project.
        :param downward_api: information about the downwardAPI data to project.
        :param secret: information about the secret data to project.
        :param service_account_token: information about the serviceAccountToken data to project.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSources
        """
        if isinstance(config_map, dict):
            config_map = JenkinsSpecMasterVolumesProjectedSourcesConfigMap(**config_map)
        if isinstance(downward_api, dict):
            downward_api = JenkinsSpecMasterVolumesProjectedSourcesDownwardApi(
                **downward_api
            )
        if isinstance(secret, dict):
            secret = JenkinsSpecMasterVolumesProjectedSourcesSecret(**secret)
        if isinstance(service_account_token, dict):
            service_account_token = JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken(
                **service_account_token
            )
        self._values = {}
        if config_map is not None:
            self._values["config_map"] = config_map
        if downward_api is not None:
            self._values["downward_api"] = downward_api
        if secret is not None:
            self._values["secret"] = secret
        if service_account_token is not None:
            self._values["service_account_token"] = service_account_token

    @builtins.property
    def config_map(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesProjectedSourcesConfigMap"]:
        """information about the configMap data to project.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSources#configMap
        """
        return self._values.get("config_map")

    @builtins.property
    def downward_api(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesProjectedSourcesDownwardApi"]:
        """information about the downwardAPI data to project.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSources#downwardAPI
        """
        return self._values.get("downward_api")

    @builtins.property
    def secret(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesProjectedSourcesSecret"]:
        """information about the secret data to project.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSources#secret
        """
        return self._values.get("secret")

    @builtins.property
    def service_account_token(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken"]:
        """information about the serviceAccountToken data to project.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSources#serviceAccountToken
        """
        return self._values.get("service_account_token")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesProjectedSources(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjectedSourcesConfigMap",
    jsii_struct_bases=[],
    name_mapping={"items": "items", "name": "name", "optional": "optional"},
)
class JenkinsSpecMasterVolumesProjectedSourcesConfigMap:
    def __init__(
        self,
        *,
        items: typing.Optional[
            typing.List["JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems"]
        ] = None,
        name: typing.Optional[str] = None,
        optional: typing.Optional[bool] = None,
    ) -> None:
        """information about the configMap data to project.

        :param items: If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
        :param optional: Specify whether the ConfigMap or its keys must be defined.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesConfigMap
        """
        self._values = {}
        if items is not None:
            self._values["items"] = items
        if name is not None:
            self._values["name"] = name
        if optional is not None:
            self._values["optional"] = optional

    @builtins.property
    def items(
        self,
    ) -> typing.Optional[
        typing.List["JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems"]
    ]:
        """If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.

        If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesConfigMap#items
        """
        return self._values.get("items")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesConfigMap#name
        """
        return self._values.get("name")

    @builtins.property
    def optional(self) -> typing.Optional[bool]:
        """Specify whether the ConfigMap or its keys must be defined.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesConfigMap#optional
        """
        return self._values.get("optional")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesProjectedSourcesConfigMap(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "path": "path", "mode": "mode"},
)
class JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems:
    def __init__(
        self, *, key: str, path: str, mode: typing.Optional[jsii.Number] = None
    ) -> None:
        """Maps a string key to a path within a volume.

        :param key: The key to project.
        :param path: The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
        :param mode: Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems
        """
        self._values = {
            "key": key,
            "path": path,
        }
        if mode is not None:
            self._values["mode"] = mode

    @builtins.property
    def key(self) -> str:
        """The key to project.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems#key
        """
        return self._values.get("key")

    @builtins.property
    def path(self) -> str:
        """The relative path of the file to map the key to.

        May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems#path
        """
        return self._values.get("path")

    @builtins.property
    def mode(self) -> typing.Optional[jsii.Number]:
        """Optional: mode bits to use on this file, must be a value between 0 and 0777.

        If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems#mode
        """
        return self._values.get("mode")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi",
    jsii_struct_bases=[],
    name_mapping={"items": "items"},
)
class JenkinsSpecMasterVolumesProjectedSourcesDownwardApi:
    def __init__(
        self,
        *,
        items: typing.Optional[
            typing.List["JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems"]
        ] = None,
    ) -> None:
        """information about the downwardAPI data to project.

        :param items: Items is a list of DownwardAPIVolume file.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApi
        """
        self._values = {}
        if items is not None:
            self._values["items"] = items

    @builtins.property
    def items(
        self,
    ) -> typing.Optional[
        typing.List["JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems"]
    ]:
        """Items is a list of DownwardAPIVolume file.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApi#items
        """
        return self._values.get("items")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesProjectedSourcesDownwardApi(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems",
    jsii_struct_bases=[],
    name_mapping={
        "path": "path",
        "field_ref": "fieldRef",
        "mode": "mode",
        "resource_field_ref": "resourceFieldRef",
    },
)
class JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems:
    def __init__(
        self,
        *,
        path: str,
        field_ref: typing.Optional[
            "JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef"
        ] = None,
        mode: typing.Optional[jsii.Number] = None,
        resource_field_ref: typing.Optional[
            "JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef"
        ] = None,
    ) -> None:
        """DownwardAPIVolumeFile represents information to create the file containing the pod field.

        :param path: Required: Path is the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
        :param field_ref: Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
        :param mode: Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
        :param resource_field_ref: Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems
        """
        if isinstance(field_ref, dict):
            field_ref = JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef(
                **field_ref
            )
        if isinstance(resource_field_ref, dict):
            resource_field_ref = JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef(
                **resource_field_ref
            )
        self._values = {
            "path": path,
        }
        if field_ref is not None:
            self._values["field_ref"] = field_ref
        if mode is not None:
            self._values["mode"] = mode
        if resource_field_ref is not None:
            self._values["resource_field_ref"] = resource_field_ref

    @builtins.property
    def path(self) -> str:
        """Required: Path is  the relative path name of the file to be created.

        Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems#path
        """
        return self._values.get("path")

    @builtins.property
    def field_ref(
        self,
    ) -> typing.Optional[
        "JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef"
    ]:
        """Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems#fieldRef
        """
        return self._values.get("field_ref")

    @builtins.property
    def mode(self) -> typing.Optional[jsii.Number]:
        """Optional: mode bits to use on this file, must be a value between 0 and 0777.

        If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems#mode
        """
        return self._values.get("mode")

    @builtins.property
    def resource_field_ref(
        self,
    ) -> typing.Optional[
        "JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef"
    ]:
        """Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems#resourceFieldRef
        """
        return self._values.get("resource_field_ref")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef",
    jsii_struct_bases=[],
    name_mapping={"field_path": "fieldPath", "api_version": "apiVersion"},
)
class JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef:
    def __init__(
        self, *, field_path: str, api_version: typing.Optional[str] = None
    ) -> None:
        """Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.

        :param field_path: Path of the field to select in the specified API version.
        :param api_version: Version of the schema the FieldPath is written in terms of, defaults to "v1".

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef
        """
        self._values = {
            "field_path": field_path,
        }
        if api_version is not None:
            self._values["api_version"] = api_version

    @builtins.property
    def field_path(self) -> str:
        """Path of the field to select in the specified API version.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef#fieldPath
        """
        return self._values.get("field_path")

    @builtins.property
    def api_version(self) -> typing.Optional[str]:
        """Version of the schema the FieldPath is written in terms of, defaults to "v1".

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef#apiVersion
        """
        return self._values.get("api_version")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef",
    jsii_struct_bases=[],
    name_mapping={
        "resource": "resource",
        "container_name": "containerName",
        "divisor": "divisor",
    },
)
class JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef:
    def __init__(
        self,
        *,
        resource: str,
        container_name: typing.Optional[str] = None,
        divisor: typing.Optional[str] = None,
    ) -> None:
        """Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.

        :param resource: Required: resource to select.
        :param container_name: Container name: required for volumes, optional for env vars.
        :param divisor: Specifies the output format of the exposed resources, defaults to "1".

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef
        """
        self._values = {
            "resource": resource,
        }
        if container_name is not None:
            self._values["container_name"] = container_name
        if divisor is not None:
            self._values["divisor"] = divisor

    @builtins.property
    def resource(self) -> str:
        """Required: resource to select.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef#resource
        """
        return self._values.get("resource")

    @builtins.property
    def container_name(self) -> typing.Optional[str]:
        """Container name: required for volumes, optional for env vars.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef#containerName
        """
        return self._values.get("container_name")

    @builtins.property
    def divisor(self) -> typing.Optional[str]:
        """Specifies the output format of the exposed resources, defaults to "1".

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef#divisor
        """
        return self._values.get("divisor")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjectedSourcesSecret",
    jsii_struct_bases=[],
    name_mapping={"items": "items", "name": "name", "optional": "optional"},
)
class JenkinsSpecMasterVolumesProjectedSourcesSecret:
    def __init__(
        self,
        *,
        items: typing.Optional[
            typing.List["JenkinsSpecMasterVolumesProjectedSourcesSecretItems"]
        ] = None,
        name: typing.Optional[str] = None,
        optional: typing.Optional[bool] = None,
    ) -> None:
        """information about the secret data to project.

        :param items: If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
        :param optional: Specify whether the Secret or its key must be defined.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesSecret
        """
        self._values = {}
        if items is not None:
            self._values["items"] = items
        if name is not None:
            self._values["name"] = name
        if optional is not None:
            self._values["optional"] = optional

    @builtins.property
    def items(
        self,
    ) -> typing.Optional[
        typing.List["JenkinsSpecMasterVolumesProjectedSourcesSecretItems"]
    ]:
        """If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value.

        If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesSecret#items
        """
        return self._values.get("items")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesSecret#name
        """
        return self._values.get("name")

    @builtins.property
    def optional(self) -> typing.Optional[bool]:
        """Specify whether the Secret or its key must be defined.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesSecret#optional
        """
        return self._values.get("optional")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesProjectedSourcesSecret(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjectedSourcesSecretItems",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "path": "path", "mode": "mode"},
)
class JenkinsSpecMasterVolumesProjectedSourcesSecretItems:
    def __init__(
        self, *, key: str, path: str, mode: typing.Optional[jsii.Number] = None
    ) -> None:
        """Maps a string key to a path within a volume.

        :param key: The key to project.
        :param path: The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
        :param mode: Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesSecretItems
        """
        self._values = {
            "key": key,
            "path": path,
        }
        if mode is not None:
            self._values["mode"] = mode

    @builtins.property
    def key(self) -> str:
        """The key to project.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesSecretItems#key
        """
        return self._values.get("key")

    @builtins.property
    def path(self) -> str:
        """The relative path of the file to map the key to.

        May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesSecretItems#path
        """
        return self._values.get("path")

    @builtins.property
    def mode(self) -> typing.Optional[jsii.Number]:
        """Optional: mode bits to use on this file, must be a value between 0 and 0777.

        If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesSecretItems#mode
        """
        return self._values.get("mode")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesProjectedSourcesSecretItems(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken",
    jsii_struct_bases=[],
    name_mapping={
        "path": "path",
        "audience": "audience",
        "expiration_seconds": "expirationSeconds",
    },
)
class JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken:
    def __init__(
        self,
        *,
        path: str,
        audience: typing.Optional[str] = None,
        expiration_seconds: typing.Optional[jsii.Number] = None,
    ) -> None:
        """information about the serviceAccountToken data to project.

        :param path: Path is the path relative to the mount point of the file to project the token into.
        :param audience: Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
        :param expiration_seconds: ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes. Default: 1 hour and must be at least 10 minutes.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken
        """
        self._values = {
            "path": path,
        }
        if audience is not None:
            self._values["audience"] = audience
        if expiration_seconds is not None:
            self._values["expiration_seconds"] = expiration_seconds

    @builtins.property
    def path(self) -> str:
        """Path is the path relative to the mount point of the file to project the token into.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken#path
        """
        return self._values.get("path")

    @builtins.property
    def audience(self) -> typing.Optional[str]:
        """Audience is the intended audience of the token.

        A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken#audience
        """
        return self._values.get("audience")

    @builtins.property
    def expiration_seconds(self) -> typing.Optional[jsii.Number]:
        """ExpirationSeconds is the requested duration of validity of the service account token.

        As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.

        default
        :default: 1 hour and must be at least 10 minutes.

        schema:
        :schema:: JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken#expirationSeconds
        """
        return self._values.get("expiration_seconds")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesQuobyte",
    jsii_struct_bases=[],
    name_mapping={
        "registry": "registry",
        "volume": "volume",
        "group": "group",
        "read_only": "readOnly",
        "tenant": "tenant",
        "user": "user",
    },
)
class JenkinsSpecMasterVolumesQuobyte:
    def __init__(
        self,
        *,
        registry: str,
        volume: str,
        group: typing.Optional[str] = None,
        read_only: typing.Optional[bool] = None,
        tenant: typing.Optional[str] = None,
        user: typing.Optional[str] = None,
    ) -> None:
        """Quobyte represents a Quobyte mount on the host that shares a pod's lifetime.

        :param registry: Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes.
        :param volume: Volume is a string that references an already created Quobyte volume by name.
        :param group: Group to map volume access to Default is no group. Default: no group
        :param read_only: ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false. Default: false.
        :param tenant: Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin.
        :param user: User to map volume access to Defaults to serivceaccount user. Default: serivceaccount user

        schema:
        :schema:: JenkinsSpecMasterVolumesQuobyte
        """
        self._values = {
            "registry": registry,
            "volume": volume,
        }
        if group is not None:
            self._values["group"] = group
        if read_only is not None:
            self._values["read_only"] = read_only
        if tenant is not None:
            self._values["tenant"] = tenant
        if user is not None:
            self._values["user"] = user

    @builtins.property
    def registry(self) -> str:
        """Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes.

        schema:
        :schema:: JenkinsSpecMasterVolumesQuobyte#registry
        """
        return self._values.get("registry")

    @builtins.property
    def volume(self) -> str:
        """Volume is a string that references an already created Quobyte volume by name.

        schema:
        :schema:: JenkinsSpecMasterVolumesQuobyte#volume
        """
        return self._values.get("volume")

    @builtins.property
    def group(self) -> typing.Optional[str]:
        """Group to map volume access to Default is no group.

        default
        :default: no group

        schema:
        :schema:: JenkinsSpecMasterVolumesQuobyte#group
        """
        return self._values.get("group")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """ReadOnly here will force the Quobyte volume to be mounted with read-only permissions.

        Defaults to false.

        default
        :default: false.

        schema:
        :schema:: JenkinsSpecMasterVolumesQuobyte#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def tenant(self) -> typing.Optional[str]:
        """Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin.

        schema:
        :schema:: JenkinsSpecMasterVolumesQuobyte#tenant
        """
        return self._values.get("tenant")

    @builtins.property
    def user(self) -> typing.Optional[str]:
        """User to map volume access to Defaults to serivceaccount user.

        default
        :default: serivceaccount user

        schema:
        :schema:: JenkinsSpecMasterVolumesQuobyte#user
        """
        return self._values.get("user")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesQuobyte(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesRbd",
    jsii_struct_bases=[],
    name_mapping={
        "image": "image",
        "monitors": "monitors",
        "fs_type": "fsType",
        "keyring": "keyring",
        "pool": "pool",
        "read_only": "readOnly",
        "secret_ref": "secretRef",
        "user": "user",
    },
)
class JenkinsSpecMasterVolumesRbd:
    def __init__(
        self,
        *,
        image: str,
        monitors: typing.List[str],
        fs_type: typing.Optional[str] = None,
        keyring: typing.Optional[str] = None,
        pool: typing.Optional[str] = None,
        read_only: typing.Optional[bool] = None,
        secret_ref: typing.Optional["JenkinsSpecMasterVolumesRbdSecretRef"] = None,
        user: typing.Optional[str] = None,
    ) -> None:
        """RBD represents a Rados Block Device mount on the host that shares a pod's lifetime.

        More info: https://examples.k8s.io/volumes/rbd/README.md

        :param image: The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
        :param monitors: A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
        :param fs_type: Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd TODO: how do we prevent errors in the filesystem from compromising the machine
        :param keyring: Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it Default: etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
        :param pool: The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it Default: rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
        :param read_only: ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it Default: false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
        :param secret_ref: SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it Default: nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
        :param user: The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it Default: admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesRbd
        """
        if isinstance(secret_ref, dict):
            secret_ref = JenkinsSpecMasterVolumesRbdSecretRef(**secret_ref)
        self._values = {
            "image": image,
            "monitors": monitors,
        }
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if keyring is not None:
            self._values["keyring"] = keyring
        if pool is not None:
            self._values["pool"] = pool
        if read_only is not None:
            self._values["read_only"] = read_only
        if secret_ref is not None:
            self._values["secret_ref"] = secret_ref
        if user is not None:
            self._values["user"] = user

    @builtins.property
    def image(self) -> str:
        """The rados image name.

        More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesRbd#image
        """
        return self._values.get("image")

    @builtins.property
    def monitors(self) -> typing.List[str]:
        """A collection of Ceph monitors.

        More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesRbd#monitors
        """
        return self._values.get("monitors")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type of the volume that you want to mount.

        Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd TODO: how do we prevent errors in the filesystem from compromising the machine

        schema:
        :schema:: JenkinsSpecMasterVolumesRbd#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def keyring(self) -> typing.Optional[str]:
        """Keyring is the path to key ring for RBDUser.

        Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        default
        :default: etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesRbd#keyring
        """
        return self._values.get("keyring")

    @builtins.property
    def pool(self) -> typing.Optional[str]:
        """The rados pool name.

        Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        default
        :default: rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesRbd#pool
        """
        return self._values.get("pool")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """ReadOnly here will force the ReadOnly setting in VolumeMounts.

        Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        default
        :default: false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesRbd#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def secret_ref(self) -> typing.Optional["JenkinsSpecMasterVolumesRbdSecretRef"]:
        """SecretRef is name of the authentication secret for RBDUser.

        If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        default
        :default: nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesRbd#secretRef
        """
        return self._values.get("secret_ref")

    @builtins.property
    def user(self) -> typing.Optional[str]:
        """The rados user name.

        Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        default
        :default: admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesRbd#user
        """
        return self._values.get("user")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesRbd(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesRbdSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecMasterVolumesRbdSecretRef:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """SecretRef is name of the authentication secret for RBDUser.

        If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        default
        :default: nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it

        schema:
        :schema:: JenkinsSpecMasterVolumesRbdSecretRef
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesRbdSecretRef#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesRbdSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesScaleIo",
    jsii_struct_bases=[],
    name_mapping={
        "gateway": "gateway",
        "secret_ref": "secretRef",
        "system": "system",
        "fs_type": "fsType",
        "protection_domain": "protectionDomain",
        "read_only": "readOnly",
        "ssl_enabled": "sslEnabled",
        "storage_mode": "storageMode",
        "storage_pool": "storagePool",
        "volume_name": "volumeName",
    },
)
class JenkinsSpecMasterVolumesScaleIo:
    def __init__(
        self,
        *,
        gateway: str,
        secret_ref: "JenkinsSpecMasterVolumesScaleIoSecretRef",
        system: str,
        fs_type: typing.Optional[str] = None,
        protection_domain: typing.Optional[str] = None,
        read_only: typing.Optional[bool] = None,
        ssl_enabled: typing.Optional[bool] = None,
        storage_mode: typing.Optional[str] = None,
        storage_pool: typing.Optional[str] = None,
        volume_name: typing.Optional[str] = None,
    ) -> None:
        """ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.

        :param gateway: The host address of the ScaleIO API Gateway.
        :param secret_ref: SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
        :param system: The name of the storage system as configured in ScaleIO.
        :param fs_type: Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs". Default: xfs".
        :param protection_domain: The name of the ScaleIO Protection Domain for the configured storage.
        :param read_only: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
        :param ssl_enabled: Flag to enable/disable SSL communication with Gateway, default false.
        :param storage_mode: Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned. Default: ThinProvisioned.
        :param storage_pool: The ScaleIO Storage Pool associated with the protection domain.
        :param volume_name: The name of a volume already created in the ScaleIO system that is associated with this volume source.

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo
        """
        if isinstance(secret_ref, dict):
            secret_ref = JenkinsSpecMasterVolumesScaleIoSecretRef(**secret_ref)
        self._values = {
            "gateway": gateway,
            "secret_ref": secret_ref,
            "system": system,
        }
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if protection_domain is not None:
            self._values["protection_domain"] = protection_domain
        if read_only is not None:
            self._values["read_only"] = read_only
        if ssl_enabled is not None:
            self._values["ssl_enabled"] = ssl_enabled
        if storage_mode is not None:
            self._values["storage_mode"] = storage_mode
        if storage_pool is not None:
            self._values["storage_pool"] = storage_pool
        if volume_name is not None:
            self._values["volume_name"] = volume_name

    @builtins.property
    def gateway(self) -> str:
        """The host address of the ScaleIO API Gateway.

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo#gateway
        """
        return self._values.get("gateway")

    @builtins.property
    def secret_ref(self) -> "JenkinsSpecMasterVolumesScaleIoSecretRef":
        """SecretRef references to the secret for ScaleIO user and other sensitive information.

        If this is not provided, Login operation will fail.

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo#secretRef
        """
        return self._values.get("secret_ref")

    @builtins.property
    def system(self) -> str:
        """The name of the storage system as configured in ScaleIO.

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo#system
        """
        return self._values.get("system")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type to mount.

        Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".

        default
        :default: xfs".

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def protection_domain(self) -> typing.Optional[str]:
        """The name of the ScaleIO Protection Domain for the configured storage.

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo#protectionDomain
        """
        return self._values.get("protection_domain")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Defaults to false (read/write).

        ReadOnly here will force the ReadOnly setting in VolumeMounts.

        default
        :default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def ssl_enabled(self) -> typing.Optional[bool]:
        """Flag to enable/disable SSL communication with Gateway, default false.

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo#sslEnabled
        """
        return self._values.get("ssl_enabled")

    @builtins.property
    def storage_mode(self) -> typing.Optional[str]:
        """Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.

        Default is ThinProvisioned.

        default
        :default: ThinProvisioned.

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo#storageMode
        """
        return self._values.get("storage_mode")

    @builtins.property
    def storage_pool(self) -> typing.Optional[str]:
        """The ScaleIO Storage Pool associated with the protection domain.

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo#storagePool
        """
        return self._values.get("storage_pool")

    @builtins.property
    def volume_name(self) -> typing.Optional[str]:
        """The name of a volume already created in the ScaleIO system that is associated with this volume source.

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIo#volumeName
        """
        return self._values.get("volume_name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesScaleIo(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesScaleIoSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecMasterVolumesScaleIoSecretRef:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """SecretRef references to the secret for ScaleIO user and other sensitive information.

        If this is not provided, Login operation will fail.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIoSecretRef
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesScaleIoSecretRef#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesScaleIoSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesSecret",
    jsii_struct_bases=[],
    name_mapping={
        "default_mode": "defaultMode",
        "items": "items",
        "optional": "optional",
        "secret_name": "secretName",
    },
)
class JenkinsSpecMasterVolumesSecret:
    def __init__(
        self,
        *,
        default_mode: typing.Optional[jsii.Number] = None,
        items: typing.Optional[
            typing.List["JenkinsSpecMasterVolumesSecretItems"]
        ] = None,
        optional: typing.Optional[bool] = None,
        secret_name: typing.Optional[str] = None,
    ) -> None:
        """Secret represents a secret that should populate this volume.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#secret

        :param default_mode: Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set. Default: 644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
        :param items: If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
        :param optional: Specify whether the Secret or its keys must be defined.
        :param secret_name: Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret

        schema:
        :schema:: JenkinsSpecMasterVolumesSecret
        """
        self._values = {}
        if default_mode is not None:
            self._values["default_mode"] = default_mode
        if items is not None:
            self._values["items"] = items
        if optional is not None:
            self._values["optional"] = optional
        if secret_name is not None:
            self._values["secret_name"] = secret_name

    @builtins.property
    def default_mode(self) -> typing.Optional[jsii.Number]:
        """Optional: mode bits to use on created files by default.

        Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        default
        :default: 644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesSecret#defaultMode
        """
        return self._values.get("default_mode")

    @builtins.property
    def items(
        self,
    ) -> typing.Optional[typing.List["JenkinsSpecMasterVolumesSecretItems"]]:
        """If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value.

        If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.

        schema:
        :schema:: JenkinsSpecMasterVolumesSecret#items
        """
        return self._values.get("items")

    @builtins.property
    def optional(self) -> typing.Optional[bool]:
        """Specify whether the Secret or its keys must be defined.

        schema:
        :schema:: JenkinsSpecMasterVolumesSecret#optional
        """
        return self._values.get("optional")

    @builtins.property
    def secret_name(self) -> typing.Optional[str]:
        """Name of the secret in the pod's namespace to use.

        More info: https://kubernetes.io/docs/concepts/storage/volumes#secret

        schema:
        :schema:: JenkinsSpecMasterVolumesSecret#secretName
        """
        return self._values.get("secret_name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesSecret(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesSecretItems",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "path": "path", "mode": "mode"},
)
class JenkinsSpecMasterVolumesSecretItems:
    def __init__(
        self, *, key: str, path: str, mode: typing.Optional[jsii.Number] = None
    ) -> None:
        """Maps a string key to a path within a volume.

        :param key: The key to project.
        :param path: The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
        :param mode: Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesSecretItems
        """
        self._values = {
            "key": key,
            "path": path,
        }
        if mode is not None:
            self._values["mode"] = mode

    @builtins.property
    def key(self) -> str:
        """The key to project.

        schema:
        :schema:: JenkinsSpecMasterVolumesSecretItems#key
        """
        return self._values.get("key")

    @builtins.property
    def path(self) -> str:
        """The relative path of the file to map the key to.

        May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.

        schema:
        :schema:: JenkinsSpecMasterVolumesSecretItems#path
        """
        return self._values.get("path")

    @builtins.property
    def mode(self) -> typing.Optional[jsii.Number]:
        """Optional: mode bits to use on this file, must be a value between 0 and 0777.

        If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.

        schema:
        :schema:: JenkinsSpecMasterVolumesSecretItems#mode
        """
        return self._values.get("mode")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesSecretItems(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesStorageos",
    jsii_struct_bases=[],
    name_mapping={
        "fs_type": "fsType",
        "read_only": "readOnly",
        "secret_ref": "secretRef",
        "volume_name": "volumeName",
        "volume_namespace": "volumeNamespace",
    },
)
class JenkinsSpecMasterVolumesStorageos:
    def __init__(
        self,
        *,
        fs_type: typing.Optional[str] = None,
        read_only: typing.Optional[bool] = None,
        secret_ref: typing.Optional[
            "JenkinsSpecMasterVolumesStorageosSecretRef"
        ] = None,
        volume_name: typing.Optional[str] = None,
        volume_namespace: typing.Optional[str] = None,
    ) -> None:
        """StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.

        :param fs_type: Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
        :param read_only: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
        :param secret_ref: SecretRef specifies the secret to use for obtaining the StorageOS API credentials. If not specified, default values will be attempted.
        :param volume_name: VolumeName is the human-readable name of the StorageOS volume. Volume names are only unique within a namespace.
        :param volume_namespace: VolumeNamespace specifies the scope of the volume within StorageOS. If no namespace is specified then the Pod's namespace will be used. This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.

        schema:
        :schema:: JenkinsSpecMasterVolumesStorageos
        """
        if isinstance(secret_ref, dict):
            secret_ref = JenkinsSpecMasterVolumesStorageosSecretRef(**secret_ref)
        self._values = {}
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if read_only is not None:
            self._values["read_only"] = read_only
        if secret_ref is not None:
            self._values["secret_ref"] = secret_ref
        if volume_name is not None:
            self._values["volume_name"] = volume_name
        if volume_namespace is not None:
            self._values["volume_namespace"] = volume_namespace

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type to mount.

        Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.

        schema:
        :schema:: JenkinsSpecMasterVolumesStorageos#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def read_only(self) -> typing.Optional[bool]:
        """Defaults to false (read/write).

        ReadOnly here will force the ReadOnly setting in VolumeMounts.

        default
        :default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.

        schema:
        :schema:: JenkinsSpecMasterVolumesStorageos#readOnly
        """
        return self._values.get("read_only")

    @builtins.property
    def secret_ref(
        self,
    ) -> typing.Optional["JenkinsSpecMasterVolumesStorageosSecretRef"]:
        """SecretRef specifies the secret to use for obtaining the StorageOS API credentials.

        If not specified, default values will be attempted.

        schema:
        :schema:: JenkinsSpecMasterVolumesStorageos#secretRef
        """
        return self._values.get("secret_ref")

    @builtins.property
    def volume_name(self) -> typing.Optional[str]:
        """VolumeName is the human-readable name of the StorageOS volume.

        Volume names are only unique within a namespace.

        schema:
        :schema:: JenkinsSpecMasterVolumesStorageos#volumeName
        """
        return self._values.get("volume_name")

    @builtins.property
    def volume_namespace(self) -> typing.Optional[str]:
        """VolumeNamespace specifies the scope of the volume within StorageOS.

        If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.

        schema:
        :schema:: JenkinsSpecMasterVolumesStorageos#volumeNamespace
        """
        return self._values.get("volume_namespace")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesStorageos(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesStorageosSecretRef",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecMasterVolumesStorageosSecretRef:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """SecretRef specifies the secret to use for obtaining the StorageOS API credentials.

        If not specified, default values will be attempted.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesStorageosSecretRef
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecMasterVolumesStorageosSecretRef#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesStorageosSecretRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecMasterVolumesVsphereVolume",
    jsii_struct_bases=[],
    name_mapping={
        "volume_path": "volumePath",
        "fs_type": "fsType",
        "storage_policy_id": "storagePolicyID",
        "storage_policy_name": "storagePolicyName",
    },
)
class JenkinsSpecMasterVolumesVsphereVolume:
    def __init__(
        self,
        *,
        volume_path: str,
        fs_type: typing.Optional[str] = None,
        storage_policy_id: typing.Optional[str] = None,
        storage_policy_name: typing.Optional[str] = None,
    ) -> None:
        """VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.

        :param volume_path: Path that identifies vSphere volume vmdk.
        :param fs_type: Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
        :param storage_policy_id: Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
        :param storage_policy_name: Storage Policy Based Management (SPBM) profile name.

        schema:
        :schema:: JenkinsSpecMasterVolumesVsphereVolume
        """
        self._values = {
            "volume_path": volume_path,
        }
        if fs_type is not None:
            self._values["fs_type"] = fs_type
        if storage_policy_id is not None:
            self._values["storage_policy_id"] = storage_policy_id
        if storage_policy_name is not None:
            self._values["storage_policy_name"] = storage_policy_name

    @builtins.property
    def volume_path(self) -> str:
        """Path that identifies vSphere volume vmdk.

        schema:
        :schema:: JenkinsSpecMasterVolumesVsphereVolume#volumePath
        """
        return self._values.get("volume_path")

    @builtins.property
    def fs_type(self) -> typing.Optional[str]:
        """Filesystem type to mount.

        Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.

        schema:
        :schema:: JenkinsSpecMasterVolumesVsphereVolume#fsType
        """
        return self._values.get("fs_type")

    @builtins.property
    def storage_policy_id(self) -> typing.Optional[str]:
        """Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.

        schema:
        :schema:: JenkinsSpecMasterVolumesVsphereVolume#storagePolicyID
        """
        return self._values.get("storage_policy_id")

    @builtins.property
    def storage_policy_name(self) -> typing.Optional[str]:
        """Storage Policy Based Management (SPBM) profile name.

        schema:
        :schema:: JenkinsSpecMasterVolumesVsphereVolume#storagePolicyName
        """
        return self._values.get("storage_policy_name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecMasterVolumesVsphereVolume(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotifications",
    jsii_struct_bases=[],
    name_mapping={
        "level": "level",
        "name": "name",
        "verbose": "verbose",
        "mailgun": "mailgun",
        "slack": "slack",
        "smtp": "smtp",
        "teams": "teams",
    },
)
class JenkinsSpecNotifications:
    def __init__(
        self,
        *,
        level: str,
        name: str,
        verbose: bool,
        mailgun: typing.Optional["JenkinsSpecNotificationsMailgun"] = None,
        slack: typing.Optional["JenkinsSpecNotificationsSlack"] = None,
        smtp: typing.Optional["JenkinsSpecNotificationsSmtp"] = None,
        teams: typing.Optional["JenkinsSpecNotificationsTeams"] = None,
    ) -> None:
        """Notification is a service configuration used to send notifications about Jenkins status.

        :param level: NotificationLevel defines the level of a Notification.
        :param name: 
        :param verbose: 
        :param mailgun: Mailgun is handler for Mailgun email service notification channel.
        :param slack: Slack is handler for Slack notification channel.
        :param smtp: SMTP is handler for sending emails via this protocol.
        :param teams: MicrosoftTeams is handler for Microsoft MicrosoftTeams notification channel.

        schema:
        :schema:: JenkinsSpecNotifications
        """
        if isinstance(mailgun, dict):
            mailgun = JenkinsSpecNotificationsMailgun(**mailgun)
        if isinstance(slack, dict):
            slack = JenkinsSpecNotificationsSlack(**slack)
        if isinstance(smtp, dict):
            smtp = JenkinsSpecNotificationsSmtp(**smtp)
        if isinstance(teams, dict):
            teams = JenkinsSpecNotificationsTeams(**teams)
        self._values = {
            "level": level,
            "name": name,
            "verbose": verbose,
        }
        if mailgun is not None:
            self._values["mailgun"] = mailgun
        if slack is not None:
            self._values["slack"] = slack
        if smtp is not None:
            self._values["smtp"] = smtp
        if teams is not None:
            self._values["teams"] = teams

    @builtins.property
    def level(self) -> str:
        """NotificationLevel defines the level of a Notification.

        schema:
        :schema:: JenkinsSpecNotifications#level
        """
        return self._values.get("level")

    @builtins.property
    def name(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecNotifications#name
        """
        return self._values.get("name")

    @builtins.property
    def verbose(self) -> bool:
        """
        schema:
        :schema:: JenkinsSpecNotifications#verbose
        """
        return self._values.get("verbose")

    @builtins.property
    def mailgun(self) -> typing.Optional["JenkinsSpecNotificationsMailgun"]:
        """Mailgun is handler for Mailgun email service notification channel.

        schema:
        :schema:: JenkinsSpecNotifications#mailgun
        """
        return self._values.get("mailgun")

    @builtins.property
    def slack(self) -> typing.Optional["JenkinsSpecNotificationsSlack"]:
        """Slack is handler for Slack notification channel.

        schema:
        :schema:: JenkinsSpecNotifications#slack
        """
        return self._values.get("slack")

    @builtins.property
    def smtp(self) -> typing.Optional["JenkinsSpecNotificationsSmtp"]:
        """SMTP is handler for sending emails via this protocol.

        schema:
        :schema:: JenkinsSpecNotifications#smtp
        """
        return self._values.get("smtp")

    @builtins.property
    def teams(self) -> typing.Optional["JenkinsSpecNotificationsTeams"]:
        """MicrosoftTeams is handler for Microsoft MicrosoftTeams notification channel.

        schema:
        :schema:: JenkinsSpecNotifications#teams
        """
        return self._values.get("teams")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecNotifications(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsMailgun",
    jsii_struct_bases=[],
    name_mapping={
        "api_key_secret_key_selector": "apiKeySecretKeySelector",
        "domain": "domain",
        "from_": "from",
        "recipient": "recipient",
    },
)
class JenkinsSpecNotificationsMailgun:
    def __init__(
        self,
        *,
        api_key_secret_key_selector: "JenkinsSpecNotificationsMailgunApiKeySecretKeySelector",
        domain: str,
        from_: str,
        recipient: str,
    ) -> None:
        """Mailgun is handler for Mailgun email service notification channel.

        :param api_key_secret_key_selector: SecretKeySelector selects a key of a Secret.
        :param domain: 
        :param from_: 
        :param recipient: 

        schema:
        :schema:: JenkinsSpecNotificationsMailgun
        """
        if isinstance(api_key_secret_key_selector, dict):
            api_key_secret_key_selector = JenkinsSpecNotificationsMailgunApiKeySecretKeySelector(
                **api_key_secret_key_selector
            )
        self._values = {
            "api_key_secret_key_selector": api_key_secret_key_selector,
            "domain": domain,
            "from_": from_,
            "recipient": recipient,
        }

    @builtins.property
    def api_key_secret_key_selector(
        self,
    ) -> "JenkinsSpecNotificationsMailgunApiKeySecretKeySelector":
        """SecretKeySelector selects a key of a Secret.

        schema:
        :schema:: JenkinsSpecNotificationsMailgun#apiKeySecretKeySelector
        """
        return self._values.get("api_key_secret_key_selector")

    @builtins.property
    def domain(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecNotificationsMailgun#domain
        """
        return self._values.get("domain")

    @builtins.property
    def from_(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecNotificationsMailgun#from
        """
        return self._values.get("from_")

    @builtins.property
    def recipient(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecNotificationsMailgun#recipient
        """
        return self._values.get("recipient")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecNotificationsMailgun(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsMailgunApiKeySecretKeySelector",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "secret": "secret"},
)
class JenkinsSpecNotificationsMailgunApiKeySecretKeySelector:
    def __init__(
        self,
        *,
        key: str,
        secret: "JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret",
    ) -> None:
        """SecretKeySelector selects a key of a Secret.

        :param key: The key of the secret to select from. Must be a valid secret key.
        :param secret: The name of the secret in the pod's namespace to select from.

        schema:
        :schema:: JenkinsSpecNotificationsMailgunApiKeySecretKeySelector
        """
        if isinstance(secret, dict):
            secret = JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret(
                **secret
            )
        self._values = {
            "key": key,
            "secret": secret,
        }

    @builtins.property
    def key(self) -> str:
        """The key of the secret to select from.

        Must be a valid secret key.

        schema:
        :schema:: JenkinsSpecNotificationsMailgunApiKeySecretKeySelector#key
        """
        return self._values.get("key")

    @builtins.property
    def secret(self) -> "JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret":
        """The name of the secret in the pod's namespace to select from.

        schema:
        :schema:: JenkinsSpecNotificationsMailgunApiKeySecretKeySelector#secret
        """
        return self._values.get("secret")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecNotificationsMailgunApiKeySecretKeySelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """The name of the secret in the pod's namespace to select from.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsSlack",
    jsii_struct_bases=[],
    name_mapping={"web_hook_url_secret_key_selector": "webHookURLSecretKeySelector"},
)
class JenkinsSpecNotificationsSlack:
    def __init__(
        self,
        *,
        web_hook_url_secret_key_selector: "JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector",
    ) -> None:
        """Slack is handler for Slack notification channel.

        :param web_hook_url_secret_key_selector: The web hook URL to Slack App.

        schema:
        :schema:: JenkinsSpecNotificationsSlack
        """
        if isinstance(web_hook_url_secret_key_selector, dict):
            web_hook_url_secret_key_selector = JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector(
                **web_hook_url_secret_key_selector
            )
        self._values = {
            "web_hook_url_secret_key_selector": web_hook_url_secret_key_selector,
        }

    @builtins.property
    def web_hook_url_secret_key_selector(
        self,
    ) -> "JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector":
        """The web hook URL to Slack App.

        schema:
        :schema:: JenkinsSpecNotificationsSlack#webHookURLSecretKeySelector
        """
        return self._values.get("web_hook_url_secret_key_selector")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecNotificationsSlack(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "secret": "secret"},
)
class JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector:
    def __init__(
        self,
        *,
        key: str,
        secret: "JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret",
    ) -> None:
        """The web hook URL to Slack App.

        :param key: The key of the secret to select from. Must be a valid secret key.
        :param secret: The name of the secret in the pod's namespace to select from.

        schema:
        :schema:: JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector
        """
        if isinstance(secret, dict):
            secret = JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret(
                **secret
            )
        self._values = {
            "key": key,
            "secret": secret,
        }

    @builtins.property
    def key(self) -> str:
        """The key of the secret to select from.

        Must be a valid secret key.

        schema:
        :schema:: JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector#key
        """
        return self._values.get("key")

    @builtins.property
    def secret(
        self,
    ) -> "JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret":
        """The name of the secret in the pod's namespace to select from.

        schema:
        :schema:: JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector#secret
        """
        return self._values.get("secret")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """The name of the secret in the pod's namespace to select from.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsSmtp",
    jsii_struct_bases=[],
    name_mapping={
        "from_": "from",
        "password_secret_key_selector": "passwordSecretKeySelector",
        "port": "port",
        "server": "server",
        "to": "to",
        "username_secret_key_selector": "usernameSecretKeySelector",
        "tls_insecure_skip_verify": "tlsInsecureSkipVerify",
    },
)
class JenkinsSpecNotificationsSmtp:
    def __init__(
        self,
        *,
        from_: str,
        password_secret_key_selector: "JenkinsSpecNotificationsSmtpPasswordSecretKeySelector",
        port: jsii.Number,
        server: str,
        to: str,
        username_secret_key_selector: "JenkinsSpecNotificationsSmtpUsernameSecretKeySelector",
        tls_insecure_skip_verify: typing.Optional[bool] = None,
    ) -> None:
        """SMTP is handler for sending emails via this protocol.

        :param from_: 
        :param password_secret_key_selector: SecretKeySelector selects a key of a Secret.
        :param port: 
        :param server: 
        :param to: 
        :param username_secret_key_selector: SecretKeySelector selects a key of a Secret.
        :param tls_insecure_skip_verify: 

        schema:
        :schema:: JenkinsSpecNotificationsSmtp
        """
        if isinstance(password_secret_key_selector, dict):
            password_secret_key_selector = JenkinsSpecNotificationsSmtpPasswordSecretKeySelector(
                **password_secret_key_selector
            )
        if isinstance(username_secret_key_selector, dict):
            username_secret_key_selector = JenkinsSpecNotificationsSmtpUsernameSecretKeySelector(
                **username_secret_key_selector
            )
        self._values = {
            "from_": from_,
            "password_secret_key_selector": password_secret_key_selector,
            "port": port,
            "server": server,
            "to": to,
            "username_secret_key_selector": username_secret_key_selector,
        }
        if tls_insecure_skip_verify is not None:
            self._values["tls_insecure_skip_verify"] = tls_insecure_skip_verify

    @builtins.property
    def from_(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecNotificationsSmtp#from
        """
        return self._values.get("from_")

    @builtins.property
    def password_secret_key_selector(
        self,
    ) -> "JenkinsSpecNotificationsSmtpPasswordSecretKeySelector":
        """SecretKeySelector selects a key of a Secret.

        schema:
        :schema:: JenkinsSpecNotificationsSmtp#passwordSecretKeySelector
        """
        return self._values.get("password_secret_key_selector")

    @builtins.property
    def port(self) -> jsii.Number:
        """
        schema:
        :schema:: JenkinsSpecNotificationsSmtp#port
        """
        return self._values.get("port")

    @builtins.property
    def server(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecNotificationsSmtp#server
        """
        return self._values.get("server")

    @builtins.property
    def to(self) -> str:
        """
        schema:
        :schema:: JenkinsSpecNotificationsSmtp#to
        """
        return self._values.get("to")

    @builtins.property
    def username_secret_key_selector(
        self,
    ) -> "JenkinsSpecNotificationsSmtpUsernameSecretKeySelector":
        """SecretKeySelector selects a key of a Secret.

        schema:
        :schema:: JenkinsSpecNotificationsSmtp#usernameSecretKeySelector
        """
        return self._values.get("username_secret_key_selector")

    @builtins.property
    def tls_insecure_skip_verify(self) -> typing.Optional[bool]:
        """
        schema:
        :schema:: JenkinsSpecNotificationsSmtp#tlsInsecureSkipVerify
        """
        return self._values.get("tls_insecure_skip_verify")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecNotificationsSmtp(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsSmtpPasswordSecretKeySelector",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "secret": "secret"},
)
class JenkinsSpecNotificationsSmtpPasswordSecretKeySelector:
    def __init__(
        self,
        *,
        key: str,
        secret: "JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret",
    ) -> None:
        """SecretKeySelector selects a key of a Secret.

        :param key: The key of the secret to select from. Must be a valid secret key.
        :param secret: The name of the secret in the pod's namespace to select from.

        schema:
        :schema:: JenkinsSpecNotificationsSmtpPasswordSecretKeySelector
        """
        if isinstance(secret, dict):
            secret = JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret(
                **secret
            )
        self._values = {
            "key": key,
            "secret": secret,
        }

    @builtins.property
    def key(self) -> str:
        """The key of the secret to select from.

        Must be a valid secret key.

        schema:
        :schema:: JenkinsSpecNotificationsSmtpPasswordSecretKeySelector#key
        """
        return self._values.get("key")

    @builtins.property
    def secret(self) -> "JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret":
        """The name of the secret in the pod's namespace to select from.

        schema:
        :schema:: JenkinsSpecNotificationsSmtpPasswordSecretKeySelector#secret
        """
        return self._values.get("secret")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecNotificationsSmtpPasswordSecretKeySelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """The name of the secret in the pod's namespace to select from.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsSmtpUsernameSecretKeySelector",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "secret": "secret"},
)
class JenkinsSpecNotificationsSmtpUsernameSecretKeySelector:
    def __init__(
        self,
        *,
        key: str,
        secret: "JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret",
    ) -> None:
        """SecretKeySelector selects a key of a Secret.

        :param key: The key of the secret to select from. Must be a valid secret key.
        :param secret: The name of the secret in the pod's namespace to select from.

        schema:
        :schema:: JenkinsSpecNotificationsSmtpUsernameSecretKeySelector
        """
        if isinstance(secret, dict):
            secret = JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret(
                **secret
            )
        self._values = {
            "key": key,
            "secret": secret,
        }

    @builtins.property
    def key(self) -> str:
        """The key of the secret to select from.

        Must be a valid secret key.

        schema:
        :schema:: JenkinsSpecNotificationsSmtpUsernameSecretKeySelector#key
        """
        return self._values.get("key")

    @builtins.property
    def secret(self) -> "JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret":
        """The name of the secret in the pod's namespace to select from.

        schema:
        :schema:: JenkinsSpecNotificationsSmtpUsernameSecretKeySelector#secret
        """
        return self._values.get("secret")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecNotificationsSmtpUsernameSecretKeySelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """The name of the secret in the pod's namespace to select from.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsTeams",
    jsii_struct_bases=[],
    name_mapping={"web_hook_url_secret_key_selector": "webHookURLSecretKeySelector"},
)
class JenkinsSpecNotificationsTeams:
    def __init__(
        self,
        *,
        web_hook_url_secret_key_selector: "JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector",
    ) -> None:
        """MicrosoftTeams is handler for Microsoft MicrosoftTeams notification channel.

        :param web_hook_url_secret_key_selector: The web hook URL to MicrosoftTeams App.

        schema:
        :schema:: JenkinsSpecNotificationsTeams
        """
        if isinstance(web_hook_url_secret_key_selector, dict):
            web_hook_url_secret_key_selector = JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector(
                **web_hook_url_secret_key_selector
            )
        self._values = {
            "web_hook_url_secret_key_selector": web_hook_url_secret_key_selector,
        }

    @builtins.property
    def web_hook_url_secret_key_selector(
        self,
    ) -> "JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector":
        """The web hook URL to MicrosoftTeams App.

        schema:
        :schema:: JenkinsSpecNotificationsTeams#webHookURLSecretKeySelector
        """
        return self._values.get("web_hook_url_secret_key_selector")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecNotificationsTeams(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "secret": "secret"},
)
class JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector:
    def __init__(
        self,
        *,
        key: str,
        secret: "JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret",
    ) -> None:
        """The web hook URL to MicrosoftTeams App.

        :param key: The key of the secret to select from. Must be a valid secret key.
        :param secret: The name of the secret in the pod's namespace to select from.

        schema:
        :schema:: JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector
        """
        if isinstance(secret, dict):
            secret = JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret(
                **secret
            )
        self._values = {
            "key": key,
            "secret": secret,
        }

    @builtins.property
    def key(self) -> str:
        """The key of the secret to select from.

        Must be a valid secret key.

        schema:
        :schema:: JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector#key
        """
        return self._values.get("key")

    @builtins.property
    def secret(
        self,
    ) -> "JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret":
        """The name of the secret in the pod's namespace to select from.

        schema:
        :schema:: JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector#secret
        """
        return self._values.get("secret")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret",
    jsii_struct_bases=[],
    name_mapping={"name": "name"},
)
class JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret:
    def __init__(self, *, name: typing.Optional[str] = None) -> None:
        """The name of the secret in the pod's namespace to select from.

        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret
        """
        self._values = {}
        if name is not None:
            self._values["name"] = name

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return (
            "JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret(%s)"
            % ", ".join(k + "=" + repr(v) for k, v in self._values.items())
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecRestore",
    jsii_struct_bases=[],
    name_mapping={
        "action": "action",
        "container_name": "containerName",
        "recovery_once": "recoveryOnce",
    },
)
class JenkinsSpecRestore:
    def __init__(
        self,
        *,
        action: "JenkinsSpecRestoreAction",
        container_name: str,
        recovery_once: typing.Optional[jsii.Number] = None,
    ) -> None:
        """Backup defines configuration of Jenkins backup restore More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-backup-and-restore.

        :param action: Action defines action which performs restore backup in restore container sidecar.
        :param container_name: ContainerName is the container name responsible for restore backup operation.
        :param recovery_once: RecoveryOnce if want to restore specific backup set this field and then Jenkins will be restarted and desired backup will be restored.

        schema:
        :schema:: JenkinsSpecRestore
        """
        if isinstance(action, dict):
            action = JenkinsSpecRestoreAction(**action)
        self._values = {
            "action": action,
            "container_name": container_name,
        }
        if recovery_once is not None:
            self._values["recovery_once"] = recovery_once

    @builtins.property
    def action(self) -> "JenkinsSpecRestoreAction":
        """Action defines action which performs restore backup in restore container sidecar.

        schema:
        :schema:: JenkinsSpecRestore#action
        """
        return self._values.get("action")

    @builtins.property
    def container_name(self) -> str:
        """ContainerName is the container name responsible for restore backup operation.

        schema:
        :schema:: JenkinsSpecRestore#containerName
        """
        return self._values.get("container_name")

    @builtins.property
    def recovery_once(self) -> typing.Optional[jsii.Number]:
        """RecoveryOnce if want to restore specific backup set this field and then Jenkins will be restarted and desired backup will be restored.

        schema:
        :schema:: JenkinsSpecRestore#recoveryOnce
        """
        return self._values.get("recovery_once")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecRestore(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecRestoreAction",
    jsii_struct_bases=[],
    name_mapping={"exec": "exec"},
)
class JenkinsSpecRestoreAction:
    def __init__(
        self, *, exec: typing.Optional["JenkinsSpecRestoreActionExec"] = None
    ) -> None:
        """Action defines action which performs restore backup in restore container sidecar.

        :param exec: Exec specifies the action to take.

        schema:
        :schema:: JenkinsSpecRestoreAction
        """
        if isinstance(exec, dict):
            exec = JenkinsSpecRestoreActionExec(**exec)
        self._values = {}
        if exec is not None:
            self._values["exec"] = exec

    @builtins.property
    def exec(self) -> typing.Optional["JenkinsSpecRestoreActionExec"]:
        """Exec specifies the action to take.

        schema:
        :schema:: JenkinsSpecRestoreAction#exec
        """
        return self._values.get("exec")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecRestoreAction(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecRestoreActionExec",
    jsii_struct_bases=[],
    name_mapping={"command": "command"},
)
class JenkinsSpecRestoreActionExec:
    def __init__(self, *, command: typing.Optional[typing.List[str]] = None) -> None:
        """Exec specifies the action to take.

        :param command: Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecRestoreActionExec
        """
        self._values = {}
        if command is not None:
            self._values["command"] = command

    @builtins.property
    def command(self) -> typing.Optional[typing.List[str]]:
        """Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.

        The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: JenkinsSpecRestoreActionExec#command
        """
        return self._values.get("command")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecRestoreActionExec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecRoles",
    jsii_struct_bases=[],
    name_mapping={"api_group": "apiGroup", "kind": "kind", "name": "name"},
)
class JenkinsSpecRoles:
    def __init__(self, *, api_group: str, kind: str, name: str) -> None:
        """RoleRef contains information that points to the role being used.

        :param api_group: APIGroup is the group for the resource being referenced.
        :param kind: Kind is the type of resource being referenced.
        :param name: Name is the name of resource being referenced.

        schema:
        :schema:: JenkinsSpecRoles
        """
        self._values = {
            "api_group": api_group,
            "kind": kind,
            "name": name,
        }

    @builtins.property
    def api_group(self) -> str:
        """APIGroup is the group for the resource being referenced.

        schema:
        :schema:: JenkinsSpecRoles#apiGroup
        """
        return self._values.get("api_group")

    @builtins.property
    def kind(self) -> str:
        """Kind is the type of resource being referenced.

        schema:
        :schema:: JenkinsSpecRoles#kind
        """
        return self._values.get("kind")

    @builtins.property
    def name(self) -> str:
        """Name is the name of resource being referenced.

        schema:
        :schema:: JenkinsSpecRoles#name
        """
        return self._values.get("name")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecRoles(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecSeedJobs",
    jsii_struct_bases=[],
    name_mapping={
        "additional_classpath": "additionalClasspath",
        "bitbucket_push_trigger": "bitbucketPushTrigger",
        "build_periodically": "buildPeriodically",
        "credential_id": "credentialID",
        "credential_type": "credentialType",
        "description": "description",
        "fail_on_missing_plugin": "failOnMissingPlugin",
        "github_push_trigger": "githubPushTrigger",
        "id": "id",
        "ignore_missing_files": "ignoreMissingFiles",
        "poll_scm": "pollSCM",
        "repository_branch": "repositoryBranch",
        "repository_url": "repositoryUrl",
        "targets": "targets",
        "unstable_on_deprecation": "unstableOnDeprecation",
    },
)
class JenkinsSpecSeedJobs:
    def __init__(
        self,
        *,
        additional_classpath: typing.Optional[str] = None,
        bitbucket_push_trigger: typing.Optional[bool] = None,
        build_periodically: typing.Optional[str] = None,
        credential_id: typing.Optional[str] = None,
        credential_type: typing.Optional[str] = None,
        description: typing.Optional[str] = None,
        fail_on_missing_plugin: typing.Optional[bool] = None,
        github_push_trigger: typing.Optional[bool] = None,
        id: typing.Optional[str] = None,
        ignore_missing_files: typing.Optional[bool] = None,
        poll_scm: typing.Optional[str] = None,
        repository_branch: typing.Optional[str] = None,
        repository_url: typing.Optional[str] = None,
        targets: typing.Optional[str] = None,
        unstable_on_deprecation: typing.Optional[bool] = None,
    ) -> None:
        """SeedJob defines configuration for seed job More info: https://github.com/jenkinsci/kubernetes-operator/blob/master/docs/getting-started.md#configure-seed-jobs-and-pipelines.

        :param additional_classpath: AdditionalClasspath is setting for Job DSL API plugin to set Additional Classpath.
        :param bitbucket_push_trigger: BitbucketPushTrigger is used for Bitbucket web hooks.
        :param build_periodically: BuildPeriodically is setting for scheduled trigger.
        :param credential_id: CredentialID is the Kubernetes secret name which stores repository access credentials.
        :param credential_type: JenkinsCredentialType is the https://jenkinsci.github.io/kubernetes-credentials-provider-plugin/ credential type.
        :param description: Description is the description of the seed job.
        :param fail_on_missing_plugin: FailOnMissingPlugin is setting for Job DSL API plugin that fails job if required plugin is missing.
        :param github_push_trigger: GitHubPushTrigger is used for GitHub web hooks.
        :param id: ID is the unique seed job name.
        :param ignore_missing_files: IgnoreMissingFiles is setting for Job DSL API plugin to ignore files that miss.
        :param poll_scm: PollSCM is setting for polling changes in SCM.
        :param repository_branch: RepositoryBranch is the repository branch where are seed job definitions.
        :param repository_url: RepositoryURL is the repository access URL. Can be SSH or HTTPS.
        :param targets: Targets is the repository path where are seed job definitions.
        :param unstable_on_deprecation: UnstableOnDeprecation is setting for Job DSL API plugin that sets build status as unstable if build using deprecated features.

        schema:
        :schema:: JenkinsSpecSeedJobs
        """
        self._values = {}
        if additional_classpath is not None:
            self._values["additional_classpath"] = additional_classpath
        if bitbucket_push_trigger is not None:
            self._values["bitbucket_push_trigger"] = bitbucket_push_trigger
        if build_periodically is not None:
            self._values["build_periodically"] = build_periodically
        if credential_id is not None:
            self._values["credential_id"] = credential_id
        if credential_type is not None:
            self._values["credential_type"] = credential_type
        if description is not None:
            self._values["description"] = description
        if fail_on_missing_plugin is not None:
            self._values["fail_on_missing_plugin"] = fail_on_missing_plugin
        if github_push_trigger is not None:
            self._values["github_push_trigger"] = github_push_trigger
        if id is not None:
            self._values["id"] = id
        if ignore_missing_files is not None:
            self._values["ignore_missing_files"] = ignore_missing_files
        if poll_scm is not None:
            self._values["poll_scm"] = poll_scm
        if repository_branch is not None:
            self._values["repository_branch"] = repository_branch
        if repository_url is not None:
            self._values["repository_url"] = repository_url
        if targets is not None:
            self._values["targets"] = targets
        if unstable_on_deprecation is not None:
            self._values["unstable_on_deprecation"] = unstable_on_deprecation

    @builtins.property
    def additional_classpath(self) -> typing.Optional[str]:
        """AdditionalClasspath is setting for Job DSL API plugin to set Additional Classpath.

        schema:
        :schema:: JenkinsSpecSeedJobs#additionalClasspath
        """
        return self._values.get("additional_classpath")

    @builtins.property
    def bitbucket_push_trigger(self) -> typing.Optional[bool]:
        """BitbucketPushTrigger is used for Bitbucket web hooks.

        schema:
        :schema:: JenkinsSpecSeedJobs#bitbucketPushTrigger
        """
        return self._values.get("bitbucket_push_trigger")

    @builtins.property
    def build_periodically(self) -> typing.Optional[str]:
        """BuildPeriodically is setting for scheduled trigger.

        schema:
        :schema:: JenkinsSpecSeedJobs#buildPeriodically
        """
        return self._values.get("build_periodically")

    @builtins.property
    def credential_id(self) -> typing.Optional[str]:
        """CredentialID is the Kubernetes secret name which stores repository access credentials.

        schema:
        :schema:: JenkinsSpecSeedJobs#credentialID
        """
        return self._values.get("credential_id")

    @builtins.property
    def credential_type(self) -> typing.Optional[str]:
        """JenkinsCredentialType is the https://jenkinsci.github.io/kubernetes-credentials-provider-plugin/ credential type.

        schema:
        :schema:: JenkinsSpecSeedJobs#credentialType
        """
        return self._values.get("credential_type")

    @builtins.property
    def description(self) -> typing.Optional[str]:
        """Description is the description of the seed job.

        schema:
        :schema:: JenkinsSpecSeedJobs#description
        """
        return self._values.get("description")

    @builtins.property
    def fail_on_missing_plugin(self) -> typing.Optional[bool]:
        """FailOnMissingPlugin is setting for Job DSL API plugin that fails job if required plugin is missing.

        schema:
        :schema:: JenkinsSpecSeedJobs#failOnMissingPlugin
        """
        return self._values.get("fail_on_missing_plugin")

    @builtins.property
    def github_push_trigger(self) -> typing.Optional[bool]:
        """GitHubPushTrigger is used for GitHub web hooks.

        schema:
        :schema:: JenkinsSpecSeedJobs#githubPushTrigger
        """
        return self._values.get("github_push_trigger")

    @builtins.property
    def id(self) -> typing.Optional[str]:
        """ID is the unique seed job name.

        schema:
        :schema:: JenkinsSpecSeedJobs#id
        """
        return self._values.get("id")

    @builtins.property
    def ignore_missing_files(self) -> typing.Optional[bool]:
        """IgnoreMissingFiles is setting for Job DSL API plugin to ignore files that miss.

        schema:
        :schema:: JenkinsSpecSeedJobs#ignoreMissingFiles
        """
        return self._values.get("ignore_missing_files")

    @builtins.property
    def poll_scm(self) -> typing.Optional[str]:
        """PollSCM is setting for polling changes in SCM.

        schema:
        :schema:: JenkinsSpecSeedJobs#pollSCM
        """
        return self._values.get("poll_scm")

    @builtins.property
    def repository_branch(self) -> typing.Optional[str]:
        """RepositoryBranch is the repository branch where are seed job definitions.

        schema:
        :schema:: JenkinsSpecSeedJobs#repositoryBranch
        """
        return self._values.get("repository_branch")

    @builtins.property
    def repository_url(self) -> typing.Optional[str]:
        """RepositoryURL is the repository access URL.

        Can be SSH or HTTPS.

        schema:
        :schema:: JenkinsSpecSeedJobs#repositoryUrl
        """
        return self._values.get("repository_url")

    @builtins.property
    def targets(self) -> typing.Optional[str]:
        """Targets is the repository path where are seed job definitions.

        schema:
        :schema:: JenkinsSpecSeedJobs#targets
        """
        return self._values.get("targets")

    @builtins.property
    def unstable_on_deprecation(self) -> typing.Optional[bool]:
        """UnstableOnDeprecation is setting for Job DSL API plugin that sets build status as unstable if build using deprecated features.

        schema:
        :schema:: JenkinsSpecSeedJobs#unstableOnDeprecation
        """
        return self._values.get("unstable_on_deprecation")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecSeedJobs(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecService",
    jsii_struct_bases=[],
    name_mapping={
        "annotations": "annotations",
        "labels": "labels",
        "load_balancer_ip": "loadBalancerIP",
        "load_balancer_source_ranges": "loadBalancerSourceRanges",
        "node_port": "nodePort",
        "port": "port",
        "type": "type",
    },
)
class JenkinsSpecService:
    def __init__(
        self,
        *,
        annotations: typing.Optional[typing.Mapping[str, str]] = None,
        labels: typing.Optional[typing.Mapping[str, str]] = None,
        load_balancer_ip: typing.Optional[str] = None,
        load_balancer_source_ranges: typing.Optional[typing.List[str]] = None,
        node_port: typing.Optional[jsii.Number] = None,
        port: typing.Optional[jsii.Number] = None,
        type: typing.Optional[str] = None,
    ) -> None:
        """Service is Kubernetes service of Jenkins master HTTP pod Defaults to : port: 8080 type: ClusterIP.

        :param annotations: Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
        :param labels: Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
        :param load_balancer_ip: Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
        :param load_balancer_source_ranges: If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
        :param node_port: The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport Default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
        :param port: The port that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
        :param type: Type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types Default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types

        default
        :default: port: 8080 type: ClusterIP

        schema:
        :schema:: JenkinsSpecService
        """
        self._values = {}
        if annotations is not None:
            self._values["annotations"] = annotations
        if labels is not None:
            self._values["labels"] = labels
        if load_balancer_ip is not None:
            self._values["load_balancer_ip"] = load_balancer_ip
        if load_balancer_source_ranges is not None:
            self._values["load_balancer_source_ranges"] = load_balancer_source_ranges
        if node_port is not None:
            self._values["node_port"] = node_port
        if port is not None:
            self._values["port"] = port
        if type is not None:
            self._values["type"] = type

    @builtins.property
    def annotations(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.

        They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations

        schema:
        :schema:: JenkinsSpecService#annotations
        """
        return self._values.get("annotations")

    @builtins.property
    def labels(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Route service traffic to pods with label keys and values matching this selector.

        If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/

        schema:
        :schema:: JenkinsSpecService#labels
        """
        return self._values.get("labels")

    @builtins.property
    def load_balancer_ip(self) -> typing.Optional[str]:
        """Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.

        This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.

        schema:
        :schema:: JenkinsSpecService#loadBalancerIP
        """
        return self._values.get("load_balancer_ip")

    @builtins.property
    def load_balancer_source_ranges(self) -> typing.Optional[typing.List[str]]:
        """If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.

        This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

        schema:
        :schema:: JenkinsSpecService#loadBalancerSourceRanges
        """
        return self._values.get("load_balancer_source_ranges")

    @builtins.property
    def node_port(self) -> typing.Optional[jsii.Number]:
        """The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

        Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        default
        :default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        schema:
        :schema:: JenkinsSpecService#nodePort
        """
        return self._values.get("node_port")

    @builtins.property
    def port(self) -> typing.Optional[jsii.Number]:
        """The port that are exposed by this service.

        More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        schema:
        :schema:: JenkinsSpecService#port
        """
        return self._values.get("port")

    @builtins.property
    def type(self) -> typing.Optional[str]:
        """Type determines how the Service is exposed.

        Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types

        default
        :default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types

        schema:
        :schema:: JenkinsSpecService#type
        """
        return self._values.get("type")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecService(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecServiceAccount",
    jsii_struct_bases=[],
    name_mapping={"annotations": "annotations"},
)
class JenkinsSpecServiceAccount:
    def __init__(
        self, *, annotations: typing.Optional[typing.Mapping[str, str]] = None
    ) -> None:
        """ServiceAccount defines Jenkins master service account attributes.

        :param annotations: Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations

        schema:
        :schema:: JenkinsSpecServiceAccount
        """
        self._values = {}
        if annotations is not None:
            self._values["annotations"] = annotations

    @builtins.property
    def annotations(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.

        They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations

        schema:
        :schema:: JenkinsSpecServiceAccount#annotations
        """
        return self._values.get("annotations")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecServiceAccount(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="de6f67853a60f88a5e105a28a47f88bd9fe5b3eeb297e175be18cafbaf0bd645.JenkinsSpecSlaveService",
    jsii_struct_bases=[],
    name_mapping={
        "annotations": "annotations",
        "labels": "labels",
        "load_balancer_ip": "loadBalancerIP",
        "load_balancer_source_ranges": "loadBalancerSourceRanges",
        "node_port": "nodePort",
        "port": "port",
        "type": "type",
    },
)
class JenkinsSpecSlaveService:
    def __init__(
        self,
        *,
        annotations: typing.Optional[typing.Mapping[str, str]] = None,
        labels: typing.Optional[typing.Mapping[str, str]] = None,
        load_balancer_ip: typing.Optional[str] = None,
        load_balancer_source_ranges: typing.Optional[typing.List[str]] = None,
        node_port: typing.Optional[jsii.Number] = None,
        port: typing.Optional[jsii.Number] = None,
        type: typing.Optional[str] = None,
    ) -> None:
        """Service is Kubernetes service of Jenkins slave pods Defaults to : port: 50000 type: ClusterIP.

        :param annotations: Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
        :param labels: Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
        :param load_balancer_ip: Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
        :param load_balancer_source_ranges: If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
        :param node_port: The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport Default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
        :param port: The port that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
        :param type: Type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types Default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types

        default
        :default: port: 50000 type: ClusterIP

        schema:
        :schema:: JenkinsSpecSlaveService
        """
        self._values = {}
        if annotations is not None:
            self._values["annotations"] = annotations
        if labels is not None:
            self._values["labels"] = labels
        if load_balancer_ip is not None:
            self._values["load_balancer_ip"] = load_balancer_ip
        if load_balancer_source_ranges is not None:
            self._values["load_balancer_source_ranges"] = load_balancer_source_ranges
        if node_port is not None:
            self._values["node_port"] = node_port
        if port is not None:
            self._values["port"] = port
        if type is not None:
            self._values["type"] = type

    @builtins.property
    def annotations(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.

        They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations

        schema:
        :schema:: JenkinsSpecSlaveService#annotations
        """
        return self._values.get("annotations")

    @builtins.property
    def labels(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Route service traffic to pods with label keys and values matching this selector.

        If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/

        schema:
        :schema:: JenkinsSpecSlaveService#labels
        """
        return self._values.get("labels")

    @builtins.property
    def load_balancer_ip(self) -> typing.Optional[str]:
        """Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.

        This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.

        schema:
        :schema:: JenkinsSpecSlaveService#loadBalancerIP
        """
        return self._values.get("load_balancer_ip")

    @builtins.property
    def load_balancer_source_ranges(self) -> typing.Optional[typing.List[str]]:
        """If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.

        This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/

        schema:
        :schema:: JenkinsSpecSlaveService#loadBalancerSourceRanges
        """
        return self._values.get("load_balancer_source_ranges")

    @builtins.property
    def node_port(self) -> typing.Optional[jsii.Number]:
        """The port on each node on which this service is exposed when type=NodePort or LoadBalancer.

        Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        default
        :default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport

        schema:
        :schema:: JenkinsSpecSlaveService#nodePort
        """
        return self._values.get("node_port")

    @builtins.property
    def port(self) -> typing.Optional[jsii.Number]:
        """The port that are exposed by this service.

        More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies

        schema:
        :schema:: JenkinsSpecSlaveService#port
        """
        return self._values.get("port")

    @builtins.property
    def type(self) -> typing.Optional[str]:
        """Type determines how the Service is exposed.

        Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types

        default
        :default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types

        schema:
        :schema:: JenkinsSpecSlaveService#type
        """
        return self._values.get("type")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "JenkinsSpecSlaveService(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


__all__ = [
    "Jenkins",
    "JenkinsOptions",
    "JenkinsSpec",
    "JenkinsSpecBackup",
    "JenkinsSpecBackupAction",
    "JenkinsSpecBackupActionExec",
    "JenkinsSpecConfigurationAsCode",
    "JenkinsSpecConfigurationAsCodeConfigurations",
    "JenkinsSpecConfigurationAsCodeSecret",
    "JenkinsSpecGroovyScripts",
    "JenkinsSpecGroovyScriptsConfigurations",
    "JenkinsSpecGroovyScriptsSecret",
    "JenkinsSpecJenkinsApiSettings",
    "JenkinsSpecMaster",
    "JenkinsSpecMasterBasePlugins",
    "JenkinsSpecMasterContainers",
    "JenkinsSpecMasterContainersEnv",
    "JenkinsSpecMasterContainersEnvFrom",
    "JenkinsSpecMasterContainersEnvFromConfigMapRef",
    "JenkinsSpecMasterContainersEnvFromSecretRef",
    "JenkinsSpecMasterContainersEnvValueFrom",
    "JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef",
    "JenkinsSpecMasterContainersEnvValueFromFieldRef",
    "JenkinsSpecMasterContainersEnvValueFromResourceFieldRef",
    "JenkinsSpecMasterContainersEnvValueFromSecretKeyRef",
    "JenkinsSpecMasterContainersLifecycle",
    "JenkinsSpecMasterContainersLifecyclePostStart",
    "JenkinsSpecMasterContainersLifecyclePostStartExec",
    "JenkinsSpecMasterContainersLifecyclePostStartHttpGet",
    "JenkinsSpecMasterContainersLifecyclePostStartHttpGetHttpHeaders",
    "JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort",
    "JenkinsSpecMasterContainersLifecyclePostStartTcpSocket",
    "JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort",
    "JenkinsSpecMasterContainersLifecyclePreStop",
    "JenkinsSpecMasterContainersLifecyclePreStopExec",
    "JenkinsSpecMasterContainersLifecyclePreStopHttpGet",
    "JenkinsSpecMasterContainersLifecyclePreStopHttpGetHttpHeaders",
    "JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort",
    "JenkinsSpecMasterContainersLifecyclePreStopTcpSocket",
    "JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort",
    "JenkinsSpecMasterContainersLivenessProbe",
    "JenkinsSpecMasterContainersLivenessProbeExec",
    "JenkinsSpecMasterContainersLivenessProbeHttpGet",
    "JenkinsSpecMasterContainersLivenessProbeHttpGetHttpHeaders",
    "JenkinsSpecMasterContainersLivenessProbeHttpGetPort",
    "JenkinsSpecMasterContainersLivenessProbeTcpSocket",
    "JenkinsSpecMasterContainersLivenessProbeTcpSocketPort",
    "JenkinsSpecMasterContainersPorts",
    "JenkinsSpecMasterContainersReadinessProbe",
    "JenkinsSpecMasterContainersReadinessProbeExec",
    "JenkinsSpecMasterContainersReadinessProbeHttpGet",
    "JenkinsSpecMasterContainersReadinessProbeHttpGetHttpHeaders",
    "JenkinsSpecMasterContainersReadinessProbeHttpGetPort",
    "JenkinsSpecMasterContainersReadinessProbeTcpSocket",
    "JenkinsSpecMasterContainersReadinessProbeTcpSocketPort",
    "JenkinsSpecMasterContainersResources",
    "JenkinsSpecMasterContainersSecurityContext",
    "JenkinsSpecMasterContainersSecurityContextCapabilities",
    "JenkinsSpecMasterContainersSecurityContextSeLinuxOptions",
    "JenkinsSpecMasterContainersSecurityContextWindowsOptions",
    "JenkinsSpecMasterContainersVolumeMounts",
    "JenkinsSpecMasterImagePullSecrets",
    "JenkinsSpecMasterPlugins",
    "JenkinsSpecMasterSecurityContext",
    "JenkinsSpecMasterSecurityContextSeLinuxOptions",
    "JenkinsSpecMasterSecurityContextSysctls",
    "JenkinsSpecMasterSecurityContextWindowsOptions",
    "JenkinsSpecMasterTolerations",
    "JenkinsSpecMasterVolumes",
    "JenkinsSpecMasterVolumesAwsElasticBlockStore",
    "JenkinsSpecMasterVolumesAzureDisk",
    "JenkinsSpecMasterVolumesAzureFile",
    "JenkinsSpecMasterVolumesCephfs",
    "JenkinsSpecMasterVolumesCephfsSecretRef",
    "JenkinsSpecMasterVolumesCinder",
    "JenkinsSpecMasterVolumesCinderSecretRef",
    "JenkinsSpecMasterVolumesConfigMap",
    "JenkinsSpecMasterVolumesConfigMapItems",
    "JenkinsSpecMasterVolumesCsi",
    "JenkinsSpecMasterVolumesCsiNodePublishSecretRef",
    "JenkinsSpecMasterVolumesDownwardApi",
    "JenkinsSpecMasterVolumesDownwardApiItems",
    "JenkinsSpecMasterVolumesDownwardApiItemsFieldRef",
    "JenkinsSpecMasterVolumesDownwardApiItemsResourceFieldRef",
    "JenkinsSpecMasterVolumesEmptyDir",
    "JenkinsSpecMasterVolumesFc",
    "JenkinsSpecMasterVolumesFlexVolume",
    "JenkinsSpecMasterVolumesFlexVolumeSecretRef",
    "JenkinsSpecMasterVolumesFlocker",
    "JenkinsSpecMasterVolumesGcePersistentDisk",
    "JenkinsSpecMasterVolumesGitRepo",
    "JenkinsSpecMasterVolumesGlusterfs",
    "JenkinsSpecMasterVolumesHostPath",
    "JenkinsSpecMasterVolumesIscsi",
    "JenkinsSpecMasterVolumesIscsiSecretRef",
    "JenkinsSpecMasterVolumesNfs",
    "JenkinsSpecMasterVolumesPersistentVolumeClaim",
    "JenkinsSpecMasterVolumesPhotonPersistentDisk",
    "JenkinsSpecMasterVolumesPortworxVolume",
    "JenkinsSpecMasterVolumesProjected",
    "JenkinsSpecMasterVolumesProjectedSources",
    "JenkinsSpecMasterVolumesProjectedSourcesConfigMap",
    "JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems",
    "JenkinsSpecMasterVolumesProjectedSourcesDownwardApi",
    "JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItems",
    "JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef",
    "JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsResourceFieldRef",
    "JenkinsSpecMasterVolumesProjectedSourcesSecret",
    "JenkinsSpecMasterVolumesProjectedSourcesSecretItems",
    "JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken",
    "JenkinsSpecMasterVolumesQuobyte",
    "JenkinsSpecMasterVolumesRbd",
    "JenkinsSpecMasterVolumesRbdSecretRef",
    "JenkinsSpecMasterVolumesScaleIo",
    "JenkinsSpecMasterVolumesScaleIoSecretRef",
    "JenkinsSpecMasterVolumesSecret",
    "JenkinsSpecMasterVolumesSecretItems",
    "JenkinsSpecMasterVolumesStorageos",
    "JenkinsSpecMasterVolumesStorageosSecretRef",
    "JenkinsSpecMasterVolumesVsphereVolume",
    "JenkinsSpecNotifications",
    "JenkinsSpecNotificationsMailgun",
    "JenkinsSpecNotificationsMailgunApiKeySecretKeySelector",
    "JenkinsSpecNotificationsMailgunApiKeySecretKeySelectorSecret",
    "JenkinsSpecNotificationsSlack",
    "JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector",
    "JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret",
    "JenkinsSpecNotificationsSmtp",
    "JenkinsSpecNotificationsSmtpPasswordSecretKeySelector",
    "JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret",
    "JenkinsSpecNotificationsSmtpUsernameSecretKeySelector",
    "JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret",
    "JenkinsSpecNotificationsTeams",
    "JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector",
    "JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelectorSecret",
    "JenkinsSpecRestore",
    "JenkinsSpecRestoreAction",
    "JenkinsSpecRestoreActionExec",
    "JenkinsSpecRoles",
    "JenkinsSpecSeedJobs",
    "JenkinsSpecService",
    "JenkinsSpecServiceAccount",
    "JenkinsSpecSlaveService",
]

publication.publish()
