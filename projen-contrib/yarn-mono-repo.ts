import * as pj from 'projen';
import { MonoRepoDependenciesUpgrade } from './dependencies';

export interface YarnMonoRepoProjectOptions extends pj.NodeProjectOptions {

  readonly repository: string,

  readonly authorName: string,

  readonly stability: string,

  readonly authorUrl: string,

  readonly keywords?: string[],

  readonly authorOrganization?: boolean,

  readonly dependenciesUpgrade?: DependenciesUpgrade;

  readonly workspaces: Workspaces;

}

export interface DependenciesUpgrade {

  readonly schedule: string;

  readonly autoApprove: boolean;
}

export interface Workspaces {

  readonly packages: string[];

  readonly noHoist: string[];
}

export class YarnMonoRepo extends pj.NodeProject {

  public readonly dependenciesUpgrade?: MonoRepoDependenciesUpgrade;

  private _options: YarnMonoRepoProjectOptions;

  constructor(options: YarnMonoRepoProjectOptions) {
    super({
      ...options,
      jest: false,
      devDeps: [...options.devDeps ?? [], 'lerna'],
      npmignoreEnabled: false,
    });

    new pj.JsonFile(this, 'lerna.json', {
      obj: {
        npmClient: "yarn",
        useWorkspaces: true,
      },
      marker: true,
    });
    this._options = options;

    this.manifest.private = true;
    this.manifest.workspaces = options.workspaces;

    console.log(`here are the script before: ${Object.keys((this as any).scripts)}`);

    this.compileTask.reset('lerna run npx projen compile');
    this.buildTask.reset('lerna run npx projen build');
    this.testTask.reset('lerna run npx projen test');

    this.setScript('test:update', 'lerna run npx projen test:update');

    console.log(`here are the script after: ${Object.keys((this as any).scripts)}`);

    if (options.dependenciesUpgrade) {

      if (!this.github) {
        throw new Error('Automatic depedency cannot be created withtout a GitHub component. Initialize using new GitHub(project).')
      }

      this.dependenciesUpgrade = new MonoRepoDependenciesUpgrade(this.github, 'dependencies', {
        schedule: options.dependenciesUpgrade.schedule
      });

    }

  }

  public get common(): any {
    return {
      parent: this,
      mergify: false,
      buildWorkflow: false,
      releaseWorkflow: false,
      dependabot: false,
      pullRequestTemplate: false,
      stability: this._options.stability,
    }
  }

  public get repository(): string {
    return this._options.repository;
  }

  public get authorName(): string {
    return  this._options.authorName;
  }

  public get authorOrganization(): boolean | undefined {
    return this._options.authorOrganization;
  }

  public get authorUrl(): string {
    return this._options.authorUrl;
  }

}
