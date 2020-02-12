import { generateAllApiObjects } from "../lib/import";
import { createWorkdir, jsiiCompile } from "./util";

jest.setTimeout(60_000);

test('generate and compile 1.14.0', async () => {
  const workdir = await createWorkdir();
  await generateAllApiObjects(workdir, { apiVersion: '1.14.0' });
  await jsiiCompile(workdir);
});