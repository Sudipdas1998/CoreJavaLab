package com.demo;

public class Author {
	private String Author;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String author) {
		super();
		Author = author;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	@Override
	public String toString() {
		return "Author [Author=" + Author + "]";
	}

}
