const { JsiiProject, Semver } = require('projen');
const common = require('../projen-common');

const project = new JsiiProject({
  name: 'cdk8s',
  description: 'Cloud Development Kit for Kubernetes',
  stability: 'experimental',
  dependabot: false,

  ...common.options,

  // dependencies
  jsiiVersion: Semver.caret(common.versions.jsii),
  peerDependencies: {
    "constructs": Semver.caret(common.versions.constructs),
    "constructs-tokens-staging": Semver.caret(common.versions.tokens)
  },
  dependencies: {
    "follow-redirects": Semver.caret("1.11.0"),
    "json-stable-stringify": Semver.caret("1.0.1"),
    "yaml": Semver.caret("1.7.2"),
  },
  bundledDependencies: [
    "yaml",
    "json-stable-stringify",
    "follow-redirects"
  ],
  devDependencies: {
    "@types/follow-redirects": Semver.caret("1.8.0"),
    "@types/json-stable-stringify": Semver.caret("1.0.32"),
    "@types/yaml": Semver.caret("1.2.0"),
    "constructs": Semver.caret(common.versions.constructs),
    "constructs-tokens-staging": Semver.caret(common.versions.tokens),
    "json-schema-to-typescript": Semver.caret("8.0.1"),
  },

  // jsii configuration
  java: {
    javaPackage: 'org.cdk8s',
    mavenGroupId: 'org.cdk8s',
    mavenArtifactId: 'cdk8s'
  },
  python: {
    distName: 'cdk8s',
    module: 'cdk8s'
  },
  dotnet: {
    dotNetNamespace: 'Org.Cdk8s',
    packageId: 'Org.Cdk8s'
  }
});

common.fixup(project);

// _loadurl.js is written in javascript so we need to commit it and also copy it
// after compilation to the `lib/` directory.
project.gitignore.include('/src/_loadurl.js');
project.addCompileCommand('cp src/_loadurl.js lib/');

project.synth();
