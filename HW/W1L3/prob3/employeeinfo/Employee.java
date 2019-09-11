package W1L3.prob3.employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import W1L3.prob3.AccountType;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
		
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getHireDay() {
		return hireDate;
	}

	public String getFormattedAcctInfo() {
		// implement	
		return checkingAcct.toString() + savingsAcct.toString() + retirementAcct.toString();
	}
	public void deposit(AccountType acctType, double amt){
		// implement
		switch(acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS: 
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT: 
			retirementAcct.makeDeposit(amt);
			break;
		}
		
	}
	public boolean withdraw(AccountType acctType, double amt){
		// implement
		switch(acctType) {
		case CHECKING:
			return checkingAcct.makeWithdrawal(amt);
		case SAVINGS: 
			return savingsAcct.makeWithdrawal(amt);
		case RETIREMENT: 
			return retirementAcct.makeWithdrawal(amt);
		default : return false;
		}
	}

}
