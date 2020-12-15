import { ImportSpec } from '../config';
import { ImportOptions } from './base';
import { ImportCustomResourceDefinition } from './crd';
import { importCrdsDevRepoMatch } from './crds-dev';
import { ImportKubernetesApi } from './k8s';

export async function importDispatch(imports: ImportSpec[], argv: any, options: ImportOptions) {
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
  const k8s = await ImportKubernetesApi.match(importSpec, argv);
  if (k8s) {
    return new ImportKubernetesApi(k8s);
  }

  const crdsDev = await importCrdsDevRepoMatch(importSpec);
  if (crdsDev) {
    return new ImportCustomResourceDefinition(crdsDev);
  }

  const crd = await ImportCustomResourceDefinition.match(importSpec);
  if (crd) {
    return new ImportCustomResourceDefinition(crd);
  }

  return undefined;
}
