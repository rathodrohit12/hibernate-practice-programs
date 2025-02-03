package com.rohit;



import com.rohit.bean.Emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main( String[] args ){
        Emp emp=new Emp();
        emp.setId(101);
        emp.setName("Rohit");
        emp.setSalary(200000);
       
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session openSession = sessionFactory.openSession();
        openSession.save(emp);
        Transaction transaction = openSession.beginTransaction();
        transaction.commit();
        
        
    }
}
