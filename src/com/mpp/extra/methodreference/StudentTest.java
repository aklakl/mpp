package com.mpp.extra.methodreference;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StudentTest {

	List<String> sList = Arrays.asList("suresh","sanotosh","rojan","sanjay");
	String checker  = "suresh";
	
	@Test
	public void isStudentEnrolled(){
		assertTrue(returnValue(checker));
	}
	
	@Test
	public void isStudentEnrolled2(){
		assertTrue(returnValue("asas"));
	}
	
	public boolean returnValue(String s){
		return sList.contains(s);
	}
	

}
