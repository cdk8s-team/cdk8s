package jenkinsio

import (
	_init_ "example.com/test/imports/jenkinsio/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort
type jsiiProxy_JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort_FromNumber(value *float64) JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLifecyclePostStartHttpGetPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort_FromString(value *string) JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLifecyclePostStartHttpGetPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePostStartHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

