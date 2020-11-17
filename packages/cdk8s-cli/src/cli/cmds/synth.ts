import * as fs from 'fs-extra';
import * as yargs from 'yargs';
import { readConfigSync } from '../../config';
import { shell, mkdtemp, validateSynthesis } from '../../util';

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

    if (stdout) {
      await mkdtemp(async tempDir => {
        await shell(command, [], {
          shell: true,
          env: {
            ...process.env,
            CDK8S_OUTDIR: tempDir,
          },
        });

        await shell(`cat ${tempDir}/*.yaml`, [], { stdio: 'inherit', shell: true });
      });
    } else {
      await shell(command, [], {
        shell: true,
        env: {
          ...process.env,
          CDK8S_OUTDIR: outdir,
        },
      });

      await validateSynthesis(outdir);
    }
  }
}

module.exports = new Command();
