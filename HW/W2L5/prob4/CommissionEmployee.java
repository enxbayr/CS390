package W2L5.prob4;

public class CommissionEmployee extends Employee{
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee (String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public double getPayment() {
		return grossSales * commissionRate;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + grossSales + ", " + commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	
}
