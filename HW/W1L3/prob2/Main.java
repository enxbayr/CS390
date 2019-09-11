package W1L3.prob2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("EB", "Egi", 100000.0, 2020,05, 10);
		Employee emp2 = new Employee("BB", "Bgi", 110000.0, 2020,05, 11);
		Employee emp3 = new Employee("TB", "Tgi", 120000.0, 2020,05, 12);
		
		Account acc1 = new Account(emp1, AccountType.CHECKING, 300);
		Account acc2 = new Account(emp2, AccountType.SAVINGS, 300);
		Account acc3 = new Account(emp3, AccountType.RETIREMENT, 300);
		
		System.out.println("BEFORE CHANGE ON BALANCE:");
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());
		
		acc1.makeDeposit(500);
		acc2.makeWithdrawal(400);
		acc3.makeWithdrawal(200);
		
		System.out.println("AFTER CHANGE ON BALANCE:");
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());
		
		System.out.println("EMPLOYEES:");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());

	}

}
