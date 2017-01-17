var log = require('loglevel');
var express = require('express');
var app = express();
var path = require('path');
var Twit = require('twit');
var fs = require('fs');

var obj = JSON.parse(fs.readFileSync('keys_tokens.json', 'utf8'));
/*
* chargement des tokens et keys
*/
var T = new Twit({
  consumer_key:         obj.consumer_key,
  consumer_secret:      obj.consumer_secret,
  access_token:         obj.access_token,
  access_token_secret:  obj.access_token_secret,
  timeout_ms:           60*1000,  // optional HTTP request timeout to apply to all requests.
});

var currentDeck = undefined;
var decks = "";

// TODO charger deck JSON
fs.readFile('../TwitterAcceleo/src-gen/twitter.json', 'utf8', function (err,data) {
  if (err) {
    return console.log(err);
  }
  console.log(data);
  decks = JSON.parse(data).decks;
});

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
var stream = T.stream('statuses/filter', { track: '#cat' });
// Player websocket handling
io.sockets.on('connection', function(socket) {

  var tweetsSend = []; // to avoid double sending
  var isStreamOn = false;

  socket.emit('decksToInit', decks);

  socket.on('click', function(deck) {

    T.get('search/tweets', { q: decks[deck].filter}, function(err, data, response) {
      if(err){
        console.log(err);
      }
      else{
        socket.emit('tweets',data);
      }
    });
  });

// to stream. See https://dev.twitter.com/streaming/overview/request-parameters#track
  socket.on('streamOn', function(deck){
    isStreamOn = true;
    stream = T.stream('statuses/filter', { track: decks[deck].filter });
  });
  socket.on('streamOff', function(){
    isStreamOn = false;
    stream = T.stream('statuses/filter', { track: 'untrackquinexistepas' });
    tweetsSend = [];
  })

  stream.on('tweet', function (tweet) {
    console.log(tweet);
    if(isStreamOn && (tweetsSend.indexOf(tweet.id) == -1)){
      tweetsSend.push(tweet.id);
      socket.emit('newTweet', tweet);
    }
  });
});

server.listen(port);
console.log('Server started on following port : ' + port);
