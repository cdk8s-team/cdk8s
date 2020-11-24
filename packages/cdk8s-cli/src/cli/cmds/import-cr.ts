import * as yargs from 'yargs';
import { readConfigSync, ImportSpec } from '../../config';
import { importDispatch } from '../../import-cr/dispatch';

const config = readConfigSync();

const DEFAULT_OUTDIR = 'charts';
const LANGUAGES = ['typescript', 'python', 'java'];

class Command implements yargs.CommandModule {
  public readonly command = 'import-cr [SPEC]';
  public readonly describe = 'Imports API object tests for your app by generating tests from sample YAML.';
  public readonly aliases = ['gen-test', 'import-cr', 'generate-test'];

  public readonly builder = (args: yargs.Argv) => args
    .positional('SPEC', { default: config.testImports, desc: 'import-cr spec with the syntax [NAME:=]SPEC where NAME is an optional module name and supported SPEC is the input directory of sample yaml to recursively import from.', array: true })
    .example('cdk8s import-cr test_cr.yaml', 'Imports Kubernetes API objects to imports/k8s.ts')
    .example('cdk8s import-cr test/fixtures', 'Imports Kubernetes API objects to imports/k8s.ts')
    .example('cdk8s import-cr --ignore /**/examples/* test/fixtures', 'Imports Kubernetes API objects to imports/k8s.ts')

    .option('output', { default: DEFAULT_OUTDIR, type: 'string', desc: 'Output directory', alias: 'o' })
    .option('ignore', { type: 'array', desc: 'Do not import files that match these regular expressions' })
    .option('class-prefix', { type: 'string', desc: 'A prefix to add to all generated class names. Disabled by default. Must be PascalCase' })
    .option('language', { default: config.language, demand: true, type: 'string', desc: 'Output programming language', alias: 'l', choices: LANGUAGES });

  public async handler(argv: any) {
    const classNamePrefix = argv.classPrefix === false ? '' : argv.classPrefix;
    const imports: string[] = Array.isArray(argv.spec) ? argv.spec : [argv.spec];
    const specs: ImportSpec[] = imports.filter(spec => spec != null).map(parseImports);

    await importDispatch(specs, argv, {
      outdir: argv.output,
      targetLanguage: argv.language,
      classNamePrefix,
    });
  }
}

function parseImports(spec: string): ImportSpec {
  const splitImport = spec.split(':=');

  // test_cr.yaml
  // tests/fixtures/repo1
  if (splitImport.length === 1) {
    return {
      source: spec,
    };
  }

  // cr=test_cr.yaml
  // cr=tests/fixtures/repo1
  if (splitImport.length === 2) {
    return {
      moduleNamePrefix: splitImport[0],
      source: splitImport[1],
    };
  }

  throw new Error('Unable to parse import specification. Syntax is [NAME:=]SPEC');
}

module.exports = new Command();
