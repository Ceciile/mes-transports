var app = angular.module("app",['routes','account','menu','agencyVehiculesView','agency', 'vehicle']);


/*
app.run(function($rootScope,$location) {
	$rootScope.$on("$routeChangeStart", function(event, next, current) {
		
		  if(next.$$route.originalPath == '/' && $rootScope.user) 
		  {
			  if($rootScope.user.isAgency)
			  {
				  $location.path('/agency');
			  }
			  else{$location.path('/');}
		  } 
		  else{
			  $location.path(next.$$route.originalPath);}
	});
	
});
 */

app.controller('AppController', function($scope) {
	
	$scope.form = {};
	
});