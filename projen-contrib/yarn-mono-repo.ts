import * as pj from 'projen';
import * as fs from 'fs';
import * as path from 'path';
import { MonoRepoDependenciesUpgrade } from './dependencies';

export interface YarnMonoRepoProjectOptions extends pj.ProjectOptions {

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

  private readonly _packages: Record<string, pj.TypeScriptProject> = {};

  constructor(options: YarnMonoRepoProjectOptions) {
    super(options);

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

  public preSynthesize() {

    for (const packagePath of Object.keys(this._packages)) {
      fs.mkdirSync(path.join(this.outdir, packagePath), { recursive : true });
    }

    return super.preSynthesize();
  }

  public synth() {

    super.synth();

    for (const packagePath of Object.keys(this._packages)) {
      const p = this._packages[packagePath];
      p.synth();
    }

  }


  public addJsiiPackage(packagePath: string, options: pj.JsiiProjectOptions): pj.JsiiProject {
    this._packages[packagePath] = new pj.JsiiProject({
      ...options,
      outdir: path.join(this.outdir, packagePath),
    });
    return this._packages[packagePath] as pj.JsiiProject;
  }

  public addTypeScriptPackage(packagePath: string, options: pj.TypeScriptProjectOptions): pj.TypeScriptProject {
    this._packages[packagePath] = new pj.TypeScriptProject({
      ...options,
      outdir: path.join(this.outdir, packagePath),
    });
    return this._packages[packagePath];
  }

  public get packages(): pj.NodeProject[] {
    return Object.values(this._packages);
  }

}