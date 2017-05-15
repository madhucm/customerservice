package com.customer.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.model.Customer;


@Repository("customerDAOService")
public class CustomerDAOServiceImpl implements CustomerDAOService {

		
	@Autowired
	private SessionFactory sessionFactory;
	
	

	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	static List<Customer> tempList = new ArrayList<Customer>();
	
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Customer").getResultList();
	}

	@Override
	public boolean save(Customer cust) {
		try {
			getSession().save(cust);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void loadDummData() {
		save(new Customer("madhu",33,"madhucm@gmail.com"));
		save(new Customer("Khushi",33,"khushi@gmail.com"));
		save(new Customer("neetha",33,"neetha@gmail.com"));
		save(new Customer("manju",33,"manju@gmail.com"));
		save(new Customer("zzz",33,"zzz@gmail.com"));
		
	}

	@Override
	public Customer getCustomerWithId(int id) {
		// TODO Auto-generated method stub
		return getSession().get(Customer.class, id);
	}

}
