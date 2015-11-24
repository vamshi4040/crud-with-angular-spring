var angularApp = angular.module('angularspring', [ 'ui.router', 'ui.bootstrap',
		'ngGrid', 'ui.select2', 'ui', 'ngMessages', 'angularAppControllers' ]);

angularApp.config(function($stateProvider, $urlRouterProvider) {

	$stateProvider.state('user', {
		url : '/user',
		templateUrl : 'user.html',
		controller : 'UserController'
	}).state('useredit', {
		 url: '/useredit/:id',
		templateUrl : 'user-edit.html',
		controller : 'editUserController'
	});
	$urlRouterProvider.otherwise('/user');
	
});