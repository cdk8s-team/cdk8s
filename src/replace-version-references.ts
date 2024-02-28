import * as fs from 'fs';
import * as path from 'path';

function replaceRefsInFile(filePath: string, toReplace: string, substitution: string) {
  // references in the docs files for version XX appear in the following ways:
  // cdk8s-plus-XX, cdk8s.plusXX, cdk8splusXX, CDK8s_PLUSXX_VERSION, cdk8s_plusXX_version
  // we must also replace references to outdated kubernetes versions. this shows up as:
  // Kubernetes v1.XX.0
  const referencePrefixes = ['plus-', 'plus', 'PLUS', 'Kubernetes v1.'];

  let curFileData = fs.readFileSync(filePath, 'utf-8');
  referencePrefixes.forEach(function (referencePrefix: string) {
    curFileData = curFileData.replace(new RegExp(referencePrefix + toReplace, 'g'), referencePrefix + substitution);
    fs.writeFileSync(filePath, curFileData);
  });
}

export function replaceOldVersionReferences(latestVersion: string) {

  const latestVersionNumber = Number(latestVersion);

  const filesToBeUpdated = ['website/layouts/index.html', 'docs/plus/.pages', 'docs/reference/.pages', 'docs/reference/index.md'];

  filesToBeUpdated.forEach(function (filePath: string) {
    for (let i = 0; i < 3; i++) {
      replaceRefsInFile(filePath, `${latestVersionNumber - 1 - i}`, `${latestVersionNumber - i}`);
    }
  });

  // make new docs/reference/cdk8s-plus-XX/ directory and add .pages and go.md files
  const newDocsReferenceDir = `docs/reference/cdk8s-plus-${latestVersionNumber}/`;
  fs.mkdirSync(newDocsReferenceDir);
  const pagesFileData = fs.readFileSync(`docs/reference/cdk8s-plus-${latestVersionNumber-1}/.pages`, 'utf-8');
  fs.writeFileSync(path.join(newDocsReferenceDir, '.pages'), pagesFileData);
  let goFileData = fs.readFileSync(`docs/reference/cdk8s-plus-${latestVersionNumber-1}/go.md`, 'utf-8');
  fs.writeFileSync(path.join(newDocsReferenceDir, 'go.md'), goFileData);
  replaceRefsInFile(path.join(newDocsReferenceDir, 'go.md'), `${latestVersionNumber - 1}`, latestVersion);

  // update reference in docs/plus/index.md
  replaceRefsInFile('docs/plus/index.md', `${latestVersionNumber - 1}`, latestVersion);

  // update all references in docs/basics/**
  recursiveReplaceRefsInDir('docs/basics/', `${latestVersionNumber - 1}`, latestVersion);
}

function recursiveReplaceRefsInDir(dir: string, toReplace: string, substitution: string) {
  fs.readdirSync(dir, { encoding: 'utf-8' }).forEach(file => {
    let fullPath = path.join(dir, file);
    if (fs.lstatSync(fullPath).isDirectory()) {
      recursiveReplaceRefsInDir(fullPath, toReplace, substitution);
    } else {
      replaceRefsInFile(fullPath, toReplace, substitution)
    }
  });
}

replaceOldVersionReferences(process.argv.slice(2)[0]);