describe('generateName', () => {
  it('should include generateName in synthesized manifest when provided', () => {
    const app = new Testing.App();
    const chart = new Testing.Chart(app, 'test');
    new ApiObject(chart, 'test', {
      metadata: {
        generateName: 'my-resource-',
      },
      spec: {},
    });
    const manifest = Testing.synth(chart);
    expect(manifest).toHaveLength(1);
    expect(manifest[0].metadata.generateName).toEqual('my-resource-');
  });

  it('should omit generateName from synthesized manifest when not provided', () => {
    const app = new Testing.App();
    const chart = new Testing.Chart(app, 'test');
    new ApiObject(chart, 'test', {
      metadata: {},
      spec: {},
    });
    const manifest = Testing.synth(chart);
    expect(manifest[0].metadata.generateName).toBeUndefined();
  });
});
