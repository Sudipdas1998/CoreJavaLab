package com.labq2;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	void salary2() {
		System.out.println("Hourly Employee charges RS 100 Per Hour");
		System.out.println("Enter The Total Hours");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int Salary = time * 100;
		System.out.println("Salary of a Hourly Employ is:" + Salary);
	}
}