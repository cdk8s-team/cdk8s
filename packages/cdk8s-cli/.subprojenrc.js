const { TypeScriptLibraryProject, Semver } = require('projen');

module.exports = function(common) {
  const project = new TypeScriptLibraryProject({
    name: 'cdk8s-cli',
    parent: common.root,
    outdir: 'packages/cdk8s-cli',
    description: 'CDK for Kubernetes CLI',
    bin: {
      cdk8s: 'bin/cdk8s'
    },
    deps: [
      common.deps.constructs,
      'cdk8s@0.0.0',
      'codemaker',
      'fs-extra@^8',
      'jsii-srcmak',
      'jsii-pacmak',
      'sscaff',
      'yaml',
      'yargs',
      'json2jsii'
    ],
    devDeps: [
      '@types/fs-extra@^8',
      '@types/json-schema',
    ],

    ...common.options,
  });
  
  // add @types/node as a regular dependency since it's needed to during "import"
  // to compile the generated jsii code.
  project.addDependencies({
    '@types/node': Semver.caret(project.devDependencies['@types/node'].replace(/^\^/, ''))
  });
  
  project.eslint.addIgnorePattern('/templates/');
  project.jest.addIgnorePattern('/templates/');

  return project;
};
