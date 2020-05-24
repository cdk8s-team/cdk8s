// this is an executable program that downloads a file from a url (with
// redirects) and prints it's output to STDOUT. it is implemented as a program
// because node.js does not support issuing network requests synchronously and
// in the cdk we need everything to be synchronous (it all happens in the
// ctors). so we utilize `spawnSync` to spawn this program as a child process.
// alternatively we could have use `curl` but this is more portable.

import got from 'got';
import { parse } from 'url';
import * as fs from 'fs';

async function load(url: string) {
  const purl = parse(url);

  // read from filesystem if this is a file
  if (!purl.protocol || purl.protocol === 'file:') {
    if (!purl.pathname) {
      throw new Error(`unable to parse pathname from file url: ${url}`);
    }

    return fs.readFileSync(purl.pathname, 'utf-8');
  }

  const response = await got(url, {
    followRedirect: true,
    throwHttpErrors: true,
  });

  return response.body;
}

load(process.argv[2])
  .then(out => process.stdout.write(out))
  .catch((e: Error) => {
    console.error(e.stack);
    process.exit(1);
  });
