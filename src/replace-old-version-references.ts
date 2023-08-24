import * as fs from 'fs';
import * as path from 'path';

function main(latestVersion: string) {

  const latestVersionNumber = Number(latestVersion);

  const filesToBeUpdated = ['.projenrc.ts', 'docs/build.sh', 'website/build.sh', 'website/layouts/index.html', 'docs/plus/.pages', 'docs/reference/.pages', 'docs/reference/index.md'];

  filesToBeUpdated.forEach(function (filePath) {
    let curFileData = fs.readFileSync(filePath, 'utf-8');
    for (let i = 0; i < 3; i++) {
      curFileData = curFileData.replace(new RegExp(`${latestVersionNumber - 1 - i}`, 'g'), `${latestVersionNumber - i}`);
    }
    fs.writeFileSync(filePath, curFileData);
  });

  const replacementRegex = new RegExp(`${latestVersionNumber - 1}`, 'g');

  // make new docs/reference/cdk8s-plus-XX/ directory and add .pages and go.md files
  const newDocsReferenceDir = `docs/reference/cdk8s-plus-${latestVersionNumber}/`;
  fs.mkdirSync(newDocsReferenceDir);
  const pagesFileData = fs.readFileSync(`docs/reference/cdk8s-plus-${latestVersionNumber-1}/.pages`, 'utf-8');
  fs.writeFileSync(path.join(newDocsReferenceDir, '.pages'), pagesFileData);
  let goFileData = fs.readFileSync(`docs/reference/cdk8s-plus-${latestVersionNumber-1}/go.md`, 'utf-8');
  goFileData = goFileData.replace(replacementRegex, `${latestVersionNumber}`);
  fs.writeFileSync(path.join(newDocsReferenceDir, 'go.md'), goFileData);

  // update reference in docs/plus/index.md
  let plusIndexFileData = fs.readFileSync('docs/plus/index.md', 'utf-8');
  plusIndexFileData = plusIndexFileData.replace(replacementRegex, `${latestVersionNumber}`);
  fs.writeFileSync('docs/plus/index.md', plusIndexFileData);

  // update all references in docs/basics/**
  const docsFileNames = fs.readdirSync('docs/basics/', { encoding: 'utf-8' });
  docsFileNames.forEach(function (filePath) {
    let curFileData = fs.readFileSync(path.join('docs/basics', filePath), 'utf-8');
    curFileData = curFileData.replace(replacementRegex, `${latestVersionNumber}`);
    fs.writeFileSync(path.join('docs/basics', filePath), curFileData);
  });
}

main(process.argv.slice(2)[0]);