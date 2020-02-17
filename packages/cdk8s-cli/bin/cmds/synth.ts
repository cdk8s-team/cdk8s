import * as fs from 'fs-extra';
import { join } from 'path';
import * as yargs from 'yargs';
import { readConfigSync } from '../../lib/config';
import { shell } from '../../lib/util';

const config = readConfigSync();

class Command implements yargs.CommandModule {
  public readonly command = 'synth';
  public readonly describe = 'Synthesizes Kubernetes manifests for all charts in your app.';
  public readonly aliases = [ 'synthesize' ];

  public readonly builder = (args: yargs.Argv) => args
    .option('app', { default: config.app, required: true, desc: 'Command to use in order to execute cdk8s app', alias: 'a' })
    .option('output', { default: config.output, required: true, desc: 'Output directory', alias: 'o' });

  public async handler(argv: any) {
    const command = argv.app;

    // BUILD_WORKSPACE_DIRECTORY environment variable is only available during Bazel
    // run executions. This workspace directory allows us to generate files directly
    // in the source file tree rather than via a symlink.
    const outdir = process.env['BUILD_WORKSPACE_DIRECTORY'] ?
      join(process.env['BUILD_WORKSPACE_DIRECTORY'], argv.output) : argv.output;

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
