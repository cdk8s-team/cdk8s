import { normalizeTypeName } from "../../lib/import/type-generator";

describe('normalizeTypeName', () => {
  test('no normalization needed', () => {
    expect(normalizeTypeName('Foo')).toEqual('Foo');
    expect(normalizeTypeName('FooBar')).toEqual('FooBar');
    expect(normalizeTypeName('Implement')).toEqual('Implement');
  });

  test('TLAs are converted to PascalCase', () => {
    expect(normalizeTypeName('ICQResource')).toEqual('IcqResource');
    expect(normalizeTypeName('IXXXFoo')).toEqual('IxxxFoo');
    expect(normalizeTypeName('IXXFoo')).toEqual('IxxFoo');
    expect(normalizeTypeName('STARTFooBARZingSOCalEND')).toEqual('StartFooBarZingSoCalEnd');
    expect(normalizeTypeName('VPC')).toEqual('Vpc');
    expect(normalizeTypeName('StorageIO')).toEqual('StorageIo');
    expect(normalizeTypeName('AFoo')).toEqual('AFoo');
  });
});