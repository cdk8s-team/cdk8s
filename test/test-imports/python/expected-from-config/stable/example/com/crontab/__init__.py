import abc
import builtins
import datetime
import enum
import typing

import jsii
import jsii.compat
import publication

from ._jsii import *

import cdk8s
import constructs


class CronTab(
    cdk8s.ApiObject,
    metaclass=jsii.JSIIMeta,
    jsii_type="stableexamplecomcrontab.CronTab",
):
    """
    schema:
    :schema:: CronTab
    """

    def __init__(
        self,
        scope: constructs.Construct,
        name: str,
        *,
        spec: typing.Optional["CronTabSpec"] = None,
    ) -> None:
        """Defines a "CronTab" API object.

        :param scope: the scope in which to define this object.
        :param name: a scope-local name for the object.
        :param spec: 
        """
        options = CronTabOptions(spec=spec)

        jsii.create(CronTab, self, [scope, name, options])


@jsii.data_type(
    jsii_type="stableexamplecomcrontab.CronTabOptions",
    jsii_struct_bases=[],
    name_mapping={"spec": "spec"},
)
class CronTabOptions:
    def __init__(self, *, spec: typing.Optional["CronTabSpec"] = None) -> None:
        """
        :param spec: 

        schema:
        :schema:: CronTab
        """
        if isinstance(spec, dict):
            spec = CronTabSpec(**spec)
        self._values = {}
        if spec is not None:
            self._values["spec"] = spec

    @builtins.property
    def spec(self) -> typing.Optional["CronTabSpec"]:
        """
        schema:
        :schema:: CronTab#spec
        """
        return self._values.get("spec")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CronTabOptions(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


@jsii.data_type(
    jsii_type="stableexamplecomcrontab.CronTabSpec",
    jsii_struct_bases=[],
    name_mapping={"cron_spec": "cronSpec", "image": "image", "replicas": "replicas"},
)
class CronTabSpec:
    def __init__(
        self,
        *,
        cron_spec: typing.Optional[str] = None,
        image: typing.Optional[str] = None,
        replicas: typing.Optional[jsii.Number] = None,
    ) -> None:
        """
        :param cron_spec: 
        :param image: 
        :param replicas: 

        schema:
        :schema:: CronTabSpec
        """
        self._values = {}
        if cron_spec is not None:
            self._values["cron_spec"] = cron_spec
        if image is not None:
            self._values["image"] = image
        if replicas is not None:
            self._values["replicas"] = replicas

    @builtins.property
    def cron_spec(self) -> typing.Optional[str]:
        """
        schema:
        :schema:: CronTabSpec#cronSpec
        """
        return self._values.get("cron_spec")

    @builtins.property
    def image(self) -> typing.Optional[str]:
        """
        schema:
        :schema:: CronTabSpec#image
        """
        return self._values.get("image")

    @builtins.property
    def replicas(self) -> typing.Optional[jsii.Number]:
        """
        schema:
        :schema:: CronTabSpec#replicas
        """
        return self._values.get("replicas")

    def __eq__(self, rhs) -> bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs) -> bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CronTabSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


__all__ = [
    "CronTab",
    "CronTabOptions",
    "CronTabSpec",
]

publication.publish()
