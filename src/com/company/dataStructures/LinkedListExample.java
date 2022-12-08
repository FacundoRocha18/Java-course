package com.company.dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {

		// LinkedLists are faster than ArrayLists when you have to modify data
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Hello world");

		System.out.println(linkedList);

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(1);

		// you can initialize a linkedList from an ArrayList and copies the data
		LinkedList<Integer> linkedListFromArrayList = new LinkedList<>(arrayList);

		linkedListFromArrayList.add(1);

		System.out.println(linkedListFromArrayList);

	}
}
