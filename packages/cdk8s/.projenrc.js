const { JsiiProject, Semver } = require('projen');
const common = require('../projen-common');

const project = new JsiiProject({
  name: 'cdk8s',
  description: 'Cloud Development Kit for Kubernetes',
  stability: common.options.stability,

  // without this, the version of 'constructs' would need to be controlled
  // from this file, since otherwise it would create a 0.0.0 dev dependency.
  peerDependencyOptions: {
    pinnedDevDependency: false,
  },

  ...common.options,

  peerDeps: [
    'constructs',
  ],
  bundledDeps: [
    'yaml',
    'follow-redirects',
    'http-proxy-agent',
    'https-proxy-agent',
    'fast-json-patch',
  ],
  devDeps: [
    'constructs',
    '@types/follow-redirects',
    '@types/yaml',
    'json-schema-to-typescript',
  ],

  // jsii configuration
  publishToMaven: {
    javaPackage: 'org.cdk8s',
    mavenGroupId: 'org.cdk8s',
    mavenArtifactId: 'cdk8s',
  },
  publishToPypi: {
    distName: 'cdk8s',
    module: 'cdk8s',
  },
  publishToNuget: {
    dotNetNamespace: 'Org.Cdk8s',
    packageId: 'Org.Cdk8s',
  },
  publishToGo: {
    moduleName: 'github.com/cdk8s-team/cdk8s-go',
  },
});

common.fixup(project);

// _loadurl.js is written in javascript so we need to commit it and also copy it
// after compilation to the `lib/` directory.
project.gitignore.include('/src/_loadurl.js');
project.addCompileCommand('cp src/_loadurl.js lib/');

project.synth();
