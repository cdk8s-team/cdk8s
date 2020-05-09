# Changelog

All notable changes to this project will be documented in this file. See [standard-version](https://github.com/conventional-changelog/standard-version) for commit guidelines.

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
