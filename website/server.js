var log = require('loglevel');
var express = require('express');
var app = express();
var path = require('path');

var Twit = require('twit');

var T = new Twit({
  consumer_key:         'VWZdNer7vHtUoqd7eoyan0kcK',
  consumer_secret:      'fUlaXMRw1n7Wld8QOR2SiYWbGy5B6KfS7eAv93Ny2pMnCOycCH',
  access_token:         '2865989501-A2ZArINKPOMDIrKW9OouiR94bKN8ojXqX8qMngO',
  access_token_secret:  'ixGmCJMaqIhH7GOnJvES3H3NxfiBoAzAYWV21TfehxKdE',
  timeout_ms:           60*1000,  // optional HTTP request timeout to apply to all requests.
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

  // TODO : calculer le nombre de decks dans le JSON
  var deckNumber = 5;
  socket.emit('deckNumber', deckNumber);

  socket.on('click', function(deck) {
    //TODO appliquer les bons filtres sur l'API rest => changer la query avec les filtres du deck en paramètre
    T.get('search/tweets', { q: 'lol'}, function(err, data, response) {
      if(err){
        console.log(err);
      }
      else{
        socket.emit('tweets',data);
      }
    });
  });

// pour streamer. Voir https://dev.twitter.com/streaming/overview/request-parameters#track
  socket.on('streamOn', function(deck){
    var stream = T.stream('statuses/filter', { track: 'cat,lol' })

    stream.on('tweet', function (tweet) {
      socket.emit('newTweet', tweet);
    })
  })
});

server.listen(port);
console.log('Server started on following port : ' + port);
