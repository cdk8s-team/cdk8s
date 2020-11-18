import * as path from 'path';
import * as fs from 'fs-extra';
import * as pacmak from 'jsii-pacmak';
import * as pacmakv from 'jsii-pacmak/lib/targets/version-utils';
import { sscaff } from 'sscaff';
import * as yargs from 'yargs';

const pkgroot = path.join(__dirname, '..', '..', '..');

const pkg = fs.readJsonSync(path.join(pkgroot, 'package.json'));
const constructsVersion = pkg.dependencies.constructs;

const templatesDir = path.join(pkgroot, 'templates');
const availableTemplates = fs.readdirSync(templatesDir).filter(x => !x.startsWith('.'));


class Command implements yargs.CommandModule {
  public readonly command = 'init TYPE';
  public readonly describe = 'Create a new cdk8s project from a template.';
  public readonly builder = (args: yargs.Argv) => args
    .positional('TYPE', { demandOption: true, desc: 'Project type' })
    .showHelpOnFail(false)
    .option('dist', { type: 'string', desc: 'Install dependencies from a "dist" directory (for development)' })
    .option('cdk8s-version', { type: 'string', desc: 'The cdk8s version to use when creating the new project', default: pkg.version })
    .choices('TYPE', availableTemplates);

  public async handler(argv: any) {
    if (fs.readdirSync('.').filter(f => !f.startsWith('.')).length > 0) {
      console.error('Cannot initialize a project in a non-empty directory');
      process.exit(1);
    }

    console.error(`Initializing a project from the ${argv.type} template`);
    const templatePath = path.join(templatesDir, argv.type);

    const deps: any = await determineDeps(argv.cdk8SVersion, argv.dist);

    try {
      await sscaff(templatePath, '.', { ...deps });
    } catch (e) {
      throw new Error(`error during project initialization: ${e.stack}\nSTDOUT:\n${e.stdout?.toString()}\nSTDERR:\n${e.stderr?.toString()}`);
    }
  }
}

async function determineDeps(version: string, dist?: string): Promise<Deps> {
  const cdk8s = new ModuleVersion('cdk8s', version, { jsii: true });
  const cdk8sPlus17 = new ModuleVersion('cdk8s-plus-17', version, { jsii: true });
  const cdk8sCli = new ModuleVersion('cdk8s-cli', version);

  if (dist) {
    const ret = {
      npm_cdk8s: path.resolve(dist, 'js', cdk8s.npmTarballFile),
      npm_cdk8s_cli: path.resolve(dist, 'js', cdk8sCli.npmTarballFile),
      npm_cdk8s_plus: path.resolve(dist, 'js', cdk8sPlus17.npmTarballFile),
      pypi_cdk8s: path.resolve(dist, 'python', cdk8s.pypiWheelFile),
      pypi_cdk8s_plus: path.resolve(dist, 'python', cdk8sPlus17.pypiWheelFile),
      mvn_cdk8s: path.resolve(dist, 'java', cdk8s.javaJarFile),
      mvn_cdk8s_plus: path.resolve(dist, 'java', cdk8sPlus17.javaJarFile),
    };

    for (const file of Object.values(ret)) {
      if (!(await fs.pathExists(file))) {
        throw new Error(`unable to find ${file} under the "dist" directory (${dist})`);
      }
    }

    const versions = {
      cdk8s_version: version,
      constructs_version: constructsVersion,
    };

    return {
      ...ret,
      ...versions,
    };
  }

  if (version === '0.0.0') {
    throw new Error('cannot use version 0.0.0, use --cdk8s-version, --dist or CDK8S_DIST to install from a "dist" directory');
  }

  return {
    npm_cdk8s: cdk8s.npmDependency,
    npm_cdk8s_cli: cdk8sCli.npmDependency,
    npm_cdk8s_plus: cdk8sPlus17.npmDependency,
    pypi_cdk8s: cdk8s.pypiDependency,
    pypi_cdk8s_plus: cdk8sPlus17.pypiDependency,
    mvn_cdk8s: cdk8s.mavenDependency,
    mvn_cdk8s_plus: cdk8sPlus17.mavenDependency,
    cdk8s_version: version,
    constructs_version: constructsVersion,
  };
}

interface Deps {
  npm_cdk8s: string;
  npm_cdk8s_cli: string;
  npm_cdk8s_plus: string;
  pypi_cdk8s: string;
  pypi_cdk8s_plus: string;
  mvn_cdk8s: string;
  mvn_cdk8s_plus: string;
  cdk8s_version: string;
  constructs_version: string;
}

class ModuleVersion {
  public readonly pypiVersion: string;
  public readonly npmVersion: string;
  public readonly mavenVersion: string;

  private readonly jsii: boolean;

  constructor(private readonly moduleName: string, private readonly version: string, options: { jsii?: boolean } = { }) {
    this.npmVersion = version;
    this.pypiVersion = pacmakv.toReleaseVersion(this.version, pacmak.TargetName.PYTHON);
    this.mavenVersion = pacmakv.toReleaseVersion(version, pacmak.TargetName.JAVA);
    this.jsii = options.jsii ?? false;
  }

  public get npmTarballFile() {
    if (this.jsii) {
      return `${this.moduleName}@${this.version}.jsii.tgz`;
    } else {
      return `${this.moduleName}-v${this.version}.tgz`;
    }
  }

  public get pypiWheelFile() {
    const [major, minor, patch, pre] = this.pypiVersion.split('.');
    return `${this.moduleName.replace(/-/g, '_')}-${major}.${minor}.${patch}${pre ?? ''}-py3-none-any.whl`;
  }

  public get javaJarFile() {
    return `org/cdk8s/${this.moduleName}/${this.mavenVersion}/${this.moduleName}-${this.mavenVersion}.jar`;
  }

  public get npmDependency() {
    return `${this.moduleName}@^${this.npmVersion}`;
  }

  public get pypiDependency() {
    return `${this.moduleName}~=${this.pypiVersion}`;
  }

  public get mavenDependency() {
    return this.mavenVersion;
  }
}

module.exports = new Command();
