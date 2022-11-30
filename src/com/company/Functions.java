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
	 * Function override
	 * It is a function that shares name with another but the params are not the
	 * same as the other's
	 */
	public static String helloWorld(String name) {
		return "Hello World and " + name + "!!!";
	}
}
