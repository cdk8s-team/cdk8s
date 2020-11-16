import * as fs from 'fs-extra';
import * as yargs from 'yargs';
import { readConfigSync } from '../../config';
import { shell } from '../../util';

const config = readConfigSync();

class Command implements yargs.CommandModule {
  public readonly command = 'synth';
  public readonly describe = 'Synthesizes Kubernetes manifests for all charts in your app.';
  public readonly aliases = ['synthesize'];

  public readonly builder = (args: yargs.Argv) => args
    .option('app', { default: config.app, required: true, desc: 'Command to use in order to execute cdk8s app', alias: 'a' })
    .option('output', { default: config.output, required: false, desc: 'Output directory', alias: 'o' })
    .option('stdout', { type: 'boolean', required: false, desc: 'Write synthesized manifests to STDOUT instead of the output directory', alias: 'p' });

  public async handler(argv: any) {
    const command = argv.app;
    const outdir = argv.output;
    const stdout = argv.stdout;

    if (outdir !== config.output && stdout) {
      console.error('ERROR: \'--output\' and \'--stdout\' are mutually exclusive. Please only use one.');
      process.exit(1);
    }

    await fs.remove(outdir);

    await shell(command, [], {
      shell: true,
      env: {
        ...process.env,
        CDK8S_OUTDIR: outdir,
        CDK8S_STDOUT: stdout,
      },
    });

    if (stdout) {
      process.exit(0);
    }

    if (!await fs.pathExists(outdir)) {
      console.error(`ERROR: synthesis failed, app expected to create "${outdir}"`);
      process.exit(1);
    }

    let found = false;
    for (const file of await fs.readdir(outdir)) {
      if (file.endsWith('.k8s.yaml')) {
        console.log(`${outdir}/${file}`);
        found = true;
      }
    }

    if (!found) {
      console.error('No manifests synthesized');
    }
  }
}

module.exports = new Command();
