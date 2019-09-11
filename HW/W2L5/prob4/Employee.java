package W2L5.prob4;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String socialsecurityNumber;
	
	public Employee(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialsecurityNumber = ssn;
	}
	
	public abstract double getPayment();
	
	@Override
	public String toString() {
		return firstName + ", " + lastName + ", " + socialsecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialsecurityNumber() {
		return socialsecurityNumber;
	}

	public void setSocialsecurityNumber(String socialsecurityNumber) {
		this.socialsecurityNumber = socialsecurityNumber;
	}
	
	
	
}
