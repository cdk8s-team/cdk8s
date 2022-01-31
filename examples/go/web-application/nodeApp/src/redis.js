const { promisify } = require("util");
const redis = require('redis');


const client = redis.createClient({
    port: process.env.REDIS_PORT,
    host: process.env.REDIS_HOST,
    password: process.env.REDIS_PWD,
});

client.on('connect', ()=>{
    console.log('redis connected');
});

client.on("error", function(error) {
    console.error(error);
});

/**
 * Save data to Redis as a string with a default expiration of 10 seconds
 */
function saveData(key, data, expireSecs = 10){
    client.set(key, JSON.stringify(data), 'ex', expireSecs)
}

/**
 * Get data from Redis. Use promisify so that we can convert the call to return a promise
 */
async function getData(key){
    const getAsync = promisify(client.get).bind(client);
    let result = await getAsync(key)
    return JSON.parse(result)
}

module.exports = {getData,
    saveData
}
