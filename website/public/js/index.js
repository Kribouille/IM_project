var socket = io();
var currentDeck = "";
var isStreamOn = false;
var decks = "";
/*
* Récéption du nombre de decks pour générer les boutons dans le menu
*/
socket.on('decksToInit', function(decksToInit){
  decks = decksToInit;
  $('#side-menu').empty();
  for(var i = 0; i < decks.length; i++){
    $('#side-menu').append("<li><a href='#' onclick='clickDeck(" + i + ")'><img src='http://lorempixel.com/32/32/?t=a'/> Deck " + decks[i].name + "</a></li>");
  }
});

/*
* Fonction déclenchée par le click d'un deck
*/
function clickDeck(deck){
  currentDeck = deck;
  $("#dashboard").text("Dashboard - " + decks[deck].name);
  socket.emit('click', deck);
  socket.on('tweets', function(tweets) {
    $("#tweets").empty();
    $.each(tweets.statuses, function(t, tweet){
      addTweet(tweet);
    });
  });
}

/*
* Fonction déclenchée par l'activation/désactivation du streaming par le client
*/
function streamOn(){
  if(isStreamOn){
    isStreamOn = false;
    socket.emit('streamOff');
  }
  else{
    isStreamOn = true;
    socket.emit('streamOn', currentDeck);
  }
}

/*
* Récéption d'un nouveau tweet (en mode streaming)
*/
  socket.on('newTweet', function(tweet){
      addTweet(tweet);
  });


/*
* Fonction de mise en forme et d'insertion d'un tweet dans la page
*/
function addTweet(tweet){
  console.log(tweet.text);
  $("#tweets").prepend("<div id='" +  tweet.id_str + "'>" +
  "<div id='imgDiv'>" +
  "<img src='" + tweet.user.profile_image_url + "' hspace='20'/>" +
  "</div>" +
  "<div>" +
  "<a href='https://twitter.com/" + tweet.user.screen_name + "' target='_blank'>" +
  "<span id='author'>" + tweet.user.name +  " </span>" +
  "<span id='authorId'>@" + tweet.user.screen_name + "</span>" +
  "</a><br/>" +
  "<a href='https://twitter.com/" + tweet.user.screen_name + "/status/" + tweet.id_str + "' target='_blank' id='tweetText'>" +
  tweet.text +
  "</a>" +
  "</div>" +
  "</div");
}
