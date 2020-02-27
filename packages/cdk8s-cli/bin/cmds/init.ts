import * as yargs from 'yargs';
import * as fs from 'fs';
import * as path from 'path';
import { sscaff } from 'sscaff';

const templatesDir = path.join(__dirname, '..', '..', 'templates');
const availableTemplates = fs.readdirSync(templatesDir);

export const command = 'init TEMPLATE';
export const describe = 'Create a new cdk8s project from a template';
export const aliases = [ 'initialize', 'new' ];
export const builder: yargs.CommandBuilder = args => args
  .positional('TEMPLATE', { demandOption: true })
  .choices('TEMPLATE', availableTemplates);

export const handler = async (argv: any) => {
  if (fs.readdirSync('.').length > 0) {
    console.error(`cannot initialize a project in a non-empty directory`);
    process.exit(1);
  }

  console.error(`Initializing a project from the ${argv.template} template`);
  const templatePath = path.join(templatesDir, argv.template);
  await sscaff(templatePath, '.');
};
