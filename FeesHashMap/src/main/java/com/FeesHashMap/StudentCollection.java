package com.FeesHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class StudentCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a hashmap
		HashMap<String, StudentInformation> ccode = new HashMap<>();

		// decalring a variable
		String student;

		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating StudentInformation object
		StudentInformation cinfo = new StudentInformation();

		// adding some students

		ccode.put("1", new StudentInformation("1", "Sudip", "BCA", "50000", "30000"));
		ccode.put("2", new StudentInformation("2", "Sumon", "BTech", "500000", "300000"));
		ccode.put("3", new StudentInformation("3", "Rohan", "MA", "25000", "20000"));
		ccode.put("4", new StudentInformation("4", "Sujon", "MCA", "70000", "30000"));
		ccode.put("5", new StudentInformation("5", "Aman", "BCA", "50000", "10000"));

		System.out.println("Student Portal:");
		System.out.println("-----------------------------------");
		System.out.println("Enter the id:");
		student = sc.nextLine();

		// check : id is present in the map or not
		boolean status = ccode.containsKey(student);

		// displaying the information

		if (status) {
			System.out.println("----------------Student information---------------------");
			cinfo = ccode.get(student);
			System.out.println(cinfo);

		}

		else {
			System.out.println("-----Student not found----------");
		}

		sc.close();

	}

}
