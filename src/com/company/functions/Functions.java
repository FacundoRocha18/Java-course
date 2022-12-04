package com.company.functions;

import java.util.ArrayList;
import java.util.List;

public class Functions {
	public static void main(String[] args) {
		helloWorld();
		List<String> names = new ArrayList<>();

		names.add("Facundo Rocha");
		names.add("Dani");
		names.add("Lucas");
		names.add("Nacho");
		names.add("Richard");

		// anonymous or lambda function
		names.forEach((String name) -> { System.out.println(name); });

		double priceWithIva = addIva(199.99);

		System.out.println(priceWithIva);
	}

	// Public function that returns a string
	public static String helloWorld() {
		return "Hello World!";
	}

	/*
	 * Function overload
	 * It is a function that shares name with another but the signature is not the
	 * same
	 */
	public static String helloWorld(String name) {
		return "Hello World and " + name + "!!!";
	}

	public static String helloWorld(String name, String surname) {
		return "Hello World and " + name + "!!!";
	}

	/**
	 * Function that receives a price, adds the IVA and returns the result
	 * @author Facundo Rocha
	 */

	public static double addIva(double price) {
		return price + (price * 0.21);
	}
}
