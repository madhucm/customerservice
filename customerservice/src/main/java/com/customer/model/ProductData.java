package com.customer.model;

import java.util.ArrayList;
import java.util.List;

public class ProductData {
	List<Product> prodList = new ArrayList<Product>();

	public ProductData(List<Product> prodList) {
		super();
		this.prodList = prodList;
	}

	public List<Product> getProdList() {
		return prodList;
	}

	public void setProdList(List<Product> prodList) {
		this.prodList = prodList;
	}
}
