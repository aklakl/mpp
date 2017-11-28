package com.mpp.extra.generics;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

	private int salary;

	public Manager(String name, String id, int salary) {
		super(name, id);
		this.salary = salary;
	}

	public static void main(String[] args) {

		List<Manager> mgrList = new ArrayList<>();
		mgrList.add(new Manager("suresh", "985462", 70000));
		mgrList.add(new Manager("asd", "985462", 70000));
		mgrList.add(new Manager("suasdadresh", "985462", 70000));

		List<? extends Employee> empList = mgrList;
		empList.get(0);

	}
}
