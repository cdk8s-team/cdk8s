// mattermost_mattermostcom
package mattermost_mattermostcom

import (
	_init_ "example.com/test/imports/mattermost_mattermostcom/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type ClusterInstallationSpecLivenessProbeHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for ClusterInstallationSpecLivenessProbeHttpGetPort
type jsiiProxy_ClusterInstallationSpecLivenessProbeHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_ClusterInstallationSpecLivenessProbeHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ClusterInstallationSpecLivenessProbeHttpGetPort_FromNumber(value *float64) ClusterInstallationSpecLivenessProbeHttpGetPort {
	_init_.Initialize()

	if err := validateClusterInstallationSpecLivenessProbeHttpGetPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ClusterInstallationSpecLivenessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbeHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ClusterInstallationSpecLivenessProbeHttpGetPort_FromString(value *string) ClusterInstallationSpecLivenessProbeHttpGetPort {
	_init_.Initialize()

	if err := validateClusterInstallationSpecLivenessProbeHttpGetPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ClusterInstallationSpecLivenessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbeHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

