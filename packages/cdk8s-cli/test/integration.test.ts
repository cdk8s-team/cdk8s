import { importKubernetesApi, Language } from "../lib/import";
import { jsiiCompile } from "../lib/jsii";
import { promises as fs } from 'fs';
import { withTempDir } from "../lib/util";

jest.setTimeout(60_000);

test('generate and compile 1.14.0', async () => {
  await withTempDir('import-k8s', async () => {
    const workdir = '.';
    await importKubernetesApi(workdir, {
      language: Language.TYPESCRIPT,
      apiVersion: '1.14.0' 
    });
    
    await jsiiCompile(workdir, { stdout: true});
  
    const manifest = JSON.parse(await fs.readFile('.jsii', 'utf-8'));
    expect(manifest).toMatchSnapshot();
  });
});