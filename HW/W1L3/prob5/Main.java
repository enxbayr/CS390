package W1L3.prob5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate mydate;

		Scanner in = new Scanner(System.in);

		//String choice = in.nextLine();

		boolean ch = true;

		while (ch) {
			
			System.out.println("Enter 1 for format: MM/DD/YYYY");
			System.out.println("Enter 2 for format: Month DD, YYYY");
			System.out.println("Enter 3 for format: DDD YYYY");
			System.out.println("Enter 4 to exit");
			System.out.println("Choose your Choice :");
			
			String choice = in.nextLine();

			switch (choice) {

			case "1":
				System.out.println("Choice: 1" + '\n' + "Enter Month:");
				int m1 = new Integer(in.nextLine());
				System.out.println("Enter Day:");
				int d1 = new Integer(in.nextLine());
				System.out.println("Enter Year:");
				int y1 = new Integer(in.nextLine());

				mydate = new MyDate(m1, d1, y1);
				System.out.println(mydate.getFormattedDate());

				System.out.println("Do you want to Continue :");
				String o1 = new String(in.nextLine());
				ch = (o1.equals("y")) ? true : false;
				break;
			case "2":
				System.out.println("Choice: 2" + '\n' + " Enter Month in text:");
				String m2 = new String(in.nextLine());
				System.out.println("Enter Day:");
				int d2 = new Integer(in.nextLine());
				System.out.println("Enter Year:");
				int y2 = new Integer(in.nextLine());

				mydate = new MyDate(m2, d2, y2);
				System.out.println(mydate.getFormattedDate());

				System.out.println("Do you want to Continue :");
				String o2 = new String(in.nextLine());
				ch = (o2.equals("y")) ? true : false;
				break;
			case "3":
				System.out.println("Choice: 3" + '\n' + " Enter Day of Year:");
				int d3 = new Integer(in.nextLine());
				System.out.println("Enter Year:");
				int y3 = new Integer(in.nextLine());

				mydate = new MyDate(d3, y3);
				System.out.println(mydate.getFormattedDate());

				System.out.println("Do you want to Continue :");
				String o3 = new String(in.nextLine());
				ch = (o3.equals("y")) ? true : false;
				break;
			case "4":
				System.out.println("Choice: 4" + '\n' + "Exit");
				ch = false;
				break;
			}
		}
		
		in.close();

	}

}
