package W3L12.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception {
	MyException(String message) {
		super(message);
	}

}

public class TestException {
	public static void main(String[] args) throws MyException {
	
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter integer values[0-100]:");
			int n = in.nextInt();
			if (n < 0) {
				throw new MyException("Negative number is not allowed!");
			}
			if (n > 100) {
				throw new MyException("Input value is out of range!");
			}
			
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} 
		catch (InputMismatchException e) {
			System.out.println("Please enter integer value!");
		} 
		finally {
			System.out.println("End of Program");
		}
	}

}
