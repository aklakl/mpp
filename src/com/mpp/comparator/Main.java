package com.mpp.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Comparator<Student> comparator = new Comparator<Student>() {
		//
		// @Override
		// public int compare(Student s1, Student s2) {
		// return s1.getName().compareTo(s2.getName());
		// }
		// };

		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("bale"));
		studentList.add(new Student("suresh"));
		studentList.add(new Student("ronaldo"));
		studentList.add(new Student("messi"));

		// studentList.sort(comparator);
		studentList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
		
		Student[] a = studentList.toArray(new Student[studentList.size()]);

		System.out.println("" + Arrays.toString(a));

	}

}
