# cdk8s+ (cdk8s-plus)

Hey there! Thanks for taking an interest in contributing to cdk8s+ 😀

> Before you continue, please make sure you've read the general procedural contribution guidance for this repository: [Contributing to cdk8s](../../CONTRIBUTING.md)

## Design Principles

As already mentioned in the [README](./README.md), this library is in very early stages of development.
Even so, there are several design principles we would like to try and maintain:

> Note: nothing is set in stone, if you feel these principles are in some way limiting in providing the best API possible, please feel
free to voice your concerns and even submit a PR to amend the principles themselves.

### Mutability

As you will notice, objects in this API are mutable on collections and have
read-only accessors for primitives.

For example:

```typescript
import * as kplus from 'cdk8s-plus';

const pod = new kplus.Pod(parent, 'Pod', {
  replicas: 4
});

// mutating the pod spec with another volume
pod.spec.addVolume(volume);

// mutating the pod spec with another container
pod.spec.addContainer(container);

// returns the resolved value of "replicas"
assert(pod.replicas === 4);
```

When an object is instantiated, it is initialized through a set of properties
("props"). In many cases, these properties will have default values. After an
object is already initialized it should be possible to:

1. **Read** resolved values of primitive values through properties by the same
   name:

    ```ts
    interface FooProps {
      /**
       * @default 10
       **/
      readonly replicas?: number;
    }

    class Foo extends Construct {
      public readonly replicas: number;

      constructor(scope: Construct, id: string, props: FooProps = { }) {
        super(scope, id);

        this.replicas = props.replicas ?? 10;
      }
    }
    ```

2. **Mutate collections (lists/maps)**: since mutation of unordered collections
   is a safe operation in respect to ordering (anyone can add items to a set or
   a new key to a map without "racing" with other areas in the code), we should
   offer `addXxx` mutation methods for lists and maps:

   ```ts
   interface FooProps {
     readonly bar?: string[];
     readonly baz?: { [key: string]: string };
   }

   class Foo ... {
     public addBar(item: string): void { ... }
     public addBaz(key: string, value: string): void { ... }
   }
   ```

3. **Read collections through immutable copies**: the API should also include
   properties for obtaining a copy of collections so they can be inspected but
   not modified (continuing the previous example):

   ```ts
   class Foo ... {
     private readonly _bar: string[];
     private readonly _baz: { [k: string]: string };

     constructor() {
       this._bar = props.bar ?? [];
       this._baz = props.baz ?? {};
     }

    // use spreads to create a copy
     public get bar() { return [ ...this._bar ]; }
     public get baz() { return { ...this._baz }; }
   }
   ```


The reasoning behind this is three fold:

1. Kubernetes spec objects have an extremely large surface area. Configuring all
   properties in the constructor can easily result in cluttered and un-readable
   code. Exposing post instantiation methods can provide a cleaner, more
   semantic mechanism of configuration.

2. This library aims to reduce the complexity of creating Kubernetes
   configuration files. An important enabler to achieve this, is the ability to
   auto wire different resources to work together. To that end, post
   instantiation mutations are often required.

3. The reason we only allow mutations of (unordered) collections and not
   primitive values is in order to protect against the situation where multiple
   places in your code attempt to write conflicting values to a primitive, and
   the order in which they write now becomes important (i.e. a small, unrelated
   refactor may change the order). This problem does not exist with unordered
   collections.

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
