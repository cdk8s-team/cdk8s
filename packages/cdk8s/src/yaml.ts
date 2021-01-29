import { execFileSync } from 'child_process';
import * as fs from 'fs';
import * as os from 'os';
import * as path from 'path';
import * as YAML from 'yaml';

const MAX_DOWNLOAD_BUFFER = 10 * 1024 * 1024;

// Set default YAML schema to 1.1. This ensures saved YAML is backward compatible with other parsers, such as PyYAML
// It also ensures that octal numbers in the form `0775` will be parsed
// correctly on YAML load. (see https://github.com/eemeli/yaml/issues/205)
YAML.defaultOptions.schema = 'yaml-1.1';

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

    const objects = YAML.parseAllDocuments(body);
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
