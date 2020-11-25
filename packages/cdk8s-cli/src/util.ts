import { spawn, SpawnOptions } from 'child_process';
import * as http from 'http';
import * as https from 'https';
import * as os from 'os';
import * as path from 'path';
import { parse } from 'url';
import * as fs from 'fs-extra';

export function whichShim(): string {
  return (os.platform.toString() === 'win32') ? 'where' : 'which';
}

export async function shell(program: string, args: string[] = [], options: SpawnOptions = { }) {
  const command = `"${program} ${args.join(' ')}" at ${path.resolve(options.cwd ?? '.')}`;
  return new Promise((ok, ko) => {
    const child = spawn(program, args, { stdio: 'inherit', ...options });
    child.once('error', err => {
      throw new Error(`command ${command} failed: ${err}`);
    });
    child.once('exit', code => {
      if (code === 0) {
        return ok();
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
  const proto = parse(url).protocol;

  if (!proto || proto === 'file:') {
    return fs.readFile(url, 'utf-8');
  }

  switch (proto) {
    case 'https:':
      client = https;
      break;

    case 'http:':
      client = http;
      break;

    default:
      throw new Error(`unsupported protocol ${proto}`);
  }

  return new Promise((ok, ko) => {
    const req = client.get(url, res => {
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
