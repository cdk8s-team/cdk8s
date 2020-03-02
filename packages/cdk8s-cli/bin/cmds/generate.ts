import * as yargs from 'yargs';
import { generateAllApiObjects } from '../../lib/import';

const DEFAULT_API_VERSION = '1.14.0';

class Command implements yargs.CommandModule {
  public readonly command = 'generate';
  public readonly describe = 'Generates typed constructs for Kubernetes API objects';
  public readonly aliases = [ 'gen', 'import' ];

  public readonly builder = (args: yargs.Argv) => args
    .option('api', { type: 'string', desc: 'Kubernetes API version', default: DEFAULT_API_VERSION })
    .option('output', { type: 'string' as 'string', desc: 'output directory', default: '.gen', alias: 'o' });

  public async handler(argv: any) {
    await generateAllApiObjects(argv.output, { apiVersion: argv.api });
  }
}

module.exports = new Command();
