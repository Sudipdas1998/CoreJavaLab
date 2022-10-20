package com.Employee;

public class Employee { // declearing a class

	// taking variable
	private int id;
	private String name;
	private float salary;

	// default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// creating paramitarized constructor using
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// taking getters setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override // override two string method
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
