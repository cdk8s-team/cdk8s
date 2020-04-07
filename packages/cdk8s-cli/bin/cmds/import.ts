import * as yargs from 'yargs';
import { readConfigSync, ImportSpec } from '../../lib/config';
import { importDispatch } from '../../lib/import/dispatch';

const config = readConfigSync();

const DEFAULT_OUTDIR = 'imports';
const LANGUAGES = [ 'typescript', 'python' ];

class Command implements yargs.CommandModule {
  public readonly command = 'import [SOURCE]';
  public readonly describe = 'Imports API objects to your app by generating constructs.';
  public readonly aliases = [ 'gen', 'import', 'generate' ];

  public readonly builder = (args: yargs.Argv) => args
    .positional('SOURCE', { default: config.imports, desc: `The API source to import (supported sources: k8s, crd.yaml, https://domain/crd.yaml)`, array: true })
    .example(`cdk8s import --k8s=k8s`, `Imports Kubernetes API objects to imports/k8s.ts`)
    .example(`cdk8s import k8s@1.13.0`, `Imports a specific version of the Kubernetes API`)
    .example(`cdk8s import jenkins.io_jenkins_crd.yaml`, 'Imports constructs for the Jenkins custom resource definition from a file')
    .example(`cdk8s import mattermost:=mattermost_crd.yaml`, 'Imports constructs for the mattermost cluster custom resource definition using a custom module name')

    .option('output', { default: DEFAULT_OUTDIR, type: 'string', desc: 'Output directory', alias: 'o' })
    .option('include', { type: 'array', desc: 'Types to select instead of the default which is latest stable version (only for "k8s")' })
    .option('exclude', { type: 'array', desc: 'Do not import types that match these regular expressions. They will be represented as the "any" type (only for "k8s")' })
    .option('language', { default: config.language, demand: true, type: 'string', desc: 'Output programming language', alias: 'l', choices: LANGUAGES });

  public async handler(argv: any) {
    let sources = Array.isArray(argv.source) ? argv.source : [ argv.source ];

    sources = sources.filter((source: string) => source != null).map((source: string) => parseImports(source));

    await importDispatch(sources, argv, {
      outdir: argv.output,
      targetLanguage: argv.language,
    });
  }
}

function parseImports(spec: string): ImportSpec {
  const splitImport = spec.split(':=');

  // crd.yaml
  // url.com/crd.yaml
  if (splitImport.length === 1) {
    return {
      source: spec
    }
  }

  // crd=crd.yaml
  // crd=url.com/crd.yaml
  if (splitImport.length === 2) {
    return {
      moduleNamePrefix: splitImport[0],
      source: splitImport[1]
    }
  }

  // We'll assume that no one hosts remote files with query params,
  // like this: url.com/crds?crd=mycrd.yaml
  console.error('If you reach here, please open an issue with cdk8s.');
  return {
    source: spec
  }
}

module.exports = new Command();
