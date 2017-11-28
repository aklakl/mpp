package com.mpp.lab5.prob4;

import java.time.LocalDate;

final public class BirthInfo {
	private LocalDate dateOfBirth;
	private Person person;

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Person getPerson() {
		return person;
	}

	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}

	void setPerson(Person p) {
		person = p;
	}
}
