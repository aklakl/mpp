package com.mpp.lab7.prob5;

public interface Squeakable {
	
	default void quack(){
		System.out.println("squeaking");
	}
}
