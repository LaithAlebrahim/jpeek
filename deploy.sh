#!/bin/bash
set -e

cd $(dirname $0)
cp /code/cqfn-secrets/jpeek-settings-heroku.xml settings.xml
git add settings.xml
git commit -m 'settings.xml for dokku'
trap 'git reset HEAD~1 && rm settings.xml' EXIT
git push dokku master -f

