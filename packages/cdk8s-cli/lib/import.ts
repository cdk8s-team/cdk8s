import * as https from 'https';
import { promises } from 'fs';
import { emitConstructForApiObject, findApiObjectDefinitions } from '../lib/codegen-constructs';
import { CodeMaker } from 'codemaker';
import { JSONSchema4 } from 'json-schema';

export interface Options {
  readonly apiVersion: string;
}

export async function generateAllApiObjects(outdir: string, options: Options) {
  const code = new CodeMaker();
  code.indentation = 2;

  const schema = await downloadSchema(options.apiVersion);
  const topLevelObjects = findApiObjectDefinitions(schema);

  for (const o of topLevelObjects) {
    emitConstructForApiObject(code, schema, o);
  }

  await promises.mkdir(outdir, { recursive: true });
  await code.save(outdir);  
}

async function downloadSchema(apiVersion: string) {
  const output = await httpsGet(`https://kubernetesjsonschema.dev/v${apiVersion}/_definitions.json`);
  return JSON.parse(output) as JSONSchema4;
}

async function httpsGet(url: string): Promise<string> {
  return new Promise((ok, ko) => {
    const req = https.get(url, res => {
      const data = new Array<Buffer>();
      res.on('data', chunk => data.push(chunk));
      res.once('end', () => ok(Buffer.concat(data).toString('utf-8')));
      res.once('error', ko);
    });

    req.once('error', ko);
    req.end();
  });
}
