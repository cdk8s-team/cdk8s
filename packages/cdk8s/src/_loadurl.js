// this is an executable program that downloads a file from a url (with
// redirects) and prints it's output to STDOUT. it is implemented as a program
// because node.js does not support issuing network requests synchronously and
// in the cdk we need everything to be synchronous (it all happens in the
// ctors). so we utilize `spawnSync` to spawn this program as a child process.
// alternatively we could have use `curl` but this is more portable.

const { http, https } = require('follow-redirects');
const { parse } = require('url');
const fs = require('fs');

const url = process.argv[2];
if (!url) {
  console.error(`Usage: ${process.argv[1]} URL`);
  process.exit(1);
}

const purl = parse(url);

if (!purl.protocol) {
  if (!purl.pathname) {
    throw new Error(`unable to parse pathname from file url: ${url}`);
  }

  process.stdout.write(fs.readFileSync(purl.pathname, 'utf-8'));
  process.exit(0);
}

const client = getHttpClient();

const get = client.get(url, response => {
  if (response.statusCode !== 200) {
    throw new Error(`${response.statusCode} response from http get: ${response.statusMessage}`);
  }

  response.on('data', chunk => process.stdout.write(chunk));
});

get.once('error', err => {
  throw new Error(`http error: ${err.message}`);
});

function getHttpClient() {
  switch (purl.protocol) {
    case 'http:': return http;
    case 'https:': return https;
    default:
      throw new Error(`unsupported protocol "${purl.protocol}" in url: ${url}`);
  }
}
