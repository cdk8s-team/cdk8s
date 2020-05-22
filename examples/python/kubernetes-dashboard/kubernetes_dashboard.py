#!/usr/bin/env python3

from constructs import Construct

from imports.k8s import *


class KubernetesDashboard(Construct):

    def __init__(self, scope: Construct, id: str, **kwargs):
        super().__init__(scope, id)

        label = {"app": "kubernetes-dashboard"}

        namespace = Namespace(self, "kubernetes-dashboard",
                              metadata=ObjectMeta(name="kubernetes-dashboard"))

        ServiceAccount(self, "service-account",
                       metadata=ObjectMeta(
                           name="kubernetes-dashboard",
                           namespace=namespace.name,
                           labels=label))

        Service(self, "service",
                metadata=ObjectMeta(
                    labels=label,
                    name="kubernetes-dashboard",
                    namespace="kubernetes-dashboard"
                ),
                spec=ServiceSpec(
                    ports=[
                        ServicePort(
                            port=443,
                            target_port=IntOrString.from_number(8443))],
                    selector=label))

        Secret(self, "secret",
               metadata=ObjectMeta(
                   name="kubernetes-dashboard-certs",
                   namespace=namespace.name,
                   labels=label),
               type="Opaque")

        Secret(self, "secret-csrf",
               metadata=ObjectMeta(
                   name="kubernetes-dashboard-csrf",
                   namespace=namespace.name,
                   labels=label),
               type="Opaque",
               data={"csrf": ""})

        Secret(self, "secret-key-holder",
               metadata=ObjectMeta(
                   name="kubernetes-dashboard-key-holder",
                   namespace=namespace.name,
                   labels=label),
               type="Opaque")

        ConfigMap(self, "config",
                  metadata=ObjectMeta(
                      name="kubernetes-dashboard-settings",
                      namespace=namespace.name,
                      labels=label)
                  )

        Role(
            self,
            "role",
            metadata=ObjectMeta(
                labels=label,
                name="kubernetes-dashboard",
                namespace="kubernetes-dashboard"
            ),
            rules=[
                PolicyRule(
                    api_groups=[""],
                    resources=["secrets"],
                    resource_names=["kubernetes-dashboard-key-holder", "kubernetes-dashboard-certs",
                                    "kubernetes-dashboard-csrf"],
                    verbs=["get", "update", "delete"],
                ),
                PolicyRule(
                    api_groups=[""],
                    resources=["configmaps"],
                    resource_names=["kubernetes-dashboard-settings"],
                    verbs=["get", "update"]
                ),
                PolicyRule(
                    api_groups=[""],
                    resources=["services"],
                    resource_names=["heapster", "dashboard-metrics-scraper"],
                    verbs=["proxy"]
                ),
                PolicyRule(
                    api_groups=[""],
                    resources=["services/proxy"],
                    resource_names=["heapster", "http:heapster:", "https:heapster:", "dashboard-metrics-scraper",
                                    "http:dashboard-metrics-scraper"],
                    verbs=["get"])])

        ClusterRole(
            self,
            "cluster-role",
            metadata=ObjectMeta(
                labels=label,
                name="kubernetes-dashboard"
            ),
            rules=[
                PolicyRule(
                    api_groups=["metrics.io"],
                    resources=["pods", "nodes"],
                    verbs=["get", "list", "watch"])])

        RoleBinding(
            self,
            "role-binding",
            metadata=ObjectMeta(
                labels=label,
                name="kubernetes-dashboard",
                namespace="kubernetes-dashboard"
            ),
            role_ref=RoleRef(
                api_group="rbac.authorization.k8s.io",
                kind="Role",
                name="kubernetes-dashboard"
            ),
            subjects=[
                Subject(
                    kind="ServiceAccount",
                    name="kubernetes-dashboard",
                    namespace="kubernetes-dashboard")])

        ClusterRoleBinding(
            self,
            "cluster-role-binding",
            metadata=ObjectMeta(
                name="kubernetes-dashboard"
            ),
            role_ref=RoleRef(
                api_group="rbac.authorization.k8s.io",
                kind="ClusterRole",
                name="kubernetes-dashboard"
            ),
            subjects=[
                Subject(
                    kind="ServiceAccount",
                    name="kubernetes-dashboard",
                    namespace="kubernetes-dashboard")])

        Deployment(
            self,
            "deployment",
            metadata=ObjectMeta(
                labels=label,
                name="kubernetes-dashboard",
                namespace="kubernetes-dashboard"
            ),
            spec=DeploymentSpec(
                replicas=1,
                revision_history_limit=10,
                selector=LabelSelector(
                    match_labels=label
                ),
                template=PodTemplateSpec(
                    metadata=ObjectMeta(
                        labels=label
                    ),
                    spec=PodSpec(
                        containers=[
                            Container(
                                name="kubernetes-dashboard",
                                image="kubernetesui/dashboard:v2.0.0",
                                image_pull_policy="Always",
                                ports=[
                                    ContainerPort(
                                        container_port=8443,
                                        protocol="TCP"
                                    )
                                ],
                                args=[
                                    "--auto-generate-certificates",
                                    "--namespace=kubernetes-dashboard",
                                ],
                                volume_mounts=[
                                    VolumeMount(
                                        name="kubernetes-dashboard-certs",
                                        mount_path="/certs"
                                    ),
                                    VolumeMount(
                                        name="tmp-volume",
                                        mount_path="/tmp"
                                    )
                                ],
                                liveness_probe=Probe(
                                    http_get=HTTPGetAction(
                                        scheme="HTTPS",
                                        path="/",
                                        port=IntOrString.from_number(8443)
                                    ),
                                    initial_delay_seconds=30,
                                    timeout_seconds=30
                                ),
                                security_context=SecurityContext(
                                    allow_privilege_escalation=False,
                                    read_only_root_filesystem=True,
                                    run_as_user=1001,
                                    run_as_group=2001
                                )
                            )
                        ],
                        volumes=[
                            Volume(
                                name="kubernetes-dashboard-certs",
                                secret=SecretVolumeSource(secret_name="kubernetes-dashboard-certs")
                            ),
                            Volume(
                                name="tmp-volume",
                                empty_dir=EmptyDirVolumeSource()
                            )
                        ],
                        service_account_name="kubernetes-dashboard",
                        node_selector={
                            "kubernetes.io/os": "linux"
                        },
                        tolerations=[
                            Toleration(
                                key="node-role.kubernetes.io/master",
                                effect="NoSchedule")]))))

        Service(
            self,
            "scraper-service",
            metadata=ObjectMeta(
                labels={"app": "dashboard-metrics-scraper"},
                name="dashboard-metrics-scraper",
                namespace="kubernetes-dashboard"
            ),
            spec=ServiceSpec(
                ports=[
                    ServicePort(
                        port=8000,
                        target_port=IntOrString.from_number(8000)
                    )
                ],
                selector={"app": "dashboard-metrics-scraper"}))

        Deployment(
            self,
            "scraper-deployment",
            metadata=ObjectMeta(
                labels=label,
                name="dashboard-metrics-scraper",
                namespace="kubernetes-dashboard"
            ),
            spec=DeploymentSpec(
                replicas=1,
                revision_history_limit=10,
                selector=LabelSelector(
                    match_labels={"app": "dashboard-metrics-scraper"}),
                template=PodTemplateSpec(
                    metadata=ObjectMeta(
                        labels={"app": "dashboard-metrics-scraper"},
                        annotations={"seccomp.security.alpha.kubernetes.io/pod": "runtime/default"}
                    ),
                    spec=PodSpec(
                        containers=[
                            Container(
                                name="dashboard-metrics-scraper",
                                image="kubernetesui/metrics-scraper:v1.0.4",
                                ports=[
                                    ContainerPort(
                                        container_port=8000,
                                        protocol="TCP"
                                    )
                                ],
                                liveness_probe=Probe(
                                    http_get=HTTPGetAction(
                                        scheme="HTTP",
                                        path="/",
                                        port=IntOrString.from_number(8000)
                                    )
                                ),
                                volume_mounts=[
                                    VolumeMount(
                                        mount_path="/tmp",
                                        name="tmp-volume"
                                    )
                                ],
                                security_context=SecurityContext(
                                    allow_privilege_escalation=False,
                                    read_only_root_filesystem=True,
                                    run_as_user=1001,
                                    run_as_group=2001))],
                        service_account_name="kubernetes-dashboard",
                        node_selector={
                            "kubernetes.io/os": "linux"
                        },
                        tolerations=[
                            Toleration(
                                key="node-role.kubernetes.io/master",
                                effect="NoSchedule"
                            )
                        ],
                        volumes=[
                            Volume(
                                name="tmp-volume",
                                empty_dir=EmptyDirVolumeSource())]))))
