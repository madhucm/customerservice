package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.facade.CustomerFacade;
import com.customer.model.Customer;
import com.customer.model.ProductData;

@RestController
class CustomerServiceRestController {

	@Autowired
	CustomerFacade customerFacade;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)    
    public ResponseEntity<List<Customer>> showCustomers() {
        return new ResponseEntity<List<Customer>>(customerFacade.getCustomersInDB(),HttpStatus.OK);
    }
    
    @RequestMapping(value = "/products", method = RequestMethod.GET)    
    public ResponseEntity<ProductData> showProducts() {    	
        return new ResponseEntity<ProductData>(customerFacade.getProductsInDB(),HttpStatus.OK);
    }
    
    @RequestMapping(value="/customers",method=RequestMethod.POST)
    public ResponseEntity<Boolean> saveCustomerData(@RequestBody Customer cust){
    	return new ResponseEntity<Boolean>(customerFacade.saveCustomerData(cust),HttpStatus.OK);
    }
    
    @RequestMapping(value="/customers/{id}",method=RequestMethod.GET)
    public ResponseEntity<Customer> getCustomer(@PathVariable int id){
    	return new ResponseEntity<Customer>(customerFacade.getCustomerWithId(id),HttpStatus.OK);
    }
    
    @RequestMapping(value = "/dummydata", method = RequestMethod.GET)    
    public ResponseEntity<Void> loadDummyData() {
    	customerFacade.loadDummyData();
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/dummydataproduct", method = RequestMethod.GET)    
    public ResponseEntity<Void> loadDummyProductData() {
    	customerFacade.loadProductDummyData();
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
   

}
