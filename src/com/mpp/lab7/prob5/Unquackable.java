package com.mpp.lab7.prob5;

public interface Unquackable {
	
	default void quack(){
		System.out.println("cannot quack");
	}

}
