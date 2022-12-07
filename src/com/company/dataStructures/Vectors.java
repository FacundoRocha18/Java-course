package com.company.dataStructures;

import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();
		// Vector's capacity doubles when data overflows max. capacity
		
		vector.add(1);
		
		System.out.println(vector.capacity());
		System.out.println(vector.size());
	}
}
