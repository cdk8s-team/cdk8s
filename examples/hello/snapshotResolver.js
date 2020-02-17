const {basename, dirname, join} = require('path');
const bazelDir = process.env['BUILD_WORKSPACE_DIRECTORY'] || process.cwd();
const bazelRoot = process.env['BAZEL_PATCH_ROOT'] || '';
const binDir = 'bin';
const pathEnd = dirname(bazelRoot.slice(bazelRoot.lastIndexOf(binDir) + binDir.length));

module.exports = {
    resolveSnapshotPath: (testPath, snapshotExtension) =>
        join(bazelDir, pathEnd, '__snapshots__', basename(testPath) + snapshotExtension),

    resolveTestPath: (snapshotFilePath, snapshotExtension) =>
        join(bazelDir, pathEnd, basename(snapshotFilePath).slice(0, -snapshotExtension.length)),

    testPathForConsistencyCheck: join(bazelDir, pathEnd, 'a.test.ts'),
};
