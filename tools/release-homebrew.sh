#!/bin/bash
# create a PR to homebrew/homebrew-core for brew update

set -euo pipefail

# Brew suggests doing brew update twice.
brew update
brew update

brew_root=$(brew --repo homebrew/core)
cd ${brew_root}

read -p "Enter your fork of homebrew/homebrew-core: " forkUrl

echo "Updating your fork to homebrew's latest commit on master ${forkUrl}"
git pull --rebase
git push ${forkUrl} master

echo "Checking out local branch to perform update."
# If local branch already exists, supress warning and check it out
git checkout -b cdk8s origin/master 2>/dev/null || git checkout cdk8s && git pull --rebase
# Make remote cdk8s branch up to date
git push ${forkUrl} cdk8s -ff 2>/dev/null

echo "Fetching latest version of cdk8s from npm"
version=$(npm show cdk8s version)

echo "Latest version is ${version}, found here: https://registry.npmjs.org/cdk8s-cli/-/cdk8s-cli-${version}.tgz"
echo
echo "Replacing url in homebrew formula"
echo

newUrlLine="  url \"https:\/\/registry.npmjs.org\/cdk8s-cli\/-\/cdk8s-cli-${version}.tgz\""

sed -i "" "s/.*url.*/${newUrlLine}/g" Formula/cdk8s.rb

echo "Replacing sha line with new version's sha"
echo
# Removing sha so brew command will fetch new one.
sed -i "" '1,/sha256/ s/.*sha256.*/#placeholder/g' Formula/cdk8s.rb
# Suppressing "Warning: Cannot verify integrity of..."
sha=$(brew fetch cdk8s --build-from-source 2>/dev/null | grep "SHA256:" | sed 's/SHA256: //')
# Putting new sha into formula
shaLine="  sha256 \"${sha}\""
sed -i "" "s/.*placeholder.*/${shaLine}/g" Formula/cdk8s.rb

echo "Showing you the git diff."
echo

git --no-pager diff

read -p "Please confirm that this looks correct: " -n 1 -r
echo
if [[ ! $REPLY =~ [^Yy]$ ]]
then
  echo
  echo "Ok, going to push this change to your fork"
  git add Formula/cdk8s.rb
  git commit -s -m "cdk8s ${version}"
  git push $forkUrl cdk8s
  echo
  echo "Please go to https://github.com/Homebrew/homebrew-core and open a PR"
  echo
  echo "Have a good day :)"
else
 echo
 echo "Please report an issue with this script to https://github.com/awslabs/cdk8s"
fi
