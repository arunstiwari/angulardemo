'use strict';

/* Controllers */

angular.module('listApp.controllers', [])
  .controller('listController', ['$scope','$http', function($scope,$http) {

  	$scope.searchFilter = null;
    
    $scope.bookFilter=null;
    
    $http.get('/books')
    	.success(function(data,status,headers,config){
    		$scope.booksList = data;
    	})
    	.error(function(data,status,headers,config){
    	
    	});
      
  }]);