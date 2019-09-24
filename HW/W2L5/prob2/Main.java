package W2L5.prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void printTotal(DeptEmployee[] emps) {

		double totalSal = 0;

		for (DeptEmployee emp : emps) {
			//if (emp instanceof Professor) {
			//	Professor p = (Professor) emp;
			//	totalSal += p.computeSalary();
			//}

			//if (emp instanceof Secretary) {
			//	Secretary s = (Secretary) emp;
			//	totalSal += s.computeSalary();
			//}
			totalSal += emp.computeSalary();
		}

		System.out.println("TOTAL SALARY: " + totalSal);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor f1 = new Professor("Dorj", "Bold", LocalDate.of(2010, 10, 1), 10000, 10);
		Professor f2 = new Professor("Bat", "Enkh", LocalDate.of(2000, 7, 1), 11000, 20);
		Professor f3 = new Professor("Chimeg", "Baatar", LocalDate.of(2007, 2, 1), 12000, 30);

		Secretary s1 = new Secretary("Namuunaa", "Borj", LocalDate.of(2015, 10, 1), 5000, 10);
		Secretary s2 = new Secretary("Anu", "Bayar", LocalDate.of(2018, 5, 1), 4500, 15);

		DeptEmployee[] department = new DeptEmployee[5];

		department[0] = f1;
		department[1] = f2;
		department[2] = f3;
		department[3] = s1;
		department[4] = s2;

		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to show the sum of all Professor" 
						+ '\n' + "and Secretary salary in the department?(Y/N)");

		String str = in.nextLine();
		
		switch(str) {
		case "Y" : 
			printTotal(department);
			break;
		case "N" :
			break;
		}
		
		in.close();
		
	}

}
