<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="myApp">
<head>  
<title>Customer Service</title>  
 
  
  <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/angular_material/1.0.0/angular-material.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-animate.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-aria.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-messages.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angular_material/1.0.0/angular-material.min.js"></script>
	  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
     <script src="https://cdnjs.cloudflare.com/ajax/libs/danialfarid-angular-file-upload/9.0.9/ng-file-upload.min.js"></script>
          <script src="/static/js/controller/customer_controller.js"></script>

  <style>

     table, th , td {
        border: 1px solid grey;
        border-collapse: collapse;
        padding: 5px;
     }

     table tr:nth-child(odd) {
        background-color: #f2f2f2;
     }

     table tr:nth-child(even) {
        background-color: #ffffff;
     }
  </style>

</head>

<body>

      <md-toolbar class="md-hue-2"><div class="md-toolbar-tools"><h2 class="md-flex">Customer Service</h2></div></md-toolbar>
      <hr/>
     
    <md-tabs md-dynamic-height md-border-bottom>
        <md-tab label="Customer">
            <div layout="row" ng-controller="AppController as customer" ng-cloak>
                <div flex>
                <md-input-container class="md-block">
          <label>Customer Name</label>
          <input ng-model="customer.name">
        </md-input-container>

        <md-input-container class="md-block">
          <label>Age</label>
          <input ng-model="customer.age">
        </md-input-container>
            
        <md-input-container class="md-block">
          <label>Email</label>
          <input ng-model="customer.email">
        </md-input-container>
            
        <section layout='row'>
            <md-button class="md-raised md-primary" ng-click='customer.sendCustData()' >Send Data</md-button>    
        </section>
                </div>
         <div flex>
                 <md-table-container>
                <table md-table md-row-select multiple>
                    <thead md-head>
                        <tr md-row>
                            <th md-column md-numeric>Name</th>
                            <th md-column md-numeric>Age</th>
                            <th md-column md-numeric>Email</th>
                        </tr>
                    </thead>
                    <tbody md-body>
                        <tr md-row ng-repeat="cust in customers">
                            <td md-cell>{{cust.name}}</td>
                            <td md-cell>{{cust.age}}</td>
                            <td md-cell>{{cust.email}}</td>
                        </tr>
                    </tbody>
                </table>
            </md-table-container>
                </div>
            
                </div>
        </md-tab>
         <md-tab label="Product">
              <div layout="row" ng-controller="AppController as product" ng-cloak>
                  <div flex>
                      <md-input-container class="md-block">
          <label>Product Name</label>
          <input ng-model="product.name">
        </md-input-container>
                  
                  <md-input-container class="md-block">
          <label>Seller</label>
          <input ng-model="product.seller">
        </md-input-container>
                  
                  <md-input-container class="md-block">
          <label>Price</label>
          <input ng-model="product.price">
        </md-input-container>
                  
                  <md-input-container class="md-block">
          <label>Category</label>
          <input ng-model="product.category">
        </md-input-container>
                  
                  <md-input-container class="md-block">
          <label>Hashtag</label>
          <input ng-model="product.hashtag">                  
        </md-input-container>
                      
                       <!--md-input-container class="md-block">
          
          <input type="file" ngf-select="" ng-model="product.pic" name="file" ngf-accept="'image/*'" required="" multiple>                  
        </md-input-container-->
                      
                  
                   <section layout='row'>
            <md-button class="md-raised md-primary" ng-click='product.sendProdData(product.pic)' >Send Data</md-button>    
        </section>
                  
                  </div>
                  <div flex>
                      <md-table-container>
                <table md-table md-row-select multiple>
                    <thead md-head>
                        <tr md-row>
                            <th md-column md-numeric>Product Name</th>
                            <th md-column md-numeric>Seller</th>
                            <th md-column md-numeric>Price</th>
                            <th md-column md-numeric>Category</th>
                            <th md-column md-numeric>Hash Tag</th>
                        </tr>
                    </thead>
                    <tbody md-body>
                        <tr md-row ng-repeat="product in products">
                            <td md-cell>{{product.name}}</td>
                            <td md-cell>{{product.seller}}</td>
                            <td md-cell>{{product.price}}</td>
                            <td md-cell>{{product.category}}</td>
                            <td md-cell>{{product.hashtag}}</td>
                        </tr>
                    </tbody>
                </table>
            </md-table-container> 
                  </div>
            
                  
             </div>
        </md-tab>
    </md-tabs>


</body>
</html>