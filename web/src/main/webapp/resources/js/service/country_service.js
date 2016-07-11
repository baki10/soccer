'use strict';

App.factory('CountryService', ['$http', '$q', function($http, $q){

    return {

        fetchAllCountries: function() {
            return $http.get('http://localhost:8080/mvc/rest/countries/')
                .then(
                    function(response){
                        return response.data;
                    },
                    function(errResponse){
                        console.error('Error while fetching countries');
                        return $q.reject(errResponse);
                    }
                );
        },

        createCountry: function(country){
            return $http.post('http://localhost:8080/mvc/rest/countries/', country)
                .then(
                    function(response){
                        return response.data;
                    },
                    function(errResponse){
                        console.error('Error while creating country');
                        return $q.reject(errResponse);
                    }
                );
        },

        updateCountry: function(country, id){
            return $http.put('http://localhost:8080/mvc/rest/countries/'+id, country)
                .then(
                    function(response){
                        return response.data;
                    },
                    function(errResponse){
                        console.error('Error while updating country');
                        return $q.reject(errResponse);
                    }
                );
        },

        deleteCountry: function(id){
            return $http.delete('http://localhost:8080/mvc/rest/countries/'+id)
                .then(
                    function(response){
                        return response.data;
                    },
                    function(errResponse){
                        console.error('Error while deleting country');
                        return $q.reject(errResponse);
                    }
                );
        }

    };

}]);