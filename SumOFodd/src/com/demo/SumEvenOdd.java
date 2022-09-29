package com.demo;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, sumE = 0, sumO = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements in array:");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++)

		{
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if ((a[i]) % 2 == 0) {
				sumE = sumE + a[i];
			} else {
				sumO = sumO + a[i];
			}
		}

		System.out.println("Sum of Even Number:" + sumE);
		System.out.println("Sum of Odd Number:" + sumO);

	}

}
