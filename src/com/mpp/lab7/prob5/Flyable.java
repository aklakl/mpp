package com.mpp.lab7.prob5;

public interface Flyable {
	
	default void fly(){
		System.out.println("Flying with wings");
	}

}
