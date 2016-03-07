package uk.os.babysteps;

public class Step02DataTypes {

	/*
	 * This method looks at data types that are available in Java. As the method
	 * is static it does not require an object instance and can invoked directly
	 * from the class This is common for utility methods
	 */
	public static void dataTypes() {
		// There are a number of primitive data types in Java
		// A primitive does not require an object to be instantiated
		// There are a number of ways of defining variables of primitive data
		// types
		// CONVENTION: Primitive data type names are lower case, for example
		// int, float
		int a; // variable defined, but no value set
		a = 99; // We have to assign a value elsewhere
		int i = 10; // variable defined and set to initial value
		int j, k, l = 15; // multiple variables defined, some initialised
		j = k = 9; // multiple variables of same type set to same value
		int m = 1, n = 2, o = 3; // multiple values initialised
		System.out.println("" + a + ", " + i + ", " + j + ", " + k + ", " + l + ", " + m + ", " + n + ", " + o);

		// byte A very small signed integer value -128 to +127
		// short A small signed integer value -32768 to +32767
		// int Commonly used signed integer value -2^31 to +2^31-1
		// long Largest signed integer value -2^63 to +2^63-1
		// float floating-point number
		// double more precise floating point number
		// char single unicode character
		// boolean true or false

		byte b = 9;
		System.out.println(b);
		b = 0x7f; // Hexadecimal values can be assigned by prefixing with 0x
		System.out.println(b);

		short s = 22;
		System.out.println(s);

		int d = 44;
		System.out.println(d);

		long e = 32L; // Postfix with L to indicate that this number is a Long
		System.out.println(e);

		float f = 3.1415F; // Postfix numeric value with f to indicate single
							// precision float
		System.out.println(f);

		double g = 3.1415D; // Postfix numeric value with d to indicate double
							// precision
		System.out.println(g);

		char iAmAChar = 'X'; // Character values are surrounded by single quotes
		System.out.println(iAmAChar);

		boolean t = false;
		System.out.println(t);
	}


	/*
	 * An array is a variable that can hold multiple values of the same data
	 * type. Individual values are accessed using their index number, which
	 * starts at 0 for the first index. The size of an array is fixed and cannot
	 * grow or shrink
	 */
	public static void arrays() {
		// Array data type indicated by the square brackets on variable name
		// When creating using the new keyword the size of the array is passed
		// in the square brackets
		// With a size of 5 the entries in the array will have indices 0, 1, 2,
		// 3 and 4
		// Entries will take default value of 0, 0.0, false or null depending of
		// data type
		int values[] = new int[5];
		values[2] = 2386;

		int index = 0;
		System.out.println("Entry " + index + " in the array: " + values[index++]);
		System.out.println("Entry " + index + " in the array: " + values[index++]);
		System.out.println("Entry " + index + " in the array: " + values[index++]);
		System.out.println("Entry " + index + " in the array: " + values[index++]);
		System.out.println("Entry " + index + " in the array: " + values[index++]);

	}

	public static void main(String[] args) {
		Step02DataTypes.dataTypes();
		Step02DataTypes.arrays();
	}

}
