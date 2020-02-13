import fs = require('fs');
import path = require('path');
import { Chart } from '../lib';
import { App } from '@aws-cdk/core';

const YAML = require('yaml');

/**
 * Testing utilities for cdk8s applications.
 */
export class Testing {
  /**
   * Returns the Kubernetes manifest synthesized from this chart.
   */
  public static synth(chart: Chart) {
    const app = chart.node.root as App;
    const assembly = app.synth();
    const filePath = path.join(assembly.directory, chart.manifestFile);
    return YAML.parseAllDocuments(fs.readFileSync(filePath, 'utf-8'));
  }

  private constructor() { }
}
