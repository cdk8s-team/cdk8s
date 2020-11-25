const { JsiiProject, Semver } = require('projen');

module.exports = function(common) {
  const project = new JsiiProject({
    name: 'cdk8s',
    parent: common.root,
    outdir: 'packages/cdk8s',
    description: 'Cloud Development Kit for Kubernetes',
  
    ...common.options,
  
    // dependencies
    jsiiVersion: Semver.caret(common.versions.jsii),
    peerDeps: [
      `constructs@^${common.versions.constructs}`,
    ],
    bundledDeps: [
      'yaml@2.0.0-1',
      'json-stable-stringify',
      'follow-redirects',
      'fast-json-patch',
    ],
    devDeps: [
      '@types/follow-redirects',
      '@types/json-stable-stringify',
      '@types/yaml',
      'json-schema-to-typescript'
    ],
  
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

  
  // _loadurl.js is written in javascript so we need to commit it and also copy it
  // after compilation to the `lib/` directory.
  project.gitignore.include('/src/_loadurl.js');
  project.addCompileCommand('cp src/_loadurl.js lib/');

  return project;
};
