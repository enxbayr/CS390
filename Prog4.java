package W1L2;

import java.util.Scanner;

public class Prog4 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Type any word: ");
		
		String str = in.nextLine();
        String rev = "";
		
        for (int i = str.length() - 1; i >= 0; i--) {
        	
        	rev += str.charAt(i);
        	
        }
		
		System.out.println("Reverse word: "+ rev);
		
	}

}
