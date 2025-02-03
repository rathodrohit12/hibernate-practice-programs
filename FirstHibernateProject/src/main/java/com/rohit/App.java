package com.rohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import com.rohit.bean.Emp;


public class App {
	public static void main( String[] args ){
        Emp emp=new Emp();
        emp.setId(3);
        emp.setName("Rohit");
        emp.setSalary(300000);
        
//        Configuration configuration=new Configuration(); 
//        configuration.configure();
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session openSession = sessionFactory.openSession();
         
        Session openSession = new Configuration().configure().buildSessionFactory().openSession();
         
         
        Transaction beginTransaction = openSession.beginTransaction();
        openSession.persist(emp);
        //int i = (int) openSession.save(emp);
        //System.out.println("id is:"+i);
        beginTransaction.commit();
        
        
    }
}
