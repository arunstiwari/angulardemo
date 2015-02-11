'use strict';

/* Controllers */

angular.module('listApp.controllers', [])
  .controller('listController', ['$scope', function($scope) {

  	$scope.searchFilter = null;
    
    $scope.bookFilter=null;
      
    $scope.booksList = 
        [
            {
                author  : "Joseph Addison",
                name    : "Coverly Papers"
            },
            {
                author  : "Rabindranath Tagore",
                name    : "Geetanjali"
            },
            {
                author  : "Jane Austen",
                name    : "Pride and Prejudice"
            },
            {
                author  : "Premchand",
                name    : "Gaban"
            },
            {
                author  : "Leo Tolstoy",
                name    : "Anna Karenina"
            }
        ]

  	$scope.playerList = 
  	[
      {
          name: "Lionel Messi",
          team: "Barcelona",
          flag: "Argentina"
      },
      {
          name: "Cristiano Ronaldo",
          team: "Real Madrid",
          flag: "Portugal"
      },
      {
          name: "Neymar Jr.",
          team: "Barcelona",
          flag: "Brazil"
      },
      {
          name: "Thiago Silva",
          team: "PSG",
          flag: "Brazil"
      },
      {
          name: "Wayne Rooney",
          team: "Manchester United",
          flag: "England"
      },
      {
          name: "David Luis",
          team: "PSG",
          flag: "Brazil"
      },
      {
          name: "Zlatan Ibrahimović",
          team: "PSG",
          flag: "Sweden"
      },
      {
          name: "Sergio Agüero",
          team: "Manchester City",
          flag: "Argentina"
      },
      {
          name: "Pepe",
          team: "Real Madrid",
          flag: "Portugal"
      }

    ];

  }]);