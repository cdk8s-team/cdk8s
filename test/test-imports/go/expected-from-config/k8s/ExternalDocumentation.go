package k8s


// ExternalDocumentation allows referencing an external resource for extended documentation.
type ExternalDocumentation struct {
	Description *string `field:"optional" json:"description" yaml:"description"`
	Url *string `field:"optional" json:"url" yaml:"url"`
}

