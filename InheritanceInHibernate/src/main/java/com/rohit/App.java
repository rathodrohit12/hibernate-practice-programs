package com.rohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rohit.bean.Employee;
import com.rohit.bean.Person;
import com.rohit.bean.Student;
import com.rohit.session.SessionFactoryProvider;


public class App {
    public static void main( String[] args ){
         SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
         Session session = sessionFactory.openSession();
         
         Transaction transaction = session.beginTransaction();
         
         Person person = new Person();                 
         person.setName("Rohit");
         session.persist(person);
         
         Student s=new Student("Java", 20000);
         session.persist(s);
         
         Employee employee = new Employee("Developer",50000);
         session.persist(employee);
         
         transaction.commit();
         
         
    }
}
