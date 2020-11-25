const { JsiiProject, Semver } = require('projen');
const path = require('path');

const SPEC_VERSION = '17';
const K8S_VERSION = '1.17.0';
const IMPORTDIR = path.join('src', 'imports');

module.exports = function(common) {
  const project = new JsiiProject({
    name: `cdk8s-plus-${SPEC_VERSION}`,
    parent: common.root,
    outdir: `packages/cdk8s-plus-${SPEC_VERSION}`,
    description: 'High level abstractions on top of cdk8s',
  
    ...common.options,
  
    // dependencies
    jsiiVersion: Semver.caret(common.versions.jsii),
    peerDeps: [
      'cdk8s',
      common.deps.constructs,
    ],
    bundledDeps: [
      'minimatch'
    ],
    devDeps: [
      '@types/minimatch',
    ],
  
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
 
  project.addScript('import', `../cdk8s-cli/bin/cdk8s -l typescript -o ${IMPORTDIR} import k8s@${K8S_VERSION}`);
  return project;  
};