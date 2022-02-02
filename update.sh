#!/usr/bin/env bash
#
# Simple script to automate updating the Action without changing the Release Tag
#
git commit -a -m "$1"
git push -u origin main
hash=$(git rev-parse HEAD)
git tag -f v1 ${hash}
git push --force origin v1
