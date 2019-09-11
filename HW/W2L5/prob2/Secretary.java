package W2L5.prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours;
	
	public Secretary(String fName, String lName, LocalDate hDate, double salary, double oth) {
		super(fName, lName, hDate, salary);
		this.overtimeHours = oth;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	@Override
	public double computeSalary() {
		return super.computeSalary() + 12*this.overtimeHours;
	}
}
