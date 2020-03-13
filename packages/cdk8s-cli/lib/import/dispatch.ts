import { ImportOptions } from "./base";
import { ImportKubernetesApi } from "./k8s";
import { ImportCustomResourceDefinition } from './crd';

export async function importDispatch(imports: string | string[], argv: any, options: ImportOptions) {
  const sources = Array.isArray(imports) ? imports : [ imports ];

  for (const source of sources) {
    const importer = await matchImporter(source, argv);

    if (!importer) {
      throw new Error(`unable to determine import type for "${source}"`);
    }

    await importer.import(options);
  }
}

async function matchImporter(source: string, argv: any) {
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
