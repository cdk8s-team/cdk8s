// k8s
package k8s


// CustomResourceColumnDefinition specifies a column for server side printing.
type CustomResourceColumnDefinition struct {
	// jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
	JsonPath *string `field:"required" json:"jsonPath" yaml:"jsonPath"`
	// name is a human readable name for the column.
	Name *string `field:"required" json:"name" yaml:"name"`
	// type is an OpenAPI type definition for this column.
	//
	// See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
	Type *string `field:"required" json:"type" yaml:"type"`
	// description is a human readable description of this column.
	Description *string `field:"optional" json:"description" yaml:"description"`
	// format is an optional OpenAPI type definition for this column.
	//
	// The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
	Format *string `field:"optional" json:"format" yaml:"format"`
	// priority is an integer defining the relative importance of this column compared to others.
	//
	// Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
	Priority *float64 `field:"optional" json:"priority" yaml:"priority"`
}

