package W2L5.prob2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {

	private int numberOfPublications;
	
	public Professor(String fName, String lName, LocalDate hDate, double salary, int nP) {
		super(fName, lName, hDate, salary);
		this.numberOfPublications = nP;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
