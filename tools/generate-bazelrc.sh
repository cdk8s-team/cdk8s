envVars=("JAVA_HOME" "PATH" "DOTNET_CLI_HOME" "M2" "M2_HOME")

for v in "${envVars[@]}"; do
  if [ -n "${!v}" ];
  then
    echo "build --action_env=$v=${!v}" >> .bazelrc.user.tmp
  fi
done

mv .bazelrc.user.tmp .bazelrc.user
