#!/bin/bash
echo "==> [WARNING] : Be aware that you need to manually execute git pull"
echo "==> [NPM] : Update"
npm update
echo "==> [NODE] : Launching server"
node ./server.js
