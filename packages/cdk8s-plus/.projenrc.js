const { JsiiProject, Semver } = require('projen');
const common = require('../projen-common');

const cdk8sDependency = Semver.caret('0.0.0')

const project = new JsiiProject({
  name: 'cdk8s-plus',
  description: 'High level abstractions on top of cdk8s',
  stability: 'experimental',

  ...common.options,

  // dependencies
  jsiiVersion: Semver.caret(common.versions.jsii),
  peerDependencies: {
    constructs: Semver.pinned(common.versions.constructs),
    cdk8s: cdk8sDependency,
  },
  dependencies: {
    minimatch: Semver.caret('3.0.4'),
    cdk8s: cdk8sDependency
  },
  bundledDependencies: [ 'minimatch' ],
  devDependencies: {
    '@types/minimatch': Semver.caret('3.0.3'),
  },

  // jsii configuration
  java: {
    javaPackage: 'org.cdk8s.plus',
    mavenGroupId: 'org.cdk8s',
    mavenArtifactId: 'cdk8s-plus'
  },
  python: {
    distName: 'cdk8s-plus',
    module: 'cdk8s_plus'
  },
  dotnet: {
    dotNetNamespace: 'Org.Cdk8s.Plus',
    packageId: 'Org.Cdk8s.Plus'
  }
});

common.fixup(project);

project.synth();
