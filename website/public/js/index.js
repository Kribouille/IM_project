var socket = io();
socket.on('deckNumber', function(n){
  for(var i = 1; i < n+1; i++){
    $('#side-menu').append("<li><a href='#' onclick='clickDeck(" + i + ")'  ><img src='http://lorempixel.com/32/32/?t=a'> Deck " + i + "</a></li>");
  }
});

function clickDeck(deck){
  socket.emit('click', deck);
  socket.on('tweets', function(tweets) {
    $("#tweets").empty();
    $.each(tweets.statuses, function(t, tweet){
      $("#tweets").append("<div>" + tweet.text + "<div>");
    });
    // TODO : prettyprint tweets
  });
}
