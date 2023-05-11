package k8s

import (
	_init_ "example.com/test/imports/k8s/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

type IntOrString interface {
	Value() interface{}
}

// The jsii proxy struct for IntOrString
type jsiiProxy_IntOrString struct {
	_ byte // padding
}

func (j *jsiiProxy_IntOrString) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func IntOrString_FromNumber(value *float64) IntOrString {
	_init_.Initialize()

	if err := validateIntOrString_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns IntOrString

	_jsii_.StaticInvoke(
		"k8s.IntOrString",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func IntOrString_FromString(value *string) IntOrString {
	_init_.Initialize()

	if err := validateIntOrString_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns IntOrString

	_jsii_.StaticInvoke(
		"k8s.IntOrString",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

