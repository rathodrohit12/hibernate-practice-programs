package com.rohit.dao;

import java.util.List;

import com.rohit.bean.UserBean;


public interface UserDao {
	public boolean userAuthentication(UserBean bean);
	public void registerUser(UserBean bean);
	public List<UserBean> getAllUsers();
	public void fetchUserRecord();
	
	
}
