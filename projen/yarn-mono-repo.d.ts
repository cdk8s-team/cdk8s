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
export declare class YarnMonoRepoProject extends pj.Project {
    readonly dependenciesUpgrade?: MonoRepoDependenciesUpgrade;
    constructor(options: YarnMonoRepoProjectOptions);
}
