#!/bin/sh

gpg --quiet --batch --yes --passphrase=$GPG_KEY_PASSPHRASE --output ./.github/secrets/private.key --decrypt ./.github/secrets/private.key.enc

gpg --import ./.github/secrets/private.key
gpg --import ./.github/secrets/public.key

ls -la

cat << EOF > tempsettings.xml
<settings>
  <servers>
      <server>
        <id>ossrh</id>
        <username>$MVN_USERNAME</username>
        <password>$MVN_PASSWORD</password>
      </server>
  </servers>
</settings>
EOF

mvn versions:set -DnewVersion=$RELEASE_VERSION

mvn --settings ./tempsettings.xml deploy
