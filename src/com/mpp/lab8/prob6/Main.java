package com.mpp.lab8.prob6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		// A. (Employee e) -> e.getName()
		Function<Employee, String> dynamicGetName = (Employee e) -> e.getName();
		Function<Employee, String> dynamicGetName2 = Employee::getName;
		// Method reference type: Class::instanceMethod

		System.out.println("=====No.A======\n");
		System.out.println(dynamicGetName.apply(new Employee("suresh", 100000)));
		System.out.println(dynamicGetName2.apply(new Employee("suresh", 100000)));

		// B. (Employee e,String s) -> e.setName(s)
		BiConsumer<Employee, String> dynamicSetName = (Employee e, String s) -> e.setName(s);
		BiConsumer<Employee, String> dynamicSetName2 = Employee::setName;
		// Method reference type: Class::instanceMethod

		System.out.println("=====No.B======\n");
		Employee e = new Employee("suresh", 100000);
		dynamicSetName.accept(e, "sammy");
		System.out.println(e);
		dynamicSetName2.accept(e, "harry");
		System.out.println(e);

		// C.(String s1,String s2) -> s1.compareTo(s2)
		BiFunction<String, String, Integer> dynamicCompare = (String s, String s2) -> s.compareTo(s2);
		BiFunction<String, String, Integer> dynamicCompare2 = String::compareTo;
		// Method reference type: Class::instanceMethod

		// D. (Integer x,Integer y) -> Math.pow(x,y)
		BiFunction<Integer, Integer, Double> dynamicPower = (Integer x, Integer y) -> Math.pow(x, y);
		BiFunction<Integer, Integer, Double> dynamicPower2 = Math::pow;
		// Method reference type: Static::instanceMethod
		System.out.println("=====No.D======\n");
		System.out.println(dynamicPower.apply(2, 3));
		System.out.println(dynamicPower2.apply(2, 3));

		// E. (Apple a) -> a.getWeight()
		Function<Apple, Double> dynamicWeight = (Apple a) -> a.getWeight();
		Function<Apple, Double> dynamicWeight2 = Apple::getWeight;
		// Method reference type: Class::instanceMethod

		Apple apple = new Apple(13.0);
		System.out.println("=====No.E======\n");
		System.out.println(dynamicWeight.apply(apple));
		System.out.println(dynamicWeight2.apply(apple));

		// F. (String x) -> Integer.parseInt(x);
		Function<String, Integer> dynamicInt = (String x) -> Integer.parseInt(x);
		Function<String, Integer> dynamicInt2 = Integer::parseInt;
		// Method reference type: Static::instanceMethod
		
		
		System.out.println("=====No.F======\n");
		System.out.println(dynamicInt.apply("47"));
		System.out.println(dynamicInt2.apply("47"));
		
		

		EmployeeNameComparator comp = new EmployeeNameComparator();
		// (Employee e1, Employee e2) -> comp.compare(e1,e2)
		BiFunction<Employee, Employee, Integer> dynamicEmpComp = (Employee e1, Employee e2) -> comp.compare(e1, e2);
		BiFunction<Employee, Employee, Integer> dynamicEmpComp2 = comp::compare;
		// Method reference type: Object::instanceMethod
		
		List<Employee> eList = new ArrayList<>();
		eList.add(new Employee("alice", 8000));
		eList.add(new Employee("bob", 5000));
		eList.sort(comp::compare);
		
		System.out.println("=====No.G======\n");
		System.out.println(eList);
		
	}

	public void evaluator() {

	}

}
