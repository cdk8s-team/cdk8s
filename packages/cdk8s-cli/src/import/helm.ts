import { TypeGenerator } from 'json2jsii';
import * as fs from 'fs';
import * as path from 'path';
import { load as loadYaml } from 'js-yaml';
import { logger } from '../logging';

export interface HelmImportOptions {
  chart: string;
  repo?: string;
  version?: string;
  values?: any;
  includeCrds?: boolean;
  namespace?: string;
  outdir: string;
}

export async function importHelmChart(options: HelmImportOptions): Promise<void> {
  const { chart, repo, version, values, includeCrds, namespace, outdir } = options;
  // Simulate fetching and processing Helm chart
  const schema = await fetchChartSchema(chart, repo, version);
  const outputFile = path.join(outdir, 'index.ts');
  generateTypeScript(schema, outputFile);
  logger.info(`Generated types in ${outputFile}`);
}

async function fetchChartSchema(chart: string, repo?: string, version?: string): Promise<any> {
  // Placeholder: actually fetch and convert Helm values schema to JSON Schema
  return { type: 'object', properties: {}, definitions: {} };
}

function generateTypeScript(schema: any, outputFile: string): void {
  const typeGenerator = new TypeGenerator();
  let typeScriptCode: string;
  try {
    typeScriptCode = typeGenerator.render(schema, {})
  } catch (error: any) {
    if (error.message && error.message.includes('unable to find schema definition for')) {
      const match = error.message.match(/unable to find schema definition for ['"](\w+)['"]/);
      const missingType = match ? match[1] : null;
      if (missingType) {
        logger.warn(`Missing schema definition for type '${missingType}', substituting with Record<string, any>`);
        patchMissingType(schema, missingType);
        typeScriptCode = typeGenerator.render(schema, {});
      } else {
        throw error;
      }
    } else {
      throw error;
    }
  }
  fs.writeFileSync(outputFile, typeScriptCode);
}

function patchMissingType(schema: any, missingTypeName: string): void {
  if (!schema.definitions) {
    schema.definitions = {};
  }
  schema.definitions[missingTypeName] = { type: 'object', additionalProperties: true };
}