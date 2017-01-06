var socket = io();
socket.emit('click', 'test');
socket.on('tweets', function(tweets) {
	console.log(tweets);
  // TODO : prettyprint tweets
});
