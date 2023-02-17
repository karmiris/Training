package com.dao;

import org.hibernate.SessionFactory;

import com.resource.DbResource;

public class ProductDao {

	public int storeProduct (Product product) {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession()
	}
	
}
