import { promises as fs } from 'fs';
import { withTempDir } from "../../lib/util";
import { Language, ImportBase } from "../../lib/import/base";

export function expectImportMatchSnapshot(name: string, fn: () => ImportBase) {
  jest.setTimeout(60_000);

  test(name, async () => {
    await withTempDir('import-k8s', async () => {
      const importer = fn();

      await importer.import({
        outdir: '.',
        outputJsii: '.jsii',
        targetLanguage: Language.PYTHON,
      });
    
      const manifest = JSON.parse(await fs.readFile('.jsii', 'utf-8'));
      expect(manifest).toMatchSnapshot();
    });
  });
}