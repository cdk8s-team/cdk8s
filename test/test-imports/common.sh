function match_snapshot() {
  local actual=$1
  local expected=$2

  if [ "${UPDATE_SNAPSHOTS}" == "1" ]; then
    echo "Updating snapshot under $expected"
    rsync -a --delete --exclude=*.tgz $actual/ $expected/
  fi

  # Exclude the .tgz files because their headers differ
  # because they were zipped at different times.
  diff -r --exclude=*.tgz $actual $expected || {
    echo "=================================================================="
    echo " Failed to match snapshot"
    echo " Actual: $(cd $actual && pwd)"
    echo " Expected: $expected"
    echo ""
    echo " To update run with UPDATE_SNAPSHOTS=1"
    echo "=================================================================="
    exit 1
  }
}
