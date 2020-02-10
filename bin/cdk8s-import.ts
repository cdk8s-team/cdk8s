import * as https from 'https';
import * as yargs from 'yargs';
import { promises } from 'fs';
import { JSONSchema4 } from 'json-schema';
import { importResource, findApiObjectDefinitions } from './import-object';
import { CodeMaker } from 'codemaker';

const DEFAULT_API_VERSION = '1.14.0';

async function main() {
  const argv = yargs
    .usage('$0')
    .option('api', { type: 'string', default: DEFAULT_API_VERSION, desc: 'Kubernetes API version' })
    .option('output', { alias: 'o', type: 'string', desc: 'output directory', default: '.gen' })
    .option('language', { alias: 'l', type: 'string', desc: 'output language', default: 'typescript' })
    .version()
    .strict()
    .argv;

  const code = new CodeMaker();
  code.indentation = 2;

  const schema = await downloadSchema(argv.api);
  const topLevelObjects = findApiObjectDefinitions(schema);

  for (const o of topLevelObjects) {
    importResource(code, schema, o);
  }

  await promises.mkdir(argv.output, { recursive: true });
  await code.save(argv.output);
}

main().catch(e => {
  console.error(e);
  process.exit(1);
});

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
