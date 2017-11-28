package com.mpp.lab3.prob1;

public class PersonWithJob {

	private Person person;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public Person getPerson() {
		return person;
	}

	PersonWithJob(Person p, double s) {
		salary = s;
		person = p;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof PersonWithJob))
			return false;
		
		PersonWithJob p = (PersonWithJob) aPerson;
		boolean isEqual = this.getPerson().getName()
				.equals(p.getPerson().getName())
				&& this.getSalary() == p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {

		Person p1 = new Person("Joe");
		PersonWithJob pj1 = new PersonWithJob(p1, 30000);
		PersonWithJob pj2 = new PersonWithJob(p1, 90000);

		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("----------->> " + p1.equals(pj1));
		System.out.println("----------->> " + pj1.equals(pj2));
	}

}
