#!/bin/sh

gpg --quiet --batch --yes --passphrase=$GPG_KEY_PASSPHRASE --output ./.github/secrets/private.key --decrypt ./.github/secrets/private.key.enc

gpg --import ./.github/secrets/private.key
gpg --import ./.github/secrets/public.key

mvn install
