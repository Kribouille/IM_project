var log = require('loglevel');
var express = require('express');
var app = express();
var path = require('path');

var twitterAPI = require('node-twitter-api');
var twitter = new twitterAPI({
    consumerKey: 'your consumer Key',
    consumerSecret: 'your consumer secret',
    callback: 'http://yoururl.tld/something'
});

var currentDeck = undefined;

// TODO charger deck JSON

var port = 8080;

// Set the view engine to ejs
app.set('view engine', 'ejs');
app.set('views', __dirname + '/views');
app.use(express.static(__dirname + '/public'));

// Root
app.get('/', function(req, res) {
    res.render('index.ejs');
});

// 404 Not Found
app.use(function(req, res, next) {
    res.setHeader('Content-Type', 'text/plain');
    res.status(404).send('Page introuvable !');
});

// Socket.io loading
var server = require('http').createServer(app);
var io = require('socket.io').listen(server);

// Player websocket handling
io.sockets.on('connection', function(socket) {
	// Lancer le thread REST API pour télécharger les tweets désirés

    socket.on('click', function(deck) {
      //TODO appliquer les bons filtres sur l'API rest
    });
});

server.listen(port);
console.log('Server started on following port : ' + port);