package W2L5.prob4;

public class Main {

	public static void main(String[] args) {
		
		double totalSal = 0.0;
		
		CommissionEmployee ce1 = new CommissionEmployee("Bat", "Bold", "123456789", 100.0, 10.0);
		HourlyEmployee he1 = new HourlyEmployee("John", "Hennesy", "123456788", 20.0, 20.0);
		SalariedEmployee se1 = new SalariedEmployee("Mika", "Ito", "123458763", 500.0);
		BasePlusCommissionEmployee be1 = new BasePlusCommissionEmployee("Oyun", "Bat", "123123123", 100.0, 15.0, 600.0);
		BasePlusCommissionEmployee be2 = new BasePlusCommissionEmployee("Sima", "Sun", "123123111", 80.0, 15.0, 600.0);
		
		
		Employee[] emps = new Employee[5];
		
		emps[0] = ce1;
		emps[1] = he1;
		emps[2] = se1;
		emps[3] = be1;
		emps[4] = be2;
		
		for(Employee e : emps) {
			totalSal += e.getPayment();

		}
		
		System.out.println("TOTAL SALARY: " + totalSal);
		
	}

}
