'use strict';

App.controller('playersController', function($scope) {
  $scope.init = function (players) {
    $scope.players = players;
  }

  $scope.orderByMe = function(x) {
    $scope.myOrderBy = x;
  }
});