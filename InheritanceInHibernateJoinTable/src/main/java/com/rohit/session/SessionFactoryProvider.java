package com.rohit.session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {

	static SessionFactory sessionFactory=null;
	private SessionFactoryProvider() {}

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			try {
				sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				return sessionFactory;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}  else {
			return sessionFactory;
		}
	return sessionFactory;

	}
}
