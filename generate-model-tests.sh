#!/bin/bash

# Generates new test files for models. Run from the root.

# allow generator to write test files
sed -i.bak 's/^src\/test\//# src\/test\//' .openapi-generator-ignore && rm .openapi-generator-ignore.bak
# remove current test files for models
rm -f ./src/test/java/com/bandwidth/sdk/unit/models/*
# generate new test files for models
openapi-generator-cli generate -i bandwidth.yml -o ./ -c openapi-config.yml -g java > /dev/null
# move generated test files to the correct location
mv ./src/test/java/com/bandwidth/sdk/model/* ./src/test/java/com/bandwidth/sdk/unit/models/
# fix package declarations in moved test files
sed -i '' 's/^package com\.bandwidth\.sdk\.model;/package com.bandwidth.sdk.unit.models;/' ./src/test/java/com/bandwidth/sdk/unit/models/*.java
# remove the rest of the generated files
rm -rf ./src/test/java/com/bandwidth/sdk/api ./src/test/java/com/bandwidth/sdk/model
# discard changes to modified files only (leaves deletions and new test files intact)
modified=$(git diff --name-only --diff-filter=M) && [ -n "$modified" ] && echo "$modified" | xargs git checkout --
