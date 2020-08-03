import * as http from 'http';
import * as querystring from 'querystring';
import { ClientRequestArgs } from 'http';

const endpoint = process.env.ELASTIC_ENDPOINT;
const username = process.env.ELASTIC_USERNAME;
const password = process.env.ELASTIC_PASSWORD;

if (!endpoint) {
  throw new Error('ELASTIC_ENDPOINT env variable is required');
}

if (!password) {
  throw new Error('ELASTIC_PASSWORD env variable is required');
}

if (!username) {
  throw new Error('ELASTIC_USERNAME env variable is required');
}

var port = process.argv[2];

console.log('Creating a server...');
http.createServer(function (req: http.IncomingMessage, res: http.ServerResponse) {

  function sendResponse(data: string) {
    res.write(data);
    res.end();
  }

  try {

    console.log(`Received request: ${req.url}`);

    let uri = req.url?.split('?')[1];

    if (!uri) {
      throw new Error('URI is undefined');
    }

    doSearch(uri, sendResponse);


  } catch (err) {
    sendResponse(err.message);
  }

}).listen(port);

function doSearch(uri: string, callback: (data: string) => void) {

  console.log(`URI is: ${uri}`);

  const queryParams = querystring.parse(uri!);

  if (!queryParams) {
    throw new Error('Illegal Query. Use ?search=<free-text>');
  }

  console.log(`Params: ${JSON.stringify(queryParams)}`);

  const search = queryParams['search'];

  const hostAndPort = endpoint!.split('//')[1].split(':');

  const options: ClientRequestArgs = {
    headers: {
      'Authorization': 'Basic ' + Buffer.from(username + ':' + password).toString('base64'),
    },
    path: `/_search?q=${search}`,
    port: hostAndPort[1],
    host: hostAndPort[0]
  }

  console.log(`Sending search query to elasticsearch: ${JSON.stringify(options)}`);

  http.get(options, (esResponse: any) => {

    let data = '';

    esResponse.on('data', (chunk: any) => {
      data += chunk;
    });

    esResponse.on('end', () => {
      callback(data);
    });

  }).on('error', (err: Error) => {
    callback(err.message);
  });

}