package com.customer.dao;

import java.util.List;

import com.customer.model.Customer;

public interface CustomerDAOService {
	public List<Customer> getAllCustomers();
	public boolean save(Customer cust);
	public void loadDummData();
	public Customer getCustomerWithId(int id);
}
