# cdk8s+ (cdk8s-plus)

Hey there! Thanks for taking an interest in contributing to cdk8s+ 😀

> Before you continue, please make sure you've read the general procedural contribution guidance for this repository: [Contributing to cdk8s](../../CONTRIBUTING.md)

## Design Principles

As already mentioned in the [README](./README.md), this library is in very early stages of development.
Even so, there are several design principles we would like to try and maintain:

> Note: nothing is set in stone, if you feel these principles are in some way limiting in providing the best API possible, please feel
free to voice your concerns and even submit a PR to amend the principles themselves.

### Mutable

As you will notice, most objects in this API are mutable. For example:

```typescript
import * as kplus from 'cdk8s-plus';

const pod = new kplus.Pod(parent, 'Pod');

// mutating the pod spec with another volume
pod.spec.addVolume(volume);

// mutating the pod spec with another container
pod.spec.addContainer(container);
```

The reasoning behind this is two fold:

1. Kuberenetes spec objects have an extremely large surface area. Configuring all properties in the constructor can easily result in cluttered
and un-readable code. Exposing post instantiation methods can provide a cleaner, more semantic mechanism of configuration.

2. This library aims to reduce the complexity of creating kuberenetes configuration files. An important enabler to achieve this,
is the ability to auto wire different resources to work together. To that end, post instantiation mutations are often required.

### Non leaky

We strive to provide a full abstraction that does not expose the underlying [auto-generated](./imports/k8s.d.ts) api objects.
Many times, this may result in some code duplication or redundancy. Even though it itches our developer nerves, we do not shy away from it.

> **Sometimes, a little duplication is better than a lot of dependencies.**

## API Reference

We generate a full [API](./API.md) reference automatically during build time. Make sure to always run `yarn build` and committing the `API.md` file before submitting a Pull Request.

## Project Metadata

There are several metadata files that are used by this project:

- `package.json` - Standard node project metadata file.
- `tsconfig.json` - TypeScript configuration file that controls the compilation process.
- `tsconfig.jest.json` - Configuration file used by the `jest` testing framework to enable seamless test execution without explicitly compiling source files.
- `.eslintrc.json` - [ESLint](https://eslint.org/) configuration file.

All these files are managed by the [projen](https://www.npmjs.com/package/projen) tool, and are automatically generated during build time.

Changes to these files should be performed solely via the [projenrc](./.projenrc.js) config file.
