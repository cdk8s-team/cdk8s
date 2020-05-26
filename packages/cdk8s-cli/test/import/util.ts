import { promises as fs } from 'fs';
import { mkdtemp } from "../../lib/util";
import { ImportBase, Language } from "../../lib/import/base";
import * as path from 'path';

export function expectImportMatchSnapshot(name: string, fn: () => ImportBase) {
  jest.setTimeout(60_000);

  test(name, async () => {
    await mkdtemp(async workdir => {
      const importer = fn();
      const jsiiPath = path.join(workdir, '.jsii');

      await importer.import({
        outdir: workdir,
        outputJsii: jsiiPath,
        targetLanguage: Language.TYPESCRIPT
      });
    
      const manifest = JSON.parse(await fs.readFile(jsiiPath, 'utf-8'));

      // patch cdk8s version in manifest because it's not stable
      manifest.dependencies.cdk8s = '999.999.999';
      manifest.fingerprint = '<fingerprint>';

      expect(manifest).toMatchSnapshot();
    });
  });
}