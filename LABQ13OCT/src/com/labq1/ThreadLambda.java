package com.labq1;

//declaring a class
public class ThreadLambda {

	// calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " :thread is running");// printing

			}

		};

		Thread t1 = new Thread(r1, "Sudip");
		System.out.println("------------Without Lambda------------");// printing
		t1.start();

		// Thread with lamda

		Runnable r2 = () -> {
			System.out.println(Thread.currentThread().getName() + " :thread is running");
		};

		Thread t2 = new Thread(r2, "Sudip");
		System.out.println("------------With Lambda------------");// printing
		t2.start();

	}

	// end of main

}
