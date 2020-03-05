import * as yargs from 'yargs';
import { generateAllApiObjects, DEFAULT_API_VERSION } from '../../lib/import';

const K8S_SPEC = 'k8s';
const DEFAULT_OUTDIR = 'imports';

class Command implements yargs.CommandModule {
  public readonly command = 'import SPEC';
  public readonly describe = 'Imports API objects to your app by generating constructs.';
  public readonly aliases = [ 'gen', 'import', 'generate' ];

  public readonly builder = (args: yargs.Argv) => args
    .positional('SPEC', {  desc: `The API spec to import (only "k8s" is currently supported)` })
    .demand('SPEC')
    .example(`cdk8s import k8s`, `Imports Kubenretes API objects to imports/k8s.ts`)
    .example(`cdk8s import k8s@1.13.0`, `imports a specific version of the Kubenretes API`)

    .option('output', { type: 'string', desc: 'Output directory', default: DEFAULT_OUTDIR, alias: 'o' })
    .option('include', { type: 'array', desc: 'Types to select instead of the default which is latest stable version' })
    .option('exclude', { type: 'array', desc: 'Do not import types that match these regular expressions. They will be represented as the "any" type' });

  public async handler(argv: any) {
    const spec = argv.spec;
    const [ src, specver ] = spec.split('@');

    const apiVersion = specver ?? DEFAULT_API_VERSION;

    if (src !== K8S_SPEC) {
      throw new Error(`currently we only support the source ${K8S_SPEC}`);
    }

    await generateAllApiObjects(argv.output, {
      apiVersion,
      include: argv.include,
      exclude: argv.exclude
    });

    console.log(`${argv.output}/k8s.ts`);
  }
}

module.exports = new Command();
