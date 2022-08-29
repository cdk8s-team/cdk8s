// k8s
package k8s

import (
	"time"
)

// ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
type ManagedFieldsEntry struct {
	// APIVersion defines the version of this resource that this field set applies to.
	//
	// The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
	ApiVersion *string `field:"optional" json:"apiVersion" yaml:"apiVersion"`
	// FieldsType is the discriminator for the different fields format and version.
	//
	// There is currently only one possible value: "FieldsV1".
	FieldsType *string `field:"optional" json:"fieldsType" yaml:"fieldsType"`
	// FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
	FieldsV1 interface{} `field:"optional" json:"fieldsV1" yaml:"fieldsV1"`
	// Manager is an identifier of the workflow managing these fields.
	Manager *string `field:"optional" json:"manager" yaml:"manager"`
	// Operation is the type of operation which lead to this ManagedFieldsEntry being created.
	//
	// The only valid values for this field are 'Apply' and 'Update'.
	Operation *string `field:"optional" json:"operation" yaml:"operation"`
	// Time is timestamp of when these fields were set.
	//
	// It should always be empty if Operation is 'Apply'.
	Time *time.Time `field:"optional" json:"time" yaml:"time"`
}

