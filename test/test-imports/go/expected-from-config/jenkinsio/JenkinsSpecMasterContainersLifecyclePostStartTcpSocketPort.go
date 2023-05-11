package jenkinsio

import (
	_init_ "example.com/test/imports/jenkinsio/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort
type jsiiProxy_JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort_FromNumber(value *float64) JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort_FromString(value *string) JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePostStartTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

