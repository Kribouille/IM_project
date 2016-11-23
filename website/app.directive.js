angular.module('app')
  .directive('eipPubDeck', eipPubDeck)
  .directive('eipHashtagDeck', eipHashtagDeck)
  .directive('eipTweetDeck', eipTweetDeck);
  //.directive('eipCriteriaDuJourDeck', eipCriteriaDuJourDeck);

function eipPubDeck() {
  return {
    restrict: 'A',
    templateUrl: 'views/pub-deck.tpl.html'
  }
}

function eipHashtagDeck() {
  return {
    restrict: 'A',
    templateUrl: 'views/hashtag-deck.tpl.html'
  }
}

function eipTweetDeck() {
  return {
    restrict: 'A',
    templateUrl: 'views/tweet-deck.tpl.html'
  }
}

/*function eipCriteriaDuJourDeck() {
  return {
    restrict: 'A',
    templateUrl: 'views/criteria-du-jour-deck.tpl.html'
  }
}*/