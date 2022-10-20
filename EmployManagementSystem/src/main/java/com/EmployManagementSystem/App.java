package com.EmployManagementSystem;

import java.util.Scanner;

import com.Employee.Employee;
import com.dao.EmployeeDao;
import com.dao.impl.EmployeeDaoImpl;

public class App { // declearing a class
	// taking inputs
	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Search Employee");
		System.out.println("4. Display all the Employee");
		System.out.println("5.Exit");
	}

	public static void main(String[] args) {
		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of impl
		EmployeeDao office = new EmployeeDaoImpl();

		// declaring varible choice
		int ch = 0;
		// taking do while loop
		do {
			menu();
			ch = sc1.nextInt();
			// taking switch case
			switch (ch) {
			case 1:
				office.addEmployee();
				System.out.println("Employee inserted..........");
				break;
			case 2:
				System.out.println("Enter the Id to be deleted:");
				int id = sc1.nextInt();
				boolean flag = office.deleteEmployee(id);
				if (flag)
					System.out.println("Employee deleted.......");
				else
					System.out.println("Employee not found......");
				break;
			case 3:
				Employee ee = null;
				System.out.println("Enter the Id to be searched:");
				id = sc1.nextInt();
				ee = office.findEmployee(id);
				if (ee == null)
					System.out.println("Employee not found.......");
				else
					System.out.println(
							"Student Id :" + ee.getId() + "  Name:" + ee.getName() + "   Salary:" + ee.getSalary());
				break;
			case 4:
				office.displayAll();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input.......");

			}

		} while (ch != 6);

		// end of do while

		sc1.close();

	}
}
