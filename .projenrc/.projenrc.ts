import { Cdk8s } from './cdk8s';
import { Cdk8sPlus17 } from './cdk8s-plus-17';
import { Cdk8sCli } from './cdk8s-cli';
import * as pj from 'projen';
import * as pjcontrib from '../projen-contrib';

const project = new pjcontrib.YarnMonoRepo({
  name: 'root',
  outdir: '../test-mono-repo',
  repository: 'https://github.com/awslabs/cdk8s.git',
  authorName: 'Amazon Web Services',
  authorOrganization: true,
  authorUrl: 'https://aws.amazon.com',
  stability: 'experimental',
  keywords: [
    "cdk",
    "kubernetes",
    "k8s",
    "constructs"
  ],
  workspaces: {
    packages: [
      "packages/*",
      "examples/**/*"
    ],
    noHoist: [
      "cdk8s/yaml",
      "cdk8s/yaml/**",
      "cdk8s/json-stable-stringify",
      "cdk8s/json-stable-stringify/**",
      "cdk8s/fast-json-patch",
      "cdk8s/fast-json-patch/**",
      "cdk8s/follow-redirects",
      "cdk8s/follow-redirects/**",
      "cdk8s-plus-17/minimatch",
      "cdk8s-plus-17/minimatch/**"
    ]
  },
  devDeps: [
    "changelog-parser",
    "jsii-release",
    "lerna",
    "semver",
    "standard-version"
  ],
  dependenciesUpgrade: {
    schedule: '0 8 * * *',
    autoApprove: true,
  },
});

const lib = new Cdk8s(project);
const plus17 = new Cdk8sPlus17(project);
const cli = new Cdk8sCli(project);

project.gitignore.exclude('**/dist');
project.gitignore.exclude('**/.vscode');
project.gitignore.exclude('**/*.d.ts');
project.gitignore.exclude('**/*.js');
project.gitignore.exclude('**/coverage');
project.gitignore.exclude('**/node_modules');

function fixup(project: pj.NodeProject) {
  // override the default "build" from projen because currently in this
  // repo it means "compile"
  project.removeScript('build');
  project.addTask('build', { exec: 'yarn compile' })

  // // add "compile" after test because the test command deletes lib/ and we run tests *after* build in this repo.
  project.testTask.exec('yarn compile');

  // jsii-release is declared at the root level, we don't need it here.
  delete (project as any).devDependencies['jsii-release']

  delete project.manifest.scripts.bump;
  delete project.manifest.scripts.release;
};

fixup(lib);
fixup(plus17);
fixup(cli);

project.synth();