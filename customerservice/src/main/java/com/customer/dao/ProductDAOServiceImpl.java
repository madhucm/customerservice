package com.customer.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.model.Product;

@Repository("productDAOService")
public class ProductDAOServiceImpl implements ProductDAOService{

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Product").getResultList();
	}

	@Override
	public boolean save(Product prod) {
		// TODO Auto-generated method stub
		try {
			getSession().save(prod);
			return true;
		}catch(Exception e) {
			e.printStackTrace();			
		}
		return false;
	}

	@Override
	public void loadProductDummData() {
		save(new Product("Redtape shoe", "XYZ shoe seller", 600, "Men's Accessionris","Shoe"));
		save(new Product("Levis shirt", "Central", 450, "Clothing","shirt"));
		save(new Product("Titan watch x45", "Tital Jayanagar", 6600, "Men's Accessiories","Watch"));
		save(new Product("How to Hibernate in java", "Book paradise", 388, "Books","Books"));
		save(new Product("iPhone 7s", "Relience Digital", 56000, "Electronics","Mobile"));
		
	}
	
	


}
