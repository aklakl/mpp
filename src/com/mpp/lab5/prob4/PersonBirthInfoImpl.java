package com.mpp.lab5.prob4;

final public class PersonBirthInfoImpl implements IPersonBirthInfo {

	private Person person;
	private BirthInfo birthInfo;

	public PersonBirthInfoImpl(Person p, BirthInfo b) {
		this.person = p;
		this.birthInfo = b;
	}

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return this.person;
	}

	@Override
	public BirthInfo getBirthInfo() {
		// TODO Auto-generated method stub
		return this.birthInfo;
	}

}
