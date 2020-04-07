import { ImportOptions } from "./base";
import { ImportKubernetesApi } from "./k8s";
import { ImportCustomResourceDefinition } from './crd';
import { ImportSpec } from '../config';

export async function importDispatch(imports: ImportSpec[], argv: any, options: ImportOptions) {
  for (const source of imports) {
    const importer = await matchImporter(source, argv);

    if (!importer) {
      throw new Error(`unable to determine import type for "${source}"`);
    }

    await importer.import({
      ...options,
      moduleNamePrefix: source.moduleNamePrefix
    });
  }
}

async function matchImporter(source: ImportSpec, argv: any) {
  const k8s = await ImportKubernetesApi.match(source, argv);
  if (k8s) {
    return new ImportKubernetesApi(k8s);
  }

  const crd = await ImportCustomResourceDefinition.match(source);
  if (crd) {
    return new ImportCustomResourceDefinition(crd);
  }

  return undefined;
}
