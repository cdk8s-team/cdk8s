import { Chart, HelmChart, Testing } from '../src/';
import * as path from 'path';
import * as child_process from 'child_process';


describe('uses local vs docker', () => {
  beforeEach(() => {
    jest.clearAllMocks();
  });

  it('uses local when available', () => {
    const spawnSyncMock = jest.spyOn(child_process, 'spawnSync').mockReturnValue({
      status: 0,
      stderr: Buffer.from(''),
      stdout: Buffer.from(''),
      pid: 123,
      output: ['stdout', 'stderr'],
      signal: null,
    });

    const app = Testing.app();
    const chart = new Chart(app, 'test-chart');
    new HelmChart(chart, 'test-helm-chart', {
      chart: path.join(__dirname, './mysql'),
    });

    Testing.synth(chart);

    expect(spawnSyncMock).toHaveBeenCalledTimes(2);
    expect(spawnSyncMock).toHaveBeenCalledWith(expect.stringContaining('helm'), ['version', '-c']);
    expect(spawnSyncMock).toHaveBeenCalledWith(expect.stringContaining('helm'), ['template', '.'], {cwd: path.join(__dirname, '/mysql')});
  });

  it('uses docker when local not available', () => {
    const spawnSyncMock = jest.spyOn(child_process, 'spawnSync')
      .mockReturnValueOnce({
        status: 0,
        stderr: Buffer.from(''),
        stdout: Buffer.from(''),
        error: new Error('does not exist'),
        pid: 123,
        output: ['stdout', 'stderr'],
        signal: null,
      })
      .mockReturnValueOnce({
        status: 0,
        stderr: Buffer.from(''),
        stdout: Buffer.from(''),
        pid: 123,
        output: ['stdout', 'stderr'],
        signal: null,
      });


    const app = Testing.app();
    const chart = new Chart(app, 'test-chart');
    new HelmChart(chart, 'test-helm-chart', {
      chart: path.join(__dirname, './mysql'),
    });

    Testing.synth(chart);

    expect(spawnSyncMock).toHaveBeenCalledTimes(2);
    expect(spawnSyncMock).toHaveBeenCalledWith(expect.stringContaining('helm'), ['version', '-c']);
    expect(spawnSyncMock).toHaveBeenCalledWith(expect.stringContaining('docker'), ['run', '-v', path.join(__dirname, 'mysql') + ':/app', '-w', '/app', 'alpine/helm', 'template', '.']);
  });

  it('hands over proper values file', () => {
    const spawnSyncMock = jest.spyOn(child_process, 'spawnSync')
      .mockReturnValueOnce({
        status: 0,
        stderr: Buffer.from(''),
        stdout: Buffer.from(''),
        error: new Error('does not exist'),
        pid: 123,
        output: ['stdout', 'stderr'],
        signal: null,
      })
      .mockReturnValueOnce({
        status: 0,
        stderr: Buffer.from(''),
        stdout: Buffer.from(''),
        pid: 123,
        output: ['stdout', 'stderr'],
        signal: null,
      });


    const app = Testing.app();
    const chart = new Chart(app, 'test-chart');
    new HelmChart(chart, 'test-helm-chart', {
      chart: path.join(__dirname, './mysql'),
      values: 'dev-only.yaml',
    });

    Testing.synth(chart);

    expect(spawnSyncMock).toHaveBeenCalledTimes(2);
    expect(spawnSyncMock).toHaveBeenCalledWith(expect.stringContaining('helm'), ['version', '-c']);
    expect(spawnSyncMock).toHaveBeenCalledWith(expect.stringContaining('docker'), ['run', '-v', path.join(__dirname, 'mysql') + ':/app', '-w', '/app', 'alpine/helm', 'template', '-f', 'dev-only.yaml', '.']);
  });

  it('hands over generated values file', () => {
    const spawnSyncMock = jest.spyOn(child_process, 'spawnSync')
      .mockReturnValueOnce({
        status: 0,
        stderr: Buffer.from(''),
        stdout: Buffer.from(''),
        error: new Error('does not exist'),
        pid: 123,
        output: ['stdout', 'stderr'],
        signal: null,
      })
      .mockReturnValueOnce({
        status: 0,
        stderr: Buffer.from(''),
        stdout: Buffer.from(''),
        pid: 123,
        output: ['stdout', 'stderr'],
        signal: null,
      });


    const app = Testing.app();
    const chart = new Chart(app, 'test-chart');
    new HelmChart(chart, 'test-helm-chart', {
      chart: path.join(__dirname, './mysql'),
      values: {one: 'two'},
    });

    Testing.synth(chart);

    expect(spawnSyncMock).toHaveBeenCalledTimes(2);
    expect(spawnSyncMock).toHaveBeenCalledWith(expect.stringContaining('helm'), ['version', '-c']);
    expect(spawnSyncMock).toHaveBeenCalledWith(expect.stringContaining('docker'), [
      'run',
      '-v', path.join(__dirname, 'mysql') + ':/app',
      '-v', path.join(__dirname, '..', '.helm-temp') + ':/props',
      '-w', '/app',
      'alpine/helm', 'template',
      '-f', '/props/overrides.yaml',
      '.',
    ]);
  });
});
