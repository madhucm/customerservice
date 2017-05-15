package com.customer.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerData {
	List<Customer> custList = new ArrayList<Customer>();

	public CustomerData(List<Customer> custList) {
		super();
		this.custList = custList;
	}

	public List<Customer> getCustList() {
		return custList;
	}

	public void setCustList(List<Customer> custList) {
		this.custList = custList;
	}
	
}
