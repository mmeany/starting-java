package uk.os.babysteps;

public class Step03Operators {
	/*
	 * A look at arithmetic operators
	 */
	public static void operators() {

		// + addition
		// - subtraction
		// * multiplication
		// / division
		// % modulus

		System.out.println("----- Arithmetic Operators -----");
		System.out.println("12 + 5 = " + (12 + 5));
		System.out.println("12 - 5 = " + (12 - 5));
		System.out.println("12 * 5 = " + (12 * 5));
		System.out.println("12 / 5 = " + (12 / 5));
		System.out.println("12F / 5F = " + (12F / 5F));
		System.out.println("12D / 5D = " + (12D / 5D));
		System.out.println("10F / 3F = " + (10F / 3F));
		System.out.println("10D / 3D = " + (10D / 3D));
		System.out.println("12 % 5 = " + (12 % 5));

		// Operator Example Long form
		// += a += 3 a = a + 3
		// -= a -= 3 a = a - 3
		// *= a *= 3 a = a * 3
		// /= a /= 3 a = a / 3
		// %= a %= 3 a = a % 3

		System.out.println("----- Assignment Operators -----");
		int a = 12;
		System.out.println("a = 12: " + (a));
		System.out.println("a += 5: a = " + (a += 5));
		System.out.println("a -= 7: a = " + (a -= 7));
		System.out.println("a *= 3: a = " + (a *= 3));
		System.out.println("a /= 2: a = " + (a /= 2));
		System.out.println("a %= 4: a = " + (a %= 4));

		// ++
		// --
		System.out.println("----- Increment & Decrement Operators -----");
		a = 12;
		System.out.println("a = 12: " + (a));
		System.out.println("a++: " + (a++)); // a is used and then incremented
		System.out.println("a++: " + (a++)); // a is used and then incremented
		System.out.println("a++: " + (a++)); // a is used and then incremented
		a = 12;
		System.out.println("a = 12: " + (a));
		System.out.println("++a: " + (++a)); // a is incremented and then used
		System.out.println("++a: " + (++a)); // a is incremented and then used
		System.out.println("++a: " + (++a)); // a is incremented and then used
		a = 12;
		System.out.println("a = 12: " + (a));
		System.out.println("a--: " + (a--)); // a is used and then decremented
		System.out.println("a--: " + (a--)); // a is used and then decremented
		System.out.println("a--: " + (a--)); // a is used and then decremented
		a = 12;
		System.out.println("a = 12: " + (a));
		System.out.println("--a: " + (--a)); // a is decremented and then used
		System.out.println("--a: " + (--a)); // a is decremented and then used
		System.out.println("--a: " + (--a)); // a is decremented and then used

		// == Equal to
		// != Not equal to
		// < Less than
		// > Greater than
		// <= Less than or equal to
		// >= Greater than or equal to
		System.out.println("----- Comparison Operators -----");
		System.out.println("5 == 7: " + (5 == 7));
		System.out.println("5 != 7: " + (5 != 7));
		System.out.println("5 < 7: " + (5 < 7));
		System.out.println("5 > 7: " + (5 > 7));
		System.out.println("5 <= 7: " + (5 <= 7));
		System.out.println("5 >= 7: " + (5 >= 7));

		// && a && b AND true if a is true and b is true
		// || a || b OR true if either a or b is true
		// ! !a NOT true if a is false
		System.out.println("----- Logical Operators -----");
		System.out.println("true  && true  = " + (true && true)); // true
		System.out.println("true  && false = " + (true && false)); // false
		System.out.println("false && true  = " + (false && true)); // false
		System.out.println("false && false = " + (false && false)); // false

		System.out.println("true  || true  = " + (true || true)); // true
		System.out.println("true  || false = " + (true || false)); // true
		System.out.println("false || true  = " + (false || true)); // true
		System.out.println("false || false = " + (false || false)); // false

		System.out.println("!true  = " + (!true)); // false
		System.out.println("!false = " + (!false)); // true

		// & AND c = a & b;
		// &= a &= b;
		// | OR c = a | b;
		// |= a |= b;
		// ^ XOR c = a ^ b;
		// ^= a ^= b;
		// << SHIFT LEFT c = a << 2;
		// >> SHIFT RIGHT c = a >> 2;
		// >>> ZERO FILL c = a >>> 2;
		// ~ INVERT
		System.out.println("----- Binary Bitwise Operators -----");
		System.out.println("0b101 & 0b110 = " + (0b101 & 0b110)); // 4 (0b100)
		System.out.println("0b101 | 0b110 = " + (0b101 | 0b110)); // 7 (0b111)
		System.out.println("0b101 ^ 0b110 = " + (0b101 ^ 0b110)); // 3 (0b011)
		System.out.println("0b101 << 2 = " + (0b101 << 2)); // 20 (0b10100)
		System.out.println("0b101 >> 2 = " + (0b101 >> 2)); // 1 (0b001)
		System.out.println("0b101 >>> 2 = " + (0b101 >>> 2)); // 1 (0b001)
		System.out.println("~0b101 = " + (~0b101)); // -6
													// (0b11111111111111111111111111111010)
	}

	public static void main(String[] args) {
		Step03Operators.operators();
	}
}
