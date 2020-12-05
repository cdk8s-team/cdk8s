import * as pj from 'projen';
import * as fs from 'fs';
import * as path from 'path';

const LERNA_FILE = 'lerna.json';

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

  readonly typescript?: boolean;

}

export interface DependenciesUpgrade {

  readonly schedule: string;

  readonly autoApprove: boolean;
}

export interface Workspaces {

  readonly packages: string[];

  readonly nohoist: string[];
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

    const lernaPath = path.join(this.outdir, 'lerna.json');
    const version = fs.existsSync(lernaPath) ? JSON.parse(fs.readFileSync(lernaPath, 'utf-8')).version : '0.0.0';

    new pj.JsonFile(this, LERNA_FILE, {
      obj: {
        npmClient: "yarn",
        useWorkspaces: true,
        version,
      },
      marker: false,
      readonly: false,
    });

    this._options = options;

    this.manifest.private = true;
    this.manifest.workspaces = options.workspaces;

    this.compileTask.reset(this.lerna('compile'));
    this.buildTask.reset(this.lerna('build'));
    this.testTask.reset(this.lerna('test'));

    this.setScript('test:update', this.lerna('test:update'));

    if (options.dependenciesUpgrade) {

      if (!this.github) {
        throw new Error('Automatic depedency cannot be created withtout a GitHub component. Initialize using new GitHub(project).')
      }

      this.dependenciesUpgrade = new MonoRepoDependenciesUpgrade(this.github, 'dependencies', {
        schedule: options.dependenciesUpgrade.schedule
      });

    }

    this.gitignore.exclude('**/coverage');
    this.gitignore.exclude('**/.vscode');
    this.gitignore.exclude('**/node_modules');

    if (this._options.typescript ?? false) {
      this.gitignore.exclude('**/*.d.ts');
      this.gitignore.exclude('**/*.js');
    }

    // since subprojects are synthed first, their post synthesis will run before this project finished
    // synthesis. in this case, the `yarn install` command will execute when the root package.json is deleted,
    // casuing yarn to think every subproject is a root package, and generate a lock file each.
    // TODO: projen should only purge files that don't exist in current assembly, i.e files that are leftovers from previous configurations.
    this.addExcludeFromCleanup(path.join(this.outdir, 'package.json'));
  }

  public preSynthesize() {

    const subProjects = (this as any).subprojects as pj.Project[];

    for (const project of subProjects) {

      if (!(project instanceof pj.NodeProject)) {
        throw new Error(`Unsupported project type ${project.constructor.name} for project ${project.outdir}: Project must be a 'NodeProject'`);
      }

      delete (project.tasks as any)._tasks.bump
      delete (project.tasks as any)._tasks.release

      project.manifest.keywords = this._options.keywords;

    }

    for (const component of this.components) {

      if (component instanceof pj.JsonFile && path.basename(component.absolutePath) === '.versionrc.json') {
        // path the versionrc file so that standard-version will bump lerna.json
        const obj = component.obj as any;
        obj.packageFiles[0].filename = LERNA_FILE;
        obj.bumpFiles[0].filename = LERNA_FILE;
      }

    }

    super.preSynthesize();

  }

  public postSynthesize() {

    const subProjects = (this as any).subprojects as pj.Project[];

    for (const project of subProjects) {
      fs.unlinkSync(path.join(project.outdir, 'version.json'));
      fs.unlinkSync(path.join(project.outdir, '.versionrc.json'));
    }

    super.postSynthesize();

    // lerna.json replaces this file in the mono repo scenario
    fs.unlinkSync(path.join(this.outdir, 'version.json'));

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

  private lerna(script: string) {
    return `lerna run ${script}`;
  }

}
