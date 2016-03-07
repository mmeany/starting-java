package uk.os.babysteps;

public class Step05Loops {

	/*
	 * This method looks at loop constructs that are available in Java As the
	 * method does not return anything its return type is the special keyword
	 * void.
	 * 
	 * Loops allow a block of code to be repeatedly executed until some condition is reached
	 */
	public static void loops() {

		// The for loop, for ([initialisation statements]; [end condition]; [at end of iteration statements]) {}
		// Loop is initialised by setting i to 0 and j to 10
		// The loop will terminate when i is no longer less than 10
		// At the end of the loop block i will be incremented and j will be decremented
		System.out.println("----- For loop -----");
		for (int i=0, j=10; i < 10; i++, j--) {
			// The contents of this code block get executed during each iteration of the loop
			System.out.print(i + "\t" + j);
			
			if (i % 2 == 0) {
				System.out.println("\t even");
			} else 
				System.out.println("\t odd");
		} // end of the for loop block
		
		// while loop
		// while (expression) {}
		System.out.println("----- While loop -----");
		int a = 5;
		while (a < 10) {
			// This block will only execute if the condition is true
			System.out.println(a);
			a++;
		}

		// Do-While Loops
		System.out.println("----- Do-While loop -----");
		do {
			// This block is always run at least once, apart from that its the same as a while loop
			System.out.println(a--);
		} while (a > 5);
	}

	public static void main(String[] args) {
		Step05Loops.loops();
	}
}
