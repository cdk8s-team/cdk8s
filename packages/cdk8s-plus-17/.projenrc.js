const path = require('path');
const { JsiiProject, Semver } = require('projen');
const common = require('../projen-common');

const SPEC_VERSION = '17';

const project = new JsiiProject({
  name: `cdk8s-plus-${SPEC_VERSION}`,
  description: 'High level abstractions on top of cdk8s',
  stability: common.options.stability,

  // without this, the version of 'constructs' would need to be controlled
  // from this file, since otherwise it would create a 0.0.0 dev dependency.
  peerDependencyOptions: {
    pinnedDevDependency: false,
  },
  ...common.options,

  peerDeps: [
    'cdk8s@^0.0.0',
    'constructs',
  ],
  deps: [
    'minimatch',
  ],
  bundledDeps: ['minimatch'],
  devDeps: [
    'constructs',
    '@types/minimatch',
    'cdk8s@0.0.0',
    'constructs',
  ],

  // jsii configuration
  publishToMaven: {
    javaPackage: `org.cdk8s.plus${SPEC_VERSION}`,
    mavenGroupId: 'org.cdk8s',
    mavenArtifactId: `cdk8s-plus-${SPEC_VERSION}`,
  },
  publishToPypi: {
    distName: `cdk8s-plus-${SPEC_VERSION}`,
    module: `cdk8s_plus_${SPEC_VERSION}`,
  },
  publishToNuget: {
    dotNetNamespace: `Org.Cdk8s.Plus${SPEC_VERSION}`,
    packageId: `Org.Cdk8s.Plus${SPEC_VERSION}`,
  },
  publishToGo: {
    moduleName: `github.com/awslabs/cdk8s-go/cdk8s-plus-${SPEC_VERSION}`
  }
});

// temporary until https://github.com/aws/jsii/pull/2492 is resolved
project.packageTask.exec('echo $(node -p "require(\'./package.json\').version") > dist/go/cdk8splus17/version');

common.fixup(project);

const K8S_VERSION = '1.17.0';
const importdir = path.join('src', 'imports');

project.setScript('import', `../cdk8s-cli/bin/cdk8s -l typescript -o ${importdir} import k8s@${K8S_VERSION}`);
project.synth();