const { JsiiProject, Semver } = require('projen');
const common = require('../projen-common');

const project = new JsiiProject({
  name: 'cdk8s-plus',
  description: 'High level abstractions on top of cdk8s',
  stability: 'experimental',

  ...common.options,

  // dependencies
  jsiiVersion: Semver.caret(common.versions.jsii),
  peerDependencies: {
    "cdk8s": Semver.caret('0.0.0'),
    "constructs": Semver.caret(common.versions.constructs),
  },
  dependencies: {
    minimatch: Semver.caret('3.0.4'),
  },
  bundledDependencies: [ 'minimatch' ],
  devDependencies: {
    '@types/minimatch': Semver.caret('3.0.3'),
    "cdk8s": Semver.caret('0.0.0'),
    "constructs": Semver.caret(common.versions.constructs),
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
