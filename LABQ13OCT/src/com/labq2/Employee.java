package com.labq2;

import java.util.Scanner;

public class Employee {
	void employee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee name");
		String Name = sc.nextLine();
		System.out.println("Enter the age of the Employee");
		int Age = sc.nextInt();
		System.out.println("Enter the Id of the Employee");
		int ID = sc.nextInt();
		System.out.println("Details of the employee");
		System.out.println("Name:" + Name);
		System.out.println("Age:" + Age);
		System.out.println("ID:" + ID);
	}
}