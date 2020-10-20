import { Metadata } from '../src';
import { Construct, Node } from 'constructs';

// test('Can add a label', () => {

//   const meta = new ApiObjectMetadataDefinition();

//   meta.addLabel('key', 'value');

//   const actual: any = meta.toJson();

//   expect(actual.labels).toEqual({
//     key: 'value',
//   })

// });

// test('Can add an annotation', () => {

//   const meta = new ApiObjectMetadataDefinition();

//   meta.addAnnotation('key', 'value');

//   const actual = meta.toJson();

//   expect(actual.annotations).toEqual({
//     key: 'value',
//   })

// });

// test('Instantiation properties are all respected', () => {

//   const meta = new ApiObjectMetadataDefinition({
//     labels: {key: 'value'},
//     annotations: {key: 'value'},
//     name: 'name',
//     namespace: 'namespace',
//   });

//   const actual = meta.toJson();

//   const expected = {
//     name: 'name',
//     namespace: 'namespace',
//     annotations: {
//       key: 'value',
//     },
//     labels: {
//       key: 'value',
//     },
//   }

//   expect(actual).toStrictEqual(expected);

// });

// test('Can include arbirary key/value options', () => {
//   const meta = new ApiObjectMetadataDefinition({
//     foo: 123,
//     bar: {
//       helloL: 'world',
//     },
//   });

//   meta.add('bar', 'baz');

//   expect(meta.toJson()).toStrictEqual({
//     bar: 'baz',
//     foo: 123,
//   });
// });



test('no metadata is associated when initialized', () => {
  // GIVEN
  const construct = new Root();

  // THEN
  expect(Metadata.resolve(construct)).toStrictEqual(undefined);
});

describe('Metadata.of(scope)', () => {

  test('adds a metadata construct to the scope', () => {
    // GIVEN
    const c = new Root();
    expect(Node.of(c).children.length).toEqual(0); // start with no children

    // WHEN
    Metadata.of(c);

    // THEN
    expect(Node.of(c).children.length).toEqual(1);
    expect(Node.of(Node.of(c).children[0]).path).toEqual('$cdk8s.Metadata');
  });

  test('returns the same metadata object for the same scope', () => {
    // GIVEN
    const c1 = new Root();
    const c2 = new Root();

    // WHEN
    const md1 = Metadata.of(c1);
    const md2 = Metadata.of(c1);
    const md3 = Metadata.of(c2);

    // THEN
    expect(md1).toEqual(md2);
    expect(md1 == md3).toBeFalsy();
  });
});


describe('namespaces', () => {

  test('undefined by default', () => {
    // GIVEN
    const root = new Root();

    // THEN
    expect(Metadata.resolve(root)).toStrictEqual(undefined);
  });

  test('set/get for a single construct', () => {
    // GIVEN
    const construct = new Root();
    const metadata = Metadata.of(construct);

    // WHEN
    metadata.addNamespace('my-namespace');

    // THEN
    expect(Metadata.resolve(construct)).toStrictEqual({
      namespace: 'my-namespace',
    });
  });

  test('Metadata is not added when only reading', () => {
    // GIVEN
    const parent = new Root();
    const child = new Construct(parent, 'child');

    // THEN
    expect(Metadata.resolve(child)).toStrictEqual(undefined);
    expect(Node.of(child).children.length).toEqual(0);

    expect(Metadata.resolve(parent)).toStrictEqual(undefined);
    expect(Node.of(parent).children.length).toEqual(1); // "child"
  });

  test('delegates to parent scope', () => {
    // GIVEN
    const parent = new Root();
    const child = new Construct(parent, 'child');

    // WHEN
    Metadata.of(parent).addNamespace('parent_namespace');

    // THEN
    expect(Metadata.resolve(parent)).toStrictEqual({ namespace: 'parent_namespace' });
    expect(Metadata.resolve(child)).toStrictEqual({ namespace: 'parent_namespace' });
  });

  test('last parent prevails', () => {
    // GIVEN
    const { root, all, childgroup, group, child1, child2, child3, child4 } = createTree();
    const exp = (c: Construct, expected: string) => expect(Metadata.resolve(c)).toStrictEqual({ namespace: expected });

    // set ns only at the root, expect everyone to have that namespace
    // WHEN
    Metadata.of(root).addNamespace('root-ns');
    // THEN
    all.forEach(c => exp(c, 'root-ns'));

    // set ns at the childgroup level, expect all children to have it
    // WHEN
    Metadata.of(childgroup).addNamespace('childgroup-ns');
    // THEN
    [ root, group, child1, child2 ].forEach(c => exp(c, 'root-ns'));
    [ childgroup, child3, child4  ].forEach(c => exp(c, 'childgroup-ns'));

    // set ns for child2 directly
    // WHEN
    Metadata.of(child2).addNamespace('child2-ns');
    // THEN
    exp(child2, 'child2-ns');
    [ root, group, child1 ].forEach(c => exp(c, 'root-ns'));
    [ childgroup, child3, child4  ].forEach(c => exp(c, 'childgroup-ns'));
  });

  test('an empty string or null is equivalent to undefined', () => {
    // GIVEN
    const root = new Root();
    const md = Metadata.of(root);
    md.addNamespace('foo');
    expect(Metadata.resolve(root)).toStrictEqual({ namespace: 'foo' });

    // WHEN
    md.addNamespace('');

    // THEN
    expect(Metadata.resolve(root)).toStrictEqual(undefined);

    // WHEN
    md.addNamespace('foo');
    expect(Metadata.resolve(root)).toStrictEqual({ namespace: 'foo' });

    md.addNamespace(undefined);
    expect(Metadata.resolve(root)).toStrictEqual(undefined);
  });

  test('"undefined" removes the namespace from the scope', () => {
    // GIVEN
    const root = new Root();
    const parent = new Construct(root, 'parent');
    const child = new Construct(parent, 'child');
    Metadata.of(root).addNamespace('root');
    expect(Metadata.resolve(root)).toStrictEqual({ namespace: 'root' });
    expect(Metadata.resolve(parent)).toStrictEqual({ namespace: 'root' });
    expect(Metadata.resolve(child)).toStrictEqual({ namespace: 'root' });

    // WHEN
    Metadata.of(parent).addNamespace(undefined);

    // THEN
    expect(Metadata.resolve(root)).toStrictEqual({ namespace: 'root' });
    expect(Metadata.resolve(parent)).toStrictEqual(undefined);
    expect(Metadata.resolve(child)).toStrictEqual(undefined);
  });

  test('clearNamespace() removes the namespace from the scope', () => {
    // GIVEN
    const root = new Root();
    const parent = new Construct(root, 'parent');
    const child = new Construct(parent, 'child');
    Metadata.of(root).addNamespace('root');
    expect(Metadata.resolve(root)).toStrictEqual({ namespace: 'root' });
    expect(Metadata.resolve(parent)).toStrictEqual({ namespace: 'root' });
    expect(Metadata.resolve(child)).toStrictEqual({ namespace: 'root' });

    // WHEN
    Metadata.of(parent).clearNamespace();

    // THEN
    expect(Metadata.resolve(root)).toStrictEqual({ namespace: 'root' });
    expect(Metadata.resolve(parent)).toStrictEqual(undefined);
    expect(Metadata.resolve(child)).toStrictEqual(undefined);
  });

});


describe('labels', () => {

  test('defaults to no labels (empty hash)', () => {
    // GIVEN
    const { all } = createTree();

    // THEN
    all.forEach(v => expect(Metadata.resolve(v)).toStrictEqual(undefined));
  });

  test('simple case', () => {
    // GIVEN
    const construct = new Construct(undefined as any, 'root');
    const metadata = Metadata.of(construct);

    // WHEN
    metadata.addLabel('label1', 'value1');
    metadata.addLabel('label2', 'value2');

    // THEN
    expect(Metadata.resolve(construct)).toStrictEqual({
      labels: {
        label1: 'value1',
        label2: 'value2',  
      },
    });
  });

  test('merged together when added', () => {
    // GIVEN
    const construct = new Construct(undefined as any, 'root');
    const metadata = Metadata.of(construct);
    metadata.addLabel('label1', 'value1');
    metadata.addLabel('label2', 'value2');

    // WHEN
    metadata.addLabel('label3', 'value3');

    // THEN
    expect(Metadata.resolve(construct)).toStrictEqual({
      labels: {
        label1: 'value1',
        label2: 'value2',
        label3: 'value3',
      },
    });
  });

  test('are sorted', () => {
    // GIVEN
    const construct = new Construct(undefined as any, 'root');
    const metadata = Metadata.of(construct);
    metadata.addLabel('aaaa', 'value1');
    metadata.addLabel('zzzz', 'value2');

    // WHEN
    metadata.addLabel('bbbb', 'value3');

    // THEN
    expect(Metadata.resolve(construct)).toStrictEqual({
      labels: {
        aaaa: 'value1',
        bbbb: 'value3',
        zzzz: 'value2',  
      },
    });

  });

  test('are merged from top to bottom', () => {
    // GIVEN
    const tree = createTree();

    // WHEN
    Metadata.of(tree.root).addLabel('root', 'i-am-root');

    // THEN: "root" labels are applied to all nodes
    tree.all.forEach(c => expect(Metadata.resolve(c)).toStrictEqual({
      labels: {
        root: 'i-am-root',
      },
    }));

    // WHEN
    Metadata.of(tree.childgroup).addLabel('root', 'childgroup');
    Metadata.of(tree.childgroup).addLabel('childgroup', 'yes');
    Metadata.of(tree.child3).addLabel('foo', 'bar');

    // THEN: "childgroup" overrides root labels
    expect(Metadata.resolve(tree.root)).toStrictEqual({ labels: { root: 'i-am-root' } });
    expect(Metadata.resolve(tree.group)).toStrictEqual({ labels: { root: 'i-am-root' } });
    expect(Metadata.resolve(tree.child1)).toStrictEqual({ labels: { root: 'i-am-root' } });
    expect(Metadata.resolve(tree.child2)).toStrictEqual({ labels: { root: 'i-am-root' } });
    expect(Metadata.resolve(tree.childgroup)).toStrictEqual({ labels: { root: 'childgroup', childgroup: 'yes' } });
    expect(Metadata.resolve(tree.child3)).toStrictEqual({ labels: { root: 'childgroup', childgroup: 'yes', foo: 'bar' } });
    expect(Metadata.resolve(tree.child4)).toStrictEqual({ labels: { root: 'childgroup', childgroup: 'yes' } });
  });

  test('labels can be removed by specifying "undefined" as a value', () => {
    // GIVEN
    const root = new Root();
    const parent = new Construct(root, 'parent');
    const child = new Construct(parent, 'child');
    Metadata.of(root).addLabel('my_label', 'root');
    expect(Metadata.resolve(root)).toStrictEqual({ labels: { my_label: 'root' } });
    expect(Metadata.resolve(parent)).toStrictEqual({ labels: { my_label: 'root' } });
    expect(Metadata.resolve(child)).toStrictEqual({ labels: { my_label: 'root' } });

    // WHEN
    Metadata.of(parent).addLabel('my_label', undefined);

    // THEN
    expect(Metadata.resolve(root)).toStrictEqual({ labels: { my_label: 'root' } });
    expect(Metadata.resolve(parent)).toStrictEqual(undefined);
    expect(Metadata.resolve(child)).toStrictEqual(undefined);
  });

  test('labels can be removed using removeLabel()', () => {
    // GIVEN
    const root = new Root();
    const parent = new Construct(root, 'parent');
    const child = new Construct(parent, 'child');
    Metadata.of(root).addLabel('foo', '123');
    Metadata.of(parent).addLabel('foo', '123');
    Metadata.of(parent).addLabel('bar', '8989');
    expect(Metadata.resolve(root)).toStrictEqual({ labels: { foo: '123' } });
    expect(Metadata.resolve(parent)).toStrictEqual({ labels: { foo: '123', bar: '8989' } });
    expect(Metadata.resolve(child)).toStrictEqual({ labels: { foo: '123', bar: '8989' } });

    // WHEN
    Metadata.of(parent).removeLabel('foo');
    expect(Metadata.resolve(root)).toStrictEqual({ labels: { foo: '123' } });
    expect(Metadata.resolve(parent)).toStrictEqual({ labels: { bar: '8989' } });
    expect(Metadata.resolve(child)).toStrictEqual({ labels: { bar: '8989' } });
  });
});

test('annotations', () => {
  // GIVEN
  const tree = createTree();

  // WHEN
  Metadata.of(tree.childgroup).addAnnotation('my.annotation', '1010');
  Metadata.of(tree.child3).removeAnnotation('my.annotation');
  Metadata.of(tree.child4).addAnnotations({
    more: '1111',
    annnnnnn: 'hellllo',
  });

  // THEN
  expect(Metadata.resolve(tree.child3)).toEqual(undefined);
  expect(Metadata.resolve(tree.child4)).toEqual({ 
    annotations: { 
      'annnnnnn': 'hellllo',
      'more': '1111',
      'my.annotation': '1010',
    },
  });
});

/**
 * root
 * +--- group
 *     +--- child1
 *     +--- child2
 *     +--- childgroup
 *         +--- child3
 *         +--- child4
 *
 */
function createTree() {
  const root = new Root();
  const group = new Construct(root, 'group');
  const child1 = new Construct(group, 'child1');
  const child2 = new Construct(group, 'child2');
  const childgroup = new Construct(group, 'childgroup');
  const child3 = new Construct(childgroup, 'child3');
  const child4 = new Construct(childgroup, 'child4');

  const all = [ root, group, child1, child2, childgroup, child3, child4 ];

  return {
    root, group, child1, child2, childgroup, child3, child4, all,
  };
}

class Root extends Construct {
  constructor() {
    super(undefined as any, 'root');
  }
}
