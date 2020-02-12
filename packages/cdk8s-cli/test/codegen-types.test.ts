import { TypeGenerator } from "../lib/codegen-types";
import { promises as fs } from 'fs';
import * as path from 'path';
import { CodeMaker } from "codemaker";
import { jsiiCompile, createWorkdir } from "./util";
import { JSONSchema4 } from "json-schema";

describe('unions', () => {

  which('include primitives', {
    oneOf: [
      { type: "string" },
      { type: "number" }
    ]
  });

});


describe('documentation', () => {

  which('does not render if not defined', {
    type: 'boolean'
  });

  which('renders based on description', {
    description: 'hello, description',
    type: 'string'
  });
  
  which('"*/" is is escaped', {
    description: 'hello */world',
    type: 'string'
  });
  
})

function which(name: string, schema: JSONSchema4) {
  test(name, async () => {
    const gen = new TypeGenerator();
    gen.addType('TestType', schema);
    expect(await generate(gen)).toMatchSnapshot();
  });
}

async function generate(gen: TypeGenerator) {
  const code = new CodeMaker();

  const workdir = await createWorkdir();
  const entrypoint = 'index.ts';

  code.openFile(entrypoint);
  gen.generate(code);
  code.closeFile(entrypoint)
  await code.save(workdir);

  const source = await fs.readFile(path.join(workdir, entrypoint), 'utf-8');

  try {
    await jsiiCompile(workdir);
  } catch (e) {
    console.error(source);
    throw e;
  }

  return source;
}
