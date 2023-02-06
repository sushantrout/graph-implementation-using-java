package com.example;

import java.util.PriorityQueue;

import com.example.model.Employee;

public class PriorityQueueImplementation {
	public static void main(String[] args) {
		PriorityQueue<Employee> employees = new PriorityQueue<>();

		Employee e1 = new Employee("A", 1);
		Employee e2 = new Employee("B", 3);
		Employee e3 = new Employee("C", 2);
		Employee e4 = new Employee("D", 5);
		Employee e5 = new Employee("E", 6);
		Employee e6 = new Employee("F", 8);
		Employee e7 = new Employee("G", 10);
		Employee e8 = new Employee("H", 4);
		Employee e9 = new Employee("I", 7);
		Employee e10 = new Employee("J", 9);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println();
		System.out.println("Print By Priority Queue");
		while(!employees.isEmpty()) {
			System.out.println(employees.remove());
		}

	}
}
