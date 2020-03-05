import * as yargs from 'yargs';
import { generateAllApiObjects } from '../../lib/import';

const DEFAULTS = {
  api: '1.14.0',
};

class Command implements yargs.CommandModule {
  public readonly command = 'generate';
  public readonly describe = 'Generates typed constructs for Kubernetes API objects';
  public readonly aliases = [ 'gen', 'import' ];

  public readonly builder = (args: yargs.Argv) => args
    .option('api', { type: 'string', desc: 'Kubernetes API version', default: DEFAULTS.api })
    .option('output', { type: 'string', desc: 'Output directory', default: '.gen', alias: 'o' })
    .option('include', { type: 'array', desc: 'FQNs of API objects to select instead of the default latest stable version' })
    .option('exclude', { type: 'array', desc: 'Do not import types that match these regular expressions. They will be represented as the "any" type' })

  public async handler(argv: any) {
    await generateAllApiObjects(argv.output, {
      apiVersion: argv.api,
      include: argv.include,
      exclude: argv.exclude
    });
  }
}


module.exports = new Command();
