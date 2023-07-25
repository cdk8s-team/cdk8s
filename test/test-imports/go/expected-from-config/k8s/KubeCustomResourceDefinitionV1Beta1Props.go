package k8s


// CustomResourceDefinition represents a resource that should be exposed on the API server.
//
// Its name MUST be in the format <.spec.name>.<.spec.group>. Deprecated in v1.16, planned for removal in v1.19. Use apiextensions.k8s.io/v1 CustomResourceDefinition instead.
type KubeCustomResourceDefinitionV1Beta1Props struct {
	// spec describes how the user wants the resources to appear.
	Spec *CustomResourceDefinitionSpecV1Beta1 `field:"required" json:"spec" yaml:"spec"`
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

