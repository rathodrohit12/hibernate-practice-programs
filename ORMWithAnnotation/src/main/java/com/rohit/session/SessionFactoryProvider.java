package com.rohit.session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

final public class SessionFactoryProvider {

	private SessionFactoryProvider() {
		
	}
	
	static SessionFactory sessionFactory;
	
    public static SessionFactory getSessionFactory() {
    	
    	if(sessionFactory == null) {
    		try {
    		   sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    		   return sessionFactory;
            } catch (Exception e) {
                e.printStackTrace();
            }
    	}else {
    		return sessionFactory;
    	}
    	
    	return sessionFactory;
    	
    	
    }

	
}
