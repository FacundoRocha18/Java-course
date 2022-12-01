package com.company;

public class Functions {
	public static void main(String[] args) {
		helloWorld();
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

}
