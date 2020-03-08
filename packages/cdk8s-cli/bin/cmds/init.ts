import * as yargs from 'yargs';
import * as fs from 'fs';
import * as path from 'path';
import { sscaff } from 'sscaff';

const templatesDir = path.join(__dirname, '..', '..', 'templates');
const availableTemplates = fs.readdirSync(templatesDir).filter(x => !x.startsWith('.'));
const version: string = require('../../package.json').version;

class Command implements yargs.CommandModule {
  public readonly command = 'init TYPE';
  public readonly describe = 'Create a new cdk8s project from a template.';
  public readonly builder = (args: yargs.Argv) => args
    .positional('TYPE', { demandOption: true, desc: 'Project type' })
    .showHelpOnFail(true)
    .choices('TYPE', availableTemplates);

  public async handler(argv: any) {
    if (fs.readdirSync('.').length > 0) {
      console.error(`Cannot initialize a project in a non-empty directory`);
      process.exit(1);
    }
  
    console.error(`Initializing a project from the ${argv.type} template`);
    const templatePath = path.join(templatesDir, argv.type);

    // determine if we want a specific pinned version or a version range we take
    // a pinned version if version includes a hyphen which means it is a
    // pre-release (e.g. "0.12.0-pre.e6834d3"). otherwise, we require a caret
    // version.
    const ver = version.includes('-') ? version : `^${version}`;

    await sscaff(templatePath, '.', {
      version: ver
    });
  }
}

module.exports = new Command();