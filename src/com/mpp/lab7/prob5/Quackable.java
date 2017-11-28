package com.mpp.lab7.prob5;


public interface Quackable {
	
	default void quack(){
		System.out.println("quacking");
	}

}
