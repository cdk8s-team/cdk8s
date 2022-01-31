
const mymariadb = require('mariadb');
const redis = require('./redis');


var pool = mymariadb.createPool({
    connectionLimit : 5,
    host: process.env.DB_HOST,
    port: process.env.DB_PORT,
    user: process.env.DB_USER,
    password: process.env.DB_PWD,
    database: process.env.DB_NAME
});

/**
 * Returns pre-rendered page with data to client
 */
const getData =  (request, response) => {
  getreturnData(request, response).then((result)=>{
    response.render('mydbredisdata', {
      title: 'Fine Dining' ,
      tableHeader:'Delicious Meals by Maria Redis',
      dataList: result.data,
      cache: true,
      source: result.source
    })
  });
}

/**
* Gets data from Redis if available. Otherwise get data from MariaDB, save it to Redis
* and then return it to the caller.
*/
async function getreturnData(){
  let result = {}
  let source = "Redis"
  try {
     result = await redis.getData("food")
    if (!result || result === "") {
      result = await getMariaBbData()
      source = "Maria"
      redis.saveData("food", result, 5)
    }
  } catch (e) {
    console.log('ERROR:', err);
  } finally {
    return {"data": result, "source": source }
  }

}

/**
 * Get data from DB
 */
async function getMariaBbData() {
  let conn;
  try {
    conn = await pool.getConnection();
    const rows = await conn.query('SELECT * FROM test ORDER BY id ASC');
    return rows
  } catch (err) {
    throw err;
  }
  finally {
    if (conn) {
      conn.end()
          // .then(() => {
          //   console.log('connection closed')
          //   })
        .catch(err => { console.log(err) })
    }
  }
}

module.exports = {getData,
                  getMariaBbData
                }
