package jenkinsio

import (
	_init_ "example.com/test/imports/jenkinsio/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort
type jsiiProxy_JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort_FromNumber(value *float64) JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort_FromString(value *string) JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

