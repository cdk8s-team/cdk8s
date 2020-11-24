import { ImportSpec } from '../config';
import { ImportOptions } from '../import/base';
import { ImportCustomResource, ModuleEmitOptions } from './cr';

export async function importDispatch(imports: ImportSpec[], argv: any, options: ImportOptions) {
  console.log(imports);
  for (const importSpec of imports) {
    const importer = await matchImporter(importSpec, argv);

    if (!importer) {
      throw new Error(`unable to determine import type for "${importSpec}"`);
    }

    await importer.import({
      moduleNamePrefix: importSpec.moduleNamePrefix,
      ...options,
    });
  }
}

async function matchImporter(importSpec: ImportSpec, argv: any) {
  const fixtures = await ImportCustomResource.match(importSpec, argv);
  if (fixtures) {
    return new ImportCustomResource(fixtures, { emitModulePer: ModuleEmitOptions.CRD });
  }

  return undefined;
}
