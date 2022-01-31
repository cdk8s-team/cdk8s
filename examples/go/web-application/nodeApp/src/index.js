'use strict';

const express = require('express');
const mariaDbData = require('./mariaDbData');
const helloWorld = require('./helloworld');
const redisData = require('./mariaDbRedisData');

// Constants
const PORT = 3000;
const HOST = '0.0.0.0';

// App returns pre-rendeered pages to client
const app = express();
app.set('view engine', 'pug');
app.use(express.static('public'))

//root page calls helloWorld module
app.get('/', (req, res) => {
    helloWorld.sayHello(req, res)
});

//mariadb page calls mariadb module
app.get('/mariadb', (req, res) => {
        mariaDbData.getData(req, res)
    }
);

//redis page calls mariadbredis module and brings data from redis (if cached) or
//mariaDB
app.get('/redis', (req, res) => {
        redisData.getData(req, res)
    }
);

//Add a conditional start so that we can run our http tests and it does
// not try to start the server twice
if(!module.parent) {
    app.listen(PORT, HOST);
}
console.log(`Running on http://${HOST}:${PORT}`);

module.exports = app;
