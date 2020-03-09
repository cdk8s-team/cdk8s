// Jest Snapshot Resolver for Bazel
// Bazel runs all of its build in a sandbox on a user's machine. This poses a problem
// for Jest snapshot tests when it comes time for a user to update them. Without firm
// path resolution, the snapshot would get updated ephemerally in the sandbox but not
// persisted in a user's project workspace.
// This file creates a stable mapping from the tests run by Jest in the sandbox to
// the snapshots in the user's workspace. This allows Jest to properly update the
// snapshots if needed.
// Note: this will only update the snapshots locally if the `bazel run` command is
//       used, because that's when the BUILD_WORKSPACE_DIRECTORY environment variable
//       is populated at runtime
const {basename, dirname, join} = require('path');
const bazelDir = process.env['BUILD_WORKSPACE_DIRECTORY'] || process.cwd();
const bazelRoot = process.env['BAZEL_PATCH_ROOT'] || '';
const binDir = 'bin';
const pathEnd = dirname(bazelRoot.slice(bazelRoot.lastIndexOf(binDir) + binDir.length));

module.exports = {
    resolveSnapshotPath: (testPath, snapshotExtension) =>
        join(bazelDir, pathEnd, 'test', '__snapshots__', basename(testPath) + snapshotExtension),

    resolveTestPath: (snapshotFilePath, snapshotExtension) =>
        join(bazelDir, pathEnd, 'test', basename(snapshotFilePath).slice(0, -snapshotExtension.length)),

    testPathForConsistencyCheck: join(bazelDir, pathEnd, 'test', 'a.test.ts'),
};
