package com.company;

/**
 * Class created to learn Java types and variables
 * variable structure: = <value>
 * or
 * first create the variable
 * <type> <identifier>
 * and then initialize the variable with a value
 * <identifier> = <value>
 */

public class Types {

	public static void main(String[] args) {

		// Primitives cant be null
		// integers
		byte byteNumber = 1; // 1 byte
		short shortNumber = 2; // 2 byte
		int intNumber = 3; // 4 byte
		long longNumber = 4; // 8 byte

		// floating point
		float floatDecimal = 4.9f; // less capacity
		double doubleDecimal = 4.9d; // more capacity

		// characters
		char character = 'a'; // allows only one character per variable

		// booleans
		boolean truthy = true; // boolean true value
		boolean falsy = false; // boolean false value

		// strings 
		String nombre = "Facundo Rocha"; // characters chain

		// Wrapper types can be null
		Integer number = null;
		Long number2 = 2L;
		
	}

}
