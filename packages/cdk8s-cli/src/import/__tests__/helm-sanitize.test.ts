import * as helm from '../helm';

describe('Helm import', () => {
  describe('property name sanitization', () => {
    test('sanitizes property names containing dots and slashes to valid TypeScript identifiers', async () => {
      const schema = {
        type: 'object',
        properties: {
          'k8s.grafana.com/logs.job': {
            type: 'string',
          },
          'another/invalid.name': {
            type: 'boolean',
          },
          validName: {
            type: 'number',
          },
        },
      };

      const result = await helm.importChart({
        name: 'test-chart',
        version: '1.0.0',
        schema,
      });

      expect(result).not.toContain('k8s.grafana.com');
      expect(result).not.toContain('/logs');
      expect(result).not.toContain('another/invalid');
      expect(result).toContain('validName');
    });
  });
});
