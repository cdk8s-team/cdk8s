import { execFileSync } from 'child_process';
import * as fs from 'fs';
import * as os from 'os';
import * as path from 'path';
import * as YAML from 'yaml';
import { Type } from 'yaml/util';

const MAX_DOWNLOAD_BUFFER = 10 * 1024 * 1024;

// Ensure that all strings are quoted when written to yaml to avoid unquoted
// primitive types in the output yaml in fields that require strings.
YAML.scalarOptions.str.defaultType = Type.QUOTE_DOUBLE;
// YAML.scalarOptions.str.fold = { lineWidth: 0, minContentWidth: 0 };

/**
 * YAML utilities.
 */
export class Yaml {
  /**
   * Saves a set of objects as a multi-document YAML file.
   * @param filePath The output path
   * @param docs The set of objects
   */
  public static save(filePath: string, docs: any[]) {
    // convert each resource to yaml and separate with a '---' line
    // NOTE: we convert undefined values to null, but ignore any documents that
    //  are undefined
    const data = docs.map(
      r => r === undefined ? '\n' : YAML.stringify(r, { keepUndefined: true }),
    ).join('---\n');
    fs.writeFileSync(filePath, data, { encoding: 'utf-8' });
  }

  /**
   * Saves a set of YAML documents into a temp file (in /tmp)
   *
   * @returns the path to the temporary file
   * @param docs the set of documents to save
   */
  public static tmp(docs: any[]): string {
    const tmpdir = fs.mkdtempSync(path.join(os.tmpdir(), 'cdk8s-'));
    const filePath = path.join(tmpdir, 'temp.yaml');
    Yaml.save(filePath, docs);
    return filePath;
  }

  /**
   * Downloads a set of YAML documents (k8s manifest for example) from a URL or
   * a file and returns them as javascript objects.
   *
   * Empty documents are filtered out.
   *
   * @param urlOrFile a URL of a file path to load from
   * @returns an array of objects, each represents a document inside the YAML
   */
  public static load(urlOrFile: string): any[] {
    const body = loadurl(urlOrFile);

    // we need to use yaml-1.1 so that octal numbers in the form `0775` will be parsed
    // correctly (see https://github.com/eemeli/yaml/issues/205)
    const objects = YAML.parseAllDocuments(body, { schema: 'yaml-1.1' });
    const result = new Array<any>();

    for (const obj of objects.map(x => x.toJSON())) {
      // skip empty documents
      if (obj === undefined) { continue; }
      if (obj === null) { continue; }
      if (Array.isArray(obj) && obj.length === 0) { continue; }
      if (typeof(obj) === 'object' && Object.keys(obj).length === 0) { continue; }

      result.push(obj);
    }

    return result;
  }

  /**
   * Utility class.
   */
  private constructor() {
    return;
  }
}

/**
 * Loads a url (or file) and returns the contents.
 * This method spawns a child process in order to perform an http call synchronously.
 */
function loadurl(url: string): string {
  const script = path.join(__dirname, '_loadurl.js');
  return execFileSync(process.execPath, [script, url], {
    encoding: 'utf-8',
    maxBuffer: MAX_DOWNLOAD_BUFFER,
  }).toString();
}
