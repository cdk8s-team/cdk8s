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
    readonly with?: Record<string, string>;
}
export declare class MonoRepoDependenciesUpgrade extends pj.github.GithubWorkflow {
    private readonly steps;
    private readonly _props;
    constructor(github: pj.github.GitHub, name: string, props: MonoRepoDependenciesPropsUpgradeProps);
    addPackage(packagePath: string, options: AddPackageOptions): void;
    protected synthesizeContent(resolver: pj.IResolver): string;
}
