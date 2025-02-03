package com.rohit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.rohit.bean.Emp;
import com.rohit.dbcon.ConnectionProvider;

public class EmpDao {
	Connection connection = ConnectionProvider.getConnection();

	public void SaveEmp(Emp emp) {
		try {

			PreparedStatement statement = connection.prepareStatement("insert into emp values(?,?,?)");
			statement.setInt(1, emp.getId());
			statement.setString(2, emp.getName());
			statement.setDouble(3, emp.getSalary());
			int executeUpdate = statement.executeUpdate();
			if (executeUpdate > 0)
				System.out.println("record saved.......");
			else
				System.out.println("record not Saved......");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
