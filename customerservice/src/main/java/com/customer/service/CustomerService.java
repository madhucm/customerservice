package com.customer.service;

import java.util.List;

import com.customer.model.Customer;

public interface CustomerService {
	public List<Customer> getCustomer();
	public boolean saveCustomer(Customer cust);
	public void loadDummyData();
	public Customer loadCustumerWithId(int i);
}
