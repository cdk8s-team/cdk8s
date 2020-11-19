// eslint-disable-next-line
const cmd = require('../../src/cli/cmds/synth');

test('synth with both --stdout and --output throws exception', () => {
  // eslint-disable-next-line
  expect(cmd.handler({ app: 'cdk8s', output: 'test', stdout: true })).rejects.toEqual(new Error('\'--output\' and \'--stdout\' are mutually exclusive. Please only use one.'));
});
