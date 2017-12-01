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
    	templateUrl : "view/login.html",
    	controller : "AccountController"
    })
    .when("/signin", {
    	templateUrl : "view/signin.html",
    	controller : "AccountController"
    })
    .when('/agency/add/childAgency', {
        templateUrl : 'view/agency/addNewChildAgency.html',
        controller  : 'childRegistration',
        activetab : 'addchildAgency'
    })
    .when('/agency', {
        templateUrl : 'view/agency/agencyView.html',
        activetab : 'main'
    })
    .when('/agency/add/vehicule', {
        templateUrl : 'view/agency/addNewVehicule.html',
        controller  : 'addVehiculeForm',
        activetab : 'addVehicules'
    })
	.when('/agency/view/vehicule', {
        templateUrl : 'view/agency/viewVehicule.html'
    })
	.when('/agency/view/chagency/:idA', {
        templateUrl : 'view/agency/chidAgencyView.html',
        activetab : 'childAgency'
    })
    .when('/agency/update/:idupdate', {
    	templateUrl : 'view/agency/addNewChildAgency.html',
        activetab : 'main'
    })
	
});
