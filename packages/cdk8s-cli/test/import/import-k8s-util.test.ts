import { parseApiTypeName, compareApiVersions } from '../../src/import/k8s-util';

const tests: Array<[ string, '>' | '<' | '=', string ]> = [
  ['v1', '<', 'v2'],
  ['v2', '>', 'v1'],
  ['v33', '=', 'v33'],

  ['v1', '>', 'v1beta1'],
  ['v1beta1', '>', 'v1alpha1'],
  ['v1alpha1', '<', 'v1beta1'],
  ['v1alpha1', '=', 'v1alpha1'],

  ['v1beta1', '<', 'v1beta2'],
  ['v1beta3', '>', 'v1beta2'],
  ['v1beta66', '=', 'v1beta66'],

  ['v2', '>', 'v1beta99'],
  ['v2beta99', '>', 'v1beta99'],

  ['v2alpha1', '<', 'v1'], // prefer stable versions
];

for (const [lhs, sign, rhs] of tests) {
  const expected = sign === '>' ? 1 : sign === '<' ? -1 : 0;

  test(`${lhs} ${sign} ${rhs}`, () => {
    const lhsVersion = parseApiTypeName(`io.k8s.api.extensions.${lhs}.Deployment`);
    const rhsVersion = parseApiTypeName(`io.k8s.api.extensions.${rhs}.Deployment`);
    const actual = compareApiVersions(lhsVersion, rhsVersion);
    expect(actual).toEqual(expected);
  });
}