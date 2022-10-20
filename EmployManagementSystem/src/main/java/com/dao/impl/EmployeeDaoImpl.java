package com.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Employee.Employee;
import com.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> eList = new ArrayList<Employee>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);

	// creating employee object
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		Employee ee = new Employee();
		// input the details of employee
		System.out.println("Enter the id :");
		ee.setId(sc.nextInt());
		System.out.println("Enter the name :");
		ee.setName(sc.next());
		System.out.println("Enter the Salary :");
		ee.setSalary(sc.nextFloat());

		// adding the employee into the collection
		eList.add(ee);
		System.out.println(eList);
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employee edel = null;
		// finding the employee
		for (Employee e : eList) {
			if (e.getId() == id)
				edel = e;
		}
		// check whether the record is present
		if (edel == null)
			status = false;
		else {
			eList.remove(edel);
			status = true;
		}

		return status;
	}

	@Override
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		Employee efind = null;
		// finding the employee
		for (Employee e : eList) {
			if (e.getId() == id)
				efind = e;

		}
		return efind;

	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		// display all employee
		for (Employee e : eList) {
			System.out.println(e);
		}
	}

}