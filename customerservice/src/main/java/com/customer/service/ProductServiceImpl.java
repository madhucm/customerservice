package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.dao.ProductDAOService;
import com.customer.model.Product;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAOService productDAOService;
	
	@Override
	public List<Product> getProducts() {
		return productDAOService.getAllProduct();
	}

	@Override
	public boolean saveProduct(Product prod) {
		return productDAOService.save(prod);
		
	}

	@Override
	public void loadDummyProductData() {
		productDAOService.loadProductDummData();
		
	}

}
