#!/usr/bin/env node

/**
 * Module dependencies.
 */

var app = require('../app');//app._을 var app에 넣어줌
var debug = require('debug')('immense-woodland-66791:server');//debugging
var http = require('http');
//경로 표시 안된건 노드ㅁ듈스에있
/**
 * Get port from environment and store in Express.
 */

var port = normalizePort(process.env.PORT || '3000');
//port설정. ||앞에가 false면 뒤에거 넣음. heroku local로 하면 process.env.PORT=5000,default값 3000.
app.set('port', port);//port에 값을 설정함.
/**
 * Create HTTP server.
 */

var server = http.createServer(app);

/**
 * Listen on provided port, on all network interfaces.
 */

server.listen(port);//3000번 port에서 클라이언트 요청을 기다린다
server.on('error', onError);
server.on('listening', onListening);

/**
 * Normalize a port into a number, string, or false.
 */

function normalizePort(val) {
  var port = parseInt(val, 10);

  if (isNaN(port)) {
    // named pipe
    return val;
  }

  if (port >= 0) {
    // port number
    return port;
  }

  return false;
}

/**
 * Event listener for HTTP server "error" event.
 */

function onError(error) {
  if (error.syscall !== 'listen') {
    throw error;
  }

  var bind = typeof port === 'string'
    ? 'Pipe ' + port
    : 'Port ' + port;

  // handle specific listen errors with friendly messages
  switch (error.code) {
    case 'EACCES':
      console.error(bind + ' requires elevated privileges');
      process.exit(1);
      break;
    case 'EADDRINUSE':
      console.error(bind + ' is already in use');
      process.exit(1);
      break;
    default:
      throw error;
  }
}

/**
 * Event listener for HTTP server "listening" event.
 */

function onListening() {
  var addr = server.address();
  var bind = typeof addr === 'string'
    ? 'pipe ' + addr
    : 'port ' + addr.port;
  debug('Listening on ' + bind);
}
