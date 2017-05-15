package com.customer.service;

import java.util.List;

import com.customer.model.Product;

public interface ProductService {
	public List<Product> getProducts();
	public boolean saveProduct(Product prod);
	public void loadDummyProductData();
}
