import abc
import builtins
import datetime
import enum
import typing

import jsii
import publication
import typing_extensions

from ._jsii import *

import cdk8s
import constructs


class CronTab(
    cdk8s.ApiObject,
    metaclass=jsii.JSIIMeta,
    jsii_type="stableexamplecomcrontab.CronTab",
):
    """
    :schema: CronTab
    """

    def __init__(
        self,
        scope: constructs.Construct,
        id: builtins.str,
        *,
        spec: typing.Optional["CronTabSpec"] = None,
    ) -> None:
        """Defines a "CronTab" API object.

        :param scope: the scope in which to define this object.
        :param id: a scope-local name for the object.
        :param spec: 
        """
        props = CronTabOptions(spec=spec)

        jsii.create(CronTab, self, [scope, id, props])


@jsii.data_type(
    jsii_type="stableexamplecomcrontab.CronTabProps",
    jsii_struct_bases=[],
    name_mapping={"spec": "spec"},
)
class CronTabProps:
    def __init__(self, *, spec: typing.Optional["CronTabSpec"] = None) -> None:
        """
        :param spec: 

        :schema: CronTab
        """
        if isinstance(spec, dict):
            spec = CronTabSpec(**spec)
        self._values: typing.Dict[str, typing.Any] = {}
        if spec is not None:
            self._values["spec"] = spec

    @builtins.property
    def spec(self) -> typing.Optional["CronTabSpec"]:
        """
        :schema: CronTab#spec
        """
        result = self._values.get("spec")
        return result

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CronTabProps(%s)" % ", ".join(
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
        cron_spec: typing.Optional[builtins.str] = None,
        image: typing.Optional[builtins.str] = None,
        replicas: typing.Optional[jsii.Number] = None,
    ) -> None:
        """
        :param cron_spec: 
        :param image: 
        :param replicas: 

        :schema: CronTabSpec
        """
        self._values: typing.Dict[str, typing.Any] = {}
        if cron_spec is not None:
            self._values["cron_spec"] = cron_spec
        if image is not None:
            self._values["image"] = image
        if replicas is not None:
            self._values["replicas"] = replicas

    @builtins.property
    def cron_spec(self) -> typing.Optional[builtins.str]:
        """
        :schema: CronTabSpec#cronSpec
        """
        result = self._values.get("cron_spec")
        return result

    @builtins.property
    def image(self) -> typing.Optional[builtins.str]:
        """
        :schema: CronTabSpec#image
        """
        result = self._values.get("image")
        return result

    @builtins.property
    def replicas(self) -> typing.Optional[jsii.Number]:
        """
        :schema: CronTabSpec#replicas
        """
        result = self._values.get("replicas")
        return result

    def __eq__(self, rhs: typing.Any) -> builtins.bool:
        return isinstance(rhs, self.__class__) and rhs._values == self._values

    def __ne__(self, rhs: typing.Any) -> builtins.bool:
        return not (rhs == self)

    def __repr__(self) -> str:
        return "CronTabSpec(%s)" % ", ".join(
            k + "=" + repr(v) for k, v in self._values.items()
        )


__all__ = [
    "CronTab",
    "CronTabProps",
    "CronTabSpec",
]

publication.publish()
