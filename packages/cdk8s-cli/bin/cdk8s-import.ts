import * as yargs from 'yargs';
import { generateAllApiObjects } from '../lib/import';

const DEFAULT_API_VERSION = '1.14.0';

async function main() {
  const argv = yargs
    .usage('$0')
    .option('api', { type: 'string', default: DEFAULT_API_VERSION, desc: 'Kubernetes API version' })
    .option('output', { alias: 'o', type: 'string', desc: 'output directory', default: '.gen' })
    .version()
    .strict()
    .argv;

  await generateAllApiObjects(argv.output, {
    apiVersion: argv.api
  });
}

main().catch(e => {
  console.error(e);
  process.exit(1);
});
