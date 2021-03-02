# Changelog

All notable changes to this project will be documented in this file. See [standard-version](https://github.com/conventional-changelog/standard-version) for commit guidelines.

## [1.0.0-beta.10](https://github.com/awslabs/cdk8s/compare/v1.0.0-beta.9...v1.0.0-beta.10) (2021-03-02)

## [1.0.0-beta.9](https://github.com/awslabs/cdk8s/compare/v1.0.0-beta.8...v1.0.0-beta.9) (2021-02-22)


### Features

* **lib:** flag to disable dictionary sort ([#534](https://github.com/awslabs/cdk8s/issues/534)) ([a4eca40](https://github.com/awslabs/cdk8s/commit/a4eca40f72d654ea0355ec513073b05c7dbffe9e)), closes [#525](https://github.com/awslabs/cdk8s/issues/525)


### Bug Fixes

* **lib:** ENOBUFS for large helm charts ([#529](https://github.com/awslabs/cdk8s/issues/529)) ([4164f38](https://github.com/awslabs/cdk8s/commit/4164f38706b5a2bb65aff0224df6e133e217f070)), closes [#454](https://github.com/awslabs/cdk8s/issues/454)

## [1.0.0-beta.8](https://github.com/awslabs/cdk8s/compare/v1.0.0-beta.7...v1.0.0-beta.8) (2021-02-04)


### Bug Fixes

* **go:** invalid go module name ([87af61b](https://github.com/awslabs/cdk8s/commit/87af61ba4e4942b4e1d01d3ee4f05bcea8d57e3a))

## [1.0.0-beta.7](https://github.com/awslabs/cdk8s/compare/v1.0.0-beta.6...v1.0.0-beta.7) (2021-02-04)


### ⚠ BREAKING CHANGES

* **lib:** the deprecated API `Duration.toISOString()` has been removed. Use `Duration.toIsoString()` instead.

### Features

* **plus-17:** add StatefulSet construct ([#400](https://github.com/awslabs/cdk8s/issues/400)) ([98aad99](https://github.com/awslabs/cdk8s/commit/98aad99a0a325b706c8f1c4e5f2ac1af77795400))
* **plus-17:** restrict CIDR IP addresses for a LoadBalancer ([#446](https://github.com/awslabs/cdk8s/issues/446)) ([cf96ae2](https://github.com/awslabs/cdk8s/commit/cf96ae2319e821307e23d6343883b531294e6359)), closes [#435](https://github.com/awslabs/cdk8s/issues/435)
* experimental golang bindings ([#523](https://github.com/awslabs/cdk8s/issues/523)) ([6737351](https://github.com/awslabs/cdk8s/commit/6737351ee3c3d119e0a2969e90f911b9e45c1a11))
* only publish doc site on release commits ([#507](https://github.com/awslabs/cdk8s/issues/507)) ([5acc54b](https://github.com/awslabs/cdk8s/commit/5acc54b004951e60334abc369ec85a537cc2a973))


### Bug Fixes

* **cli:** allow any python 3 to be used ([#518](https://github.com/awslabs/cdk8s/issues/518)) ([2a49196](https://github.com/awslabs/cdk8s/commit/2a491963547eab0b3348acae03fc5bf1db215794))
* **lib:** deprecated toISOString() conflicts with toIsoString() ([#524](https://github.com/awslabs/cdk8s/issues/524)) ([d4e0c3d](https://github.com/awslabs/cdk8s/commit/d4e0c3d75c65ec91908327fbb7ce24d7d6981b9e))
* not folding strings ([#495](https://github.com/awslabs/cdk8s/issues/495)) ([8dda8bd](https://github.com/awslabs/cdk8s/commit/8dda8bdac90f9254fa95a736a1b29c87609934df)), closes [#494](https://github.com/awslabs/cdk8s/issues/494)

## [1.0.0-beta.6](https://github.com/awslabs/cdk8s/compare/v1.0.0-beta.5...v1.0.0-beta.6) (2021-01-21)


### Features

* **cli:** new version notifications ([#454](https://github.com/awslabs/cdk8s/issues/454)) ([065756e](https://github.com/awslabs/cdk8s/commit/065756ef89afa938cc120f3af83b23851e06098d)), closes [#452](https://github.com/awslabs/cdk8s/issues/452)
* **plus-17:** Add type option for secrets in kplus. ([#425](https://github.com/awslabs/cdk8s/issues/425)) ([28d660f](https://github.com/awslabs/cdk8s/commit/28d660f6d252de26268d3eb72060580894de3e21))


### Bug Fixes

* set yaml default schema to 1.1 ([#505](https://github.com/awslabs/cdk8s/issues/505)) ([266c094](https://github.com/awslabs/cdk8s/commit/266c094b19231e3beea836a6d77842954077d4f1))
* **docs:** correct logo paths ([#503](https://github.com/awslabs/cdk8s/issues/503)) ([9426047](https://github.com/awslabs/cdk8s/commit/94260473ef7c7e29799b4368981c8415dbd0fd8f))
* **plus-17:** adds externalName to service props ([#424](https://github.com/awslabs/cdk8s/issues/424)) ([b4b7c55](https://github.com/awslabs/cdk8s/commit/b4b7c55134ffc14203a58eb72227251225c79cc3))
* **plus-17:** multiple mounts per volume result in duplicate volumes for pod spec ([#489](https://github.com/awslabs/cdk8s/issues/489)) ([47c913e](https://github.com/awslabs/cdk8s/commit/47c913e1abc026611332fcf03b209adda7aba419))

## [1.0.0-beta.5](https://github.com/awslabs/cdk8s/compare/v1.0.0-beta.4...v1.0.0-beta.5) (2020-12-15)


### Features

* **cli:** enable using imported resources as raw manifests ([#447](https://github.com/awslabs/cdk8s/issues/447)) ([aa2422e](https://github.com/awslabs/cdk8s/commit/aa2422e1844d4684b0c61f871c9cbc9f34c08183))


### Bug Fixes

* **cli:** importing local files is broken on windows ([#427](https://github.com/awslabs/cdk8s/issues/427)) ([2c4a185](https://github.com/awslabs/cdk8s/commit/2c4a1858b5c88cf4e5eb6ac5e8f0bcb1495adbf4))

## [1.0.0-beta.4](https://github.com/awslabs/cdk8s/compare/v1.0.0-beta.3...v1.0.0-beta.4) (2020-12-13)


### Features

* **cli:** import a single module per api group ([#402](https://github.com/awslabs/cdk8s/issues/402)) ([ac295fe](https://github.com/awslabs/cdk8s/commit/ac295fe78544c4b06f732fe945dfa6423eea5c83)), closes [#378](https://github.com/awslabs/cdk8s/issues/378) [#401](https://github.com/awslabs/cdk8s/issues/401)
* **lib:** allow hash to be optionally included in Names functions. ([#396](https://github.com/awslabs/cdk8s/issues/396)) ([2c86526](https://github.com/awslabs/cdk8s/commit/2c86526e6434b7317c338b3446613b8ff7650e5a))
* **plus-17:** additional options for the Job construct. ([#398](https://github.com/awslabs/cdk8s/issues/398)) ([17e8801](https://github.com/awslabs/cdk8s/commit/17e8801bc748e3ff0e999b994645058cc17637ce))


### Bug Fixes

* **lib:** Lazy is not resolved in metadata ([#443](https://github.com/awslabs/cdk8s/issues/443)) ([914d4a8](https://github.com/awslabs/cdk8s/commit/914d4a89ace15a6081267cbf5d359459f8514ee9))
* **cli:** which command missing for windows ([#417](https://github.com/awslabs/cdk8s/issues/417)) ([38a7034](https://github.com/awslabs/cdk8s/commit/38a703411c7162bfa4d1904ef6b94e2a017ea4da))
* **docs:** align getting started with new code ([#410](https://github.com/awslabs/cdk8s/issues/410)) ([c61e109](https://github.com/awslabs/cdk8s/commit/c61e109e5cdddeb6c5c3b4ff86d2f7f79e11b9ff))
* **docs:** WebService typescript example formatting ([#408](https://github.com/awslabs/cdk8s/issues/408)) ([e2470f9](https://github.com/awslabs/cdk8s/commit/e2470f96e737af784f11168474ca24e52619c238))
* **plus-17:** don't allow containers to be contructed from containers ([#404](https://github.com/awslabs/cdk8s/issues/404)) ([5d11533](https://github.com/awslabs/cdk8s/commit/5d11533f9aea672793459b9f2c6caaddb6430e3e))

## [1.0.0-beta.3](https://github.com/awslabs/cdk8s/compare/v1.0.0-beta.2...v1.0.0-beta.3) (2020-11-19)


### Features

* **cli:** stdout option for cdk8s synth ([#361](https://github.com/awslabs/cdk8s/issues/361)) ([bbf116b](https://github.com/awslabs/cdk8s/commit/bbf116b93d9a14c24094aa51ec3a383489341190))
* add contributor instructions about using jsii docker image ([#397](https://github.com/awslabs/cdk8s/issues/397)) ([bb0a5cc](https://github.com/awslabs/cdk8s/commit/bb0a5cc0762e753f1f18093b3cd15cbb83bd7c5e))


### Bug Fixes

* **cli:** python init template doesn't install cdk8s-plus in the correct env ([#399](https://github.com/awslabs/cdk8s/issues/399)) ([0d3017b](https://github.com/awslabs/cdk8s/commit/0d3017b4285bb015d129cdf24c9e2da2d00f9025))

## [1.0.0-beta.2](https://github.com/awslabs/cdk8s/compare/v1.0.0-beta.1...v1.0.0-beta.2) (2020-11-19)


### ⚠ BREAKING CHANGES

* **lib:** CAUTION! Auto-generated resource names will change with this release. Resource names in manifests synthesized by a previous version of the CDK8s will be invalidated. Deploying new manifests will cause **resources to be replaced**. Temporarily, you can opt to use the legacy hashing mechanism by setting the environment variable `CDK8S_LEGACY_HASH=1`.
* **lib:** `Names.toDnsLabel()` now accepts a construct scope instead of a string path, and a set of options instead of `maxLen`.
* **lib:** `Names.toLabelValue()` now accepts a construct scope instead of a string path, and a set of options instead of `maxLen`.

### Features

* **cli:** import from crds.dev ([#378](https://github.com/awslabs/cdk8s/issues/378)) ([c62d0a4](https://github.com/awslabs/cdk8s/commit/c62d0a4c86c6256d93cc8b717b081fd4a16de0be)), closes [#377](https://github.com/awslabs/cdk8s/issues/377)


### Bug Fixes

* **cli:** python init templates are broken ([#393](https://github.com/awslabs/cdk8s/issues/393)) ([d786001](https://github.com/awslabs/cdk8s/commit/d786001edd0b91653d14aa687865f3e1eb68a88f))
* **lib:** names generated using non-FIPS compliant algorithm ([#392](https://github.com/awslabs/cdk8s/issues/392)) ([a1acae7](https://github.com/awslabs/cdk8s/commit/a1acae7a1b935fc06a15c820bf28619d1e4c0f37)), closes [#334](https://github.com/awslabs/cdk8s/issues/334)

## [1.0.0-beta.1](https://github.com/awslabs/cdk8s/compare/v0.33.0...v1.0.0-beta.1) (2020-11-18)


### ⚠ BREAKING CHANGES

* **plus-17:** All L2 resource names will undergo a name change (e.g `test-chart-config-configmap-233db8e7` -> `test-chart-config-c3f7d3c0`)
* **cli:** Construct input types generated by `cdk8s import` are now called `XxxProps` instead of `XxxOptions` to conform with the CDK ecosystem.
* **lib:** `ApiObjectOptions` is now called `ApiObjectProps`
* **lib:** `AppOptions` is now called `AppProps`
* **lib:** `ChartOptions` is now called `ChartProps`
* **lib:** `HelmOptions` is now called `HelmProps`
* **lib:** `IncludeOptions` is now called `IncludeProps`
* **cli:** when importing k8s api objects using `cdk8s import`, non-stable APIs will be have an API level postfix. For example, k8s@1.18 will have an `IngressV1Beta1` API object.
* **cli:** The `--include` CLI option has been removed since all API objects are always imported.
* **cli:** When using the CLI to import the core Kubernetes API objects, the imported classes will now have a `Kube` prefix in order to make it easier to differentiate them from the classes offered by the high-level APIs in CDK8s+ (e.g. `k8s.Deployment` is now `k8s.KubeDeployment`). You can disable through the `--no-class-prefix` option: `cdk8s import --no-class-prefix k8s`.
* **plus-17:** Containers now need to be inputed as interfaces rather than classes. Instead of passing `new kplus.Container(props)`, simply pass in `props`.

### Features

* **plus:** renamed to `cdk8s-plus-17`. The `17` marks the minimum supported version of the kubernetes spec.
* **website:** documentation website ([#367](https://github.com/awslabs/cdk8s/issues/367)) ([505f946](https://github.com/awslabs/cdk8s/commit/505f9460e53a0cf3a0249b762431addda999ec4a)), closes [#366](https://github.com/awslabs/cdk8s/issues/366)
* **cdk8s:** escape hatches ([#372](https://github.com/awslabs/cdk8s/issues/372)) ([12b0f01](https://github.com/awslabs/cdk8s/commit/12b0f01c5c1ef4c621f5b501d39911a207251ca1)), closes [#144](https://github.com/awslabs/cdk8s/issues/144)
* **cli:** class prefix for imported constructs ([#370](https://github.com/awslabs/cdk8s/issues/370)) ([0b18df3](https://github.com/awslabs/cdk8s/commit/0b18df37a42d1c2f29719089cf7996efdbab8cb3)), closes [#140](https://github.com/awslabs/cdk8s/issues/140)
* **cli:** import constructs for all API levels ([#379](https://github.com/awslabs/cdk8s/issues/379)) ([b0d7621](https://github.com/awslabs/cdk8s/commit/b0d76210fe944b03f8197b821da134120015e139)), closes [#380](https://github.com/awslabs/cdk8s/issues/380)
* **plus-17:** add liveness and startup probes to Container ([#358](https://github.com/awslabs/cdk8s/issues/358)) ([f3f9a6a](https://github.com/awslabs/cdk8s/commit/f3f9a6a7474e60ff90376a4d74be55d08014b2d3))
* **plus-17:** Container is now inputed as an interface instead of class ([#376](https://github.com/awslabs/cdk8s/issues/376)) ([33bf97a](https://github.com/awslabs/cdk8s/commit/33bf97a9a6f4bca5c259964d833955639835f12c))
* **plus-17:** expose service options in `expose()` ([#357](https://github.com/awslabs/cdk8s/issues/357)) ([7137698](https://github.com/awslabs/cdk8s/commit/713769883c9b4fe0ec443d0e776155d720b65cb6))
* switch to 1.0.0-beta version line ([#384](https://github.com/awslabs/cdk8s/issues/384)) ([ffce8c6](https://github.com/awslabs/cdk8s/commit/ffce8c696ce502ec4a14f65b715474faa7f74c7b))


### Bug Fixes

* **cli:** input type names are "XxxOptions" instead of "XxxProps" ([#381](https://github.com/awslabs/cdk8s/issues/381)) ([b2bd34e](https://github.com/awslabs/cdk8s/commit/b2bd34e43dc487673b7dce3061195465a5806f38)), closes [#371](https://github.com/awslabs/cdk8s/issues/371)
* **plus-17:** L2 default child ([#389](https://github.com/awslabs/cdk8s/issues/389)) ([a8337e8](https://github.com/awslabs/cdk8s/commit/a8337e805dce81e0d0883bb296c1017b5ac2311f))

## [0.33.0](https://github.com/awslabs/cdk8s/compare/v0.32.0...v0.33.0) (2020-10-21)


### Features

* chart-level labels ([#355](https://github.com/awslabs/cdk8s/issues/355)) ([c545c1e](https://github.com/awslabs/cdk8s/commit/c545c1efec86d3af5852101d01f4fbad2e000ac6))

## [0.32.0](https://github.com/awslabs/cdk8s/compare/v0.31.0...v0.32.0) (2020-10-20)


### ⚠ BREAKING CHANGES

* **lib:** `EnvValue.fromSecret(secret, key)` has been removed in favor of `EnvValue.fromSecretValue({ secret, key })`.

### Features

* **lib:** SecretValue ([#351](https://github.com/awslabs/cdk8s/issues/351)) ([dd7cf58](https://github.com/awslabs/cdk8s/commit/dd7cf5857b82da75b88f6786933070c570e5df23))
* **plus:** readiness probes ([#353](https://github.com/awslabs/cdk8s/issues/353)) ([a57e466](https://github.com/awslabs/cdk8s/commit/a57e466d67b561bec95c7be26eb7a36625ebb744))


### Bug Fixes

* **lib:** corrupted manifests when including large files ([#350](https://github.com/awslabs/cdk8s/issues/350)) ([649f41b](https://github.com/awslabs/cdk8s/commit/649f41ba65a9bb7f8c7d0c4a260ae9ddd773afb8))
* **lib:** fail to import octal numbers via include (and helm) ([#349](https://github.com/awslabs/cdk8s/issues/349)) ([bed9eed](https://github.com/awslabs/cdk8s/commit/bed9eedd31e07bd00461d6e54c798bf43fc65ede)), closes [#348](https://github.com/awslabs/cdk8s/issues/348)

## [0.31.0](https://github.com/awslabs/cdk8s/compare/v0.30.0...v0.31.0) (2020-10-19)


### ⚠ BREAKING CHANGES

* **plus:** `spec` was removed from all cdk8s+ constructs and that now have a flat structure. See [Example](https://github.com/awslabs/cdk8s/tree/master/packages/cdk8s-plus#at-a-glance) for new usage.
* **plus**: Construct id's for deployment will change due to a latent bug that appended the word `pod` to them.
* **plus:** `deployment.expose()` now takes `port` as a positional argument (before: `deployment.expose({ port })`, now: `deployment.expose(port)`).
* **lib:** auto-generated resource names that included duplicate hyphens will change will be replaced when applied.
* **lib:** cdk8s-plus's value of a label `cdk8s.deployment` of Pods are changed

### Features

* **lib:** helm construct ([#346](https://github.com/awslabs/cdk8s/issues/346)) ([6ee449f](https://github.com/awslabs/cdk8s/commit/6ee449fc1b82e2c59ec24d327044f828665df8b5)), closes [#65](https://github.com/awslabs/cdk8s/issues/65)
* **plus:** Ingress ([#340](https://github.com/awslabs/cdk8s/issues/340)) ([14ac668](https://github.com/awslabs/cdk8s/commit/14ac668f5f88445f14864ac3d271f8a9afbd40c7)), closes [#125](https://github.com/awslabs/cdk8s/issues/125)
* **plus:** service.addDeployment() ([#342](https://github.com/awslabs/cdk8s/issues/342)) ([5413b3b](https://github.com/awslabs/cdk8s/commit/5413b3bf6ca13f9839407d561b622e64a4de62e4))
* migrate to cdk.dev slack workspace ([#336](https://github.com/awslabs/cdk8s/issues/336)) ([b203e5a](https://github.com/awslabs/cdk8s/commit/b203e5a897e297227c33442031ce3b0dcfefa486))


### Bug Fixes

* **lib:** `uniqueId` is not compatible with the k8s labels ([#326](https://github.com/awslabs/cdk8s/issues/326)) ([161f368](https://github.com/awslabs/cdk8s/commit/161f3682e9229cace25d3c283c98028f1e1ca0a6)), closes [#323](https://github.com/awslabs/cdk8s/issues/323)
* **lib:** duplicate hyphens in generated resource names ([#341](https://github.com/awslabs/cdk8s/issues/341)) ([6f6366a](https://github.com/awslabs/cdk8s/commit/6f6366a55c31f6ec9af09f33effcfa52a1b23fe8))
* allow tests to run without write access to os.tmpdir parent ([#338](https://github.com/awslabs/cdk8s/issues/338)) ([dc17022](https://github.com/awslabs/cdk8s/commit/dc1702207deb4367a1d05717a009851a7d3dac68))
* Fix yaml quote serialization 325 ([#327](https://github.com/awslabs/cdk8s/issues/327)) ([6b1f662](https://github.com/awslabs/cdk8s/commit/6b1f66278446efd01cb3d0b61a5fca712725fefa)), closes [#325](https://github.com/awslabs/cdk8s/issues/325)
* **plus:** Remove the `spec` nesting level on both input and output ([#347](https://github.com/awslabs/cdk8s/issues/347)) ([5e34850](https://github.com/awslabs/cdk8s/commit/5e34850f4b3cc9c80fda4f0df245afcaa29b1daf))

## [0.30.0](https://github.com/awslabs/cdk8s/compare/v0.28.0...v0.30.0) (2020-10-04)

### Features

* **plus:** Bump k8s imports to use spec version 1.17.0 ([#331](https://github.com/awslabs/cdk8s/pull/331)) ([23fea73](https://github.com/awslabs/cdk8s/commit/23fea73c443c5a0d6ded1519fb3f6edf8d8fc80b))

### Features

* **lib:** Expose DependecyGraph for upstream use ([#329](https://github.com/awslabs/cdk8s/issues/329)) ([ee88402](https://github.com/awslabs/cdk8s/commit/ee884023a313fae44e69124da9e37a9e52611845)), closes [#328](https://github.com/awslabs/cdk8s/issues/328)

## [0.29.0](https://github.com/awslabs/cdk8s/compare/v0.28.0...v0.29.0) (2020-09-27)

### Features

* **lib:** Upgrade constructs ([#324](https://github.com/awslabs/cdk8s/issues/324)) ([070b600](https://github.com/awslabs/cdk8s/commit/070b60093bcf626deb75e8ae0f192e24797d39d8))

## [0.28.0](https://github.com/awslabs/cdk8s/compare/v0.27.0...v0.28.0) (2020-09-14)


### Features

* **plus:** ImagePullPolicy support for cdk8s-plus Container ([#313](https://github.com/awslabs/cdk8s/issues/313)) ([8307757](https://github.com/awslabs/cdk8s/commit/8307757deb9b70db4fda716d4a4afb7cef522dc9))


### Bug Fixes

* **examples:** Add missing dependencies on python examples. ([#290](https://github.com/awslabs/cdk8s/issues/290)) ([36e6fab](https://github.com/awslabs/cdk8s/commit/36e6fab9c4c0f30f6f49c93c1f284d8054955fcd)), closes [#289](https://github.com/awslabs/cdk8s/issues/289)
* **plus:** support node ports for cdk8s-plus service ([#315](https://github.com/awslabs/cdk8s/issues/315)) ([85ec225](https://github.com/awslabs/cdk8s/commit/85ec225bcdbab3631ffebbf6c93c3ac70937b4b9)), closes [#296](https://github.com/awslabs/cdk8s/issues/296)
* **website:** doc links are broken due to wrong version number ([#312](https://github.com/awslabs/cdk8s/issues/312)) ([f2f9402](https://github.com/awslabs/cdk8s/commit/f2f9402d975aa9a2b8bab6db68fc8bccb74a6772)), closes [#307](https://github.com/awslabs/cdk8s/issues/307)

## [0.27.0](https://github.com/awslabs/cdk8s/compare/v0.26.0...v0.27.0) (2020-08-05)


### ⚠ BREAKING CHANGES

* **lib:** resource names will now be rendered differently, omitting adjacent duplicate components.

### Features

* **examples:** Elasticsearch query using CDK8s+ and CRD ([#281](https://github.com/awslabs/cdk8s/issues/281)) ([3be1a96](https://github.com/awslabs/cdk8s/commit/3be1a96b1801f2e23673b454e0a0b59cf7f1b6e5))
* **lib:** omit duplicate components in generated names ([#258](https://github.com/awslabs/cdk8s/issues/258)) ([473b5ef](https://github.com/awslabs/cdk8s/commit/473b5ef7f442b932e9c4c4356945b91e8e1bc4e4))


### Bug Fixes

* **cli:** Conform python and java package names to language standards (no hyphens) ([#283](https://github.com/awslabs/cdk8s/issues/283)) ([f0b33c0](https://github.com/awslabs/cdk8s/commit/f0b33c09e3f75cfc7e230605a9bb11d506ea4018))
* **cli:** java importing crd fails ([#257](https://github.com/awslabs/cdk8s/issues/257)) ([f0ef3b4](https://github.com/awslabs/cdk8s/commit/f0ef3b467969a90efcbfc663353565c8639bb5bd))

## [0.26.0](https://github.com/awslabs/cdk8s/compare/v0.25.0...v0.26.0) (2020-06-29)


### Features

* **cli:** cdk8s init template for java ([#245](https://github.com/awslabs/cdk8s/issues/245)) ([2bec62a](https://github.com/awslabs/cdk8s/commit/2bec62afac55fc8fe0c34ed6cfbb508977c43815))
* Introducing "cdk8s+": high-level APIs for Kubernetes ([#239](https://github.com/awslabs/cdk8s/issues/239)) ([1b991f6](https://github.com/awslabs/cdk8s/commit/1b991f691bd214e9aaac66e90e3b065d0c31b9aa))


### Bug Fixes

* move output of java imports into /src/main/java ([#240](https://github.com/awslabs/cdk8s/issues/240)) ([9445358](https://github.com/awslabs/cdk8s/commit/94453588a504fe35dd4da7b7c6d9b92a1d93c4f3))

## [0.25.0](https://github.com/awslabs/cdk8s/compare/v0.24.0...v0.25.0) (2020-06-09)


### ⚠ BREAKING CHANGES

* **lib:** `cdk8s` discontinues support for the `onPrepare` and `onSynthesis` construct hooks. These methods will eventually be removed from the `constructs` programming model.

### Features

* **cli:** java import support  ([#226](https://github.com/awslabs/cdk8s/issues/226)) ([9619a73](https://github.com/awslabs/cdk8s/commit/9619a730766a109e429007c459f77541ebb97399))
* **lib:** dependencies and ordering of charts and objects ([#223](https://github.com/awslabs/cdk8s/issues/223)) ([701579e](https://github.com/awslabs/cdk8s/commit/701579e46a1f5891a1233c2e44e06a528f5a183e)), closes [#111](https://github.com/awslabs/cdk8s/issues/111)


### Bug Fixes

* **cli:** options type not generated for certain CRDs ([#229](https://github.com/awslabs/cdk8s/issues/229)) ([0cbaf19](https://github.com/awslabs/cdk8s/commit/0cbaf19c0d9f1cff6832c44c0699e20c83903a64)), closes [#219](https://github.com/awslabs/cdk8s/issues/219)

## [0.24.0](https://github.com/awslabs/cdk8s/compare/v0.23.0...v0.24.0) (2020-05-27)


### ⚠ BREAKING CHANGES

* **cli:** enum string values are now proper enums instead of just `string`s.

### Features

* **cli:** import - support enum string fields ([#210](https://github.com/awslabs/cdk8s/issues/210)) ([8b8ad44](https://github.com/awslabs/cdk8s/commit/8b8ad44bba1f0ebced6d41af52d079b1a2ec54b2)), closes [#196](https://github.com/awslabs/cdk8s/issues/196)


### Bug Fixes

* **cli:** unable to import CRDs with non-trivial "xxxOf" constraints ([#212](https://github.com/awslabs/cdk8s/issues/212)) ([18136ed](https://github.com/awslabs/cdk8s/commit/18136ed26d833a27036b7cbf04fac4b8f7d9b542)), closes [#171](https://github.com/awslabs/cdk8s/issues/171)
* **cli:** unable to import types with all-caps TLAs ([#211](https://github.com/awslabs/cdk8s/issues/211)) ([a11d0e8](https://github.com/awslabs/cdk8s/commit/a11d0e8f8f8e5bbc745d9315086b97cbc49d2890)), closes [#209](https://github.com/awslabs/cdk8s/issues/209)

## [0.23.0](https://github.com/awslabs/cdk8s/compare/v0.22.0...v0.23.0) (2020-05-26)


### ⚠ BREAKING CHANGES

* **cli**: the generated module names of imported CRDs now include the resource's group and not just its kind in order to ensure uniqueness. For example, when importing the Jenkins CRD, instead of 'imports/jenkins.ts`, we now have `imports/jenkins.io/jenkins.ts`.
- **cli**: class names of imported apis are now normalized to `PascalCase`.

### Features

* **cli:** import CRDs from a running cluster ([#207](https://github.com/awslabs/cdk8s/issues/207)) ([5153422](https://github.com/awslabs/cdk8s/commit/5153422432d78aa97b928f507be27048e1868c7a)), closes [#197](https://github.com/awslabs/cdk8s/issues/197)
* **lib:** introduce "include" ([#202](https://github.com/awslabs/cdk8s/issues/202)) ([75d13e8](https://github.com/awslabs/cdk8s/commit/75d13e8b06351b66bd5d495f6ac6a3575fac6421)), closes [#199](https://github.com/awslabs/cdk8s/issues/199)
* **lib:** yaml utility functions ([#198](https://github.com/awslabs/cdk8s/issues/198)) ([9e0f030](https://github.com/awslabs/cdk8s/commit/9e0f030ecdb249d9095d0d774b33919a17cc48f7))


### Bug Fixes

* **cli:** impossible to import two crds with the same kind ([#203](https://github.com/awslabs/cdk8s/issues/203)) ([f6248ce](https://github.com/awslabs/cdk8s/commit/f6248ce5b7f3004108f0449a319015c8d6e99df4))
* **docs:** do not mark arguments as optional in python getting-started ([#191](https://github.com/awslabs/cdk8s/issues/191)) ([be090d0](https://github.com/awslabs/cdk8s/commit/be090d09b6bdc2105e21c2f6de0cdcc9da657b50))
* **lib:** unable to express empty objects and array ([#200](https://github.com/awslabs/cdk8s/issues/200)) ([9ae5efb](https://github.com/awslabs/cdk8s/commit/9ae5efb9834e1608ae196db88680a34005ac7203))

## [0.22.0](https://github.com/campionfellin/cdk8s/compare/v0.21.0...v0.22.0) (2020-05-22)


### Features

* **cli:** jest tests in typescript-app template ([b6aed5a](https://github.com/campionfellin/cdk8s/commit/b6aed5ad9252c18f6f86d94caa472895c1c6a529))
* **cli:** support CRDs with apiVersion "apiextensions.k8s.io/v1" ([#142](https://github.com/campionfellin/cdk8s/issues/142)) ([f5111b0](https://github.com/campionfellin/cdk8s/commit/f5111b07eefbc58a4ae23b498e6b41f48a0b82ac))
* **cli:** support import module name overriding in python ([#107](https://github.com/campionfellin/cdk8s/issues/107)) ([327ba47](https://github.com/campionfellin/cdk8s/commit/327ba47524b7dfdb05096bb9a78c9d504db4a02c))
* **docs:** add python and pipenv prerequisites ([db23fa1](https://github.com/campionfellin/cdk8s/commit/db23fa168ed6262d199383a651769fc2fae14a11)), closes [#166](https://github.com/campionfellin/cdk8s/issues/166)
* **examples:** central readme for all examples ([#176](https://github.com/campionfellin/cdk8s/issues/176)) ([9cab302](https://github.com/campionfellin/cdk8s/commit/9cab302939c3d8ce3104e30d2bd1ad22b87bcbf8)), closes [#174](https://github.com/campionfellin/cdk8s/issues/174)
* **examples:** reorganize examples by language ([#138](https://github.com/campionfellin/cdk8s/issues/138)) ([85cf631](https://github.com/campionfellin/cdk8s/commit/85cf6313c20771b718c19ee6085afc23cd787311))
* **readme:** add link to "awesome cdk8s" ([0889a6e](https://github.com/campionfellin/cdk8s/commit/0889a6e5d738d928219b24c523b8bfdcec73bc43))

## [0.21.0](https://github.com/awslabs/cdk8s/compare/v0.20.0...v0.21.0) (2020-05-14)


### Features

* new website ([#143](https://github.com/awslabs/cdk8s/issues/143)) ([fcc59b0](https://github.com/awslabs/cdk8s/commit/fcc59b062824aad31dea209fa9df1088425c240b))
* **example:** python hello example ([#101](https://github.com/awslabs/cdk8s/issues/101)) ([e792d2b](https://github.com/awslabs/cdk8s/commit/e792d2bebb5101daecc53c4aaed9500c3ef27617))
* **website:** add reference docs links ([2034ec0](https://github.com/awslabs/cdk8s/commit/2034ec06f0c9fb419a194cbb23a18e2678076d29))


### Bug Fixes

* **cli:** unable to import a crd that has no schema ([#132](https://github.com/awslabs/cdk8s/issues/132)) ([b8115cb](https://github.com/awslabs/cdk8s/commit/b8115cb809b2b33be73a98f99b1cefa4de152654))
* **crd:** Ensure yaml doc is defined before casting to CustomResourceApiObject ([#130](https://github.com/awslabs/cdk8s/issues/130)) ([03e6d84](https://github.com/awslabs/cdk8s/commit/03e6d84ee5182d7e547d9b09d2d121daedb7f7c3))
* **redirect:** Handle 302 redirect case when importing from remote url ([#131](https://github.com/awslabs/cdk8s/issues/131)) ([1ed88ca](https://github.com/awslabs/cdk8s/commit/1ed88ca32c998b590093fd0090ecbf9a6662043e))

## [0.20.0](https://github.com/awslabs/cdk8s/compare/v0.19.0...v0.20.0) (2020-04-27)


### Features

* surface cdk8s in awscdk.io ([45e188e](https://github.com/awslabs/cdk8s/commit/45e188e08a607a0fbc8b5003ce9ab84789f1322e))


### Bug Fixes

* **docs:** top-level "getting started" page not found ([#120](https://github.com/awslabs/cdk8s/issues/120)) ([eb9d2ad](https://github.com/awslabs/cdk8s/commit/eb9d2ad0e09f7bc8ba1ee2346aad2f3119d1f3e9)), closes [#106](https://github.com/awslabs/cdk8s/issues/106)
* **readme:** missing information about imports in cdk8s-cli readme ([#108](https://github.com/awslabs/cdk8s/issues/108)) ([e9f291e](https://github.com/awslabs/cdk8s/commit/e9f291e8da8beebc1bb26b20078ed0d3675ce580))

## [0.19.0](https://github.com/awslabs/cdk8s/compare/v0.18.0...v0.19.0) (2020-04-12)


### Bug Fixes

* **cli-import:** unable to import a CRD from an insecure server ([#102](https://github.com/awslabs/cdk8s/issues/102)) ([4dde096](https://github.com/awslabs/cdk8s/commit/4dde096419aadc1173835388d52f927e502f469a)), closes [#94](https://github.com/awslabs/cdk8s/issues/94)
* **homebrew:** homebrew release trigger is broken ([5ecb143](https://github.com/awslabs/cdk8s/commit/5ecb1434a8e4b2622cf3e001929a72c511ab89fa))

### Features

* **cli-import:** allow overriding module name in imports ([#84](https://github.com/awslabs/cdk8s/issues/84)) ([63daf78](https://github.com/awslabs/cdk8s/commit/63daf781d80690476b875785f7bb7beea2d5e029))

## [0.18.0](https://github.com/awslabs/cdk8s/compare/v0.17.0...v0.18.0) (2020-04-10)


### Features

* cdk8s website ([#89](https://github.com/awslabs/cdk8s/issues/89)) ([430d9b7](https://github.com/awslabs/cdk8s/commit/430d9b7e6b99dd54e6fe611fb22e1dcafb18cc13))
* **cli:** ignore hidden files in "cdk8s init" ([#99](https://github.com/awslabs/cdk8s/issues/99)) ([5681e14](https://github.com/awslabs/cdk8s/commit/5681e148ce7621562d27ca32843183337554943c))


### Bug Fixes

* **crd:** fix multi-resource importing of CRDs ([#78](https://github.com/awslabs/cdk8s/issues/78)) ([fd8f753](https://github.com/awslabs/cdk8s/commit/fd8f75359b37a6f76368d498f00d8dc615650423))
* **examples:** "replicas" option is not respected in the web-service example ([#87](https://github.com/awslabs/cdk8s/issues/87)) ([97ca582](https://github.com/awslabs/cdk8s/commit/97ca582b8a2fb0f1925518b0040acec9f32dd969))
* **gha:** prevent gha from running on forks ([26eb407](https://github.com/awslabs/cdk8s/commit/26eb4076f1a786894f4d0efa7fa5883b6a444603))

## [0.17.0](https://github.com/awslabs/cdk8s/compare/v0.16.0...v0.17.0) (2020-03-21)


### ⚠ BREAKING CHANGES

* please upgrade your dependency requirement for "constructs" to ^2.0.0

### Bug Fixes

* **gh_actions:** fix release-next script to use correct npx publishing ([27c7f9d](https://github.com/awslabs/cdk8s/commit/27c7f9dfa4b787f147e10746beee71ca378e3c2b))
* **readme:** hello example link is broken [#74](https://github.com/awslabs/cdk8s/issues/74) ([0b858cf](https://github.com/awslabs/cdk8s/commit/0b858cfd8d1306be67394cb733984b8b49dfcc06))


* upgrade jsii & constructs ([#80](https://github.com/awslabs/cdk8s/issues/80)) ([f917e0a](https://github.com/awslabs/cdk8s/commit/f917e0a29490eb0369d4583a7303f1fded7f6693))

## [0.16.0](https://github.com/awslabs/cdk8s/compare/v0.15.1...v0.16.0) (2020-03-17)


### Features

* **cli:** cdk8s import crd.yaml ([#70](https://github.com/awslabs/cdk8s/issues/70)) ([5d1c278](https://github.com/awslabs/cdk8s/commit/5d1c278f391f2561c8999efcd2015f2de9e26b72)), closes [#27](https://github.com/awslabs/cdk8s/issues/27)

## [0.15.1](https://github.com/awslabs/cdk8s/compare/v0.15.0...v0.15.1) (2020-03-13)


### Bug Fixes

* **cli-init:** install "constructs" instead of "@aws-cdk/core" ([6ccc03f](https://github.com/awslabs/cdk8s/commit/6ccc03fc9ee82ad292d4f8efd1d66447c67b1122))

## [0.15.0](https://github.com/awslabs/cdk8s/compare/v0.14.0...v0.15.0) (2020-03-12)


### Features

* default chart namespaces ([#68](https://github.com/awslabs/cdk8s/issues/68)) ([36b9ff1](https://github.com/awslabs/cdk8s/commit/36b9ff1b32699da894eae085c809c2399ac9b837))
* peer-depend on "constructs" instead of "@aws-cdk/core" ([#66](https://github.com/awslabs/cdk8s/issues/66)) ([c336c95](https://github.com/awslabs/cdk8s/commit/c336c95f4e4355f94abe66d2839ccbb26d4f15b8))
* sort keys of ApiObject manifests ([#67](https://github.com/awslabs/cdk8s/issues/67)) ([1fe89bd](https://github.com/awslabs/cdk8s/commit/1fe89bd7355d48c99c35be7d4429b1095529dc7f)), closes [#17](https://github.com/awslabs/cdk8s/issues/17)

## [0.14.0](https://github.com/awslabs/cdk8s/compare/v0.13.1...v0.14.0) (2020-03-10)


### Features

* allow arbitrary construct names ([#64](https://github.com/awslabs/cdk8s/issues/64)) ([1309960](https://github.com/awslabs/cdk8s/commit/1309960e62d13b00dc964f6c88e15d74390e09a2)), closes [#48](https://github.com/awslabs/cdk8s/issues/48)
* chart.toJson() and apiObject.toJson() ([#63](https://github.com/awslabs/cdk8s/issues/63)) ([80e8402](https://github.com/awslabs/cdk8s/commit/80e8402790c4112e64bda2dd9a42fa897ee4ab8b)), closes [#48](https://github.com/awslabs/cdk8s/issues/48)

## [0.13.1](https://github.com/awslabs/cdk8s/compare/v0.13.0...v0.13.1) (2020-03-09)


### Bug Fixes

* **cli:** init could not find a version that matches cdk8s0-13-0 ([e1267f6](https://github.com/awslabs/cdk8s/commit/e1267f608d8981578971564b1228be80e0e117e0))

## [0.13.0](https://github.com/awslabs/cdk8s/compare/v0.12.0...v0.13.0) (2020-03-09)

This release adds **Python support** for cdk8s and includes;
- The `cdk8s` library is released to PyPI
- `cdk8s init python-app` creates new Python apps
- `cdk8s import` generates python classes for Kubernetes API objects

### ⚠ BREAKING CHANGES

* **cli:** `cdk8s import` now generates a single file with all types, which means you will have to modify TypeScript code to `import { Deployment, Pod, ... } from './imports/k8s'` instead of importing multiple files.
* **cli:** `cdk8s gen` is now `cdk8s import k8s` and output goes to `imports/k8s.ts` instead of `.gen/index.ts`.

### Features

* **cli:** "cdk8s gen" is now "cdk8s import k8s" ([#43](https://github.com/awslabs/cdk8s/issues/43)) ([fb9e0b5](https://github.com/awslabs/cdk8s/commit/fb9e0b5396a019bd979cc6ad0f646d76c5b85bc6)), closes [#31](https://github.com/awslabs/cdk8s/issues/31) [#40](https://github.com/awslabs/cdk8s/issues/40)
* **cli:** "cdk8s synth" ([#44](https://github.com/awslabs/cdk8s/issues/44)) ([d457ea9](https://github.com/awslabs/cdk8s/commit/d457ea9184e45c5d94b93ac17e3deecdd0b8c657)), closes [#41](https://github.com/awslabs/cdk8s/issues/41)
* **cli:** cdk8s.yaml ([#52](https://github.com/awslabs/cdk8s/issues/52)) ([e6834d3](https://github.com/awslabs/cdk8s/commit/e6834d3ae03810d1402c34a123adb8a1376808b7)), closes [#42](https://github.com/awslabs/cdk8s/issues/42)
* **cli:** import only one class for every api object ([#39](https://github.com/awslabs/cdk8s/issues/39)) ([2db4cfb](https://github.com/awslabs/cdk8s/commit/2db4cfbb20e7b6d8b09e8b8c9e6d096f0ea9fefe))
* **cli:** python project template ([#36](https://github.com/awslabs/cdk8s/issues/36)) ([30f3bb7](https://github.com/awslabs/cdk8s/commit/30f3bb7d787f0d1b16b90c8ddafc4dcc451c4e4b))
* **cli:** python support for "import" ([#47](https://github.com/awslabs/cdk8s/issues/47)) ([3b93d64](https://github.com/awslabs/cdk8s/commit/3b93d6465c2748693ce220c307c1b94b1cdaa11f))
* **cli:** typescript project - "npm run upgrade" & "upgrade:next" ([735e840](https://github.com/awslabs/cdk8s/commit/735e840f0ef440e715d34923aed184e58a9f243c))
* **cli:** typescript project - "npm run build" now includes "synth" ([7b15e3a](https://github.com/awslabs/cdk8s/commit/7b15e3a4f47e4d17b417012a82b335690be8cc52))
* **docs:** getting started in python ([#60](https://github.com/awslabs/cdk8s/issues/60)) ([27d3bac](https://github.com/awslabs/cdk8s/commit/27d3bac4579ea8cdf0b6c692e05ab0ac47e17590))
* **examples:** updates to hello-world example and directory reorganization ([#33](https://github.com/awslabs/cdk8s/issues/33)) ([1c8f694](https://github.com/awslabs/cdk8s/commit/1c8f694b51fac662477175c2e8f12b38b810d2bf))


### Bug Fixes

* **cli:** new typescript apps cannot be created with [@next](https://github.com/next) versions ([#55](https://github.com/awslabs/cdk8s/issues/55)) ([119d95c](https://github.com/awslabs/cdk8s/commit/119d95c78c3620be9adcd1cb5402e6f0ee901293))

## [0.12.0](https://github.com/awslabs/cdk8s/compare/v0.10.0...v0.12.0) (2020-03-03)


### Bug Fixes

* `yaml` not found in jsii languages ([39ef409](https://github.com/awslabs/cdk8s/commit/39ef40935459e3cb910c11b07bec8fd474f45813))

## [0.11.0](https://github.com/awslabs/cdk8s/compare/v0.10.0...v0.11.0) (2020-03-03)


### Bug Fixes

* `yaml` not found in jsii languages ([39ef409](https://github.com/awslabs/cdk8s/commit/39ef40935459e3cb910c11b07bec8fd474f45813))

## [0.10.0](https://github.com/awslabs/cdk8s/compare/v0.9.0...v0.10.0) (2020-02-28)


### Bug Fixes

* **cdk8s:** autogenerated names fail validation for some resource types ([#18](https://github.com/awslabs/cdk8s/issues/18)) ([b70e4fe](https://github.com/awslabs/cdk8s/commit/b70e4fe5e8fdfc47e953d90d64337ff9f108fa39)), closes [#16](https://github.com/awslabs/cdk8s/issues/16)

## [0.9.0](https://github.com/awslabs/cdk8s/compare/v0.8.0...v0.9.0) (2020-02-27)


### Features

* **cdk8s:** the App root construct ([#15](https://github.com/awslabs/cdk8s/issues/15)) ([c595240](https://github.com/awslabs/cdk8s/commit/c595240ed934c300ad5f9db209692d2113b3d113))

## [0.8.0](https://github.com/awslabs/cdk8s/compare/v0.7.0...v0.8.0) (2020-02-27)


### Features

* **cli:** remove the cookiecutter prerequisite ([#13](https://github.com/awslabs/cdk8s/issues/13)) ([10ab259](https://github.com/awslabs/cdk8s/commit/10ab2591828b790a6bbcdb306d302d5f8a30d30e))

## [0.7.0](https://github.com/awslabs/cdk8s/compare/v0.6.0...v0.7.0) (2020-02-26)


### Bug Fixes

* **cli:** typescript-app does not include main.ts ([43b435a](https://github.com/awslabs/cdk8s/commit/43b435a535f6d99f0ac0a3e570ebe95386c584ae))

## [0.6.0](https://github.com/awslabs/cdk8s/compare/v0.5.0...v0.6.0) (2020-02-26)

### Bug Fixes

* cli does not work when used from a symlink ([#11](https://github.com/awslabs/cdk8s/issues/11)) ([4bd3a37](https://github.com/awslabs/cdk8s/commit/4bd3a37625c4e13c68eb1561ed5fe7ebcb8c5a33))

## [0.5.0](https://github.com/awslabs/cdk8s/compare/v0.4.0...v0.5.0) (2020-02-26)

### Features

* **cli:** project templates with "cdk8s init" ([#10](https://github.com/awslabs/cdk8s/issues/10)) ([4aa59d9](https://github.com/awslabs/cdk8s/commit/4aa59d9486d475b008244a90b6a1ee23772b5700))
* cookiecutter template for typescript app projects ([#9](https://github.com/awslabs/cdk8s/issues/9)) ([55087e2](https://github.com/awslabs/cdk8s/commit/55087e2be37de680b8dea25a806f013e17f6351a))

## [0.4.0](https://github.com/awslabs/cdk8s/compare/v0.3.0...v0.4.0) (2020-02-23)

### Features

* **podinfo:** allow containers to bind to deployment ([45237c0](https://github.com/awslabs/cdk8s/commit/45237c0aa630a7c0992abee9303dc86b73aba4f5))

## [0.3.0](https://github.com/awslabs/cdk8s/compare/v0.2.1...v0.3.0) (2020-02-23)

### Features

* chart.generateObjectName ([03a1d26](https://github.com/awslabs/cdk8s/commit/03a1d2668a7c4fef9dac5db81b6496eff2208eab))
* Chart.of(node) ([d6a9dc0](https://github.com/awslabs/cdk8s/commit/d6a9dc0cb87d11fd603f330059cc1ab326c44a71))

## [0.1.2](https://github.com/awslabs/cdk8s/compare/v0.0.0...v0.1.2) (2020-02-12)

### Features

* getting started documentation ([2616372](https://github.com/awslabs/cdk8s/commit/2616372a202c552e0fdd1be73eff2dbe5175704b))
