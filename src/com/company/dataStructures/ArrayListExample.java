package com.company.dataStructures;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		// in JDK 17 this is the way to initialize a list
		// ArrayList's capacity grows by 50% of it's max. capacity
		// faster than LinkedList to save and read data

		arrayList.add(1);

		System.out.println(arrayList);
	}
}
