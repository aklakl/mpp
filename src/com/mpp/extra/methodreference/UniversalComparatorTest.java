package com.mpp.extra.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Santosh
 */
public class UniversalComparatorTest {

	public static void main(String[] args) {

		List<Object> st = new ArrayList<>();
		UniversalComparator uni = new UniversalComparator();

		st.add("ram");
		st.add("shyam");
		st.add("hari");
		// st.add(5);
		// st.add(4);
		// st.add(3);

		// st.sort((a,b) -> uni.compare(a, b));
		Collections.sort(st, (a, b) -> uni.compare(a, b));
		System.out.println(st);

	}

}