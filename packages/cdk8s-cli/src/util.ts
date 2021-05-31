import { spawn, SpawnOptions } from 'child_process';
import * as http from 'http';
import * as https from 'https';
import * as os from 'os';
import * as path from 'path';
import { parse } from 'url';
import * as fs from 'fs-extra';
const HttpProxyAgent = require('http-proxy-agent');
const HttpsProxyAgent = require('https-proxy-agent');

export async function shell(program: string, args: string[] = [], options: SpawnOptions = { }): Promise<string> {
  const command = `"${program} ${args.join(' ')}" at ${path.resolve(options.cwd ?? '.')}`;
  return new Promise((ok, ko) => {
    const child = spawn(program, args, { stdio: ['inherit', 'pipe', 'inherit'], ...options });
    const data = new Array<Buffer>();
    child.stdout.on('data', chunk => data.push(chunk));

    child.once('error', err => ko(new Error(`command ${command} failed: ${err}`)));
    child.once('exit', code => {
      if (code === 0) {
        return ok(Buffer.concat(data).toString('utf-8'));
      } else {
        return ko(new Error(`command ${command} returned a non-zero exit code ${code}`));
      }
    });
  });
}

export async function mkdtemp(closure: (dir: string) => Promise<void>) {
  const workdir = await fs.mkdtemp(path.join(os.tmpdir(), 'cdk8s-'));
  try {
    await closure(workdir);
  } finally {
    await fs.remove(workdir);
  }
}

export async function synthApp(command: string, outdir: string) {
  await shell(command, [], {
    shell: true,
    env: {
      ...process.env,
      CDK8S_OUTDIR: outdir,
    },
  });

  if (!await fs.pathExists(outdir)) {
    console.error(`ERROR: synthesis failed, app expected to create "${outdir}"`);
    process.exit(1);
  }

  let found = false;
  for (const file of await fs.readdir(outdir)) {
    if (file.endsWith('.k8s.yaml')) {
      console.log(`${outdir}/${file}`);
      found = true;
    }
  }

  if (!found) {
    console.error('No manifests synthesized');
  }
}

export async function download(url: string): Promise<string> {
  let client: typeof http | typeof https;
  const purl = parse(url);

  if (!purl.protocol || purl.protocol === 'file:') {
    return fs.readFile(url, 'utf-8');
  }

  switch (purl.protocol) {
    case 'https:':
      client = https;
      break;

    case 'http:':
      client = http;
      break;

    default:
      throw new Error(`unsupported protocol ${purl.protocol}`);
  }

  const proxyUrl = purl.protocol == 'https:' ? process.env.https_proxy : process.env.http_proxy;
  let options: http.RequestOptions = purl;
  if (proxyUrl && purl.hostname && useProxy(purl.hostname)) {
    options.agent = purl.protocol == 'https:' ? new HttpsProxyAgent(proxyUrl) : new HttpProxyAgent(proxyUrl)
  }
  return new Promise((ok, ko) => {
    const req = client.get(options, res => {
      switch (res.statusCode) {
        case 200: {
          const data = new Array<Buffer>();
          res.on('data', chunk => data.push(chunk));
          res.once('end', () => ok(Buffer.concat(data).toString('utf-8')));
          res.once('error', ko);
          break;
        }

        case 301:
        case 302: {
          if (res.headers.location) {
            ok(download(res.headers.location));
          }
          break;
        }

        default: {
          throw new Error(`${res.statusMessage}: ${url}`);
        }
      }
    });

    req.once('error', ko);
    req.end();
  });
}

function useProxy(hostname: string): boolean {
  const hosts = (process.env.no_proxy || '').split(',')
  for (var i in hosts) {
    var host = hosts[i];
    if (host[0] == '.') {
      if (hostname.endsWith(host)) {
        return false
      }
    } else if (host == hostname) {
      return false
    }
  }
  return true
}
