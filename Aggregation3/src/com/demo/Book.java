package com.demo;

public class Book {
	private int No;
	private String name;
	private double price;
	private Author auth;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int no, String name, double price, Author auth) {
		super();
		No = no;
		this.name = name;
		this.price = price;
		this.auth = auth;

	}

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuth() {
		return auth;
	}

	public void setAuth(Author auth) {
		auth = auth;

	}

	@Override
	public String toString() {
		return "Book [No=" + No + ", name=" + name + ", price=" + price + ", Auth=" + auth + "]";
	}

}
