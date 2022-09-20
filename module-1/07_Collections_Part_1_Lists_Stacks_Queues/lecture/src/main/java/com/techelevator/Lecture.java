package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {


	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		List<Integer> intList = new ArrayList<>();
		List<String> names = new ArrayList<>();

		intList.add(1);
		intList.add(2);
		intList.add(3);

		names.add("ray");
		names.add("nick");
		names.add("samantha");
		names.add("mitch");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int index = 0; index < names.size(); index++) {
			System.out.println(names.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(2, "nick");

		for (int index = 0; index < names.size(); index++) {
			System.out.println(names.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(2);
		for (int index = 0; index < names.size(); index++) {
			System.out.println(names.get(index));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		System.out.println(names.contains("ray"));
		System.out.println(names.contains("rRay"));

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		System.out.println(names.indexOf("mitch"));

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArray = names.toArray(new String[0]);
		for (int index = 0; index < namesArray.length; index++) {
			System.out.println(namesArray[index]);
		}

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);
		for (int index = 0; index < names.size(); index++) {
			System.out.println(names.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		Collections.reverse(names);
		for (int index = 0; index < names.size(); index++) {
			System.out.println(names.get(index));
		}


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for (int index = 0; index < names.size(); index++) {
			System.out.println(names.get(index));
		}

		for (int index = 0; index < names.size(); index++) { 	//walking thru
			String name = names.get(index);						//putting names of the index in String variable
																// called name
			System.out.println(names.get(index));
		}

		for(String name: names) {								//walking thru collection, putting it in 														// String variable called name
			System.out.println(name);
		}

	}
}
