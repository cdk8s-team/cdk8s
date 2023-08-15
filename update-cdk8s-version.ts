import * as fs from 'fs';
import * as path from 'path';

function main(latestVersionNumber: number) {

    const filesToBeUpdated = ['.projenrc.js', 'docs/build.sh', 'website/build.sh', 'website/layouts/index.html', 'docs/plus/.pages', 'docs/references/.pages', 'docs/reference/index.md', ];
    
    filesToBeUpdated.forEach(function (filePath) {
        let curFileData = fs.readFileSync(filePath, 'utf-8');
        for (let i = 0; i < 3; i++) {
            curFileData = curFileData.replace(`${latestVersionNumber - 1 - i}`, `${latestVersionNumber - i}`);
        }
        fs.writeFileSync(filePath, curFileData);
    });

    // make new docs/reference/cdk8s-plus-XX/ directory and add .pages and go.md files
    const newDocsReferenceDir = `docs/reference/cdk8s-plus-${latestVersionNumber}/`;
    fs.mkdirSync(newDocsReferenceDir);
    const pagesFileData = fs.readFileSync(`docs/reference/cdk8s-plus-${latestVersionNumber-1}/.pages`, 'utf-8');
    fs.writeFileSync(path.join(newDocsReferenceDir, '.pages'), pagesFileData);
    let goFileData = fs.readFileSync(`docs/reference/cdk8s-plus-${latestVersionNumber-1}/go.md`, 'utf-8');
    goFileData = goFileData.replace(`${latestVersionNumber - 1}`, `${latestVersionNumber}`);
    fs.writeFileSync(path.join(newDocsReferenceDir, 'go.md'), goFileData);

    // update reference in docs/plus/index.md
    let plusIndexFileData = fs.readFileSync('docs/plus/index.md', 'utf-8');
    plusIndexFileData = plusIndexFileData.replace(`${latestVersionNumber - 1}`, `${latestVersionNumber}`);
    fs.writeFileSync('docs/plus/index.md', plusIndexFileData);

    // update all references in docs/basics/**
    // fs.readdirSync('docs/basics/', function(err, files) {

    // });
}

main();
//   .catch(console.error);