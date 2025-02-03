package com.rohit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.rohit.bean.UserBean;
import com.rohit.session.SessionFactoryProvider;

public class UserDaoImpl implements UserDao {

	public void registerUser(UserBean bean) {

		System.out.println(bean);

		Transaction transaction = null;
		try (Session session = SessionFactoryProvider.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			System.out.println(session);

			session.persist(bean);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		}
	}

	

	@Override
	public void fetchUserRecord() {
		Session session = SessionFactoryProvider.getSessionFactory().openSession();
		UserBean userBean = session.get(UserBean.class, 2);
		System.out.println(userBean);

//	       Query query =session.createQuery("from user123");
//	       List list = query.list();
//	       list.forEach(a->System.out.println(a));

	}

	@Override
	public boolean userAuthentication(UserBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserBean> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
		
	}
		
}
