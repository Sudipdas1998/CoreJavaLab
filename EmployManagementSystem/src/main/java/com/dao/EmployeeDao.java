package com.dao;

import com.Employee.Employee;

public interface EmployeeDao {

	// adding employee using add method
	void addEmployee();

	// deleting employee using delete method
	boolean deleteEmployee(int id);

	// finding employee using find method
	Employee findEmployee(int id);

	// display all employ using display method
	void displayAll();

}
