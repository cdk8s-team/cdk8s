#!/bin/bash
root="$(cd $(dirname $0) && pwd)/.."

mkdir -p node_modules node_modules/.bin

modules="$(find ${root}/packages -name package.json | grep -v node_modules | grep -v template | xargs -n1 dirname)"
for module in ${modules}; do
  if [[ $(basename $(dirname $module)) == @* ]]; then
    # This is a @scope/based package
    scope=$(basename $(dirname $module))
    link_dir=node_modules/$(basename $(dirname $module))
    mkdir -p $link_dir
  else
    link_dir=node_modules
  fi

  module_dir=${link_dir}/$(basename $module)
  echo "${module} => ${module_dir}"
  rm -fr ${module_dir}
  ln -fs ${module} ${link_dir}

  # link src to lib
  src_dir="$(grep rootDir ${module}/tsconfig.json | sed -E 's/.*rootDir\"\:\ *\"//' | sed -E 's/\".*/\//')"
  out_dir="$(grep outDir ${module}/tsconfig.json | sed -E 's/.*outDir\"\:\ *\"//' | sed -E 's/\".*/\//')"
  sources=$(cd ${module}/${src_dir} && find . -name '*.ts' -type f -print)
  if [ src_dir != out_dir ] && [[ !  -z  $src_dir  ]]
  then
    for s in $sources; do
      ln -fs ${module}/${src_dir}${s} ${module_dir}/${out_dir}${s} 
    done
  fi
  # Symlink executable scripts into place as well. This is not completely
  # according to spec (we look in the bin/ directory instead of the { "scripts"
  # } entry in package.json but it's quite a bit easier.
  if [[ -d $module/bin ]]; then
    for script in $(find $module/bin -perm 111); do
      echo "${script} => node_modules/.bin/$(basename $script)"
      ln -fs ${script} node_modules/.bin
    done
  fi
done
