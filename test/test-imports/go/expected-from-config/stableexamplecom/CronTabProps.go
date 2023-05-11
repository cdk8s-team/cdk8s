package stableexamplecom

import (
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

type CronTabProps struct {
	Metadata *cdk8s.ApiObjectMetadata `field:"optional" json:"metadata" yaml:"metadata"`
	Spec *CronTabSpec `field:"optional" json:"spec" yaml:"spec"`
}

