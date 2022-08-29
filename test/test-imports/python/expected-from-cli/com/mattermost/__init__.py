import abc
import builtins
import datetime
import enum
import typing

import jsii
import publication
import typing_extensions

from typeguard import check_type

from ._jsii import *

import cdk8s
import constructs


class ClusterInstallation(
    cdk8s.ApiObject,
    metaclass=jsii.JSIIMeta,
    jsii_type="commattermost.ClusterInstallation",
):
    '''ClusterInstallation is the Schema for the clusterinstallations API.

    :schema: ClusterInstallation
    '''

    def __init__(
        self,
        scope: constructs.Construct,
        id: builtins.str,
        *,
        spec: typing.Union["ClusterInstallationSpec", typing.Dict[str, typing.Any]],
        metadata: typing.Optional[typing.Union[cdk8s.ApiObjectMetadata, typing.Dict[str, typing.Any]]] = None,
    ) -> None:
        '''Defines a "ClusterInstallation" API object.

        :param scope: the scope in which to define this object.
        :param id: a scope-local name for the object.
        :param spec: Specification of the desired behavior of the Mattermost cluster. More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
        :param metadata: 
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallation.__init__)
            check_type(argname="argument scope", value=scope, expected_type=type_hints["scope"])
            check_type(argname="argument id", value=id, expected_type=type_hints["id"])
        props = ClusterInstallationProps(spec=spec, metadata=metadata)

        jsii.create(self.__class__, self, [scope, id, props])

    @jsii.member(jsii_name="manifest")
    @builtins.classmethod
    def manifest(
        cls,
        *,
        spec: typing.Union["ClusterInstallationSpec", typing.Dict[str, typing.Any]],
        metadata: typing.Optional[typing.Union[cdk8s.ApiObjectMetadata, typing.Dict[str, typing.Any]]] = None,
    ) -> typing.Any:
        '''Renders a Kubernetes manifest for "ClusterInstallation".

        This can be used to inline resource manifests inside other objects (e.g. as templates).

        :param spec: Specification of the desired behavior of the Mattermost cluster. More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
        :param metadata: 
        '''
        props = ClusterInstallationProps(spec=spec, metadata=metadata)

        return typing.cast(typing.Any, jsii.sinvoke(cls, "manifest", [props]))

    @jsii.member(jsii_name="toJson")
    def to_json(self) -> typing.Any:
        '''Renders the object to Kubernetes JSON.'''
        return typing.cast(typing.Any, jsii.invoke(self, "toJson", []))

    @jsii.python.classproperty
    @jsii.member(jsii_name="GVK")
    def GVK(cls) -> cdk8s.GroupVersionKind:
        '''Returns the apiVersion and kind for "ClusterInstallation".'''
        return typing.cast(cdk8s.GroupVersionKind, jsii.sget(cls, "GVK"))


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationProps",
    jsii_struct_bases=[],
    name_mapping={"spec": "spec", "metadata": "metadata"},
)
class ClusterInstallationProps:
    def __init__(
        self,
        *,
        spec: typing.Union["ClusterInstallationSpec", typing.Dict[str, typing.Any]],
        metadata: typing.Optional[typing.Union[cdk8s.ApiObjectMetadata, typing.Dict[str, typing.Any]]] = None,
    ) -> None:
        '''ClusterInstallation is the Schema for the clusterinstallations API.

        :param spec: Specification of the desired behavior of the Mattermost cluster. More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
        :param metadata: 

        :schema: ClusterInstallation
        '''
        if isinstance(spec, dict):
            spec = ClusterInstallationSpec(**spec)
        if isinstance(metadata, dict):
            metadata = ApiObjectMetadata(**metadata)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationProps.__init__)
            check_type(argname="argument spec", value=spec, expected_type=type_hints["spec"])
            check_type(argname="argument metadata", value=metadata, expected_type=type_hints["metadata"])
        self._values: typing.Dict[str, typing.Any] = {
            "spec": spec,
        }
        if metadata is not None:
            self._values["metadata"] = metadata

    @builtins.property
    def spec(self) -> "ClusterInstallationSpec":
        '''Specification of the desired behavior of the Mattermost cluster.

        More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status

        :schema: ClusterInstallation#spec
        '''
        result = self._values.get("spec")
        assert result is not None, "Required property 'spec' is missing"
        return typing.cast("ClusterInstallationSpec", result)

    @builtins.property
    def metadata(self) -> typing.Optional[cdk8s.ApiObjectMetadata]:
        '''
        :schema: ClusterInstallation#metadata
        '''
        result = self._values.get("metadata")
        return typing.cast(typing.Optional[cdk8s.ApiObjectMetadata], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationProps(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpec",
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
        ingress_name: builtins.str,
        affinity: typing.Optional[typing.Union["ClusterInstallationSpecAffinity", typing.Dict[str, typing.Any]]] = None,
        blue_green: typing.Optional[typing.Union["ClusterInstallationSpecBlueGreen", typing.Dict[str, typing.Any]]] = None,
        canary: typing.Optional[typing.Union["ClusterInstallationSpecCanary", typing.Dict[str, typing.Any]]] = None,
        database: typing.Optional[typing.Union["ClusterInstallationSpecDatabase", typing.Dict[str, typing.Any]]] = None,
        elastic_search: typing.Optional[typing.Union["ClusterInstallationSpecElasticSearch", typing.Dict[str, typing.Any]]] = None,
        image: typing.Optional[builtins.str] = None,
        ingress_annotations: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        liveness_probe: typing.Optional[typing.Union["ClusterInstallationSpecLivenessProbe", typing.Dict[str, typing.Any]]] = None,
        mattermost_env: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecMattermostEnv", typing.Dict[str, typing.Any]]]] = None,
        mattermost_license_secret: typing.Optional[builtins.str] = None,
        minio: typing.Optional[typing.Union["ClusterInstallationSpecMinio", typing.Dict[str, typing.Any]]] = None,
        node_selector: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        readiness_probe: typing.Optional[typing.Union["ClusterInstallationSpecReadinessProbe", typing.Dict[str, typing.Any]]] = None,
        replicas: typing.Optional[jsii.Number] = None,
        resources: typing.Optional[typing.Union["ClusterInstallationSpecResources", typing.Dict[str, typing.Any]]] = None,
        service_annotations: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        size: typing.Optional[builtins.str] = None,
        use_service_load_balancer: typing.Optional[builtins.bool] = None,
        version: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Specification of the desired behavior of the Mattermost cluster.

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

        :schema: ClusterInstallationSpec
        '''
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
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpec.__init__)
            check_type(argname="argument ingress_name", value=ingress_name, expected_type=type_hints["ingress_name"])
            check_type(argname="argument affinity", value=affinity, expected_type=type_hints["affinity"])
            check_type(argname="argument blue_green", value=blue_green, expected_type=type_hints["blue_green"])
            check_type(argname="argument canary", value=canary, expected_type=type_hints["canary"])
            check_type(argname="argument database", value=database, expected_type=type_hints["database"])
            check_type(argname="argument elastic_search", value=elastic_search, expected_type=type_hints["elastic_search"])
            check_type(argname="argument image", value=image, expected_type=type_hints["image"])
            check_type(argname="argument ingress_annotations", value=ingress_annotations, expected_type=type_hints["ingress_annotations"])
            check_type(argname="argument liveness_probe", value=liveness_probe, expected_type=type_hints["liveness_probe"])
            check_type(argname="argument mattermost_env", value=mattermost_env, expected_type=type_hints["mattermost_env"])
            check_type(argname="argument mattermost_license_secret", value=mattermost_license_secret, expected_type=type_hints["mattermost_license_secret"])
            check_type(argname="argument minio", value=minio, expected_type=type_hints["minio"])
            check_type(argname="argument node_selector", value=node_selector, expected_type=type_hints["node_selector"])
            check_type(argname="argument readiness_probe", value=readiness_probe, expected_type=type_hints["readiness_probe"])
            check_type(argname="argument replicas", value=replicas, expected_type=type_hints["replicas"])
            check_type(argname="argument resources", value=resources, expected_type=type_hints["resources"])
            check_type(argname="argument service_annotations", value=service_annotations, expected_type=type_hints["service_annotations"])
            check_type(argname="argument size", value=size, expected_type=type_hints["size"])
            check_type(argname="argument use_service_load_balancer", value=use_service_load_balancer, expected_type=type_hints["use_service_load_balancer"])
            check_type(argname="argument version", value=version, expected_type=type_hints["version"])
        self._values: typing.Dict[str, typing.Any] = {
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
    def ingress_name(self) -> builtins.str:
        '''IngressName defines the name to be used when creating the ingress rules.

        :schema: ClusterInstallationSpec#ingressName
        '''
        result = self._values.get("ingress_name")
        assert result is not None, "Required property 'ingress_name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def affinity(self) -> typing.Optional["ClusterInstallationSpecAffinity"]:
        '''If specified, affinity will define the pod's scheduling constraints.

        :schema: ClusterInstallationSpec#affinity
        '''
        result = self._values.get("affinity")
        return typing.cast(typing.Optional["ClusterInstallationSpecAffinity"], result)

    @builtins.property
    def blue_green(self) -> typing.Optional["ClusterInstallationSpecBlueGreen"]:
        '''BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.

        :schema: ClusterInstallationSpec#blueGreen
        '''
        result = self._values.get("blue_green")
        return typing.cast(typing.Optional["ClusterInstallationSpecBlueGreen"], result)

    @builtins.property
    def canary(self) -> typing.Optional["ClusterInstallationSpecCanary"]:
        '''Canary defines the configuration of Canary deployment for a ClusterInstallation.

        :schema: ClusterInstallationSpec#canary
        '''
        result = self._values.get("canary")
        return typing.cast(typing.Optional["ClusterInstallationSpecCanary"], result)

    @builtins.property
    def database(self) -> typing.Optional["ClusterInstallationSpecDatabase"]:
        '''Database defines the database configuration for a ClusterInstallation.

        :schema: ClusterInstallationSpec#database
        '''
        result = self._values.get("database")
        return typing.cast(typing.Optional["ClusterInstallationSpecDatabase"], result)

    @builtins.property
    def elastic_search(self) -> typing.Optional["ClusterInstallationSpecElasticSearch"]:
        '''ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.

        :schema: ClusterInstallationSpec#elasticSearch
        '''
        result = self._values.get("elastic_search")
        return typing.cast(typing.Optional["ClusterInstallationSpecElasticSearch"], result)

    @builtins.property
    def image(self) -> typing.Optional[builtins.str]:
        '''Image defines the ClusterInstallation Docker image.

        :schema: ClusterInstallationSpec#image
        '''
        result = self._values.get("image")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def ingress_annotations(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''
        :schema: ClusterInstallationSpec#ingressAnnotations
        '''
        result = self._values.get("ingress_annotations")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def liveness_probe(self) -> typing.Optional["ClusterInstallationSpecLivenessProbe"]:
        '''Defines the probe to check if the application is up and running.

        :schema: ClusterInstallationSpec#livenessProbe
        '''
        result = self._values.get("liveness_probe")
        return typing.cast(typing.Optional["ClusterInstallationSpecLivenessProbe"], result)

    @builtins.property
    def mattermost_env(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecMattermostEnv"]]:
        '''Optional environment variables to set in the Mattermost application pods.

        :schema: ClusterInstallationSpec#mattermostEnv
        '''
        result = self._values.get("mattermost_env")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecMattermostEnv"]], result)

    @builtins.property
    def mattermost_license_secret(self) -> typing.Optional[builtins.str]:
        '''Secret that contains the mattermost license.

        :schema: ClusterInstallationSpec#mattermostLicenseSecret
        '''
        result = self._values.get("mattermost_license_secret")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def minio(self) -> typing.Optional["ClusterInstallationSpecMinio"]:
        '''Minio defines the configuration of Minio for a ClusterInstallation.

        :schema: ClusterInstallationSpec#minio
        '''
        result = self._values.get("minio")
        return typing.cast(typing.Optional["ClusterInstallationSpecMinio"], result)

    @builtins.property
    def node_selector(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''NodeSelector is a selector which must be true for the pod to fit on a node.

        Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/

        :schema: ClusterInstallationSpec#nodeSelector
        '''
        result = self._values.get("node_selector")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def readiness_probe(
        self,
    ) -> typing.Optional["ClusterInstallationSpecReadinessProbe"]:
        '''Defines the probe to check if the application is ready to accept traffic.

        :schema: ClusterInstallationSpec#readinessProbe
        '''
        result = self._values.get("readiness_probe")
        return typing.cast(typing.Optional["ClusterInstallationSpecReadinessProbe"], result)

    @builtins.property
    def replicas(self) -> typing.Optional[jsii.Number]:
        '''Replicas defines the number of replicas to use for the Mattermost app servers.

        Setting this will override the number of replicas set by 'Size'.

        :schema: ClusterInstallationSpec#replicas
        '''
        result = self._values.get("replicas")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def resources(self) -> typing.Optional["ClusterInstallationSpecResources"]:
        '''Defines the resource requests and limits for the Mattermost app server pods.

        :schema: ClusterInstallationSpec#resources
        '''
        result = self._values.get("resources")
        return typing.cast(typing.Optional["ClusterInstallationSpecResources"], result)

    @builtins.property
    def service_annotations(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''
        :schema: ClusterInstallationSpec#serviceAnnotations
        '''
        result = self._values.get("service_annotations")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def size(self) -> typing.Optional[builtins.str]:
        '''Size defines the size of the ClusterInstallation.

        This is typically specified in number of users. This will set replica and resource requests/limits appropriately for the provided number of users. Accepted values are: 100users, 1000users, 5000users, 10000users, 250000users. Defaults to 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size.

        :default: 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size.

        :schema: ClusterInstallationSpec#size
        '''
        result = self._values.get("size")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def use_service_load_balancer(self) -> typing.Optional[builtins.bool]:
        '''
        :schema: ClusterInstallationSpec#useServiceLoadBalancer
        '''
        result = self._values.get("use_service_load_balancer")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def version(self) -> typing.Optional[builtins.str]:
        '''Version defines the ClusterInstallation Docker image version.

        :schema: ClusterInstallationSpec#version
        '''
        result = self._values.get("version")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinity",
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
        node_affinity: typing.Optional[typing.Union["ClusterInstallationSpecAffinityNodeAffinity", typing.Dict[str, typing.Any]]] = None,
        pod_affinity: typing.Optional[typing.Union["ClusterInstallationSpecAffinityPodAffinity", typing.Dict[str, typing.Any]]] = None,
        pod_anti_affinity: typing.Optional[typing.Union["ClusterInstallationSpecAffinityPodAntiAffinity", typing.Dict[str, typing.Any]]] = None,
    ) -> None:
        '''If specified, affinity will define the pod's scheduling constraints.

        :param node_affinity: Describes node affinity scheduling rules for the pod.
        :param pod_affinity: Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
        :param pod_anti_affinity: Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).

        :schema: ClusterInstallationSpecAffinity
        '''
        if isinstance(node_affinity, dict):
            node_affinity = ClusterInstallationSpecAffinityNodeAffinity(**node_affinity)
        if isinstance(pod_affinity, dict):
            pod_affinity = ClusterInstallationSpecAffinityPodAffinity(**pod_affinity)
        if isinstance(pod_anti_affinity, dict):
            pod_anti_affinity = ClusterInstallationSpecAffinityPodAntiAffinity(**pod_anti_affinity)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinity.__init__)
            check_type(argname="argument node_affinity", value=node_affinity, expected_type=type_hints["node_affinity"])
            check_type(argname="argument pod_affinity", value=pod_affinity, expected_type=type_hints["pod_affinity"])
            check_type(argname="argument pod_anti_affinity", value=pod_anti_affinity, expected_type=type_hints["pod_anti_affinity"])
        self._values: typing.Dict[str, typing.Any] = {}
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
        '''Describes node affinity scheduling rules for the pod.

        :schema: ClusterInstallationSpecAffinity#nodeAffinity
        '''
        result = self._values.get("node_affinity")
        return typing.cast(typing.Optional["ClusterInstallationSpecAffinityNodeAffinity"], result)

    @builtins.property
    def pod_affinity(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAffinity"]:
        '''Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).

        :schema: ClusterInstallationSpecAffinity#podAffinity
        '''
        result = self._values.get("pod_affinity")
        return typing.cast(typing.Optional["ClusterInstallationSpecAffinityPodAffinity"], result)

    @builtins.property
    def pod_anti_affinity(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinity"]:
        '''Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).

        :schema: ClusterInstallationSpecAffinity#podAntiAffinity
        '''
        result = self._values.get("pod_anti_affinity")
        return typing.cast(typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinity"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinity(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityNodeAffinity",
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
        preferred_during_scheduling_ignored_during_execution: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution", typing.Dict[str, typing.Any]]]] = None,
        required_during_scheduling_ignored_during_execution: typing.Optional[typing.Union["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution", typing.Dict[str, typing.Any]]] = None,
    ) -> None:
        '''Describes node affinity scheduling rules for the pod.

        :param preferred_during_scheduling_ignored_during_execution: The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
        :param required_during_scheduling_ignored_during_execution: If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.

        :schema: ClusterInstallationSpecAffinityNodeAffinity
        '''
        if isinstance(required_during_scheduling_ignored_during_execution, dict):
            required_during_scheduling_ignored_during_execution = ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(**required_during_scheduling_ignored_during_execution)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityNodeAffinity.__init__)
            check_type(argname="argument preferred_during_scheduling_ignored_during_execution", value=preferred_during_scheduling_ignored_during_execution, expected_type=type_hints["preferred_during_scheduling_ignored_during_execution"])
            check_type(argname="argument required_during_scheduling_ignored_during_execution", value=required_during_scheduling_ignored_during_execution, expected_type=type_hints["required_during_scheduling_ignored_during_execution"])
        self._values: typing.Dict[str, typing.Any] = {}
        if preferred_during_scheduling_ignored_during_execution is not None:
            self._values["preferred_during_scheduling_ignored_during_execution"] = preferred_during_scheduling_ignored_during_execution
        if required_during_scheduling_ignored_during_execution is not None:
            self._values["required_during_scheduling_ignored_during_execution"] = required_during_scheduling_ignored_during_execution

    @builtins.property
    def preferred_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution"]]:
        '''The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.

        The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.

        :schema: ClusterInstallationSpecAffinityNodeAffinity#preferredDuringSchedulingIgnoredDuringExecution
        '''
        result = self._values.get("preferred_during_scheduling_ignored_during_execution")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution"]], result)

    @builtins.property
    def required_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution"]:
        '''If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.

        If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.

        :schema: ClusterInstallationSpecAffinityNodeAffinity#requiredDuringSchedulingIgnoredDuringExecution
        '''
        result = self._values.get("required_during_scheduling_ignored_during_execution")
        return typing.cast(typing.Optional["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinity(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution",
    jsii_struct_bases=[],
    name_mapping={"preference": "preference", "weight": "weight"},
)
class ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution:
    def __init__(
        self,
        *,
        preference: typing.Union["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference", typing.Dict[str, typing.Any]],
        weight: jsii.Number,
    ) -> None:
        '''An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).

        :param preference: A node selector term, associated with the corresponding weight.
        :param weight: Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution
        '''
        if isinstance(preference, dict):
            preference = ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference(**preference)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution.__init__)
            check_type(argname="argument preference", value=preference, expected_type=type_hints["preference"])
            check_type(argname="argument weight", value=weight, expected_type=type_hints["weight"])
        self._values: typing.Dict[str, typing.Any] = {
            "preference": preference,
            "weight": weight,
        }

    @builtins.property
    def preference(
        self,
    ) -> "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference":
        '''A node selector term, associated with the corresponding weight.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution#preference
        '''
        result = self._values.get("preference")
        assert result is not None, "Required property 'preference' is missing"
        return typing.cast("ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference", result)

    @builtins.property
    def weight(self) -> jsii.Number:
        '''Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution#weight
        '''
        result = self._values.get("weight")
        assert result is not None, "Required property 'weight' is missing"
        return typing.cast(jsii.Number, result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference",
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
        match_expressions: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions", typing.Dict[str, typing.Any]]]] = None,
        match_fields: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields", typing.Dict[str, typing.Any]]]] = None,
    ) -> None:
        '''A node selector term, associated with the corresponding weight.

        :param match_expressions: A list of node selector requirements by node's labels.
        :param match_fields: A list of node selector requirements by node's fields.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference.__init__)
            check_type(argname="argument match_expressions", value=match_expressions, expected_type=type_hints["match_expressions"])
            check_type(argname="argument match_fields", value=match_fields, expected_type=type_hints["match_fields"])
        self._values: typing.Dict[str, typing.Any] = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_fields is not None:
            self._values["match_fields"] = match_fields

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions"]]:
        '''A list of node selector requirements by node's labels.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference#matchExpressions
        '''
        result = self._values.get("match_expressions")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions"]], result)

    @builtins.property
    def match_fields(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields"]]:
        '''A list of node selector requirements by node's fields.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference#matchFields
        '''
        result = self._values.get("match_fields")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions:
    def __init__(
        self,
        *,
        key: builtins.str,
        operator: builtins.str,
        values: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: The label key that the selector applies to.
        :param operator: Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
        :param values: An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions.__init__)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument operator", value=operator, expected_type=type_hints["operator"])
            check_type(argname="argument values", value=values, expected_type=type_hints["values"])
        self._values: typing.Dict[str, typing.Any] = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> builtins.str:
        '''The label key that the selector applies to.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def operator(self) -> builtins.str:
        '''Represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions#operator
        '''
        result = self._values.get("operator")
        assert result is not None, "Required property 'operator' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def values(self) -> typing.Optional[typing.List[builtins.str]]:
        '''An array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions#values
        '''
        result = self._values.get("values")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields:
    def __init__(
        self,
        *,
        key: builtins.str,
        operator: builtins.str,
        values: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: The label key that the selector applies to.
        :param operator: Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
        :param values: An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields.__init__)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument operator", value=operator, expected_type=type_hints["operator"])
            check_type(argname="argument values", value=values, expected_type=type_hints["values"])
        self._values: typing.Dict[str, typing.Any] = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> builtins.str:
        '''The label key that the selector applies to.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def operator(self) -> builtins.str:
        '''Represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields#operator
        '''
        result = self._values.get("operator")
        assert result is not None, "Required property 'operator' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def values(self) -> typing.Optional[typing.List[builtins.str]]:
        '''An array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields#values
        '''
        result = self._values.get("values")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution",
    jsii_struct_bases=[],
    name_mapping={"node_selector_terms": "nodeSelectorTerms"},
)
class ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution:
    def __init__(
        self,
        *,
        node_selector_terms: typing.Sequence[typing.Union["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms", typing.Dict[str, typing.Any]]],
    ) -> None:
        '''If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.

        If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.

        :param node_selector_terms: Required. A list of node selector terms. The terms are ORed.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution.__init__)
            check_type(argname="argument node_selector_terms", value=node_selector_terms, expected_type=type_hints["node_selector_terms"])
        self._values: typing.Dict[str, typing.Any] = {
            "node_selector_terms": node_selector_terms,
        }

    @builtins.property
    def node_selector_terms(
        self,
    ) -> typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms"]:
        '''Required.

        A list of node selector terms. The terms are ORed.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution#nodeSelectorTerms
        '''
        result = self._values.get("node_selector_terms")
        assert result is not None, "Required property 'node_selector_terms' is missing"
        return typing.cast(typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms",
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
        match_expressions: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions", typing.Dict[str, typing.Any]]]] = None,
        match_fields: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields", typing.Dict[str, typing.Any]]]] = None,
    ) -> None:
        '''A null or empty node selector term matches no objects.

        The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.

        :param match_expressions: A list of node selector requirements by node's labels.
        :param match_fields: A list of node selector requirements by node's fields.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms.__init__)
            check_type(argname="argument match_expressions", value=match_expressions, expected_type=type_hints["match_expressions"])
            check_type(argname="argument match_fields", value=match_fields, expected_type=type_hints["match_fields"])
        self._values: typing.Dict[str, typing.Any] = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_fields is not None:
            self._values["match_fields"] = match_fields

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions"]]:
        '''A list of node selector requirements by node's labels.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms#matchExpressions
        '''
        result = self._values.get("match_expressions")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions"]], result)

    @builtins.property
    def match_fields(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields"]]:
        '''A list of node selector requirements by node's fields.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms#matchFields
        '''
        result = self._values.get("match_fields")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions:
    def __init__(
        self,
        *,
        key: builtins.str,
        operator: builtins.str,
        values: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: The label key that the selector applies to.
        :param operator: Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
        :param values: An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions.__init__)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument operator", value=operator, expected_type=type_hints["operator"])
            check_type(argname="argument values", value=values, expected_type=type_hints["values"])
        self._values: typing.Dict[str, typing.Any] = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> builtins.str:
        '''The label key that the selector applies to.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def operator(self) -> builtins.str:
        '''Represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions#operator
        '''
        result = self._values.get("operator")
        assert result is not None, "Required property 'operator' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def values(self) -> typing.Optional[typing.List[builtins.str]]:
        '''An array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions#values
        '''
        result = self._values.get("values")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields:
    def __init__(
        self,
        *,
        key: builtins.str,
        operator: builtins.str,
        values: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: The label key that the selector applies to.
        :param operator: Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
        :param values: An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields.__init__)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument operator", value=operator, expected_type=type_hints["operator"])
            check_type(argname="argument values", value=values, expected_type=type_hints["values"])
        self._values: typing.Dict[str, typing.Any] = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> builtins.str:
        '''The label key that the selector applies to.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def operator(self) -> builtins.str:
        '''Represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields#operator
        '''
        result = self._values.get("operator")
        assert result is not None, "Required property 'operator' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def values(self) -> typing.Optional[typing.List[builtins.str]]:
        '''An array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields#values
        '''
        result = self._values.get("values")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAffinity",
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
        preferred_during_scheduling_ignored_during_execution: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution", typing.Dict[str, typing.Any]]]] = None,
        required_during_scheduling_ignored_during_execution: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution", typing.Dict[str, typing.Any]]]] = None,
    ) -> None:
        '''Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).

        :param preferred_during_scheduling_ignored_during_execution: The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
        :param required_during_scheduling_ignored_during_execution: If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.

        :schema: ClusterInstallationSpecAffinityPodAffinity
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAffinity.__init__)
            check_type(argname="argument preferred_during_scheduling_ignored_during_execution", value=preferred_during_scheduling_ignored_during_execution, expected_type=type_hints["preferred_during_scheduling_ignored_during_execution"])
            check_type(argname="argument required_during_scheduling_ignored_during_execution", value=required_during_scheduling_ignored_during_execution, expected_type=type_hints["required_during_scheduling_ignored_during_execution"])
        self._values: typing.Dict[str, typing.Any] = {}
        if preferred_during_scheduling_ignored_during_execution is not None:
            self._values["preferred_during_scheduling_ignored_during_execution"] = preferred_during_scheduling_ignored_during_execution
        if required_during_scheduling_ignored_during_execution is not None:
            self._values["required_during_scheduling_ignored_during_execution"] = required_during_scheduling_ignored_during_execution

    @builtins.property
    def preferred_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution"]]:
        '''The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.

        The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.

        :schema: ClusterInstallationSpecAffinityPodAffinity#preferredDuringSchedulingIgnoredDuringExecution
        '''
        result = self._values.get("preferred_during_scheduling_ignored_during_execution")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution"]], result)

    @builtins.property
    def required_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution"]]:
        '''If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.

        If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.

        :schema: ClusterInstallationSpecAffinityPodAffinity#requiredDuringSchedulingIgnoredDuringExecution
        '''
        result = self._values.get("required_during_scheduling_ignored_during_execution")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinity(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution",
    jsii_struct_bases=[],
    name_mapping={"pod_affinity_term": "podAffinityTerm", "weight": "weight"},
)
class ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution:
    def __init__(
        self,
        *,
        pod_affinity_term: typing.Union["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm", typing.Dict[str, typing.Any]],
        weight: jsii.Number,
    ) -> None:
        '''The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s).

        :param pod_affinity_term: Required. A pod affinity term, associated with the corresponding weight.
        :param weight: weight associated with matching the corresponding podAffinityTerm, in the range 1-100.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution
        '''
        if isinstance(pod_affinity_term, dict):
            pod_affinity_term = ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm(**pod_affinity_term)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution.__init__)
            check_type(argname="argument pod_affinity_term", value=pod_affinity_term, expected_type=type_hints["pod_affinity_term"])
            check_type(argname="argument weight", value=weight, expected_type=type_hints["weight"])
        self._values: typing.Dict[str, typing.Any] = {
            "pod_affinity_term": pod_affinity_term,
            "weight": weight,
        }

    @builtins.property
    def pod_affinity_term(
        self,
    ) -> "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm":
        '''Required.

        A pod affinity term, associated with the corresponding weight.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution#podAffinityTerm
        '''
        result = self._values.get("pod_affinity_term")
        assert result is not None, "Required property 'pod_affinity_term' is missing"
        return typing.cast("ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm", result)

    @builtins.property
    def weight(self) -> jsii.Number:
        '''weight associated with matching the corresponding podAffinityTerm, in the range 1-100.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution#weight
        '''
        result = self._values.get("weight")
        assert result is not None, "Required property 'weight' is missing"
        return typing.cast(jsii.Number, result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
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
        topology_key: builtins.str,
        label_selector: typing.Optional[typing.Union["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector", typing.Dict[str, typing.Any]]] = None,
        namespaces: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''Required.

        A pod affinity term, associated with the corresponding weight.

        :param topology_key: This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
        :param label_selector: A label query over a set of resources, in this case pods.
        :param namespaces: namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm
        '''
        if isinstance(label_selector, dict):
            label_selector = ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector(**label_selector)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.__init__)
            check_type(argname="argument topology_key", value=topology_key, expected_type=type_hints["topology_key"])
            check_type(argname="argument label_selector", value=label_selector, expected_type=type_hints["label_selector"])
            check_type(argname="argument namespaces", value=namespaces, expected_type=type_hints["namespaces"])
        self._values: typing.Dict[str, typing.Any] = {
            "topology_key": topology_key,
        }
        if label_selector is not None:
            self._values["label_selector"] = label_selector
        if namespaces is not None:
            self._values["namespaces"] = namespaces

    @builtins.property
    def topology_key(self) -> builtins.str:
        '''This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.

        Empty topologyKey is not allowed.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#topologyKey
        '''
        result = self._values.get("topology_key")
        assert result is not None, "Required property 'topology_key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def label_selector(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector"]:
        '''A label query over a set of resources, in this case pods.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#labelSelector
        '''
        result = self._values.get("label_selector")
        return typing.cast(typing.Optional["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector"], result)

    @builtins.property
    def namespaces(self) -> typing.Optional[typing.List[builtins.str]]:
        '''namespaces specifies which namespaces the labelSelector applies to (matches against);

        null or empty list means "this pod's namespace"

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#namespaces
        '''
        result = self._values.get("namespaces")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector",
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
        match_expressions: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions", typing.Dict[str, typing.Any]]]] = None,
        match_labels: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    ) -> None:
        '''A label query over a set of resources, in this case pods.

        :param match_expressions: matchExpressions is a list of label selector requirements. The requirements are ANDed.
        :param match_labels: matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector.__init__)
            check_type(argname="argument match_expressions", value=match_expressions, expected_type=type_hints["match_expressions"])
            check_type(argname="argument match_labels", value=match_labels, expected_type=type_hints["match_labels"])
        self._values: typing.Dict[str, typing.Any] = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_labels is not None:
            self._values["match_labels"] = match_labels

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions"]]:
        '''matchExpressions is a list of label selector requirements.

        The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector#matchExpressions
        '''
        result = self._values.get("match_expressions")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions"]], result)

    @builtins.property
    def match_labels(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''matchLabels is a map of {key,value} pairs.

        A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector#matchLabels
        '''
        result = self._values.get("match_labels")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions:
    def __init__(
        self,
        *,
        key: builtins.str,
        operator: builtins.str,
        values: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: key is the label key that the selector applies to.
        :param operator: operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        :param values: values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions.__init__)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument operator", value=operator, expected_type=type_hints["operator"])
            check_type(argname="argument values", value=values, expected_type=type_hints["values"])
        self._values: typing.Dict[str, typing.Any] = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> builtins.str:
        '''key is the label key that the selector applies to.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def operator(self) -> builtins.str:
        '''operator represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists and DoesNotExist.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#operator
        '''
        result = self._values.get("operator")
        assert result is not None, "Required property 'operator' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def values(self) -> typing.Optional[typing.List[builtins.str]]:
        '''values is an array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#values
        '''
        result = self._values.get("values")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution",
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
        topology_key: builtins.str,
        label_selector: typing.Optional[typing.Union["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector", typing.Dict[str, typing.Any]]] = None,
        namespaces: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key  matches that of any node on which a pod of the set of pods is running.

        :param topology_key: This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
        :param label_selector: A label query over a set of resources, in this case pods.
        :param namespaces: namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution
        '''
        if isinstance(label_selector, dict):
            label_selector = ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector(**label_selector)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution.__init__)
            check_type(argname="argument topology_key", value=topology_key, expected_type=type_hints["topology_key"])
            check_type(argname="argument label_selector", value=label_selector, expected_type=type_hints["label_selector"])
            check_type(argname="argument namespaces", value=namespaces, expected_type=type_hints["namespaces"])
        self._values: typing.Dict[str, typing.Any] = {
            "topology_key": topology_key,
        }
        if label_selector is not None:
            self._values["label_selector"] = label_selector
        if namespaces is not None:
            self._values["namespaces"] = namespaces

    @builtins.property
    def topology_key(self) -> builtins.str:
        '''This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.

        Empty topologyKey is not allowed.

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution#topologyKey
        '''
        result = self._values.get("topology_key")
        assert result is not None, "Required property 'topology_key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def label_selector(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector"]:
        '''A label query over a set of resources, in this case pods.

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution#labelSelector
        '''
        result = self._values.get("label_selector")
        return typing.cast(typing.Optional["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector"], result)

    @builtins.property
    def namespaces(self) -> typing.Optional[typing.List[builtins.str]]:
        '''namespaces specifies which namespaces the labelSelector applies to (matches against);

        null or empty list means "this pod's namespace"

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution#namespaces
        '''
        result = self._values.get("namespaces")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector",
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
        match_expressions: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions", typing.Dict[str, typing.Any]]]] = None,
        match_labels: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    ) -> None:
        '''A label query over a set of resources, in this case pods.

        :param match_expressions: matchExpressions is a list of label selector requirements. The requirements are ANDed.
        :param match_labels: matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector.__init__)
            check_type(argname="argument match_expressions", value=match_expressions, expected_type=type_hints["match_expressions"])
            check_type(argname="argument match_labels", value=match_labels, expected_type=type_hints["match_labels"])
        self._values: typing.Dict[str, typing.Any] = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_labels is not None:
            self._values["match_labels"] = match_labels

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions"]]:
        '''matchExpressions is a list of label selector requirements.

        The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector#matchExpressions
        '''
        result = self._values.get("match_expressions")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions"]], result)

    @builtins.property
    def match_labels(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''matchLabels is a map of {key,value} pairs.

        A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector#matchLabels
        '''
        result = self._values.get("match_labels")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions:
    def __init__(
        self,
        *,
        key: builtins.str,
        operator: builtins.str,
        values: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: key is the label key that the selector applies to.
        :param operator: operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        :param values: values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions.__init__)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument operator", value=operator, expected_type=type_hints["operator"])
            check_type(argname="argument values", value=values, expected_type=type_hints["values"])
        self._values: typing.Dict[str, typing.Any] = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> builtins.str:
        '''key is the label key that the selector applies to.

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def operator(self) -> builtins.str:
        '''operator represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists and DoesNotExist.

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#operator
        '''
        result = self._values.get("operator")
        assert result is not None, "Required property 'operator' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def values(self) -> typing.Optional[typing.List[builtins.str]]:
        '''values is an array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#values
        '''
        result = self._values.get("values")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAntiAffinity",
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
        preferred_during_scheduling_ignored_during_execution: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution", typing.Dict[str, typing.Any]]]] = None,
        required_during_scheduling_ignored_during_execution: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution", typing.Dict[str, typing.Any]]]] = None,
    ) -> None:
        '''Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).

        :param preferred_during_scheduling_ignored_during_execution: The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
        :param required_during_scheduling_ignored_during_execution: If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinity
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAntiAffinity.__init__)
            check_type(argname="argument preferred_during_scheduling_ignored_during_execution", value=preferred_during_scheduling_ignored_during_execution, expected_type=type_hints["preferred_during_scheduling_ignored_during_execution"])
            check_type(argname="argument required_during_scheduling_ignored_during_execution", value=required_during_scheduling_ignored_during_execution, expected_type=type_hints["required_during_scheduling_ignored_during_execution"])
        self._values: typing.Dict[str, typing.Any] = {}
        if preferred_during_scheduling_ignored_during_execution is not None:
            self._values["preferred_during_scheduling_ignored_during_execution"] = preferred_during_scheduling_ignored_during_execution
        if required_during_scheduling_ignored_during_execution is not None:
            self._values["required_during_scheduling_ignored_during_execution"] = required_during_scheduling_ignored_during_execution

    @builtins.property
    def preferred_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution"]]:
        '''The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.

        The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinity#preferredDuringSchedulingIgnoredDuringExecution
        '''
        result = self._values.get("preferred_during_scheduling_ignored_during_execution")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution"]], result)

    @builtins.property
    def required_during_scheduling_ignored_during_execution(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution"]]:
        '''If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.

        If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinity#requiredDuringSchedulingIgnoredDuringExecution
        '''
        result = self._values.get("required_during_scheduling_ignored_during_execution")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution"]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinity(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution",
    jsii_struct_bases=[],
    name_mapping={"pod_affinity_term": "podAffinityTerm", "weight": "weight"},
)
class ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution:
    def __init__(
        self,
        *,
        pod_affinity_term: typing.Union["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm", typing.Dict[str, typing.Any]],
        weight: jsii.Number,
    ) -> None:
        '''The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s).

        :param pod_affinity_term: Required. A pod affinity term, associated with the corresponding weight.
        :param weight: weight associated with matching the corresponding podAffinityTerm, in the range 1-100.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution
        '''
        if isinstance(pod_affinity_term, dict):
            pod_affinity_term = ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm(**pod_affinity_term)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution.__init__)
            check_type(argname="argument pod_affinity_term", value=pod_affinity_term, expected_type=type_hints["pod_affinity_term"])
            check_type(argname="argument weight", value=weight, expected_type=type_hints["weight"])
        self._values: typing.Dict[str, typing.Any] = {
            "pod_affinity_term": pod_affinity_term,
            "weight": weight,
        }

    @builtins.property
    def pod_affinity_term(
        self,
    ) -> "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm":
        '''Required.

        A pod affinity term, associated with the corresponding weight.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution#podAffinityTerm
        '''
        result = self._values.get("pod_affinity_term")
        assert result is not None, "Required property 'pod_affinity_term' is missing"
        return typing.cast("ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm", result)

    @builtins.property
    def weight(self) -> jsii.Number:
        '''weight associated with matching the corresponding podAffinityTerm, in the range 1-100.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution#weight
        '''
        result = self._values.get("weight")
        assert result is not None, "Required property 'weight' is missing"
        return typing.cast(jsii.Number, result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm",
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
        topology_key: builtins.str,
        label_selector: typing.Optional[typing.Union["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector", typing.Dict[str, typing.Any]]] = None,
        namespaces: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''Required.

        A pod affinity term, associated with the corresponding weight.

        :param topology_key: This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
        :param label_selector: A label query over a set of resources, in this case pods.
        :param namespaces: namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm
        '''
        if isinstance(label_selector, dict):
            label_selector = ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector(**label_selector)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.__init__)
            check_type(argname="argument topology_key", value=topology_key, expected_type=type_hints["topology_key"])
            check_type(argname="argument label_selector", value=label_selector, expected_type=type_hints["label_selector"])
            check_type(argname="argument namespaces", value=namespaces, expected_type=type_hints["namespaces"])
        self._values: typing.Dict[str, typing.Any] = {
            "topology_key": topology_key,
        }
        if label_selector is not None:
            self._values["label_selector"] = label_selector
        if namespaces is not None:
            self._values["namespaces"] = namespaces

    @builtins.property
    def topology_key(self) -> builtins.str:
        '''This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.

        Empty topologyKey is not allowed.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#topologyKey
        '''
        result = self._values.get("topology_key")
        assert result is not None, "Required property 'topology_key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def label_selector(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector"]:
        '''A label query over a set of resources, in this case pods.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#labelSelector
        '''
        result = self._values.get("label_selector")
        return typing.cast(typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector"], result)

    @builtins.property
    def namespaces(self) -> typing.Optional[typing.List[builtins.str]]:
        '''namespaces specifies which namespaces the labelSelector applies to (matches against);

        null or empty list means "this pod's namespace"

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#namespaces
        '''
        result = self._values.get("namespaces")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector",
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
        match_expressions: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions", typing.Dict[str, typing.Any]]]] = None,
        match_labels: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    ) -> None:
        '''A label query over a set of resources, in this case pods.

        :param match_expressions: matchExpressions is a list of label selector requirements. The requirements are ANDed.
        :param match_labels: matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector.__init__)
            check_type(argname="argument match_expressions", value=match_expressions, expected_type=type_hints["match_expressions"])
            check_type(argname="argument match_labels", value=match_labels, expected_type=type_hints["match_labels"])
        self._values: typing.Dict[str, typing.Any] = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_labels is not None:
            self._values["match_labels"] = match_labels

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions"]]:
        '''matchExpressions is a list of label selector requirements.

        The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector#matchExpressions
        '''
        result = self._values.get("match_expressions")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions"]], result)

    @builtins.property
    def match_labels(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''matchLabels is a map of {key,value} pairs.

        A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector#matchLabels
        '''
        result = self._values.get("match_labels")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions:
    def __init__(
        self,
        *,
        key: builtins.str,
        operator: builtins.str,
        values: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: key is the label key that the selector applies to.
        :param operator: operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        :param values: values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions.__init__)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument operator", value=operator, expected_type=type_hints["operator"])
            check_type(argname="argument values", value=values, expected_type=type_hints["values"])
        self._values: typing.Dict[str, typing.Any] = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> builtins.str:
        '''key is the label key that the selector applies to.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def operator(self) -> builtins.str:
        '''operator represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists and DoesNotExist.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#operator
        '''
        result = self._values.get("operator")
        assert result is not None, "Required property 'operator' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def values(self) -> typing.Optional[typing.List[builtins.str]]:
        '''values is an array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions#values
        '''
        result = self._values.get("values")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelectorMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution",
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
        topology_key: builtins.str,
        label_selector: typing.Optional[typing.Union["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector", typing.Dict[str, typing.Any]]] = None,
        namespaces: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key  matches that of any node on which a pod of the set of pods is running.

        :param topology_key: This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
        :param label_selector: A label query over a set of resources, in this case pods.
        :param namespaces: namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means "this pod's namespace"

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution
        '''
        if isinstance(label_selector, dict):
            label_selector = ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector(**label_selector)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution.__init__)
            check_type(argname="argument topology_key", value=topology_key, expected_type=type_hints["topology_key"])
            check_type(argname="argument label_selector", value=label_selector, expected_type=type_hints["label_selector"])
            check_type(argname="argument namespaces", value=namespaces, expected_type=type_hints["namespaces"])
        self._values: typing.Dict[str, typing.Any] = {
            "topology_key": topology_key,
        }
        if label_selector is not None:
            self._values["label_selector"] = label_selector
        if namespaces is not None:
            self._values["namespaces"] = namespaces

    @builtins.property
    def topology_key(self) -> builtins.str:
        '''This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.

        Empty topologyKey is not allowed.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution#topologyKey
        '''
        result = self._values.get("topology_key")
        assert result is not None, "Required property 'topology_key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def label_selector(
        self,
    ) -> typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector"]:
        '''A label query over a set of resources, in this case pods.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution#labelSelector
        '''
        result = self._values.get("label_selector")
        return typing.cast(typing.Optional["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector"], result)

    @builtins.property
    def namespaces(self) -> typing.Optional[typing.List[builtins.str]]:
        '''namespaces specifies which namespaces the labelSelector applies to (matches against);

        null or empty list means "this pod's namespace"

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution#namespaces
        '''
        result = self._values.get("namespaces")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector",
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
        match_expressions: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions", typing.Dict[str, typing.Any]]]] = None,
        match_labels: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    ) -> None:
        '''A label query over a set of resources, in this case pods.

        :param match_expressions: matchExpressions is a list of label selector requirements. The requirements are ANDed.
        :param match_labels: matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector.__init__)
            check_type(argname="argument match_expressions", value=match_expressions, expected_type=type_hints["match_expressions"])
            check_type(argname="argument match_labels", value=match_labels, expected_type=type_hints["match_labels"])
        self._values: typing.Dict[str, typing.Any] = {}
        if match_expressions is not None:
            self._values["match_expressions"] = match_expressions
        if match_labels is not None:
            self._values["match_labels"] = match_labels

    @builtins.property
    def match_expressions(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions"]]:
        '''matchExpressions is a list of label selector requirements.

        The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector#matchExpressions
        '''
        result = self._values.get("match_expressions")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions"]], result)

    @builtins.property
    def match_labels(
        self,
    ) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''matchLabels is a map of {key,value} pairs.

        A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector#matchLabels
        '''
        result = self._values.get("match_labels")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "operator": "operator", "values": "values"},
)
class ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions:
    def __init__(
        self,
        *,
        key: builtins.str,
        operator: builtins.str,
        values: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.

        :param key: key is the label key that the selector applies to.
        :param operator: operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
        :param values: values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions.__init__)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument operator", value=operator, expected_type=type_hints["operator"])
            check_type(argname="argument values", value=values, expected_type=type_hints["values"])
        self._values: typing.Dict[str, typing.Any] = {
            "key": key,
            "operator": operator,
        }
        if values is not None:
            self._values["values"] = values

    @builtins.property
    def key(self) -> builtins.str:
        '''key is the label key that the selector applies to.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def operator(self) -> builtins.str:
        '''operator represents a key's relationship to a set of values.

        Valid operators are In, NotIn, Exists and DoesNotExist.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#operator
        '''
        result = self._values.get("operator")
        assert result is not None, "Required property 'operator' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def values(self) -> typing.Optional[typing.List[builtins.str]]:
        '''values is an array of string values.

        If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.

        :schema: ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions#values
        '''
        result = self._values.get("values")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelectorMatchExpressions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecBlueGreen",
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
        blue: typing.Optional[typing.Union["ClusterInstallationSpecBlueGreenBlue", typing.Dict[str, typing.Any]]] = None,
        enable: typing.Optional[builtins.bool] = None,
        green: typing.Optional[typing.Union["ClusterInstallationSpecBlueGreenGreen", typing.Dict[str, typing.Any]]] = None,
        production_deployment: typing.Optional[builtins.str] = None,
    ) -> None:
        '''BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.

        :param blue: Blue defines the blue deployment.
        :param enable: Enable defines if BlueGreen deployment will be applied.
        :param green: Green defines the green deployment.
        :param production_deployment: ProductionDeployment defines if the current production is blue or green.

        :schema: ClusterInstallationSpecBlueGreen
        '''
        if isinstance(blue, dict):
            blue = ClusterInstallationSpecBlueGreenBlue(**blue)
        if isinstance(green, dict):
            green = ClusterInstallationSpecBlueGreenGreen(**green)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecBlueGreen.__init__)
            check_type(argname="argument blue", value=blue, expected_type=type_hints["blue"])
            check_type(argname="argument enable", value=enable, expected_type=type_hints["enable"])
            check_type(argname="argument green", value=green, expected_type=type_hints["green"])
            check_type(argname="argument production_deployment", value=production_deployment, expected_type=type_hints["production_deployment"])
        self._values: typing.Dict[str, typing.Any] = {}
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
        '''Blue defines the blue deployment.

        :schema: ClusterInstallationSpecBlueGreen#blue
        '''
        result = self._values.get("blue")
        return typing.cast(typing.Optional["ClusterInstallationSpecBlueGreenBlue"], result)

    @builtins.property
    def enable(self) -> typing.Optional[builtins.bool]:
        '''Enable defines if BlueGreen deployment will be applied.

        :schema: ClusterInstallationSpecBlueGreen#enable
        '''
        result = self._values.get("enable")
        return typing.cast(typing.Optional[builtins.bool], result)

    @builtins.property
    def green(self) -> typing.Optional["ClusterInstallationSpecBlueGreenGreen"]:
        '''Green defines the green deployment.

        :schema: ClusterInstallationSpecBlueGreen#green
        '''
        result = self._values.get("green")
        return typing.cast(typing.Optional["ClusterInstallationSpecBlueGreenGreen"], result)

    @builtins.property
    def production_deployment(self) -> typing.Optional[builtins.str]:
        '''ProductionDeployment defines if the current production is blue or green.

        :schema: ClusterInstallationSpecBlueGreen#productionDeployment
        '''
        result = self._values.get("production_deployment")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecBlueGreen(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecBlueGreenBlue",
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
        image: typing.Optional[builtins.str] = None,
        ingress_name: typing.Optional[builtins.str] = None,
        name: typing.Optional[builtins.str] = None,
        version: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Blue defines the blue deployment.

        :param image: Image defines the base Docker image that will be used for the deployment. Required when BlueGreen or Canary is enabled.
        :param ingress_name: IngressName defines the ingress name that will be used by the deployment. This option is not used for Canary builds.
        :param name: Name defines the name of the deployment.
        :param version: Version defines the Docker image version that will be used for the deployment. Required when BlueGreen or Canary is enabled.

        :schema: ClusterInstallationSpecBlueGreenBlue
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecBlueGreenBlue.__init__)
            check_type(argname="argument image", value=image, expected_type=type_hints["image"])
            check_type(argname="argument ingress_name", value=ingress_name, expected_type=type_hints["ingress_name"])
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument version", value=version, expected_type=type_hints["version"])
        self._values: typing.Dict[str, typing.Any] = {}
        if image is not None:
            self._values["image"] = image
        if ingress_name is not None:
            self._values["ingress_name"] = ingress_name
        if name is not None:
            self._values["name"] = name
        if version is not None:
            self._values["version"] = version

    @builtins.property
    def image(self) -> typing.Optional[builtins.str]:
        '''Image defines the base Docker image that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        :schema: ClusterInstallationSpecBlueGreenBlue#image
        '''
        result = self._values.get("image")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def ingress_name(self) -> typing.Optional[builtins.str]:
        '''IngressName defines the ingress name that will be used by the deployment.

        This option is not used for Canary builds.

        :schema: ClusterInstallationSpecBlueGreenBlue#ingressName
        '''
        result = self._values.get("ingress_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def name(self) -> typing.Optional[builtins.str]:
        '''Name defines the name of the deployment.

        :schema: ClusterInstallationSpecBlueGreenBlue#name
        '''
        result = self._values.get("name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def version(self) -> typing.Optional[builtins.str]:
        '''Version defines the Docker image version that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        :schema: ClusterInstallationSpecBlueGreenBlue#version
        '''
        result = self._values.get("version")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecBlueGreenBlue(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecBlueGreenGreen",
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
        image: typing.Optional[builtins.str] = None,
        ingress_name: typing.Optional[builtins.str] = None,
        name: typing.Optional[builtins.str] = None,
        version: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Green defines the green deployment.

        :param image: Image defines the base Docker image that will be used for the deployment. Required when BlueGreen or Canary is enabled.
        :param ingress_name: IngressName defines the ingress name that will be used by the deployment. This option is not used for Canary builds.
        :param name: Name defines the name of the deployment.
        :param version: Version defines the Docker image version that will be used for the deployment. Required when BlueGreen or Canary is enabled.

        :schema: ClusterInstallationSpecBlueGreenGreen
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecBlueGreenGreen.__init__)
            check_type(argname="argument image", value=image, expected_type=type_hints["image"])
            check_type(argname="argument ingress_name", value=ingress_name, expected_type=type_hints["ingress_name"])
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument version", value=version, expected_type=type_hints["version"])
        self._values: typing.Dict[str, typing.Any] = {}
        if image is not None:
            self._values["image"] = image
        if ingress_name is not None:
            self._values["ingress_name"] = ingress_name
        if name is not None:
            self._values["name"] = name
        if version is not None:
            self._values["version"] = version

    @builtins.property
    def image(self) -> typing.Optional[builtins.str]:
        '''Image defines the base Docker image that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        :schema: ClusterInstallationSpecBlueGreenGreen#image
        '''
        result = self._values.get("image")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def ingress_name(self) -> typing.Optional[builtins.str]:
        '''IngressName defines the ingress name that will be used by the deployment.

        This option is not used for Canary builds.

        :schema: ClusterInstallationSpecBlueGreenGreen#ingressName
        '''
        result = self._values.get("ingress_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def name(self) -> typing.Optional[builtins.str]:
        '''Name defines the name of the deployment.

        :schema: ClusterInstallationSpecBlueGreenGreen#name
        '''
        result = self._values.get("name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def version(self) -> typing.Optional[builtins.str]:
        '''Version defines the Docker image version that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        :schema: ClusterInstallationSpecBlueGreenGreen#version
        '''
        result = self._values.get("version")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecBlueGreenGreen(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecCanary",
    jsii_struct_bases=[],
    name_mapping={"deployment": "deployment", "enable": "enable"},
)
class ClusterInstallationSpecCanary:
    def __init__(
        self,
        *,
        deployment: typing.Optional[typing.Union["ClusterInstallationSpecCanaryDeployment", typing.Dict[str, typing.Any]]] = None,
        enable: typing.Optional[builtins.bool] = None,
    ) -> None:
        '''Canary defines the configuration of Canary deployment for a ClusterInstallation.

        :param deployment: Deployment defines the canary deployment.
        :param enable: Enable defines if a canary build will be deployed.

        :schema: ClusterInstallationSpecCanary
        '''
        if isinstance(deployment, dict):
            deployment = ClusterInstallationSpecCanaryDeployment(**deployment)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecCanary.__init__)
            check_type(argname="argument deployment", value=deployment, expected_type=type_hints["deployment"])
            check_type(argname="argument enable", value=enable, expected_type=type_hints["enable"])
        self._values: typing.Dict[str, typing.Any] = {}
        if deployment is not None:
            self._values["deployment"] = deployment
        if enable is not None:
            self._values["enable"] = enable

    @builtins.property
    def deployment(self) -> typing.Optional["ClusterInstallationSpecCanaryDeployment"]:
        '''Deployment defines the canary deployment.

        :schema: ClusterInstallationSpecCanary#deployment
        '''
        result = self._values.get("deployment")
        return typing.cast(typing.Optional["ClusterInstallationSpecCanaryDeployment"], result)

    @builtins.property
    def enable(self) -> typing.Optional[builtins.bool]:
        '''Enable defines if a canary build will be deployed.

        :schema: ClusterInstallationSpecCanary#enable
        '''
        result = self._values.get("enable")
        return typing.cast(typing.Optional[builtins.bool], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecCanary(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecCanaryDeployment",
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
        image: typing.Optional[builtins.str] = None,
        ingress_name: typing.Optional[builtins.str] = None,
        name: typing.Optional[builtins.str] = None,
        version: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Deployment defines the canary deployment.

        :param image: Image defines the base Docker image that will be used for the deployment. Required when BlueGreen or Canary is enabled.
        :param ingress_name: IngressName defines the ingress name that will be used by the deployment. This option is not used for Canary builds.
        :param name: Name defines the name of the deployment.
        :param version: Version defines the Docker image version that will be used for the deployment. Required when BlueGreen or Canary is enabled.

        :schema: ClusterInstallationSpecCanaryDeployment
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecCanaryDeployment.__init__)
            check_type(argname="argument image", value=image, expected_type=type_hints["image"])
            check_type(argname="argument ingress_name", value=ingress_name, expected_type=type_hints["ingress_name"])
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument version", value=version, expected_type=type_hints["version"])
        self._values: typing.Dict[str, typing.Any] = {}
        if image is not None:
            self._values["image"] = image
        if ingress_name is not None:
            self._values["ingress_name"] = ingress_name
        if name is not None:
            self._values["name"] = name
        if version is not None:
            self._values["version"] = version

    @builtins.property
    def image(self) -> typing.Optional[builtins.str]:
        '''Image defines the base Docker image that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        :schema: ClusterInstallationSpecCanaryDeployment#image
        '''
        result = self._values.get("image")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def ingress_name(self) -> typing.Optional[builtins.str]:
        '''IngressName defines the ingress name that will be used by the deployment.

        This option is not used for Canary builds.

        :schema: ClusterInstallationSpecCanaryDeployment#ingressName
        '''
        result = self._values.get("ingress_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def name(self) -> typing.Optional[builtins.str]:
        '''Name defines the name of the deployment.

        :schema: ClusterInstallationSpecCanaryDeployment#name
        '''
        result = self._values.get("name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def version(self) -> typing.Optional[builtins.str]:
        '''Version defines the Docker image version that will be used for the deployment.

        Required when BlueGreen or Canary is enabled.

        :schema: ClusterInstallationSpecCanaryDeployment#version
        '''
        result = self._values.get("version")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecCanaryDeployment(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecDatabase",
    jsii_struct_bases=[],
    name_mapping={
        "backup_remote_delete_policy": "backupRemoteDeletePolicy",
        "backup_restore_secret_name": "backupRestoreSecretName",
        "backup_schedule": "backupSchedule",
        "backup_secret_name": "backupSecretName",
        "backup_url": "backupUrl",
        "init_bucket_url": "initBucketUrl",
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
        backup_remote_delete_policy: typing.Optional[builtins.str] = None,
        backup_restore_secret_name: typing.Optional[builtins.str] = None,
        backup_schedule: typing.Optional[builtins.str] = None,
        backup_secret_name: typing.Optional[builtins.str] = None,
        backup_url: typing.Optional[builtins.str] = None,
        init_bucket_url: typing.Optional[builtins.str] = None,
        replicas: typing.Optional[jsii.Number] = None,
        resources: typing.Optional[typing.Union["ClusterInstallationSpecDatabaseResources", typing.Dict[str, typing.Any]]] = None,
        secret: typing.Optional[builtins.str] = None,
        storage_size: typing.Optional[builtins.str] = None,
        type: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Database defines the database configuration for a ClusterInstallation.

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

        :schema: ClusterInstallationSpecDatabase
        '''
        if isinstance(resources, dict):
            resources = ClusterInstallationSpecDatabaseResources(**resources)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecDatabase.__init__)
            check_type(argname="argument backup_remote_delete_policy", value=backup_remote_delete_policy, expected_type=type_hints["backup_remote_delete_policy"])
            check_type(argname="argument backup_restore_secret_name", value=backup_restore_secret_name, expected_type=type_hints["backup_restore_secret_name"])
            check_type(argname="argument backup_schedule", value=backup_schedule, expected_type=type_hints["backup_schedule"])
            check_type(argname="argument backup_secret_name", value=backup_secret_name, expected_type=type_hints["backup_secret_name"])
            check_type(argname="argument backup_url", value=backup_url, expected_type=type_hints["backup_url"])
            check_type(argname="argument init_bucket_url", value=init_bucket_url, expected_type=type_hints["init_bucket_url"])
            check_type(argname="argument replicas", value=replicas, expected_type=type_hints["replicas"])
            check_type(argname="argument resources", value=resources, expected_type=type_hints["resources"])
            check_type(argname="argument secret", value=secret, expected_type=type_hints["secret"])
            check_type(argname="argument storage_size", value=storage_size, expected_type=type_hints["storage_size"])
            check_type(argname="argument type", value=type, expected_type=type_hints["type"])
        self._values: typing.Dict[str, typing.Any] = {}
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
    def backup_remote_delete_policy(self) -> typing.Optional[builtins.str]:
        '''Defines the backup retention policy.

        :schema: ClusterInstallationSpecDatabase#backupRemoteDeletePolicy
        '''
        result = self._values.get("backup_remote_delete_policy")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def backup_restore_secret_name(self) -> typing.Optional[builtins.str]:
        '''Defines the secret to be used when performing a database restore.

        :schema: ClusterInstallationSpecDatabase#backupRestoreSecretName
        '''
        result = self._values.get("backup_restore_secret_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def backup_schedule(self) -> typing.Optional[builtins.str]:
        '''Defines the interval for backups in cron expression format.

        :schema: ClusterInstallationSpecDatabase#backupSchedule
        '''
        result = self._values.get("backup_schedule")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def backup_secret_name(self) -> typing.Optional[builtins.str]:
        '''Defines the secret to be used for uploading/restoring backup.

        :schema: ClusterInstallationSpecDatabase#backupSecretName
        '''
        result = self._values.get("backup_secret_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def backup_url(self) -> typing.Optional[builtins.str]:
        '''Defines the object storage url for uploading backups.

        :schema: ClusterInstallationSpecDatabase#backupURL
        '''
        result = self._values.get("backup_url")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def init_bucket_url(self) -> typing.Optional[builtins.str]:
        '''Defines the AWS S3 bucket where the Database Backup is stored.

        The operator will download the file to restore the data.

        :schema: ClusterInstallationSpecDatabase#initBucketURL
        '''
        result = self._values.get("init_bucket_url")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def replicas(self) -> typing.Optional[jsii.Number]:
        '''Defines the number of database replicas.

        For redundancy use at least 2 replicas. Setting this will override the number of replicas set by 'Size'.

        :schema: ClusterInstallationSpecDatabase#replicas
        '''
        result = self._values.get("replicas")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def resources(self) -> typing.Optional["ClusterInstallationSpecDatabaseResources"]:
        '''Defines the resource requests and limits for the database pods.

        :schema: ClusterInstallationSpecDatabase#resources
        '''
        result = self._values.get("resources")
        return typing.cast(typing.Optional["ClusterInstallationSpecDatabaseResources"], result)

    @builtins.property
    def secret(self) -> typing.Optional[builtins.str]:
        '''Optionally enter the name of an already-existing Secret for connecting to the database.

        This secret should be configured as follows:
        User-Managed Database   - Key: DB_CONNECTION_STRING | Value: <FULL_DATABASE_CONNECTION_STRING> Operator-Managed Database   - Key: ROOT_PASSWORD | Value: <ROOT_DATABASE_PASSWORD>   - Key: USER | Value: <USER_NAME>   - Key: PASSWORD | Value: <USER_PASSWORD>   - Key: DATABASE Value: <DATABASE_NAME>
        Notes:   If you define all secret values for both User-Managed and   Operator-Managed database types, the User-Managed connection string will   take precedence and the Operator-Managed values will be ignored. If the   secret is left blank, the default behavior is to use an Operator-Managed   database with strong randomly-generated database credentials.

        :schema: ClusterInstallationSpecDatabase#secret
        '''
        result = self._values.get("secret")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def storage_size(self) -> typing.Optional[builtins.str]:
        '''Defines the storage size for the database.

        ie 50Gi

        :schema: ClusterInstallationSpecDatabase#storageSize
        '''
        result = self._values.get("storage_size")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def type(self) -> typing.Optional[builtins.str]:
        '''
        :schema: ClusterInstallationSpecDatabase#type
        '''
        result = self._values.get("type")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecDatabase(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecDatabaseResources",
    jsii_struct_bases=[],
    name_mapping={"limits": "limits", "requests": "requests"},
)
class ClusterInstallationSpecDatabaseResources:
    def __init__(
        self,
        *,
        limits: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        requests: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    ) -> None:
        '''Defines the resource requests and limits for the database pods.

        :param limits: Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
        :param requests: Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ClusterInstallationSpecDatabaseResources
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecDatabaseResources.__init__)
            check_type(argname="argument limits", value=limits, expected_type=type_hints["limits"])
            check_type(argname="argument requests", value=requests, expected_type=type_hints["requests"])
        self._values: typing.Dict[str, typing.Any] = {}
        if limits is not None:
            self._values["limits"] = limits
        if requests is not None:
            self._values["requests"] = requests

    @builtins.property
    def limits(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Limits describes the maximum amount of compute resources allowed.

        More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ClusterInstallationSpecDatabaseResources#limits
        '''
        result = self._values.get("limits")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def requests(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Requests describes the minimum amount of compute resources required.

        If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ClusterInstallationSpecDatabaseResources#requests
        '''
        result = self._values.get("requests")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecDatabaseResources(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecElasticSearch",
    jsii_struct_bases=[],
    name_mapping={"host": "host", "password": "password", "username": "username"},
)
class ClusterInstallationSpecElasticSearch:
    def __init__(
        self,
        *,
        host: typing.Optional[builtins.str] = None,
        password: typing.Optional[builtins.str] = None,
        username: typing.Optional[builtins.str] = None,
    ) -> None:
        '''ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.

        :param host: 
        :param password: 
        :param username: 

        :schema: ClusterInstallationSpecElasticSearch
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecElasticSearch.__init__)
            check_type(argname="argument host", value=host, expected_type=type_hints["host"])
            check_type(argname="argument password", value=password, expected_type=type_hints["password"])
            check_type(argname="argument username", value=username, expected_type=type_hints["username"])
        self._values: typing.Dict[str, typing.Any] = {}
        if host is not None:
            self._values["host"] = host
        if password is not None:
            self._values["password"] = password
        if username is not None:
            self._values["username"] = username

    @builtins.property
    def host(self) -> typing.Optional[builtins.str]:
        '''
        :schema: ClusterInstallationSpecElasticSearch#host
        '''
        result = self._values.get("host")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def password(self) -> typing.Optional[builtins.str]:
        '''
        :schema: ClusterInstallationSpecElasticSearch#password
        '''
        result = self._values.get("password")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def username(self) -> typing.Optional[builtins.str]:
        '''
        :schema: ClusterInstallationSpecElasticSearch#username
        '''
        result = self._values.get("username")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecElasticSearch(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecLivenessProbe",
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
        exec: typing.Optional[typing.Union["ClusterInstallationSpecLivenessProbeExec", typing.Dict[str, typing.Any]]] = None,
        failure_threshold: typing.Optional[jsii.Number] = None,
        http_get: typing.Optional[typing.Union["ClusterInstallationSpecLivenessProbeHttpGet", typing.Dict[str, typing.Any]]] = None,
        initial_delay_seconds: typing.Optional[jsii.Number] = None,
        period_seconds: typing.Optional[jsii.Number] = None,
        success_threshold: typing.Optional[jsii.Number] = None,
        tcp_socket: typing.Optional[typing.Union["ClusterInstallationSpecLivenessProbeTcpSocket", typing.Dict[str, typing.Any]]] = None,
        timeout_seconds: typing.Optional[jsii.Number] = None,
    ) -> None:
        '''Defines the probe to check if the application is up and running.

        :param exec: One and only one of the following should be specified. Exec specifies the action to take.
        :param failure_threshold: Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Default: 3. Minimum value is 1.
        :param http_get: HTTPGet specifies the http request to perform.
        :param initial_delay_seconds: Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
        :param period_seconds: How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Default: 10 seconds. Minimum value is 1.
        :param success_threshold: Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Default: 1. Must be 1 for liveness and startup. Minimum value is 1.
        :param tcp_socket: TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
        :param timeout_seconds: Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes Default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        :schema: ClusterInstallationSpecLivenessProbe
        '''
        if isinstance(exec, dict):
            exec = ClusterInstallationSpecLivenessProbeExec(**exec)
        if isinstance(http_get, dict):
            http_get = ClusterInstallationSpecLivenessProbeHttpGet(**http_get)
        if isinstance(tcp_socket, dict):
            tcp_socket = ClusterInstallationSpecLivenessProbeTcpSocket(**tcp_socket)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecLivenessProbe.__init__)
            check_type(argname="argument exec", value=exec, expected_type=type_hints["exec"])
            check_type(argname="argument failure_threshold", value=failure_threshold, expected_type=type_hints["failure_threshold"])
            check_type(argname="argument http_get", value=http_get, expected_type=type_hints["http_get"])
            check_type(argname="argument initial_delay_seconds", value=initial_delay_seconds, expected_type=type_hints["initial_delay_seconds"])
            check_type(argname="argument period_seconds", value=period_seconds, expected_type=type_hints["period_seconds"])
            check_type(argname="argument success_threshold", value=success_threshold, expected_type=type_hints["success_threshold"])
            check_type(argname="argument tcp_socket", value=tcp_socket, expected_type=type_hints["tcp_socket"])
            check_type(argname="argument timeout_seconds", value=timeout_seconds, expected_type=type_hints["timeout_seconds"])
        self._values: typing.Dict[str, typing.Any] = {}
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
        '''One and only one of the following should be specified.

        Exec specifies the action to take.

        :schema: ClusterInstallationSpecLivenessProbe#exec
        '''
        result = self._values.get("exec")
        return typing.cast(typing.Optional["ClusterInstallationSpecLivenessProbeExec"], result)

    @builtins.property
    def failure_threshold(self) -> typing.Optional[jsii.Number]:
        '''Minimum consecutive failures for the probe to be considered failed after having succeeded.

        Defaults to 3. Minimum value is 1.

        :default: 3. Minimum value is 1.

        :schema: ClusterInstallationSpecLivenessProbe#failureThreshold
        '''
        result = self._values.get("failure_threshold")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def http_get(
        self,
    ) -> typing.Optional["ClusterInstallationSpecLivenessProbeHttpGet"]:
        '''HTTPGet specifies the http request to perform.

        :schema: ClusterInstallationSpecLivenessProbe#httpGet
        '''
        result = self._values.get("http_get")
        return typing.cast(typing.Optional["ClusterInstallationSpecLivenessProbeHttpGet"], result)

    @builtins.property
    def initial_delay_seconds(self) -> typing.Optional[jsii.Number]:
        '''Number of seconds after the container has started before liveness probes are initiated.

        More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        :schema: ClusterInstallationSpecLivenessProbe#initialDelaySeconds
        '''
        result = self._values.get("initial_delay_seconds")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def period_seconds(self) -> typing.Optional[jsii.Number]:
        '''How often (in seconds) to perform the probe.

        Default to 10 seconds. Minimum value is 1.

        :default: 10 seconds. Minimum value is 1.

        :schema: ClusterInstallationSpecLivenessProbe#periodSeconds
        '''
        result = self._values.get("period_seconds")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def success_threshold(self) -> typing.Optional[jsii.Number]:
        '''Minimum consecutive successes for the probe to be considered successful after having failed.

        Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.

        :default: 1. Must be 1 for liveness and startup. Minimum value is 1.

        :schema: ClusterInstallationSpecLivenessProbe#successThreshold
        '''
        result = self._values.get("success_threshold")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def tcp_socket(
        self,
    ) -> typing.Optional["ClusterInstallationSpecLivenessProbeTcpSocket"]:
        '''TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        :schema: ClusterInstallationSpecLivenessProbe#tcpSocket
        '''
        result = self._values.get("tcp_socket")
        return typing.cast(typing.Optional["ClusterInstallationSpecLivenessProbeTcpSocket"], result)

    @builtins.property
    def timeout_seconds(self) -> typing.Optional[jsii.Number]:
        '''Number of seconds after which the probe times out.

        Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        :default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        :schema: ClusterInstallationSpecLivenessProbe#timeoutSeconds
        '''
        result = self._values.get("timeout_seconds")
        return typing.cast(typing.Optional[jsii.Number], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecLivenessProbe(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecLivenessProbeExec",
    jsii_struct_bases=[],
    name_mapping={"command": "command"},
)
class ClusterInstallationSpecLivenessProbeExec:
    def __init__(
        self,
        *,
        command: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''One and only one of the following should be specified.

        Exec specifies the action to take.

        :param command: Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        :schema: ClusterInstallationSpecLivenessProbeExec
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecLivenessProbeExec.__init__)
            check_type(argname="argument command", value=command, expected_type=type_hints["command"])
        self._values: typing.Dict[str, typing.Any] = {}
        if command is not None:
            self._values["command"] = command

    @builtins.property
    def command(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.

        The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        :schema: ClusterInstallationSpecLivenessProbeExec#command
        '''
        result = self._values.get("command")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecLivenessProbeExec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecLivenessProbeHttpGet",
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
        host: typing.Optional[builtins.str] = None,
        http_headers: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders", typing.Dict[str, typing.Any]]]] = None,
        path: typing.Optional[builtins.str] = None,
        scheme: typing.Optional[builtins.str] = None,
    ) -> None:
        '''HTTPGet specifies the http request to perform.

        :param port: Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
        :param http_headers: Custom headers to set in the request. HTTP allows repeated headers.
        :param path: Path to access on the HTTP server.
        :param scheme: Scheme to use for connecting to the host. Defaults to HTTP. Default: HTTP.

        :schema: ClusterInstallationSpecLivenessProbeHttpGet
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecLivenessProbeHttpGet.__init__)
            check_type(argname="argument port", value=port, expected_type=type_hints["port"])
            check_type(argname="argument host", value=host, expected_type=type_hints["host"])
            check_type(argname="argument http_headers", value=http_headers, expected_type=type_hints["http_headers"])
            check_type(argname="argument path", value=path, expected_type=type_hints["path"])
            check_type(argname="argument scheme", value=scheme, expected_type=type_hints["scheme"])
        self._values: typing.Dict[str, typing.Any] = {
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
        '''Name or number of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        :schema: ClusterInstallationSpecLivenessProbeHttpGet#port
        '''
        result = self._values.get("port")
        assert result is not None, "Required property 'port' is missing"
        return typing.cast("ClusterInstallationSpecLivenessProbeHttpGetPort", result)

    @builtins.property
    def host(self) -> typing.Optional[builtins.str]:
        '''Host name to connect to, defaults to the pod IP.

        You probably want to set "Host" in httpHeaders instead.

        :schema: ClusterInstallationSpecLivenessProbeHttpGet#host
        '''
        result = self._values.get("host")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def http_headers(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders"]]:
        '''Custom headers to set in the request.

        HTTP allows repeated headers.

        :schema: ClusterInstallationSpecLivenessProbeHttpGet#httpHeaders
        '''
        result = self._values.get("http_headers")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders"]], result)

    @builtins.property
    def path(self) -> typing.Optional[builtins.str]:
        '''Path to access on the HTTP server.

        :schema: ClusterInstallationSpecLivenessProbeHttpGet#path
        '''
        result = self._values.get("path")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def scheme(self) -> typing.Optional[builtins.str]:
        '''Scheme to use for connecting to the host.

        Defaults to HTTP.

        :default: HTTP.

        :schema: ClusterInstallationSpecLivenessProbeHttpGet#scheme
        '''
        result = self._values.get("scheme")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecLivenessProbeHttpGet(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value"},
)
class ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders:
    def __init__(self, *, name: builtins.str, value: builtins.str) -> None:
        '''HTTPHeader describes a custom header to be used in HTTP probes.

        :param name: The header field name.
        :param value: The header field value.

        :schema: ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders.__init__)
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        self._values: typing.Dict[str, typing.Any] = {
            "name": name,
            "value": value,
        }

    @builtins.property
    def name(self) -> builtins.str:
        '''The header field name.

        :schema: ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def value(self) -> builtins.str:
        '''The header field value.

        :schema: ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders#value
        '''
        result = self._values.get("value")
        assert result is not None, "Required property 'value' is missing"
        return typing.cast(builtins.str, result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecLivenessProbeHttpGetHttpHeaders(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ClusterInstallationSpecLivenessProbeHttpGetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="commattermost.ClusterInstallationSpecLivenessProbeHttpGetPort",
):
    '''Name or number of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    :schema: ClusterInstallationSpecLivenessProbeHttpGetPort
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ClusterInstallationSpecLivenessProbeHttpGetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecLivenessProbeHttpGetPort.from_number)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ClusterInstallationSpecLivenessProbeHttpGetPort", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ClusterInstallationSpecLivenessProbeHttpGetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecLivenessProbeHttpGetPort.from_string)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ClusterInstallationSpecLivenessProbeHttpGetPort", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Any:
        return typing.cast(typing.Any, jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecLivenessProbeTcpSocket",
    jsii_struct_bases=[],
    name_mapping={"port": "port", "host": "host"},
)
class ClusterInstallationSpecLivenessProbeTcpSocket:
    def __init__(
        self,
        *,
        port: "ClusterInstallationSpecLivenessProbeTcpSocketPort",
        host: typing.Optional[builtins.str] = None,
    ) -> None:
        '''TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        :param port: Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Optional: Host name to connect to, defaults to the pod IP.

        :schema: ClusterInstallationSpecLivenessProbeTcpSocket
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecLivenessProbeTcpSocket.__init__)
            check_type(argname="argument port", value=port, expected_type=type_hints["port"])
            check_type(argname="argument host", value=host, expected_type=type_hints["host"])
        self._values: typing.Dict[str, typing.Any] = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host

    @builtins.property
    def port(self) -> "ClusterInstallationSpecLivenessProbeTcpSocketPort":
        '''Number or name of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        :schema: ClusterInstallationSpecLivenessProbeTcpSocket#port
        '''
        result = self._values.get("port")
        assert result is not None, "Required property 'port' is missing"
        return typing.cast("ClusterInstallationSpecLivenessProbeTcpSocketPort", result)

    @builtins.property
    def host(self) -> typing.Optional[builtins.str]:
        '''Optional: Host name to connect to, defaults to the pod IP.

        :schema: ClusterInstallationSpecLivenessProbeTcpSocket#host
        '''
        result = self._values.get("host")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecLivenessProbeTcpSocket(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ClusterInstallationSpecLivenessProbeTcpSocketPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="commattermost.ClusterInstallationSpecLivenessProbeTcpSocketPort",
):
    '''Number or name of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    :schema: ClusterInstallationSpecLivenessProbeTcpSocketPort
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ClusterInstallationSpecLivenessProbeTcpSocketPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecLivenessProbeTcpSocketPort.from_number)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ClusterInstallationSpecLivenessProbeTcpSocketPort", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ClusterInstallationSpecLivenessProbeTcpSocketPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecLivenessProbeTcpSocketPort.from_string)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ClusterInstallationSpecLivenessProbeTcpSocketPort", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Any:
        return typing.cast(typing.Any, jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecMattermostEnv",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value", "value_from": "valueFrom"},
)
class ClusterInstallationSpecMattermostEnv:
    def __init__(
        self,
        *,
        name: builtins.str,
        value: typing.Optional[builtins.str] = None,
        value_from: typing.Optional[typing.Union["ClusterInstallationSpecMattermostEnvValueFrom", typing.Dict[str, typing.Any]]] = None,
    ) -> None:
        '''EnvVar represents an environment variable present in a Container.

        :param name: Name of the environment variable. Must be a C_IDENTIFIER.
        :param value: Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "". Default: .
        :param value_from: Source for the environment variable's value. Cannot be used if value is not empty.

        :schema: ClusterInstallationSpecMattermostEnv
        '''
        if isinstance(value_from, dict):
            value_from = ClusterInstallationSpecMattermostEnvValueFrom(**value_from)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecMattermostEnv.__init__)
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
            check_type(argname="argument value_from", value=value_from, expected_type=type_hints["value_from"])
        self._values: typing.Dict[str, typing.Any] = {
            "name": name,
        }
        if value is not None:
            self._values["value"] = value
        if value_from is not None:
            self._values["value_from"] = value_from

    @builtins.property
    def name(self) -> builtins.str:
        '''Name of the environment variable.

        Must be a C_IDENTIFIER.

        :schema: ClusterInstallationSpecMattermostEnv#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def value(self) -> typing.Optional[builtins.str]:
        '''Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.

        If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".

        :default: .

        :schema: ClusterInstallationSpecMattermostEnv#value
        '''
        result = self._values.get("value")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def value_from(
        self,
    ) -> typing.Optional["ClusterInstallationSpecMattermostEnvValueFrom"]:
        '''Source for the environment variable's value.

        Cannot be used if value is not empty.

        :schema: ClusterInstallationSpecMattermostEnv#valueFrom
        '''
        result = self._values.get("value_from")
        return typing.cast(typing.Optional["ClusterInstallationSpecMattermostEnvValueFrom"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnv(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecMattermostEnvValueFrom",
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
        config_map_key_ref: typing.Optional[typing.Union["ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef", typing.Dict[str, typing.Any]]] = None,
        field_ref: typing.Optional[typing.Union["ClusterInstallationSpecMattermostEnvValueFromFieldRef", typing.Dict[str, typing.Any]]] = None,
        resource_field_ref: typing.Optional[typing.Union["ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef", typing.Dict[str, typing.Any]]] = None,
        secret_key_ref: typing.Optional[typing.Union["ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef", typing.Dict[str, typing.Any]]] = None,
    ) -> None:
        '''Source for the environment variable's value.

        Cannot be used if value is not empty.

        :param config_map_key_ref: Selects a key of a ConfigMap.
        :param field_ref: Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
        :param resource_field_ref: Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
        :param secret_key_ref: Selects a key of a secret in the pod's namespace.

        :schema: ClusterInstallationSpecMattermostEnvValueFrom
        '''
        if isinstance(config_map_key_ref, dict):
            config_map_key_ref = ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef(**config_map_key_ref)
        if isinstance(field_ref, dict):
            field_ref = ClusterInstallationSpecMattermostEnvValueFromFieldRef(**field_ref)
        if isinstance(resource_field_ref, dict):
            resource_field_ref = ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef(**resource_field_ref)
        if isinstance(secret_key_ref, dict):
            secret_key_ref = ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef(**secret_key_ref)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecMattermostEnvValueFrom.__init__)
            check_type(argname="argument config_map_key_ref", value=config_map_key_ref, expected_type=type_hints["config_map_key_ref"])
            check_type(argname="argument field_ref", value=field_ref, expected_type=type_hints["field_ref"])
            check_type(argname="argument resource_field_ref", value=resource_field_ref, expected_type=type_hints["resource_field_ref"])
            check_type(argname="argument secret_key_ref", value=secret_key_ref, expected_type=type_hints["secret_key_ref"])
        self._values: typing.Dict[str, typing.Any] = {}
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
        '''Selects a key of a ConfigMap.

        :schema: ClusterInstallationSpecMattermostEnvValueFrom#configMapKeyRef
        '''
        result = self._values.get("config_map_key_ref")
        return typing.cast(typing.Optional["ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef"], result)

    @builtins.property
    def field_ref(
        self,
    ) -> typing.Optional["ClusterInstallationSpecMattermostEnvValueFromFieldRef"]:
        '''Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.

        :schema: ClusterInstallationSpecMattermostEnvValueFrom#fieldRef
        '''
        result = self._values.get("field_ref")
        return typing.cast(typing.Optional["ClusterInstallationSpecMattermostEnvValueFromFieldRef"], result)

    @builtins.property
    def resource_field_ref(
        self,
    ) -> typing.Optional["ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef"]:
        '''Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.

        :schema: ClusterInstallationSpecMattermostEnvValueFrom#resourceFieldRef
        '''
        result = self._values.get("resource_field_ref")
        return typing.cast(typing.Optional["ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef"], result)

    @builtins.property
    def secret_key_ref(
        self,
    ) -> typing.Optional["ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef"]:
        '''Selects a key of a secret in the pod's namespace.

        :schema: ClusterInstallationSpecMattermostEnvValueFrom#secretKeyRef
        '''
        result = self._values.get("secret_key_ref")
        return typing.cast(typing.Optional["ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef"], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnvValueFrom(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "name": "name", "optional": "optional"},
)
class ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef:
    def __init__(
        self,
        *,
        key: builtins.str,
        name: typing.Optional[builtins.str] = None,
        optional: typing.Optional[builtins.bool] = None,
    ) -> None:
        '''Selects a key of a ConfigMap.

        :param key: The key to select.
        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
        :param optional: Specify whether the ConfigMap or its key must be defined.

        :schema: ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef.__init__)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument optional", value=optional, expected_type=type_hints["optional"])
        self._values: typing.Dict[str, typing.Any] = {
            "key": key,
        }
        if name is not None:
            self._values["name"] = name
        if optional is not None:
            self._values["optional"] = optional

    @builtins.property
    def key(self) -> builtins.str:
        '''The key to select.

        :schema: ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def name(self) -> typing.Optional[builtins.str]:
        '''Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        :schema: ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef#name
        '''
        result = self._values.get("name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def optional(self) -> typing.Optional[builtins.bool]:
        '''Specify whether the ConfigMap or its key must be defined.

        :schema: ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef#optional
        '''
        result = self._values.get("optional")
        return typing.cast(typing.Optional[builtins.bool], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnvValueFromConfigMapKeyRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecMattermostEnvValueFromFieldRef",
    jsii_struct_bases=[],
    name_mapping={"field_path": "fieldPath", "api_version": "apiVersion"},
)
class ClusterInstallationSpecMattermostEnvValueFromFieldRef:
    def __init__(
        self,
        *,
        field_path: builtins.str,
        api_version: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.

        :param field_path: Path of the field to select in the specified API version.
        :param api_version: Version of the schema the FieldPath is written in terms of, defaults to "v1".

        :schema: ClusterInstallationSpecMattermostEnvValueFromFieldRef
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecMattermostEnvValueFromFieldRef.__init__)
            check_type(argname="argument field_path", value=field_path, expected_type=type_hints["field_path"])
            check_type(argname="argument api_version", value=api_version, expected_type=type_hints["api_version"])
        self._values: typing.Dict[str, typing.Any] = {
            "field_path": field_path,
        }
        if api_version is not None:
            self._values["api_version"] = api_version

    @builtins.property
    def field_path(self) -> builtins.str:
        '''Path of the field to select in the specified API version.

        :schema: ClusterInstallationSpecMattermostEnvValueFromFieldRef#fieldPath
        '''
        result = self._values.get("field_path")
        assert result is not None, "Required property 'field_path' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def api_version(self) -> typing.Optional[builtins.str]:
        '''Version of the schema the FieldPath is written in terms of, defaults to "v1".

        :schema: ClusterInstallationSpecMattermostEnvValueFromFieldRef#apiVersion
        '''
        result = self._values.get("api_version")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnvValueFromFieldRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef",
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
        resource: builtins.str,
        container_name: typing.Optional[builtins.str] = None,
        divisor: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.

        :param resource: Required: resource to select.
        :param container_name: Container name: required for volumes, optional for env vars.
        :param divisor: Specifies the output format of the exposed resources, defaults to "1".

        :schema: ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef.__init__)
            check_type(argname="argument resource", value=resource, expected_type=type_hints["resource"])
            check_type(argname="argument container_name", value=container_name, expected_type=type_hints["container_name"])
            check_type(argname="argument divisor", value=divisor, expected_type=type_hints["divisor"])
        self._values: typing.Dict[str, typing.Any] = {
            "resource": resource,
        }
        if container_name is not None:
            self._values["container_name"] = container_name
        if divisor is not None:
            self._values["divisor"] = divisor

    @builtins.property
    def resource(self) -> builtins.str:
        '''Required: resource to select.

        :schema: ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef#resource
        '''
        result = self._values.get("resource")
        assert result is not None, "Required property 'resource' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def container_name(self) -> typing.Optional[builtins.str]:
        '''Container name: required for volumes, optional for env vars.

        :schema: ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef#containerName
        '''
        result = self._values.get("container_name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def divisor(self) -> typing.Optional[builtins.str]:
        '''Specifies the output format of the exposed resources, defaults to "1".

        :schema: ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef#divisor
        '''
        result = self._values.get("divisor")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef",
    jsii_struct_bases=[],
    name_mapping={"key": "key", "name": "name", "optional": "optional"},
)
class ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef:
    def __init__(
        self,
        *,
        key: builtins.str,
        name: typing.Optional[builtins.str] = None,
        optional: typing.Optional[builtins.bool] = None,
    ) -> None:
        '''Selects a key of a secret in the pod's namespace.

        :param key: The key of the secret to select from. Must be a valid secret key.
        :param name: Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
        :param optional: Specify whether the Secret or its key must be defined.

        :schema: ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef.__init__)
            check_type(argname="argument key", value=key, expected_type=type_hints["key"])
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument optional", value=optional, expected_type=type_hints["optional"])
        self._values: typing.Dict[str, typing.Any] = {
            "key": key,
        }
        if name is not None:
            self._values["name"] = name
        if optional is not None:
            self._values["optional"] = optional

    @builtins.property
    def key(self) -> builtins.str:
        '''The key of the secret to select from.

        Must be a valid secret key.

        :schema: ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef#key
        '''
        result = self._values.get("key")
        assert result is not None, "Required property 'key' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def name(self) -> typing.Optional[builtins.str]:
        '''Name of the referent.

        More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?

        :schema: ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef#name
        '''
        result = self._values.get("name")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def optional(self) -> typing.Optional[builtins.bool]:
        '''Specify whether the Secret or its key must be defined.

        :schema: ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef#optional
        '''
        result = self._values.get("optional")
        return typing.cast(typing.Optional[builtins.bool], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMattermostEnvValueFromSecretKeyRef(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecMinio",
    jsii_struct_bases=[],
    name_mapping={
        "external_bucket": "externalBucket",
        "external_url": "externalUrl",
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
        external_bucket: typing.Optional[builtins.str] = None,
        external_url: typing.Optional[builtins.str] = None,
        replicas: typing.Optional[jsii.Number] = None,
        resources: typing.Optional[typing.Union["ClusterInstallationSpecMinioResources", typing.Dict[str, typing.Any]]] = None,
        secret: typing.Optional[builtins.str] = None,
        storage_size: typing.Optional[builtins.str] = None,
    ) -> None:
        '''Minio defines the configuration of Minio for a ClusterInstallation.

        :param external_bucket: Set to the bucket name of your external MinIO or S3.
        :param external_url: Set to use an external MinIO deployment or S3. Must also set 'Secret' and 'ExternalBucket'.
        :param replicas: Defines the number of Minio replicas. Supply 1 to run Minio in standalone mode with no redundancy. Supply 4 or more to run Minio in distributed mode. Note that it is not possible to upgrade Minio from standalone to distributed mode. Setting this will override the number of replicas set by 'Size'. More info: https://docs.min.io/docs/distributed-minio-quickstart-guide.html
        :param resources: Defines the resource requests and limits for the Minio pods.
        :param secret: Optionally enter the name of already existing secret. Secret should have two values: "accesskey" and "secretkey". Required when "ExternalURL" is set.
        :param storage_size: Defines the storage size for Minio. ie 50Gi

        :schema: ClusterInstallationSpecMinio
        '''
        if isinstance(resources, dict):
            resources = ClusterInstallationSpecMinioResources(**resources)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecMinio.__init__)
            check_type(argname="argument external_bucket", value=external_bucket, expected_type=type_hints["external_bucket"])
            check_type(argname="argument external_url", value=external_url, expected_type=type_hints["external_url"])
            check_type(argname="argument replicas", value=replicas, expected_type=type_hints["replicas"])
            check_type(argname="argument resources", value=resources, expected_type=type_hints["resources"])
            check_type(argname="argument secret", value=secret, expected_type=type_hints["secret"])
            check_type(argname="argument storage_size", value=storage_size, expected_type=type_hints["storage_size"])
        self._values: typing.Dict[str, typing.Any] = {}
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
    def external_bucket(self) -> typing.Optional[builtins.str]:
        '''Set to the bucket name of your external MinIO or S3.

        :schema: ClusterInstallationSpecMinio#externalBucket
        '''
        result = self._values.get("external_bucket")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def external_url(self) -> typing.Optional[builtins.str]:
        '''Set to use an external MinIO deployment or S3.

        Must also set 'Secret' and 'ExternalBucket'.

        :schema: ClusterInstallationSpecMinio#externalURL
        '''
        result = self._values.get("external_url")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def replicas(self) -> typing.Optional[jsii.Number]:
        '''Defines the number of Minio replicas.

        Supply 1 to run Minio in standalone mode with no redundancy. Supply 4 or more to run Minio in distributed mode. Note that it is not possible to upgrade Minio from standalone to distributed mode. Setting this will override the number of replicas set by 'Size'. More info: https://docs.min.io/docs/distributed-minio-quickstart-guide.html

        :schema: ClusterInstallationSpecMinio#replicas
        '''
        result = self._values.get("replicas")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def resources(self) -> typing.Optional["ClusterInstallationSpecMinioResources"]:
        '''Defines the resource requests and limits for the Minio pods.

        :schema: ClusterInstallationSpecMinio#resources
        '''
        result = self._values.get("resources")
        return typing.cast(typing.Optional["ClusterInstallationSpecMinioResources"], result)

    @builtins.property
    def secret(self) -> typing.Optional[builtins.str]:
        '''Optionally enter the name of already existing secret.

        Secret should have two values: "accesskey" and "secretkey". Required when "ExternalURL" is set.

        :schema: ClusterInstallationSpecMinio#secret
        '''
        result = self._values.get("secret")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def storage_size(self) -> typing.Optional[builtins.str]:
        '''Defines the storage size for Minio.

        ie 50Gi

        :schema: ClusterInstallationSpecMinio#storageSize
        '''
        result = self._values.get("storage_size")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMinio(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecMinioResources",
    jsii_struct_bases=[],
    name_mapping={"limits": "limits", "requests": "requests"},
)
class ClusterInstallationSpecMinioResources:
    def __init__(
        self,
        *,
        limits: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        requests: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    ) -> None:
        '''Defines the resource requests and limits for the Minio pods.

        :param limits: Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
        :param requests: Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ClusterInstallationSpecMinioResources
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecMinioResources.__init__)
            check_type(argname="argument limits", value=limits, expected_type=type_hints["limits"])
            check_type(argname="argument requests", value=requests, expected_type=type_hints["requests"])
        self._values: typing.Dict[str, typing.Any] = {}
        if limits is not None:
            self._values["limits"] = limits
        if requests is not None:
            self._values["requests"] = requests

    @builtins.property
    def limits(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Limits describes the maximum amount of compute resources allowed.

        More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ClusterInstallationSpecMinioResources#limits
        '''
        result = self._values.get("limits")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def requests(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Requests describes the minimum amount of compute resources required.

        If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ClusterInstallationSpecMinioResources#requests
        '''
        result = self._values.get("requests")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecMinioResources(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecReadinessProbe",
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
        exec: typing.Optional[typing.Union["ClusterInstallationSpecReadinessProbeExec", typing.Dict[str, typing.Any]]] = None,
        failure_threshold: typing.Optional[jsii.Number] = None,
        http_get: typing.Optional[typing.Union["ClusterInstallationSpecReadinessProbeHttpGet", typing.Dict[str, typing.Any]]] = None,
        initial_delay_seconds: typing.Optional[jsii.Number] = None,
        period_seconds: typing.Optional[jsii.Number] = None,
        success_threshold: typing.Optional[jsii.Number] = None,
        tcp_socket: typing.Optional[typing.Union["ClusterInstallationSpecReadinessProbeTcpSocket", typing.Dict[str, typing.Any]]] = None,
        timeout_seconds: typing.Optional[jsii.Number] = None,
    ) -> None:
        '''Defines the probe to check if the application is ready to accept traffic.

        :param exec: One and only one of the following should be specified. Exec specifies the action to take.
        :param failure_threshold: Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Default: 3. Minimum value is 1.
        :param http_get: HTTPGet specifies the http request to perform.
        :param initial_delay_seconds: Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
        :param period_seconds: How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Default: 10 seconds. Minimum value is 1.
        :param success_threshold: Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Default: 1. Must be 1 for liveness and startup. Minimum value is 1.
        :param tcp_socket: TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
        :param timeout_seconds: Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes Default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        :schema: ClusterInstallationSpecReadinessProbe
        '''
        if isinstance(exec, dict):
            exec = ClusterInstallationSpecReadinessProbeExec(**exec)
        if isinstance(http_get, dict):
            http_get = ClusterInstallationSpecReadinessProbeHttpGet(**http_get)
        if isinstance(tcp_socket, dict):
            tcp_socket = ClusterInstallationSpecReadinessProbeTcpSocket(**tcp_socket)
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecReadinessProbe.__init__)
            check_type(argname="argument exec", value=exec, expected_type=type_hints["exec"])
            check_type(argname="argument failure_threshold", value=failure_threshold, expected_type=type_hints["failure_threshold"])
            check_type(argname="argument http_get", value=http_get, expected_type=type_hints["http_get"])
            check_type(argname="argument initial_delay_seconds", value=initial_delay_seconds, expected_type=type_hints["initial_delay_seconds"])
            check_type(argname="argument period_seconds", value=period_seconds, expected_type=type_hints["period_seconds"])
            check_type(argname="argument success_threshold", value=success_threshold, expected_type=type_hints["success_threshold"])
            check_type(argname="argument tcp_socket", value=tcp_socket, expected_type=type_hints["tcp_socket"])
            check_type(argname="argument timeout_seconds", value=timeout_seconds, expected_type=type_hints["timeout_seconds"])
        self._values: typing.Dict[str, typing.Any] = {}
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
        '''One and only one of the following should be specified.

        Exec specifies the action to take.

        :schema: ClusterInstallationSpecReadinessProbe#exec
        '''
        result = self._values.get("exec")
        return typing.cast(typing.Optional["ClusterInstallationSpecReadinessProbeExec"], result)

    @builtins.property
    def failure_threshold(self) -> typing.Optional[jsii.Number]:
        '''Minimum consecutive failures for the probe to be considered failed after having succeeded.

        Defaults to 3. Minimum value is 1.

        :default: 3. Minimum value is 1.

        :schema: ClusterInstallationSpecReadinessProbe#failureThreshold
        '''
        result = self._values.get("failure_threshold")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def http_get(
        self,
    ) -> typing.Optional["ClusterInstallationSpecReadinessProbeHttpGet"]:
        '''HTTPGet specifies the http request to perform.

        :schema: ClusterInstallationSpecReadinessProbe#httpGet
        '''
        result = self._values.get("http_get")
        return typing.cast(typing.Optional["ClusterInstallationSpecReadinessProbeHttpGet"], result)

    @builtins.property
    def initial_delay_seconds(self) -> typing.Optional[jsii.Number]:
        '''Number of seconds after the container has started before liveness probes are initiated.

        More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        :schema: ClusterInstallationSpecReadinessProbe#initialDelaySeconds
        '''
        result = self._values.get("initial_delay_seconds")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def period_seconds(self) -> typing.Optional[jsii.Number]:
        '''How often (in seconds) to perform the probe.

        Default to 10 seconds. Minimum value is 1.

        :default: 10 seconds. Minimum value is 1.

        :schema: ClusterInstallationSpecReadinessProbe#periodSeconds
        '''
        result = self._values.get("period_seconds")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def success_threshold(self) -> typing.Optional[jsii.Number]:
        '''Minimum consecutive successes for the probe to be considered successful after having failed.

        Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.

        :default: 1. Must be 1 for liveness and startup. Minimum value is 1.

        :schema: ClusterInstallationSpecReadinessProbe#successThreshold
        '''
        result = self._values.get("success_threshold")
        return typing.cast(typing.Optional[jsii.Number], result)

    @builtins.property
    def tcp_socket(
        self,
    ) -> typing.Optional["ClusterInstallationSpecReadinessProbeTcpSocket"]:
        '''TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        :schema: ClusterInstallationSpecReadinessProbe#tcpSocket
        '''
        result = self._values.get("tcp_socket")
        return typing.cast(typing.Optional["ClusterInstallationSpecReadinessProbeTcpSocket"], result)

    @builtins.property
    def timeout_seconds(self) -> typing.Optional[jsii.Number]:
        '''Number of seconds after which the probe times out.

        Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        :default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes

        :schema: ClusterInstallationSpecReadinessProbe#timeoutSeconds
        '''
        result = self._values.get("timeout_seconds")
        return typing.cast(typing.Optional[jsii.Number], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecReadinessProbe(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecReadinessProbeExec",
    jsii_struct_bases=[],
    name_mapping={"command": "command"},
)
class ClusterInstallationSpecReadinessProbeExec:
    def __init__(
        self,
        *,
        command: typing.Optional[typing.Sequence[builtins.str]] = None,
    ) -> None:
        '''One and only one of the following should be specified.

        Exec specifies the action to take.

        :param command: Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        :schema: ClusterInstallationSpecReadinessProbeExec
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecReadinessProbeExec.__init__)
            check_type(argname="argument command", value=command, expected_type=type_hints["command"])
        self._values: typing.Dict[str, typing.Any] = {}
        if command is not None:
            self._values["command"] = command

    @builtins.property
    def command(self) -> typing.Optional[typing.List[builtins.str]]:
        '''Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem.

        The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.

        :schema: ClusterInstallationSpecReadinessProbeExec#command
        '''
        result = self._values.get("command")
        return typing.cast(typing.Optional[typing.List[builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecReadinessProbeExec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecReadinessProbeHttpGet",
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
        host: typing.Optional[builtins.str] = None,
        http_headers: typing.Optional[typing.Sequence[typing.Union["ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders", typing.Dict[str, typing.Any]]]] = None,
        path: typing.Optional[builtins.str] = None,
        scheme: typing.Optional[builtins.str] = None,
    ) -> None:
        '''HTTPGet specifies the http request to perform.

        :param port: Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
        :param http_headers: Custom headers to set in the request. HTTP allows repeated headers.
        :param path: Path to access on the HTTP server.
        :param scheme: Scheme to use for connecting to the host. Defaults to HTTP. Default: HTTP.

        :schema: ClusterInstallationSpecReadinessProbeHttpGet
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecReadinessProbeHttpGet.__init__)
            check_type(argname="argument port", value=port, expected_type=type_hints["port"])
            check_type(argname="argument host", value=host, expected_type=type_hints["host"])
            check_type(argname="argument http_headers", value=http_headers, expected_type=type_hints["http_headers"])
            check_type(argname="argument path", value=path, expected_type=type_hints["path"])
            check_type(argname="argument scheme", value=scheme, expected_type=type_hints["scheme"])
        self._values: typing.Dict[str, typing.Any] = {
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
        '''Name or number of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        :schema: ClusterInstallationSpecReadinessProbeHttpGet#port
        '''
        result = self._values.get("port")
        assert result is not None, "Required property 'port' is missing"
        return typing.cast("ClusterInstallationSpecReadinessProbeHttpGetPort", result)

    @builtins.property
    def host(self) -> typing.Optional[builtins.str]:
        '''Host name to connect to, defaults to the pod IP.

        You probably want to set "Host" in httpHeaders instead.

        :schema: ClusterInstallationSpecReadinessProbeHttpGet#host
        '''
        result = self._values.get("host")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def http_headers(
        self,
    ) -> typing.Optional[typing.List["ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders"]]:
        '''Custom headers to set in the request.

        HTTP allows repeated headers.

        :schema: ClusterInstallationSpecReadinessProbeHttpGet#httpHeaders
        '''
        result = self._values.get("http_headers")
        return typing.cast(typing.Optional[typing.List["ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders"]], result)

    @builtins.property
    def path(self) -> typing.Optional[builtins.str]:
        '''Path to access on the HTTP server.

        :schema: ClusterInstallationSpecReadinessProbeHttpGet#path
        '''
        result = self._values.get("path")
        return typing.cast(typing.Optional[builtins.str], result)

    @builtins.property
    def scheme(self) -> typing.Optional[builtins.str]:
        '''Scheme to use for connecting to the host.

        Defaults to HTTP.

        :default: HTTP.

        :schema: ClusterInstallationSpecReadinessProbeHttpGet#scheme
        '''
        result = self._values.get("scheme")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecReadinessProbeHttpGet(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders",
    jsii_struct_bases=[],
    name_mapping={"name": "name", "value": "value"},
)
class ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders:
    def __init__(self, *, name: builtins.str, value: builtins.str) -> None:
        '''HTTPHeader describes a custom header to be used in HTTP probes.

        :param name: The header field name.
        :param value: The header field value.

        :schema: ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders.__init__)
            check_type(argname="argument name", value=name, expected_type=type_hints["name"])
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        self._values: typing.Dict[str, typing.Any] = {
            "name": name,
            "value": value,
        }

    @builtins.property
    def name(self) -> builtins.str:
        '''The header field name.

        :schema: ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders#name
        '''
        result = self._values.get("name")
        assert result is not None, "Required property 'name' is missing"
        return typing.cast(builtins.str, result)

    @builtins.property
    def value(self) -> builtins.str:
        '''The header field value.

        :schema: ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders#value
        '''
        result = self._values.get("value")
        assert result is not None, "Required property 'value' is missing"
        return typing.cast(builtins.str, result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ClusterInstallationSpecReadinessProbeHttpGetPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="commattermost.ClusterInstallationSpecReadinessProbeHttpGetPort",
):
    '''Name or number of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    :schema: ClusterInstallationSpecReadinessProbeHttpGetPort
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ClusterInstallationSpecReadinessProbeHttpGetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecReadinessProbeHttpGetPort.from_number)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ClusterInstallationSpecReadinessProbeHttpGetPort", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ClusterInstallationSpecReadinessProbeHttpGetPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecReadinessProbeHttpGetPort.from_string)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ClusterInstallationSpecReadinessProbeHttpGetPort", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Any:
        return typing.cast(typing.Any, jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecReadinessProbeTcpSocket",
    jsii_struct_bases=[],
    name_mapping={"port": "port", "host": "host"},
)
class ClusterInstallationSpecReadinessProbeTcpSocket:
    def __init__(
        self,
        *,
        port: "ClusterInstallationSpecReadinessProbeTcpSocketPort",
        host: typing.Optional[builtins.str] = None,
    ) -> None:
        '''TCPSocket specifies an action involving a TCP port.

        TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook

        :param port: Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
        :param host: Optional: Host name to connect to, defaults to the pod IP.

        :schema: ClusterInstallationSpecReadinessProbeTcpSocket
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecReadinessProbeTcpSocket.__init__)
            check_type(argname="argument port", value=port, expected_type=type_hints["port"])
            check_type(argname="argument host", value=host, expected_type=type_hints["host"])
        self._values: typing.Dict[str, typing.Any] = {
            "port": port,
        }
        if host is not None:
            self._values["host"] = host

    @builtins.property
    def port(self) -> "ClusterInstallationSpecReadinessProbeTcpSocketPort":
        '''Number or name of the port to access on the container.

        Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

        :schema: ClusterInstallationSpecReadinessProbeTcpSocket#port
        '''
        result = self._values.get("port")
        assert result is not None, "Required property 'port' is missing"
        return typing.cast("ClusterInstallationSpecReadinessProbeTcpSocketPort", result)

    @builtins.property
    def host(self) -> typing.Optional[builtins.str]:
        '''Optional: Host name to connect to, defaults to the pod IP.

        :schema: ClusterInstallationSpecReadinessProbeTcpSocket#host
        '''
        result = self._values.get("host")
        return typing.cast(typing.Optional[builtins.str], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecReadinessProbeTcpSocket(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


class ClusterInstallationSpecReadinessProbeTcpSocketPort(
    metaclass=jsii.JSIIMeta,
    jsii_type="commattermost.ClusterInstallationSpecReadinessProbeTcpSocketPort",
):
    '''Number or name of the port to access on the container.

    Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.

    :schema: ClusterInstallationSpecReadinessProbeTcpSocketPort
    '''

    @jsii.member(jsii_name="fromNumber")
    @builtins.classmethod
    def from_number(
        cls,
        value: jsii.Number,
    ) -> "ClusterInstallationSpecReadinessProbeTcpSocketPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecReadinessProbeTcpSocketPort.from_number)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ClusterInstallationSpecReadinessProbeTcpSocketPort", jsii.sinvoke(cls, "fromNumber", [value]))

    @jsii.member(jsii_name="fromString")
    @builtins.classmethod
    def from_string(
        cls,
        value: builtins.str,
    ) -> "ClusterInstallationSpecReadinessProbeTcpSocketPort":
        '''
        :param value: -
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecReadinessProbeTcpSocketPort.from_string)
            check_type(argname="argument value", value=value, expected_type=type_hints["value"])
        return typing.cast("ClusterInstallationSpecReadinessProbeTcpSocketPort", jsii.sinvoke(cls, "fromString", [value]))

    @builtins.property
    @jsii.member(jsii_name="value")
    def value(self) -> typing.Any:
        return typing.cast(typing.Any, jsii.get(self, "value"))


@jsii.data_type(
    jsii_type="commattermost.ClusterInstallationSpecResources",
    jsii_struct_bases=[],
    name_mapping={"limits": "limits", "requests": "requests"},
)
class ClusterInstallationSpecResources:
    def __init__(
        self,
        *,
        limits: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
        requests: typing.Optional[typing.Mapping[builtins.str, builtins.str]] = None,
    ) -> None:
        '''Defines the resource requests and limits for the Mattermost app server pods.

        :param limits: Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
        :param requests: Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ClusterInstallationSpecResources
        '''
        if __debug__:
            type_hints = typing.get_type_hints(ClusterInstallationSpecResources.__init__)
            check_type(argname="argument limits", value=limits, expected_type=type_hints["limits"])
            check_type(argname="argument requests", value=requests, expected_type=type_hints["requests"])
        self._values: typing.Dict[str, typing.Any] = {}
        if limits is not None:
            self._values["limits"] = limits
        if requests is not None:
            self._values["requests"] = requests

    @builtins.property
    def limits(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Limits describes the maximum amount of compute resources allowed.

        More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ClusterInstallationSpecResources#limits
        '''
        result = self._values.get("limits")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    @builtins.property
    def requests(self) -> typing.Optional[typing.Mapping[builtins.str, builtins.str]]:
        '''Requests describes the minimum amount of compute resources required.

        If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/

        :schema: ClusterInstallationSpecResources#requests
        '''
        result = self._values.get("requests")
        return typing.cast(typing.Optional[typing.Mapping[builtins.str, builtins.str]], result)

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "ClusterInstallationSpecResources(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


__all__ = [
    "ClusterInstallation",
    "ClusterInstallationProps",
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
