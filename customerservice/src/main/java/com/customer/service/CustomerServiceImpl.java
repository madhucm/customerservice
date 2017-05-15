package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.dao.CustomerDAOService;
import com.customer.model.Customer;

@Service("customService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDAOService customerDAOService;
	
	@Override
	public List<Customer> getCustomer() {
		return customerDAOService.getAllCustomers();
	}

	@Override
	public boolean saveCustomer(Customer cust) {		
		return customerDAOService.save(cust);
	}
	
	public void loadDummyData() {
		customerDAOService.loadDummData();
	}

	@Override
	public Customer loadCustumerWithId(int i) {
		return customerDAOService.getCustomerWithId(i);
		
	}

}
