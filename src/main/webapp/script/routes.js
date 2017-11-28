/**
 * 
 */

var routes = angular.module('routes', ['ngRoute', 'account']);

routes.config(function($routeProvider) {
	
	$routeProvider
	.when("/", {
		templateUrl:"view/users/search.html"
    })
    .when("/login", {
    	templateUrl : "view/users/login.html",
    	controller : "AccountController"
    })
    .when("/signin", {
    	templateUrl : "view/users/signin.html",
    	controller : "AccountController"
    })
    .when('/registration/childAgence', {
        templateUrl : 'html/agency/agencieyPage.html',
        controller  : 'Resgistration'
    })
    .when('/agency', {
        templateUrl : 'view/agency/agencyView.html',
    })
    .when('/add/vehicule', {
        templateUrl : 'html/agency/addNewVehicule.html',
        controller  : 'vehiculeRegisterForm'
    })
	.when('/view/vehicule', {
        templateUrl : 'html/agency/vehiculesViewPage.html',
        controller  : 'vehiculeView'
    });
	
});
