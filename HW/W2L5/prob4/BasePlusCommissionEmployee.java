package W2L5.prob4;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, ssn, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPayment() {
		return super.getPayment() + baseSalary;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

}
