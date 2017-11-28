package com.mpp.extra.methodreference;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listA = new ArrayList<>();

		// try (BufferedReader br = new BufferedReader(new FileReader(new File(
		// "C:\\Users\\985462\\Desktop\\words.txt")))) {
		// String line;
		// while ((line = br.readLine()) != null) {
		// // process the line.
		// System.out.println(line);
		// listA.add(line);
		// }
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// listA.add("suresh");
		// listA.add("santosh");
		// listA.add("sanjay");
		// listA.add("rojan");
		// listA.add("roshan");
		// listA.add("jack");
		// listA.add("alice");
		// listA.add("chaplin");
		// listA.add("ronaldo");
		// listA.add("rose");
		// listA.add("messi");
		// listA.add("bale");
		//
		// long start = new Date().getTime();
		// List<String> filteredList = listA.stream()
		// .filter(name -> name.startsWith("s"))
		// .filter(name -> name.endsWith("y"))
		// .collect(Collectors.toList());
		// long end = new Date().getTime();
		// System.out.println("Time consumed by stream in MS : " + (end -
		// start));
		//
		// long start2 = new Date().getTime();
		// List<String> filteredList2 = listA.parallelStream()
		// .filter(name -> name.startsWith("s"))
		// .filter(name -> name.endsWith("y"))
		// .collect(Collectors.toList());
		// long end2 = new Date().getTime();
		// System.out
		// .println("Time consumed by stream in MS : " + (end2 - start2));

		/**
		 * Generating String stream with limit 20
		 */
		Stream<String> myStream = Stream.generate(() -> "Suresh").limit(20);
		List<String> ms = myStream.collect(Collectors.toList());
		System.out.println(ms);

		/**
		 * Generating integer stream with limit 5
		 */
		Stream<Integer> my = Stream.generate(() -> new Random().nextInt())
				.limit(5);
		// List<Integer> myl = my.collect(Collectors.toList());
		// System.out.println(myl);

		Stream<Integer> myRandom = Stream.iterate(20, n -> n + 2).limit(20);
		// List<Integer> mr = myRandom.collect(Collectors.toList());
		// System.out.println(mr);

		Stream<Integer> mixedStream = Stream.concat(my, myRandom);
		List<Integer> mixedStreamList = mixedStream
				.collect(Collectors.toList());
		System.out.println(mixedStreamList);

		/**
		 * Concatenate to character stream
		 */
		Stream<Character> hello = characterStream("hello");
		Stream<Character> world = characterStream("world");
		Stream<Character> helloworld = Stream.concat(hello, world);
		List<Character> helloworldList = helloworld
				.collect(Collectors.toList());
		System.out.println(helloworldList);

		/**
		 * Map
		 */

		List<String> mapList = Arrays.asList("suresh", "santosh", "sanjay");
		Stream<Stream<Character>> mapResult = mapList.stream().map(
				s -> characterStream(s));
//		mapResult.forEach(a -> (a.forEach(b -> System.out.print(b))));

		/**
		 * FlatMap
		 * 
		 */
		List<String> flatmapList = Arrays.asList("suresh", "santosh", "sanjay");
		Stream<Stream<Character>> flatmapResult = flatmapList.stream().map(
				s -> characterStream(s));
//		flatmapResult.forEach(a -> (a.forEach(b -> System.out.print(b))));
	}

	/**
	 * 
	 * @param s
	 *            passed stream
	 * @return Stream of character
	 */
	public static Stream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray()) {
			result.add(c);
		}
		return result.stream();
	}

}
