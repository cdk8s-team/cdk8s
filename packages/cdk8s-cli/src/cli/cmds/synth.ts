import * as fs from 'fs-extra';
import * as yargs from 'yargs';
import { readConfigSync } from '../../config';
import { callLibrary, mkdtemp, validateSynthesis } from '../../util';
import * as path from 'path';

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
      throw new Error('\'--output\' and \'--stdout\' are mutually exclusive. Please only use one.');
    }

    await fs.remove(outdir);

    if (stdout) {
      await mkdtemp(async tempDir => {
        await callLibrary(command, tempDir);

        const manifests = (await fs.readdir(tempDir)).filter(f => path.extname(f) === '.k8s.yaml');
        for (const f of manifests) {
          fs.createReadStream(path.join(tempDir, f)).pipe(process.stdout);
        }
        await validateSynthesis(tempDir);
      });
    } else {
      await callLibrary(command, outdir);

      await validateSynthesis(outdir);
    }
  }
}

module.exports = new Command();
