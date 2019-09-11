package W2L5.prob2;

import java.time.LocalDate;

public class DeptEmployee {

	private String fName;
	private String lName;
	private LocalDate hDate;
	private double salary;

	public DeptEmployee(String fName, String lName, LocalDate hDate, double salary) {
		this.fName = fName;
		this.lName = lName;
		this.hDate = hDate;
		this.salary = salary;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public LocalDate gethDate() {
		return hDate;
	}

	public void sethDate(LocalDate hDate) {
		this.hDate = hDate;
	}

	public double computeSalary() {
		return this.salary;
	}

}
