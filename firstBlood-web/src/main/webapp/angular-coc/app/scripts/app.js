/* app */

var cocApp = angular.module('COC',[
  'ngRoute',
  'cocService',
  'cocControllers'
  ]);

/* 路由 */
cocApp.config(['$routeProvider',
  function($routeProvider){
    $routeProvider.
      when('/',{
        templateUrl: 'tmps/home.html',
        controller: 'homeCtrl'
      }).
      when('/login',{
        templateUrl: 'tmps/login.html',
        controller: 'loginCtrl'
      }).
      otherwise({
        redirectTo: '/'
      });
  }
  ]);