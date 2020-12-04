import { Cdk8s } from './cdk8s';
import { Cdk8sPlus17 } from './cdk8s-plus-17';
import { Cdk8sCli } from './cdk8s-cli';
import * as pjcontrib from '../projen-contrib';

const project = new pjcontrib.YarnMonoRepo({
  name: 'root',
  typescript: true,
  outdir: '..',
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
    nohoist: [
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
    "semver",
    "standard-version"
  ],
  dependenciesUpgrade: {
    schedule: '0 8 * * *',
    autoApprove: true,
  },
});

const pack = project.tasks.addTask('package');
pack.exec('tools/pack.sh');
pack.exec('tools/collect-dist.sh');

project.tasks.addTask('align-version', { exec: 'tools/align-version.sh' });

const nuke = project.tasks.addTask('nuke', { exec: 'rm -rf **/node_modules **/dist' });
const rebuild = project.tasks.addTask('rebuild');

rebuild.spawn(nuke);
rebuild.spawn(project.buildTask);

project.tasks.addTask('integ', { exec: 'test/run-against-dist test/test-all.sh' });
project.tasks.addTask('integ:update', { exec: 'UPDATE_SNAPSHOTS=1 yarn integ' });
project.tasks.addTask('release-github', { exec: 'tools/release-github.sh' });

const constructs = '3.2.56';

new Cdk8s(project, constructs);
new Cdk8sPlus17(project, constructs);
new Cdk8sCli(project, constructs);

project.gitignore.exclude('**/dist');
project.gitignore.include('tools/*.js');

project.synth();