
angular.module('myApp', ['ngMaterial','ngFileUpload']).controller('AppController', function ($scope,$http,$mdToast) {
	var self=this;

	var url="http://localhost:8080/customers";
	var produrl="http://localhost:8080/products";


	$scope.customers=[];
	$scope.products=[];

	self.sendCustData = function() {

		$scope.customers.push({'name':self.name,'age':self.age,'email':self.email});

		$mdToast.show(
				$mdToast.simple()
				.textContent('Customer data inserted')
				.position('bottom' )
				.hideDelay(3000)
		);
		var custparam = JSON.stringify({
			name:self.name,
			age:self.age,
			email:self.email
		});



		$http.post(url,custparam,{
			headers: {
				'Content-Type': 'application/json; charset=utf-8'
			}
		}).then(

				function (response) {

					if(200 == response.status)
						alert("Success");
				},
				function(errResponse){
					console.error('Error while creating User');
					alert(errResponse);
				}
		);

		self.name='';
		self.age='';
		self.email='';
	};

    
	self.sendProdData = function(pic) {

        
		var prodparam = JSON.stringify({
			productName:self.name,
			seller:self.seller,
			price:self.price,
			category:self.category,
			hashTag:self.hashtag
           
		});
        
       

		$http.post(produrl,prodparam,{
			headers: {
				'Content-Type': 'application/json; charset=utf-8'
			}
		}).then(

				function (response) {

					if(200 == response.status)
						alert("Success");
				},
				function(errResponse){
					console.error('Error while creating User');
					alert(errResponse);
				}
		);

		
$mdToast.show(
				$mdToast.simple()
				.textContent('Customer data inserted')
				.position('bottom' )
				.hideDelay(3000)
		);
				$scope.products.push({'name':self.name,'seller':self.seller,'price':self.price,'category':self.category,'hashtag':self.hashtag});

				$scope.product.name='';
				$scope.product.seller='';
				$scope.product.price='';
				$scope.product.category='';
				$scope.product.hashtag='';

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