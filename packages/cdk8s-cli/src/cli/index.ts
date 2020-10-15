import * as yargs from 'yargs';

const args = yargs
  .commandDir('cmds')
  .recommendCommands()
  .wrap(yargs.terminalWidth())
  .showHelpOnFail(false)
  .env('CDK8S')
  .epilogue('Options can be specified via environment variables with the "CDK8S_" prefix (e.g. "CDK8S_OUTPUT")')
  .help()
  .argv;

if (args._.length === 0) {
  yargs.showHelp();
}
