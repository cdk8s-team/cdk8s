// this is an executable program that downloads a file from a url (with
// redirects) and prints it's output to STDOUT. it is implemented as a program
// because node.js does not support issuing network requests synchronously and
// in the cdk we need everything to be synchronous (it all happens in the
// ctors). so we utilize `spawnSync` to spawn this program as a child process.
// alternatively we could have use `curl` but this is more portable.

const { http, https } = require('follow-redirects');
const { parse } = require('url');
const fs = require('fs');
const HttpProxyAgent = require('http-proxy-agent');
const HttpsProxyAgent = require('https-proxy-agent');

const url = process.argv[2];
if (!url) {
  console.error(`Usage: ${process.argv[1]} URL`);
  process.exit(1);
}

try {
  if (fs.lstatSync(url).isFile()) {
    fs.createReadStream(url).pipe(process.stdout);
  }
} catch (err) {
  const purl = parse(url);

  if (!purl.protocol) {
    throw new Error(`unable to determine protocol from url: ${url}`);
  }
  
  const client = getHttpClient(purl.protocol);
  const proxyUrl = purl.protocol == 'https:' ? process.env.https_proxy : process.env.http_proxy
  if (proxyUrl && useProxy(purl)) {
    purl.agent = purl.protocol == 'https:' ? new HttpsProxyAgent(proxyUrl) : new HttpProxyAgent(proxyUrl)
  }

  const get = client.get(purl, response => {
    if (response.statusCode !== 200) {
      throw new Error(`${response.statusCode} response from http get: ${response.statusMessage}`);
    }
  
    response.on('data', chunk => process.stdout.write(chunk));
  });
  
  get.once('error', err => {
    throw new Error(`http error: ${err.message}`);
  });
}

function getHttpClient(protocol) {
  switch (protocol) {
    case 'http:': return http;
    case 'https:': return https;
    default:
      throw new Error(`unsupported protocol "${protocol}" in url: ${url}`);
  }
}

function useProxy(purl) {
  // Use a proxy if `no_proxy` does not match
  const hosts = (process.env.no_proxy || '').split(',')
  for (i in hosts) {
    host = hosts[i]
    if (host[0] == '.') {
      if (purl.hostname.endsWith(host)) {
        return false
      }
    } else if (host == purl.hostname) {
      return false
    }
  }
  return true
}
