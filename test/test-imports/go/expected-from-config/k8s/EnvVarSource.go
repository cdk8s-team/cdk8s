package k8s


// EnvVarSource represents a source for the value of an EnvVar.
type EnvVarSource struct {
	// Selects a key of a ConfigMap.
	ConfigMapKeyRef *ConfigMapKeySelector `field:"optional" json:"configMapKeyRef" yaml:"configMapKeyRef"`
	// Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
	FieldRef *ObjectFieldSelector `field:"optional" json:"fieldRef" yaml:"fieldRef"`
	// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
	ResourceFieldRef *ResourceFieldSelector `field:"optional" json:"resourceFieldRef" yaml:"resourceFieldRef"`
	// Selects a key of a secret in the pod's namespace.
	SecretKeyRef *SecretKeySelector `field:"optional" json:"secretKeyRef" yaml:"secretKeyRef"`
}

