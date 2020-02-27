import * as yargs from 'yargs';
import { generateAllApiObjects } from '../../lib/import';

const DEFAULT_API_VERSION = '1.14.0';

export const command = 'generate';
export const describe = 'Generates typed constructs for Kubernetes API objects';
export const aliases = [ 'gen', 'import' ];
export const builder: yargs.CommandBuilder = args => args
  .option('api', { type: 'string', default: DEFAULT_API_VERSION, desc: 'Kubernetes API version' })
  .option('output', { alias: 'o', type: 'string', desc: 'output directory', default: '.gen' });
  
export const handler = async (argv: any) => {
  await generateAllApiObjects(argv.output, { apiVersion: argv.api });
};
