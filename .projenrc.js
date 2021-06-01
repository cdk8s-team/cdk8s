const { NodeProject } = require('projen');
const { JobPermission } = require('projen/lib/github/workflows-model');

const mainBranch = 'master';

const project = new NodeProject({
  name: 'root',
  defaultReleaseBranch: mainBranch,
  pullRequestTemplateContents: [
    '*By submitting this pull request, I confirm that my contribution is made under the terms of the Apache-2.0 license*'
  ],
  releaseWorkflow: false,
  devDeps: [
    '@types/jest',
    '@types/node',
    'cdk8s',
    'cdk8s-cli',
    'cdk8s-plus-17',
    'constructs@^3',
    'lerna@^3',
    'semver',
    'ts-jest',
    'typescript',
    'projen',
  ],
});

project.gitignore.addPatterns('*.js');
project.gitignore.addPatterns('*.d.ts');
project.gitignore.addPatterns('dist/');

// enable mono-repo
project.package.addField('private', true);
project.package.addField('workspaces', {
  packages: ['examples/**/*']
});

// override the default test task to run test across the repo
project.testTask.reset('lerna run test -- -u');
project.tasks.removeTask('test:watch');
project.tasks.removeTask('test:update');
project.tasks.removeTask('test:compile');

// integ tests
const integ = project.addTask('integ', { 
  exec: 'test/test-all.sh',
  env: { UPDATE_SNAPSHOTS: '1' }
});

// construct the build task
project.buildTask.exec('lerna run build');
project.buildTask.spawn(project.testTask);
project.buildTask.spawn(integ);

// remove unused commands
project.tasks.removeTask('compile');

// deploy website
const workflow = project.github.addWorkflow('website');
workflow.on({ push: { branches: [ mainBranch ] } });
workflow.addJobs({
  deploy: {
    permissions: {
      contents: JobPermission.WRITE,
    },
    if: "startsWith(github.event.head_commit.message, 'chore(release)')",
    runsOn: 'ubuntu-18.04',
    steps: [
      { uses: 'actions/checkout@v2' },
      {
        name: 'Setup Hugo',
        uses: 'peaceiris/actions-hugo@v2',
        with: {
          'hugo-version': '0.68.3',
          'extended': true,
        },
      },
      {
        uses: 'actions/setup-python@v2',
        with: {
          'python-version': '3.x',
          'architecture': 'x64',
        },
      },
      {
        name: 'Build Website',
        run: [
          'cd website',
          './build.sh'
        ].join('\n')
      },
      {
        name: 'Build Docs Site',
        run: './docs/build.sh website/public/docs'
      },
      {
        name: 'Deploy',
        uses: 'peaceiris/actions-gh-pages@v3',
        with: {
          github_token: '${{ secrets.GITHUB_TOKEN }}',
          publish_dir: './website/public'
        }
      }
    ]
  }
});

project.synth();