package com.customer.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.model.Customer;
import com.customer.model.Product;
import com.customer.model.ProductData;
import com.customer.service.CustomerService;
import com.customer.service.ProductService;

@Component
public class CustomerFacade {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	ProductService productService;
	
	public List<Customer> getCustomersInDB() {
		return customerService.getCustomer();
	}
	
	public boolean saveCustomerData(Customer cust) {
		return customerService.saveCustomer(cust);
	}
	
	public ProductData getProductsInDB() {
		return new ProductData(productService.getProducts());
	}
	
	public boolean saveProductData(Product prod) {
		return productService.saveProduct(prod);
	}
	
	public void loadDummyData() {
		customerService.loadDummyData();
	}
	
	public void loadProductDummyData() {
		productService.loadDummyProductData();
	}
	
	public Customer getCustomerWithId(int id){		
		return customerService.loadCustumerWithId(id);
	}
}
