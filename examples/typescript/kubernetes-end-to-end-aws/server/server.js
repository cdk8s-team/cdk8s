#!/usr/bin/env node
const http = require('http');
const os = require('os');

const server = http.createServer((req, res) => {
  res.write('hello, world\n');
  res.write(`url=${req.url}\n`);
  res.write(`host=${os.hostname()}`);

  res.end();
});

process.on('SIGINT', () => process.exit(1));

const port = process.env.PORT ?? 8080;
server.listen(port);
console.error(`listening on port ${port}`);
