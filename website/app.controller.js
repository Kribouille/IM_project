angular.module('app')
  .controller('appCtrl', AppCtrl);

function AppCtrl($scope) {
  $scope.bonjour = function() {
    alert("https://www.youtube.com/watch?v=sufXl_PpKAk");
  };
  $scope.mockPubs = [
    {
      name: "Achetez McDo c'est dodo",
      size: 4
    },
    {
      name: "Achetez Domino c'est gogo",
      size: 6
    }
  ];
  $scope.mockTweets = [
    {
      content: "Votez pour Trump"
    },
    {
      content: "Votez pour BDE"
    }
  ];
  $scope.mockHashtags = [
    "#trump", 
    "#ingénierie_modèle", 
    "#sport"
  ];
}