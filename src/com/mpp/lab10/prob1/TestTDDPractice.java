package com.mpp.lab10.prob1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestTDDPractice {

	@Test
	public void test() {

		List<String> input = Arrays.asList("apple","ball","cat");
		List<String> result = new TDDPractice().changeLastCharToUpper(input);
		assertEquals(Arrays.asList("applE","balL","caT"), result);

	}

}
