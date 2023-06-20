package jenkinsio

import (
	_init_ "example.com/test/imports/jenkinsio/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersReadinessProbeTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersReadinessProbeTcpSocketPort
type jsiiProxy_JenkinsSpecMasterContainersReadinessProbeTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersReadinessProbeTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersReadinessProbeTcpSocketPort_FromNumber(value *float64) JenkinsSpecMasterContainersReadinessProbeTcpSocketPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersReadinessProbeTcpSocketPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersReadinessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersReadinessProbeTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersReadinessProbeTcpSocketPort_FromString(value *string) JenkinsSpecMasterContainersReadinessProbeTcpSocketPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersReadinessProbeTcpSocketPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersReadinessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersReadinessProbeTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

