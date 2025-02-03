package com.rohit;

import com.rohit.bean.Emp;
import com.rohit.dao.EmpDao;

public class App {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId(102);
		emp.setName("abc");
		emp.setSalary(100000);
		
		EmpDao dao = new EmpDao();
		dao.SaveEmp(emp);
	}
}
