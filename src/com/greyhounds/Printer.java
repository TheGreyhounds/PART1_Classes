package com.greyhounds;

public class Printer {
	// You aren't required to have a constructor in your class,
	// or any instance-variables.
	
	// These methods are all overloaded, meaning they all have
	// the same name, but different arguments to distinguish
	// between them.
	public void println(String str) {
		System.out.println("We are in the string println() function");
		System.out.println(str);
	}
	
	public void println(Integer integer) {
		String strOfInteger = integer.toString();
		System.out.println("We are in the integer println() function.");
		System.out.println(strOfInteger);
	}
	
	public void println(Double decimalNumber) {
		String strOfDouble = decimalNumber.toString();
		System.out.println("We are in the double println() function.");
		System.out.println(strOfDouble);
	}
	
	public void println(Boolean bool) {
		String strOfBool = bool.toString();
		System.out.println("We are in the boolean println() function.");
		System.out.println(strOfBool);
	}
	
	// This overloaded println() function has a variable number of arguments.
	// All the below are legal function calls:
	// 		println("hello ", " it", " is", " nice", " to", " meet", " you!");
	//		println("Hello World", "!");
	// 		println("I ", "love ", " programming!");
	public void println(String ... variableLengthArgument) {
			System.out.println("We are in the variable length println() function," +
			                   " and there are " + variableLengthArgument.length + " arguments");
			for (String str : variableLengthArgument) {
				System.out.print(str + " ");
			}
			System.out.println();
	}
}
