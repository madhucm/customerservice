
angular.module('myApp', []).controller('AppController', function ($scope,$http) {
    var self=this;
    var name1=$scope.name;
    var age=self.age;
    var email=self.email;
   
    var url="http://localhost:8080/customers";
    self.sendData = function() {
         
      var param = JSON.stringify({
          name:self.name,
          age:self.age,
          email:self.email
      });
        
      
      $http.post(url,param,{
                headers: {
                   'Content-Type': 'application/json; charset=utf-8'
                }
            }).then(
      
       function (response) {
    	   		alert(response.status);
                if(200 == response.status)
                    alert("Success");
            },
            function(errResponse){
                console.error('Error while creating User');
                alert(errResponse);
            }
      );
          
     
    };
    
    self.getData = function() {
        $http.get(url).
      success(function(response) {
    	  $scope.customers = response;
       }).
       failure(function(error) {
    	  alert(error); 
       });
    };
 });