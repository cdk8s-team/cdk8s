package mattermost_mattermostcom

import (
	_init_ "example.com/test/imports/mattermost_mattermostcom/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type ClusterInstallationSpecReadinessProbeTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for ClusterInstallationSpecReadinessProbeTcpSocketPort
type jsiiProxy_ClusterInstallationSpecReadinessProbeTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_ClusterInstallationSpecReadinessProbeTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ClusterInstallationSpecReadinessProbeTcpSocketPort_FromNumber(value *float64) ClusterInstallationSpecReadinessProbeTcpSocketPort {
	_init_.Initialize()

	if err := validateClusterInstallationSpecReadinessProbeTcpSocketPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ClusterInstallationSpecReadinessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbeTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ClusterInstallationSpecReadinessProbeTcpSocketPort_FromString(value *string) ClusterInstallationSpecReadinessProbeTcpSocketPort {
	_init_.Initialize()

	if err := validateClusterInstallationSpecReadinessProbeTcpSocketPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ClusterInstallationSpecReadinessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbeTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

