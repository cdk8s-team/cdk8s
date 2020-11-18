const { JsiiProject, Semver } = require('projen');
const common = require('../projen-common');
const path = require('path');

const SPEC_VERSION = '17';

const project = new JsiiProject({
  name: `cdk8s-plus-${SPEC_VERSION}`,
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
    "constructs": Semver.pinned(common.versions.constructs),
  },

  // jsii configuration
  java: {
    javaPackage: `org.cdk8s.plus${SPEC_VERSION}`,
    mavenGroupId: 'org.cdk8s',
    mavenArtifactId: `cdk8s-plus-${SPEC_VERSION}`
  },
  python: {
    distName: `cdk8s-plus-${SPEC_VERSION}`,
    module: `cdk8s_plus_${SPEC_VERSION}`
  },
  dotnet: {
    dotNetNamespace: `Org.Cdk8s.Plus${SPEC_VERSION}`,
    packageId: `Org.Cdk8s.Plus${SPEC_VERSION}`
  }
});

common.fixup(project);

const K8S_VERSION = '1.17.0';
const importdir = path.join('src', 'imports');

project.addScript('import', `../cdk8s-cli/bin/cdk8s -l typescript -o ${importdir} import k8s@${K8S_VERSION}`);
project.synth();