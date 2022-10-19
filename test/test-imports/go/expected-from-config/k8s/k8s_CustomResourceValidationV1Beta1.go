// k8s
package k8s


// CustomResourceValidation is a list of validation methods for CustomResources.
type CustomResourceValidationV1Beta1 struct {
	// openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
	OpenApiv3Schema *JsonSchemaPropsV1Beta1 `field:"optional" json:"openApiv3Schema" yaml:"openApiv3Schema"`
}

