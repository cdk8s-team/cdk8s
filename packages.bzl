# Each individual package uses a placeholder for the version of CDK to ensure they're
# all in-sync. This map is passed to each rule to stamp out the appropriate version for the placeholders.
CONSTRUCTS_PACKAGE_VERSION = "^1.1.2"
JSII_PACKAGE_VERSION = "^1.0.0"

VERSION_PLACEHOLDER_REPLACEMENTS = {
    "0.0.0-CONSTRUCTS": CONSTRUCTS_PACKAGE_VERSION,
}
