//Controller for child agency view
agency.controller("childAgencyView",function($scope,$http,$cookies,$rootScope,$routeParams,$location){

    //get selected agency data
	$scope.currentIdAgency = $routeParams.idA
    $scope.currentAgency = $rootScope.listChildAgencies[$scope.currentIdAgency];


    //Change location to the update view
    $scope.changeLocationToUpdatePage=function(){
        $location.path('/agency/update/'+$scope.currentIdAgency);
    };

    //responsive graph
    window.onresize = function()
    {
        var d3 = Plotly.d3;

        var gd3 = d3.select('#benefitGlobal');
        var gd = gd3.node();
        Plotly.Plots.resize(gd);
    };

    //Date Range Piker init
    $('input[name="daterange"]').daterangepicker({
        "startDate": $rootScope.start,
        "endDate": $rootScope.end,
        timePicker: true,
        timePicker24Hour: true,
        timePickerIncrement: 30,
        "showWeekNumbers": true,
        locale: {
            format: 'DD/MM/YYYY H:mm'
        }
    }, function(start, end, label) {
        $rootScope.start = start;
        $rootScope.end = end;
        $rootScope.loadAgenciesProfits(true,$scope.currentIdAgency  );
    });


    //init graph
    $rootScope.updateGaphBenefitByDate();

});
