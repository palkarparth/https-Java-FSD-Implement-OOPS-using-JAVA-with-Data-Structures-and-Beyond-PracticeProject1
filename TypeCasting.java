package com.simplilearn;

public class TypeCasting {
	public static void main(String[] args) {
		// Implicit casting
		System.out.println("Implicit Type Casting");
		// character type
		char a = 'A';
		System.out.println("Value of a->" + a);
		// Character to Integer 
		int b = a;
		System.out.println("Value of b->" + b);
		// Character to float
		float c = a;
		System.out.println("Value of c->" + c);
		// Character to long
		long d = a;
		System.out.println("Value of d->" + d);
		// character to double
		double e = a;
		System.out.println("Value of e->" + e);
		
		System.out.println("\n");
		//Explicit casting
		System.out.println("Explicit Type Casting");
		double x = 45.5;
		// double to integer type
		int y = (int)x;
		System.out.println("Value of x->" + x);
		System.out.println("Value of y->" + y);

	}

}
