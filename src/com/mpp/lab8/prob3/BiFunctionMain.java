package com.mpp.lab8.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionMain {

	public static void main(String[] args) {

		class MyBiFunction implements BiFunction<Double, Double, List<Double>> {
			public List<Double> apply(Double x, Double y) {
				List<Double> list = new ArrayList<>();
				list.add(Math.pow(x, y));
				list.add(x * y);

				return list;
			}
		}

		MyBiFunction f = new MyBiFunction();
		System.out.println(f.apply(2.0, 3.0));
	}

}
