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


class ClusterInstallation(
    cdk8s.ApiObject,
    metaclass=jsii.JSIIMeta,
    jsii_type="mattermostcomclusterinstallation.ClusterInstallation",
):
    """ClusterInstallation is the Schema for the clusterinstallations API.

    schema:
    :schema:: ClusterInstallation
    """

    def __init__(
        self,
        scope: constructs.Construct,
        name: str,
        *,
        spec: "ClusterInstallationSpec",
        metadata: typing.Any = None,
    ) -> None:
        """Defines a "ClusterInstallation" API object.

        :param scope: the scope in which to define this object.
        :param name: a scope-local name for the object.
        :param spec: Specification of the desired behavior of the Mattermost cluster. More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
        :param metadata: 
        """
        options = ClusterInstallationOptions(spec=spec, metadata=metadata)

        jsii.create(ClusterInstallation, self, [scope, name, options])


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationOptions",
    jsii_struct_bases=[],
    name_mapping={"spec": "spec", "metadata": "metadata"},
)
class ClusterInstallationOptions:
    def __init__(
        self, *, spec: "ClusterInstallationSpec", metadata: typing.Any = None
    ) -> None:
        """ClusterInstallation is the Schema for the clusterinstallations API.

        :param spec: Specification of the desired behavior of the Mattermost cluster. More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
        :param metadata: 

        schema:
        :schema:: ClusterInstallation
        """
        if isinstance(spec, dict):
            spec = ClusterInstallationSpec(**spec)
        self._values = {
            "spec": spec,
        }
        if metadata is not None:
            self._values["metadata"] = metadata

    @builtins.property
    def spec(self) -> "ClusterInstallationSpec":
        """Specification of the desired behavior of the Mattermost cluster.

        More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status

        schema:
        :schema:: ClusterInstallation#spec
        """
        return self._values.get("spec")

    @builtins.property
    def metadata(self) -> typing.Any:
        """
        schema:
        :schema:: ClusterInstallation#metadata
        """
        return self._values.get("metadata")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationOptions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpec",
    jsii_struct_bases=[],
    name_mapping={
        "ingress_name": "ingressName",
        "affinity": "affinity",
        "blue_green": "blueGreen",
        "canary": "canary",
        "database": "database",
        "elastic_search": "elasticSearch",
        "image": "image",
        "ingress_annotations": "ingressAnnotations",
        "liveness_probe": "livenessProbe",
        "mattermost_env": "mattermostEnv",
        "mattermost_license_secret": "mattermostLicenseSecret",
        "minio": "minio",
        "node_selector": "nodeSelector",
        "readiness_probe": "readinessProbe",
        "replicas": "replicas",
        "resources": "resources",
        "service_annotations": "serviceAnnotations",
        "size": "size",
        "use_service_load_balancer": "useServiceLoadBalancer",
        "version": "version",
    },
)
class ClusterInstallationSpec:
    def __init__(
        self,
        *,
        ingress_name: str,
        affinity: typing.Optional["ClusterInstallationSpecAffinity"] = None,
        blue_green: typing.Optional["ClusterInstallationSpecBlueGreen"] = None,
        canary: typing.Optional["ClusterInstallationSpecCanary"] = None,
        database: typing.Optional["ClusterInstallationSpecDatabase"] = None,
        elastic_search: typing.Optional["ClusterInstallationSpecElasticSearch"] = None,
        image: typing.Optional[str] = None,
        ingress_annotations: typing.Optional[typing.Mapping[str, str]] = None,
        liveness_probe: typing.Optional["ClusterInstallationSpecLivenessProbe"] = None,
        mattermost_env: typing.Optional[typing.List["ClusterInstallationSpecMattermostEnv"]] = None,
        mattermost_license_secret: typing.Optional[str] = None,
        minio: typing.Optional["ClusterInstallationSpecMinio"] = None,
        node_selector: typing.Optional[typing.Mapping[str, str]] = None,
        readiness_probe: typing.Optional["ClusterInstallationSpecReadinessProbe"] = None,
        replicas: typing.Optional[jsii.Number] = None,
        resources: typing.Optional["ClusterInstallationSpecResources"] = None,
        service_annotations: typing.Optional[typing.Mapping[str, str]] = None,
        size: typing.Optional[str] = None,
        use_service_load_balancer: typing.Optional[bool] = None,
        version: typing.Optional[str] = None,
    ) -> None:
        """Specification of the desired behavior of the Mattermost cluster.

        More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status

        :param ingress_name: IngressName defines the name to be used when creating the ingress rules.
        :param affinity: If specified, affinity will define the pod's scheduling constraints.
        :param blue_green: BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.
        :param canary: Canary defines the configuration of Canary deployment for a ClusterInstallation.
        :param database: Database defines the database configuration for a ClusterInstallation.
        :param elastic_search: ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.
        :param image: Image defines the ClusterInstallation Docker image.
        :param ingress_annotations: 
        :param liveness_probe: Defines the probe to check if the application is up and running.
        :param mattermost_env: Optional environment variables to set in the Mattermost application pods.
        :param mattermost_license_secret: Secret that contains the mattermost license.
        :param minio: Minio defines the configuration of Minio for a ClusterInstallation.
        :param node_selector: NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
        :param readiness_probe: Defines the probe to check if the application is ready to accept traffic.
        :param replicas: Replicas defines the number of replicas to use for the Mattermost app servers. Setting this will override the number of replicas set by 'Size'.
        :param resources: Defines the resource requests and limits for the Mattermost app server pods.
        :param service_annotations: 
        :param size: Size defines the size of the ClusterInstallation. This is typically specified in number of users. This will set replica and resource requests/limits appropriately for the provided number of users. Accepted values are: 100users, 1000users, 5000users, 10000users, 250000users. Defaults to 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size. Default: 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size.
        :param use_service_load_balancer: 
        :param version: Version defines the ClusterInstallation Docker image version.

        schema:
        :schema:: ClusterInstallationSpec
        """
        if isinstance(affinity, dict):
            affinity = ClusterInstallationSpecAffinity(**affinity)
        if isinstance(blue_green, dict):
            blue_green = ClusterInstallationSpecBlueGreen(**blue_green)
        if isinstance(canary, dict):
            canary = ClusterInstallationSpecCanary(**canary)
        if isinstance(database, dict):
            database = ClusterInstallationSpecDatabase(**database)
        if isinstance(elastic_search, dict):
            elastic_search = ClusterInstallationSpecElasticSearch(**elastic_search)
        if isinstance(liveness_probe, dict):
            liveness_probe = ClusterInstallationSpecLivenessProbe(**liveness_probe)
        if isinstance(minio, dict):
            minio = ClusterInstallationSpecMinio(**minio)
        if isinstance(readiness_probe, dict):
            readiness_probe = ClusterInstallationSpecReadinessProbe(**readiness_probe)
        if isinstance(resources, dict):
            resources = ClusterInstallationSpecResources(**resources)
        self._values = {
            "ingress_name": ingress_name,
        }
        if affinity is not None:
            self._values["affinity"] = affinity
        if blue_green is not None:
            self._values["blue_green"] = blue_green
        if canary is not None:
            self._values["canary"] = canary
        if database is not None:
            self._values["database"] = database
        if elastic_search is not None:
            self._values["elastic_search"] = elastic_search
        if image is not None:
            self._values["image"] = image
        if ingress_annotations is not None:
            self._values["ingress_annotations"] = ingress_annotations
        if liveness_probe is not None:
            self._values["liveness_probe"] = liveness_probe
        if mattermost_env is not None:
            self._values["mattermost_env"] = mattermost_env
        if mattermost_license_secret is not None:
            self._values["mattermost_license_secret"] = mattermost_license_secret
        if minio is not None:
            self._values["minio"] = minio
        if node_selector is not None:
            self._values["node_selector"] = node_selector
        if readiness_probe is not None:
            self._values["readiness_probe"] = readiness_probe
        if replicas is not None:
            self._values["replicas"] = replicas
        if resources is not None:
            self._values["resources"] = resources
        if service_annotations is not None:
            self._values["service_annotations"] = service_annotations
        if size is not None:
            self._values["size"] = size
        if use_service_load_balancer is not None:
            self._values["use_service_load_balancer"] = use_service_load_balancer
        if version is not None:
            self._values["version"] = version

    @builtins.property
    def ingress_name(self) -> str:
        """IngressName defines the name to be used when creating the ingress rules.

        schema:
        :schema:: ClusterInstallationSpec#ingressName
        """
        return self._values.get("ingress_name")

    @builtins.property
    def affinity(self) -> typing.Optional["ClusterInstallationSpecAffinity"]:
        """If specified, affinity will define the pod's scheduling constraints.

        schema:
        :schema:: ClusterInstallationSpec#affinity
        """
        return self._values.get("affinity")

    @builtins.property
    def blue_green(self) -> typing.Optional["ClusterInstallationSpecBlueGreen"]:
        """BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.

        schema:
        :schema:: ClusterInstallationSpec#blueGreen
        """
        return self._values.get("blue_green")

    @builtins.property
    def canary(self) -> typing.Optional["ClusterInstallationSpecCanary"]:
        """Canary defines the configuration of Canary deployment for a ClusterInstallation.

        schema:
        :schema:: ClusterInstallationSpec#canary
        """
        return self._values.get("canary")

    @builtins.property
    def database(self) -> typing.Optional["ClusterInstallationSpecDatabase"]:
        """Database defines the database configuration for a ClusterInstallation.

        schema:
        :schema:: ClusterInstallationSpec#database
        """
        return self._values.get("database")

    @builtins.property
    def elastic_search(self) -> typing.Optional["ClusterInstallationSpecElasticSearch"]:
        """ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.

        schema:
        :schema:: ClusterInstallationSpec#elasticSearch
        """
        return self._values.get("elastic_search")

    @builtins.property
    def image(self) -> typing.Optional[str]:
        """Image defines the ClusterInstallation Docker image.

        schema:
        :schema:: ClusterInstallationSpec#image
        """
        return self._values.get("image")

    @builtins.property
    def ingress_annotations(self) -> typing.Optional[typing.Mapping[str, str]]:
        """
        schema:
        :schema:: ClusterInstallationSpec#ingressAnnotations
        """
        return self._values.get("ingress_annotations")

    @builtins.property
    def liveness_probe(self) -> typing.Optional["ClusterInstallationSpecLivenessProbe"]:
        """Defines the probe to check if the application is up and running.

        schema:
        :schema:: ClusterInstallationSpec#livenessProbe
        """
        return self._values.get("liveness_probe")

    @builtins.property
    def mattermost_env(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecMattermostEnv"]]:
        """Optional environment variables to set in the Mattermost application pods.

        schema:
        :schema:: ClusterInstallationSpec#mattermostEnv
        """
        return self._values.get("mattermost_env")

    @builtins.property
    def mattermost_license_secret(self) -> typing.Optional[str]:
        """Secret that contains the mattermost license.

        schema:
        :schema:: ClusterInstallationSpec#mattermostLicenseSecret
        """
        return self._values.get("mattermost_license_secret")

    @builtins.property
    def minio(self) -> typing.Optional["ClusterInstallationSpecMinio"]:
        """Minio defines the configuration of Minio for a ClusterInstallation.

        schema:
        :schema:: ClusterInstallationSpec#minio
        """
        return self._values.get("minio")

    @builtins.property
    def node_selector(self) -> typing.Optional[typing.Mapping[str, str]]:
        """NodeSelector is a selector which must be true for the pod to fit on a node.

        Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/

        schema:
        :schema:: ClusterInstallationSpec#nodeSelector
        """
        return self._values.get("node_selector")

    @builtins.property
    def readiness_probe(
        self,
    ) -> typing.Optional["ClusterInstallationSpecReadinessProbe"]:
        """Defines the probe to check if the application is ready to accept traffic.

        schema:
        :schema:: ClusterInstallationSpec#readinessProbe
        """
        return self._values.get("readiness_probe")

    @builtins.property
    def replicas(self) -> typing.Optional[jsii.Number]:
        """Replicas defines the number of replicas to use for the Mattermost app servers.

        Setting this will override the number of replicas set by 'Size'.

        schema:
        :schema:: ClusterInstallationSpec#replicas
        """
        return self._values.get("replicas")

    @builtins.property
    def resources(self) -> typing.Optional["ClusterInstallationSpecResources"]:
        """Defines the resource requests and limits for the Mattermost app server pods.

        schema:
        :schema:: ClusterInstallationSpec#resources
        """
        return self._values.get("resources")

    @builtins.property
    def service_annotations(self) -> typing.Optional[typing.Mapping[str, str]]:
        """
        schema:
        :schema:: ClusterInstallationSpec#serviceAnnotations
        """
        return self._values.get("service_annotations")

    @builtins.property
    def size(self) -> typing.Optional[str]:
        """Size defines the size of the ClusterInstallation.

        This is typically specified in number of users. This will set replica and resource requests/limits appropriately for the provided number of users. Accepted values are: 100users, 1000users, 5000users, 10000users, 250000users. Defaults to 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size.

        default
        :default: 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size.

        schema:
        :schema:: ClusterInstallationSpec#size
        """
        return self._values.get("size")

    @builtins.property
    def use_service_load_balancer(self) -> typing.Optional[bool]:
        """
        schema:
        :schema:: ClusterInstallationSpec#useServiceLoadBalancer
        """
        return self._values.get("use_service_load_balancer")

    @builtins.property
    def version(self) -> typing.Optional[str]:
        """Version defines the ClusterInstallation Docker image version.

        schema:
        :schema:: ClusterInstallationSpec#version
        """
        return self._values.get("version")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinity",
    jsii_struct_bases=[],
    name_mapping={
        "node_affinity": "nodeAffinity",
        "pod_affinity": "podAffinity",
        "pod_anti_affinity": "podAntiAffinity",
    },
)
class ClusterInstallationSpecAffinity:
    def __init__(
        self,
        *,
        node_affinity: typing.Optional["ClusterInstallationSpecAffinityNodeAffinity"] = None,
        pod_affinity: typing.Optional["ClusterInstallationSpecAffinityPodAffinity"] = None,
        pod_anti_affinity: typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinity"] = None,
    ) -> None:
        """If specified, affinity will define the pod's scheduling constraints.

        :param node_affinity: Describes node affinity scheduling rules for the pod.
        :param pod_affinity: Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
        :param pod_anti_affinity: Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).

        schema:
        :schema:: ClusterInstallationSpecAffinity
        """
        if isinstance(node_affinity, dict):
            node_affinity = ClusterInstallationSpecAffinityNodeAffinity(**node_affinity)
        if isinstance(pod_affinity, dict):
            pod_affinity = ClusterInstallationSpecAffinityPodAffinity(**pod_affinity)
        if isinstance(pod_anti_affinity, dict):
            pod_anti_affinity = ClusterInstallationSpecAffinityPodAntiAffinity(**pod_anti_affinity)
        self._values = {}
        if node_affinity is not None:
            self._values["node_affinity"] = node_affinity
        if pod_affinity is not None:
            self._values["pod_affinity"] = pod_affinity
        if pod_anti_affinity is not None:
            self._values["pod_anti_affinity"] = pod_anti_affinity

    @builtins.property
    def node_affinity(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityNodeAffinity"]:
        """Describes node affinity scheduling rules for the pod.

        schema:
        :schema:: ClusterInstallationSpecAffinity#nodeAffinity
        """
        return self._values.get("node_affinity")

    @builtins.property
    def pod_affinity(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAffinity"]:
        """Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).

        schema:
        :schema:: ClusterInstallationSpecAffinity#podAffinity
        """
        return self._values.get("pod_affinity")

    @builtins.property
    def pod_anti_affinity(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinity"]:
        """Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).

        schema:
        :schema:: ClusterInstallationSpecAffinity#podAntiAffinity
        """
        return self._values.get("pod_anti_affinity")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinity(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityNodeAffinity",
    jsii_struct_bases=[],
    name_mapping={
        "preferred_during_scheduling_ignored_during_execution": "preferredDuringSchedulingIgnoredDuringExecution",
        "required_during_scheduling_ignored_during_execution": "requiredDuringSchedulingIgnoredDuringExecution",
    },
)
class ClusterInstallationSpecAffinityNodeAffinity:
    def __init__(
        self,
        *,
        preferred_during_scheduling_ignored_during_execution: typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution"]] = None,
        required_during_scheduling_ignored_during_execution: typing.Optional["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution"] = None,
    ) -> None:
        """Describes node affinity scheduling rules for the pod.

        :param preferred_during_scheduling_ignored_during_execution: The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
        :param required_during_scheduling_ignored_during_execution: If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinity
        """
        if isinstance(required_during_scheduling_ignored_during_execution, dict):
            required_during_scheduling_ignored_during_execution = ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(**required_during_scheduling_ignored_during_execution)
        self._values = {}
        if preferred_during_scheduling_ignored_during_execution is not None:
            self._values["preferred_during_scheduling_ignored_during_execution"] = preferred_during_scheduling_ignored_during_execution
        if required_during_scheduling_ignored_during_execution is not None:
            self._values["required_during_scheduling_ignored_during_execution"] = required_during_scheduling_ignored_during_execution

    @builtins.property
    def preferred_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution"]]:
        """The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.

        The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinity#preferredDuringSchedulingIgnoredDuringExecution
        """
        return self._values.get("preferred_during_scheduling_ignored_during_execution")

    @builtins.property
    def required_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution"]:
        """If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.

        If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinity#requiredDuringSchedulingIgnoredDuringExecution
        """
        return self._values.get("required_during_scheduling_ignored_during_execution")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinity(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution",
    jsii_struct_bases=[],
    name_mapping={"preference": "preference", "weight": "weight"},
)
class ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution:
    def __init__(
        self,
        *,
        preference: "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference",
        weight: jsii.Number,
    ) -> None:
        """An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).

        :param preference: A node selector term, associated with the corresponding weight.
        :param weight: Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution
        """
        if isinstance(preference, dict):
            preference = ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference(**preference)
        self._values = {
            "preference": preference,
            "weight": weight,
        }

    @builtins.property
    def preference(
        self,
    ) -> "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference":
        """A node selector term, associated with the corresponding weight.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution#preference
        """
        return self._values.get("preference")

    @builtins.property
    def weight(self) -> jsii.Number:
        """Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution#weight
        """
        return self._values.get("weight")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference",
    jsii_struct_bases=[],
    name_mapping={
        "match_expressions": "matchExpressions",
        "match_fields": "matchFields",
    },
)
class ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference:
    def __init__(
        self,
        *,
        match_expressions: typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions"]] = None,
        match_fields: typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields"]] = None,
    ) -> None:
        """A node selector term, associated with the corresponding weight.

        :param match_expressions: A list of node selector requirements by node's labels.
        :param match_fields: A list of node selector requirements by node's fields.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference
        """
        self._values = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_fields is not None:
            self._values["match_fields"] = match_fields

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions"]]:
        """A list of node selector requirements by node's labels.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference#matchExpressions
        """
        return self._values.get("match_expressions")

    @builtins.property
    def match_fields(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields"]]:
        """A list of node selector requirements by node's fields.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference#matchFields
        """
        return self._values.get("match_fields")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions:
    def __init__(
        self,
        *,
        key: str,
        operator: str,
        values: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: The label key that the selector applies to.
        :param operator: Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
        :param values: An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions
        """
        self._values = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> str:
        """The label key that the selector applies to.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions#key
        """
        return self._values.get("key")

    @builtins.property
    def operator(self) -> str:
        """Represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions#operator
        """
        return self._values.get("operator")

    @builtins.property
    def values(self) -> typing.Optional[typing.List[str]]:
        """An array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions#values
        """
        return self._values.get("values")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields:
    def __init__(
        self,
        *,
        key: str,
        operator: str,
        values: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: The label key that the selector applies to.
        :param operator: Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
        :param values: An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields
        """
        self._values = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> str:
        """The label key that the selector applies to.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields#key
        """
        return self._values.get("key")

    @builtins.property
    def operator(self) -> str:
        """Represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields#operator
        """
        return self._values.get("operator")

    @builtins.property
    def values(self) -> typing.Optional[typing.List[str]]:
        """An array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields#values
        """
        return self._values.get("values")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution",
    jsii_struct_bases=[],
    name_mapping={"node_selector_terms": "nodeSelectorTerms"},
)
class ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution:
    def __init__(
        self,
        *,
        node_selector_terms: typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms"],
    ) -> None:
        """If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.

        If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.

        :param node_selector_terms: Required. A list of node selector terms. The terms are ORed.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution
        """
        self._values = {
            "node_selector_terms": node_selector_terms,
        }

    @builtins.property
    def node_selector_terms(
        self,
    ) -> typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms"]:
        """Required.

        A list of node selector terms. The terms are ORed.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution#nodeSelectorTerms
        """
        return self._values.get("node_selector_terms")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms",
    jsii_struct_bases=[],
    name_mapping={
        "match_expressions": "matchExpressions",
        "match_fields": "matchFields",
    },
)
class ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms:
    def __init__(
        self,
        *,
        match_expressions: typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions"]] = None,
        match_fields: typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields"]] = None,
    ) -> None:
        """A null or empty node selector term matches no objects.

        The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.

        :param match_expressions: A list of node selector requirements by node's labels.
        :param match_fields: A list of node selector requirements by node's fields.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms
        """
        self._values = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_fields is not None:
            self._values["match_fields"] = match_fields

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions"]]:
        """A list of node selector requirements by node's labels.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms#matchExpressions
        """
        return self._values.get("match_expressions")

    @builtins.property
    def match_fields(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields"]]:
        """A list of node selector requirements by node's fields.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms#matchFields
        """
        return self._values.get("match_fields")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions:
    def __init__(
        self,
        *,
        key: str,
        operator: str,
        values: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: The label key that the selector applies to.
        :param operator: Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
        :param values: An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions
        """
        self._values = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> str:
        """The label key that the selector applies to.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions#key
        """
        return self._values.get("key")

    @builtins.property
    def operator(self) -> str:
        """Represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions#operator
        """
        return self._values.get("operator")

    @builtins.property
    def values(self) -> typing.Optional[typing.List[str]]:
        """An array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions#values
        """
        return self._values.get("values")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields:
    def __init__(
        self,
        *,
        key: str,
        operator: str,
        values: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: The label key that the selector applies to.
        :param operator: Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
        :param values: An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields
        """
        self._values = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> str:
        """The label key that the selector applies to.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields#key
        """
        return self._values.get("key")

    @builtins.property
    def operator(self) -> str:
        """Represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields#operator
        """
        return self._values.get("operator")

    @builtins.property
    def values(self) -> typing.Optional[typing.List[str]]:
        """An array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields#values
        """
        return self._values.get("values")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAffinity",
    jsii_struct_bases=[],
    name_mapping={
        "preferred_during_scheduling_ignored_during_execution": "preferredDuringSchedulingIgnoredDuringExecution",
        "required_during_scheduling_ignored_during_execution": "requiredDuringSchedulingIgnoredDuringExecution",
    },
)
class ClusterInstallationSpecAffinityPodAffinity:
    def __init__(
        self,
        *,
        preferred_during_scheduling_ignored_during_execution: typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution"]] = None,
        required_during_scheduling_ignored_during_execution: typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution"]] = None,
    ) -> None:
        """Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).

        :param preferred_during_scheduling_ignored_during_execution: The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
        :param required_during_scheduling_ignored_during_execution: If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinity
        """
        self._values = {}
        if preferred_during_scheduling_ignored_during_execution is not None:
            self._values["preferred_during_scheduling_ignored_during_execution"] = preferred_during_scheduling_ignored_during_execution
        if required_during_scheduling_ignored_during_execution is not None:
            self._values["required_during_scheduling_ignored_during_execution"] = required_during_scheduling_ignored_during_execution

    @builtins.property
    def preferred_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution"]]:
        """The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.

        The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinity#preferredDuringSchedulingIgnoredDuringExecution
        """
        return self._values.get("preferred_during_scheduling_ignored_during_execution")

    @builtins.property
    def required_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution"]]:
        """If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.

        If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinity#requiredDuringSchedulingIgnoredDuringExecution
        """
        return self._values.get("required_during_scheduling_ignored_during_execution")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinity(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution",
    jsii_struct_bases=[],
    name_mapping={"pod_affinity_term": "podAffinityTerm", "weight": "weight"},
)
class ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution:
    def __init__(
        self,
        *,
        pod_affinity_term: "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
        weight: jsii.Number,
    ) -> None:
        """The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s).

        :param pod_affinity_term: Required. A pod affinity term, associated with the corresponding weight.
        :param weight: weight associated with matching the corresponding podAffinityTerm, in the range 1-100.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
        """
        if isinstance(pod_affinity_term, dict):
            pod_affinity_term = ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm(**pod_affinity_term)
        self._values = {
            "pod_affinity_term": pod_affinity_term,
            "weight": weight,
        }

    @builtins.property
    def pod_affinity_term(
        self,
    ) -> "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm":
        """Required.

        A pod affinity term, associated with the corresponding weight.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution#podAffinityTerm
        """
        return self._values.get("pod_affinity_term")

    @builtins.property
    def weight(self) -> jsii.Number:
        """weight associated with matching the corresponding podAffinityTerm, in the range 1-100.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution#weight
        """
        return self._values.get("weight")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
    jsii_struct_bases=[],
    name_mapping={
        "topology_key": "topologyKey",
        "label_selector": "labelSelector",
        "namespaces": "namespaces",
    },
)
class ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm:
    def __init__(
        self,
        *,
        topology_key: str,
        label_selector: typing.Optional["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector"] = None,
        namespaces: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """Required.

        A pod affinity term, associated with the corresponding weight.

        :param topology_key: This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
        :param label_selector: A label query over a set of resources, in this case pods.
        :param namespaces: namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm
        """
        if isinstance(label_selector, dict):
            label_selector = ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector(**label_selector)
        self._values = {
            "topology_key": topology_key,
        }
        if label_selector is not None:
            self._values["label_selector"] = label_selector
        if namespaces is not None:
            self._values["namespaces"] = namespaces

    @builtins.property
    def topology_key(self) -> str:
        """This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.

        Empty topologyKey is not allowed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#topologyKey
        """
        return self._values.get("topology_key")

    @builtins.property
    def label_selector(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector"]:
        """A label query over a set of resources, in this case pods.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#labelSelector
        """
        return self._values.get("label_selector")

    @builtins.property
    def namespaces(self) -> typing.Optional[typing.List[str]]:
        """namespaces specifies which namespaces the labelSelector applies to (matches against);

        null or empty list means "this pod's namespace"

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#namespaces
        """
        return self._values.get("namespaces")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector",
    jsii_struct_bases=[],
    name_mapping={
        "match_expressions": "matchExpressions",
        "match_labels": "matchLabels",
    },
)
class ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector:
    def __init__(
        self,
        *,
        match_expressions: typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions"]] = None,
        match_labels: typing.Optional[typing.Mapping[str, str]] = None,
    ) -> None:
        """A label query over a set of resources, in this case pods.

        :param match_expressions: matchExpressions is a list of label selector requirements. The requirements are ANDed.
        :param match_labels: matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector
        """
        self._values = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_labels is not None:
            self._values["match_labels"] = match_labels

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions"]]:
        """matchExpressions is a list of label selector requirements.

        The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector#matchExpressions
        """
        return self._values.get("match_expressions")

    @builtins.property
    def match_labels(self) -> typing.Optional[typing.Mapping[str, str]]:
        """matchLabels is a map of {key,value} pairs.

        A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector#matchLabels
        """
        return self._values.get("match_labels")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions:
    def __init__(
        self,
        *,
        key: str,
        operator: str,
        values: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: key is the label key that the selector applies to.
        :param operator: operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        :param values: values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions
        """
        self._values = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> str:
        """key is the label key that the selector applies to.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#key
        """
        return self._values.get("key")

    @builtins.property
    def operator(self) -> str:
        """operator represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists and DoesNotExist.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#operator
        """
        return self._values.get("operator")

    @builtins.property
    def values(self) -> typing.Optional[typing.List[str]]:
        """values is an array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#values
        """
        return self._values.get("values")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution",
    jsii_struct_bases=[],
    name_mapping={
        "topology_key": "topologyKey",
        "label_selector": "labelSelector",
        "namespaces": "namespaces",
    },
)
class ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution:
    def __init__(
        self,
        *,
        topology_key: str,
        label_selector: typing.Optional["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector"] = None,
        namespaces: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key  matches that of any node on which a pod of the set of pods is running.

        :param topology_key: This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
        :param label_selector: A label query over a set of resources, in this case pods.
        :param namespaces: namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
        """
        if isinstance(label_selector, dict):
            label_selector = ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector(**label_selector)
        self._values = {
            "topology_key": topology_key,
        }
        if label_selector is not None:
            self._values["label_selector"] = label_selector
        if namespaces is not None:
            self._values["namespaces"] = namespaces

    @builtins.property
    def topology_key(self) -> str:
        """This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.

        Empty topologyKey is not allowed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution#topologyKey
        """
        return self._values.get("topology_key")

    @builtins.property
    def label_selector(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector"]:
        """A label query over a set of resources, in this case pods.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution#labelSelector
        """
        return self._values.get("label_selector")

    @builtins.property
    def namespaces(self) -> typing.Optional[typing.List[str]]:
        """namespaces specifies which namespaces the labelSelector applies to (matches against);

        null or empty list means "this pod's namespace"

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution#namespaces
        """
        return self._values.get("namespaces")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector",
    jsii_struct_bases=[],
    name_mapping={
        "match_expressions": "matchExpressions",
        "match_labels": "matchLabels",
    },
)
class ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector:
    def __init__(
        self,
        *,
        match_expressions: typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions"]] = None,
        match_labels: typing.Optional[typing.Mapping[str, str]] = None,
    ) -> None:
        """A label query over a set of resources, in this case pods.

        :param match_expressions: matchExpressions is a list of label selector requirements. The requirements are ANDed.
        :param match_labels: matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector
        """
        self._values = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_labels is not None:
            self._values["match_labels"] = match_labels

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions"]]:
        """matchExpressions is a list of label selector requirements.

        The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector#matchExpressions
        """
        return self._values.get("match_expressions")

    @builtins.property
    def match_labels(self) -> typing.Optional[typing.Mapping[str, str]]:
        """matchLabels is a map of {key,value} pairs.

        A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector#matchLabels
        """
        return self._values.get("match_labels")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions:
    def __init__(
        self,
        *,
        key: str,
        operator: str,
        values: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: key is the label key that the selector applies to.
        :param operator: operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        :param values: values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions
        """
        self._values = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> str:
        """key is the label key that the selector applies to.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#key
        """
        return self._values.get("key")

    @builtins.property
    def operator(self) -> str:
        """operator represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists and DoesNotExist.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#operator
        """
        return self._values.get("operator")

    @builtins.property
    def values(self) -> typing.Optional[typing.List[str]]:
        """values is an array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#values
        """
        return self._values.get("values")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinity",
    jsii_struct_bases=[],
    name_mapping={
        "preferred_during_scheduling_ignored_during_execution": "preferredDuringSchedulingIgnoredDuringExecution",
        "required_during_scheduling_ignored_during_execution": "requiredDuringSchedulingIgnoredDuringExecution",
    },
)
class ClusterInstallationSpecAffinityPodAntiAffinity:
    def __init__(
        self,
        *,
        preferred_during_scheduling_ignored_during_execution: typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution"]] = None,
        required_during_scheduling_ignored_during_execution: typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution"]] = None,
    ) -> None:
        """Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).

        :param preferred_during_scheduling_ignored_during_execution: The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
        :param required_during_scheduling_ignored_during_execution: If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinity
        """
        self._values = {}
        if preferred_during_scheduling_ignored_during_execution is not None:
            self._values["preferred_during_scheduling_ignored_during_execution"] = preferred_during_scheduling_ignored_during_execution
        if required_during_scheduling_ignored_during_execution is not None:
            self._values["required_during_scheduling_ignored_during_execution"] = required_during_scheduling_ignored_during_execution

    @builtins.property
    def preferred_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution"]]:
        """The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.

        The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinity#preferredDuringSchedulingIgnoredDuringExecution
        """
        return self._values.get("preferred_during_scheduling_ignored_during_execution")

    @builtins.property
    def required_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution"]]:
        """If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.

        If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinity#requiredDuringSchedulingIgnoredDuringExecution
        """
        return self._values.get("required_during_scheduling_ignored_during_execution")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinity(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution",
    jsii_struct_bases=[],
    name_mapping={"pod_affinity_term": "podAffinityTerm", "weight": "weight"},
)
class ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution:
    def __init__(
        self,
        *,
        pod_affinity_term: "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
        weight: jsii.Number,
    ) -> None:
        """The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s).

        :param pod_affinity_term: Required. A pod affinity term, associated with the corresponding weight.
        :param weight: weight associated with matching the corresponding podAffinityTerm, in the range 1-100.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution
        """
        if isinstance(pod_affinity_term, dict):
            pod_affinity_term = ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm(**pod_affinity_term)
        self._values = {
            "pod_affinity_term": pod_affinity_term,
            "weight": weight,
        }

    @builtins.property
    def pod_affinity_term(
        self,
    ) -> "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm":
        """Required.

        A pod affinity term, associated with the corresponding weight.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution#podAffinityTerm
        """
        return self._values.get("pod_affinity_term")

    @builtins.property
    def weight(self) -> jsii.Number:
        """weight associated with matching the corresponding podAffinityTerm, in the range 1-100.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution#weight
        """
        return self._values.get("weight")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
    jsii_struct_bases=[],
    name_mapping={
        "topology_key": "topologyKey",
        "label_selector": "labelSelector",
        "namespaces": "namespaces",
    },
)
class ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm:
    def __init__(
        self,
        *,
        topology_key: str,
        label_selector: typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector"] = None,
        namespaces: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """Required.

        A pod affinity term, associated with the corresponding weight.

        :param topology_key: This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
        :param label_selector: A label query over a set of resources, in this case pods.
        :param namespaces: namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm
        """
        if isinstance(label_selector, dict):
            label_selector = ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector(**label_selector)
        self._values = {
            "topology_key": topology_key,
        }
        if label_selector is not None:
            self._values["label_selector"] = label_selector
        if namespaces is not None:
            self._values["namespaces"] = namespaces

    @builtins.property
    def topology_key(self) -> str:
        """This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.

        Empty topologyKey is not allowed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#topologyKey
        """
        return self._values.get("topology_key")

    @builtins.property
    def label_selector(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector"]:
        """A label query over a set of resources, in this case pods.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#labelSelector
        """
        return self._values.get("label_selector")

    @builtins.property
    def namespaces(self) -> typing.Optional[typing.List[str]]:
        """namespaces specifies which namespaces the labelSelector applies to (matches against);

        null or empty list means "this pod's namespace"

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#namespaces
        """
        return self._values.get("namespaces")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector",
    jsii_struct_bases=[],
    name_mapping={
        "match_expressions": "matchExpressions",
        "match_labels": "matchLabels",
    },
)
class ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector:
    def __init__(
        self,
        *,
        match_expressions: typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions"]] = None,
        match_labels: typing.Optional[typing.Mapping[str, str]] = None,
    ) -> None:
        """A label query over a set of resources, in this case pods.

        :param match_expressions: matchExpressions is a list of label selector requirements. The requirements are ANDed.
        :param match_labels: matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector
        """
        self._values = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_labels is not None:
            self._values["match_labels"] = match_labels

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions"]]:
        """matchExpressions is a list of label selector requirements.

        The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector#matchExpressions
        """
        return self._values.get("match_expressions")

    @builtins.property
    def match_labels(self) -> typing.Optional[typing.Mapping[str, str]]:
        """matchLabels is a map of {key,value} pairs.

        A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector#matchLabels
        """
        return self._values.get("match_labels")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions:
    def __init__(
        self,
        *,
        key: str,
        operator: str,
        values: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: key is the label key that the selector applies to.
        :param operator: operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        :param values: values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions
        """
        self._values = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> str:
        """key is the label key that the selector applies to.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#key
        """
        return self._values.get("key")

    @builtins.property
    def operator(self) -> str:
        """operator represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists and DoesNotExist.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#operator
        """
        return self._values.get("operator")

    @builtins.property
    def values(self) -> typing.Optional[typing.List[str]]:
        """values is an array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#values
        """
        return self._values.get("values")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution",
    jsii_struct_bases=[],
    name_mapping={
        "topology_key": "topologyKey",
        "label_selector": "labelSelector",
        "namespaces": "namespaces",
    },
)
class ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution:
    def __init__(
        self,
        *,
        topology_key: str,
        label_selector: typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector"] = None,
        namespaces: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key  matches that of any node on which a pod of the set of pods is running.

        :param topology_key: This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
        :param label_selector: A label query over a set of resources, in this case pods.
        :param namespaces: namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution
        """
        if isinstance(label_selector, dict):
            label_selector = ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector(**label_selector)
        self._values = {
            "topology_key": topology_key,
        }
        if label_selector is not None:
            self._values["label_selector"] = label_selector
        if namespaces is not None:
            self._values["namespaces"] = namespaces

    @builtins.property
    def topology_key(self) -> str:
        """This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.

        Empty topologyKey is not allowed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution#topologyKey
        """
        return self._values.get("topology_key")

    @builtins.property
    def label_selector(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector"]:
        """A label query over a set of resources, in this case pods.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution#labelSelector
        """
        return self._values.get("label_selector")

    @builtins.property
    def namespaces(self) -> typing.Optional[typing.List[str]]:
        """namespaces specifies which namespaces the labelSelector applies to (matches against);

        null or empty list means "this pod's namespace"

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution#namespaces
        """
        return self._values.get("namespaces")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector",
    jsii_struct_bases=[],
    name_mapping={
        "match_expressions": "matchExpressions",
        "match_labels": "matchLabels",
    },
)
class ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector:
    def __init__(
        self,
        *,
        match_expressions: typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions"]] = None,
        match_labels: typing.Optional[typing.Mapping[str, str]] = None,
    ) -> None:
        """A label query over a set of resources, in this case pods.

        :param match_expressions: matchExpressions is a list of label selector requirements. The requirements are ANDed.
        :param match_labels: matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector
        """
        self._values = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_labels is not None:
            self._values["match_labels"] = match_labels

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions"]]:
        """matchExpressions is a list of label selector requirements.

        The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector#matchExpressions
        """
        return self._values.get("match_expressions")

    @builtins.property
    def match_labels(self) -> typing.Optional[typing.Mapping[str, str]]:
        """matchLabels is a map of {key,value} pairs.

        A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector#matchLabels
        """
        return self._values.get("match_labels")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions:
    def __init__(
        self,
        *,
        key: str,
        operator: str,
        values: typing.Optional[typing.List[str]] = None,
    ) -> None:
        """A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: key is the label key that the selector applies to.
        :param operator: operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        :param values: values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions
        """
        self._values = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> str:
        """key is the label key that the selector applies to.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#key
        """
        return self._values.get("key")

    @builtins.property
    def operator(self) -> str:
        """operator represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists and DoesNotExist.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#operator
        """
        return self._values.get("operator")

    @builtins.property
    def values(self) -> typing.Optional[typing.List[str]]:
        """values is an array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        schema:
        :schema:: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#values
        """
        return self._values.get("values")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecBlueGreen",
    jsii_struct_bases=[],
    name_mapping={
        "blue": "blue",
        "enable": "enable",
        "green": "green",
        "production_deployment": "productionDeployment",
    },
)
class ClusterInstallationSpecBlueGreen:
    def __init__(
        self,
        *,
        blue: typing.Optional["ClusterInstallationSpecBlueGreenBlue"] = None,
        enable: typing.Optional[bool] = None,
        green: typing.Optional["ClusterInstallationSpecBlueGreenGreen"] = None,
        production_deployment: typing.Optional[str] = None,
    ) -> None:
        """BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.

        :param blue: Blue defines the blue deployment.
        :param enable: Enable defines if BlueGreen deployment will be applied.
        :param green: Green defines the green deployment.
        :param production_deployment: ProductionDeployment defines if the current production is blue or green.

        schema:
        :schema:: ClusterInstallationSpecBlueGreen
        """
        if isinstance(blue, dict):
            blue = ClusterInstallationSpecBlueGreenBlue(**blue)
        if isinstance(green, dict):
            green = ClusterInstallationSpecBlueGreenGreen(**green)
        self._values = {}
        if blue is not None:
            self._values["blue"] = blue
        if enable is not None:
            self._values["enable"] = enable
        if green is not None:
            self._values["green"] = green
        if production_deployment is not None:
            self._values["production_deployment"] = production_deployment

    @builtins.property
    def blue(self) -> typing.Optional["ClusterInstallationSpecBlueGreenBlue"]:
        """Blue defines the blue deployment.

        schema:
        :schema:: ClusterInstallationSpecBlueGreen#blue
        """
        return self._values.get("blue")

    @builtins.property
    def enable(self) -> typing.Optional[bool]:
        """Enable defines if BlueGreen deployment will be applied.

        schema:
        :schema:: ClusterInstallationSpecBlueGreen#enable
        """
        return self._values.get("enable")

    @builtins.property
    def green(self) -> typing.Optional["ClusterInstallationSpecBlueGreenGreen"]:
        """Green defines the green deployment.

        schema:
        :schema:: ClusterInstallationSpecBlueGreen#green
        """
        return self._values.get("green")

    @builtins.property
    def production_deployment(self) -> typing.Optional[str]:
        """ProductionDeployment defines if the current production is blue or green.

        schema:
        :schema:: ClusterInstallationSpecBlueGreen#productionDeployment
        """
        return self._values.get("production_deployment")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecBlueGreen(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecBlueGreenBlue",
    jsii_struct_bases=[],
    name_mapping={
        "image": "image",
        "ingress_name": "ingressName",
        "name": "name",
        "version": "version",
    },
)
class ClusterInstallationSpecBlueGreenBlue:
    def __init__(
        self,
        *,
        image: typing.Optional[str] = None,
        ingress_name: typing.Optional[str] = None,
        name: typing.Optional[str] = None,
        version: typing.Optional[str] = None,
    ) -> None:
        """Blue defines the blue deployment.

        :param image: Image defines the base Docker image that will be used for the deployment. Required when BlueGreen or Canary is enabled.
        :param ingress_name: IngressName defines the ingress name that will be used by the deployment. This option is not used for Canary builds.
        :param name: Name defines the name of the deployment.
        :param version: Version defines the Docker image version that will be used for the deployment. Required when BlueGreen or Canary is enabled.

        schema:
        :schema:: ClusterInstallationSpecBlueGreenBlue
        """
        self._values = {}
        if image is not None:
            self._values["image"] = image
        if ingress_name is not None:
            self._values["ingress_name"] = ingress_name
        if name is not None:
            self._values["name"] = name
        if version is not None:
            self._values["version"] = version

    @builtins.property
    def image(self) -> typing.Optional[str]:
        """Image defines the base Docker image that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        schema:
        :schema:: ClusterInstallationSpecBlueGreenBlue#image
        """
        return self._values.get("image")

    @builtins.property
    def ingress_name(self) -> typing.Optional[str]:
        """IngressName defines the ingress name that will be used by the deployment.

        This option is not used for Canary builds.

        schema:
        :schema:: ClusterInstallationSpecBlueGreenBlue#ingressName
        """
        return self._values.get("ingress_name")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name defines the name of the deployment.

        schema:
        :schema:: ClusterInstallationSpecBlueGreenBlue#name
        """
        return self._values.get("name")

    @builtins.property
    def version(self) -> typing.Optional[str]:
        """Version defines the Docker image version that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        schema:
        :schema:: ClusterInstallationSpecBlueGreenBlue#version
        """
        return self._values.get("version")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecBlueGreenBlue(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecBlueGreenGreen",
    jsii_struct_bases=[],
    name_mapping={
        "image": "image",
        "ingress_name": "ingressName",
        "name": "name",
        "version": "version",
    },
)
class ClusterInstallationSpecBlueGreenGreen:
    def __init__(
        self,
        *,
        image: typing.Optional[str] = None,
        ingress_name: typing.Optional[str] = None,
        name: typing.Optional[str] = None,
        version: typing.Optional[str] = None,
    ) -> None:
        """Green defines the green deployment.

        :param image: Image defines the base Docker image that will be used for the deployment. Required when BlueGreen or Canary is enabled.
        :param ingress_name: IngressName defines the ingress name that will be used by the deployment. This option is not used for Canary builds.
        :param name: Name defines the name of the deployment.
        :param version: Version defines the Docker image version that will be used for the deployment. Required when BlueGreen or Canary is enabled.

        schema:
        :schema:: ClusterInstallationSpecBlueGreenGreen
        """
        self._values = {}
        if image is not None:
            self._values["image"] = image
        if ingress_name is not None:
            self._values["ingress_name"] = ingress_name
        if name is not None:
            self._values["name"] = name
        if version is not None:
            self._values["version"] = version

    @builtins.property
    def image(self) -> typing.Optional[str]:
        """Image defines the base Docker image that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        schema:
        :schema:: ClusterInstallationSpecBlueGreenGreen#image
        """
        return self._values.get("image")

    @builtins.property
    def ingress_name(self) -> typing.Optional[str]:
        """IngressName defines the ingress name that will be used by the deployment.

        This option is not used for Canary builds.

        schema:
        :schema:: ClusterInstallationSpecBlueGreenGreen#ingressName
        """
        return self._values.get("ingress_name")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name defines the name of the deployment.

        schema:
        :schema:: ClusterInstallationSpecBlueGreenGreen#name
        """
        return self._values.get("name")

    @builtins.property
    def version(self) -> typing.Optional[str]:
        """Version defines the Docker image version that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        schema:
        :schema:: ClusterInstallationSpecBlueGreenGreen#version
        """
        return self._values.get("version")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecBlueGreenGreen(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecCanary",
    jsii_struct_bases=[],
    name_mapping={"deployment": "deployment", "enable": "enable"},
)
class ClusterInstallationSpecCanary:
    def __init__(
        self,
        *,
        deployment: typing.Optional["ClusterInstallationSpecCanaryDeployment"] = None,
        enable: typing.Optional[bool] = None,
    ) -> None:
        """Canary defines the configuration of Canary deployment for a ClusterInstallation.

        :param deployment: Deployment defines the canary deployment.
        :param enable: Enable defines if a canary build will be deployed.

        schema:
        :schema:: ClusterInstallationSpecCanary
        """
        if isinstance(deployment, dict):
            deployment = ClusterInstallationSpecCanaryDeployment(**deployment)
        self._values = {}
        if deployment is not None:
            self._values["deployment"] = deployment
        if enable is not None:
            self._values["enable"] = enable

    @builtins.property
    def deployment(self) -> typing.Optional["ClusterInstallationSpecCanaryDeployment"]:
        """Deployment defines the canary deployment.

        schema:
        :schema:: ClusterInstallationSpecCanary#deployment
        """
        return self._values.get("deployment")

    @builtins.property
    def enable(self) -> typing.Optional[bool]:
        """Enable defines if a canary build will be deployed.

        schema:
        :schema:: ClusterInstallationSpecCanary#enable
        """
        return self._values.get("enable")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecCanary(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecCanaryDeployment",
    jsii_struct_bases=[],
    name_mapping={
        "image": "image",
        "ingress_name": "ingressName",
        "name": "name",
        "version": "version",
    },
)
class ClusterInstallationSpecCanaryDeployment:
    def __init__(
        self,
        *,
        image: typing.Optional[str] = None,
        ingress_name: typing.Optional[str] = None,
        name: typing.Optional[str] = None,
        version: typing.Optional[str] = None,
    ) -> None:
        """Deployment defines the canary deployment.

        :param image: Image defines the base Docker image that will be used for the deployment. Required when BlueGreen or Canary is enabled.
        :param ingress_name: IngressName defines the ingress name that will be used by the deployment. This option is not used for Canary builds.
        :param name: Name defines the name of the deployment.
        :param version: Version defines the Docker image version that will be used for the deployment. Required when BlueGreen or Canary is enabled.

        schema:
        :schema:: ClusterInstallationSpecCanaryDeployment
        """
        self._values = {}
        if image is not None:
            self._values["image"] = image
        if ingress_name is not None:
            self._values["ingress_name"] = ingress_name
        if name is not None:
            self._values["name"] = name
        if version is not None:
            self._values["version"] = version

    @builtins.property
    def image(self) -> typing.Optional[str]:
        """Image defines the base Docker image that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        schema:
        :schema:: ClusterInstallationSpecCanaryDeployment#image
        """
        return self._values.get("image")

    @builtins.property
    def ingress_name(self) -> typing.Optional[str]:
        """IngressName defines the ingress name that will be used by the deployment.

        This option is not used for Canary builds.

        schema:
        :schema:: ClusterInstallationSpecCanaryDeployment#ingressName
        """
        return self._values.get("ingress_name")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name defines the name of the deployment.

        schema:
        :schema:: ClusterInstallationSpecCanaryDeployment#name
        """
        return self._values.get("name")

    @builtins.property
    def version(self) -> typing.Optional[str]:
        """Version defines the Docker image version that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        schema:
        :schema:: ClusterInstallationSpecCanaryDeployment#version
        """
        return self._values.get("version")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecCanaryDeployment(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecDatabase",
    jsii_struct_bases=[],
    name_mapping={
        "backup_remote_delete_policy": "backupRemoteDeletePolicy",
        "backup_restore_secret_name": "backupRestoreSecretName",
        "backup_schedule": "backupSchedule",
        "backup_secret_name": "backupSecretName",
        "backup_url": "backupURL",
        "init_bucket_url": "initBucketURL",
        "replicas": "replicas",
        "resources": "resources",
        "secret": "secret",
        "storage_size": "storageSize",
        "type": "type",
    },
)
class ClusterInstallationSpecDatabase:
    def __init__(
        self,
        *,
        backup_remote_delete_policy: typing.Optional[str] = None,
        backup_restore_secret_name: typing.Optional[str] = None,
        backup_schedule: typing.Optional[str] = None,
        backup_secret_name: typing.Optional[str] = None,
        backup_url: typing.Optional[str] = None,
        init_bucket_url: typing.Optional[str] = None,
        replicas: typing.Optional[jsii.Number] = None,
        resources: typing.Optional["ClusterInstallationSpecDatabaseResources"] = None,
        secret: typing.Optional[str] = None,
        storage_size: typing.Optional[str] = None,
        type: typing.Optional[str] = None,
    ) -> None:
        """Database defines the database configuration for a ClusterInstallation.

        :param backup_remote_delete_policy: Defines the backup retention policy.
        :param backup_restore_secret_name: Defines the secret to be used when performing a database restore.
        :param backup_schedule: Defines the interval for backups in cron expression format.
        :param backup_secret_name: Defines the secret to be used for uploading/restoring backup.
        :param backup_url: Defines the object storage url for uploading backups.
        :param init_bucket_url: Defines the AWS S3 bucket where the Database Backup is stored. The operator will download the file to restore the data.
        :param replicas: Defines the number of database replicas. For redundancy use at least 2 replicas. Setting this will override the number of replicas set by 'Size'.
        :param resources: Defines the resource requests and limits for the database pods.
        :param secret: Optionally enter the name of an already-existing Secret for connecting to the database. This secret should be configured as follows: User-Managed Database - Key: DB_CONNECTION_STRING | Value: <FULL_DATABASE_CONNECTION_STRING> Operator-Managed Database - Key: ROOT_PASSWORD | Value: <ROOT_DATABASE_PASSWORD> - Key: USER | Value: <USER_NAME> - Key: PASSWORD | Value: <USER_PASSWORD> - Key: DATABASE Value: <DATABASE_NAME> Notes: If you define all secret values for both User-Managed and Operator-Managed database types, the User-Managed connection string will take precedence and the Operator-Managed values will be ignored. If the secret is left blank, the default behavior is to use an Operator-Managed database with strong randomly-generated database credentials.
        :param storage_size: Defines the storage size for the database. ie 50Gi
        :param type: 

        schema:
        :schema:: ClusterInstallationSpecDatabase
        """
        if isinstance(resources, dict):
            resources = ClusterInstallationSpecDatabaseResources(**resources)
        self._values = {}
        if backup_remote_delete_policy is not None:
            self._values["backup_remote_delete_policy"] = backup_remote_delete_policy
        if backup_restore_secret_name is not None:
            self._values["backup_restore_secret_name"] = backup_restore_secret_name
        if backup_schedule is not None:
            self._values["backup_schedule"] = backup_schedule
        if backup_secret_name is not None:
            self._values["backup_secret_name"] = backup_secret_name
        if backup_url is not None:
            self._values["backup_url"] = backup_url
        if init_bucket_url is not None:
            self._values["init_bucket_url"] = init_bucket_url
        if replicas is not None:
            self._values["replicas"] = replicas
        if resources is not None:
            self._values["resources"] = resources
        if secret is not None:
            self._values["secret"] = secret
        if storage_size is not None:
            self._values["storage_size"] = storage_size
        if type is not None:
            self._values["type"] = type

    @builtins.property
    def backup_remote_delete_policy(self) -> typing.Optional[str]:
        """Defines the backup retention policy.

        schema:
        :schema:: ClusterInstallationSpecDatabase#backupRemoteDeletePolicy
        """
        return self._values.get("backup_remote_delete_policy")

    @builtins.property
    def backup_restore_secret_name(self) -> typing.Optional[str]:
        """Defines the secret to be used when performing a database restore.

        schema:
        :schema:: ClusterInstallationSpecDatabase#backupRestoreSecretName
        """
        return self._values.get("backup_restore_secret_name")

    @builtins.property
    def backup_schedule(self) -> typing.Optional[str]:
        """Defines the interval for backups in cron expression format.

        schema:
        :schema:: ClusterInstallationSpecDatabase#backupSchedule
        """
        return self._values.get("backup_schedule")

    @builtins.property
    def backup_secret_name(self) -> typing.Optional[str]:
        """Defines the secret to be used for uploading/restoring backup.

        schema:
        :schema:: ClusterInstallationSpecDatabase#backupSecretName
        """
        return self._values.get("backup_secret_name")

    @builtins.property
    def backup_url(self) -> typing.Optional[str]:
        """Defines the object storage url for uploading backups.

        schema:
        :schema:: ClusterInstallationSpecDatabase#backupURL
        """
        return self._values.get("backup_url")

    @builtins.property
    def init_bucket_url(self) -> typing.Optional[str]:
        """Defines the AWS S3 bucket where the Database Backup is stored.

        The operator will download the file to restore the data.

        schema:
        :schema:: ClusterInstallationSpecDatabase#initBucketURL
        """
        return self._values.get("init_bucket_url")

    @builtins.property
    def replicas(self) -> typing.Optional[jsii.Number]:
        """Defines the number of database replicas.

        For redundancy use at least 2 replicas. Setting this will override the number of replicas set by 'Size'.

        schema:
        :schema:: ClusterInstallationSpecDatabase#replicas
        """
        return self._values.get("replicas")

    @builtins.property
    def resources(self) -> typing.Optional["ClusterInstallationSpecDatabaseResources"]:
        """Defines the resource requests and limits for the database pods.

        schema:
        :schema:: ClusterInstallationSpecDatabase#resources
        """
        return self._values.get("resources")

    @builtins.property
    def secret(self) -> typing.Optional[str]:
        """Optionally enter the name of an already-existing Secret for connecting to the database.

        This secret should be configured as follows:
        User-Managed Database   - Key: DB_CONNECTION_STRING | Value: <FULL_DATABASE_CONNECTION_STRING> Operator-Managed Database   - Key: ROOT_PASSWORD | Value: <ROOT_DATABASE_PASSWORD>   - Key: USER | Value: <USER_NAME>   - Key: PASSWORD | Value: <USER_PASSWORD>   - Key: DATABASE Value: <DATABASE_NAME>
        Notes:   If you define all secret values for both User-Managed and   Operator-Managed database types, the User-Managed connection string will   take precedence and the Operator-Managed values will be ignored. If the   secret is left blank, the default behavior is to use an Operator-Managed   database with strong randomly-generated database credentials.

        schema:
        :schema:: ClusterInstallationSpecDatabase#secret
        """
        return self._values.get("secret")

    @builtins.property
    def storage_size(self) -> typing.Optional[str]:
        """Defines the storage size for the database.

        ie 50Gi

        schema:
        :schema:: ClusterInstallationSpecDatabase#storageSize
        """
        return self._values.get("storage_size")

    @builtins.property
    def type(self) -> typing.Optional[str]:
        """
        schema:
        :schema:: ClusterInstallationSpecDatabase#type
        """
        return self._values.get("type")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecDatabase(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecDatabaseResources",
    jsii_struct_bases=[],
    name_mapping={"limits": "limits", "requests": "requests"},
)
class ClusterInstallationSpecDatabaseResources:
    def __init__(
        self,
        *,
        limits: typing.Optional[typing.Mapping[str, str]] = None,
        requests: typing.Optional[typing.Mapping[str, str]] = None,
    ) -> None:
        """Defines the resource requests and limits for the database pods.

        :param limits: Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
        :param requests: Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        schema:
        :schema:: ClusterInstallationSpecDatabaseResources
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
        :schema:: ClusterInstallationSpecDatabaseResources#limits
        """
        return self._values.get("limits")

    @builtins.property
    def requests(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Requests describes the minimum amount of compute resources required.

        If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        schema:
        :schema:: ClusterInstallationSpecDatabaseResources#requests
        """
        return self._values.get("requests")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecDatabaseResources(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecElasticSearch",
    jsii_struct_bases=[],
    name_mapping={"host": "host", "password": "password", "username": "username"},
)
class ClusterInstallationSpecElasticSearch:
    def __init__(
        self,
        *,
        host: typing.Optional[str] = None,
        password: typing.Optional[str] = None,
        username: typing.Optional[str] = None,
    ) -> None:
        """ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.

        :param host: 
        :param password: 
        :param username: 

        schema:
        :schema:: ClusterInstallationSpecElasticSearch
        """
        self._values = {}
        if host is not None:
            self._values["host"] = host
        if password is not None:
            self._values["password"] = password
        if username is not None:
            self._values["username"] = username

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """
        schema:
        :schema:: ClusterInstallationSpecElasticSearch#host
        """
        return self._values.get("host")

    @builtins.property
    def password(self) -> typing.Optional[str]:
        """
        schema:
        :schema:: ClusterInstallationSpecElasticSearch#password
        """
        return self._values.get("password")

    @builtins.property
    def username(self) -> typing.Optional[str]:
        """
        schema:
        :schema:: ClusterInstallationSpecElasticSearch#username
        """
        return self._values.get("username")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecElasticSearch(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecLivenessProbe",
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
class ClusterInstallationSpecLivenessProbe:
    def __init__(
        self,
        *,
        exec: typing.Optional["ClusterInstallationSpecLivenessProbeExec"] = None,
        failure_threshold: typing.Optional[jsii.Number] = None,
        http_get: typing.Optional["ClusterInstallationSpecLivenessProbeHttpGet"] = None,
        initial_delay_seconds: typing.Optional[jsii.Number] = None,
        period_seconds: typing.Optional[jsii.Number] = None,
        success_threshold: typing.Optional[jsii.Number] = None,
        tcp_socket: typing.Optional["ClusterInstallationSpecLivenessProbeTcpSocket"] = None,
        timeout_seconds: typing.Optional[jsii.Number] = None,
    ) -> None:
        """Defines the probe to check if the application is up and running.

        :param exec: One and only one of the following should be specified. Exec specifies the action to take.
        :param failure_threshold: Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Default: 3. Minimum value is 1.
        :param http_get: HTTPGet specifies the http request to perform.
        :param initial_delay_seconds: Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
        :param period_seconds: How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Default: 10 seconds. Minimum value is 1.
        :param success_threshold: Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Default: 1. Must be 1 for liveness and startup. Minimum value is 1.
        :param tcp_socket: TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
        :param timeout_seconds: Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes Default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: ClusterInstallationSpecLivenessProbe
        """
        if isinstance(exec, dict):
            exec = ClusterInstallationSpecLivenessProbeExec(**exec)
        if isinstance(http_get, dict):
            http_get = ClusterInstallationSpecLivenessProbeHttpGet(**http_get)
        if isinstance(tcp_socket, dict):
            tcp_socket = ClusterInstallationSpecLivenessProbeTcpSocket(**tcp_socket)
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
    def exec(self) -> typing.Optional["ClusterInstallationSpecLivenessProbeExec"]:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbe#exec
        """
        return self._values.get("exec")

    @builtins.property
    def failure_threshold(self) -> typing.Optional[jsii.Number]:
        """Minimum consecutive failures for the probe to be considered failed after having succeeded.

        Defaults to 3. Minimum value is 1.

        default
        :default: 3. Minimum value is 1.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbe#failureThreshold
        """
        return self._values.get("failure_threshold")

    @builtins.property
    def http_get(
        self,
    ) -> typing.Optional["ClusterInstallationSpecLivenessProbeHttpGet"]:
        """HTTPGet specifies the http request to perform.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbe#httpGet
        """
        return self._values.get("http_get")

    @builtins.property
    def initial_delay_seconds(self) -> typing.Optional[jsii.Number]:
        """Number of seconds after the container has started before liveness probes are initiated.

        More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: ClusterInstallationSpecLivenessProbe#initialDelaySeconds
        """
        return self._values.get("initial_delay_seconds")

    @builtins.property
    def period_seconds(self) -> typing.Optional[jsii.Number]:
        """How often (in seconds) to perform the probe.

        Default to 10 seconds. Minimum value is 1.

        default
        :default: 10 seconds. Minimum value is 1.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbe#periodSeconds
        """
        return self._values.get("period_seconds")

    @builtins.property
    def success_threshold(self) -> typing.Optional[jsii.Number]:
        """Minimum consecutive successes for the probe to be considered successful after having failed.

        Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.

        default
        :default: 1. Must be 1 for liveness and startup. Minimum value is 1.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbe#successThreshold
        """
        return self._values.get("success_threshold")

    @builtins.property
    def tcp_socket(
        self,
    ) -> typing.Optional["ClusterInstallationSpecLivenessProbeTcpSocket"]:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        schema:
        :schema:: ClusterInstallationSpecLivenessProbe#tcpSocket
        """
        return self._values.get("tcp_socket")

    @builtins.property
    def timeout_seconds(self) -> typing.Optional[jsii.Number]:
        """Number of seconds after which the probe times out.

        Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        default
        :default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: ClusterInstallationSpecLivenessProbe#timeoutSeconds
        """
        return self._values.get("timeout_seconds")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecLivenessProbe(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecLivenessProbeExec",
    jsii_struct_bases=[],
    name_mapping={"command": "command"},
)
class ClusterInstallationSpecLivenessProbeExec:
    def __init__(self, *, command: typing.Optional[typing.List[str]] = None) -> None:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        :param command: Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeExec
        """
        self._values = {}
        if command is not None:
            self._values["command"] = command

    @builtins.property
    def command(self) -> typing.Optional[typing.List[str]]:
        """Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.

        The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeExec#command
        """
        return self._values.get("command")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecLivenessProbeExec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecLivenessProbeHttpGet",
    jsii_struct_bases=[],
    name_mapping={
        "port": "port",
        "host": "host",
        "http_headers": "httpHeaders",
        "path": "path",
        "scheme": "scheme",
    },
)
class ClusterInstallationSpecLivenessProbeHttpGet:
    def __init__(
        self,
        *,
        port: "ClusterInstallationSpecLivenessProbeHttpGetPort",
        host: typing.Optional[str] = None,
        http_headers: typing.Optional[typing.List["ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders"]] = None,
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
        :schema:: ClusterInstallationSpecLivenessProbeHttpGet
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
    def port(self) -> "ClusterInstallationSpecLivenessProbeHttpGetPort":
        """Name or number of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeHttpGet#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Host name to connect to, defaults to the pod IP.

        You probably want to set "Host" in httpHeaders instead.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeHttpGet#host
        """
        return self._values.get("host")

    @builtins.property
    def http_headers(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders"]]:
        """Custom headers to set in the request.

        HTTP allows repeated headers.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeHttpGet#httpHeaders
        """
        return self._values.get("http_headers")

    @builtins.property
    def path(self) -> typing.Optional[str]:
        """Path to access on the HTTP server.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeHttpGet#path
        """
        return self._values.get("path")

    @builtins.property
    def scheme(self) -> typing.Optional[str]:
        """Scheme to use for connecting to the host.

        Defaults to HTTP.

        default
        :default: HTTP.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeHttpGet#scheme
        """
        return self._values.get("scheme")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecLivenessProbeHttpGet(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value"},
)
class ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders:
    def __init__(self, *, name: str, value: str) -> None:
        """HTTPHeader describes a custom header to be used in HTTP probes.

        :param name: The header field name.
        :param value: The header field value.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders
        """
        self._values = {
            "name": name,
            "value": value,
        }

    @builtins.property
    def name(self) -> str:
        """The header field name.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders#name
        """
        return self._values.get("name")

    @builtins.property
    def value(self) -> str:
        """The header field value.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders#value
        """
        return self._values.get("value")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ClusterInstallationSpecLivenessProbeHttpGetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetPort",
):
    """Name or number of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: ClusterInstallationSpecLivenessProbeHttpGetPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "ClusterInstallationSpecLivenessProbeHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "ClusterInstallationSpecLivenessProbeHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocket",
    jsii_struct_bases=[],
    name_mapping={"port": "port", "host": "host"},
)
class ClusterInstallationSpecLivenessProbeTcpSocket:
    def __init__(
        self,
        *,
        port: "ClusterInstallationSpecLivenessProbeTcpSocketPort",
        host: typing.Optional[str] = None,
    ) -> None:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        :param port: Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeTcpSocket
        """
        self._values = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host

    @builtins.property
    def port(self) -> "ClusterInstallationSpecLivenessProbeTcpSocketPort":
        """Number or name of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeTcpSocket#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: ClusterInstallationSpecLivenessProbeTcpSocket#host
        """
        return self._values.get("host")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecLivenessProbeTcpSocket(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ClusterInstallationSpecLivenessProbeTcpSocketPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocketPort",
):
    """Number or name of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: ClusterInstallationSpecLivenessProbeTcpSocketPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "ClusterInstallationSpecLivenessProbeTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "ClusterInstallationSpecLivenessProbeTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecMattermostEnv",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value", "value_from": "valueFrom"},
)
class ClusterInstallationSpecMattermostEnv:
    def __init__(
        self,
        *,
        name: str,
        value: typing.Optional[str] = None,
        value_from: typing.Optional["ClusterInstallationSpecMattermostEnvValueFrom"] = None,
    ) -> None:
        """EnvVar represents an environment variable present in a Container.

        :param name: Name of the environment variable. Must be a C_IDENTIFIER.
        :param value: Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "". Default: .
        :param value_from: Source for the environment variable's value. Cannot be used if value is not empty.

        schema:
        :schema:: ClusterInstallationSpecMattermostEnv
        """
        if isinstance(value_from, dict):
            value_from = ClusterInstallationSpecMattermostEnvValueFrom(**value_from)
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
        :schema:: ClusterInstallationSpecMattermostEnv#name
        """
        return self._values.get("name")

    @builtins.property
    def value(self) -> typing.Optional[str]:
        """Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.

        If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".

        default
        :default: .

        schema:
        :schema:: ClusterInstallationSpecMattermostEnv#value
        """
        return self._values.get("value")

    @builtins.property
    def value_from(
        self,
    ) -> typing.Optional["ClusterInstallationSpecMattermostEnvValueFrom"]:
        """Source for the environment variable's value.

        Cannot be used if value is not empty.

        schema:
        :schema:: ClusterInstallationSpecMattermostEnv#valueFrom
        """
        return self._values.get("value_from")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnv(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom",
    jsii_struct_bases=[],
    name_mapping={
        "config_map_key_ref": "configMapKeyRef",
        "field_ref": "fieldRef",
        "resource_field_ref": "resourceFieldRef",
        "secret_key_ref": "secretKeyRef",
    },
)
class ClusterInstallationSpecMattermostEnvValueFrom:
    def __init__(
        self,
        *,
        config_map_key_ref: typing.Optional["ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef"] = None,
        field_ref: typing.Optional["ClusterInstallationSpecMattermostEnvValueFromFieldRef"] = None,
        resource_field_ref: typing.Optional["ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef"] = None,
        secret_key_ref: typing.Optional["ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef"] = None,
    ) -> None:
        """Source for the environment variable's value.

        Cannot be used if value is not empty.

        :param config_map_key_ref: Selects a key of a ConfigMap.
        :param field_ref: Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
        :param resource_field_ref: Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
        :param secret_key_ref: Selects a key of a secret in the pod's namespace.

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFrom
        """
        if isinstance(config_map_key_ref, dict):
            config_map_key_ref = ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef(**config_map_key_ref)
        if isinstance(field_ref, dict):
            field_ref = ClusterInstallationSpecMattermostEnvValueFromFieldRef(**field_ref)
        if isinstance(resource_field_ref, dict):
            resource_field_ref = ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef(**resource_field_ref)
        if isinstance(secret_key_ref, dict):
            secret_key_ref = ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef(**secret_key_ref)
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
    ) -> typing.Optional["ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef"]:
        """Selects a key of a ConfigMap.

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFrom#configMapKeyRef
        """
        return self._values.get("config_map_key_ref")

    @builtins.property
    def field_ref(
        self,
    ) -> typing.Optional["ClusterInstallationSpecMattermostEnvValueFromFieldRef"]:
        """Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFrom#fieldRef
        """
        return self._values.get("field_ref")

    @builtins.property
    def resource_field_ref(
        self,
    ) -> typing.Optional["ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef"]:
        """Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFrom#resourceFieldRef
        """
        return self._values.get("resource_field_ref")

    @builtins.property
    def secret_key_ref(
        self,
    ) -> typing.Optional["ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef"]:
        """Selects a key of a secret in the pod's namespace.

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFrom#secretKeyRef
        """
        return self._values.get("secret_key_ref")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnvValueFrom(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "name": "name", "optional": "optional"},
)
class ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef:
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
        :schema:: ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef
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
        :schema:: ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef#key
        """
        return self._values.get("key")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef#name
        """
        return self._values.get("name")

    @builtins.property
    def optional(self) -> typing.Optional[bool]:
        """Specify whether the ConfigMap or its key must be defined.

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef#optional
        """
        return self._values.get("optional")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecMattermostEnvValueFromFieldRef",
    jsii_struct_bases=[],
    name_mapping={"field_path": "fieldPath", "api_version": "apiVersion"},
)
class ClusterInstallationSpecMattermostEnvValueFromFieldRef:
    def __init__(
        self, *, field_path: str, api_version: typing.Optional[str] = None
    ) -> None:
        """Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.

        :param field_path: Path of the field to select in the specified API version.
        :param api_version: Version of the schema the FieldPath is written in terms of, defaults to "v1".

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFromFieldRef
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
        :schema:: ClusterInstallationSpecMattermostEnvValueFromFieldRef#fieldPath
        """
        return self._values.get("field_path")

    @builtins.property
    def api_version(self) -> typing.Optional[str]:
        """Version of the schema the FieldPath is written in terms of, defaults to "v1".

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFromFieldRef#apiVersion
        """
        return self._values.get("api_version")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnvValueFromFieldRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef",
    jsii_struct_bases=[],
    name_mapping={
        "resource": "resource",
        "container_name": "containerName",
        "divisor": "divisor",
    },
)
class ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef:
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
        :schema:: ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef
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
        :schema:: ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef#resource
        """
        return self._values.get("resource")

    @builtins.property
    def container_name(self) -> typing.Optional[str]:
        """Container name: required for volumes, optional for env vars.

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef#containerName
        """
        return self._values.get("container_name")

    @builtins.property
    def divisor(self) -> typing.Optional[str]:
        """Specifies the output format of the exposed resources, defaults to "1".

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef#divisor
        """
        return self._values.get("divisor")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "name": "name", "optional": "optional"},
)
class ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef:
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
        :schema:: ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef
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
        :schema:: ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef#key
        """
        return self._values.get("key")

    @builtins.property
    def name(self) -> typing.Optional[str]:
        """Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef#name
        """
        return self._values.get("name")

    @builtins.property
    def optional(self) -> typing.Optional[bool]:
        """Specify whether the Secret or its key must be defined.

        schema:
        :schema:: ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef#optional
        """
        return self._values.get("optional")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecMinio",
    jsii_struct_bases=[],
    name_mapping={
        "external_bucket": "externalBucket",
        "external_url": "externalURL",
        "replicas": "replicas",
        "resources": "resources",
        "secret": "secret",
        "storage_size": "storageSize",
    },
)
class ClusterInstallationSpecMinio:
    def __init__(
        self,
        *,
        external_bucket: typing.Optional[str] = None,
        external_url: typing.Optional[str] = None,
        replicas: typing.Optional[jsii.Number] = None,
        resources: typing.Optional["ClusterInstallationSpecMinioResources"] = None,
        secret: typing.Optional[str] = None,
        storage_size: typing.Optional[str] = None,
    ) -> None:
        """Minio defines the configuration of Minio for a ClusterInstallation.

        :param external_bucket: Set to the bucket name of your external MinIO or S3.
        :param external_url: Set to use an external MinIO deployment or S3. Must also set 'Secret' and 'ExternalBucket'.
        :param replicas: Defines the number of Minio replicas. Supply 1 to run Minio in standalone mode with no redundancy. Supply 4 or more to run Minio in distributed mode. Note that it is not possible to upgrade Minio from standalone to distributed mode. Setting this will override the number of replicas set by 'Size'. More info: https://docs.min.io/docs/distributed-minio-quickstart-guide.html
        :param resources: Defines the resource requests and limits for the Minio pods.
        :param secret: Optionally enter the name of already existing secret. Secret should have two values: "accesskey" and "secretkey". Required when "ExternalURL" is set.
        :param storage_size: Defines the storage size for Minio. ie 50Gi

        schema:
        :schema:: ClusterInstallationSpecMinio
        """
        if isinstance(resources, dict):
            resources = ClusterInstallationSpecMinioResources(**resources)
        self._values = {}
        if external_bucket is not None:
            self._values["external_bucket"] = external_bucket
        if external_url is not None:
            self._values["external_url"] = external_url
        if replicas is not None:
            self._values["replicas"] = replicas
        if resources is not None:
            self._values["resources"] = resources
        if secret is not None:
            self._values["secret"] = secret
        if storage_size is not None:
            self._values["storage_size"] = storage_size

    @builtins.property
    def external_bucket(self) -> typing.Optional[str]:
        """Set to the bucket name of your external MinIO or S3.

        schema:
        :schema:: ClusterInstallationSpecMinio#externalBucket
        """
        return self._values.get("external_bucket")

    @builtins.property
    def external_url(self) -> typing.Optional[str]:
        """Set to use an external MinIO deployment or S3.

        Must also set 'Secret' and 'ExternalBucket'.

        schema:
        :schema:: ClusterInstallationSpecMinio#externalURL
        """
        return self._values.get("external_url")

    @builtins.property
    def replicas(self) -> typing.Optional[jsii.Number]:
        """Defines the number of Minio replicas.

        Supply 1 to run Minio in standalone mode with no redundancy. Supply 4 or more to run Minio in distributed mode. Note that it is not possible to upgrade Minio from standalone to distributed mode. Setting this will override the number of replicas set by 'Size'. More info: https://docs.min.io/docs/distributed-minio-quickstart-guide.html

        schema:
        :schema:: ClusterInstallationSpecMinio#replicas
        """
        return self._values.get("replicas")

    @builtins.property
    def resources(self) -> typing.Optional["ClusterInstallationSpecMinioResources"]:
        """Defines the resource requests and limits for the Minio pods.

        schema:
        :schema:: ClusterInstallationSpecMinio#resources
        """
        return self._values.get("resources")

    @builtins.property
    def secret(self) -> typing.Optional[str]:
        """Optionally enter the name of already existing secret.

        Secret should have two values: "accesskey" and "secretkey". Required when "ExternalURL" is set.

        schema:
        :schema:: ClusterInstallationSpecMinio#secret
        """
        return self._values.get("secret")

    @builtins.property
    def storage_size(self) -> typing.Optional[str]:
        """Defines the storage size for Minio.

        ie 50Gi

        schema:
        :schema:: ClusterInstallationSpecMinio#storageSize
        """
        return self._values.get("storage_size")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMinio(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecMinioResources",
    jsii_struct_bases=[],
    name_mapping={"limits": "limits", "requests": "requests"},
)
class ClusterInstallationSpecMinioResources:
    def __init__(
        self,
        *,
        limits: typing.Optional[typing.Mapping[str, str]] = None,
        requests: typing.Optional[typing.Mapping[str, str]] = None,
    ) -> None:
        """Defines the resource requests and limits for the Minio pods.

        :param limits: Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
        :param requests: Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        schema:
        :schema:: ClusterInstallationSpecMinioResources
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
        :schema:: ClusterInstallationSpecMinioResources#limits
        """
        return self._values.get("limits")

    @builtins.property
    def requests(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Requests describes the minimum amount of compute resources required.

        If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        schema:
        :schema:: ClusterInstallationSpecMinioResources#requests
        """
        return self._values.get("requests")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMinioResources(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecReadinessProbe",
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
class ClusterInstallationSpecReadinessProbe:
    def __init__(
        self,
        *,
        exec: typing.Optional["ClusterInstallationSpecReadinessProbeExec"] = None,
        failure_threshold: typing.Optional[jsii.Number] = None,
        http_get: typing.Optional["ClusterInstallationSpecReadinessProbeHttpGet"] = None,
        initial_delay_seconds: typing.Optional[jsii.Number] = None,
        period_seconds: typing.Optional[jsii.Number] = None,
        success_threshold: typing.Optional[jsii.Number] = None,
        tcp_socket: typing.Optional["ClusterInstallationSpecReadinessProbeTcpSocket"] = None,
        timeout_seconds: typing.Optional[jsii.Number] = None,
    ) -> None:
        """Defines the probe to check if the application is ready to accept traffic.

        :param exec: One and only one of the following should be specified. Exec specifies the action to take.
        :param failure_threshold: Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Default: 3. Minimum value is 1.
        :param http_get: HTTPGet specifies the http request to perform.
        :param initial_delay_seconds: Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
        :param period_seconds: How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Default: 10 seconds. Minimum value is 1.
        :param success_threshold: Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Default: 1. Must be 1 for liveness and startup. Minimum value is 1.
        :param tcp_socket: TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
        :param timeout_seconds: Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes Default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: ClusterInstallationSpecReadinessProbe
        """
        if isinstance(exec, dict):
            exec = ClusterInstallationSpecReadinessProbeExec(**exec)
        if isinstance(http_get, dict):
            http_get = ClusterInstallationSpecReadinessProbeHttpGet(**http_get)
        if isinstance(tcp_socket, dict):
            tcp_socket = ClusterInstallationSpecReadinessProbeTcpSocket(**tcp_socket)
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
    def exec(self) -> typing.Optional["ClusterInstallationSpecReadinessProbeExec"]:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbe#exec
        """
        return self._values.get("exec")

    @builtins.property
    def failure_threshold(self) -> typing.Optional[jsii.Number]:
        """Minimum consecutive failures for the probe to be considered failed after having succeeded.

        Defaults to 3. Minimum value is 1.

        default
        :default: 3. Minimum value is 1.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbe#failureThreshold
        """
        return self._values.get("failure_threshold")

    @builtins.property
    def http_get(
        self,
    ) -> typing.Optional["ClusterInstallationSpecReadinessProbeHttpGet"]:
        """HTTPGet specifies the http request to perform.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbe#httpGet
        """
        return self._values.get("http_get")

    @builtins.property
    def initial_delay_seconds(self) -> typing.Optional[jsii.Number]:
        """Number of seconds after the container has started before liveness probes are initiated.

        More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: ClusterInstallationSpecReadinessProbe#initialDelaySeconds
        """
        return self._values.get("initial_delay_seconds")

    @builtins.property
    def period_seconds(self) -> typing.Optional[jsii.Number]:
        """How often (in seconds) to perform the probe.

        Default to 10 seconds. Minimum value is 1.

        default
        :default: 10 seconds. Minimum value is 1.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbe#periodSeconds
        """
        return self._values.get("period_seconds")

    @builtins.property
    def success_threshold(self) -> typing.Optional[jsii.Number]:
        """Minimum consecutive successes for the probe to be considered successful after having failed.

        Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.

        default
        :default: 1. Must be 1 for liveness and startup. Minimum value is 1.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbe#successThreshold
        """
        return self._values.get("success_threshold")

    @builtins.property
    def tcp_socket(
        self,
    ) -> typing.Optional["ClusterInstallationSpecReadinessProbeTcpSocket"]:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        schema:
        :schema:: ClusterInstallationSpecReadinessProbe#tcpSocket
        """
        return self._values.get("tcp_socket")

    @builtins.property
    def timeout_seconds(self) -> typing.Optional[jsii.Number]:
        """Number of seconds after which the probe times out.

        Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        default
        :default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        schema:
        :schema:: ClusterInstallationSpecReadinessProbe#timeoutSeconds
        """
        return self._values.get("timeout_seconds")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecReadinessProbe(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecReadinessProbeExec",
    jsii_struct_bases=[],
    name_mapping={"command": "command"},
)
class ClusterInstallationSpecReadinessProbeExec:
    def __init__(self, *, command: typing.Optional[typing.List[str]] = None) -> None:
        """One and only one of the following should be specified.

        Exec specifies the action to take.

        :param command: Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeExec
        """
        self._values = {}
        if command is not None:
            self._values["command"] = command

    @builtins.property
    def command(self) -> typing.Optional[typing.List[str]]:
        """Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.

        The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeExec#command
        """
        return self._values.get("command")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecReadinessProbeExec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecReadinessProbeHttpGet",
    jsii_struct_bases=[],
    name_mapping={
        "port": "port",
        "host": "host",
        "http_headers": "httpHeaders",
        "path": "path",
        "scheme": "scheme",
    },
)
class ClusterInstallationSpecReadinessProbeHttpGet:
    def __init__(
        self,
        *,
        port: "ClusterInstallationSpecReadinessProbeHttpGetPort",
        host: typing.Optional[str] = None,
        http_headers: typing.Optional[typing.List["ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders"]] = None,
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
        :schema:: ClusterInstallationSpecReadinessProbeHttpGet
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
    def port(self) -> "ClusterInstallationSpecReadinessProbeHttpGetPort":
        """Name or number of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeHttpGet#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Host name to connect to, defaults to the pod IP.

        You probably want to set "Host" in httpHeaders instead.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeHttpGet#host
        """
        return self._values.get("host")

    @builtins.property
    def http_headers(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders"]]:
        """Custom headers to set in the request.

        HTTP allows repeated headers.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeHttpGet#httpHeaders
        """
        return self._values.get("http_headers")

    @builtins.property
    def path(self) -> typing.Optional[str]:
        """Path to access on the HTTP server.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeHttpGet#path
        """
        return self._values.get("path")

    @builtins.property
    def scheme(self) -> typing.Optional[str]:
        """Scheme to use for connecting to the host.

        Defaults to HTTP.

        default
        :default: HTTP.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeHttpGet#scheme
        """
        return self._values.get("scheme")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecReadinessProbeHttpGet(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value"},
)
class ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders:
    def __init__(self, *, name: str, value: str) -> None:
        """HTTPHeader describes a custom header to be used in HTTP probes.

        :param name: The header field name.
        :param value: The header field value.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders
        """
        self._values = {
            "name": name,
            "value": value,
        }

    @builtins.property
    def name(self) -> str:
        """The header field name.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders#name
        """
        return self._values.get("name")

    @builtins.property
    def value(self) -> str:
        """The header field value.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders#value
        """
        return self._values.get("value")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ClusterInstallationSpecReadinessProbeHttpGetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecReadinessProbeHttpGetPort",
):
    """Name or number of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: ClusterInstallationSpecReadinessProbeHttpGetPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "ClusterInstallationSpecReadinessProbeHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "ClusterInstallationSpecReadinessProbeHttpGetPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecReadinessProbeTcpSocket",
    jsii_struct_bases=[],
    name_mapping={"port": "port", "host": "host"},
)
class ClusterInstallationSpecReadinessProbeTcpSocket:
    def __init__(
        self,
        *,
        port: "ClusterInstallationSpecReadinessProbeTcpSocketPort",
        host: typing.Optional[str] = None,
    ) -> None:
        """TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        :param port: Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeTcpSocket
        """
        self._values = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host

    @builtins.property
    def port(self) -> "ClusterInstallationSpecReadinessProbeTcpSocketPort":
        """Number or name of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeTcpSocket#port
        """
        return self._values.get("port")

    @builtins.property
    def host(self) -> typing.Optional[str]:
        """Optional: Host name to connect to, defaults to the pod IP.

        schema:
        :schema:: ClusterInstallationSpecReadinessProbeTcpSocket#host
        """
        return self._values.get("host")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecReadinessProbeTcpSocket(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ClusterInstallationSpecReadinessProbeTcpSocketPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecReadinessProbeTcpSocketPort",
):
    """Number or name of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    schema:
    :schema:: ClusterInstallationSpecReadinessProbeTcpSocketPort
    """

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls, value: jsii.Number
    ) -> "ClusterInstallationSpecReadinessProbeTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromNumber", [value])

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls, value: str
    ) -> "ClusterInstallationSpecReadinessProbeTcpSocketPort":
        """
        :param value: -
        """
        return jsii.sinvoke(cls, "fromString", [value])


@jsii.data_type(
    jsii_type="mattermostcomclusterinstallation.ClusterInstallationSpecResources",
    jsii_struct_bases=[],
    name_mapping={"limits": "limits", "requests": "requests"},
)
class ClusterInstallationSpecResources:
    def __init__(
        self,
        *,
        limits: typing.Optional[typing.Mapping[str, str]] = None,
        requests: typing.Optional[typing.Mapping[str, str]] = None,
    ) -> None:
        """Defines the resource requests and limits for the Mattermost app server pods.

        :param limits: Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
        :param requests: Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        schema:
        :schema:: ClusterInstallationSpecResources
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
        :schema:: ClusterInstallationSpecResources#limits
        """
        return self._values.get("limits")

    @builtins.property
    def requests(self) -> typing.Optional[typing.Mapping[str, str]]:
        """Requests describes the minimum amount of compute resources required.

        If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        schema:
        :schema:: ClusterInstallationSpecResources#requests
        """
        return self._values.get("requests")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecResources(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


__all__ = [
    "ClusterInstallation",
    "ClusterInstallationOptions",
    "ClusterInstallationSpec",
    "ClusterInstallationSpecAffinity",
    "ClusterInstallationSpecAffinityNodeAffinity",
    "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution",
    "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference",
    "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions",
    "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields",
    "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution",
    "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms",
    "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions",
    "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields",
    "ClusterInstallationSpecAffinityPodAffinity",
    "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution",
    "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
    "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector",
    "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions",
    "ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution",
    "ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector",
    "ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions",
    "ClusterInstallationSpecAffinityPodAntiAffinity",
    "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution",
    "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
    "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector",
    "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions",
    "ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution",
    "ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector",
    "ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions",
    "ClusterInstallationSpecBlueGreen",
    "ClusterInstallationSpecBlueGreenBlue",
    "ClusterInstallationSpecBlueGreenGreen",
    "ClusterInstallationSpecCanary",
    "ClusterInstallationSpecCanaryDeployment",
    "ClusterInstallationSpecDatabase",
    "ClusterInstallationSpecDatabaseResources",
    "ClusterInstallationSpecElasticSearch",
    "ClusterInstallationSpecLivenessProbe",
    "ClusterInstallationSpecLivenessProbeExec",
    "ClusterInstallationSpecLivenessProbeHttpGet",
    "ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders",
    "ClusterInstallationSpecLivenessProbeHttpGetPort",
    "ClusterInstallationSpecLivenessProbeTcpSocket",
    "ClusterInstallationSpecLivenessProbeTcpSocketPort",
    "ClusterInstallationSpecMattermostEnv",
    "ClusterInstallationSpecMattermostEnvValueFrom",
    "ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef",
    "ClusterInstallationSpecMattermostEnvValueFromFieldRef",
    "ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef",
    "ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef",
    "ClusterInstallationSpecMinio",
    "ClusterInstallationSpecMinioResources",
    "ClusterInstallationSpecReadinessProbe",
    "ClusterInstallationSpecReadinessProbeExec",
    "ClusterInstallationSpecReadinessProbeHttpGet",
    "ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders",
    "ClusterInstallationSpecReadinessProbeHttpGetPort",
    "ClusterInstallationSpecReadinessProbeTcpSocket",
    "ClusterInstallationSpecReadinessProbeTcpSocketPort",
    "ClusterInstallationSpecResources",
]

publication.publish()
