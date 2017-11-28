package com.mpp.lab5.prob4;

import java.time.LocalDate;

/** Typical use: Loading data from database into class model */
final public class PersonBirthInfoFactory {
	private PersonBirthInfoFactory() {
	}

	public static IPersonBirthInfo createPersonBirthInfo(String name, LocalDate date) {

		BirthInfo birthInfo = new BirthInfo(date);
		Person person = new Person(name);
		birthInfo.setPerson(person);
		person.setBIrthInfo(birthInfo);

		return new PersonBirthInfoImpl(person, birthInfo);

	}
}
