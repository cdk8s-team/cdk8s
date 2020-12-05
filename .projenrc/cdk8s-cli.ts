import * as pj from 'projen';
import * as pjcontrib from '../projen-contrib';

export class Cdk8sCli extends pj.TypeScriptProject {

  constructor(root: pjcontrib.YarnMonoRepo, constructs: string) {

    const packagePath = 'packages/cdk8s-cli';

    super({
      outdir: packagePath,
      name: 'cdk8s-cli',
      description: 'CDK for Kubernetes CLI',
      bin: {
        cdk8s: 'bin/cdk8s'
      },
      deps: [
        'cdk8s@0.0.0',
        'codemaker',
        `constructs@^${constructs}`,
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

      ...root.common,

    })

    // add @types/node as a regular dependency since it's needed to during "import"
    // to compile the generated jsii code.
    this.addDeps('@types/node');

    this.eslint!.addIgnorePattern('/templates/');
    this.jest!.addIgnorePattern('/templates/');

    if (root.dependenciesUpgrade) {
      // projen is still in 0.x - lets be more intentional about upgrading its minor version.
      root.dependenciesUpgrade.addPackage(packagePath, { exclude: ['projen'] });
    }

  }
}