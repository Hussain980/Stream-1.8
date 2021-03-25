package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {

		// There are different ways to create list
		List<Integer> list1 = Arrays.asList(10, 12, 22, 33, 55, 42);
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(12);
		list2.add(22);
		list2.add(33);
		list2.add(52);

		// before java 8 approach
		List<Integer> list3 = new ArrayList<>();
		for (Integer i : list2) {
			if (i % 2 == 0) {
				list3.add(i);
			}
		}

		// after java 8 approach in stream

		List<Integer> newList = (List<Integer>) list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(list3);
		System.out.println(newList);

		// how to iterate list through stream
		
		
		  Stream<Integer> stream = list2.stream(); 
			/*
			 * stream.forEach(e -> { System.out.println(e); });
			 */
		 
		
		
		// printing through method reference
		stream.forEach(System.out::println);

	}
}
