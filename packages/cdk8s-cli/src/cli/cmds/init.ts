import * as yargs from 'yargs';
import * as fs from 'fs-extra';
import * as path from 'path';
import { sscaff } from 'sscaff';

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
    .showHelpOnFail(true)
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

    await sscaff(templatePath, '.', {
      ...deps,
    });
  }
}

async function determineDeps(version: string, dist?: string): Promise<Deps> {
  if (dist) {
    const ret = {
      npm_cdk8s: path.resolve(dist, 'js', `cdk8s@${version}.jsii.tgz`),
      npm_cdk8s_cli: path.resolve(dist, 'js', `cdk8s-cli-v${version}.tgz`), // yarn pack adds a "v" before the version
      npm_cdk8s_plus: path.resolve(dist, 'js', `cdk8s-plus@${version}.jsii.tgz`),
      pypi_cdk8s: path.resolve(dist, 'python', `cdk8s-${version.replace(/-/g, '_')}-py3-none-any.whl`),
      pypi_cdk8s_plus: path.resolve(dist, 'python', `cdk8s_plus-${version.replace(/-/g, '_')}-py3-none-any.whl`),
      mvn_cdk8s: path.resolve(dist, 'java', `org/cdk8s/cdk8s/${version}/cdk8s-${version}.jar`),
      mvn_cdk8s_plus: path.resolve(dist, 'java', `org/cdk8s/cdk8s-plus/${version}/cdk8s-plus-${version}.jar`),
    };

    for (const file of Object.values(ret)) {
      if (!(await fs.pathExists(file))) {
        throw new Error(`unable to find ${file} under the "dist" directory (${dist})`);
      }
    }

    const versions = {
      cdk8s_version: version,
      constructs_version: constructsVersion,
    }

    return {
      ...ret,
      ...versions,
    };
  }
  
  if (version === '0.0.0') {
    throw new Error('cannot use version 0.0.0, use --cdk8s-version, --dist or CDK8S_DIST to install from a "dist" directory');
  }

  // determine if we want a specific pinned version or a version range we take
  // a pinned version if version includes a hyphen which means it is a
  // pre-release (e.g. "0.12.0-pre.e6834d3"). otherwise, we require a caret
  // version.
  const ver = version.includes('-') ? version : `^${version}`;

  return {
    npm_cdk8s: `cdk8s@${ver}`,
    npm_cdk8s_cli: `cdk8s-cli@${ver}`,
    npm_cdk8s_plus: `cdk8s-plus@${ver}`,
    pypi_cdk8s: `cdk8s~=${version}`, // no support for pre-release
    pypi_cdk8s_plus: `cdk8s-plus~=${version}`,
    mvn_cdk8s: version,
    mvn_cdk8s_plus: version,
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

module.exports = new Command();
