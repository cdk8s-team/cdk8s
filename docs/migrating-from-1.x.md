# Migrating from 1.x

This page describes the difference between versions `1.x` and `2.x` of the cdk8s toolchain, as well as instructions on how to migrate from one to the other.

## Deprecation Timeline

Version `1.x` of the cdk8s toolchain will be deprecated on 01/01/2023. After which, it will only receive critical bug fixes and security patches, but there will be no active development on it.

We strongly recommend migrating to `2.x` using the instructions stated below.

## Core Library

Version `2.x` of the core [cdk8s](https://www.npmjs.com/package/cdk8s) library is identical to version `1.x` from an API perspective. The only difference is in the dependency they declare on the `constructs` library. This also means that the documentation and code snippets presented throughout the site is compatible with `1.x` as well, in case you'd still like to use it.

!!! Tip

    See [Ecosystem Interoperability](./ecosystem-interoperability.md) for reasoning behind this change.

Following are instructions on what changes should be performed to use version `2.x`:

=== "TypeScript"

    In `package.json`, define:

    ```json
    "dependencies": {
      "cdk8s": "^2.2.87",
      "constructs": "^10.1.12"
    }
    ```

=== "Java"

    In `pom.xml`, define:

    ```xml
    <dependencies>
      <dependency>
        <groupId>org.cdk8s</groupId>
        <artifactId>cdk8s</artifactId>
        <version>[2.2.86,3.0]</version>
      </dependency>
      <dependency>
        <groupId>software.constructs</groupId>
        <artifactId>constructs</artifactId>
        <version>[10.1.12,11.0.0]</version>
      </dependency>
    </dependencies>
    ```

=== "Python"

    In `Pipfile`, define:

    ```console
    [packages]
    constructs = "~=10.1.12"
    cdk8s = "~=2.2.87"
    ```

=== "Go"

    In `go.mod`, define:

    ```go
    require (
      github.com/aws/constructs-go/constructs/v10 v10.1.12
      github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2 v2.2.87
    )
    ```

    Since major versions are encoded in go import statements, in your source code, change to:

    ```go
    import (
      "github.com/aws/constructs-go/constructs/v10"
      "github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
    )
    ```

## CLI

Version `2.x` of the [cdk8s-cli](https://www.npmjs.com/package/cdk8s-cli) is identical to version `1.x` from an API perspective. The only difference is in the project templates `cdk8s init` generates. CLI version `1.x / 2.x` will initiate projects utilizing version `1.x / 2.x` of the core library, accordingly.

If you'd like to continue using version `1.x` of the CLI:

=== "Homebrew"

    [Locate the latest `1.x`](https://formulae.brew.sh/formula/cdk8s#default) version you'd like to install, and:

    ```console
    brew install cdk8s@1.<minor>.<patch>
    ```

=== "npm"
    ```console
    npm install -g cdk8s-cli@^1
    ```

=== "yarn"
    ```console
    yarn global add cdk8s-cli@^1
    ```
