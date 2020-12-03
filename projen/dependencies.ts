
import * as pj from 'projen';

export interface AddPackageOptions {

  readonly target?: string;

  readonly exclude?: string[];

}

export interface MonoRepoDependenciesPropsUpgradeProps {

  readonly schedule?: string;

  readonly autoApprove?: boolean;
}

export interface Step {

  readonly uses?: string;

  readonly run?: string;

  readonly name?: string;

  readonly with?: Record<string, string>

}

export class MonoRepoDependenciesUpgrade extends pj.github.GithubWorkflow {

  private readonly steps: Step[] = [];

  private readonly _props: MonoRepoDependenciesPropsUpgradeProps;

  constructor(github: pj.github.GitHub, name: string, props: MonoRepoDependenciesPropsUpgradeProps) {
    super(github, name);

    this._props = props;

    this.on({ schedule: [{ cron: props.schedule ?? '0 8 * * *' }]})

    this.steps.push({
      name: 'Checkout',
      uses: 'actions/checkout@v2',
    });

    this.steps.push({
      name: 'Setup Node',
      uses: 'actions/setup-node@v1',
      with: {
        'node-version': '10.17.0',
      },
    });

    this.steps.push({
      name: 'Upgrade lock file',
      run: 'yarn upgrade'
    });

  }


  public addPackage(packagePath: string, options: AddPackageOptions) {
    this.steps.push({
      name: `Update ${packagePath}/package.json`,
      run: `cd ${packagePath} && npx npm-check-updates -u --reject=${(options.exclude ?? []).join(',')} --target=${options.target ?? 'minor'}`,
    })
  }

  protected synthesizeContent(resolver: pj.IResolver) {

    if (this._props.autoApprove ?? true) {
      // we do this here because this garauntees this step is last.
      this.steps.push({
        name: 'Create Pull Request',
        uses: 'peter-evans/create-pull-request@v3',
        with: {
          "token": "${{ secrets.GITHUB_TOKEN }}",
          "commit-message": "Upgrade yarn.lock",
          "branch": "github-actions/dependencies",
          "title": "chore(deps): Upgrade dependencies",
          "body": [
            "This PR upgrades yarn dependencies to the latest versions.",
            "",
            "------",
            "",
            "*Automatically created via GitHubActions*"
          ].join('\n')
        }
      })
    }

    this.addJobs({
      'upgrade': {
        'runs-on': 'ubuntu-latest',
        'steps': this.steps,
      }
    });

    return super.synthesizeContent(resolver);
  }

}

