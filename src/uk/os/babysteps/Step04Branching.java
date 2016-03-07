package uk.os.babysteps;

public class Step04Branching {

	/*
	 * Branching allows selectivley executing blocks of code depending on
	 * conditions being met.
	 * 
	 */
	public static void branching() {

		int a = 6;

		if (a < 6) {
			// This code block gets executed if a is less than 6
			System.out.println("This code block gets executed if a is less than 6");
		} else if (a == 6) {
			// This code block gets executed if a is 6
			System.out.println("This code block gets executed if a is 6");
		} else if (a > 6) {
			// This code block gets executed if a is greater than 6
			System.out.println("This code block gets executed if a is greater than 6");
		} else {
			// This code block should never be reached
			System.out.println("This code block should never be reached");
		}

		switch (a) {
		case 1: {
			// This block will get run if a is 1
			// If the block ends with a break then subsequent blocks will not be run otherwise execution continues into the next block
			System.out.println("This block will get run if a is 1");
			// The following break makes sure subsequent blocks do not get executed
		}
		case 6: {
			// This block will get run if a is 6
			System.out.println("This block will get run if a is 6, or drops through from an earlier block");
			// No break here, so if this block runs so will the next one
		}
		case 7: {
			// This block will get run if a is 6
			System.out.println("This block will get run if a is 7, or drops through from an earlier block");
			// The following break makes sure the default block does not get executed
			break;
		}
		default: {
			// This block gets run if no other blocks were matched, or drops through from an earlier block
			System.out.println("The default block");
		}
		}

	}

	public static void main(String[] args) {
		Step04Branching.branching();
	}
}
