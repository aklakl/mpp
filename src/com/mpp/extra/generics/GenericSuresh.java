package com.mpp.extra.generics;

public class GenericSuresh<T, S, U> {

	private T id;
	private S age;
	private U email;

	public GenericSuresh(T t, S s, U u) {
		this.id = t;
		this.age = s;
		this.email = u;
	}

	public T getId() {
		return id;
	}

	public S getAge() {
		return age;
	}

	public U getEmail() {
		return email;
	}

}
