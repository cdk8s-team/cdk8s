import { spawn, SpawnOptions } from 'child_process';
import { promises as fs } from 'fs';
import { exists as _exists } from 'fs';
import * as path from 'path';

export async function shell(program: string, args: string[] = [], options: SpawnOptions = { }) {
  return new Promise((ok, ko) => {
    const child = spawn(program, args, { stdio: 'inherit', ...options });
    child.once('error', ko);
    child.once('exit', code => {
      if (code === 0) { return ok(); }
      else return ko(new Error(`non-zero exit code ${code}`));
    });
  });
}

export async function rmfr(filePath: string) {
  if (!await exists(filePath)) {
    return;
  }

  // if this is a directory, empty it first
  if ((await fs.stat(filePath)).isDirectory()) {
    const files = await fs.readdir(filePath);
    for (const file of files) {
      await rmfr(path.join(filePath, file));
    }
    fs.rmdir(filePath);
  } else {
    await fs.unlink(filePath);
  }
}

export async function exists(filePath: string): Promise<boolean> {
  return new Promise(ok => _exists(filePath, ok));
}