package W1L2;

/*
Create a class Prog2. Inside its main method, create float variables to store each of the following
numbers:
1.27, 3.881, 9.6
Output to the console the following two values:
1. the sum of the floats as an integer, obtained by casting the sum to type int
2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer,
using the Math.round function
 */

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x = (float) 1.27;
		float y = (float) 3.881;
		float z = (float) 9.6;
		
		System.out.println("SUM: " + (int)(x + y + z));
		System.out.println("SUM with Round: " + (int)(Math.round(x) + Math.round(y) + Math.round(z)));

	}

}
