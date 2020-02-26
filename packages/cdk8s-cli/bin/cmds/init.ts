import * as yargs from 'yargs';
import * as fs from 'fs';
import * as path from 'path';
import { execSync } from 'child_process';

const templatesDir = path.join(__dirname, '..', '..', 'templates');
const availableTemplates = fs.readdirSync(templatesDir);

export const command = 'init TEMPLATE';
export const describe = 'Create a new cdk8s project from a template';
export const aliases = [ 'initialize', 'new' ];
export const builder: yargs.CommandBuilder = args => args
  .positional('TEMPLATE', { demandOption: true })
  .choices('TEMPLATE', availableTemplates);

export const handler = (argv: any) => {
  const cc = findCookiecutter();
  if (!cc) {
    console.error(`cookiecutter not found in PATH.`);
    console.error(`See https://cookiecutter.readthedocs.io/en/1.7.0/installation.html`);
    return process.exit(1);
  }

  const templatePath = path.join(templatesDir, argv.template);
  if (!fs.existsSync(templatePath)) {
    console.error(`Cannot find template directory ${templatePath}`);
    return process.exit(1);
  }

  console.error(`Creating a new project from template: ${argv.template}`);
  execSync(`cookiecutter ${templatePath}`, { stdio: 'inherit' });
  return;
};

function findCookiecutter() {
  try {
    return execSync('which cookiecutter').toString('utf-8').trim();
  } catch (e) {
    return undefined;
  }
}
