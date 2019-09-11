package W1L3.prob4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t;
		Rectangle r;
		Circle c;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter C for Circle\n" + "Enter R for Rectangle\n" + "Enter T for Triangle: ");

		String choice = in.nextLine();

		switch (choice) {

		case "C":
			System.out.println("Enter the Radius of the Circle");
			double ra = new Double(in.nextLine());
			c = new Circle(ra);
			System.out.println("The area of Circle is : " + c.computeArea());
			break;

		case "R":
			System.out.println("Enter the length of the Rectangle");
			double le = new Double(in.nextLine());
			System.out.println("Enter the width of the Rectangle");
			double wi = new Double(in.nextLine());
			r = new Rectangle(wi, le);
			System.out.println("The area of Rectangle is : " + r.computeArea());
			break;

		case "T":
			System.out.println("Enter the base of the Trianle");
			double ba = new Double(in.nextLine());
			System.out.println("Enter the height of the Trianle");
			double he = new Double(in.nextLine());
			t = new Triangle(ba, he);
			System.out.println("The area of Triangle is : " + t.computeArea());
			break;

		default:
			System.out.print("Wrong input!");
			break;
		}
		in.close();

	}

}
