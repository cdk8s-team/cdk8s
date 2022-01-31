
const mymariadb = require('mariadb');


const pool = mymariadb.createPool({
    connectionLimit: 5,
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
  getMariaBbData(request, response).then(result=>{
    response.render('mydbdata', {
      title: 'Fine Dining' ,
      tableHeader:'Delicious Foods by Maria',
      dataList: result
    })
  });
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
          .catch(err => { console.log(err) })
    }
  }
}

module.exports = {getData,
                  getMariaBbData
                }
