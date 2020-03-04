import * as yargs from 'yargs';
import { generateAllApiObjects, DEFAULT_API_VERSION } from '../../lib/import';

class Command implements yargs.CommandModule {
  public readonly command = 'generate';
  public readonly describe = 'Generates typed constructs for Kubernetes API objects';
  public readonly aliases = [ 'gen', 'import' ];

  public readonly builder = (args: yargs.Argv) => args
    .option('api', { type: 'string', desc: 'Kubernetes API version', default: DEFAULT_API_VERSION })
    .option('output', { type: 'string', desc: 'Output directory', default: '.gen', alias: 'o' })
    .option('include', { type: 'array', desc: 'FQNs of API objects to select instead of the default latest stable version' });

  public async handler(argv: any) {
    await generateAllApiObjects(argv.output, {
      apiVersion: argv.api,
      include: argv.include
    });
  }
}


module.exports = new Command();
