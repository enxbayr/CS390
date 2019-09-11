package W2L5.prob4;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary){
		super(firstName, lastName, ssn);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPayment() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

}
