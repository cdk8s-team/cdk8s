import * as pj from 'projen';
import * as path from 'path';
import { MonoRepoDependenciesUpgrade } from './dependencies';

export interface YarnMonoRepoProjectOptions extends pj.ProjectOptions {

  readonly repository: string,

  readonly authorName: string,

  readonly stability: string,

  readonly authorUrl: string,

  readonly keywords?: string[],

  readonly authorOrganization?: boolean,

  readonly dependenciesUpgrade?: DependenciesUpgrade;

  readonly workspaces: Workspaces;

  readonly devDependencies: Record<string, string>;

}

export interface DependenciesUpgrade {

  readonly schedule: string;

  readonly autoApprove: boolean;
}

export interface Workspaces {

  readonly packages: string[];

  readonly noHoist: string[];
}

export class YarnMonoRepoProject extends pj.Project {

  public readonly dependenciesUpgrade?: MonoRepoDependenciesUpgrade;

  private _options: YarnMonoRepoProjectOptions;
  private _packages: pj.NodeProject[] = [];

  private _common: any;

  constructor(options: YarnMonoRepoProjectOptions) {
    super(options);

    this._options = options;
    this._common = {
      root: this,
      mergify: false,
      buildWorkflow: false,
      releaseWorkflow: false,
      dependabot: false,
      pullRequestTemplate: false,
      stability: this._options.stability,
    }

    new pj.JsonFile(this, 'package.json', {
      marker: true,
      readonly: false,
      obj: {
        name: 'root',
        version: '0.0.0',
        private: true,
        workspaces: options.workspaces,
        devDependencies: options.devDependencies,

      },
    });

    if (options.dependenciesUpgrade) {

      this.dependenciesUpgrade = new MonoRepoDependenciesUpgrade(this.github!, 'dependencies', {
        schedule: options.dependenciesUpgrade.schedule
      })

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

  public synth() {

    super.synth();

    for (const project of this._packages) {
      project.synth();
    }
  }

  public addTypeScriptPackage(packagePath: string, options: pj.TypeScriptProjectOptions) {

    const project = new pj.TypeScriptProject({
      ...this._common,
      ...options,
      outdir: path.join(this.outdir, packagePath),
    })

    this._packages.push(project);

    return project;

  }

  public addJsiiPackage(packagePath: string, options: pj.JsiiProjectOptions) {

    const project = new pj.JsiiProject({
      ...this._common,
      compat: this._options.stability === 'stable',
      ...options,
      outdir: path.join(this.outdir, packagePath),
    })

    this._packages.push(project);

    return project;

  }



}