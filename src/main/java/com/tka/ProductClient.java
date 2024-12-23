package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductClient {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		cfg.addAnnotatedClass(Product.class);
		cfg.addAnnotatedClass(ProductDetails.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		ProductDetails pd = new ProductDetails(1,"lenovopvtlmtd", "3 years");
		Product p1 = new Product("macbook pro", 1000000, pd);
		session.save(p1);
		session.beginTransaction().commit();

	}

}
