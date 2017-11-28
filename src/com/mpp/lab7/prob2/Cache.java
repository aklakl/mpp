package com.mpp.lab7.prob2;

public interface Cache {
	//shouldn't be static
	default public long timeout() {
		//seconds
		return 1;
	}
}
