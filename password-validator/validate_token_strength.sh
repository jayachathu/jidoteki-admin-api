#!/bin/sh

set -u
set -e

cd /usr/local/share/jidoteki-admin-api/password-validator

[ ! -f "/usr/local/java/bin/java" ] || /usr/local/java/bin/java -cp "zxcvbn-1.5.2.jar:." ValidatePasswordStrength "$NEW_TOKEN"

exit $?
