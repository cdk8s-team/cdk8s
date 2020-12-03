const { YarnMonoRepoProject } = require('./projen/yarn-mono-repo')

const project = new YarnMonoRepoProject({
  name: 'root',
  outdir: 'test-mono-repo',
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
  devDependencies: {
    "changelog-parser": "^2.8.0",
    "jsii-release": "^0.2.3",
    "lerna": "^3.22.1",
    "semver": "7.3.2",
    "standard-version": "^9.0.0"
  },
  dependenciesUpgrade: {
    schedule: '0 8 * * *',
    autoApprove: true,
  },
});

// projen is still in 0.x - lets be more intentional about upgrading its minor version.
project.dependenciesUpgrade.addPackage('packages/cdk8s-cli', { exclude: ['projen'] });

project.gitignore.exclude('**/dist');
project.gitignore.exclude('**/.vscode');
project.gitignore.exclude('**/coverage');
project.gitignore.exclude('**/node_modules');


project.synth();