const { JsiiProject, Semver } = require('projen');
const common = require('../projen-common');

const project = new JsiiProject({
  name: 'cdk8s',
  description: 'Cloud Development Kit for Kubernetes',
  stability: common.options.stability,
  peerDependencyOptions: {
    pinnedDevDependency: false,
  },

  ...common.options,

  peerDeps: [
    'constructs',
  ],
  bundledDeps: [
    'yaml',
    'json-stable-stringify',
    'follow-redirects',
    'fast-json-patch',
  ],
  devDeps: [
    'constructs',
    '@types/follow-redirects',
    '@types/json-stable-stringify',
    '@types/yaml',
    'json-schema-to-typescript',
  ],

  // jsii configuration
  java: {
    javaPackage: 'org.cdk8s',
    mavenGroupId: 'org.cdk8s',
    mavenArtifactId: 'cdk8s',
  },
  python: {
    distName: 'cdk8s',
    module: 'cdk8s',
  },
  dotnet: {
    dotNetNamespace: 'Org.Cdk8s',
    packageId: 'Org.Cdk8s',
  },
});

common.fixup(project);

// _loadurl.js is written in javascript so we need to commit it and also copy it
// after compilation to the `lib/` directory.
project.gitignore.include('/src/_loadurl.js');
project.addCompileCommand('cp src/_loadurl.js lib/');

project.synth();
