# Structured data

## Motivation

Some API objects exhibit structure, for example ConfigMap and Secret. Access to these
structured properties can be made compile-time safe in Typescript.

Also make secret and configMaps easily interchangble when used as a source for env vars and volumes.

## API Suggestion

Example usage

```typescript
const secret = structuredSecret(this, "secret", {
  metadata: {
    name: "mysecret",
  },
  data: {
    // the object literal here defines the structure to the compuler
    AWS_ACCESS_KEY_ID: getKey(),
    AWS_SECRET_ACCESS_KEY: getSecret(),
    // ...
  },
});

// later in podSpec.env for example
let env = {
  name: "AWS_ACCESS_KEY_ID",
  valueFrom: {
    secretKeyRef: {
      name: secret.name,
      key: secret.struct.AWS_ACCESS_KEY_ID, // here you get error if a non existant key is used
    },
  },
};
```

Example API:

```typescript
type Structured<T, K extends keyof T> = {
  struct: { [P in K]: string };
  toEnv: (name: string, key: K) => EnvVar;
  toVolume: (
    name: string,
    items?: {
      key: K;
      mode?: number;
      path: string;
    }[]
  ) => Volume;
};

// basically repeat the ConfigMap shape and merge it with Structured<>,
function structuredConfigMap<T, K extends keyof T>(
  scope: Construct,
  id: string,
  props: {
    metadata: ObjectMeta;
    data: T;
  }
): KubeConfigMap & Structured<T, K> {
  // ...
}

// basically repeat the Secret shape and merge it with Structured<>,
// also perform bas64 encoding
function structuredSecret<T, K extends keyof T>(
  scope: Construct,
  id: string,
  props: {
    metadata: ObjectMeta;
    data: T;
    type?: string;
  }
): KubeSecret & Structured<T, K> {
  // ...
}
```

## As factory for EnvVar and Volume

### EnvVar
Now that the returned Secret/ConfigMap is also `Structured<T>` it can "convert" itself to the verbose volume/envVar objects, reducing boilerplate and improving type safety. Consider gradual improvemnt bellow:

- worst, close to bare manifest

```typescript
let env: EnvVar = {
  name: "MY_VAR",
  valueFrom: {
    secretKeyRef: {
      name: "secret",
      key: "AWS_ACCESS_KEY_ID",
    },
  },
};
```

- Better, lets you rename the secret. You don't need structuredSecret for this

```typescript
let env: EnvVar = {
  name: "MY_VAR",
  valueFrom: {
    secretKeyRef: {
      name: secret.name,
      key: "AWS_ACCESS_KEY_ID",
    },
  },
};
```

- Even better, `Structured` lets you rename the secret as well as the keys in `data` while detecting errors during build

```typescript
let env: EnvVar = {
  name: "MY_VAR",
  valueFrom: {
    secretKeyRef: {
      name: secret.name,
      key: secret.struct.AWS_ACCESS_KEY_DI, // compile error since _ID is mistyped
    },
  },
};
```

- Best, same guarantees as above but is more concise

```typescript
let env = secret.toEnv("MY_VAR", "AWS_ACCESS_KEY_ID"); // you still get suggestions from the IDE for the second arg
```

### Volume

- Better, uses the secret name:

```typescript
const vol: Volume = {
  name: "my-volume",
  secret: {
    secretName: secret.name,
    items: [
      {
        path: "config.json",
        key: "config.json",
      },
    ],
  },
};
```

Best, catches missing key from at compile time:

```typescript
const vol: Volume = secret.toVolume("my-volume", [
  {
    path: "config.json",
    key: "config.cfg", // would get an error as only config.json exists in the secret
  },
]);
```

Finally, you get a trivial interchangability between secrets and configMaps if using the `toEnv` and `toVolume` methods.

## Implementation notes

Implementation is trivial. For the `struct` property this simple Proxy is enough:

```typescript
const proxy = new Proxy(
  {},
  {
    get(_target, prop) {
      return prop;
    },
  }
);
```
