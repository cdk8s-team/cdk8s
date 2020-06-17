import * as fs from 'fs';
import * as YAML from 'yaml';
import { execFileSync } from 'child_process';
import * as os from 'os';
import * as path from 'path';

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
    const data = docs.map(r => YAML.stringify(r)).join('---\n');
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
  const loadurl = path.join(__dirname, '_loadurl.js');
  return execFileSync(process.execPath, [ loadurl, url ], { encoding: 'utf-8' }).toString()
}

