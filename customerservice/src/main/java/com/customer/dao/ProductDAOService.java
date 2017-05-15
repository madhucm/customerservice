package com.customer.dao;

import java.util.List;

import com.customer.model.Product;

public interface ProductDAOService {
	public List<Product> getAllProduct();
	public boolean save(Product prod);
	public void loadProductDummData();
}
