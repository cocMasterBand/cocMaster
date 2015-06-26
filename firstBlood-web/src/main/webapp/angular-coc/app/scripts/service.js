/* 自定义服务器 */
var cocService = angular.module('cocService', []);

cocService.factory('CocService', function($http, $q){
  var service = {
    getData: function(url, config){
      var deferred = $q.defer();
      $http.get(url, config).
        success(function(data){
          if(data.status === 200){
            deferred.resolve(data);
          }else if(data.status === 400){
            alert(data.msg);
          }else{
            alert('出错了，但没有错误码！');
          }
        }).error(function() {
          deferred.reject('出错了！');
        });

      return deferred.promise;
    },
    postData: function(url, config){
      var deferred = $q.defer();
      $http.post(url, config).
        success(function(data){
          if(data.status === 200){
            deferred.resolve(data);
          }else if(data.status === 400){
            alert(data.msg);
          }else{
            alert('出错了，但没有错误码！');
          }
        }).error(function() {
          deferred.reject('出错了！');
        });
      return deferred.promise;
    }
  }
  
  return service;
});
