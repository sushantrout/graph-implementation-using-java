package com.example.model;

public class Employee implements Comparable<Employee>{
	String name;
	int rollNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rollNumber=" + rollNumber + "]";
	}

	public Employee(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	@Override
	public int compareTo(Employee o) {
		return rollNumber - o.getRollNumber();
	}

}
