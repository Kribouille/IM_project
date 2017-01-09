var socket = io();
socket.on('deckNumber', function(n){
  $('#side-menu').empty();
  for(var i = 1; i < n+1; i++){
    $('#side-menu').append("<li><a href='#' onclick='clickDeck(" + i + ")'  ><img src='http://lorempixel.com/32/32/?t=a'> Deck " + i + "</a></li>");
  }
});

function clickDeck(deck){
  $("#dashboard").text("Dashboard - Deck " + deck);
  socket.emit('click', deck);
  socket.on('tweets', function(tweets) {
    console.log(tweets);
    $("#tweets").empty();
    $.each(tweets.statuses, function(t, tweet){
      $("#tweets").append("<div id='" +  tweet.id_str + "'>" +
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
    });
    // TODO : prettyprint tweets
  });
}
//streamOn(1);
function streamOn(deck){
  socket.emit('streamOn', deck);
}
socket.on('newTweet', function(tweet){
  $("#tweets").append("<div>" + tweet.text + "<div>");
});
