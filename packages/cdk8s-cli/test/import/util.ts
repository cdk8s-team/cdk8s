import { promises as fs } from 'fs';
import * as path from 'path';
import { ImportBase, ImportOptions, Language } from '../../src/import/base';
import { mkdtemp } from '../../src/util';

jest.setTimeout(3 * 60_000);

export function testImportMatchSnapshot(name: string, fn: () => ImportBase, options?: Partial<ImportOptions>) {

  test(name, async () => {
    await expectImportMatchSnapshot(fn, options);
  });
}

export async function expectImportMatchSnapshot(fn: () => ImportBase, options?: Partial<ImportOptions>) {
  await mkdtemp(async workdir => {
    const importer = fn();
    const jsiiPath = path.join(workdir, '.jsii');

    await importer.import({
      outdir: workdir,
      outputJsii: jsiiPath,
      targetLanguage: Language.TYPESCRIPT,
      ...options,
    });

    const manifest = JSON.parse((await fs.readFile(jsiiPath)).toString('utf-8'));

    // patch cdk8s version in manifest because it's not stable
    manifest.dependencies.cdk8s = '999.999.999';
    manifest.fingerprint = '<fingerprint>';

    expect(manifest).toMatchSnapshot();
  });
}
