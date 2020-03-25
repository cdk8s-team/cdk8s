import * as yaml from 'yaml';
import * as fs from 'fs-extra';
import { Language } from './import/base';

const CONFIG_FILE = 'cdk8s.yaml';

export interface Cdk8sImport {
  moduleName?: string;
  file: string;
}

export interface Config {
  readonly app?: string;
  readonly language?: Language;
  readonly output?: string;
  readonly imports?: (string|Cdk8sImport)[];
}

const DEFAULTS: Config = {
  output: 'dist'
};

export function readConfigSync(): Config {
  let config: Config = DEFAULTS;
  if (fs.existsSync(CONFIG_FILE)) {
    config = {
      ...config,
      ...yaml.parse(fs.readFileSync(CONFIG_FILE, 'utf-8'))
    };
  }

  return config;
}