--- a/packages/cdk8s-cli/src/helm/import-helm.ts
+++ b/packages/cdk8s-cli/src/helm/import-helm.ts
@@ -123,7 +123,12 @@
     for (const [name, schema] of Object.entries(properties)) {
       const propertyName = toSafePropertyName(name);
+      // Rename get/set/is prefixes to avoid jsii conflict
+      const sanitizedPropertyName = propertyName.replace(/^(get|set|is)([A-Z])/, (_, p1, p2) => '_' + p1 + p2);
+      const finalPropertyName = sanitizedPropertyName !== propertyName ? sanitizedPropertyName : propertyName;
       const type = jsiiTypeFromSchema(schema);
       propertiesCode.push(`  public readonly ${finalPropertyName}: ${type};`);
     }