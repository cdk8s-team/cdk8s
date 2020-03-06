import * as yargs from 'yargs';
import { importKubernetesApi, DEFAULT_API_VERSION } from '../../lib/import';
import { readConfigSync } from '../../lib/config';

const config = readConfigSync();

const K8S_SOURCE = 'k8s';
const DEFAULT_OUTDIR = 'imports';
const LANGUAGES = [ 'typescript', 'python' ];

class Command implements yargs.CommandModule {
  public readonly command = 'import [SOURCE]';
  public readonly describe = 'Imports API objects to your app by generating constructs.';
  public readonly aliases = [ 'gen', 'import', 'generate' ];

  public readonly builder = (args: yargs.Argv) => args
    .positional('SOURCE', { default: config.imports, desc: `The API source to import (supported sources: "${K8S_SOURCE}")`, array: true })
    .example(`cdk8s import k8s`, `Imports Kubenretes API objects to imports/k8s.ts`)
    .example(`cdk8s import k8s@1.13.0`, `imports a specific version of the Kubenretes API`)

    .option('output', { default: DEFAULT_OUTDIR, type: 'string', desc: 'Output directory', alias: 'o' })
    .option('include', { type: 'array', desc: 'Types to select instead of the default which is latest stable version' })
    .option('exclude', { type: 'array', desc: 'Do not import types that match these regular expressions. They will be represented as the "any" type' })
    .option('language', { default: config.language, demand: true, type: 'string', desc: 'Output programming language', alias: 'l', choices: LANGUAGES });

  public async handler(argv: any) {
    const sources = Array.isArray(argv.source) ? argv.source : [ argv.source ];

    if (sources.length > 1) {
      throw new Error(`only a single source is supported at the moment. got: ${sources.join(',')}`);
    }

    for (const source of sources) {
      const [ src, srcver ] = source.split('@');

      const apiVersion = srcver ?? DEFAULT_API_VERSION;
  
      if (src !== K8S_SOURCE) {
        throw new Error(`unsupported import source "${src}", supported sources: "${K8S_SOURCE}"`);
      }
  
      await importKubernetesApi(argv.output, {
        apiVersion,
        include: argv.include,
        exclude: argv.exclude,
        language: argv.language
      });
    }

  }
}

module.exports = new Command();
