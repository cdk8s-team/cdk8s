import { TypeGenerator } from "../lib/codegen-types";
import { promises as fs } from 'fs';
import * as path from 'path';
import { CodeMaker } from "codemaker";
import { JSONSchema4 } from "json-schema";
import { jsiiCompile } from "../lib/jsii";
import { withTempDir } from "../lib/util";

jest.setTimeout(60_000); // 1min

describe('unions', () => {

  which('include primitives', {
    oneOf: [
      { type: "string" },
      { type: "number" }
    ]
  });

});


describe('structs', () => {

  which('has primitive types and collections of primitive types', {
    type: 'object',
    properties: {
      stringValue: { type: 'string' },
      boolValue: { type: 'boolean' },
      numberValue: { type: 'number' },
      integerValue: {type: 'integer' },
      arrayOfString: {
        type: 'array',
        items: { type: 'string' }
      }
    }
  });

  which('has a field that references another struct (with required fields)', {
    type: 'object',
    properties: {
      other: {
        $ref: "#/definitions/Other",
      }
    }
  }, {
    definitions: {
      Other: {
        type: 'object',
        properties: {
          stringValue: { type: 'string' }
        },
        required: [ 'stringValue' ]
      }
    }
  });

  which('references itself', {
    type: 'object',
    properties: {
      entrypoint: {
        $ref: '#/definitions/MyType'
      }
    }
  }, {
    definitions: {
      MyType: {
        type: 'object',
        properties: {
          self: { $ref: '#/definitions/MyType' }
        }
      }
    }
  });

  which('array of structs is considered optional', {
    type: 'object',
    properties: {
      shouldBeRequired: { $ref: '#/definitions/ItemType' },
      mapShouldBeOptional: {
        type: 'object',
        additionalProperties: { $ref: '#/definitions/ItemType' }
      },
      arrayShouldBeOptional: {
        type: 'array',
        items: {
          $ref: '#/definitions/ItemType'
        }
      }
    }
  }, {
    definitions: {
      ItemType: {
        type: 'object',
        required: [ 'requiredField' ],
        properties: {
          requiredField: { type: 'string' }
        },
      }
    }
  });

  which('includes required fields', {
    required: [
      "minReadySeconds",
      "revisionHistoryLimit"
    ],
    type: "object",
    properties: {
      minReadySeconds: {
        description: "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)",
        format: "int32",
        type: "integer"
      },
      paused: {
        description: "Indicates that the deployment is paused.",
        type: "boolean"
      },
      progressDeadlineSeconds: {
        description: "The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.",
        format: "int32",
        type: "integer"
      },
      replicas: {
        description: "Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.",
        format: "int32",
        type: "integer"
      },
      revisionHistoryLimit: {
        description: "The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.",
        format: "int32",
        type: "integer"
      },
    },
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

});

function which(name: string, schema: JSONSchema4, definitions?: JSONSchema4) {
  test(name, async () => {
    const gen = new TypeGenerator(definitions);
    gen.addDataType('TestType', schema, 'fqn.of.TestType');

    await withTempDir('test', async () => {
      expect(await generate(gen)).toMatchSnapshot();
    });
  });
}

async function generate(gen: TypeGenerator) {
  const code = new CodeMaker();

  const entrypoint = 'index.ts';

  code.openFile(entrypoint);
  gen.generate(code);
  code.closeFile(entrypoint)
  await code.save('.');

  const source = await fs.readFile(path.join('.', entrypoint), 'utf-8');

  try {
    await jsiiCompile('.', true);
  } catch (e) {
    console.error(source);
    throw e;
  }

  return source;
}
