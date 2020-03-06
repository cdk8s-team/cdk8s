import * as yargs from 'yargs';

const args = yargs
  .commandDir('cmds')
  .recommendCommands()
  .wrap(yargs.terminalWidth())
  .showHelpOnFail(false)
  .help()
  .argv;

if (args._.length === 0) {
  yargs.showHelp();
}