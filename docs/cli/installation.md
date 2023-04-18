# Install the CDK8s CLI

This page describes the different ways you can install the Cloud Development Kit for Kubernetes (CDK8s) command-line interface (CLI) tool on your local machine. 

## Installation
### Homebrew
To install the CDK8s CLI with Homebrew, run the following command:
```console
brew install cdk8s
```

### npm 
To install the CDK8s CLI with npm, run the following command:
```console
npm i -g cdk8s-cli
```

### Yarn
To install the CDK8s CLI with yarn, run the following command:
```console
yarn global add cdk8s-cli
```

## Check version
To check your version, run the following command:
```console
cdk8s -v
```
You should see something similar to the following:
```
------------------------------------------------------------------------------------------------
A new version 2.2.12 of cdk8s-cli is available (current 2.1.146).
Run "npm install -g cdk8s-cli" to install the latest version on your system.
For additional installation methods, see https://cdk8s.io/docs/latest/getting-started
------------------------------------------------------------------------------------------------
cdk8s [command]

Commands:
  cdk8s import [SPEC]  Imports API objects to your app by generating constructs.
                                                [aliases: gen, import, generate]
  cdk8s init TYPE      Create a new cdk8s project from a template.
  cdk8s synth          Synthesizes Kubernetes manifests for all charts in your
                       app.                                [aliases: synthesize]

Options:
  --version        Show version number                                 [boolean]
  --check-upgrade  Check for cdk8s-cli upgrade         [boolean] [default: true]
  --help           Show help                                           [boolean]

Options can be specified via environment variables with the "CDK8S_" prefix
(e.g. "CDK8S_OUTPUT")
```