# Each individual package uses a placeholder for the version of CDK to ensure they're
# all in-sync. This map is passed to each rule to stamp out the appropriate version for the placeholders.
CDK_PACKAGE_VERSION = "^1.27.0"
TSLIB_PACKAGE_VERSION = "^1.9.0"

VERSION_PLACEHOLDER_REPLACEMENTS = {
    "0.0.0-CDK": CDK_PACKAGE_VERSION,
    "0.0.0-TSLIB": TSLIB_PACKAGE_VERSION,
}
