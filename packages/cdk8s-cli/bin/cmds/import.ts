import {join} from 'path';
import * as yargs from 'yargs';
import { readConfigSync } from '../../lib/config';
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
    .example(`cdk8s import k8s`, `Imports Kubenretes API objects to imports/k8s.ts`)
    .example(`cdk8s import k8s@1.13.0`, `imports a specific version of the Kubenretes API`)
    .example(`cdk8s import jenkins.io_jenkins_crd.yaml`, 'imports constructs for the Jenkins custom resource definition from a file')

    .option('output', { default: DEFAULT_OUTDIR, type: 'string', desc: 'Output directory', alias: 'o' })
    .option('include', { type: 'array', desc: 'Types to select instead of the default which is latest stable version (only for "k8s")' })
    .option('exclude', { type: 'array', desc: 'Do not import types that match these regular expressions. They will be represented as the "any" type (only for "k8s")' })
    .option('language', { default: config.language, demand: true, type: 'string', desc: 'Output programming language', alias: 'l', choices: LANGUAGES });

  public async handler(argv: any) {
    const sources = Array.isArray(argv.source) ? argv.source : [ argv.source ];

    let outdir = argv.output;

    // BUILD_WORKSPACE_DIRECTORY environment variable is only available during Bazel
    // run executions. This workspace directory allows us to generate files directly
    // in the source file tree rather than via a symlink.
    if (process.env['BUILD_WORKSPACE_DIRECTORY']) {
      outdir = join(process.env['BUILD_WORKSPACE_DIRECTORY'], outdir);
    }

    await importDispatch(sources, argv, {
      outdir,
      targetLanguage: argv.language,
    });
  }
}

module.exports = new Command();
