package com.mpp.lab7.prob5;

public interface UnFlyable {
	
	default void fly(){
		System.out.println("Cannot fly");
	}

}
