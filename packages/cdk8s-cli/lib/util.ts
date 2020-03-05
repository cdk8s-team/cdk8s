import { spawn, SpawnOptions } from 'child_process';
import { existsSync, readdirSync, rmdirSync, statSync, unlinkSync } from 'fs';
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

export function rmfr(filePath: string) {
  if (!existsSync(filePath)) {
    return;
  }

  // if this is a directory, empty it first
  if ((statSync(filePath)).isDirectory()) {
    const files = readdirSync(filePath);
    for (const file of files) {
      rmfr(path.join(filePath, file));
    }
    rmdirSync(filePath);
  } else {
    unlinkSync(filePath);
  }
}
