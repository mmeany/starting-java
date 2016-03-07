package uk.os.babysteps;

public class All {

	public static void main(String[] args) throws Exception {
		
		Step01Overview one = new Step01Overview("Paul", "22/05/1965");
		System.out.println(one);

		Step02DataTypes.dataTypes();
		Step03Operators.operators();
		Step04Branching.branching();
		Step05Loops.loops();
	}

}
