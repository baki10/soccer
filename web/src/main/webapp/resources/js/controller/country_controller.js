'use strict';

App.controller('CountryController', ['$scope', 'CountryService', function($scope, CountryService) {
    var self = this;
    self.country={id:null,name:'',image:''};
    self.countries=[];

    // --------------- service delegation methods start --------------------
    
    self.fetchAllCountries = function(){
        CountryService.fetchAllCountries()
            .then(
                function(d) {
                    self.countries = d;
                },
                function(errResponse){
                    console.error('Error while fetching country');
                }
            );
    };

    self.createCountry = function(country){
        CountryService.createCountry(country)
            .then(
                self.fetchAllCountries,
                function(errResponse){
                    console.error('Error while creating country.');
                }
            );
    };

    self.updateCountry = function(country, id){
        CountryService.updateCountry(country, id)
            .then(
                self.fetchAllCountries,
                function(errResponse){
                    console.error('Error while updating country.');
                }
            );
    };

    self.deleteCountry = function(id){
        CountryService.deleteCountry(id)
            .then(
                self.fetchAllCountries,
                function(errResponse){
                    console.error('Error while deleting country.');
                }
            );
    };
    
    // --------------- service methods end --------------------

    //init countries
    self.fetchAllCountries();

    self.submit = function() {
        if(self.country.id===null){
            console.log('Saving New country', self.country);
            self.createCountry(self.country);
        }else{
            self.updateCountry(self.country, self.country.id);
            console.log('country updated with id ', self.country.id);
        }
        self.reset();
    };

    self.edit = function(id){
        console.log('id to be edited', id);
        for(var i = 0; i < self.countries.length; i++){
            if(self.countries[i].id === id) {
                self.country = angular.copy(self.countries[i]);
                break;
            }
        }
    };

    self.remove = function(id){
        console.log('id to be deleted', id);
        if(self.country.id === id) {//clean form if the player to be deleted is shown there.
            self.reset();
        }
        self.deleteCountry(id);
    };

    self.reset = function(){
        self.country={id:null,name:'', image:''};
        $scope.myForm.$setPristine(); //reset Form
    };

}]);