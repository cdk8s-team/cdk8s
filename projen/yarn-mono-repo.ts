import * as pj from 'projen';
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

}