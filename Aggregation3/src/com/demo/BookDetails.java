package com.demo;

public class BookDetails {
	static void display(Book s) {

		System.out.println(s);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book s1 = new Book(1, "Java", 500, new Author("Sudip"));

		System.out.println("Details are:");
		display(s1);
	}
}
