import { JavaGenerator } from '../src/java';
import { CodeMaker } from 'codemaker';

describe('Javadoc HTML escaping', () => {
  test('escapes < and > characters in documentation', () => {
    const code = new CodeMaker();
    const generator = new JavaGenerator(code);
    
    generator.emitPackage('test.pkg');
    generator.emitJavaDoc('This is a test with <angle> brackets and <another> one');
    generator.emitClass('TestClass', { export: false });
    
    const output = code.render();
    expect(output).toContain('This is a test with &lt;angle&gt; brackets and &lt;another&gt; one');
    expect(output).not.toContain('<angle>');
    expect(output).not.toContain('<another>');
  });

  test('handles mixed HTML entities and angle brackets', () => {
    const code = new CodeMaker();
    const generator = new JavaGenerator(code);
    
    generator.emitPackage('test.pkg');
    generator.emitJavaDoc('Use <code>List<String></code> for generic types');
    generator.emitClass('TestClass', { export: false });
    
    const output = code.render();
    expect(output).toContain('Use &lt;code&gt;List&lt;String&gt;&lt;/code&gt; for generic types');
    expect(output).not.toContain('<code>List<String></code>');
  });
});