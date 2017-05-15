<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>  
<title>Controller Demo</title>  
   <head>
  <title>Angular JS Table</title>
  <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
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
</head>
<body>
<div ng-controller="AppController as customer">
<table border = "0">
        <tr>
           <td>Enter Customer name:</td>
           <td><input type = "text" ng-model = "customer.name"></td>
        </tr>

        <tr>
           <td>Enter Customer age: </td>
           <td>
              <input type = "text" ng-model = "customer.age">
           </td>
        </tr>
        <tr>
          <td>Enter Customer email: </td>
           <td>
              <input type = "text" ng-model = "customer.email">
           </td>
        </tr>
           <tr>

           <td>
               <button ng-click="customer.sendData()">Send Data</button>
           </td>
           <td>
               <button ng-click="customer.getData()">Get Data</button>
           </td>
        </tr>
        </table>  
        
         <table>
      <tr>
        <th>Name</th>
		<th>Age</th>
        <th>Email</th>
      </tr>
      <tr ng-repeat="customer in customers | orderBy: 'code' ">
        <td>{{customer.name}}</td>
		<td>{{customer.age}}</td>
        <td>{{customer.email}}</td>
      </tr>
    </table>
</div>
</body>
</html>