import * as yargs from 'yargs';
import * as fs from 'fs';
import * as path from 'path';
import { sscaff } from 'sscaff';

const templatesDir = path.join(__dirname, '..', '..', 'templates');
const availableTemplates = fs.readdirSync(templatesDir);

class Command implements yargs.CommandModule {
  public readonly command = 'init TYPE';
  public readonly describe = 'Create a new cdk8s project from a template.';
  public readonly builder = (args: yargs.Argv) => args
    .positional('TYPE', { demandOption: true, desc: 'Project type' })
    .choices('TYPE', availableTemplates);

  public async handler(argv: any) {
    if (fs.readdirSync('.').length > 0) {
      console.error(`cannot initialize a project in a non-empty directory`);
      process.exit(1);
    }
  
    console.error(`Initializing a project from the ${argv.type} template`);
    const templatePath = path.join(templatesDir, argv.type);
    await sscaff(templatePath, '.');
  }
}

module.exports = new Command();