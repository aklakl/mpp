package com.mpp.lab5.prob4;

final public class Person {

	public String getName() {
		return name;
	}

	public BirthInfo getBirthInfo() {
		return birthInfo;
	}

	private String name;
	private BirthInfo birthInfo;

	Person(String name) {
		this.name = name;
	}

	void setBIrthInfo(BirthInfo info) {
		birthInfo = info;
	}
}