package com.demo;

import java.util.Scanner;

public class College {

	void average() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name");
		String Str = sc.next();
		System.out.println("Enter the student roll");
		int roll = sc.nextInt();
		System.out.println("Enter the marks of Math");
		int Math = sc.nextInt();
		System.out.println("Enter the marks of Phy");
		int Phy = sc.nextInt();
		System.out.println("Enter the marks of Chem");
		int Chem = sc.nextInt();
		System.out.println("Enter the marks of Bio");
		int Bio = sc.nextInt();

		int AVERAGE;
		char Grade;

		AVERAGE = ((Math + Phy + Chem + Bio) / 4);

		if (AVERAGE >= 80) {
			Grade = 'A';
		} else if (AVERAGE >= 60 && AVERAGE < 80) {
			Grade = 'B';
		} else if (AVERAGE >= 40 && AVERAGE < 60) {
			Grade = 'C';
		} else {
			Grade = 'D';
		}

		switch (Grade) {
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		case 'C':
			System.out.println("C");
			break;
		case 'D':
			System.out.println("D");
			break;
		default:
			System.out.println("Invalid Grade");
		}

		System.out.println("College grade is" + Grade);

	}

}
