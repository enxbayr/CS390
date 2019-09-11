package W1L3.prob3;

import java.util.Scanner;

import W1L3.prob3.employeeinfo.Employee;

public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(9500);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		// for phase I – console output
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		} // display info to console
		else {
			// do nothing..the application ends here
		}
		
		System.out.println("Sample Deposit and Withdraw on the accounts of " + emps[2].getName() + ":");
		emps[2].deposit(AccountType.CHECKING, 10000);
		emps[2].withdraw(AccountType.SAVINGS, 10000);
		System.out.println(emps[2].getFormattedAcctInfo());
		
		sc.close();
		
	}

	String getFormattedAccountInfo() {
		// implement
		String tmp = "";
		
		for (Employee e : emps) {
			tmp+= "ACCOUNT INFO FOR " + e.getName() + ":" + '\n' + '\n' + e.getFormattedAcctInfo() + '\n' + '\n';
		}
		
		return tmp;
	}
}