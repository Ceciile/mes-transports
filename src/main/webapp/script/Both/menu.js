var menu = angular.module('menu', ['ngCookies','agency']);

menu.controller("menuCtrl", ['$scope','$rootScope','$cookies', function menuCtrl($scope,$rootScope,$cookies) {

	$scope.currentSideMenu = 'view/menu/sideMenuEmpty.html'; 
	$scope.currentTopMenu = 'view/menu/header.html';

	$scope.loadTopMenu=function()
	{
		var user = $cookies.getObject("user");
		if(user==undefined){
			$scope.currentTopMenu = 'view/menu/header.html'
		}
		else{
		$scope.currentTopMenu = user.isAgency?'view/menu/headerAgency.html':'view/menu/headerUser.html';}	
	}
	
	$scope.loadSideMenu=function()
	{
		var user = $cookies.getObject("user");
		if(user==undefined){
			$scope.currentSideMenu = 'view/menu/sideMenuEmpty.html';
		}
		else{
		$scope.currentSideMenu = user.isAgency?'view/menu/SideMenuAgency.html':'view/menu/sideMenuEmpty.html';}	
	}
	
	$scope.getTopMenu=function()
	{
		$scope.loadTopMenu();
		return $scope.currentTopMenu;
		
	}
	
	$scope.getSideMenu=function()
	{
		$scope.loadSideMenu();
		return $scope.currentSideMenu;
	}
}]);


menu.controller("NavController", function ($scope) {
	$scope.agencyCity = "parcLv1"

	$('#nav-side').click(function () {
	    $('#menu-side').toggleClass('slide-in');
	});
	
	$scope.collapseL1 = function(){
		$('#listAgence').toggleClass('collapse');
	};
	
	$scope.collapseL2 = function(city){
		$('#'+city).toggleClass('collapse');
	};

});

menu.controller("topController", function ($scope,$rootScope) {
	$scope.connect = $rootScope.user!=undefined;
	$scope.logo = {
			id : "logo_mt",
			alt : "logo-MesTransports",
			src : "Images/mt.png"
	};
	
	$scope.expand = function(){
		console.log("click");
		 $('#menu-top').collapse() 
	};
	
	$('#nav-top').click(function () {
		console.log("click");
        
    });
});