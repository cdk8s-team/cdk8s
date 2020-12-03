import { YarnMonoRepoProject } from '../projen-contrib/yarn-mono-repo';
import * as pj from 'projen';

const CONSTRCUTS_VERSION = '3.2.34';

export class Cdk8sCli {

  constructor(repo: YarnMonoRepoProject, common: Omit<pj.NodeProjectOptions, 'name'>) {

    const packagePath = `packages/cdk8s-cli`;

    const cli = repo.addTypeScriptPackage(packagePath, {
      ...common,
      name: 'cdk8s-cli',
      description: 'CDK for Kubernetes CLI',
      bin: {
        cdk8s: 'bin/cdk8s'
      },
      deps: [
        'cdk8s@0.0.0',
        'codemaker',
        `constructs@^${CONSTRCUTS_VERSION}`,
        'fs-extra',
        'jsii-srcmak',
        'jsii-pacmak',
        'sscaff',
        'yaml',
        'yargs',
        'json2jsii'
      ],
      devDeps: [
        '@types/fs-extra',
        '@types/json-schema',
      ],
    });

    // add @types/node as a regular dependency since it's needed to during "import"
    // to compile the generated jsii code.
    cli.addDeps('@types/node');

    cli.eslint!.addIgnorePattern('/templates/');
    cli.jest!.addIgnorePattern('/templates/');

    if (repo.dependenciesUpgrade) {
      // projen is still in 0.x - lets be more intentional about upgrading its minor version.
      repo.dependenciesUpgrade.addPackage(packagePath, { exclude: ['projen'] });
    }

  }

}