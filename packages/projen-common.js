exports.options = {
  minNodeVersion: '10.17.0',
  repository: 'https://github.com/awslabs/cdk8s.git',
  authorName: 'Amazon Web Services',
  authorUrl: 'https://aws.amazon.com',
  authorOrganization: true,
  buildWorkflow: false,
  rebuildBot: false,
  stability: 'experimental',
  releaseWorkflow: false,
  dependabot: false,
  mergify: false,
  compat: false,
  dependabot: false,
  pullRequestTemplate: false,
  keywords: [
    "cdk",
    "kubernetes",
    "k8s",
    "constructs"
  ]
};

// some common fixups for projects
exports.fixup = project => {
  // override the default "build" from projen because currently in this
  // repo it means "compile"
  project.setScript('build', 'yarn compile');

  project.buildTask.reset();
  project.buildTask.spawn(project.compileTask);

  // // add "compile" after test because the test command deletes lib/ and we run tests *after* build in this repo.
  project.addTestCommand('yarn compile');

  // jsii-release is declared at the root level, we don't need it here.
  project.deps.removeDependency('jsii-release');

    // typescript is not semantically versionned and should remain on the same minor.
  // https://github.com/microsoft/TypeScript/issues/14116
  project.addDevDeps(`typescript@~3.9.7`);

  delete project.manifest.scripts.bump;
  delete project.manifest.scripts.release;
};
