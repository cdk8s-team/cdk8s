import * as yargs from 'yargs';
import { shell } from '../../lib/util';
import * as fs from 'fs-extra';

class Command implements yargs.CommandModule {
  public readonly command = 'synth';
  public readonly describe = 'Synthesizes Kubernetes manifests for all charts in your app.';
  public readonly aliases = [ 'synthesize' ];

  public readonly builder = (args: yargs.Argv) => args
    .option('app', { required: true, desc: 'Command to use in order to execute cdk8s app', alias: 'a' })
    .option('output', { default: 'dist', desc: 'Output directory', alias: 'o' });

  public async handler(argv: any) {
    const command = argv.app;
    const outdir = argv.output;

    await fs.remove(outdir);

    await shell(command, [], { 
      shell: true,
      env: {
        ...process.env,
        CDK8S_OUTDIR: outdir 
      }
    });

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
